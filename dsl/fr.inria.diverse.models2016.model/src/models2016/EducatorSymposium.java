/**
 */
package models2016;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Educator Symposium</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link models2016.EducatorSymposium#getOrganizers <em>Organizers</em>}</li>
 * </ul>
 *
 * @see models2016.Models2016Package#getEducatorSymposium()
 * @model
 * @generated
 */
public interface EducatorSymposium extends Event {
	/**
	 * Returns the value of the '<em><b>Organizers</b></em>' containment reference list.
	 * The list contents are of type {@link models2016.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organizers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organizers</em>' containment reference list.
	 * @see models2016.Models2016Package#getEducatorSymposium_Organizers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getOrganizers();

} // EducatorSymposium
