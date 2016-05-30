/**
 */
package models2016;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link models2016.Session#getEvents <em>Events</em>}</li>
 *   <li>{@link models2016.Session#getRoom <em>Room</em>}</li>
 *   <li>{@link models2016.Session#getStartingTime <em>Starting Time</em>}</li>
 *   <li>{@link models2016.Session#getEndingTime <em>Ending Time</em>}</li>
 * </ul>
 *
 * @see models2016.Models2016Package#getSession()
 * @model
 * @generated
 */
public interface Session extends EObject {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' reference list.
	 * The list contents are of type {@link models2016.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' reference list.
	 * @see models2016.Models2016Package#getSession_Events()
	 * @model
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see models2016.Models2016Package#getSession_Room()
	 * @model
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link models2016.Session#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

	/**
	 * Returns the value of the '<em><b>Starting Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Starting Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting Time</em>' containment reference.
	 * @see #setStartingTime(models2016.Date)
	 * @see models2016.Models2016Package#getSession_StartingTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	models2016.Date getStartingTime();

	/**
	 * Sets the value of the '{@link models2016.Session#getStartingTime <em>Starting Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting Time</em>' containment reference.
	 * @see #getStartingTime()
	 * @generated
	 */
	void setStartingTime(models2016.Date value);

	/**
	 * Returns the value of the '<em><b>Ending Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ending Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ending Time</em>' containment reference.
	 * @see #setEndingTime(models2016.Date)
	 * @see models2016.Models2016Package#getSession_EndingTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	models2016.Date getEndingTime();

	/**
	 * Sets the value of the '{@link models2016.Session#getEndingTime <em>Ending Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ending Time</em>' containment reference.
	 * @see #getEndingTime()
	 * @generated
	 */
	void setEndingTime(models2016.Date value);

} // Session
