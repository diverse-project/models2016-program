/**
 */
package models2016;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keynote</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link models2016.Keynote#getSpeaker <em>Speaker</em>}</li>
 *   <li>{@link models2016.Keynote#getChair <em>Chair</em>}</li>
 * </ul>
 *
 * @see models2016.Models2016Package#getKeynote()
 * @model
 * @generated
 */
public interface Keynote extends Event {
	/**
	 * Returns the value of the '<em><b>Speaker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speaker</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speaker</em>' containment reference.
	 * @see #setSpeaker(Person)
	 * @see models2016.Models2016Package#getKeynote_Speaker()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Person getSpeaker();

	/**
	 * Sets the value of the '{@link models2016.Keynote#getSpeaker <em>Speaker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speaker</em>' containment reference.
	 * @see #getSpeaker()
	 * @generated
	 */
	void setSpeaker(Person value);

	/**
	 * Returns the value of the '<em><b>Chair</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chair</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chair</em>' containment reference.
	 * @see #setChair(Person)
	 * @see models2016.Models2016Package#getKeynote_Chair()
	 * @model containment="true"
	 * @generated
	 */
	Person getChair();

	/**
	 * Sets the value of the '{@link models2016.Keynote#getChair <em>Chair</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chair</em>' containment reference.
	 * @see #getChair()
	 * @generated
	 */
	void setChair(Person value);

} // Keynote
