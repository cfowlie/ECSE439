/*
 * generated by Xtext 2.14.0
 */
package org.xtext.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.ide.contentassist.antlr.internal.InternalBankSystemParser;
import org.xtext.services.BankSystemGrammarAccess;

public class BankSystemParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(BankSystemGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, BankSystemGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEmployeeRoleAccess().getAlternatives(), "rule__EmployeeRole__Alternatives");
			builder.put(grammarAccess.getAccountTypeAccess().getAlternatives(), "rule__AccountType__Alternatives");
			builder.put(grammarAccess.getBooleanAccess().getAlternatives(), "rule__Boolean__Alternatives");
			builder.put(grammarAccess.getBankSystemAccess().getGroup(), "rule__BankSystem__Group__0");
			builder.put(grammarAccess.getBankAccess().getGroup(), "rule__Bank__Group__0");
			builder.put(grammarAccess.getUserAccess().getGroup(), "rule__User__Group__0");
			builder.put(grammarAccess.getBranchAccess().getGroup(), "rule__Branch__Group__0");
			builder.put(grammarAccess.getEmployeeAccess().getGroup(), "rule__Employee__Group__0");
			builder.put(grammarAccess.getAccountAccess().getGroup(), "rule__Account__Group__0");
			builder.put(grammarAccess.getAccountAccess().getGroup_12(), "rule__Account__Group_12__0");
			builder.put(grammarAccess.getAccountAccess().getGroup_13(), "rule__Account__Group_13__0");
			builder.put(grammarAccess.getAccountAccess().getGroup_14(), "rule__Account__Group_14__0");
			builder.put(grammarAccess.getTransactionAccess().getGroup(), "rule__Transaction__Group__0");
			builder.put(grammarAccess.getDateAccess().getGroup(), "rule__Date__Group__0");
			builder.put(grammarAccess.getBankSystemAccess().getBanksAssignment_0(), "rule__BankSystem__BanksAssignment_0");
			builder.put(grammarAccess.getBankSystemAccess().getUsersAssignment_1(), "rule__BankSystem__UsersAssignment_1");
			builder.put(grammarAccess.getBankAccess().getNameAssignment_1(), "rule__Bank__NameAssignment_1");
			builder.put(grammarAccess.getBankAccess().getCountryOfOriginAssignment_4(), "rule__Bank__CountryOfOriginAssignment_4");
			builder.put(grammarAccess.getBankAccess().getBranchesAssignment_5(), "rule__Bank__BranchesAssignment_5");
			builder.put(grammarAccess.getBankAccess().getAccountsAssignment_6(), "rule__Bank__AccountsAssignment_6");
			builder.put(grammarAccess.getBankAccess().getTransactionsAssignment_7(), "rule__Bank__TransactionsAssignment_7");
			builder.put(grammarAccess.getUserAccess().getNameAssignment_3(), "rule__User__NameAssignment_3");
			builder.put(grammarAccess.getUserAccess().getEmailAssignment_5(), "rule__User__EmailAssignment_5");
			builder.put(grammarAccess.getUserAccess().getHashpassAssignment_7(), "rule__User__HashpassAssignment_7");
			builder.put(grammarAccess.getUserAccess().getAddressAssignment_9(), "rule__User__AddressAssignment_9");
			builder.put(grammarAccess.getBranchAccess().getAddressAssignment_2(), "rule__Branch__AddressAssignment_2");
			builder.put(grammarAccess.getBranchAccess().getMyboothAssignment_3(), "rule__Branch__MyboothAssignment_3");
			builder.put(grammarAccess.getBranchAccess().getMyVaultAssignment_4(), "rule__Branch__MyVaultAssignment_4");
			builder.put(grammarAccess.getBranchAccess().getEmployeesAssignment_5(), "rule__Branch__EmployeesAssignment_5");
			builder.put(grammarAccess.getEmployeeAccess().getNameAssignment_1(), "rule__Employee__NameAssignment_1");
			builder.put(grammarAccess.getEmployeeAccess().getDateAssignment_4(), "rule__Employee__DateAssignment_4");
			builder.put(grammarAccess.getEmployeeAccess().getSalaryAssignment_6(), "rule__Employee__SalaryAssignment_6");
			builder.put(grammarAccess.getEmployeeAccess().getCurrentRoleAssignment_8(), "rule__Employee__CurrentRoleAssignment_8");
			builder.put(grammarAccess.getAccountAccess().getAccountNumAssignment_1(), "rule__Account__AccountNumAssignment_1");
			builder.put(grammarAccess.getAccountAccess().getHolderAssignment_4(), "rule__Account__HolderAssignment_4");
			builder.put(grammarAccess.getAccountAccess().getBalanceAssignment_6(), "rule__Account__BalanceAssignment_6");
			builder.put(grammarAccess.getAccountAccess().getMfaTypeAssignment_9(), "rule__Account__MfaTypeAssignment_9");
			builder.put(grammarAccess.getAccountAccess().getAccountTypeAssignment_11(), "rule__Account__AccountTypeAssignment_11");
			builder.put(grammarAccess.getAccountAccess().getIntRateAssignment_12_1(), "rule__Account__IntRateAssignment_12_1");
			builder.put(grammarAccess.getAccountAccess().getDepPerMonthAssignment_13_1(), "rule__Account__DepPerMonthAssignment_13_1");
			builder.put(grammarAccess.getAccountAccess().getLoanPeriodAssignment_14_1(), "rule__Account__LoanPeriodAssignment_14_1");
			builder.put(grammarAccess.getTransactionAccess().getAccountAssignment_2(), "rule__Transaction__AccountAssignment_2");
			builder.put(grammarAccess.getTransactionAccess().getAmountAssignment_4(), "rule__Transaction__AmountAssignment_4");
			builder.put(grammarAccess.getTransactionAccess().getDateAssignment_6(), "rule__Transaction__DateAssignment_6");
			builder.put(grammarAccess.getTransactionAccess().getDebitAssignment_8(), "rule__Transaction__DebitAssignment_8");
			builder.put(grammarAccess.getTransactionAccess().getVendorNameAssignment_10(), "rule__Transaction__VendorNameAssignment_10");
			builder.put(grammarAccess.getDateAccess().getYearAssignment_0(), "rule__Date__YearAssignment_0");
			builder.put(grammarAccess.getDateAccess().getMonthAssignment_2(), "rule__Date__MonthAssignment_2");
			builder.put(grammarAccess.getDateAccess().getDayAssignment_4(), "rule__Date__DayAssignment_4");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private BankSystemGrammarAccess grammarAccess;

	@Override
	protected InternalBankSystemParser createParser() {
		InternalBankSystemParser result = new InternalBankSystemParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public BankSystemGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(BankSystemGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
