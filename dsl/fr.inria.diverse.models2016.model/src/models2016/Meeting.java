/**
 */
package models2016;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meeting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link models2016.Meeting#getParticipants <em>Participants</em>}</li>
 * </ul>
 *
 * @see models2016.Models2016Package#getMeeting()
 * @model
 * @generated
 */
public interface Meeting extends Event {

	/**
	 * Returns the value of the '<em><b>Participants</b></em>' containment reference list.
	 * The list contents are of type {@link models2016.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' containment reference list.
	 * @see models2016.Models2016Package#getMeeting_Participants()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getParticipants();
} // Meeting
