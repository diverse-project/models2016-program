/**
 */
package models2016;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Talk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link models2016.Talk#getAuthors <em>Authors</em>}</li>
 *   <li>{@link models2016.Talk#getPreprint <em>Preprint</em>}</li>
 *   <li>{@link models2016.Talk#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see models2016.Models2016Package#getTalk()
 * @model
 * @generated
 */
public interface Talk extends EObject {
	/**
	 * Returns the value of the '<em><b>Authors</b></em>' containment reference list.
	 * The list contents are of type {@link models2016.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authors</em>' containment reference list.
	 * @see models2016.Models2016Package#getTalk_Authors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getAuthors();

	/**
	 * Returns the value of the '<em><b>Preprint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preprint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preprint</em>' attribute.
	 * @see #setPreprint(String)
	 * @see models2016.Models2016Package#getTalk_Preprint()
	 * @model
	 * @generated
	 */
	String getPreprint();

	/**
	 * Sets the value of the '{@link models2016.Talk#getPreprint <em>Preprint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preprint</em>' attribute.
	 * @see #getPreprint()
	 * @generated
	 */
	void setPreprint(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link models2016.Track}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see models2016.Track
	 * @see #setKind(Track)
	 * @see models2016.Models2016Package#getTalk_Kind()
	 * @model
	 * @generated
	 */
	Track getKind();

	/**
	 * Sets the value of the '{@link models2016.Talk#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see models2016.Track
	 * @see #getKind()
	 * @generated
	 */
	void setKind(Track value);

} // Talk
