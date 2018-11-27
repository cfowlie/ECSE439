package org.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.services.BankSystemGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBankSystemParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Booth'", "'Vault'", "'Teller'", "'Manager'", "'true'", "'false'", "'Bank'", "'{'", "'Country'", "'}'", "'User'", "'Name'", "'Email'", "'HashPass'", "'Address'", "'Branch{'", "'Employee'", "'Hiring date'", "'Salary'", "'Current Role'", "'Holder(s)'", "'Balance'", "'Account Number'", "'MFA Type'", "'Savings Account {'", "'Interest rate'", "'Checking Account {'", "'Debits per month'", "'Mortgage Account {'", "'Loan period'", "'transaction {'", "'Account:'", "'Amount:'", "'Date'", "'Debit'", "'Vendor name'", "'/'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalBankSystemParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBankSystemParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBankSystemParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBankSystem.g"; }


    	private BankSystemGrammarAccess grammarAccess;

    	public void setGrammarAccess(BankSystemGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleBankSystem"
    // InternalBankSystem.g:53:1: entryRuleBankSystem : ruleBankSystem EOF ;
    public final void entryRuleBankSystem() throws RecognitionException {
        try {
            // InternalBankSystem.g:54:1: ( ruleBankSystem EOF )
            // InternalBankSystem.g:55:1: ruleBankSystem EOF
            {
             before(grammarAccess.getBankSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleBankSystem();

            state._fsp--;

             after(grammarAccess.getBankSystemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBankSystem"


    // $ANTLR start "ruleBankSystem"
    // InternalBankSystem.g:62:1: ruleBankSystem : ( ( rule__BankSystem__Group__0 ) ) ;
    public final void ruleBankSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:66:2: ( ( ( rule__BankSystem__Group__0 ) ) )
            // InternalBankSystem.g:67:2: ( ( rule__BankSystem__Group__0 ) )
            {
            // InternalBankSystem.g:67:2: ( ( rule__BankSystem__Group__0 ) )
            // InternalBankSystem.g:68:3: ( rule__BankSystem__Group__0 )
            {
             before(grammarAccess.getBankSystemAccess().getGroup()); 
            // InternalBankSystem.g:69:3: ( rule__BankSystem__Group__0 )
            // InternalBankSystem.g:69:4: rule__BankSystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BankSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBankSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBankSystem"


    // $ANTLR start "entryRuleBank"
    // InternalBankSystem.g:78:1: entryRuleBank : ruleBank EOF ;
    public final void entryRuleBank() throws RecognitionException {
        try {
            // InternalBankSystem.g:79:1: ( ruleBank EOF )
            // InternalBankSystem.g:80:1: ruleBank EOF
            {
             before(grammarAccess.getBankRule()); 
            pushFollow(FOLLOW_1);
            ruleBank();

            state._fsp--;

             after(grammarAccess.getBankRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBank"


    // $ANTLR start "ruleBank"
    // InternalBankSystem.g:87:1: ruleBank : ( ( rule__Bank__Group__0 ) ) ;
    public final void ruleBank() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:91:2: ( ( ( rule__Bank__Group__0 ) ) )
            // InternalBankSystem.g:92:2: ( ( rule__Bank__Group__0 ) )
            {
            // InternalBankSystem.g:92:2: ( ( rule__Bank__Group__0 ) )
            // InternalBankSystem.g:93:3: ( rule__Bank__Group__0 )
            {
             before(grammarAccess.getBankAccess().getGroup()); 
            // InternalBankSystem.g:94:3: ( rule__Bank__Group__0 )
            // InternalBankSystem.g:94:4: rule__Bank__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bank__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBankAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBank"


    // $ANTLR start "entryRuleUser"
    // InternalBankSystem.g:103:1: entryRuleUser : ruleUser EOF ;
    public final void entryRuleUser() throws RecognitionException {
        try {
            // InternalBankSystem.g:104:1: ( ruleUser EOF )
            // InternalBankSystem.g:105:1: ruleUser EOF
            {
             before(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_1);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getUserRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // InternalBankSystem.g:112:1: ruleUser : ( ( rule__User__Group__0 ) ) ;
    public final void ruleUser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:116:2: ( ( ( rule__User__Group__0 ) ) )
            // InternalBankSystem.g:117:2: ( ( rule__User__Group__0 ) )
            {
            // InternalBankSystem.g:117:2: ( ( rule__User__Group__0 ) )
            // InternalBankSystem.g:118:3: ( rule__User__Group__0 )
            {
             before(grammarAccess.getUserAccess().getGroup()); 
            // InternalBankSystem.g:119:3: ( rule__User__Group__0 )
            // InternalBankSystem.g:119:4: rule__User__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__User__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleBranch"
    // InternalBankSystem.g:128:1: entryRuleBranch : ruleBranch EOF ;
    public final void entryRuleBranch() throws RecognitionException {
        try {
            // InternalBankSystem.g:129:1: ( ruleBranch EOF )
            // InternalBankSystem.g:130:1: ruleBranch EOF
            {
             before(grammarAccess.getBranchRule()); 
            pushFollow(FOLLOW_1);
            ruleBranch();

            state._fsp--;

             after(grammarAccess.getBranchRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBranch"


    // $ANTLR start "ruleBranch"
    // InternalBankSystem.g:137:1: ruleBranch : ( ( rule__Branch__Group__0 ) ) ;
    public final void ruleBranch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:141:2: ( ( ( rule__Branch__Group__0 ) ) )
            // InternalBankSystem.g:142:2: ( ( rule__Branch__Group__0 ) )
            {
            // InternalBankSystem.g:142:2: ( ( rule__Branch__Group__0 ) )
            // InternalBankSystem.g:143:3: ( rule__Branch__Group__0 )
            {
             before(grammarAccess.getBranchAccess().getGroup()); 
            // InternalBankSystem.g:144:3: ( rule__Branch__Group__0 )
            // InternalBankSystem.g:144:4: rule__Branch__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Branch__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBranchAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBranch"


    // $ANTLR start "entryRuleBooth"
    // InternalBankSystem.g:153:1: entryRuleBooth : ruleBooth EOF ;
    public final void entryRuleBooth() throws RecognitionException {
        try {
            // InternalBankSystem.g:154:1: ( ruleBooth EOF )
            // InternalBankSystem.g:155:1: ruleBooth EOF
            {
             before(grammarAccess.getBoothRule()); 
            pushFollow(FOLLOW_1);
            ruleBooth();

            state._fsp--;

             after(grammarAccess.getBoothRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooth"


    // $ANTLR start "ruleBooth"
    // InternalBankSystem.g:162:1: ruleBooth : ( 'Booth' ) ;
    public final void ruleBooth() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:166:2: ( ( 'Booth' ) )
            // InternalBankSystem.g:167:2: ( 'Booth' )
            {
            // InternalBankSystem.g:167:2: ( 'Booth' )
            // InternalBankSystem.g:168:3: 'Booth'
            {
             before(grammarAccess.getBoothAccess().getBoothKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getBoothAccess().getBoothKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooth"


    // $ANTLR start "entryRuleVault"
    // InternalBankSystem.g:178:1: entryRuleVault : ruleVault EOF ;
    public final void entryRuleVault() throws RecognitionException {
        try {
            // InternalBankSystem.g:179:1: ( ruleVault EOF )
            // InternalBankSystem.g:180:1: ruleVault EOF
            {
             before(grammarAccess.getVaultRule()); 
            pushFollow(FOLLOW_1);
            ruleVault();

            state._fsp--;

             after(grammarAccess.getVaultRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVault"


    // $ANTLR start "ruleVault"
    // InternalBankSystem.g:187:1: ruleVault : ( 'Vault' ) ;
    public final void ruleVault() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:191:2: ( ( 'Vault' ) )
            // InternalBankSystem.g:192:2: ( 'Vault' )
            {
            // InternalBankSystem.g:192:2: ( 'Vault' )
            // InternalBankSystem.g:193:3: 'Vault'
            {
             before(grammarAccess.getVaultAccess().getVaultKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getVaultAccess().getVaultKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVault"


    // $ANTLR start "entryRuleEmployee"
    // InternalBankSystem.g:203:1: entryRuleEmployee : ruleEmployee EOF ;
    public final void entryRuleEmployee() throws RecognitionException {
        try {
            // InternalBankSystem.g:204:1: ( ruleEmployee EOF )
            // InternalBankSystem.g:205:1: ruleEmployee EOF
            {
             before(grammarAccess.getEmployeeRule()); 
            pushFollow(FOLLOW_1);
            ruleEmployee();

            state._fsp--;

             after(grammarAccess.getEmployeeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEmployee"


    // $ANTLR start "ruleEmployee"
    // InternalBankSystem.g:212:1: ruleEmployee : ( ( rule__Employee__Group__0 ) ) ;
    public final void ruleEmployee() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:216:2: ( ( ( rule__Employee__Group__0 ) ) )
            // InternalBankSystem.g:217:2: ( ( rule__Employee__Group__0 ) )
            {
            // InternalBankSystem.g:217:2: ( ( rule__Employee__Group__0 ) )
            // InternalBankSystem.g:218:3: ( rule__Employee__Group__0 )
            {
             before(grammarAccess.getEmployeeAccess().getGroup()); 
            // InternalBankSystem.g:219:3: ( rule__Employee__Group__0 )
            // InternalBankSystem.g:219:4: rule__Employee__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Employee__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmployee"


    // $ANTLR start "entryRuleEmployeeRole"
    // InternalBankSystem.g:228:1: entryRuleEmployeeRole : ruleEmployeeRole EOF ;
    public final void entryRuleEmployeeRole() throws RecognitionException {
        try {
            // InternalBankSystem.g:229:1: ( ruleEmployeeRole EOF )
            // InternalBankSystem.g:230:1: ruleEmployeeRole EOF
            {
             before(grammarAccess.getEmployeeRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleEmployeeRole();

            state._fsp--;

             after(grammarAccess.getEmployeeRoleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEmployeeRole"


    // $ANTLR start "ruleEmployeeRole"
    // InternalBankSystem.g:237:1: ruleEmployeeRole : ( ( rule__EmployeeRole__Alternatives ) ) ;
    public final void ruleEmployeeRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:241:2: ( ( ( rule__EmployeeRole__Alternatives ) ) )
            // InternalBankSystem.g:242:2: ( ( rule__EmployeeRole__Alternatives ) )
            {
            // InternalBankSystem.g:242:2: ( ( rule__EmployeeRole__Alternatives ) )
            // InternalBankSystem.g:243:3: ( rule__EmployeeRole__Alternatives )
            {
             before(grammarAccess.getEmployeeRoleAccess().getAlternatives()); 
            // InternalBankSystem.g:244:3: ( rule__EmployeeRole__Alternatives )
            // InternalBankSystem.g:244:4: rule__EmployeeRole__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EmployeeRole__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeRoleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmployeeRole"


    // $ANTLR start "entryRuleTeller"
    // InternalBankSystem.g:253:1: entryRuleTeller : ruleTeller EOF ;
    public final void entryRuleTeller() throws RecognitionException {
        try {
            // InternalBankSystem.g:254:1: ( ruleTeller EOF )
            // InternalBankSystem.g:255:1: ruleTeller EOF
            {
             before(grammarAccess.getTellerRule()); 
            pushFollow(FOLLOW_1);
            ruleTeller();

            state._fsp--;

             after(grammarAccess.getTellerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTeller"


    // $ANTLR start "ruleTeller"
    // InternalBankSystem.g:262:1: ruleTeller : ( 'Teller' ) ;
    public final void ruleTeller() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:266:2: ( ( 'Teller' ) )
            // InternalBankSystem.g:267:2: ( 'Teller' )
            {
            // InternalBankSystem.g:267:2: ( 'Teller' )
            // InternalBankSystem.g:268:3: 'Teller'
            {
             before(grammarAccess.getTellerAccess().getTellerKeyword()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTellerAccess().getTellerKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTeller"


    // $ANTLR start "entryRuleManager"
    // InternalBankSystem.g:278:1: entryRuleManager : ruleManager EOF ;
    public final void entryRuleManager() throws RecognitionException {
        try {
            // InternalBankSystem.g:279:1: ( ruleManager EOF )
            // InternalBankSystem.g:280:1: ruleManager EOF
            {
             before(grammarAccess.getManagerRule()); 
            pushFollow(FOLLOW_1);
            ruleManager();

            state._fsp--;

             after(grammarAccess.getManagerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleManager"


    // $ANTLR start "ruleManager"
    // InternalBankSystem.g:287:1: ruleManager : ( 'Manager' ) ;
    public final void ruleManager() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:291:2: ( ( 'Manager' ) )
            // InternalBankSystem.g:292:2: ( 'Manager' )
            {
            // InternalBankSystem.g:292:2: ( 'Manager' )
            // InternalBankSystem.g:293:3: 'Manager'
            {
             before(grammarAccess.getManagerAccess().getManagerKeyword()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getManagerAccess().getManagerKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleManager"


    // $ANTLR start "entryRuleAccount"
    // InternalBankSystem.g:303:1: entryRuleAccount : ruleAccount EOF ;
    public final void entryRuleAccount() throws RecognitionException {
        try {
            // InternalBankSystem.g:304:1: ( ruleAccount EOF )
            // InternalBankSystem.g:305:1: ruleAccount EOF
            {
             before(grammarAccess.getAccountRule()); 
            pushFollow(FOLLOW_1);
            ruleAccount();

            state._fsp--;

             after(grammarAccess.getAccountRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAccount"


    // $ANTLR start "ruleAccount"
    // InternalBankSystem.g:312:1: ruleAccount : ( ( rule__Account__Group__0 ) ) ;
    public final void ruleAccount() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:316:2: ( ( ( rule__Account__Group__0 ) ) )
            // InternalBankSystem.g:317:2: ( ( rule__Account__Group__0 ) )
            {
            // InternalBankSystem.g:317:2: ( ( rule__Account__Group__0 ) )
            // InternalBankSystem.g:318:3: ( rule__Account__Group__0 )
            {
             before(grammarAccess.getAccountAccess().getGroup()); 
            // InternalBankSystem.g:319:3: ( rule__Account__Group__0 )
            // InternalBankSystem.g:319:4: rule__Account__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Account__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccountAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccount"


    // $ANTLR start "entryRuleSavingsAccount"
    // InternalBankSystem.g:328:1: entryRuleSavingsAccount : ruleSavingsAccount EOF ;
    public final void entryRuleSavingsAccount() throws RecognitionException {
        try {
            // InternalBankSystem.g:329:1: ( ruleSavingsAccount EOF )
            // InternalBankSystem.g:330:1: ruleSavingsAccount EOF
            {
             before(grammarAccess.getSavingsAccountRule()); 
            pushFollow(FOLLOW_1);
            ruleSavingsAccount();

            state._fsp--;

             after(grammarAccess.getSavingsAccountRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSavingsAccount"


    // $ANTLR start "ruleSavingsAccount"
    // InternalBankSystem.g:337:1: ruleSavingsAccount : ( ( rule__SavingsAccount__Group__0 ) ) ;
    public final void ruleSavingsAccount() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:341:2: ( ( ( rule__SavingsAccount__Group__0 ) ) )
            // InternalBankSystem.g:342:2: ( ( rule__SavingsAccount__Group__0 ) )
            {
            // InternalBankSystem.g:342:2: ( ( rule__SavingsAccount__Group__0 ) )
            // InternalBankSystem.g:343:3: ( rule__SavingsAccount__Group__0 )
            {
             before(grammarAccess.getSavingsAccountAccess().getGroup()); 
            // InternalBankSystem.g:344:3: ( rule__SavingsAccount__Group__0 )
            // InternalBankSystem.g:344:4: rule__SavingsAccount__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SavingsAccount__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSavingsAccountAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSavingsAccount"


    // $ANTLR start "entryRuleCheckingAccount"
    // InternalBankSystem.g:353:1: entryRuleCheckingAccount : ruleCheckingAccount EOF ;
    public final void entryRuleCheckingAccount() throws RecognitionException {
        try {
            // InternalBankSystem.g:354:1: ( ruleCheckingAccount EOF )
            // InternalBankSystem.g:355:1: ruleCheckingAccount EOF
            {
             before(grammarAccess.getCheckingAccountRule()); 
            pushFollow(FOLLOW_1);
            ruleCheckingAccount();

            state._fsp--;

             after(grammarAccess.getCheckingAccountRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCheckingAccount"


    // $ANTLR start "ruleCheckingAccount"
    // InternalBankSystem.g:362:1: ruleCheckingAccount : ( ( rule__CheckingAccount__Group__0 ) ) ;
    public final void ruleCheckingAccount() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:366:2: ( ( ( rule__CheckingAccount__Group__0 ) ) )
            // InternalBankSystem.g:367:2: ( ( rule__CheckingAccount__Group__0 ) )
            {
            // InternalBankSystem.g:367:2: ( ( rule__CheckingAccount__Group__0 ) )
            // InternalBankSystem.g:368:3: ( rule__CheckingAccount__Group__0 )
            {
             before(grammarAccess.getCheckingAccountAccess().getGroup()); 
            // InternalBankSystem.g:369:3: ( rule__CheckingAccount__Group__0 )
            // InternalBankSystem.g:369:4: rule__CheckingAccount__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CheckingAccount__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckingAccountAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheckingAccount"


    // $ANTLR start "entryRuleMortgageAccount"
    // InternalBankSystem.g:378:1: entryRuleMortgageAccount : ruleMortgageAccount EOF ;
    public final void entryRuleMortgageAccount() throws RecognitionException {
        try {
            // InternalBankSystem.g:379:1: ( ruleMortgageAccount EOF )
            // InternalBankSystem.g:380:1: ruleMortgageAccount EOF
            {
             before(grammarAccess.getMortgageAccountRule()); 
            pushFollow(FOLLOW_1);
            ruleMortgageAccount();

            state._fsp--;

             after(grammarAccess.getMortgageAccountRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMortgageAccount"


    // $ANTLR start "ruleMortgageAccount"
    // InternalBankSystem.g:387:1: ruleMortgageAccount : ( ( rule__MortgageAccount__Group__0 ) ) ;
    public final void ruleMortgageAccount() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:391:2: ( ( ( rule__MortgageAccount__Group__0 ) ) )
            // InternalBankSystem.g:392:2: ( ( rule__MortgageAccount__Group__0 ) )
            {
            // InternalBankSystem.g:392:2: ( ( rule__MortgageAccount__Group__0 ) )
            // InternalBankSystem.g:393:3: ( rule__MortgageAccount__Group__0 )
            {
             before(grammarAccess.getMortgageAccountAccess().getGroup()); 
            // InternalBankSystem.g:394:3: ( rule__MortgageAccount__Group__0 )
            // InternalBankSystem.g:394:4: rule__MortgageAccount__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MortgageAccount__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMortgageAccountAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMortgageAccount"


    // $ANTLR start "entryRuleTransaction"
    // InternalBankSystem.g:403:1: entryRuleTransaction : ruleTransaction EOF ;
    public final void entryRuleTransaction() throws RecognitionException {
        try {
            // InternalBankSystem.g:404:1: ( ruleTransaction EOF )
            // InternalBankSystem.g:405:1: ruleTransaction EOF
            {
             before(grammarAccess.getTransactionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransaction();

            state._fsp--;

             after(grammarAccess.getTransactionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransaction"


    // $ANTLR start "ruleTransaction"
    // InternalBankSystem.g:412:1: ruleTransaction : ( ( rule__Transaction__Group__0 ) ) ;
    public final void ruleTransaction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:416:2: ( ( ( rule__Transaction__Group__0 ) ) )
            // InternalBankSystem.g:417:2: ( ( rule__Transaction__Group__0 ) )
            {
            // InternalBankSystem.g:417:2: ( ( rule__Transaction__Group__0 ) )
            // InternalBankSystem.g:418:3: ( rule__Transaction__Group__0 )
            {
             before(grammarAccess.getTransactionAccess().getGroup()); 
            // InternalBankSystem.g:419:3: ( rule__Transaction__Group__0 )
            // InternalBankSystem.g:419:4: rule__Transaction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransaction"


    // $ANTLR start "entryRuleBoolean"
    // InternalBankSystem.g:428:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalBankSystem.g:429:1: ( ruleBoolean EOF )
            // InternalBankSystem.g:430:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalBankSystem.g:437:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:441:2: ( ( ( rule__Boolean__Alternatives ) ) )
            // InternalBankSystem.g:442:2: ( ( rule__Boolean__Alternatives ) )
            {
            // InternalBankSystem.g:442:2: ( ( rule__Boolean__Alternatives ) )
            // InternalBankSystem.g:443:3: ( rule__Boolean__Alternatives )
            {
             before(grammarAccess.getBooleanAccess().getAlternatives()); 
            // InternalBankSystem.g:444:3: ( rule__Boolean__Alternatives )
            // InternalBankSystem.g:444:4: rule__Boolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleDate"
    // InternalBankSystem.g:453:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // InternalBankSystem.g:454:1: ( ruleDate EOF )
            // InternalBankSystem.g:455:1: ruleDate EOF
            {
             before(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_1);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // InternalBankSystem.g:462:1: ruleDate : ( ( rule__Date__Group__0 ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:466:2: ( ( ( rule__Date__Group__0 ) ) )
            // InternalBankSystem.g:467:2: ( ( rule__Date__Group__0 ) )
            {
            // InternalBankSystem.g:467:2: ( ( rule__Date__Group__0 ) )
            // InternalBankSystem.g:468:3: ( rule__Date__Group__0 )
            {
             before(grammarAccess.getDateAccess().getGroup()); 
            // InternalBankSystem.g:469:3: ( rule__Date__Group__0 )
            // InternalBankSystem.g:469:4: rule__Date__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Date__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "rule__EmployeeRole__Alternatives"
    // InternalBankSystem.g:477:1: rule__EmployeeRole__Alternatives : ( ( ruleTeller ) | ( ruleManager ) );
    public final void rule__EmployeeRole__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:481:1: ( ( ruleTeller ) | ( ruleManager ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalBankSystem.g:482:2: ( ruleTeller )
                    {
                    // InternalBankSystem.g:482:2: ( ruleTeller )
                    // InternalBankSystem.g:483:3: ruleTeller
                    {
                     before(grammarAccess.getEmployeeRoleAccess().getTellerParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTeller();

                    state._fsp--;

                     after(grammarAccess.getEmployeeRoleAccess().getTellerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBankSystem.g:488:2: ( ruleManager )
                    {
                    // InternalBankSystem.g:488:2: ( ruleManager )
                    // InternalBankSystem.g:489:3: ruleManager
                    {
                     before(grammarAccess.getEmployeeRoleAccess().getManagerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleManager();

                    state._fsp--;

                     after(grammarAccess.getEmployeeRoleAccess().getManagerParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmployeeRole__Alternatives"


    // $ANTLR start "rule__Account__Alternatives_0"
    // InternalBankSystem.g:498:1: rule__Account__Alternatives_0 : ( ( ruleSavingsAccount ) | ( ruleCheckingAccount ) | ( ruleMortgageAccount ) );
    public final void rule__Account__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:502:1: ( ( ruleSavingsAccount ) | ( ruleCheckingAccount ) | ( ruleMortgageAccount ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt2=1;
                }
                break;
            case 37:
                {
                alt2=2;
                }
                break;
            case 39:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBankSystem.g:503:2: ( ruleSavingsAccount )
                    {
                    // InternalBankSystem.g:503:2: ( ruleSavingsAccount )
                    // InternalBankSystem.g:504:3: ruleSavingsAccount
                    {
                     before(grammarAccess.getAccountAccess().getSavingsAccountParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSavingsAccount();

                    state._fsp--;

                     after(grammarAccess.getAccountAccess().getSavingsAccountParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBankSystem.g:509:2: ( ruleCheckingAccount )
                    {
                    // InternalBankSystem.g:509:2: ( ruleCheckingAccount )
                    // InternalBankSystem.g:510:3: ruleCheckingAccount
                    {
                     before(grammarAccess.getAccountAccess().getCheckingAccountParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCheckingAccount();

                    state._fsp--;

                     after(grammarAccess.getAccountAccess().getCheckingAccountParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBankSystem.g:515:2: ( ruleMortgageAccount )
                    {
                    // InternalBankSystem.g:515:2: ( ruleMortgageAccount )
                    // InternalBankSystem.g:516:3: ruleMortgageAccount
                    {
                     before(grammarAccess.getAccountAccess().getMortgageAccountParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMortgageAccount();

                    state._fsp--;

                     after(grammarAccess.getAccountAccess().getMortgageAccountParserRuleCall_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Account__Alternatives_0"


    // $ANTLR start "rule__Boolean__Alternatives"
    // InternalBankSystem.g:525:1: rule__Boolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:529:1: ( ( 'true' ) | ( 'false' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBankSystem.g:530:2: ( 'true' )
                    {
                    // InternalBankSystem.g:530:2: ( 'true' )
                    // InternalBankSystem.g:531:3: 'true'
                    {
                     before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBankSystem.g:536:2: ( 'false' )
                    {
                    // InternalBankSystem.g:536:2: ( 'false' )
                    // InternalBankSystem.g:537:3: 'false'
                    {
                     before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Alternatives"


    // $ANTLR start "rule__BankSystem__Group__0"
    // InternalBankSystem.g:546:1: rule__BankSystem__Group__0 : rule__BankSystem__Group__0__Impl rule__BankSystem__Group__1 ;
    public final void rule__BankSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:550:1: ( rule__BankSystem__Group__0__Impl rule__BankSystem__Group__1 )
            // InternalBankSystem.g:551:2: rule__BankSystem__Group__0__Impl rule__BankSystem__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BankSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BankSystem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BankSystem__Group__0"


    // $ANTLR start "rule__BankSystem__Group__0__Impl"
    // InternalBankSystem.g:558:1: rule__BankSystem__Group__0__Impl : ( ( ( rule__BankSystem__BanksAssignment_0 ) ) ( ( rule__BankSystem__BanksAssignment_0 )* ) ) ;
    public final void rule__BankSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:562:1: ( ( ( ( rule__BankSystem__BanksAssignment_0 ) ) ( ( rule__BankSystem__BanksAssignment_0 )* ) ) )
            // InternalBankSystem.g:563:1: ( ( ( rule__BankSystem__BanksAssignment_0 ) ) ( ( rule__BankSystem__BanksAssignment_0 )* ) )
            {
            // InternalBankSystem.g:563:1: ( ( ( rule__BankSystem__BanksAssignment_0 ) ) ( ( rule__BankSystem__BanksAssignment_0 )* ) )
            // InternalBankSystem.g:564:2: ( ( rule__BankSystem__BanksAssignment_0 ) ) ( ( rule__BankSystem__BanksAssignment_0 )* )
            {
            // InternalBankSystem.g:564:2: ( ( rule__BankSystem__BanksAssignment_0 ) )
            // InternalBankSystem.g:565:3: ( rule__BankSystem__BanksAssignment_0 )
            {
             before(grammarAccess.getBankSystemAccess().getBanksAssignment_0()); 
            // InternalBankSystem.g:566:3: ( rule__BankSystem__BanksAssignment_0 )
            // InternalBankSystem.g:566:4: rule__BankSystem__BanksAssignment_0
            {
            pushFollow(FOLLOW_4);
            rule__BankSystem__BanksAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBankSystemAccess().getBanksAssignment_0()); 

            }

            // InternalBankSystem.g:569:2: ( ( rule__BankSystem__BanksAssignment_0 )* )
            // InternalBankSystem.g:570:3: ( rule__BankSystem__BanksAssignment_0 )*
            {
             before(grammarAccess.getBankSystemAccess().getBanksAssignment_0()); 
            // InternalBankSystem.g:571:3: ( rule__BankSystem__BanksAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBankSystem.g:571:4: rule__BankSystem__BanksAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__BankSystem__BanksAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getBankSystemAccess().getBanksAssignment_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BankSystem__Group__0__Impl"


    // $ANTLR start "rule__BankSystem__Group__1"
    // InternalBankSystem.g:580:1: rule__BankSystem__Group__1 : rule__BankSystem__Group__1__Impl ;
    public final void rule__BankSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:584:1: ( rule__BankSystem__Group__1__Impl )
            // InternalBankSystem.g:585:2: rule__BankSystem__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BankSystem__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BankSystem__Group__1"


    // $ANTLR start "rule__BankSystem__Group__1__Impl"
    // InternalBankSystem.g:591:1: rule__BankSystem__Group__1__Impl : ( ( ( rule__BankSystem__UsersAssignment_1 ) ) ( ( rule__BankSystem__UsersAssignment_1 )* ) ) ;
    public final void rule__BankSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:595:1: ( ( ( ( rule__BankSystem__UsersAssignment_1 ) ) ( ( rule__BankSystem__UsersAssignment_1 )* ) ) )
            // InternalBankSystem.g:596:1: ( ( ( rule__BankSystem__UsersAssignment_1 ) ) ( ( rule__BankSystem__UsersAssignment_1 )* ) )
            {
            // InternalBankSystem.g:596:1: ( ( ( rule__BankSystem__UsersAssignment_1 ) ) ( ( rule__BankSystem__UsersAssignment_1 )* ) )
            // InternalBankSystem.g:597:2: ( ( rule__BankSystem__UsersAssignment_1 ) ) ( ( rule__BankSystem__UsersAssignment_1 )* )
            {
            // InternalBankSystem.g:597:2: ( ( rule__BankSystem__UsersAssignment_1 ) )
            // InternalBankSystem.g:598:3: ( rule__BankSystem__UsersAssignment_1 )
            {
             before(grammarAccess.getBankSystemAccess().getUsersAssignment_1()); 
            // InternalBankSystem.g:599:3: ( rule__BankSystem__UsersAssignment_1 )
            // InternalBankSystem.g:599:4: rule__BankSystem__UsersAssignment_1
            {
            pushFollow(FOLLOW_5);
            rule__BankSystem__UsersAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBankSystemAccess().getUsersAssignment_1()); 

            }

            // InternalBankSystem.g:602:2: ( ( rule__BankSystem__UsersAssignment_1 )* )
            // InternalBankSystem.g:603:3: ( rule__BankSystem__UsersAssignment_1 )*
            {
             before(grammarAccess.getBankSystemAccess().getUsersAssignment_1()); 
            // InternalBankSystem.g:604:3: ( rule__BankSystem__UsersAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBankSystem.g:604:4: rule__BankSystem__UsersAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__BankSystem__UsersAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getBankSystemAccess().getUsersAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BankSystem__Group__1__Impl"


    // $ANTLR start "rule__Bank__Group__0"
    // InternalBankSystem.g:614:1: rule__Bank__Group__0 : rule__Bank__Group__0__Impl rule__Bank__Group__1 ;
    public final void rule__Bank__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:618:1: ( rule__Bank__Group__0__Impl rule__Bank__Group__1 )
            // InternalBankSystem.g:619:2: rule__Bank__Group__0__Impl rule__Bank__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Bank__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bank__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bank__Group__0"


    // $ANTLR start "rule__Bank__Group__0__Impl"
    // InternalBankSystem.g:626:1: rule__Bank__Group__0__Impl : ( 'Bank' ) ;
    public final void rule__Bank__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:630:1: ( ( 'Bank' ) )
            // InternalBankSystem.g:631:1: ( 'Bank' )
            {
            // InternalBankSystem.g:631:1: ( 'Bank' )
            // InternalBankSystem.g:632:2: 'Bank'
            {
             before(grammarAccess.getBankAccess().getBankKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBankAccess().getBankKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bank__Group__0__Impl"


    // $ANTLR start "rule__Bank__Group__1"
    // InternalBankSystem.g:641:1: rule__Bank__Group__1 : rule__Bank__Group__1__Impl rule__Bank__Group__2 ;
    public final void rule__Bank__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:645:1: ( rule__Bank__Group__1__Impl rule__Bank__Group__2 )
            // InternalBankSystem.g:646:2: rule__Bank__Group__1__Impl rule__Bank__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Bank__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bank__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bank__Group__1"


    // $ANTLR start "rule__Bank__Group__1__Impl"
    // InternalBankSystem.g:653:1: rule__Bank__Group__1__Impl : ( ( rule__Bank__NameAssignment_1 ) ) ;
    public final void rule__Bank__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:657:1: ( ( ( rule__Bank__NameAssignment_1 ) ) )
            // InternalBankSystem.g:658:1: ( ( rule__Bank__NameAssignment_1 ) )
            {
            // InternalBankSystem.g:658:1: ( ( rule__Bank__NameAssignment_1 ) )
            // InternalBankSystem.g:659:2: ( rule__Bank__NameAssignment_1 )
            {
             before(grammarAccess.getBankAccess().getNameAssignment_1()); 
            // InternalBankSystem.g:660:2: ( rule__Bank__NameAssignment_1 )
            // InternalBankSystem.g:660:3: rule__Bank__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Bank__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBankAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bank__Group__1__Impl"


    // $ANTLR start "rule__Bank__Group__2"
    // InternalBankSystem.g:668:1: rule__Bank__Group__2 : rule__Bank__Group__2__Impl rule__Bank__Group__3 ;
    public final void rule__Bank__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:672:1: ( rule__Bank__Group__2__Impl rule__Bank__Group__3 )
            // InternalBankSystem.g:673:2: rule__Bank__Group__2__Impl rule__Bank__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Bank__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bank__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bank__Group__2"


    // $ANTLR start "rule__Bank__Group__2__Impl"
    // InternalBankSystem.g:680:1: rule__Bank__Group__2__Impl : ( '{' ) ;
    public final void rule__Bank__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:684:1: ( ( '{' ) )
            // InternalBankSystem.g:685:1: ( '{' )
            {
            // InternalBankSystem.g:685:1: ( '{' )
            // InternalBankSystem.g:686:2: '{'
            {
             before(grammarAccess.getBankAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBankAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bank__Group__2__Impl"


    // $ANTLR start "rule__Bank__Group__3"
    // InternalBankSystem.g:695:1: rule__Bank__Group__3 : rule__Bank__Group__3__Impl rule__Bank__Group__4 ;
    public final void rule__Bank__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:699:1: ( rule__Bank__Group__3__Impl rule__Bank__Group__4 )
            // InternalBankSystem.g:700:2: rule__Bank__Group__3__Impl rule__Bank__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Bank__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bank__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bank__Group__3"


    // $ANTLR start "rule__Bank__Group__3__Impl"
    // InternalBankSystem.g:707:1: rule__Bank__Group__3__Impl : ( 'Country' ) ;
    public final void rule__Bank__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:711:1: ( ( 'Country' ) )
            // InternalBankSystem.g:712:1: ( 'Country' )
            {
            // InternalBankSystem.g:712:1: ( 'Country' )
            // InternalBankSystem.g:713:2: 'Country'
            {
             before(grammarAccess.getBankAccess().getCountryKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBankAccess().getCountryKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bank__Group__3__Impl"


    // $ANTLR start "rule__Bank__Group__4"
    // InternalBankSystem.g:722:1: rule__Bank__Group__4 : rule__Bank__Group__4__Impl rule__Bank__Group__5 ;
    public final void rule__Bank__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:726:1: ( rule__Bank__Group__4__Impl rule__Bank__Group__5 )
            // InternalBankSystem.g:727:2: rule__Bank__Group__4__Impl rule__Bank__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Bank__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bank__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bank__Group__4"


    // $ANTLR start "rule__Bank__Group__4__Impl"
    // InternalBankSystem.g:734:1: rule__Bank__Group__4__Impl : ( ( rule__Bank__CountryOfOriginAssignment_4 ) ) ;
    public final void rule__Bank__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:738:1: ( ( ( rule__Bank__CountryOfOriginAssignment_4 ) ) )
            // InternalBankSystem.g:739:1: ( ( rule__Bank__CountryOfOriginAssignment_4 ) )
            {
            // InternalBankSystem.g:739:1: ( ( rule__Bank__CountryOfOriginAssignment_4 ) )
            // InternalBankSystem.g:740:2: ( rule__Bank__CountryOfOriginAssignment_4 )
            {
             before(grammarAccess.getBankAccess().getCountryOfOriginAssignment_4()); 
            // InternalBankSystem.g:741:2: ( rule__Bank__CountryOfOriginAssignment_4 )
            // InternalBankSystem.g:741:3: rule__Bank__CountryOfOriginAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Bank__CountryOfOriginAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBankAccess().getCountryOfOriginAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bank__Group__4__Impl"


    // $ANTLR start "rule__Bank__Group__5"
    // InternalBankSystem.g:749:1: rule__Bank__Group__5 : rule__Bank__Group__5__Impl rule__Bank__Group__6 ;
    public final void rule__Bank__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:753:1: ( rule__Bank__Group__5__Impl rule__Bank__Group__6 )
            // InternalBankSystem.g:754:2: rule__Bank__Group__5__Impl rule__Bank__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Bank__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bank__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bank__Group__5"


    // $ANTLR start "rule__Bank__Group__5__Impl"
    // InternalBankSystem.g:761:1: rule__Bank__Group__5__Impl : ( ( ( rule__Bank__BranchesAssignment_5 ) ) ( ( rule__Bank__BranchesAssignment_5 )* ) ) ;
    public final void rule__Bank__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:765:1: ( ( ( ( rule__Bank__BranchesAssignment_5 ) ) ( ( rule__Bank__BranchesAssignment_5 )* ) ) )
            // InternalBankSystem.g:766:1: ( ( ( rule__Bank__BranchesAssignment_5 ) ) ( ( rule__Bank__BranchesAssignment_5 )* ) )
            {
            // InternalBankSystem.g:766:1: ( ( ( rule__Bank__BranchesAssignment_5 ) ) ( ( rule__Bank__BranchesAssignment_5 )* ) )
            // InternalBankSystem.g:767:2: ( ( rule__Bank__BranchesAssignment_5 ) ) ( ( rule__Bank__BranchesAssignment_5 )* )
            {
            // InternalBankSystem.g:767:2: ( ( rule__Bank__BranchesAssignment_5 ) )
            // InternalBankSystem.g:768:3: ( rule__Bank__BranchesAssignment_5 )
            {
             before(grammarAccess.getBankAccess().getBranchesAssignment_5()); 
            // InternalBankSystem.g:769:3: ( rule__Bank__BranchesAssignment_5 )
            // InternalBankSystem.g:769:4: rule__Bank__BranchesAssignment_5
            {
            pushFollow(FOLLOW_12);
            rule__Bank__BranchesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBankAccess().getBranchesAssignment_5()); 

            }

            // InternalBankSystem.g:772:2: ( ( rule__Bank__BranchesAssignment_5 )* )
            // InternalBankSystem.g:773:3: ( rule__Bank__BranchesAssignment_5 )*
            {
             before(grammarAccess.getBankAccess().getBranchesAssignment_5()); 
            // InternalBankSystem.g:774:3: ( rule__Bank__BranchesAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBankSystem.g:774:4: rule__Bank__BranchesAssignment_5
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Bank__BranchesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getBankAccess().getBranchesAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bank__Group__5__Impl"


    // $ANTLR start "rule__Bank__Group__6"
    // InternalBankSystem.g:783:1: rule__Bank__Group__6 : rule__Bank__Group__6__Impl rule__Bank__Group__7 ;
    public final void rule__Bank__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:787:1: ( rule__Bank__Group__6__Impl rule__Bank__Group__7 )
            // InternalBankSystem.g:788:2: rule__Bank__Group__6__Impl rule__Bank__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Bank__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bank__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bank__Group__6"


    // $ANTLR start "rule__Bank__Group__6__Impl"
    // InternalBankSystem.g:795:1: rule__Bank__Group__6__Impl : ( ( rule__Bank__AccountsAssignment_6 )* ) ;
    public final void rule__Bank__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:799:1: ( ( ( rule__Bank__AccountsAssignment_6 )* ) )
            // InternalBankSystem.g:800:1: ( ( rule__Bank__AccountsAssignment_6 )* )
            {
            // InternalBankSystem.g:800:1: ( ( rule__Bank__AccountsAssignment_6 )* )
            // InternalBankSystem.g:801:2: ( rule__Bank__AccountsAssignment_6 )*
            {
             before(grammarAccess.getBankAccess().getAccountsAssignment_6()); 
            // InternalBankSystem.g:802:2: ( rule__Bank__AccountsAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==35||LA7_0==37||LA7_0==39) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBankSystem.g:802:3: rule__Bank__AccountsAssignment_6
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Bank__AccountsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getBankAccess().getAccountsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bank__Group__6__Impl"


    // $ANTLR start "rule__Bank__Group__7"
    // InternalBankSystem.g:810:1: rule__Bank__Group__7 : rule__Bank__Group__7__Impl rule__Bank__Group__8 ;
    public final void rule__Bank__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:814:1: ( rule__Bank__Group__7__Impl rule__Bank__Group__8 )
            // InternalBankSystem.g:815:2: rule__Bank__Group__7__Impl rule__Bank__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Bank__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bank__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bank__Group__7"


    // $ANTLR start "rule__Bank__Group__7__Impl"
    // InternalBankSystem.g:822:1: rule__Bank__Group__7__Impl : ( ( rule__Bank__TransactionsAssignment_7 )* ) ;
    public final void rule__Bank__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:826:1: ( ( ( rule__Bank__TransactionsAssignment_7 )* ) )
            // InternalBankSystem.g:827:1: ( ( rule__Bank__TransactionsAssignment_7 )* )
            {
            // InternalBankSystem.g:827:1: ( ( rule__Bank__TransactionsAssignment_7 )* )
            // InternalBankSystem.g:828:2: ( rule__Bank__TransactionsAssignment_7 )*
            {
             before(grammarAccess.getBankAccess().getTransactionsAssignment_7()); 
            // InternalBankSystem.g:829:2: ( rule__Bank__TransactionsAssignment_7 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==41) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBankSystem.g:829:3: rule__Bank__TransactionsAssignment_7
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Bank__TransactionsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getBankAccess().getTransactionsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bank__Group__7__Impl"


    // $ANTLR start "rule__Bank__Group__8"
    // InternalBankSystem.g:837:1: rule__Bank__Group__8 : rule__Bank__Group__8__Impl ;
    public final void rule__Bank__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:841:1: ( rule__Bank__Group__8__Impl )
            // InternalBankSystem.g:842:2: rule__Bank__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bank__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bank__Group__8"


    // $ANTLR start "rule__Bank__Group__8__Impl"
    // InternalBankSystem.g:848:1: rule__Bank__Group__8__Impl : ( '}' ) ;
    public final void rule__Bank__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:852:1: ( ( '}' ) )
            // InternalBankSystem.g:853:1: ( '}' )
            {
            // InternalBankSystem.g:853:1: ( '}' )
            // InternalBankSystem.g:854:2: '}'
            {
             before(grammarAccess.getBankAccess().getRightCurlyBracketKeyword_8()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBankAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bank__Group__8__Impl"


    // $ANTLR start "rule__User__Group__0"
    // InternalBankSystem.g:864:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:868:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // InternalBankSystem.g:869:2: rule__User__Group__0__Impl rule__User__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__User__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__0"


    // $ANTLR start "rule__User__Group__0__Impl"
    // InternalBankSystem.g:876:1: rule__User__Group__0__Impl : ( 'User' ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:880:1: ( ( 'User' ) )
            // InternalBankSystem.g:881:1: ( 'User' )
            {
            // InternalBankSystem.g:881:1: ( 'User' )
            // InternalBankSystem.g:882:2: 'User'
            {
             before(grammarAccess.getUserAccess().getUserKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getUserKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__0__Impl"


    // $ANTLR start "rule__User__Group__1"
    // InternalBankSystem.g:891:1: rule__User__Group__1 : rule__User__Group__1__Impl rule__User__Group__2 ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:895:1: ( rule__User__Group__1__Impl rule__User__Group__2 )
            // InternalBankSystem.g:896:2: rule__User__Group__1__Impl rule__User__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__User__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__1"


    // $ANTLR start "rule__User__Group__1__Impl"
    // InternalBankSystem.g:903:1: rule__User__Group__1__Impl : ( '{' ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:907:1: ( ( '{' ) )
            // InternalBankSystem.g:908:1: ( '{' )
            {
            // InternalBankSystem.g:908:1: ( '{' )
            // InternalBankSystem.g:909:2: '{'
            {
             before(grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__1__Impl"


    // $ANTLR start "rule__User__Group__2"
    // InternalBankSystem.g:918:1: rule__User__Group__2 : rule__User__Group__2__Impl rule__User__Group__3 ;
    public final void rule__User__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:922:1: ( rule__User__Group__2__Impl rule__User__Group__3 )
            // InternalBankSystem.g:923:2: rule__User__Group__2__Impl rule__User__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__User__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__2"


    // $ANTLR start "rule__User__Group__2__Impl"
    // InternalBankSystem.g:930:1: rule__User__Group__2__Impl : ( 'Name' ) ;
    public final void rule__User__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:934:1: ( ( 'Name' ) )
            // InternalBankSystem.g:935:1: ( 'Name' )
            {
            // InternalBankSystem.g:935:1: ( 'Name' )
            // InternalBankSystem.g:936:2: 'Name'
            {
             before(grammarAccess.getUserAccess().getNameKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__2__Impl"


    // $ANTLR start "rule__User__Group__3"
    // InternalBankSystem.g:945:1: rule__User__Group__3 : rule__User__Group__3__Impl rule__User__Group__4 ;
    public final void rule__User__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:949:1: ( rule__User__Group__3__Impl rule__User__Group__4 )
            // InternalBankSystem.g:950:2: rule__User__Group__3__Impl rule__User__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__User__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__3"


    // $ANTLR start "rule__User__Group__3__Impl"
    // InternalBankSystem.g:957:1: rule__User__Group__3__Impl : ( ( rule__User__NameAssignment_3 ) ) ;
    public final void rule__User__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:961:1: ( ( ( rule__User__NameAssignment_3 ) ) )
            // InternalBankSystem.g:962:1: ( ( rule__User__NameAssignment_3 ) )
            {
            // InternalBankSystem.g:962:1: ( ( rule__User__NameAssignment_3 ) )
            // InternalBankSystem.g:963:2: ( rule__User__NameAssignment_3 )
            {
             before(grammarAccess.getUserAccess().getNameAssignment_3()); 
            // InternalBankSystem.g:964:2: ( rule__User__NameAssignment_3 )
            // InternalBankSystem.g:964:3: rule__User__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__User__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__3__Impl"


    // $ANTLR start "rule__User__Group__4"
    // InternalBankSystem.g:972:1: rule__User__Group__4 : rule__User__Group__4__Impl rule__User__Group__5 ;
    public final void rule__User__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:976:1: ( rule__User__Group__4__Impl rule__User__Group__5 )
            // InternalBankSystem.g:977:2: rule__User__Group__4__Impl rule__User__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__User__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__4"


    // $ANTLR start "rule__User__Group__4__Impl"
    // InternalBankSystem.g:984:1: rule__User__Group__4__Impl : ( 'Email' ) ;
    public final void rule__User__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:988:1: ( ( 'Email' ) )
            // InternalBankSystem.g:989:1: ( 'Email' )
            {
            // InternalBankSystem.g:989:1: ( 'Email' )
            // InternalBankSystem.g:990:2: 'Email'
            {
             before(grammarAccess.getUserAccess().getEmailKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getEmailKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__4__Impl"


    // $ANTLR start "rule__User__Group__5"
    // InternalBankSystem.g:999:1: rule__User__Group__5 : rule__User__Group__5__Impl rule__User__Group__6 ;
    public final void rule__User__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1003:1: ( rule__User__Group__5__Impl rule__User__Group__6 )
            // InternalBankSystem.g:1004:2: rule__User__Group__5__Impl rule__User__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__User__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__5"


    // $ANTLR start "rule__User__Group__5__Impl"
    // InternalBankSystem.g:1011:1: rule__User__Group__5__Impl : ( ( rule__User__EmailAssignment_5 ) ) ;
    public final void rule__User__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1015:1: ( ( ( rule__User__EmailAssignment_5 ) ) )
            // InternalBankSystem.g:1016:1: ( ( rule__User__EmailAssignment_5 ) )
            {
            // InternalBankSystem.g:1016:1: ( ( rule__User__EmailAssignment_5 ) )
            // InternalBankSystem.g:1017:2: ( rule__User__EmailAssignment_5 )
            {
             before(grammarAccess.getUserAccess().getEmailAssignment_5()); 
            // InternalBankSystem.g:1018:2: ( rule__User__EmailAssignment_5 )
            // InternalBankSystem.g:1018:3: rule__User__EmailAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__User__EmailAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getEmailAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__5__Impl"


    // $ANTLR start "rule__User__Group__6"
    // InternalBankSystem.g:1026:1: rule__User__Group__6 : rule__User__Group__6__Impl rule__User__Group__7 ;
    public final void rule__User__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1030:1: ( rule__User__Group__6__Impl rule__User__Group__7 )
            // InternalBankSystem.g:1031:2: rule__User__Group__6__Impl rule__User__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__User__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__6"


    // $ANTLR start "rule__User__Group__6__Impl"
    // InternalBankSystem.g:1038:1: rule__User__Group__6__Impl : ( 'HashPass' ) ;
    public final void rule__User__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1042:1: ( ( 'HashPass' ) )
            // InternalBankSystem.g:1043:1: ( 'HashPass' )
            {
            // InternalBankSystem.g:1043:1: ( 'HashPass' )
            // InternalBankSystem.g:1044:2: 'HashPass'
            {
             before(grammarAccess.getUserAccess().getHashPassKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getHashPassKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__6__Impl"


    // $ANTLR start "rule__User__Group__7"
    // InternalBankSystem.g:1053:1: rule__User__Group__7 : rule__User__Group__7__Impl rule__User__Group__8 ;
    public final void rule__User__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1057:1: ( rule__User__Group__7__Impl rule__User__Group__8 )
            // InternalBankSystem.g:1058:2: rule__User__Group__7__Impl rule__User__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__User__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__7"


    // $ANTLR start "rule__User__Group__7__Impl"
    // InternalBankSystem.g:1065:1: rule__User__Group__7__Impl : ( ( rule__User__HashpassAssignment_7 ) ) ;
    public final void rule__User__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1069:1: ( ( ( rule__User__HashpassAssignment_7 ) ) )
            // InternalBankSystem.g:1070:1: ( ( rule__User__HashpassAssignment_7 ) )
            {
            // InternalBankSystem.g:1070:1: ( ( rule__User__HashpassAssignment_7 ) )
            // InternalBankSystem.g:1071:2: ( rule__User__HashpassAssignment_7 )
            {
             before(grammarAccess.getUserAccess().getHashpassAssignment_7()); 
            // InternalBankSystem.g:1072:2: ( rule__User__HashpassAssignment_7 )
            // InternalBankSystem.g:1072:3: rule__User__HashpassAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__User__HashpassAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getHashpassAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__7__Impl"


    // $ANTLR start "rule__User__Group__8"
    // InternalBankSystem.g:1080:1: rule__User__Group__8 : rule__User__Group__8__Impl rule__User__Group__9 ;
    public final void rule__User__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1084:1: ( rule__User__Group__8__Impl rule__User__Group__9 )
            // InternalBankSystem.g:1085:2: rule__User__Group__8__Impl rule__User__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__User__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__8"


    // $ANTLR start "rule__User__Group__8__Impl"
    // InternalBankSystem.g:1092:1: rule__User__Group__8__Impl : ( 'Address' ) ;
    public final void rule__User__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1096:1: ( ( 'Address' ) )
            // InternalBankSystem.g:1097:1: ( 'Address' )
            {
            // InternalBankSystem.g:1097:1: ( 'Address' )
            // InternalBankSystem.g:1098:2: 'Address'
            {
             before(grammarAccess.getUserAccess().getAddressKeyword_8()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getAddressKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__8__Impl"


    // $ANTLR start "rule__User__Group__9"
    // InternalBankSystem.g:1107:1: rule__User__Group__9 : rule__User__Group__9__Impl rule__User__Group__10 ;
    public final void rule__User__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1111:1: ( rule__User__Group__9__Impl rule__User__Group__10 )
            // InternalBankSystem.g:1112:2: rule__User__Group__9__Impl rule__User__Group__10
            {
            pushFollow(FOLLOW_19);
            rule__User__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__9"


    // $ANTLR start "rule__User__Group__9__Impl"
    // InternalBankSystem.g:1119:1: rule__User__Group__9__Impl : ( ( rule__User__AddressAssignment_9 ) ) ;
    public final void rule__User__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1123:1: ( ( ( rule__User__AddressAssignment_9 ) ) )
            // InternalBankSystem.g:1124:1: ( ( rule__User__AddressAssignment_9 ) )
            {
            // InternalBankSystem.g:1124:1: ( ( rule__User__AddressAssignment_9 ) )
            // InternalBankSystem.g:1125:2: ( rule__User__AddressAssignment_9 )
            {
             before(grammarAccess.getUserAccess().getAddressAssignment_9()); 
            // InternalBankSystem.g:1126:2: ( rule__User__AddressAssignment_9 )
            // InternalBankSystem.g:1126:3: rule__User__AddressAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__User__AddressAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getAddressAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__9__Impl"


    // $ANTLR start "rule__User__Group__10"
    // InternalBankSystem.g:1134:1: rule__User__Group__10 : rule__User__Group__10__Impl ;
    public final void rule__User__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1138:1: ( rule__User__Group__10__Impl )
            // InternalBankSystem.g:1139:2: rule__User__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__User__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__10"


    // $ANTLR start "rule__User__Group__10__Impl"
    // InternalBankSystem.g:1145:1: rule__User__Group__10__Impl : ( '}' ) ;
    public final void rule__User__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1149:1: ( ( '}' ) )
            // InternalBankSystem.g:1150:1: ( '}' )
            {
            // InternalBankSystem.g:1150:1: ( '}' )
            // InternalBankSystem.g:1151:2: '}'
            {
             before(grammarAccess.getUserAccess().getRightCurlyBracketKeyword_10()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__10__Impl"


    // $ANTLR start "rule__Branch__Group__0"
    // InternalBankSystem.g:1161:1: rule__Branch__Group__0 : rule__Branch__Group__0__Impl rule__Branch__Group__1 ;
    public final void rule__Branch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1165:1: ( rule__Branch__Group__0__Impl rule__Branch__Group__1 )
            // InternalBankSystem.g:1166:2: rule__Branch__Group__0__Impl rule__Branch__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Branch__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Branch__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__0"


    // $ANTLR start "rule__Branch__Group__0__Impl"
    // InternalBankSystem.g:1173:1: rule__Branch__Group__0__Impl : ( 'Branch{' ) ;
    public final void rule__Branch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1177:1: ( ( 'Branch{' ) )
            // InternalBankSystem.g:1178:1: ( 'Branch{' )
            {
            // InternalBankSystem.g:1178:1: ( 'Branch{' )
            // InternalBankSystem.g:1179:2: 'Branch{'
            {
             before(grammarAccess.getBranchAccess().getBranchKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBranchAccess().getBranchKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__0__Impl"


    // $ANTLR start "rule__Branch__Group__1"
    // InternalBankSystem.g:1188:1: rule__Branch__Group__1 : rule__Branch__Group__1__Impl rule__Branch__Group__2 ;
    public final void rule__Branch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1192:1: ( rule__Branch__Group__1__Impl rule__Branch__Group__2 )
            // InternalBankSystem.g:1193:2: rule__Branch__Group__1__Impl rule__Branch__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Branch__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Branch__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__1"


    // $ANTLR start "rule__Branch__Group__1__Impl"
    // InternalBankSystem.g:1200:1: rule__Branch__Group__1__Impl : ( 'Address' ) ;
    public final void rule__Branch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1204:1: ( ( 'Address' ) )
            // InternalBankSystem.g:1205:1: ( 'Address' )
            {
            // InternalBankSystem.g:1205:1: ( 'Address' )
            // InternalBankSystem.g:1206:2: 'Address'
            {
             before(grammarAccess.getBranchAccess().getAddressKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBranchAccess().getAddressKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__1__Impl"


    // $ANTLR start "rule__Branch__Group__2"
    // InternalBankSystem.g:1215:1: rule__Branch__Group__2 : rule__Branch__Group__2__Impl rule__Branch__Group__3 ;
    public final void rule__Branch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1219:1: ( rule__Branch__Group__2__Impl rule__Branch__Group__3 )
            // InternalBankSystem.g:1220:2: rule__Branch__Group__2__Impl rule__Branch__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Branch__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Branch__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__2"


    // $ANTLR start "rule__Branch__Group__2__Impl"
    // InternalBankSystem.g:1227:1: rule__Branch__Group__2__Impl : ( ( rule__Branch__AddressAssignment_2 ) ) ;
    public final void rule__Branch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1231:1: ( ( ( rule__Branch__AddressAssignment_2 ) ) )
            // InternalBankSystem.g:1232:1: ( ( rule__Branch__AddressAssignment_2 ) )
            {
            // InternalBankSystem.g:1232:1: ( ( rule__Branch__AddressAssignment_2 ) )
            // InternalBankSystem.g:1233:2: ( rule__Branch__AddressAssignment_2 )
            {
             before(grammarAccess.getBranchAccess().getAddressAssignment_2()); 
            // InternalBankSystem.g:1234:2: ( rule__Branch__AddressAssignment_2 )
            // InternalBankSystem.g:1234:3: rule__Branch__AddressAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Branch__AddressAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBranchAccess().getAddressAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__2__Impl"


    // $ANTLR start "rule__Branch__Group__3"
    // InternalBankSystem.g:1242:1: rule__Branch__Group__3 : rule__Branch__Group__3__Impl rule__Branch__Group__4 ;
    public final void rule__Branch__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1246:1: ( rule__Branch__Group__3__Impl rule__Branch__Group__4 )
            // InternalBankSystem.g:1247:2: rule__Branch__Group__3__Impl rule__Branch__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Branch__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Branch__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__3"


    // $ANTLR start "rule__Branch__Group__3__Impl"
    // InternalBankSystem.g:1254:1: rule__Branch__Group__3__Impl : ( ( ruleBooth )? ) ;
    public final void rule__Branch__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1258:1: ( ( ( ruleBooth )? ) )
            // InternalBankSystem.g:1259:1: ( ( ruleBooth )? )
            {
            // InternalBankSystem.g:1259:1: ( ( ruleBooth )? )
            // InternalBankSystem.g:1260:2: ( ruleBooth )?
            {
             before(grammarAccess.getBranchAccess().getBoothParserRuleCall_3()); 
            // InternalBankSystem.g:1261:2: ( ruleBooth )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==11) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBankSystem.g:1261:3: ruleBooth
                    {
                    pushFollow(FOLLOW_2);
                    ruleBooth();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBranchAccess().getBoothParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__3__Impl"


    // $ANTLR start "rule__Branch__Group__4"
    // InternalBankSystem.g:1269:1: rule__Branch__Group__4 : rule__Branch__Group__4__Impl rule__Branch__Group__5 ;
    public final void rule__Branch__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1273:1: ( rule__Branch__Group__4__Impl rule__Branch__Group__5 )
            // InternalBankSystem.g:1274:2: rule__Branch__Group__4__Impl rule__Branch__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Branch__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Branch__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__4"


    // $ANTLR start "rule__Branch__Group__4__Impl"
    // InternalBankSystem.g:1281:1: rule__Branch__Group__4__Impl : ( ( ruleVault )? ) ;
    public final void rule__Branch__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1285:1: ( ( ( ruleVault )? ) )
            // InternalBankSystem.g:1286:1: ( ( ruleVault )? )
            {
            // InternalBankSystem.g:1286:1: ( ( ruleVault )? )
            // InternalBankSystem.g:1287:2: ( ruleVault )?
            {
             before(grammarAccess.getBranchAccess().getVaultParserRuleCall_4()); 
            // InternalBankSystem.g:1288:2: ( ruleVault )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBankSystem.g:1288:3: ruleVault
                    {
                    pushFollow(FOLLOW_2);
                    ruleVault();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBranchAccess().getVaultParserRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__4__Impl"


    // $ANTLR start "rule__Branch__Group__5"
    // InternalBankSystem.g:1296:1: rule__Branch__Group__5 : rule__Branch__Group__5__Impl rule__Branch__Group__6 ;
    public final void rule__Branch__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1300:1: ( rule__Branch__Group__5__Impl rule__Branch__Group__6 )
            // InternalBankSystem.g:1301:2: rule__Branch__Group__5__Impl rule__Branch__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Branch__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Branch__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__5"


    // $ANTLR start "rule__Branch__Group__5__Impl"
    // InternalBankSystem.g:1308:1: rule__Branch__Group__5__Impl : ( ( ( rule__Branch__EmployeesAssignment_5 ) ) ( ( rule__Branch__EmployeesAssignment_5 )* ) ) ;
    public final void rule__Branch__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1312:1: ( ( ( ( rule__Branch__EmployeesAssignment_5 ) ) ( ( rule__Branch__EmployeesAssignment_5 )* ) ) )
            // InternalBankSystem.g:1313:1: ( ( ( rule__Branch__EmployeesAssignment_5 ) ) ( ( rule__Branch__EmployeesAssignment_5 )* ) )
            {
            // InternalBankSystem.g:1313:1: ( ( ( rule__Branch__EmployeesAssignment_5 ) ) ( ( rule__Branch__EmployeesAssignment_5 )* ) )
            // InternalBankSystem.g:1314:2: ( ( rule__Branch__EmployeesAssignment_5 ) ) ( ( rule__Branch__EmployeesAssignment_5 )* )
            {
            // InternalBankSystem.g:1314:2: ( ( rule__Branch__EmployeesAssignment_5 ) )
            // InternalBankSystem.g:1315:3: ( rule__Branch__EmployeesAssignment_5 )
            {
             before(grammarAccess.getBranchAccess().getEmployeesAssignment_5()); 
            // InternalBankSystem.g:1316:3: ( rule__Branch__EmployeesAssignment_5 )
            // InternalBankSystem.g:1316:4: rule__Branch__EmployeesAssignment_5
            {
            pushFollow(FOLLOW_21);
            rule__Branch__EmployeesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBranchAccess().getEmployeesAssignment_5()); 

            }

            // InternalBankSystem.g:1319:2: ( ( rule__Branch__EmployeesAssignment_5 )* )
            // InternalBankSystem.g:1320:3: ( rule__Branch__EmployeesAssignment_5 )*
            {
             before(grammarAccess.getBranchAccess().getEmployeesAssignment_5()); 
            // InternalBankSystem.g:1321:3: ( rule__Branch__EmployeesAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBankSystem.g:1321:4: rule__Branch__EmployeesAssignment_5
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Branch__EmployeesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getBranchAccess().getEmployeesAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__5__Impl"


    // $ANTLR start "rule__Branch__Group__6"
    // InternalBankSystem.g:1330:1: rule__Branch__Group__6 : rule__Branch__Group__6__Impl ;
    public final void rule__Branch__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1334:1: ( rule__Branch__Group__6__Impl )
            // InternalBankSystem.g:1335:2: rule__Branch__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Branch__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__6"


    // $ANTLR start "rule__Branch__Group__6__Impl"
    // InternalBankSystem.g:1341:1: rule__Branch__Group__6__Impl : ( '}' ) ;
    public final void rule__Branch__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1345:1: ( ( '}' ) )
            // InternalBankSystem.g:1346:1: ( '}' )
            {
            // InternalBankSystem.g:1346:1: ( '}' )
            // InternalBankSystem.g:1347:2: '}'
            {
             before(grammarAccess.getBranchAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBranchAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__6__Impl"


    // $ANTLR start "rule__Employee__Group__0"
    // InternalBankSystem.g:1357:1: rule__Employee__Group__0 : rule__Employee__Group__0__Impl rule__Employee__Group__1 ;
    public final void rule__Employee__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1361:1: ( rule__Employee__Group__0__Impl rule__Employee__Group__1 )
            // InternalBankSystem.g:1362:2: rule__Employee__Group__0__Impl rule__Employee__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Employee__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__0"


    // $ANTLR start "rule__Employee__Group__0__Impl"
    // InternalBankSystem.g:1369:1: rule__Employee__Group__0__Impl : ( 'Employee' ) ;
    public final void rule__Employee__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1373:1: ( ( 'Employee' ) )
            // InternalBankSystem.g:1374:1: ( 'Employee' )
            {
            // InternalBankSystem.g:1374:1: ( 'Employee' )
            // InternalBankSystem.g:1375:2: 'Employee'
            {
             before(grammarAccess.getEmployeeAccess().getEmployeeKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getEmployeeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__0__Impl"


    // $ANTLR start "rule__Employee__Group__1"
    // InternalBankSystem.g:1384:1: rule__Employee__Group__1 : rule__Employee__Group__1__Impl rule__Employee__Group__2 ;
    public final void rule__Employee__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1388:1: ( rule__Employee__Group__1__Impl rule__Employee__Group__2 )
            // InternalBankSystem.g:1389:2: rule__Employee__Group__1__Impl rule__Employee__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Employee__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__1"


    // $ANTLR start "rule__Employee__Group__1__Impl"
    // InternalBankSystem.g:1396:1: rule__Employee__Group__1__Impl : ( ( rule__Employee__NameAssignment_1 ) ) ;
    public final void rule__Employee__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1400:1: ( ( ( rule__Employee__NameAssignment_1 ) ) )
            // InternalBankSystem.g:1401:1: ( ( rule__Employee__NameAssignment_1 ) )
            {
            // InternalBankSystem.g:1401:1: ( ( rule__Employee__NameAssignment_1 ) )
            // InternalBankSystem.g:1402:2: ( rule__Employee__NameAssignment_1 )
            {
             before(grammarAccess.getEmployeeAccess().getNameAssignment_1()); 
            // InternalBankSystem.g:1403:2: ( rule__Employee__NameAssignment_1 )
            // InternalBankSystem.g:1403:3: rule__Employee__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Employee__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__1__Impl"


    // $ANTLR start "rule__Employee__Group__2"
    // InternalBankSystem.g:1411:1: rule__Employee__Group__2 : rule__Employee__Group__2__Impl rule__Employee__Group__3 ;
    public final void rule__Employee__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1415:1: ( rule__Employee__Group__2__Impl rule__Employee__Group__3 )
            // InternalBankSystem.g:1416:2: rule__Employee__Group__2__Impl rule__Employee__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Employee__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__2"


    // $ANTLR start "rule__Employee__Group__2__Impl"
    // InternalBankSystem.g:1423:1: rule__Employee__Group__2__Impl : ( '{' ) ;
    public final void rule__Employee__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1427:1: ( ( '{' ) )
            // InternalBankSystem.g:1428:1: ( '{' )
            {
            // InternalBankSystem.g:1428:1: ( '{' )
            // InternalBankSystem.g:1429:2: '{'
            {
             before(grammarAccess.getEmployeeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__2__Impl"


    // $ANTLR start "rule__Employee__Group__3"
    // InternalBankSystem.g:1438:1: rule__Employee__Group__3 : rule__Employee__Group__3__Impl rule__Employee__Group__4 ;
    public final void rule__Employee__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1442:1: ( rule__Employee__Group__3__Impl rule__Employee__Group__4 )
            // InternalBankSystem.g:1443:2: rule__Employee__Group__3__Impl rule__Employee__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Employee__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__3"


    // $ANTLR start "rule__Employee__Group__3__Impl"
    // InternalBankSystem.g:1450:1: rule__Employee__Group__3__Impl : ( 'Hiring date' ) ;
    public final void rule__Employee__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1454:1: ( ( 'Hiring date' ) )
            // InternalBankSystem.g:1455:1: ( 'Hiring date' )
            {
            // InternalBankSystem.g:1455:1: ( 'Hiring date' )
            // InternalBankSystem.g:1456:2: 'Hiring date'
            {
             before(grammarAccess.getEmployeeAccess().getHiringDateKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getHiringDateKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__3__Impl"


    // $ANTLR start "rule__Employee__Group__4"
    // InternalBankSystem.g:1465:1: rule__Employee__Group__4 : rule__Employee__Group__4__Impl rule__Employee__Group__5 ;
    public final void rule__Employee__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1469:1: ( rule__Employee__Group__4__Impl rule__Employee__Group__5 )
            // InternalBankSystem.g:1470:2: rule__Employee__Group__4__Impl rule__Employee__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Employee__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__4"


    // $ANTLR start "rule__Employee__Group__4__Impl"
    // InternalBankSystem.g:1477:1: rule__Employee__Group__4__Impl : ( ( rule__Employee__DateAssignment_4 ) ) ;
    public final void rule__Employee__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1481:1: ( ( ( rule__Employee__DateAssignment_4 ) ) )
            // InternalBankSystem.g:1482:1: ( ( rule__Employee__DateAssignment_4 ) )
            {
            // InternalBankSystem.g:1482:1: ( ( rule__Employee__DateAssignment_4 ) )
            // InternalBankSystem.g:1483:2: ( rule__Employee__DateAssignment_4 )
            {
             before(grammarAccess.getEmployeeAccess().getDateAssignment_4()); 
            // InternalBankSystem.g:1484:2: ( rule__Employee__DateAssignment_4 )
            // InternalBankSystem.g:1484:3: rule__Employee__DateAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Employee__DateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeAccess().getDateAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__4__Impl"


    // $ANTLR start "rule__Employee__Group__5"
    // InternalBankSystem.g:1492:1: rule__Employee__Group__5 : rule__Employee__Group__5__Impl rule__Employee__Group__6 ;
    public final void rule__Employee__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1496:1: ( rule__Employee__Group__5__Impl rule__Employee__Group__6 )
            // InternalBankSystem.g:1497:2: rule__Employee__Group__5__Impl rule__Employee__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Employee__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__5"


    // $ANTLR start "rule__Employee__Group__5__Impl"
    // InternalBankSystem.g:1504:1: rule__Employee__Group__5__Impl : ( 'Salary' ) ;
    public final void rule__Employee__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1508:1: ( ( 'Salary' ) )
            // InternalBankSystem.g:1509:1: ( 'Salary' )
            {
            // InternalBankSystem.g:1509:1: ( 'Salary' )
            // InternalBankSystem.g:1510:2: 'Salary'
            {
             before(grammarAccess.getEmployeeAccess().getSalaryKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getSalaryKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__5__Impl"


    // $ANTLR start "rule__Employee__Group__6"
    // InternalBankSystem.g:1519:1: rule__Employee__Group__6 : rule__Employee__Group__6__Impl rule__Employee__Group__7 ;
    public final void rule__Employee__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1523:1: ( rule__Employee__Group__6__Impl rule__Employee__Group__7 )
            // InternalBankSystem.g:1524:2: rule__Employee__Group__6__Impl rule__Employee__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__Employee__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__6"


    // $ANTLR start "rule__Employee__Group__6__Impl"
    // InternalBankSystem.g:1531:1: rule__Employee__Group__6__Impl : ( ( rule__Employee__SalaryAssignment_6 ) ) ;
    public final void rule__Employee__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1535:1: ( ( ( rule__Employee__SalaryAssignment_6 ) ) )
            // InternalBankSystem.g:1536:1: ( ( rule__Employee__SalaryAssignment_6 ) )
            {
            // InternalBankSystem.g:1536:1: ( ( rule__Employee__SalaryAssignment_6 ) )
            // InternalBankSystem.g:1537:2: ( rule__Employee__SalaryAssignment_6 )
            {
             before(grammarAccess.getEmployeeAccess().getSalaryAssignment_6()); 
            // InternalBankSystem.g:1538:2: ( rule__Employee__SalaryAssignment_6 )
            // InternalBankSystem.g:1538:3: rule__Employee__SalaryAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Employee__SalaryAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeAccess().getSalaryAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__6__Impl"


    // $ANTLR start "rule__Employee__Group__7"
    // InternalBankSystem.g:1546:1: rule__Employee__Group__7 : rule__Employee__Group__7__Impl rule__Employee__Group__8 ;
    public final void rule__Employee__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1550:1: ( rule__Employee__Group__7__Impl rule__Employee__Group__8 )
            // InternalBankSystem.g:1551:2: rule__Employee__Group__7__Impl rule__Employee__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__Employee__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__7"


    // $ANTLR start "rule__Employee__Group__7__Impl"
    // InternalBankSystem.g:1558:1: rule__Employee__Group__7__Impl : ( 'Current Role' ) ;
    public final void rule__Employee__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1562:1: ( ( 'Current Role' ) )
            // InternalBankSystem.g:1563:1: ( 'Current Role' )
            {
            // InternalBankSystem.g:1563:1: ( 'Current Role' )
            // InternalBankSystem.g:1564:2: 'Current Role'
            {
             before(grammarAccess.getEmployeeAccess().getCurrentRoleKeyword_7()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getCurrentRoleKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__7__Impl"


    // $ANTLR start "rule__Employee__Group__8"
    // InternalBankSystem.g:1573:1: rule__Employee__Group__8 : rule__Employee__Group__8__Impl rule__Employee__Group__9 ;
    public final void rule__Employee__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1577:1: ( rule__Employee__Group__8__Impl rule__Employee__Group__9 )
            // InternalBankSystem.g:1578:2: rule__Employee__Group__8__Impl rule__Employee__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__Employee__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__8"


    // $ANTLR start "rule__Employee__Group__8__Impl"
    // InternalBankSystem.g:1585:1: rule__Employee__Group__8__Impl : ( ( rule__Employee__CurrentRoleAssignment_8 ) ) ;
    public final void rule__Employee__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1589:1: ( ( ( rule__Employee__CurrentRoleAssignment_8 ) ) )
            // InternalBankSystem.g:1590:1: ( ( rule__Employee__CurrentRoleAssignment_8 ) )
            {
            // InternalBankSystem.g:1590:1: ( ( rule__Employee__CurrentRoleAssignment_8 ) )
            // InternalBankSystem.g:1591:2: ( rule__Employee__CurrentRoleAssignment_8 )
            {
             before(grammarAccess.getEmployeeAccess().getCurrentRoleAssignment_8()); 
            // InternalBankSystem.g:1592:2: ( rule__Employee__CurrentRoleAssignment_8 )
            // InternalBankSystem.g:1592:3: rule__Employee__CurrentRoleAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Employee__CurrentRoleAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeAccess().getCurrentRoleAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__8__Impl"


    // $ANTLR start "rule__Employee__Group__9"
    // InternalBankSystem.g:1600:1: rule__Employee__Group__9 : rule__Employee__Group__9__Impl ;
    public final void rule__Employee__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1604:1: ( rule__Employee__Group__9__Impl )
            // InternalBankSystem.g:1605:2: rule__Employee__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Employee__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__9"


    // $ANTLR start "rule__Employee__Group__9__Impl"
    // InternalBankSystem.g:1611:1: rule__Employee__Group__9__Impl : ( '}' ) ;
    public final void rule__Employee__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1615:1: ( ( '}' ) )
            // InternalBankSystem.g:1616:1: ( '}' )
            {
            // InternalBankSystem.g:1616:1: ( '}' )
            // InternalBankSystem.g:1617:2: '}'
            {
             before(grammarAccess.getEmployeeAccess().getRightCurlyBracketKeyword_9()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__9__Impl"


    // $ANTLR start "rule__Account__Group__0"
    // InternalBankSystem.g:1627:1: rule__Account__Group__0 : rule__Account__Group__0__Impl rule__Account__Group__1 ;
    public final void rule__Account__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1631:1: ( rule__Account__Group__0__Impl rule__Account__Group__1 )
            // InternalBankSystem.g:1632:2: rule__Account__Group__0__Impl rule__Account__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Account__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Account__Group__0"


    // $ANTLR start "rule__Account__Group__0__Impl"
    // InternalBankSystem.g:1639:1: rule__Account__Group__0__Impl : ( ( rule__Account__Alternatives_0 ) ) ;
    public final void rule__Account__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1643:1: ( ( ( rule__Account__Alternatives_0 ) ) )
            // InternalBankSystem.g:1644:1: ( ( rule__Account__Alternatives_0 ) )
            {
            // InternalBankSystem.g:1644:1: ( ( rule__Account__Alternatives_0 ) )
            // InternalBankSystem.g:1645:2: ( rule__Account__Alternatives_0 )
            {
             before(grammarAccess.getAccountAccess().getAlternatives_0()); 
            // InternalBankSystem.g:1646:2: ( rule__Account__Alternatives_0 )
            // InternalBankSystem.g:1646:3: rule__Account__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Account__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAccountAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Account__Group__0__Impl"


    // $ANTLR start "rule__Account__Group__1"
    // InternalBankSystem.g:1654:1: rule__Account__Group__1 : rule__Account__Group__1__Impl rule__Account__Group__2 ;
    public final void rule__Account__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1658:1: ( rule__Account__Group__1__Impl rule__Account__Group__2 )
            // InternalBankSystem.g:1659:2: rule__Account__Group__1__Impl rule__Account__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Account__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Account__Group__1"


    // $ANTLR start "rule__Account__Group__1__Impl"
    // InternalBankSystem.g:1666:1: rule__Account__Group__1__Impl : ( 'Holder(s)' ) ;
    public final void rule__Account__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1670:1: ( ( 'Holder(s)' ) )
            // InternalBankSystem.g:1671:1: ( 'Holder(s)' )
            {
            // InternalBankSystem.g:1671:1: ( 'Holder(s)' )
            // InternalBankSystem.g:1672:2: 'Holder(s)'
            {
             before(grammarAccess.getAccountAccess().getHolderSKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getHolderSKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Account__Group__1__Impl"


    // $ANTLR start "rule__Account__Group__2"
    // InternalBankSystem.g:1681:1: rule__Account__Group__2 : rule__Account__Group__2__Impl rule__Account__Group__3 ;
    public final void rule__Account__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1685:1: ( rule__Account__Group__2__Impl rule__Account__Group__3 )
            // InternalBankSystem.g:1686:2: rule__Account__Group__2__Impl rule__Account__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Account__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Account__Group__2"


    // $ANTLR start "rule__Account__Group__2__Impl"
    // InternalBankSystem.g:1693:1: rule__Account__Group__2__Impl : ( ( rule__Account__HolderAssignment_2 ) ) ;
    public final void rule__Account__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1697:1: ( ( ( rule__Account__HolderAssignment_2 ) ) )
            // InternalBankSystem.g:1698:1: ( ( rule__Account__HolderAssignment_2 ) )
            {
            // InternalBankSystem.g:1698:1: ( ( rule__Account__HolderAssignment_2 ) )
            // InternalBankSystem.g:1699:2: ( rule__Account__HolderAssignment_2 )
            {
             before(grammarAccess.getAccountAccess().getHolderAssignment_2()); 
            // InternalBankSystem.g:1700:2: ( rule__Account__HolderAssignment_2 )
            // InternalBankSystem.g:1700:3: rule__Account__HolderAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Account__HolderAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAccountAccess().getHolderAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Account__Group__2__Impl"


    // $ANTLR start "rule__Account__Group__3"
    // InternalBankSystem.g:1708:1: rule__Account__Group__3 : rule__Account__Group__3__Impl rule__Account__Group__4 ;
    public final void rule__Account__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1712:1: ( rule__Account__Group__3__Impl rule__Account__Group__4 )
            // InternalBankSystem.g:1713:2: rule__Account__Group__3__Impl rule__Account__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Account__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Account__Group__3"


    // $ANTLR start "rule__Account__Group__3__Impl"
    // InternalBankSystem.g:1720:1: rule__Account__Group__3__Impl : ( 'Balance' ) ;
    public final void rule__Account__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1724:1: ( ( 'Balance' ) )
            // InternalBankSystem.g:1725:1: ( 'Balance' )
            {
            // InternalBankSystem.g:1725:1: ( 'Balance' )
            // InternalBankSystem.g:1726:2: 'Balance'
            {
             before(grammarAccess.getAccountAccess().getBalanceKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getBalanceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Account__Group__3__Impl"


    // $ANTLR start "rule__Account__Group__4"
    // InternalBankSystem.g:1735:1: rule__Account__Group__4 : rule__Account__Group__4__Impl rule__Account__Group__5 ;
    public final void rule__Account__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1739:1: ( rule__Account__Group__4__Impl rule__Account__Group__5 )
            // InternalBankSystem.g:1740:2: rule__Account__Group__4__Impl rule__Account__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__Account__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Account__Group__4"


    // $ANTLR start "rule__Account__Group__4__Impl"
    // InternalBankSystem.g:1747:1: rule__Account__Group__4__Impl : ( ( rule__Account__BalanceAssignment_4 ) ) ;
    public final void rule__Account__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1751:1: ( ( ( rule__Account__BalanceAssignment_4 ) ) )
            // InternalBankSystem.g:1752:1: ( ( rule__Account__BalanceAssignment_4 ) )
            {
            // InternalBankSystem.g:1752:1: ( ( rule__Account__BalanceAssignment_4 ) )
            // InternalBankSystem.g:1753:2: ( rule__Account__BalanceAssignment_4 )
            {
             before(grammarAccess.getAccountAccess().getBalanceAssignment_4()); 
            // InternalBankSystem.g:1754:2: ( rule__Account__BalanceAssignment_4 )
            // InternalBankSystem.g:1754:3: rule__Account__BalanceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Account__BalanceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAccountAccess().getBalanceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Account__Group__4__Impl"


    // $ANTLR start "rule__Account__Group__5"
    // InternalBankSystem.g:1762:1: rule__Account__Group__5 : rule__Account__Group__5__Impl rule__Account__Group__6 ;
    public final void rule__Account__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1766:1: ( rule__Account__Group__5__Impl rule__Account__Group__6 )
            // InternalBankSystem.g:1767:2: rule__Account__Group__5__Impl rule__Account__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Account__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Account__Group__5"


    // $ANTLR start "rule__Account__Group__5__Impl"
    // InternalBankSystem.g:1774:1: rule__Account__Group__5__Impl : ( 'Account Number' ) ;
    public final void rule__Account__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1778:1: ( ( 'Account Number' ) )
            // InternalBankSystem.g:1779:1: ( 'Account Number' )
            {
            // InternalBankSystem.g:1779:1: ( 'Account Number' )
            // InternalBankSystem.g:1780:2: 'Account Number'
            {
             before(grammarAccess.getAccountAccess().getAccountNumberKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getAccountNumberKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Account__Group__5__Impl"


    // $ANTLR start "rule__Account__Group__6"
    // InternalBankSystem.g:1789:1: rule__Account__Group__6 : rule__Account__Group__6__Impl rule__Account__Group__7 ;
    public final void rule__Account__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1793:1: ( rule__Account__Group__6__Impl rule__Account__Group__7 )
            // InternalBankSystem.g:1794:2: rule__Account__Group__6__Impl rule__Account__Group__7
            {
            pushFollow(FOLLOW_30);
            rule__Account__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Account__Group__6"


    // $ANTLR start "rule__Account__Group__6__Impl"
    // InternalBankSystem.g:1801:1: rule__Account__Group__6__Impl : ( ( rule__Account__AccountNumAssignment_6 ) ) ;
    public final void rule__Account__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1805:1: ( ( ( rule__Account__AccountNumAssignment_6 ) ) )
            // InternalBankSystem.g:1806:1: ( ( rule__Account__AccountNumAssignment_6 ) )
            {
            // InternalBankSystem.g:1806:1: ( ( rule__Account__AccountNumAssignment_6 ) )
            // InternalBankSystem.g:1807:2: ( rule__Account__AccountNumAssignment_6 )
            {
             before(grammarAccess.getAccountAccess().getAccountNumAssignment_6()); 
            // InternalBankSystem.g:1808:2: ( rule__Account__AccountNumAssignment_6 )
            // InternalBankSystem.g:1808:3: rule__Account__AccountNumAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Account__AccountNumAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAccountAccess().getAccountNumAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Account__Group__6__Impl"


    // $ANTLR start "rule__Account__Group__7"
    // InternalBankSystem.g:1816:1: rule__Account__Group__7 : rule__Account__Group__7__Impl rule__Account__Group__8 ;
    public final void rule__Account__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1820:1: ( rule__Account__Group__7__Impl rule__Account__Group__8 )
            // InternalBankSystem.g:1821:2: rule__Account__Group__7__Impl rule__Account__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Account__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Account__Group__7"


    // $ANTLR start "rule__Account__Group__7__Impl"
    // InternalBankSystem.g:1828:1: rule__Account__Group__7__Impl : ( 'MFA Type' ) ;
    public final void rule__Account__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1832:1: ( ( 'MFA Type' ) )
            // InternalBankSystem.g:1833:1: ( 'MFA Type' )
            {
            // InternalBankSystem.g:1833:1: ( 'MFA Type' )
            // InternalBankSystem.g:1834:2: 'MFA Type'
            {
             before(grammarAccess.getAccountAccess().getMFATypeKeyword_7()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getMFATypeKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Account__Group__7__Impl"


    // $ANTLR start "rule__Account__Group__8"
    // InternalBankSystem.g:1843:1: rule__Account__Group__8 : rule__Account__Group__8__Impl rule__Account__Group__9 ;
    public final void rule__Account__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1847:1: ( rule__Account__Group__8__Impl rule__Account__Group__9 )
            // InternalBankSystem.g:1848:2: rule__Account__Group__8__Impl rule__Account__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__Account__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Account__Group__8"


    // $ANTLR start "rule__Account__Group__8__Impl"
    // InternalBankSystem.g:1855:1: rule__Account__Group__8__Impl : ( ( rule__Account__MfaTypeAssignment_8 ) ) ;
    public final void rule__Account__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1859:1: ( ( ( rule__Account__MfaTypeAssignment_8 ) ) )
            // InternalBankSystem.g:1860:1: ( ( rule__Account__MfaTypeAssignment_8 ) )
            {
            // InternalBankSystem.g:1860:1: ( ( rule__Account__MfaTypeAssignment_8 ) )
            // InternalBankSystem.g:1861:2: ( rule__Account__MfaTypeAssignment_8 )
            {
             before(grammarAccess.getAccountAccess().getMfaTypeAssignment_8()); 
            // InternalBankSystem.g:1862:2: ( rule__Account__MfaTypeAssignment_8 )
            // InternalBankSystem.g:1862:3: rule__Account__MfaTypeAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Account__MfaTypeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getAccountAccess().getMfaTypeAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Account__Group__8__Impl"


    // $ANTLR start "rule__Account__Group__9"
    // InternalBankSystem.g:1870:1: rule__Account__Group__9 : rule__Account__Group__9__Impl ;
    public final void rule__Account__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1874:1: ( rule__Account__Group__9__Impl )
            // InternalBankSystem.g:1875:2: rule__Account__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Account__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Account__Group__9"


    // $ANTLR start "rule__Account__Group__9__Impl"
    // InternalBankSystem.g:1881:1: rule__Account__Group__9__Impl : ( '}' ) ;
    public final void rule__Account__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1885:1: ( ( '}' ) )
            // InternalBankSystem.g:1886:1: ( '}' )
            {
            // InternalBankSystem.g:1886:1: ( '}' )
            // InternalBankSystem.g:1887:2: '}'
            {
             before(grammarAccess.getAccountAccess().getRightCurlyBracketKeyword_9()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Account__Group__9__Impl"


    // $ANTLR start "rule__SavingsAccount__Group__0"
    // InternalBankSystem.g:1897:1: rule__SavingsAccount__Group__0 : rule__SavingsAccount__Group__0__Impl rule__SavingsAccount__Group__1 ;
    public final void rule__SavingsAccount__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1901:1: ( rule__SavingsAccount__Group__0__Impl rule__SavingsAccount__Group__1 )
            // InternalBankSystem.g:1902:2: rule__SavingsAccount__Group__0__Impl rule__SavingsAccount__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__SavingsAccount__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SavingsAccount__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SavingsAccount__Group__0"


    // $ANTLR start "rule__SavingsAccount__Group__0__Impl"
    // InternalBankSystem.g:1909:1: rule__SavingsAccount__Group__0__Impl : ( 'Savings Account {' ) ;
    public final void rule__SavingsAccount__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1913:1: ( ( 'Savings Account {' ) )
            // InternalBankSystem.g:1914:1: ( 'Savings Account {' )
            {
            // InternalBankSystem.g:1914:1: ( 'Savings Account {' )
            // InternalBankSystem.g:1915:2: 'Savings Account {'
            {
             before(grammarAccess.getSavingsAccountAccess().getSavingsAccountKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSavingsAccountAccess().getSavingsAccountKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SavingsAccount__Group__0__Impl"


    // $ANTLR start "rule__SavingsAccount__Group__1"
    // InternalBankSystem.g:1924:1: rule__SavingsAccount__Group__1 : rule__SavingsAccount__Group__1__Impl rule__SavingsAccount__Group__2 ;
    public final void rule__SavingsAccount__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1928:1: ( rule__SavingsAccount__Group__1__Impl rule__SavingsAccount__Group__2 )
            // InternalBankSystem.g:1929:2: rule__SavingsAccount__Group__1__Impl rule__SavingsAccount__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__SavingsAccount__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SavingsAccount__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SavingsAccount__Group__1"


    // $ANTLR start "rule__SavingsAccount__Group__1__Impl"
    // InternalBankSystem.g:1936:1: rule__SavingsAccount__Group__1__Impl : ( 'Interest rate' ) ;
    public final void rule__SavingsAccount__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1940:1: ( ( 'Interest rate' ) )
            // InternalBankSystem.g:1941:1: ( 'Interest rate' )
            {
            // InternalBankSystem.g:1941:1: ( 'Interest rate' )
            // InternalBankSystem.g:1942:2: 'Interest rate'
            {
             before(grammarAccess.getSavingsAccountAccess().getInterestRateKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSavingsAccountAccess().getInterestRateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SavingsAccount__Group__1__Impl"


    // $ANTLR start "rule__SavingsAccount__Group__2"
    // InternalBankSystem.g:1951:1: rule__SavingsAccount__Group__2 : rule__SavingsAccount__Group__2__Impl ;
    public final void rule__SavingsAccount__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1955:1: ( rule__SavingsAccount__Group__2__Impl )
            // InternalBankSystem.g:1956:2: rule__SavingsAccount__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SavingsAccount__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SavingsAccount__Group__2"


    // $ANTLR start "rule__SavingsAccount__Group__2__Impl"
    // InternalBankSystem.g:1962:1: rule__SavingsAccount__Group__2__Impl : ( ( rule__SavingsAccount__IntRateAssignment_2 ) ) ;
    public final void rule__SavingsAccount__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1966:1: ( ( ( rule__SavingsAccount__IntRateAssignment_2 ) ) )
            // InternalBankSystem.g:1967:1: ( ( rule__SavingsAccount__IntRateAssignment_2 ) )
            {
            // InternalBankSystem.g:1967:1: ( ( rule__SavingsAccount__IntRateAssignment_2 ) )
            // InternalBankSystem.g:1968:2: ( rule__SavingsAccount__IntRateAssignment_2 )
            {
             before(grammarAccess.getSavingsAccountAccess().getIntRateAssignment_2()); 
            // InternalBankSystem.g:1969:2: ( rule__SavingsAccount__IntRateAssignment_2 )
            // InternalBankSystem.g:1969:3: rule__SavingsAccount__IntRateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SavingsAccount__IntRateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSavingsAccountAccess().getIntRateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SavingsAccount__Group__2__Impl"


    // $ANTLR start "rule__CheckingAccount__Group__0"
    // InternalBankSystem.g:1978:1: rule__CheckingAccount__Group__0 : rule__CheckingAccount__Group__0__Impl rule__CheckingAccount__Group__1 ;
    public final void rule__CheckingAccount__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1982:1: ( rule__CheckingAccount__Group__0__Impl rule__CheckingAccount__Group__1 )
            // InternalBankSystem.g:1983:2: rule__CheckingAccount__Group__0__Impl rule__CheckingAccount__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__CheckingAccount__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CheckingAccount__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckingAccount__Group__0"


    // $ANTLR start "rule__CheckingAccount__Group__0__Impl"
    // InternalBankSystem.g:1990:1: rule__CheckingAccount__Group__0__Impl : ( 'Checking Account {' ) ;
    public final void rule__CheckingAccount__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1994:1: ( ( 'Checking Account {' ) )
            // InternalBankSystem.g:1995:1: ( 'Checking Account {' )
            {
            // InternalBankSystem.g:1995:1: ( 'Checking Account {' )
            // InternalBankSystem.g:1996:2: 'Checking Account {'
            {
             before(grammarAccess.getCheckingAccountAccess().getCheckingAccountKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCheckingAccountAccess().getCheckingAccountKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckingAccount__Group__0__Impl"


    // $ANTLR start "rule__CheckingAccount__Group__1"
    // InternalBankSystem.g:2005:1: rule__CheckingAccount__Group__1 : rule__CheckingAccount__Group__1__Impl rule__CheckingAccount__Group__2 ;
    public final void rule__CheckingAccount__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2009:1: ( rule__CheckingAccount__Group__1__Impl rule__CheckingAccount__Group__2 )
            // InternalBankSystem.g:2010:2: rule__CheckingAccount__Group__1__Impl rule__CheckingAccount__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__CheckingAccount__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CheckingAccount__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckingAccount__Group__1"


    // $ANTLR start "rule__CheckingAccount__Group__1__Impl"
    // InternalBankSystem.g:2017:1: rule__CheckingAccount__Group__1__Impl : ( 'Debits per month' ) ;
    public final void rule__CheckingAccount__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2021:1: ( ( 'Debits per month' ) )
            // InternalBankSystem.g:2022:1: ( 'Debits per month' )
            {
            // InternalBankSystem.g:2022:1: ( 'Debits per month' )
            // InternalBankSystem.g:2023:2: 'Debits per month'
            {
             before(grammarAccess.getCheckingAccountAccess().getDebitsPerMonthKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCheckingAccountAccess().getDebitsPerMonthKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckingAccount__Group__1__Impl"


    // $ANTLR start "rule__CheckingAccount__Group__2"
    // InternalBankSystem.g:2032:1: rule__CheckingAccount__Group__2 : rule__CheckingAccount__Group__2__Impl ;
    public final void rule__CheckingAccount__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2036:1: ( rule__CheckingAccount__Group__2__Impl )
            // InternalBankSystem.g:2037:2: rule__CheckingAccount__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CheckingAccount__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckingAccount__Group__2"


    // $ANTLR start "rule__CheckingAccount__Group__2__Impl"
    // InternalBankSystem.g:2043:1: rule__CheckingAccount__Group__2__Impl : ( ( rule__CheckingAccount__DepPerMonthAssignment_2 ) ) ;
    public final void rule__CheckingAccount__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2047:1: ( ( ( rule__CheckingAccount__DepPerMonthAssignment_2 ) ) )
            // InternalBankSystem.g:2048:1: ( ( rule__CheckingAccount__DepPerMonthAssignment_2 ) )
            {
            // InternalBankSystem.g:2048:1: ( ( rule__CheckingAccount__DepPerMonthAssignment_2 ) )
            // InternalBankSystem.g:2049:2: ( rule__CheckingAccount__DepPerMonthAssignment_2 )
            {
             before(grammarAccess.getCheckingAccountAccess().getDepPerMonthAssignment_2()); 
            // InternalBankSystem.g:2050:2: ( rule__CheckingAccount__DepPerMonthAssignment_2 )
            // InternalBankSystem.g:2050:3: rule__CheckingAccount__DepPerMonthAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CheckingAccount__DepPerMonthAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCheckingAccountAccess().getDepPerMonthAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckingAccount__Group__2__Impl"


    // $ANTLR start "rule__MortgageAccount__Group__0"
    // InternalBankSystem.g:2059:1: rule__MortgageAccount__Group__0 : rule__MortgageAccount__Group__0__Impl rule__MortgageAccount__Group__1 ;
    public final void rule__MortgageAccount__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2063:1: ( rule__MortgageAccount__Group__0__Impl rule__MortgageAccount__Group__1 )
            // InternalBankSystem.g:2064:2: rule__MortgageAccount__Group__0__Impl rule__MortgageAccount__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__MortgageAccount__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MortgageAccount__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MortgageAccount__Group__0"


    // $ANTLR start "rule__MortgageAccount__Group__0__Impl"
    // InternalBankSystem.g:2071:1: rule__MortgageAccount__Group__0__Impl : ( 'Mortgage Account {' ) ;
    public final void rule__MortgageAccount__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2075:1: ( ( 'Mortgage Account {' ) )
            // InternalBankSystem.g:2076:1: ( 'Mortgage Account {' )
            {
            // InternalBankSystem.g:2076:1: ( 'Mortgage Account {' )
            // InternalBankSystem.g:2077:2: 'Mortgage Account {'
            {
             before(grammarAccess.getMortgageAccountAccess().getMortgageAccountKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getMortgageAccountAccess().getMortgageAccountKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MortgageAccount__Group__0__Impl"


    // $ANTLR start "rule__MortgageAccount__Group__1"
    // InternalBankSystem.g:2086:1: rule__MortgageAccount__Group__1 : rule__MortgageAccount__Group__1__Impl rule__MortgageAccount__Group__2 ;
    public final void rule__MortgageAccount__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2090:1: ( rule__MortgageAccount__Group__1__Impl rule__MortgageAccount__Group__2 )
            // InternalBankSystem.g:2091:2: rule__MortgageAccount__Group__1__Impl rule__MortgageAccount__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__MortgageAccount__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MortgageAccount__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MortgageAccount__Group__1"


    // $ANTLR start "rule__MortgageAccount__Group__1__Impl"
    // InternalBankSystem.g:2098:1: rule__MortgageAccount__Group__1__Impl : ( 'Loan period' ) ;
    public final void rule__MortgageAccount__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2102:1: ( ( 'Loan period' ) )
            // InternalBankSystem.g:2103:1: ( 'Loan period' )
            {
            // InternalBankSystem.g:2103:1: ( 'Loan period' )
            // InternalBankSystem.g:2104:2: 'Loan period'
            {
             before(grammarAccess.getMortgageAccountAccess().getLoanPeriodKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getMortgageAccountAccess().getLoanPeriodKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MortgageAccount__Group__1__Impl"


    // $ANTLR start "rule__MortgageAccount__Group__2"
    // InternalBankSystem.g:2113:1: rule__MortgageAccount__Group__2 : rule__MortgageAccount__Group__2__Impl ;
    public final void rule__MortgageAccount__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2117:1: ( rule__MortgageAccount__Group__2__Impl )
            // InternalBankSystem.g:2118:2: rule__MortgageAccount__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MortgageAccount__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MortgageAccount__Group__2"


    // $ANTLR start "rule__MortgageAccount__Group__2__Impl"
    // InternalBankSystem.g:2124:1: rule__MortgageAccount__Group__2__Impl : ( ( rule__MortgageAccount__LoanPeriodAssignment_2 ) ) ;
    public final void rule__MortgageAccount__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2128:1: ( ( ( rule__MortgageAccount__LoanPeriodAssignment_2 ) ) )
            // InternalBankSystem.g:2129:1: ( ( rule__MortgageAccount__LoanPeriodAssignment_2 ) )
            {
            // InternalBankSystem.g:2129:1: ( ( rule__MortgageAccount__LoanPeriodAssignment_2 ) )
            // InternalBankSystem.g:2130:2: ( rule__MortgageAccount__LoanPeriodAssignment_2 )
            {
             before(grammarAccess.getMortgageAccountAccess().getLoanPeriodAssignment_2()); 
            // InternalBankSystem.g:2131:2: ( rule__MortgageAccount__LoanPeriodAssignment_2 )
            // InternalBankSystem.g:2131:3: rule__MortgageAccount__LoanPeriodAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MortgageAccount__LoanPeriodAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMortgageAccountAccess().getLoanPeriodAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MortgageAccount__Group__2__Impl"


    // $ANTLR start "rule__Transaction__Group__0"
    // InternalBankSystem.g:2140:1: rule__Transaction__Group__0 : rule__Transaction__Group__0__Impl rule__Transaction__Group__1 ;
    public final void rule__Transaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2144:1: ( rule__Transaction__Group__0__Impl rule__Transaction__Group__1 )
            // InternalBankSystem.g:2145:2: rule__Transaction__Group__0__Impl rule__Transaction__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Transaction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__0"


    // $ANTLR start "rule__Transaction__Group__0__Impl"
    // InternalBankSystem.g:2152:1: rule__Transaction__Group__0__Impl : ( 'transaction {' ) ;
    public final void rule__Transaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2156:1: ( ( 'transaction {' ) )
            // InternalBankSystem.g:2157:1: ( 'transaction {' )
            {
            // InternalBankSystem.g:2157:1: ( 'transaction {' )
            // InternalBankSystem.g:2158:2: 'transaction {'
            {
             before(grammarAccess.getTransactionAccess().getTransactionKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getTransactionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__0__Impl"


    // $ANTLR start "rule__Transaction__Group__1"
    // InternalBankSystem.g:2167:1: rule__Transaction__Group__1 : rule__Transaction__Group__1__Impl rule__Transaction__Group__2 ;
    public final void rule__Transaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2171:1: ( rule__Transaction__Group__1__Impl rule__Transaction__Group__2 )
            // InternalBankSystem.g:2172:2: rule__Transaction__Group__1__Impl rule__Transaction__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__Transaction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__1"


    // $ANTLR start "rule__Transaction__Group__1__Impl"
    // InternalBankSystem.g:2179:1: rule__Transaction__Group__1__Impl : ( 'Account:' ) ;
    public final void rule__Transaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2183:1: ( ( 'Account:' ) )
            // InternalBankSystem.g:2184:1: ( 'Account:' )
            {
            // InternalBankSystem.g:2184:1: ( 'Account:' )
            // InternalBankSystem.g:2185:2: 'Account:'
            {
             before(grammarAccess.getTransactionAccess().getAccountKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getAccountKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__1__Impl"


    // $ANTLR start "rule__Transaction__Group__2"
    // InternalBankSystem.g:2194:1: rule__Transaction__Group__2 : rule__Transaction__Group__2__Impl rule__Transaction__Group__3 ;
    public final void rule__Transaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2198:1: ( rule__Transaction__Group__2__Impl rule__Transaction__Group__3 )
            // InternalBankSystem.g:2199:2: rule__Transaction__Group__2__Impl rule__Transaction__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__Transaction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__2"


    // $ANTLR start "rule__Transaction__Group__2__Impl"
    // InternalBankSystem.g:2206:1: rule__Transaction__Group__2__Impl : ( ( rule__Transaction__AccountAssignment_2 ) ) ;
    public final void rule__Transaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2210:1: ( ( ( rule__Transaction__AccountAssignment_2 ) ) )
            // InternalBankSystem.g:2211:1: ( ( rule__Transaction__AccountAssignment_2 ) )
            {
            // InternalBankSystem.g:2211:1: ( ( rule__Transaction__AccountAssignment_2 ) )
            // InternalBankSystem.g:2212:2: ( rule__Transaction__AccountAssignment_2 )
            {
             before(grammarAccess.getTransactionAccess().getAccountAssignment_2()); 
            // InternalBankSystem.g:2213:2: ( rule__Transaction__AccountAssignment_2 )
            // InternalBankSystem.g:2213:3: rule__Transaction__AccountAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__AccountAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getAccountAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__2__Impl"


    // $ANTLR start "rule__Transaction__Group__3"
    // InternalBankSystem.g:2221:1: rule__Transaction__Group__3 : rule__Transaction__Group__3__Impl rule__Transaction__Group__4 ;
    public final void rule__Transaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2225:1: ( rule__Transaction__Group__3__Impl rule__Transaction__Group__4 )
            // InternalBankSystem.g:2226:2: rule__Transaction__Group__3__Impl rule__Transaction__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Transaction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__3"


    // $ANTLR start "rule__Transaction__Group__3__Impl"
    // InternalBankSystem.g:2233:1: rule__Transaction__Group__3__Impl : ( 'Amount:' ) ;
    public final void rule__Transaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2237:1: ( ( 'Amount:' ) )
            // InternalBankSystem.g:2238:1: ( 'Amount:' )
            {
            // InternalBankSystem.g:2238:1: ( 'Amount:' )
            // InternalBankSystem.g:2239:2: 'Amount:'
            {
             before(grammarAccess.getTransactionAccess().getAmountKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getAmountKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__3__Impl"


    // $ANTLR start "rule__Transaction__Group__4"
    // InternalBankSystem.g:2248:1: rule__Transaction__Group__4 : rule__Transaction__Group__4__Impl rule__Transaction__Group__5 ;
    public final void rule__Transaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2252:1: ( rule__Transaction__Group__4__Impl rule__Transaction__Group__5 )
            // InternalBankSystem.g:2253:2: rule__Transaction__Group__4__Impl rule__Transaction__Group__5
            {
            pushFollow(FOLLOW_37);
            rule__Transaction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__4"


    // $ANTLR start "rule__Transaction__Group__4__Impl"
    // InternalBankSystem.g:2260:1: rule__Transaction__Group__4__Impl : ( ( rule__Transaction__AmountAssignment_4 ) ) ;
    public final void rule__Transaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2264:1: ( ( ( rule__Transaction__AmountAssignment_4 ) ) )
            // InternalBankSystem.g:2265:1: ( ( rule__Transaction__AmountAssignment_4 ) )
            {
            // InternalBankSystem.g:2265:1: ( ( rule__Transaction__AmountAssignment_4 ) )
            // InternalBankSystem.g:2266:2: ( rule__Transaction__AmountAssignment_4 )
            {
             before(grammarAccess.getTransactionAccess().getAmountAssignment_4()); 
            // InternalBankSystem.g:2267:2: ( rule__Transaction__AmountAssignment_4 )
            // InternalBankSystem.g:2267:3: rule__Transaction__AmountAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__AmountAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getAmountAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__4__Impl"


    // $ANTLR start "rule__Transaction__Group__5"
    // InternalBankSystem.g:2275:1: rule__Transaction__Group__5 : rule__Transaction__Group__5__Impl rule__Transaction__Group__6 ;
    public final void rule__Transaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2279:1: ( rule__Transaction__Group__5__Impl rule__Transaction__Group__6 )
            // InternalBankSystem.g:2280:2: rule__Transaction__Group__5__Impl rule__Transaction__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Transaction__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__5"


    // $ANTLR start "rule__Transaction__Group__5__Impl"
    // InternalBankSystem.g:2287:1: rule__Transaction__Group__5__Impl : ( 'Date' ) ;
    public final void rule__Transaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2291:1: ( ( 'Date' ) )
            // InternalBankSystem.g:2292:1: ( 'Date' )
            {
            // InternalBankSystem.g:2292:1: ( 'Date' )
            // InternalBankSystem.g:2293:2: 'Date'
            {
             before(grammarAccess.getTransactionAccess().getDateKeyword_5()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getDateKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__5__Impl"


    // $ANTLR start "rule__Transaction__Group__6"
    // InternalBankSystem.g:2302:1: rule__Transaction__Group__6 : rule__Transaction__Group__6__Impl rule__Transaction__Group__7 ;
    public final void rule__Transaction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2306:1: ( rule__Transaction__Group__6__Impl rule__Transaction__Group__7 )
            // InternalBankSystem.g:2307:2: rule__Transaction__Group__6__Impl rule__Transaction__Group__7
            {
            pushFollow(FOLLOW_38);
            rule__Transaction__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__6"


    // $ANTLR start "rule__Transaction__Group__6__Impl"
    // InternalBankSystem.g:2314:1: rule__Transaction__Group__6__Impl : ( ( rule__Transaction__DateAssignment_6 ) ) ;
    public final void rule__Transaction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2318:1: ( ( ( rule__Transaction__DateAssignment_6 ) ) )
            // InternalBankSystem.g:2319:1: ( ( rule__Transaction__DateAssignment_6 ) )
            {
            // InternalBankSystem.g:2319:1: ( ( rule__Transaction__DateAssignment_6 ) )
            // InternalBankSystem.g:2320:2: ( rule__Transaction__DateAssignment_6 )
            {
             before(grammarAccess.getTransactionAccess().getDateAssignment_6()); 
            // InternalBankSystem.g:2321:2: ( rule__Transaction__DateAssignment_6 )
            // InternalBankSystem.g:2321:3: rule__Transaction__DateAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__DateAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getDateAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__6__Impl"


    // $ANTLR start "rule__Transaction__Group__7"
    // InternalBankSystem.g:2329:1: rule__Transaction__Group__7 : rule__Transaction__Group__7__Impl rule__Transaction__Group__8 ;
    public final void rule__Transaction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2333:1: ( rule__Transaction__Group__7__Impl rule__Transaction__Group__8 )
            // InternalBankSystem.g:2334:2: rule__Transaction__Group__7__Impl rule__Transaction__Group__8
            {
            pushFollow(FOLLOW_39);
            rule__Transaction__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__7"


    // $ANTLR start "rule__Transaction__Group__7__Impl"
    // InternalBankSystem.g:2341:1: rule__Transaction__Group__7__Impl : ( 'Debit' ) ;
    public final void rule__Transaction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2345:1: ( ( 'Debit' ) )
            // InternalBankSystem.g:2346:1: ( 'Debit' )
            {
            // InternalBankSystem.g:2346:1: ( 'Debit' )
            // InternalBankSystem.g:2347:2: 'Debit'
            {
             before(grammarAccess.getTransactionAccess().getDebitKeyword_7()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getDebitKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__7__Impl"


    // $ANTLR start "rule__Transaction__Group__8"
    // InternalBankSystem.g:2356:1: rule__Transaction__Group__8 : rule__Transaction__Group__8__Impl rule__Transaction__Group__9 ;
    public final void rule__Transaction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2360:1: ( rule__Transaction__Group__8__Impl rule__Transaction__Group__9 )
            // InternalBankSystem.g:2361:2: rule__Transaction__Group__8__Impl rule__Transaction__Group__9
            {
            pushFollow(FOLLOW_40);
            rule__Transaction__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__8"


    // $ANTLR start "rule__Transaction__Group__8__Impl"
    // InternalBankSystem.g:2368:1: rule__Transaction__Group__8__Impl : ( ( rule__Transaction__DebitAssignment_8 ) ) ;
    public final void rule__Transaction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2372:1: ( ( ( rule__Transaction__DebitAssignment_8 ) ) )
            // InternalBankSystem.g:2373:1: ( ( rule__Transaction__DebitAssignment_8 ) )
            {
            // InternalBankSystem.g:2373:1: ( ( rule__Transaction__DebitAssignment_8 ) )
            // InternalBankSystem.g:2374:2: ( rule__Transaction__DebitAssignment_8 )
            {
             before(grammarAccess.getTransactionAccess().getDebitAssignment_8()); 
            // InternalBankSystem.g:2375:2: ( rule__Transaction__DebitAssignment_8 )
            // InternalBankSystem.g:2375:3: rule__Transaction__DebitAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__DebitAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getDebitAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__8__Impl"


    // $ANTLR start "rule__Transaction__Group__9"
    // InternalBankSystem.g:2383:1: rule__Transaction__Group__9 : rule__Transaction__Group__9__Impl rule__Transaction__Group__10 ;
    public final void rule__Transaction__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2387:1: ( rule__Transaction__Group__9__Impl rule__Transaction__Group__10 )
            // InternalBankSystem.g:2388:2: rule__Transaction__Group__9__Impl rule__Transaction__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Transaction__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__9"


    // $ANTLR start "rule__Transaction__Group__9__Impl"
    // InternalBankSystem.g:2395:1: rule__Transaction__Group__9__Impl : ( 'Vendor name' ) ;
    public final void rule__Transaction__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2399:1: ( ( 'Vendor name' ) )
            // InternalBankSystem.g:2400:1: ( 'Vendor name' )
            {
            // InternalBankSystem.g:2400:1: ( 'Vendor name' )
            // InternalBankSystem.g:2401:2: 'Vendor name'
            {
             before(grammarAccess.getTransactionAccess().getVendorNameKeyword_9()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getVendorNameKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__9__Impl"


    // $ANTLR start "rule__Transaction__Group__10"
    // InternalBankSystem.g:2410:1: rule__Transaction__Group__10 : rule__Transaction__Group__10__Impl rule__Transaction__Group__11 ;
    public final void rule__Transaction__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2414:1: ( rule__Transaction__Group__10__Impl rule__Transaction__Group__11 )
            // InternalBankSystem.g:2415:2: rule__Transaction__Group__10__Impl rule__Transaction__Group__11
            {
            pushFollow(FOLLOW_19);
            rule__Transaction__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__10"


    // $ANTLR start "rule__Transaction__Group__10__Impl"
    // InternalBankSystem.g:2422:1: rule__Transaction__Group__10__Impl : ( ( rule__Transaction__VendorNameAssignment_10 ) ) ;
    public final void rule__Transaction__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2426:1: ( ( ( rule__Transaction__VendorNameAssignment_10 ) ) )
            // InternalBankSystem.g:2427:1: ( ( rule__Transaction__VendorNameAssignment_10 ) )
            {
            // InternalBankSystem.g:2427:1: ( ( rule__Transaction__VendorNameAssignment_10 ) )
            // InternalBankSystem.g:2428:2: ( rule__Transaction__VendorNameAssignment_10 )
            {
             before(grammarAccess.getTransactionAccess().getVendorNameAssignment_10()); 
            // InternalBankSystem.g:2429:2: ( rule__Transaction__VendorNameAssignment_10 )
            // InternalBankSystem.g:2429:3: rule__Transaction__VendorNameAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__VendorNameAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getVendorNameAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__10__Impl"


    // $ANTLR start "rule__Transaction__Group__11"
    // InternalBankSystem.g:2437:1: rule__Transaction__Group__11 : rule__Transaction__Group__11__Impl ;
    public final void rule__Transaction__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2441:1: ( rule__Transaction__Group__11__Impl )
            // InternalBankSystem.g:2442:2: rule__Transaction__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__11"


    // $ANTLR start "rule__Transaction__Group__11__Impl"
    // InternalBankSystem.g:2448:1: rule__Transaction__Group__11__Impl : ( '}' ) ;
    public final void rule__Transaction__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2452:1: ( ( '}' ) )
            // InternalBankSystem.g:2453:1: ( '}' )
            {
            // InternalBankSystem.g:2453:1: ( '}' )
            // InternalBankSystem.g:2454:2: '}'
            {
             before(grammarAccess.getTransactionAccess().getRightCurlyBracketKeyword_11()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__11__Impl"


    // $ANTLR start "rule__Date__Group__0"
    // InternalBankSystem.g:2464:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2468:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // InternalBankSystem.g:2469:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__Date__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__0"


    // $ANTLR start "rule__Date__Group__0__Impl"
    // InternalBankSystem.g:2476:1: rule__Date__Group__0__Impl : ( ( rule__Date__YearAssignment_0 ) ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2480:1: ( ( ( rule__Date__YearAssignment_0 ) ) )
            // InternalBankSystem.g:2481:1: ( ( rule__Date__YearAssignment_0 ) )
            {
            // InternalBankSystem.g:2481:1: ( ( rule__Date__YearAssignment_0 ) )
            // InternalBankSystem.g:2482:2: ( rule__Date__YearAssignment_0 )
            {
             before(grammarAccess.getDateAccess().getYearAssignment_0()); 
            // InternalBankSystem.g:2483:2: ( rule__Date__YearAssignment_0 )
            // InternalBankSystem.g:2483:3: rule__Date__YearAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Date__YearAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getYearAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__0__Impl"


    // $ANTLR start "rule__Date__Group__1"
    // InternalBankSystem.g:2491:1: rule__Date__Group__1 : rule__Date__Group__1__Impl rule__Date__Group__2 ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2495:1: ( rule__Date__Group__1__Impl rule__Date__Group__2 )
            // InternalBankSystem.g:2496:2: rule__Date__Group__1__Impl rule__Date__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Date__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__1"


    // $ANTLR start "rule__Date__Group__1__Impl"
    // InternalBankSystem.g:2503:1: rule__Date__Group__1__Impl : ( '/' ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2507:1: ( ( '/' ) )
            // InternalBankSystem.g:2508:1: ( '/' )
            {
            // InternalBankSystem.g:2508:1: ( '/' )
            // InternalBankSystem.g:2509:2: '/'
            {
             before(grammarAccess.getDateAccess().getSolidusKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getSolidusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__1__Impl"


    // $ANTLR start "rule__Date__Group__2"
    // InternalBankSystem.g:2518:1: rule__Date__Group__2 : rule__Date__Group__2__Impl rule__Date__Group__3 ;
    public final void rule__Date__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2522:1: ( rule__Date__Group__2__Impl rule__Date__Group__3 )
            // InternalBankSystem.g:2523:2: rule__Date__Group__2__Impl rule__Date__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__Date__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__2"


    // $ANTLR start "rule__Date__Group__2__Impl"
    // InternalBankSystem.g:2530:1: rule__Date__Group__2__Impl : ( ( rule__Date__MonthAssignment_2 ) ) ;
    public final void rule__Date__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2534:1: ( ( ( rule__Date__MonthAssignment_2 ) ) )
            // InternalBankSystem.g:2535:1: ( ( rule__Date__MonthAssignment_2 ) )
            {
            // InternalBankSystem.g:2535:1: ( ( rule__Date__MonthAssignment_2 ) )
            // InternalBankSystem.g:2536:2: ( rule__Date__MonthAssignment_2 )
            {
             before(grammarAccess.getDateAccess().getMonthAssignment_2()); 
            // InternalBankSystem.g:2537:2: ( rule__Date__MonthAssignment_2 )
            // InternalBankSystem.g:2537:3: rule__Date__MonthAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Date__MonthAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getMonthAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__2__Impl"


    // $ANTLR start "rule__Date__Group__3"
    // InternalBankSystem.g:2545:1: rule__Date__Group__3 : rule__Date__Group__3__Impl rule__Date__Group__4 ;
    public final void rule__Date__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2549:1: ( rule__Date__Group__3__Impl rule__Date__Group__4 )
            // InternalBankSystem.g:2550:2: rule__Date__Group__3__Impl rule__Date__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Date__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__3"


    // $ANTLR start "rule__Date__Group__3__Impl"
    // InternalBankSystem.g:2557:1: rule__Date__Group__3__Impl : ( '/' ) ;
    public final void rule__Date__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2561:1: ( ( '/' ) )
            // InternalBankSystem.g:2562:1: ( '/' )
            {
            // InternalBankSystem.g:2562:1: ( '/' )
            // InternalBankSystem.g:2563:2: '/'
            {
             before(grammarAccess.getDateAccess().getSolidusKeyword_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getSolidusKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__3__Impl"


    // $ANTLR start "rule__Date__Group__4"
    // InternalBankSystem.g:2572:1: rule__Date__Group__4 : rule__Date__Group__4__Impl ;
    public final void rule__Date__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2576:1: ( rule__Date__Group__4__Impl )
            // InternalBankSystem.g:2577:2: rule__Date__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Date__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__4"


    // $ANTLR start "rule__Date__Group__4__Impl"
    // InternalBankSystem.g:2583:1: rule__Date__Group__4__Impl : ( ( rule__Date__DayAssignment_4 ) ) ;
    public final void rule__Date__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2587:1: ( ( ( rule__Date__DayAssignment_4 ) ) )
            // InternalBankSystem.g:2588:1: ( ( rule__Date__DayAssignment_4 ) )
            {
            // InternalBankSystem.g:2588:1: ( ( rule__Date__DayAssignment_4 ) )
            // InternalBankSystem.g:2589:2: ( rule__Date__DayAssignment_4 )
            {
             before(grammarAccess.getDateAccess().getDayAssignment_4()); 
            // InternalBankSystem.g:2590:2: ( rule__Date__DayAssignment_4 )
            // InternalBankSystem.g:2590:3: rule__Date__DayAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Date__DayAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getDayAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__4__Impl"


    // $ANTLR start "rule__BankSystem__BanksAssignment_0"
    // InternalBankSystem.g:2599:1: rule__BankSystem__BanksAssignment_0 : ( ruleBank ) ;
    public final void rule__BankSystem__BanksAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2603:1: ( ( ruleBank ) )
            // InternalBankSystem.g:2604:2: ( ruleBank )
            {
            // InternalBankSystem.g:2604:2: ( ruleBank )
            // InternalBankSystem.g:2605:3: ruleBank
            {
             before(grammarAccess.getBankSystemAccess().getBanksBankParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBank();

            state._fsp--;

             after(grammarAccess.getBankSystemAccess().getBanksBankParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BankSystem__BanksAssignment_0"


    // $ANTLR start "rule__BankSystem__UsersAssignment_1"
    // InternalBankSystem.g:2614:1: rule__BankSystem__UsersAssignment_1 : ( ruleUser ) ;
    public final void rule__BankSystem__UsersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2618:1: ( ( ruleUser ) )
            // InternalBankSystem.g:2619:2: ( ruleUser )
            {
            // InternalBankSystem.g:2619:2: ( ruleUser )
            // InternalBankSystem.g:2620:3: ruleUser
            {
             before(grammarAccess.getBankSystemAccess().getUsersUserParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getBankSystemAccess().getUsersUserParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BankSystem__UsersAssignment_1"


    // $ANTLR start "rule__Bank__NameAssignment_1"
    // InternalBankSystem.g:2629:1: rule__Bank__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Bank__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2633:1: ( ( RULE_ID ) )
            // InternalBankSystem.g:2634:2: ( RULE_ID )
            {
            // InternalBankSystem.g:2634:2: ( RULE_ID )
            // InternalBankSystem.g:2635:3: RULE_ID
            {
             before(grammarAccess.getBankAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBankAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bank__NameAssignment_1"


    // $ANTLR start "rule__Bank__CountryOfOriginAssignment_4"
    // InternalBankSystem.g:2644:1: rule__Bank__CountryOfOriginAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Bank__CountryOfOriginAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2648:1: ( ( RULE_STRING ) )
            // InternalBankSystem.g:2649:2: ( RULE_STRING )
            {
            // InternalBankSystem.g:2649:2: ( RULE_STRING )
            // InternalBankSystem.g:2650:3: RULE_STRING
            {
             before(grammarAccess.getBankAccess().getCountryOfOriginSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBankAccess().getCountryOfOriginSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bank__CountryOfOriginAssignment_4"


    // $ANTLR start "rule__Bank__BranchesAssignment_5"
    // InternalBankSystem.g:2659:1: rule__Bank__BranchesAssignment_5 : ( ruleBranch ) ;
    public final void rule__Bank__BranchesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2663:1: ( ( ruleBranch ) )
            // InternalBankSystem.g:2664:2: ( ruleBranch )
            {
            // InternalBankSystem.g:2664:2: ( ruleBranch )
            // InternalBankSystem.g:2665:3: ruleBranch
            {
             before(grammarAccess.getBankAccess().getBranchesBranchParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleBranch();

            state._fsp--;

             after(grammarAccess.getBankAccess().getBranchesBranchParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bank__BranchesAssignment_5"


    // $ANTLR start "rule__Bank__AccountsAssignment_6"
    // InternalBankSystem.g:2674:1: rule__Bank__AccountsAssignment_6 : ( ruleAccount ) ;
    public final void rule__Bank__AccountsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2678:1: ( ( ruleAccount ) )
            // InternalBankSystem.g:2679:2: ( ruleAccount )
            {
            // InternalBankSystem.g:2679:2: ( ruleAccount )
            // InternalBankSystem.g:2680:3: ruleAccount
            {
             before(grammarAccess.getBankAccess().getAccountsAccountParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAccount();

            state._fsp--;

             after(grammarAccess.getBankAccess().getAccountsAccountParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bank__AccountsAssignment_6"


    // $ANTLR start "rule__Bank__TransactionsAssignment_7"
    // InternalBankSystem.g:2689:1: rule__Bank__TransactionsAssignment_7 : ( ruleTransaction ) ;
    public final void rule__Bank__TransactionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2693:1: ( ( ruleTransaction ) )
            // InternalBankSystem.g:2694:2: ( ruleTransaction )
            {
            // InternalBankSystem.g:2694:2: ( ruleTransaction )
            // InternalBankSystem.g:2695:3: ruleTransaction
            {
             before(grammarAccess.getBankAccess().getTransactionsTransactionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleTransaction();

            state._fsp--;

             after(grammarAccess.getBankAccess().getTransactionsTransactionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bank__TransactionsAssignment_7"


    // $ANTLR start "rule__User__NameAssignment_3"
    // InternalBankSystem.g:2704:1: rule__User__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__User__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2708:1: ( ( RULE_ID ) )
            // InternalBankSystem.g:2709:2: ( RULE_ID )
            {
            // InternalBankSystem.g:2709:2: ( RULE_ID )
            // InternalBankSystem.g:2710:3: RULE_ID
            {
             before(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__NameAssignment_3"


    // $ANTLR start "rule__User__EmailAssignment_5"
    // InternalBankSystem.g:2719:1: rule__User__EmailAssignment_5 : ( RULE_STRING ) ;
    public final void rule__User__EmailAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2723:1: ( ( RULE_STRING ) )
            // InternalBankSystem.g:2724:2: ( RULE_STRING )
            {
            // InternalBankSystem.g:2724:2: ( RULE_STRING )
            // InternalBankSystem.g:2725:3: RULE_STRING
            {
             before(grammarAccess.getUserAccess().getEmailSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getEmailSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__EmailAssignment_5"


    // $ANTLR start "rule__User__HashpassAssignment_7"
    // InternalBankSystem.g:2734:1: rule__User__HashpassAssignment_7 : ( RULE_STRING ) ;
    public final void rule__User__HashpassAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2738:1: ( ( RULE_STRING ) )
            // InternalBankSystem.g:2739:2: ( RULE_STRING )
            {
            // InternalBankSystem.g:2739:2: ( RULE_STRING )
            // InternalBankSystem.g:2740:3: RULE_STRING
            {
             before(grammarAccess.getUserAccess().getHashpassSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getHashpassSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__HashpassAssignment_7"


    // $ANTLR start "rule__User__AddressAssignment_9"
    // InternalBankSystem.g:2749:1: rule__User__AddressAssignment_9 : ( RULE_STRING ) ;
    public final void rule__User__AddressAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2753:1: ( ( RULE_STRING ) )
            // InternalBankSystem.g:2754:2: ( RULE_STRING )
            {
            // InternalBankSystem.g:2754:2: ( RULE_STRING )
            // InternalBankSystem.g:2755:3: RULE_STRING
            {
             before(grammarAccess.getUserAccess().getAddressSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getAddressSTRINGTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__AddressAssignment_9"


    // $ANTLR start "rule__Branch__AddressAssignment_2"
    // InternalBankSystem.g:2764:1: rule__Branch__AddressAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Branch__AddressAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2768:1: ( ( RULE_STRING ) )
            // InternalBankSystem.g:2769:2: ( RULE_STRING )
            {
            // InternalBankSystem.g:2769:2: ( RULE_STRING )
            // InternalBankSystem.g:2770:3: RULE_STRING
            {
             before(grammarAccess.getBranchAccess().getAddressSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBranchAccess().getAddressSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__AddressAssignment_2"


    // $ANTLR start "rule__Branch__EmployeesAssignment_5"
    // InternalBankSystem.g:2779:1: rule__Branch__EmployeesAssignment_5 : ( ruleEmployee ) ;
    public final void rule__Branch__EmployeesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2783:1: ( ( ruleEmployee ) )
            // InternalBankSystem.g:2784:2: ( ruleEmployee )
            {
            // InternalBankSystem.g:2784:2: ( ruleEmployee )
            // InternalBankSystem.g:2785:3: ruleEmployee
            {
             before(grammarAccess.getBranchAccess().getEmployeesEmployeeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEmployee();

            state._fsp--;

             after(grammarAccess.getBranchAccess().getEmployeesEmployeeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__EmployeesAssignment_5"


    // $ANTLR start "rule__Employee__NameAssignment_1"
    // InternalBankSystem.g:2794:1: rule__Employee__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Employee__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2798:1: ( ( RULE_ID ) )
            // InternalBankSystem.g:2799:2: ( RULE_ID )
            {
            // InternalBankSystem.g:2799:2: ( RULE_ID )
            // InternalBankSystem.g:2800:3: RULE_ID
            {
             before(grammarAccess.getEmployeeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__NameAssignment_1"


    // $ANTLR start "rule__Employee__DateAssignment_4"
    // InternalBankSystem.g:2809:1: rule__Employee__DateAssignment_4 : ( ruleDate ) ;
    public final void rule__Employee__DateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2813:1: ( ( ruleDate ) )
            // InternalBankSystem.g:2814:2: ( ruleDate )
            {
            // InternalBankSystem.g:2814:2: ( ruleDate )
            // InternalBankSystem.g:2815:3: ruleDate
            {
             before(grammarAccess.getEmployeeAccess().getDateDateParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getEmployeeAccess().getDateDateParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__DateAssignment_4"


    // $ANTLR start "rule__Employee__SalaryAssignment_6"
    // InternalBankSystem.g:2824:1: rule__Employee__SalaryAssignment_6 : ( RULE_INT ) ;
    public final void rule__Employee__SalaryAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2828:1: ( ( RULE_INT ) )
            // InternalBankSystem.g:2829:2: ( RULE_INT )
            {
            // InternalBankSystem.g:2829:2: ( RULE_INT )
            // InternalBankSystem.g:2830:3: RULE_INT
            {
             before(grammarAccess.getEmployeeAccess().getSalaryINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getSalaryINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__SalaryAssignment_6"


    // $ANTLR start "rule__Employee__CurrentRoleAssignment_8"
    // InternalBankSystem.g:2839:1: rule__Employee__CurrentRoleAssignment_8 : ( ruleEmployeeRole ) ;
    public final void rule__Employee__CurrentRoleAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2843:1: ( ( ruleEmployeeRole ) )
            // InternalBankSystem.g:2844:2: ( ruleEmployeeRole )
            {
            // InternalBankSystem.g:2844:2: ( ruleEmployeeRole )
            // InternalBankSystem.g:2845:3: ruleEmployeeRole
            {
             before(grammarAccess.getEmployeeAccess().getCurrentRoleEmployeeRoleParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEmployeeRole();

            state._fsp--;

             after(grammarAccess.getEmployeeAccess().getCurrentRoleEmployeeRoleParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__CurrentRoleAssignment_8"


    // $ANTLR start "rule__Account__HolderAssignment_2"
    // InternalBankSystem.g:2854:1: rule__Account__HolderAssignment_2 : ( ruleUser ) ;
    public final void rule__Account__HolderAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2858:1: ( ( ruleUser ) )
            // InternalBankSystem.g:2859:2: ( ruleUser )
            {
            // InternalBankSystem.g:2859:2: ( ruleUser )
            // InternalBankSystem.g:2860:3: ruleUser
            {
             before(grammarAccess.getAccountAccess().getHolderUserParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getAccountAccess().getHolderUserParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Account__HolderAssignment_2"


    // $ANTLR start "rule__Account__BalanceAssignment_4"
    // InternalBankSystem.g:2869:1: rule__Account__BalanceAssignment_4 : ( RULE_INT ) ;
    public final void rule__Account__BalanceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2873:1: ( ( RULE_INT ) )
            // InternalBankSystem.g:2874:2: ( RULE_INT )
            {
            // InternalBankSystem.g:2874:2: ( RULE_INT )
            // InternalBankSystem.g:2875:3: RULE_INT
            {
             before(grammarAccess.getAccountAccess().getBalanceINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getBalanceINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Account__BalanceAssignment_4"


    // $ANTLR start "rule__Account__AccountNumAssignment_6"
    // InternalBankSystem.g:2884:1: rule__Account__AccountNumAssignment_6 : ( RULE_ID ) ;
    public final void rule__Account__AccountNumAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2888:1: ( ( RULE_ID ) )
            // InternalBankSystem.g:2889:2: ( RULE_ID )
            {
            // InternalBankSystem.g:2889:2: ( RULE_ID )
            // InternalBankSystem.g:2890:3: RULE_ID
            {
             before(grammarAccess.getAccountAccess().getAccountNumIDTerminalRuleCall_6_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getAccountNumIDTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Account__AccountNumAssignment_6"


    // $ANTLR start "rule__Account__MfaTypeAssignment_8"
    // InternalBankSystem.g:2899:1: rule__Account__MfaTypeAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Account__MfaTypeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2903:1: ( ( RULE_STRING ) )
            // InternalBankSystem.g:2904:2: ( RULE_STRING )
            {
            // InternalBankSystem.g:2904:2: ( RULE_STRING )
            // InternalBankSystem.g:2905:3: RULE_STRING
            {
             before(grammarAccess.getAccountAccess().getMfaTypeSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getMfaTypeSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Account__MfaTypeAssignment_8"


    // $ANTLR start "rule__SavingsAccount__IntRateAssignment_2"
    // InternalBankSystem.g:2914:1: rule__SavingsAccount__IntRateAssignment_2 : ( RULE_INT ) ;
    public final void rule__SavingsAccount__IntRateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2918:1: ( ( RULE_INT ) )
            // InternalBankSystem.g:2919:2: ( RULE_INT )
            {
            // InternalBankSystem.g:2919:2: ( RULE_INT )
            // InternalBankSystem.g:2920:3: RULE_INT
            {
             before(grammarAccess.getSavingsAccountAccess().getIntRateINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSavingsAccountAccess().getIntRateINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SavingsAccount__IntRateAssignment_2"


    // $ANTLR start "rule__CheckingAccount__DepPerMonthAssignment_2"
    // InternalBankSystem.g:2929:1: rule__CheckingAccount__DepPerMonthAssignment_2 : ( RULE_INT ) ;
    public final void rule__CheckingAccount__DepPerMonthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2933:1: ( ( RULE_INT ) )
            // InternalBankSystem.g:2934:2: ( RULE_INT )
            {
            // InternalBankSystem.g:2934:2: ( RULE_INT )
            // InternalBankSystem.g:2935:3: RULE_INT
            {
             before(grammarAccess.getCheckingAccountAccess().getDepPerMonthINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCheckingAccountAccess().getDepPerMonthINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckingAccount__DepPerMonthAssignment_2"


    // $ANTLR start "rule__MortgageAccount__LoanPeriodAssignment_2"
    // InternalBankSystem.g:2944:1: rule__MortgageAccount__LoanPeriodAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MortgageAccount__LoanPeriodAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2948:1: ( ( RULE_STRING ) )
            // InternalBankSystem.g:2949:2: ( RULE_STRING )
            {
            // InternalBankSystem.g:2949:2: ( RULE_STRING )
            // InternalBankSystem.g:2950:3: RULE_STRING
            {
             before(grammarAccess.getMortgageAccountAccess().getLoanPeriodSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMortgageAccountAccess().getLoanPeriodSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MortgageAccount__LoanPeriodAssignment_2"


    // $ANTLR start "rule__Transaction__AccountAssignment_2"
    // InternalBankSystem.g:2959:1: rule__Transaction__AccountAssignment_2 : ( ruleAccount ) ;
    public final void rule__Transaction__AccountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2963:1: ( ( ruleAccount ) )
            // InternalBankSystem.g:2964:2: ( ruleAccount )
            {
            // InternalBankSystem.g:2964:2: ( ruleAccount )
            // InternalBankSystem.g:2965:3: ruleAccount
            {
             before(grammarAccess.getTransactionAccess().getAccountAccountParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAccount();

            state._fsp--;

             after(grammarAccess.getTransactionAccess().getAccountAccountParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__AccountAssignment_2"


    // $ANTLR start "rule__Transaction__AmountAssignment_4"
    // InternalBankSystem.g:2974:1: rule__Transaction__AmountAssignment_4 : ( RULE_INT ) ;
    public final void rule__Transaction__AmountAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2978:1: ( ( RULE_INT ) )
            // InternalBankSystem.g:2979:2: ( RULE_INT )
            {
            // InternalBankSystem.g:2979:2: ( RULE_INT )
            // InternalBankSystem.g:2980:3: RULE_INT
            {
             before(grammarAccess.getTransactionAccess().getAmountINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getAmountINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__AmountAssignment_4"


    // $ANTLR start "rule__Transaction__DateAssignment_6"
    // InternalBankSystem.g:2989:1: rule__Transaction__DateAssignment_6 : ( ruleDate ) ;
    public final void rule__Transaction__DateAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2993:1: ( ( ruleDate ) )
            // InternalBankSystem.g:2994:2: ( ruleDate )
            {
            // InternalBankSystem.g:2994:2: ( ruleDate )
            // InternalBankSystem.g:2995:3: ruleDate
            {
             before(grammarAccess.getTransactionAccess().getDateDateParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getTransactionAccess().getDateDateParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__DateAssignment_6"


    // $ANTLR start "rule__Transaction__DebitAssignment_8"
    // InternalBankSystem.g:3004:1: rule__Transaction__DebitAssignment_8 : ( ruleBoolean ) ;
    public final void rule__Transaction__DebitAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:3008:1: ( ( ruleBoolean ) )
            // InternalBankSystem.g:3009:2: ( ruleBoolean )
            {
            // InternalBankSystem.g:3009:2: ( ruleBoolean )
            // InternalBankSystem.g:3010:3: ruleBoolean
            {
             before(grammarAccess.getTransactionAccess().getDebitBooleanParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getTransactionAccess().getDebitBooleanParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__DebitAssignment_8"


    // $ANTLR start "rule__Transaction__VendorNameAssignment_10"
    // InternalBankSystem.g:3019:1: rule__Transaction__VendorNameAssignment_10 : ( RULE_STRING ) ;
    public final void rule__Transaction__VendorNameAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:3023:1: ( ( RULE_STRING ) )
            // InternalBankSystem.g:3024:2: ( RULE_STRING )
            {
            // InternalBankSystem.g:3024:2: ( RULE_STRING )
            // InternalBankSystem.g:3025:3: RULE_STRING
            {
             before(grammarAccess.getTransactionAccess().getVendorNameSTRINGTerminalRuleCall_10_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getVendorNameSTRINGTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__VendorNameAssignment_10"


    // $ANTLR start "rule__Date__YearAssignment_0"
    // InternalBankSystem.g:3034:1: rule__Date__YearAssignment_0 : ( RULE_INT ) ;
    public final void rule__Date__YearAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:3038:1: ( ( RULE_INT ) )
            // InternalBankSystem.g:3039:2: ( RULE_INT )
            {
            // InternalBankSystem.g:3039:2: ( RULE_INT )
            // InternalBankSystem.g:3040:3: RULE_INT
            {
             before(grammarAccess.getDateAccess().getYearINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getYearINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__YearAssignment_0"


    // $ANTLR start "rule__Date__MonthAssignment_2"
    // InternalBankSystem.g:3049:1: rule__Date__MonthAssignment_2 : ( RULE_INT ) ;
    public final void rule__Date__MonthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:3053:1: ( ( RULE_INT ) )
            // InternalBankSystem.g:3054:2: ( RULE_INT )
            {
            // InternalBankSystem.g:3054:2: ( RULE_INT )
            // InternalBankSystem.g:3055:3: RULE_INT
            {
             before(grammarAccess.getDateAccess().getMonthINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getMonthINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__MonthAssignment_2"


    // $ANTLR start "rule__Date__DayAssignment_4"
    // InternalBankSystem.g:3064:1: rule__Date__DayAssignment_4 : ( RULE_INT ) ;
    public final void rule__Date__DayAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:3068:1: ( ( RULE_INT ) )
            // InternalBankSystem.g:3069:2: ( RULE_INT )
            {
            // InternalBankSystem.g:3069:2: ( RULE_INT )
            // InternalBankSystem.g:3070:3: RULE_INT
            {
             before(grammarAccess.getDateAccess().getDayINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getDayINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__DayAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000002A800100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000A800000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008001800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008001802L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000A800000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800000000000L});

}