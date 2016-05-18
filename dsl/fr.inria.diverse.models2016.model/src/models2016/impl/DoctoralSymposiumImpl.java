/**
 */
package models2016.impl;

import java.util.Collection;

import models2016.DoctoralSymposium;
import models2016.Models2016Package;
import models2016.Person;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doctoral Symposium</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link models2016.impl.DoctoralSymposiumImpl#getOrganizers <em>Organizers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoctoralSymposiumImpl extends EventImpl implements DoctoralSymposium {
	/**
	 * The cached value of the '{@link #getOrganizers() <em>Organizers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizers()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> organizers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoctoralSymposiumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Models2016Package.Literals.DOCTORAL_SYMPOSIUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getOrganizers() {
		if (organizers == null) {
			organizers = new EObjectContainmentEList<Person>(Person.class, this, Models2016Package.DOCTORAL_SYMPOSIUM__ORGANIZERS);
		}
		return organizers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Models2016Package.DOCTORAL_SYMPOSIUM__ORGANIZERS:
				return ((InternalEList<?>)getOrganizers()).basicRemove(otherEnd, msgs);
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
			case Models2016Package.DOCTORAL_SYMPOSIUM__ORGANIZERS:
				return getOrganizers();
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
			case Models2016Package.DOCTORAL_SYMPOSIUM__ORGANIZERS:
				getOrganizers().clear();
				getOrganizers().addAll((Collection<? extends Person>)newValue);
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
			case Models2016Package.DOCTORAL_SYMPOSIUM__ORGANIZERS:
				getOrganizers().clear();
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
			case Models2016Package.DOCTORAL_SYMPOSIUM__ORGANIZERS:
				return organizers != null && !organizers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DoctoralSymposiumImpl
