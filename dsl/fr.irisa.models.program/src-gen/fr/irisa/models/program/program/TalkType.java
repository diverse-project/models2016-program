/**
 */
package fr.irisa.models.program.program;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Talk Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.irisa.models.program.program.ProgramPackage#getTalkType()
 * @model
 * @generated
 */
public enum TalkType implements Enumerator
{
  /**
   * The '<em><b>Workshop</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WORKSHOP_VALUE
   * @generated
   * @ordered
   */
  WORKSHOP(0, "Workshop", "Workshop"),

  /**
   * The '<em><b>Tutorial</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TUTORIAL_VALUE
   * @generated
   * @ordered
   */
  TUTORIAL(1, "Tutorial", "Tutorial"),

  /**
   * The '<em><b>Symposium</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SYMPOSIUM_VALUE
   * @generated
   * @ordered
   */
  SYMPOSIUM(2, "Symposium", "Symposium"),

  /**
   * The '<em><b>Clinic</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CLINIC_VALUE
   * @generated
   * @ordered
   */
  CLINIC(3, "Clinic", "Clinic"),

  /**
   * The '<em><b>Break</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BREAK_VALUE
   * @generated
   * @ordered
   */
  BREAK(4, "Break", "Break"),

  /**
   * The '<em><b>Lunch</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LUNCH_VALUE
   * @generated
   * @ordered
   */
  LUNCH(5, "Lunch", "Lunch"),

  /**
   * The '<em><b>Poster</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #POSTER_VALUE
   * @generated
   * @ordered
   */
  POSTER(6, "Poster", "Poster"),

  /**
   * The '<em><b>SRC</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SRC_VALUE
   * @generated
   * @ordered
   */
  SRC(7, "SRC", "SRC"),

  /**
   * The '<em><b>Main</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MAIN_VALUE
   * @generated
   * @ordered
   */
  MAIN(8, "Main", "Main");

  /**
   * The '<em><b>Workshop</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Workshop</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WORKSHOP
   * @model name="Workshop"
   * @generated
   * @ordered
   */
  public static final int WORKSHOP_VALUE = 0;

  /**
   * The '<em><b>Tutorial</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Tutorial</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TUTORIAL
   * @model name="Tutorial"
   * @generated
   * @ordered
   */
  public static final int TUTORIAL_VALUE = 1;

  /**
   * The '<em><b>Symposium</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Symposium</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SYMPOSIUM
   * @model name="Symposium"
   * @generated
   * @ordered
   */
  public static final int SYMPOSIUM_VALUE = 2;

  /**
   * The '<em><b>Clinic</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Clinic</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CLINIC
   * @model name="Clinic"
   * @generated
   * @ordered
   */
  public static final int CLINIC_VALUE = 3;

  /**
   * The '<em><b>Break</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Break</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BREAK
   * @model name="Break"
   * @generated
   * @ordered
   */
  public static final int BREAK_VALUE = 4;

  /**
   * The '<em><b>Lunch</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Lunch</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LUNCH
   * @model name="Lunch"
   * @generated
   * @ordered
   */
  public static final int LUNCH_VALUE = 5;

  /**
   * The '<em><b>Poster</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Poster</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #POSTER
   * @model name="Poster"
   * @generated
   * @ordered
   */
  public static final int POSTER_VALUE = 6;

  /**
   * The '<em><b>SRC</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SRC</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SRC
   * @model
   * @generated
   * @ordered
   */
  public static final int SRC_VALUE = 7;

  /**
   * The '<em><b>Main</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Main</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MAIN
   * @model name="Main"
   * @generated
   * @ordered
   */
  public static final int MAIN_VALUE = 8;

  /**
   * An array of all the '<em><b>Talk Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final TalkType[] VALUES_ARRAY =
    new TalkType[]
    {
      WORKSHOP,
      TUTORIAL,
      SYMPOSIUM,
      CLINIC,
      BREAK,
      LUNCH,
      POSTER,
      SRC,
      MAIN,
    };

  /**
   * A public read-only list of all the '<em><b>Talk Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<TalkType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Talk Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TalkType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TalkType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Talk Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TalkType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TalkType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Talk Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TalkType get(int value)
  {
    switch (value)
    {
      case WORKSHOP_VALUE: return WORKSHOP;
      case TUTORIAL_VALUE: return TUTORIAL;
      case SYMPOSIUM_VALUE: return SYMPOSIUM;
      case CLINIC_VALUE: return CLINIC;
      case BREAK_VALUE: return BREAK;
      case LUNCH_VALUE: return LUNCH;
      case POSTER_VALUE: return POSTER;
      case SRC_VALUE: return SRC;
      case MAIN_VALUE: return MAIN;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private TalkType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //TalkType
