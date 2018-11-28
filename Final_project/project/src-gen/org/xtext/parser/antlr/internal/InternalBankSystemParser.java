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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Bank'", "'{'", "'Country'", "'}'", "'User'", "'Name'", "'Email'", "'HashPass'", "'Address'", "'Branch{'", "'Booth'", "'Vault'", "'Employee'", "'Hiring date'", "'Salary'", "'Current Role'", "'Teller'", "'Manager'", "'account'", "'Holder(s)'", "'Balance'", "'Account Number'", "'MFA Type'", "'Type'", "'Interest rate'", "'Debits per month'", "'Loan period'", "'Savings Account'", "'Checking Account'", "'Mortgage Account'", "'transaction {'", "'Account:'", "'Amount:'", "'Date'", "'Debit'", "'Vendor name'", "'true'", "'false'", "'/'"
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

                if ( (LA2_0==15) ) {
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
    // InternalBankSystem.g:128:1: ruleBank returns [EObject current=null] : (otherlv_0= 'Bank' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Country' ( (lv_countryOfOrigin_4_0= RULE_STRING ) ) ( (lv_branches_5_0= ruleBranch ) )+ ( (lv_accounts_6_0= ruleAccount ) )* ( (lv_transactions_7_0= ruleTransaction ) )* otherlv_8= '}' ) ;
    public final EObject ruleBank() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_countryOfOrigin_4_0=null;
        Token otherlv_8=null;
        EObject lv_branches_5_0 = null;

        EObject lv_accounts_6_0 = null;

        EObject lv_transactions_7_0 = null;



        	enterRule();

        try {
            // InternalBankSystem.g:134:2: ( (otherlv_0= 'Bank' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Country' ( (lv_countryOfOrigin_4_0= RULE_STRING ) ) ( (lv_branches_5_0= ruleBranch ) )+ ( (lv_accounts_6_0= ruleAccount ) )* ( (lv_transactions_7_0= ruleTransaction ) )* otherlv_8= '}' ) )
            // InternalBankSystem.g:135:2: (otherlv_0= 'Bank' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Country' ( (lv_countryOfOrigin_4_0= RULE_STRING ) ) ( (lv_branches_5_0= ruleBranch ) )+ ( (lv_accounts_6_0= ruleAccount ) )* ( (lv_transactions_7_0= ruleTransaction ) )* otherlv_8= '}' )
            {
            // InternalBankSystem.g:135:2: (otherlv_0= 'Bank' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Country' ( (lv_countryOfOrigin_4_0= RULE_STRING ) ) ( (lv_branches_5_0= ruleBranch ) )+ ( (lv_accounts_6_0= ruleAccount ) )* ( (lv_transactions_7_0= ruleTransaction ) )* otherlv_8= '}' )
            // InternalBankSystem.g:136:3: otherlv_0= 'Bank' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Country' ( (lv_countryOfOrigin_4_0= RULE_STRING ) ) ( (lv_branches_5_0= ruleBranch ) )+ ( (lv_accounts_6_0= ruleAccount ) )* ( (lv_transactions_7_0= ruleTransaction ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBankAccess().getBankKeyword_0());
            		
            // InternalBankSystem.g:140:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBankSystem.g:141:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBankSystem.g:141:4: (lv_name_1_0= RULE_ID )
            // InternalBankSystem.g:142:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBankAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBankRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getBankAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getBankAccess().getCountryKeyword_3());
            		
            // InternalBankSystem.g:166:3: ( (lv_countryOfOrigin_4_0= RULE_STRING ) )
            // InternalBankSystem.g:167:4: (lv_countryOfOrigin_4_0= RULE_STRING )
            {
            // InternalBankSystem.g:167:4: (lv_countryOfOrigin_4_0= RULE_STRING )
            // InternalBankSystem.g:168:5: lv_countryOfOrigin_4_0= RULE_STRING
            {
            lv_countryOfOrigin_4_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_countryOfOrigin_4_0, grammarAccess.getBankAccess().getCountryOfOriginSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBankRule());
            					}
            					setWithLastConsumed(
            						current,
            						"countryOfOrigin",
            						lv_countryOfOrigin_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalBankSystem.g:184:3: ( (lv_branches_5_0= ruleBranch ) )+
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
            	    // InternalBankSystem.g:185:4: (lv_branches_5_0= ruleBranch )
            	    {
            	    // InternalBankSystem.g:185:4: (lv_branches_5_0= ruleBranch )
            	    // InternalBankSystem.g:186:5: lv_branches_5_0= ruleBranch
            	    {

            	    					newCompositeNode(grammarAccess.getBankAccess().getBranchesBranchParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_branches_5_0=ruleBranch();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBankRule());
            	    					}
            	    					add(
            	    						current,
            	    						"branches",
            	    						lv_branches_5_0,
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

            // InternalBankSystem.g:203:3: ( (lv_accounts_6_0= ruleAccount ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==29) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBankSystem.g:204:4: (lv_accounts_6_0= ruleAccount )
            	    {
            	    // InternalBankSystem.g:204:4: (lv_accounts_6_0= ruleAccount )
            	    // InternalBankSystem.g:205:5: lv_accounts_6_0= ruleAccount
            	    {

            	    					newCompositeNode(grammarAccess.getBankAccess().getAccountsAccountParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_accounts_6_0=ruleAccount();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBankRule());
            	    					}
            	    					add(
            	    						current,
            	    						"accounts",
            	    						lv_accounts_6_0,
            	    						"org.xtext.BankSystem.Account");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalBankSystem.g:222:3: ( (lv_transactions_7_0= ruleTransaction ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==41) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBankSystem.g:223:4: (lv_transactions_7_0= ruleTransaction )
            	    {
            	    // InternalBankSystem.g:223:4: (lv_transactions_7_0= ruleTransaction )
            	    // InternalBankSystem.g:224:5: lv_transactions_7_0= ruleTransaction
            	    {

            	    					newCompositeNode(grammarAccess.getBankAccess().getTransactionsTransactionParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_transactions_7_0=ruleTransaction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBankRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transactions",
            	    						lv_transactions_7_0,
            	    						"org.xtext.BankSystem.Transaction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getBankAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalBankSystem.g:249:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // InternalBankSystem.g:249:45: (iv_ruleUser= ruleUser EOF )
            // InternalBankSystem.g:250:2: iv_ruleUser= ruleUser EOF
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
    // InternalBankSystem.g:256:1: ruleUser returns [EObject current=null] : (otherlv_0= 'User' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'Email' ( (lv_email_5_0= RULE_STRING ) ) otherlv_6= 'HashPass' ( (lv_hashpass_7_0= RULE_STRING ) ) otherlv_8= 'Address' ( (lv_address_9_0= RULE_STRING ) ) otherlv_10= '}' ) ;
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
            // InternalBankSystem.g:262:2: ( (otherlv_0= 'User' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'Email' ( (lv_email_5_0= RULE_STRING ) ) otherlv_6= 'HashPass' ( (lv_hashpass_7_0= RULE_STRING ) ) otherlv_8= 'Address' ( (lv_address_9_0= RULE_STRING ) ) otherlv_10= '}' ) )
            // InternalBankSystem.g:263:2: (otherlv_0= 'User' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'Email' ( (lv_email_5_0= RULE_STRING ) ) otherlv_6= 'HashPass' ( (lv_hashpass_7_0= RULE_STRING ) ) otherlv_8= 'Address' ( (lv_address_9_0= RULE_STRING ) ) otherlv_10= '}' )
            {
            // InternalBankSystem.g:263:2: (otherlv_0= 'User' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'Email' ( (lv_email_5_0= RULE_STRING ) ) otherlv_6= 'HashPass' ( (lv_hashpass_7_0= RULE_STRING ) ) otherlv_8= 'Address' ( (lv_address_9_0= RULE_STRING ) ) otherlv_10= '}' )
            // InternalBankSystem.g:264:3: otherlv_0= 'User' otherlv_1= '{' otherlv_2= 'Name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'Email' ( (lv_email_5_0= RULE_STRING ) ) otherlv_6= 'HashPass' ( (lv_hashpass_7_0= RULE_STRING ) ) otherlv_8= 'Address' ( (lv_address_9_0= RULE_STRING ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getUserAccess().getUserKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getUserAccess().getNameKeyword_2());
            		
            // InternalBankSystem.g:276:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalBankSystem.g:277:4: (lv_name_3_0= RULE_ID )
            {
            // InternalBankSystem.g:277:4: (lv_name_3_0= RULE_ID )
            // InternalBankSystem.g:278:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_3_0, grammarAccess.getUserAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getUserAccess().getEmailKeyword_4());
            		
            // InternalBankSystem.g:298:3: ( (lv_email_5_0= RULE_STRING ) )
            // InternalBankSystem.g:299:4: (lv_email_5_0= RULE_STRING )
            {
            // InternalBankSystem.g:299:4: (lv_email_5_0= RULE_STRING )
            // InternalBankSystem.g:300:5: lv_email_5_0= RULE_STRING
            {
            lv_email_5_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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

            otherlv_6=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getUserAccess().getHashPassKeyword_6());
            		
            // InternalBankSystem.g:320:3: ( (lv_hashpass_7_0= RULE_STRING ) )
            // InternalBankSystem.g:321:4: (lv_hashpass_7_0= RULE_STRING )
            {
            // InternalBankSystem.g:321:4: (lv_hashpass_7_0= RULE_STRING )
            // InternalBankSystem.g:322:5: lv_hashpass_7_0= RULE_STRING
            {
            lv_hashpass_7_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

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

            otherlv_8=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getUserAccess().getAddressKeyword_8());
            		
            // InternalBankSystem.g:342:3: ( (lv_address_9_0= RULE_STRING ) )
            // InternalBankSystem.g:343:4: (lv_address_9_0= RULE_STRING )
            {
            // InternalBankSystem.g:343:4: (lv_address_9_0= RULE_STRING )
            // InternalBankSystem.g:344:5: lv_address_9_0= RULE_STRING
            {
            lv_address_9_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

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

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

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
    // InternalBankSystem.g:368:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // InternalBankSystem.g:368:47: (iv_ruleBranch= ruleBranch EOF )
            // InternalBankSystem.g:369:2: iv_ruleBranch= ruleBranch EOF
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
    // InternalBankSystem.g:375:1: ruleBranch returns [EObject current=null] : (otherlv_0= 'Branch{' otherlv_1= 'Address' ( (lv_address_2_0= RULE_STRING ) ) ( (lv_mybooth_3_0= ruleBooth ) )? ( (lv_myVault_4_0= ruleVault ) )? ( (lv_employees_5_0= ruleEmployee ) )+ otherlv_6= '}' ) ;
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
            // InternalBankSystem.g:381:2: ( (otherlv_0= 'Branch{' otherlv_1= 'Address' ( (lv_address_2_0= RULE_STRING ) ) ( (lv_mybooth_3_0= ruleBooth ) )? ( (lv_myVault_4_0= ruleVault ) )? ( (lv_employees_5_0= ruleEmployee ) )+ otherlv_6= '}' ) )
            // InternalBankSystem.g:382:2: (otherlv_0= 'Branch{' otherlv_1= 'Address' ( (lv_address_2_0= RULE_STRING ) ) ( (lv_mybooth_3_0= ruleBooth ) )? ( (lv_myVault_4_0= ruleVault ) )? ( (lv_employees_5_0= ruleEmployee ) )+ otherlv_6= '}' )
            {
            // InternalBankSystem.g:382:2: (otherlv_0= 'Branch{' otherlv_1= 'Address' ( (lv_address_2_0= RULE_STRING ) ) ( (lv_mybooth_3_0= ruleBooth ) )? ( (lv_myVault_4_0= ruleVault ) )? ( (lv_employees_5_0= ruleEmployee ) )+ otherlv_6= '}' )
            // InternalBankSystem.g:383:3: otherlv_0= 'Branch{' otherlv_1= 'Address' ( (lv_address_2_0= RULE_STRING ) ) ( (lv_mybooth_3_0= ruleBooth ) )? ( (lv_myVault_4_0= ruleVault ) )? ( (lv_employees_5_0= ruleEmployee ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getBranchAccess().getBranchKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getBranchAccess().getAddressKeyword_1());
            		
            // InternalBankSystem.g:391:3: ( (lv_address_2_0= RULE_STRING ) )
            // InternalBankSystem.g:392:4: (lv_address_2_0= RULE_STRING )
            {
            // InternalBankSystem.g:392:4: (lv_address_2_0= RULE_STRING )
            // InternalBankSystem.g:393:5: lv_address_2_0= RULE_STRING
            {
            lv_address_2_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

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

            // InternalBankSystem.g:409:3: ( (lv_mybooth_3_0= ruleBooth ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBankSystem.g:410:4: (lv_mybooth_3_0= ruleBooth )
                    {
                    // InternalBankSystem.g:410:4: (lv_mybooth_3_0= ruleBooth )
                    // InternalBankSystem.g:411:5: lv_mybooth_3_0= ruleBooth
                    {

                    					newCompositeNode(grammarAccess.getBranchAccess().getMyboothBoothParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_18);
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

            // InternalBankSystem.g:428:3: ( (lv_myVault_4_0= ruleVault ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBankSystem.g:429:4: (lv_myVault_4_0= ruleVault )
                    {
                    // InternalBankSystem.g:429:4: (lv_myVault_4_0= ruleVault )
                    // InternalBankSystem.g:430:5: lv_myVault_4_0= ruleVault
                    {

                    					newCompositeNode(grammarAccess.getBranchAccess().getMyVaultVaultParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_18);
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

            // InternalBankSystem.g:447:3: ( (lv_employees_5_0= ruleEmployee ) )+
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
            	    // InternalBankSystem.g:448:4: (lv_employees_5_0= ruleEmployee )
            	    {
            	    // InternalBankSystem.g:448:4: (lv_employees_5_0= ruleEmployee )
            	    // InternalBankSystem.g:449:5: lv_employees_5_0= ruleEmployee
            	    {

            	    					newCompositeNode(grammarAccess.getBranchAccess().getEmployeesEmployeeParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_19);
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

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

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
    // InternalBankSystem.g:474:1: entryRuleBooth returns [String current=null] : iv_ruleBooth= ruleBooth EOF ;
    public final String entryRuleBooth() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooth = null;


        try {
            // InternalBankSystem.g:474:45: (iv_ruleBooth= ruleBooth EOF )
            // InternalBankSystem.g:475:2: iv_ruleBooth= ruleBooth EOF
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
    // InternalBankSystem.g:481:1: ruleBooth returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Booth' ;
    public final AntlrDatatypeRuleToken ruleBooth() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBankSystem.g:487:2: (kw= 'Booth' )
            // InternalBankSystem.g:488:2: kw= 'Booth'
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
    // InternalBankSystem.g:496:1: entryRuleVault returns [String current=null] : iv_ruleVault= ruleVault EOF ;
    public final String entryRuleVault() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVault = null;


        try {
            // InternalBankSystem.g:496:45: (iv_ruleVault= ruleVault EOF )
            // InternalBankSystem.g:497:2: iv_ruleVault= ruleVault EOF
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
    // InternalBankSystem.g:503:1: ruleVault returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Vault' ;
    public final AntlrDatatypeRuleToken ruleVault() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBankSystem.g:509:2: (kw= 'Vault' )
            // InternalBankSystem.g:510:2: kw= 'Vault'
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
    // InternalBankSystem.g:518:1: entryRuleEmployee returns [EObject current=null] : iv_ruleEmployee= ruleEmployee EOF ;
    public final EObject entryRuleEmployee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmployee = null;


        try {
            // InternalBankSystem.g:518:49: (iv_ruleEmployee= ruleEmployee EOF )
            // InternalBankSystem.g:519:2: iv_ruleEmployee= ruleEmployee EOF
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
    // InternalBankSystem.g:525:1: ruleEmployee returns [EObject current=null] : (otherlv_0= 'Employee' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Hiring date' ( (lv_date_4_0= ruleDate ) ) otherlv_5= 'Salary' ( (lv_salary_6_0= RULE_INT ) ) otherlv_7= 'Current Role' ( (lv_currentRole_8_0= ruleEmployeeRole ) ) otherlv_9= '}' ) ;
    public final EObject ruleEmployee() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_salary_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_date_4_0 = null;

        AntlrDatatypeRuleToken lv_currentRole_8_0 = null;



        	enterRule();

        try {
            // InternalBankSystem.g:531:2: ( (otherlv_0= 'Employee' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Hiring date' ( (lv_date_4_0= ruleDate ) ) otherlv_5= 'Salary' ( (lv_salary_6_0= RULE_INT ) ) otherlv_7= 'Current Role' ( (lv_currentRole_8_0= ruleEmployeeRole ) ) otherlv_9= '}' ) )
            // InternalBankSystem.g:532:2: (otherlv_0= 'Employee' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Hiring date' ( (lv_date_4_0= ruleDate ) ) otherlv_5= 'Salary' ( (lv_salary_6_0= RULE_INT ) ) otherlv_7= 'Current Role' ( (lv_currentRole_8_0= ruleEmployeeRole ) ) otherlv_9= '}' )
            {
            // InternalBankSystem.g:532:2: (otherlv_0= 'Employee' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Hiring date' ( (lv_date_4_0= ruleDate ) ) otherlv_5= 'Salary' ( (lv_salary_6_0= RULE_INT ) ) otherlv_7= 'Current Role' ( (lv_currentRole_8_0= ruleEmployeeRole ) ) otherlv_9= '}' )
            // InternalBankSystem.g:533:3: otherlv_0= 'Employee' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Hiring date' ( (lv_date_4_0= ruleDate ) ) otherlv_5= 'Salary' ( (lv_salary_6_0= RULE_INT ) ) otherlv_7= 'Current Role' ( (lv_currentRole_8_0= ruleEmployeeRole ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEmployeeAccess().getEmployeeKeyword_0());
            		
            // InternalBankSystem.g:537:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBankSystem.g:538:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBankSystem.g:538:4: (lv_name_1_0= RULE_ID )
            // InternalBankSystem.g:539:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEmployeeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmployeeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getEmployeeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getEmployeeAccess().getHiringDateKeyword_3());
            		
            // InternalBankSystem.g:563:3: ( (lv_date_4_0= ruleDate ) )
            // InternalBankSystem.g:564:4: (lv_date_4_0= ruleDate )
            {
            // InternalBankSystem.g:564:4: (lv_date_4_0= ruleDate )
            // InternalBankSystem.g:565:5: lv_date_4_0= ruleDate
            {

            					newCompositeNode(grammarAccess.getEmployeeAccess().getDateDateParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
            lv_date_4_0=ruleDate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEmployeeRule());
            					}
            					set(
            						current,
            						"date",
            						lv_date_4_0,
            						"org.xtext.BankSystem.Date");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getEmployeeAccess().getSalaryKeyword_5());
            		
            // InternalBankSystem.g:586:3: ( (lv_salary_6_0= RULE_INT ) )
            // InternalBankSystem.g:587:4: (lv_salary_6_0= RULE_INT )
            {
            // InternalBankSystem.g:587:4: (lv_salary_6_0= RULE_INT )
            // InternalBankSystem.g:588:5: lv_salary_6_0= RULE_INT
            {
            lv_salary_6_0=(Token)match(input,RULE_INT,FOLLOW_23); 

            					newLeafNode(lv_salary_6_0, grammarAccess.getEmployeeAccess().getSalaryINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmployeeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"salary",
            						lv_salary_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,26,FOLLOW_24); 

            			newLeafNode(otherlv_7, grammarAccess.getEmployeeAccess().getCurrentRoleKeyword_7());
            		
            // InternalBankSystem.g:608:3: ( (lv_currentRole_8_0= ruleEmployeeRole ) )
            // InternalBankSystem.g:609:4: (lv_currentRole_8_0= ruleEmployeeRole )
            {
            // InternalBankSystem.g:609:4: (lv_currentRole_8_0= ruleEmployeeRole )
            // InternalBankSystem.g:610:5: lv_currentRole_8_0= ruleEmployeeRole
            {

            					newCompositeNode(grammarAccess.getEmployeeAccess().getCurrentRoleEmployeeRoleParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_17);
            lv_currentRole_8_0=ruleEmployeeRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEmployeeRule());
            					}
            					set(
            						current,
            						"currentRole",
            						lv_currentRole_8_0,
            						"org.xtext.BankSystem.EmployeeRole");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getEmployeeAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalBankSystem.g:635:1: entryRuleEmployeeRole returns [String current=null] : iv_ruleEmployeeRole= ruleEmployeeRole EOF ;
    public final String entryRuleEmployeeRole() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEmployeeRole = null;


        try {
            // InternalBankSystem.g:635:52: (iv_ruleEmployeeRole= ruleEmployeeRole EOF )
            // InternalBankSystem.g:636:2: iv_ruleEmployeeRole= ruleEmployeeRole EOF
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
    // InternalBankSystem.g:642:1: ruleEmployeeRole returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Teller_0= ruleTeller | this_Manager_1= ruleManager ) ;
    public final AntlrDatatypeRuleToken ruleEmployeeRole() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Teller_0 = null;

        AntlrDatatypeRuleToken this_Manager_1 = null;



        	enterRule();

        try {
            // InternalBankSystem.g:648:2: ( (this_Teller_0= ruleTeller | this_Manager_1= ruleManager ) )
            // InternalBankSystem.g:649:2: (this_Teller_0= ruleTeller | this_Manager_1= ruleManager )
            {
            // InternalBankSystem.g:649:2: (this_Teller_0= ruleTeller | this_Manager_1= ruleManager )
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
                    // InternalBankSystem.g:650:3: this_Teller_0= ruleTeller
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
                    // InternalBankSystem.g:661:3: this_Manager_1= ruleManager
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
    // InternalBankSystem.g:675:1: entryRuleTeller returns [String current=null] : iv_ruleTeller= ruleTeller EOF ;
    public final String entryRuleTeller() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTeller = null;


        try {
            // InternalBankSystem.g:675:46: (iv_ruleTeller= ruleTeller EOF )
            // InternalBankSystem.g:676:2: iv_ruleTeller= ruleTeller EOF
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
    // InternalBankSystem.g:682:1: ruleTeller returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Teller' ;
    public final AntlrDatatypeRuleToken ruleTeller() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBankSystem.g:688:2: (kw= 'Teller' )
            // InternalBankSystem.g:689:2: kw= 'Teller'
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
    // InternalBankSystem.g:697:1: entryRuleManager returns [String current=null] : iv_ruleManager= ruleManager EOF ;
    public final String entryRuleManager() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleManager = null;


        try {
            // InternalBankSystem.g:697:47: (iv_ruleManager= ruleManager EOF )
            // InternalBankSystem.g:698:2: iv_ruleManager= ruleManager EOF
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
    // InternalBankSystem.g:704:1: ruleManager returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Manager' ;
    public final AntlrDatatypeRuleToken ruleManager() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBankSystem.g:710:2: (kw= 'Manager' )
            // InternalBankSystem.g:711:2: kw= 'Manager'
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
    // InternalBankSystem.g:719:1: entryRuleAccount returns [EObject current=null] : iv_ruleAccount= ruleAccount EOF ;
    public final EObject entryRuleAccount() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccount = null;


        try {
            // InternalBankSystem.g:719:48: (iv_ruleAccount= ruleAccount EOF )
            // InternalBankSystem.g:720:2: iv_ruleAccount= ruleAccount EOF
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
    // InternalBankSystem.g:726:1: ruleAccount returns [EObject current=null] : (otherlv_0= 'account' ( (lv_accountNum_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Holder(s)' ( (lv_holder_4_0= RULE_ID ) ) otherlv_5= 'Balance' ( (lv_balance_6_0= RULE_INT ) ) otherlv_7= 'Account Number' otherlv_8= 'MFA Type' ( (lv_mfaType_9_0= RULE_STRING ) ) otherlv_10= 'Type' ( (lv_accountType_11_0= ruleAccountType ) ) (otherlv_12= 'Interest rate' ( (lv_intRate_13_0= RULE_INT ) ) )? (otherlv_14= 'Debits per month' ( (lv_depPerMonth_15_0= RULE_INT ) ) )? (otherlv_16= 'Loan period' ( (lv_loanPeriod_17_0= RULE_STRING ) ) )? otherlv_18= '}' ) ;
    public final EObject ruleAccount() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_accountNum_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_holder_4_0=null;
        Token otherlv_5=null;
        Token lv_balance_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_mfaType_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token lv_intRate_13_0=null;
        Token otherlv_14=null;
        Token lv_depPerMonth_15_0=null;
        Token otherlv_16=null;
        Token lv_loanPeriod_17_0=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_accountType_11_0 = null;



        	enterRule();

        try {
            // InternalBankSystem.g:732:2: ( (otherlv_0= 'account' ( (lv_accountNum_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Holder(s)' ( (lv_holder_4_0= RULE_ID ) ) otherlv_5= 'Balance' ( (lv_balance_6_0= RULE_INT ) ) otherlv_7= 'Account Number' otherlv_8= 'MFA Type' ( (lv_mfaType_9_0= RULE_STRING ) ) otherlv_10= 'Type' ( (lv_accountType_11_0= ruleAccountType ) ) (otherlv_12= 'Interest rate' ( (lv_intRate_13_0= RULE_INT ) ) )? (otherlv_14= 'Debits per month' ( (lv_depPerMonth_15_0= RULE_INT ) ) )? (otherlv_16= 'Loan period' ( (lv_loanPeriod_17_0= RULE_STRING ) ) )? otherlv_18= '}' ) )
            // InternalBankSystem.g:733:2: (otherlv_0= 'account' ( (lv_accountNum_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Holder(s)' ( (lv_holder_4_0= RULE_ID ) ) otherlv_5= 'Balance' ( (lv_balance_6_0= RULE_INT ) ) otherlv_7= 'Account Number' otherlv_8= 'MFA Type' ( (lv_mfaType_9_0= RULE_STRING ) ) otherlv_10= 'Type' ( (lv_accountType_11_0= ruleAccountType ) ) (otherlv_12= 'Interest rate' ( (lv_intRate_13_0= RULE_INT ) ) )? (otherlv_14= 'Debits per month' ( (lv_depPerMonth_15_0= RULE_INT ) ) )? (otherlv_16= 'Loan period' ( (lv_loanPeriod_17_0= RULE_STRING ) ) )? otherlv_18= '}' )
            {
            // InternalBankSystem.g:733:2: (otherlv_0= 'account' ( (lv_accountNum_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Holder(s)' ( (lv_holder_4_0= RULE_ID ) ) otherlv_5= 'Balance' ( (lv_balance_6_0= RULE_INT ) ) otherlv_7= 'Account Number' otherlv_8= 'MFA Type' ( (lv_mfaType_9_0= RULE_STRING ) ) otherlv_10= 'Type' ( (lv_accountType_11_0= ruleAccountType ) ) (otherlv_12= 'Interest rate' ( (lv_intRate_13_0= RULE_INT ) ) )? (otherlv_14= 'Debits per month' ( (lv_depPerMonth_15_0= RULE_INT ) ) )? (otherlv_16= 'Loan period' ( (lv_loanPeriod_17_0= RULE_STRING ) ) )? otherlv_18= '}' )
            // InternalBankSystem.g:734:3: otherlv_0= 'account' ( (lv_accountNum_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Holder(s)' ( (lv_holder_4_0= RULE_ID ) ) otherlv_5= 'Balance' ( (lv_balance_6_0= RULE_INT ) ) otherlv_7= 'Account Number' otherlv_8= 'MFA Type' ( (lv_mfaType_9_0= RULE_STRING ) ) otherlv_10= 'Type' ( (lv_accountType_11_0= ruleAccountType ) ) (otherlv_12= 'Interest rate' ( (lv_intRate_13_0= RULE_INT ) ) )? (otherlv_14= 'Debits per month' ( (lv_depPerMonth_15_0= RULE_INT ) ) )? (otherlv_16= 'Loan period' ( (lv_loanPeriod_17_0= RULE_STRING ) ) )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAccountAccess().getAccountKeyword_0());
            		
            // InternalBankSystem.g:738:3: ( (lv_accountNum_1_0= RULE_ID ) )
            // InternalBankSystem.g:739:4: (lv_accountNum_1_0= RULE_ID )
            {
            // InternalBankSystem.g:739:4: (lv_accountNum_1_0= RULE_ID )
            // InternalBankSystem.g:740:5: lv_accountNum_1_0= RULE_ID
            {
            lv_accountNum_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_accountNum_1_0, grammarAccess.getAccountAccess().getAccountNumIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAccountRule());
            					}
            					setWithLastConsumed(
            						current,
            						"accountNum",
            						lv_accountNum_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getAccountAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getAccountAccess().getHolderSKeyword_3());
            		
            // InternalBankSystem.g:764:3: ( (lv_holder_4_0= RULE_ID ) )
            // InternalBankSystem.g:765:4: (lv_holder_4_0= RULE_ID )
            {
            // InternalBankSystem.g:765:4: (lv_holder_4_0= RULE_ID )
            // InternalBankSystem.g:766:5: lv_holder_4_0= RULE_ID
            {
            lv_holder_4_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_holder_4_0, grammarAccess.getAccountAccess().getHolderIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAccountRule());
            					}
            					setWithLastConsumed(
            						current,
            						"holder",
            						lv_holder_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getAccountAccess().getBalanceKeyword_5());
            		
            // InternalBankSystem.g:786:3: ( (lv_balance_6_0= RULE_INT ) )
            // InternalBankSystem.g:787:4: (lv_balance_6_0= RULE_INT )
            {
            // InternalBankSystem.g:787:4: (lv_balance_6_0= RULE_INT )
            // InternalBankSystem.g:788:5: lv_balance_6_0= RULE_INT
            {
            lv_balance_6_0=(Token)match(input,RULE_INT,FOLLOW_27); 

            					newLeafNode(lv_balance_6_0, grammarAccess.getAccountAccess().getBalanceINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAccountRule());
            					}
            					setWithLastConsumed(
            						current,
            						"balance",
            						lv_balance_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,32,FOLLOW_28); 

            			newLeafNode(otherlv_7, grammarAccess.getAccountAccess().getAccountNumberKeyword_7());
            		
            otherlv_8=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getAccountAccess().getMFATypeKeyword_8());
            		
            // InternalBankSystem.g:812:3: ( (lv_mfaType_9_0= RULE_STRING ) )
            // InternalBankSystem.g:813:4: (lv_mfaType_9_0= RULE_STRING )
            {
            // InternalBankSystem.g:813:4: (lv_mfaType_9_0= RULE_STRING )
            // InternalBankSystem.g:814:5: lv_mfaType_9_0= RULE_STRING
            {
            lv_mfaType_9_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

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

            otherlv_10=(Token)match(input,34,FOLLOW_30); 

            			newLeafNode(otherlv_10, grammarAccess.getAccountAccess().getTypeKeyword_10());
            		
            // InternalBankSystem.g:834:3: ( (lv_accountType_11_0= ruleAccountType ) )
            // InternalBankSystem.g:835:4: (lv_accountType_11_0= ruleAccountType )
            {
            // InternalBankSystem.g:835:4: (lv_accountType_11_0= ruleAccountType )
            // InternalBankSystem.g:836:5: lv_accountType_11_0= ruleAccountType
            {

            					newCompositeNode(grammarAccess.getAccountAccess().getAccountTypeAccountTypeParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_31);
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

            // InternalBankSystem.g:853:3: (otherlv_12= 'Interest rate' ( (lv_intRate_13_0= RULE_INT ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==35) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBankSystem.g:854:4: otherlv_12= 'Interest rate' ( (lv_intRate_13_0= RULE_INT ) )
                    {
                    otherlv_12=(Token)match(input,35,FOLLOW_21); 

                    				newLeafNode(otherlv_12, grammarAccess.getAccountAccess().getInterestRateKeyword_12_0());
                    			
                    // InternalBankSystem.g:858:4: ( (lv_intRate_13_0= RULE_INT ) )
                    // InternalBankSystem.g:859:5: (lv_intRate_13_0= RULE_INT )
                    {
                    // InternalBankSystem.g:859:5: (lv_intRate_13_0= RULE_INT )
                    // InternalBankSystem.g:860:6: lv_intRate_13_0= RULE_INT
                    {
                    lv_intRate_13_0=(Token)match(input,RULE_INT,FOLLOW_32); 

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

            // InternalBankSystem.g:877:3: (otherlv_14= 'Debits per month' ( (lv_depPerMonth_15_0= RULE_INT ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==36) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBankSystem.g:878:4: otherlv_14= 'Debits per month' ( (lv_depPerMonth_15_0= RULE_INT ) )
                    {
                    otherlv_14=(Token)match(input,36,FOLLOW_21); 

                    				newLeafNode(otherlv_14, grammarAccess.getAccountAccess().getDebitsPerMonthKeyword_13_0());
                    			
                    // InternalBankSystem.g:882:4: ( (lv_depPerMonth_15_0= RULE_INT ) )
                    // InternalBankSystem.g:883:5: (lv_depPerMonth_15_0= RULE_INT )
                    {
                    // InternalBankSystem.g:883:5: (lv_depPerMonth_15_0= RULE_INT )
                    // InternalBankSystem.g:884:6: lv_depPerMonth_15_0= RULE_INT
                    {
                    lv_depPerMonth_15_0=(Token)match(input,RULE_INT,FOLLOW_33); 

                    						newLeafNode(lv_depPerMonth_15_0, grammarAccess.getAccountAccess().getDepPerMonthINTTerminalRuleCall_13_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAccountRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"depPerMonth",
                    							lv_depPerMonth_15_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBankSystem.g:901:3: (otherlv_16= 'Loan period' ( (lv_loanPeriod_17_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==37) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBankSystem.g:902:4: otherlv_16= 'Loan period' ( (lv_loanPeriod_17_0= RULE_STRING ) )
                    {
                    otherlv_16=(Token)match(input,37,FOLLOW_8); 

                    				newLeafNode(otherlv_16, grammarAccess.getAccountAccess().getLoanPeriodKeyword_14_0());
                    			
                    // InternalBankSystem.g:906:4: ( (lv_loanPeriod_17_0= RULE_STRING ) )
                    // InternalBankSystem.g:907:5: (lv_loanPeriod_17_0= RULE_STRING )
                    {
                    // InternalBankSystem.g:907:5: (lv_loanPeriod_17_0= RULE_STRING )
                    // InternalBankSystem.g:908:6: lv_loanPeriod_17_0= RULE_STRING
                    {
                    lv_loanPeriod_17_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

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

            otherlv_18=(Token)match(input,14,FOLLOW_2); 

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
    // InternalBankSystem.g:933:1: entryRuleAccountType returns [String current=null] : iv_ruleAccountType= ruleAccountType EOF ;
    public final String entryRuleAccountType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAccountType = null;


        try {
            // InternalBankSystem.g:933:51: (iv_ruleAccountType= ruleAccountType EOF )
            // InternalBankSystem.g:934:2: iv_ruleAccountType= ruleAccountType EOF
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
    // InternalBankSystem.g:940:1: ruleAccountType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SavingsAccount_0= ruleSavingsAccount | this_CheckingAccount_1= ruleCheckingAccount | this_MortgageAccount_2= ruleMortgageAccount ) ;
    public final AntlrDatatypeRuleToken ruleAccountType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SavingsAccount_0 = null;

        AntlrDatatypeRuleToken this_CheckingAccount_1 = null;

        AntlrDatatypeRuleToken this_MortgageAccount_2 = null;



        	enterRule();

        try {
            // InternalBankSystem.g:946:2: ( (this_SavingsAccount_0= ruleSavingsAccount | this_CheckingAccount_1= ruleCheckingAccount | this_MortgageAccount_2= ruleMortgageAccount ) )
            // InternalBankSystem.g:947:2: (this_SavingsAccount_0= ruleSavingsAccount | this_CheckingAccount_1= ruleCheckingAccount | this_MortgageAccount_2= ruleMortgageAccount )
            {
            // InternalBankSystem.g:947:2: (this_SavingsAccount_0= ruleSavingsAccount | this_CheckingAccount_1= ruleCheckingAccount | this_MortgageAccount_2= ruleMortgageAccount )
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
                    // InternalBankSystem.g:948:3: this_SavingsAccount_0= ruleSavingsAccount
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
                    // InternalBankSystem.g:959:3: this_CheckingAccount_1= ruleCheckingAccount
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
                    // InternalBankSystem.g:970:3: this_MortgageAccount_2= ruleMortgageAccount
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
    // InternalBankSystem.g:984:1: entryRuleSavingsAccount returns [String current=null] : iv_ruleSavingsAccount= ruleSavingsAccount EOF ;
    public final String entryRuleSavingsAccount() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSavingsAccount = null;


        try {
            // InternalBankSystem.g:984:54: (iv_ruleSavingsAccount= ruleSavingsAccount EOF )
            // InternalBankSystem.g:985:2: iv_ruleSavingsAccount= ruleSavingsAccount EOF
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
    // InternalBankSystem.g:991:1: ruleSavingsAccount returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Savings Account' ;
    public final AntlrDatatypeRuleToken ruleSavingsAccount() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBankSystem.g:997:2: (kw= 'Savings Account' )
            // InternalBankSystem.g:998:2: kw= 'Savings Account'
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
    // InternalBankSystem.g:1006:1: entryRuleCheckingAccount returns [String current=null] : iv_ruleCheckingAccount= ruleCheckingAccount EOF ;
    public final String entryRuleCheckingAccount() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCheckingAccount = null;


        try {
            // InternalBankSystem.g:1006:55: (iv_ruleCheckingAccount= ruleCheckingAccount EOF )
            // InternalBankSystem.g:1007:2: iv_ruleCheckingAccount= ruleCheckingAccount EOF
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
    // InternalBankSystem.g:1013:1: ruleCheckingAccount returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Checking Account' ;
    public final AntlrDatatypeRuleToken ruleCheckingAccount() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBankSystem.g:1019:2: (kw= 'Checking Account' )
            // InternalBankSystem.g:1020:2: kw= 'Checking Account'
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
    // InternalBankSystem.g:1028:1: entryRuleMortgageAccount returns [String current=null] : iv_ruleMortgageAccount= ruleMortgageAccount EOF ;
    public final String entryRuleMortgageAccount() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMortgageAccount = null;


        try {
            // InternalBankSystem.g:1028:55: (iv_ruleMortgageAccount= ruleMortgageAccount EOF )
            // InternalBankSystem.g:1029:2: iv_ruleMortgageAccount= ruleMortgageAccount EOF
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
    // InternalBankSystem.g:1035:1: ruleMortgageAccount returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Mortgage Account' ;
    public final AntlrDatatypeRuleToken ruleMortgageAccount() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBankSystem.g:1041:2: (kw= 'Mortgage Account' )
            // InternalBankSystem.g:1042:2: kw= 'Mortgage Account'
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
    // InternalBankSystem.g:1050:1: entryRuleTransaction returns [EObject current=null] : iv_ruleTransaction= ruleTransaction EOF ;
    public final EObject entryRuleTransaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransaction = null;


        try {
            // InternalBankSystem.g:1050:52: (iv_ruleTransaction= ruleTransaction EOF )
            // InternalBankSystem.g:1051:2: iv_ruleTransaction= ruleTransaction EOF
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
    // InternalBankSystem.g:1057:1: ruleTransaction returns [EObject current=null] : (otherlv_0= 'transaction {' otherlv_1= 'Account:' ( (lv_account_2_0= RULE_ID ) ) otherlv_3= 'Amount:' ( (lv_amount_4_0= RULE_INT ) ) otherlv_5= 'Date' ( (lv_date_6_0= ruleDate ) ) otherlv_7= 'Debit' ( (lv_debit_8_0= ruleBoolean ) ) otherlv_9= 'Vendor name' ( (lv_vendorName_10_0= RULE_STRING ) ) otherlv_11= '}' ) ;
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
            // InternalBankSystem.g:1063:2: ( (otherlv_0= 'transaction {' otherlv_1= 'Account:' ( (lv_account_2_0= RULE_ID ) ) otherlv_3= 'Amount:' ( (lv_amount_4_0= RULE_INT ) ) otherlv_5= 'Date' ( (lv_date_6_0= ruleDate ) ) otherlv_7= 'Debit' ( (lv_debit_8_0= ruleBoolean ) ) otherlv_9= 'Vendor name' ( (lv_vendorName_10_0= RULE_STRING ) ) otherlv_11= '}' ) )
            // InternalBankSystem.g:1064:2: (otherlv_0= 'transaction {' otherlv_1= 'Account:' ( (lv_account_2_0= RULE_ID ) ) otherlv_3= 'Amount:' ( (lv_amount_4_0= RULE_INT ) ) otherlv_5= 'Date' ( (lv_date_6_0= ruleDate ) ) otherlv_7= 'Debit' ( (lv_debit_8_0= ruleBoolean ) ) otherlv_9= 'Vendor name' ( (lv_vendorName_10_0= RULE_STRING ) ) otherlv_11= '}' )
            {
            // InternalBankSystem.g:1064:2: (otherlv_0= 'transaction {' otherlv_1= 'Account:' ( (lv_account_2_0= RULE_ID ) ) otherlv_3= 'Amount:' ( (lv_amount_4_0= RULE_INT ) ) otherlv_5= 'Date' ( (lv_date_6_0= ruleDate ) ) otherlv_7= 'Debit' ( (lv_debit_8_0= ruleBoolean ) ) otherlv_9= 'Vendor name' ( (lv_vendorName_10_0= RULE_STRING ) ) otherlv_11= '}' )
            // InternalBankSystem.g:1065:3: otherlv_0= 'transaction {' otherlv_1= 'Account:' ( (lv_account_2_0= RULE_ID ) ) otherlv_3= 'Amount:' ( (lv_amount_4_0= RULE_INT ) ) otherlv_5= 'Date' ( (lv_date_6_0= ruleDate ) ) otherlv_7= 'Debit' ( (lv_debit_8_0= ruleBoolean ) ) otherlv_9= 'Vendor name' ( (lv_vendorName_10_0= RULE_STRING ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getTransactionAccess().getTransactionKeyword_0());
            		
            otherlv_1=(Token)match(input,42,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTransactionAccess().getAccountKeyword_1());
            		
            // InternalBankSystem.g:1073:3: ( (lv_account_2_0= RULE_ID ) )
            // InternalBankSystem.g:1074:4: (lv_account_2_0= RULE_ID )
            {
            // InternalBankSystem.g:1074:4: (lv_account_2_0= RULE_ID )
            // InternalBankSystem.g:1075:5: lv_account_2_0= RULE_ID
            {
            lv_account_2_0=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(lv_account_2_0, grammarAccess.getTransactionAccess().getAccountIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransactionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"account",
            						lv_account_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,43,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getTransactionAccess().getAmountKeyword_3());
            		
            // InternalBankSystem.g:1095:3: ( (lv_amount_4_0= RULE_INT ) )
            // InternalBankSystem.g:1096:4: (lv_amount_4_0= RULE_INT )
            {
            // InternalBankSystem.g:1096:4: (lv_amount_4_0= RULE_INT )
            // InternalBankSystem.g:1097:5: lv_amount_4_0= RULE_INT
            {
            lv_amount_4_0=(Token)match(input,RULE_INT,FOLLOW_36); 

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

            otherlv_5=(Token)match(input,44,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getTransactionAccess().getDateKeyword_5());
            		
            // InternalBankSystem.g:1117:3: ( (lv_date_6_0= ruleDate ) )
            // InternalBankSystem.g:1118:4: (lv_date_6_0= ruleDate )
            {
            // InternalBankSystem.g:1118:4: (lv_date_6_0= ruleDate )
            // InternalBankSystem.g:1119:5: lv_date_6_0= ruleDate
            {

            					newCompositeNode(grammarAccess.getTransactionAccess().getDateDateParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_37);
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

            otherlv_7=(Token)match(input,45,FOLLOW_38); 

            			newLeafNode(otherlv_7, grammarAccess.getTransactionAccess().getDebitKeyword_7());
            		
            // InternalBankSystem.g:1140:3: ( (lv_debit_8_0= ruleBoolean ) )
            // InternalBankSystem.g:1141:4: (lv_debit_8_0= ruleBoolean )
            {
            // InternalBankSystem.g:1141:4: (lv_debit_8_0= ruleBoolean )
            // InternalBankSystem.g:1142:5: lv_debit_8_0= ruleBoolean
            {

            					newCompositeNode(grammarAccess.getTransactionAccess().getDebitBooleanParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_39);
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

            otherlv_9=(Token)match(input,46,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getTransactionAccess().getVendorNameKeyword_9());
            		
            // InternalBankSystem.g:1163:3: ( (lv_vendorName_10_0= RULE_STRING ) )
            // InternalBankSystem.g:1164:4: (lv_vendorName_10_0= RULE_STRING )
            {
            // InternalBankSystem.g:1164:4: (lv_vendorName_10_0= RULE_STRING )
            // InternalBankSystem.g:1165:5: lv_vendorName_10_0= RULE_STRING
            {
            lv_vendorName_10_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

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

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

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
    // InternalBankSystem.g:1189:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // InternalBankSystem.g:1189:47: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalBankSystem.g:1190:2: iv_ruleBoolean= ruleBoolean EOF
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
    // InternalBankSystem.g:1196:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBankSystem.g:1202:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalBankSystem.g:1203:2: (kw= 'true' | kw= 'false' )
            {
            // InternalBankSystem.g:1203:2: (kw= 'true' | kw= 'false' )
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
                    // InternalBankSystem.g:1204:3: kw= 'true'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBankSystem.g:1210:3: kw= 'false'
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
    // InternalBankSystem.g:1219:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // InternalBankSystem.g:1219:45: (iv_ruleDate= ruleDate EOF )
            // InternalBankSystem.g:1220:2: iv_ruleDate= ruleDate EOF
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
    // InternalBankSystem.g:1226:1: ruleDate returns [EObject current=null] : ( ( (lv_year_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_month_2_0= RULE_INT ) ) otherlv_3= '/' ( (lv_day_4_0= RULE_INT ) ) ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token lv_year_0_0=null;
        Token otherlv_1=null;
        Token lv_month_2_0=null;
        Token otherlv_3=null;
        Token lv_day_4_0=null;


        	enterRule();

        try {
            // InternalBankSystem.g:1232:2: ( ( ( (lv_year_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_month_2_0= RULE_INT ) ) otherlv_3= '/' ( (lv_day_4_0= RULE_INT ) ) ) )
            // InternalBankSystem.g:1233:2: ( ( (lv_year_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_month_2_0= RULE_INT ) ) otherlv_3= '/' ( (lv_day_4_0= RULE_INT ) ) )
            {
            // InternalBankSystem.g:1233:2: ( ( (lv_year_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_month_2_0= RULE_INT ) ) otherlv_3= '/' ( (lv_day_4_0= RULE_INT ) ) )
            // InternalBankSystem.g:1234:3: ( (lv_year_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_month_2_0= RULE_INT ) ) otherlv_3= '/' ( (lv_day_4_0= RULE_INT ) )
            {
            // InternalBankSystem.g:1234:3: ( (lv_year_0_0= RULE_INT ) )
            // InternalBankSystem.g:1235:4: (lv_year_0_0= RULE_INT )
            {
            // InternalBankSystem.g:1235:4: (lv_year_0_0= RULE_INT )
            // InternalBankSystem.g:1236:5: lv_year_0_0= RULE_INT
            {
            lv_year_0_0=(Token)match(input,RULE_INT,FOLLOW_40); 

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

            otherlv_1=(Token)match(input,49,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getDateAccess().getSolidusKeyword_1());
            		
            // InternalBankSystem.g:1256:3: ( (lv_month_2_0= RULE_INT ) )
            // InternalBankSystem.g:1257:4: (lv_month_2_0= RULE_INT )
            {
            // InternalBankSystem.g:1257:4: (lv_month_2_0= RULE_INT )
            // InternalBankSystem.g:1258:5: lv_month_2_0= RULE_INT
            {
            lv_month_2_0=(Token)match(input,RULE_INT,FOLLOW_40); 

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

            otherlv_3=(Token)match(input,49,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getDateAccess().getSolidusKeyword_3());
            		
            // InternalBankSystem.g:1278:3: ( (lv_day_4_0= RULE_INT ) )
            // InternalBankSystem.g:1279:4: (lv_day_4_0= RULE_INT )
            {
            // InternalBankSystem.g:1279:4: (lv_day_4_0= RULE_INT )
            // InternalBankSystem.g:1280:5: lv_day_4_0= RULE_INT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000020020104000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000020020004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000020000004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000E04000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000003800004000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000003000004000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000004000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0002000000000000L});

}