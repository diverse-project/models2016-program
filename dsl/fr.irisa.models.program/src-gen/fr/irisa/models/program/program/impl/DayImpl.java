/**
 */
package fr.irisa.models.program.program.impl;

import fr.irisa.models.program.program.Day;
import fr.irisa.models.program.program.ProgramPackage;
import fr.irisa.models.program.program.Session;
import fr.irisa.models.program.program.WeekDay;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Day</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.irisa.models.program.program.impl.DayImpl#getWeekDay <em>Week Day</em>}</li>
 *   <li>{@link fr.irisa.models.program.program.impl.DayImpl#getSessions <em>Sessions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DayImpl extends MinimalEObjectImpl.Container implements Day
{
  /**
   * The default value of the '{@link #getWeekDay() <em>Week Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeekDay()
   * @generated
   * @ordered
   */
  protected static final WeekDay WEEK_DAY_EDEFAULT = WeekDay.MONDAY;

  /**
   * The cached value of the '{@link #getWeekDay() <em>Week Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeekDay()
   * @generated
   * @ordered
   */
  protected WeekDay weekDay = WEEK_DAY_EDEFAULT;

  /**
   * The cached value of the '{@link #getSessions() <em>Sessions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSessions()
   * @generated
   * @ordered
   */
  protected EList<Session> sessions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DayImpl()
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
    return ProgramPackage.Literals.DAY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeekDay getWeekDay()
  {
    return weekDay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWeekDay(WeekDay newWeekDay)
  {
    WeekDay oldWeekDay = weekDay;
    weekDay = newWeekDay == null ? WEEK_DAY_EDEFAULT : newWeekDay;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProgramPackage.DAY__WEEK_DAY, oldWeekDay, weekDay));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Session> getSessions()
  {
    if (sessions == null)
    {
      sessions = new EObjectContainmentEList<Session>(Session.class, this, ProgramPackage.DAY__SESSIONS);
    }
    return sessions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ProgramPackage.DAY__SESSIONS:
        return ((InternalEList<?>)getSessions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ProgramPackage.DAY__WEEK_DAY:
        return getWeekDay();
      case ProgramPackage.DAY__SESSIONS:
        return getSessions();
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
      case ProgramPackage.DAY__WEEK_DAY:
        setWeekDay((WeekDay)newValue);
        return;
      case ProgramPackage.DAY__SESSIONS:
        getSessions().clear();
        getSessions().addAll((Collection<? extends Session>)newValue);
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
      case ProgramPackage.DAY__WEEK_DAY:
        setWeekDay(WEEK_DAY_EDEFAULT);
        return;
      case ProgramPackage.DAY__SESSIONS:
        getSessions().clear();
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
      case ProgramPackage.DAY__WEEK_DAY:
        return weekDay != WEEK_DAY_EDEFAULT;
      case ProgramPackage.DAY__SESSIONS:
        return sessions != null && !sessions.isEmpty();
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
    result.append(" (weekDay: ");
    result.append(weekDay);
    result.append(')');
    return result.toString();
  }

} //DayImpl
