package example.view.edit.action;

import java.util.Collections;
import java.util.List;
import library.Book;
import library.Library;
import library.LibraryFactory;
import library.Writer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.parsley.edit.action.EditingMenuBuilder;
import org.eclipse.emf.parsley.edit.action.IMenuContributionSpecification;
import org.eclipse.emf.parsley.runtime.util.IAcceptor;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ViewMenuBuilder extends EditingMenuBuilder {
  public List<IMenuContributionSpecification> emfMenuContributions(final Writer w) {
    EObject _eContainer = w.eContainer();
    final IAcceptor<Library> _function = (Library library) -> {
      EList<Book> _books = library.getBooks();
      Book _createBook = LibraryFactory.eINSTANCE.createBook();
      final Procedure1<Book> _function_1 = (Book it) -> {
        it.setTitle("New Book");
        it.setAuthor(w);
      };
      Book _doubleArrow = ObjectExtensions.<Book>operator_doubleArrow(_createBook, _function_1);
      _books.add(_doubleArrow);
    };
    IMenuContributionSpecification _actionChange = this.<Library>actionChange("New Book", ((Library) _eContainer), _function);
    return Collections.<IMenuContributionSpecification>unmodifiableList(CollectionLiterals.<IMenuContributionSpecification>newArrayList(_actionChange));
  }
}
