/**
 */
package models2016.impl;

import models2016.Event;
import models2016.Models2016Package;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link models2016.impl.EventImpl#getName <em>Name</em>}</li>
 *   <li>{@link models2016.impl.EventImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link models2016.impl.EventImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link models2016.impl.EventImpl#isCancelled <em>Cancelled</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EventImpl extends MinimalEObjectImpl.Container implements Event {
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
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

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
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Models2016Package.Literals.EVENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Models2016Package.EVENT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Models2016Package.EVENT__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Models2016Package.EVENT__URL, oldUrl, url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Models2016Package.EVENT__CANCELLED, oldCancelled, cancelled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Models2016Package.EVENT__NAME:
				return getName();
			case Models2016Package.EVENT__ABSTRACT:
				return getAbstract();
			case Models2016Package.EVENT__URL:
				return getUrl();
			case Models2016Package.EVENT__CANCELLED:
				return isCancelled();
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
			case Models2016Package.EVENT__NAME:
				setName((String)newValue);
				return;
			case Models2016Package.EVENT__ABSTRACT:
				setAbstract((String)newValue);
				return;
			case Models2016Package.EVENT__URL:
				setUrl((String)newValue);
				return;
			case Models2016Package.EVENT__CANCELLED:
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
			case Models2016Package.EVENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Models2016Package.EVENT__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case Models2016Package.EVENT__URL:
				setUrl(URL_EDEFAULT);
				return;
			case Models2016Package.EVENT__CANCELLED:
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
			case Models2016Package.EVENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Models2016Package.EVENT__ABSTRACT:
				return ABSTRACT_EDEFAULT == null ? abstract_ != null : !ABSTRACT_EDEFAULT.equals(abstract_);
			case Models2016Package.EVENT__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case Models2016Package.EVENT__CANCELLED:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", abstract: ");
		result.append(abstract_);
		result.append(", url: ");
		result.append(url);
		result.append(", cancelled: ");
		result.append(cancelled);
		result.append(')');
		return result.toString();
	}

} //EventImpl
