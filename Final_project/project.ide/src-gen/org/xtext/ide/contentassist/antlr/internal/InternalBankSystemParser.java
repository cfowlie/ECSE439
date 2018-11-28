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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Booth'", "'Vault'", "'Teller'", "'Manager'", "'Savings Account'", "'Checking Account'", "'Mortgage Account'", "'true'", "'false'", "'Bank'", "'{'", "'Country'", "'}'", "'User'", "'Name'", "'Email'", "'HashPass'", "'Address'", "'Branch{'", "'Employee'", "'Hiring date'", "'Salary'", "'Current Role'", "'account'", "'Holder(s)'", "'Balance'", "'Account Number'", "'MFA Type'", "'Type'", "'Interest rate'", "'Debits per month'", "'Loan period'", "'transaction {'", "'Account:'", "'Amount:'", "'Date'", "'Debit'", "'Vendor name'", "'/'"
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
    public static final int T__48=48;
    public static final int T__49=49;
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


    // $ANTLR start "entryRuleAccountType"
    // InternalBankSystem.g:328:1: entryRuleAccountType : ruleAccountType EOF ;
    public final void entryRuleAccountType() throws RecognitionException {
        try {
            // InternalBankSystem.g:329:1: ( ruleAccountType EOF )
            // InternalBankSystem.g:330:1: ruleAccountType EOF
            {
             before(grammarAccess.getAccountTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAccountType();

            state._fsp--;

             after(grammarAccess.getAccountTypeRule()); 
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
    // $ANTLR end "entryRuleAccountType"


    // $ANTLR start "ruleAccountType"
    // InternalBankSystem.g:337:1: ruleAccountType : ( ( rule__AccountType__Alternatives ) ) ;
    public final void ruleAccountType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:341:2: ( ( ( rule__AccountType__Alternatives ) ) )
            // InternalBankSystem.g:342:2: ( ( rule__AccountType__Alternatives ) )
            {
            // InternalBankSystem.g:342:2: ( ( rule__AccountType__Alternatives ) )
            // InternalBankSystem.g:343:3: ( rule__AccountType__Alternatives )
            {
             before(grammarAccess.getAccountTypeAccess().getAlternatives()); 
            // InternalBankSystem.g:344:3: ( rule__AccountType__Alternatives )
            // InternalBankSystem.g:344:4: rule__AccountType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AccountType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAccountTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAccountType"


    // $ANTLR start "entryRuleSavingsAccount"
    // InternalBankSystem.g:353:1: entryRuleSavingsAccount : ruleSavingsAccount EOF ;
    public final void entryRuleSavingsAccount() throws RecognitionException {
        try {
            // InternalBankSystem.g:354:1: ( ruleSavingsAccount EOF )
            // InternalBankSystem.g:355:1: ruleSavingsAccount EOF
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
    // InternalBankSystem.g:362:1: ruleSavingsAccount : ( 'Savings Account' ) ;
    public final void ruleSavingsAccount() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:366:2: ( ( 'Savings Account' ) )
            // InternalBankSystem.g:367:2: ( 'Savings Account' )
            {
            // InternalBankSystem.g:367:2: ( 'Savings Account' )
            // InternalBankSystem.g:368:3: 'Savings Account'
            {
             before(grammarAccess.getSavingsAccountAccess().getSavingsAccountKeyword()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSavingsAccountAccess().getSavingsAccountKeyword()); 

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
    // InternalBankSystem.g:378:1: entryRuleCheckingAccount : ruleCheckingAccount EOF ;
    public final void entryRuleCheckingAccount() throws RecognitionException {
        try {
            // InternalBankSystem.g:379:1: ( ruleCheckingAccount EOF )
            // InternalBankSystem.g:380:1: ruleCheckingAccount EOF
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
    // InternalBankSystem.g:387:1: ruleCheckingAccount : ( 'Checking Account' ) ;
    public final void ruleCheckingAccount() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:391:2: ( ( 'Checking Account' ) )
            // InternalBankSystem.g:392:2: ( 'Checking Account' )
            {
            // InternalBankSystem.g:392:2: ( 'Checking Account' )
            // InternalBankSystem.g:393:3: 'Checking Account'
            {
             before(grammarAccess.getCheckingAccountAccess().getCheckingAccountKeyword()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCheckingAccountAccess().getCheckingAccountKeyword()); 

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
    // InternalBankSystem.g:403:1: entryRuleMortgageAccount : ruleMortgageAccount EOF ;
    public final void entryRuleMortgageAccount() throws RecognitionException {
        try {
            // InternalBankSystem.g:404:1: ( ruleMortgageAccount EOF )
            // InternalBankSystem.g:405:1: ruleMortgageAccount EOF
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
    // InternalBankSystem.g:412:1: ruleMortgageAccount : ( 'Mortgage Account' ) ;
    public final void ruleMortgageAccount() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:416:2: ( ( 'Mortgage Account' ) )
            // InternalBankSystem.g:417:2: ( 'Mortgage Account' )
            {
            // InternalBankSystem.g:417:2: ( 'Mortgage Account' )
            // InternalBankSystem.g:418:3: 'Mortgage Account'
            {
             before(grammarAccess.getMortgageAccountAccess().getMortgageAccountKeyword()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMortgageAccountAccess().getMortgageAccountKeyword()); 

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
    // InternalBankSystem.g:428:1: entryRuleTransaction : ruleTransaction EOF ;
    public final void entryRuleTransaction() throws RecognitionException {
        try {
            // InternalBankSystem.g:429:1: ( ruleTransaction EOF )
            // InternalBankSystem.g:430:1: ruleTransaction EOF
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
    // InternalBankSystem.g:437:1: ruleTransaction : ( ( rule__Transaction__Group__0 ) ) ;
    public final void ruleTransaction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:441:2: ( ( ( rule__Transaction__Group__0 ) ) )
            // InternalBankSystem.g:442:2: ( ( rule__Transaction__Group__0 ) )
            {
            // InternalBankSystem.g:442:2: ( ( rule__Transaction__Group__0 ) )
            // InternalBankSystem.g:443:3: ( rule__Transaction__Group__0 )
            {
             before(grammarAccess.getTransactionAccess().getGroup()); 
            // InternalBankSystem.g:444:3: ( rule__Transaction__Group__0 )
            // InternalBankSystem.g:444:4: rule__Transaction__Group__0
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
    // InternalBankSystem.g:453:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalBankSystem.g:454:1: ( ruleBoolean EOF )
            // InternalBankSystem.g:455:1: ruleBoolean EOF
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
    // InternalBankSystem.g:462:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:466:2: ( ( ( rule__Boolean__Alternatives ) ) )
            // InternalBankSystem.g:467:2: ( ( rule__Boolean__Alternatives ) )
            {
            // InternalBankSystem.g:467:2: ( ( rule__Boolean__Alternatives ) )
            // InternalBankSystem.g:468:3: ( rule__Boolean__Alternatives )
            {
             before(grammarAccess.getBooleanAccess().getAlternatives()); 
            // InternalBankSystem.g:469:3: ( rule__Boolean__Alternatives )
            // InternalBankSystem.g:469:4: rule__Boolean__Alternatives
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
    // InternalBankSystem.g:478:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // InternalBankSystem.g:479:1: ( ruleDate EOF )
            // InternalBankSystem.g:480:1: ruleDate EOF
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
    // InternalBankSystem.g:487:1: ruleDate : ( ( rule__Date__Group__0 ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:491:2: ( ( ( rule__Date__Group__0 ) ) )
            // InternalBankSystem.g:492:2: ( ( rule__Date__Group__0 ) )
            {
            // InternalBankSystem.g:492:2: ( ( rule__Date__Group__0 ) )
            // InternalBankSystem.g:493:3: ( rule__Date__Group__0 )
            {
             before(grammarAccess.getDateAccess().getGroup()); 
            // InternalBankSystem.g:494:3: ( rule__Date__Group__0 )
            // InternalBankSystem.g:494:4: rule__Date__Group__0
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
    // InternalBankSystem.g:502:1: rule__EmployeeRole__Alternatives : ( ( ruleTeller ) | ( ruleManager ) );
    public final void rule__EmployeeRole__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:506:1: ( ( ruleTeller ) | ( ruleManager ) )
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
                    // InternalBankSystem.g:507:2: ( ruleTeller )
                    {
                    // InternalBankSystem.g:507:2: ( ruleTeller )
                    // InternalBankSystem.g:508:3: ruleTeller
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
                    // InternalBankSystem.g:513:2: ( ruleManager )
                    {
                    // InternalBankSystem.g:513:2: ( ruleManager )
                    // InternalBankSystem.g:514:3: ruleManager
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


    // $ANTLR start "rule__AccountType__Alternatives"
    // InternalBankSystem.g:523:1: rule__AccountType__Alternatives : ( ( ruleSavingsAccount ) | ( ruleCheckingAccount ) | ( ruleMortgageAccount ) );
    public final void rule__AccountType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:527:1: ( ( ruleSavingsAccount ) | ( ruleCheckingAccount ) | ( ruleMortgageAccount ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 17:
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
                    // InternalBankSystem.g:528:2: ( ruleSavingsAccount )
                    {
                    // InternalBankSystem.g:528:2: ( ruleSavingsAccount )
                    // InternalBankSystem.g:529:3: ruleSavingsAccount
                    {
                     before(grammarAccess.getAccountTypeAccess().getSavingsAccountParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSavingsAccount();

                    state._fsp--;

                     after(grammarAccess.getAccountTypeAccess().getSavingsAccountParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBankSystem.g:534:2: ( ruleCheckingAccount )
                    {
                    // InternalBankSystem.g:534:2: ( ruleCheckingAccount )
                    // InternalBankSystem.g:535:3: ruleCheckingAccount
                    {
                     before(grammarAccess.getAccountTypeAccess().getCheckingAccountParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCheckingAccount();

                    state._fsp--;

                     after(grammarAccess.getAccountTypeAccess().getCheckingAccountParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBankSystem.g:540:2: ( ruleMortgageAccount )
                    {
                    // InternalBankSystem.g:540:2: ( ruleMortgageAccount )
                    // InternalBankSystem.g:541:3: ruleMortgageAccount
                    {
                     before(grammarAccess.getAccountTypeAccess().getMortgageAccountParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMortgageAccount();

                    state._fsp--;

                     after(grammarAccess.getAccountTypeAccess().getMortgageAccountParserRuleCall_2()); 

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
    // $ANTLR end "rule__AccountType__Alternatives"


    // $ANTLR start "rule__Boolean__Alternatives"
    // InternalBankSystem.g:550:1: rule__Boolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:554:1: ( ( 'true' ) | ( 'false' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBankSystem.g:555:2: ( 'true' )
                    {
                    // InternalBankSystem.g:555:2: ( 'true' )
                    // InternalBankSystem.g:556:3: 'true'
                    {
                     before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBankSystem.g:561:2: ( 'false' )
                    {
                    // InternalBankSystem.g:561:2: ( 'false' )
                    // InternalBankSystem.g:562:3: 'false'
                    {
                     before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    match(input,19,FOLLOW_2); 
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
    // InternalBankSystem.g:571:1: rule__BankSystem__Group__0 : rule__BankSystem__Group__0__Impl rule__BankSystem__Group__1 ;
    public final void rule__BankSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:575:1: ( rule__BankSystem__Group__0__Impl rule__BankSystem__Group__1 )
            // InternalBankSystem.g:576:2: rule__BankSystem__Group__0__Impl rule__BankSystem__Group__1
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
    // InternalBankSystem.g:583:1: rule__BankSystem__Group__0__Impl : ( ( ( rule__BankSystem__BanksAssignment_0 ) ) ( ( rule__BankSystem__BanksAssignment_0 )* ) ) ;
    public final void rule__BankSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:587:1: ( ( ( ( rule__BankSystem__BanksAssignment_0 ) ) ( ( rule__BankSystem__BanksAssignment_0 )* ) ) )
            // InternalBankSystem.g:588:1: ( ( ( rule__BankSystem__BanksAssignment_0 ) ) ( ( rule__BankSystem__BanksAssignment_0 )* ) )
            {
            // InternalBankSystem.g:588:1: ( ( ( rule__BankSystem__BanksAssignment_0 ) ) ( ( rule__BankSystem__BanksAssignment_0 )* ) )
            // InternalBankSystem.g:589:2: ( ( rule__BankSystem__BanksAssignment_0 ) ) ( ( rule__BankSystem__BanksAssignment_0 )* )
            {
            // InternalBankSystem.g:589:2: ( ( rule__BankSystem__BanksAssignment_0 ) )
            // InternalBankSystem.g:590:3: ( rule__BankSystem__BanksAssignment_0 )
            {
             before(grammarAccess.getBankSystemAccess().getBanksAssignment_0()); 
            // InternalBankSystem.g:591:3: ( rule__BankSystem__BanksAssignment_0 )
            // InternalBankSystem.g:591:4: rule__BankSystem__BanksAssignment_0
            {
            pushFollow(FOLLOW_4);
            rule__BankSystem__BanksAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBankSystemAccess().getBanksAssignment_0()); 

            }

            // InternalBankSystem.g:594:2: ( ( rule__BankSystem__BanksAssignment_0 )* )
            // InternalBankSystem.g:595:3: ( rule__BankSystem__BanksAssignment_0 )*
            {
             before(grammarAccess.getBankSystemAccess().getBanksAssignment_0()); 
            // InternalBankSystem.g:596:3: ( rule__BankSystem__BanksAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBankSystem.g:596:4: rule__BankSystem__BanksAssignment_0
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
    // InternalBankSystem.g:605:1: rule__BankSystem__Group__1 : rule__BankSystem__Group__1__Impl ;
    public final void rule__BankSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:609:1: ( rule__BankSystem__Group__1__Impl )
            // InternalBankSystem.g:610:2: rule__BankSystem__Group__1__Impl
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
    // InternalBankSystem.g:616:1: rule__BankSystem__Group__1__Impl : ( ( ( rule__BankSystem__UsersAssignment_1 ) ) ( ( rule__BankSystem__UsersAssignment_1 )* ) ) ;
    public final void rule__BankSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:620:1: ( ( ( ( rule__BankSystem__UsersAssignment_1 ) ) ( ( rule__BankSystem__UsersAssignment_1 )* ) ) )
            // InternalBankSystem.g:621:1: ( ( ( rule__BankSystem__UsersAssignment_1 ) ) ( ( rule__BankSystem__UsersAssignment_1 )* ) )
            {
            // InternalBankSystem.g:621:1: ( ( ( rule__BankSystem__UsersAssignment_1 ) ) ( ( rule__BankSystem__UsersAssignment_1 )* ) )
            // InternalBankSystem.g:622:2: ( ( rule__BankSystem__UsersAssignment_1 ) ) ( ( rule__BankSystem__UsersAssignment_1 )* )
            {
            // InternalBankSystem.g:622:2: ( ( rule__BankSystem__UsersAssignment_1 ) )
            // InternalBankSystem.g:623:3: ( rule__BankSystem__UsersAssignment_1 )
            {
             before(grammarAccess.getBankSystemAccess().getUsersAssignment_1()); 
            // InternalBankSystem.g:624:3: ( rule__BankSystem__UsersAssignment_1 )
            // InternalBankSystem.g:624:4: rule__BankSystem__UsersAssignment_1
            {
            pushFollow(FOLLOW_5);
            rule__BankSystem__UsersAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBankSystemAccess().getUsersAssignment_1()); 

            }

            // InternalBankSystem.g:627:2: ( ( rule__BankSystem__UsersAssignment_1 )* )
            // InternalBankSystem.g:628:3: ( rule__BankSystem__UsersAssignment_1 )*
            {
             before(grammarAccess.getBankSystemAccess().getUsersAssignment_1()); 
            // InternalBankSystem.g:629:3: ( rule__BankSystem__UsersAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBankSystem.g:629:4: rule__BankSystem__UsersAssignment_1
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
    // InternalBankSystem.g:639:1: rule__Bank__Group__0 : rule__Bank__Group__0__Impl rule__Bank__Group__1 ;
    public final void rule__Bank__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:643:1: ( rule__Bank__Group__0__Impl rule__Bank__Group__1 )
            // InternalBankSystem.g:644:2: rule__Bank__Group__0__Impl rule__Bank__Group__1
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
    // InternalBankSystem.g:651:1: rule__Bank__Group__0__Impl : ( 'Bank' ) ;
    public final void rule__Bank__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:655:1: ( ( 'Bank' ) )
            // InternalBankSystem.g:656:1: ( 'Bank' )
            {
            // InternalBankSystem.g:656:1: ( 'Bank' )
            // InternalBankSystem.g:657:2: 'Bank'
            {
             before(grammarAccess.getBankAccess().getBankKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalBankSystem.g:666:1: rule__Bank__Group__1 : rule__Bank__Group__1__Impl rule__Bank__Group__2 ;
    public final void rule__Bank__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:670:1: ( rule__Bank__Group__1__Impl rule__Bank__Group__2 )
            // InternalBankSystem.g:671:2: rule__Bank__Group__1__Impl rule__Bank__Group__2
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
    // InternalBankSystem.g:678:1: rule__Bank__Group__1__Impl : ( ( rule__Bank__NameAssignment_1 ) ) ;
    public final void rule__Bank__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:682:1: ( ( ( rule__Bank__NameAssignment_1 ) ) )
            // InternalBankSystem.g:683:1: ( ( rule__Bank__NameAssignment_1 ) )
            {
            // InternalBankSystem.g:683:1: ( ( rule__Bank__NameAssignment_1 ) )
            // InternalBankSystem.g:684:2: ( rule__Bank__NameAssignment_1 )
            {
             before(grammarAccess.getBankAccess().getNameAssignment_1()); 
            // InternalBankSystem.g:685:2: ( rule__Bank__NameAssignment_1 )
            // InternalBankSystem.g:685:3: rule__Bank__NameAssignment_1
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
    // InternalBankSystem.g:693:1: rule__Bank__Group__2 : rule__Bank__Group__2__Impl rule__Bank__Group__3 ;
    public final void rule__Bank__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:697:1: ( rule__Bank__Group__2__Impl rule__Bank__Group__3 )
            // InternalBankSystem.g:698:2: rule__Bank__Group__2__Impl rule__Bank__Group__3
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
    // InternalBankSystem.g:705:1: rule__Bank__Group__2__Impl : ( '{' ) ;
    public final void rule__Bank__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:709:1: ( ( '{' ) )
            // InternalBankSystem.g:710:1: ( '{' )
            {
            // InternalBankSystem.g:710:1: ( '{' )
            // InternalBankSystem.g:711:2: '{'
            {
             before(grammarAccess.getBankAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalBankSystem.g:720:1: rule__Bank__Group__3 : rule__Bank__Group__3__Impl rule__Bank__Group__4 ;
    public final void rule__Bank__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:724:1: ( rule__Bank__Group__3__Impl rule__Bank__Group__4 )
            // InternalBankSystem.g:725:2: rule__Bank__Group__3__Impl rule__Bank__Group__4
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
    // InternalBankSystem.g:732:1: rule__Bank__Group__3__Impl : ( 'Country' ) ;
    public final void rule__Bank__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:736:1: ( ( 'Country' ) )
            // InternalBankSystem.g:737:1: ( 'Country' )
            {
            // InternalBankSystem.g:737:1: ( 'Country' )
            // InternalBankSystem.g:738:2: 'Country'
            {
             before(grammarAccess.getBankAccess().getCountryKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalBankSystem.g:747:1: rule__Bank__Group__4 : rule__Bank__Group__4__Impl rule__Bank__Group__5 ;
    public final void rule__Bank__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:751:1: ( rule__Bank__Group__4__Impl rule__Bank__Group__5 )
            // InternalBankSystem.g:752:2: rule__Bank__Group__4__Impl rule__Bank__Group__5
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
    // InternalBankSystem.g:759:1: rule__Bank__Group__4__Impl : ( ( rule__Bank__CountryOfOriginAssignment_4 ) ) ;
    public final void rule__Bank__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:763:1: ( ( ( rule__Bank__CountryOfOriginAssignment_4 ) ) )
            // InternalBankSystem.g:764:1: ( ( rule__Bank__CountryOfOriginAssignment_4 ) )
            {
            // InternalBankSystem.g:764:1: ( ( rule__Bank__CountryOfOriginAssignment_4 ) )
            // InternalBankSystem.g:765:2: ( rule__Bank__CountryOfOriginAssignment_4 )
            {
             before(grammarAccess.getBankAccess().getCountryOfOriginAssignment_4()); 
            // InternalBankSystem.g:766:2: ( rule__Bank__CountryOfOriginAssignment_4 )
            // InternalBankSystem.g:766:3: rule__Bank__CountryOfOriginAssignment_4
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
    // InternalBankSystem.g:774:1: rule__Bank__Group__5 : rule__Bank__Group__5__Impl rule__Bank__Group__6 ;
    public final void rule__Bank__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:778:1: ( rule__Bank__Group__5__Impl rule__Bank__Group__6 )
            // InternalBankSystem.g:779:2: rule__Bank__Group__5__Impl rule__Bank__Group__6
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
    // InternalBankSystem.g:786:1: rule__Bank__Group__5__Impl : ( ( ( rule__Bank__BranchesAssignment_5 ) ) ( ( rule__Bank__BranchesAssignment_5 )* ) ) ;
    public final void rule__Bank__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:790:1: ( ( ( ( rule__Bank__BranchesAssignment_5 ) ) ( ( rule__Bank__BranchesAssignment_5 )* ) ) )
            // InternalBankSystem.g:791:1: ( ( ( rule__Bank__BranchesAssignment_5 ) ) ( ( rule__Bank__BranchesAssignment_5 )* ) )
            {
            // InternalBankSystem.g:791:1: ( ( ( rule__Bank__BranchesAssignment_5 ) ) ( ( rule__Bank__BranchesAssignment_5 )* ) )
            // InternalBankSystem.g:792:2: ( ( rule__Bank__BranchesAssignment_5 ) ) ( ( rule__Bank__BranchesAssignment_5 )* )
            {
            // InternalBankSystem.g:792:2: ( ( rule__Bank__BranchesAssignment_5 ) )
            // InternalBankSystem.g:793:3: ( rule__Bank__BranchesAssignment_5 )
            {
             before(grammarAccess.getBankAccess().getBranchesAssignment_5()); 
            // InternalBankSystem.g:794:3: ( rule__Bank__BranchesAssignment_5 )
            // InternalBankSystem.g:794:4: rule__Bank__BranchesAssignment_5
            {
            pushFollow(FOLLOW_12);
            rule__Bank__BranchesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBankAccess().getBranchesAssignment_5()); 

            }

            // InternalBankSystem.g:797:2: ( ( rule__Bank__BranchesAssignment_5 )* )
            // InternalBankSystem.g:798:3: ( rule__Bank__BranchesAssignment_5 )*
            {
             before(grammarAccess.getBankAccess().getBranchesAssignment_5()); 
            // InternalBankSystem.g:799:3: ( rule__Bank__BranchesAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBankSystem.g:799:4: rule__Bank__BranchesAssignment_5
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
    // InternalBankSystem.g:808:1: rule__Bank__Group__6 : rule__Bank__Group__6__Impl rule__Bank__Group__7 ;
    public final void rule__Bank__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:812:1: ( rule__Bank__Group__6__Impl rule__Bank__Group__7 )
            // InternalBankSystem.g:813:2: rule__Bank__Group__6__Impl rule__Bank__Group__7
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
    // InternalBankSystem.g:820:1: rule__Bank__Group__6__Impl : ( ( rule__Bank__AccountsAssignment_6 )* ) ;
    public final void rule__Bank__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:824:1: ( ( ( rule__Bank__AccountsAssignment_6 )* ) )
            // InternalBankSystem.g:825:1: ( ( rule__Bank__AccountsAssignment_6 )* )
            {
            // InternalBankSystem.g:825:1: ( ( rule__Bank__AccountsAssignment_6 )* )
            // InternalBankSystem.g:826:2: ( rule__Bank__AccountsAssignment_6 )*
            {
             before(grammarAccess.getBankAccess().getAccountsAssignment_6()); 
            // InternalBankSystem.g:827:2: ( rule__Bank__AccountsAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==34) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalBankSystem.g:827:3: rule__Bank__AccountsAssignment_6
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
    // InternalBankSystem.g:835:1: rule__Bank__Group__7 : rule__Bank__Group__7__Impl rule__Bank__Group__8 ;
    public final void rule__Bank__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:839:1: ( rule__Bank__Group__7__Impl rule__Bank__Group__8 )
            // InternalBankSystem.g:840:2: rule__Bank__Group__7__Impl rule__Bank__Group__8
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
    // InternalBankSystem.g:847:1: rule__Bank__Group__7__Impl : ( ( rule__Bank__TransactionsAssignment_7 )* ) ;
    public final void rule__Bank__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:851:1: ( ( ( rule__Bank__TransactionsAssignment_7 )* ) )
            // InternalBankSystem.g:852:1: ( ( rule__Bank__TransactionsAssignment_7 )* )
            {
            // InternalBankSystem.g:852:1: ( ( rule__Bank__TransactionsAssignment_7 )* )
            // InternalBankSystem.g:853:2: ( rule__Bank__TransactionsAssignment_7 )*
            {
             before(grammarAccess.getBankAccess().getTransactionsAssignment_7()); 
            // InternalBankSystem.g:854:2: ( rule__Bank__TransactionsAssignment_7 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==43) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBankSystem.g:854:3: rule__Bank__TransactionsAssignment_7
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
    // InternalBankSystem.g:862:1: rule__Bank__Group__8 : rule__Bank__Group__8__Impl ;
    public final void rule__Bank__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:866:1: ( rule__Bank__Group__8__Impl )
            // InternalBankSystem.g:867:2: rule__Bank__Group__8__Impl
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
    // InternalBankSystem.g:873:1: rule__Bank__Group__8__Impl : ( '}' ) ;
    public final void rule__Bank__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:877:1: ( ( '}' ) )
            // InternalBankSystem.g:878:1: ( '}' )
            {
            // InternalBankSystem.g:878:1: ( '}' )
            // InternalBankSystem.g:879:2: '}'
            {
             before(grammarAccess.getBankAccess().getRightCurlyBracketKeyword_8()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBankSystem.g:889:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:893:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // InternalBankSystem.g:894:2: rule__User__Group__0__Impl rule__User__Group__1
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
    // InternalBankSystem.g:901:1: rule__User__Group__0__Impl : ( 'User' ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:905:1: ( ( 'User' ) )
            // InternalBankSystem.g:906:1: ( 'User' )
            {
            // InternalBankSystem.g:906:1: ( 'User' )
            // InternalBankSystem.g:907:2: 'User'
            {
             before(grammarAccess.getUserAccess().getUserKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalBankSystem.g:916:1: rule__User__Group__1 : rule__User__Group__1__Impl rule__User__Group__2 ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:920:1: ( rule__User__Group__1__Impl rule__User__Group__2 )
            // InternalBankSystem.g:921:2: rule__User__Group__1__Impl rule__User__Group__2
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
    // InternalBankSystem.g:928:1: rule__User__Group__1__Impl : ( '{' ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:932:1: ( ( '{' ) )
            // InternalBankSystem.g:933:1: ( '{' )
            {
            // InternalBankSystem.g:933:1: ( '{' )
            // InternalBankSystem.g:934:2: '{'
            {
             before(grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalBankSystem.g:943:1: rule__User__Group__2 : rule__User__Group__2__Impl rule__User__Group__3 ;
    public final void rule__User__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:947:1: ( rule__User__Group__2__Impl rule__User__Group__3 )
            // InternalBankSystem.g:948:2: rule__User__Group__2__Impl rule__User__Group__3
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
    // InternalBankSystem.g:955:1: rule__User__Group__2__Impl : ( 'Name' ) ;
    public final void rule__User__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:959:1: ( ( 'Name' ) )
            // InternalBankSystem.g:960:1: ( 'Name' )
            {
            // InternalBankSystem.g:960:1: ( 'Name' )
            // InternalBankSystem.g:961:2: 'Name'
            {
             before(grammarAccess.getUserAccess().getNameKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalBankSystem.g:970:1: rule__User__Group__3 : rule__User__Group__3__Impl rule__User__Group__4 ;
    public final void rule__User__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:974:1: ( rule__User__Group__3__Impl rule__User__Group__4 )
            // InternalBankSystem.g:975:2: rule__User__Group__3__Impl rule__User__Group__4
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
    // InternalBankSystem.g:982:1: rule__User__Group__3__Impl : ( ( rule__User__NameAssignment_3 ) ) ;
    public final void rule__User__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:986:1: ( ( ( rule__User__NameAssignment_3 ) ) )
            // InternalBankSystem.g:987:1: ( ( rule__User__NameAssignment_3 ) )
            {
            // InternalBankSystem.g:987:1: ( ( rule__User__NameAssignment_3 ) )
            // InternalBankSystem.g:988:2: ( rule__User__NameAssignment_3 )
            {
             before(grammarAccess.getUserAccess().getNameAssignment_3()); 
            // InternalBankSystem.g:989:2: ( rule__User__NameAssignment_3 )
            // InternalBankSystem.g:989:3: rule__User__NameAssignment_3
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
    // InternalBankSystem.g:997:1: rule__User__Group__4 : rule__User__Group__4__Impl rule__User__Group__5 ;
    public final void rule__User__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1001:1: ( rule__User__Group__4__Impl rule__User__Group__5 )
            // InternalBankSystem.g:1002:2: rule__User__Group__4__Impl rule__User__Group__5
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
    // InternalBankSystem.g:1009:1: rule__User__Group__4__Impl : ( 'Email' ) ;
    public final void rule__User__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1013:1: ( ( 'Email' ) )
            // InternalBankSystem.g:1014:1: ( 'Email' )
            {
            // InternalBankSystem.g:1014:1: ( 'Email' )
            // InternalBankSystem.g:1015:2: 'Email'
            {
             before(grammarAccess.getUserAccess().getEmailKeyword_4()); 
            match(input,26,FOLLOW_2); 
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
    // InternalBankSystem.g:1024:1: rule__User__Group__5 : rule__User__Group__5__Impl rule__User__Group__6 ;
    public final void rule__User__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1028:1: ( rule__User__Group__5__Impl rule__User__Group__6 )
            // InternalBankSystem.g:1029:2: rule__User__Group__5__Impl rule__User__Group__6
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
    // InternalBankSystem.g:1036:1: rule__User__Group__5__Impl : ( ( rule__User__EmailAssignment_5 ) ) ;
    public final void rule__User__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1040:1: ( ( ( rule__User__EmailAssignment_5 ) ) )
            // InternalBankSystem.g:1041:1: ( ( rule__User__EmailAssignment_5 ) )
            {
            // InternalBankSystem.g:1041:1: ( ( rule__User__EmailAssignment_5 ) )
            // InternalBankSystem.g:1042:2: ( rule__User__EmailAssignment_5 )
            {
             before(grammarAccess.getUserAccess().getEmailAssignment_5()); 
            // InternalBankSystem.g:1043:2: ( rule__User__EmailAssignment_5 )
            // InternalBankSystem.g:1043:3: rule__User__EmailAssignment_5
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
    // InternalBankSystem.g:1051:1: rule__User__Group__6 : rule__User__Group__6__Impl rule__User__Group__7 ;
    public final void rule__User__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1055:1: ( rule__User__Group__6__Impl rule__User__Group__7 )
            // InternalBankSystem.g:1056:2: rule__User__Group__6__Impl rule__User__Group__7
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
    // InternalBankSystem.g:1063:1: rule__User__Group__6__Impl : ( 'HashPass' ) ;
    public final void rule__User__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1067:1: ( ( 'HashPass' ) )
            // InternalBankSystem.g:1068:1: ( 'HashPass' )
            {
            // InternalBankSystem.g:1068:1: ( 'HashPass' )
            // InternalBankSystem.g:1069:2: 'HashPass'
            {
             before(grammarAccess.getUserAccess().getHashPassKeyword_6()); 
            match(input,27,FOLLOW_2); 
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
    // InternalBankSystem.g:1078:1: rule__User__Group__7 : rule__User__Group__7__Impl rule__User__Group__8 ;
    public final void rule__User__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1082:1: ( rule__User__Group__7__Impl rule__User__Group__8 )
            // InternalBankSystem.g:1083:2: rule__User__Group__7__Impl rule__User__Group__8
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
    // InternalBankSystem.g:1090:1: rule__User__Group__7__Impl : ( ( rule__User__HashpassAssignment_7 ) ) ;
    public final void rule__User__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1094:1: ( ( ( rule__User__HashpassAssignment_7 ) ) )
            // InternalBankSystem.g:1095:1: ( ( rule__User__HashpassAssignment_7 ) )
            {
            // InternalBankSystem.g:1095:1: ( ( rule__User__HashpassAssignment_7 ) )
            // InternalBankSystem.g:1096:2: ( rule__User__HashpassAssignment_7 )
            {
             before(grammarAccess.getUserAccess().getHashpassAssignment_7()); 
            // InternalBankSystem.g:1097:2: ( rule__User__HashpassAssignment_7 )
            // InternalBankSystem.g:1097:3: rule__User__HashpassAssignment_7
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
    // InternalBankSystem.g:1105:1: rule__User__Group__8 : rule__User__Group__8__Impl rule__User__Group__9 ;
    public final void rule__User__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1109:1: ( rule__User__Group__8__Impl rule__User__Group__9 )
            // InternalBankSystem.g:1110:2: rule__User__Group__8__Impl rule__User__Group__9
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
    // InternalBankSystem.g:1117:1: rule__User__Group__8__Impl : ( 'Address' ) ;
    public final void rule__User__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1121:1: ( ( 'Address' ) )
            // InternalBankSystem.g:1122:1: ( 'Address' )
            {
            // InternalBankSystem.g:1122:1: ( 'Address' )
            // InternalBankSystem.g:1123:2: 'Address'
            {
             before(grammarAccess.getUserAccess().getAddressKeyword_8()); 
            match(input,28,FOLLOW_2); 
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
    // InternalBankSystem.g:1132:1: rule__User__Group__9 : rule__User__Group__9__Impl rule__User__Group__10 ;
    public final void rule__User__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1136:1: ( rule__User__Group__9__Impl rule__User__Group__10 )
            // InternalBankSystem.g:1137:2: rule__User__Group__9__Impl rule__User__Group__10
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
    // InternalBankSystem.g:1144:1: rule__User__Group__9__Impl : ( ( rule__User__AddressAssignment_9 ) ) ;
    public final void rule__User__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1148:1: ( ( ( rule__User__AddressAssignment_9 ) ) )
            // InternalBankSystem.g:1149:1: ( ( rule__User__AddressAssignment_9 ) )
            {
            // InternalBankSystem.g:1149:1: ( ( rule__User__AddressAssignment_9 ) )
            // InternalBankSystem.g:1150:2: ( rule__User__AddressAssignment_9 )
            {
             before(grammarAccess.getUserAccess().getAddressAssignment_9()); 
            // InternalBankSystem.g:1151:2: ( rule__User__AddressAssignment_9 )
            // InternalBankSystem.g:1151:3: rule__User__AddressAssignment_9
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
    // InternalBankSystem.g:1159:1: rule__User__Group__10 : rule__User__Group__10__Impl ;
    public final void rule__User__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1163:1: ( rule__User__Group__10__Impl )
            // InternalBankSystem.g:1164:2: rule__User__Group__10__Impl
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
    // InternalBankSystem.g:1170:1: rule__User__Group__10__Impl : ( '}' ) ;
    public final void rule__User__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1174:1: ( ( '}' ) )
            // InternalBankSystem.g:1175:1: ( '}' )
            {
            // InternalBankSystem.g:1175:1: ( '}' )
            // InternalBankSystem.g:1176:2: '}'
            {
             before(grammarAccess.getUserAccess().getRightCurlyBracketKeyword_10()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBankSystem.g:1186:1: rule__Branch__Group__0 : rule__Branch__Group__0__Impl rule__Branch__Group__1 ;
    public final void rule__Branch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1190:1: ( rule__Branch__Group__0__Impl rule__Branch__Group__1 )
            // InternalBankSystem.g:1191:2: rule__Branch__Group__0__Impl rule__Branch__Group__1
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
    // InternalBankSystem.g:1198:1: rule__Branch__Group__0__Impl : ( 'Branch{' ) ;
    public final void rule__Branch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1202:1: ( ( 'Branch{' ) )
            // InternalBankSystem.g:1203:1: ( 'Branch{' )
            {
            // InternalBankSystem.g:1203:1: ( 'Branch{' )
            // InternalBankSystem.g:1204:2: 'Branch{'
            {
             before(grammarAccess.getBranchAccess().getBranchKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalBankSystem.g:1213:1: rule__Branch__Group__1 : rule__Branch__Group__1__Impl rule__Branch__Group__2 ;
    public final void rule__Branch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1217:1: ( rule__Branch__Group__1__Impl rule__Branch__Group__2 )
            // InternalBankSystem.g:1218:2: rule__Branch__Group__1__Impl rule__Branch__Group__2
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
    // InternalBankSystem.g:1225:1: rule__Branch__Group__1__Impl : ( 'Address' ) ;
    public final void rule__Branch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1229:1: ( ( 'Address' ) )
            // InternalBankSystem.g:1230:1: ( 'Address' )
            {
            // InternalBankSystem.g:1230:1: ( 'Address' )
            // InternalBankSystem.g:1231:2: 'Address'
            {
             before(grammarAccess.getBranchAccess().getAddressKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalBankSystem.g:1240:1: rule__Branch__Group__2 : rule__Branch__Group__2__Impl rule__Branch__Group__3 ;
    public final void rule__Branch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1244:1: ( rule__Branch__Group__2__Impl rule__Branch__Group__3 )
            // InternalBankSystem.g:1245:2: rule__Branch__Group__2__Impl rule__Branch__Group__3
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
    // InternalBankSystem.g:1252:1: rule__Branch__Group__2__Impl : ( ( rule__Branch__AddressAssignment_2 ) ) ;
    public final void rule__Branch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1256:1: ( ( ( rule__Branch__AddressAssignment_2 ) ) )
            // InternalBankSystem.g:1257:1: ( ( rule__Branch__AddressAssignment_2 ) )
            {
            // InternalBankSystem.g:1257:1: ( ( rule__Branch__AddressAssignment_2 ) )
            // InternalBankSystem.g:1258:2: ( rule__Branch__AddressAssignment_2 )
            {
             before(grammarAccess.getBranchAccess().getAddressAssignment_2()); 
            // InternalBankSystem.g:1259:2: ( rule__Branch__AddressAssignment_2 )
            // InternalBankSystem.g:1259:3: rule__Branch__AddressAssignment_2
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
    // InternalBankSystem.g:1267:1: rule__Branch__Group__3 : rule__Branch__Group__3__Impl rule__Branch__Group__4 ;
    public final void rule__Branch__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1271:1: ( rule__Branch__Group__3__Impl rule__Branch__Group__4 )
            // InternalBankSystem.g:1272:2: rule__Branch__Group__3__Impl rule__Branch__Group__4
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
    // InternalBankSystem.g:1279:1: rule__Branch__Group__3__Impl : ( ( rule__Branch__MyboothAssignment_3 )? ) ;
    public final void rule__Branch__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1283:1: ( ( ( rule__Branch__MyboothAssignment_3 )? ) )
            // InternalBankSystem.g:1284:1: ( ( rule__Branch__MyboothAssignment_3 )? )
            {
            // InternalBankSystem.g:1284:1: ( ( rule__Branch__MyboothAssignment_3 )? )
            // InternalBankSystem.g:1285:2: ( rule__Branch__MyboothAssignment_3 )?
            {
             before(grammarAccess.getBranchAccess().getMyboothAssignment_3()); 
            // InternalBankSystem.g:1286:2: ( rule__Branch__MyboothAssignment_3 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==11) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBankSystem.g:1286:3: rule__Branch__MyboothAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Branch__MyboothAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBranchAccess().getMyboothAssignment_3()); 

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
    // InternalBankSystem.g:1294:1: rule__Branch__Group__4 : rule__Branch__Group__4__Impl rule__Branch__Group__5 ;
    public final void rule__Branch__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1298:1: ( rule__Branch__Group__4__Impl rule__Branch__Group__5 )
            // InternalBankSystem.g:1299:2: rule__Branch__Group__4__Impl rule__Branch__Group__5
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
    // InternalBankSystem.g:1306:1: rule__Branch__Group__4__Impl : ( ( rule__Branch__MyVaultAssignment_4 )? ) ;
    public final void rule__Branch__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1310:1: ( ( ( rule__Branch__MyVaultAssignment_4 )? ) )
            // InternalBankSystem.g:1311:1: ( ( rule__Branch__MyVaultAssignment_4 )? )
            {
            // InternalBankSystem.g:1311:1: ( ( rule__Branch__MyVaultAssignment_4 )? )
            // InternalBankSystem.g:1312:2: ( rule__Branch__MyVaultAssignment_4 )?
            {
             before(grammarAccess.getBranchAccess().getMyVaultAssignment_4()); 
            // InternalBankSystem.g:1313:2: ( rule__Branch__MyVaultAssignment_4 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBankSystem.g:1313:3: rule__Branch__MyVaultAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Branch__MyVaultAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBranchAccess().getMyVaultAssignment_4()); 

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
    // InternalBankSystem.g:1321:1: rule__Branch__Group__5 : rule__Branch__Group__5__Impl rule__Branch__Group__6 ;
    public final void rule__Branch__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1325:1: ( rule__Branch__Group__5__Impl rule__Branch__Group__6 )
            // InternalBankSystem.g:1326:2: rule__Branch__Group__5__Impl rule__Branch__Group__6
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
    // InternalBankSystem.g:1333:1: rule__Branch__Group__5__Impl : ( ( ( rule__Branch__EmployeesAssignment_5 ) ) ( ( rule__Branch__EmployeesAssignment_5 )* ) ) ;
    public final void rule__Branch__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1337:1: ( ( ( ( rule__Branch__EmployeesAssignment_5 ) ) ( ( rule__Branch__EmployeesAssignment_5 )* ) ) )
            // InternalBankSystem.g:1338:1: ( ( ( rule__Branch__EmployeesAssignment_5 ) ) ( ( rule__Branch__EmployeesAssignment_5 )* ) )
            {
            // InternalBankSystem.g:1338:1: ( ( ( rule__Branch__EmployeesAssignment_5 ) ) ( ( rule__Branch__EmployeesAssignment_5 )* ) )
            // InternalBankSystem.g:1339:2: ( ( rule__Branch__EmployeesAssignment_5 ) ) ( ( rule__Branch__EmployeesAssignment_5 )* )
            {
            // InternalBankSystem.g:1339:2: ( ( rule__Branch__EmployeesAssignment_5 ) )
            // InternalBankSystem.g:1340:3: ( rule__Branch__EmployeesAssignment_5 )
            {
             before(grammarAccess.getBranchAccess().getEmployeesAssignment_5()); 
            // InternalBankSystem.g:1341:3: ( rule__Branch__EmployeesAssignment_5 )
            // InternalBankSystem.g:1341:4: rule__Branch__EmployeesAssignment_5
            {
            pushFollow(FOLLOW_21);
            rule__Branch__EmployeesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBranchAccess().getEmployeesAssignment_5()); 

            }

            // InternalBankSystem.g:1344:2: ( ( rule__Branch__EmployeesAssignment_5 )* )
            // InternalBankSystem.g:1345:3: ( rule__Branch__EmployeesAssignment_5 )*
            {
             before(grammarAccess.getBranchAccess().getEmployeesAssignment_5()); 
            // InternalBankSystem.g:1346:3: ( rule__Branch__EmployeesAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBankSystem.g:1346:4: rule__Branch__EmployeesAssignment_5
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
    // InternalBankSystem.g:1355:1: rule__Branch__Group__6 : rule__Branch__Group__6__Impl ;
    public final void rule__Branch__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1359:1: ( rule__Branch__Group__6__Impl )
            // InternalBankSystem.g:1360:2: rule__Branch__Group__6__Impl
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
    // InternalBankSystem.g:1366:1: rule__Branch__Group__6__Impl : ( '}' ) ;
    public final void rule__Branch__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1370:1: ( ( '}' ) )
            // InternalBankSystem.g:1371:1: ( '}' )
            {
            // InternalBankSystem.g:1371:1: ( '}' )
            // InternalBankSystem.g:1372:2: '}'
            {
             before(grammarAccess.getBranchAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBankSystem.g:1382:1: rule__Employee__Group__0 : rule__Employee__Group__0__Impl rule__Employee__Group__1 ;
    public final void rule__Employee__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1386:1: ( rule__Employee__Group__0__Impl rule__Employee__Group__1 )
            // InternalBankSystem.g:1387:2: rule__Employee__Group__0__Impl rule__Employee__Group__1
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
    // InternalBankSystem.g:1394:1: rule__Employee__Group__0__Impl : ( 'Employee' ) ;
    public final void rule__Employee__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1398:1: ( ( 'Employee' ) )
            // InternalBankSystem.g:1399:1: ( 'Employee' )
            {
            // InternalBankSystem.g:1399:1: ( 'Employee' )
            // InternalBankSystem.g:1400:2: 'Employee'
            {
             before(grammarAccess.getEmployeeAccess().getEmployeeKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalBankSystem.g:1409:1: rule__Employee__Group__1 : rule__Employee__Group__1__Impl rule__Employee__Group__2 ;
    public final void rule__Employee__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1413:1: ( rule__Employee__Group__1__Impl rule__Employee__Group__2 )
            // InternalBankSystem.g:1414:2: rule__Employee__Group__1__Impl rule__Employee__Group__2
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
    // InternalBankSystem.g:1421:1: rule__Employee__Group__1__Impl : ( ( rule__Employee__NameAssignment_1 ) ) ;
    public final void rule__Employee__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1425:1: ( ( ( rule__Employee__NameAssignment_1 ) ) )
            // InternalBankSystem.g:1426:1: ( ( rule__Employee__NameAssignment_1 ) )
            {
            // InternalBankSystem.g:1426:1: ( ( rule__Employee__NameAssignment_1 ) )
            // InternalBankSystem.g:1427:2: ( rule__Employee__NameAssignment_1 )
            {
             before(grammarAccess.getEmployeeAccess().getNameAssignment_1()); 
            // InternalBankSystem.g:1428:2: ( rule__Employee__NameAssignment_1 )
            // InternalBankSystem.g:1428:3: rule__Employee__NameAssignment_1
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
    // InternalBankSystem.g:1436:1: rule__Employee__Group__2 : rule__Employee__Group__2__Impl rule__Employee__Group__3 ;
    public final void rule__Employee__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1440:1: ( rule__Employee__Group__2__Impl rule__Employee__Group__3 )
            // InternalBankSystem.g:1441:2: rule__Employee__Group__2__Impl rule__Employee__Group__3
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
    // InternalBankSystem.g:1448:1: rule__Employee__Group__2__Impl : ( '{' ) ;
    public final void rule__Employee__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1452:1: ( ( '{' ) )
            // InternalBankSystem.g:1453:1: ( '{' )
            {
            // InternalBankSystem.g:1453:1: ( '{' )
            // InternalBankSystem.g:1454:2: '{'
            {
             before(grammarAccess.getEmployeeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalBankSystem.g:1463:1: rule__Employee__Group__3 : rule__Employee__Group__3__Impl rule__Employee__Group__4 ;
    public final void rule__Employee__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1467:1: ( rule__Employee__Group__3__Impl rule__Employee__Group__4 )
            // InternalBankSystem.g:1468:2: rule__Employee__Group__3__Impl rule__Employee__Group__4
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
    // InternalBankSystem.g:1475:1: rule__Employee__Group__3__Impl : ( 'Hiring date' ) ;
    public final void rule__Employee__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1479:1: ( ( 'Hiring date' ) )
            // InternalBankSystem.g:1480:1: ( 'Hiring date' )
            {
            // InternalBankSystem.g:1480:1: ( 'Hiring date' )
            // InternalBankSystem.g:1481:2: 'Hiring date'
            {
             before(grammarAccess.getEmployeeAccess().getHiringDateKeyword_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalBankSystem.g:1490:1: rule__Employee__Group__4 : rule__Employee__Group__4__Impl rule__Employee__Group__5 ;
    public final void rule__Employee__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1494:1: ( rule__Employee__Group__4__Impl rule__Employee__Group__5 )
            // InternalBankSystem.g:1495:2: rule__Employee__Group__4__Impl rule__Employee__Group__5
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
    // InternalBankSystem.g:1502:1: rule__Employee__Group__4__Impl : ( ( rule__Employee__DateAssignment_4 ) ) ;
    public final void rule__Employee__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1506:1: ( ( ( rule__Employee__DateAssignment_4 ) ) )
            // InternalBankSystem.g:1507:1: ( ( rule__Employee__DateAssignment_4 ) )
            {
            // InternalBankSystem.g:1507:1: ( ( rule__Employee__DateAssignment_4 ) )
            // InternalBankSystem.g:1508:2: ( rule__Employee__DateAssignment_4 )
            {
             before(grammarAccess.getEmployeeAccess().getDateAssignment_4()); 
            // InternalBankSystem.g:1509:2: ( rule__Employee__DateAssignment_4 )
            // InternalBankSystem.g:1509:3: rule__Employee__DateAssignment_4
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
    // InternalBankSystem.g:1517:1: rule__Employee__Group__5 : rule__Employee__Group__5__Impl rule__Employee__Group__6 ;
    public final void rule__Employee__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1521:1: ( rule__Employee__Group__5__Impl rule__Employee__Group__6 )
            // InternalBankSystem.g:1522:2: rule__Employee__Group__5__Impl rule__Employee__Group__6
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
    // InternalBankSystem.g:1529:1: rule__Employee__Group__5__Impl : ( 'Salary' ) ;
    public final void rule__Employee__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1533:1: ( ( 'Salary' ) )
            // InternalBankSystem.g:1534:1: ( 'Salary' )
            {
            // InternalBankSystem.g:1534:1: ( 'Salary' )
            // InternalBankSystem.g:1535:2: 'Salary'
            {
             before(grammarAccess.getEmployeeAccess().getSalaryKeyword_5()); 
            match(input,32,FOLLOW_2); 
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
    // InternalBankSystem.g:1544:1: rule__Employee__Group__6 : rule__Employee__Group__6__Impl rule__Employee__Group__7 ;
    public final void rule__Employee__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1548:1: ( rule__Employee__Group__6__Impl rule__Employee__Group__7 )
            // InternalBankSystem.g:1549:2: rule__Employee__Group__6__Impl rule__Employee__Group__7
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
    // InternalBankSystem.g:1556:1: rule__Employee__Group__6__Impl : ( ( rule__Employee__SalaryAssignment_6 ) ) ;
    public final void rule__Employee__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1560:1: ( ( ( rule__Employee__SalaryAssignment_6 ) ) )
            // InternalBankSystem.g:1561:1: ( ( rule__Employee__SalaryAssignment_6 ) )
            {
            // InternalBankSystem.g:1561:1: ( ( rule__Employee__SalaryAssignment_6 ) )
            // InternalBankSystem.g:1562:2: ( rule__Employee__SalaryAssignment_6 )
            {
             before(grammarAccess.getEmployeeAccess().getSalaryAssignment_6()); 
            // InternalBankSystem.g:1563:2: ( rule__Employee__SalaryAssignment_6 )
            // InternalBankSystem.g:1563:3: rule__Employee__SalaryAssignment_6
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
    // InternalBankSystem.g:1571:1: rule__Employee__Group__7 : rule__Employee__Group__7__Impl rule__Employee__Group__8 ;
    public final void rule__Employee__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1575:1: ( rule__Employee__Group__7__Impl rule__Employee__Group__8 )
            // InternalBankSystem.g:1576:2: rule__Employee__Group__7__Impl rule__Employee__Group__8
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
    // InternalBankSystem.g:1583:1: rule__Employee__Group__7__Impl : ( 'Current Role' ) ;
    public final void rule__Employee__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1587:1: ( ( 'Current Role' ) )
            // InternalBankSystem.g:1588:1: ( 'Current Role' )
            {
            // InternalBankSystem.g:1588:1: ( 'Current Role' )
            // InternalBankSystem.g:1589:2: 'Current Role'
            {
             before(grammarAccess.getEmployeeAccess().getCurrentRoleKeyword_7()); 
            match(input,33,FOLLOW_2); 
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
    // InternalBankSystem.g:1598:1: rule__Employee__Group__8 : rule__Employee__Group__8__Impl rule__Employee__Group__9 ;
    public final void rule__Employee__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1602:1: ( rule__Employee__Group__8__Impl rule__Employee__Group__9 )
            // InternalBankSystem.g:1603:2: rule__Employee__Group__8__Impl rule__Employee__Group__9
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
    // InternalBankSystem.g:1610:1: rule__Employee__Group__8__Impl : ( ( rule__Employee__CurrentRoleAssignment_8 ) ) ;
    public final void rule__Employee__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1614:1: ( ( ( rule__Employee__CurrentRoleAssignment_8 ) ) )
            // InternalBankSystem.g:1615:1: ( ( rule__Employee__CurrentRoleAssignment_8 ) )
            {
            // InternalBankSystem.g:1615:1: ( ( rule__Employee__CurrentRoleAssignment_8 ) )
            // InternalBankSystem.g:1616:2: ( rule__Employee__CurrentRoleAssignment_8 )
            {
             before(grammarAccess.getEmployeeAccess().getCurrentRoleAssignment_8()); 
            // InternalBankSystem.g:1617:2: ( rule__Employee__CurrentRoleAssignment_8 )
            // InternalBankSystem.g:1617:3: rule__Employee__CurrentRoleAssignment_8
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
    // InternalBankSystem.g:1625:1: rule__Employee__Group__9 : rule__Employee__Group__9__Impl ;
    public final void rule__Employee__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1629:1: ( rule__Employee__Group__9__Impl )
            // InternalBankSystem.g:1630:2: rule__Employee__Group__9__Impl
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
    // InternalBankSystem.g:1636:1: rule__Employee__Group__9__Impl : ( '}' ) ;
    public final void rule__Employee__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1640:1: ( ( '}' ) )
            // InternalBankSystem.g:1641:1: ( '}' )
            {
            // InternalBankSystem.g:1641:1: ( '}' )
            // InternalBankSystem.g:1642:2: '}'
            {
             before(grammarAccess.getEmployeeAccess().getRightCurlyBracketKeyword_9()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBankSystem.g:1652:1: rule__Account__Group__0 : rule__Account__Group__0__Impl rule__Account__Group__1 ;
    public final void rule__Account__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1656:1: ( rule__Account__Group__0__Impl rule__Account__Group__1 )
            // InternalBankSystem.g:1657:2: rule__Account__Group__0__Impl rule__Account__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalBankSystem.g:1664:1: rule__Account__Group__0__Impl : ( 'account' ) ;
    public final void rule__Account__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1668:1: ( ( 'account' ) )
            // InternalBankSystem.g:1669:1: ( 'account' )
            {
            // InternalBankSystem.g:1669:1: ( 'account' )
            // InternalBankSystem.g:1670:2: 'account'
            {
             before(grammarAccess.getAccountAccess().getAccountKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getAccountKeyword_0()); 

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
    // InternalBankSystem.g:1679:1: rule__Account__Group__1 : rule__Account__Group__1__Impl rule__Account__Group__2 ;
    public final void rule__Account__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1683:1: ( rule__Account__Group__1__Impl rule__Account__Group__2 )
            // InternalBankSystem.g:1684:2: rule__Account__Group__1__Impl rule__Account__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalBankSystem.g:1691:1: rule__Account__Group__1__Impl : ( ( rule__Account__AccountNumAssignment_1 ) ) ;
    public final void rule__Account__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1695:1: ( ( ( rule__Account__AccountNumAssignment_1 ) ) )
            // InternalBankSystem.g:1696:1: ( ( rule__Account__AccountNumAssignment_1 ) )
            {
            // InternalBankSystem.g:1696:1: ( ( rule__Account__AccountNumAssignment_1 ) )
            // InternalBankSystem.g:1697:2: ( rule__Account__AccountNumAssignment_1 )
            {
             before(grammarAccess.getAccountAccess().getAccountNumAssignment_1()); 
            // InternalBankSystem.g:1698:2: ( rule__Account__AccountNumAssignment_1 )
            // InternalBankSystem.g:1698:3: rule__Account__AccountNumAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Account__AccountNumAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAccountAccess().getAccountNumAssignment_1()); 

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
    // InternalBankSystem.g:1706:1: rule__Account__Group__2 : rule__Account__Group__2__Impl rule__Account__Group__3 ;
    public final void rule__Account__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1710:1: ( rule__Account__Group__2__Impl rule__Account__Group__3 )
            // InternalBankSystem.g:1711:2: rule__Account__Group__2__Impl rule__Account__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalBankSystem.g:1718:1: rule__Account__Group__2__Impl : ( '{' ) ;
    public final void rule__Account__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1722:1: ( ( '{' ) )
            // InternalBankSystem.g:1723:1: ( '{' )
            {
            // InternalBankSystem.g:1723:1: ( '{' )
            // InternalBankSystem.g:1724:2: '{'
            {
             before(grammarAccess.getAccountAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getLeftCurlyBracketKeyword_2()); 

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
    // InternalBankSystem.g:1733:1: rule__Account__Group__3 : rule__Account__Group__3__Impl rule__Account__Group__4 ;
    public final void rule__Account__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1737:1: ( rule__Account__Group__3__Impl rule__Account__Group__4 )
            // InternalBankSystem.g:1738:2: rule__Account__Group__3__Impl rule__Account__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalBankSystem.g:1745:1: rule__Account__Group__3__Impl : ( 'Holder(s)' ) ;
    public final void rule__Account__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1749:1: ( ( 'Holder(s)' ) )
            // InternalBankSystem.g:1750:1: ( 'Holder(s)' )
            {
            // InternalBankSystem.g:1750:1: ( 'Holder(s)' )
            // InternalBankSystem.g:1751:2: 'Holder(s)'
            {
             before(grammarAccess.getAccountAccess().getHolderSKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getHolderSKeyword_3()); 

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
    // InternalBankSystem.g:1760:1: rule__Account__Group__4 : rule__Account__Group__4__Impl rule__Account__Group__5 ;
    public final void rule__Account__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1764:1: ( rule__Account__Group__4__Impl rule__Account__Group__5 )
            // InternalBankSystem.g:1765:2: rule__Account__Group__4__Impl rule__Account__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalBankSystem.g:1772:1: rule__Account__Group__4__Impl : ( ( rule__Account__HolderAssignment_4 ) ) ;
    public final void rule__Account__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1776:1: ( ( ( rule__Account__HolderAssignment_4 ) ) )
            // InternalBankSystem.g:1777:1: ( ( rule__Account__HolderAssignment_4 ) )
            {
            // InternalBankSystem.g:1777:1: ( ( rule__Account__HolderAssignment_4 ) )
            // InternalBankSystem.g:1778:2: ( rule__Account__HolderAssignment_4 )
            {
             before(grammarAccess.getAccountAccess().getHolderAssignment_4()); 
            // InternalBankSystem.g:1779:2: ( rule__Account__HolderAssignment_4 )
            // InternalBankSystem.g:1779:3: rule__Account__HolderAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Account__HolderAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAccountAccess().getHolderAssignment_4()); 

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
    // InternalBankSystem.g:1787:1: rule__Account__Group__5 : rule__Account__Group__5__Impl rule__Account__Group__6 ;
    public final void rule__Account__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1791:1: ( rule__Account__Group__5__Impl rule__Account__Group__6 )
            // InternalBankSystem.g:1792:2: rule__Account__Group__5__Impl rule__Account__Group__6
            {
            pushFollow(FOLLOW_23);
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
    // InternalBankSystem.g:1799:1: rule__Account__Group__5__Impl : ( 'Balance' ) ;
    public final void rule__Account__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1803:1: ( ( 'Balance' ) )
            // InternalBankSystem.g:1804:1: ( 'Balance' )
            {
            // InternalBankSystem.g:1804:1: ( 'Balance' )
            // InternalBankSystem.g:1805:2: 'Balance'
            {
             before(grammarAccess.getAccountAccess().getBalanceKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getBalanceKeyword_5()); 

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
    // InternalBankSystem.g:1814:1: rule__Account__Group__6 : rule__Account__Group__6__Impl rule__Account__Group__7 ;
    public final void rule__Account__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1818:1: ( rule__Account__Group__6__Impl rule__Account__Group__7 )
            // InternalBankSystem.g:1819:2: rule__Account__Group__6__Impl rule__Account__Group__7
            {
            pushFollow(FOLLOW_29);
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
    // InternalBankSystem.g:1826:1: rule__Account__Group__6__Impl : ( ( rule__Account__BalanceAssignment_6 ) ) ;
    public final void rule__Account__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1830:1: ( ( ( rule__Account__BalanceAssignment_6 ) ) )
            // InternalBankSystem.g:1831:1: ( ( rule__Account__BalanceAssignment_6 ) )
            {
            // InternalBankSystem.g:1831:1: ( ( rule__Account__BalanceAssignment_6 ) )
            // InternalBankSystem.g:1832:2: ( rule__Account__BalanceAssignment_6 )
            {
             before(grammarAccess.getAccountAccess().getBalanceAssignment_6()); 
            // InternalBankSystem.g:1833:2: ( rule__Account__BalanceAssignment_6 )
            // InternalBankSystem.g:1833:3: rule__Account__BalanceAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Account__BalanceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAccountAccess().getBalanceAssignment_6()); 

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
    // InternalBankSystem.g:1841:1: rule__Account__Group__7 : rule__Account__Group__7__Impl rule__Account__Group__8 ;
    public final void rule__Account__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1845:1: ( rule__Account__Group__7__Impl rule__Account__Group__8 )
            // InternalBankSystem.g:1846:2: rule__Account__Group__7__Impl rule__Account__Group__8
            {
            pushFollow(FOLLOW_30);
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
    // InternalBankSystem.g:1853:1: rule__Account__Group__7__Impl : ( 'Account Number' ) ;
    public final void rule__Account__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1857:1: ( ( 'Account Number' ) )
            // InternalBankSystem.g:1858:1: ( 'Account Number' )
            {
            // InternalBankSystem.g:1858:1: ( 'Account Number' )
            // InternalBankSystem.g:1859:2: 'Account Number'
            {
             before(grammarAccess.getAccountAccess().getAccountNumberKeyword_7()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getAccountNumberKeyword_7()); 

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
    // InternalBankSystem.g:1868:1: rule__Account__Group__8 : rule__Account__Group__8__Impl rule__Account__Group__9 ;
    public final void rule__Account__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1872:1: ( rule__Account__Group__8__Impl rule__Account__Group__9 )
            // InternalBankSystem.g:1873:2: rule__Account__Group__8__Impl rule__Account__Group__9
            {
            pushFollow(FOLLOW_9);
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
    // InternalBankSystem.g:1880:1: rule__Account__Group__8__Impl : ( 'MFA Type' ) ;
    public final void rule__Account__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1884:1: ( ( 'MFA Type' ) )
            // InternalBankSystem.g:1885:1: ( 'MFA Type' )
            {
            // InternalBankSystem.g:1885:1: ( 'MFA Type' )
            // InternalBankSystem.g:1886:2: 'MFA Type'
            {
             before(grammarAccess.getAccountAccess().getMFATypeKeyword_8()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getMFATypeKeyword_8()); 

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
    // InternalBankSystem.g:1895:1: rule__Account__Group__9 : rule__Account__Group__9__Impl rule__Account__Group__10 ;
    public final void rule__Account__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1899:1: ( rule__Account__Group__9__Impl rule__Account__Group__10 )
            // InternalBankSystem.g:1900:2: rule__Account__Group__9__Impl rule__Account__Group__10
            {
            pushFollow(FOLLOW_31);
            rule__Account__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group__10();

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
    // InternalBankSystem.g:1907:1: rule__Account__Group__9__Impl : ( ( rule__Account__MfaTypeAssignment_9 ) ) ;
    public final void rule__Account__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1911:1: ( ( ( rule__Account__MfaTypeAssignment_9 ) ) )
            // InternalBankSystem.g:1912:1: ( ( rule__Account__MfaTypeAssignment_9 ) )
            {
            // InternalBankSystem.g:1912:1: ( ( rule__Account__MfaTypeAssignment_9 ) )
            // InternalBankSystem.g:1913:2: ( rule__Account__MfaTypeAssignment_9 )
            {
             before(grammarAccess.getAccountAccess().getMfaTypeAssignment_9()); 
            // InternalBankSystem.g:1914:2: ( rule__Account__MfaTypeAssignment_9 )
            // InternalBankSystem.g:1914:3: rule__Account__MfaTypeAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Account__MfaTypeAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getAccountAccess().getMfaTypeAssignment_9()); 

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


    // $ANTLR start "rule__Account__Group__10"
    // InternalBankSystem.g:1922:1: rule__Account__Group__10 : rule__Account__Group__10__Impl rule__Account__Group__11 ;
    public final void rule__Account__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1926:1: ( rule__Account__Group__10__Impl rule__Account__Group__11 )
            // InternalBankSystem.g:1927:2: rule__Account__Group__10__Impl rule__Account__Group__11
            {
            pushFollow(FOLLOW_32);
            rule__Account__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group__11();

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
    // $ANTLR end "rule__Account__Group__10"


    // $ANTLR start "rule__Account__Group__10__Impl"
    // InternalBankSystem.g:1934:1: rule__Account__Group__10__Impl : ( 'Type' ) ;
    public final void rule__Account__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1938:1: ( ( 'Type' ) )
            // InternalBankSystem.g:1939:1: ( 'Type' )
            {
            // InternalBankSystem.g:1939:1: ( 'Type' )
            // InternalBankSystem.g:1940:2: 'Type'
            {
             before(grammarAccess.getAccountAccess().getTypeKeyword_10()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getTypeKeyword_10()); 

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
    // $ANTLR end "rule__Account__Group__10__Impl"


    // $ANTLR start "rule__Account__Group__11"
    // InternalBankSystem.g:1949:1: rule__Account__Group__11 : rule__Account__Group__11__Impl rule__Account__Group__12 ;
    public final void rule__Account__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1953:1: ( rule__Account__Group__11__Impl rule__Account__Group__12 )
            // InternalBankSystem.g:1954:2: rule__Account__Group__11__Impl rule__Account__Group__12
            {
            pushFollow(FOLLOW_33);
            rule__Account__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group__12();

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
    // $ANTLR end "rule__Account__Group__11"


    // $ANTLR start "rule__Account__Group__11__Impl"
    // InternalBankSystem.g:1961:1: rule__Account__Group__11__Impl : ( ( rule__Account__AccountTypeAssignment_11 ) ) ;
    public final void rule__Account__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1965:1: ( ( ( rule__Account__AccountTypeAssignment_11 ) ) )
            // InternalBankSystem.g:1966:1: ( ( rule__Account__AccountTypeAssignment_11 ) )
            {
            // InternalBankSystem.g:1966:1: ( ( rule__Account__AccountTypeAssignment_11 ) )
            // InternalBankSystem.g:1967:2: ( rule__Account__AccountTypeAssignment_11 )
            {
             before(grammarAccess.getAccountAccess().getAccountTypeAssignment_11()); 
            // InternalBankSystem.g:1968:2: ( rule__Account__AccountTypeAssignment_11 )
            // InternalBankSystem.g:1968:3: rule__Account__AccountTypeAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Account__AccountTypeAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getAccountAccess().getAccountTypeAssignment_11()); 

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
    // $ANTLR end "rule__Account__Group__11__Impl"


    // $ANTLR start "rule__Account__Group__12"
    // InternalBankSystem.g:1976:1: rule__Account__Group__12 : rule__Account__Group__12__Impl rule__Account__Group__13 ;
    public final void rule__Account__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1980:1: ( rule__Account__Group__12__Impl rule__Account__Group__13 )
            // InternalBankSystem.g:1981:2: rule__Account__Group__12__Impl rule__Account__Group__13
            {
            pushFollow(FOLLOW_33);
            rule__Account__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group__13();

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
    // $ANTLR end "rule__Account__Group__12"


    // $ANTLR start "rule__Account__Group__12__Impl"
    // InternalBankSystem.g:1988:1: rule__Account__Group__12__Impl : ( ( rule__Account__Group_12__0 )? ) ;
    public final void rule__Account__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1992:1: ( ( ( rule__Account__Group_12__0 )? ) )
            // InternalBankSystem.g:1993:1: ( ( rule__Account__Group_12__0 )? )
            {
            // InternalBankSystem.g:1993:1: ( ( rule__Account__Group_12__0 )? )
            // InternalBankSystem.g:1994:2: ( rule__Account__Group_12__0 )?
            {
             before(grammarAccess.getAccountAccess().getGroup_12()); 
            // InternalBankSystem.g:1995:2: ( rule__Account__Group_12__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==40) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBankSystem.g:1995:3: rule__Account__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Account__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAccountAccess().getGroup_12()); 

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
    // $ANTLR end "rule__Account__Group__12__Impl"


    // $ANTLR start "rule__Account__Group__13"
    // InternalBankSystem.g:2003:1: rule__Account__Group__13 : rule__Account__Group__13__Impl rule__Account__Group__14 ;
    public final void rule__Account__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2007:1: ( rule__Account__Group__13__Impl rule__Account__Group__14 )
            // InternalBankSystem.g:2008:2: rule__Account__Group__13__Impl rule__Account__Group__14
            {
            pushFollow(FOLLOW_33);
            rule__Account__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group__14();

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
    // $ANTLR end "rule__Account__Group__13"


    // $ANTLR start "rule__Account__Group__13__Impl"
    // InternalBankSystem.g:2015:1: rule__Account__Group__13__Impl : ( ( rule__Account__Group_13__0 )? ) ;
    public final void rule__Account__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2019:1: ( ( ( rule__Account__Group_13__0 )? ) )
            // InternalBankSystem.g:2020:1: ( ( rule__Account__Group_13__0 )? )
            {
            // InternalBankSystem.g:2020:1: ( ( rule__Account__Group_13__0 )? )
            // InternalBankSystem.g:2021:2: ( rule__Account__Group_13__0 )?
            {
             before(grammarAccess.getAccountAccess().getGroup_13()); 
            // InternalBankSystem.g:2022:2: ( rule__Account__Group_13__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBankSystem.g:2022:3: rule__Account__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Account__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAccountAccess().getGroup_13()); 

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
    // $ANTLR end "rule__Account__Group__13__Impl"


    // $ANTLR start "rule__Account__Group__14"
    // InternalBankSystem.g:2030:1: rule__Account__Group__14 : rule__Account__Group__14__Impl rule__Account__Group__15 ;
    public final void rule__Account__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2034:1: ( rule__Account__Group__14__Impl rule__Account__Group__15 )
            // InternalBankSystem.g:2035:2: rule__Account__Group__14__Impl rule__Account__Group__15
            {
            pushFollow(FOLLOW_33);
            rule__Account__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group__15();

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
    // $ANTLR end "rule__Account__Group__14"


    // $ANTLR start "rule__Account__Group__14__Impl"
    // InternalBankSystem.g:2042:1: rule__Account__Group__14__Impl : ( ( rule__Account__Group_14__0 )? ) ;
    public final void rule__Account__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2046:1: ( ( ( rule__Account__Group_14__0 )? ) )
            // InternalBankSystem.g:2047:1: ( ( rule__Account__Group_14__0 )? )
            {
            // InternalBankSystem.g:2047:1: ( ( rule__Account__Group_14__0 )? )
            // InternalBankSystem.g:2048:2: ( rule__Account__Group_14__0 )?
            {
             before(grammarAccess.getAccountAccess().getGroup_14()); 
            // InternalBankSystem.g:2049:2: ( rule__Account__Group_14__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==42) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBankSystem.g:2049:3: rule__Account__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Account__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAccountAccess().getGroup_14()); 

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
    // $ANTLR end "rule__Account__Group__14__Impl"


    // $ANTLR start "rule__Account__Group__15"
    // InternalBankSystem.g:2057:1: rule__Account__Group__15 : rule__Account__Group__15__Impl ;
    public final void rule__Account__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2061:1: ( rule__Account__Group__15__Impl )
            // InternalBankSystem.g:2062:2: rule__Account__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Account__Group__15__Impl();

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
    // $ANTLR end "rule__Account__Group__15"


    // $ANTLR start "rule__Account__Group__15__Impl"
    // InternalBankSystem.g:2068:1: rule__Account__Group__15__Impl : ( '}' ) ;
    public final void rule__Account__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2072:1: ( ( '}' ) )
            // InternalBankSystem.g:2073:1: ( '}' )
            {
            // InternalBankSystem.g:2073:1: ( '}' )
            // InternalBankSystem.g:2074:2: '}'
            {
             before(grammarAccess.getAccountAccess().getRightCurlyBracketKeyword_15()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getRightCurlyBracketKeyword_15()); 

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
    // $ANTLR end "rule__Account__Group__15__Impl"


    // $ANTLR start "rule__Account__Group_12__0"
    // InternalBankSystem.g:2084:1: rule__Account__Group_12__0 : rule__Account__Group_12__0__Impl rule__Account__Group_12__1 ;
    public final void rule__Account__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2088:1: ( rule__Account__Group_12__0__Impl rule__Account__Group_12__1 )
            // InternalBankSystem.g:2089:2: rule__Account__Group_12__0__Impl rule__Account__Group_12__1
            {
            pushFollow(FOLLOW_23);
            rule__Account__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group_12__1();

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
    // $ANTLR end "rule__Account__Group_12__0"


    // $ANTLR start "rule__Account__Group_12__0__Impl"
    // InternalBankSystem.g:2096:1: rule__Account__Group_12__0__Impl : ( 'Interest rate' ) ;
    public final void rule__Account__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2100:1: ( ( 'Interest rate' ) )
            // InternalBankSystem.g:2101:1: ( 'Interest rate' )
            {
            // InternalBankSystem.g:2101:1: ( 'Interest rate' )
            // InternalBankSystem.g:2102:2: 'Interest rate'
            {
             before(grammarAccess.getAccountAccess().getInterestRateKeyword_12_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getInterestRateKeyword_12_0()); 

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
    // $ANTLR end "rule__Account__Group_12__0__Impl"


    // $ANTLR start "rule__Account__Group_12__1"
    // InternalBankSystem.g:2111:1: rule__Account__Group_12__1 : rule__Account__Group_12__1__Impl ;
    public final void rule__Account__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2115:1: ( rule__Account__Group_12__1__Impl )
            // InternalBankSystem.g:2116:2: rule__Account__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Account__Group_12__1__Impl();

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
    // $ANTLR end "rule__Account__Group_12__1"


    // $ANTLR start "rule__Account__Group_12__1__Impl"
    // InternalBankSystem.g:2122:1: rule__Account__Group_12__1__Impl : ( ( rule__Account__IntRateAssignment_12_1 ) ) ;
    public final void rule__Account__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2126:1: ( ( ( rule__Account__IntRateAssignment_12_1 ) ) )
            // InternalBankSystem.g:2127:1: ( ( rule__Account__IntRateAssignment_12_1 ) )
            {
            // InternalBankSystem.g:2127:1: ( ( rule__Account__IntRateAssignment_12_1 ) )
            // InternalBankSystem.g:2128:2: ( rule__Account__IntRateAssignment_12_1 )
            {
             before(grammarAccess.getAccountAccess().getIntRateAssignment_12_1()); 
            // InternalBankSystem.g:2129:2: ( rule__Account__IntRateAssignment_12_1 )
            // InternalBankSystem.g:2129:3: rule__Account__IntRateAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__Account__IntRateAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getAccountAccess().getIntRateAssignment_12_1()); 

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
    // $ANTLR end "rule__Account__Group_12__1__Impl"


    // $ANTLR start "rule__Account__Group_13__0"
    // InternalBankSystem.g:2138:1: rule__Account__Group_13__0 : rule__Account__Group_13__0__Impl rule__Account__Group_13__1 ;
    public final void rule__Account__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2142:1: ( rule__Account__Group_13__0__Impl rule__Account__Group_13__1 )
            // InternalBankSystem.g:2143:2: rule__Account__Group_13__0__Impl rule__Account__Group_13__1
            {
            pushFollow(FOLLOW_23);
            rule__Account__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group_13__1();

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
    // $ANTLR end "rule__Account__Group_13__0"


    // $ANTLR start "rule__Account__Group_13__0__Impl"
    // InternalBankSystem.g:2150:1: rule__Account__Group_13__0__Impl : ( 'Debits per month' ) ;
    public final void rule__Account__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2154:1: ( ( 'Debits per month' ) )
            // InternalBankSystem.g:2155:1: ( 'Debits per month' )
            {
            // InternalBankSystem.g:2155:1: ( 'Debits per month' )
            // InternalBankSystem.g:2156:2: 'Debits per month'
            {
             before(grammarAccess.getAccountAccess().getDebitsPerMonthKeyword_13_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getDebitsPerMonthKeyword_13_0()); 

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
    // $ANTLR end "rule__Account__Group_13__0__Impl"


    // $ANTLR start "rule__Account__Group_13__1"
    // InternalBankSystem.g:2165:1: rule__Account__Group_13__1 : rule__Account__Group_13__1__Impl ;
    public final void rule__Account__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2169:1: ( rule__Account__Group_13__1__Impl )
            // InternalBankSystem.g:2170:2: rule__Account__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Account__Group_13__1__Impl();

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
    // $ANTLR end "rule__Account__Group_13__1"


    // $ANTLR start "rule__Account__Group_13__1__Impl"
    // InternalBankSystem.g:2176:1: rule__Account__Group_13__1__Impl : ( ( rule__Account__DepPerMonthAssignment_13_1 ) ) ;
    public final void rule__Account__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2180:1: ( ( ( rule__Account__DepPerMonthAssignment_13_1 ) ) )
            // InternalBankSystem.g:2181:1: ( ( rule__Account__DepPerMonthAssignment_13_1 ) )
            {
            // InternalBankSystem.g:2181:1: ( ( rule__Account__DepPerMonthAssignment_13_1 ) )
            // InternalBankSystem.g:2182:2: ( rule__Account__DepPerMonthAssignment_13_1 )
            {
             before(grammarAccess.getAccountAccess().getDepPerMonthAssignment_13_1()); 
            // InternalBankSystem.g:2183:2: ( rule__Account__DepPerMonthAssignment_13_1 )
            // InternalBankSystem.g:2183:3: rule__Account__DepPerMonthAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__Account__DepPerMonthAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getAccountAccess().getDepPerMonthAssignment_13_1()); 

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
    // $ANTLR end "rule__Account__Group_13__1__Impl"


    // $ANTLR start "rule__Account__Group_14__0"
    // InternalBankSystem.g:2192:1: rule__Account__Group_14__0 : rule__Account__Group_14__0__Impl rule__Account__Group_14__1 ;
    public final void rule__Account__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2196:1: ( rule__Account__Group_14__0__Impl rule__Account__Group_14__1 )
            // InternalBankSystem.g:2197:2: rule__Account__Group_14__0__Impl rule__Account__Group_14__1
            {
            pushFollow(FOLLOW_9);
            rule__Account__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group_14__1();

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
    // $ANTLR end "rule__Account__Group_14__0"


    // $ANTLR start "rule__Account__Group_14__0__Impl"
    // InternalBankSystem.g:2204:1: rule__Account__Group_14__0__Impl : ( 'Loan period' ) ;
    public final void rule__Account__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2208:1: ( ( 'Loan period' ) )
            // InternalBankSystem.g:2209:1: ( 'Loan period' )
            {
            // InternalBankSystem.g:2209:1: ( 'Loan period' )
            // InternalBankSystem.g:2210:2: 'Loan period'
            {
             before(grammarAccess.getAccountAccess().getLoanPeriodKeyword_14_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getLoanPeriodKeyword_14_0()); 

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
    // $ANTLR end "rule__Account__Group_14__0__Impl"


    // $ANTLR start "rule__Account__Group_14__1"
    // InternalBankSystem.g:2219:1: rule__Account__Group_14__1 : rule__Account__Group_14__1__Impl ;
    public final void rule__Account__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2223:1: ( rule__Account__Group_14__1__Impl )
            // InternalBankSystem.g:2224:2: rule__Account__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Account__Group_14__1__Impl();

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
    // $ANTLR end "rule__Account__Group_14__1"


    // $ANTLR start "rule__Account__Group_14__1__Impl"
    // InternalBankSystem.g:2230:1: rule__Account__Group_14__1__Impl : ( ( rule__Account__LoanPeriodAssignment_14_1 ) ) ;
    public final void rule__Account__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2234:1: ( ( ( rule__Account__LoanPeriodAssignment_14_1 ) ) )
            // InternalBankSystem.g:2235:1: ( ( rule__Account__LoanPeriodAssignment_14_1 ) )
            {
            // InternalBankSystem.g:2235:1: ( ( rule__Account__LoanPeriodAssignment_14_1 ) )
            // InternalBankSystem.g:2236:2: ( rule__Account__LoanPeriodAssignment_14_1 )
            {
             before(grammarAccess.getAccountAccess().getLoanPeriodAssignment_14_1()); 
            // InternalBankSystem.g:2237:2: ( rule__Account__LoanPeriodAssignment_14_1 )
            // InternalBankSystem.g:2237:3: rule__Account__LoanPeriodAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__Account__LoanPeriodAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getAccountAccess().getLoanPeriodAssignment_14_1()); 

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
    // $ANTLR end "rule__Account__Group_14__1__Impl"


    // $ANTLR start "rule__Transaction__Group__0"
    // InternalBankSystem.g:2246:1: rule__Transaction__Group__0 : rule__Transaction__Group__0__Impl rule__Transaction__Group__1 ;
    public final void rule__Transaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2250:1: ( rule__Transaction__Group__0__Impl rule__Transaction__Group__1 )
            // InternalBankSystem.g:2251:2: rule__Transaction__Group__0__Impl rule__Transaction__Group__1
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
    // InternalBankSystem.g:2258:1: rule__Transaction__Group__0__Impl : ( 'transaction {' ) ;
    public final void rule__Transaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2262:1: ( ( 'transaction {' ) )
            // InternalBankSystem.g:2263:1: ( 'transaction {' )
            {
            // InternalBankSystem.g:2263:1: ( 'transaction {' )
            // InternalBankSystem.g:2264:2: 'transaction {'
            {
             before(grammarAccess.getTransactionAccess().getTransactionKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalBankSystem.g:2273:1: rule__Transaction__Group__1 : rule__Transaction__Group__1__Impl rule__Transaction__Group__2 ;
    public final void rule__Transaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2277:1: ( rule__Transaction__Group__1__Impl rule__Transaction__Group__2 )
            // InternalBankSystem.g:2278:2: rule__Transaction__Group__1__Impl rule__Transaction__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalBankSystem.g:2285:1: rule__Transaction__Group__1__Impl : ( 'Account:' ) ;
    public final void rule__Transaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2289:1: ( ( 'Account:' ) )
            // InternalBankSystem.g:2290:1: ( 'Account:' )
            {
            // InternalBankSystem.g:2290:1: ( 'Account:' )
            // InternalBankSystem.g:2291:2: 'Account:'
            {
             before(grammarAccess.getTransactionAccess().getAccountKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalBankSystem.g:2300:1: rule__Transaction__Group__2 : rule__Transaction__Group__2__Impl rule__Transaction__Group__3 ;
    public final void rule__Transaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2304:1: ( rule__Transaction__Group__2__Impl rule__Transaction__Group__3 )
            // InternalBankSystem.g:2305:2: rule__Transaction__Group__2__Impl rule__Transaction__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalBankSystem.g:2312:1: rule__Transaction__Group__2__Impl : ( ( rule__Transaction__AccountAssignment_2 ) ) ;
    public final void rule__Transaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2316:1: ( ( ( rule__Transaction__AccountAssignment_2 ) ) )
            // InternalBankSystem.g:2317:1: ( ( rule__Transaction__AccountAssignment_2 ) )
            {
            // InternalBankSystem.g:2317:1: ( ( rule__Transaction__AccountAssignment_2 ) )
            // InternalBankSystem.g:2318:2: ( rule__Transaction__AccountAssignment_2 )
            {
             before(grammarAccess.getTransactionAccess().getAccountAssignment_2()); 
            // InternalBankSystem.g:2319:2: ( rule__Transaction__AccountAssignment_2 )
            // InternalBankSystem.g:2319:3: rule__Transaction__AccountAssignment_2
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
    // InternalBankSystem.g:2327:1: rule__Transaction__Group__3 : rule__Transaction__Group__3__Impl rule__Transaction__Group__4 ;
    public final void rule__Transaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2331:1: ( rule__Transaction__Group__3__Impl rule__Transaction__Group__4 )
            // InternalBankSystem.g:2332:2: rule__Transaction__Group__3__Impl rule__Transaction__Group__4
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
    // InternalBankSystem.g:2339:1: rule__Transaction__Group__3__Impl : ( 'Amount:' ) ;
    public final void rule__Transaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2343:1: ( ( 'Amount:' ) )
            // InternalBankSystem.g:2344:1: ( 'Amount:' )
            {
            // InternalBankSystem.g:2344:1: ( 'Amount:' )
            // InternalBankSystem.g:2345:2: 'Amount:'
            {
             before(grammarAccess.getTransactionAccess().getAmountKeyword_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalBankSystem.g:2354:1: rule__Transaction__Group__4 : rule__Transaction__Group__4__Impl rule__Transaction__Group__5 ;
    public final void rule__Transaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2358:1: ( rule__Transaction__Group__4__Impl rule__Transaction__Group__5 )
            // InternalBankSystem.g:2359:2: rule__Transaction__Group__4__Impl rule__Transaction__Group__5
            {
            pushFollow(FOLLOW_36);
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
    // InternalBankSystem.g:2366:1: rule__Transaction__Group__4__Impl : ( ( rule__Transaction__AmountAssignment_4 ) ) ;
    public final void rule__Transaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2370:1: ( ( ( rule__Transaction__AmountAssignment_4 ) ) )
            // InternalBankSystem.g:2371:1: ( ( rule__Transaction__AmountAssignment_4 ) )
            {
            // InternalBankSystem.g:2371:1: ( ( rule__Transaction__AmountAssignment_4 ) )
            // InternalBankSystem.g:2372:2: ( rule__Transaction__AmountAssignment_4 )
            {
             before(grammarAccess.getTransactionAccess().getAmountAssignment_4()); 
            // InternalBankSystem.g:2373:2: ( rule__Transaction__AmountAssignment_4 )
            // InternalBankSystem.g:2373:3: rule__Transaction__AmountAssignment_4
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
    // InternalBankSystem.g:2381:1: rule__Transaction__Group__5 : rule__Transaction__Group__5__Impl rule__Transaction__Group__6 ;
    public final void rule__Transaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2385:1: ( rule__Transaction__Group__5__Impl rule__Transaction__Group__6 )
            // InternalBankSystem.g:2386:2: rule__Transaction__Group__5__Impl rule__Transaction__Group__6
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
    // InternalBankSystem.g:2393:1: rule__Transaction__Group__5__Impl : ( 'Date' ) ;
    public final void rule__Transaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2397:1: ( ( 'Date' ) )
            // InternalBankSystem.g:2398:1: ( 'Date' )
            {
            // InternalBankSystem.g:2398:1: ( 'Date' )
            // InternalBankSystem.g:2399:2: 'Date'
            {
             before(grammarAccess.getTransactionAccess().getDateKeyword_5()); 
            match(input,46,FOLLOW_2); 
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
    // InternalBankSystem.g:2408:1: rule__Transaction__Group__6 : rule__Transaction__Group__6__Impl rule__Transaction__Group__7 ;
    public final void rule__Transaction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2412:1: ( rule__Transaction__Group__6__Impl rule__Transaction__Group__7 )
            // InternalBankSystem.g:2413:2: rule__Transaction__Group__6__Impl rule__Transaction__Group__7
            {
            pushFollow(FOLLOW_37);
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
    // InternalBankSystem.g:2420:1: rule__Transaction__Group__6__Impl : ( ( rule__Transaction__DateAssignment_6 ) ) ;
    public final void rule__Transaction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2424:1: ( ( ( rule__Transaction__DateAssignment_6 ) ) )
            // InternalBankSystem.g:2425:1: ( ( rule__Transaction__DateAssignment_6 ) )
            {
            // InternalBankSystem.g:2425:1: ( ( rule__Transaction__DateAssignment_6 ) )
            // InternalBankSystem.g:2426:2: ( rule__Transaction__DateAssignment_6 )
            {
             before(grammarAccess.getTransactionAccess().getDateAssignment_6()); 
            // InternalBankSystem.g:2427:2: ( rule__Transaction__DateAssignment_6 )
            // InternalBankSystem.g:2427:3: rule__Transaction__DateAssignment_6
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
    // InternalBankSystem.g:2435:1: rule__Transaction__Group__7 : rule__Transaction__Group__7__Impl rule__Transaction__Group__8 ;
    public final void rule__Transaction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2439:1: ( rule__Transaction__Group__7__Impl rule__Transaction__Group__8 )
            // InternalBankSystem.g:2440:2: rule__Transaction__Group__7__Impl rule__Transaction__Group__8
            {
            pushFollow(FOLLOW_38);
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
    // InternalBankSystem.g:2447:1: rule__Transaction__Group__7__Impl : ( 'Debit' ) ;
    public final void rule__Transaction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2451:1: ( ( 'Debit' ) )
            // InternalBankSystem.g:2452:1: ( 'Debit' )
            {
            // InternalBankSystem.g:2452:1: ( 'Debit' )
            // InternalBankSystem.g:2453:2: 'Debit'
            {
             before(grammarAccess.getTransactionAccess().getDebitKeyword_7()); 
            match(input,47,FOLLOW_2); 
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
    // InternalBankSystem.g:2462:1: rule__Transaction__Group__8 : rule__Transaction__Group__8__Impl rule__Transaction__Group__9 ;
    public final void rule__Transaction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2466:1: ( rule__Transaction__Group__8__Impl rule__Transaction__Group__9 )
            // InternalBankSystem.g:2467:2: rule__Transaction__Group__8__Impl rule__Transaction__Group__9
            {
            pushFollow(FOLLOW_39);
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
    // InternalBankSystem.g:2474:1: rule__Transaction__Group__8__Impl : ( ( rule__Transaction__DebitAssignment_8 ) ) ;
    public final void rule__Transaction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2478:1: ( ( ( rule__Transaction__DebitAssignment_8 ) ) )
            // InternalBankSystem.g:2479:1: ( ( rule__Transaction__DebitAssignment_8 ) )
            {
            // InternalBankSystem.g:2479:1: ( ( rule__Transaction__DebitAssignment_8 ) )
            // InternalBankSystem.g:2480:2: ( rule__Transaction__DebitAssignment_8 )
            {
             before(grammarAccess.getTransactionAccess().getDebitAssignment_8()); 
            // InternalBankSystem.g:2481:2: ( rule__Transaction__DebitAssignment_8 )
            // InternalBankSystem.g:2481:3: rule__Transaction__DebitAssignment_8
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
    // InternalBankSystem.g:2489:1: rule__Transaction__Group__9 : rule__Transaction__Group__9__Impl rule__Transaction__Group__10 ;
    public final void rule__Transaction__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2493:1: ( rule__Transaction__Group__9__Impl rule__Transaction__Group__10 )
            // InternalBankSystem.g:2494:2: rule__Transaction__Group__9__Impl rule__Transaction__Group__10
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
    // InternalBankSystem.g:2501:1: rule__Transaction__Group__9__Impl : ( 'Vendor name' ) ;
    public final void rule__Transaction__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2505:1: ( ( 'Vendor name' ) )
            // InternalBankSystem.g:2506:1: ( 'Vendor name' )
            {
            // InternalBankSystem.g:2506:1: ( 'Vendor name' )
            // InternalBankSystem.g:2507:2: 'Vendor name'
            {
             before(grammarAccess.getTransactionAccess().getVendorNameKeyword_9()); 
            match(input,48,FOLLOW_2); 
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
    // InternalBankSystem.g:2516:1: rule__Transaction__Group__10 : rule__Transaction__Group__10__Impl rule__Transaction__Group__11 ;
    public final void rule__Transaction__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2520:1: ( rule__Transaction__Group__10__Impl rule__Transaction__Group__11 )
            // InternalBankSystem.g:2521:2: rule__Transaction__Group__10__Impl rule__Transaction__Group__11
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
    // InternalBankSystem.g:2528:1: rule__Transaction__Group__10__Impl : ( ( rule__Transaction__VendorNameAssignment_10 ) ) ;
    public final void rule__Transaction__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2532:1: ( ( ( rule__Transaction__VendorNameAssignment_10 ) ) )
            // InternalBankSystem.g:2533:1: ( ( rule__Transaction__VendorNameAssignment_10 ) )
            {
            // InternalBankSystem.g:2533:1: ( ( rule__Transaction__VendorNameAssignment_10 ) )
            // InternalBankSystem.g:2534:2: ( rule__Transaction__VendorNameAssignment_10 )
            {
             before(grammarAccess.getTransactionAccess().getVendorNameAssignment_10()); 
            // InternalBankSystem.g:2535:2: ( rule__Transaction__VendorNameAssignment_10 )
            // InternalBankSystem.g:2535:3: rule__Transaction__VendorNameAssignment_10
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
    // InternalBankSystem.g:2543:1: rule__Transaction__Group__11 : rule__Transaction__Group__11__Impl ;
    public final void rule__Transaction__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2547:1: ( rule__Transaction__Group__11__Impl )
            // InternalBankSystem.g:2548:2: rule__Transaction__Group__11__Impl
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
    // InternalBankSystem.g:2554:1: rule__Transaction__Group__11__Impl : ( '}' ) ;
    public final void rule__Transaction__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2558:1: ( ( '}' ) )
            // InternalBankSystem.g:2559:1: ( '}' )
            {
            // InternalBankSystem.g:2559:1: ( '}' )
            // InternalBankSystem.g:2560:2: '}'
            {
             before(grammarAccess.getTransactionAccess().getRightCurlyBracketKeyword_11()); 
            match(input,23,FOLLOW_2); 
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
    // InternalBankSystem.g:2570:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2574:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // InternalBankSystem.g:2575:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalBankSystem.g:2582:1: rule__Date__Group__0__Impl : ( ( rule__Date__YearAssignment_0 ) ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2586:1: ( ( ( rule__Date__YearAssignment_0 ) ) )
            // InternalBankSystem.g:2587:1: ( ( rule__Date__YearAssignment_0 ) )
            {
            // InternalBankSystem.g:2587:1: ( ( rule__Date__YearAssignment_0 ) )
            // InternalBankSystem.g:2588:2: ( rule__Date__YearAssignment_0 )
            {
             before(grammarAccess.getDateAccess().getYearAssignment_0()); 
            // InternalBankSystem.g:2589:2: ( rule__Date__YearAssignment_0 )
            // InternalBankSystem.g:2589:3: rule__Date__YearAssignment_0
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
    // InternalBankSystem.g:2597:1: rule__Date__Group__1 : rule__Date__Group__1__Impl rule__Date__Group__2 ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2601:1: ( rule__Date__Group__1__Impl rule__Date__Group__2 )
            // InternalBankSystem.g:2602:2: rule__Date__Group__1__Impl rule__Date__Group__2
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
    // InternalBankSystem.g:2609:1: rule__Date__Group__1__Impl : ( '/' ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2613:1: ( ( '/' ) )
            // InternalBankSystem.g:2614:1: ( '/' )
            {
            // InternalBankSystem.g:2614:1: ( '/' )
            // InternalBankSystem.g:2615:2: '/'
            {
             before(grammarAccess.getDateAccess().getSolidusKeyword_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalBankSystem.g:2624:1: rule__Date__Group__2 : rule__Date__Group__2__Impl rule__Date__Group__3 ;
    public final void rule__Date__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2628:1: ( rule__Date__Group__2__Impl rule__Date__Group__3 )
            // InternalBankSystem.g:2629:2: rule__Date__Group__2__Impl rule__Date__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalBankSystem.g:2636:1: rule__Date__Group__2__Impl : ( ( rule__Date__MonthAssignment_2 ) ) ;
    public final void rule__Date__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2640:1: ( ( ( rule__Date__MonthAssignment_2 ) ) )
            // InternalBankSystem.g:2641:1: ( ( rule__Date__MonthAssignment_2 ) )
            {
            // InternalBankSystem.g:2641:1: ( ( rule__Date__MonthAssignment_2 ) )
            // InternalBankSystem.g:2642:2: ( rule__Date__MonthAssignment_2 )
            {
             before(grammarAccess.getDateAccess().getMonthAssignment_2()); 
            // InternalBankSystem.g:2643:2: ( rule__Date__MonthAssignment_2 )
            // InternalBankSystem.g:2643:3: rule__Date__MonthAssignment_2
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
    // InternalBankSystem.g:2651:1: rule__Date__Group__3 : rule__Date__Group__3__Impl rule__Date__Group__4 ;
    public final void rule__Date__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2655:1: ( rule__Date__Group__3__Impl rule__Date__Group__4 )
            // InternalBankSystem.g:2656:2: rule__Date__Group__3__Impl rule__Date__Group__4
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
    // InternalBankSystem.g:2663:1: rule__Date__Group__3__Impl : ( '/' ) ;
    public final void rule__Date__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2667:1: ( ( '/' ) )
            // InternalBankSystem.g:2668:1: ( '/' )
            {
            // InternalBankSystem.g:2668:1: ( '/' )
            // InternalBankSystem.g:2669:2: '/'
            {
             before(grammarAccess.getDateAccess().getSolidusKeyword_3()); 
            match(input,49,FOLLOW_2); 
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
    // InternalBankSystem.g:2678:1: rule__Date__Group__4 : rule__Date__Group__4__Impl ;
    public final void rule__Date__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2682:1: ( rule__Date__Group__4__Impl )
            // InternalBankSystem.g:2683:2: rule__Date__Group__4__Impl
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
    // InternalBankSystem.g:2689:1: rule__Date__Group__4__Impl : ( ( rule__Date__DayAssignment_4 ) ) ;
    public final void rule__Date__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2693:1: ( ( ( rule__Date__DayAssignment_4 ) ) )
            // InternalBankSystem.g:2694:1: ( ( rule__Date__DayAssignment_4 ) )
            {
            // InternalBankSystem.g:2694:1: ( ( rule__Date__DayAssignment_4 ) )
            // InternalBankSystem.g:2695:2: ( rule__Date__DayAssignment_4 )
            {
             before(grammarAccess.getDateAccess().getDayAssignment_4()); 
            // InternalBankSystem.g:2696:2: ( rule__Date__DayAssignment_4 )
            // InternalBankSystem.g:2696:3: rule__Date__DayAssignment_4
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
    // InternalBankSystem.g:2705:1: rule__BankSystem__BanksAssignment_0 : ( ruleBank ) ;
    public final void rule__BankSystem__BanksAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2709:1: ( ( ruleBank ) )
            // InternalBankSystem.g:2710:2: ( ruleBank )
            {
            // InternalBankSystem.g:2710:2: ( ruleBank )
            // InternalBankSystem.g:2711:3: ruleBank
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
    // InternalBankSystem.g:2720:1: rule__BankSystem__UsersAssignment_1 : ( ruleUser ) ;
    public final void rule__BankSystem__UsersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2724:1: ( ( ruleUser ) )
            // InternalBankSystem.g:2725:2: ( ruleUser )
            {
            // InternalBankSystem.g:2725:2: ( ruleUser )
            // InternalBankSystem.g:2726:3: ruleUser
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
    // InternalBankSystem.g:2735:1: rule__Bank__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Bank__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2739:1: ( ( RULE_ID ) )
            // InternalBankSystem.g:2740:2: ( RULE_ID )
            {
            // InternalBankSystem.g:2740:2: ( RULE_ID )
            // InternalBankSystem.g:2741:3: RULE_ID
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
    // InternalBankSystem.g:2750:1: rule__Bank__CountryOfOriginAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Bank__CountryOfOriginAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2754:1: ( ( RULE_STRING ) )
            // InternalBankSystem.g:2755:2: ( RULE_STRING )
            {
            // InternalBankSystem.g:2755:2: ( RULE_STRING )
            // InternalBankSystem.g:2756:3: RULE_STRING
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
    // InternalBankSystem.g:2765:1: rule__Bank__BranchesAssignment_5 : ( ruleBranch ) ;
    public final void rule__Bank__BranchesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2769:1: ( ( ruleBranch ) )
            // InternalBankSystem.g:2770:2: ( ruleBranch )
            {
            // InternalBankSystem.g:2770:2: ( ruleBranch )
            // InternalBankSystem.g:2771:3: ruleBranch
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
    // InternalBankSystem.g:2780:1: rule__Bank__AccountsAssignment_6 : ( ruleAccount ) ;
    public final void rule__Bank__AccountsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2784:1: ( ( ruleAccount ) )
            // InternalBankSystem.g:2785:2: ( ruleAccount )
            {
            // InternalBankSystem.g:2785:2: ( ruleAccount )
            // InternalBankSystem.g:2786:3: ruleAccount
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
    // InternalBankSystem.g:2795:1: rule__Bank__TransactionsAssignment_7 : ( ruleTransaction ) ;
    public final void rule__Bank__TransactionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2799:1: ( ( ruleTransaction ) )
            // InternalBankSystem.g:2800:2: ( ruleTransaction )
            {
            // InternalBankSystem.g:2800:2: ( ruleTransaction )
            // InternalBankSystem.g:2801:3: ruleTransaction
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
    // InternalBankSystem.g:2810:1: rule__User__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__User__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2814:1: ( ( RULE_ID ) )
            // InternalBankSystem.g:2815:2: ( RULE_ID )
            {
            // InternalBankSystem.g:2815:2: ( RULE_ID )
            // InternalBankSystem.g:2816:3: RULE_ID
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
    // InternalBankSystem.g:2825:1: rule__User__EmailAssignment_5 : ( RULE_STRING ) ;
    public final void rule__User__EmailAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2829:1: ( ( RULE_STRING ) )
            // InternalBankSystem.g:2830:2: ( RULE_STRING )
            {
            // InternalBankSystem.g:2830:2: ( RULE_STRING )
            // InternalBankSystem.g:2831:3: RULE_STRING
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
    // InternalBankSystem.g:2840:1: rule__User__HashpassAssignment_7 : ( RULE_STRING ) ;
    public final void rule__User__HashpassAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2844:1: ( ( RULE_STRING ) )
            // InternalBankSystem.g:2845:2: ( RULE_STRING )
            {
            // InternalBankSystem.g:2845:2: ( RULE_STRING )
            // InternalBankSystem.g:2846:3: RULE_STRING
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
    // InternalBankSystem.g:2855:1: rule__User__AddressAssignment_9 : ( RULE_STRING ) ;
    public final void rule__User__AddressAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2859:1: ( ( RULE_STRING ) )
            // InternalBankSystem.g:2860:2: ( RULE_STRING )
            {
            // InternalBankSystem.g:2860:2: ( RULE_STRING )
            // InternalBankSystem.g:2861:3: RULE_STRING
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
    // InternalBankSystem.g:2870:1: rule__Branch__AddressAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Branch__AddressAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2874:1: ( ( RULE_STRING ) )
            // InternalBankSystem.g:2875:2: ( RULE_STRING )
            {
            // InternalBankSystem.g:2875:2: ( RULE_STRING )
            // InternalBankSystem.g:2876:3: RULE_STRING
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


    // $ANTLR start "rule__Branch__MyboothAssignment_3"
    // InternalBankSystem.g:2885:1: rule__Branch__MyboothAssignment_3 : ( ruleBooth ) ;
    public final void rule__Branch__MyboothAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2889:1: ( ( ruleBooth ) )
            // InternalBankSystem.g:2890:2: ( ruleBooth )
            {
            // InternalBankSystem.g:2890:2: ( ruleBooth )
            // InternalBankSystem.g:2891:3: ruleBooth
            {
             before(grammarAccess.getBranchAccess().getMyboothBoothParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBooth();

            state._fsp--;

             after(grammarAccess.getBranchAccess().getMyboothBoothParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Branch__MyboothAssignment_3"


    // $ANTLR start "rule__Branch__MyVaultAssignment_4"
    // InternalBankSystem.g:2900:1: rule__Branch__MyVaultAssignment_4 : ( ruleVault ) ;
    public final void rule__Branch__MyVaultAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2904:1: ( ( ruleVault ) )
            // InternalBankSystem.g:2905:2: ( ruleVault )
            {
            // InternalBankSystem.g:2905:2: ( ruleVault )
            // InternalBankSystem.g:2906:3: ruleVault
            {
             before(grammarAccess.getBranchAccess().getMyVaultVaultParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVault();

            state._fsp--;

             after(grammarAccess.getBranchAccess().getMyVaultVaultParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Branch__MyVaultAssignment_4"


    // $ANTLR start "rule__Branch__EmployeesAssignment_5"
    // InternalBankSystem.g:2915:1: rule__Branch__EmployeesAssignment_5 : ( ruleEmployee ) ;
    public final void rule__Branch__EmployeesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2919:1: ( ( ruleEmployee ) )
            // InternalBankSystem.g:2920:2: ( ruleEmployee )
            {
            // InternalBankSystem.g:2920:2: ( ruleEmployee )
            // InternalBankSystem.g:2921:3: ruleEmployee
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
    // InternalBankSystem.g:2930:1: rule__Employee__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Employee__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2934:1: ( ( RULE_ID ) )
            // InternalBankSystem.g:2935:2: ( RULE_ID )
            {
            // InternalBankSystem.g:2935:2: ( RULE_ID )
            // InternalBankSystem.g:2936:3: RULE_ID
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
    // InternalBankSystem.g:2945:1: rule__Employee__DateAssignment_4 : ( ruleDate ) ;
    public final void rule__Employee__DateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2949:1: ( ( ruleDate ) )
            // InternalBankSystem.g:2950:2: ( ruleDate )
            {
            // InternalBankSystem.g:2950:2: ( ruleDate )
            // InternalBankSystem.g:2951:3: ruleDate
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
    // InternalBankSystem.g:2960:1: rule__Employee__SalaryAssignment_6 : ( RULE_INT ) ;
    public final void rule__Employee__SalaryAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2964:1: ( ( RULE_INT ) )
            // InternalBankSystem.g:2965:2: ( RULE_INT )
            {
            // InternalBankSystem.g:2965:2: ( RULE_INT )
            // InternalBankSystem.g:2966:3: RULE_INT
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
    // InternalBankSystem.g:2975:1: rule__Employee__CurrentRoleAssignment_8 : ( ruleEmployeeRole ) ;
    public final void rule__Employee__CurrentRoleAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2979:1: ( ( ruleEmployeeRole ) )
            // InternalBankSystem.g:2980:2: ( ruleEmployeeRole )
            {
            // InternalBankSystem.g:2980:2: ( ruleEmployeeRole )
            // InternalBankSystem.g:2981:3: ruleEmployeeRole
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


    // $ANTLR start "rule__Account__AccountNumAssignment_1"
    // InternalBankSystem.g:2990:1: rule__Account__AccountNumAssignment_1 : ( RULE_ID ) ;
    public final void rule__Account__AccountNumAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2994:1: ( ( RULE_ID ) )
            // InternalBankSystem.g:2995:2: ( RULE_ID )
            {
            // InternalBankSystem.g:2995:2: ( RULE_ID )
            // InternalBankSystem.g:2996:3: RULE_ID
            {
             before(grammarAccess.getAccountAccess().getAccountNumIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getAccountNumIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Account__AccountNumAssignment_1"


    // $ANTLR start "rule__Account__HolderAssignment_4"
    // InternalBankSystem.g:3005:1: rule__Account__HolderAssignment_4 : ( RULE_ID ) ;
    public final void rule__Account__HolderAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:3009:1: ( ( RULE_ID ) )
            // InternalBankSystem.g:3010:2: ( RULE_ID )
            {
            // InternalBankSystem.g:3010:2: ( RULE_ID )
            // InternalBankSystem.g:3011:3: RULE_ID
            {
             before(grammarAccess.getAccountAccess().getHolderIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getHolderIDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Account__HolderAssignment_4"


    // $ANTLR start "rule__Account__BalanceAssignment_6"
    // InternalBankSystem.g:3020:1: rule__Account__BalanceAssignment_6 : ( RULE_INT ) ;
    public final void rule__Account__BalanceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:3024:1: ( ( RULE_INT ) )
            // InternalBankSystem.g:3025:2: ( RULE_INT )
            {
            // InternalBankSystem.g:3025:2: ( RULE_INT )
            // InternalBankSystem.g:3026:3: RULE_INT
            {
             before(grammarAccess.getAccountAccess().getBalanceINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getBalanceINTTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__Account__BalanceAssignment_6"


    // $ANTLR start "rule__Account__MfaTypeAssignment_9"
    // InternalBankSystem.g:3035:1: rule__Account__MfaTypeAssignment_9 : ( RULE_STRING ) ;
    public final void rule__Account__MfaTypeAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:3039:1: ( ( RULE_STRING ) )
            // InternalBankSystem.g:3040:2: ( RULE_STRING )
            {
            // InternalBankSystem.g:3040:2: ( RULE_STRING )
            // InternalBankSystem.g:3041:3: RULE_STRING
            {
             before(grammarAccess.getAccountAccess().getMfaTypeSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getMfaTypeSTRINGTerminalRuleCall_9_0()); 

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
    // $ANTLR end "rule__Account__MfaTypeAssignment_9"


    // $ANTLR start "rule__Account__AccountTypeAssignment_11"
    // InternalBankSystem.g:3050:1: rule__Account__AccountTypeAssignment_11 : ( ruleAccountType ) ;
    public final void rule__Account__AccountTypeAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:3054:1: ( ( ruleAccountType ) )
            // InternalBankSystem.g:3055:2: ( ruleAccountType )
            {
            // InternalBankSystem.g:3055:2: ( ruleAccountType )
            // InternalBankSystem.g:3056:3: ruleAccountType
            {
             before(grammarAccess.getAccountAccess().getAccountTypeAccountTypeParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleAccountType();

            state._fsp--;

             after(grammarAccess.getAccountAccess().getAccountTypeAccountTypeParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__Account__AccountTypeAssignment_11"


    // $ANTLR start "rule__Account__IntRateAssignment_12_1"
    // InternalBankSystem.g:3065:1: rule__Account__IntRateAssignment_12_1 : ( RULE_INT ) ;
    public final void rule__Account__IntRateAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:3069:1: ( ( RULE_INT ) )
            // InternalBankSystem.g:3070:2: ( RULE_INT )
            {
            // InternalBankSystem.g:3070:2: ( RULE_INT )
            // InternalBankSystem.g:3071:3: RULE_INT
            {
             before(grammarAccess.getAccountAccess().getIntRateINTTerminalRuleCall_12_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getIntRateINTTerminalRuleCall_12_1_0()); 

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
    // $ANTLR end "rule__Account__IntRateAssignment_12_1"


    // $ANTLR start "rule__Account__DepPerMonthAssignment_13_1"
    // InternalBankSystem.g:3080:1: rule__Account__DepPerMonthAssignment_13_1 : ( RULE_INT ) ;
    public final void rule__Account__DepPerMonthAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:3084:1: ( ( RULE_INT ) )
            // InternalBankSystem.g:3085:2: ( RULE_INT )
            {
            // InternalBankSystem.g:3085:2: ( RULE_INT )
            // InternalBankSystem.g:3086:3: RULE_INT
            {
             before(grammarAccess.getAccountAccess().getDepPerMonthINTTerminalRuleCall_13_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getDepPerMonthINTTerminalRuleCall_13_1_0()); 

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
    // $ANTLR end "rule__Account__DepPerMonthAssignment_13_1"


    // $ANTLR start "rule__Account__LoanPeriodAssignment_14_1"
    // InternalBankSystem.g:3095:1: rule__Account__LoanPeriodAssignment_14_1 : ( RULE_STRING ) ;
    public final void rule__Account__LoanPeriodAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:3099:1: ( ( RULE_STRING ) )
            // InternalBankSystem.g:3100:2: ( RULE_STRING )
            {
            // InternalBankSystem.g:3100:2: ( RULE_STRING )
            // InternalBankSystem.g:3101:3: RULE_STRING
            {
             before(grammarAccess.getAccountAccess().getLoanPeriodSTRINGTerminalRuleCall_14_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getLoanPeriodSTRINGTerminalRuleCall_14_1_0()); 

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
    // $ANTLR end "rule__Account__LoanPeriodAssignment_14_1"


    // $ANTLR start "rule__Transaction__AccountAssignment_2"
    // InternalBankSystem.g:3110:1: rule__Transaction__AccountAssignment_2 : ( RULE_ID ) ;
    public final void rule__Transaction__AccountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:3114:1: ( ( RULE_ID ) )
            // InternalBankSystem.g:3115:2: ( RULE_ID )
            {
            // InternalBankSystem.g:3115:2: ( RULE_ID )
            // InternalBankSystem.g:3116:3: RULE_ID
            {
             before(grammarAccess.getTransactionAccess().getAccountIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getAccountIDTerminalRuleCall_2_0()); 

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
    // InternalBankSystem.g:3125:1: rule__Transaction__AmountAssignment_4 : ( RULE_INT ) ;
    public final void rule__Transaction__AmountAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:3129:1: ( ( RULE_INT ) )
            // InternalBankSystem.g:3130:2: ( RULE_INT )
            {
            // InternalBankSystem.g:3130:2: ( RULE_INT )
            // InternalBankSystem.g:3131:3: RULE_INT
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
    // InternalBankSystem.g:3140:1: rule__Transaction__DateAssignment_6 : ( ruleDate ) ;
    public final void rule__Transaction__DateAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:3144:1: ( ( ruleDate ) )
            // InternalBankSystem.g:3145:2: ( ruleDate )
            {
            // InternalBankSystem.g:3145:2: ( ruleDate )
            // InternalBankSystem.g:3146:3: ruleDate
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
    // InternalBankSystem.g:3155:1: rule__Transaction__DebitAssignment_8 : ( ruleBoolean ) ;
    public final void rule__Transaction__DebitAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:3159:1: ( ( ruleBoolean ) )
            // InternalBankSystem.g:3160:2: ( ruleBoolean )
            {
            // InternalBankSystem.g:3160:2: ( ruleBoolean )
            // InternalBankSystem.g:3161:3: ruleBoolean
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
    // InternalBankSystem.g:3170:1: rule__Transaction__VendorNameAssignment_10 : ( RULE_STRING ) ;
    public final void rule__Transaction__VendorNameAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:3174:1: ( ( RULE_STRING ) )
            // InternalBankSystem.g:3175:2: ( RULE_STRING )
            {
            // InternalBankSystem.g:3175:2: ( RULE_STRING )
            // InternalBankSystem.g:3176:3: RULE_STRING
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
    // InternalBankSystem.g:3185:1: rule__Date__YearAssignment_0 : ( RULE_INT ) ;
    public final void rule__Date__YearAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:3189:1: ( ( RULE_INT ) )
            // InternalBankSystem.g:3190:2: ( RULE_INT )
            {
            // InternalBankSystem.g:3190:2: ( RULE_INT )
            // InternalBankSystem.g:3191:3: RULE_INT
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
    // InternalBankSystem.g:3200:1: rule__Date__MonthAssignment_2 : ( RULE_INT ) ;
    public final void rule__Date__MonthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:3204:1: ( ( RULE_INT ) )
            // InternalBankSystem.g:3205:2: ( RULE_INT )
            {
            // InternalBankSystem.g:3205:2: ( RULE_INT )
            // InternalBankSystem.g:3206:3: RULE_INT
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
    // InternalBankSystem.g:3215:1: rule__Date__DayAssignment_4 : ( RULE_INT ) ;
    public final void rule__Date__DayAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:3219:1: ( ( RULE_INT ) )
            // InternalBankSystem.g:3220:2: ( RULE_INT )
            {
            // InternalBankSystem.g:3220:2: ( RULE_INT )
            // InternalBankSystem.g:3221:3: RULE_INT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000080400800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040001800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040001802L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000070000800000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0002000000000000L});

}