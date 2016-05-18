/**
 */
package models2016.impl;

import models2016.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Models2016FactoryImpl extends EFactoryImpl implements Models2016Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Models2016Factory init() {
		try {
			Models2016Factory theModels2016Factory = (Models2016Factory)EPackage.Registry.INSTANCE.getEFactory(Models2016Package.eNS_URI);
			if (theModels2016Factory != null) {
				return theModels2016Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Models2016FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Models2016FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Models2016Package.DAY: return createDay();
			case Models2016Package.PROGRAM: return createProgram();
			case Models2016Package.SESSION: return createSession();
			case Models2016Package.TALK_SESSION: return createTalkSession();
			case Models2016Package.PANEL: return createPanel();
			case Models2016Package.WORKSHOP: return createWorkshop();
			case Models2016Package.TUTORIAL: return createTutorial();
			case Models2016Package.DOCTORAL_SYMPOSIUM: return createDoctoralSymposium();
			case Models2016Package.EDUCATOR_SYMPOSIUM: return createEducatorSymposium();
			case Models2016Package.ROOM: return createRoom();
			case Models2016Package.RECEPTION: return createReception();
			case Models2016Package.CLINIC: return createClinic();
			case Models2016Package.CONFERENCE: return createConference();
			case Models2016Package.PERSON: return createPerson();
			case Models2016Package.TALK: return createTalk();
			case Models2016Package.LUNCH: return createLunch();
			case Models2016Package.COFFEE_BREAK: return createCoffeeBreak();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Models2016Package.WEEK_DAY:
				return createWeekDayFromString(eDataType, initialValue);
			case Models2016Package.TRACK:
				return createTrackFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Models2016Package.WEEK_DAY:
				return convertWeekDayToString(eDataType, instanceValue);
			case Models2016Package.TRACK:
				return convertTrackToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Day createDay() {
		DayImpl day = new DayImpl();
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Session createSession() {
		SessionImpl session = new SessionImpl();
		return session;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TalkSession createTalkSession() {
		TalkSessionImpl talkSession = new TalkSessionImpl();
		return talkSession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Panel createPanel() {
		PanelImpl panel = new PanelImpl();
		return panel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workshop createWorkshop() {
		WorkshopImpl workshop = new WorkshopImpl();
		return workshop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tutorial createTutorial() {
		TutorialImpl tutorial = new TutorialImpl();
		return tutorial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoctoralSymposium createDoctoralSymposium() {
		DoctoralSymposiumImpl doctoralSymposium = new DoctoralSymposiumImpl();
		return doctoralSymposium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EducatorSymposium createEducatorSymposium() {
		EducatorSymposiumImpl educatorSymposium = new EducatorSymposiumImpl();
		return educatorSymposium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reception createReception() {
		ReceptionImpl reception = new ReceptionImpl();
		return reception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clinic createClinic() {
		ClinicImpl clinic = new ClinicImpl();
		return clinic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conference createConference() {
		ConferenceImpl conference = new ConferenceImpl();
		return conference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Talk createTalk() {
		TalkImpl talk = new TalkImpl();
		return talk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lunch createLunch() {
		LunchImpl lunch = new LunchImpl();
		return lunch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoffeeBreak createCoffeeBreak() {
		CoffeeBreakImpl coffeeBreak = new CoffeeBreakImpl();
		return coffeeBreak;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeekDay createWeekDayFromString(EDataType eDataType, String initialValue) {
		WeekDay result = WeekDay.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWeekDayToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Track createTrackFromString(EDataType eDataType, String initialValue) {
		Track result = Track.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTrackToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Models2016Package getModels2016Package() {
		return (Models2016Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Models2016Package getPackage() {
		return Models2016Package.eINSTANCE;
	}

} //Models2016FactoryImpl
