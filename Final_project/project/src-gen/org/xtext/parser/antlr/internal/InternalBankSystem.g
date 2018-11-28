/*
 * generated by Xtext 2.14.0
 */
grammar InternalBankSystem;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.BankSystemGrammarAccess;

}

@parser::members {

 	private BankSystemGrammarAccess grammarAccess;

    public InternalBankSystemParser(TokenStream input, BankSystemGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "BankSystem";
   	}

   	@Override
   	protected BankSystemGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleBankSystem
entryRuleBankSystem returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBankSystemRule()); }
	iv_ruleBankSystem=ruleBankSystem
	{ $current=$iv_ruleBankSystem.current; }
	EOF;

// Rule BankSystem
ruleBankSystem returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getBankSystemAccess().getBanksBankParserRuleCall_0_0());
				}
				lv_banks_0_0=ruleBank
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBankSystemRule());
					}
					add(
						$current,
						"banks",
						lv_banks_0_0,
						"org.xtext.BankSystem.Bank");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getBankSystemAccess().getUsersUserParserRuleCall_1_0());
				}
				lv_users_1_0=ruleUser
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBankSystemRule());
					}
					add(
						$current,
						"users",
						lv_users_1_0,
						"org.xtext.BankSystem.User");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleBank
entryRuleBank returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBankRule()); }
	iv_ruleBank=ruleBank
	{ $current=$iv_ruleBank.current; }
	EOF;

// Rule Bank
ruleBank returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Bank'
		{
			newLeafNode(otherlv_0, grammarAccess.getBankAccess().getBankKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getBankAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='Name'
		{
			newLeafNode(otherlv_2, grammarAccess.getBankAccess().getNameKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_STRING
				{
					newLeafNode(lv_name_3_0, grammarAccess.getBankAccess().getNameSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBankRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_4='Country'
		{
			newLeafNode(otherlv_4, grammarAccess.getBankAccess().getCountryKeyword_4());
		}
		(
			(
				lv_countryOfOrigin_5_0=RULE_STRING
				{
					newLeafNode(lv_countryOfOrigin_5_0, grammarAccess.getBankAccess().getCountryOfOriginSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBankRule());
					}
					setWithLastConsumed(
						$current,
						"countryOfOrigin",
						lv_countryOfOrigin_5_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getBankAccess().getBranchesBranchParserRuleCall_6_0());
				}
				lv_branches_6_0=ruleBranch
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBankRule());
					}
					add(
						$current,
						"branches",
						lv_branches_6_0,
						"org.xtext.BankSystem.Branch");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getBankAccess().getAccountsAccountParserRuleCall_7_0());
				}
				lv_accounts_7_0=ruleAccount
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBankRule());
					}
					add(
						$current,
						"accounts",
						lv_accounts_7_0,
						"org.xtext.BankSystem.Account");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getBankAccess().getTransactionsTransactionParserRuleCall_8_0());
				}
				lv_transactions_8_0=ruleTransaction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBankRule());
					}
					add(
						$current,
						"transactions",
						lv_transactions_8_0,
						"org.xtext.BankSystem.Transaction");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getBankAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleUser
entryRuleUser returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUserRule()); }
	iv_ruleUser=ruleUser
	{ $current=$iv_ruleUser.current; }
	EOF;

// Rule User
ruleUser returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='User'
		{
			newLeafNode(otherlv_0, grammarAccess.getUserAccess().getUserKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='Name'
		{
			newLeafNode(otherlv_2, grammarAccess.getUserAccess().getNameKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_STRING
				{
					newLeafNode(lv_name_3_0, grammarAccess.getUserAccess().getNameSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUserRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_4='Email'
		{
			newLeafNode(otherlv_4, grammarAccess.getUserAccess().getEmailKeyword_4());
		}
		(
			(
				lv_email_5_0=RULE_STRING
				{
					newLeafNode(lv_email_5_0, grammarAccess.getUserAccess().getEmailSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUserRule());
					}
					setWithLastConsumed(
						$current,
						"email",
						lv_email_5_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_6='HashPass'
		{
			newLeafNode(otherlv_6, grammarAccess.getUserAccess().getHashPassKeyword_6());
		}
		(
			(
				lv_hashpass_7_0=RULE_STRING
				{
					newLeafNode(lv_hashpass_7_0, grammarAccess.getUserAccess().getHashpassSTRINGTerminalRuleCall_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUserRule());
					}
					setWithLastConsumed(
						$current,
						"hashpass",
						lv_hashpass_7_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_8='Address'
		{
			newLeafNode(otherlv_8, grammarAccess.getUserAccess().getAddressKeyword_8());
		}
		(
			(
				lv_address_9_0=RULE_STRING
				{
					newLeafNode(lv_address_9_0, grammarAccess.getUserAccess().getAddressSTRINGTerminalRuleCall_9_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUserRule());
					}
					setWithLastConsumed(
						$current,
						"address",
						lv_address_9_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getUserAccess().getRightCurlyBracketKeyword_10());
		}
	)
;

// Entry rule entryRuleBranch
entryRuleBranch returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBranchRule()); }
	iv_ruleBranch=ruleBranch
	{ $current=$iv_ruleBranch.current; }
	EOF;

// Rule Branch
ruleBranch returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Branch{'
		{
			newLeafNode(otherlv_0, grammarAccess.getBranchAccess().getBranchKeyword_0());
		}
		otherlv_1='Address'
		{
			newLeafNode(otherlv_1, grammarAccess.getBranchAccess().getAddressKeyword_1());
		}
		(
			(
				lv_address_2_0=RULE_STRING
				{
					newLeafNode(lv_address_2_0, grammarAccess.getBranchAccess().getAddressSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBranchRule());
					}
					setWithLastConsumed(
						$current,
						"address",
						lv_address_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getBranchAccess().getMyboothBoothParserRuleCall_3_0());
				}
				lv_mybooth_3_0=ruleBooth
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBranchRule());
					}
					set(
						$current,
						"mybooth",
						lv_mybooth_3_0,
						"org.xtext.BankSystem.Booth");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getBranchAccess().getMyVaultVaultParserRuleCall_4_0());
				}
				lv_myVault_4_0=ruleVault
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBranchRule());
					}
					set(
						$current,
						"myVault",
						lv_myVault_4_0,
						"org.xtext.BankSystem.Vault");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getBranchAccess().getEmployeesEmployeeParserRuleCall_5_0());
				}
				lv_employees_5_0=ruleEmployee
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBranchRule());
					}
					add(
						$current,
						"employees",
						lv_employees_5_0,
						"org.xtext.BankSystem.Employee");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getBranchAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleBooth
entryRuleBooth returns [String current=null]:
	{ newCompositeNode(grammarAccess.getBoothRule()); }
	iv_ruleBooth=ruleBooth
	{ $current=$iv_ruleBooth.current.getText(); }
	EOF;

// Rule Booth
ruleBooth returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='Booth'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getBoothAccess().getBoothKeyword());
	}
;

// Entry rule entryRuleVault
entryRuleVault returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVaultRule()); }
	iv_ruleVault=ruleVault
	{ $current=$iv_ruleVault.current.getText(); }
	EOF;

// Rule Vault
ruleVault returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='Vault'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getVaultAccess().getVaultKeyword());
	}
;

// Entry rule entryRuleEmployee
entryRuleEmployee returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEmployeeRule()); }
	iv_ruleEmployee=ruleEmployee
	{ $current=$iv_ruleEmployee.current; }
	EOF;

// Rule Employee
ruleEmployee returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Employee'
		{
			newLeafNode(otherlv_0, grammarAccess.getEmployeeAccess().getEmployeeKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getEmployeeAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='Name'
		{
			newLeafNode(otherlv_2, grammarAccess.getEmployeeAccess().getNameKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_STRING
				{
					newLeafNode(lv_name_3_0, grammarAccess.getEmployeeAccess().getNameSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEmployeeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_4='Hiring date'
		{
			newLeafNode(otherlv_4, grammarAccess.getEmployeeAccess().getHiringDateKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEmployeeAccess().getDateDateParserRuleCall_5_0());
				}
				lv_date_5_0=ruleDate
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEmployeeRule());
					}
					set(
						$current,
						"date",
						lv_date_5_0,
						"org.xtext.BankSystem.Date");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='Salary'
		{
			newLeafNode(otherlv_6, grammarAccess.getEmployeeAccess().getSalaryKeyword_6());
		}
		(
			(
				lv_salary_7_0=RULE_INT
				{
					newLeafNode(lv_salary_7_0, grammarAccess.getEmployeeAccess().getSalaryINTTerminalRuleCall_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEmployeeRule());
					}
					setWithLastConsumed(
						$current,
						"salary",
						lv_salary_7_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_8='Current Role'
		{
			newLeafNode(otherlv_8, grammarAccess.getEmployeeAccess().getCurrentRoleKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEmployeeAccess().getCurrentRoleEmployeeRoleParserRuleCall_9_0());
				}
				lv_currentRole_9_0=ruleEmployeeRole
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEmployeeRule());
					}
					set(
						$current,
						"currentRole",
						lv_currentRole_9_0,
						"org.xtext.BankSystem.EmployeeRole");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getEmployeeAccess().getRightCurlyBracketKeyword_10());
		}
	)
;

// Entry rule entryRuleEmployeeRole
entryRuleEmployeeRole returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEmployeeRoleRule()); }
	iv_ruleEmployeeRole=ruleEmployeeRole
	{ $current=$iv_ruleEmployeeRole.current.getText(); }
	EOF;

// Rule EmployeeRole
ruleEmployeeRole returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getEmployeeRoleAccess().getTellerParserRuleCall_0());
		}
		this_Teller_0=ruleTeller
		{
			$current.merge(this_Teller_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getEmployeeRoleAccess().getManagerParserRuleCall_1());
		}
		this_Manager_1=ruleManager
		{
			$current.merge(this_Manager_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTeller
entryRuleTeller returns [String current=null]:
	{ newCompositeNode(grammarAccess.getTellerRule()); }
	iv_ruleTeller=ruleTeller
	{ $current=$iv_ruleTeller.current.getText(); }
	EOF;

// Rule Teller
ruleTeller returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='Teller'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getTellerAccess().getTellerKeyword());
	}
;

// Entry rule entryRuleManager
entryRuleManager returns [String current=null]:
	{ newCompositeNode(grammarAccess.getManagerRule()); }
	iv_ruleManager=ruleManager
	{ $current=$iv_ruleManager.current.getText(); }
	EOF;

// Rule Manager
ruleManager returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='Manager'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getManagerAccess().getManagerKeyword());
	}
;

// Entry rule entryRuleAccount
entryRuleAccount returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAccountRule()); }
	iv_ruleAccount=ruleAccount
	{ $current=$iv_ruleAccount.current; }
	EOF;

// Rule Account
ruleAccount returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='account'
		{
			newLeafNode(otherlv_0, grammarAccess.getAccountAccess().getAccountKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getAccountAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='Account number'
		{
			newLeafNode(otherlv_2, grammarAccess.getAccountAccess().getAccountNumberKeyword_2());
		}
		(
			(
				lv_accountNum_3_0=RULE_STRING
				{
					newLeafNode(lv_accountNum_3_0, grammarAccess.getAccountAccess().getAccountNumSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAccountRule());
					}
					setWithLastConsumed(
						$current,
						"accountNum",
						lv_accountNum_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_4='Holder'
		{
			newLeafNode(otherlv_4, grammarAccess.getAccountAccess().getHolderKeyword_4());
		}
		(
			(
				lv_holder_5_0=RULE_STRING
				{
					newLeafNode(lv_holder_5_0, grammarAccess.getAccountAccess().getHolderSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAccountRule());
					}
					setWithLastConsumed(
						$current,
						"holder",
						lv_holder_5_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_6='Balance'
		{
			newLeafNode(otherlv_6, grammarAccess.getAccountAccess().getBalanceKeyword_6());
		}
		(
			(
				lv_balance_7_0=RULE_INT
				{
					newLeafNode(lv_balance_7_0, grammarAccess.getAccountAccess().getBalanceINTTerminalRuleCall_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAccountRule());
					}
					setWithLastConsumed(
						$current,
						"balance",
						lv_balance_7_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_8='MFA Type'
		{
			newLeafNode(otherlv_8, grammarAccess.getAccountAccess().getMFATypeKeyword_8());
		}
		(
			(
				lv_mfaType_9_0=RULE_STRING
				{
					newLeafNode(lv_mfaType_9_0, grammarAccess.getAccountAccess().getMfaTypeSTRINGTerminalRuleCall_9_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAccountRule());
					}
					setWithLastConsumed(
						$current,
						"mfaType",
						lv_mfaType_9_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_10='Type'
		{
			newLeafNode(otherlv_10, grammarAccess.getAccountAccess().getTypeKeyword_10());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAccountAccess().getAccountTypeAccountTypeParserRuleCall_11_0());
				}
				lv_accountType_11_0=ruleAccountType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAccountRule());
					}
					set(
						$current,
						"accountType",
						lv_accountType_11_0,
						"org.xtext.BankSystem.AccountType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_12='Interest rate'
			{
				newLeafNode(otherlv_12, grammarAccess.getAccountAccess().getInterestRateKeyword_12_0());
			}
			(
				(
					lv_intRate_13_0=RULE_INT
					{
						newLeafNode(lv_intRate_13_0, grammarAccess.getAccountAccess().getIntRateINTTerminalRuleCall_12_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAccountRule());
						}
						setWithLastConsumed(
							$current,
							"intRate",
							lv_intRate_13_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)?
		(
			otherlv_14='Debits per month'
			{
				newLeafNode(otherlv_14, grammarAccess.getAccountAccess().getDebitsPerMonthKeyword_13_0());
			}
			(
				(
					lv_debPerMonth_15_0=RULE_INT
					{
						newLeafNode(lv_debPerMonth_15_0, grammarAccess.getAccountAccess().getDebPerMonthINTTerminalRuleCall_13_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAccountRule());
						}
						setWithLastConsumed(
							$current,
							"debPerMonth",
							lv_debPerMonth_15_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)?
		(
			otherlv_16='Loan period'
			{
				newLeafNode(otherlv_16, grammarAccess.getAccountAccess().getLoanPeriodKeyword_14_0());
			}
			(
				(
					lv_loanPeriod_17_0=RULE_STRING
					{
						newLeafNode(lv_loanPeriod_17_0, grammarAccess.getAccountAccess().getLoanPeriodSTRINGTerminalRuleCall_14_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAccountRule());
						}
						setWithLastConsumed(
							$current,
							"loanPeriod",
							lv_loanPeriod_17_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getAccountAccess().getRightCurlyBracketKeyword_15());
		}
	)
;

// Entry rule entryRuleAccountType
entryRuleAccountType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getAccountTypeRule()); }
	iv_ruleAccountType=ruleAccountType
	{ $current=$iv_ruleAccountType.current.getText(); }
	EOF;

// Rule AccountType
ruleAccountType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAccountTypeAccess().getSavingsAccountParserRuleCall_0());
		}
		this_SavingsAccount_0=ruleSavingsAccount
		{
			$current.merge(this_SavingsAccount_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAccountTypeAccess().getCheckingAccountParserRuleCall_1());
		}
		this_CheckingAccount_1=ruleCheckingAccount
		{
			$current.merge(this_CheckingAccount_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAccountTypeAccess().getMortgageAccountParserRuleCall_2());
		}
		this_MortgageAccount_2=ruleMortgageAccount
		{
			$current.merge(this_MortgageAccount_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleSavingsAccount
entryRuleSavingsAccount returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSavingsAccountRule()); }
	iv_ruleSavingsAccount=ruleSavingsAccount
	{ $current=$iv_ruleSavingsAccount.current.getText(); }
	EOF;

// Rule SavingsAccount
ruleSavingsAccount returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='Savings Account'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getSavingsAccountAccess().getSavingsAccountKeyword());
	}
;

// Entry rule entryRuleCheckingAccount
entryRuleCheckingAccount returns [String current=null]:
	{ newCompositeNode(grammarAccess.getCheckingAccountRule()); }
	iv_ruleCheckingAccount=ruleCheckingAccount
	{ $current=$iv_ruleCheckingAccount.current.getText(); }
	EOF;

// Rule CheckingAccount
ruleCheckingAccount returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='Checking Account'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getCheckingAccountAccess().getCheckingAccountKeyword());
	}
;

// Entry rule entryRuleMortgageAccount
entryRuleMortgageAccount returns [String current=null]:
	{ newCompositeNode(grammarAccess.getMortgageAccountRule()); }
	iv_ruleMortgageAccount=ruleMortgageAccount
	{ $current=$iv_ruleMortgageAccount.current.getText(); }
	EOF;

// Rule MortgageAccount
ruleMortgageAccount returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	kw='Mortgage Account'
	{
		$current.merge(kw);
		newLeafNode(kw, grammarAccess.getMortgageAccountAccess().getMortgageAccountKeyword());
	}
;

// Entry rule entryRuleTransaction
entryRuleTransaction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransactionRule()); }
	iv_ruleTransaction=ruleTransaction
	{ $current=$iv_ruleTransaction.current; }
	EOF;

// Rule Transaction
ruleTransaction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='transaction {'
		{
			newLeafNode(otherlv_0, grammarAccess.getTransactionAccess().getTransactionKeyword_0());
		}
		otherlv_1='Related account'
		{
			newLeafNode(otherlv_1, grammarAccess.getTransactionAccess().getRelatedAccountKeyword_1());
		}
		(
			(
				lv_account_2_0=RULE_STRING
				{
					newLeafNode(lv_account_2_0, grammarAccess.getTransactionAccess().getAccountSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransactionRule());
					}
					setWithLastConsumed(
						$current,
						"account",
						lv_account_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='Amount'
		{
			newLeafNode(otherlv_3, grammarAccess.getTransactionAccess().getAmountKeyword_3());
		}
		(
			(
				lv_amount_4_0=RULE_INT
				{
					newLeafNode(lv_amount_4_0, grammarAccess.getTransactionAccess().getAmountINTTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransactionRule());
					}
					setWithLastConsumed(
						$current,
						"amount",
						lv_amount_4_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_5='Date'
		{
			newLeafNode(otherlv_5, grammarAccess.getTransactionAccess().getDateKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTransactionAccess().getDateDateParserRuleCall_6_0());
				}
				lv_date_6_0=ruleDate
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTransactionRule());
					}
					set(
						$current,
						"date",
						lv_date_6_0,
						"org.xtext.BankSystem.Date");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='Debit'
		{
			newLeafNode(otherlv_7, grammarAccess.getTransactionAccess().getDebitKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTransactionAccess().getDebitBooleanParserRuleCall_8_0());
				}
				lv_debit_8_0=ruleBoolean
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTransactionRule());
					}
					set(
						$current,
						"debit",
						lv_debit_8_0,
						"org.xtext.BankSystem.Boolean");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='Vendor name'
		{
			newLeafNode(otherlv_9, grammarAccess.getTransactionAccess().getVendorNameKeyword_9());
		}
		(
			(
				lv_vendorName_10_0=RULE_STRING
				{
					newLeafNode(lv_vendorName_10_0, grammarAccess.getTransactionAccess().getVendorNameSTRINGTerminalRuleCall_10_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransactionRule());
					}
					setWithLastConsumed(
						$current,
						"vendorName",
						lv_vendorName_10_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getTransactionAccess().getRightCurlyBracketKeyword_11());
		}
	)
;

// Entry rule entryRuleBoolean
entryRuleBoolean returns [String current=null]:
	{ newCompositeNode(grammarAccess.getBooleanRule()); }
	iv_ruleBoolean=ruleBoolean
	{ $current=$iv_ruleBoolean.current.getText(); }
	EOF;

// Rule Boolean
ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='true'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0());
		}
		    |
		kw='false'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1());
		}
	)
;

// Entry rule entryRuleDate
entryRuleDate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDateRule()); }
	iv_ruleDate=ruleDate
	{ $current=$iv_ruleDate.current; }
	EOF;

// Rule Date
ruleDate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_year_0_0=RULE_INT
				{
					newLeafNode(lv_year_0_0, grammarAccess.getDateAccess().getYearINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDateRule());
					}
					setWithLastConsumed(
						$current,
						"year",
						lv_year_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_1='/'
		{
			newLeafNode(otherlv_1, grammarAccess.getDateAccess().getSolidusKeyword_1());
		}
		(
			(
				lv_month_2_0=RULE_INT
				{
					newLeafNode(lv_month_2_0, grammarAccess.getDateAccess().getMonthINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDateRule());
					}
					setWithLastConsumed(
						$current,
						"month",
						lv_month_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_3='/'
		{
			newLeafNode(otherlv_3, grammarAccess.getDateAccess().getSolidusKeyword_3());
		}
		(
			(
				lv_day_4_0=RULE_INT
				{
					newLeafNode(lv_day_4_0, grammarAccess.getDateAccess().getDayINTTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDateRule());
					}
					setWithLastConsumed(
						$current,
						"day",
						lv_day_4_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
