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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBankSystemParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Bank'", "'{'", "'Name'", "'Country'", "'}'", "'User'", "'Email'", "'HashPass'", "'Address'", "'Branch{'", "'Booth'", "'Vault'", "'Employee'", "'Hiring date'", "'Salary'", "'Current Role'", "'Teller'", "'Manager'", "'account'", "'Account number'", "'Holder'", "'Balance'", "'MFA Type'", "'Type'", "'Interest rate'", "'Debits per month'", "'Loan period'", "'Savings Account'", "'Checking Account'", "'Mortgage Account'", "'transaction {'", "'Related account'", "'Amount'", "'Date'", "'Debit'", "'Vendor name'", "'true'", "'false'", "'/'"
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
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
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




    // $ANTLR start "entryRuleBankSystem"
    // InternalBankSystem.g:64:1: entryRuleBankSystem returns [EObject current=null] : iv_ruleBankSystem= ruleBankSystem EOF ;
    public final EObject entryRuleBankSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBankSystem = null;


        try {
            // InternalBankSystem.g:64:51: (iv_ruleBankSystem= ruleBankSystem EOF )
            // InternalBankSystem.g:65:2: iv_ruleBankSystem= ruleBankSystem EOF
            {
             newCompositeNode(grammarAccess.getBankSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBankSystem=ruleBankSystem();

            state._fsp--;

             current =iv_ruleBankSystem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBankSystem"


    // $ANTLR start "ruleBankSystem"
    // InternalBankSystem.g:71:1: ruleBankSystem returns [EObject current=null] : ( ( (lv_banks_0_0= ruleBank ) )+ ( (lv_users_1_0= ruleUser ) )+ ) ;
    public final EObject ruleBankSystem() throws RecognitionException {
        EObject current = null;

        EObject lv_banks_0_0 = null;

        EObject lv_users_1_0 = null;



        	enterRule();

        try {
            // InternalBankSystem.g:77:2: ( ( ( (lv_banks_0_0= ruleBank ) )+ ( (lv_users_1_0= ruleUser ) )+ ) )
            // InternalBankSystem.g:78:2: ( ( (lv_banks_0_0= ruleBank ) )+ ( (lv_users_1_0= ruleUser ) )+ )
            {
            // InternalBankSystem.g:78:2: ( ( (lv_banks_0_0= ruleBank ) )+ ( (lv_users_1_0= ruleUser ) )+ )
            // InternalBankSystem.g:79:3: ( (lv_banks_0_0= ruleBank ) )+ ( (lv_users_1_0= ruleUser ) )+
            {
            // InternalBankSystem.g:79:3: ( (lv_banks_0_0= ruleBank ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBankSystem.g:80:4: (lv_banks_0_0= ruleBank )
            	    {
            	    // InternalBankSystem.g:80:4: (lv_banks_0_0= ruleBank )
            	    // InternalBankSystem.g:81:5: lv_banks_0_0= ruleBank
            	    {

            	    					newCompositeNode(grammarAccess.getBankSystemAccess().getBanksBankParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_banks_0_0=ruleBank();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBankSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"banks",
            	    						lv_banks_0_0,
            	    						"org.xtext.BankSystem.Bank");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalBankSystem.g:98:3: ( (lv_users_1_0= ruleUser ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBankSystem.g:99:4: (lv_users_1_0= ruleUser )
            	    {
            	    // InternalBankSystem.g:99:4: (lv_users_1_0= ruleUser )
            	    // InternalBankSystem.g:100:5: lv_users_1_0= ruleUser
            	    {

            	    					newCompositeNode(grammarAccess.getBankSystemAccess().getUsersUserParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_users_1_0=ruleUser();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBankSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"users",
            	    						lv_users_1_0,
            	    						"org.xtext.BankSystem.User");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBankSystem"


    // $ANTLR start "entryRuleBank"
    // InternalBankSystem.g:121:1: entryRuleBank returns [EObject current=null] : iv_ruleBank= ruleBank EOF ;
    public final EObject entryRuleBank() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBank = null;


        try {
            // InternalBankSystem.g:121:45: (iv_ruleBank= ruleBank EOF )
            // InternalBankSystem.g:122:2: iv_ruleBank= ruleBank EOF
            {
             newCompositeNode(grammarAccess.getBankRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBank=ruleBank();

            state._fsp--;

             current =iv_ruleBank; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBank"


    // $ANTLR start "ruleBank"
    // InternalBankSystem.g:128:1: ruleBank returns [EObject current=null] : (otherlv_0= 'Bank' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Country' ( (lv_countryOfOrigin_5_0= RULE_STRING ) ) ( (lv_branches_6_0= ruleBranch ) )+ ( (lv_accounts_7_0= ruleAccount ) )* ( (lv_transactions_8_0= ruleTransaction ) )* otherlv_9= '}' ) ;
    public final EObject ruleBank() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_countryOfOrigin_5_0=null;
        Token otherlv_9=null;
        EObject lv_branches_6_0 = null;

        EObject lv_accounts_7_0 = null;

        EObject lv_transactions_8_0 = null;



        	enterRule();

        try {
            // InternalBankSystem.g:134:2: ( (otherlv_0= 'Bank' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Country' ( (lv_countryOfOrigin_5_0= RULE_STRING ) ) ( (lv_branches_6_0= ruleBranch ) )+ ( (lv_accounts_7_0= ruleAccount ) )* ( (lv_transactions_8_0= ruleTransaction ) )* otherlv_9= '}' ) )
            // InternalBankSystem.g:135:2: (otherlv_0= 'Bank' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Country' ( (lv_countryOfOrigin_5_0= RULE_STRING ) ) ( (lv_branches_6_0= ruleBranch ) )+ ( (lv_accounts_7_0= ruleAccount ) )* ( (lv_transactions_8_0= ruleTransaction ) )* otherlv_9= '}' )
            {
            // InternalBankSystem.g:135:2: (otherlv_0= 'Bank' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Country' ( (lv_countryOfOrigin_5_0= RULE_STRING ) ) ( (lv_branches_6_0= ruleBranch ) )+ ( (lv_accounts_7_0= ruleAccount ) )* ( (lv_transactions_8_0= ruleTransaction ) )* otherlv_9= '}' )
            // InternalBankSystem.g:136:3: otherlv_0= 'Bank' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Country' ( (lv_countryOfOrigin_5_0= RULE_STRING ) ) ( (lv_branches_6_0= ruleBranch ) )+ ( (lv_accounts_7_0= ruleAccount ) )* ( (lv_transactions_8_0= ruleTransaction ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBankAccess().getBankKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getBankAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getBankAccess().getNameKeyword_2());
            		
            // InternalBankSystem.g:148:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalBankSystem.g:149:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalBankSystem.g:149:4: (lv_name_3_0= RULE_STRING )
            // InternalBankSystem.g:150:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_name_3_0, grammarAccess.getBankAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBankRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getBankAccess().getCountryKeyword_4());
            		
            // InternalBankSystem.g:170:3: ( (lv_countryOfOrigin_5_0= RULE_STRING ) )
            // InternalBankSystem.g:171:4: (lv_countryOfOrigin_5_0= RULE_STRING )
            {
            // InternalBankSystem.g:171:4: (lv_countryOfOrigin_5_0= RULE_STRING )
            // InternalBankSystem.g:172:5: lv_countryOfOrigin_5_0= RULE_STRING
            {
            lv_countryOfOrigin_5_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_countryOfOrigin_5_0, grammarAccess.getBankAccess().getCountryOfOriginSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBankRule());
            					}
            					setWithLastConsumed(
            						current,
            						"countryOfOrigin",
            						lv_countryOfOrigin_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalBankSystem.g:188:3: ( (lv_branches_6_0= ruleBranch ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBankSystem.g:189:4: (lv_branches_6_0= ruleBranch )
            	    {
            	    // InternalBankSystem.g:189:4: (lv_branches_6_0= ruleBranch )
            	    // InternalBankSystem.g:190:5: lv_branches_6_0= ruleBranch
            	    {

            	    					newCompositeNode(grammarAccess.getBankAccess().getBranchesBranchParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_branches_6_0=ruleBranch();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBankRule());
            	    					}
            	    					add(
            	    						current,
            	    						"branches",
            	    						lv_branches_6_0,
            	    						"org.xtext.BankSystem.Branch");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // InternalBankSystem.g:207:3: ( (lv_accounts_7_0= ruleAccount ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==29) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBankSystem.g:208:4: (lv_accounts_7_0= ruleAccount )
            	    {
            	    // InternalBankSystem.g:208:4: (lv_accounts_7_0= ruleAccount )
            	    // InternalBankSystem.g:209:5: lv_accounts_7_0= ruleAccount
            	    {

            	    					newCompositeNode(grammarAccess.getBankAccess().getAccountsAccountParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_accounts_7_0=ruleAccount();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBankRule());
            	    					}
            	    					add(
            	    						current,
            	    						"accounts",
            	    						lv_accounts_7_0,
            	    						"org.xtext.BankSystem.Account");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalBankSystem.g:226:3: ( (lv_transactions_8_0= ruleTransaction ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==41) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBankSystem.g:227:4: (lv_transactions_8_0= ruleTransaction )
            	    {
            	    // InternalBankSystem.g:227:4: (lv_transactions_8_0= ruleTransaction )
            	    // InternalBankSystem.g:228:5: lv_transactions_8_0= ruleTransaction
            	    {

            	    					newCompositeNode(grammarAccess.getBankAccess().getTransactionsTransactionParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_transactions_8_0=ruleTransaction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBankRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transactions",
            	    						lv_transactions_8_0,
            	    						"org.xtext.BankSystem.Transaction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getBankAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBank"


    // $ANTLR start "entryRuleUser"
    // InternalBankSystem.g:253:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // InternalBankSystem.g:253:45: (iv_ruleUser= ruleUser EOF )
            // InternalBankSystem.g:254:2: iv_ruleUser= ruleUser EOF
            {
             newCompositeNode(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUser=ruleUser();

            state._fsp--;

             current =iv_ruleUser; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // InternalBankSystem.g:260:1: ruleUser returns [EObject current=null] : (otherlv_0= 'User' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Email' ( (lv_email_5_0= RULE_STRING ) ) otherlv_6= 'HashPass' ( (lv_hashpass_7_0= RULE_STRING ) ) otherlv_8= 'Address' ( (lv_address_9_0= RULE_STRING ) ) otherlv_10= '}' ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_email_5_0=null;
        Token otherlv_6=null;
        Token lv_hashpass_7_0=null;
        Token otherlv_8=null;
        Token lv_address_9_0=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalBankSystem.g:266:2: ( (otherlv_0= 'User' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Email' ( (lv_email_5_0= RULE_STRING ) ) otherlv_6= 'HashPass' ( (lv_hashpass_7_0= RULE_STRING ) ) otherlv_8= 'Address' ( (lv_address_9_0= RULE_STRING ) ) otherlv_10= '}' ) )
            // InternalBankSystem.g:267:2: (otherlv_0= 'User' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Email' ( (lv_email_5_0= RULE_STRING ) ) otherlv_6= 'HashPass' ( (lv_hashpass_7_0= RULE_STRING ) ) otherlv_8= 'Address' ( (lv_address_9_0= RULE_STRING ) ) otherlv_10= '}' )
            {
            // InternalBankSystem.g:267:2: (otherlv_0= 'User' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Email' ( (lv_email_5_0= RULE_STRING ) ) otherlv_6= 'HashPass' ( (lv_hashpass_7_0= RULE_STRING ) ) otherlv_8= 'Address' ( (lv_address_9_0= RULE_STRING ) ) otherlv_10= '}' )
            // InternalBankSystem.g:268:3: otherlv_0= 'User' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Email' ( (lv_email_5_0= RULE_STRING ) ) otherlv_6= 'HashPass' ( (lv_hashpass_7_0= RULE_STRING ) ) otherlv_8= 'Address' ( (lv_address_9_0= RULE_STRING ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getUserAccess().getUserKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getUserAccess().getNameKeyword_2());
            		
            // InternalBankSystem.g:280:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalBankSystem.g:281:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalBankSystem.g:281:4: (lv_name_3_0= RULE_STRING )
            // InternalBankSystem.g:282:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_name_3_0, grammarAccess.getUserAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getUserAccess().getEmailKeyword_4());
            		
            // InternalBankSystem.g:302:3: ( (lv_email_5_0= RULE_STRING ) )
            // InternalBankSystem.g:303:4: (lv_email_5_0= RULE_STRING )
            {
            // InternalBankSystem.g:303:4: (lv_email_5_0= RULE_STRING )
            // InternalBankSystem.g:304:5: lv_email_5_0= RULE_STRING
            {
            lv_email_5_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_email_5_0, grammarAccess.getUserAccess().getEmailSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserRule());
            					}
            					setWithLastConsumed(
            						current,
            						"email",
            						lv_email_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getUserAccess().getHashPassKeyword_6());
            		
            // InternalBankSystem.g:324:3: ( (lv_hashpass_7_0= RULE_STRING ) )
            // InternalBankSystem.g:325:4: (lv_hashpass_7_0= RULE_STRING )
            {
            // InternalBankSystem.g:325:4: (lv_hashpass_7_0= RULE_STRING )
            // InternalBankSystem.g:326:5: lv_hashpass_7_0= RULE_STRING
            {
            lv_hashpass_7_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_hashpass_7_0, grammarAccess.getUserAccess().getHashpassSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserRule());
            					}
            					setWithLastConsumed(
            						current,
            						"hashpass",
            						lv_hashpass_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getUserAccess().getAddressKeyword_8());
            		
            // InternalBankSystem.g:346:3: ( (lv_address_9_0= RULE_STRING ) )
            // InternalBankSystem.g:347:4: (lv_address_9_0= RULE_STRING )
            {
            // InternalBankSystem.g:347:4: (lv_address_9_0= RULE_STRING )
            // InternalBankSystem.g:348:5: lv_address_9_0= RULE_STRING
            {
            lv_address_9_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_address_9_0, grammarAccess.getUserAccess().getAddressSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserRule());
            					}
            					setWithLastConsumed(
            						current,
            						"address",
            						lv_address_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getUserAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleBranch"
    // InternalBankSystem.g:372:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // InternalBankSystem.g:372:47: (iv_ruleBranch= ruleBranch EOF )
            // InternalBankSystem.g:373:2: iv_ruleBranch= ruleBranch EOF
            {
             newCompositeNode(grammarAccess.getBranchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBranch=ruleBranch();

            state._fsp--;

             current =iv_ruleBranch; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBranch"


    // $ANTLR start "ruleBranch"
    // InternalBankSystem.g:379:1: ruleBranch returns [EObject current=null] : (otherlv_0= 'Branch{' otherlv_1= 'Address' ( (lv_address_2_0= RULE_STRING ) ) ( (lv_mybooth_3_0= ruleBooth ) )? ( (lv_myVault_4_0= ruleVault ) )? ( (lv_employees_5_0= ruleEmployee ) )+ otherlv_6= '}' ) ;
    public final EObject ruleBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_address_2_0=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_mybooth_3_0 = null;

        AntlrDatatypeRuleToken lv_myVault_4_0 = null;

        EObject lv_employees_5_0 = null;



        	enterRule();

        try {
            // InternalBankSystem.g:385:2: ( (otherlv_0= 'Branch{' otherlv_1= 'Address' ( (lv_address_2_0= RULE_STRING ) ) ( (lv_mybooth_3_0= ruleBooth ) )? ( (lv_myVault_4_0= ruleVault ) )? ( (lv_employees_5_0= ruleEmployee ) )+ otherlv_6= '}' ) )
            // InternalBankSystem.g:386:2: (otherlv_0= 'Branch{' otherlv_1= 'Address' ( (lv_address_2_0= RULE_STRING ) ) ( (lv_mybooth_3_0= ruleBooth ) )? ( (lv_myVault_4_0= ruleVault ) )? ( (lv_employees_5_0= ruleEmployee ) )+ otherlv_6= '}' )
            {
            // InternalBankSystem.g:386:2: (otherlv_0= 'Branch{' otherlv_1= 'Address' ( (lv_address_2_0= RULE_STRING ) ) ( (lv_mybooth_3_0= ruleBooth ) )? ( (lv_myVault_4_0= ruleVault ) )? ( (lv_employees_5_0= ruleEmployee ) )+ otherlv_6= '}' )
            // InternalBankSystem.g:387:3: otherlv_0= 'Branch{' otherlv_1= 'Address' ( (lv_address_2_0= RULE_STRING ) ) ( (lv_mybooth_3_0= ruleBooth ) )? ( (lv_myVault_4_0= ruleVault ) )? ( (lv_employees_5_0= ruleEmployee ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getBranchAccess().getBranchKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getBranchAccess().getAddressKeyword_1());
            		
            // InternalBankSystem.g:395:3: ( (lv_address_2_0= RULE_STRING ) )
            // InternalBankSystem.g:396:4: (lv_address_2_0= RULE_STRING )
            {
            // InternalBankSystem.g:396:4: (lv_address_2_0= RULE_STRING )
            // InternalBankSystem.g:397:5: lv_address_2_0= RULE_STRING
            {
            lv_address_2_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_address_2_0, grammarAccess.getBranchAccess().getAddressSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBranchRule());
            					}
            					setWithLastConsumed(
            						current,
            						"address",
            						lv_address_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalBankSystem.g:413:3: ( (lv_mybooth_3_0= ruleBooth ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBankSystem.g:414:4: (lv_mybooth_3_0= ruleBooth )
                    {
                    // InternalBankSystem.g:414:4: (lv_mybooth_3_0= ruleBooth )
                    // InternalBankSystem.g:415:5: lv_mybooth_3_0= ruleBooth
                    {

                    					newCompositeNode(grammarAccess.getBranchAccess().getMyboothBoothParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_mybooth_3_0=ruleBooth();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBranchRule());
                    					}
                    					set(
                    						current,
                    						"mybooth",
                    						lv_mybooth_3_0,
                    						"org.xtext.BankSystem.Booth");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBankSystem.g:432:3: ( (lv_myVault_4_0= ruleVault ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBankSystem.g:433:4: (lv_myVault_4_0= ruleVault )
                    {
                    // InternalBankSystem.g:433:4: (lv_myVault_4_0= ruleVault )
                    // InternalBankSystem.g:434:5: lv_myVault_4_0= ruleVault
                    {

                    					newCompositeNode(grammarAccess.getBranchAccess().getMyVaultVaultParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_myVault_4_0=ruleVault();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBranchRule());
                    					}
                    					set(
                    						current,
                    						"myVault",
                    						lv_myVault_4_0,
                    						"org.xtext.BankSystem.Vault");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBankSystem.g:451:3: ( (lv_employees_5_0= ruleEmployee ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBankSystem.g:452:4: (lv_employees_5_0= ruleEmployee )
            	    {
            	    // InternalBankSystem.g:452:4: (lv_employees_5_0= ruleEmployee )
            	    // InternalBankSystem.g:453:5: lv_employees_5_0= ruleEmployee
            	    {

            	    					newCompositeNode(grammarAccess.getBranchAccess().getEmployeesEmployeeParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_employees_5_0=ruleEmployee();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBranchRule());
            	    					}
            	    					add(
            	    						current,
            	    						"employees",
            	    						lv_employees_5_0,
            	    						"org.xtext.BankSystem.Employee");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBranchAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBranch"


    // $ANTLR start "entryRuleBooth"
    // InternalBankSystem.g:478:1: entryRuleBooth returns [String current=null] : iv_ruleBooth= ruleBooth EOF ;
    public final String entryRuleBooth() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooth = null;


        try {
            // InternalBankSystem.g:478:45: (iv_ruleBooth= ruleBooth EOF )
            // InternalBankSystem.g:479:2: iv_ruleBooth= ruleBooth EOF
            {
             newCompositeNode(grammarAccess.getBoothRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooth=ruleBooth();

            state._fsp--;

             current =iv_ruleBooth.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooth"


    // $ANTLR start "ruleBooth"
    // InternalBankSystem.g:485:1: ruleBooth returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Booth' ;
    public final AntlrDatatypeRuleToken ruleBooth() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBankSystem.g:491:2: (kw= 'Booth' )
            // InternalBankSystem.g:492:2: kw= 'Booth'
            {
            kw=(Token)match(input,21,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getBoothAccess().getBoothKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooth"


    // $ANTLR start "entryRuleVault"
    // InternalBankSystem.g:500:1: entryRuleVault returns [String current=null] : iv_ruleVault= ruleVault EOF ;
    public final String entryRuleVault() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVault = null;


        try {
            // InternalBankSystem.g:500:45: (iv_ruleVault= ruleVault EOF )
            // InternalBankSystem.g:501:2: iv_ruleVault= ruleVault EOF
            {
             newCompositeNode(grammarAccess.getVaultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVault=ruleVault();

            state._fsp--;

             current =iv_ruleVault.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVault"


    // $ANTLR start "ruleVault"
    // InternalBankSystem.g:507:1: ruleVault returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Vault' ;
    public final AntlrDatatypeRuleToken ruleVault() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBankSystem.g:513:2: (kw= 'Vault' )
            // InternalBankSystem.g:514:2: kw= 'Vault'
            {
            kw=(Token)match(input,22,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getVaultAccess().getVaultKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVault"


    // $ANTLR start "entryRuleEmployee"
    // InternalBankSystem.g:522:1: entryRuleEmployee returns [EObject current=null] : iv_ruleEmployee= ruleEmployee EOF ;
    public final EObject entryRuleEmployee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmployee = null;


        try {
            // InternalBankSystem.g:522:49: (iv_ruleEmployee= ruleEmployee EOF )
            // InternalBankSystem.g:523:2: iv_ruleEmployee= ruleEmployee EOF
            {
             newCompositeNode(grammarAccess.getEmployeeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmployee=ruleEmployee();

            state._fsp--;

             current =iv_ruleEmployee; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmployee"


    // $ANTLR start "ruleEmployee"
    // InternalBankSystem.g:529:1: ruleEmployee returns [EObject current=null] : (otherlv_0= 'Employee' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Hiring date' ( (lv_date_5_0= ruleDate ) ) otherlv_6= 'Salary' ( (lv_salary_7_0= RULE_INT ) ) otherlv_8= 'Current Role' ( (lv_currentRole_9_0= ruleEmployeeRole ) ) otherlv_10= '}' ) ;
    public final EObject ruleEmployee() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_salary_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_date_5_0 = null;

        AntlrDatatypeRuleToken lv_currentRole_9_0 = null;



        	enterRule();

        try {
            // InternalBankSystem.g:535:2: ( (otherlv_0= 'Employee' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Hiring date' ( (lv_date_5_0= ruleDate ) ) otherlv_6= 'Salary' ( (lv_salary_7_0= RULE_INT ) ) otherlv_8= 'Current Role' ( (lv_currentRole_9_0= ruleEmployeeRole ) ) otherlv_10= '}' ) )
            // InternalBankSystem.g:536:2: (otherlv_0= 'Employee' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Hiring date' ( (lv_date_5_0= ruleDate ) ) otherlv_6= 'Salary' ( (lv_salary_7_0= RULE_INT ) ) otherlv_8= 'Current Role' ( (lv_currentRole_9_0= ruleEmployeeRole ) ) otherlv_10= '}' )
            {
            // InternalBankSystem.g:536:2: (otherlv_0= 'Employee' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Hiring date' ( (lv_date_5_0= ruleDate ) ) otherlv_6= 'Salary' ( (lv_salary_7_0= RULE_INT ) ) otherlv_8= 'Current Role' ( (lv_currentRole_9_0= ruleEmployeeRole ) ) otherlv_10= '}' )
            // InternalBankSystem.g:537:3: otherlv_0= 'Employee' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'Hiring date' ( (lv_date_5_0= ruleDate ) ) otherlv_6= 'Salary' ( (lv_salary_7_0= RULE_INT ) ) otherlv_8= 'Current Role' ( (lv_currentRole_9_0= ruleEmployeeRole ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEmployeeAccess().getEmployeeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getEmployeeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getEmployeeAccess().getNameKeyword_2());
            		
            // InternalBankSystem.g:549:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalBankSystem.g:550:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalBankSystem.g:550:4: (lv_name_3_0= RULE_STRING )
            // InternalBankSystem.g:551:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_name_3_0, grammarAccess.getEmployeeAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmployeeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getEmployeeAccess().getHiringDateKeyword_4());
            		
            // InternalBankSystem.g:571:3: ( (lv_date_5_0= ruleDate ) )
            // InternalBankSystem.g:572:4: (lv_date_5_0= ruleDate )
            {
            // InternalBankSystem.g:572:4: (lv_date_5_0= ruleDate )
            // InternalBankSystem.g:573:5: lv_date_5_0= ruleDate
            {

            					newCompositeNode(grammarAccess.getEmployeeAccess().getDateDateParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_21);
            lv_date_5_0=ruleDate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEmployeeRule());
            					}
            					set(
            						current,
            						"date",
            						lv_date_5_0,
            						"org.xtext.BankSystem.Date");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getEmployeeAccess().getSalaryKeyword_6());
            		
            // InternalBankSystem.g:594:3: ( (lv_salary_7_0= RULE_INT ) )
            // InternalBankSystem.g:595:4: (lv_salary_7_0= RULE_INT )
            {
            // InternalBankSystem.g:595:4: (lv_salary_7_0= RULE_INT )
            // InternalBankSystem.g:596:5: lv_salary_7_0= RULE_INT
            {
            lv_salary_7_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_salary_7_0, grammarAccess.getEmployeeAccess().getSalaryINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmployeeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"salary",
            						lv_salary_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,26,FOLLOW_23); 

            			newLeafNode(otherlv_8, grammarAccess.getEmployeeAccess().getCurrentRoleKeyword_8());
            		
            // InternalBankSystem.g:616:3: ( (lv_currentRole_9_0= ruleEmployeeRole ) )
            // InternalBankSystem.g:617:4: (lv_currentRole_9_0= ruleEmployeeRole )
            {
            // InternalBankSystem.g:617:4: (lv_currentRole_9_0= ruleEmployeeRole )
            // InternalBankSystem.g:618:5: lv_currentRole_9_0= ruleEmployeeRole
            {

            					newCompositeNode(grammarAccess.getEmployeeAccess().getCurrentRoleEmployeeRoleParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_16);
            lv_currentRole_9_0=ruleEmployeeRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEmployeeRule());
            					}
            					set(
            						current,
            						"currentRole",
            						lv_currentRole_9_0,
            						"org.xtext.BankSystem.EmployeeRole");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getEmployeeAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmployee"


    // $ANTLR start "entryRuleEmployeeRole"
    // InternalBankSystem.g:643:1: entryRuleEmployeeRole returns [String current=null] : iv_ruleEmployeeRole= ruleEmployeeRole EOF ;
    public final String entryRuleEmployeeRole() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEmployeeRole = null;


        try {
            // InternalBankSystem.g:643:52: (iv_ruleEmployeeRole= ruleEmployeeRole EOF )
            // InternalBankSystem.g:644:2: iv_ruleEmployeeRole= ruleEmployeeRole EOF
            {
             newCompositeNode(grammarAccess.getEmployeeRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmployeeRole=ruleEmployeeRole();

            state._fsp--;

             current =iv_ruleEmployeeRole.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmployeeRole"


    // $ANTLR start "ruleEmployeeRole"
    // InternalBankSystem.g:650:1: ruleEmployeeRole returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Teller_0= ruleTeller | this_Manager_1= ruleManager ) ;
    public final AntlrDatatypeRuleToken ruleEmployeeRole() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Teller_0 = null;

        AntlrDatatypeRuleToken this_Manager_1 = null;



        	enterRule();

        try {
            // InternalBankSystem.g:656:2: ( (this_Teller_0= ruleTeller | this_Manager_1= ruleManager ) )
            // InternalBankSystem.g:657:2: (this_Teller_0= ruleTeller | this_Manager_1= ruleManager )
            {
            // InternalBankSystem.g:657:2: (this_Teller_0= ruleTeller | this_Manager_1= ruleManager )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            else if ( (LA9_0==28) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalBankSystem.g:658:3: this_Teller_0= ruleTeller
                    {

                    			newCompositeNode(grammarAccess.getEmployeeRoleAccess().getTellerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Teller_0=ruleTeller();

                    state._fsp--;


                    			current.merge(this_Teller_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBankSystem.g:669:3: this_Manager_1= ruleManager
                    {

                    			newCompositeNode(grammarAccess.getEmployeeRoleAccess().getManagerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Manager_1=ruleManager();

                    state._fsp--;


                    			current.merge(this_Manager_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmployeeRole"


    // $ANTLR start "entryRuleTeller"
    // InternalBankSystem.g:683:1: entryRuleTeller returns [String current=null] : iv_ruleTeller= ruleTeller EOF ;
    public final String entryRuleTeller() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTeller = null;


        try {
            // InternalBankSystem.g:683:46: (iv_ruleTeller= ruleTeller EOF )
            // InternalBankSystem.g:684:2: iv_ruleTeller= ruleTeller EOF
            {
             newCompositeNode(grammarAccess.getTellerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTeller=ruleTeller();

            state._fsp--;

             current =iv_ruleTeller.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTeller"


    // $ANTLR start "ruleTeller"
    // InternalBankSystem.g:690:1: ruleTeller returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Teller' ;
    public final AntlrDatatypeRuleToken ruleTeller() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBankSystem.g:696:2: (kw= 'Teller' )
            // InternalBankSystem.g:697:2: kw= 'Teller'
            {
            kw=(Token)match(input,27,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getTellerAccess().getTellerKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTeller"


    // $ANTLR start "entryRuleManager"
    // InternalBankSystem.g:705:1: entryRuleManager returns [String current=null] : iv_ruleManager= ruleManager EOF ;
    public final String entryRuleManager() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleManager = null;


        try {
            // InternalBankSystem.g:705:47: (iv_ruleManager= ruleManager EOF )
            // InternalBankSystem.g:706:2: iv_ruleManager= ruleManager EOF
            {
             newCompositeNode(grammarAccess.getManagerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleManager=ruleManager();

            state._fsp--;

             current =iv_ruleManager.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleManager"


    // $ANTLR start "ruleManager"
    // InternalBankSystem.g:712:1: ruleManager returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Manager' ;
    public final AntlrDatatypeRuleToken ruleManager() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBankSystem.g:718:2: (kw= 'Manager' )
            // InternalBankSystem.g:719:2: kw= 'Manager'
            {
            kw=(Token)match(input,28,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getManagerAccess().getManagerKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleManager"


    // $ANTLR start "entryRuleAccount"
    // InternalBankSystem.g:727:1: entryRuleAccount returns [EObject current=null] : iv_ruleAccount= ruleAccount EOF ;
    public final EObject entryRuleAccount() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccount = null;


        try {
            // InternalBankSystem.g:727:48: (iv_ruleAccount= ruleAccount EOF )
            // InternalBankSystem.g:728:2: iv_ruleAccount= ruleAccount EOF
            {
             newCompositeNode(grammarAccess.getAccountRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccount=ruleAccount();

            state._fsp--;

             current =iv_ruleAccount; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAccount"


    // $ANTLR start "ruleAccount"
    // InternalBankSystem.g:734:1: ruleAccount returns [EObject current=null] : (otherlv_0= 'account' otherlv_1= '{' otherlv_2= 'Account number' ( (lv_accountNum_3_0= RULE_STRING ) ) otherlv_4= 'Holder' ( (lv_holder_5_0= RULE_STRING ) ) otherlv_6= 'Balance' ( (lv_balance_7_0= RULE_INT ) ) otherlv_8= 'MFA Type' ( (lv_mfaType_9_0= RULE_STRING ) ) otherlv_10= 'Type' ( (lv_accountType_11_0= ruleAccountType ) ) (otherlv_12= 'Interest rate' ( (lv_intRate_13_0= RULE_INT ) ) )? (otherlv_14= 'Debits per month' ( (lv_debPerMonth_15_0= RULE_INT ) ) )? (otherlv_16= 'Loan period' ( (lv_loanPeriod_17_0= RULE_STRING ) ) )? otherlv_18= '}' ) ;
    public final EObject ruleAccount() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_accountNum_3_0=null;
        Token otherlv_4=null;
        Token lv_holder_5_0=null;
        Token otherlv_6=null;
        Token lv_balance_7_0=null;
        Token otherlv_8=null;
        Token lv_mfaType_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token lv_intRate_13_0=null;
        Token otherlv_14=null;
        Token lv_debPerMonth_15_0=null;
        Token otherlv_16=null;
        Token lv_loanPeriod_17_0=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_accountType_11_0 = null;



        	enterRule();

        try {
            // InternalBankSystem.g:740:2: ( (otherlv_0= 'account' otherlv_1= '{' otherlv_2= 'Account number' ( (lv_accountNum_3_0= RULE_STRING ) ) otherlv_4= 'Holder' ( (lv_holder_5_0= RULE_STRING ) ) otherlv_6= 'Balance' ( (lv_balance_7_0= RULE_INT ) ) otherlv_8= 'MFA Type' ( (lv_mfaType_9_0= RULE_STRING ) ) otherlv_10= 'Type' ( (lv_accountType_11_0= ruleAccountType ) ) (otherlv_12= 'Interest rate' ( (lv_intRate_13_0= RULE_INT ) ) )? (otherlv_14= 'Debits per month' ( (lv_debPerMonth_15_0= RULE_INT ) ) )? (otherlv_16= 'Loan period' ( (lv_loanPeriod_17_0= RULE_STRING ) ) )? otherlv_18= '}' ) )
            // InternalBankSystem.g:741:2: (otherlv_0= 'account' otherlv_1= '{' otherlv_2= 'Account number' ( (lv_accountNum_3_0= RULE_STRING ) ) otherlv_4= 'Holder' ( (lv_holder_5_0= RULE_STRING ) ) otherlv_6= 'Balance' ( (lv_balance_7_0= RULE_INT ) ) otherlv_8= 'MFA Type' ( (lv_mfaType_9_0= RULE_STRING ) ) otherlv_10= 'Type' ( (lv_accountType_11_0= ruleAccountType ) ) (otherlv_12= 'Interest rate' ( (lv_intRate_13_0= RULE_INT ) ) )? (otherlv_14= 'Debits per month' ( (lv_debPerMonth_15_0= RULE_INT ) ) )? (otherlv_16= 'Loan period' ( (lv_loanPeriod_17_0= RULE_STRING ) ) )? otherlv_18= '}' )
            {
            // InternalBankSystem.g:741:2: (otherlv_0= 'account' otherlv_1= '{' otherlv_2= 'Account number' ( (lv_accountNum_3_0= RULE_STRING ) ) otherlv_4= 'Holder' ( (lv_holder_5_0= RULE_STRING ) ) otherlv_6= 'Balance' ( (lv_balance_7_0= RULE_INT ) ) otherlv_8= 'MFA Type' ( (lv_mfaType_9_0= RULE_STRING ) ) otherlv_10= 'Type' ( (lv_accountType_11_0= ruleAccountType ) ) (otherlv_12= 'Interest rate' ( (lv_intRate_13_0= RULE_INT ) ) )? (otherlv_14= 'Debits per month' ( (lv_debPerMonth_15_0= RULE_INT ) ) )? (otherlv_16= 'Loan period' ( (lv_loanPeriod_17_0= RULE_STRING ) ) )? otherlv_18= '}' )
            // InternalBankSystem.g:742:3: otherlv_0= 'account' otherlv_1= '{' otherlv_2= 'Account number' ( (lv_accountNum_3_0= RULE_STRING ) ) otherlv_4= 'Holder' ( (lv_holder_5_0= RULE_STRING ) ) otherlv_6= 'Balance' ( (lv_balance_7_0= RULE_INT ) ) otherlv_8= 'MFA Type' ( (lv_mfaType_9_0= RULE_STRING ) ) otherlv_10= 'Type' ( (lv_accountType_11_0= ruleAccountType ) ) (otherlv_12= 'Interest rate' ( (lv_intRate_13_0= RULE_INT ) ) )? (otherlv_14= 'Debits per month' ( (lv_debPerMonth_15_0= RULE_INT ) ) )? (otherlv_16= 'Loan period' ( (lv_loanPeriod_17_0= RULE_STRING ) ) )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAccountAccess().getAccountKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getAccountAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getAccountAccess().getAccountNumberKeyword_2());
            		
            // InternalBankSystem.g:754:3: ( (lv_accountNum_3_0= RULE_STRING ) )
            // InternalBankSystem.g:755:4: (lv_accountNum_3_0= RULE_STRING )
            {
            // InternalBankSystem.g:755:4: (lv_accountNum_3_0= RULE_STRING )
            // InternalBankSystem.g:756:5: lv_accountNum_3_0= RULE_STRING
            {
            lv_accountNum_3_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_accountNum_3_0, grammarAccess.getAccountAccess().getAccountNumSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAccountRule());
            					}
            					setWithLastConsumed(
            						current,
            						"accountNum",
            						lv_accountNum_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getAccountAccess().getHolderKeyword_4());
            		
            // InternalBankSystem.g:776:3: ( (lv_holder_5_0= RULE_STRING ) )
            // InternalBankSystem.g:777:4: (lv_holder_5_0= RULE_STRING )
            {
            // InternalBankSystem.g:777:4: (lv_holder_5_0= RULE_STRING )
            // InternalBankSystem.g:778:5: lv_holder_5_0= RULE_STRING
            {
            lv_holder_5_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            					newLeafNode(lv_holder_5_0, grammarAccess.getAccountAccess().getHolderSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAccountRule());
            					}
            					setWithLastConsumed(
            						current,
            						"holder",
            						lv_holder_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,32,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getAccountAccess().getBalanceKeyword_6());
            		
            // InternalBankSystem.g:798:3: ( (lv_balance_7_0= RULE_INT ) )
            // InternalBankSystem.g:799:4: (lv_balance_7_0= RULE_INT )
            {
            // InternalBankSystem.g:799:4: (lv_balance_7_0= RULE_INT )
            // InternalBankSystem.g:800:5: lv_balance_7_0= RULE_INT
            {
            lv_balance_7_0=(Token)match(input,RULE_INT,FOLLOW_27); 

            					newLeafNode(lv_balance_7_0, grammarAccess.getAccountAccess().getBalanceINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAccountRule());
            					}
            					setWithLastConsumed(
            						current,
            						"balance",
            						lv_balance_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,33,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getAccountAccess().getMFATypeKeyword_8());
            		
            // InternalBankSystem.g:820:3: ( (lv_mfaType_9_0= RULE_STRING ) )
            // InternalBankSystem.g:821:4: (lv_mfaType_9_0= RULE_STRING )
            {
            // InternalBankSystem.g:821:4: (lv_mfaType_9_0= RULE_STRING )
            // InternalBankSystem.g:822:5: lv_mfaType_9_0= RULE_STRING
            {
            lv_mfaType_9_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_mfaType_9_0, grammarAccess.getAccountAccess().getMfaTypeSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAccountRule());
            					}
            					setWithLastConsumed(
            						current,
            						"mfaType",
            						lv_mfaType_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,34,FOLLOW_29); 

            			newLeafNode(otherlv_10, grammarAccess.getAccountAccess().getTypeKeyword_10());
            		
            // InternalBankSystem.g:842:3: ( (lv_accountType_11_0= ruleAccountType ) )
            // InternalBankSystem.g:843:4: (lv_accountType_11_0= ruleAccountType )
            {
            // InternalBankSystem.g:843:4: (lv_accountType_11_0= ruleAccountType )
            // InternalBankSystem.g:844:5: lv_accountType_11_0= ruleAccountType
            {

            					newCompositeNode(grammarAccess.getAccountAccess().getAccountTypeAccountTypeParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_30);
            lv_accountType_11_0=ruleAccountType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAccountRule());
            					}
            					set(
            						current,
            						"accountType",
            						lv_accountType_11_0,
            						"org.xtext.BankSystem.AccountType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBankSystem.g:861:3: (otherlv_12= 'Interest rate' ( (lv_intRate_13_0= RULE_INT ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==35) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBankSystem.g:862:4: otherlv_12= 'Interest rate' ( (lv_intRate_13_0= RULE_INT ) )
                    {
                    otherlv_12=(Token)match(input,35,FOLLOW_20); 

                    				newLeafNode(otherlv_12, grammarAccess.getAccountAccess().getInterestRateKeyword_12_0());
                    			
                    // InternalBankSystem.g:866:4: ( (lv_intRate_13_0= RULE_INT ) )
                    // InternalBankSystem.g:867:5: (lv_intRate_13_0= RULE_INT )
                    {
                    // InternalBankSystem.g:867:5: (lv_intRate_13_0= RULE_INT )
                    // InternalBankSystem.g:868:6: lv_intRate_13_0= RULE_INT
                    {
                    lv_intRate_13_0=(Token)match(input,RULE_INT,FOLLOW_31); 

                    						newLeafNode(lv_intRate_13_0, grammarAccess.getAccountAccess().getIntRateINTTerminalRuleCall_12_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAccountRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"intRate",
                    							lv_intRate_13_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBankSystem.g:885:3: (otherlv_14= 'Debits per month' ( (lv_debPerMonth_15_0= RULE_INT ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==36) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBankSystem.g:886:4: otherlv_14= 'Debits per month' ( (lv_debPerMonth_15_0= RULE_INT ) )
                    {
                    otherlv_14=(Token)match(input,36,FOLLOW_20); 

                    				newLeafNode(otherlv_14, grammarAccess.getAccountAccess().getDebitsPerMonthKeyword_13_0());
                    			
                    // InternalBankSystem.g:890:4: ( (lv_debPerMonth_15_0= RULE_INT ) )
                    // InternalBankSystem.g:891:5: (lv_debPerMonth_15_0= RULE_INT )
                    {
                    // InternalBankSystem.g:891:5: (lv_debPerMonth_15_0= RULE_INT )
                    // InternalBankSystem.g:892:6: lv_debPerMonth_15_0= RULE_INT
                    {
                    lv_debPerMonth_15_0=(Token)match(input,RULE_INT,FOLLOW_32); 

                    						newLeafNode(lv_debPerMonth_15_0, grammarAccess.getAccountAccess().getDebPerMonthINTTerminalRuleCall_13_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAccountRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"debPerMonth",
                    							lv_debPerMonth_15_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBankSystem.g:909:3: (otherlv_16= 'Loan period' ( (lv_loanPeriod_17_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==37) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBankSystem.g:910:4: otherlv_16= 'Loan period' ( (lv_loanPeriod_17_0= RULE_STRING ) )
                    {
                    otherlv_16=(Token)match(input,37,FOLLOW_7); 

                    				newLeafNode(otherlv_16, grammarAccess.getAccountAccess().getLoanPeriodKeyword_14_0());
                    			
                    // InternalBankSystem.g:914:4: ( (lv_loanPeriod_17_0= RULE_STRING ) )
                    // InternalBankSystem.g:915:5: (lv_loanPeriod_17_0= RULE_STRING )
                    {
                    // InternalBankSystem.g:915:5: (lv_loanPeriod_17_0= RULE_STRING )
                    // InternalBankSystem.g:916:6: lv_loanPeriod_17_0= RULE_STRING
                    {
                    lv_loanPeriod_17_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    						newLeafNode(lv_loanPeriod_17_0, grammarAccess.getAccountAccess().getLoanPeriodSTRINGTerminalRuleCall_14_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAccountRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"loanPeriod",
                    							lv_loanPeriod_17_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getAccountAccess().getRightCurlyBracketKeyword_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAccount"


    // $ANTLR start "entryRuleAccountType"
    // InternalBankSystem.g:941:1: entryRuleAccountType returns [String current=null] : iv_ruleAccountType= ruleAccountType EOF ;
    public final String entryRuleAccountType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAccountType = null;


        try {
            // InternalBankSystem.g:941:51: (iv_ruleAccountType= ruleAccountType EOF )
            // InternalBankSystem.g:942:2: iv_ruleAccountType= ruleAccountType EOF
            {
             newCompositeNode(grammarAccess.getAccountTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccountType=ruleAccountType();

            state._fsp--;

             current =iv_ruleAccountType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAccountType"


    // $ANTLR start "ruleAccountType"
    // InternalBankSystem.g:948:1: ruleAccountType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SavingsAccount_0= ruleSavingsAccount | this_CheckingAccount_1= ruleCheckingAccount | this_MortgageAccount_2= ruleMortgageAccount ) ;
    public final AntlrDatatypeRuleToken ruleAccountType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SavingsAccount_0 = null;

        AntlrDatatypeRuleToken this_CheckingAccount_1 = null;

        AntlrDatatypeRuleToken this_MortgageAccount_2 = null;



        	enterRule();

        try {
            // InternalBankSystem.g:954:2: ( (this_SavingsAccount_0= ruleSavingsAccount | this_CheckingAccount_1= ruleCheckingAccount | this_MortgageAccount_2= ruleMortgageAccount ) )
            // InternalBankSystem.g:955:2: (this_SavingsAccount_0= ruleSavingsAccount | this_CheckingAccount_1= ruleCheckingAccount | this_MortgageAccount_2= ruleMortgageAccount )
            {
            // InternalBankSystem.g:955:2: (this_SavingsAccount_0= ruleSavingsAccount | this_CheckingAccount_1= ruleCheckingAccount | this_MortgageAccount_2= ruleMortgageAccount )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt13=1;
                }
                break;
            case 39:
                {
                alt13=2;
                }
                break;
            case 40:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalBankSystem.g:956:3: this_SavingsAccount_0= ruleSavingsAccount
                    {

                    			newCompositeNode(grammarAccess.getAccountTypeAccess().getSavingsAccountParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SavingsAccount_0=ruleSavingsAccount();

                    state._fsp--;


                    			current.merge(this_SavingsAccount_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBankSystem.g:967:3: this_CheckingAccount_1= ruleCheckingAccount
                    {

                    			newCompositeNode(grammarAccess.getAccountTypeAccess().getCheckingAccountParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CheckingAccount_1=ruleCheckingAccount();

                    state._fsp--;


                    			current.merge(this_CheckingAccount_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBankSystem.g:978:3: this_MortgageAccount_2= ruleMortgageAccount
                    {

                    			newCompositeNode(grammarAccess.getAccountTypeAccess().getMortgageAccountParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MortgageAccount_2=ruleMortgageAccount();

                    state._fsp--;


                    			current.merge(this_MortgageAccount_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAccountType"


    // $ANTLR start "entryRuleSavingsAccount"
    // InternalBankSystem.g:992:1: entryRuleSavingsAccount returns [String current=null] : iv_ruleSavingsAccount= ruleSavingsAccount EOF ;
    public final String entryRuleSavingsAccount() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSavingsAccount = null;


        try {
            // InternalBankSystem.g:992:54: (iv_ruleSavingsAccount= ruleSavingsAccount EOF )
            // InternalBankSystem.g:993:2: iv_ruleSavingsAccount= ruleSavingsAccount EOF
            {
             newCompositeNode(grammarAccess.getSavingsAccountRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSavingsAccount=ruleSavingsAccount();

            state._fsp--;

             current =iv_ruleSavingsAccount.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSavingsAccount"


    // $ANTLR start "ruleSavingsAccount"
    // InternalBankSystem.g:999:1: ruleSavingsAccount returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Savings Account' ;
    public final AntlrDatatypeRuleToken ruleSavingsAccount() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBankSystem.g:1005:2: (kw= 'Savings Account' )
            // InternalBankSystem.g:1006:2: kw= 'Savings Account'
            {
            kw=(Token)match(input,38,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getSavingsAccountAccess().getSavingsAccountKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSavingsAccount"


    // $ANTLR start "entryRuleCheckingAccount"
    // InternalBankSystem.g:1014:1: entryRuleCheckingAccount returns [String current=null] : iv_ruleCheckingAccount= ruleCheckingAccount EOF ;
    public final String entryRuleCheckingAccount() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCheckingAccount = null;


        try {
            // InternalBankSystem.g:1014:55: (iv_ruleCheckingAccount= ruleCheckingAccount EOF )
            // InternalBankSystem.g:1015:2: iv_ruleCheckingAccount= ruleCheckingAccount EOF
            {
             newCompositeNode(grammarAccess.getCheckingAccountRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheckingAccount=ruleCheckingAccount();

            state._fsp--;

             current =iv_ruleCheckingAccount.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheckingAccount"


    // $ANTLR start "ruleCheckingAccount"
    // InternalBankSystem.g:1021:1: ruleCheckingAccount returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Checking Account' ;
    public final AntlrDatatypeRuleToken ruleCheckingAccount() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBankSystem.g:1027:2: (kw= 'Checking Account' )
            // InternalBankSystem.g:1028:2: kw= 'Checking Account'
            {
            kw=(Token)match(input,39,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getCheckingAccountAccess().getCheckingAccountKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheckingAccount"


    // $ANTLR start "entryRuleMortgageAccount"
    // InternalBankSystem.g:1036:1: entryRuleMortgageAccount returns [String current=null] : iv_ruleMortgageAccount= ruleMortgageAccount EOF ;
    public final String entryRuleMortgageAccount() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMortgageAccount = null;


        try {
            // InternalBankSystem.g:1036:55: (iv_ruleMortgageAccount= ruleMortgageAccount EOF )
            // InternalBankSystem.g:1037:2: iv_ruleMortgageAccount= ruleMortgageAccount EOF
            {
             newCompositeNode(grammarAccess.getMortgageAccountRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMortgageAccount=ruleMortgageAccount();

            state._fsp--;

             current =iv_ruleMortgageAccount.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMortgageAccount"


    // $ANTLR start "ruleMortgageAccount"
    // InternalBankSystem.g:1043:1: ruleMortgageAccount returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Mortgage Account' ;
    public final AntlrDatatypeRuleToken ruleMortgageAccount() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBankSystem.g:1049:2: (kw= 'Mortgage Account' )
            // InternalBankSystem.g:1050:2: kw= 'Mortgage Account'
            {
            kw=(Token)match(input,40,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getMortgageAccountAccess().getMortgageAccountKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMortgageAccount"


    // $ANTLR start "entryRuleTransaction"
    // InternalBankSystem.g:1058:1: entryRuleTransaction returns [EObject current=null] : iv_ruleTransaction= ruleTransaction EOF ;
    public final EObject entryRuleTransaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransaction = null;


        try {
            // InternalBankSystem.g:1058:52: (iv_ruleTransaction= ruleTransaction EOF )
            // InternalBankSystem.g:1059:2: iv_ruleTransaction= ruleTransaction EOF
            {
             newCompositeNode(grammarAccess.getTransactionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransaction=ruleTransaction();

            state._fsp--;

             current =iv_ruleTransaction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransaction"


    // $ANTLR start "ruleTransaction"
    // InternalBankSystem.g:1065:1: ruleTransaction returns [EObject current=null] : (otherlv_0= 'transaction {' otherlv_1= 'Related account' ( (lv_account_2_0= RULE_STRING ) ) otherlv_3= 'Amount' ( (lv_amount_4_0= RULE_INT ) ) otherlv_5= 'Date' ( (lv_date_6_0= ruleDate ) ) otherlv_7= 'Debit' ( (lv_debit_8_0= ruleBoolean ) ) otherlv_9= 'Vendor name' ( (lv_vendorName_10_0= RULE_STRING ) ) otherlv_11= '}' ) ;
    public final EObject ruleTransaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_account_2_0=null;
        Token otherlv_3=null;
        Token lv_amount_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_vendorName_10_0=null;
        Token otherlv_11=null;
        EObject lv_date_6_0 = null;

        AntlrDatatypeRuleToken lv_debit_8_0 = null;



        	enterRule();

        try {
            // InternalBankSystem.g:1071:2: ( (otherlv_0= 'transaction {' otherlv_1= 'Related account' ( (lv_account_2_0= RULE_STRING ) ) otherlv_3= 'Amount' ( (lv_amount_4_0= RULE_INT ) ) otherlv_5= 'Date' ( (lv_date_6_0= ruleDate ) ) otherlv_7= 'Debit' ( (lv_debit_8_0= ruleBoolean ) ) otherlv_9= 'Vendor name' ( (lv_vendorName_10_0= RULE_STRING ) ) otherlv_11= '}' ) )
            // InternalBankSystem.g:1072:2: (otherlv_0= 'transaction {' otherlv_1= 'Related account' ( (lv_account_2_0= RULE_STRING ) ) otherlv_3= 'Amount' ( (lv_amount_4_0= RULE_INT ) ) otherlv_5= 'Date' ( (lv_date_6_0= ruleDate ) ) otherlv_7= 'Debit' ( (lv_debit_8_0= ruleBoolean ) ) otherlv_9= 'Vendor name' ( (lv_vendorName_10_0= RULE_STRING ) ) otherlv_11= '}' )
            {
            // InternalBankSystem.g:1072:2: (otherlv_0= 'transaction {' otherlv_1= 'Related account' ( (lv_account_2_0= RULE_STRING ) ) otherlv_3= 'Amount' ( (lv_amount_4_0= RULE_INT ) ) otherlv_5= 'Date' ( (lv_date_6_0= ruleDate ) ) otherlv_7= 'Debit' ( (lv_debit_8_0= ruleBoolean ) ) otherlv_9= 'Vendor name' ( (lv_vendorName_10_0= RULE_STRING ) ) otherlv_11= '}' )
            // InternalBankSystem.g:1073:3: otherlv_0= 'transaction {' otherlv_1= 'Related account' ( (lv_account_2_0= RULE_STRING ) ) otherlv_3= 'Amount' ( (lv_amount_4_0= RULE_INT ) ) otherlv_5= 'Date' ( (lv_date_6_0= ruleDate ) ) otherlv_7= 'Debit' ( (lv_debit_8_0= ruleBoolean ) ) otherlv_9= 'Vendor name' ( (lv_vendorName_10_0= RULE_STRING ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getTransactionAccess().getTransactionKeyword_0());
            		
            otherlv_1=(Token)match(input,42,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getTransactionAccess().getRelatedAccountKeyword_1());
            		
            // InternalBankSystem.g:1081:3: ( (lv_account_2_0= RULE_STRING ) )
            // InternalBankSystem.g:1082:4: (lv_account_2_0= RULE_STRING )
            {
            // InternalBankSystem.g:1082:4: (lv_account_2_0= RULE_STRING )
            // InternalBankSystem.g:1083:5: lv_account_2_0= RULE_STRING
            {
            lv_account_2_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            					newLeafNode(lv_account_2_0, grammarAccess.getTransactionAccess().getAccountSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransactionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"account",
            						lv_account_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,43,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getTransactionAccess().getAmountKeyword_3());
            		
            // InternalBankSystem.g:1103:3: ( (lv_amount_4_0= RULE_INT ) )
            // InternalBankSystem.g:1104:4: (lv_amount_4_0= RULE_INT )
            {
            // InternalBankSystem.g:1104:4: (lv_amount_4_0= RULE_INT )
            // InternalBankSystem.g:1105:5: lv_amount_4_0= RULE_INT
            {
            lv_amount_4_0=(Token)match(input,RULE_INT,FOLLOW_35); 

            					newLeafNode(lv_amount_4_0, grammarAccess.getTransactionAccess().getAmountINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransactionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"amount",
            						lv_amount_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,44,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getTransactionAccess().getDateKeyword_5());
            		
            // InternalBankSystem.g:1125:3: ( (lv_date_6_0= ruleDate ) )
            // InternalBankSystem.g:1126:4: (lv_date_6_0= ruleDate )
            {
            // InternalBankSystem.g:1126:4: (lv_date_6_0= ruleDate )
            // InternalBankSystem.g:1127:5: lv_date_6_0= ruleDate
            {

            					newCompositeNode(grammarAccess.getTransactionAccess().getDateDateParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_36);
            lv_date_6_0=ruleDate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransactionRule());
            					}
            					set(
            						current,
            						"date",
            						lv_date_6_0,
            						"org.xtext.BankSystem.Date");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,45,FOLLOW_37); 

            			newLeafNode(otherlv_7, grammarAccess.getTransactionAccess().getDebitKeyword_7());
            		
            // InternalBankSystem.g:1148:3: ( (lv_debit_8_0= ruleBoolean ) )
            // InternalBankSystem.g:1149:4: (lv_debit_8_0= ruleBoolean )
            {
            // InternalBankSystem.g:1149:4: (lv_debit_8_0= ruleBoolean )
            // InternalBankSystem.g:1150:5: lv_debit_8_0= ruleBoolean
            {

            					newCompositeNode(grammarAccess.getTransactionAccess().getDebitBooleanParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_38);
            lv_debit_8_0=ruleBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransactionRule());
            					}
            					set(
            						current,
            						"debit",
            						lv_debit_8_0,
            						"org.xtext.BankSystem.Boolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,46,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getTransactionAccess().getVendorNameKeyword_9());
            		
            // InternalBankSystem.g:1171:3: ( (lv_vendorName_10_0= RULE_STRING ) )
            // InternalBankSystem.g:1172:4: (lv_vendorName_10_0= RULE_STRING )
            {
            // InternalBankSystem.g:1172:4: (lv_vendorName_10_0= RULE_STRING )
            // InternalBankSystem.g:1173:5: lv_vendorName_10_0= RULE_STRING
            {
            lv_vendorName_10_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_vendorName_10_0, grammarAccess.getTransactionAccess().getVendorNameSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransactionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"vendorName",
            						lv_vendorName_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getTransactionAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransaction"


    // $ANTLR start "entryRuleBoolean"
    // InternalBankSystem.g:1197:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // InternalBankSystem.g:1197:47: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalBankSystem.g:1198:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalBankSystem.g:1204:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBankSystem.g:1210:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalBankSystem.g:1211:2: (kw= 'true' | kw= 'false' )
            {
            // InternalBankSystem.g:1211:2: (kw= 'true' | kw= 'false' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==47) ) {
                alt14=1;
            }
            else if ( (LA14_0==48) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalBankSystem.g:1212:3: kw= 'true'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBankSystem.g:1218:3: kw= 'false'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleDate"
    // InternalBankSystem.g:1227:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // InternalBankSystem.g:1227:45: (iv_ruleDate= ruleDate EOF )
            // InternalBankSystem.g:1228:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // InternalBankSystem.g:1234:1: ruleDate returns [EObject current=null] : ( ( (lv_year_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_month_2_0= RULE_INT ) ) otherlv_3= '/' ( (lv_day_4_0= RULE_INT ) ) ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token lv_year_0_0=null;
        Token otherlv_1=null;
        Token lv_month_2_0=null;
        Token otherlv_3=null;
        Token lv_day_4_0=null;


        	enterRule();

        try {
            // InternalBankSystem.g:1240:2: ( ( ( (lv_year_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_month_2_0= RULE_INT ) ) otherlv_3= '/' ( (lv_day_4_0= RULE_INT ) ) ) )
            // InternalBankSystem.g:1241:2: ( ( (lv_year_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_month_2_0= RULE_INT ) ) otherlv_3= '/' ( (lv_day_4_0= RULE_INT ) ) )
            {
            // InternalBankSystem.g:1241:2: ( ( (lv_year_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_month_2_0= RULE_INT ) ) otherlv_3= '/' ( (lv_day_4_0= RULE_INT ) ) )
            // InternalBankSystem.g:1242:3: ( (lv_year_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_month_2_0= RULE_INT ) ) otherlv_3= '/' ( (lv_day_4_0= RULE_INT ) )
            {
            // InternalBankSystem.g:1242:3: ( (lv_year_0_0= RULE_INT ) )
            // InternalBankSystem.g:1243:4: (lv_year_0_0= RULE_INT )
            {
            // InternalBankSystem.g:1243:4: (lv_year_0_0= RULE_INT )
            // InternalBankSystem.g:1244:5: lv_year_0_0= RULE_INT
            {
            lv_year_0_0=(Token)match(input,RULE_INT,FOLLOW_39); 

            					newLeafNode(lv_year_0_0, grammarAccess.getDateAccess().getYearINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"year",
            						lv_year_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,49,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getDateAccess().getSolidusKeyword_1());
            		
            // InternalBankSystem.g:1264:3: ( (lv_month_2_0= RULE_INT ) )
            // InternalBankSystem.g:1265:4: (lv_month_2_0= RULE_INT )
            {
            // InternalBankSystem.g:1265:4: (lv_month_2_0= RULE_INT )
            // InternalBankSystem.g:1266:5: lv_month_2_0= RULE_INT
            {
            lv_month_2_0=(Token)match(input,RULE_INT,FOLLOW_39); 

            					newLeafNode(lv_month_2_0, grammarAccess.getDateAccess().getMonthINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"month",
            						lv_month_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,49,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getDateAccess().getSolidusKeyword_3());
            		
            // InternalBankSystem.g:1286:3: ( (lv_day_4_0= RULE_INT ) )
            // InternalBankSystem.g:1287:4: (lv_day_4_0= RULE_INT )
            {
            // InternalBankSystem.g:1287:4: (lv_day_4_0= RULE_INT )
            // InternalBankSystem.g:1288:5: lv_day_4_0= RULE_INT
            {
            lv_day_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_day_4_0, grammarAccess.getDateAccess().getDayINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"day",
            						lv_day_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDate"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000020020108000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000020020008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000020000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000E08000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000003800008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000003000008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000008000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002000000000000L});

}