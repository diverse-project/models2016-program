/**
 */
package models2016.impl;

import java.util.Collection;
import models2016.Event;
import models2016.Models2016Package;
import models2016.Room;
import models2016.Session;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
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
	 * The cached value of the '{@link #getStartingTime() <em>Starting Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingTime()
	 * @generated
	 * @ordered
	 */
	protected models2016.Date startingTime;

	/**
	 * The cached value of the '{@link #getEndingTime() <em>Ending Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndingTime()
	 * @generated
	 * @ordered
	 */
	protected models2016.Date endingTime;

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
	public models2016.Date getStartingTime() {
		return startingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartingTime(models2016.Date newStartingTime, NotificationChain msgs) {
		models2016.Date oldStartingTime = startingTime;
		startingTime = newStartingTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Models2016Package.SESSION__STARTING_TIME, oldStartingTime, newStartingTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartingTime(models2016.Date newStartingTime) {
		if (newStartingTime != startingTime) {
			NotificationChain msgs = null;
			if (startingTime != null)
				msgs = ((InternalEObject)startingTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Models2016Package.SESSION__STARTING_TIME, null, msgs);
			if (newStartingTime != null)
				msgs = ((InternalEObject)newStartingTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Models2016Package.SESSION__STARTING_TIME, null, msgs);
			msgs = basicSetStartingTime(newStartingTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Models2016Package.SESSION__STARTING_TIME, newStartingTime, newStartingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public models2016.Date getEndingTime() {
		return endingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndingTime(models2016.Date newEndingTime, NotificationChain msgs) {
		models2016.Date oldEndingTime = endingTime;
		endingTime = newEndingTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Models2016Package.SESSION__ENDING_TIME, oldEndingTime, newEndingTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndingTime(models2016.Date newEndingTime) {
		if (newEndingTime != endingTime) {
			NotificationChain msgs = null;
			if (endingTime != null)
				msgs = ((InternalEObject)endingTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Models2016Package.SESSION__ENDING_TIME, null, msgs);
			if (newEndingTime != null)
				msgs = ((InternalEObject)newEndingTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Models2016Package.SESSION__ENDING_TIME, null, msgs);
			msgs = basicSetEndingTime(newEndingTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Models2016Package.SESSION__ENDING_TIME, newEndingTime, newEndingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Models2016Package.SESSION__STARTING_TIME:
				return basicSetStartingTime(null, msgs);
			case Models2016Package.SESSION__ENDING_TIME:
				return basicSetEndingTime(null, msgs);
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
				setStartingTime((models2016.Date)newValue);
				return;
			case Models2016Package.SESSION__ENDING_TIME:
				setEndingTime((models2016.Date)newValue);
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
				setStartingTime((models2016.Date)null);
				return;
			case Models2016Package.SESSION__ENDING_TIME:
				setEndingTime((models2016.Date)null);
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
				return startingTime != null;
			case Models2016Package.SESSION__ENDING_TIME:
				return endingTime != null;
		}
		return super.eIsSet(featureID);
	}

} //SessionImpl
