/**
 */
package fr.irisa.models.program.program;

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
 *   <li>{@link fr.irisa.models.program.program.Day#getWeekDay <em>Week Day</em>}</li>
 *   <li>{@link fr.irisa.models.program.program.Day#getSessions <em>Sessions</em>}</li>
 * </ul>
 *
 * @see fr.irisa.models.program.program.ProgramPackage#getDay()
 * @model
 * @generated
 */
public interface Day extends EObject
{
  /**
   * Returns the value of the '<em><b>Week Day</b></em>' attribute.
   * The literals are from the enumeration {@link fr.irisa.models.program.program.WeekDay}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Week Day</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Week Day</em>' attribute.
   * @see fr.irisa.models.program.program.WeekDay
   * @see #setWeekDay(WeekDay)
   * @see fr.irisa.models.program.program.ProgramPackage#getDay_WeekDay()
   * @model
   * @generated
   */
  WeekDay getWeekDay();

  /**
   * Sets the value of the '{@link fr.irisa.models.program.program.Day#getWeekDay <em>Week Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Week Day</em>' attribute.
   * @see fr.irisa.models.program.program.WeekDay
   * @see #getWeekDay()
   * @generated
   */
  void setWeekDay(WeekDay value);

  /**
   * Returns the value of the '<em><b>Sessions</b></em>' containment reference list.
   * The list contents are of type {@link fr.irisa.models.program.program.Session}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sessions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sessions</em>' containment reference list.
   * @see fr.irisa.models.program.program.ProgramPackage#getDay_Sessions()
   * @model containment="true"
   * @generated
   */
  EList<Session> getSessions();

} // Day
