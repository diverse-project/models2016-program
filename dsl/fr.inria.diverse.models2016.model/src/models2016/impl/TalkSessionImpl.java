/**
 */
package models2016.impl;

import java.util.Collection;

import models2016.Models2016Package;
import models2016.Paper;
import models2016.Person;
import models2016.TalkSession;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Talk Session</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link models2016.impl.TalkSessionImpl#getChair <em>Chair</em>}</li>
 *   <li>{@link models2016.impl.TalkSessionImpl#getPapers <em>Papers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TalkSessionImpl extends EventImpl implements TalkSession {
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
	 * The cached value of the '{@link #getPapers() <em>Papers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPapers()
	 * @generated
	 * @ordered
	 */
	protected EList<Paper> papers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TalkSessionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Models2016Package.Literals.TALK_SESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Paper> getPapers() {
		if (papers == null) {
			papers = new EObjectResolvingEList<Paper>(Paper.class, this, Models2016Package.TALK_SESSION__PAPERS);
		}
		return papers;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Models2016Package.TALK_SESSION__CHAIR, oldChair, newChair);
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
				msgs = ((InternalEObject)chair).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Models2016Package.TALK_SESSION__CHAIR, null, msgs);
			if (newChair != null)
				msgs = ((InternalEObject)newChair).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Models2016Package.TALK_SESSION__CHAIR, null, msgs);
			msgs = basicSetChair(newChair, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Models2016Package.TALK_SESSION__CHAIR, newChair, newChair));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Models2016Package.TALK_SESSION__CHAIR:
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
			case Models2016Package.TALK_SESSION__CHAIR:
				return getChair();
			case Models2016Package.TALK_SESSION__PAPERS:
				return getPapers();
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
			case Models2016Package.TALK_SESSION__CHAIR:
				setChair((Person)newValue);
				return;
			case Models2016Package.TALK_SESSION__PAPERS:
				getPapers().clear();
				getPapers().addAll((Collection<? extends Paper>)newValue);
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
			case Models2016Package.TALK_SESSION__CHAIR:
				setChair((Person)null);
				return;
			case Models2016Package.TALK_SESSION__PAPERS:
				getPapers().clear();
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
			case Models2016Package.TALK_SESSION__CHAIR:
				return chair != null;
			case Models2016Package.TALK_SESSION__PAPERS:
				return papers != null && !papers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TalkSessionImpl
