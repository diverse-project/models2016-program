/**
 */
package fr.irisa.models.program.program;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.irisa.models.program.program.Session#getName <em>Name</em>}</li>
 *   <li>{@link fr.irisa.models.program.program.Session#getStart <em>Start</em>}</li>
 *   <li>{@link fr.irisa.models.program.program.Session#getEnd <em>End</em>}</li>
 *   <li>{@link fr.irisa.models.program.program.Session#getTalks <em>Talks</em>}</li>
 * </ul>
 *
 * @see fr.irisa.models.program.program.ProgramPackage#getSession()
 * @model
 * @generated
 */
public interface Session extends EObject
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
   * @see fr.irisa.models.program.program.ProgramPackage#getSession_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.irisa.models.program.program.Session#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' attribute.
   * @see #setStart(String)
   * @see fr.irisa.models.program.program.ProgramPackage#getSession_Start()
   * @model
   * @generated
   */
  String getStart();

  /**
   * Sets the value of the '{@link fr.irisa.models.program.program.Session#getStart <em>Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' attribute.
   * @see #getStart()
   * @generated
   */
  void setStart(String value);

  /**
   * Returns the value of the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' attribute.
   * @see #setEnd(String)
   * @see fr.irisa.models.program.program.ProgramPackage#getSession_End()
   * @model
   * @generated
   */
  String getEnd();

  /**
   * Sets the value of the '{@link fr.irisa.models.program.program.Session#getEnd <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' attribute.
   * @see #getEnd()
   * @generated
   */
  void setEnd(String value);

  /**
   * Returns the value of the '<em><b>Talks</b></em>' containment reference list.
   * The list contents are of type {@link fr.irisa.models.program.program.Talk}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Talks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Talks</em>' containment reference list.
   * @see fr.irisa.models.program.program.ProgramPackage#getSession_Talks()
   * @model containment="true"
   * @generated
   */
  EList<Talk> getTalks();

} // Session
