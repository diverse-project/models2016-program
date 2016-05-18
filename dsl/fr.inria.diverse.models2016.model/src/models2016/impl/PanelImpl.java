/**
 */
package models2016.impl;

import java.util.Collection;

import models2016.Models2016Package;
import models2016.Panel;
import models2016.Person;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Panel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link models2016.impl.PanelImpl#getPanelists <em>Panelists</em>}</li>
 *   <li>{@link models2016.impl.PanelImpl#getModerators <em>Moderators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PanelImpl extends EventImpl implements Panel {
	/**
	 * The cached value of the '{@link #getPanelists() <em>Panelists</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanelists()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> panelists;

	/**
	 * The cached value of the '{@link #getModerators() <em>Moderators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModerators()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> moderators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PanelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Models2016Package.Literals.PANEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPanelists() {
		if (panelists == null) {
			panelists = new EObjectContainmentEList<Person>(Person.class, this, Models2016Package.PANEL__PANELISTS);
		}
		return panelists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getModerators() {
		if (moderators == null) {
			moderators = new EObjectContainmentEList<Person>(Person.class, this, Models2016Package.PANEL__MODERATORS);
		}
		return moderators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Models2016Package.PANEL__PANELISTS:
				return ((InternalEList<?>)getPanelists()).basicRemove(otherEnd, msgs);
			case Models2016Package.PANEL__MODERATORS:
				return ((InternalEList<?>)getModerators()).basicRemove(otherEnd, msgs);
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
			case Models2016Package.PANEL__PANELISTS:
				return getPanelists();
			case Models2016Package.PANEL__MODERATORS:
				return getModerators();
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
			case Models2016Package.PANEL__PANELISTS:
				getPanelists().clear();
				getPanelists().addAll((Collection<? extends Person>)newValue);
				return;
			case Models2016Package.PANEL__MODERATORS:
				getModerators().clear();
				getModerators().addAll((Collection<? extends Person>)newValue);
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
			case Models2016Package.PANEL__PANELISTS:
				getPanelists().clear();
				return;
			case Models2016Package.PANEL__MODERATORS:
				getModerators().clear();
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
			case Models2016Package.PANEL__PANELISTS:
				return panelists != null && !panelists.isEmpty();
			case Models2016Package.PANEL__MODERATORS:
				return moderators != null && !moderators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PanelImpl
