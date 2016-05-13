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
 *   <li>{@link fr.irisa.models.program.program.Day#getName <em>Name</em>}</li>
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
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.irisa.models.program.program.ProgramPackage#getDay_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.irisa.models.program.program.Day#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
