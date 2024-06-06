package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_UPPERCASE_WORD", "RULE_LOWERCASE_WORD", "RULE_UPERCASE_LETTER", "RULE_LOWERCASE_LETTER", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'Um'", "', m\\u00F6chte ich als'", "'.'"
    };
    public static final int RULE_LOWERCASE_WORD=5;
    public static final int RULE_ID=8;
    public static final int RULE_WS=13;
    public static final int RULE_STRING=10;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_LOWERCASE_LETTER=7;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_UPERCASE_LETTER=6;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_UPPERCASE_WORD=4;
    public static final int T__17=17;
    public static final int RULE_INT=9;
    public static final int T__18=18;
    public static final int RULE_ML_COMMENT=11;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_user_story_0_0= ruleUser_Story ) )+ ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_user_story_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_user_story_0_0= ruleUser_Story ) )+ )
            // InternalMyDsl.g:78:2: ( (lv_user_story_0_0= ruleUser_Story ) )+
            {
            // InternalMyDsl.g:78:2: ( (lv_user_story_0_0= ruleUser_Story ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_UPPERCASE_WORD) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_user_story_0_0= ruleUser_Story )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_user_story_0_0= ruleUser_Story )
            	    // InternalMyDsl.g:80:4: lv_user_story_0_0= ruleUser_Story
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getUser_storyUser_StoryParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_user_story_0_0=ruleUser_Story();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"user_story",
            	    					lv_user_story_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.User_Story");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleUser_Story"
    // InternalMyDsl.g:100:1: entryRuleUser_Story returns [EObject current=null] : iv_ruleUser_Story= ruleUser_Story EOF ;
    public final EObject entryRuleUser_Story() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser_Story = null;


        try {
            // InternalMyDsl.g:100:51: (iv_ruleUser_Story= ruleUser_Story EOF )
            // InternalMyDsl.g:101:2: iv_ruleUser_Story= ruleUser_Story EOF
            {
             newCompositeNode(grammarAccess.getUser_StoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUser_Story=ruleUser_Story();

            state._fsp--;

             current =iv_ruleUser_Story; 
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
    // $ANTLR end "entryRuleUser_Story"


    // $ANTLR start "ruleUser_Story"
    // InternalMyDsl.g:107:1: ruleUser_Story returns [EObject current=null] : ( ( (lv_title_0_0= ruleTitle ) ) otherlv_1= ':' otherlv_2= 'Um' ( (lv_nutzen_3_0= ruleNutzen ) ) otherlv_4= ', m\\u00F6chte ich als' ( (lv_rolle_5_0= ruleRolle ) ) ( (lv_ziel_wunsch_6_0= ruleZiel_Wunsch ) ) otherlv_7= '.' ) ;
    public final EObject ruleUser_Story() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_title_0_0 = null;

        EObject lv_nutzen_3_0 = null;

        EObject lv_rolle_5_0 = null;

        EObject lv_ziel_wunsch_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( ( ( (lv_title_0_0= ruleTitle ) ) otherlv_1= ':' otherlv_2= 'Um' ( (lv_nutzen_3_0= ruleNutzen ) ) otherlv_4= ', m\\u00F6chte ich als' ( (lv_rolle_5_0= ruleRolle ) ) ( (lv_ziel_wunsch_6_0= ruleZiel_Wunsch ) ) otherlv_7= '.' ) )
            // InternalMyDsl.g:114:2: ( ( (lv_title_0_0= ruleTitle ) ) otherlv_1= ':' otherlv_2= 'Um' ( (lv_nutzen_3_0= ruleNutzen ) ) otherlv_4= ', m\\u00F6chte ich als' ( (lv_rolle_5_0= ruleRolle ) ) ( (lv_ziel_wunsch_6_0= ruleZiel_Wunsch ) ) otherlv_7= '.' )
            {
            // InternalMyDsl.g:114:2: ( ( (lv_title_0_0= ruleTitle ) ) otherlv_1= ':' otherlv_2= 'Um' ( (lv_nutzen_3_0= ruleNutzen ) ) otherlv_4= ', m\\u00F6chte ich als' ( (lv_rolle_5_0= ruleRolle ) ) ( (lv_ziel_wunsch_6_0= ruleZiel_Wunsch ) ) otherlv_7= '.' )
            // InternalMyDsl.g:115:3: ( (lv_title_0_0= ruleTitle ) ) otherlv_1= ':' otherlv_2= 'Um' ( (lv_nutzen_3_0= ruleNutzen ) ) otherlv_4= ', m\\u00F6chte ich als' ( (lv_rolle_5_0= ruleRolle ) ) ( (lv_ziel_wunsch_6_0= ruleZiel_Wunsch ) ) otherlv_7= '.'
            {
            // InternalMyDsl.g:115:3: ( (lv_title_0_0= ruleTitle ) )
            // InternalMyDsl.g:116:4: (lv_title_0_0= ruleTitle )
            {
            // InternalMyDsl.g:116:4: (lv_title_0_0= ruleTitle )
            // InternalMyDsl.g:117:5: lv_title_0_0= ruleTitle
            {

            					newCompositeNode(grammarAccess.getUser_StoryAccess().getTitleTitleParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_title_0_0=ruleTitle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUser_StoryRule());
            					}
            					set(
            						current,
            						"title",
            						lv_title_0_0,
            						"org.xtext.example.mydsl.MyDsl.Title");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getUser_StoryAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getUser_StoryAccess().getUmKeyword_2());
            		
            // InternalMyDsl.g:142:3: ( (lv_nutzen_3_0= ruleNutzen ) )
            // InternalMyDsl.g:143:4: (lv_nutzen_3_0= ruleNutzen )
            {
            // InternalMyDsl.g:143:4: (lv_nutzen_3_0= ruleNutzen )
            // InternalMyDsl.g:144:5: lv_nutzen_3_0= ruleNutzen
            {

            					newCompositeNode(grammarAccess.getUser_StoryAccess().getNutzenNutzenParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_nutzen_3_0=ruleNutzen();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUser_StoryRule());
            					}
            					set(
            						current,
            						"nutzen",
            						lv_nutzen_3_0,
            						"org.xtext.example.mydsl.MyDsl.Nutzen");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getUser_StoryAccess().getMöchteIchAlsKeyword_4());
            		
            // InternalMyDsl.g:165:3: ( (lv_rolle_5_0= ruleRolle ) )
            // InternalMyDsl.g:166:4: (lv_rolle_5_0= ruleRolle )
            {
            // InternalMyDsl.g:166:4: (lv_rolle_5_0= ruleRolle )
            // InternalMyDsl.g:167:5: lv_rolle_5_0= ruleRolle
            {

            					newCompositeNode(grammarAccess.getUser_StoryAccess().getRolleRolleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_rolle_5_0=ruleRolle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUser_StoryRule());
            					}
            					set(
            						current,
            						"rolle",
            						lv_rolle_5_0,
            						"org.xtext.example.mydsl.MyDsl.Rolle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:184:3: ( (lv_ziel_wunsch_6_0= ruleZiel_Wunsch ) )
            // InternalMyDsl.g:185:4: (lv_ziel_wunsch_6_0= ruleZiel_Wunsch )
            {
            // InternalMyDsl.g:185:4: (lv_ziel_wunsch_6_0= ruleZiel_Wunsch )
            // InternalMyDsl.g:186:5: lv_ziel_wunsch_6_0= ruleZiel_Wunsch
            {

            					newCompositeNode(grammarAccess.getUser_StoryAccess().getZiel_wunschZiel_WunschParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_ziel_wunsch_6_0=ruleZiel_Wunsch();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUser_StoryRule());
            					}
            					set(
            						current,
            						"ziel_wunsch",
            						lv_ziel_wunsch_6_0,
            						"org.xtext.example.mydsl.MyDsl.Ziel_Wunsch");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getUser_StoryAccess().getFullStopKeyword_7());
            		

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
    // $ANTLR end "ruleUser_Story"


    // $ANTLR start "entryRuleTitle"
    // InternalMyDsl.g:211:1: entryRuleTitle returns [EObject current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final EObject entryRuleTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitle = null;


        try {
            // InternalMyDsl.g:211:46: (iv_ruleTitle= ruleTitle EOF )
            // InternalMyDsl.g:212:2: iv_ruleTitle= ruleTitle EOF
            {
             newCompositeNode(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTitle=ruleTitle();

            state._fsp--;

             current =iv_ruleTitle; 
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
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalMyDsl.g:218:1: ruleTitle returns [EObject current=null] : ( ( (lv_substantiv_0_0= RULE_UPPERCASE_WORD ) ) ( (lv_infinitiv_1_0= RULE_LOWERCASE_WORD ) ) ) ;
    public final EObject ruleTitle() throws RecognitionException {
        EObject current = null;

        Token lv_substantiv_0_0=null;
        Token lv_infinitiv_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:224:2: ( ( ( (lv_substantiv_0_0= RULE_UPPERCASE_WORD ) ) ( (lv_infinitiv_1_0= RULE_LOWERCASE_WORD ) ) ) )
            // InternalMyDsl.g:225:2: ( ( (lv_substantiv_0_0= RULE_UPPERCASE_WORD ) ) ( (lv_infinitiv_1_0= RULE_LOWERCASE_WORD ) ) )
            {
            // InternalMyDsl.g:225:2: ( ( (lv_substantiv_0_0= RULE_UPPERCASE_WORD ) ) ( (lv_infinitiv_1_0= RULE_LOWERCASE_WORD ) ) )
            // InternalMyDsl.g:226:3: ( (lv_substantiv_0_0= RULE_UPPERCASE_WORD ) ) ( (lv_infinitiv_1_0= RULE_LOWERCASE_WORD ) )
            {
            // InternalMyDsl.g:226:3: ( (lv_substantiv_0_0= RULE_UPPERCASE_WORD ) )
            // InternalMyDsl.g:227:4: (lv_substantiv_0_0= RULE_UPPERCASE_WORD )
            {
            // InternalMyDsl.g:227:4: (lv_substantiv_0_0= RULE_UPPERCASE_WORD )
            // InternalMyDsl.g:228:5: lv_substantiv_0_0= RULE_UPPERCASE_WORD
            {
            lv_substantiv_0_0=(Token)match(input,RULE_UPPERCASE_WORD,FOLLOW_9); 

            					newLeafNode(lv_substantiv_0_0, grammarAccess.getTitleAccess().getSubstantivUPPERCASE_WORDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTitleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"substantiv",
            						lv_substantiv_0_0,
            						"org.xtext.example.mydsl.MyDsl.UPPERCASE_WORD");
            				

            }


            }

            // InternalMyDsl.g:244:3: ( (lv_infinitiv_1_0= RULE_LOWERCASE_WORD ) )
            // InternalMyDsl.g:245:4: (lv_infinitiv_1_0= RULE_LOWERCASE_WORD )
            {
            // InternalMyDsl.g:245:4: (lv_infinitiv_1_0= RULE_LOWERCASE_WORD )
            // InternalMyDsl.g:246:5: lv_infinitiv_1_0= RULE_LOWERCASE_WORD
            {
            lv_infinitiv_1_0=(Token)match(input,RULE_LOWERCASE_WORD,FOLLOW_2); 

            					newLeafNode(lv_infinitiv_1_0, grammarAccess.getTitleAccess().getInfinitivLOWERCASE_WORDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTitleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"infinitiv",
            						lv_infinitiv_1_0,
            						"org.xtext.example.mydsl.MyDsl.LOWERCASE_WORD");
            				

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
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleNutzen"
    // InternalMyDsl.g:266:1: entryRuleNutzen returns [EObject current=null] : iv_ruleNutzen= ruleNutzen EOF ;
    public final EObject entryRuleNutzen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNutzen = null;


        try {
            // InternalMyDsl.g:266:47: (iv_ruleNutzen= ruleNutzen EOF )
            // InternalMyDsl.g:267:2: iv_ruleNutzen= ruleNutzen EOF
            {
             newCompositeNode(grammarAccess.getNutzenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNutzen=ruleNutzen();

            state._fsp--;

             current =iv_ruleNutzen; 
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
    // $ANTLR end "entryRuleNutzen"


    // $ANTLR start "ruleNutzen"
    // InternalMyDsl.g:273:1: ruleNutzen returns [EObject current=null] : ( ( (lv_subject_0_0= RULE_UPPERCASE_WORD ) ) ( (lv_verb_1_0= RULE_LOWERCASE_WORD ) ) ) ;
    public final EObject ruleNutzen() throws RecognitionException {
        EObject current = null;

        Token lv_subject_0_0=null;
        Token lv_verb_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:279:2: ( ( ( (lv_subject_0_0= RULE_UPPERCASE_WORD ) ) ( (lv_verb_1_0= RULE_LOWERCASE_WORD ) ) ) )
            // InternalMyDsl.g:280:2: ( ( (lv_subject_0_0= RULE_UPPERCASE_WORD ) ) ( (lv_verb_1_0= RULE_LOWERCASE_WORD ) ) )
            {
            // InternalMyDsl.g:280:2: ( ( (lv_subject_0_0= RULE_UPPERCASE_WORD ) ) ( (lv_verb_1_0= RULE_LOWERCASE_WORD ) ) )
            // InternalMyDsl.g:281:3: ( (lv_subject_0_0= RULE_UPPERCASE_WORD ) ) ( (lv_verb_1_0= RULE_LOWERCASE_WORD ) )
            {
            // InternalMyDsl.g:281:3: ( (lv_subject_0_0= RULE_UPPERCASE_WORD ) )
            // InternalMyDsl.g:282:4: (lv_subject_0_0= RULE_UPPERCASE_WORD )
            {
            // InternalMyDsl.g:282:4: (lv_subject_0_0= RULE_UPPERCASE_WORD )
            // InternalMyDsl.g:283:5: lv_subject_0_0= RULE_UPPERCASE_WORD
            {
            lv_subject_0_0=(Token)match(input,RULE_UPPERCASE_WORD,FOLLOW_9); 

            					newLeafNode(lv_subject_0_0, grammarAccess.getNutzenAccess().getSubjectUPPERCASE_WORDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNutzenRule());
            					}
            					setWithLastConsumed(
            						current,
            						"subject",
            						lv_subject_0_0,
            						"org.xtext.example.mydsl.MyDsl.UPPERCASE_WORD");
            				

            }


            }

            // InternalMyDsl.g:299:3: ( (lv_verb_1_0= RULE_LOWERCASE_WORD ) )
            // InternalMyDsl.g:300:4: (lv_verb_1_0= RULE_LOWERCASE_WORD )
            {
            // InternalMyDsl.g:300:4: (lv_verb_1_0= RULE_LOWERCASE_WORD )
            // InternalMyDsl.g:301:5: lv_verb_1_0= RULE_LOWERCASE_WORD
            {
            lv_verb_1_0=(Token)match(input,RULE_LOWERCASE_WORD,FOLLOW_2); 

            					newLeafNode(lv_verb_1_0, grammarAccess.getNutzenAccess().getVerbLOWERCASE_WORDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNutzenRule());
            					}
            					setWithLastConsumed(
            						current,
            						"verb",
            						lv_verb_1_0,
            						"org.xtext.example.mydsl.MyDsl.LOWERCASE_WORD");
            				

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
    // $ANTLR end "ruleNutzen"


    // $ANTLR start "entryRuleRolle"
    // InternalMyDsl.g:321:1: entryRuleRolle returns [EObject current=null] : iv_ruleRolle= ruleRolle EOF ;
    public final EObject entryRuleRolle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRolle = null;


        try {
            // InternalMyDsl.g:321:46: (iv_ruleRolle= ruleRolle EOF )
            // InternalMyDsl.g:322:2: iv_ruleRolle= ruleRolle EOF
            {
             newCompositeNode(grammarAccess.getRolleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRolle=ruleRolle();

            state._fsp--;

             current =iv_ruleRolle; 
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
    // $ANTLR end "entryRuleRolle"


    // $ANTLR start "ruleRolle"
    // InternalMyDsl.g:328:1: ruleRolle returns [EObject current=null] : ( (lv_substantiv_0_0= RULE_UPPERCASE_WORD ) ) ;
    public final EObject ruleRolle() throws RecognitionException {
        EObject current = null;

        Token lv_substantiv_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:334:2: ( ( (lv_substantiv_0_0= RULE_UPPERCASE_WORD ) ) )
            // InternalMyDsl.g:335:2: ( (lv_substantiv_0_0= RULE_UPPERCASE_WORD ) )
            {
            // InternalMyDsl.g:335:2: ( (lv_substantiv_0_0= RULE_UPPERCASE_WORD ) )
            // InternalMyDsl.g:336:3: (lv_substantiv_0_0= RULE_UPPERCASE_WORD )
            {
            // InternalMyDsl.g:336:3: (lv_substantiv_0_0= RULE_UPPERCASE_WORD )
            // InternalMyDsl.g:337:4: lv_substantiv_0_0= RULE_UPPERCASE_WORD
            {
            lv_substantiv_0_0=(Token)match(input,RULE_UPPERCASE_WORD,FOLLOW_2); 

            				newLeafNode(lv_substantiv_0_0, grammarAccess.getRolleAccess().getSubstantivUPPERCASE_WORDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRolleRule());
            				}
            				setWithLastConsumed(
            					current,
            					"substantiv",
            					lv_substantiv_0_0,
            					"org.xtext.example.mydsl.MyDsl.UPPERCASE_WORD");
            			

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
    // $ANTLR end "ruleRolle"


    // $ANTLR start "entryRuleZiel_Wunsch"
    // InternalMyDsl.g:356:1: entryRuleZiel_Wunsch returns [EObject current=null] : iv_ruleZiel_Wunsch= ruleZiel_Wunsch EOF ;
    public final EObject entryRuleZiel_Wunsch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleZiel_Wunsch = null;


        try {
            // InternalMyDsl.g:356:52: (iv_ruleZiel_Wunsch= ruleZiel_Wunsch EOF )
            // InternalMyDsl.g:357:2: iv_ruleZiel_Wunsch= ruleZiel_Wunsch EOF
            {
             newCompositeNode(grammarAccess.getZiel_WunschRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleZiel_Wunsch=ruleZiel_Wunsch();

            state._fsp--;

             current =iv_ruleZiel_Wunsch; 
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
    // $ANTLR end "entryRuleZiel_Wunsch"


    // $ANTLR start "ruleZiel_Wunsch"
    // InternalMyDsl.g:363:1: ruleZiel_Wunsch returns [EObject current=null] : ( ( (lv_subject_0_0= RULE_UPPERCASE_WORD ) ) ( (lv_infinitiv_1_0= RULE_LOWERCASE_WORD ) ) ) ;
    public final EObject ruleZiel_Wunsch() throws RecognitionException {
        EObject current = null;

        Token lv_subject_0_0=null;
        Token lv_infinitiv_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:369:2: ( ( ( (lv_subject_0_0= RULE_UPPERCASE_WORD ) ) ( (lv_infinitiv_1_0= RULE_LOWERCASE_WORD ) ) ) )
            // InternalMyDsl.g:370:2: ( ( (lv_subject_0_0= RULE_UPPERCASE_WORD ) ) ( (lv_infinitiv_1_0= RULE_LOWERCASE_WORD ) ) )
            {
            // InternalMyDsl.g:370:2: ( ( (lv_subject_0_0= RULE_UPPERCASE_WORD ) ) ( (lv_infinitiv_1_0= RULE_LOWERCASE_WORD ) ) )
            // InternalMyDsl.g:371:3: ( (lv_subject_0_0= RULE_UPPERCASE_WORD ) ) ( (lv_infinitiv_1_0= RULE_LOWERCASE_WORD ) )
            {
            // InternalMyDsl.g:371:3: ( (lv_subject_0_0= RULE_UPPERCASE_WORD ) )
            // InternalMyDsl.g:372:4: (lv_subject_0_0= RULE_UPPERCASE_WORD )
            {
            // InternalMyDsl.g:372:4: (lv_subject_0_0= RULE_UPPERCASE_WORD )
            // InternalMyDsl.g:373:5: lv_subject_0_0= RULE_UPPERCASE_WORD
            {
            lv_subject_0_0=(Token)match(input,RULE_UPPERCASE_WORD,FOLLOW_9); 

            					newLeafNode(lv_subject_0_0, grammarAccess.getZiel_WunschAccess().getSubjectUPPERCASE_WORDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getZiel_WunschRule());
            					}
            					setWithLastConsumed(
            						current,
            						"subject",
            						lv_subject_0_0,
            						"org.xtext.example.mydsl.MyDsl.UPPERCASE_WORD");
            				

            }


            }

            // InternalMyDsl.g:389:3: ( (lv_infinitiv_1_0= RULE_LOWERCASE_WORD ) )
            // InternalMyDsl.g:390:4: (lv_infinitiv_1_0= RULE_LOWERCASE_WORD )
            {
            // InternalMyDsl.g:390:4: (lv_infinitiv_1_0= RULE_LOWERCASE_WORD )
            // InternalMyDsl.g:391:5: lv_infinitiv_1_0= RULE_LOWERCASE_WORD
            {
            lv_infinitiv_1_0=(Token)match(input,RULE_LOWERCASE_WORD,FOLLOW_2); 

            					newLeafNode(lv_infinitiv_1_0, grammarAccess.getZiel_WunschAccess().getInfinitivLOWERCASE_WORDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getZiel_WunschRule());
            					}
            					setWithLastConsumed(
            						current,
            						"infinitiv",
            						lv_infinitiv_1_0,
            						"org.xtext.example.mydsl.MyDsl.LOWERCASE_WORD");
            				

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
    // $ANTLR end "ruleZiel_Wunsch"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});

}