package example.view.edit.ui.provider;

import com.google.inject.Inject;
import library.Writer;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.parsley.edit.ui.provider.ViewerContentProvider;

@SuppressWarnings("all")
public class ViewViewerContentProvider extends ViewerContentProvider {
  @Inject
  public ViewViewerContentProvider(final AdapterFactory adapterFactory) {
    super(adapterFactory);
  }
  
  public Object children(final Writer it) {
    return it.getBooks();
  }
}
