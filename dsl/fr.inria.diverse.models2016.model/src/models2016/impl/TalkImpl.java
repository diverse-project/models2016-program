/**
 */
package models2016.impl;

import java.util.Collection;

import models2016.Models2016Package;
import models2016.Person;
import models2016.Talk;
import models2016.Track;

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
 * An implementation of the model object '<em><b>Talk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link models2016.impl.TalkImpl#getAuthors <em>Authors</em>}</li>
 *   <li>{@link models2016.impl.TalkImpl#getPreprint <em>Preprint</em>}</li>
 *   <li>{@link models2016.impl.TalkImpl#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TalkImpl extends MinimalEObjectImpl.Container implements Talk {
	/**
	 * The cached value of the '{@link #getAuthors() <em>Authors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> authors;

	/**
	 * The default value of the '{@link #getPreprint() <em>Preprint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreprint()
	 * @generated
	 * @ordered
	 */
	protected static final String PREPRINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreprint() <em>Preprint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreprint()
	 * @generated
	 * @ordered
	 */
	protected String preprint = PREPRINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final Track KIND_EDEFAULT = Track.PRACTICE_AND_INNOVATION;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected Track kind = KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TalkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Models2016Package.Literals.TALK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getAuthors() {
		if (authors == null) {
			authors = new EObjectContainmentEList<Person>(Person.class, this, Models2016Package.TALK__AUTHORS);
		}
		return authors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreprint() {
		return preprint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreprint(String newPreprint) {
		String oldPreprint = preprint;
		preprint = newPreprint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Models2016Package.TALK__PREPRINT, oldPreprint, preprint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Track getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(Track newKind) {
		Track oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Models2016Package.TALK__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Models2016Package.TALK__AUTHORS:
				return ((InternalEList<?>)getAuthors()).basicRemove(otherEnd, msgs);
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
			case Models2016Package.TALK__AUTHORS:
				return getAuthors();
			case Models2016Package.TALK__PREPRINT:
				return getPreprint();
			case Models2016Package.TALK__KIND:
				return getKind();
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
			case Models2016Package.TALK__AUTHORS:
				getAuthors().clear();
				getAuthors().addAll((Collection<? extends Person>)newValue);
				return;
			case Models2016Package.TALK__PREPRINT:
				setPreprint((String)newValue);
				return;
			case Models2016Package.TALK__KIND:
				setKind((Track)newValue);
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
			case Models2016Package.TALK__AUTHORS:
				getAuthors().clear();
				return;
			case Models2016Package.TALK__PREPRINT:
				setPreprint(PREPRINT_EDEFAULT);
				return;
			case Models2016Package.TALK__KIND:
				setKind(KIND_EDEFAULT);
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
			case Models2016Package.TALK__AUTHORS:
				return authors != null && !authors.isEmpty();
			case Models2016Package.TALK__PREPRINT:
				return PREPRINT_EDEFAULT == null ? preprint != null : !PREPRINT_EDEFAULT.equals(preprint);
			case Models2016Package.TALK__KIND:
				return kind != KIND_EDEFAULT;
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
		result.append(" (preprint: ");
		result.append(preprint);
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //TalkImpl
