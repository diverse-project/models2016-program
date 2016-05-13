/**
 */
package fr.irisa.models.program.program;

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
 *   <li>{@link fr.irisa.models.program.program.Talk#getTilte <em>Tilte</em>}</li>
 *   <li>{@link fr.irisa.models.program.program.Talk#getRoom <em>Room</em>}</li>
 *   <li>{@link fr.irisa.models.program.program.Talk#getSpeakers <em>Speakers</em>}</li>
 * </ul>
 *
 * @see fr.irisa.models.program.program.ProgramPackage#getTalk()
 * @model
 * @generated
 */
public interface Talk extends EObject
{
  /**
   * Returns the value of the '<em><b>Tilte</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tilte</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tilte</em>' attribute.
   * @see #setTilte(String)
   * @see fr.irisa.models.program.program.ProgramPackage#getTalk_Tilte()
   * @model
   * @generated
   */
  String getTilte();

  /**
   * Sets the value of the '{@link fr.irisa.models.program.program.Talk#getTilte <em>Tilte</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tilte</em>' attribute.
   * @see #getTilte()
   * @generated
   */
  void setTilte(String value);

  /**
   * Returns the value of the '<em><b>Room</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Room</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Room</em>' attribute.
   * @see #setRoom(String)
   * @see fr.irisa.models.program.program.ProgramPackage#getTalk_Room()
   * @model
   * @generated
   */
  String getRoom();

  /**
   * Sets the value of the '{@link fr.irisa.models.program.program.Talk#getRoom <em>Room</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Room</em>' attribute.
   * @see #getRoom()
   * @generated
   */
  void setRoom(String value);

  /**
   * Returns the value of the '<em><b>Speakers</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Speakers</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Speakers</em>' attribute list.
   * @see fr.irisa.models.program.program.ProgramPackage#getTalk_Speakers()
   * @model unique="false"
   * @generated
   */
  EList<String> getSpeakers();

} // Talk
