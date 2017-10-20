package init;

import com.google.inject.Guice;
import com.google.inject.Injector;
import init.InitEmfParsleyGuiceModule;
import org.eclipse.emf.parsley.runtime.ui.PluginUtil;

@SuppressWarnings("all")
public class InitInjectorProvider {
  private static Injector injector;
  
  public static synchronized Injector getInjector() {
    if (injector == null) {
      injector = Guice.createInjector(
        new InitEmfParsleyGuiceModule(PluginUtil.getPlugin(
          PluginUtil.getBundle(InitInjectorProvider.class))));
    }
    return injector;
  }
}
