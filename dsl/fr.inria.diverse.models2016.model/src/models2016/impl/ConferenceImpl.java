/**
 */
package models2016.impl;

import java.util.Collection;

import models2016.Conference;
import models2016.Event;
import models2016.Models2016Package;
import models2016.Paper;
import models2016.Program;
import models2016.Resource;
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
 * An implementation of the model object '<em><b>Conference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link models2016.impl.ConferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link models2016.impl.ConferenceImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link models2016.impl.ConferenceImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link models2016.impl.ConferenceImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link models2016.impl.ConferenceImpl#getPapers <em>Papers</em>}</li>
 *   <li>{@link models2016.impl.ConferenceImpl#getTalkDuration <em>Talk Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConferenceImpl extends MinimalEObjectImpl.Container implements Conference {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resources;

	/**
	 * The cached value of the '{@link #getProgram() <em>Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram()
	 * @generated
	 * @ordered
	 */
	protected Program program;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The cached value of the '{@link #getPapers() <em>Papers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPapers()
	 * @generated
	 * @ordered
	 */
	protected EList<Paper> papers;

	/**
	 * The default value of the '{@link #getTalkDuration() <em>Talk Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTalkDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TALK_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTalkDuration() <em>Talk Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTalkDuration()
	 * @generated
	 * @ordered
	 */
	protected Integer talkDuration = TALK_DURATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Models2016Package.Literals.CONFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Models2016Package.CONFERENCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<Resource>(Resource.class, this, Models2016Package.CONFERENCE__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program getProgram() {
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram(Program newProgram, NotificationChain msgs) {
		Program oldProgram = program;
		program = newProgram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Models2016Package.CONFERENCE__PROGRAM, oldProgram, newProgram);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgram(Program newProgram) {
		if (newProgram != program) {
			NotificationChain msgs = null;
			if (program != null)
				msgs = ((InternalEObject)program).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Models2016Package.CONFERENCE__PROGRAM, null, msgs);
			if (newProgram != null)
				msgs = ((InternalEObject)newProgram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Models2016Package.CONFERENCE__PROGRAM, null, msgs);
			msgs = basicSetProgram(newProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Models2016Package.CONFERENCE__PROGRAM, newProgram, newProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, Models2016Package.CONFERENCE__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Paper> getPapers() {
		if (papers == null) {
			papers = new EObjectContainmentEList<Paper>(Paper.class, this, Models2016Package.CONFERENCE__PAPERS);
		}
		return papers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTalkDuration() {
		return talkDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTalkDuration(Integer newTalkDuration) {
		Integer oldTalkDuration = talkDuration;
		talkDuration = newTalkDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Models2016Package.CONFERENCE__TALK_DURATION, oldTalkDuration, talkDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Models2016Package.CONFERENCE__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case Models2016Package.CONFERENCE__PROGRAM:
				return basicSetProgram(null, msgs);
			case Models2016Package.CONFERENCE__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case Models2016Package.CONFERENCE__PAPERS:
				return ((InternalEList<?>)getPapers()).basicRemove(otherEnd, msgs);
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
			case Models2016Package.CONFERENCE__NAME:
				return getName();
			case Models2016Package.CONFERENCE__RESOURCES:
				return getResources();
			case Models2016Package.CONFERENCE__PROGRAM:
				return getProgram();
			case Models2016Package.CONFERENCE__EVENTS:
				return getEvents();
			case Models2016Package.CONFERENCE__PAPERS:
				return getPapers();
			case Models2016Package.CONFERENCE__TALK_DURATION:
				return getTalkDuration();
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
			case Models2016Package.CONFERENCE__NAME:
				setName((String)newValue);
				return;
			case Models2016Package.CONFERENCE__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case Models2016Package.CONFERENCE__PROGRAM:
				setProgram((Program)newValue);
				return;
			case Models2016Package.CONFERENCE__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case Models2016Package.CONFERENCE__PAPERS:
				getPapers().clear();
				getPapers().addAll((Collection<? extends Paper>)newValue);
				return;
			case Models2016Package.CONFERENCE__TALK_DURATION:
				setTalkDuration((Integer)newValue);
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
			case Models2016Package.CONFERENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Models2016Package.CONFERENCE__RESOURCES:
				getResources().clear();
				return;
			case Models2016Package.CONFERENCE__PROGRAM:
				setProgram((Program)null);
				return;
			case Models2016Package.CONFERENCE__EVENTS:
				getEvents().clear();
				return;
			case Models2016Package.CONFERENCE__PAPERS:
				getPapers().clear();
				return;
			case Models2016Package.CONFERENCE__TALK_DURATION:
				setTalkDuration(TALK_DURATION_EDEFAULT);
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
			case Models2016Package.CONFERENCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Models2016Package.CONFERENCE__RESOURCES:
				return resources != null && !resources.isEmpty();
			case Models2016Package.CONFERENCE__PROGRAM:
				return program != null;
			case Models2016Package.CONFERENCE__EVENTS:
				return events != null && !events.isEmpty();
			case Models2016Package.CONFERENCE__PAPERS:
				return papers != null && !papers.isEmpty();
			case Models2016Package.CONFERENCE__TALK_DURATION:
				return TALK_DURATION_EDEFAULT == null ? talkDuration != null : !TALK_DURATION_EDEFAULT.equals(talkDuration);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", talkDuration: ");
		result.append(talkDuration);
		result.append(')');
		return result.toString();
	}

} //ConferenceImpl
