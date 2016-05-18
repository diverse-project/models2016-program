package fr.inria.diverse.models2016.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.inria.diverse.models2016.dsl.services.ProgramGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProgramParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Conference'", "'{'", "'ressources'", "','", "'}'", "'events'", "'program'", "'Program'", "'days'", "'Room'", "'capacity'", "'-'", "'Day'", "'weekday'", "'date'", "'sessions'", "'.'", "':'", "'Session'", "'startingTime'", "'endingTime'", "'('", "')'", "'room'", "'TalkSession'", "'title'", "'abstract'", "'papers'", "'chair'", "'Panel'", "'panelists'", "'moderators'", "'Workshop'", "'url'", "'id'", "'organizers'", "'Tutorial'", "'DoctoralSymposium'", "'EducatorSymposium'", "'Reception'", "'Clinic'", "'Lunch'", "'Talk'", "'preprint'", "'kind'", "'authors'", "'Person'", "'email'", "'homepage'", "'Monday'", "'Tuesday'", "'Wednesday'", "'Thursday'", "'Friday'", "'Saturday'", "'Sunday'", "'PracticeAndInnovation'", "'Research'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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


        public InternalProgramParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalProgramParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalProgramParser.tokenNames; }
    public String getGrammarFileName() { return "InternalProgram.g"; }



     	private ProgramGrammarAccess grammarAccess;

        public InternalProgramParser(TokenStream input, ProgramGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Conference";
       	}

       	@Override
       	protected ProgramGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleConference"
    // InternalProgram.g:65:1: entryRuleConference returns [EObject current=null] : iv_ruleConference= ruleConference EOF ;
    public final EObject entryRuleConference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConference = null;


        try {
            // InternalProgram.g:65:51: (iv_ruleConference= ruleConference EOF )
            // InternalProgram.g:66:2: iv_ruleConference= ruleConference EOF
            {
             newCompositeNode(grammarAccess.getConferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConference=ruleConference();

            state._fsp--;

             current =iv_ruleConference; 
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
    // $ANTLR end "entryRuleConference"


    // $ANTLR start "ruleConference"
    // InternalProgram.g:72:1: ruleConference returns [EObject current=null] : ( () otherlv_1= 'Conference' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ressources' otherlv_5= '{' ( (lv_ressources_6_0= ruleRessource ) ) (otherlv_7= ',' ( (lv_ressources_8_0= ruleRessource ) ) )* otherlv_9= '}' )? (otherlv_10= 'events' otherlv_11= '{' ( (lv_events_12_0= ruleEvent ) ) (otherlv_13= ',' ( (lv_events_14_0= ruleEvent ) ) )* otherlv_15= '}' )? (otherlv_16= 'program' ( (lv_program_17_0= ruleProgram ) ) )? otherlv_18= '}' ) ;
    public final EObject ruleConference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ressources_6_0 = null;

        EObject lv_ressources_8_0 = null;

        EObject lv_events_12_0 = null;

        EObject lv_events_14_0 = null;

        EObject lv_program_17_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:78:2: ( ( () otherlv_1= 'Conference' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ressources' otherlv_5= '{' ( (lv_ressources_6_0= ruleRessource ) ) (otherlv_7= ',' ( (lv_ressources_8_0= ruleRessource ) ) )* otherlv_9= '}' )? (otherlv_10= 'events' otherlv_11= '{' ( (lv_events_12_0= ruleEvent ) ) (otherlv_13= ',' ( (lv_events_14_0= ruleEvent ) ) )* otherlv_15= '}' )? (otherlv_16= 'program' ( (lv_program_17_0= ruleProgram ) ) )? otherlv_18= '}' ) )
            // InternalProgram.g:79:2: ( () otherlv_1= 'Conference' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ressources' otherlv_5= '{' ( (lv_ressources_6_0= ruleRessource ) ) (otherlv_7= ',' ( (lv_ressources_8_0= ruleRessource ) ) )* otherlv_9= '}' )? (otherlv_10= 'events' otherlv_11= '{' ( (lv_events_12_0= ruleEvent ) ) (otherlv_13= ',' ( (lv_events_14_0= ruleEvent ) ) )* otherlv_15= '}' )? (otherlv_16= 'program' ( (lv_program_17_0= ruleProgram ) ) )? otherlv_18= '}' )
            {
            // InternalProgram.g:79:2: ( () otherlv_1= 'Conference' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ressources' otherlv_5= '{' ( (lv_ressources_6_0= ruleRessource ) ) (otherlv_7= ',' ( (lv_ressources_8_0= ruleRessource ) ) )* otherlv_9= '}' )? (otherlv_10= 'events' otherlv_11= '{' ( (lv_events_12_0= ruleEvent ) ) (otherlv_13= ',' ( (lv_events_14_0= ruleEvent ) ) )* otherlv_15= '}' )? (otherlv_16= 'program' ( (lv_program_17_0= ruleProgram ) ) )? otherlv_18= '}' )
            // InternalProgram.g:80:3: () otherlv_1= 'Conference' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ressources' otherlv_5= '{' ( (lv_ressources_6_0= ruleRessource ) ) (otherlv_7= ',' ( (lv_ressources_8_0= ruleRessource ) ) )* otherlv_9= '}' )? (otherlv_10= 'events' otherlv_11= '{' ( (lv_events_12_0= ruleEvent ) ) (otherlv_13= ',' ( (lv_events_14_0= ruleEvent ) ) )* otherlv_15= '}' )? (otherlv_16= 'program' ( (lv_program_17_0= ruleProgram ) ) )? otherlv_18= '}'
            {
            // InternalProgram.g:80:3: ()
            // InternalProgram.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConferenceAccess().getConferenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConferenceAccess().getConferenceKeyword_1());
            		
            // InternalProgram.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalProgram.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalProgram.g:92:4: (lv_name_2_0= ruleEString )
            // InternalProgram.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConferenceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConferenceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getConferenceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalProgram.g:114:3: (otherlv_4= 'ressources' otherlv_5= '{' ( (lv_ressources_6_0= ruleRessource ) ) (otherlv_7= ',' ( (lv_ressources_8_0= ruleRessource ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalProgram.g:115:4: otherlv_4= 'ressources' otherlv_5= '{' ( (lv_ressources_6_0= ruleRessource ) ) (otherlv_7= ',' ( (lv_ressources_8_0= ruleRessource ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getConferenceAccess().getRessourcesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getConferenceAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalProgram.g:123:4: ( (lv_ressources_6_0= ruleRessource ) )
                    // InternalProgram.g:124:5: (lv_ressources_6_0= ruleRessource )
                    {
                    // InternalProgram.g:124:5: (lv_ressources_6_0= ruleRessource )
                    // InternalProgram.g:125:6: lv_ressources_6_0= ruleRessource
                    {

                    						newCompositeNode(grammarAccess.getConferenceAccess().getRessourcesRessourceParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_ressources_6_0=ruleRessource();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConferenceRule());
                    						}
                    						add(
                    							current,
                    							"ressources",
                    							lv_ressources_6_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Ressource");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:142:4: (otherlv_7= ',' ( (lv_ressources_8_0= ruleRessource ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalProgram.g:143:5: otherlv_7= ',' ( (lv_ressources_8_0= ruleRessource ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getConferenceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalProgram.g:147:5: ( (lv_ressources_8_0= ruleRessource ) )
                    	    // InternalProgram.g:148:6: (lv_ressources_8_0= ruleRessource )
                    	    {
                    	    // InternalProgram.g:148:6: (lv_ressources_8_0= ruleRessource )
                    	    // InternalProgram.g:149:7: lv_ressources_8_0= ruleRessource
                    	    {

                    	    							newCompositeNode(grammarAccess.getConferenceAccess().getRessourcesRessourceParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_ressources_8_0=ruleRessource();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConferenceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ressources",
                    	    								lv_ressources_8_0,
                    	    								"fr.inria.diverse.models2016.dsl.Program.Ressource");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getConferenceAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalProgram.g:172:3: (otherlv_10= 'events' otherlv_11= '{' ( (lv_events_12_0= ruleEvent ) ) (otherlv_13= ',' ( (lv_events_14_0= ruleEvent ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalProgram.g:173:4: otherlv_10= 'events' otherlv_11= '{' ( (lv_events_12_0= ruleEvent ) ) (otherlv_13= ',' ( (lv_events_14_0= ruleEvent ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getConferenceAccess().getEventsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getConferenceAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalProgram.g:181:4: ( (lv_events_12_0= ruleEvent ) )
                    // InternalProgram.g:182:5: (lv_events_12_0= ruleEvent )
                    {
                    // InternalProgram.g:182:5: (lv_events_12_0= ruleEvent )
                    // InternalProgram.g:183:6: lv_events_12_0= ruleEvent
                    {

                    						newCompositeNode(grammarAccess.getConferenceAccess().getEventsEventParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_events_12_0=ruleEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConferenceRule());
                    						}
                    						add(
                    							current,
                    							"events",
                    							lv_events_12_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Event");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:200:4: (otherlv_13= ',' ( (lv_events_14_0= ruleEvent ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalProgram.g:201:5: otherlv_13= ',' ( (lv_events_14_0= ruleEvent ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getConferenceAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalProgram.g:205:5: ( (lv_events_14_0= ruleEvent ) )
                    	    // InternalProgram.g:206:6: (lv_events_14_0= ruleEvent )
                    	    {
                    	    // InternalProgram.g:206:6: (lv_events_14_0= ruleEvent )
                    	    // InternalProgram.g:207:7: lv_events_14_0= ruleEvent
                    	    {

                    	    							newCompositeNode(grammarAccess.getConferenceAccess().getEventsEventParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_events_14_0=ruleEvent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConferenceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"events",
                    	    								lv_events_14_0,
                    	    								"fr.inria.diverse.models2016.dsl.Program.Event");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getConferenceAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalProgram.g:230:3: (otherlv_16= 'program' ( (lv_program_17_0= ruleProgram ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalProgram.g:231:4: otherlv_16= 'program' ( (lv_program_17_0= ruleProgram ) )
                    {
                    otherlv_16=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_16, grammarAccess.getConferenceAccess().getProgramKeyword_6_0());
                    			
                    // InternalProgram.g:235:4: ( (lv_program_17_0= ruleProgram ) )
                    // InternalProgram.g:236:5: (lv_program_17_0= ruleProgram )
                    {
                    // InternalProgram.g:236:5: (lv_program_17_0= ruleProgram )
                    // InternalProgram.g:237:6: lv_program_17_0= ruleProgram
                    {

                    						newCompositeNode(grammarAccess.getConferenceAccess().getProgramProgramParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_program_17_0=ruleProgram();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConferenceRule());
                    						}
                    						set(
                    							current,
                    							"program",
                    							lv_program_17_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Program");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getConferenceAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleConference"


    // $ANTLR start "entryRuleRessource"
    // InternalProgram.g:263:1: entryRuleRessource returns [EObject current=null] : iv_ruleRessource= ruleRessource EOF ;
    public final EObject entryRuleRessource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRessource = null;


        try {
            // InternalProgram.g:263:50: (iv_ruleRessource= ruleRessource EOF )
            // InternalProgram.g:264:2: iv_ruleRessource= ruleRessource EOF
            {
             newCompositeNode(grammarAccess.getRessourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRessource=ruleRessource();

            state._fsp--;

             current =iv_ruleRessource; 
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
    // $ANTLR end "entryRuleRessource"


    // $ANTLR start "ruleRessource"
    // InternalProgram.g:270:1: ruleRessource returns [EObject current=null] : this_Room_0= ruleRoom ;
    public final EObject ruleRessource() throws RecognitionException {
        EObject current = null;

        EObject this_Room_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:276:2: (this_Room_0= ruleRoom )
            // InternalProgram.g:277:2: this_Room_0= ruleRoom
            {

            		newCompositeNode(grammarAccess.getRessourceAccess().getRoomParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Room_0=ruleRoom();

            state._fsp--;


            		current = this_Room_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleRessource"


    // $ANTLR start "entryRuleEvent"
    // InternalProgram.g:288:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalProgram.g:288:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalProgram.g:289:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalProgram.g:295:1: ruleEvent returns [EObject current=null] : (this_TalkSession_0= ruleTalkSession | this_Panel_1= rulePanel | this_Workshop_2= ruleWorkshop | this_Tutorial_3= ruleTutorial | this_DoctoralSymposium_4= ruleDoctoralSymposium | this_EducatorSymposium_5= ruleEducatorSymposium | this_Reception_6= ruleReception | this_Clinic_7= ruleClinic | this_Lunch_8= ruleLunch ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        EObject this_TalkSession_0 = null;

        EObject this_Panel_1 = null;

        EObject this_Workshop_2 = null;

        EObject this_Tutorial_3 = null;

        EObject this_DoctoralSymposium_4 = null;

        EObject this_EducatorSymposium_5 = null;

        EObject this_Reception_6 = null;

        EObject this_Clinic_7 = null;

        EObject this_Lunch_8 = null;



        	enterRule();

        try {
            // InternalProgram.g:301:2: ( (this_TalkSession_0= ruleTalkSession | this_Panel_1= rulePanel | this_Workshop_2= ruleWorkshop | this_Tutorial_3= ruleTutorial | this_DoctoralSymposium_4= ruleDoctoralSymposium | this_EducatorSymposium_5= ruleEducatorSymposium | this_Reception_6= ruleReception | this_Clinic_7= ruleClinic | this_Lunch_8= ruleLunch ) )
            // InternalProgram.g:302:2: (this_TalkSession_0= ruleTalkSession | this_Panel_1= rulePanel | this_Workshop_2= ruleWorkshop | this_Tutorial_3= ruleTutorial | this_DoctoralSymposium_4= ruleDoctoralSymposium | this_EducatorSymposium_5= ruleEducatorSymposium | this_Reception_6= ruleReception | this_Clinic_7= ruleClinic | this_Lunch_8= ruleLunch )
            {
            // InternalProgram.g:302:2: (this_TalkSession_0= ruleTalkSession | this_Panel_1= rulePanel | this_Workshop_2= ruleWorkshop | this_Tutorial_3= ruleTutorial | this_DoctoralSymposium_4= ruleDoctoralSymposium | this_EducatorSymposium_5= ruleEducatorSymposium | this_Reception_6= ruleReception | this_Clinic_7= ruleClinic | this_Lunch_8= ruleLunch )
            int alt6=9;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt6=1;
                }
                break;
            case 40:
                {
                alt6=2;
                }
                break;
            case 43:
                {
                alt6=3;
                }
                break;
            case 47:
                {
                alt6=4;
                }
                break;
            case 48:
                {
                alt6=5;
                }
                break;
            case 49:
                {
                alt6=6;
                }
                break;
            case 50:
                {
                alt6=7;
                }
                break;
            case 51:
                {
                alt6=8;
                }
                break;
            case 52:
                {
                alt6=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalProgram.g:303:3: this_TalkSession_0= ruleTalkSession
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getTalkSessionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TalkSession_0=ruleTalkSession();

                    state._fsp--;


                    			current = this_TalkSession_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalProgram.g:312:3: this_Panel_1= rulePanel
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getPanelParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Panel_1=rulePanel();

                    state._fsp--;


                    			current = this_Panel_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalProgram.g:321:3: this_Workshop_2= ruleWorkshop
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getWorkshopParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Workshop_2=ruleWorkshop();

                    state._fsp--;


                    			current = this_Workshop_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalProgram.g:330:3: this_Tutorial_3= ruleTutorial
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getTutorialParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tutorial_3=ruleTutorial();

                    state._fsp--;


                    			current = this_Tutorial_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalProgram.g:339:3: this_DoctoralSymposium_4= ruleDoctoralSymposium
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getDoctoralSymposiumParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DoctoralSymposium_4=ruleDoctoralSymposium();

                    state._fsp--;


                    			current = this_DoctoralSymposium_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalProgram.g:348:3: this_EducatorSymposium_5= ruleEducatorSymposium
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getEducatorSymposiumParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_EducatorSymposium_5=ruleEducatorSymposium();

                    state._fsp--;


                    			current = this_EducatorSymposium_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalProgram.g:357:3: this_Reception_6= ruleReception
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getReceptionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reception_6=ruleReception();

                    state._fsp--;


                    			current = this_Reception_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalProgram.g:366:3: this_Clinic_7= ruleClinic
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getClinicParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Clinic_7=ruleClinic();

                    state._fsp--;


                    			current = this_Clinic_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalProgram.g:375:3: this_Lunch_8= ruleLunch
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getLunchParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Lunch_8=ruleLunch();

                    state._fsp--;


                    			current = this_Lunch_8;
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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleEString"
    // InternalProgram.g:387:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalProgram.g:387:47: (iv_ruleEString= ruleEString EOF )
            // InternalProgram.g:388:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalProgram.g:394:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalProgram.g:400:2: (this_STRING_0= RULE_STRING )
            // InternalProgram.g:401:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleProgram"
    // InternalProgram.g:411:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalProgram.g:411:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalProgram.g:412:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalProgram.g:418:1: ruleProgram returns [EObject current=null] : ( () otherlv_1= 'Program' otherlv_2= '{' (otherlv_3= 'days' otherlv_4= '{' ( (lv_days_5_0= ruleDay ) ) (otherlv_6= ',' ( (lv_days_7_0= ruleDay ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_days_5_0 = null;

        EObject lv_days_7_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:424:2: ( ( () otherlv_1= 'Program' otherlv_2= '{' (otherlv_3= 'days' otherlv_4= '{' ( (lv_days_5_0= ruleDay ) ) (otherlv_6= ',' ( (lv_days_7_0= ruleDay ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalProgram.g:425:2: ( () otherlv_1= 'Program' otherlv_2= '{' (otherlv_3= 'days' otherlv_4= '{' ( (lv_days_5_0= ruleDay ) ) (otherlv_6= ',' ( (lv_days_7_0= ruleDay ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalProgram.g:425:2: ( () otherlv_1= 'Program' otherlv_2= '{' (otherlv_3= 'days' otherlv_4= '{' ( (lv_days_5_0= ruleDay ) ) (otherlv_6= ',' ( (lv_days_7_0= ruleDay ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalProgram.g:426:3: () otherlv_1= 'Program' otherlv_2= '{' (otherlv_3= 'days' otherlv_4= '{' ( (lv_days_5_0= ruleDay ) ) (otherlv_6= ',' ( (lv_days_7_0= ruleDay ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalProgram.g:426:3: ()
            // InternalProgram.g:427:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProgramAccess().getProgramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getProgramKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalProgram.g:441:3: (otherlv_3= 'days' otherlv_4= '{' ( (lv_days_5_0= ruleDay ) ) (otherlv_6= ',' ( (lv_days_7_0= ruleDay ) ) )* otherlv_8= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalProgram.g:442:4: otherlv_3= 'days' otherlv_4= '{' ( (lv_days_5_0= ruleDay ) ) (otherlv_6= ',' ( (lv_days_7_0= ruleDay ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getProgramAccess().getDaysKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalProgram.g:450:4: ( (lv_days_5_0= ruleDay ) )
                    // InternalProgram.g:451:5: (lv_days_5_0= ruleDay )
                    {
                    // InternalProgram.g:451:5: (lv_days_5_0= ruleDay )
                    // InternalProgram.g:452:6: lv_days_5_0= ruleDay
                    {

                    						newCompositeNode(grammarAccess.getProgramAccess().getDaysDayParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_days_5_0=ruleDay();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProgramRule());
                    						}
                    						add(
                    							current,
                    							"days",
                    							lv_days_5_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Day");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:469:4: (otherlv_6= ',' ( (lv_days_7_0= ruleDay ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalProgram.g:470:5: otherlv_6= ',' ( (lv_days_7_0= ruleDay ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getProgramAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalProgram.g:474:5: ( (lv_days_7_0= ruleDay ) )
                    	    // InternalProgram.g:475:6: (lv_days_7_0= ruleDay )
                    	    {
                    	    // InternalProgram.g:475:6: (lv_days_7_0= ruleDay )
                    	    // InternalProgram.g:476:7: lv_days_7_0= ruleDay
                    	    {

                    	    							newCompositeNode(grammarAccess.getProgramAccess().getDaysDayParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_days_7_0=ruleDay();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProgramRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"days",
                    	    								lv_days_7_0,
                    	    								"fr.inria.diverse.models2016.dsl.Program.Day");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleRoom"
    // InternalProgram.g:507:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // InternalProgram.g:507:45: (iv_ruleRoom= ruleRoom EOF )
            // InternalProgram.g:508:2: iv_ruleRoom= ruleRoom EOF
            {
             newCompositeNode(grammarAccess.getRoomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoom=ruleRoom();

            state._fsp--;

             current =iv_ruleRoom; 
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
    // $ANTLR end "entryRuleRoom"


    // $ANTLR start "ruleRoom"
    // InternalProgram.g:514:1: ruleRoom returns [EObject current=null] : ( () otherlv_1= 'Room' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'capacity' ( (lv_capacity_5_0= ruleEIntegerObject ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_capacity_5_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:520:2: ( ( () otherlv_1= 'Room' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'capacity' ( (lv_capacity_5_0= ruleEIntegerObject ) ) )? otherlv_6= '}' ) )
            // InternalProgram.g:521:2: ( () otherlv_1= 'Room' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'capacity' ( (lv_capacity_5_0= ruleEIntegerObject ) ) )? otherlv_6= '}' )
            {
            // InternalProgram.g:521:2: ( () otherlv_1= 'Room' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'capacity' ( (lv_capacity_5_0= ruleEIntegerObject ) ) )? otherlv_6= '}' )
            // InternalProgram.g:522:3: () otherlv_1= 'Room' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'capacity' ( (lv_capacity_5_0= ruleEIntegerObject ) ) )? otherlv_6= '}'
            {
            // InternalProgram.g:522:3: ()
            // InternalProgram.g:523:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoomAccess().getRoomAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRoomAccess().getRoomKeyword_1());
            		
            // InternalProgram.g:533:3: ( (lv_name_2_0= ruleEString ) )
            // InternalProgram.g:534:4: (lv_name_2_0= ruleEString )
            {
            // InternalProgram.g:534:4: (lv_name_2_0= ruleEString )
            // InternalProgram.g:535:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoomAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoomRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalProgram.g:556:3: (otherlv_4= 'capacity' ( (lv_capacity_5_0= ruleEIntegerObject ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalProgram.g:557:4: otherlv_4= 'capacity' ( (lv_capacity_5_0= ruleEIntegerObject ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getRoomAccess().getCapacityKeyword_4_0());
                    			
                    // InternalProgram.g:561:4: ( (lv_capacity_5_0= ruleEIntegerObject ) )
                    // InternalProgram.g:562:5: (lv_capacity_5_0= ruleEIntegerObject )
                    {
                    // InternalProgram.g:562:5: (lv_capacity_5_0= ruleEIntegerObject )
                    // InternalProgram.g:563:6: lv_capacity_5_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getRoomAccess().getCapacityEIntegerObjectParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_capacity_5_0=ruleEIntegerObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoomRule());
                    						}
                    						set(
                    							current,
                    							"capacity",
                    							lv_capacity_5_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EIntegerObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRoom"


    // $ANTLR start "entryRuleEIntegerObject"
    // InternalProgram.g:589:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // InternalProgram.g:589:54: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // InternalProgram.g:590:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
            {
             newCompositeNode(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEIntegerObject=ruleEIntegerObject();

            state._fsp--;

             current =iv_ruleEIntegerObject.getText(); 
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
    // $ANTLR end "entryRuleEIntegerObject"


    // $ANTLR start "ruleEIntegerObject"
    // InternalProgram.g:596:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalProgram.g:602:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalProgram.g:603:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalProgram.g:603:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalProgram.g:604:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalProgram.g:604:3: (kw= '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalProgram.g:605:4: kw= '-'
                    {
                    kw=(Token)match(input,22,FOLLOW_17); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEIntegerObject"


    // $ANTLR start "entryRuleDay"
    // InternalProgram.g:622:1: entryRuleDay returns [EObject current=null] : iv_ruleDay= ruleDay EOF ;
    public final EObject entryRuleDay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDay = null;


        try {
            // InternalProgram.g:622:44: (iv_ruleDay= ruleDay EOF )
            // InternalProgram.g:623:2: iv_ruleDay= ruleDay EOF
            {
             newCompositeNode(grammarAccess.getDayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDay=ruleDay();

            state._fsp--;

             current =iv_ruleDay; 
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
    // $ANTLR end "entryRuleDay"


    // $ANTLR start "ruleDay"
    // InternalProgram.g:629:1: ruleDay returns [EObject current=null] : (otherlv_0= 'Day' otherlv_1= '{' otherlv_2= 'weekday' ( (lv_weekday_3_0= ruleWeekDay ) ) (otherlv_4= 'date' ( (lv_date_5_0= ruleEDate ) ) )? (otherlv_6= 'sessions' otherlv_7= '{' ( (lv_sessions_8_0= ruleSession ) ) (otherlv_9= ',' ( (lv_sessions_10_0= ruleSession ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleDay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Enumerator lv_weekday_3_0 = null;

        AntlrDatatypeRuleToken lv_date_5_0 = null;

        EObject lv_sessions_8_0 = null;

        EObject lv_sessions_10_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:635:2: ( (otherlv_0= 'Day' otherlv_1= '{' otherlv_2= 'weekday' ( (lv_weekday_3_0= ruleWeekDay ) ) (otherlv_4= 'date' ( (lv_date_5_0= ruleEDate ) ) )? (otherlv_6= 'sessions' otherlv_7= '{' ( (lv_sessions_8_0= ruleSession ) ) (otherlv_9= ',' ( (lv_sessions_10_0= ruleSession ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalProgram.g:636:2: (otherlv_0= 'Day' otherlv_1= '{' otherlv_2= 'weekday' ( (lv_weekday_3_0= ruleWeekDay ) ) (otherlv_4= 'date' ( (lv_date_5_0= ruleEDate ) ) )? (otherlv_6= 'sessions' otherlv_7= '{' ( (lv_sessions_8_0= ruleSession ) ) (otherlv_9= ',' ( (lv_sessions_10_0= ruleSession ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalProgram.g:636:2: (otherlv_0= 'Day' otherlv_1= '{' otherlv_2= 'weekday' ( (lv_weekday_3_0= ruleWeekDay ) ) (otherlv_4= 'date' ( (lv_date_5_0= ruleEDate ) ) )? (otherlv_6= 'sessions' otherlv_7= '{' ( (lv_sessions_8_0= ruleSession ) ) (otherlv_9= ',' ( (lv_sessions_10_0= ruleSession ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalProgram.g:637:3: otherlv_0= 'Day' otherlv_1= '{' otherlv_2= 'weekday' ( (lv_weekday_3_0= ruleWeekDay ) ) (otherlv_4= 'date' ( (lv_date_5_0= ruleEDate ) ) )? (otherlv_6= 'sessions' otherlv_7= '{' ( (lv_sessions_8_0= ruleSession ) ) (otherlv_9= ',' ( (lv_sessions_10_0= ruleSession ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDayAccess().getDayKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getDayAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getDayAccess().getWeekdayKeyword_2());
            		
            // InternalProgram.g:649:3: ( (lv_weekday_3_0= ruleWeekDay ) )
            // InternalProgram.g:650:4: (lv_weekday_3_0= ruleWeekDay )
            {
            // InternalProgram.g:650:4: (lv_weekday_3_0= ruleWeekDay )
            // InternalProgram.g:651:5: lv_weekday_3_0= ruleWeekDay
            {

            					newCompositeNode(grammarAccess.getDayAccess().getWeekdayWeekDayEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_weekday_3_0=ruleWeekDay();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDayRule());
            					}
            					set(
            						current,
            						"weekday",
            						lv_weekday_3_0,
            						"fr.inria.diverse.models2016.dsl.Program.WeekDay");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:668:3: (otherlv_4= 'date' ( (lv_date_5_0= ruleEDate ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalProgram.g:669:4: otherlv_4= 'date' ( (lv_date_5_0= ruleEDate ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getDayAccess().getDateKeyword_4_0());
                    			
                    // InternalProgram.g:673:4: ( (lv_date_5_0= ruleEDate ) )
                    // InternalProgram.g:674:5: (lv_date_5_0= ruleEDate )
                    {
                    // InternalProgram.g:674:5: (lv_date_5_0= ruleEDate )
                    // InternalProgram.g:675:6: lv_date_5_0= ruleEDate
                    {

                    						newCompositeNode(grammarAccess.getDayAccess().getDateEDateParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_date_5_0=ruleEDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDayRule());
                    						}
                    						set(
                    							current,
                    							"date",
                    							lv_date_5_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EDate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:693:3: (otherlv_6= 'sessions' otherlv_7= '{' ( (lv_sessions_8_0= ruleSession ) ) (otherlv_9= ',' ( (lv_sessions_10_0= ruleSession ) ) )* otherlv_11= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalProgram.g:694:4: otherlv_6= 'sessions' otherlv_7= '{' ( (lv_sessions_8_0= ruleSession ) ) (otherlv_9= ',' ( (lv_sessions_10_0= ruleSession ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getDayAccess().getSessionsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_22); 

                    				newLeafNode(otherlv_7, grammarAccess.getDayAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalProgram.g:702:4: ( (lv_sessions_8_0= ruleSession ) )
                    // InternalProgram.g:703:5: (lv_sessions_8_0= ruleSession )
                    {
                    // InternalProgram.g:703:5: (lv_sessions_8_0= ruleSession )
                    // InternalProgram.g:704:6: lv_sessions_8_0= ruleSession
                    {

                    						newCompositeNode(grammarAccess.getDayAccess().getSessionsSessionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_sessions_8_0=ruleSession();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDayRule());
                    						}
                    						add(
                    							current,
                    							"sessions",
                    							lv_sessions_8_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Session");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:721:4: (otherlv_9= ',' ( (lv_sessions_10_0= ruleSession ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalProgram.g:722:5: otherlv_9= ',' ( (lv_sessions_10_0= ruleSession ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_22); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getDayAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalProgram.g:726:5: ( (lv_sessions_10_0= ruleSession ) )
                    	    // InternalProgram.g:727:6: (lv_sessions_10_0= ruleSession )
                    	    {
                    	    // InternalProgram.g:727:6: (lv_sessions_10_0= ruleSession )
                    	    // InternalProgram.g:728:7: lv_sessions_10_0= ruleSession
                    	    {

                    	    							newCompositeNode(grammarAccess.getDayAccess().getSessionsSessionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_sessions_10_0=ruleSession();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDayRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sessions",
                    	    								lv_sessions_10_0,
                    	    								"fr.inria.diverse.models2016.dsl.Program.Session");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getDayAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getDayAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleDay"


    // $ANTLR start "entryRuleEDate"
    // InternalProgram.g:759:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // InternalProgram.g:759:45: (iv_ruleEDate= ruleEDate EOF )
            // InternalProgram.g:760:2: iv_ruleEDate= ruleEDate EOF
            {
             newCompositeNode(grammarAccess.getEDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDate=ruleEDate();

            state._fsp--;

             current =iv_ruleEDate.getText(); 
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
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // InternalProgram.g:766:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) | (this_INT_5= RULE_INT kw= ':' this_INT_7= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;
        Token this_INT_5=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalProgram.g:772:2: ( ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) | (this_INT_5= RULE_INT kw= ':' this_INT_7= RULE_INT ) ) )
            // InternalProgram.g:773:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) | (this_INT_5= RULE_INT kw= ':' this_INT_7= RULE_INT ) )
            {
            // InternalProgram.g:773:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) | (this_INT_5= RULE_INT kw= ':' this_INT_7= RULE_INT ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==28) ) {
                    alt14=2;
                }
                else if ( (LA14_1==27) ) {
                    alt14=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalProgram.g:774:3: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
                    {
                    // InternalProgram.g:774:3: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
                    // InternalProgram.g:775:4: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_23); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getEDateAccess().getINTTerminalRuleCall_0_0());
                    			
                    kw=(Token)match(input,27,FOLLOW_17); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDateAccess().getFullStopKeyword_0_1());
                    			
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_23); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getEDateAccess().getINTTerminalRuleCall_0_2());
                    			
                    kw=(Token)match(input,27,FOLLOW_17); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDateAccess().getFullStopKeyword_0_3());
                    			
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_4);
                    			

                    				newLeafNode(this_INT_4, grammarAccess.getEDateAccess().getINTTerminalRuleCall_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalProgram.g:808:3: (this_INT_5= RULE_INT kw= ':' this_INT_7= RULE_INT )
                    {
                    // InternalProgram.g:808:3: (this_INT_5= RULE_INT kw= ':' this_INT_7= RULE_INT )
                    // InternalProgram.g:809:4: this_INT_5= RULE_INT kw= ':' this_INT_7= RULE_INT
                    {
                    this_INT_5=(Token)match(input,RULE_INT,FOLLOW_24); 

                    				current.merge(this_INT_5);
                    			

                    				newLeafNode(this_INT_5, grammarAccess.getEDateAccess().getINTTerminalRuleCall_1_0());
                    			
                    kw=(Token)match(input,28,FOLLOW_17); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDateAccess().getColonKeyword_1_1());
                    			
                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDateAccess().getINTTerminalRuleCall_1_2());
                    			

                    }


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
    // $ANTLR end "ruleEDate"


    // $ANTLR start "entryRuleSession"
    // InternalProgram.g:833:1: entryRuleSession returns [EObject current=null] : iv_ruleSession= ruleSession EOF ;
    public final EObject entryRuleSession() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSession = null;


        try {
            // InternalProgram.g:833:48: (iv_ruleSession= ruleSession EOF )
            // InternalProgram.g:834:2: iv_ruleSession= ruleSession EOF
            {
             newCompositeNode(grammarAccess.getSessionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSession=ruleSession();

            state._fsp--;

             current =iv_ruleSession; 
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
    // $ANTLR end "entryRuleSession"


    // $ANTLR start "ruleSession"
    // InternalProgram.g:840:1: ruleSession returns [EObject current=null] : ( () otherlv_1= 'Session' otherlv_2= '{' (otherlv_3= 'startingTime' ( (lv_startingTime_4_0= ruleEDate ) ) )? (otherlv_5= 'endingTime' ( (lv_endingTime_6_0= ruleEDate ) ) )? (otherlv_7= 'events' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'room' ( ( ruleEString ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleSession() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_startingTime_4_0 = null;

        AntlrDatatypeRuleToken lv_endingTime_6_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:846:2: ( ( () otherlv_1= 'Session' otherlv_2= '{' (otherlv_3= 'startingTime' ( (lv_startingTime_4_0= ruleEDate ) ) )? (otherlv_5= 'endingTime' ( (lv_endingTime_6_0= ruleEDate ) ) )? (otherlv_7= 'events' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'room' ( ( ruleEString ) ) )? otherlv_15= '}' ) )
            // InternalProgram.g:847:2: ( () otherlv_1= 'Session' otherlv_2= '{' (otherlv_3= 'startingTime' ( (lv_startingTime_4_0= ruleEDate ) ) )? (otherlv_5= 'endingTime' ( (lv_endingTime_6_0= ruleEDate ) ) )? (otherlv_7= 'events' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'room' ( ( ruleEString ) ) )? otherlv_15= '}' )
            {
            // InternalProgram.g:847:2: ( () otherlv_1= 'Session' otherlv_2= '{' (otherlv_3= 'startingTime' ( (lv_startingTime_4_0= ruleEDate ) ) )? (otherlv_5= 'endingTime' ( (lv_endingTime_6_0= ruleEDate ) ) )? (otherlv_7= 'events' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'room' ( ( ruleEString ) ) )? otherlv_15= '}' )
            // InternalProgram.g:848:3: () otherlv_1= 'Session' otherlv_2= '{' (otherlv_3= 'startingTime' ( (lv_startingTime_4_0= ruleEDate ) ) )? (otherlv_5= 'endingTime' ( (lv_endingTime_6_0= ruleEDate ) ) )? (otherlv_7= 'events' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )? (otherlv_13= 'room' ( ( ruleEString ) ) )? otherlv_15= '}'
            {
            // InternalProgram.g:848:3: ()
            // InternalProgram.g:849:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSessionAccess().getSessionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSessionAccess().getSessionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getSessionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalProgram.g:863:3: (otherlv_3= 'startingTime' ( (lv_startingTime_4_0= ruleEDate ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalProgram.g:864:4: otherlv_3= 'startingTime' ( (lv_startingTime_4_0= ruleEDate ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getSessionAccess().getStartingTimeKeyword_3_0());
                    			
                    // InternalProgram.g:868:4: ( (lv_startingTime_4_0= ruleEDate ) )
                    // InternalProgram.g:869:5: (lv_startingTime_4_0= ruleEDate )
                    {
                    // InternalProgram.g:869:5: (lv_startingTime_4_0= ruleEDate )
                    // InternalProgram.g:870:6: lv_startingTime_4_0= ruleEDate
                    {

                    						newCompositeNode(grammarAccess.getSessionAccess().getStartingTimeEDateParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_startingTime_4_0=ruleEDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSessionRule());
                    						}
                    						set(
                    							current,
                    							"startingTime",
                    							lv_startingTime_4_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EDate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:888:3: (otherlv_5= 'endingTime' ( (lv_endingTime_6_0= ruleEDate ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalProgram.g:889:4: otherlv_5= 'endingTime' ( (lv_endingTime_6_0= ruleEDate ) )
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getSessionAccess().getEndingTimeKeyword_4_0());
                    			
                    // InternalProgram.g:893:4: ( (lv_endingTime_6_0= ruleEDate ) )
                    // InternalProgram.g:894:5: (lv_endingTime_6_0= ruleEDate )
                    {
                    // InternalProgram.g:894:5: (lv_endingTime_6_0= ruleEDate )
                    // InternalProgram.g:895:6: lv_endingTime_6_0= ruleEDate
                    {

                    						newCompositeNode(grammarAccess.getSessionAccess().getEndingTimeEDateParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_endingTime_6_0=ruleEDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSessionRule());
                    						}
                    						set(
                    							current,
                    							"endingTime",
                    							lv_endingTime_6_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EDate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:913:3: (otherlv_7= 'events' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==16) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalProgram.g:914:4: otherlv_7= 'events' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')'
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_28); 

                    				newLeafNode(otherlv_7, grammarAccess.getSessionAccess().getEventsKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getSessionAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalProgram.g:922:4: ( ( ruleEString ) )
                    // InternalProgram.g:923:5: ( ruleEString )
                    {
                    // InternalProgram.g:923:5: ( ruleEString )
                    // InternalProgram.g:924:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSessionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSessionAccess().getEventsEventCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_29);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:938:4: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalProgram.g:939:5: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getSessionAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalProgram.g:943:5: ( ( ruleEString ) )
                    	    // InternalProgram.g:944:6: ( ruleEString )
                    	    {
                    	    // InternalProgram.g:944:6: ( ruleEString )
                    	    // InternalProgram.g:945:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSessionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSessionAccess().getEventsEventCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,33,FOLLOW_30); 

                    				newLeafNode(otherlv_12, grammarAccess.getSessionAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalProgram.g:965:3: (otherlv_13= 'room' ( ( ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalProgram.g:966:4: otherlv_13= 'room' ( ( ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getSessionAccess().getRoomKeyword_6_0());
                    			
                    // InternalProgram.g:970:4: ( ( ruleEString ) )
                    // InternalProgram.g:971:5: ( ruleEString )
                    {
                    // InternalProgram.g:971:5: ( ruleEString )
                    // InternalProgram.g:972:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSessionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSessionAccess().getRoomRoomCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getSessionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleSession"


    // $ANTLR start "entryRuleTalkSession"
    // InternalProgram.g:995:1: entryRuleTalkSession returns [EObject current=null] : iv_ruleTalkSession= ruleTalkSession EOF ;
    public final EObject entryRuleTalkSession() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTalkSession = null;


        try {
            // InternalProgram.g:995:52: (iv_ruleTalkSession= ruleTalkSession EOF )
            // InternalProgram.g:996:2: iv_ruleTalkSession= ruleTalkSession EOF
            {
             newCompositeNode(grammarAccess.getTalkSessionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTalkSession=ruleTalkSession();

            state._fsp--;

             current =iv_ruleTalkSession; 
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
    // $ANTLR end "entryRuleTalkSession"


    // $ANTLR start "ruleTalkSession"
    // InternalProgram.g:1002:1: ruleTalkSession returns [EObject current=null] : (otherlv_0= 'TalkSession' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'papers' otherlv_7= '{' ( (lv_papers_8_0= ruleTalk ) ) (otherlv_9= ',' ( (lv_papers_10_0= ruleTalk ) ) )* otherlv_11= '}' )? (otherlv_12= 'chair' ( (lv_chair_13_0= rulePerson ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleTalkSession() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_abstract_5_0 = null;

        EObject lv_papers_8_0 = null;

        EObject lv_papers_10_0 = null;

        EObject lv_chair_13_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:1008:2: ( (otherlv_0= 'TalkSession' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'papers' otherlv_7= '{' ( (lv_papers_8_0= ruleTalk ) ) (otherlv_9= ',' ( (lv_papers_10_0= ruleTalk ) ) )* otherlv_11= '}' )? (otherlv_12= 'chair' ( (lv_chair_13_0= rulePerson ) ) )? otherlv_14= '}' ) )
            // InternalProgram.g:1009:2: (otherlv_0= 'TalkSession' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'papers' otherlv_7= '{' ( (lv_papers_8_0= ruleTalk ) ) (otherlv_9= ',' ( (lv_papers_10_0= ruleTalk ) ) )* otherlv_11= '}' )? (otherlv_12= 'chair' ( (lv_chair_13_0= rulePerson ) ) )? otherlv_14= '}' )
            {
            // InternalProgram.g:1009:2: (otherlv_0= 'TalkSession' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'papers' otherlv_7= '{' ( (lv_papers_8_0= ruleTalk ) ) (otherlv_9= ',' ( (lv_papers_10_0= ruleTalk ) ) )* otherlv_11= '}' )? (otherlv_12= 'chair' ( (lv_chair_13_0= rulePerson ) ) )? otherlv_14= '}' )
            // InternalProgram.g:1010:3: otherlv_0= 'TalkSession' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'papers' otherlv_7= '{' ( (lv_papers_8_0= ruleTalk ) ) (otherlv_9= ',' ( (lv_papers_10_0= ruleTalk ) ) )* otherlv_11= '}' )? (otherlv_12= 'chair' ( (lv_chair_13_0= rulePerson ) ) )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTalkSessionAccess().getTalkSessionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getTalkSessionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTalkSessionAccess().getTitleKeyword_2());
            		
            // InternalProgram.g:1022:3: ( (lv_name_3_0= ruleEString ) )
            // InternalProgram.g:1023:4: (lv_name_3_0= ruleEString )
            {
            // InternalProgram.g:1023:4: (lv_name_3_0= ruleEString )
            // InternalProgram.g:1024:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTalkSessionAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_32);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTalkSessionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:1041:3: (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalProgram.g:1042:4: otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTalkSessionAccess().getAbstractKeyword_4_0());
                    			
                    // InternalProgram.g:1046:4: ( (lv_abstract_5_0= ruleEString ) )
                    // InternalProgram.g:1047:5: (lv_abstract_5_0= ruleEString )
                    {
                    // InternalProgram.g:1047:5: (lv_abstract_5_0= ruleEString )
                    // InternalProgram.g:1048:6: lv_abstract_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTalkSessionAccess().getAbstractEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_abstract_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTalkSessionRule());
                    						}
                    						set(
                    							current,
                    							"abstract",
                    							lv_abstract_5_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1066:3: (otherlv_6= 'papers' otherlv_7= '{' ( (lv_papers_8_0= ruleTalk ) ) (otherlv_9= ',' ( (lv_papers_10_0= ruleTalk ) ) )* otherlv_11= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalProgram.g:1067:4: otherlv_6= 'papers' otherlv_7= '{' ( (lv_papers_8_0= ruleTalk ) ) (otherlv_9= ',' ( (lv_papers_10_0= ruleTalk ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,38,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getTalkSessionAccess().getPapersKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_34); 

                    				newLeafNode(otherlv_7, grammarAccess.getTalkSessionAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalProgram.g:1075:4: ( (lv_papers_8_0= ruleTalk ) )
                    // InternalProgram.g:1076:5: (lv_papers_8_0= ruleTalk )
                    {
                    // InternalProgram.g:1076:5: (lv_papers_8_0= ruleTalk )
                    // InternalProgram.g:1077:6: lv_papers_8_0= ruleTalk
                    {

                    						newCompositeNode(grammarAccess.getTalkSessionAccess().getPapersTalkParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_papers_8_0=ruleTalk();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTalkSessionRule());
                    						}
                    						add(
                    							current,
                    							"papers",
                    							lv_papers_8_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Talk");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:1094:4: (otherlv_9= ',' ( (lv_papers_10_0= ruleTalk ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==14) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalProgram.g:1095:5: otherlv_9= ',' ( (lv_papers_10_0= ruleTalk ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_34); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getTalkSessionAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalProgram.g:1099:5: ( (lv_papers_10_0= ruleTalk ) )
                    	    // InternalProgram.g:1100:6: (lv_papers_10_0= ruleTalk )
                    	    {
                    	    // InternalProgram.g:1100:6: (lv_papers_10_0= ruleTalk )
                    	    // InternalProgram.g:1101:7: lv_papers_10_0= ruleTalk
                    	    {

                    	    							newCompositeNode(grammarAccess.getTalkSessionAccess().getPapersTalkParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_papers_10_0=ruleTalk();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTalkSessionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"papers",
                    	    								lv_papers_10_0,
                    	    								"fr.inria.diverse.models2016.dsl.Program.Talk");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_35); 

                    				newLeafNode(otherlv_11, grammarAccess.getTalkSessionAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalProgram.g:1124:3: (otherlv_12= 'chair' ( (lv_chair_13_0= rulePerson ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalProgram.g:1125:4: otherlv_12= 'chair' ( (lv_chair_13_0= rulePerson ) )
                    {
                    otherlv_12=(Token)match(input,39,FOLLOW_36); 

                    				newLeafNode(otherlv_12, grammarAccess.getTalkSessionAccess().getChairKeyword_6_0());
                    			
                    // InternalProgram.g:1129:4: ( (lv_chair_13_0= rulePerson ) )
                    // InternalProgram.g:1130:5: (lv_chair_13_0= rulePerson )
                    {
                    // InternalProgram.g:1130:5: (lv_chair_13_0= rulePerson )
                    // InternalProgram.g:1131:6: lv_chair_13_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getTalkSessionAccess().getChairPersonParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_chair_13_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTalkSessionRule());
                    						}
                    						set(
                    							current,
                    							"chair",
                    							lv_chair_13_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getTalkSessionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleTalkSession"


    // $ANTLR start "entryRulePanel"
    // InternalProgram.g:1157:1: entryRulePanel returns [EObject current=null] : iv_rulePanel= rulePanel EOF ;
    public final EObject entryRulePanel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePanel = null;


        try {
            // InternalProgram.g:1157:46: (iv_rulePanel= rulePanel EOF )
            // InternalProgram.g:1158:2: iv_rulePanel= rulePanel EOF
            {
             newCompositeNode(grammarAccess.getPanelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePanel=rulePanel();

            state._fsp--;

             current =iv_rulePanel; 
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
    // $ANTLR end "entryRulePanel"


    // $ANTLR start "rulePanel"
    // InternalProgram.g:1164:1: rulePanel returns [EObject current=null] : (otherlv_0= 'Panel' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'panelists' otherlv_7= '{' ( (lv_panelists_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_panelists_10_0= rulePerson ) ) )* otherlv_11= '}' )? (otherlv_12= 'moderators' otherlv_13= '{' ( (lv_moderators_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_moderators_16_0= rulePerson ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject rulePanel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_abstract_5_0 = null;

        EObject lv_panelists_8_0 = null;

        EObject lv_panelists_10_0 = null;

        EObject lv_moderators_14_0 = null;

        EObject lv_moderators_16_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:1170:2: ( (otherlv_0= 'Panel' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'panelists' otherlv_7= '{' ( (lv_panelists_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_panelists_10_0= rulePerson ) ) )* otherlv_11= '}' )? (otherlv_12= 'moderators' otherlv_13= '{' ( (lv_moderators_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_moderators_16_0= rulePerson ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalProgram.g:1171:2: (otherlv_0= 'Panel' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'panelists' otherlv_7= '{' ( (lv_panelists_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_panelists_10_0= rulePerson ) ) )* otherlv_11= '}' )? (otherlv_12= 'moderators' otherlv_13= '{' ( (lv_moderators_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_moderators_16_0= rulePerson ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalProgram.g:1171:2: (otherlv_0= 'Panel' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'panelists' otherlv_7= '{' ( (lv_panelists_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_panelists_10_0= rulePerson ) ) )* otherlv_11= '}' )? (otherlv_12= 'moderators' otherlv_13= '{' ( (lv_moderators_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_moderators_16_0= rulePerson ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalProgram.g:1172:3: otherlv_0= 'Panel' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'panelists' otherlv_7= '{' ( (lv_panelists_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_panelists_10_0= rulePerson ) ) )* otherlv_11= '}' )? (otherlv_12= 'moderators' otherlv_13= '{' ( (lv_moderators_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_moderators_16_0= rulePerson ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPanelAccess().getPanelKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getPanelAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getPanelAccess().getTitleKeyword_2());
            		
            // InternalProgram.g:1184:3: ( (lv_name_3_0= ruleEString ) )
            // InternalProgram.g:1185:4: (lv_name_3_0= ruleEString )
            {
            // InternalProgram.g:1185:4: (lv_name_3_0= ruleEString )
            // InternalProgram.g:1186:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPanelAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_37);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPanelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:1203:3: (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==37) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalProgram.g:1204:4: otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getPanelAccess().getAbstractKeyword_4_0());
                    			
                    // InternalProgram.g:1208:4: ( (lv_abstract_5_0= ruleEString ) )
                    // InternalProgram.g:1209:5: (lv_abstract_5_0= ruleEString )
                    {
                    // InternalProgram.g:1209:5: (lv_abstract_5_0= ruleEString )
                    // InternalProgram.g:1210:6: lv_abstract_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPanelAccess().getAbstractEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_abstract_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPanelRule());
                    						}
                    						set(
                    							current,
                    							"abstract",
                    							lv_abstract_5_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1228:3: (otherlv_6= 'panelists' otherlv_7= '{' ( (lv_panelists_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_panelists_10_0= rulePerson ) ) )* otherlv_11= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==41) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalProgram.g:1229:4: otherlv_6= 'panelists' otherlv_7= '{' ( (lv_panelists_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_panelists_10_0= rulePerson ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,41,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getPanelAccess().getPanelistsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_36); 

                    				newLeafNode(otherlv_7, grammarAccess.getPanelAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalProgram.g:1237:4: ( (lv_panelists_8_0= rulePerson ) )
                    // InternalProgram.g:1238:5: (lv_panelists_8_0= rulePerson )
                    {
                    // InternalProgram.g:1238:5: (lv_panelists_8_0= rulePerson )
                    // InternalProgram.g:1239:6: lv_panelists_8_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getPanelAccess().getPanelistsPersonParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_panelists_8_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPanelRule());
                    						}
                    						add(
                    							current,
                    							"panelists",
                    							lv_panelists_8_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:1256:4: (otherlv_9= ',' ( (lv_panelists_10_0= rulePerson ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==14) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalProgram.g:1257:5: otherlv_9= ',' ( (lv_panelists_10_0= rulePerson ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_36); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getPanelAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalProgram.g:1261:5: ( (lv_panelists_10_0= rulePerson ) )
                    	    // InternalProgram.g:1262:6: (lv_panelists_10_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:1262:6: (lv_panelists_10_0= rulePerson )
                    	    // InternalProgram.g:1263:7: lv_panelists_10_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getPanelAccess().getPanelistsPersonParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_panelists_10_0=rulePerson();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPanelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"panelists",
                    	    								lv_panelists_10_0,
                    	    								"fr.inria.diverse.models2016.dsl.Program.Person");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_39); 

                    				newLeafNode(otherlv_11, grammarAccess.getPanelAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalProgram.g:1286:3: (otherlv_12= 'moderators' otherlv_13= '{' ( (lv_moderators_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_moderators_16_0= rulePerson ) ) )* otherlv_17= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==42) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalProgram.g:1287:4: otherlv_12= 'moderators' otherlv_13= '{' ( (lv_moderators_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_moderators_16_0= rulePerson ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,42,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getPanelAccess().getModeratorsKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_36); 

                    				newLeafNode(otherlv_13, grammarAccess.getPanelAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalProgram.g:1295:4: ( (lv_moderators_14_0= rulePerson ) )
                    // InternalProgram.g:1296:5: (lv_moderators_14_0= rulePerson )
                    {
                    // InternalProgram.g:1296:5: (lv_moderators_14_0= rulePerson )
                    // InternalProgram.g:1297:6: lv_moderators_14_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getPanelAccess().getModeratorsPersonParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_moderators_14_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPanelRule());
                    						}
                    						add(
                    							current,
                    							"moderators",
                    							lv_moderators_14_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:1314:4: (otherlv_15= ',' ( (lv_moderators_16_0= rulePerson ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==14) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalProgram.g:1315:5: otherlv_15= ',' ( (lv_moderators_16_0= rulePerson ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_36); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getPanelAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalProgram.g:1319:5: ( (lv_moderators_16_0= rulePerson ) )
                    	    // InternalProgram.g:1320:6: (lv_moderators_16_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:1320:6: (lv_moderators_16_0= rulePerson )
                    	    // InternalProgram.g:1321:7: lv_moderators_16_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getPanelAccess().getModeratorsPersonParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_moderators_16_0=rulePerson();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPanelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"moderators",
                    	    								lv_moderators_16_0,
                    	    								"fr.inria.diverse.models2016.dsl.Program.Person");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_17, grammarAccess.getPanelAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getPanelAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "rulePanel"


    // $ANTLR start "entryRuleWorkshop"
    // InternalProgram.g:1352:1: entryRuleWorkshop returns [EObject current=null] : iv_ruleWorkshop= ruleWorkshop EOF ;
    public final EObject entryRuleWorkshop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkshop = null;


        try {
            // InternalProgram.g:1352:49: (iv_ruleWorkshop= ruleWorkshop EOF )
            // InternalProgram.g:1353:2: iv_ruleWorkshop= ruleWorkshop EOF
            {
             newCompositeNode(grammarAccess.getWorkshopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkshop=ruleWorkshop();

            state._fsp--;

             current =iv_ruleWorkshop; 
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
    // $ANTLR end "entryRuleWorkshop"


    // $ANTLR start "ruleWorkshop"
    // InternalProgram.g:1359:1: ruleWorkshop returns [EObject current=null] : (otherlv_0= 'Workshop' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'url' ( (lv_url_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEString ) ) )? (otherlv_10= 'organizers' otherlv_11= '{' ( (lv_organizers_12_0= rulePerson ) ) (otherlv_13= ',' ( (lv_organizers_14_0= rulePerson ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleWorkshop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_abstract_5_0 = null;

        AntlrDatatypeRuleToken lv_url_7_0 = null;

        AntlrDatatypeRuleToken lv_id_9_0 = null;

        EObject lv_organizers_12_0 = null;

        EObject lv_organizers_14_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:1365:2: ( (otherlv_0= 'Workshop' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'url' ( (lv_url_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEString ) ) )? (otherlv_10= 'organizers' otherlv_11= '{' ( (lv_organizers_12_0= rulePerson ) ) (otherlv_13= ',' ( (lv_organizers_14_0= rulePerson ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalProgram.g:1366:2: (otherlv_0= 'Workshop' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'url' ( (lv_url_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEString ) ) )? (otherlv_10= 'organizers' otherlv_11= '{' ( (lv_organizers_12_0= rulePerson ) ) (otherlv_13= ',' ( (lv_organizers_14_0= rulePerson ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalProgram.g:1366:2: (otherlv_0= 'Workshop' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'url' ( (lv_url_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEString ) ) )? (otherlv_10= 'organizers' otherlv_11= '{' ( (lv_organizers_12_0= rulePerson ) ) (otherlv_13= ',' ( (lv_organizers_14_0= rulePerson ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalProgram.g:1367:3: otherlv_0= 'Workshop' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'url' ( (lv_url_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEString ) ) )? (otherlv_10= 'organizers' otherlv_11= '{' ( (lv_organizers_12_0= rulePerson ) ) (otherlv_13= ',' ( (lv_organizers_14_0= rulePerson ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkshopAccess().getWorkshopKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getWorkshopAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkshopAccess().getTitleKeyword_2());
            		
            // InternalProgram.g:1379:3: ( (lv_name_3_0= ruleEString ) )
            // InternalProgram.g:1380:4: (lv_name_3_0= ruleEString )
            {
            // InternalProgram.g:1380:4: (lv_name_3_0= ruleEString )
            // InternalProgram.g:1381:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWorkshopAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_40);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkshopRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:1398:3: (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==37) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalProgram.g:1399:4: otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getWorkshopAccess().getAbstractKeyword_4_0());
                    			
                    // InternalProgram.g:1403:4: ( (lv_abstract_5_0= ruleEString ) )
                    // InternalProgram.g:1404:5: (lv_abstract_5_0= ruleEString )
                    {
                    // InternalProgram.g:1404:5: (lv_abstract_5_0= ruleEString )
                    // InternalProgram.g:1405:6: lv_abstract_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getWorkshopAccess().getAbstractEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_abstract_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkshopRule());
                    						}
                    						set(
                    							current,
                    							"abstract",
                    							lv_abstract_5_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1423:3: (otherlv_6= 'url' ( (lv_url_7_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==44) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalProgram.g:1424:4: otherlv_6= 'url' ( (lv_url_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getWorkshopAccess().getUrlKeyword_5_0());
                    			
                    // InternalProgram.g:1428:4: ( (lv_url_7_0= ruleEString ) )
                    // InternalProgram.g:1429:5: (lv_url_7_0= ruleEString )
                    {
                    // InternalProgram.g:1429:5: (lv_url_7_0= ruleEString )
                    // InternalProgram.g:1430:6: lv_url_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getWorkshopAccess().getUrlEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_url_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkshopRule());
                    						}
                    						set(
                    							current,
                    							"url",
                    							lv_url_7_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1448:3: (otherlv_8= 'id' ( (lv_id_9_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==45) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalProgram.g:1449:4: otherlv_8= 'id' ( (lv_id_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getWorkshopAccess().getIdKeyword_6_0());
                    			
                    // InternalProgram.g:1453:4: ( (lv_id_9_0= ruleEString ) )
                    // InternalProgram.g:1454:5: (lv_id_9_0= ruleEString )
                    {
                    // InternalProgram.g:1454:5: (lv_id_9_0= ruleEString )
                    // InternalProgram.g:1455:6: lv_id_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getWorkshopAccess().getIdEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_id_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkshopRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_9_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1473:3: (otherlv_10= 'organizers' otherlv_11= '{' ( (lv_organizers_12_0= rulePerson ) ) (otherlv_13= ',' ( (lv_organizers_14_0= rulePerson ) ) )* otherlv_15= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==46) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalProgram.g:1474:4: otherlv_10= 'organizers' otherlv_11= '{' ( (lv_organizers_12_0= rulePerson ) ) (otherlv_13= ',' ( (lv_organizers_14_0= rulePerson ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,46,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getWorkshopAccess().getOrganizersKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_36); 

                    				newLeafNode(otherlv_11, grammarAccess.getWorkshopAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalProgram.g:1482:4: ( (lv_organizers_12_0= rulePerson ) )
                    // InternalProgram.g:1483:5: (lv_organizers_12_0= rulePerson )
                    {
                    // InternalProgram.g:1483:5: (lv_organizers_12_0= rulePerson )
                    // InternalProgram.g:1484:6: lv_organizers_12_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getWorkshopAccess().getOrganizersPersonParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_organizers_12_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkshopRule());
                    						}
                    						add(
                    							current,
                    							"organizers",
                    							lv_organizers_12_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:1501:4: (otherlv_13= ',' ( (lv_organizers_14_0= rulePerson ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==14) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalProgram.g:1502:5: otherlv_13= ',' ( (lv_organizers_14_0= rulePerson ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_36); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getWorkshopAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalProgram.g:1506:5: ( (lv_organizers_14_0= rulePerson ) )
                    	    // InternalProgram.g:1507:6: (lv_organizers_14_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:1507:6: (lv_organizers_14_0= rulePerson )
                    	    // InternalProgram.g:1508:7: lv_organizers_14_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getWorkshopAccess().getOrganizersPersonParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_organizers_14_0=rulePerson();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getWorkshopRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"organizers",
                    	    								lv_organizers_14_0,
                    	    								"fr.inria.diverse.models2016.dsl.Program.Person");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_15, grammarAccess.getWorkshopAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getWorkshopAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleWorkshop"


    // $ANTLR start "entryRuleTutorial"
    // InternalProgram.g:1539:1: entryRuleTutorial returns [EObject current=null] : iv_ruleTutorial= ruleTutorial EOF ;
    public final EObject entryRuleTutorial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTutorial = null;


        try {
            // InternalProgram.g:1539:49: (iv_ruleTutorial= ruleTutorial EOF )
            // InternalProgram.g:1540:2: iv_ruleTutorial= ruleTutorial EOF
            {
             newCompositeNode(grammarAccess.getTutorialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTutorial=ruleTutorial();

            state._fsp--;

             current =iv_ruleTutorial; 
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
    // $ANTLR end "entryRuleTutorial"


    // $ANTLR start "ruleTutorial"
    // InternalProgram.g:1546:1: ruleTutorial returns [EObject current=null] : (otherlv_0= 'Tutorial' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) )? (otherlv_8= 'organizers' otherlv_9= '{' ( (lv_organizers_10_0= rulePerson ) ) (otherlv_11= ',' ( (lv_organizers_12_0= rulePerson ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleTutorial() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_abstract_5_0 = null;

        AntlrDatatypeRuleToken lv_id_7_0 = null;

        EObject lv_organizers_10_0 = null;

        EObject lv_organizers_12_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:1552:2: ( (otherlv_0= 'Tutorial' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) )? (otherlv_8= 'organizers' otherlv_9= '{' ( (lv_organizers_10_0= rulePerson ) ) (otherlv_11= ',' ( (lv_organizers_12_0= rulePerson ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalProgram.g:1553:2: (otherlv_0= 'Tutorial' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) )? (otherlv_8= 'organizers' otherlv_9= '{' ( (lv_organizers_10_0= rulePerson ) ) (otherlv_11= ',' ( (lv_organizers_12_0= rulePerson ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalProgram.g:1553:2: (otherlv_0= 'Tutorial' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) )? (otherlv_8= 'organizers' otherlv_9= '{' ( (lv_organizers_10_0= rulePerson ) ) (otherlv_11= ',' ( (lv_organizers_12_0= rulePerson ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalProgram.g:1554:3: otherlv_0= 'Tutorial' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) )? (otherlv_8= 'organizers' otherlv_9= '{' ( (lv_organizers_10_0= rulePerson ) ) (otherlv_11= ',' ( (lv_organizers_12_0= rulePerson ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTutorialAccess().getTutorialKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getTutorialAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTutorialAccess().getTitleKeyword_2());
            		
            // InternalProgram.g:1566:3: ( (lv_name_3_0= ruleEString ) )
            // InternalProgram.g:1567:4: (lv_name_3_0= ruleEString )
            {
            // InternalProgram.g:1567:4: (lv_name_3_0= ruleEString )
            // InternalProgram.g:1568:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTutorialAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_44);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTutorialRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:1585:3: (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==37) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalProgram.g:1586:4: otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTutorialAccess().getAbstractKeyword_4_0());
                    			
                    // InternalProgram.g:1590:4: ( (lv_abstract_5_0= ruleEString ) )
                    // InternalProgram.g:1591:5: (lv_abstract_5_0= ruleEString )
                    {
                    // InternalProgram.g:1591:5: (lv_abstract_5_0= ruleEString )
                    // InternalProgram.g:1592:6: lv_abstract_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTutorialAccess().getAbstractEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_abstract_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTutorialRule());
                    						}
                    						set(
                    							current,
                    							"abstract",
                    							lv_abstract_5_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1610:3: (otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==45) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalProgram.g:1611:4: otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getTutorialAccess().getIdKeyword_5_0());
                    			
                    // InternalProgram.g:1615:4: ( (lv_id_7_0= ruleEString ) )
                    // InternalProgram.g:1616:5: (lv_id_7_0= ruleEString )
                    {
                    // InternalProgram.g:1616:5: (lv_id_7_0= ruleEString )
                    // InternalProgram.g:1617:6: lv_id_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTutorialAccess().getIdEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_id_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTutorialRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_7_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1635:3: (otherlv_8= 'organizers' otherlv_9= '{' ( (lv_organizers_10_0= rulePerson ) ) (otherlv_11= ',' ( (lv_organizers_12_0= rulePerson ) ) )* otherlv_13= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==46) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalProgram.g:1636:4: otherlv_8= 'organizers' otherlv_9= '{' ( (lv_organizers_10_0= rulePerson ) ) (otherlv_11= ',' ( (lv_organizers_12_0= rulePerson ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,46,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getTutorialAccess().getOrganizersKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_36); 

                    				newLeafNode(otherlv_9, grammarAccess.getTutorialAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalProgram.g:1644:4: ( (lv_organizers_10_0= rulePerson ) )
                    // InternalProgram.g:1645:5: (lv_organizers_10_0= rulePerson )
                    {
                    // InternalProgram.g:1645:5: (lv_organizers_10_0= rulePerson )
                    // InternalProgram.g:1646:6: lv_organizers_10_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getTutorialAccess().getOrganizersPersonParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_organizers_10_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTutorialRule());
                    						}
                    						add(
                    							current,
                    							"organizers",
                    							lv_organizers_10_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:1663:4: (otherlv_11= ',' ( (lv_organizers_12_0= rulePerson ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==14) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalProgram.g:1664:5: otherlv_11= ',' ( (lv_organizers_12_0= rulePerson ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_36); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getTutorialAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalProgram.g:1668:5: ( (lv_organizers_12_0= rulePerson ) )
                    	    // InternalProgram.g:1669:6: (lv_organizers_12_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:1669:6: (lv_organizers_12_0= rulePerson )
                    	    // InternalProgram.g:1670:7: lv_organizers_12_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getTutorialAccess().getOrganizersPersonParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_organizers_12_0=rulePerson();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTutorialRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"organizers",
                    	    								lv_organizers_12_0,
                    	    								"fr.inria.diverse.models2016.dsl.Program.Person");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_13, grammarAccess.getTutorialAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getTutorialAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleTutorial"


    // $ANTLR start "entryRuleDoctoralSymposium"
    // InternalProgram.g:1701:1: entryRuleDoctoralSymposium returns [EObject current=null] : iv_ruleDoctoralSymposium= ruleDoctoralSymposium EOF ;
    public final EObject entryRuleDoctoralSymposium() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoctoralSymposium = null;


        try {
            // InternalProgram.g:1701:58: (iv_ruleDoctoralSymposium= ruleDoctoralSymposium EOF )
            // InternalProgram.g:1702:2: iv_ruleDoctoralSymposium= ruleDoctoralSymposium EOF
            {
             newCompositeNode(grammarAccess.getDoctoralSymposiumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoctoralSymposium=ruleDoctoralSymposium();

            state._fsp--;

             current =iv_ruleDoctoralSymposium; 
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
    // $ANTLR end "entryRuleDoctoralSymposium"


    // $ANTLR start "ruleDoctoralSymposium"
    // InternalProgram.g:1708:1: ruleDoctoralSymposium returns [EObject current=null] : (otherlv_0= 'DoctoralSymposium' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'organizers' otherlv_7= '{' ( (lv_organizers_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_organizers_10_0= rulePerson ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleDoctoralSymposium() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_abstract_5_0 = null;

        EObject lv_organizers_8_0 = null;

        EObject lv_organizers_10_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:1714:2: ( (otherlv_0= 'DoctoralSymposium' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'organizers' otherlv_7= '{' ( (lv_organizers_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_organizers_10_0= rulePerson ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalProgram.g:1715:2: (otherlv_0= 'DoctoralSymposium' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'organizers' otherlv_7= '{' ( (lv_organizers_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_organizers_10_0= rulePerson ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalProgram.g:1715:2: (otherlv_0= 'DoctoralSymposium' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'organizers' otherlv_7= '{' ( (lv_organizers_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_organizers_10_0= rulePerson ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalProgram.g:1716:3: otherlv_0= 'DoctoralSymposium' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'organizers' otherlv_7= '{' ( (lv_organizers_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_organizers_10_0= rulePerson ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDoctoralSymposiumAccess().getDoctoralSymposiumKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getDoctoralSymposiumAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getDoctoralSymposiumAccess().getTitleKeyword_2());
            		
            // InternalProgram.g:1728:3: ( (lv_name_3_0= ruleEString ) )
            // InternalProgram.g:1729:4: (lv_name_3_0= ruleEString )
            {
            // InternalProgram.g:1729:4: (lv_name_3_0= ruleEString )
            // InternalProgram.g:1730:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDoctoralSymposiumAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_45);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDoctoralSymposiumRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:1747:3: (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==37) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalProgram.g:1748:4: otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getDoctoralSymposiumAccess().getAbstractKeyword_4_0());
                    			
                    // InternalProgram.g:1752:4: ( (lv_abstract_5_0= ruleEString ) )
                    // InternalProgram.g:1753:5: (lv_abstract_5_0= ruleEString )
                    {
                    // InternalProgram.g:1753:5: (lv_abstract_5_0= ruleEString )
                    // InternalProgram.g:1754:6: lv_abstract_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDoctoralSymposiumAccess().getAbstractEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_abstract_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDoctoralSymposiumRule());
                    						}
                    						set(
                    							current,
                    							"abstract",
                    							lv_abstract_5_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1772:3: (otherlv_6= 'organizers' otherlv_7= '{' ( (lv_organizers_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_organizers_10_0= rulePerson ) ) )* otherlv_11= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==46) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalProgram.g:1773:4: otherlv_6= 'organizers' otherlv_7= '{' ( (lv_organizers_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_organizers_10_0= rulePerson ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getDoctoralSymposiumAccess().getOrganizersKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_36); 

                    				newLeafNode(otherlv_7, grammarAccess.getDoctoralSymposiumAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalProgram.g:1781:4: ( (lv_organizers_8_0= rulePerson ) )
                    // InternalProgram.g:1782:5: (lv_organizers_8_0= rulePerson )
                    {
                    // InternalProgram.g:1782:5: (lv_organizers_8_0= rulePerson )
                    // InternalProgram.g:1783:6: lv_organizers_8_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getDoctoralSymposiumAccess().getOrganizersPersonParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_organizers_8_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDoctoralSymposiumRule());
                    						}
                    						add(
                    							current,
                    							"organizers",
                    							lv_organizers_8_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:1800:4: (otherlv_9= ',' ( (lv_organizers_10_0= rulePerson ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==14) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalProgram.g:1801:5: otherlv_9= ',' ( (lv_organizers_10_0= rulePerson ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_36); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getDoctoralSymposiumAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalProgram.g:1805:5: ( (lv_organizers_10_0= rulePerson ) )
                    	    // InternalProgram.g:1806:6: (lv_organizers_10_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:1806:6: (lv_organizers_10_0= rulePerson )
                    	    // InternalProgram.g:1807:7: lv_organizers_10_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getDoctoralSymposiumAccess().getOrganizersPersonParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_organizers_10_0=rulePerson();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDoctoralSymposiumRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"organizers",
                    	    								lv_organizers_10_0,
                    	    								"fr.inria.diverse.models2016.dsl.Program.Person");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getDoctoralSymposiumAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getDoctoralSymposiumAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleDoctoralSymposium"


    // $ANTLR start "entryRuleEducatorSymposium"
    // InternalProgram.g:1838:1: entryRuleEducatorSymposium returns [EObject current=null] : iv_ruleEducatorSymposium= ruleEducatorSymposium EOF ;
    public final EObject entryRuleEducatorSymposium() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEducatorSymposium = null;


        try {
            // InternalProgram.g:1838:58: (iv_ruleEducatorSymposium= ruleEducatorSymposium EOF )
            // InternalProgram.g:1839:2: iv_ruleEducatorSymposium= ruleEducatorSymposium EOF
            {
             newCompositeNode(grammarAccess.getEducatorSymposiumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEducatorSymposium=ruleEducatorSymposium();

            state._fsp--;

             current =iv_ruleEducatorSymposium; 
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
    // $ANTLR end "entryRuleEducatorSymposium"


    // $ANTLR start "ruleEducatorSymposium"
    // InternalProgram.g:1845:1: ruleEducatorSymposium returns [EObject current=null] : (otherlv_0= 'EducatorSymposium' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'organizers' otherlv_7= '{' ( (lv_organizers_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_organizers_10_0= rulePerson ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleEducatorSymposium() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_abstract_5_0 = null;

        EObject lv_organizers_8_0 = null;

        EObject lv_organizers_10_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:1851:2: ( (otherlv_0= 'EducatorSymposium' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'organizers' otherlv_7= '{' ( (lv_organizers_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_organizers_10_0= rulePerson ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalProgram.g:1852:2: (otherlv_0= 'EducatorSymposium' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'organizers' otherlv_7= '{' ( (lv_organizers_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_organizers_10_0= rulePerson ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalProgram.g:1852:2: (otherlv_0= 'EducatorSymposium' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'organizers' otherlv_7= '{' ( (lv_organizers_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_organizers_10_0= rulePerson ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalProgram.g:1853:3: otherlv_0= 'EducatorSymposium' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'organizers' otherlv_7= '{' ( (lv_organizers_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_organizers_10_0= rulePerson ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEducatorSymposiumAccess().getEducatorSymposiumKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getEducatorSymposiumAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getEducatorSymposiumAccess().getTitleKeyword_2());
            		
            // InternalProgram.g:1865:3: ( (lv_name_3_0= ruleEString ) )
            // InternalProgram.g:1866:4: (lv_name_3_0= ruleEString )
            {
            // InternalProgram.g:1866:4: (lv_name_3_0= ruleEString )
            // InternalProgram.g:1867:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEducatorSymposiumAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_45);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEducatorSymposiumRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:1884:3: (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==37) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalProgram.g:1885:4: otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEducatorSymposiumAccess().getAbstractKeyword_4_0());
                    			
                    // InternalProgram.g:1889:4: ( (lv_abstract_5_0= ruleEString ) )
                    // InternalProgram.g:1890:5: (lv_abstract_5_0= ruleEString )
                    {
                    // InternalProgram.g:1890:5: (lv_abstract_5_0= ruleEString )
                    // InternalProgram.g:1891:6: lv_abstract_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEducatorSymposiumAccess().getAbstractEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_abstract_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEducatorSymposiumRule());
                    						}
                    						set(
                    							current,
                    							"abstract",
                    							lv_abstract_5_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1909:3: (otherlv_6= 'organizers' otherlv_7= '{' ( (lv_organizers_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_organizers_10_0= rulePerson ) ) )* otherlv_11= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==46) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalProgram.g:1910:4: otherlv_6= 'organizers' otherlv_7= '{' ( (lv_organizers_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_organizers_10_0= rulePerson ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getEducatorSymposiumAccess().getOrganizersKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_36); 

                    				newLeafNode(otherlv_7, grammarAccess.getEducatorSymposiumAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalProgram.g:1918:4: ( (lv_organizers_8_0= rulePerson ) )
                    // InternalProgram.g:1919:5: (lv_organizers_8_0= rulePerson )
                    {
                    // InternalProgram.g:1919:5: (lv_organizers_8_0= rulePerson )
                    // InternalProgram.g:1920:6: lv_organizers_8_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getEducatorSymposiumAccess().getOrganizersPersonParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_organizers_8_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEducatorSymposiumRule());
                    						}
                    						add(
                    							current,
                    							"organizers",
                    							lv_organizers_8_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:1937:4: (otherlv_9= ',' ( (lv_organizers_10_0= rulePerson ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==14) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalProgram.g:1938:5: otherlv_9= ',' ( (lv_organizers_10_0= rulePerson ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_36); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getEducatorSymposiumAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalProgram.g:1942:5: ( (lv_organizers_10_0= rulePerson ) )
                    	    // InternalProgram.g:1943:6: (lv_organizers_10_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:1943:6: (lv_organizers_10_0= rulePerson )
                    	    // InternalProgram.g:1944:7: lv_organizers_10_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getEducatorSymposiumAccess().getOrganizersPersonParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_organizers_10_0=rulePerson();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEducatorSymposiumRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"organizers",
                    	    								lv_organizers_10_0,
                    	    								"fr.inria.diverse.models2016.dsl.Program.Person");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getEducatorSymposiumAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getEducatorSymposiumAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleEducatorSymposium"


    // $ANTLR start "entryRuleReception"
    // InternalProgram.g:1975:1: entryRuleReception returns [EObject current=null] : iv_ruleReception= ruleReception EOF ;
    public final EObject entryRuleReception() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReception = null;


        try {
            // InternalProgram.g:1975:50: (iv_ruleReception= ruleReception EOF )
            // InternalProgram.g:1976:2: iv_ruleReception= ruleReception EOF
            {
             newCompositeNode(grammarAccess.getReceptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReception=ruleReception();

            state._fsp--;

             current =iv_ruleReception; 
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
    // $ANTLR end "entryRuleReception"


    // $ANTLR start "ruleReception"
    // InternalProgram.g:1982:1: ruleReception returns [EObject current=null] : (otherlv_0= 'Reception' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleReception() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_abstract_5_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:1988:2: ( (otherlv_0= 'Reception' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalProgram.g:1989:2: (otherlv_0= 'Reception' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalProgram.g:1989:2: (otherlv_0= 'Reception' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalProgram.g:1990:3: otherlv_0= 'Reception' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getReceptionAccess().getReceptionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getReceptionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getReceptionAccess().getTitleKeyword_2());
            		
            // InternalProgram.g:2002:3: ( (lv_name_3_0= ruleEString ) )
            // InternalProgram.g:2003:4: (lv_name_3_0= ruleEString )
            {
            // InternalProgram.g:2003:4: (lv_name_3_0= ruleEString )
            // InternalProgram.g:2004:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReceptionAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_46);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReceptionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:2021:3: (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==37) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalProgram.g:2022:4: otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getReceptionAccess().getAbstractKeyword_4_0());
                    			
                    // InternalProgram.g:2026:4: ( (lv_abstract_5_0= ruleEString ) )
                    // InternalProgram.g:2027:5: (lv_abstract_5_0= ruleEString )
                    {
                    // InternalProgram.g:2027:5: (lv_abstract_5_0= ruleEString )
                    // InternalProgram.g:2028:6: lv_abstract_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getReceptionAccess().getAbstractEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_abstract_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReceptionRule());
                    						}
                    						set(
                    							current,
                    							"abstract",
                    							lv_abstract_5_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getReceptionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleReception"


    // $ANTLR start "entryRuleClinic"
    // InternalProgram.g:2054:1: entryRuleClinic returns [EObject current=null] : iv_ruleClinic= ruleClinic EOF ;
    public final EObject entryRuleClinic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClinic = null;


        try {
            // InternalProgram.g:2054:47: (iv_ruleClinic= ruleClinic EOF )
            // InternalProgram.g:2055:2: iv_ruleClinic= ruleClinic EOF
            {
             newCompositeNode(grammarAccess.getClinicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClinic=ruleClinic();

            state._fsp--;

             current =iv_ruleClinic; 
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
    // $ANTLR end "entryRuleClinic"


    // $ANTLR start "ruleClinic"
    // InternalProgram.g:2061:1: ruleClinic returns [EObject current=null] : (otherlv_0= 'Clinic' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleClinic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_abstract_5_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:2067:2: ( (otherlv_0= 'Clinic' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalProgram.g:2068:2: (otherlv_0= 'Clinic' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalProgram.g:2068:2: (otherlv_0= 'Clinic' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalProgram.g:2069:3: otherlv_0= 'Clinic' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getClinicAccess().getClinicKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getClinicAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getClinicAccess().getTitleKeyword_2());
            		
            // InternalProgram.g:2081:3: ( (lv_name_3_0= ruleEString ) )
            // InternalProgram.g:2082:4: (lv_name_3_0= ruleEString )
            {
            // InternalProgram.g:2082:4: (lv_name_3_0= ruleEString )
            // InternalProgram.g:2083:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClinicAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_46);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClinicRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:2100:3: (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==37) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalProgram.g:2101:4: otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getClinicAccess().getAbstractKeyword_4_0());
                    			
                    // InternalProgram.g:2105:4: ( (lv_abstract_5_0= ruleEString ) )
                    // InternalProgram.g:2106:5: (lv_abstract_5_0= ruleEString )
                    {
                    // InternalProgram.g:2106:5: (lv_abstract_5_0= ruleEString )
                    // InternalProgram.g:2107:6: lv_abstract_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getClinicAccess().getAbstractEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_abstract_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClinicRule());
                    						}
                    						set(
                    							current,
                    							"abstract",
                    							lv_abstract_5_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getClinicAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleClinic"


    // $ANTLR start "entryRuleLunch"
    // InternalProgram.g:2133:1: entryRuleLunch returns [EObject current=null] : iv_ruleLunch= ruleLunch EOF ;
    public final EObject entryRuleLunch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLunch = null;


        try {
            // InternalProgram.g:2133:46: (iv_ruleLunch= ruleLunch EOF )
            // InternalProgram.g:2134:2: iv_ruleLunch= ruleLunch EOF
            {
             newCompositeNode(grammarAccess.getLunchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLunch=ruleLunch();

            state._fsp--;

             current =iv_ruleLunch; 
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
    // $ANTLR end "entryRuleLunch"


    // $ANTLR start "ruleLunch"
    // InternalProgram.g:2140:1: ruleLunch returns [EObject current=null] : (otherlv_0= 'Lunch' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleLunch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_abstract_5_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:2146:2: ( (otherlv_0= 'Lunch' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalProgram.g:2147:2: (otherlv_0= 'Lunch' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalProgram.g:2147:2: (otherlv_0= 'Lunch' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalProgram.g:2148:3: otherlv_0= 'Lunch' otherlv_1= '{' otherlv_2= 'title' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLunchAccess().getLunchKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getLunchAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getLunchAccess().getTitleKeyword_2());
            		
            // InternalProgram.g:2160:3: ( (lv_name_3_0= ruleEString ) )
            // InternalProgram.g:2161:4: (lv_name_3_0= ruleEString )
            {
            // InternalProgram.g:2161:4: (lv_name_3_0= ruleEString )
            // InternalProgram.g:2162:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLunchAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_46);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLunchRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:2179:3: (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==37) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalProgram.g:2180:4: otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getLunchAccess().getAbstractKeyword_4_0());
                    			
                    // InternalProgram.g:2184:4: ( (lv_abstract_5_0= ruleEString ) )
                    // InternalProgram.g:2185:5: (lv_abstract_5_0= ruleEString )
                    {
                    // InternalProgram.g:2185:5: (lv_abstract_5_0= ruleEString )
                    // InternalProgram.g:2186:6: lv_abstract_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLunchAccess().getAbstractEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_abstract_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLunchRule());
                    						}
                    						set(
                    							current,
                    							"abstract",
                    							lv_abstract_5_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLunchAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleLunch"


    // $ANTLR start "entryRuleTalk"
    // InternalProgram.g:2212:1: entryRuleTalk returns [EObject current=null] : iv_ruleTalk= ruleTalk EOF ;
    public final EObject entryRuleTalk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTalk = null;


        try {
            // InternalProgram.g:2212:45: (iv_ruleTalk= ruleTalk EOF )
            // InternalProgram.g:2213:2: iv_ruleTalk= ruleTalk EOF
            {
             newCompositeNode(grammarAccess.getTalkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTalk=ruleTalk();

            state._fsp--;

             current =iv_ruleTalk; 
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
    // $ANTLR end "entryRuleTalk"


    // $ANTLR start "ruleTalk"
    // InternalProgram.g:2219:1: ruleTalk returns [EObject current=null] : ( () otherlv_1= 'Talk' otherlv_2= '{' (otherlv_3= 'preprint' ( (lv_preprint_4_0= ruleEString ) ) )? (otherlv_5= 'kind' ( (lv_kind_6_0= ruleTrack ) ) )? (otherlv_7= 'authors' otherlv_8= '{' ( (lv_authors_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_authors_11_0= rulePerson ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleTalk() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_preprint_4_0 = null;

        Enumerator lv_kind_6_0 = null;

        EObject lv_authors_9_0 = null;

        EObject lv_authors_11_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:2225:2: ( ( () otherlv_1= 'Talk' otherlv_2= '{' (otherlv_3= 'preprint' ( (lv_preprint_4_0= ruleEString ) ) )? (otherlv_5= 'kind' ( (lv_kind_6_0= ruleTrack ) ) )? (otherlv_7= 'authors' otherlv_8= '{' ( (lv_authors_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_authors_11_0= rulePerson ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // InternalProgram.g:2226:2: ( () otherlv_1= 'Talk' otherlv_2= '{' (otherlv_3= 'preprint' ( (lv_preprint_4_0= ruleEString ) ) )? (otherlv_5= 'kind' ( (lv_kind_6_0= ruleTrack ) ) )? (otherlv_7= 'authors' otherlv_8= '{' ( (lv_authors_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_authors_11_0= rulePerson ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // InternalProgram.g:2226:2: ( () otherlv_1= 'Talk' otherlv_2= '{' (otherlv_3= 'preprint' ( (lv_preprint_4_0= ruleEString ) ) )? (otherlv_5= 'kind' ( (lv_kind_6_0= ruleTrack ) ) )? (otherlv_7= 'authors' otherlv_8= '{' ( (lv_authors_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_authors_11_0= rulePerson ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // InternalProgram.g:2227:3: () otherlv_1= 'Talk' otherlv_2= '{' (otherlv_3= 'preprint' ( (lv_preprint_4_0= ruleEString ) ) )? (otherlv_5= 'kind' ( (lv_kind_6_0= ruleTrack ) ) )? (otherlv_7= 'authors' otherlv_8= '{' ( (lv_authors_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_authors_11_0= rulePerson ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // InternalProgram.g:2227:3: ()
            // InternalProgram.g:2228:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTalkAccess().getTalkAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,53,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTalkAccess().getTalkKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getTalkAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalProgram.g:2242:3: (otherlv_3= 'preprint' ( (lv_preprint_4_0= ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==54) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalProgram.g:2243:4: otherlv_3= 'preprint' ( (lv_preprint_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,54,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTalkAccess().getPreprintKeyword_3_0());
                    			
                    // InternalProgram.g:2247:4: ( (lv_preprint_4_0= ruleEString ) )
                    // InternalProgram.g:2248:5: (lv_preprint_4_0= ruleEString )
                    {
                    // InternalProgram.g:2248:5: (lv_preprint_4_0= ruleEString )
                    // InternalProgram.g:2249:6: lv_preprint_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTalkAccess().getPreprintEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_preprint_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTalkRule());
                    						}
                    						set(
                    							current,
                    							"preprint",
                    							lv_preprint_4_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:2267:3: (otherlv_5= 'kind' ( (lv_kind_6_0= ruleTrack ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==55) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalProgram.g:2268:4: otherlv_5= 'kind' ( (lv_kind_6_0= ruleTrack ) )
                    {
                    otherlv_5=(Token)match(input,55,FOLLOW_49); 

                    				newLeafNode(otherlv_5, grammarAccess.getTalkAccess().getKindKeyword_4_0());
                    			
                    // InternalProgram.g:2272:4: ( (lv_kind_6_0= ruleTrack ) )
                    // InternalProgram.g:2273:5: (lv_kind_6_0= ruleTrack )
                    {
                    // InternalProgram.g:2273:5: (lv_kind_6_0= ruleTrack )
                    // InternalProgram.g:2274:6: lv_kind_6_0= ruleTrack
                    {

                    						newCompositeNode(grammarAccess.getTalkAccess().getKindTrackEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_50);
                    lv_kind_6_0=ruleTrack();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTalkRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_6_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Track");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:2292:3: (otherlv_7= 'authors' otherlv_8= '{' ( (lv_authors_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_authors_11_0= rulePerson ) ) )* otherlv_12= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==56) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalProgram.g:2293:4: otherlv_7= 'authors' otherlv_8= '{' ( (lv_authors_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_authors_11_0= rulePerson ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,56,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getTalkAccess().getAuthorsKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_36); 

                    				newLeafNode(otherlv_8, grammarAccess.getTalkAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalProgram.g:2301:4: ( (lv_authors_9_0= rulePerson ) )
                    // InternalProgram.g:2302:5: (lv_authors_9_0= rulePerson )
                    {
                    // InternalProgram.g:2302:5: (lv_authors_9_0= rulePerson )
                    // InternalProgram.g:2303:6: lv_authors_9_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getTalkAccess().getAuthorsPersonParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_authors_9_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTalkRule());
                    						}
                    						add(
                    							current,
                    							"authors",
                    							lv_authors_9_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:2320:4: (otherlv_10= ',' ( (lv_authors_11_0= rulePerson ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==14) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalProgram.g:2321:5: otherlv_10= ',' ( (lv_authors_11_0= rulePerson ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_36); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getTalkAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalProgram.g:2325:5: ( (lv_authors_11_0= rulePerson ) )
                    	    // InternalProgram.g:2326:6: (lv_authors_11_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:2326:6: (lv_authors_11_0= rulePerson )
                    	    // InternalProgram.g:2327:7: lv_authors_11_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getTalkAccess().getAuthorsPersonParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_authors_11_0=rulePerson();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTalkRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"authors",
                    	    								lv_authors_11_0,
                    	    								"fr.inria.diverse.models2016.dsl.Program.Person");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getTalkAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getTalkAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleTalk"


    // $ANTLR start "entryRulePerson"
    // InternalProgram.g:2358:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalProgram.g:2358:47: (iv_rulePerson= rulePerson EOF )
            // InternalProgram.g:2359:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalProgram.g:2365:1: rulePerson returns [EObject current=null] : ( () otherlv_1= 'Person' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'email' ( (lv_email_5_0= ruleEString ) ) )? (otherlv_6= 'homepage' ( (lv_homepage_7_0= ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_email_5_0 = null;

        AntlrDatatypeRuleToken lv_homepage_7_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:2371:2: ( ( () otherlv_1= 'Person' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'email' ( (lv_email_5_0= ruleEString ) ) )? (otherlv_6= 'homepage' ( (lv_homepage_7_0= ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalProgram.g:2372:2: ( () otherlv_1= 'Person' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'email' ( (lv_email_5_0= ruleEString ) ) )? (otherlv_6= 'homepage' ( (lv_homepage_7_0= ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalProgram.g:2372:2: ( () otherlv_1= 'Person' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'email' ( (lv_email_5_0= ruleEString ) ) )? (otherlv_6= 'homepage' ( (lv_homepage_7_0= ruleEString ) ) )? otherlv_8= '}' )
            // InternalProgram.g:2373:3: () otherlv_1= 'Person' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'email' ( (lv_email_5_0= ruleEString ) ) )? (otherlv_6= 'homepage' ( (lv_homepage_7_0= ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalProgram.g:2373:3: ()
            // InternalProgram.g:2374:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPersonAccess().getPersonAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonAccess().getPersonKeyword_1());
            		
            // InternalProgram.g:2384:3: ( (lv_name_2_0= ruleEString ) )
            // InternalProgram.g:2385:4: (lv_name_2_0= ruleEString )
            {
            // InternalProgram.g:2385:4: (lv_name_2_0= ruleEString )
            // InternalProgram.g:2386:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPersonAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_51); 

            			newLeafNode(otherlv_3, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalProgram.g:2407:3: (otherlv_4= 'email' ( (lv_email_5_0= ruleEString ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==58) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalProgram.g:2408:4: otherlv_4= 'email' ( (lv_email_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,58,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getPersonAccess().getEmailKeyword_4_0());
                    			
                    // InternalProgram.g:2412:4: ( (lv_email_5_0= ruleEString ) )
                    // InternalProgram.g:2413:5: (lv_email_5_0= ruleEString )
                    {
                    // InternalProgram.g:2413:5: (lv_email_5_0= ruleEString )
                    // InternalProgram.g:2414:6: lv_email_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getEmailEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_email_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						set(
                    							current,
                    							"email",
                    							lv_email_5_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:2432:3: (otherlv_6= 'homepage' ( (lv_homepage_7_0= ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==59) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalProgram.g:2433:4: otherlv_6= 'homepage' ( (lv_homepage_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,59,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getPersonAccess().getHomepageKeyword_5_0());
                    			
                    // InternalProgram.g:2437:4: ( (lv_homepage_7_0= ruleEString ) )
                    // InternalProgram.g:2438:5: (lv_homepage_7_0= ruleEString )
                    {
                    // InternalProgram.g:2438:5: (lv_homepage_7_0= ruleEString )
                    // InternalProgram.g:2439:6: lv_homepage_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getHomepageEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_homepage_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						set(
                    							current,
                    							"homepage",
                    							lv_homepage_7_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "rulePerson"


    // $ANTLR start "ruleWeekDay"
    // InternalProgram.g:2465:1: ruleWeekDay returns [Enumerator current=null] : ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) ) ;
    public final Enumerator ruleWeekDay() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalProgram.g:2471:2: ( ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) ) )
            // InternalProgram.g:2472:2: ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) )
            {
            // InternalProgram.g:2472:2: ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) )
            int alt53=7;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt53=1;
                }
                break;
            case 61:
                {
                alt53=2;
                }
                break;
            case 62:
                {
                alt53=3;
                }
                break;
            case 63:
                {
                alt53=4;
                }
                break;
            case 64:
                {
                alt53=5;
                }
                break;
            case 65:
                {
                alt53=6;
                }
                break;
            case 66:
                {
                alt53=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalProgram.g:2473:3: (enumLiteral_0= 'Monday' )
                    {
                    // InternalProgram.g:2473:3: (enumLiteral_0= 'Monday' )
                    // InternalProgram.g:2474:4: enumLiteral_0= 'Monday'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getMondayEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWeekDayAccess().getMondayEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalProgram.g:2481:3: (enumLiteral_1= 'Tuesday' )
                    {
                    // InternalProgram.g:2481:3: (enumLiteral_1= 'Tuesday' )
                    // InternalProgram.g:2482:4: enumLiteral_1= 'Tuesday'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getTuesdayEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWeekDayAccess().getTuesdayEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalProgram.g:2489:3: (enumLiteral_2= 'Wednesday' )
                    {
                    // InternalProgram.g:2489:3: (enumLiteral_2= 'Wednesday' )
                    // InternalProgram.g:2490:4: enumLiteral_2= 'Wednesday'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getWednesdayEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWeekDayAccess().getWednesdayEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalProgram.g:2497:3: (enumLiteral_3= 'Thursday' )
                    {
                    // InternalProgram.g:2497:3: (enumLiteral_3= 'Thursday' )
                    // InternalProgram.g:2498:4: enumLiteral_3= 'Thursday'
                    {
                    enumLiteral_3=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getThursdayEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWeekDayAccess().getThursdayEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalProgram.g:2505:3: (enumLiteral_4= 'Friday' )
                    {
                    // InternalProgram.g:2505:3: (enumLiteral_4= 'Friday' )
                    // InternalProgram.g:2506:4: enumLiteral_4= 'Friday'
                    {
                    enumLiteral_4=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getFridayEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getWeekDayAccess().getFridayEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalProgram.g:2513:3: (enumLiteral_5= 'Saturday' )
                    {
                    // InternalProgram.g:2513:3: (enumLiteral_5= 'Saturday' )
                    // InternalProgram.g:2514:4: enumLiteral_5= 'Saturday'
                    {
                    enumLiteral_5=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getSaturdayEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getWeekDayAccess().getSaturdayEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalProgram.g:2521:3: (enumLiteral_6= 'Sunday' )
                    {
                    // InternalProgram.g:2521:3: (enumLiteral_6= 'Sunday' )
                    // InternalProgram.g:2522:4: enumLiteral_6= 'Sunday'
                    {
                    enumLiteral_6=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getSundayEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getWeekDayAccess().getSundayEnumLiteralDeclaration_6());
                    			

                    }


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
    // $ANTLR end "ruleWeekDay"


    // $ANTLR start "ruleTrack"
    // InternalProgram.g:2532:1: ruleTrack returns [Enumerator current=null] : ( (enumLiteral_0= 'PracticeAndInnovation' ) | (enumLiteral_1= 'Research' ) ) ;
    public final Enumerator ruleTrack() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalProgram.g:2538:2: ( ( (enumLiteral_0= 'PracticeAndInnovation' ) | (enumLiteral_1= 'Research' ) ) )
            // InternalProgram.g:2539:2: ( (enumLiteral_0= 'PracticeAndInnovation' ) | (enumLiteral_1= 'Research' ) )
            {
            // InternalProgram.g:2539:2: ( (enumLiteral_0= 'PracticeAndInnovation' ) | (enumLiteral_1= 'Research' ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==67) ) {
                alt54=1;
            }
            else if ( (LA54_0==68) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalProgram.g:2540:3: (enumLiteral_0= 'PracticeAndInnovation' )
                    {
                    // InternalProgram.g:2540:3: (enumLiteral_0= 'PracticeAndInnovation' )
                    // InternalProgram.g:2541:4: enumLiteral_0= 'PracticeAndInnovation'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getTrackAccess().getPracticeAndInnovationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTrackAccess().getPracticeAndInnovationEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalProgram.g:2548:3: (enumLiteral_1= 'Research' )
                    {
                    // InternalProgram.g:2548:3: (enumLiteral_1= 'Research' )
                    // InternalProgram.g:2549:4: enumLiteral_1= 'Research'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getTrackAccess().getResearchEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTrackAccess().getResearchEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleTrack"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000003A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x001F890800000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0xF000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000006008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000004C0018000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000480018000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400018000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000E000008000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000C000008000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000008000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000062000008000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000060000008000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000008000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000702000008000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000700000008000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000600000008000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000400000008000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000602000008000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000402000008000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000002000008000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x01C0000000008000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0180000000008000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0100000000008000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0C00000000008000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0800000000008000L});

}