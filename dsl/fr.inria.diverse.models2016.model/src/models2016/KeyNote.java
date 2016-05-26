/**
 */
package models2016;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link models2016.KeyNote#getSpeaker <em>Speaker</em>}</li>
 * </ul>
 *
 * @see models2016.Models2016Package#getKeyNote()
 * @model
 * @generated
 */
public interface KeyNote extends Event {
	/**
	 * Returns the value of the '<em><b>Speaker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speaker</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speaker</em>' containment reference.
	 * @see #setSpeaker(Person)
	 * @see models2016.Models2016Package#getKeyNote_Speaker()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Person getSpeaker();

	/**
	 * Sets the value of the '{@link models2016.KeyNote#getSpeaker <em>Speaker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speaker</em>' containment reference.
	 * @see #getSpeaker()
	 * @generated
	 */
	void setSpeaker(Person value);

} // KeyNote
