/**
 */
package fr.irisa.models.program.program;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.irisa.models.program.program.Program#getRooms <em>Rooms</em>}</li>
 *   <li>{@link fr.irisa.models.program.program.Program#getDays <em>Days</em>}</li>
 * </ul>
 *
 * @see fr.irisa.models.program.program.ProgramPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
{
  /**
   * Returns the value of the '<em><b>Rooms</b></em>' containment reference list.
   * The list contents are of type {@link fr.irisa.models.program.program.Room}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rooms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rooms</em>' containment reference list.
   * @see fr.irisa.models.program.program.ProgramPackage#getProgram_Rooms()
   * @model containment="true"
   * @generated
   */
  EList<Room> getRooms();

  /**
   * Returns the value of the '<em><b>Days</b></em>' containment reference list.
   * The list contents are of type {@link fr.irisa.models.program.program.Day}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Days</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Days</em>' containment reference list.
   * @see fr.irisa.models.program.program.ProgramPackage#getProgram_Days()
   * @model containment="true"
   * @generated
   */
  EList<Day> getDays();

} // Program
