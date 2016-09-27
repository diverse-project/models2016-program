/**
 */
package models2016;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link models2016.Event#getName <em>Name</em>}</li>
 *   <li>{@link models2016.Event#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link models2016.Event#getUrl <em>Url</em>}</li>
 *   <li>{@link models2016.Event#isCancelled <em>Cancelled</em>}</li>
 * </ul>
 *
 * @see models2016.Models2016Package#getEvent()
 * @model abstract="true"
 * @generated
 */
public interface Event extends EObject {
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
	 * @see models2016.Models2016Package#getEvent_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link models2016.Event#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(String)
	 * @see models2016.Models2016Package#getEvent_Abstract()
	 * @model
	 * @generated
	 */
	String getAbstract();

	/**
	 * Sets the value of the '{@link models2016.Event#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see models2016.Models2016Package#getEvent_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link models2016.Event#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Cancelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancelled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancelled</em>' attribute.
	 * @see #setCancelled(boolean)
	 * @see models2016.Models2016Package#getEvent_Cancelled()
	 * @model
	 * @generated
	 */
	boolean isCancelled();

	/**
	 * Sets the value of the '{@link models2016.Event#isCancelled <em>Cancelled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancelled</em>' attribute.
	 * @see #isCancelled()
	 * @generated
	 */
	void setCancelled(boolean value);

} // Event
