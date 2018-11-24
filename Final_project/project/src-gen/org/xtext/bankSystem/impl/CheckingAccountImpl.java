/**
 * generated by Xtext 2.14.0
 */
package org.xtext.bankSystem.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.bankSystem.BankSystemPackage;
import org.xtext.bankSystem.CheckingAccount;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Checking Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.bankSystem.impl.CheckingAccountImpl#getDepPerMonth <em>Dep Per Month</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CheckingAccountImpl extends AccountImpl implements CheckingAccount
{
  /**
   * The default value of the '{@link #getDepPerMonth() <em>Dep Per Month</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDepPerMonth()
   * @generated
   * @ordered
   */
  protected static final int DEP_PER_MONTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDepPerMonth() <em>Dep Per Month</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDepPerMonth()
   * @generated
   * @ordered
   */
  protected int depPerMonth = DEP_PER_MONTH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CheckingAccountImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BankSystemPackage.Literals.CHECKING_ACCOUNT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDepPerMonth()
  {
    return depPerMonth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDepPerMonth(int newDepPerMonth)
  {
    int oldDepPerMonth = depPerMonth;
    depPerMonth = newDepPerMonth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BankSystemPackage.CHECKING_ACCOUNT__DEP_PER_MONTH, oldDepPerMonth, depPerMonth));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BankSystemPackage.CHECKING_ACCOUNT__DEP_PER_MONTH:
        return getDepPerMonth();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BankSystemPackage.CHECKING_ACCOUNT__DEP_PER_MONTH:
        setDepPerMonth((Integer)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BankSystemPackage.CHECKING_ACCOUNT__DEP_PER_MONTH:
        setDepPerMonth(DEP_PER_MONTH_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BankSystemPackage.CHECKING_ACCOUNT__DEP_PER_MONTH:
        return depPerMonth != DEP_PER_MONTH_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (depPerMonth: ");
    result.append(depPerMonth);
    result.append(')');
    return result.toString();
  }

} //CheckingAccountImpl
