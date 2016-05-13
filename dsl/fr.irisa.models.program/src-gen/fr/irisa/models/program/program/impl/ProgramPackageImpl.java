/**
 */
package fr.irisa.models.program.program.impl;

import fr.irisa.models.program.program.Day;
import fr.irisa.models.program.program.Program;
import fr.irisa.models.program.program.ProgramFactory;
import fr.irisa.models.program.program.ProgramPackage;
import fr.irisa.models.program.program.Room;
import fr.irisa.models.program.program.Session;
import fr.irisa.models.program.program.Talk;
import fr.irisa.models.program.program.TalkType;
import fr.irisa.models.program.program.WeekDay;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProgramPackageImpl extends EPackageImpl implements ProgramPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass programEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sessionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass talkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum talkTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum roomEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum weekDayEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see fr.irisa.models.program.program.ProgramPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ProgramPackageImpl()
  {
    super(eNS_URI, ProgramFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ProgramPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ProgramPackage init()
  {
    if (isInited) return (ProgramPackage)EPackage.Registry.INSTANCE.getEPackage(ProgramPackage.eNS_URI);

    // Obtain or create and register package
    ProgramPackageImpl theProgramPackage = (ProgramPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProgramPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProgramPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theProgramPackage.createPackageContents();

    // Initialize created meta-data
    theProgramPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theProgramPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ProgramPackage.eNS_URI, theProgramPackage);
    return theProgramPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProgram()
  {
    return programEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Days()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDay()
  {
    return dayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDay_WeekDay()
  {
    return (EAttribute)dayEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDay_Sessions()
  {
    return (EReference)dayEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSession()
  {
    return sessionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSession_Name()
  {
    return (EAttribute)sessionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSession_Start()
  {
    return (EAttribute)sessionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSession_End()
  {
    return (EAttribute)sessionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSession_Talks()
  {
    return (EReference)sessionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTalk()
  {
    return talkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTalk_Type()
  {
    return (EAttribute)talkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTalk_Tilte()
  {
    return (EAttribute)talkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTalk_Room()
  {
    return (EAttribute)talkEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTalk_Speakers()
  {
    return (EAttribute)talkEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTalkType()
  {
    return talkTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getRoom()
  {
    return roomEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getWeekDay()
  {
    return weekDayEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProgramFactory getProgramFactory()
  {
    return (ProgramFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    programEClass = createEClass(PROGRAM);
    createEReference(programEClass, PROGRAM__DAYS);

    dayEClass = createEClass(DAY);
    createEAttribute(dayEClass, DAY__WEEK_DAY);
    createEReference(dayEClass, DAY__SESSIONS);

    sessionEClass = createEClass(SESSION);
    createEAttribute(sessionEClass, SESSION__NAME);
    createEAttribute(sessionEClass, SESSION__START);
    createEAttribute(sessionEClass, SESSION__END);
    createEReference(sessionEClass, SESSION__TALKS);

    talkEClass = createEClass(TALK);
    createEAttribute(talkEClass, TALK__TYPE);
    createEAttribute(talkEClass, TALK__TILTE);
    createEAttribute(talkEClass, TALK__ROOM);
    createEAttribute(talkEClass, TALK__SPEAKERS);

    // Create enums
    talkTypeEEnum = createEEnum(TALK_TYPE);
    roomEEnum = createEEnum(ROOM);
    weekDayEEnum = createEEnum(WEEK_DAY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProgram_Days(), this.getDay(), null, "days", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dayEClass, Day.class, "Day", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDay_WeekDay(), this.getWeekDay(), "weekDay", null, 0, 1, Day.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDay_Sessions(), this.getSession(), null, "sessions", null, 0, -1, Day.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sessionEClass, Session.class, "Session", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSession_Name(), ecorePackage.getEString(), "name", null, 0, 1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSession_Start(), ecorePackage.getEString(), "start", null, 0, 1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSession_End(), ecorePackage.getEString(), "end", null, 0, 1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSession_Talks(), this.getTalk(), null, "talks", null, 0, -1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(talkEClass, Talk.class, "Talk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTalk_Type(), this.getTalkType(), "type", null, 0, 1, Talk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTalk_Tilte(), ecorePackage.getEString(), "tilte", null, 0, 1, Talk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTalk_Room(), this.getRoom(), "room", null, 0, 1, Talk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTalk_Speakers(), ecorePackage.getEString(), "speakers", null, 0, -1, Talk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(talkTypeEEnum, TalkType.class, "TalkType");
    addEEnumLiteral(talkTypeEEnum, TalkType.WORKSHOP);
    addEEnumLiteral(talkTypeEEnum, TalkType.TUTORIAL);
    addEEnumLiteral(talkTypeEEnum, TalkType.SYMPOSIUM);
    addEEnumLiteral(talkTypeEEnum, TalkType.CLINIC);
    addEEnumLiteral(talkTypeEEnum, TalkType.BREAK);
    addEEnumLiteral(talkTypeEEnum, TalkType.LUNCH);
    addEEnumLiteral(talkTypeEEnum, TalkType.POSTER);
    addEEnumLiteral(talkTypeEEnum, TalkType.SRC);
    addEEnumLiteral(talkTypeEEnum, TalkType.MAIN);

    initEEnum(roomEEnum, Room.class, "Room");
    addEEnumLiteral(roomEEnum, Room.BOUVET1);
    addEEnumLiteral(roomEEnum, Room.BOUVET2);
    addEEnumLiteral(roomEEnum, Room.CHARCOT);
    addEEnumLiteral(roomEEnum, Room.VAUBAN1);
    addEEnumLiteral(roomEEnum, Room.VAUBAN2);
    addEEnumLiteral(roomEEnum, Room.LAMANNAIS1);
    addEEnumLiteral(roomEEnum, Room.LAMENNAIS2);
    addEEnumLiteral(roomEEnum, Room.LAMENNAIS3);
    addEEnumLiteral(roomEEnum, Room.ROTONDE_SURCOUF);
    addEEnumLiteral(roomEEnum, Room.CHATEAUBRIAND);
    addEEnumLiteral(roomEEnum, Room.LAMENNAIS12);
    addEEnumLiteral(roomEEnum, Room.LAMENNAIS45);
    addEEnumLiteral(roomEEnum, Room.GRAND_LARGE);
    addEEnumLiteral(roomEEnum, Room.ROTONDE_JCARTIER);

    initEEnum(weekDayEEnum, WeekDay.class, "WeekDay");
    addEEnumLiteral(weekDayEEnum, WeekDay.MONDAY);
    addEEnumLiteral(weekDayEEnum, WeekDay.TUESDAY);
    addEEnumLiteral(weekDayEEnum, WeekDay.WEDNESDAY);
    addEEnumLiteral(weekDayEEnum, WeekDay.THURSDAY);
    addEEnumLiteral(weekDayEEnum, WeekDay.FRIDAY);
    addEEnumLiteral(weekDayEEnum, WeekDay.SATURDAY);
    addEEnumLiteral(weekDayEEnum, WeekDay.SUNDAY);

    // Create resource
    createResource(eNS_URI);
  }

} //ProgramPackageImpl
