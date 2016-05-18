/**
 */
package models2016;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Track</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see models2016.Models2016Package#getTrack()
 * @model
 * @generated
 */
public enum Track implements Enumerator {
	/**
	 * The '<em><b>Practice And Innovation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRACTICE_AND_INNOVATION_VALUE
	 * @generated
	 * @ordered
	 */
	PRACTICE_AND_INNOVATION(0, "PracticeAndInnovation", "PracticeAndInnovation"),

	/**
	 * The '<em><b>Research</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESEARCH_VALUE
	 * @generated
	 * @ordered
	 */
	RESEARCH(1, "Research", "RESEARCH");

	/**
	 * The '<em><b>Practice And Innovation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Practice And Innovation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRACTICE_AND_INNOVATION
	 * @model name="PracticeAndInnovation"
	 * @generated
	 * @ordered
	 */
	public static final int PRACTICE_AND_INNOVATION_VALUE = 0;

	/**
	 * The '<em><b>Research</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Research</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESEARCH
	 * @model name="Research" literal="RESEARCH"
	 * @generated
	 * @ordered
	 */
	public static final int RESEARCH_VALUE = 1;

	/**
	 * An array of all the '<em><b>Track</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Track[] VALUES_ARRAY =
		new Track[] {
			PRACTICE_AND_INNOVATION,
			RESEARCH,
		};

	/**
	 * A public read-only list of all the '<em><b>Track</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Track> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Track</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Track get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Track result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Track</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Track getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Track result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Track</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Track get(int value) {
		switch (value) {
			case PRACTICE_AND_INNOVATION_VALUE: return PRACTICE_AND_INNOVATION;
			case RESEARCH_VALUE: return RESEARCH;
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
	private Track(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Track
