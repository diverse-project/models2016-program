/**
 */
package models2016.util;

import models2016.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see models2016.Models2016Package
 * @generated
 */
public class Models2016AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Models2016Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Models2016AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Models2016Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Models2016Switch<Adapter> modelSwitch =
		new Models2016Switch<Adapter>() {
			@Override
			public Adapter caseDay(Day object) {
				return createDayAdapter();
			}
			@Override
			public Adapter caseProgram(Program object) {
				return createProgramAdapter();
			}
			@Override
			public Adapter caseSession(Session object) {
				return createSessionAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseTalkSession(TalkSession object) {
				return createTalkSessionAdapter();
			}
			@Override
			public Adapter casePanel(Panel object) {
				return createPanelAdapter();
			}
			@Override
			public Adapter caseWorkshop(Workshop object) {
				return createWorkshopAdapter();
			}
			@Override
			public Adapter caseTutorial(Tutorial object) {
				return createTutorialAdapter();
			}
			@Override
			public Adapter caseDoctoralSymposium(DoctoralSymposium object) {
				return createDoctoralSymposiumAdapter();
			}
			@Override
			public Adapter caseEducatorSymposium(EducatorSymposium object) {
				return createEducatorSymposiumAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseRoom(Room object) {
				return createRoomAdapter();
			}
			@Override
			public Adapter caseReception(Reception object) {
				return createReceptionAdapter();
			}
			@Override
			public Adapter caseClinic(Clinic object) {
				return createClinicAdapter();
			}
			@Override
			public Adapter caseConference(Conference object) {
				return createConferenceAdapter();
			}
			@Override
			public Adapter casePerson(Person object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter casePaper(Paper object) {
				return createPaperAdapter();
			}
			@Override
			public Adapter caseLunch(Lunch object) {
				return createLunchAdapter();
			}
			@Override
			public Adapter caseCoffeeBreak(CoffeeBreak object) {
				return createCoffeeBreakAdapter();
			}
			@Override
			public Adapter caseMeeting(Meeting object) {
				return createMeetingAdapter();
			}
			@Override
			public Adapter caseSRC(SRC object) {
				return createSRCAdapter();
			}
			@Override
			public Adapter casePoster(Poster object) {
				return createPosterAdapter();
			}
			@Override
			public Adapter caseKeynote(Keynote object) {
				return createKeynoteAdapter();
			}
			@Override
			public Adapter caseKind(Kind object) {
				return createKindAdapter();
			}
			@Override
			public Adapter caseSponsorKeynote(SponsorKeynote object) {
				return createSponsorKeynoteAdapter();
			}
			@Override
			public Adapter caseOpening(Opening object) {
				return createOpeningAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link models2016.Day <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see models2016.Day
	 * @generated
	 */
	public Adapter createDayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link models2016.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see models2016.Program
	 * @generated
	 */
	public Adapter createProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link models2016.Session <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see models2016.Session
	 * @generated
	 */
	public Adapter createSessionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link models2016.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see models2016.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link models2016.TalkSession <em>Talk Session</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see models2016.TalkSession
	 * @generated
	 */
	public Adapter createTalkSessionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link models2016.Panel <em>Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see models2016.Panel
	 * @generated
	 */
	public Adapter createPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link models2016.Workshop <em>Workshop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see models2016.Workshop
	 * @generated
	 */
	public Adapter createWorkshopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link models2016.Tutorial <em>Tutorial</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see models2016.Tutorial
	 * @generated
	 */
	public Adapter createTutorialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link models2016.DoctoralSymposium <em>Doctoral Symposium</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see models2016.DoctoralSymposium
	 * @generated
	 */
	public Adapter createDoctoralSymposiumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link models2016.EducatorSymposium <em>Educator Symposium</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see models2016.EducatorSymposium
	 * @generated
	 */
	public Adapter createEducatorSymposiumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link models2016.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see models2016.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link models2016.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see models2016.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link models2016.Reception <em>Reception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see models2016.Reception
	 * @generated
	 */
	public Adapter createReceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link models2016.Clinic <em>Clinic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see models2016.Clinic
	 * @generated
	 */
	public Adapter createClinicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link models2016.Conference <em>Conference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see models2016.Conference
	 * @generated
	 */
	public Adapter createConferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link models2016.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see models2016.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link models2016.Paper <em>Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see models2016.Paper
	 * @generated
	 */
	public Adapter createPaperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link models2016.Lunch <em>Lunch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see models2016.Lunch
	 * @generated
	 */
	public Adapter createLunchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link models2016.CoffeeBreak <em>Coffee Break</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see models2016.CoffeeBreak
	 * @generated
	 */
	public Adapter createCoffeeBreakAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link models2016.Meeting <em>Meeting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see models2016.Meeting
	 * @generated
	 */
	public Adapter createMeetingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link models2016.SRC <em>SRC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see models2016.SRC
	 * @generated
	 */
	public Adapter createSRCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link models2016.Poster <em>Poster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see models2016.Poster
	 * @generated
	 */
	public Adapter createPosterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link models2016.Keynote <em>Keynote</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see models2016.Keynote
	 * @generated
	 */
	public Adapter createKeynoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link models2016.Kind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see models2016.Kind
	 * @generated
	 */
	public Adapter createKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link models2016.SponsorKeynote <em>Sponsor Keynote</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see models2016.SponsorKeynote
	 * @generated
	 */
	public Adapter createSponsorKeynoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link models2016.Opening <em>Opening</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see models2016.Opening
	 * @generated
	 */
	public Adapter createOpeningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Models2016AdapterFactory
