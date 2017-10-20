package init;

import init.config.InitConfigurator;
import init.resource.InitResourceManager;
import org.eclipse.emf.parsley.EmfParsleyGuiceModule;
import org.eclipse.emf.parsley.config.Configurator;
import org.eclipse.emf.parsley.resource.ResourceManager;
import org.eclipse.ui.plugin.AbstractUIPlugin;

@SuppressWarnings("all")
public class InitEmfParsleyGuiceModule extends EmfParsleyGuiceModule {
  public InitEmfParsleyGuiceModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public Class<? extends Configurator> bindConfigurator() {
    return InitConfigurator.class;
  }
  
  @Override
  public Class<? extends ResourceManager> bindResourceManager() {
    return InitResourceManager.class;
  }
}
