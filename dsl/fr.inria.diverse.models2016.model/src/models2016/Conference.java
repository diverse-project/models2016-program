/**
 */
package models2016;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link models2016.Conference#getName <em>Name</em>}</li>
 *   <li>{@link models2016.Conference#getResources <em>Resources</em>}</li>
 *   <li>{@link models2016.Conference#getProgram <em>Program</em>}</li>
 *   <li>{@link models2016.Conference#getEvents <em>Events</em>}</li>
 *   <li>{@link models2016.Conference#getPapers <em>Papers</em>}</li>
 *   <li>{@link models2016.Conference#getTalkDuration <em>Talk Duration</em>}</li>
 *   <li>{@link models2016.Conference#getKinds <em>Kinds</em>}</li>
 * </ul>
 *
 * @see models2016.Models2016Package#getConference()
 * @model
 * @generated
 */
public interface Conference extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see models2016.Models2016Package#getConference_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link models2016.Conference#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link models2016.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see models2016.Models2016Package#getConference_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' containment reference.
	 * @see #setProgram(Program)
	 * @see models2016.Models2016Package#getConference_Program()
	 * @model containment="true"
	 * @generated
	 */
	Program getProgram();

	/**
	 * Sets the value of the '{@link models2016.Conference#getProgram <em>Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' containment reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(Program value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link models2016.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see models2016.Models2016Package#getConference_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Papers</b></em>' containment reference list.
	 * The list contents are of type {@link models2016.Paper}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Papers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Papers</em>' containment reference list.
	 * @see models2016.Models2016Package#getConference_Papers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Paper> getPapers();

	/**
	 * Returns the value of the '<em><b>Talk Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Talk Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Talk Duration</em>' attribute.
	 * @see #setTalkDuration(Integer)
	 * @see models2016.Models2016Package#getConference_TalkDuration()
	 * @model
	 * @generated
	 */
	Integer getTalkDuration();

	/**
	 * Sets the value of the '{@link models2016.Conference#getTalkDuration <em>Talk Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Talk Duration</em>' attribute.
	 * @see #getTalkDuration()
	 * @generated
	 */
	void setTalkDuration(Integer value);

	/**
	 * Returns the value of the '<em><b>Kinds</b></em>' containment reference list.
	 * The list contents are of type {@link models2016.Kind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kinds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kinds</em>' containment reference list.
	 * @see models2016.Models2016Package#getConference_Kinds()
	 * @model containment="true"
	 * @generated
	 */
	EList<Kind> getKinds();

} // Conference
