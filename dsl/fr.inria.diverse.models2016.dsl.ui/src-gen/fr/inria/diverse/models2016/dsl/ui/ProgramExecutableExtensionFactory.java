/*
 * generated by Xtext 2.9.2
 */
package fr.inria.diverse.models2016.dsl.ui;

import com.google.inject.Injector;
import fr.inria.diverse.models2016.dsl.ui.internal.DslActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ProgramExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return DslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return DslActivator.getInstance().getInjector(DslActivator.FR_INRIA_DIVERSE_MODELS2016_DSL_PROGRAM);
	}
	
}
