package example.view;

import example.view.config.ViewConfigurator;
import example.view.edit.action.ViewMenuBuilder;
import example.view.edit.ui.provider.ViewViewerContentProvider;
import example.view.resource.ViewResourceManager;
import org.eclipse.emf.parsley.EmfParsleyGuiceModule;
import org.eclipse.emf.parsley.config.Configurator;
import org.eclipse.emf.parsley.edit.action.EditingMenuBuilder;
import org.eclipse.emf.parsley.resource.ResourceManager;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.swt.SWT;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * example.view EMF Parsley Dsl Module file
 */
@SuppressWarnings("all")
public class ViewEmfParsleyGuiceModule extends EmfParsleyGuiceModule {
  public ViewEmfParsleyGuiceModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public int valueTreeFormSashStyle() {
    return SWT.HORIZONTAL;
  }
  
  @Override
  public int valueDetailGridColumns() {
    return 4;
  }
  
  @Override
  public Class<? extends IContentProvider> bindIContentProvider() {
    return ViewViewerContentProvider.class;
  }
  
  @Override
  public Class<? extends EditingMenuBuilder> bindEditingMenuBuilder() {
    return ViewMenuBuilder.class;
  }
  
  @Override
  public Class<? extends Configurator> bindConfigurator() {
    return ViewConfigurator.class;
  }
  
  @Override
  public Class<? extends ResourceManager> bindResourceManager() {
    return ViewResourceManager.class;
  }
}
