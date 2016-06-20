/**
 */
package models2016.impl;

import java.util.Collection;
import models2016.Date;
import models2016.Day;
import models2016.Models2016Package;
import models2016.Session;
import models2016.WeekDay;

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
 *   <li>{@link models2016.impl.DayImpl#getWeekday <em>Weekday</em>}</li>
 *   <li>{@link models2016.impl.DayImpl#getSessions <em>Sessions</em>}</li>
 *   <li>{@link models2016.impl.DayImpl#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DayImpl extends MinimalEObjectImpl.Container implements Day {
	/**
	 * The default value of the '{@link #getWeekday() <em>Weekday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekday()
	 * @generated
	 * @ordered
	 */
	protected static final WeekDay WEEKDAY_EDEFAULT = WeekDay.MONDAY;

	/**
	 * The cached value of the '{@link #getWeekday() <em>Weekday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekday()
	 * @generated
	 * @ordered
	 */
	protected WeekDay weekday = WEEKDAY_EDEFAULT;

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
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Models2016Package.Literals.DAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeekDay getWeekday() {
		return weekday;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeekday(WeekDay newWeekday) {
		WeekDay oldWeekday = weekday;
		weekday = newWeekday == null ? WEEKDAY_EDEFAULT : newWeekday;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Models2016Package.DAY__WEEKDAY, oldWeekday, weekday));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(Date newDate, NotificationChain msgs) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Models2016Package.DAY__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Models2016Package.DAY__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Models2016Package.DAY__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Models2016Package.DAY__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Session> getSessions() {
		if (sessions == null) {
			sessions = new EObjectContainmentEList<Session>(Session.class, this, Models2016Package.DAY__SESSIONS);
		}
		return sessions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Models2016Package.DAY__SESSIONS:
				return ((InternalEList<?>)getSessions()).basicRemove(otherEnd, msgs);
			case Models2016Package.DAY__DATE:
				return basicSetDate(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Models2016Package.DAY__WEEKDAY:
				return getWeekday();
			case Models2016Package.DAY__SESSIONS:
				return getSessions();
			case Models2016Package.DAY__DATE:
				return getDate();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Models2016Package.DAY__WEEKDAY:
				setWeekday((WeekDay)newValue);
				return;
			case Models2016Package.DAY__SESSIONS:
				getSessions().clear();
				getSessions().addAll((Collection<? extends Session>)newValue);
				return;
			case Models2016Package.DAY__DATE:
				setDate((Date)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case Models2016Package.DAY__WEEKDAY:
				setWeekday(WEEKDAY_EDEFAULT);
				return;
			case Models2016Package.DAY__SESSIONS:
				getSessions().clear();
				return;
			case Models2016Package.DAY__DATE:
				setDate((Date)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Models2016Package.DAY__WEEKDAY:
				return weekday != WEEKDAY_EDEFAULT;
			case Models2016Package.DAY__SESSIONS:
				return sessions != null && !sessions.isEmpty();
			case Models2016Package.DAY__DATE:
				return date != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (weekday: ");
		result.append(weekday);
		result.append(')');
		return result.toString();
	}

} //DayImpl
