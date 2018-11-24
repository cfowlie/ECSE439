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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Booth'", "'Vault'", "'Teller'", "'Manager'", "'true'", "'false'", "'Bank'", "'Country'", "'{'", "'}'", "'User'", "'Name'", "'Email'", "'HashPass'", "'Address'", "'Branch{'", "'Employee'", "'Hiring date'", "'Salary'", "'Current Role'", "'Holder(s)'", "'Balance'", "'Account Number'", "'MFA Type'", "'Savings Account {'", "'Interest rate'", "'Checking Account {'", "'Debits per month'", "'Mortgage Account {'", "'Loan period'", "'transaction {'", "'Source:'", "'Target:'", "'Amount:'", "'Date'", "'Debit'", "'Vendor name'", "'/'"
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
    // InternalBankSystem.g:680:1: rule__Bank__Group__2__Impl : ( 'Country' ) ;
    public final void rule__Bank__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:684:1: ( ( 'Country' ) )
            // InternalBankSystem.g:685:1: ( 'Country' )
            {
            // InternalBankSystem.g:685:1: ( 'Country' )
            // InternalBankSystem.g:686:2: 'Country'
            {
             before(grammarAccess.getBankAccess().getCountryKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBankAccess().getCountryKeyword_2()); 

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
    // InternalBankSystem.g:707:1: rule__Bank__Group__3__Impl : ( ( rule__Bank__CountryOfOriginAssignment_3 ) ) ;
    public final void rule__Bank__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:711:1: ( ( ( rule__Bank__CountryOfOriginAssignment_3 ) ) )
            // InternalBankSystem.g:712:1: ( ( rule__Bank__CountryOfOriginAssignment_3 ) )
            {
            // InternalBankSystem.g:712:1: ( ( rule__Bank__CountryOfOriginAssignment_3 ) )
            // InternalBankSystem.g:713:2: ( rule__Bank__CountryOfOriginAssignment_3 )
            {
             before(grammarAccess.getBankAccess().getCountryOfOriginAssignment_3()); 
            // InternalBankSystem.g:714:2: ( rule__Bank__CountryOfOriginAssignment_3 )
            // InternalBankSystem.g:714:3: rule__Bank__CountryOfOriginAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Bank__CountryOfOriginAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBankAccess().getCountryOfOriginAssignment_3()); 

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
    // InternalBankSystem.g:734:1: rule__Bank__Group__4__Impl : ( '{' ) ;
    public final void rule__Bank__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:738:1: ( ( '{' ) )
            // InternalBankSystem.g:739:1: ( '{' )
            {
            // InternalBankSystem.g:739:1: ( '{' )
            // InternalBankSystem.g:740:2: '{'
            {
             before(grammarAccess.getBankAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBankAccess().getLeftCurlyBracketKeyword_4()); 

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
            pushFollow(FOLLOW_9);
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
            match(input,19,FOLLOW_2); 
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
            pushFollow(FOLLOW_6);
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
            pushFollow(FOLLOW_6);
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
            pushFollow(FOLLOW_6);
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
            pushFollow(FOLLOW_8);
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
            pushFollow(FOLLOW_21);
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
    // InternalBankSystem.g:1254:1: rule__Branch__Group__3__Impl : ( ruleBooth ) ;
    public final void rule__Branch__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1258:1: ( ( ruleBooth ) )
            // InternalBankSystem.g:1259:1: ( ruleBooth )
            {
            // InternalBankSystem.g:1259:1: ( ruleBooth )
            // InternalBankSystem.g:1260:2: ruleBooth
            {
             before(grammarAccess.getBranchAccess().getBoothParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleBooth();

            state._fsp--;

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
            pushFollow(FOLLOW_22);
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
    // InternalBankSystem.g:1281:1: rule__Branch__Group__4__Impl : ( ruleVault ) ;
    public final void rule__Branch__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1285:1: ( ( ruleVault ) )
            // InternalBankSystem.g:1286:1: ( ruleVault )
            {
            // InternalBankSystem.g:1286:1: ( ruleVault )
            // InternalBankSystem.g:1287:2: ruleVault
            {
             before(grammarAccess.getBranchAccess().getVaultParserRuleCall_4()); 
            pushFollow(FOLLOW_2);
            ruleVault();

            state._fsp--;

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
            pushFollow(FOLLOW_23);
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
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBankSystem.g:1321:4: rule__Branch__EmployeesAssignment_5
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Branch__EmployeesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
            pushFollow(FOLLOW_9);
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
            pushFollow(FOLLOW_24);
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
            match(input,19,FOLLOW_2); 
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
            pushFollow(FOLLOW_25);
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
            pushFollow(FOLLOW_26);
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
            pushFollow(FOLLOW_25);
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
            pushFollow(FOLLOW_27);
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
            pushFollow(FOLLOW_28);
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
            pushFollow(FOLLOW_29);
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
            pushFollow(FOLLOW_30);
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
    // InternalBankSystem.g:1693:1: rule__Account__Group__2__Impl : ( ( ( rule__Account__HoldersAssignment_2 ) ) ( ( rule__Account__HoldersAssignment_2 )* ) ) ;
    public final void rule__Account__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1697:1: ( ( ( ( rule__Account__HoldersAssignment_2 ) ) ( ( rule__Account__HoldersAssignment_2 )* ) ) )
            // InternalBankSystem.g:1698:1: ( ( ( rule__Account__HoldersAssignment_2 ) ) ( ( rule__Account__HoldersAssignment_2 )* ) )
            {
            // InternalBankSystem.g:1698:1: ( ( ( rule__Account__HoldersAssignment_2 ) ) ( ( rule__Account__HoldersAssignment_2 )* ) )
            // InternalBankSystem.g:1699:2: ( ( rule__Account__HoldersAssignment_2 ) ) ( ( rule__Account__HoldersAssignment_2 )* )
            {
            // InternalBankSystem.g:1699:2: ( ( rule__Account__HoldersAssignment_2 ) )
            // InternalBankSystem.g:1700:3: ( rule__Account__HoldersAssignment_2 )
            {
             before(grammarAccess.getAccountAccess().getHoldersAssignment_2()); 
            // InternalBankSystem.g:1701:3: ( rule__Account__HoldersAssignment_2 )
            // InternalBankSystem.g:1701:4: rule__Account__HoldersAssignment_2
            {
            pushFollow(FOLLOW_5);
            rule__Account__HoldersAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAccountAccess().getHoldersAssignment_2()); 

            }

            // InternalBankSystem.g:1704:2: ( ( rule__Account__HoldersAssignment_2 )* )
            // InternalBankSystem.g:1705:3: ( rule__Account__HoldersAssignment_2 )*
            {
             before(grammarAccess.getAccountAccess().getHoldersAssignment_2()); 
            // InternalBankSystem.g:1706:3: ( rule__Account__HoldersAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBankSystem.g:1706:4: rule__Account__HoldersAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Account__HoldersAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getAccountAccess().getHoldersAssignment_2()); 

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
    // $ANTLR end "rule__Account__Group__2__Impl"


    // $ANTLR start "rule__Account__Group__3"
    // InternalBankSystem.g:1715:1: rule__Account__Group__3 : rule__Account__Group__3__Impl rule__Account__Group__4 ;
    public final void rule__Account__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1719:1: ( rule__Account__Group__3__Impl rule__Account__Group__4 )
            // InternalBankSystem.g:1720:2: rule__Account__Group__3__Impl rule__Account__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalBankSystem.g:1727:1: rule__Account__Group__3__Impl : ( 'Balance' ) ;
    public final void rule__Account__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1731:1: ( ( 'Balance' ) )
            // InternalBankSystem.g:1732:1: ( 'Balance' )
            {
            // InternalBankSystem.g:1732:1: ( 'Balance' )
            // InternalBankSystem.g:1733:2: 'Balance'
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
    // InternalBankSystem.g:1742:1: rule__Account__Group__4 : rule__Account__Group__4__Impl rule__Account__Group__5 ;
    public final void rule__Account__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1746:1: ( rule__Account__Group__4__Impl rule__Account__Group__5 )
            // InternalBankSystem.g:1747:2: rule__Account__Group__4__Impl rule__Account__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalBankSystem.g:1754:1: rule__Account__Group__4__Impl : ( ( rule__Account__BalanceAssignment_4 ) ) ;
    public final void rule__Account__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1758:1: ( ( ( rule__Account__BalanceAssignment_4 ) ) )
            // InternalBankSystem.g:1759:1: ( ( rule__Account__BalanceAssignment_4 ) )
            {
            // InternalBankSystem.g:1759:1: ( ( rule__Account__BalanceAssignment_4 ) )
            // InternalBankSystem.g:1760:2: ( rule__Account__BalanceAssignment_4 )
            {
             before(grammarAccess.getAccountAccess().getBalanceAssignment_4()); 
            // InternalBankSystem.g:1761:2: ( rule__Account__BalanceAssignment_4 )
            // InternalBankSystem.g:1761:3: rule__Account__BalanceAssignment_4
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
    // InternalBankSystem.g:1769:1: rule__Account__Group__5 : rule__Account__Group__5__Impl rule__Account__Group__6 ;
    public final void rule__Account__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1773:1: ( rule__Account__Group__5__Impl rule__Account__Group__6 )
            // InternalBankSystem.g:1774:2: rule__Account__Group__5__Impl rule__Account__Group__6
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
    // InternalBankSystem.g:1781:1: rule__Account__Group__5__Impl : ( 'Account Number' ) ;
    public final void rule__Account__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1785:1: ( ( 'Account Number' ) )
            // InternalBankSystem.g:1786:1: ( 'Account Number' )
            {
            // InternalBankSystem.g:1786:1: ( 'Account Number' )
            // InternalBankSystem.g:1787:2: 'Account Number'
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
    // InternalBankSystem.g:1796:1: rule__Account__Group__6 : rule__Account__Group__6__Impl rule__Account__Group__7 ;
    public final void rule__Account__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1800:1: ( rule__Account__Group__6__Impl rule__Account__Group__7 )
            // InternalBankSystem.g:1801:2: rule__Account__Group__6__Impl rule__Account__Group__7
            {
            pushFollow(FOLLOW_32);
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
    // InternalBankSystem.g:1808:1: rule__Account__Group__6__Impl : ( ( rule__Account__AccountNumAssignment_6 ) ) ;
    public final void rule__Account__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1812:1: ( ( ( rule__Account__AccountNumAssignment_6 ) ) )
            // InternalBankSystem.g:1813:1: ( ( rule__Account__AccountNumAssignment_6 ) )
            {
            // InternalBankSystem.g:1813:1: ( ( rule__Account__AccountNumAssignment_6 ) )
            // InternalBankSystem.g:1814:2: ( rule__Account__AccountNumAssignment_6 )
            {
             before(grammarAccess.getAccountAccess().getAccountNumAssignment_6()); 
            // InternalBankSystem.g:1815:2: ( rule__Account__AccountNumAssignment_6 )
            // InternalBankSystem.g:1815:3: rule__Account__AccountNumAssignment_6
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
    // InternalBankSystem.g:1823:1: rule__Account__Group__7 : rule__Account__Group__7__Impl rule__Account__Group__8 ;
    public final void rule__Account__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1827:1: ( rule__Account__Group__7__Impl rule__Account__Group__8 )
            // InternalBankSystem.g:1828:2: rule__Account__Group__7__Impl rule__Account__Group__8
            {
            pushFollow(FOLLOW_8);
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
    // InternalBankSystem.g:1835:1: rule__Account__Group__7__Impl : ( 'MFA Type' ) ;
    public final void rule__Account__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1839:1: ( ( 'MFA Type' ) )
            // InternalBankSystem.g:1840:1: ( 'MFA Type' )
            {
            // InternalBankSystem.g:1840:1: ( 'MFA Type' )
            // InternalBankSystem.g:1841:2: 'MFA Type'
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
    // InternalBankSystem.g:1850:1: rule__Account__Group__8 : rule__Account__Group__8__Impl rule__Account__Group__9 ;
    public final void rule__Account__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1854:1: ( rule__Account__Group__8__Impl rule__Account__Group__9 )
            // InternalBankSystem.g:1855:2: rule__Account__Group__8__Impl rule__Account__Group__9
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
    // InternalBankSystem.g:1862:1: rule__Account__Group__8__Impl : ( ( rule__Account__MfaTypeAssignment_8 ) ) ;
    public final void rule__Account__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1866:1: ( ( ( rule__Account__MfaTypeAssignment_8 ) ) )
            // InternalBankSystem.g:1867:1: ( ( rule__Account__MfaTypeAssignment_8 ) )
            {
            // InternalBankSystem.g:1867:1: ( ( rule__Account__MfaTypeAssignment_8 ) )
            // InternalBankSystem.g:1868:2: ( rule__Account__MfaTypeAssignment_8 )
            {
             before(grammarAccess.getAccountAccess().getMfaTypeAssignment_8()); 
            // InternalBankSystem.g:1869:2: ( rule__Account__MfaTypeAssignment_8 )
            // InternalBankSystem.g:1869:3: rule__Account__MfaTypeAssignment_8
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
    // InternalBankSystem.g:1877:1: rule__Account__Group__9 : rule__Account__Group__9__Impl ;
    public final void rule__Account__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1881:1: ( rule__Account__Group__9__Impl )
            // InternalBankSystem.g:1882:2: rule__Account__Group__9__Impl
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
    // InternalBankSystem.g:1888:1: rule__Account__Group__9__Impl : ( '}' ) ;
    public final void rule__Account__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1892:1: ( ( '}' ) )
            // InternalBankSystem.g:1893:1: ( '}' )
            {
            // InternalBankSystem.g:1893:1: ( '}' )
            // InternalBankSystem.g:1894:2: '}'
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
    // InternalBankSystem.g:1904:1: rule__SavingsAccount__Group__0 : rule__SavingsAccount__Group__0__Impl rule__SavingsAccount__Group__1 ;
    public final void rule__SavingsAccount__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1908:1: ( rule__SavingsAccount__Group__0__Impl rule__SavingsAccount__Group__1 )
            // InternalBankSystem.g:1909:2: rule__SavingsAccount__Group__0__Impl rule__SavingsAccount__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalBankSystem.g:1916:1: rule__SavingsAccount__Group__0__Impl : ( 'Savings Account {' ) ;
    public final void rule__SavingsAccount__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1920:1: ( ( 'Savings Account {' ) )
            // InternalBankSystem.g:1921:1: ( 'Savings Account {' )
            {
            // InternalBankSystem.g:1921:1: ( 'Savings Account {' )
            // InternalBankSystem.g:1922:2: 'Savings Account {'
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
    // InternalBankSystem.g:1931:1: rule__SavingsAccount__Group__1 : rule__SavingsAccount__Group__1__Impl rule__SavingsAccount__Group__2 ;
    public final void rule__SavingsAccount__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1935:1: ( rule__SavingsAccount__Group__1__Impl rule__SavingsAccount__Group__2 )
            // InternalBankSystem.g:1936:2: rule__SavingsAccount__Group__1__Impl rule__SavingsAccount__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalBankSystem.g:1943:1: rule__SavingsAccount__Group__1__Impl : ( 'Interest rate' ) ;
    public final void rule__SavingsAccount__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1947:1: ( ( 'Interest rate' ) )
            // InternalBankSystem.g:1948:1: ( 'Interest rate' )
            {
            // InternalBankSystem.g:1948:1: ( 'Interest rate' )
            // InternalBankSystem.g:1949:2: 'Interest rate'
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
    // InternalBankSystem.g:1958:1: rule__SavingsAccount__Group__2 : rule__SavingsAccount__Group__2__Impl ;
    public final void rule__SavingsAccount__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1962:1: ( rule__SavingsAccount__Group__2__Impl )
            // InternalBankSystem.g:1963:2: rule__SavingsAccount__Group__2__Impl
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
    // InternalBankSystem.g:1969:1: rule__SavingsAccount__Group__2__Impl : ( ( rule__SavingsAccount__IntRateAssignment_2 ) ) ;
    public final void rule__SavingsAccount__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1973:1: ( ( ( rule__SavingsAccount__IntRateAssignment_2 ) ) )
            // InternalBankSystem.g:1974:1: ( ( rule__SavingsAccount__IntRateAssignment_2 ) )
            {
            // InternalBankSystem.g:1974:1: ( ( rule__SavingsAccount__IntRateAssignment_2 ) )
            // InternalBankSystem.g:1975:2: ( rule__SavingsAccount__IntRateAssignment_2 )
            {
             before(grammarAccess.getSavingsAccountAccess().getIntRateAssignment_2()); 
            // InternalBankSystem.g:1976:2: ( rule__SavingsAccount__IntRateAssignment_2 )
            // InternalBankSystem.g:1976:3: rule__SavingsAccount__IntRateAssignment_2
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
    // InternalBankSystem.g:1985:1: rule__CheckingAccount__Group__0 : rule__CheckingAccount__Group__0__Impl rule__CheckingAccount__Group__1 ;
    public final void rule__CheckingAccount__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:1989:1: ( rule__CheckingAccount__Group__0__Impl rule__CheckingAccount__Group__1 )
            // InternalBankSystem.g:1990:2: rule__CheckingAccount__Group__0__Impl rule__CheckingAccount__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalBankSystem.g:1997:1: rule__CheckingAccount__Group__0__Impl : ( 'Checking Account {' ) ;
    public final void rule__CheckingAccount__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2001:1: ( ( 'Checking Account {' ) )
            // InternalBankSystem.g:2002:1: ( 'Checking Account {' )
            {
            // InternalBankSystem.g:2002:1: ( 'Checking Account {' )
            // InternalBankSystem.g:2003:2: 'Checking Account {'
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
    // InternalBankSystem.g:2012:1: rule__CheckingAccount__Group__1 : rule__CheckingAccount__Group__1__Impl rule__CheckingAccount__Group__2 ;
    public final void rule__CheckingAccount__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2016:1: ( rule__CheckingAccount__Group__1__Impl rule__CheckingAccount__Group__2 )
            // InternalBankSystem.g:2017:2: rule__CheckingAccount__Group__1__Impl rule__CheckingAccount__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalBankSystem.g:2024:1: rule__CheckingAccount__Group__1__Impl : ( 'Debits per month' ) ;
    public final void rule__CheckingAccount__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2028:1: ( ( 'Debits per month' ) )
            // InternalBankSystem.g:2029:1: ( 'Debits per month' )
            {
            // InternalBankSystem.g:2029:1: ( 'Debits per month' )
            // InternalBankSystem.g:2030:2: 'Debits per month'
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
    // InternalBankSystem.g:2039:1: rule__CheckingAccount__Group__2 : rule__CheckingAccount__Group__2__Impl ;
    public final void rule__CheckingAccount__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2043:1: ( rule__CheckingAccount__Group__2__Impl )
            // InternalBankSystem.g:2044:2: rule__CheckingAccount__Group__2__Impl
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
    // InternalBankSystem.g:2050:1: rule__CheckingAccount__Group__2__Impl : ( ( rule__CheckingAccount__DepPerMonthAssignment_2 ) ) ;
    public final void rule__CheckingAccount__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2054:1: ( ( ( rule__CheckingAccount__DepPerMonthAssignment_2 ) ) )
            // InternalBankSystem.g:2055:1: ( ( rule__CheckingAccount__DepPerMonthAssignment_2 ) )
            {
            // InternalBankSystem.g:2055:1: ( ( rule__CheckingAccount__DepPerMonthAssignment_2 ) )
            // InternalBankSystem.g:2056:2: ( rule__CheckingAccount__DepPerMonthAssignment_2 )
            {
             before(grammarAccess.getCheckingAccountAccess().getDepPerMonthAssignment_2()); 
            // InternalBankSystem.g:2057:2: ( rule__CheckingAccount__DepPerMonthAssignment_2 )
            // InternalBankSystem.g:2057:3: rule__CheckingAccount__DepPerMonthAssignment_2
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
    // InternalBankSystem.g:2066:1: rule__MortgageAccount__Group__0 : rule__MortgageAccount__Group__0__Impl rule__MortgageAccount__Group__1 ;
    public final void rule__MortgageAccount__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2070:1: ( rule__MortgageAccount__Group__0__Impl rule__MortgageAccount__Group__1 )
            // InternalBankSystem.g:2071:2: rule__MortgageAccount__Group__0__Impl rule__MortgageAccount__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalBankSystem.g:2078:1: rule__MortgageAccount__Group__0__Impl : ( 'Mortgage Account {' ) ;
    public final void rule__MortgageAccount__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2082:1: ( ( 'Mortgage Account {' ) )
            // InternalBankSystem.g:2083:1: ( 'Mortgage Account {' )
            {
            // InternalBankSystem.g:2083:1: ( 'Mortgage Account {' )
            // InternalBankSystem.g:2084:2: 'Mortgage Account {'
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
    // InternalBankSystem.g:2093:1: rule__MortgageAccount__Group__1 : rule__MortgageAccount__Group__1__Impl rule__MortgageAccount__Group__2 ;
    public final void rule__MortgageAccount__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2097:1: ( rule__MortgageAccount__Group__1__Impl rule__MortgageAccount__Group__2 )
            // InternalBankSystem.g:2098:2: rule__MortgageAccount__Group__1__Impl rule__MortgageAccount__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalBankSystem.g:2105:1: rule__MortgageAccount__Group__1__Impl : ( 'Loan period' ) ;
    public final void rule__MortgageAccount__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2109:1: ( ( 'Loan period' ) )
            // InternalBankSystem.g:2110:1: ( 'Loan period' )
            {
            // InternalBankSystem.g:2110:1: ( 'Loan period' )
            // InternalBankSystem.g:2111:2: 'Loan period'
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
    // InternalBankSystem.g:2120:1: rule__MortgageAccount__Group__2 : rule__MortgageAccount__Group__2__Impl ;
    public final void rule__MortgageAccount__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2124:1: ( rule__MortgageAccount__Group__2__Impl )
            // InternalBankSystem.g:2125:2: rule__MortgageAccount__Group__2__Impl
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
    // InternalBankSystem.g:2131:1: rule__MortgageAccount__Group__2__Impl : ( ( rule__MortgageAccount__LoanPeriodAssignment_2 ) ) ;
    public final void rule__MortgageAccount__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2135:1: ( ( ( rule__MortgageAccount__LoanPeriodAssignment_2 ) ) )
            // InternalBankSystem.g:2136:1: ( ( rule__MortgageAccount__LoanPeriodAssignment_2 ) )
            {
            // InternalBankSystem.g:2136:1: ( ( rule__MortgageAccount__LoanPeriodAssignment_2 ) )
            // InternalBankSystem.g:2137:2: ( rule__MortgageAccount__LoanPeriodAssignment_2 )
            {
             before(grammarAccess.getMortgageAccountAccess().getLoanPeriodAssignment_2()); 
            // InternalBankSystem.g:2138:2: ( rule__MortgageAccount__LoanPeriodAssignment_2 )
            // InternalBankSystem.g:2138:3: rule__MortgageAccount__LoanPeriodAssignment_2
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
    // InternalBankSystem.g:2147:1: rule__Transaction__Group__0 : rule__Transaction__Group__0__Impl rule__Transaction__Group__1 ;
    public final void rule__Transaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2151:1: ( rule__Transaction__Group__0__Impl rule__Transaction__Group__1 )
            // InternalBankSystem.g:2152:2: rule__Transaction__Group__0__Impl rule__Transaction__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalBankSystem.g:2159:1: rule__Transaction__Group__0__Impl : ( 'transaction {' ) ;
    public final void rule__Transaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2163:1: ( ( 'transaction {' ) )
            // InternalBankSystem.g:2164:1: ( 'transaction {' )
            {
            // InternalBankSystem.g:2164:1: ( 'transaction {' )
            // InternalBankSystem.g:2165:2: 'transaction {'
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
    // InternalBankSystem.g:2174:1: rule__Transaction__Group__1 : rule__Transaction__Group__1__Impl rule__Transaction__Group__2 ;
    public final void rule__Transaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2178:1: ( rule__Transaction__Group__1__Impl rule__Transaction__Group__2 )
            // InternalBankSystem.g:2179:2: rule__Transaction__Group__1__Impl rule__Transaction__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalBankSystem.g:2186:1: rule__Transaction__Group__1__Impl : ( 'Source:' ) ;
    public final void rule__Transaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2190:1: ( ( 'Source:' ) )
            // InternalBankSystem.g:2191:1: ( 'Source:' )
            {
            // InternalBankSystem.g:2191:1: ( 'Source:' )
            // InternalBankSystem.g:2192:2: 'Source:'
            {
             before(grammarAccess.getTransactionAccess().getSourceKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getSourceKeyword_1()); 

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
    // InternalBankSystem.g:2201:1: rule__Transaction__Group__2 : rule__Transaction__Group__2__Impl rule__Transaction__Group__3 ;
    public final void rule__Transaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2205:1: ( rule__Transaction__Group__2__Impl rule__Transaction__Group__3 )
            // InternalBankSystem.g:2206:2: rule__Transaction__Group__2__Impl rule__Transaction__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalBankSystem.g:2213:1: rule__Transaction__Group__2__Impl : ( ( rule__Transaction__SourceAccountAssignment_2 ) ) ;
    public final void rule__Transaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2217:1: ( ( ( rule__Transaction__SourceAccountAssignment_2 ) ) )
            // InternalBankSystem.g:2218:1: ( ( rule__Transaction__SourceAccountAssignment_2 ) )
            {
            // InternalBankSystem.g:2218:1: ( ( rule__Transaction__SourceAccountAssignment_2 ) )
            // InternalBankSystem.g:2219:2: ( rule__Transaction__SourceAccountAssignment_2 )
            {
             before(grammarAccess.getTransactionAccess().getSourceAccountAssignment_2()); 
            // InternalBankSystem.g:2220:2: ( rule__Transaction__SourceAccountAssignment_2 )
            // InternalBankSystem.g:2220:3: rule__Transaction__SourceAccountAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__SourceAccountAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getSourceAccountAssignment_2()); 

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
    // InternalBankSystem.g:2228:1: rule__Transaction__Group__3 : rule__Transaction__Group__3__Impl rule__Transaction__Group__4 ;
    public final void rule__Transaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2232:1: ( rule__Transaction__Group__3__Impl rule__Transaction__Group__4 )
            // InternalBankSystem.g:2233:2: rule__Transaction__Group__3__Impl rule__Transaction__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalBankSystem.g:2240:1: rule__Transaction__Group__3__Impl : ( 'Target:' ) ;
    public final void rule__Transaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2244:1: ( ( 'Target:' ) )
            // InternalBankSystem.g:2245:1: ( 'Target:' )
            {
            // InternalBankSystem.g:2245:1: ( 'Target:' )
            // InternalBankSystem.g:2246:2: 'Target:'
            {
             before(grammarAccess.getTransactionAccess().getTargetKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getTargetKeyword_3()); 

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
    // InternalBankSystem.g:2255:1: rule__Transaction__Group__4 : rule__Transaction__Group__4__Impl rule__Transaction__Group__5 ;
    public final void rule__Transaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2259:1: ( rule__Transaction__Group__4__Impl rule__Transaction__Group__5 )
            // InternalBankSystem.g:2260:2: rule__Transaction__Group__4__Impl rule__Transaction__Group__5
            {
            pushFollow(FOLLOW_39);
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
    // InternalBankSystem.g:2267:1: rule__Transaction__Group__4__Impl : ( ( rule__Transaction__TargetAccountAssignment_4 ) ) ;
    public final void rule__Transaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2271:1: ( ( ( rule__Transaction__TargetAccountAssignment_4 ) ) )
            // InternalBankSystem.g:2272:1: ( ( rule__Transaction__TargetAccountAssignment_4 ) )
            {
            // InternalBankSystem.g:2272:1: ( ( rule__Transaction__TargetAccountAssignment_4 ) )
            // InternalBankSystem.g:2273:2: ( rule__Transaction__TargetAccountAssignment_4 )
            {
             before(grammarAccess.getTransactionAccess().getTargetAccountAssignment_4()); 
            // InternalBankSystem.g:2274:2: ( rule__Transaction__TargetAccountAssignment_4 )
            // InternalBankSystem.g:2274:3: rule__Transaction__TargetAccountAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__TargetAccountAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getTargetAccountAssignment_4()); 

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
    // InternalBankSystem.g:2282:1: rule__Transaction__Group__5 : rule__Transaction__Group__5__Impl rule__Transaction__Group__6 ;
    public final void rule__Transaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2286:1: ( rule__Transaction__Group__5__Impl rule__Transaction__Group__6 )
            // InternalBankSystem.g:2287:2: rule__Transaction__Group__5__Impl rule__Transaction__Group__6
            {
            pushFollow(FOLLOW_25);
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
    // InternalBankSystem.g:2294:1: rule__Transaction__Group__5__Impl : ( 'Amount:' ) ;
    public final void rule__Transaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2298:1: ( ( 'Amount:' ) )
            // InternalBankSystem.g:2299:1: ( 'Amount:' )
            {
            // InternalBankSystem.g:2299:1: ( 'Amount:' )
            // InternalBankSystem.g:2300:2: 'Amount:'
            {
             before(grammarAccess.getTransactionAccess().getAmountKeyword_5()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getAmountKeyword_5()); 

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
    // InternalBankSystem.g:2309:1: rule__Transaction__Group__6 : rule__Transaction__Group__6__Impl rule__Transaction__Group__7 ;
    public final void rule__Transaction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2313:1: ( rule__Transaction__Group__6__Impl rule__Transaction__Group__7 )
            // InternalBankSystem.g:2314:2: rule__Transaction__Group__6__Impl rule__Transaction__Group__7
            {
            pushFollow(FOLLOW_40);
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
    // InternalBankSystem.g:2321:1: rule__Transaction__Group__6__Impl : ( ( rule__Transaction__AmountAssignment_6 ) ) ;
    public final void rule__Transaction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2325:1: ( ( ( rule__Transaction__AmountAssignment_6 ) ) )
            // InternalBankSystem.g:2326:1: ( ( rule__Transaction__AmountAssignment_6 ) )
            {
            // InternalBankSystem.g:2326:1: ( ( rule__Transaction__AmountAssignment_6 ) )
            // InternalBankSystem.g:2327:2: ( rule__Transaction__AmountAssignment_6 )
            {
             before(grammarAccess.getTransactionAccess().getAmountAssignment_6()); 
            // InternalBankSystem.g:2328:2: ( rule__Transaction__AmountAssignment_6 )
            // InternalBankSystem.g:2328:3: rule__Transaction__AmountAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__AmountAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getAmountAssignment_6()); 

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
    // InternalBankSystem.g:2336:1: rule__Transaction__Group__7 : rule__Transaction__Group__7__Impl rule__Transaction__Group__8 ;
    public final void rule__Transaction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2340:1: ( rule__Transaction__Group__7__Impl rule__Transaction__Group__8 )
            // InternalBankSystem.g:2341:2: rule__Transaction__Group__7__Impl rule__Transaction__Group__8
            {
            pushFollow(FOLLOW_25);
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
    // InternalBankSystem.g:2348:1: rule__Transaction__Group__7__Impl : ( 'Date' ) ;
    public final void rule__Transaction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2352:1: ( ( 'Date' ) )
            // InternalBankSystem.g:2353:1: ( 'Date' )
            {
            // InternalBankSystem.g:2353:1: ( 'Date' )
            // InternalBankSystem.g:2354:2: 'Date'
            {
             before(grammarAccess.getTransactionAccess().getDateKeyword_7()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getDateKeyword_7()); 

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
    // InternalBankSystem.g:2363:1: rule__Transaction__Group__8 : rule__Transaction__Group__8__Impl rule__Transaction__Group__9 ;
    public final void rule__Transaction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2367:1: ( rule__Transaction__Group__8__Impl rule__Transaction__Group__9 )
            // InternalBankSystem.g:2368:2: rule__Transaction__Group__8__Impl rule__Transaction__Group__9
            {
            pushFollow(FOLLOW_41);
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
    // InternalBankSystem.g:2375:1: rule__Transaction__Group__8__Impl : ( ( rule__Transaction__DateAssignment_8 ) ) ;
    public final void rule__Transaction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2379:1: ( ( ( rule__Transaction__DateAssignment_8 ) ) )
            // InternalBankSystem.g:2380:1: ( ( rule__Transaction__DateAssignment_8 ) )
            {
            // InternalBankSystem.g:2380:1: ( ( rule__Transaction__DateAssignment_8 ) )
            // InternalBankSystem.g:2381:2: ( rule__Transaction__DateAssignment_8 )
            {
             before(grammarAccess.getTransactionAccess().getDateAssignment_8()); 
            // InternalBankSystem.g:2382:2: ( rule__Transaction__DateAssignment_8 )
            // InternalBankSystem.g:2382:3: rule__Transaction__DateAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__DateAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getDateAssignment_8()); 

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
    // InternalBankSystem.g:2390:1: rule__Transaction__Group__9 : rule__Transaction__Group__9__Impl rule__Transaction__Group__10 ;
    public final void rule__Transaction__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2394:1: ( rule__Transaction__Group__9__Impl rule__Transaction__Group__10 )
            // InternalBankSystem.g:2395:2: rule__Transaction__Group__9__Impl rule__Transaction__Group__10
            {
            pushFollow(FOLLOW_42);
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
    // InternalBankSystem.g:2402:1: rule__Transaction__Group__9__Impl : ( 'Debit' ) ;
    public final void rule__Transaction__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2406:1: ( ( 'Debit' ) )
            // InternalBankSystem.g:2407:1: ( 'Debit' )
            {
            // InternalBankSystem.g:2407:1: ( 'Debit' )
            // InternalBankSystem.g:2408:2: 'Debit'
            {
             before(grammarAccess.getTransactionAccess().getDebitKeyword_9()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getDebitKeyword_9()); 

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
    // InternalBankSystem.g:2417:1: rule__Transaction__Group__10 : rule__Transaction__Group__10__Impl rule__Transaction__Group__11 ;
    public final void rule__Transaction__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2421:1: ( rule__Transaction__Group__10__Impl rule__Transaction__Group__11 )
            // InternalBankSystem.g:2422:2: rule__Transaction__Group__10__Impl rule__Transaction__Group__11
            {
            pushFollow(FOLLOW_43);
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
    // InternalBankSystem.g:2429:1: rule__Transaction__Group__10__Impl : ( ( rule__Transaction__DebitAssignment_10 ) ) ;
    public final void rule__Transaction__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2433:1: ( ( ( rule__Transaction__DebitAssignment_10 ) ) )
            // InternalBankSystem.g:2434:1: ( ( rule__Transaction__DebitAssignment_10 ) )
            {
            // InternalBankSystem.g:2434:1: ( ( rule__Transaction__DebitAssignment_10 ) )
            // InternalBankSystem.g:2435:2: ( rule__Transaction__DebitAssignment_10 )
            {
             before(grammarAccess.getTransactionAccess().getDebitAssignment_10()); 
            // InternalBankSystem.g:2436:2: ( rule__Transaction__DebitAssignment_10 )
            // InternalBankSystem.g:2436:3: rule__Transaction__DebitAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__DebitAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getDebitAssignment_10()); 

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
    // InternalBankSystem.g:2444:1: rule__Transaction__Group__11 : rule__Transaction__Group__11__Impl rule__Transaction__Group__12 ;
    public final void rule__Transaction__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2448:1: ( rule__Transaction__Group__11__Impl rule__Transaction__Group__12 )
            // InternalBankSystem.g:2449:2: rule__Transaction__Group__11__Impl rule__Transaction__Group__12
            {
            pushFollow(FOLLOW_8);
            rule__Transaction__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__12();

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
    // InternalBankSystem.g:2456:1: rule__Transaction__Group__11__Impl : ( 'Vendor name' ) ;
    public final void rule__Transaction__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2460:1: ( ( 'Vendor name' ) )
            // InternalBankSystem.g:2461:1: ( 'Vendor name' )
            {
            // InternalBankSystem.g:2461:1: ( 'Vendor name' )
            // InternalBankSystem.g:2462:2: 'Vendor name'
            {
             before(grammarAccess.getTransactionAccess().getVendorNameKeyword_11()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getVendorNameKeyword_11()); 

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


    // $ANTLR start "rule__Transaction__Group__12"
    // InternalBankSystem.g:2471:1: rule__Transaction__Group__12 : rule__Transaction__Group__12__Impl rule__Transaction__Group__13 ;
    public final void rule__Transaction__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2475:1: ( rule__Transaction__Group__12__Impl rule__Transaction__Group__13 )
            // InternalBankSystem.g:2476:2: rule__Transaction__Group__12__Impl rule__Transaction__Group__13
            {
            pushFollow(FOLLOW_19);
            rule__Transaction__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transaction__Group__13();

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
    // $ANTLR end "rule__Transaction__Group__12"


    // $ANTLR start "rule__Transaction__Group__12__Impl"
    // InternalBankSystem.g:2483:1: rule__Transaction__Group__12__Impl : ( ( rule__Transaction__VendorNameAssignment_12 ) ) ;
    public final void rule__Transaction__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2487:1: ( ( ( rule__Transaction__VendorNameAssignment_12 ) ) )
            // InternalBankSystem.g:2488:1: ( ( rule__Transaction__VendorNameAssignment_12 ) )
            {
            // InternalBankSystem.g:2488:1: ( ( rule__Transaction__VendorNameAssignment_12 ) )
            // InternalBankSystem.g:2489:2: ( rule__Transaction__VendorNameAssignment_12 )
            {
             before(grammarAccess.getTransactionAccess().getVendorNameAssignment_12()); 
            // InternalBankSystem.g:2490:2: ( rule__Transaction__VendorNameAssignment_12 )
            // InternalBankSystem.g:2490:3: rule__Transaction__VendorNameAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__VendorNameAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getVendorNameAssignment_12()); 

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
    // $ANTLR end "rule__Transaction__Group__12__Impl"


    // $ANTLR start "rule__Transaction__Group__13"
    // InternalBankSystem.g:2498:1: rule__Transaction__Group__13 : rule__Transaction__Group__13__Impl ;
    public final void rule__Transaction__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2502:1: ( rule__Transaction__Group__13__Impl )
            // InternalBankSystem.g:2503:2: rule__Transaction__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transaction__Group__13__Impl();

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
    // $ANTLR end "rule__Transaction__Group__13"


    // $ANTLR start "rule__Transaction__Group__13__Impl"
    // InternalBankSystem.g:2509:1: rule__Transaction__Group__13__Impl : ( '}' ) ;
    public final void rule__Transaction__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2513:1: ( ( '}' ) )
            // InternalBankSystem.g:2514:1: ( '}' )
            {
            // InternalBankSystem.g:2514:1: ( '}' )
            // InternalBankSystem.g:2515:2: '}'
            {
             before(grammarAccess.getTransactionAccess().getRightCurlyBracketKeyword_13()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getRightCurlyBracketKeyword_13()); 

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
    // $ANTLR end "rule__Transaction__Group__13__Impl"


    // $ANTLR start "rule__Date__Group__0"
    // InternalBankSystem.g:2525:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2529:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // InternalBankSystem.g:2530:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalBankSystem.g:2537:1: rule__Date__Group__0__Impl : ( ( rule__Date__YearAssignment_0 ) ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2541:1: ( ( ( rule__Date__YearAssignment_0 ) ) )
            // InternalBankSystem.g:2542:1: ( ( rule__Date__YearAssignment_0 ) )
            {
            // InternalBankSystem.g:2542:1: ( ( rule__Date__YearAssignment_0 ) )
            // InternalBankSystem.g:2543:2: ( rule__Date__YearAssignment_0 )
            {
             before(grammarAccess.getDateAccess().getYearAssignment_0()); 
            // InternalBankSystem.g:2544:2: ( rule__Date__YearAssignment_0 )
            // InternalBankSystem.g:2544:3: rule__Date__YearAssignment_0
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
    // InternalBankSystem.g:2552:1: rule__Date__Group__1 : rule__Date__Group__1__Impl rule__Date__Group__2 ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2556:1: ( rule__Date__Group__1__Impl rule__Date__Group__2 )
            // InternalBankSystem.g:2557:2: rule__Date__Group__1__Impl rule__Date__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalBankSystem.g:2564:1: rule__Date__Group__1__Impl : ( '/' ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2568:1: ( ( '/' ) )
            // InternalBankSystem.g:2569:1: ( '/' )
            {
            // InternalBankSystem.g:2569:1: ( '/' )
            // InternalBankSystem.g:2570:2: '/'
            {
             before(grammarAccess.getDateAccess().getSolidusKeyword_1()); 
            match(input,48,FOLLOW_2); 
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
    // InternalBankSystem.g:2579:1: rule__Date__Group__2 : rule__Date__Group__2__Impl rule__Date__Group__3 ;
    public final void rule__Date__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2583:1: ( rule__Date__Group__2__Impl rule__Date__Group__3 )
            // InternalBankSystem.g:2584:2: rule__Date__Group__2__Impl rule__Date__Group__3
            {
            pushFollow(FOLLOW_44);
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
    // InternalBankSystem.g:2591:1: rule__Date__Group__2__Impl : ( ( rule__Date__MonthAssignment_2 ) ) ;
    public final void rule__Date__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2595:1: ( ( ( rule__Date__MonthAssignment_2 ) ) )
            // InternalBankSystem.g:2596:1: ( ( rule__Date__MonthAssignment_2 ) )
            {
            // InternalBankSystem.g:2596:1: ( ( rule__Date__MonthAssignment_2 ) )
            // InternalBankSystem.g:2597:2: ( rule__Date__MonthAssignment_2 )
            {
             before(grammarAccess.getDateAccess().getMonthAssignment_2()); 
            // InternalBankSystem.g:2598:2: ( rule__Date__MonthAssignment_2 )
            // InternalBankSystem.g:2598:3: rule__Date__MonthAssignment_2
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
    // InternalBankSystem.g:2606:1: rule__Date__Group__3 : rule__Date__Group__3__Impl rule__Date__Group__4 ;
    public final void rule__Date__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2610:1: ( rule__Date__Group__3__Impl rule__Date__Group__4 )
            // InternalBankSystem.g:2611:2: rule__Date__Group__3__Impl rule__Date__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalBankSystem.g:2618:1: rule__Date__Group__3__Impl : ( '/' ) ;
    public final void rule__Date__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2622:1: ( ( '/' ) )
            // InternalBankSystem.g:2623:1: ( '/' )
            {
            // InternalBankSystem.g:2623:1: ( '/' )
            // InternalBankSystem.g:2624:2: '/'
            {
             before(grammarAccess.getDateAccess().getSolidusKeyword_3()); 
            match(input,48,FOLLOW_2); 
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
    // InternalBankSystem.g:2633:1: rule__Date__Group__4 : rule__Date__Group__4__Impl ;
    public final void rule__Date__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2637:1: ( rule__Date__Group__4__Impl )
            // InternalBankSystem.g:2638:2: rule__Date__Group__4__Impl
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
    // InternalBankSystem.g:2644:1: rule__Date__Group__4__Impl : ( ( rule__Date__DayAssignment_4 ) ) ;
    public final void rule__Date__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2648:1: ( ( ( rule__Date__DayAssignment_4 ) ) )
            // InternalBankSystem.g:2649:1: ( ( rule__Date__DayAssignment_4 ) )
            {
            // InternalBankSystem.g:2649:1: ( ( rule__Date__DayAssignment_4 ) )
            // InternalBankSystem.g:2650:2: ( rule__Date__DayAssignment_4 )
            {
             before(grammarAccess.getDateAccess().getDayAssignment_4()); 
            // InternalBankSystem.g:2651:2: ( rule__Date__DayAssignment_4 )
            // InternalBankSystem.g:2651:3: rule__Date__DayAssignment_4
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
    // InternalBankSystem.g:2660:1: rule__BankSystem__BanksAssignment_0 : ( ruleBank ) ;
    public final void rule__BankSystem__BanksAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2664:1: ( ( ruleBank ) )
            // InternalBankSystem.g:2665:2: ( ruleBank )
            {
            // InternalBankSystem.g:2665:2: ( ruleBank )
            // InternalBankSystem.g:2666:3: ruleBank
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
    // InternalBankSystem.g:2675:1: rule__BankSystem__UsersAssignment_1 : ( ruleUser ) ;
    public final void rule__BankSystem__UsersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2679:1: ( ( ruleUser ) )
            // InternalBankSystem.g:2680:2: ( ruleUser )
            {
            // InternalBankSystem.g:2680:2: ( ruleUser )
            // InternalBankSystem.g:2681:3: ruleUser
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
    // InternalBankSystem.g:2690:1: rule__Bank__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Bank__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2694:1: ( ( RULE_ID ) )
            // InternalBankSystem.g:2695:2: ( RULE_ID )
            {
            // InternalBankSystem.g:2695:2: ( RULE_ID )
            // InternalBankSystem.g:2696:3: RULE_ID
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


    // $ANTLR start "rule__Bank__CountryOfOriginAssignment_3"
    // InternalBankSystem.g:2705:1: rule__Bank__CountryOfOriginAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Bank__CountryOfOriginAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2709:1: ( ( RULE_STRING ) )
            // InternalBankSystem.g:2710:2: ( RULE_STRING )
            {
            // InternalBankSystem.g:2710:2: ( RULE_STRING )
            // InternalBankSystem.g:2711:3: RULE_STRING
            {
             before(grammarAccess.getBankAccess().getCountryOfOriginSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBankAccess().getCountryOfOriginSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Bank__CountryOfOriginAssignment_3"


    // $ANTLR start "rule__Bank__BranchesAssignment_5"
    // InternalBankSystem.g:2720:1: rule__Bank__BranchesAssignment_5 : ( ruleBranch ) ;
    public final void rule__Bank__BranchesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2724:1: ( ( ruleBranch ) )
            // InternalBankSystem.g:2725:2: ( ruleBranch )
            {
            // InternalBankSystem.g:2725:2: ( ruleBranch )
            // InternalBankSystem.g:2726:3: ruleBranch
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
    // InternalBankSystem.g:2735:1: rule__Bank__AccountsAssignment_6 : ( ruleAccount ) ;
    public final void rule__Bank__AccountsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2739:1: ( ( ruleAccount ) )
            // InternalBankSystem.g:2740:2: ( ruleAccount )
            {
            // InternalBankSystem.g:2740:2: ( ruleAccount )
            // InternalBankSystem.g:2741:3: ruleAccount
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
    // InternalBankSystem.g:2750:1: rule__Bank__TransactionsAssignment_7 : ( ruleTransaction ) ;
    public final void rule__Bank__TransactionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2754:1: ( ( ruleTransaction ) )
            // InternalBankSystem.g:2755:2: ( ruleTransaction )
            {
            // InternalBankSystem.g:2755:2: ( ruleTransaction )
            // InternalBankSystem.g:2756:3: ruleTransaction
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
    // InternalBankSystem.g:2765:1: rule__User__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__User__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2769:1: ( ( RULE_ID ) )
            // InternalBankSystem.g:2770:2: ( RULE_ID )
            {
            // InternalBankSystem.g:2770:2: ( RULE_ID )
            // InternalBankSystem.g:2771:3: RULE_ID
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
    // InternalBankSystem.g:2780:1: rule__User__EmailAssignment_5 : ( RULE_ID ) ;
    public final void rule__User__EmailAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2784:1: ( ( RULE_ID ) )
            // InternalBankSystem.g:2785:2: ( RULE_ID )
            {
            // InternalBankSystem.g:2785:2: ( RULE_ID )
            // InternalBankSystem.g:2786:3: RULE_ID
            {
             before(grammarAccess.getUserAccess().getEmailIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getEmailIDTerminalRuleCall_5_0()); 

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
    // InternalBankSystem.g:2795:1: rule__User__HashpassAssignment_7 : ( RULE_ID ) ;
    public final void rule__User__HashpassAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2799:1: ( ( RULE_ID ) )
            // InternalBankSystem.g:2800:2: ( RULE_ID )
            {
            // InternalBankSystem.g:2800:2: ( RULE_ID )
            // InternalBankSystem.g:2801:3: RULE_ID
            {
             before(grammarAccess.getUserAccess().getHashpassIDTerminalRuleCall_7_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getHashpassIDTerminalRuleCall_7_0()); 

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
    // InternalBankSystem.g:2810:1: rule__User__AddressAssignment_9 : ( RULE_ID ) ;
    public final void rule__User__AddressAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2814:1: ( ( RULE_ID ) )
            // InternalBankSystem.g:2815:2: ( RULE_ID )
            {
            // InternalBankSystem.g:2815:2: ( RULE_ID )
            // InternalBankSystem.g:2816:3: RULE_ID
            {
             before(grammarAccess.getUserAccess().getAddressIDTerminalRuleCall_9_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getAddressIDTerminalRuleCall_9_0()); 

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
    // InternalBankSystem.g:2825:1: rule__Branch__AddressAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Branch__AddressAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2829:1: ( ( RULE_STRING ) )
            // InternalBankSystem.g:2830:2: ( RULE_STRING )
            {
            // InternalBankSystem.g:2830:2: ( RULE_STRING )
            // InternalBankSystem.g:2831:3: RULE_STRING
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
    // InternalBankSystem.g:2840:1: rule__Branch__EmployeesAssignment_5 : ( ruleEmployee ) ;
    public final void rule__Branch__EmployeesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2844:1: ( ( ruleEmployee ) )
            // InternalBankSystem.g:2845:2: ( ruleEmployee )
            {
            // InternalBankSystem.g:2845:2: ( ruleEmployee )
            // InternalBankSystem.g:2846:3: ruleEmployee
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
    // InternalBankSystem.g:2855:1: rule__Employee__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Employee__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2859:1: ( ( RULE_ID ) )
            // InternalBankSystem.g:2860:2: ( RULE_ID )
            {
            // InternalBankSystem.g:2860:2: ( RULE_ID )
            // InternalBankSystem.g:2861:3: RULE_ID
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
    // InternalBankSystem.g:2870:1: rule__Employee__DateAssignment_4 : ( ruleDate ) ;
    public final void rule__Employee__DateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2874:1: ( ( ruleDate ) )
            // InternalBankSystem.g:2875:2: ( ruleDate )
            {
            // InternalBankSystem.g:2875:2: ( ruleDate )
            // InternalBankSystem.g:2876:3: ruleDate
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
    // InternalBankSystem.g:2885:1: rule__Employee__SalaryAssignment_6 : ( RULE_INT ) ;
    public final void rule__Employee__SalaryAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2889:1: ( ( RULE_INT ) )
            // InternalBankSystem.g:2890:2: ( RULE_INT )
            {
            // InternalBankSystem.g:2890:2: ( RULE_INT )
            // InternalBankSystem.g:2891:3: RULE_INT
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
    // InternalBankSystem.g:2900:1: rule__Employee__CurrentRoleAssignment_8 : ( ruleEmployeeRole ) ;
    public final void rule__Employee__CurrentRoleAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2904:1: ( ( ruleEmployeeRole ) )
            // InternalBankSystem.g:2905:2: ( ruleEmployeeRole )
            {
            // InternalBankSystem.g:2905:2: ( ruleEmployeeRole )
            // InternalBankSystem.g:2906:3: ruleEmployeeRole
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


    // $ANTLR start "rule__Account__HoldersAssignment_2"
    // InternalBankSystem.g:2915:1: rule__Account__HoldersAssignment_2 : ( ruleUser ) ;
    public final void rule__Account__HoldersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2919:1: ( ( ruleUser ) )
            // InternalBankSystem.g:2920:2: ( ruleUser )
            {
            // InternalBankSystem.g:2920:2: ( ruleUser )
            // InternalBankSystem.g:2921:3: ruleUser
            {
             before(grammarAccess.getAccountAccess().getHoldersUserParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getAccountAccess().getHoldersUserParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Account__HoldersAssignment_2"


    // $ANTLR start "rule__Account__BalanceAssignment_4"
    // InternalBankSystem.g:2930:1: rule__Account__BalanceAssignment_4 : ( RULE_INT ) ;
    public final void rule__Account__BalanceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2934:1: ( ( RULE_INT ) )
            // InternalBankSystem.g:2935:2: ( RULE_INT )
            {
            // InternalBankSystem.g:2935:2: ( RULE_INT )
            // InternalBankSystem.g:2936:3: RULE_INT
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
    // InternalBankSystem.g:2945:1: rule__Account__AccountNumAssignment_6 : ( RULE_ID ) ;
    public final void rule__Account__AccountNumAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2949:1: ( ( RULE_ID ) )
            // InternalBankSystem.g:2950:2: ( RULE_ID )
            {
            // InternalBankSystem.g:2950:2: ( RULE_ID )
            // InternalBankSystem.g:2951:3: RULE_ID
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
    // InternalBankSystem.g:2960:1: rule__Account__MfaTypeAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Account__MfaTypeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2964:1: ( ( RULE_STRING ) )
            // InternalBankSystem.g:2965:2: ( RULE_STRING )
            {
            // InternalBankSystem.g:2965:2: ( RULE_STRING )
            // InternalBankSystem.g:2966:3: RULE_STRING
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
    // InternalBankSystem.g:2975:1: rule__SavingsAccount__IntRateAssignment_2 : ( RULE_INT ) ;
    public final void rule__SavingsAccount__IntRateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2979:1: ( ( RULE_INT ) )
            // InternalBankSystem.g:2980:2: ( RULE_INT )
            {
            // InternalBankSystem.g:2980:2: ( RULE_INT )
            // InternalBankSystem.g:2981:3: RULE_INT
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
    // InternalBankSystem.g:2990:1: rule__CheckingAccount__DepPerMonthAssignment_2 : ( RULE_INT ) ;
    public final void rule__CheckingAccount__DepPerMonthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:2994:1: ( ( RULE_INT ) )
            // InternalBankSystem.g:2995:2: ( RULE_INT )
            {
            // InternalBankSystem.g:2995:2: ( RULE_INT )
            // InternalBankSystem.g:2996:3: RULE_INT
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
    // InternalBankSystem.g:3005:1: rule__MortgageAccount__LoanPeriodAssignment_2 : ( RULE_ID ) ;
    public final void rule__MortgageAccount__LoanPeriodAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:3009:1: ( ( RULE_ID ) )
            // InternalBankSystem.g:3010:2: ( RULE_ID )
            {
            // InternalBankSystem.g:3010:2: ( RULE_ID )
            // InternalBankSystem.g:3011:3: RULE_ID
            {
             before(grammarAccess.getMortgageAccountAccess().getLoanPeriodIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMortgageAccountAccess().getLoanPeriodIDTerminalRuleCall_2_0()); 

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


    // $ANTLR start "rule__Transaction__SourceAccountAssignment_2"
    // InternalBankSystem.g:3020:1: rule__Transaction__SourceAccountAssignment_2 : ( ruleAccount ) ;
    public final void rule__Transaction__SourceAccountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:3024:1: ( ( ruleAccount ) )
            // InternalBankSystem.g:3025:2: ( ruleAccount )
            {
            // InternalBankSystem.g:3025:2: ( ruleAccount )
            // InternalBankSystem.g:3026:3: ruleAccount
            {
             before(grammarAccess.getTransactionAccess().getSourceAccountAccountParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAccount();

            state._fsp--;

             after(grammarAccess.getTransactionAccess().getSourceAccountAccountParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Transaction__SourceAccountAssignment_2"


    // $ANTLR start "rule__Transaction__TargetAccountAssignment_4"
    // InternalBankSystem.g:3035:1: rule__Transaction__TargetAccountAssignment_4 : ( ruleAccount ) ;
    public final void rule__Transaction__TargetAccountAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:3039:1: ( ( ruleAccount ) )
            // InternalBankSystem.g:3040:2: ( ruleAccount )
            {
            // InternalBankSystem.g:3040:2: ( ruleAccount )
            // InternalBankSystem.g:3041:3: ruleAccount
            {
             before(grammarAccess.getTransactionAccess().getTargetAccountAccountParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAccount();

            state._fsp--;

             after(grammarAccess.getTransactionAccess().getTargetAccountAccountParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Transaction__TargetAccountAssignment_4"


    // $ANTLR start "rule__Transaction__AmountAssignment_6"
    // InternalBankSystem.g:3050:1: rule__Transaction__AmountAssignment_6 : ( RULE_INT ) ;
    public final void rule__Transaction__AmountAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:3054:1: ( ( RULE_INT ) )
            // InternalBankSystem.g:3055:2: ( RULE_INT )
            {
            // InternalBankSystem.g:3055:2: ( RULE_INT )
            // InternalBankSystem.g:3056:3: RULE_INT
            {
             before(grammarAccess.getTransactionAccess().getAmountINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getAmountINTTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__Transaction__AmountAssignment_6"


    // $ANTLR start "rule__Transaction__DateAssignment_8"
    // InternalBankSystem.g:3065:1: rule__Transaction__DateAssignment_8 : ( ruleDate ) ;
    public final void rule__Transaction__DateAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:3069:1: ( ( ruleDate ) )
            // InternalBankSystem.g:3070:2: ( ruleDate )
            {
            // InternalBankSystem.g:3070:2: ( ruleDate )
            // InternalBankSystem.g:3071:3: ruleDate
            {
             before(grammarAccess.getTransactionAccess().getDateDateParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getTransactionAccess().getDateDateParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Transaction__DateAssignment_8"


    // $ANTLR start "rule__Transaction__DebitAssignment_10"
    // InternalBankSystem.g:3080:1: rule__Transaction__DebitAssignment_10 : ( ruleBoolean ) ;
    public final void rule__Transaction__DebitAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:3084:1: ( ( ruleBoolean ) )
            // InternalBankSystem.g:3085:2: ( ruleBoolean )
            {
            // InternalBankSystem.g:3085:2: ( ruleBoolean )
            // InternalBankSystem.g:3086:3: ruleBoolean
            {
             before(grammarAccess.getTransactionAccess().getDebitBooleanParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getTransactionAccess().getDebitBooleanParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Transaction__DebitAssignment_10"


    // $ANTLR start "rule__Transaction__VendorNameAssignment_12"
    // InternalBankSystem.g:3095:1: rule__Transaction__VendorNameAssignment_12 : ( RULE_STRING ) ;
    public final void rule__Transaction__VendorNameAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:3099:1: ( ( RULE_STRING ) )
            // InternalBankSystem.g:3100:2: ( RULE_STRING )
            {
            // InternalBankSystem.g:3100:2: ( RULE_STRING )
            // InternalBankSystem.g:3101:3: RULE_STRING
            {
             before(grammarAccess.getTransactionAccess().getVendorNameSTRINGTerminalRuleCall_12_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTransactionAccess().getVendorNameSTRINGTerminalRuleCall_12_0()); 

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
    // $ANTLR end "rule__Transaction__VendorNameAssignment_12"


    // $ANTLR start "rule__Date__YearAssignment_0"
    // InternalBankSystem.g:3110:1: rule__Date__YearAssignment_0 : ( RULE_INT ) ;
    public final void rule__Date__YearAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:3114:1: ( ( RULE_INT ) )
            // InternalBankSystem.g:3115:2: ( RULE_INT )
            {
            // InternalBankSystem.g:3115:2: ( RULE_INT )
            // InternalBankSystem.g:3116:3: RULE_INT
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
    // InternalBankSystem.g:3125:1: rule__Date__MonthAssignment_2 : ( RULE_INT ) ;
    public final void rule__Date__MonthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:3129:1: ( ( RULE_INT ) )
            // InternalBankSystem.g:3130:2: ( RULE_INT )
            {
            // InternalBankSystem.g:3130:2: ( RULE_INT )
            // InternalBankSystem.g:3131:3: RULE_INT
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
    // InternalBankSystem.g:3140:1: rule__Date__DayAssignment_4 : ( RULE_INT ) ;
    public final void rule__Date__DayAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBankSystem.g:3144:1: ( ( RULE_INT ) )
            // InternalBankSystem.g:3145:2: ( RULE_INT )
            {
            // InternalBankSystem.g:3145:2: ( RULE_INT )
            // InternalBankSystem.g:3146:3: RULE_INT
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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
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
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000000A800000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000000000L});

}