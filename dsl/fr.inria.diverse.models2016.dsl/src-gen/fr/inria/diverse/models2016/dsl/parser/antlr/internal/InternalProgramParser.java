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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'resources'", "'papers'", "'{'", "';'", "'}'", "'events'", "'program'", "'room'", "'capacity'", "'date'", "'.'", "':'", "'-'", "'in'", "','", "'TalkSession'", "'chair'", "'abstract'", "'Panel'", "'panelists'", "'moderators'", "'Workshop'", "'url'", "'id'", "'organizers'", "'Tutorial'", "'DoctoralSymposium'", "'EducatorSymposium'", "'Reception'", "'Clinic'", "'Lunch'", "'CoffeeBreak'", "'authors'", "'preprint'", "'kind'", "'email'", "'homepage'", "'Monday'", "'Tuesday'", "'Wednesday'", "'Thursday'", "'Friday'", "'Saturday'", "'Sunday'", "'Practice and Innovation'", "'Research'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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
    // InternalProgram.g:72:1: ruleConference returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'resources' ( (lv_resources_3_0= ruleResource ) ) ( (lv_resources_4_0= ruleResource ) )* )? (otherlv_5= 'papers' otherlv_6= '{' ( (lv_papers_7_0= rulePaper ) ) (otherlv_8= ';' ( (lv_papers_9_0= rulePaper ) ) )* )? otherlv_10= '}' (otherlv_11= 'events' otherlv_12= '{' ( (lv_events_13_0= ruleEvent ) ) (otherlv_14= ';' ( (lv_events_15_0= ruleEvent ) ) )* )? otherlv_16= '}' (otherlv_17= 'program' ( (lv_program_18_0= ruleProgram ) ) )? ) ;
    public final EObject ruleConference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_resources_3_0 = null;

        EObject lv_resources_4_0 = null;

        EObject lv_papers_7_0 = null;

        EObject lv_papers_9_0 = null;

        EObject lv_events_13_0 = null;

        EObject lv_events_15_0 = null;

        EObject lv_program_18_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:78:2: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'resources' ( (lv_resources_3_0= ruleResource ) ) ( (lv_resources_4_0= ruleResource ) )* )? (otherlv_5= 'papers' otherlv_6= '{' ( (lv_papers_7_0= rulePaper ) ) (otherlv_8= ';' ( (lv_papers_9_0= rulePaper ) ) )* )? otherlv_10= '}' (otherlv_11= 'events' otherlv_12= '{' ( (lv_events_13_0= ruleEvent ) ) (otherlv_14= ';' ( (lv_events_15_0= ruleEvent ) ) )* )? otherlv_16= '}' (otherlv_17= 'program' ( (lv_program_18_0= ruleProgram ) ) )? ) )
            // InternalProgram.g:79:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'resources' ( (lv_resources_3_0= ruleResource ) ) ( (lv_resources_4_0= ruleResource ) )* )? (otherlv_5= 'papers' otherlv_6= '{' ( (lv_papers_7_0= rulePaper ) ) (otherlv_8= ';' ( (lv_papers_9_0= rulePaper ) ) )* )? otherlv_10= '}' (otherlv_11= 'events' otherlv_12= '{' ( (lv_events_13_0= ruleEvent ) ) (otherlv_14= ';' ( (lv_events_15_0= ruleEvent ) ) )* )? otherlv_16= '}' (otherlv_17= 'program' ( (lv_program_18_0= ruleProgram ) ) )? )
            {
            // InternalProgram.g:79:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'resources' ( (lv_resources_3_0= ruleResource ) ) ( (lv_resources_4_0= ruleResource ) )* )? (otherlv_5= 'papers' otherlv_6= '{' ( (lv_papers_7_0= rulePaper ) ) (otherlv_8= ';' ( (lv_papers_9_0= rulePaper ) ) )* )? otherlv_10= '}' (otherlv_11= 'events' otherlv_12= '{' ( (lv_events_13_0= ruleEvent ) ) (otherlv_14= ';' ( (lv_events_15_0= ruleEvent ) ) )* )? otherlv_16= '}' (otherlv_17= 'program' ( (lv_program_18_0= ruleProgram ) ) )? )
            // InternalProgram.g:80:3: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'resources' ( (lv_resources_3_0= ruleResource ) ) ( (lv_resources_4_0= ruleResource ) )* )? (otherlv_5= 'papers' otherlv_6= '{' ( (lv_papers_7_0= rulePaper ) ) (otherlv_8= ';' ( (lv_papers_9_0= rulePaper ) ) )* )? otherlv_10= '}' (otherlv_11= 'events' otherlv_12= '{' ( (lv_events_13_0= ruleEvent ) ) (otherlv_14= ';' ( (lv_events_15_0= ruleEvent ) ) )* )? otherlv_16= '}' (otherlv_17= 'program' ( (lv_program_18_0= ruleProgram ) ) )?
            {
            // InternalProgram.g:80:3: ()
            // InternalProgram.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConferenceAccess().getConferenceAction_0(),
            					current);
            			

            }

            // InternalProgram.g:87:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:88:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:88:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:89:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConferenceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConferenceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:106:3: (otherlv_2= 'resources' ( (lv_resources_3_0= ruleResource ) ) ( (lv_resources_4_0= ruleResource ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalProgram.g:107:4: otherlv_2= 'resources' ( (lv_resources_3_0= ruleResource ) ) ( (lv_resources_4_0= ruleResource ) )*
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getConferenceAccess().getResourcesKeyword_2_0());
                    			
                    // InternalProgram.g:111:4: ( (lv_resources_3_0= ruleResource ) )
                    // InternalProgram.g:112:5: (lv_resources_3_0= ruleResource )
                    {
                    // InternalProgram.g:112:5: (lv_resources_3_0= ruleResource )
                    // InternalProgram.g:113:6: lv_resources_3_0= ruleResource
                    {

                    						newCompositeNode(grammarAccess.getConferenceAccess().getResourcesResourceParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_resources_3_0=ruleResource();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConferenceRule());
                    						}
                    						add(
                    							current,
                    							"resources",
                    							lv_resources_3_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Resource");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:130:4: ( (lv_resources_4_0= ruleResource ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==18) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalProgram.g:131:5: (lv_resources_4_0= ruleResource )
                    	    {
                    	    // InternalProgram.g:131:5: (lv_resources_4_0= ruleResource )
                    	    // InternalProgram.g:132:6: lv_resources_4_0= ruleResource
                    	    {

                    	    						newCompositeNode(grammarAccess.getConferenceAccess().getResourcesResourceParserRuleCall_2_2_0());
                    	    					
                    	    pushFollow(FOLLOW_5);
                    	    lv_resources_4_0=ruleResource();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getConferenceRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"resources",
                    	    							lv_resources_4_0,
                    	    							"fr.inria.diverse.models2016.dsl.Program.Resource");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalProgram.g:150:3: (otherlv_5= 'papers' otherlv_6= '{' ( (lv_papers_7_0= rulePaper ) ) (otherlv_8= ';' ( (lv_papers_9_0= rulePaper ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalProgram.g:151:4: otherlv_5= 'papers' otherlv_6= '{' ( (lv_papers_7_0= rulePaper ) ) (otherlv_8= ';' ( (lv_papers_9_0= rulePaper ) ) )*
                    {
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getConferenceAccess().getPapersKeyword_3_0());
                    			
                    otherlv_6=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getConferenceAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalProgram.g:159:4: ( (lv_papers_7_0= rulePaper ) )
                    // InternalProgram.g:160:5: (lv_papers_7_0= rulePaper )
                    {
                    // InternalProgram.g:160:5: (lv_papers_7_0= rulePaper )
                    // InternalProgram.g:161:6: lv_papers_7_0= rulePaper
                    {

                    						newCompositeNode(grammarAccess.getConferenceAccess().getPapersPaperParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_papers_7_0=rulePaper();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConferenceRule());
                    						}
                    						add(
                    							current,
                    							"papers",
                    							lv_papers_7_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Paper");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:178:4: (otherlv_8= ';' ( (lv_papers_9_0= rulePaper ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalProgram.g:179:5: otherlv_8= ';' ( (lv_papers_9_0= rulePaper ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_7); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getConferenceAccess().getSemicolonKeyword_3_3_0());
                    	    				
                    	    // InternalProgram.g:183:5: ( (lv_papers_9_0= rulePaper ) )
                    	    // InternalProgram.g:184:6: (lv_papers_9_0= rulePaper )
                    	    {
                    	    // InternalProgram.g:184:6: (lv_papers_9_0= rulePaper )
                    	    // InternalProgram.g:185:7: lv_papers_9_0= rulePaper
                    	    {

                    	    							newCompositeNode(grammarAccess.getConferenceAccess().getPapersPaperParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_papers_9_0=rulePaper();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConferenceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"papers",
                    	    								lv_papers_9_0,
                    	    								"fr.inria.diverse.models2016.dsl.Program.Paper");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_10, grammarAccess.getConferenceAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalProgram.g:208:3: (otherlv_11= 'events' otherlv_12= '{' ( (lv_events_13_0= ruleEvent ) ) (otherlv_14= ';' ( (lv_events_15_0= ruleEvent ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalProgram.g:209:4: otherlv_11= 'events' otherlv_12= '{' ( (lv_events_13_0= ruleEvent ) ) (otherlv_14= ';' ( (lv_events_15_0= ruleEvent ) ) )*
                    {
                    otherlv_11=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getConferenceAccess().getEventsKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,13,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getConferenceAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalProgram.g:217:4: ( (lv_events_13_0= ruleEvent ) )
                    // InternalProgram.g:218:5: (lv_events_13_0= ruleEvent )
                    {
                    // InternalProgram.g:218:5: (lv_events_13_0= ruleEvent )
                    // InternalProgram.g:219:6: lv_events_13_0= ruleEvent
                    {

                    						newCompositeNode(grammarAccess.getConferenceAccess().getEventsEventParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_events_13_0=ruleEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConferenceRule());
                    						}
                    						add(
                    							current,
                    							"events",
                    							lv_events_13_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Event");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:236:4: (otherlv_14= ';' ( (lv_events_15_0= ruleEvent ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalProgram.g:237:5: otherlv_14= ';' ( (lv_events_15_0= ruleEvent ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getConferenceAccess().getSemicolonKeyword_5_3_0());
                    	    				
                    	    // InternalProgram.g:241:5: ( (lv_events_15_0= ruleEvent ) )
                    	    // InternalProgram.g:242:6: (lv_events_15_0= ruleEvent )
                    	    {
                    	    // InternalProgram.g:242:6: (lv_events_15_0= ruleEvent )
                    	    // InternalProgram.g:243:7: lv_events_15_0= ruleEvent
                    	    {

                    	    							newCompositeNode(grammarAccess.getConferenceAccess().getEventsEventParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_events_15_0=ruleEvent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConferenceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"events",
                    	    								lv_events_15_0,
                    	    								"fr.inria.diverse.models2016.dsl.Program.Event");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_16, grammarAccess.getConferenceAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalProgram.g:266:3: (otherlv_17= 'program' ( (lv_program_18_0= ruleProgram ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalProgram.g:267:4: otherlv_17= 'program' ( (lv_program_18_0= ruleProgram ) )
                    {
                    otherlv_17=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_17, grammarAccess.getConferenceAccess().getProgramKeyword_7_0());
                    			
                    // InternalProgram.g:271:4: ( (lv_program_18_0= ruleProgram ) )
                    // InternalProgram.g:272:5: (lv_program_18_0= ruleProgram )
                    {
                    // InternalProgram.g:272:5: (lv_program_18_0= ruleProgram )
                    // InternalProgram.g:273:6: lv_program_18_0= ruleProgram
                    {

                    						newCompositeNode(grammarAccess.getConferenceAccess().getProgramProgramParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_program_18_0=ruleProgram();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConferenceRule());
                    						}
                    						set(
                    							current,
                    							"program",
                    							lv_program_18_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Program");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleConference"


    // $ANTLR start "entryRuleResource"
    // InternalProgram.g:295:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalProgram.g:295:49: (iv_ruleResource= ruleResource EOF )
            // InternalProgram.g:296:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalProgram.g:302:1: ruleResource returns [EObject current=null] : this_Room_0= ruleRoom ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        EObject this_Room_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:308:2: (this_Room_0= ruleRoom )
            // InternalProgram.g:309:2: this_Room_0= ruleRoom
            {

            		newCompositeNode(grammarAccess.getResourceAccess().getRoomParserRuleCall());
            	
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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleEvent"
    // InternalProgram.g:320:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalProgram.g:320:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalProgram.g:321:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalProgram.g:327:1: ruleEvent returns [EObject current=null] : (this_TalkSession_0= ruleTalkSession | this_Panel_1= rulePanel | this_Workshop_2= ruleWorkshop | this_Tutorial_3= ruleTutorial | this_DoctoralSymposium_4= ruleDoctoralSymposium | this_EducatorSymposium_5= ruleEducatorSymposium | this_Reception_6= ruleReception | this_Clinic_7= ruleClinic | this_Lunch_8= ruleLunch | this_CoffeeBreak_9= ruleCoffeeBreak ) ;
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

        EObject this_CoffeeBreak_9 = null;



        	enterRule();

        try {
            // InternalProgram.g:333:2: ( (this_TalkSession_0= ruleTalkSession | this_Panel_1= rulePanel | this_Workshop_2= ruleWorkshop | this_Tutorial_3= ruleTutorial | this_DoctoralSymposium_4= ruleDoctoralSymposium | this_EducatorSymposium_5= ruleEducatorSymposium | this_Reception_6= ruleReception | this_Clinic_7= ruleClinic | this_Lunch_8= ruleLunch | this_CoffeeBreak_9= ruleCoffeeBreak ) )
            // InternalProgram.g:334:2: (this_TalkSession_0= ruleTalkSession | this_Panel_1= rulePanel | this_Workshop_2= ruleWorkshop | this_Tutorial_3= ruleTutorial | this_DoctoralSymposium_4= ruleDoctoralSymposium | this_EducatorSymposium_5= ruleEducatorSymposium | this_Reception_6= ruleReception | this_Clinic_7= ruleClinic | this_Lunch_8= ruleLunch | this_CoffeeBreak_9= ruleCoffeeBreak )
            {
            // InternalProgram.g:334:2: (this_TalkSession_0= ruleTalkSession | this_Panel_1= rulePanel | this_Workshop_2= ruleWorkshop | this_Tutorial_3= ruleTutorial | this_DoctoralSymposium_4= ruleDoctoralSymposium | this_EducatorSymposium_5= ruleEducatorSymposium | this_Reception_6= ruleReception | this_Clinic_7= ruleClinic | this_Lunch_8= ruleLunch | this_CoffeeBreak_9= ruleCoffeeBreak )
            int alt8=10;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt8=1;
                }
                break;
            case 29:
                {
                alt8=2;
                }
                break;
            case 32:
                {
                alt8=3;
                }
                break;
            case 36:
                {
                alt8=4;
                }
                break;
            case 37:
                {
                alt8=5;
                }
                break;
            case 38:
                {
                alt8=6;
                }
                break;
            case 39:
                {
                alt8=7;
                }
                break;
            case 40:
                {
                alt8=8;
                }
                break;
            case 41:
                {
                alt8=9;
                }
                break;
            case 42:
                {
                alt8=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalProgram.g:335:3: this_TalkSession_0= ruleTalkSession
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
                    // InternalProgram.g:344:3: this_Panel_1= rulePanel
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
                    // InternalProgram.g:353:3: this_Workshop_2= ruleWorkshop
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
                    // InternalProgram.g:362:3: this_Tutorial_3= ruleTutorial
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
                    // InternalProgram.g:371:3: this_DoctoralSymposium_4= ruleDoctoralSymposium
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
                    // InternalProgram.g:380:3: this_EducatorSymposium_5= ruleEducatorSymposium
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
                    // InternalProgram.g:389:3: this_Reception_6= ruleReception
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
                    // InternalProgram.g:398:3: this_Clinic_7= ruleClinic
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
                    // InternalProgram.g:407:3: this_Lunch_8= ruleLunch
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getLunchParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Lunch_8=ruleLunch();

                    state._fsp--;


                    			current = this_Lunch_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalProgram.g:416:3: this_CoffeeBreak_9= ruleCoffeeBreak
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getCoffeeBreakParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_CoffeeBreak_9=ruleCoffeeBreak();

                    state._fsp--;


                    			current = this_CoffeeBreak_9;
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
    // InternalProgram.g:428:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalProgram.g:428:47: (iv_ruleEString= ruleEString EOF )
            // InternalProgram.g:429:2: iv_ruleEString= ruleEString EOF
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
    // InternalProgram.g:435:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalProgram.g:441:2: (this_STRING_0= RULE_STRING )
            // InternalProgram.g:442:2: this_STRING_0= RULE_STRING
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
    // InternalProgram.g:452:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalProgram.g:452:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalProgram.g:453:2: iv_ruleProgram= ruleProgram EOF
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
    // InternalProgram.g:459:1: ruleProgram returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )* )? otherlv_4= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_days_2_0 = null;

        EObject lv_days_3_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:465:2: ( ( () otherlv_1= '{' ( ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )* )? otherlv_4= '}' ) )
            // InternalProgram.g:466:2: ( () otherlv_1= '{' ( ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )* )? otherlv_4= '}' )
            {
            // InternalProgram.g:466:2: ( () otherlv_1= '{' ( ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )* )? otherlv_4= '}' )
            // InternalProgram.g:467:3: () otherlv_1= '{' ( ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )* )? otherlv_4= '}'
            {
            // InternalProgram.g:467:3: ()
            // InternalProgram.g:468:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProgramAccess().getProgramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalProgram.g:478:3: ( ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=48 && LA10_0<=54)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalProgram.g:479:4: ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )*
                    {
                    // InternalProgram.g:479:4: ( (lv_days_2_0= ruleDay ) )
                    // InternalProgram.g:480:5: (lv_days_2_0= ruleDay )
                    {
                    // InternalProgram.g:480:5: (lv_days_2_0= ruleDay )
                    // InternalProgram.g:481:6: lv_days_2_0= ruleDay
                    {

                    						newCompositeNode(grammarAccess.getProgramAccess().getDaysDayParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_days_2_0=ruleDay();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProgramRule());
                    						}
                    						add(
                    							current,
                    							"days",
                    							lv_days_2_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Day");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:498:4: ( (lv_days_3_0= ruleDay ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=48 && LA9_0<=54)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalProgram.g:499:5: (lv_days_3_0= ruleDay )
                    	    {
                    	    // InternalProgram.g:499:5: (lv_days_3_0= ruleDay )
                    	    // InternalProgram.g:500:6: lv_days_3_0= ruleDay
                    	    {

                    	    						newCompositeNode(grammarAccess.getProgramAccess().getDaysDayParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    lv_days_3_0=ruleDay();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getProgramRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"days",
                    	    							lv_days_3_0,
                    	    							"fr.inria.diverse.models2016.dsl.Program.Day");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_3());
            		

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
    // InternalProgram.g:526:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // InternalProgram.g:526:45: (iv_ruleRoom= ruleRoom EOF )
            // InternalProgram.g:527:2: iv_ruleRoom= ruleRoom EOF
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
    // InternalProgram.g:533:1: ruleRoom returns [EObject current=null] : ( () otherlv_1= 'room' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEIntegerObject ) ) )? ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_capacity_4_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:539:2: ( ( () otherlv_1= 'room' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEIntegerObject ) ) )? ) )
            // InternalProgram.g:540:2: ( () otherlv_1= 'room' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEIntegerObject ) ) )? )
            {
            // InternalProgram.g:540:2: ( () otherlv_1= 'room' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEIntegerObject ) ) )? )
            // InternalProgram.g:541:3: () otherlv_1= 'room' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEIntegerObject ) ) )?
            {
            // InternalProgram.g:541:3: ()
            // InternalProgram.g:542:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoomAccess().getRoomAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getRoomAccess().getRoomKeyword_1());
            		
            // InternalProgram.g:552:3: ( (lv_name_2_0= ruleEString ) )
            // InternalProgram.g:553:4: (lv_name_2_0= ruleEString )
            {
            // InternalProgram.g:553:4: (lv_name_2_0= ruleEString )
            // InternalProgram.g:554:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoomAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalProgram.g:571:3: (otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEIntegerObject ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalProgram.g:572:4: otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEIntegerObject ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getRoomAccess().getCapacityKeyword_3_0());
                    			
                    // InternalProgram.g:576:4: ( (lv_capacity_4_0= ruleEIntegerObject ) )
                    // InternalProgram.g:577:5: (lv_capacity_4_0= ruleEIntegerObject )
                    {
                    // InternalProgram.g:577:5: (lv_capacity_4_0= ruleEIntegerObject )
                    // InternalProgram.g:578:6: lv_capacity_4_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getRoomAccess().getCapacityEIntegerObjectParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_capacity_4_0=ruleEIntegerObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoomRule());
                    						}
                    						set(
                    							current,
                    							"capacity",
                    							lv_capacity_4_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EIntegerObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleRoom"


    // $ANTLR start "entryRuleEIntegerObject"
    // InternalProgram.g:600:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // InternalProgram.g:600:54: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // InternalProgram.g:601:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
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
    // InternalProgram.g:607:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalProgram.g:613:2: (this_INT_0= RULE_INT )
            // InternalProgram.g:614:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall());
            	

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
    // InternalProgram.g:624:1: entryRuleDay returns [EObject current=null] : iv_ruleDay= ruleDay EOF ;
    public final EObject entryRuleDay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDay = null;


        try {
            // InternalProgram.g:624:44: (iv_ruleDay= ruleDay EOF )
            // InternalProgram.g:625:2: iv_ruleDay= ruleDay EOF
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
    // InternalProgram.g:631:1: ruleDay returns [EObject current=null] : ( ( (lv_weekday_0_0= ruleWeekDay ) ) (otherlv_1= 'date' ( (lv_date_2_0= ruleDayDataType ) ) )? ( ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )* )? ) ;
    public final EObject ruleDay() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_weekday_0_0 = null;

        AntlrDatatypeRuleToken lv_date_2_0 = null;

        EObject lv_sessions_3_0 = null;

        EObject lv_sessions_4_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:637:2: ( ( ( (lv_weekday_0_0= ruleWeekDay ) ) (otherlv_1= 'date' ( (lv_date_2_0= ruleDayDataType ) ) )? ( ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )* )? ) )
            // InternalProgram.g:638:2: ( ( (lv_weekday_0_0= ruleWeekDay ) ) (otherlv_1= 'date' ( (lv_date_2_0= ruleDayDataType ) ) )? ( ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )* )? )
            {
            // InternalProgram.g:638:2: ( ( (lv_weekday_0_0= ruleWeekDay ) ) (otherlv_1= 'date' ( (lv_date_2_0= ruleDayDataType ) ) )? ( ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )* )? )
            // InternalProgram.g:639:3: ( (lv_weekday_0_0= ruleWeekDay ) ) (otherlv_1= 'date' ( (lv_date_2_0= ruleDayDataType ) ) )? ( ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )* )?
            {
            // InternalProgram.g:639:3: ( (lv_weekday_0_0= ruleWeekDay ) )
            // InternalProgram.g:640:4: (lv_weekday_0_0= ruleWeekDay )
            {
            // InternalProgram.g:640:4: (lv_weekday_0_0= ruleWeekDay )
            // InternalProgram.g:641:5: lv_weekday_0_0= ruleWeekDay
            {

            					newCompositeNode(grammarAccess.getDayAccess().getWeekdayWeekDayEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_weekday_0_0=ruleWeekDay();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDayRule());
            					}
            					set(
            						current,
            						"weekday",
            						lv_weekday_0_0,
            						"fr.inria.diverse.models2016.dsl.Program.WeekDay");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:658:3: (otherlv_1= 'date' ( (lv_date_2_0= ruleDayDataType ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalProgram.g:659:4: otherlv_1= 'date' ( (lv_date_2_0= ruleDayDataType ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getDayAccess().getDateKeyword_1_0());
                    			
                    // InternalProgram.g:663:4: ( (lv_date_2_0= ruleDayDataType ) )
                    // InternalProgram.g:664:5: (lv_date_2_0= ruleDayDataType )
                    {
                    // InternalProgram.g:664:5: (lv_date_2_0= ruleDayDataType )
                    // InternalProgram.g:665:6: lv_date_2_0= ruleDayDataType
                    {

                    						newCompositeNode(grammarAccess.getDayAccess().getDateDayDataTypeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_date_2_0=ruleDayDataType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDayRule());
                    						}
                    						set(
                    							current,
                    							"date",
                    							lv_date_2_0,
                    							"fr.inria.diverse.models2016.dsl.Program.DayDataType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:683:3: ( ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalProgram.g:684:4: ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )*
                    {
                    // InternalProgram.g:684:4: ( (lv_sessions_3_0= ruleSession ) )
                    // InternalProgram.g:685:5: (lv_sessions_3_0= ruleSession )
                    {
                    // InternalProgram.g:685:5: (lv_sessions_3_0= ruleSession )
                    // InternalProgram.g:686:6: lv_sessions_3_0= ruleSession
                    {

                    						newCompositeNode(grammarAccess.getDayAccess().getSessionsSessionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_sessions_3_0=ruleSession();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDayRule());
                    						}
                    						add(
                    							current,
                    							"sessions",
                    							lv_sessions_3_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Session");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:703:4: ( (lv_sessions_4_0= ruleSession ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_INT) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalProgram.g:704:5: (lv_sessions_4_0= ruleSession )
                    	    {
                    	    // InternalProgram.g:704:5: (lv_sessions_4_0= ruleSession )
                    	    // InternalProgram.g:705:6: lv_sessions_4_0= ruleSession
                    	    {

                    	    						newCompositeNode(grammarAccess.getDayAccess().getSessionsSessionParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
                    	    lv_sessions_4_0=ruleSession();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDayRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"sessions",
                    	    							lv_sessions_4_0,
                    	    							"fr.inria.diverse.models2016.dsl.Program.Session");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "ruleDay"


    // $ANTLR start "entryRuleDayDataType"
    // InternalProgram.g:727:1: entryRuleDayDataType returns [String current=null] : iv_ruleDayDataType= ruleDayDataType EOF ;
    public final String entryRuleDayDataType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDayDataType = null;


        try {
            // InternalProgram.g:727:51: (iv_ruleDayDataType= ruleDayDataType EOF )
            // InternalProgram.g:728:2: iv_ruleDayDataType= ruleDayDataType EOF
            {
             newCompositeNode(grammarAccess.getDayDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDayDataType=ruleDayDataType();

            state._fsp--;

             current =iv_ruleDayDataType.getText(); 
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
    // $ANTLR end "entryRuleDayDataType"


    // $ANTLR start "ruleDayDataType"
    // InternalProgram.g:734:1: ruleDayDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDayDataType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalProgram.g:740:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) )
            // InternalProgram.g:741:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
            {
            // InternalProgram.g:741:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
            // InternalProgram.g:742:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDayDataTypeAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,21,FOLLOW_14); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDayDataTypeAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_17); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDayDataTypeAccess().getINTTerminalRuleCall_2());
            		
            kw=(Token)match(input,21,FOLLOW_14); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDayDataTypeAccess().getFullStopKeyword_3());
            		
            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_4);
            		

            			newLeafNode(this_INT_4, grammarAccess.getDayDataTypeAccess().getINTTerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleDayDataType"


    // $ANTLR start "entryRuleHourDataType"
    // InternalProgram.g:777:1: entryRuleHourDataType returns [String current=null] : iv_ruleHourDataType= ruleHourDataType EOF ;
    public final String entryRuleHourDataType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHourDataType = null;


        try {
            // InternalProgram.g:777:52: (iv_ruleHourDataType= ruleHourDataType EOF )
            // InternalProgram.g:778:2: iv_ruleHourDataType= ruleHourDataType EOF
            {
             newCompositeNode(grammarAccess.getHourDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHourDataType=ruleHourDataType();

            state._fsp--;

             current =iv_ruleHourDataType.getText(); 
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
    // $ANTLR end "entryRuleHourDataType"


    // $ANTLR start "ruleHourDataType"
    // InternalProgram.g:784:1: ruleHourDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= ':' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleHourDataType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalProgram.g:790:2: ( (this_INT_0= RULE_INT kw= ':' this_INT_2= RULE_INT ) )
            // InternalProgram.g:791:2: (this_INT_0= RULE_INT kw= ':' this_INT_2= RULE_INT )
            {
            // InternalProgram.g:791:2: (this_INT_0= RULE_INT kw= ':' this_INT_2= RULE_INT )
            // InternalProgram.g:792:3: this_INT_0= RULE_INT kw= ':' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getHourDataTypeAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,22,FOLLOW_14); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getHourDataTypeAccess().getColonKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getHourDataTypeAccess().getINTTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleHourDataType"


    // $ANTLR start "entryRuleSession"
    // InternalProgram.g:815:1: entryRuleSession returns [EObject current=null] : iv_ruleSession= ruleSession EOF ;
    public final EObject entryRuleSession() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSession = null;


        try {
            // InternalProgram.g:815:48: (iv_ruleSession= ruleSession EOF )
            // InternalProgram.g:816:2: iv_ruleSession= ruleSession EOF
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
    // InternalProgram.g:822:1: ruleSession returns [EObject current=null] : ( () ( (lv_startingTime_1_0= ruleHourDataType ) ) otherlv_2= '-' ( (lv_endingTime_3_0= ruleHourDataType ) ) otherlv_4= 'in' ( ( ruleEString ) ) otherlv_6= ':' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleSession() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_startingTime_1_0 = null;

        AntlrDatatypeRuleToken lv_endingTime_3_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:828:2: ( ( () ( (lv_startingTime_1_0= ruleHourDataType ) ) otherlv_2= '-' ( (lv_endingTime_3_0= ruleHourDataType ) ) otherlv_4= 'in' ( ( ruleEString ) ) otherlv_6= ':' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) )
            // InternalProgram.g:829:2: ( () ( (lv_startingTime_1_0= ruleHourDataType ) ) otherlv_2= '-' ( (lv_endingTime_3_0= ruleHourDataType ) ) otherlv_4= 'in' ( ( ruleEString ) ) otherlv_6= ':' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )
            {
            // InternalProgram.g:829:2: ( () ( (lv_startingTime_1_0= ruleHourDataType ) ) otherlv_2= '-' ( (lv_endingTime_3_0= ruleHourDataType ) ) otherlv_4= 'in' ( ( ruleEString ) ) otherlv_6= ':' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )
            // InternalProgram.g:830:3: () ( (lv_startingTime_1_0= ruleHourDataType ) ) otherlv_2= '-' ( (lv_endingTime_3_0= ruleHourDataType ) ) otherlv_4= 'in' ( ( ruleEString ) ) otherlv_6= ':' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )*
            {
            // InternalProgram.g:830:3: ()
            // InternalProgram.g:831:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSessionAccess().getSessionAction_0(),
            					current);
            			

            }

            // InternalProgram.g:837:3: ( (lv_startingTime_1_0= ruleHourDataType ) )
            // InternalProgram.g:838:4: (lv_startingTime_1_0= ruleHourDataType )
            {
            // InternalProgram.g:838:4: (lv_startingTime_1_0= ruleHourDataType )
            // InternalProgram.g:839:5: lv_startingTime_1_0= ruleHourDataType
            {

            					newCompositeNode(grammarAccess.getSessionAccess().getStartingTimeHourDataTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_startingTime_1_0=ruleHourDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSessionRule());
            					}
            					set(
            						current,
            						"startingTime",
            						lv_startingTime_1_0,
            						"fr.inria.diverse.models2016.dsl.Program.HourDataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getSessionAccess().getHyphenMinusKeyword_2());
            		
            // InternalProgram.g:860:3: ( (lv_endingTime_3_0= ruleHourDataType ) )
            // InternalProgram.g:861:4: (lv_endingTime_3_0= ruleHourDataType )
            {
            // InternalProgram.g:861:4: (lv_endingTime_3_0= ruleHourDataType )
            // InternalProgram.g:862:5: lv_endingTime_3_0= ruleHourDataType
            {

            					newCompositeNode(grammarAccess.getSessionAccess().getEndingTimeHourDataTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_endingTime_3_0=ruleHourDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSessionRule());
            					}
            					set(
            						current,
            						"endingTime",
            						lv_endingTime_3_0,
            						"fr.inria.diverse.models2016.dsl.Program.HourDataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getSessionAccess().getInKeyword_4());
            		
            // InternalProgram.g:883:3: ( ( ruleEString ) )
            // InternalProgram.g:884:4: ( ruleEString )
            {
            // InternalProgram.g:884:4: ( ruleEString )
            // InternalProgram.g:885:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSessionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSessionAccess().getRoomRoomCrossReference_5_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getSessionAccess().getColonKeyword_6());
            		
            // InternalProgram.g:903:3: ( ( ruleEString ) )
            // InternalProgram.g:904:4: ( ruleEString )
            {
            // InternalProgram.g:904:4: ( ruleEString )
            // InternalProgram.g:905:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSessionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSessionAccess().getEventsEventCrossReference_7_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:919:3: (otherlv_8= ',' ( ( ruleEString ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==25) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalProgram.g:920:4: otherlv_8= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,25,FOLLOW_7); 

            	    				newLeafNode(otherlv_8, grammarAccess.getSessionAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalProgram.g:924:4: ( ( ruleEString ) )
            	    // InternalProgram.g:925:5: ( ruleEString )
            	    {
            	    // InternalProgram.g:925:5: ( ruleEString )
            	    // InternalProgram.g:926:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSessionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getSessionAccess().getEventsEventCrossReference_8_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
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
    // $ANTLR end "ruleSession"


    // $ANTLR start "entryRuleTalkSession"
    // InternalProgram.g:945:1: entryRuleTalkSession returns [EObject current=null] : iv_ruleTalkSession= ruleTalkSession EOF ;
    public final EObject entryRuleTalkSession() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTalkSession = null;


        try {
            // InternalProgram.g:945:52: (iv_ruleTalkSession= ruleTalkSession EOF )
            // InternalProgram.g:946:2: iv_ruleTalkSession= ruleTalkSession EOF
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
    // InternalProgram.g:952:1: ruleTalkSession returns [EObject current=null] : (otherlv_0= 'TalkSession' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) ) )? (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'papers' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? ) ;
    public final EObject ruleTalkSession() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_chair_3_0 = null;

        AntlrDatatypeRuleToken lv_abstract_5_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:958:2: ( (otherlv_0= 'TalkSession' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) ) )? (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'papers' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? ) )
            // InternalProgram.g:959:2: (otherlv_0= 'TalkSession' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) ) )? (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'papers' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? )
            {
            // InternalProgram.g:959:2: (otherlv_0= 'TalkSession' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) ) )? (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'papers' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? )
            // InternalProgram.g:960:3: otherlv_0= 'TalkSession' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) ) )? (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'papers' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getTalkSessionAccess().getTalkSessionKeyword_0());
            		
            // InternalProgram.g:964:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:965:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:965:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:966:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTalkSessionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTalkSessionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:983:3: (otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalProgram.g:984:4: otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getTalkSessionAccess().getChairKeyword_2_0());
                    			
                    // InternalProgram.g:988:4: ( (lv_chair_3_0= rulePerson ) )
                    // InternalProgram.g:989:5: (lv_chair_3_0= rulePerson )
                    {
                    // InternalProgram.g:989:5: (lv_chair_3_0= rulePerson )
                    // InternalProgram.g:990:6: lv_chair_3_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getTalkSessionAccess().getChairPersonParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_chair_3_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTalkSessionRule());
                    						}
                    						set(
                    							current,
                    							"chair",
                    							lv_chair_3_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1008:3: (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalProgram.g:1009:4: otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getTalkSessionAccess().getAbstractKeyword_3_0());
                    			
                    // InternalProgram.g:1013:4: ( (lv_abstract_5_0= ruleEString ) )
                    // InternalProgram.g:1014:5: (lv_abstract_5_0= ruleEString )
                    {
                    // InternalProgram.g:1014:5: (lv_abstract_5_0= ruleEString )
                    // InternalProgram.g:1015:6: lv_abstract_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTalkSessionAccess().getAbstractEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_24);
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

            // InternalProgram.g:1033:3: (otherlv_6= 'papers' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==12) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalProgram.g:1034:4: otherlv_6= 'papers' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_6=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getTalkSessionAccess().getPapersKeyword_4_0());
                    			
                    // InternalProgram.g:1038:4: ( ( ruleEString ) )
                    // InternalProgram.g:1039:5: ( ruleEString )
                    {
                    // InternalProgram.g:1039:5: ( ruleEString )
                    // InternalProgram.g:1040:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTalkSessionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTalkSessionAccess().getPapersPaperCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:1054:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==25) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalProgram.g:1055:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,25,FOLLOW_7); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getTalkSessionAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalProgram.g:1059:5: ( ( ruleEString ) )
                    	    // InternalProgram.g:1060:6: ( ruleEString )
                    	    {
                    	    // InternalProgram.g:1060:6: ( ruleEString )
                    	    // InternalProgram.g:1061:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTalkSessionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTalkSessionAccess().getPapersPaperCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "ruleTalkSession"


    // $ANTLR start "entryRulePanel"
    // InternalProgram.g:1081:1: entryRulePanel returns [EObject current=null] : iv_rulePanel= rulePanel EOF ;
    public final EObject entryRulePanel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePanel = null;


        try {
            // InternalProgram.g:1081:46: (iv_rulePanel= rulePanel EOF )
            // InternalProgram.g:1082:2: iv_rulePanel= rulePanel EOF
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
    // InternalProgram.g:1088:1: rulePanel returns [EObject current=null] : (otherlv_0= 'Panel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )* )? (otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )* )? ) ;
    public final EObject rulePanel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_abstract_3_0 = null;

        EObject lv_panelists_5_0 = null;

        EObject lv_panelists_7_0 = null;

        EObject lv_moderators_9_0 = null;

        EObject lv_moderators_11_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:1094:2: ( (otherlv_0= 'Panel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )* )? (otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )* )? ) )
            // InternalProgram.g:1095:2: (otherlv_0= 'Panel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )* )? (otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )* )? )
            {
            // InternalProgram.g:1095:2: (otherlv_0= 'Panel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )* )? (otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )* )? )
            // InternalProgram.g:1096:3: otherlv_0= 'Panel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )* )? (otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )* )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPanelAccess().getPanelKeyword_0());
            		
            // InternalProgram.g:1100:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1101:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1101:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1102:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPanelAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPanelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:1119:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalProgram.g:1120:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getPanelAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1124:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:1125:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:1125:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:1126:6: lv_abstract_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPanelAccess().getAbstractEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_abstract_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPanelRule());
                    						}
                    						set(
                    							current,
                    							"abstract",
                    							lv_abstract_3_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1144:3: (otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalProgram.g:1145:4: otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )*
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getPanelAccess().getPanelistsKeyword_3_0());
                    			
                    // InternalProgram.g:1149:4: ( (lv_panelists_5_0= rulePerson ) )
                    // InternalProgram.g:1150:5: (lv_panelists_5_0= rulePerson )
                    {
                    // InternalProgram.g:1150:5: (lv_panelists_5_0= rulePerson )
                    // InternalProgram.g:1151:6: lv_panelists_5_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getPanelAccess().getPanelistsPersonParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_panelists_5_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPanelRule());
                    						}
                    						add(
                    							current,
                    							"panelists",
                    							lv_panelists_5_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:1168:4: (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==25) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalProgram.g:1169:5: otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) )
                    	    {
                    	    otherlv_6=(Token)match(input,25,FOLLOW_7); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPanelAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalProgram.g:1173:5: ( (lv_panelists_7_0= rulePerson ) )
                    	    // InternalProgram.g:1174:6: (lv_panelists_7_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:1174:6: (lv_panelists_7_0= rulePerson )
                    	    // InternalProgram.g:1175:7: lv_panelists_7_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getPanelAccess().getPanelistsPersonParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_panelists_7_0=rulePerson();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPanelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"panelists",
                    	    								lv_panelists_7_0,
                    	    								"fr.inria.diverse.models2016.dsl.Program.Person");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalProgram.g:1194:3: (otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalProgram.g:1195:4: otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )*
                    {
                    otherlv_8=(Token)match(input,31,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getPanelAccess().getModeratorsKeyword_4_0());
                    			
                    // InternalProgram.g:1199:4: ( (lv_moderators_9_0= rulePerson ) )
                    // InternalProgram.g:1200:5: (lv_moderators_9_0= rulePerson )
                    {
                    // InternalProgram.g:1200:5: (lv_moderators_9_0= rulePerson )
                    // InternalProgram.g:1201:6: lv_moderators_9_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getPanelAccess().getModeratorsPersonParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_moderators_9_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPanelRule());
                    						}
                    						add(
                    							current,
                    							"moderators",
                    							lv_moderators_9_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:1218:4: (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==25) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalProgram.g:1219:5: otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) )
                    	    {
                    	    otherlv_10=(Token)match(input,25,FOLLOW_7); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getPanelAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalProgram.g:1223:5: ( (lv_moderators_11_0= rulePerson ) )
                    	    // InternalProgram.g:1224:6: (lv_moderators_11_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:1224:6: (lv_moderators_11_0= rulePerson )
                    	    // InternalProgram.g:1225:7: lv_moderators_11_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getPanelAccess().getModeratorsPersonParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    lv_moderators_11_0=rulePerson();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPanelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"moderators",
                    	    								lv_moderators_11_0,
                    	    								"fr.inria.diverse.models2016.dsl.Program.Person");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "rulePanel"


    // $ANTLR start "entryRuleWorkshop"
    // InternalProgram.g:1248:1: entryRuleWorkshop returns [EObject current=null] : iv_ruleWorkshop= ruleWorkshop EOF ;
    public final EObject entryRuleWorkshop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkshop = null;


        try {
            // InternalProgram.g:1248:49: (iv_ruleWorkshop= ruleWorkshop EOF )
            // InternalProgram.g:1249:2: iv_ruleWorkshop= ruleWorkshop EOF
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
    // InternalProgram.g:1255:1: ruleWorkshop returns [EObject current=null] : (otherlv_0= 'Workshop' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) )? (otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) )? (otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )* )? ) ;
    public final EObject ruleWorkshop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_abstract_3_0 = null;

        AntlrDatatypeRuleToken lv_url_5_0 = null;

        AntlrDatatypeRuleToken lv_id_7_0 = null;

        EObject lv_organizers_9_0 = null;

        EObject lv_organizers_11_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:1261:2: ( (otherlv_0= 'Workshop' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) )? (otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) )? (otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )* )? ) )
            // InternalProgram.g:1262:2: (otherlv_0= 'Workshop' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) )? (otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) )? (otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )* )? )
            {
            // InternalProgram.g:1262:2: (otherlv_0= 'Workshop' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) )? (otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) )? (otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )* )? )
            // InternalProgram.g:1263:3: otherlv_0= 'Workshop' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) )? (otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) )? (otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )* )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkshopAccess().getWorkshopKeyword_0());
            		
            // InternalProgram.g:1267:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1268:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1268:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1269:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWorkshopAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkshopRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:1286:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalProgram.g:1287:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getWorkshopAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1291:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:1292:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:1292:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:1293:6: lv_abstract_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getWorkshopAccess().getAbstractEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_abstract_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkshopRule());
                    						}
                    						set(
                    							current,
                    							"abstract",
                    							lv_abstract_3_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1311:3: (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalProgram.g:1312:4: otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getWorkshopAccess().getUrlKeyword_3_0());
                    			
                    // InternalProgram.g:1316:4: ( (lv_url_5_0= ruleEString ) )
                    // InternalProgram.g:1317:5: (lv_url_5_0= ruleEString )
                    {
                    // InternalProgram.g:1317:5: (lv_url_5_0= ruleEString )
                    // InternalProgram.g:1318:6: lv_url_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getWorkshopAccess().getUrlEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_url_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkshopRule());
                    						}
                    						set(
                    							current,
                    							"url",
                    							lv_url_5_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1336:3: (otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalProgram.g:1337:4: otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getWorkshopAccess().getIdKeyword_4_0());
                    			
                    // InternalProgram.g:1341:4: ( (lv_id_7_0= ruleEString ) )
                    // InternalProgram.g:1342:5: (lv_id_7_0= ruleEString )
                    {
                    // InternalProgram.g:1342:5: (lv_id_7_0= ruleEString )
                    // InternalProgram.g:1343:6: lv_id_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getWorkshopAccess().getIdEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_id_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkshopRule());
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

            // InternalProgram.g:1361:3: (otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==35) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalProgram.g:1362:4: otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )*
                    {
                    otherlv_8=(Token)match(input,35,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getWorkshopAccess().getOrganizersKeyword_5_0());
                    			
                    // InternalProgram.g:1366:4: ( (lv_organizers_9_0= rulePerson ) )
                    // InternalProgram.g:1367:5: (lv_organizers_9_0= rulePerson )
                    {
                    // InternalProgram.g:1367:5: (lv_organizers_9_0= rulePerson )
                    // InternalProgram.g:1368:6: lv_organizers_9_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getWorkshopAccess().getOrganizersPersonParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_organizers_9_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkshopRule());
                    						}
                    						add(
                    							current,
                    							"organizers",
                    							lv_organizers_9_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:1385:4: (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==25) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalProgram.g:1386:5: otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) )
                    	    {
                    	    otherlv_10=(Token)match(input,25,FOLLOW_7); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getWorkshopAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalProgram.g:1390:5: ( (lv_organizers_11_0= rulePerson ) )
                    	    // InternalProgram.g:1391:6: (lv_organizers_11_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:1391:6: (lv_organizers_11_0= rulePerson )
                    	    // InternalProgram.g:1392:7: lv_organizers_11_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getWorkshopAccess().getOrganizersPersonParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    lv_organizers_11_0=rulePerson();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getWorkshopRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"organizers",
                    	    								lv_organizers_11_0,
                    	    								"fr.inria.diverse.models2016.dsl.Program.Person");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "ruleWorkshop"


    // $ANTLR start "entryRuleTutorial"
    // InternalProgram.g:1415:1: entryRuleTutorial returns [EObject current=null] : iv_ruleTutorial= ruleTutorial EOF ;
    public final EObject entryRuleTutorial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTutorial = null;


        try {
            // InternalProgram.g:1415:49: (iv_ruleTutorial= ruleTutorial EOF )
            // InternalProgram.g:1416:2: iv_ruleTutorial= ruleTutorial EOF
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
    // InternalProgram.g:1422:1: ruleTutorial returns [EObject current=null] : (otherlv_0= 'Tutorial' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'organizers' ( (lv_organizers_7_0= rulePerson ) ) (otherlv_8= ',' ( (lv_organizers_9_0= rulePerson ) ) )* )? ) ;
    public final EObject ruleTutorial() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_abstract_3_0 = null;

        AntlrDatatypeRuleToken lv_id_5_0 = null;

        EObject lv_organizers_7_0 = null;

        EObject lv_organizers_9_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:1428:2: ( (otherlv_0= 'Tutorial' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'organizers' ( (lv_organizers_7_0= rulePerson ) ) (otherlv_8= ',' ( (lv_organizers_9_0= rulePerson ) ) )* )? ) )
            // InternalProgram.g:1429:2: (otherlv_0= 'Tutorial' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'organizers' ( (lv_organizers_7_0= rulePerson ) ) (otherlv_8= ',' ( (lv_organizers_9_0= rulePerson ) ) )* )? )
            {
            // InternalProgram.g:1429:2: (otherlv_0= 'Tutorial' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'organizers' ( (lv_organizers_7_0= rulePerson ) ) (otherlv_8= ',' ( (lv_organizers_9_0= rulePerson ) ) )* )? )
            // InternalProgram.g:1430:3: otherlv_0= 'Tutorial' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )? (otherlv_6= 'organizers' ( (lv_organizers_7_0= rulePerson ) ) (otherlv_8= ',' ( (lv_organizers_9_0= rulePerson ) ) )* )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getTutorialAccess().getTutorialKeyword_0());
            		
            // InternalProgram.g:1434:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1435:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1435:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1436:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTutorialAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_32);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTutorialRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:1453:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==28) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalProgram.g:1454:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getTutorialAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1458:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:1459:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:1459:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:1460:6: lv_abstract_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTutorialAccess().getAbstractEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_abstract_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTutorialRule());
                    						}
                    						set(
                    							current,
                    							"abstract",
                    							lv_abstract_3_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1478:3: (otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalProgram.g:1479:4: otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getTutorialAccess().getIdKeyword_3_0());
                    			
                    // InternalProgram.g:1483:4: ( (lv_id_5_0= ruleEString ) )
                    // InternalProgram.g:1484:5: (lv_id_5_0= ruleEString )
                    {
                    // InternalProgram.g:1484:5: (lv_id_5_0= ruleEString )
                    // InternalProgram.g:1485:6: lv_id_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTutorialAccess().getIdEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_id_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTutorialRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_5_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1503:3: (otherlv_6= 'organizers' ( (lv_organizers_7_0= rulePerson ) ) (otherlv_8= ',' ( (lv_organizers_9_0= rulePerson ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==35) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalProgram.g:1504:4: otherlv_6= 'organizers' ( (lv_organizers_7_0= rulePerson ) ) (otherlv_8= ',' ( (lv_organizers_9_0= rulePerson ) ) )*
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getTutorialAccess().getOrganizersKeyword_4_0());
                    			
                    // InternalProgram.g:1508:4: ( (lv_organizers_7_0= rulePerson ) )
                    // InternalProgram.g:1509:5: (lv_organizers_7_0= rulePerson )
                    {
                    // InternalProgram.g:1509:5: (lv_organizers_7_0= rulePerson )
                    // InternalProgram.g:1510:6: lv_organizers_7_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getTutorialAccess().getOrganizersPersonParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_organizers_7_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTutorialRule());
                    						}
                    						add(
                    							current,
                    							"organizers",
                    							lv_organizers_7_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:1527:4: (otherlv_8= ',' ( (lv_organizers_9_0= rulePerson ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==25) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalProgram.g:1528:5: otherlv_8= ',' ( (lv_organizers_9_0= rulePerson ) )
                    	    {
                    	    otherlv_8=(Token)match(input,25,FOLLOW_7); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getTutorialAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalProgram.g:1532:5: ( (lv_organizers_9_0= rulePerson ) )
                    	    // InternalProgram.g:1533:6: (lv_organizers_9_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:1533:6: (lv_organizers_9_0= rulePerson )
                    	    // InternalProgram.g:1534:7: lv_organizers_9_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getTutorialAccess().getOrganizersPersonParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    lv_organizers_9_0=rulePerson();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTutorialRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"organizers",
                    	    								lv_organizers_9_0,
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


                    }
                    break;

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
    // $ANTLR end "ruleTutorial"


    // $ANTLR start "entryRuleDoctoralSymposium"
    // InternalProgram.g:1557:1: entryRuleDoctoralSymposium returns [EObject current=null] : iv_ruleDoctoralSymposium= ruleDoctoralSymposium EOF ;
    public final EObject entryRuleDoctoralSymposium() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoctoralSymposium = null;


        try {
            // InternalProgram.g:1557:58: (iv_ruleDoctoralSymposium= ruleDoctoralSymposium EOF )
            // InternalProgram.g:1558:2: iv_ruleDoctoralSymposium= ruleDoctoralSymposium EOF
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
    // InternalProgram.g:1564:1: ruleDoctoralSymposium returns [EObject current=null] : (otherlv_0= 'DoctoralSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? ) ;
    public final EObject ruleDoctoralSymposium() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_abstract_3_0 = null;

        EObject lv_organizers_5_0 = null;

        EObject lv_organizers_7_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:1570:2: ( (otherlv_0= 'DoctoralSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? ) )
            // InternalProgram.g:1571:2: (otherlv_0= 'DoctoralSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? )
            {
            // InternalProgram.g:1571:2: (otherlv_0= 'DoctoralSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? )
            // InternalProgram.g:1572:3: otherlv_0= 'DoctoralSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDoctoralSymposiumAccess().getDoctoralSymposiumKeyword_0());
            		
            // InternalProgram.g:1576:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1577:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1577:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1578:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDoctoralSymposiumAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDoctoralSymposiumRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:1595:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==28) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalProgram.g:1596:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getDoctoralSymposiumAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1600:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:1601:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:1601:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:1602:6: lv_abstract_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDoctoralSymposiumAccess().getAbstractEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_abstract_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDoctoralSymposiumRule());
                    						}
                    						set(
                    							current,
                    							"abstract",
                    							lv_abstract_3_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1620:3: (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==35) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalProgram.g:1621:4: otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )*
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getDoctoralSymposiumAccess().getOrganizersKeyword_3_0());
                    			
                    // InternalProgram.g:1625:4: ( (lv_organizers_5_0= rulePerson ) )
                    // InternalProgram.g:1626:5: (lv_organizers_5_0= rulePerson )
                    {
                    // InternalProgram.g:1626:5: (lv_organizers_5_0= rulePerson )
                    // InternalProgram.g:1627:6: lv_organizers_5_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getDoctoralSymposiumAccess().getOrganizersPersonParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_organizers_5_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDoctoralSymposiumRule());
                    						}
                    						add(
                    							current,
                    							"organizers",
                    							lv_organizers_5_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:1644:4: (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==25) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalProgram.g:1645:5: otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) )
                    	    {
                    	    otherlv_6=(Token)match(input,25,FOLLOW_7); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getDoctoralSymposiumAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalProgram.g:1649:5: ( (lv_organizers_7_0= rulePerson ) )
                    	    // InternalProgram.g:1650:6: (lv_organizers_7_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:1650:6: (lv_organizers_7_0= rulePerson )
                    	    // InternalProgram.g:1651:7: lv_organizers_7_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getDoctoralSymposiumAccess().getOrganizersPersonParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    lv_organizers_7_0=rulePerson();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDoctoralSymposiumRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"organizers",
                    	    								lv_organizers_7_0,
                    	    								"fr.inria.diverse.models2016.dsl.Program.Person");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "ruleDoctoralSymposium"


    // $ANTLR start "entryRuleEducatorSymposium"
    // InternalProgram.g:1674:1: entryRuleEducatorSymposium returns [EObject current=null] : iv_ruleEducatorSymposium= ruleEducatorSymposium EOF ;
    public final EObject entryRuleEducatorSymposium() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEducatorSymposium = null;


        try {
            // InternalProgram.g:1674:58: (iv_ruleEducatorSymposium= ruleEducatorSymposium EOF )
            // InternalProgram.g:1675:2: iv_ruleEducatorSymposium= ruleEducatorSymposium EOF
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
    // InternalProgram.g:1681:1: ruleEducatorSymposium returns [EObject current=null] : (otherlv_0= 'EducatorSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? ) ;
    public final EObject ruleEducatorSymposium() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_abstract_3_0 = null;

        EObject lv_organizers_5_0 = null;

        EObject lv_organizers_7_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:1687:2: ( (otherlv_0= 'EducatorSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? ) )
            // InternalProgram.g:1688:2: (otherlv_0= 'EducatorSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? )
            {
            // InternalProgram.g:1688:2: (otherlv_0= 'EducatorSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? )
            // InternalProgram.g:1689:3: otherlv_0= 'EducatorSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getEducatorSymposiumAccess().getEducatorSymposiumKeyword_0());
            		
            // InternalProgram.g:1693:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1694:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1694:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1695:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEducatorSymposiumAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEducatorSymposiumRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:1712:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==28) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalProgram.g:1713:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getEducatorSymposiumAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1717:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:1718:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:1718:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:1719:6: lv_abstract_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEducatorSymposiumAccess().getAbstractEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_abstract_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEducatorSymposiumRule());
                    						}
                    						set(
                    							current,
                    							"abstract",
                    							lv_abstract_3_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1737:3: (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==35) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalProgram.g:1738:4: otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )*
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getEducatorSymposiumAccess().getOrganizersKeyword_3_0());
                    			
                    // InternalProgram.g:1742:4: ( (lv_organizers_5_0= rulePerson ) )
                    // InternalProgram.g:1743:5: (lv_organizers_5_0= rulePerson )
                    {
                    // InternalProgram.g:1743:5: (lv_organizers_5_0= rulePerson )
                    // InternalProgram.g:1744:6: lv_organizers_5_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getEducatorSymposiumAccess().getOrganizersPersonParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_organizers_5_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEducatorSymposiumRule());
                    						}
                    						add(
                    							current,
                    							"organizers",
                    							lv_organizers_5_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:1761:4: (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==25) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalProgram.g:1762:5: otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) )
                    	    {
                    	    otherlv_6=(Token)match(input,25,FOLLOW_7); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getEducatorSymposiumAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalProgram.g:1766:5: ( (lv_organizers_7_0= rulePerson ) )
                    	    // InternalProgram.g:1767:6: (lv_organizers_7_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:1767:6: (lv_organizers_7_0= rulePerson )
                    	    // InternalProgram.g:1768:7: lv_organizers_7_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getEducatorSymposiumAccess().getOrganizersPersonParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    lv_organizers_7_0=rulePerson();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEducatorSymposiumRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"organizers",
                    	    								lv_organizers_7_0,
                    	    								"fr.inria.diverse.models2016.dsl.Program.Person");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "ruleEducatorSymposium"


    // $ANTLR start "entryRuleReception"
    // InternalProgram.g:1791:1: entryRuleReception returns [EObject current=null] : iv_ruleReception= ruleReception EOF ;
    public final EObject entryRuleReception() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReception = null;


        try {
            // InternalProgram.g:1791:50: (iv_ruleReception= ruleReception EOF )
            // InternalProgram.g:1792:2: iv_ruleReception= ruleReception EOF
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
    // InternalProgram.g:1798:1: ruleReception returns [EObject current=null] : (otherlv_0= 'Reception' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleReception() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_abstract_3_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:1804:2: ( (otherlv_0= 'Reception' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) )
            // InternalProgram.g:1805:2: (otherlv_0= 'Reception' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            {
            // InternalProgram.g:1805:2: (otherlv_0= 'Reception' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            // InternalProgram.g:1806:3: otherlv_0= 'Reception' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getReceptionAccess().getReceptionKeyword_0());
            		
            // InternalProgram.g:1810:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1811:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1811:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1812:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReceptionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReceptionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:1829:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==28) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalProgram.g:1830:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getReceptionAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1834:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:1835:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:1835:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:1836:6: lv_abstract_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getReceptionAccess().getAbstractEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_abstract_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReceptionRule());
                    						}
                    						set(
                    							current,
                    							"abstract",
                    							lv_abstract_3_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleReception"


    // $ANTLR start "entryRuleClinic"
    // InternalProgram.g:1858:1: entryRuleClinic returns [EObject current=null] : iv_ruleClinic= ruleClinic EOF ;
    public final EObject entryRuleClinic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClinic = null;


        try {
            // InternalProgram.g:1858:47: (iv_ruleClinic= ruleClinic EOF )
            // InternalProgram.g:1859:2: iv_ruleClinic= ruleClinic EOF
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
    // InternalProgram.g:1865:1: ruleClinic returns [EObject current=null] : (otherlv_0= 'Clinic' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleClinic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_abstract_3_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:1871:2: ( (otherlv_0= 'Clinic' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) )
            // InternalProgram.g:1872:2: (otherlv_0= 'Clinic' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            {
            // InternalProgram.g:1872:2: (otherlv_0= 'Clinic' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            // InternalProgram.g:1873:3: otherlv_0= 'Clinic' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,40,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getClinicAccess().getClinicKeyword_0());
            		
            // InternalProgram.g:1877:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1878:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1878:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1879:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClinicAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClinicRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:1896:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==28) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalProgram.g:1897:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getClinicAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1901:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:1902:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:1902:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:1903:6: lv_abstract_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getClinicAccess().getAbstractEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_abstract_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClinicRule());
                    						}
                    						set(
                    							current,
                    							"abstract",
                    							lv_abstract_3_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleClinic"


    // $ANTLR start "entryRuleLunch"
    // InternalProgram.g:1925:1: entryRuleLunch returns [EObject current=null] : iv_ruleLunch= ruleLunch EOF ;
    public final EObject entryRuleLunch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLunch = null;


        try {
            // InternalProgram.g:1925:46: (iv_ruleLunch= ruleLunch EOF )
            // InternalProgram.g:1926:2: iv_ruleLunch= ruleLunch EOF
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
    // InternalProgram.g:1932:1: ruleLunch returns [EObject current=null] : (otherlv_0= 'Lunch' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleLunch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_abstract_3_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:1938:2: ( (otherlv_0= 'Lunch' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) )
            // InternalProgram.g:1939:2: (otherlv_0= 'Lunch' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            {
            // InternalProgram.g:1939:2: (otherlv_0= 'Lunch' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            // InternalProgram.g:1940:3: otherlv_0= 'Lunch' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,41,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getLunchAccess().getLunchKeyword_0());
            		
            // InternalProgram.g:1944:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1945:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1945:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1946:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLunchAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLunchRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:1963:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==28) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalProgram.g:1964:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getLunchAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1968:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:1969:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:1969:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:1970:6: lv_abstract_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLunchAccess().getAbstractEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_abstract_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLunchRule());
                    						}
                    						set(
                    							current,
                    							"abstract",
                    							lv_abstract_3_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleLunch"


    // $ANTLR start "entryRuleCoffeeBreak"
    // InternalProgram.g:1992:1: entryRuleCoffeeBreak returns [EObject current=null] : iv_ruleCoffeeBreak= ruleCoffeeBreak EOF ;
    public final EObject entryRuleCoffeeBreak() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoffeeBreak = null;


        try {
            // InternalProgram.g:1992:52: (iv_ruleCoffeeBreak= ruleCoffeeBreak EOF )
            // InternalProgram.g:1993:2: iv_ruleCoffeeBreak= ruleCoffeeBreak EOF
            {
             newCompositeNode(grammarAccess.getCoffeeBreakRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoffeeBreak=ruleCoffeeBreak();

            state._fsp--;

             current =iv_ruleCoffeeBreak; 
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
    // $ANTLR end "entryRuleCoffeeBreak"


    // $ANTLR start "ruleCoffeeBreak"
    // InternalProgram.g:1999:1: ruleCoffeeBreak returns [EObject current=null] : (otherlv_0= 'CoffeeBreak' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleCoffeeBreak() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_abstract_3_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:2005:2: ( (otherlv_0= 'CoffeeBreak' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) )
            // InternalProgram.g:2006:2: (otherlv_0= 'CoffeeBreak' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            {
            // InternalProgram.g:2006:2: (otherlv_0= 'CoffeeBreak' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            // InternalProgram.g:2007:3: otherlv_0= 'CoffeeBreak' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCoffeeBreakAccess().getCoffeeBreakKeyword_0());
            		
            // InternalProgram.g:2011:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:2012:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:2012:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:2013:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCoffeeBreakAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCoffeeBreakRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:2030:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==28) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalProgram.g:2031:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getCoffeeBreakAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:2035:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:2036:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:2036:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:2037:6: lv_abstract_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCoffeeBreakAccess().getAbstractEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_abstract_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCoffeeBreakRule());
                    						}
                    						set(
                    							current,
                    							"abstract",
                    							lv_abstract_3_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleCoffeeBreak"


    // $ANTLR start "entryRulePaper"
    // InternalProgram.g:2059:1: entryRulePaper returns [EObject current=null] : iv_rulePaper= rulePaper EOF ;
    public final EObject entryRulePaper() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePaper = null;


        try {
            // InternalProgram.g:2059:46: (iv_rulePaper= rulePaper EOF )
            // InternalProgram.g:2060:2: iv_rulePaper= rulePaper EOF
            {
             newCompositeNode(grammarAccess.getPaperRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePaper=rulePaper();

            state._fsp--;

             current =iv_rulePaper; 
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
    // $ANTLR end "entryRulePaper"


    // $ANTLR start "rulePaper"
    // InternalProgram.g:2066:1: rulePaper returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'authors' ( (lv_authors_3_0= rulePerson ) ) (otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) ) )* (otherlv_6= 'abstract' ( (lv_abstract_7_0= ruleEString ) ) )? (otherlv_8= 'preprint' ( (lv_preprint_9_0= ruleEString ) ) )? (otherlv_10= 'kind' ( (lv_kind_11_0= ruleTrack ) ) )? ) ;
    public final EObject rulePaper() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_authors_3_0 = null;

        EObject lv_authors_5_0 = null;

        AntlrDatatypeRuleToken lv_abstract_7_0 = null;

        AntlrDatatypeRuleToken lv_preprint_9_0 = null;

        Enumerator lv_kind_11_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:2072:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'authors' ( (lv_authors_3_0= rulePerson ) ) (otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) ) )* (otherlv_6= 'abstract' ( (lv_abstract_7_0= ruleEString ) ) )? (otherlv_8= 'preprint' ( (lv_preprint_9_0= ruleEString ) ) )? (otherlv_10= 'kind' ( (lv_kind_11_0= ruleTrack ) ) )? ) )
            // InternalProgram.g:2073:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'authors' ( (lv_authors_3_0= rulePerson ) ) (otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) ) )* (otherlv_6= 'abstract' ( (lv_abstract_7_0= ruleEString ) ) )? (otherlv_8= 'preprint' ( (lv_preprint_9_0= ruleEString ) ) )? (otherlv_10= 'kind' ( (lv_kind_11_0= ruleTrack ) ) )? )
            {
            // InternalProgram.g:2073:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'authors' ( (lv_authors_3_0= rulePerson ) ) (otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) ) )* (otherlv_6= 'abstract' ( (lv_abstract_7_0= ruleEString ) ) )? (otherlv_8= 'preprint' ( (lv_preprint_9_0= ruleEString ) ) )? (otherlv_10= 'kind' ( (lv_kind_11_0= ruleTrack ) ) )? )
            // InternalProgram.g:2074:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'authors' ( (lv_authors_3_0= rulePerson ) ) (otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) ) )* (otherlv_6= 'abstract' ( (lv_abstract_7_0= ruleEString ) ) )? (otherlv_8= 'preprint' ( (lv_preprint_9_0= ruleEString ) ) )? (otherlv_10= 'kind' ( (lv_kind_11_0= ruleTrack ) ) )?
            {
            // InternalProgram.g:2074:3: ()
            // InternalProgram.g:2075:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPaperAccess().getPaperAction_0(),
            					current);
            			

            }

            // InternalProgram.g:2081:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:2082:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:2082:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:2083:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPaperAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPaperRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,43,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getPaperAccess().getAuthorsKeyword_2());
            		
            // InternalProgram.g:2104:3: ( (lv_authors_3_0= rulePerson ) )
            // InternalProgram.g:2105:4: (lv_authors_3_0= rulePerson )
            {
            // InternalProgram.g:2105:4: (lv_authors_3_0= rulePerson )
            // InternalProgram.g:2106:5: lv_authors_3_0= rulePerson
            {

            					newCompositeNode(grammarAccess.getPaperAccess().getAuthorsPersonParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_36);
            lv_authors_3_0=rulePerson();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPaperRule());
            					}
            					add(
            						current,
            						"authors",
            						lv_authors_3_0,
            						"fr.inria.diverse.models2016.dsl.Program.Person");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:2123:3: (otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==25) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalProgram.g:2124:4: otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_7); 

            	    				newLeafNode(otherlv_4, grammarAccess.getPaperAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalProgram.g:2128:4: ( (lv_authors_5_0= rulePerson ) )
            	    // InternalProgram.g:2129:5: (lv_authors_5_0= rulePerson )
            	    {
            	    // InternalProgram.g:2129:5: (lv_authors_5_0= rulePerson )
            	    // InternalProgram.g:2130:6: lv_authors_5_0= rulePerson
            	    {

            	    						newCompositeNode(grammarAccess.getPaperAccess().getAuthorsPersonParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_36);
            	    lv_authors_5_0=rulePerson();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPaperRule());
            	    						}
            	    						add(
            	    							current,
            	    							"authors",
            	    							lv_authors_5_0,
            	    							"fr.inria.diverse.models2016.dsl.Program.Person");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            // InternalProgram.g:2148:3: (otherlv_6= 'abstract' ( (lv_abstract_7_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==28) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalProgram.g:2149:4: otherlv_6= 'abstract' ( (lv_abstract_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getPaperAccess().getAbstractKeyword_5_0());
                    			
                    // InternalProgram.g:2153:4: ( (lv_abstract_7_0= ruleEString ) )
                    // InternalProgram.g:2154:5: (lv_abstract_7_0= ruleEString )
                    {
                    // InternalProgram.g:2154:5: (lv_abstract_7_0= ruleEString )
                    // InternalProgram.g:2155:6: lv_abstract_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPaperAccess().getAbstractEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_abstract_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPaperRule());
                    						}
                    						set(
                    							current,
                    							"abstract",
                    							lv_abstract_7_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:2173:3: (otherlv_8= 'preprint' ( (lv_preprint_9_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==44) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalProgram.g:2174:4: otherlv_8= 'preprint' ( (lv_preprint_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,44,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getPaperAccess().getPreprintKeyword_6_0());
                    			
                    // InternalProgram.g:2178:4: ( (lv_preprint_9_0= ruleEString ) )
                    // InternalProgram.g:2179:5: (lv_preprint_9_0= ruleEString )
                    {
                    // InternalProgram.g:2179:5: (lv_preprint_9_0= ruleEString )
                    // InternalProgram.g:2180:6: lv_preprint_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPaperAccess().getPreprintEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_preprint_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPaperRule());
                    						}
                    						set(
                    							current,
                    							"preprint",
                    							lv_preprint_9_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:2198:3: (otherlv_10= 'kind' ( (lv_kind_11_0= ruleTrack ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==45) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalProgram.g:2199:4: otherlv_10= 'kind' ( (lv_kind_11_0= ruleTrack ) )
                    {
                    otherlv_10=(Token)match(input,45,FOLLOW_39); 

                    				newLeafNode(otherlv_10, grammarAccess.getPaperAccess().getKindKeyword_7_0());
                    			
                    // InternalProgram.g:2203:4: ( (lv_kind_11_0= ruleTrack ) )
                    // InternalProgram.g:2204:5: (lv_kind_11_0= ruleTrack )
                    {
                    // InternalProgram.g:2204:5: (lv_kind_11_0= ruleTrack )
                    // InternalProgram.g:2205:6: lv_kind_11_0= ruleTrack
                    {

                    						newCompositeNode(grammarAccess.getPaperAccess().getKindTrackEnumRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_kind_11_0=ruleTrack();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPaperRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_11_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Track");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "rulePaper"


    // $ANTLR start "entryRulePerson"
    // InternalProgram.g:2227:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalProgram.g:2227:47: (iv_rulePerson= rulePerson EOF )
            // InternalProgram.g:2228:2: iv_rulePerson= rulePerson EOF
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
    // InternalProgram.g:2234:1: rulePerson returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'email' ( (lv_email_3_0= ruleEString ) ) )? (otherlv_4= 'homepage' ( (lv_homepage_5_0= ruleEString ) ) )? ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_email_3_0 = null;

        AntlrDatatypeRuleToken lv_homepage_5_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:2240:2: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'email' ( (lv_email_3_0= ruleEString ) ) )? (otherlv_4= 'homepage' ( (lv_homepage_5_0= ruleEString ) ) )? ) )
            // InternalProgram.g:2241:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'email' ( (lv_email_3_0= ruleEString ) ) )? (otherlv_4= 'homepage' ( (lv_homepage_5_0= ruleEString ) ) )? )
            {
            // InternalProgram.g:2241:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'email' ( (lv_email_3_0= ruleEString ) ) )? (otherlv_4= 'homepage' ( (lv_homepage_5_0= ruleEString ) ) )? )
            // InternalProgram.g:2242:3: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'email' ( (lv_email_3_0= ruleEString ) ) )? (otherlv_4= 'homepage' ( (lv_homepage_5_0= ruleEString ) ) )?
            {
            // InternalProgram.g:2242:3: ()
            // InternalProgram.g:2243:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPersonAccess().getPersonAction_0(),
            					current);
            			

            }

            // InternalProgram.g:2249:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:2250:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:2250:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:2251:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPersonAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_40);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:2268:3: (otherlv_2= 'email' ( (lv_email_3_0= ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==46) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalProgram.g:2269:4: otherlv_2= 'email' ( (lv_email_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,46,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getPersonAccess().getEmailKeyword_2_0());
                    			
                    // InternalProgram.g:2273:4: ( (lv_email_3_0= ruleEString ) )
                    // InternalProgram.g:2274:5: (lv_email_3_0= ruleEString )
                    {
                    // InternalProgram.g:2274:5: (lv_email_3_0= ruleEString )
                    // InternalProgram.g:2275:6: lv_email_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getEmailEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_email_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						set(
                    							current,
                    							"email",
                    							lv_email_3_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:2293:3: (otherlv_4= 'homepage' ( (lv_homepage_5_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==47) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalProgram.g:2294:4: otherlv_4= 'homepage' ( (lv_homepage_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,47,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getPersonAccess().getHomepageKeyword_3_0());
                    			
                    // InternalProgram.g:2298:4: ( (lv_homepage_5_0= ruleEString ) )
                    // InternalProgram.g:2299:5: (lv_homepage_5_0= ruleEString )
                    {
                    // InternalProgram.g:2299:5: (lv_homepage_5_0= ruleEString )
                    // InternalProgram.g:2300:6: lv_homepage_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getHomepageEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_homepage_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						set(
                    							current,
                    							"homepage",
                    							lv_homepage_5_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "rulePerson"


    // $ANTLR start "ruleWeekDay"
    // InternalProgram.g:2322:1: ruleWeekDay returns [Enumerator current=null] : ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) ) ;
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
            // InternalProgram.g:2328:2: ( ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) ) )
            // InternalProgram.g:2329:2: ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) )
            {
            // InternalProgram.g:2329:2: ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) )
            int alt50=7;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt50=1;
                }
                break;
            case 49:
                {
                alt50=2;
                }
                break;
            case 50:
                {
                alt50=3;
                }
                break;
            case 51:
                {
                alt50=4;
                }
                break;
            case 52:
                {
                alt50=5;
                }
                break;
            case 53:
                {
                alt50=6;
                }
                break;
            case 54:
                {
                alt50=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalProgram.g:2330:3: (enumLiteral_0= 'Monday' )
                    {
                    // InternalProgram.g:2330:3: (enumLiteral_0= 'Monday' )
                    // InternalProgram.g:2331:4: enumLiteral_0= 'Monday'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getMondayEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWeekDayAccess().getMondayEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalProgram.g:2338:3: (enumLiteral_1= 'Tuesday' )
                    {
                    // InternalProgram.g:2338:3: (enumLiteral_1= 'Tuesday' )
                    // InternalProgram.g:2339:4: enumLiteral_1= 'Tuesday'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getTuesdayEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWeekDayAccess().getTuesdayEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalProgram.g:2346:3: (enumLiteral_2= 'Wednesday' )
                    {
                    // InternalProgram.g:2346:3: (enumLiteral_2= 'Wednesday' )
                    // InternalProgram.g:2347:4: enumLiteral_2= 'Wednesday'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getWednesdayEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWeekDayAccess().getWednesdayEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalProgram.g:2354:3: (enumLiteral_3= 'Thursday' )
                    {
                    // InternalProgram.g:2354:3: (enumLiteral_3= 'Thursday' )
                    // InternalProgram.g:2355:4: enumLiteral_3= 'Thursday'
                    {
                    enumLiteral_3=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getThursdayEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWeekDayAccess().getThursdayEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalProgram.g:2362:3: (enumLiteral_4= 'Friday' )
                    {
                    // InternalProgram.g:2362:3: (enumLiteral_4= 'Friday' )
                    // InternalProgram.g:2363:4: enumLiteral_4= 'Friday'
                    {
                    enumLiteral_4=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getFridayEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getWeekDayAccess().getFridayEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalProgram.g:2370:3: (enumLiteral_5= 'Saturday' )
                    {
                    // InternalProgram.g:2370:3: (enumLiteral_5= 'Saturday' )
                    // InternalProgram.g:2371:4: enumLiteral_5= 'Saturday'
                    {
                    enumLiteral_5=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getSaturdayEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getWeekDayAccess().getSaturdayEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalProgram.g:2378:3: (enumLiteral_6= 'Sunday' )
                    {
                    // InternalProgram.g:2378:3: (enumLiteral_6= 'Sunday' )
                    // InternalProgram.g:2379:4: enumLiteral_6= 'Sunday'
                    {
                    enumLiteral_6=(Token)match(input,54,FOLLOW_2); 

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
    // InternalProgram.g:2389:1: ruleTrack returns [Enumerator current=null] : ( (enumLiteral_0= 'Practice and Innovation' ) | (enumLiteral_1= 'Research' ) ) ;
    public final Enumerator ruleTrack() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalProgram.g:2395:2: ( ( (enumLiteral_0= 'Practice and Innovation' ) | (enumLiteral_1= 'Research' ) ) )
            // InternalProgram.g:2396:2: ( (enumLiteral_0= 'Practice and Innovation' ) | (enumLiteral_1= 'Research' ) )
            {
            // InternalProgram.g:2396:2: ( (enumLiteral_0= 'Practice and Innovation' ) | (enumLiteral_1= 'Research' ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==55) ) {
                alt51=1;
            }
            else if ( (LA51_0==56) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalProgram.g:2397:3: (enumLiteral_0= 'Practice and Innovation' )
                    {
                    // InternalProgram.g:2397:3: (enumLiteral_0= 'Practice and Innovation' )
                    // InternalProgram.g:2398:4: enumLiteral_0= 'Practice and Innovation'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getTrackAccess().getPracticeAndInnovationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTrackAccess().getPracticeAndInnovationEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalProgram.g:2405:3: (enumLiteral_1= 'Research' )
                    {
                    // InternalProgram.g:2405:3: (enumLiteral_1= 'Research' )
                    // InternalProgram.g:2406:4: enumLiteral_1= 'Research'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000009800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000049000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000007F124000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x007F000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100022L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000018001002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010001002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000D0000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000082000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000E10000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000E00000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000C10000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000810000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000300012000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800000000002L});

}