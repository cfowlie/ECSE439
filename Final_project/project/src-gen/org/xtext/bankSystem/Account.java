/**
 * generated by Xtext 2.14.0
 */
package org.xtext.bankSystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.bankSystem.Account#getHolder <em>Holder</em>}</li>
 *   <li>{@link org.xtext.bankSystem.Account#getBalance <em>Balance</em>}</li>
 *   <li>{@link org.xtext.bankSystem.Account#getAccountNum <em>Account Num</em>}</li>
 *   <li>{@link org.xtext.bankSystem.Account#getMfaType <em>Mfa Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.bankSystem.BankSystemPackage#getAccount()
 * @model
 * @generated
 */
public interface Account extends EObject
{
  /**
   * Returns the value of the '<em><b>Holder</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Holder</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Holder</em>' containment reference.
   * @see #setHolder(User)
   * @see org.xtext.bankSystem.BankSystemPackage#getAccount_Holder()
   * @model containment="true"
   * @generated
   */
  User getHolder();

  /**
   * Sets the value of the '{@link org.xtext.bankSystem.Account#getHolder <em>Holder</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Holder</em>' containment reference.
   * @see #getHolder()
   * @generated
   */
  void setHolder(User value);

  /**
   * Returns the value of the '<em><b>Balance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Balance</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Balance</em>' attribute.
   * @see #setBalance(int)
   * @see org.xtext.bankSystem.BankSystemPackage#getAccount_Balance()
   * @model
   * @generated
   */
  int getBalance();

  /**
   * Sets the value of the '{@link org.xtext.bankSystem.Account#getBalance <em>Balance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Balance</em>' attribute.
   * @see #getBalance()
   * @generated
   */
  void setBalance(int value);

  /**
   * Returns the value of the '<em><b>Account Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Account Num</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Account Num</em>' attribute.
   * @see #setAccountNum(String)
   * @see org.xtext.bankSystem.BankSystemPackage#getAccount_AccountNum()
   * @model
   * @generated
   */
  String getAccountNum();

  /**
   * Sets the value of the '{@link org.xtext.bankSystem.Account#getAccountNum <em>Account Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Account Num</em>' attribute.
   * @see #getAccountNum()
   * @generated
   */
  void setAccountNum(String value);

  /**
   * Returns the value of the '<em><b>Mfa Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mfa Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mfa Type</em>' attribute.
   * @see #setMfaType(String)
   * @see org.xtext.bankSystem.BankSystemPackage#getAccount_MfaType()
   * @model
   * @generated
   */
  String getMfaType();

  /**
   * Sets the value of the '{@link org.xtext.bankSystem.Account#getMfaType <em>Mfa Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mfa Type</em>' attribute.
   * @see #getMfaType()
   * @generated
   */
  void setMfaType(String value);

} // Account