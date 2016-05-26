/**
 */
package models2016.impl;

import models2016.KeyNote;
import models2016.Models2016Package;
import models2016.Person;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link models2016.impl.KeyNoteImpl#getSpeaker <em>Speaker</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeyNoteImpl extends EventImpl implements KeyNote {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyNoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Models2016Package.Literals.KEY_NOTE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Models2016Package.KEY_NOTE__SPEAKER, oldSpeaker, newSpeaker);
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
				msgs = ((InternalEObject)speaker).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Models2016Package.KEY_NOTE__SPEAKER, null, msgs);
			if (newSpeaker != null)
				msgs = ((InternalEObject)newSpeaker).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Models2016Package.KEY_NOTE__SPEAKER, null, msgs);
			msgs = basicSetSpeaker(newSpeaker, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Models2016Package.KEY_NOTE__SPEAKER, newSpeaker, newSpeaker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Models2016Package.KEY_NOTE__SPEAKER:
				return basicSetSpeaker(null, msgs);
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
			case Models2016Package.KEY_NOTE__SPEAKER:
				return getSpeaker();
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
			case Models2016Package.KEY_NOTE__SPEAKER:
				setSpeaker((Person)newValue);
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
			case Models2016Package.KEY_NOTE__SPEAKER:
				setSpeaker((Person)null);
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
			case Models2016Package.KEY_NOTE__SPEAKER:
				return speaker != null;
		}
		return super.eIsSet(featureID);
	}

} //KeyNoteImpl
