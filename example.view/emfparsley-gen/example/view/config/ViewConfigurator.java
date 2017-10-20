package example.view.config;

import example.view.ViewSaveableTreeFormView;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.parsley.config.Configurator;

@SuppressWarnings("all")
public class ViewConfigurator extends Configurator {
  public URI resourceURI(final ViewSaveableTreeFormView it) {
    return null;
  }
}
