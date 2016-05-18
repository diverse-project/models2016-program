/**
 */
package models2016;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Talk Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link models2016.TalkSession#getChair <em>Chair</em>}</li>
 *   <li>{@link models2016.TalkSession#getPapers <em>Papers</em>}</li>
 * </ul>
 *
 * @see models2016.Models2016Package#getTalkSession()
 * @model
 * @generated
 */
public interface TalkSession extends Event {
	/**
	 * Returns the value of the '<em><b>Papers</b></em>' reference list.
	 * The list contents are of type {@link models2016.Paper}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Papers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Papers</em>' reference list.
	 * @see models2016.Models2016Package#getTalkSession_Papers()
	 * @model
	 * @generated
	 */
	EList<Paper> getPapers();

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
	 * @see models2016.Models2016Package#getTalkSession_Chair()
	 * @model containment="true"
	 * @generated
	 */
	Person getChair();

	/**
	 * Sets the value of the '{@link models2016.TalkSession#getChair <em>Chair</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chair</em>' containment reference.
	 * @see #getChair()
	 * @generated
	 */
	void setChair(Person value);

} // TalkSession
