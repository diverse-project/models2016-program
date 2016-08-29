/**
 */
package models2016;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workshop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link models2016.Workshop#getOrganizers <em>Organizers</em>}</li>
 *   <li>{@link models2016.Workshop#getFullName <em>Full Name</em>}</li>
 * </ul>
 *
 * @see models2016.Models2016Package#getWorkshop()
 * @model
 * @generated
 */
public interface Workshop extends Event {
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
	 * @see models2016.Models2016Package#getWorkshop_Organizers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getOrganizers();

	/**
	 * Returns the value of the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Name</em>' attribute.
	 * @see #setFullName(String)
	 * @see models2016.Models2016Package#getWorkshop_FullName()
	 * @model
	 * @generated
	 */
	String getFullName();

	/**
	 * Sets the value of the '{@link models2016.Workshop#getFullName <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Name</em>' attribute.
	 * @see #getFullName()
	 * @generated
	 */
	void setFullName(String value);

} // Workshop
