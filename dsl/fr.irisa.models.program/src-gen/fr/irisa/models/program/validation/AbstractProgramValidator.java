/*
 * generated by Xtext
 */
package fr.irisa.models.program.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractProgramValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(fr.irisa.models.program.program.ProgramPackage.eINSTANCE);
		return result;
	}
}
