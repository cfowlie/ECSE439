/**
 * generated by Xtext 2.14.0
 */
package org.xtext.bankSystem.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.bankSystem.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BankSystemFactoryImpl extends EFactoryImpl implements BankSystemFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BankSystemFactory init()
  {
    try
    {
      BankSystemFactory theBankSystemFactory = (BankSystemFactory)EPackage.Registry.INSTANCE.getEFactory(BankSystemPackage.eNS_URI);
      if (theBankSystemFactory != null)
      {
        return theBankSystemFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BankSystemFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BankSystemFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BankSystemPackage.BANK_SYSTEM: return createBankSystem();
      case BankSystemPackage.BANK: return createBank();
      case BankSystemPackage.USER: return createUser();
      case BankSystemPackage.BRANCH: return createBranch();
      case BankSystemPackage.EMPLOYEE: return createEmployee();
      case BankSystemPackage.ACCOUNT: return createAccount();
      case BankSystemPackage.TRANSACTION: return createTransaction();
      case BankSystemPackage.DATE: return createDate();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BankSystem createBankSystem()
  {
    BankSystemImpl bankSystem = new BankSystemImpl();
    return bankSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bank createBank()
  {
    BankImpl bank = new BankImpl();
    return bank;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public User createUser()
  {
    UserImpl user = new UserImpl();
    return user;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Branch createBranch()
  {
    BranchImpl branch = new BranchImpl();
    return branch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Employee createEmployee()
  {
    EmployeeImpl employee = new EmployeeImpl();
    return employee;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Account createAccount()
  {
    AccountImpl account = new AccountImpl();
    return account;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transaction createTransaction()
  {
    TransactionImpl transaction = new TransactionImpl();
    return transaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Date createDate()
  {
    DateImpl date = new DateImpl();
    return date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BankSystemPackage getBankSystemPackage()
  {
    return (BankSystemPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BankSystemPackage getPackage()
  {
    return BankSystemPackage.eINSTANCE;
  }

} //BankSystemFactoryImpl
