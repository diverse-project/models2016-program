/**
 */
package models2016.impl;

import models2016.Keynote;
import models2016.Models2016Package;
import models2016.Person;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Keynote</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link models2016.impl.KeynoteImpl#getSpeaker <em>Speaker</em>}</li>
 *   <li>{@link models2016.impl.KeynoteImpl#getChair <em>Chair</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeynoteImpl extends EventImpl implements Keynote {
	/**
	 * The cached value of the '{@link #getSpeaker() <em>Speaker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeaker()
	 * @generated
	 * @ordered
	 */
	protected Person speaker;

	/**
	 * The cached value of the '{@link #getChair() <em>Chair</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChair()
	 * @generated
	 * @ordered
	 */
	protected Person chair;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeynoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Models2016Package.Literals.KEYNOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getSpeaker() {
		return speaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpeaker(Person newSpeaker, NotificationChain msgs) {
		Person oldSpeaker = speaker;
		speaker = newSpeaker;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Models2016Package.KEYNOTE__SPEAKER, oldSpeaker, newSpeaker);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeaker(Person newSpeaker) {
		if (newSpeaker != speaker) {
			NotificationChain msgs = null;
			if (speaker != null)
				msgs = ((InternalEObject)speaker).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Models2016Package.KEYNOTE__SPEAKER, null, msgs);
			if (newSpeaker != null)
				msgs = ((InternalEObject)newSpeaker).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Models2016Package.KEYNOTE__SPEAKER, null, msgs);
			msgs = basicSetSpeaker(newSpeaker, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Models2016Package.KEYNOTE__SPEAKER, newSpeaker, newSpeaker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getChair() {
		return chair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChair(Person newChair, NotificationChain msgs) {
		Person oldChair = chair;
		chair = newChair;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Models2016Package.KEYNOTE__CHAIR, oldChair, newChair);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChair(Person newChair) {
		if (newChair != chair) {
			NotificationChain msgs = null;
			if (chair != null)
				msgs = ((InternalEObject)chair).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Models2016Package.KEYNOTE__CHAIR, null, msgs);
			if (newChair != null)
				msgs = ((InternalEObject)newChair).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Models2016Package.KEYNOTE__CHAIR, null, msgs);
			msgs = basicSetChair(newChair, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Models2016Package.KEYNOTE__CHAIR, newChair, newChair));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Models2016Package.KEYNOTE__SPEAKER:
				return basicSetSpeaker(null, msgs);
			case Models2016Package.KEYNOTE__CHAIR:
				return basicSetChair(null, msgs);
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
			case Models2016Package.KEYNOTE__SPEAKER:
				return getSpeaker();
			case Models2016Package.KEYNOTE__CHAIR:
				return getChair();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Models2016Package.KEYNOTE__SPEAKER:
				setSpeaker((Person)newValue);
				return;
			case Models2016Package.KEYNOTE__CHAIR:
				setChair((Person)newValue);
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
			case Models2016Package.KEYNOTE__SPEAKER:
				setSpeaker((Person)null);
				return;
			case Models2016Package.KEYNOTE__CHAIR:
				setChair((Person)null);
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
			case Models2016Package.KEYNOTE__SPEAKER:
				return speaker != null;
			case Models2016Package.KEYNOTE__CHAIR:
				return chair != null;
		}
		return super.eIsSet(featureID);
	}

} //KeynoteImpl
