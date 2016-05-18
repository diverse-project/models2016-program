/**
 */
package models2016;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link models2016.Panel#getPanelists <em>Panelists</em>}</li>
 *   <li>{@link models2016.Panel#getModerators <em>Moderators</em>}</li>
 * </ul>
 *
 * @see models2016.Models2016Package#getPanel()
 * @model
 * @generated
 */
public interface Panel extends Event {
	/**
	 * Returns the value of the '<em><b>Panelists</b></em>' containment reference list.
	 * The list contents are of type {@link models2016.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panelists</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panelists</em>' containment reference list.
	 * @see models2016.Models2016Package#getPanel_Panelists()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPanelists();

	/**
	 * Returns the value of the '<em><b>Moderators</b></em>' containment reference list.
	 * The list contents are of type {@link models2016.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moderators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moderators</em>' containment reference list.
	 * @see models2016.Models2016Package#getPanel_Moderators()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getModerators();

} // Panel
