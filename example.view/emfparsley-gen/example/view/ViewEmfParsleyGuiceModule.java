package example.view;

import init.InitEmfParsleyGuiceModule;
import org.eclipse.swt.SWT;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * example.view EMF Parsley Dsl Module file
 */
@SuppressWarnings("all")
public class ViewEmfParsleyGuiceModule extends InitEmfParsleyGuiceModule {
  public ViewEmfParsleyGuiceModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public int valueTreeFormSashStyle() {
    return SWT.HORIZONTAL;
  }
}
