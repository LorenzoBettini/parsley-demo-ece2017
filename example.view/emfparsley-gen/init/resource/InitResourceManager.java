package init.resource;

import library.Book;
import library.Library;
import library.LibraryFactory;
import library.Writer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.parsley.resource.ResourceManager;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class InitResourceManager extends ResourceManager {
  private final LibraryFactory factory = LibraryFactory.eINSTANCE;
  
  public LibraryFactory getFactory() {
    return this.factory;
  }
  
  @Override
  public void initialize(final Resource it) {
    EList<EObject> _contents = it.getContents();
    Library _createLibrary = this.factory.createLibrary();
    final Procedure1<Library> _function = (Library lib) -> {
      lib.setName("My Library");
      EList<Writer> _writers = lib.getWriters();
      Writer _createWriter = this.factory.createWriter();
      final Procedure1<Writer> _function_1 = (Writer it_1) -> {
        it_1.setFirstName("John");
        it_1.setLastName("Doe");
      };
      Writer _doubleArrow = ObjectExtensions.<Writer>operator_doubleArrow(_createWriter, _function_1);
      _writers.add(_doubleArrow);
      EList<Writer> _writers_1 = lib.getWriters();
      Writer _createWriter_1 = this.factory.createWriter();
      final Procedure1<Writer> _function_2 = (Writer it_1) -> {
        it_1.setFirstName("Paul");
        it_1.setLastName("Smith");
      };
      Writer _doubleArrow_1 = ObjectExtensions.<Writer>operator_doubleArrow(_createWriter_1, _function_2);
      _writers_1.add(_doubleArrow_1);
      EList<Book> _books = lib.getBooks();
      Book _createBook = this.factory.createBook();
      final Procedure1<Book> _function_3 = (Book it_1) -> {
        it_1.setTitle("A Book");
        it_1.setAuthor(lib.getWriters().get(0));
      };
      Book _doubleArrow_2 = ObjectExtensions.<Book>operator_doubleArrow(_createBook, _function_3);
      _books.add(_doubleArrow_2);
      EList<Book> _books_1 = lib.getBooks();
      Book _createBook_1 = this.factory.createBook();
      final Procedure1<Book> _function_4 = (Book it_1) -> {
        it_1.setTitle("Another Book");
      };
      Book _doubleArrow_3 = ObjectExtensions.<Book>operator_doubleArrow(_createBook_1, _function_4);
      _books_1.add(_doubleArrow_3);
    };
    Library _doubleArrow = ObjectExtensions.<Library>operator_doubleArrow(_createLibrary, _function);
    _contents.add(_doubleArrow);
  }
}
