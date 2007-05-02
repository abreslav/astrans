/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package assignast;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEnum Literal Designator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link assignast.EEnumLiteralDesignator#getPackage <em>Package</em>}</li>
 *   <li>{@link assignast.EEnumLiteralDesignator#getEnum <em>Enum</em>}</li>
 *   <li>{@link assignast.EEnumLiteralDesignator#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see assignast.AssignastPackage#getEEnumLiteralDesignator()
 * @model
 * @generated
 */
public interface EEnumLiteralDesignator extends EObject {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' attribute.
	 * @see #setPackage(String)
	 * @see assignast.AssignastPackage#getEEnumLiteralDesignator_Package()
	 * @model required="true"
	 * @generated
	 */
	String getPackage();

	/**
	 * Sets the value of the '{@link assignast.EEnumLiteralDesignator#getPackage <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' attribute.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(String value);

	/**
	 * Returns the value of the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' attribute.
	 * @see #setEnum(String)
	 * @see assignast.AssignastPackage#getEEnumLiteralDesignator_Enum()
	 * @model required="true"
	 * @generated
	 */
	String getEnum();

	/**
	 * Sets the value of the '{@link assignast.EEnumLiteralDesignator#getEnum <em>Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum</em>' attribute.
	 * @see #getEnum()
	 * @generated
	 */
	void setEnum(String value);

	/**
	 * Returns the value of the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' attribute.
	 * @see #setLiteral(String)
	 * @see assignast.AssignastPackage#getEEnumLiteralDesignator_Literal()
	 * @model required="true"
	 * @generated
	 */
	String getLiteral();

	/**
	 * Sets the value of the '{@link assignast.EEnumLiteralDesignator#getLiteral <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' attribute.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(String value);

} // EEnumLiteralDesignator