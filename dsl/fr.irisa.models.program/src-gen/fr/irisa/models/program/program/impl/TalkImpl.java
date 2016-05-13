/**
 */
package fr.irisa.models.program.program.impl;

import fr.irisa.models.program.program.ProgramPackage;
import fr.irisa.models.program.program.Talk;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Talk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.irisa.models.program.program.impl.TalkImpl#getTilte <em>Tilte</em>}</li>
 *   <li>{@link fr.irisa.models.program.program.impl.TalkImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link fr.irisa.models.program.program.impl.TalkImpl#getSpeakers <em>Speakers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TalkImpl extends MinimalEObjectImpl.Container implements Talk
{
  /**
   * The default value of the '{@link #getTilte() <em>Tilte</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTilte()
   * @generated
   * @ordered
   */
  protected static final String TILTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTilte() <em>Tilte</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTilte()
   * @generated
   * @ordered
   */
  protected String tilte = TILTE_EDEFAULT;

  /**
   * The default value of the '{@link #getRoom() <em>Room</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoom()
   * @generated
   * @ordered
   */
  protected static final String ROOM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRoom() <em>Room</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoom()
   * @generated
   * @ordered
   */
  protected String room = ROOM_EDEFAULT;

  /**
   * The cached value of the '{@link #getSpeakers() <em>Speakers</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpeakers()
   * @generated
   * @ordered
   */
  protected EList<String> speakers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TalkImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ProgramPackage.Literals.TALK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTilte()
  {
    return tilte;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTilte(String newTilte)
  {
    String oldTilte = tilte;
    tilte = newTilte;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProgramPackage.TALK__TILTE, oldTilte, tilte));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRoom()
  {
    return room;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRoom(String newRoom)
  {
    String oldRoom = room;
    room = newRoom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProgramPackage.TALK__ROOM, oldRoom, room));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getSpeakers()
  {
    if (speakers == null)
    {
      speakers = new EDataTypeEList<String>(String.class, this, ProgramPackage.TALK__SPEAKERS);
    }
    return speakers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ProgramPackage.TALK__TILTE:
        return getTilte();
      case ProgramPackage.TALK__ROOM:
        return getRoom();
      case ProgramPackage.TALK__SPEAKERS:
        return getSpeakers();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ProgramPackage.TALK__TILTE:
        setTilte((String)newValue);
        return;
      case ProgramPackage.TALK__ROOM:
        setRoom((String)newValue);
        return;
      case ProgramPackage.TALK__SPEAKERS:
        getSpeakers().clear();
        getSpeakers().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ProgramPackage.TALK__TILTE:
        setTilte(TILTE_EDEFAULT);
        return;
      case ProgramPackage.TALK__ROOM:
        setRoom(ROOM_EDEFAULT);
        return;
      case ProgramPackage.TALK__SPEAKERS:
        getSpeakers().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ProgramPackage.TALK__TILTE:
        return TILTE_EDEFAULT == null ? tilte != null : !TILTE_EDEFAULT.equals(tilte);
      case ProgramPackage.TALK__ROOM:
        return ROOM_EDEFAULT == null ? room != null : !ROOM_EDEFAULT.equals(room);
      case ProgramPackage.TALK__SPEAKERS:
        return speakers != null && !speakers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (tilte: ");
    result.append(tilte);
    result.append(", room: ");
    result.append(room);
    result.append(", speakers: ");
    result.append(speakers);
    result.append(')');
    return result.toString();
  }

} //TalkImpl
