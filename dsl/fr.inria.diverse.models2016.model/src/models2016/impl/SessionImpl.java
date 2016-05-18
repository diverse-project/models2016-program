/**
 */
package models2016.impl;

import java.util.Collection;
import java.util.Date;
import models2016.Event;
import models2016.Models2016Package;
import models2016.Room;
import models2016.Session;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Session</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link models2016.impl.SessionImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link models2016.impl.SessionImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link models2016.impl.SessionImpl#getStartingTime <em>Starting Time</em>}</li>
 *   <li>{@link models2016.impl.SessionImpl#getEndingTime <em>Ending Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SessionImpl extends MinimalEObjectImpl.Container implements Session {
	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected Room room;

	/**
	 * The default value of the '{@link #getStartingTime() <em>Starting Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date STARTING_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartingTime() <em>Starting Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingTime()
	 * @generated
	 * @ordered
	 */
	protected Date startingTime = STARTING_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndingTime() <em>Ending Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndingTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date ENDING_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndingTime() <em>Ending Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndingTime()
	 * @generated
	 * @ordered
	 */
	protected Date endingTime = ENDING_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SessionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Models2016Package.Literals.SESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectResolvingEList<Event>(Event.class, this, Models2016Package.SESSION__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getRoom() {
		if (room != null && room.eIsProxy()) {
			InternalEObject oldRoom = (InternalEObject)room;
			room = (Room)eResolveProxy(oldRoom);
			if (room != oldRoom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Models2016Package.SESSION__ROOM, oldRoom, room));
			}
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(Room newRoom) {
		Room oldRoom = room;
		room = newRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Models2016Package.SESSION__ROOM, oldRoom, room));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartingTime() {
		return startingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartingTime(Date newStartingTime) {
		Date oldStartingTime = startingTime;
		startingTime = newStartingTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Models2016Package.SESSION__STARTING_TIME, oldStartingTime, startingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndingTime() {
		return endingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndingTime(Date newEndingTime) {
		Date oldEndingTime = endingTime;
		endingTime = newEndingTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Models2016Package.SESSION__ENDING_TIME, oldEndingTime, endingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Models2016Package.SESSION__EVENTS:
				return getEvents();
			case Models2016Package.SESSION__ROOM:
				if (resolve) return getRoom();
				return basicGetRoom();
			case Models2016Package.SESSION__STARTING_TIME:
				return getStartingTime();
			case Models2016Package.SESSION__ENDING_TIME:
				return getEndingTime();
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
			case Models2016Package.SESSION__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case Models2016Package.SESSION__ROOM:
				setRoom((Room)newValue);
				return;
			case Models2016Package.SESSION__STARTING_TIME:
				setStartingTime((Date)newValue);
				return;
			case Models2016Package.SESSION__ENDING_TIME:
				setEndingTime((Date)newValue);
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
			case Models2016Package.SESSION__EVENTS:
				getEvents().clear();
				return;
			case Models2016Package.SESSION__ROOM:
				setRoom((Room)null);
				return;
			case Models2016Package.SESSION__STARTING_TIME:
				setStartingTime(STARTING_TIME_EDEFAULT);
				return;
			case Models2016Package.SESSION__ENDING_TIME:
				setEndingTime(ENDING_TIME_EDEFAULT);
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
			case Models2016Package.SESSION__EVENTS:
				return events != null && !events.isEmpty();
			case Models2016Package.SESSION__ROOM:
				return room != null;
			case Models2016Package.SESSION__STARTING_TIME:
				return STARTING_TIME_EDEFAULT == null ? startingTime != null : !STARTING_TIME_EDEFAULT.equals(startingTime);
			case Models2016Package.SESSION__ENDING_TIME:
				return ENDING_TIME_EDEFAULT == null ? endingTime != null : !ENDING_TIME_EDEFAULT.equals(endingTime);
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
		result.append(" (startingTime: ");
		result.append(startingTime);
		result.append(", endingTime: ");
		result.append(endingTime);
		result.append(')');
		return result.toString();
	}

} //SessionImpl
