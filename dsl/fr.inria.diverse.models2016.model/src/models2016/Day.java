/**
 */
package models2016;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Day</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link models2016.Day#getWeekday <em>Weekday</em>}</li>
 *   <li>{@link models2016.Day#getSessions <em>Sessions</em>}</li>
 *   <li>{@link models2016.Day#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @see models2016.Models2016Package#getDay()
 * @model
 * @generated
 */
public interface Day extends EObject {
	/**
	 * Returns the value of the '<em><b>Weekday</b></em>' attribute.
	 * The literals are from the enumeration {@link models2016.WeekDay}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weekday</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weekday</em>' attribute.
	 * @see models2016.WeekDay
	 * @see #setWeekday(WeekDay)
	 * @see models2016.Models2016Package#getDay_Weekday()
	 * @model required="true"
	 * @generated
	 */
	WeekDay getWeekday();

	/**
	 * Sets the value of the '{@link models2016.Day#getWeekday <em>Weekday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weekday</em>' attribute.
	 * @see models2016.WeekDay
	 * @see #getWeekday()
	 * @generated
	 */
	void setWeekday(WeekDay value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(Date)
	 * @see models2016.Models2016Package#getDay_Date()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link models2016.Day#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Sessions</b></em>' containment reference list.
	 * The list contents are of type {@link models2016.Session}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sessions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sessions</em>' containment reference list.
	 * @see models2016.Models2016Package#getDay_Sessions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Session> getSessions();

} // Day
