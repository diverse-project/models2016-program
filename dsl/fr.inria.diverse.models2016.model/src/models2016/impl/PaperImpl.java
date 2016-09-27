/**
 */
package models2016.impl;

import java.util.Collection;

import models2016.Kind;
import models2016.Models2016Package;
import models2016.Paper;
import models2016.Person;
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
 * An implementation of the model object '<em><b>Paper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link models2016.impl.PaperImpl#getAuthors <em>Authors</em>}</li>
 *   <li>{@link models2016.impl.PaperImpl#getPreprint <em>Preprint</em>}</li>
 *   <li>{@link models2016.impl.PaperImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link models2016.impl.PaperImpl#getName <em>Name</em>}</li>
 *   <li>{@link models2016.impl.PaperImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link models2016.impl.PaperImpl#getProceedings <em>Proceedings</em>}</li>
 *   <li>{@link models2016.impl.PaperImpl#isCancelled <em>Cancelled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaperImpl extends MinimalEObjectImpl.Container implements Paper {
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
	 * The default value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSTRACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected String abstract_ = ABSTRACT_EDEFAULT;

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
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected Kind kind;

	/**
	 * The default value of the '{@link #getProceedings() <em>Proceedings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceedings()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCEEDINGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProceedings() <em>Proceedings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceedings()
	 * @generated
	 * @ordered
	 */
	protected String proceedings = PROCEEDINGS_EDEFAULT;

	/**
	 * The default value of the '{@link #isCancelled() <em>Cancelled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCancelled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CANCELLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCancelled() <em>Cancelled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCancelled()
	 * @generated
	 * @ordered
	 */
	protected boolean cancelled = CANCELLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Models2016Package.Literals.PAPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getAuthors() {
		if (authors == null) {
			authors = new EObjectContainmentEList<Person>(Person.class, this, Models2016Package.PAPER__AUTHORS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Models2016Package.PAPER__PREPRINT, oldPreprint, preprint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kind getKind() {
		if (kind != null && kind.eIsProxy()) {
			InternalEObject oldKind = (InternalEObject)kind;
			kind = (Kind)eResolveProxy(oldKind);
			if (kind != oldKind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Models2016Package.PAPER__KIND, oldKind, kind));
			}
		}
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kind basicGetKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(Kind newKind) {
		Kind oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Models2016Package.PAPER__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProceedings() {
		return proceedings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProceedings(String newProceedings) {
		String oldProceedings = proceedings;
		proceedings = newProceedings;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Models2016Package.PAPER__PROCEEDINGS, oldProceedings, proceedings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCancelled() {
		return cancelled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCancelled(boolean newCancelled) {
		boolean oldCancelled = cancelled;
		cancelled = newCancelled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Models2016Package.PAPER__CANCELLED, oldCancelled, cancelled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(String newAbstract) {
		String oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Models2016Package.PAPER__ABSTRACT, oldAbstract, abstract_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Models2016Package.PAPER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Models2016Package.PAPER__AUTHORS:
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
			case Models2016Package.PAPER__AUTHORS:
				return getAuthors();
			case Models2016Package.PAPER__PREPRINT:
				return getPreprint();
			case Models2016Package.PAPER__ABSTRACT:
				return getAbstract();
			case Models2016Package.PAPER__NAME:
				return getName();
			case Models2016Package.PAPER__KIND:
				if (resolve) return getKind();
				return basicGetKind();
			case Models2016Package.PAPER__PROCEEDINGS:
				return getProceedings();
			case Models2016Package.PAPER__CANCELLED:
				return isCancelled();
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
			case Models2016Package.PAPER__AUTHORS:
				getAuthors().clear();
				getAuthors().addAll((Collection<? extends Person>)newValue);
				return;
			case Models2016Package.PAPER__PREPRINT:
				setPreprint((String)newValue);
				return;
			case Models2016Package.PAPER__ABSTRACT:
				setAbstract((String)newValue);
				return;
			case Models2016Package.PAPER__NAME:
				setName((String)newValue);
				return;
			case Models2016Package.PAPER__KIND:
				setKind((Kind)newValue);
				return;
			case Models2016Package.PAPER__PROCEEDINGS:
				setProceedings((String)newValue);
				return;
			case Models2016Package.PAPER__CANCELLED:
				setCancelled((Boolean)newValue);
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
			case Models2016Package.PAPER__AUTHORS:
				getAuthors().clear();
				return;
			case Models2016Package.PAPER__PREPRINT:
				setPreprint(PREPRINT_EDEFAULT);
				return;
			case Models2016Package.PAPER__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case Models2016Package.PAPER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Models2016Package.PAPER__KIND:
				setKind((Kind)null);
				return;
			case Models2016Package.PAPER__PROCEEDINGS:
				setProceedings(PROCEEDINGS_EDEFAULT);
				return;
			case Models2016Package.PAPER__CANCELLED:
				setCancelled(CANCELLED_EDEFAULT);
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
			case Models2016Package.PAPER__AUTHORS:
				return authors != null && !authors.isEmpty();
			case Models2016Package.PAPER__PREPRINT:
				return PREPRINT_EDEFAULT == null ? preprint != null : !PREPRINT_EDEFAULT.equals(preprint);
			case Models2016Package.PAPER__ABSTRACT:
				return ABSTRACT_EDEFAULT == null ? abstract_ != null : !ABSTRACT_EDEFAULT.equals(abstract_);
			case Models2016Package.PAPER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Models2016Package.PAPER__KIND:
				return kind != null;
			case Models2016Package.PAPER__PROCEEDINGS:
				return PROCEEDINGS_EDEFAULT == null ? proceedings != null : !PROCEEDINGS_EDEFAULT.equals(proceedings);
			case Models2016Package.PAPER__CANCELLED:
				return cancelled != CANCELLED_EDEFAULT;
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
		result.append(", abstract: ");
		result.append(abstract_);
		result.append(", name: ");
		result.append(name);
		result.append(", proceedings: ");
		result.append(proceedings);
		result.append(", cancelled: ");
		result.append(cancelled);
		result.append(')');
		return result.toString();
	}

} //PaperImpl
