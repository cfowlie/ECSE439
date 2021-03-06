/**
 * generated by Xtext 2.14.0
 */
package org.xtext.validation;

import org.eclipse.xtext.validation.Check;
import org.xtext.bankSystem.Account;
import org.xtext.bankSystem.BankSystemPackage;
import org.xtext.validation.AbstractBankSystemValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class BankSystemValidator extends AbstractBankSystemValidator {
  public final static String WRONG_ACCOUNT_ATTRIBUTE = "wrongAccountAttibute";
  
  @Check
  public void checkAccountTypeAttribute(final Account account) {
    if ((account.getAccountType().equals("Savings Account") && (account.getIntRate() == 0))) {
      this.warning("A savings account should have an interest rate", BankSystemPackage.Literals.ACCOUNT__INT_RATE, BankSystemValidator.WRONG_ACCOUNT_ATTRIBUTE);
    }
    if ((account.getAccountType().equals("Mortgage Account") && (account.getLoanPeriod().length() < 1))) {
      this.warning("A mortgage account should have a loan period", BankSystemPackage.Literals.ACCOUNT__LOAN_PERIOD, BankSystemValidator.WRONG_ACCOUNT_ATTRIBUTE);
    }
    if ((account.getAccountType().equals("Checking Account") && (account.getDebPerMonth() == 0))) {
      this.warning("A checking account should have a debit per month attribute", BankSystemPackage.Literals.ACCOUNT__DEB_PER_MONTH, BankSystemValidator.WRONG_ACCOUNT_ATTRIBUTE);
    }
  }
}
