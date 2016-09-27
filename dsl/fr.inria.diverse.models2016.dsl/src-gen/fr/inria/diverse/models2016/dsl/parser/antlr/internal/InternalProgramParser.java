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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Conference'", "'talk duration'", "'kinds'", "','", "'resources'", "'papers'", "'{'", "';'", "'}'", "'events'", "'program'", "'room'", "'capacity'", "'date'", "'.'", "':'", "'-'", "'in'", "'TalkSession'", "'chair'", "'abstract'", "'Panel'", "'panelists'", "'moderators'", "'cancelled'", "'SRC'", "'url'", "'Poster'", "'Keynote'", "'speaker'", "'SponsorKeynote'", "'Workshop'", "'name'", "'organizers'", "'Tutorial'", "'DoctoralSymposium'", "'EducatorSymposium'", "'Reception'", "'Clinic'", "'Lunch'", "'CoffeeBreak'", "'Meeting'", "'participants'", "'Opening'", "'authors'", "'preprint'", "'kind'", "'proceedings'", "'email'", "'homepage'", "'Monday'", "'Tuesday'", "'Wednesday'", "'Thursday'", "'Friday'", "'Saturday'", "'Sunday'"
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
    // InternalProgram.g:72:1: ruleConference returns [EObject current=null] : ( () otherlv_1= 'Conference' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'talk duration' ( (lv_talkDuration_4_0= RULE_INT ) ) (otherlv_5= 'kinds' ( (lv_kinds_6_0= ruleKind ) ) (otherlv_7= ',' ( (lv_kinds_8_0= ruleKind ) ) )* )? (otherlv_9= 'resources' ( (lv_resources_10_0= ruleResource ) ) ( (lv_resources_11_0= ruleResource ) )* )? (otherlv_12= 'papers' otherlv_13= '{' ( (lv_papers_14_0= rulePaper ) ) (otherlv_15= ';' ( (lv_papers_16_0= rulePaper ) ) )* otherlv_17= '}' )? (otherlv_18= 'events' otherlv_19= '{' ( (lv_events_20_0= ruleEvent ) ) (otherlv_21= ';' ( (lv_events_22_0= ruleEvent ) ) )* otherlv_23= '}' )? (otherlv_24= 'program' ( (lv_program_25_0= ruleProgram ) ) )? ) ;
    public final EObject ruleConference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_talkDuration_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        EObject lv_kinds_6_0 = null;

        EObject lv_kinds_8_0 = null;

        EObject lv_resources_10_0 = null;

        EObject lv_resources_11_0 = null;

        EObject lv_papers_14_0 = null;

        EObject lv_papers_16_0 = null;

        EObject lv_events_20_0 = null;

        EObject lv_events_22_0 = null;

        EObject lv_program_25_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:78:2: ( ( () otherlv_1= 'Conference' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'talk duration' ( (lv_talkDuration_4_0= RULE_INT ) ) (otherlv_5= 'kinds' ( (lv_kinds_6_0= ruleKind ) ) (otherlv_7= ',' ( (lv_kinds_8_0= ruleKind ) ) )* )? (otherlv_9= 'resources' ( (lv_resources_10_0= ruleResource ) ) ( (lv_resources_11_0= ruleResource ) )* )? (otherlv_12= 'papers' otherlv_13= '{' ( (lv_papers_14_0= rulePaper ) ) (otherlv_15= ';' ( (lv_papers_16_0= rulePaper ) ) )* otherlv_17= '}' )? (otherlv_18= 'events' otherlv_19= '{' ( (lv_events_20_0= ruleEvent ) ) (otherlv_21= ';' ( (lv_events_22_0= ruleEvent ) ) )* otherlv_23= '}' )? (otherlv_24= 'program' ( (lv_program_25_0= ruleProgram ) ) )? ) )
            // InternalProgram.g:79:2: ( () otherlv_1= 'Conference' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'talk duration' ( (lv_talkDuration_4_0= RULE_INT ) ) (otherlv_5= 'kinds' ( (lv_kinds_6_0= ruleKind ) ) (otherlv_7= ',' ( (lv_kinds_8_0= ruleKind ) ) )* )? (otherlv_9= 'resources' ( (lv_resources_10_0= ruleResource ) ) ( (lv_resources_11_0= ruleResource ) )* )? (otherlv_12= 'papers' otherlv_13= '{' ( (lv_papers_14_0= rulePaper ) ) (otherlv_15= ';' ( (lv_papers_16_0= rulePaper ) ) )* otherlv_17= '}' )? (otherlv_18= 'events' otherlv_19= '{' ( (lv_events_20_0= ruleEvent ) ) (otherlv_21= ';' ( (lv_events_22_0= ruleEvent ) ) )* otherlv_23= '}' )? (otherlv_24= 'program' ( (lv_program_25_0= ruleProgram ) ) )? )
            {
            // InternalProgram.g:79:2: ( () otherlv_1= 'Conference' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'talk duration' ( (lv_talkDuration_4_0= RULE_INT ) ) (otherlv_5= 'kinds' ( (lv_kinds_6_0= ruleKind ) ) (otherlv_7= ',' ( (lv_kinds_8_0= ruleKind ) ) )* )? (otherlv_9= 'resources' ( (lv_resources_10_0= ruleResource ) ) ( (lv_resources_11_0= ruleResource ) )* )? (otherlv_12= 'papers' otherlv_13= '{' ( (lv_papers_14_0= rulePaper ) ) (otherlv_15= ';' ( (lv_papers_16_0= rulePaper ) ) )* otherlv_17= '}' )? (otherlv_18= 'events' otherlv_19= '{' ( (lv_events_20_0= ruleEvent ) ) (otherlv_21= ';' ( (lv_events_22_0= ruleEvent ) ) )* otherlv_23= '}' )? (otherlv_24= 'program' ( (lv_program_25_0= ruleProgram ) ) )? )
            // InternalProgram.g:80:3: () otherlv_1= 'Conference' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'talk duration' ( (lv_talkDuration_4_0= RULE_INT ) ) (otherlv_5= 'kinds' ( (lv_kinds_6_0= ruleKind ) ) (otherlv_7= ',' ( (lv_kinds_8_0= ruleKind ) ) )* )? (otherlv_9= 'resources' ( (lv_resources_10_0= ruleResource ) ) ( (lv_resources_11_0= ruleResource ) )* )? (otherlv_12= 'papers' otherlv_13= '{' ( (lv_papers_14_0= rulePaper ) ) (otherlv_15= ';' ( (lv_papers_16_0= rulePaper ) ) )* otherlv_17= '}' )? (otherlv_18= 'events' otherlv_19= '{' ( (lv_events_20_0= ruleEvent ) ) (otherlv_21= ';' ( (lv_events_22_0= ruleEvent ) ) )* otherlv_23= '}' )? (otherlv_24= 'program' ( (lv_program_25_0= ruleProgram ) ) )?
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
            		
            // InternalProgram.g:91:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalProgram.g:92:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalProgram.g:92:4: (lv_name_2_0= RULE_STRING )
            // InternalProgram.g:93:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getConferenceAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConferenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getConferenceAccess().getTalkDurationKeyword_3());
            		
            // InternalProgram.g:113:3: ( (lv_talkDuration_4_0= RULE_INT ) )
            // InternalProgram.g:114:4: (lv_talkDuration_4_0= RULE_INT )
            {
            // InternalProgram.g:114:4: (lv_talkDuration_4_0= RULE_INT )
            // InternalProgram.g:115:5: lv_talkDuration_4_0= RULE_INT
            {
            lv_talkDuration_4_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            					newLeafNode(lv_talkDuration_4_0, grammarAccess.getConferenceAccess().getTalkDurationINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConferenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"talkDuration",
            						lv_talkDuration_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalProgram.g:131:3: (otherlv_5= 'kinds' ( (lv_kinds_6_0= ruleKind ) ) (otherlv_7= ',' ( (lv_kinds_8_0= ruleKind ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalProgram.g:132:4: otherlv_5= 'kinds' ( (lv_kinds_6_0= ruleKind ) ) (otherlv_7= ',' ( (lv_kinds_8_0= ruleKind ) ) )*
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getConferenceAccess().getKindsKeyword_5_0());
                    			
                    // InternalProgram.g:136:4: ( (lv_kinds_6_0= ruleKind ) )
                    // InternalProgram.g:137:5: (lv_kinds_6_0= ruleKind )
                    {
                    // InternalProgram.g:137:5: (lv_kinds_6_0= ruleKind )
                    // InternalProgram.g:138:6: lv_kinds_6_0= ruleKind
                    {

                    						newCompositeNode(grammarAccess.getConferenceAccess().getKindsKindParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_kinds_6_0=ruleKind();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConferenceRule());
                    						}
                    						add(
                    							current,
                    							"kinds",
                    							lv_kinds_6_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Kind");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:155:4: (otherlv_7= ',' ( (lv_kinds_8_0= ruleKind ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalProgram.g:156:5: otherlv_7= ',' ( (lv_kinds_8_0= ruleKind ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getConferenceAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalProgram.g:160:5: ( (lv_kinds_8_0= ruleKind ) )
                    	    // InternalProgram.g:161:6: (lv_kinds_8_0= ruleKind )
                    	    {
                    	    // InternalProgram.g:161:6: (lv_kinds_8_0= ruleKind )
                    	    // InternalProgram.g:162:7: lv_kinds_8_0= ruleKind
                    	    {

                    	    							newCompositeNode(grammarAccess.getConferenceAccess().getKindsKindParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_kinds_8_0=ruleKind();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConferenceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"kinds",
                    	    								lv_kinds_8_0,
                    	    								"fr.inria.diverse.models2016.dsl.Program.Kind");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


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

            // InternalProgram.g:181:3: (otherlv_9= 'resources' ( (lv_resources_10_0= ruleResource ) ) ( (lv_resources_11_0= ruleResource ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalProgram.g:182:4: otherlv_9= 'resources' ( (lv_resources_10_0= ruleResource ) ) ( (lv_resources_11_0= ruleResource ) )*
                    {
                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getConferenceAccess().getResourcesKeyword_6_0());
                    			
                    // InternalProgram.g:186:4: ( (lv_resources_10_0= ruleResource ) )
                    // InternalProgram.g:187:5: (lv_resources_10_0= ruleResource )
                    {
                    // InternalProgram.g:187:5: (lv_resources_10_0= ruleResource )
                    // InternalProgram.g:188:6: lv_resources_10_0= ruleResource
                    {

                    						newCompositeNode(grammarAccess.getConferenceAccess().getResourcesResourceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_resources_10_0=ruleResource();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConferenceRule());
                    						}
                    						add(
                    							current,
                    							"resources",
                    							lv_resources_10_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Resource");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:205:4: ( (lv_resources_11_0= ruleResource ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==22) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalProgram.g:206:5: (lv_resources_11_0= ruleResource )
                    	    {
                    	    // InternalProgram.g:206:5: (lv_resources_11_0= ruleResource )
                    	    // InternalProgram.g:207:6: lv_resources_11_0= ruleResource
                    	    {

                    	    						newCompositeNode(grammarAccess.getConferenceAccess().getResourcesResourceParserRuleCall_6_2_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_resources_11_0=ruleResource();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getConferenceRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"resources",
                    	    							lv_resources_11_0,
                    	    							"fr.inria.diverse.models2016.dsl.Program.Resource");
                    	    						afterParserOrEnumRuleCall();
                    	    					

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

            // InternalProgram.g:225:3: (otherlv_12= 'papers' otherlv_13= '{' ( (lv_papers_14_0= rulePaper ) ) (otherlv_15= ';' ( (lv_papers_16_0= rulePaper ) ) )* otherlv_17= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalProgram.g:226:4: otherlv_12= 'papers' otherlv_13= '{' ( (lv_papers_14_0= rulePaper ) ) (otherlv_15= ';' ( (lv_papers_16_0= rulePaper ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getConferenceAccess().getPapersKeyword_7_0());
                    			
                    otherlv_13=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getConferenceAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalProgram.g:234:4: ( (lv_papers_14_0= rulePaper ) )
                    // InternalProgram.g:235:5: (lv_papers_14_0= rulePaper )
                    {
                    // InternalProgram.g:235:5: (lv_papers_14_0= rulePaper )
                    // InternalProgram.g:236:6: lv_papers_14_0= rulePaper
                    {

                    						newCompositeNode(grammarAccess.getConferenceAccess().getPapersPaperParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_papers_14_0=rulePaper();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConferenceRule());
                    						}
                    						add(
                    							current,
                    							"papers",
                    							lv_papers_14_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Paper");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:253:4: (otherlv_15= ';' ( (lv_papers_16_0= rulePaper ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==18) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalProgram.g:254:5: otherlv_15= ';' ( (lv_papers_16_0= rulePaper ) )
                    	    {
                    	    otherlv_15=(Token)match(input,18,FOLLOW_3); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getConferenceAccess().getSemicolonKeyword_7_3_0());
                    	    				
                    	    // InternalProgram.g:258:5: ( (lv_papers_16_0= rulePaper ) )
                    	    // InternalProgram.g:259:6: (lv_papers_16_0= rulePaper )
                    	    {
                    	    // InternalProgram.g:259:6: (lv_papers_16_0= rulePaper )
                    	    // InternalProgram.g:260:7: lv_papers_16_0= rulePaper
                    	    {

                    	    							newCompositeNode(grammarAccess.getConferenceAccess().getPapersPaperParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_papers_16_0=rulePaper();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConferenceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"papers",
                    	    								lv_papers_16_0,
                    	    								"fr.inria.diverse.models2016.dsl.Program.Paper");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_17, grammarAccess.getConferenceAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalProgram.g:283:3: (otherlv_18= 'events' otherlv_19= '{' ( (lv_events_20_0= ruleEvent ) ) (otherlv_21= ';' ( (lv_events_22_0= ruleEvent ) ) )* otherlv_23= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalProgram.g:284:4: otherlv_18= 'events' otherlv_19= '{' ( (lv_events_20_0= ruleEvent ) ) (otherlv_21= ';' ( (lv_events_22_0= ruleEvent ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_18, grammarAccess.getConferenceAccess().getEventsKeyword_8_0());
                    			
                    otherlv_19=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_19, grammarAccess.getConferenceAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalProgram.g:292:4: ( (lv_events_20_0= ruleEvent ) )
                    // InternalProgram.g:293:5: (lv_events_20_0= ruleEvent )
                    {
                    // InternalProgram.g:293:5: (lv_events_20_0= ruleEvent )
                    // InternalProgram.g:294:6: lv_events_20_0= ruleEvent
                    {

                    						newCompositeNode(grammarAccess.getConferenceAccess().getEventsEventParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_events_20_0=ruleEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConferenceRule());
                    						}
                    						add(
                    							current,
                    							"events",
                    							lv_events_20_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Event");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:311:4: (otherlv_21= ';' ( (lv_events_22_0= ruleEvent ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==18) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalProgram.g:312:5: otherlv_21= ';' ( (lv_events_22_0= ruleEvent ) )
                    	    {
                    	    otherlv_21=(Token)match(input,18,FOLLOW_13); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getConferenceAccess().getSemicolonKeyword_8_3_0());
                    	    				
                    	    // InternalProgram.g:316:5: ( (lv_events_22_0= ruleEvent ) )
                    	    // InternalProgram.g:317:6: (lv_events_22_0= ruleEvent )
                    	    {
                    	    // InternalProgram.g:317:6: (lv_events_22_0= ruleEvent )
                    	    // InternalProgram.g:318:7: lv_events_22_0= ruleEvent
                    	    {

                    	    							newCompositeNode(grammarAccess.getConferenceAccess().getEventsEventParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_events_22_0=ruleEvent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConferenceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"events",
                    	    								lv_events_22_0,
                    	    								"fr.inria.diverse.models2016.dsl.Program.Event");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_23, grammarAccess.getConferenceAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalProgram.g:341:3: (otherlv_24= 'program' ( (lv_program_25_0= ruleProgram ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalProgram.g:342:4: otherlv_24= 'program' ( (lv_program_25_0= ruleProgram ) )
                    {
                    otherlv_24=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_24, grammarAccess.getConferenceAccess().getProgramKeyword_9_0());
                    			
                    // InternalProgram.g:346:4: ( (lv_program_25_0= ruleProgram ) )
                    // InternalProgram.g:347:5: (lv_program_25_0= ruleProgram )
                    {
                    // InternalProgram.g:347:5: (lv_program_25_0= ruleProgram )
                    // InternalProgram.g:348:6: lv_program_25_0= ruleProgram
                    {

                    						newCompositeNode(grammarAccess.getConferenceAccess().getProgramProgramParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_program_25_0=ruleProgram();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConferenceRule());
                    						}
                    						set(
                    							current,
                    							"program",
                    							lv_program_25_0,
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
    // InternalProgram.g:370:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalProgram.g:370:49: (iv_ruleResource= ruleResource EOF )
            // InternalProgram.g:371:2: iv_ruleResource= ruleResource EOF
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
    // InternalProgram.g:377:1: ruleResource returns [EObject current=null] : this_Room_0= ruleRoom ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        EObject this_Room_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:383:2: (this_Room_0= ruleRoom )
            // InternalProgram.g:384:2: this_Room_0= ruleRoom
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
    // InternalProgram.g:395:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalProgram.g:395:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalProgram.g:396:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalProgram.g:402:1: ruleEvent returns [EObject current=null] : (this_TalkSession_0= ruleTalkSession | this_Panel_1= rulePanel | this_Workshop_2= ruleWorkshop | this_Tutorial_3= ruleTutorial | this_DoctoralSymposium_4= ruleDoctoralSymposium | this_EducatorSymposium_5= ruleEducatorSymposium | this_Reception_6= ruleReception | this_Clinic_7= ruleClinic | this_Lunch_8= ruleLunch | this_CoffeeBreak_9= ruleCoffeeBreak | this_Meeting_10= ruleMeeting | this_SRC_11= ruleSRC | this_Poster_12= rulePoster | this_Keynote_13= ruleKeynote | this_SponsorKeynote_14= ruleSponsorKeynote | this_Opening_15= ruleOpening ) ;
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

        EObject this_Meeting_10 = null;

        EObject this_SRC_11 = null;

        EObject this_Poster_12 = null;

        EObject this_Keynote_13 = null;

        EObject this_SponsorKeynote_14 = null;

        EObject this_Opening_15 = null;



        	enterRule();

        try {
            // InternalProgram.g:408:2: ( (this_TalkSession_0= ruleTalkSession | this_Panel_1= rulePanel | this_Workshop_2= ruleWorkshop | this_Tutorial_3= ruleTutorial | this_DoctoralSymposium_4= ruleDoctoralSymposium | this_EducatorSymposium_5= ruleEducatorSymposium | this_Reception_6= ruleReception | this_Clinic_7= ruleClinic | this_Lunch_8= ruleLunch | this_CoffeeBreak_9= ruleCoffeeBreak | this_Meeting_10= ruleMeeting | this_SRC_11= ruleSRC | this_Poster_12= rulePoster | this_Keynote_13= ruleKeynote | this_SponsorKeynote_14= ruleSponsorKeynote | this_Opening_15= ruleOpening ) )
            // InternalProgram.g:409:2: (this_TalkSession_0= ruleTalkSession | this_Panel_1= rulePanel | this_Workshop_2= ruleWorkshop | this_Tutorial_3= ruleTutorial | this_DoctoralSymposium_4= ruleDoctoralSymposium | this_EducatorSymposium_5= ruleEducatorSymposium | this_Reception_6= ruleReception | this_Clinic_7= ruleClinic | this_Lunch_8= ruleLunch | this_CoffeeBreak_9= ruleCoffeeBreak | this_Meeting_10= ruleMeeting | this_SRC_11= ruleSRC | this_Poster_12= rulePoster | this_Keynote_13= ruleKeynote | this_SponsorKeynote_14= ruleSponsorKeynote | this_Opening_15= ruleOpening )
            {
            // InternalProgram.g:409:2: (this_TalkSession_0= ruleTalkSession | this_Panel_1= rulePanel | this_Workshop_2= ruleWorkshop | this_Tutorial_3= ruleTutorial | this_DoctoralSymposium_4= ruleDoctoralSymposium | this_EducatorSymposium_5= ruleEducatorSymposium | this_Reception_6= ruleReception | this_Clinic_7= ruleClinic | this_Lunch_8= ruleLunch | this_CoffeeBreak_9= ruleCoffeeBreak | this_Meeting_10= ruleMeeting | this_SRC_11= ruleSRC | this_Poster_12= rulePoster | this_Keynote_13= ruleKeynote | this_SponsorKeynote_14= ruleSponsorKeynote | this_Opening_15= ruleOpening )
            int alt10=16;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt10=1;
                }
                break;
            case 32:
                {
                alt10=2;
                }
                break;
            case 42:
                {
                alt10=3;
                }
                break;
            case 45:
                {
                alt10=4;
                }
                break;
            case 46:
                {
                alt10=5;
                }
                break;
            case 47:
                {
                alt10=6;
                }
                break;
            case 48:
                {
                alt10=7;
                }
                break;
            case 49:
                {
                alt10=8;
                }
                break;
            case 50:
                {
                alt10=9;
                }
                break;
            case 51:
                {
                alt10=10;
                }
                break;
            case 52:
                {
                alt10=11;
                }
                break;
            case 36:
                {
                alt10=12;
                }
                break;
            case 38:
                {
                alt10=13;
                }
                break;
            case 39:
                {
                alt10=14;
                }
                break;
            case 41:
                {
                alt10=15;
                }
                break;
            case 54:
                {
                alt10=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalProgram.g:410:3: this_TalkSession_0= ruleTalkSession
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
                    // InternalProgram.g:419:3: this_Panel_1= rulePanel
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
                    // InternalProgram.g:428:3: this_Workshop_2= ruleWorkshop
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
                    // InternalProgram.g:437:3: this_Tutorial_3= ruleTutorial
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
                    // InternalProgram.g:446:3: this_DoctoralSymposium_4= ruleDoctoralSymposium
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
                    // InternalProgram.g:455:3: this_EducatorSymposium_5= ruleEducatorSymposium
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
                    // InternalProgram.g:464:3: this_Reception_6= ruleReception
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
                    // InternalProgram.g:473:3: this_Clinic_7= ruleClinic
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
                    // InternalProgram.g:482:3: this_Lunch_8= ruleLunch
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
                    // InternalProgram.g:491:3: this_CoffeeBreak_9= ruleCoffeeBreak
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getCoffeeBreakParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_CoffeeBreak_9=ruleCoffeeBreak();

                    state._fsp--;


                    			current = this_CoffeeBreak_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalProgram.g:500:3: this_Meeting_10= ruleMeeting
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getMeetingParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_Meeting_10=ruleMeeting();

                    state._fsp--;


                    			current = this_Meeting_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalProgram.g:509:3: this_SRC_11= ruleSRC
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getSRCParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_SRC_11=ruleSRC();

                    state._fsp--;


                    			current = this_SRC_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalProgram.g:518:3: this_Poster_12= rulePoster
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getPosterParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_Poster_12=rulePoster();

                    state._fsp--;


                    			current = this_Poster_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalProgram.g:527:3: this_Keynote_13= ruleKeynote
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getKeynoteParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_Keynote_13=ruleKeynote();

                    state._fsp--;


                    			current = this_Keynote_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalProgram.g:536:3: this_SponsorKeynote_14= ruleSponsorKeynote
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getSponsorKeynoteParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_SponsorKeynote_14=ruleSponsorKeynote();

                    state._fsp--;


                    			current = this_SponsorKeynote_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalProgram.g:545:3: this_Opening_15= ruleOpening
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getOpeningParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_Opening_15=ruleOpening();

                    state._fsp--;


                    			current = this_Opening_15;
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


    // $ANTLR start "entryRuleProgram"
    // InternalProgram.g:557:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalProgram.g:557:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalProgram.g:558:2: iv_ruleProgram= ruleProgram EOF
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
    // InternalProgram.g:564:1: ruleProgram returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )* )? otherlv_4= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_days_2_0 = null;

        EObject lv_days_3_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:570:2: ( ( () otherlv_1= '{' ( ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )* )? otherlv_4= '}' ) )
            // InternalProgram.g:571:2: ( () otherlv_1= '{' ( ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )* )? otherlv_4= '}' )
            {
            // InternalProgram.g:571:2: ( () otherlv_1= '{' ( ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )* )? otherlv_4= '}' )
            // InternalProgram.g:572:3: () otherlv_1= '{' ( ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )* )? otherlv_4= '}'
            {
            // InternalProgram.g:572:3: ()
            // InternalProgram.g:573:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProgramAccess().getProgramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalProgram.g:583:3: ( ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=61 && LA12_0<=67)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalProgram.g:584:4: ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )*
                    {
                    // InternalProgram.g:584:4: ( (lv_days_2_0= ruleDay ) )
                    // InternalProgram.g:585:5: (lv_days_2_0= ruleDay )
                    {
                    // InternalProgram.g:585:5: (lv_days_2_0= ruleDay )
                    // InternalProgram.g:586:6: lv_days_2_0= ruleDay
                    {

                    						newCompositeNode(grammarAccess.getProgramAccess().getDaysDayParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    // InternalProgram.g:603:4: ( (lv_days_3_0= ruleDay ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>=61 && LA11_0<=67)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalProgram.g:604:5: (lv_days_3_0= ruleDay )
                    	    {
                    	    // InternalProgram.g:604:5: (lv_days_3_0= ruleDay )
                    	    // InternalProgram.g:605:6: lv_days_3_0= ruleDay
                    	    {

                    	    						newCompositeNode(grammarAccess.getProgramAccess().getDaysDayParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
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
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

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
    // InternalProgram.g:631:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // InternalProgram.g:631:45: (iv_ruleRoom= ruleRoom EOF )
            // InternalProgram.g:632:2: iv_ruleRoom= ruleRoom EOF
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
    // InternalProgram.g:638:1: ruleRoom returns [EObject current=null] : ( () otherlv_1= 'room' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'capacity' ( (lv_capacity_4_0= RULE_INT ) ) )? ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_capacity_4_0=null;


        	enterRule();

        try {
            // InternalProgram.g:644:2: ( ( () otherlv_1= 'room' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'capacity' ( (lv_capacity_4_0= RULE_INT ) ) )? ) )
            // InternalProgram.g:645:2: ( () otherlv_1= 'room' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'capacity' ( (lv_capacity_4_0= RULE_INT ) ) )? )
            {
            // InternalProgram.g:645:2: ( () otherlv_1= 'room' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'capacity' ( (lv_capacity_4_0= RULE_INT ) ) )? )
            // InternalProgram.g:646:3: () otherlv_1= 'room' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'capacity' ( (lv_capacity_4_0= RULE_INT ) ) )?
            {
            // InternalProgram.g:646:3: ()
            // InternalProgram.g:647:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoomAccess().getRoomAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRoomAccess().getRoomKeyword_1());
            		
            // InternalProgram.g:657:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalProgram.g:658:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalProgram.g:658:4: (lv_name_2_0= RULE_STRING )
            // InternalProgram.g:659:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRoomAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalProgram.g:675:3: (otherlv_3= 'capacity' ( (lv_capacity_4_0= RULE_INT ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalProgram.g:676:4: otherlv_3= 'capacity' ( (lv_capacity_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getRoomAccess().getCapacityKeyword_3_0());
                    			
                    // InternalProgram.g:680:4: ( (lv_capacity_4_0= RULE_INT ) )
                    // InternalProgram.g:681:5: (lv_capacity_4_0= RULE_INT )
                    {
                    // InternalProgram.g:681:5: (lv_capacity_4_0= RULE_INT )
                    // InternalProgram.g:682:6: lv_capacity_4_0= RULE_INT
                    {
                    lv_capacity_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_capacity_4_0, grammarAccess.getRoomAccess().getCapacityINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRoomRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"capacity",
                    							lv_capacity_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

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


    // $ANTLR start "entryRuleDay"
    // InternalProgram.g:703:1: entryRuleDay returns [EObject current=null] : iv_ruleDay= ruleDay EOF ;
    public final EObject entryRuleDay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDay = null;


        try {
            // InternalProgram.g:703:44: (iv_ruleDay= ruleDay EOF )
            // InternalProgram.g:704:2: iv_ruleDay= ruleDay EOF
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
    // InternalProgram.g:710:1: ruleDay returns [EObject current=null] : ( ( (lv_weekday_0_0= ruleWeekDay ) ) (otherlv_1= 'date' ( (lv_date_2_0= ruleDayDate ) ) )? ( ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )* )? ) ;
    public final EObject ruleDay() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_weekday_0_0 = null;

        EObject lv_date_2_0 = null;

        EObject lv_sessions_3_0 = null;

        EObject lv_sessions_4_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:716:2: ( ( ( (lv_weekday_0_0= ruleWeekDay ) ) (otherlv_1= 'date' ( (lv_date_2_0= ruleDayDate ) ) )? ( ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )* )? ) )
            // InternalProgram.g:717:2: ( ( (lv_weekday_0_0= ruleWeekDay ) ) (otherlv_1= 'date' ( (lv_date_2_0= ruleDayDate ) ) )? ( ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )* )? )
            {
            // InternalProgram.g:717:2: ( ( (lv_weekday_0_0= ruleWeekDay ) ) (otherlv_1= 'date' ( (lv_date_2_0= ruleDayDate ) ) )? ( ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )* )? )
            // InternalProgram.g:718:3: ( (lv_weekday_0_0= ruleWeekDay ) ) (otherlv_1= 'date' ( (lv_date_2_0= ruleDayDate ) ) )? ( ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )* )?
            {
            // InternalProgram.g:718:3: ( (lv_weekday_0_0= ruleWeekDay ) )
            // InternalProgram.g:719:4: (lv_weekday_0_0= ruleWeekDay )
            {
            // InternalProgram.g:719:4: (lv_weekday_0_0= ruleWeekDay )
            // InternalProgram.g:720:5: lv_weekday_0_0= ruleWeekDay
            {

            					newCompositeNode(grammarAccess.getDayAccess().getWeekdayWeekDayEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalProgram.g:737:3: (otherlv_1= 'date' ( (lv_date_2_0= ruleDayDate ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalProgram.g:738:4: otherlv_1= 'date' ( (lv_date_2_0= ruleDayDate ) )
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getDayAccess().getDateKeyword_1_0());
                    			
                    // InternalProgram.g:742:4: ( (lv_date_2_0= ruleDayDate ) )
                    // InternalProgram.g:743:5: (lv_date_2_0= ruleDayDate )
                    {
                    // InternalProgram.g:743:5: (lv_date_2_0= ruleDayDate )
                    // InternalProgram.g:744:6: lv_date_2_0= ruleDayDate
                    {

                    						newCompositeNode(grammarAccess.getDayAccess().getDateDayDateParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_date_2_0=ruleDayDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDayRule());
                    						}
                    						set(
                    							current,
                    							"date",
                    							lv_date_2_0,
                    							"fr.inria.diverse.models2016.dsl.Program.DayDate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:762:3: ( ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalProgram.g:763:4: ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )*
                    {
                    // InternalProgram.g:763:4: ( (lv_sessions_3_0= ruleSession ) )
                    // InternalProgram.g:764:5: (lv_sessions_3_0= ruleSession )
                    {
                    // InternalProgram.g:764:5: (lv_sessions_3_0= ruleSession )
                    // InternalProgram.g:765:6: lv_sessions_3_0= ruleSession
                    {

                    						newCompositeNode(grammarAccess.getDayAccess().getSessionsSessionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_18);
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

                    // InternalProgram.g:782:4: ( (lv_sessions_4_0= ruleSession ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_INT) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalProgram.g:783:5: (lv_sessions_4_0= ruleSession )
                    	    {
                    	    // InternalProgram.g:783:5: (lv_sessions_4_0= ruleSession )
                    	    // InternalProgram.g:784:6: lv_sessions_4_0= ruleSession
                    	    {

                    	    						newCompositeNode(grammarAccess.getDayAccess().getSessionsSessionParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
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
                    	    break loop15;
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


    // $ANTLR start "entryRuleDayDate"
    // InternalProgram.g:806:1: entryRuleDayDate returns [EObject current=null] : iv_ruleDayDate= ruleDayDate EOF ;
    public final EObject entryRuleDayDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDayDate = null;


        try {
            // InternalProgram.g:806:48: (iv_ruleDayDate= ruleDayDate EOF )
            // InternalProgram.g:807:2: iv_ruleDayDate= ruleDayDate EOF
            {
             newCompositeNode(grammarAccess.getDayDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDayDate=ruleDayDate();

            state._fsp--;

             current =iv_ruleDayDate; 
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
    // $ANTLR end "entryRuleDayDate"


    // $ANTLR start "ruleDayDate"
    // InternalProgram.g:813:1: ruleDayDate returns [EObject current=null] : ( ( (lv_year_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_month_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_day_4_0= RULE_INT ) ) ) ;
    public final EObject ruleDayDate() throws RecognitionException {
        EObject current = null;

        Token lv_year_0_0=null;
        Token otherlv_1=null;
        Token lv_month_2_0=null;
        Token otherlv_3=null;
        Token lv_day_4_0=null;


        	enterRule();

        try {
            // InternalProgram.g:819:2: ( ( ( (lv_year_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_month_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_day_4_0= RULE_INT ) ) ) )
            // InternalProgram.g:820:2: ( ( (lv_year_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_month_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_day_4_0= RULE_INT ) ) )
            {
            // InternalProgram.g:820:2: ( ( (lv_year_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_month_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_day_4_0= RULE_INT ) ) )
            // InternalProgram.g:821:3: ( (lv_year_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_month_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_day_4_0= RULE_INT ) )
            {
            // InternalProgram.g:821:3: ( (lv_year_0_0= RULE_INT ) )
            // InternalProgram.g:822:4: (lv_year_0_0= RULE_INT )
            {
            // InternalProgram.g:822:4: (lv_year_0_0= RULE_INT )
            // InternalProgram.g:823:5: lv_year_0_0= RULE_INT
            {
            lv_year_0_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_year_0_0, grammarAccess.getDayDateAccess().getYearINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDayDateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"year",
            						lv_year_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDayDateAccess().getFullStopKeyword_1());
            		
            // InternalProgram.g:843:3: ( (lv_month_2_0= RULE_INT ) )
            // InternalProgram.g:844:4: (lv_month_2_0= RULE_INT )
            {
            // InternalProgram.g:844:4: (lv_month_2_0= RULE_INT )
            // InternalProgram.g:845:5: lv_month_2_0= RULE_INT
            {
            lv_month_2_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_month_2_0, grammarAccess.getDayDateAccess().getMonthINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDayDateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"month",
            						lv_month_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getDayDateAccess().getFullStopKeyword_3());
            		
            // InternalProgram.g:865:3: ( (lv_day_4_0= RULE_INT ) )
            // InternalProgram.g:866:4: (lv_day_4_0= RULE_INT )
            {
            // InternalProgram.g:866:4: (lv_day_4_0= RULE_INT )
            // InternalProgram.g:867:5: lv_day_4_0= RULE_INT
            {
            lv_day_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_day_4_0, grammarAccess.getDayDateAccess().getDayINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDayDateRule());
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
    // $ANTLR end "ruleDayDate"


    // $ANTLR start "entryRuleHourDate"
    // InternalProgram.g:887:1: entryRuleHourDate returns [EObject current=null] : iv_ruleHourDate= ruleHourDate EOF ;
    public final EObject entryRuleHourDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHourDate = null;


        try {
            // InternalProgram.g:887:49: (iv_ruleHourDate= ruleHourDate EOF )
            // InternalProgram.g:888:2: iv_ruleHourDate= ruleHourDate EOF
            {
             newCompositeNode(grammarAccess.getHourDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHourDate=ruleHourDate();

            state._fsp--;

             current =iv_ruleHourDate; 
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
    // $ANTLR end "entryRuleHourDate"


    // $ANTLR start "ruleHourDate"
    // InternalProgram.g:894:1: ruleHourDate returns [EObject current=null] : ( ( (lv_hours_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_minutes_2_0= RULE_INT ) ) ) ;
    public final EObject ruleHourDate() throws RecognitionException {
        EObject current = null;

        Token lv_hours_0_0=null;
        Token otherlv_1=null;
        Token lv_minutes_2_0=null;


        	enterRule();

        try {
            // InternalProgram.g:900:2: ( ( ( (lv_hours_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_minutes_2_0= RULE_INT ) ) ) )
            // InternalProgram.g:901:2: ( ( (lv_hours_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_minutes_2_0= RULE_INT ) ) )
            {
            // InternalProgram.g:901:2: ( ( (lv_hours_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_minutes_2_0= RULE_INT ) ) )
            // InternalProgram.g:902:3: ( (lv_hours_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_minutes_2_0= RULE_INT ) )
            {
            // InternalProgram.g:902:3: ( (lv_hours_0_0= RULE_INT ) )
            // InternalProgram.g:903:4: (lv_hours_0_0= RULE_INT )
            {
            // InternalProgram.g:903:4: (lv_hours_0_0= RULE_INT )
            // InternalProgram.g:904:5: lv_hours_0_0= RULE_INT
            {
            lv_hours_0_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_hours_0_0, grammarAccess.getHourDateAccess().getHoursINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHourDateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"hours",
            						lv_hours_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getHourDateAccess().getColonKeyword_1());
            		
            // InternalProgram.g:924:3: ( (lv_minutes_2_0= RULE_INT ) )
            // InternalProgram.g:925:4: (lv_minutes_2_0= RULE_INT )
            {
            // InternalProgram.g:925:4: (lv_minutes_2_0= RULE_INT )
            // InternalProgram.g:926:5: lv_minutes_2_0= RULE_INT
            {
            lv_minutes_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_minutes_2_0, grammarAccess.getHourDateAccess().getMinutesINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHourDateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"minutes",
            						lv_minutes_2_0,
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
    // $ANTLR end "ruleHourDate"


    // $ANTLR start "entryRuleSession"
    // InternalProgram.g:946:1: entryRuleSession returns [EObject current=null] : iv_ruleSession= ruleSession EOF ;
    public final EObject entryRuleSession() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSession = null;


        try {
            // InternalProgram.g:946:48: (iv_ruleSession= ruleSession EOF )
            // InternalProgram.g:947:2: iv_ruleSession= ruleSession EOF
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
    // InternalProgram.g:953:1: ruleSession returns [EObject current=null] : ( () ( (lv_startingTime_1_0= ruleHourDate ) ) otherlv_2= '-' ( (lv_endingTime_3_0= ruleHourDate ) ) otherlv_4= 'in' ( (otherlv_5= RULE_STRING ) ) otherlv_6= ':' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* ) ;
    public final EObject ruleSession() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_startingTime_1_0 = null;

        EObject lv_endingTime_3_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:959:2: ( ( () ( (lv_startingTime_1_0= ruleHourDate ) ) otherlv_2= '-' ( (lv_endingTime_3_0= ruleHourDate ) ) otherlv_4= 'in' ( (otherlv_5= RULE_STRING ) ) otherlv_6= ':' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* ) )
            // InternalProgram.g:960:2: ( () ( (lv_startingTime_1_0= ruleHourDate ) ) otherlv_2= '-' ( (lv_endingTime_3_0= ruleHourDate ) ) otherlv_4= 'in' ( (otherlv_5= RULE_STRING ) ) otherlv_6= ':' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* )
            {
            // InternalProgram.g:960:2: ( () ( (lv_startingTime_1_0= ruleHourDate ) ) otherlv_2= '-' ( (lv_endingTime_3_0= ruleHourDate ) ) otherlv_4= 'in' ( (otherlv_5= RULE_STRING ) ) otherlv_6= ':' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* )
            // InternalProgram.g:961:3: () ( (lv_startingTime_1_0= ruleHourDate ) ) otherlv_2= '-' ( (lv_endingTime_3_0= ruleHourDate ) ) otherlv_4= 'in' ( (otherlv_5= RULE_STRING ) ) otherlv_6= ':' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )*
            {
            // InternalProgram.g:961:3: ()
            // InternalProgram.g:962:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSessionAccess().getSessionAction_0(),
            					current);
            			

            }

            // InternalProgram.g:968:3: ( (lv_startingTime_1_0= ruleHourDate ) )
            // InternalProgram.g:969:4: (lv_startingTime_1_0= ruleHourDate )
            {
            // InternalProgram.g:969:4: (lv_startingTime_1_0= ruleHourDate )
            // InternalProgram.g:970:5: lv_startingTime_1_0= ruleHourDate
            {

            					newCompositeNode(grammarAccess.getSessionAccess().getStartingTimeHourDateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_startingTime_1_0=ruleHourDate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSessionRule());
            					}
            					set(
            						current,
            						"startingTime",
            						lv_startingTime_1_0,
            						"fr.inria.diverse.models2016.dsl.Program.HourDate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSessionAccess().getHyphenMinusKeyword_2());
            		
            // InternalProgram.g:991:3: ( (lv_endingTime_3_0= ruleHourDate ) )
            // InternalProgram.g:992:4: (lv_endingTime_3_0= ruleHourDate )
            {
            // InternalProgram.g:992:4: (lv_endingTime_3_0= ruleHourDate )
            // InternalProgram.g:993:5: lv_endingTime_3_0= ruleHourDate
            {

            					newCompositeNode(grammarAccess.getSessionAccess().getEndingTimeHourDateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_endingTime_3_0=ruleHourDate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSessionRule());
            					}
            					set(
            						current,
            						"endingTime",
            						lv_endingTime_3_0,
            						"fr.inria.diverse.models2016.dsl.Program.HourDate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getSessionAccess().getInKeyword_4());
            		
            // InternalProgram.g:1014:3: ( (otherlv_5= RULE_STRING ) )
            // InternalProgram.g:1015:4: (otherlv_5= RULE_STRING )
            {
            // InternalProgram.g:1015:4: (otherlv_5= RULE_STRING )
            // InternalProgram.g:1016:5: otherlv_5= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSessionRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(otherlv_5, grammarAccess.getSessionAccess().getRoomRoomCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getSessionAccess().getColonKeyword_6());
            		
            // InternalProgram.g:1031:3: ( (otherlv_7= RULE_STRING ) )
            // InternalProgram.g:1032:4: (otherlv_7= RULE_STRING )
            {
            // InternalProgram.g:1032:4: (otherlv_7= RULE_STRING )
            // InternalProgram.g:1033:5: otherlv_7= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSessionRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(otherlv_7, grammarAccess.getSessionAccess().getEventsEventCrossReference_7_0());
            				

            }


            }

            // InternalProgram.g:1044:3: (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==14) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalProgram.g:1045:4: otherlv_8= ',' ( (otherlv_9= RULE_STRING ) )
            	    {
            	    otherlv_8=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_8, grammarAccess.getSessionAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalProgram.g:1049:4: ( (otherlv_9= RULE_STRING ) )
            	    // InternalProgram.g:1050:5: (otherlv_9= RULE_STRING )
            	    {
            	    // InternalProgram.g:1050:5: (otherlv_9= RULE_STRING )
            	    // InternalProgram.g:1051:6: otherlv_9= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSessionRule());
            	    						}
            	    					
            	    otherlv_9=(Token)match(input,RULE_STRING,FOLLOW_23); 

            	    						newLeafNode(otherlv_9, grammarAccess.getSessionAccess().getEventsEventCrossReference_8_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalProgram.g:1067:1: entryRuleTalkSession returns [EObject current=null] : iv_ruleTalkSession= ruleTalkSession EOF ;
    public final EObject entryRuleTalkSession() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTalkSession = null;


        try {
            // InternalProgram.g:1067:52: (iv_ruleTalkSession= ruleTalkSession EOF )
            // InternalProgram.g:1068:2: iv_ruleTalkSession= ruleTalkSession EOF
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
    // InternalProgram.g:1074:1: ruleTalkSession returns [EObject current=null] : (otherlv_0= 'TalkSession' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) ) )? (otherlv_4= 'abstract' ( (lv_abstract_5_0= RULE_STRING ) ) )? (otherlv_6= 'papers' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* )? ) ;
    public final EObject ruleTalkSession() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_abstract_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_chair_3_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:1080:2: ( (otherlv_0= 'TalkSession' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) ) )? (otherlv_4= 'abstract' ( (lv_abstract_5_0= RULE_STRING ) ) )? (otherlv_6= 'papers' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* )? ) )
            // InternalProgram.g:1081:2: (otherlv_0= 'TalkSession' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) ) )? (otherlv_4= 'abstract' ( (lv_abstract_5_0= RULE_STRING ) ) )? (otherlv_6= 'papers' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* )? )
            {
            // InternalProgram.g:1081:2: (otherlv_0= 'TalkSession' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) ) )? (otherlv_4= 'abstract' ( (lv_abstract_5_0= RULE_STRING ) ) )? (otherlv_6= 'papers' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* )? )
            // InternalProgram.g:1082:3: otherlv_0= 'TalkSession' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) ) )? (otherlv_4= 'abstract' ( (lv_abstract_5_0= RULE_STRING ) ) )? (otherlv_6= 'papers' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTalkSessionAccess().getTalkSessionKeyword_0());
            		
            // InternalProgram.g:1086:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalProgram.g:1087:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalProgram.g:1087:4: (lv_name_1_0= RULE_STRING )
            // InternalProgram.g:1088:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTalkSessionAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTalkSessionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalProgram.g:1104:3: (otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalProgram.g:1105:4: otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getTalkSessionAccess().getChairKeyword_2_0());
                    			
                    // InternalProgram.g:1109:4: ( (lv_chair_3_0= rulePerson ) )
                    // InternalProgram.g:1110:5: (lv_chair_3_0= rulePerson )
                    {
                    // InternalProgram.g:1110:5: (lv_chair_3_0= rulePerson )
                    // InternalProgram.g:1111:6: lv_chair_3_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getTalkSessionAccess().getChairPersonParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_25);
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

            // InternalProgram.g:1129:3: (otherlv_4= 'abstract' ( (lv_abstract_5_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalProgram.g:1130:4: otherlv_4= 'abstract' ( (lv_abstract_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTalkSessionAccess().getAbstractKeyword_3_0());
                    			
                    // InternalProgram.g:1134:4: ( (lv_abstract_5_0= RULE_STRING ) )
                    // InternalProgram.g:1135:5: (lv_abstract_5_0= RULE_STRING )
                    {
                    // InternalProgram.g:1135:5: (lv_abstract_5_0= RULE_STRING )
                    // InternalProgram.g:1136:6: lv_abstract_5_0= RULE_STRING
                    {
                    lv_abstract_5_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

                    						newLeafNode(lv_abstract_5_0, grammarAccess.getTalkSessionAccess().getAbstractSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTalkSessionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"abstract",
                    							lv_abstract_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1153:3: (otherlv_6= 'papers' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==16) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalProgram.g:1154:4: otherlv_6= 'papers' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )*
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getTalkSessionAccess().getPapersKeyword_4_0());
                    			
                    // InternalProgram.g:1158:4: ( (otherlv_7= RULE_STRING ) )
                    // InternalProgram.g:1159:5: (otherlv_7= RULE_STRING )
                    {
                    // InternalProgram.g:1159:5: (otherlv_7= RULE_STRING )
                    // InternalProgram.g:1160:6: otherlv_7= RULE_STRING
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTalkSessionRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_STRING,FOLLOW_23); 

                    						newLeafNode(otherlv_7, grammarAccess.getTalkSessionAccess().getPapersPaperCrossReference_4_1_0());
                    					

                    }


                    }

                    // InternalProgram.g:1171:4: (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==14) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalProgram.g:1172:5: otherlv_8= ',' ( (otherlv_9= RULE_STRING ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getTalkSessionAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalProgram.g:1176:5: ( (otherlv_9= RULE_STRING ) )
                    	    // InternalProgram.g:1177:6: (otherlv_9= RULE_STRING )
                    	    {
                    	    // InternalProgram.g:1177:6: (otherlv_9= RULE_STRING )
                    	    // InternalProgram.g:1178:7: otherlv_9= RULE_STRING
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTalkSessionRule());
                    	    							}
                    	    						
                    	    otherlv_9=(Token)match(input,RULE_STRING,FOLLOW_23); 

                    	    							newLeafNode(otherlv_9, grammarAccess.getTalkSessionAccess().getPapersPaperCrossReference_4_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
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
    // InternalProgram.g:1195:1: entryRulePanel returns [EObject current=null] : iv_rulePanel= rulePanel EOF ;
    public final EObject entryRulePanel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePanel = null;


        try {
            // InternalProgram.g:1195:46: (iv_rulePanel= rulePanel EOF )
            // InternalProgram.g:1196:2: iv_rulePanel= rulePanel EOF
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
    // InternalProgram.g:1202:1: rulePanel returns [EObject current=null] : (otherlv_0= 'Panel' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )* )? (otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )* )? ( (lv_cancelled_12_0= 'cancelled' ) )? ) ;
    public final EObject rulePanel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_abstract_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_cancelled_12_0=null;
        EObject lv_panelists_5_0 = null;

        EObject lv_panelists_7_0 = null;

        EObject lv_moderators_9_0 = null;

        EObject lv_moderators_11_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:1208:2: ( (otherlv_0= 'Panel' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )* )? (otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )* )? ( (lv_cancelled_12_0= 'cancelled' ) )? ) )
            // InternalProgram.g:1209:2: (otherlv_0= 'Panel' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )* )? (otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )* )? ( (lv_cancelled_12_0= 'cancelled' ) )? )
            {
            // InternalProgram.g:1209:2: (otherlv_0= 'Panel' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )* )? (otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )* )? ( (lv_cancelled_12_0= 'cancelled' ) )? )
            // InternalProgram.g:1210:3: otherlv_0= 'Panel' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )* )? (otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )* )? ( (lv_cancelled_12_0= 'cancelled' ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPanelAccess().getPanelKeyword_0());
            		
            // InternalProgram.g:1214:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalProgram.g:1215:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalProgram.g:1215:4: (lv_name_1_0= RULE_STRING )
            // InternalProgram.g:1216:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPanelAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPanelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalProgram.g:1232:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalProgram.g:1233:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getPanelAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1237:4: ( (lv_abstract_3_0= RULE_STRING ) )
                    // InternalProgram.g:1238:5: (lv_abstract_3_0= RULE_STRING )
                    {
                    // InternalProgram.g:1238:5: (lv_abstract_3_0= RULE_STRING )
                    // InternalProgram.g:1239:6: lv_abstract_3_0= RULE_STRING
                    {
                    lv_abstract_3_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

                    						newLeafNode(lv_abstract_3_0, grammarAccess.getPanelAccess().getAbstractSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPanelRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"abstract",
                    							lv_abstract_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1256:3: (otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalProgram.g:1257:4: otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )*
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getPanelAccess().getPanelistsKeyword_3_0());
                    			
                    // InternalProgram.g:1261:4: ( (lv_panelists_5_0= rulePerson ) )
                    // InternalProgram.g:1262:5: (lv_panelists_5_0= rulePerson )
                    {
                    // InternalProgram.g:1262:5: (lv_panelists_5_0= rulePerson )
                    // InternalProgram.g:1263:6: lv_panelists_5_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getPanelAccess().getPanelistsPersonParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    // InternalProgram.g:1280:4: (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==14) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalProgram.g:1281:5: otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPanelAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalProgram.g:1285:5: ( (lv_panelists_7_0= rulePerson ) )
                    	    // InternalProgram.g:1286:6: (lv_panelists_7_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:1286:6: (lv_panelists_7_0= rulePerson )
                    	    // InternalProgram.g:1287:7: lv_panelists_7_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getPanelAccess().getPanelistsPersonParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
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
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalProgram.g:1306:3: (otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==34) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalProgram.g:1307:4: otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )*
                    {
                    otherlv_8=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getPanelAccess().getModeratorsKeyword_4_0());
                    			
                    // InternalProgram.g:1311:4: ( (lv_moderators_9_0= rulePerson ) )
                    // InternalProgram.g:1312:5: (lv_moderators_9_0= rulePerson )
                    {
                    // InternalProgram.g:1312:5: (lv_moderators_9_0= rulePerson )
                    // InternalProgram.g:1313:6: lv_moderators_9_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getPanelAccess().getModeratorsPersonParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    // InternalProgram.g:1330:4: (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==14) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalProgram.g:1331:5: otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getPanelAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalProgram.g:1335:5: ( (lv_moderators_11_0= rulePerson ) )
                    	    // InternalProgram.g:1336:6: (lv_moderators_11_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:1336:6: (lv_moderators_11_0= rulePerson )
                    	    // InternalProgram.g:1337:7: lv_moderators_11_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getPanelAccess().getModeratorsPersonParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
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
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalProgram.g:1356:3: ( (lv_cancelled_12_0= 'cancelled' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalProgram.g:1357:4: (lv_cancelled_12_0= 'cancelled' )
                    {
                    // InternalProgram.g:1357:4: (lv_cancelled_12_0= 'cancelled' )
                    // InternalProgram.g:1358:5: lv_cancelled_12_0= 'cancelled'
                    {
                    lv_cancelled_12_0=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_cancelled_12_0, grammarAccess.getPanelAccess().getCancelledCancelledKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPanelRule());
                    					}
                    					setWithLastConsumed(current, "cancelled", true, "cancelled");
                    				

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
    // $ANTLR end "rulePanel"


    // $ANTLR start "entryRuleSRC"
    // InternalProgram.g:1374:1: entryRuleSRC returns [EObject current=null] : iv_ruleSRC= ruleSRC EOF ;
    public final EObject entryRuleSRC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSRC = null;


        try {
            // InternalProgram.g:1374:44: (iv_ruleSRC= ruleSRC EOF )
            // InternalProgram.g:1375:2: iv_ruleSRC= ruleSRC EOF
            {
             newCompositeNode(grammarAccess.getSRCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSRC=ruleSRC();

            state._fsp--;

             current =iv_ruleSRC; 
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
    // $ANTLR end "entryRuleSRC"


    // $ANTLR start "ruleSRC"
    // InternalProgram.g:1381:1: ruleSRC returns [EObject current=null] : (otherlv_0= 'SRC' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )? ( (lv_cancelled_6_0= 'cancelled' ) )? ) ;
    public final EObject ruleSRC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_abstract_3_0=null;
        Token otherlv_4=null;
        Token lv_url_5_0=null;
        Token lv_cancelled_6_0=null;


        	enterRule();

        try {
            // InternalProgram.g:1387:2: ( (otherlv_0= 'SRC' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )? ( (lv_cancelled_6_0= 'cancelled' ) )? ) )
            // InternalProgram.g:1388:2: (otherlv_0= 'SRC' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )? ( (lv_cancelled_6_0= 'cancelled' ) )? )
            {
            // InternalProgram.g:1388:2: (otherlv_0= 'SRC' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )? ( (lv_cancelled_6_0= 'cancelled' ) )? )
            // InternalProgram.g:1389:3: otherlv_0= 'SRC' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )? ( (lv_cancelled_6_0= 'cancelled' ) )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSRCAccess().getSRCKeyword_0());
            		
            // InternalProgram.g:1393:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalProgram.g:1394:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalProgram.g:1394:4: (lv_name_1_0= RULE_STRING )
            // InternalProgram.g:1395:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSRCAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSRCRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalProgram.g:1411:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalProgram.g:1412:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getSRCAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1416:4: ( (lv_abstract_3_0= RULE_STRING ) )
                    // InternalProgram.g:1417:5: (lv_abstract_3_0= RULE_STRING )
                    {
                    // InternalProgram.g:1417:5: (lv_abstract_3_0= RULE_STRING )
                    // InternalProgram.g:1418:6: lv_abstract_3_0= RULE_STRING
                    {
                    lv_abstract_3_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    						newLeafNode(lv_abstract_3_0, grammarAccess.getSRCAccess().getAbstractSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSRCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"abstract",
                    							lv_abstract_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1435:3: (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==37) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalProgram.g:1436:4: otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getSRCAccess().getUrlKeyword_3_0());
                    			
                    // InternalProgram.g:1440:4: ( (lv_url_5_0= RULE_STRING ) )
                    // InternalProgram.g:1441:5: (lv_url_5_0= RULE_STRING )
                    {
                    // InternalProgram.g:1441:5: (lv_url_5_0= RULE_STRING )
                    // InternalProgram.g:1442:6: lv_url_5_0= RULE_STRING
                    {
                    lv_url_5_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

                    						newLeafNode(lv_url_5_0, grammarAccess.getSRCAccess().getUrlSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSRCRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"url",
                    							lv_url_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1459:3: ( (lv_cancelled_6_0= 'cancelled' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==35) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalProgram.g:1460:4: (lv_cancelled_6_0= 'cancelled' )
                    {
                    // InternalProgram.g:1460:4: (lv_cancelled_6_0= 'cancelled' )
                    // InternalProgram.g:1461:5: lv_cancelled_6_0= 'cancelled'
                    {
                    lv_cancelled_6_0=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_cancelled_6_0, grammarAccess.getSRCAccess().getCancelledCancelledKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSRCRule());
                    					}
                    					setWithLastConsumed(current, "cancelled", true, "cancelled");
                    				

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
    // $ANTLR end "ruleSRC"


    // $ANTLR start "entryRulePoster"
    // InternalProgram.g:1477:1: entryRulePoster returns [EObject current=null] : iv_rulePoster= rulePoster EOF ;
    public final EObject entryRulePoster() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoster = null;


        try {
            // InternalProgram.g:1477:47: (iv_rulePoster= rulePoster EOF )
            // InternalProgram.g:1478:2: iv_rulePoster= rulePoster EOF
            {
             newCompositeNode(grammarAccess.getPosterRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePoster=rulePoster();

            state._fsp--;

             current =iv_rulePoster; 
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
    // $ANTLR end "entryRulePoster"


    // $ANTLR start "rulePoster"
    // InternalProgram.g:1484:1: rulePoster returns [EObject current=null] : (otherlv_0= 'Poster' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )? ( (lv_cancelled_6_0= 'cancelled' ) )? ) ;
    public final EObject rulePoster() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_abstract_3_0=null;
        Token otherlv_4=null;
        Token lv_url_5_0=null;
        Token lv_cancelled_6_0=null;


        	enterRule();

        try {
            // InternalProgram.g:1490:2: ( (otherlv_0= 'Poster' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )? ( (lv_cancelled_6_0= 'cancelled' ) )? ) )
            // InternalProgram.g:1491:2: (otherlv_0= 'Poster' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )? ( (lv_cancelled_6_0= 'cancelled' ) )? )
            {
            // InternalProgram.g:1491:2: (otherlv_0= 'Poster' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )? ( (lv_cancelled_6_0= 'cancelled' ) )? )
            // InternalProgram.g:1492:3: otherlv_0= 'Poster' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )? ( (lv_cancelled_6_0= 'cancelled' ) )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPosterAccess().getPosterKeyword_0());
            		
            // InternalProgram.g:1496:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalProgram.g:1497:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalProgram.g:1497:4: (lv_name_1_0= RULE_STRING )
            // InternalProgram.g:1498:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPosterAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPosterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalProgram.g:1514:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalProgram.g:1515:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getPosterAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1519:4: ( (lv_abstract_3_0= RULE_STRING ) )
                    // InternalProgram.g:1520:5: (lv_abstract_3_0= RULE_STRING )
                    {
                    // InternalProgram.g:1520:5: (lv_abstract_3_0= RULE_STRING )
                    // InternalProgram.g:1521:6: lv_abstract_3_0= RULE_STRING
                    {
                    lv_abstract_3_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    						newLeafNode(lv_abstract_3_0, grammarAccess.getPosterAccess().getAbstractSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPosterRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"abstract",
                    							lv_abstract_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1538:3: (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==37) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalProgram.g:1539:4: otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getPosterAccess().getUrlKeyword_3_0());
                    			
                    // InternalProgram.g:1543:4: ( (lv_url_5_0= RULE_STRING ) )
                    // InternalProgram.g:1544:5: (lv_url_5_0= RULE_STRING )
                    {
                    // InternalProgram.g:1544:5: (lv_url_5_0= RULE_STRING )
                    // InternalProgram.g:1545:6: lv_url_5_0= RULE_STRING
                    {
                    lv_url_5_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

                    						newLeafNode(lv_url_5_0, grammarAccess.getPosterAccess().getUrlSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPosterRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"url",
                    							lv_url_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1562:3: ( (lv_cancelled_6_0= 'cancelled' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==35) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalProgram.g:1563:4: (lv_cancelled_6_0= 'cancelled' )
                    {
                    // InternalProgram.g:1563:4: (lv_cancelled_6_0= 'cancelled' )
                    // InternalProgram.g:1564:5: lv_cancelled_6_0= 'cancelled'
                    {
                    lv_cancelled_6_0=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_cancelled_6_0, grammarAccess.getPosterAccess().getCancelledCancelledKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPosterRule());
                    					}
                    					setWithLastConsumed(current, "cancelled", true, "cancelled");
                    				

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
    // $ANTLR end "rulePoster"


    // $ANTLR start "entryRuleKeynote"
    // InternalProgram.g:1580:1: entryRuleKeynote returns [EObject current=null] : iv_ruleKeynote= ruleKeynote EOF ;
    public final EObject entryRuleKeynote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeynote = null;


        try {
            // InternalProgram.g:1580:48: (iv_ruleKeynote= ruleKeynote EOF )
            // InternalProgram.g:1581:2: iv_ruleKeynote= ruleKeynote EOF
            {
             newCompositeNode(grammarAccess.getKeynoteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeynote=ruleKeynote();

            state._fsp--;

             current =iv_ruleKeynote; 
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
    // $ANTLR end "entryRuleKeynote"


    // $ANTLR start "ruleKeynote"
    // InternalProgram.g:1587:1: ruleKeynote returns [EObject current=null] : (otherlv_0= 'Keynote' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) ) )? (otherlv_6= 'chair' ( (lv_chair_7_0= rulePerson ) ) )? ( (lv_cancelled_8_0= 'cancelled' ) )? ) ;
    public final EObject ruleKeynote() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_abstract_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_cancelled_8_0=null;
        EObject lv_speaker_5_0 = null;

        EObject lv_chair_7_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:1593:2: ( (otherlv_0= 'Keynote' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) ) )? (otherlv_6= 'chair' ( (lv_chair_7_0= rulePerson ) ) )? ( (lv_cancelled_8_0= 'cancelled' ) )? ) )
            // InternalProgram.g:1594:2: (otherlv_0= 'Keynote' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) ) )? (otherlv_6= 'chair' ( (lv_chair_7_0= rulePerson ) ) )? ( (lv_cancelled_8_0= 'cancelled' ) )? )
            {
            // InternalProgram.g:1594:2: (otherlv_0= 'Keynote' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) ) )? (otherlv_6= 'chair' ( (lv_chair_7_0= rulePerson ) ) )? ( (lv_cancelled_8_0= 'cancelled' ) )? )
            // InternalProgram.g:1595:3: otherlv_0= 'Keynote' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) ) )? (otherlv_6= 'chair' ( (lv_chair_7_0= rulePerson ) ) )? ( (lv_cancelled_8_0= 'cancelled' ) )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getKeynoteAccess().getKeynoteKeyword_0());
            		
            // InternalProgram.g:1599:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalProgram.g:1600:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalProgram.g:1600:4: (lv_name_1_0= RULE_STRING )
            // InternalProgram.g:1601:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            					newLeafNode(lv_name_1_0, grammarAccess.getKeynoteAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKeynoteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalProgram.g:1617:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==31) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalProgram.g:1618:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getKeynoteAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1622:4: ( (lv_abstract_3_0= RULE_STRING ) )
                    // InternalProgram.g:1623:5: (lv_abstract_3_0= RULE_STRING )
                    {
                    // InternalProgram.g:1623:5: (lv_abstract_3_0= RULE_STRING )
                    // InternalProgram.g:1624:6: lv_abstract_3_0= RULE_STRING
                    {
                    lv_abstract_3_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

                    						newLeafNode(lv_abstract_3_0, grammarAccess.getKeynoteAccess().getAbstractSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKeynoteRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"abstract",
                    							lv_abstract_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1641:3: (otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==40) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalProgram.g:1642:4: otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) )
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getKeynoteAccess().getSpeakerKeyword_3_0());
                    			
                    // InternalProgram.g:1646:4: ( (lv_speaker_5_0= rulePerson ) )
                    // InternalProgram.g:1647:5: (lv_speaker_5_0= rulePerson )
                    {
                    // InternalProgram.g:1647:5: (lv_speaker_5_0= rulePerson )
                    // InternalProgram.g:1648:6: lv_speaker_5_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getKeynoteAccess().getSpeakerPersonParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_speaker_5_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKeynoteRule());
                    						}
                    						set(
                    							current,
                    							"speaker",
                    							lv_speaker_5_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1666:3: (otherlv_6= 'chair' ( (lv_chair_7_0= rulePerson ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==30) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalProgram.g:1667:4: otherlv_6= 'chair' ( (lv_chair_7_0= rulePerson ) )
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getKeynoteAccess().getChairKeyword_4_0());
                    			
                    // InternalProgram.g:1671:4: ( (lv_chair_7_0= rulePerson ) )
                    // InternalProgram.g:1672:5: (lv_chair_7_0= rulePerson )
                    {
                    // InternalProgram.g:1672:5: (lv_chair_7_0= rulePerson )
                    // InternalProgram.g:1673:6: lv_chair_7_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getKeynoteAccess().getChairPersonParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_chair_7_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKeynoteRule());
                    						}
                    						set(
                    							current,
                    							"chair",
                    							lv_chair_7_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1691:3: ( (lv_cancelled_8_0= 'cancelled' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==35) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalProgram.g:1692:4: (lv_cancelled_8_0= 'cancelled' )
                    {
                    // InternalProgram.g:1692:4: (lv_cancelled_8_0= 'cancelled' )
                    // InternalProgram.g:1693:5: lv_cancelled_8_0= 'cancelled'
                    {
                    lv_cancelled_8_0=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_cancelled_8_0, grammarAccess.getKeynoteAccess().getCancelledCancelledKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getKeynoteRule());
                    					}
                    					setWithLastConsumed(current, "cancelled", true, "cancelled");
                    				

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
    // $ANTLR end "ruleKeynote"


    // $ANTLR start "entryRuleSponsorKeynote"
    // InternalProgram.g:1709:1: entryRuleSponsorKeynote returns [EObject current=null] : iv_ruleSponsorKeynote= ruleSponsorKeynote EOF ;
    public final EObject entryRuleSponsorKeynote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSponsorKeynote = null;


        try {
            // InternalProgram.g:1709:55: (iv_ruleSponsorKeynote= ruleSponsorKeynote EOF )
            // InternalProgram.g:1710:2: iv_ruleSponsorKeynote= ruleSponsorKeynote EOF
            {
             newCompositeNode(grammarAccess.getSponsorKeynoteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSponsorKeynote=ruleSponsorKeynote();

            state._fsp--;

             current =iv_ruleSponsorKeynote; 
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
    // $ANTLR end "entryRuleSponsorKeynote"


    // $ANTLR start "ruleSponsorKeynote"
    // InternalProgram.g:1716:1: ruleSponsorKeynote returns [EObject current=null] : (otherlv_0= 'SponsorKeynote' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) ) )? (otherlv_6= 'chair' ( (lv_chair_7_0= rulePerson ) ) )? ( (lv_cancelled_8_0= 'cancelled' ) )? ) ;
    public final EObject ruleSponsorKeynote() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_abstract_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_cancelled_8_0=null;
        EObject lv_speaker_5_0 = null;

        EObject lv_chair_7_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:1722:2: ( (otherlv_0= 'SponsorKeynote' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) ) )? (otherlv_6= 'chair' ( (lv_chair_7_0= rulePerson ) ) )? ( (lv_cancelled_8_0= 'cancelled' ) )? ) )
            // InternalProgram.g:1723:2: (otherlv_0= 'SponsorKeynote' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) ) )? (otherlv_6= 'chair' ( (lv_chair_7_0= rulePerson ) ) )? ( (lv_cancelled_8_0= 'cancelled' ) )? )
            {
            // InternalProgram.g:1723:2: (otherlv_0= 'SponsorKeynote' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) ) )? (otherlv_6= 'chair' ( (lv_chair_7_0= rulePerson ) ) )? ( (lv_cancelled_8_0= 'cancelled' ) )? )
            // InternalProgram.g:1724:3: otherlv_0= 'SponsorKeynote' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) ) )? (otherlv_6= 'chair' ( (lv_chair_7_0= rulePerson ) ) )? ( (lv_cancelled_8_0= 'cancelled' ) )?
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSponsorKeynoteAccess().getSponsorKeynoteKeyword_0());
            		
            // InternalProgram.g:1728:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalProgram.g:1729:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalProgram.g:1729:4: (lv_name_1_0= RULE_STRING )
            // InternalProgram.g:1730:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSponsorKeynoteAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSponsorKeynoteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalProgram.g:1746:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==31) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalProgram.g:1747:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getSponsorKeynoteAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1751:4: ( (lv_abstract_3_0= RULE_STRING ) )
                    // InternalProgram.g:1752:5: (lv_abstract_3_0= RULE_STRING )
                    {
                    // InternalProgram.g:1752:5: (lv_abstract_3_0= RULE_STRING )
                    // InternalProgram.g:1753:6: lv_abstract_3_0= RULE_STRING
                    {
                    lv_abstract_3_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

                    						newLeafNode(lv_abstract_3_0, grammarAccess.getSponsorKeynoteAccess().getAbstractSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSponsorKeynoteRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"abstract",
                    							lv_abstract_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1770:3: (otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==40) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalProgram.g:1771:4: otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) )
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getSponsorKeynoteAccess().getSpeakerKeyword_3_0());
                    			
                    // InternalProgram.g:1775:4: ( (lv_speaker_5_0= rulePerson ) )
                    // InternalProgram.g:1776:5: (lv_speaker_5_0= rulePerson )
                    {
                    // InternalProgram.g:1776:5: (lv_speaker_5_0= rulePerson )
                    // InternalProgram.g:1777:6: lv_speaker_5_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getSponsorKeynoteAccess().getSpeakerPersonParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_speaker_5_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSponsorKeynoteRule());
                    						}
                    						set(
                    							current,
                    							"speaker",
                    							lv_speaker_5_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1795:3: (otherlv_6= 'chair' ( (lv_chair_7_0= rulePerson ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==30) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalProgram.g:1796:4: otherlv_6= 'chair' ( (lv_chair_7_0= rulePerson ) )
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getSponsorKeynoteAccess().getChairKeyword_4_0());
                    			
                    // InternalProgram.g:1800:4: ( (lv_chair_7_0= rulePerson ) )
                    // InternalProgram.g:1801:5: (lv_chair_7_0= rulePerson )
                    {
                    // InternalProgram.g:1801:5: (lv_chair_7_0= rulePerson )
                    // InternalProgram.g:1802:6: lv_chair_7_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getSponsorKeynoteAccess().getChairPersonParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_chair_7_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSponsorKeynoteRule());
                    						}
                    						set(
                    							current,
                    							"chair",
                    							lv_chair_7_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1820:3: ( (lv_cancelled_8_0= 'cancelled' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==35) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalProgram.g:1821:4: (lv_cancelled_8_0= 'cancelled' )
                    {
                    // InternalProgram.g:1821:4: (lv_cancelled_8_0= 'cancelled' )
                    // InternalProgram.g:1822:5: lv_cancelled_8_0= 'cancelled'
                    {
                    lv_cancelled_8_0=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_cancelled_8_0, grammarAccess.getSponsorKeynoteAccess().getCancelledCancelledKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSponsorKeynoteRule());
                    					}
                    					setWithLastConsumed(current, "cancelled", true, "cancelled");
                    				

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
    // $ANTLR end "ruleSponsorKeynote"


    // $ANTLR start "entryRuleWorkshop"
    // InternalProgram.g:1838:1: entryRuleWorkshop returns [EObject current=null] : iv_ruleWorkshop= ruleWorkshop EOF ;
    public final EObject entryRuleWorkshop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkshop = null;


        try {
            // InternalProgram.g:1838:49: (iv_ruleWorkshop= ruleWorkshop EOF )
            // InternalProgram.g:1839:2: iv_ruleWorkshop= ruleWorkshop EOF
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
    // InternalProgram.g:1845:1: ruleWorkshop returns [EObject current=null] : (otherlv_0= 'Workshop' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )? (otherlv_6= 'name' ( (lv_fullName_7_0= RULE_STRING ) ) )? (otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )* )? ( (lv_cancelled_12_0= 'cancelled' ) )? ) ;
    public final EObject ruleWorkshop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_abstract_3_0=null;
        Token otherlv_4=null;
        Token lv_url_5_0=null;
        Token otherlv_6=null;
        Token lv_fullName_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_cancelled_12_0=null;
        EObject lv_organizers_9_0 = null;

        EObject lv_organizers_11_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:1851:2: ( (otherlv_0= 'Workshop' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )? (otherlv_6= 'name' ( (lv_fullName_7_0= RULE_STRING ) ) )? (otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )* )? ( (lv_cancelled_12_0= 'cancelled' ) )? ) )
            // InternalProgram.g:1852:2: (otherlv_0= 'Workshop' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )? (otherlv_6= 'name' ( (lv_fullName_7_0= RULE_STRING ) ) )? (otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )* )? ( (lv_cancelled_12_0= 'cancelled' ) )? )
            {
            // InternalProgram.g:1852:2: (otherlv_0= 'Workshop' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )? (otherlv_6= 'name' ( (lv_fullName_7_0= RULE_STRING ) ) )? (otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )* )? ( (lv_cancelled_12_0= 'cancelled' ) )? )
            // InternalProgram.g:1853:3: otherlv_0= 'Workshop' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )? (otherlv_6= 'name' ( (lv_fullName_7_0= RULE_STRING ) ) )? (otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )* )? ( (lv_cancelled_12_0= 'cancelled' ) )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkshopAccess().getWorkshopKeyword_0());
            		
            // InternalProgram.g:1857:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalProgram.g:1858:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalProgram.g:1858:4: (lv_name_1_0= RULE_STRING )
            // InternalProgram.g:1859:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWorkshopAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkshopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalProgram.g:1875:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==31) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalProgram.g:1876:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getWorkshopAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1880:4: ( (lv_abstract_3_0= RULE_STRING ) )
                    // InternalProgram.g:1881:5: (lv_abstract_3_0= RULE_STRING )
                    {
                    // InternalProgram.g:1881:5: (lv_abstract_3_0= RULE_STRING )
                    // InternalProgram.g:1882:6: lv_abstract_3_0= RULE_STRING
                    {
                    lv_abstract_3_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

                    						newLeafNode(lv_abstract_3_0, grammarAccess.getWorkshopAccess().getAbstractSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWorkshopRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"abstract",
                    							lv_abstract_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1899:3: (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==37) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalProgram.g:1900:4: otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getWorkshopAccess().getUrlKeyword_3_0());
                    			
                    // InternalProgram.g:1904:4: ( (lv_url_5_0= RULE_STRING ) )
                    // InternalProgram.g:1905:5: (lv_url_5_0= RULE_STRING )
                    {
                    // InternalProgram.g:1905:5: (lv_url_5_0= RULE_STRING )
                    // InternalProgram.g:1906:6: lv_url_5_0= RULE_STRING
                    {
                    lv_url_5_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

                    						newLeafNode(lv_url_5_0, grammarAccess.getWorkshopAccess().getUrlSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWorkshopRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"url",
                    							lv_url_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1923:3: (otherlv_6= 'name' ( (lv_fullName_7_0= RULE_STRING ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==43) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalProgram.g:1924:4: otherlv_6= 'name' ( (lv_fullName_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getWorkshopAccess().getNameKeyword_4_0());
                    			
                    // InternalProgram.g:1928:4: ( (lv_fullName_7_0= RULE_STRING ) )
                    // InternalProgram.g:1929:5: (lv_fullName_7_0= RULE_STRING )
                    {
                    // InternalProgram.g:1929:5: (lv_fullName_7_0= RULE_STRING )
                    // InternalProgram.g:1930:6: lv_fullName_7_0= RULE_STRING
                    {
                    lv_fullName_7_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

                    						newLeafNode(lv_fullName_7_0, grammarAccess.getWorkshopAccess().getFullNameSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWorkshopRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"fullName",
                    							lv_fullName_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1947:3: (otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==44) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalProgram.g:1948:4: otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )*
                    {
                    otherlv_8=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getWorkshopAccess().getOrganizersKeyword_5_0());
                    			
                    // InternalProgram.g:1952:4: ( (lv_organizers_9_0= rulePerson ) )
                    // InternalProgram.g:1953:5: (lv_organizers_9_0= rulePerson )
                    {
                    // InternalProgram.g:1953:5: (lv_organizers_9_0= rulePerson )
                    // InternalProgram.g:1954:6: lv_organizers_9_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getWorkshopAccess().getOrganizersPersonParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    // InternalProgram.g:1971:4: (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==14) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalProgram.g:1972:5: otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getWorkshopAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalProgram.g:1976:5: ( (lv_organizers_11_0= rulePerson ) )
                    	    // InternalProgram.g:1977:6: (lv_organizers_11_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:1977:6: (lv_organizers_11_0= rulePerson )
                    	    // InternalProgram.g:1978:7: lv_organizers_11_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getWorkshopAccess().getOrganizersPersonParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
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
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalProgram.g:1997:3: ( (lv_cancelled_12_0= 'cancelled' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==35) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalProgram.g:1998:4: (lv_cancelled_12_0= 'cancelled' )
                    {
                    // InternalProgram.g:1998:4: (lv_cancelled_12_0= 'cancelled' )
                    // InternalProgram.g:1999:5: lv_cancelled_12_0= 'cancelled'
                    {
                    lv_cancelled_12_0=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_cancelled_12_0, grammarAccess.getWorkshopAccess().getCancelledCancelledKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getWorkshopRule());
                    					}
                    					setWithLastConsumed(current, "cancelled", true, "cancelled");
                    				

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
    // $ANTLR end "ruleWorkshop"


    // $ANTLR start "entryRuleTutorial"
    // InternalProgram.g:2015:1: entryRuleTutorial returns [EObject current=null] : iv_ruleTutorial= ruleTutorial EOF ;
    public final EObject entryRuleTutorial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTutorial = null;


        try {
            // InternalProgram.g:2015:49: (iv_ruleTutorial= ruleTutorial EOF )
            // InternalProgram.g:2016:2: iv_ruleTutorial= ruleTutorial EOF
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
    // InternalProgram.g:2022:1: ruleTutorial returns [EObject current=null] : (otherlv_0= 'Tutorial' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? ( (lv_cancelled_8_0= 'cancelled' ) )? ) ;
    public final EObject ruleTutorial() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_abstract_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_cancelled_8_0=null;
        EObject lv_organizers_5_0 = null;

        EObject lv_organizers_7_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:2028:2: ( (otherlv_0= 'Tutorial' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? ( (lv_cancelled_8_0= 'cancelled' ) )? ) )
            // InternalProgram.g:2029:2: (otherlv_0= 'Tutorial' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? ( (lv_cancelled_8_0= 'cancelled' ) )? )
            {
            // InternalProgram.g:2029:2: (otherlv_0= 'Tutorial' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? ( (lv_cancelled_8_0= 'cancelled' ) )? )
            // InternalProgram.g:2030:3: otherlv_0= 'Tutorial' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? ( (lv_cancelled_8_0= 'cancelled' ) )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTutorialAccess().getTutorialKeyword_0());
            		
            // InternalProgram.g:2034:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalProgram.g:2035:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalProgram.g:2035:4: (lv_name_1_0= RULE_STRING )
            // InternalProgram.g:2036:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTutorialAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTutorialRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalProgram.g:2052:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==31) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalProgram.g:2053:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getTutorialAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:2057:4: ( (lv_abstract_3_0= RULE_STRING ) )
                    // InternalProgram.g:2058:5: (lv_abstract_3_0= RULE_STRING )
                    {
                    // InternalProgram.g:2058:5: (lv_abstract_3_0= RULE_STRING )
                    // InternalProgram.g:2059:6: lv_abstract_3_0= RULE_STRING
                    {
                    lv_abstract_3_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

                    						newLeafNode(lv_abstract_3_0, grammarAccess.getTutorialAccess().getAbstractSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTutorialRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"abstract",
                    							lv_abstract_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:2076:3: (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==44) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalProgram.g:2077:4: otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )*
                    {
                    otherlv_4=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTutorialAccess().getOrganizersKeyword_3_0());
                    			
                    // InternalProgram.g:2081:4: ( (lv_organizers_5_0= rulePerson ) )
                    // InternalProgram.g:2082:5: (lv_organizers_5_0= rulePerson )
                    {
                    // InternalProgram.g:2082:5: (lv_organizers_5_0= rulePerson )
                    // InternalProgram.g:2083:6: lv_organizers_5_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getTutorialAccess().getOrganizersPersonParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_organizers_5_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTutorialRule());
                    						}
                    						add(
                    							current,
                    							"organizers",
                    							lv_organizers_5_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:2100:4: (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==14) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalProgram.g:2101:5: otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getTutorialAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalProgram.g:2105:5: ( (lv_organizers_7_0= rulePerson ) )
                    	    // InternalProgram.g:2106:6: (lv_organizers_7_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:2106:6: (lv_organizers_7_0= rulePerson )
                    	    // InternalProgram.g:2107:7: lv_organizers_7_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getTutorialAccess().getOrganizersPersonParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalProgram.g:2126:3: ( (lv_cancelled_8_0= 'cancelled' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==35) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalProgram.g:2127:4: (lv_cancelled_8_0= 'cancelled' )
                    {
                    // InternalProgram.g:2127:4: (lv_cancelled_8_0= 'cancelled' )
                    // InternalProgram.g:2128:5: lv_cancelled_8_0= 'cancelled'
                    {
                    lv_cancelled_8_0=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_cancelled_8_0, grammarAccess.getTutorialAccess().getCancelledCancelledKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTutorialRule());
                    					}
                    					setWithLastConsumed(current, "cancelled", true, "cancelled");
                    				

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
    // $ANTLR end "ruleTutorial"


    // $ANTLR start "entryRuleDoctoralSymposium"
    // InternalProgram.g:2144:1: entryRuleDoctoralSymposium returns [EObject current=null] : iv_ruleDoctoralSymposium= ruleDoctoralSymposium EOF ;
    public final EObject entryRuleDoctoralSymposium() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoctoralSymposium = null;


        try {
            // InternalProgram.g:2144:58: (iv_ruleDoctoralSymposium= ruleDoctoralSymposium EOF )
            // InternalProgram.g:2145:2: iv_ruleDoctoralSymposium= ruleDoctoralSymposium EOF
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
    // InternalProgram.g:2151:1: ruleDoctoralSymposium returns [EObject current=null] : (otherlv_0= 'DoctoralSymposium' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )? (otherlv_6= 'organizers' ( (lv_organizers_7_0= rulePerson ) ) (otherlv_8= ',' ( (lv_organizers_9_0= rulePerson ) ) )* )? ( (lv_cancelled_10_0= 'cancelled' ) )? ) ;
    public final EObject ruleDoctoralSymposium() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_abstract_3_0=null;
        Token otherlv_4=null;
        Token lv_url_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_cancelled_10_0=null;
        EObject lv_organizers_7_0 = null;

        EObject lv_organizers_9_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:2157:2: ( (otherlv_0= 'DoctoralSymposium' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )? (otherlv_6= 'organizers' ( (lv_organizers_7_0= rulePerson ) ) (otherlv_8= ',' ( (lv_organizers_9_0= rulePerson ) ) )* )? ( (lv_cancelled_10_0= 'cancelled' ) )? ) )
            // InternalProgram.g:2158:2: (otherlv_0= 'DoctoralSymposium' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )? (otherlv_6= 'organizers' ( (lv_organizers_7_0= rulePerson ) ) (otherlv_8= ',' ( (lv_organizers_9_0= rulePerson ) ) )* )? ( (lv_cancelled_10_0= 'cancelled' ) )? )
            {
            // InternalProgram.g:2158:2: (otherlv_0= 'DoctoralSymposium' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )? (otherlv_6= 'organizers' ( (lv_organizers_7_0= rulePerson ) ) (otherlv_8= ',' ( (lv_organizers_9_0= rulePerson ) ) )* )? ( (lv_cancelled_10_0= 'cancelled' ) )? )
            // InternalProgram.g:2159:3: otherlv_0= 'DoctoralSymposium' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )? (otherlv_6= 'organizers' ( (lv_organizers_7_0= rulePerson ) ) (otherlv_8= ',' ( (lv_organizers_9_0= rulePerson ) ) )* )? ( (lv_cancelled_10_0= 'cancelled' ) )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDoctoralSymposiumAccess().getDoctoralSymposiumKeyword_0());
            		
            // InternalProgram.g:2163:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalProgram.g:2164:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalProgram.g:2164:4: (lv_name_1_0= RULE_STRING )
            // InternalProgram.g:2165:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDoctoralSymposiumAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDoctoralSymposiumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalProgram.g:2181:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==31) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalProgram.g:2182:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getDoctoralSymposiumAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:2186:4: ( (lv_abstract_3_0= RULE_STRING ) )
                    // InternalProgram.g:2187:5: (lv_abstract_3_0= RULE_STRING )
                    {
                    // InternalProgram.g:2187:5: (lv_abstract_3_0= RULE_STRING )
                    // InternalProgram.g:2188:6: lv_abstract_3_0= RULE_STRING
                    {
                    lv_abstract_3_0=(Token)match(input,RULE_STRING,FOLLOW_43); 

                    						newLeafNode(lv_abstract_3_0, grammarAccess.getDoctoralSymposiumAccess().getAbstractSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDoctoralSymposiumRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"abstract",
                    							lv_abstract_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:2205:3: (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==37) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalProgram.g:2206:4: otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getDoctoralSymposiumAccess().getUrlKeyword_3_0());
                    			
                    // InternalProgram.g:2210:4: ( (lv_url_5_0= RULE_STRING ) )
                    // InternalProgram.g:2211:5: (lv_url_5_0= RULE_STRING )
                    {
                    // InternalProgram.g:2211:5: (lv_url_5_0= RULE_STRING )
                    // InternalProgram.g:2212:6: lv_url_5_0= RULE_STRING
                    {
                    lv_url_5_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

                    						newLeafNode(lv_url_5_0, grammarAccess.getDoctoralSymposiumAccess().getUrlSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDoctoralSymposiumRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"url",
                    							lv_url_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:2229:3: (otherlv_6= 'organizers' ( (lv_organizers_7_0= rulePerson ) ) (otherlv_8= ',' ( (lv_organizers_9_0= rulePerson ) ) )* )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==44) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalProgram.g:2230:4: otherlv_6= 'organizers' ( (lv_organizers_7_0= rulePerson ) ) (otherlv_8= ',' ( (lv_organizers_9_0= rulePerson ) ) )*
                    {
                    otherlv_6=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getDoctoralSymposiumAccess().getOrganizersKeyword_4_0());
                    			
                    // InternalProgram.g:2234:4: ( (lv_organizers_7_0= rulePerson ) )
                    // InternalProgram.g:2235:5: (lv_organizers_7_0= rulePerson )
                    {
                    // InternalProgram.g:2235:5: (lv_organizers_7_0= rulePerson )
                    // InternalProgram.g:2236:6: lv_organizers_7_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getDoctoralSymposiumAccess().getOrganizersPersonParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    // InternalProgram.g:2253:4: (otherlv_8= ',' ( (lv_organizers_9_0= rulePerson ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==14) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalProgram.g:2254:5: otherlv_8= ',' ( (lv_organizers_9_0= rulePerson ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getDoctoralSymposiumAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalProgram.g:2258:5: ( (lv_organizers_9_0= rulePerson ) )
                    	    // InternalProgram.g:2259:6: (lv_organizers_9_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:2259:6: (lv_organizers_9_0= rulePerson )
                    	    // InternalProgram.g:2260:7: lv_organizers_9_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getDoctoralSymposiumAccess().getOrganizersPersonParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
                    	    lv_organizers_9_0=rulePerson();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDoctoralSymposiumRule());
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
                    	    break loop54;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalProgram.g:2279:3: ( (lv_cancelled_10_0= 'cancelled' ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==35) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalProgram.g:2280:4: (lv_cancelled_10_0= 'cancelled' )
                    {
                    // InternalProgram.g:2280:4: (lv_cancelled_10_0= 'cancelled' )
                    // InternalProgram.g:2281:5: lv_cancelled_10_0= 'cancelled'
                    {
                    lv_cancelled_10_0=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_cancelled_10_0, grammarAccess.getDoctoralSymposiumAccess().getCancelledCancelledKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDoctoralSymposiumRule());
                    					}
                    					setWithLastConsumed(current, "cancelled", true, "cancelled");
                    				

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
    // $ANTLR end "ruleDoctoralSymposium"


    // $ANTLR start "entryRuleEducatorSymposium"
    // InternalProgram.g:2297:1: entryRuleEducatorSymposium returns [EObject current=null] : iv_ruleEducatorSymposium= ruleEducatorSymposium EOF ;
    public final EObject entryRuleEducatorSymposium() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEducatorSymposium = null;


        try {
            // InternalProgram.g:2297:58: (iv_ruleEducatorSymposium= ruleEducatorSymposium EOF )
            // InternalProgram.g:2298:2: iv_ruleEducatorSymposium= ruleEducatorSymposium EOF
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
    // InternalProgram.g:2304:1: ruleEducatorSymposium returns [EObject current=null] : (otherlv_0= 'EducatorSymposium' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )? (otherlv_6= 'organizers' ( (lv_organizers_7_0= rulePerson ) ) (otherlv_8= ',' ( (lv_organizers_9_0= rulePerson ) ) )* )? ( (lv_cancelled_10_0= 'cancelled' ) )? ) ;
    public final EObject ruleEducatorSymposium() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_abstract_3_0=null;
        Token otherlv_4=null;
        Token lv_url_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_cancelled_10_0=null;
        EObject lv_organizers_7_0 = null;

        EObject lv_organizers_9_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:2310:2: ( (otherlv_0= 'EducatorSymposium' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )? (otherlv_6= 'organizers' ( (lv_organizers_7_0= rulePerson ) ) (otherlv_8= ',' ( (lv_organizers_9_0= rulePerson ) ) )* )? ( (lv_cancelled_10_0= 'cancelled' ) )? ) )
            // InternalProgram.g:2311:2: (otherlv_0= 'EducatorSymposium' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )? (otherlv_6= 'organizers' ( (lv_organizers_7_0= rulePerson ) ) (otherlv_8= ',' ( (lv_organizers_9_0= rulePerson ) ) )* )? ( (lv_cancelled_10_0= 'cancelled' ) )? )
            {
            // InternalProgram.g:2311:2: (otherlv_0= 'EducatorSymposium' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )? (otherlv_6= 'organizers' ( (lv_organizers_7_0= rulePerson ) ) (otherlv_8= ',' ( (lv_organizers_9_0= rulePerson ) ) )* )? ( (lv_cancelled_10_0= 'cancelled' ) )? )
            // InternalProgram.g:2312:3: otherlv_0= 'EducatorSymposium' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )? (otherlv_6= 'organizers' ( (lv_organizers_7_0= rulePerson ) ) (otherlv_8= ',' ( (lv_organizers_9_0= rulePerson ) ) )* )? ( (lv_cancelled_10_0= 'cancelled' ) )?
            {
            otherlv_0=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEducatorSymposiumAccess().getEducatorSymposiumKeyword_0());
            		
            // InternalProgram.g:2316:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalProgram.g:2317:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalProgram.g:2317:4: (lv_name_1_0= RULE_STRING )
            // InternalProgram.g:2318:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEducatorSymposiumAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEducatorSymposiumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalProgram.g:2334:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==31) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalProgram.g:2335:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getEducatorSymposiumAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:2339:4: ( (lv_abstract_3_0= RULE_STRING ) )
                    // InternalProgram.g:2340:5: (lv_abstract_3_0= RULE_STRING )
                    {
                    // InternalProgram.g:2340:5: (lv_abstract_3_0= RULE_STRING )
                    // InternalProgram.g:2341:6: lv_abstract_3_0= RULE_STRING
                    {
                    lv_abstract_3_0=(Token)match(input,RULE_STRING,FOLLOW_43); 

                    						newLeafNode(lv_abstract_3_0, grammarAccess.getEducatorSymposiumAccess().getAbstractSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEducatorSymposiumRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"abstract",
                    							lv_abstract_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:2358:3: (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==37) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalProgram.g:2359:4: otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEducatorSymposiumAccess().getUrlKeyword_3_0());
                    			
                    // InternalProgram.g:2363:4: ( (lv_url_5_0= RULE_STRING ) )
                    // InternalProgram.g:2364:5: (lv_url_5_0= RULE_STRING )
                    {
                    // InternalProgram.g:2364:5: (lv_url_5_0= RULE_STRING )
                    // InternalProgram.g:2365:6: lv_url_5_0= RULE_STRING
                    {
                    lv_url_5_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

                    						newLeafNode(lv_url_5_0, grammarAccess.getEducatorSymposiumAccess().getUrlSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEducatorSymposiumRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"url",
                    							lv_url_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:2382:3: (otherlv_6= 'organizers' ( (lv_organizers_7_0= rulePerson ) ) (otherlv_8= ',' ( (lv_organizers_9_0= rulePerson ) ) )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==44) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalProgram.g:2383:4: otherlv_6= 'organizers' ( (lv_organizers_7_0= rulePerson ) ) (otherlv_8= ',' ( (lv_organizers_9_0= rulePerson ) ) )*
                    {
                    otherlv_6=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEducatorSymposiumAccess().getOrganizersKeyword_4_0());
                    			
                    // InternalProgram.g:2387:4: ( (lv_organizers_7_0= rulePerson ) )
                    // InternalProgram.g:2388:5: (lv_organizers_7_0= rulePerson )
                    {
                    // InternalProgram.g:2388:5: (lv_organizers_7_0= rulePerson )
                    // InternalProgram.g:2389:6: lv_organizers_7_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getEducatorSymposiumAccess().getOrganizersPersonParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    // InternalProgram.g:2406:4: (otherlv_8= ',' ( (lv_organizers_9_0= rulePerson ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==14) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalProgram.g:2407:5: otherlv_8= ',' ( (lv_organizers_9_0= rulePerson ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getEducatorSymposiumAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalProgram.g:2411:5: ( (lv_organizers_9_0= rulePerson ) )
                    	    // InternalProgram.g:2412:6: (lv_organizers_9_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:2412:6: (lv_organizers_9_0= rulePerson )
                    	    // InternalProgram.g:2413:7: lv_organizers_9_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getEducatorSymposiumAccess().getOrganizersPersonParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
                    	    lv_organizers_9_0=rulePerson();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEducatorSymposiumRule());
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
                    	    break loop59;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalProgram.g:2432:3: ( (lv_cancelled_10_0= 'cancelled' ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==35) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalProgram.g:2433:4: (lv_cancelled_10_0= 'cancelled' )
                    {
                    // InternalProgram.g:2433:4: (lv_cancelled_10_0= 'cancelled' )
                    // InternalProgram.g:2434:5: lv_cancelled_10_0= 'cancelled'
                    {
                    lv_cancelled_10_0=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_cancelled_10_0, grammarAccess.getEducatorSymposiumAccess().getCancelledCancelledKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEducatorSymposiumRule());
                    					}
                    					setWithLastConsumed(current, "cancelled", true, "cancelled");
                    				

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
    // $ANTLR end "ruleEducatorSymposium"


    // $ANTLR start "entryRuleReception"
    // InternalProgram.g:2450:1: entryRuleReception returns [EObject current=null] : iv_ruleReception= ruleReception EOF ;
    public final EObject entryRuleReception() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReception = null;


        try {
            // InternalProgram.g:2450:50: (iv_ruleReception= ruleReception EOF )
            // InternalProgram.g:2451:2: iv_ruleReception= ruleReception EOF
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
    // InternalProgram.g:2457:1: ruleReception returns [EObject current=null] : (otherlv_0= 'Reception' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? ( (lv_cancelled_4_0= 'cancelled' ) )? ) ;
    public final EObject ruleReception() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_abstract_3_0=null;
        Token lv_cancelled_4_0=null;


        	enterRule();

        try {
            // InternalProgram.g:2463:2: ( (otherlv_0= 'Reception' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? ( (lv_cancelled_4_0= 'cancelled' ) )? ) )
            // InternalProgram.g:2464:2: (otherlv_0= 'Reception' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? ( (lv_cancelled_4_0= 'cancelled' ) )? )
            {
            // InternalProgram.g:2464:2: (otherlv_0= 'Reception' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? ( (lv_cancelled_4_0= 'cancelled' ) )? )
            // InternalProgram.g:2465:3: otherlv_0= 'Reception' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? ( (lv_cancelled_4_0= 'cancelled' ) )?
            {
            otherlv_0=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReceptionAccess().getReceptionKeyword_0());
            		
            // InternalProgram.g:2469:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalProgram.g:2470:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalProgram.g:2470:4: (lv_name_1_0= RULE_STRING )
            // InternalProgram.g:2471:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_44); 

            					newLeafNode(lv_name_1_0, grammarAccess.getReceptionAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReceptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalProgram.g:2487:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==31) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalProgram.g:2488:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getReceptionAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:2492:4: ( (lv_abstract_3_0= RULE_STRING ) )
                    // InternalProgram.g:2493:5: (lv_abstract_3_0= RULE_STRING )
                    {
                    // InternalProgram.g:2493:5: (lv_abstract_3_0= RULE_STRING )
                    // InternalProgram.g:2494:6: lv_abstract_3_0= RULE_STRING
                    {
                    lv_abstract_3_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

                    						newLeafNode(lv_abstract_3_0, grammarAccess.getReceptionAccess().getAbstractSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReceptionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"abstract",
                    							lv_abstract_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:2511:3: ( (lv_cancelled_4_0= 'cancelled' ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==35) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalProgram.g:2512:4: (lv_cancelled_4_0= 'cancelled' )
                    {
                    // InternalProgram.g:2512:4: (lv_cancelled_4_0= 'cancelled' )
                    // InternalProgram.g:2513:5: lv_cancelled_4_0= 'cancelled'
                    {
                    lv_cancelled_4_0=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_cancelled_4_0, grammarAccess.getReceptionAccess().getCancelledCancelledKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getReceptionRule());
                    					}
                    					setWithLastConsumed(current, "cancelled", true, "cancelled");
                    				

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
    // InternalProgram.g:2529:1: entryRuleClinic returns [EObject current=null] : iv_ruleClinic= ruleClinic EOF ;
    public final EObject entryRuleClinic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClinic = null;


        try {
            // InternalProgram.g:2529:47: (iv_ruleClinic= ruleClinic EOF )
            // InternalProgram.g:2530:2: iv_ruleClinic= ruleClinic EOF
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
    // InternalProgram.g:2536:1: ruleClinic returns [EObject current=null] : (otherlv_0= 'Clinic' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )? ( (lv_cancelled_6_0= 'cancelled' ) )? ) ;
    public final EObject ruleClinic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_abstract_3_0=null;
        Token otherlv_4=null;
        Token lv_url_5_0=null;
        Token lv_cancelled_6_0=null;


        	enterRule();

        try {
            // InternalProgram.g:2542:2: ( (otherlv_0= 'Clinic' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )? ( (lv_cancelled_6_0= 'cancelled' ) )? ) )
            // InternalProgram.g:2543:2: (otherlv_0= 'Clinic' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )? ( (lv_cancelled_6_0= 'cancelled' ) )? )
            {
            // InternalProgram.g:2543:2: (otherlv_0= 'Clinic' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )? ( (lv_cancelled_6_0= 'cancelled' ) )? )
            // InternalProgram.g:2544:3: otherlv_0= 'Clinic' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )? ( (lv_cancelled_6_0= 'cancelled' ) )?
            {
            otherlv_0=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getClinicAccess().getClinicKeyword_0());
            		
            // InternalProgram.g:2548:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalProgram.g:2549:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalProgram.g:2549:4: (lv_name_1_0= RULE_STRING )
            // InternalProgram.g:2550:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            					newLeafNode(lv_name_1_0, grammarAccess.getClinicAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClinicRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalProgram.g:2566:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==31) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalProgram.g:2567:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getClinicAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:2571:4: ( (lv_abstract_3_0= RULE_STRING ) )
                    // InternalProgram.g:2572:5: (lv_abstract_3_0= RULE_STRING )
                    {
                    // InternalProgram.g:2572:5: (lv_abstract_3_0= RULE_STRING )
                    // InternalProgram.g:2573:6: lv_abstract_3_0= RULE_STRING
                    {
                    lv_abstract_3_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    						newLeafNode(lv_abstract_3_0, grammarAccess.getClinicAccess().getAbstractSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClinicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"abstract",
                    							lv_abstract_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:2590:3: (otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==37) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalProgram.g:2591:4: otherlv_4= 'url' ( (lv_url_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getClinicAccess().getUrlKeyword_3_0());
                    			
                    // InternalProgram.g:2595:4: ( (lv_url_5_0= RULE_STRING ) )
                    // InternalProgram.g:2596:5: (lv_url_5_0= RULE_STRING )
                    {
                    // InternalProgram.g:2596:5: (lv_url_5_0= RULE_STRING )
                    // InternalProgram.g:2597:6: lv_url_5_0= RULE_STRING
                    {
                    lv_url_5_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

                    						newLeafNode(lv_url_5_0, grammarAccess.getClinicAccess().getUrlSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClinicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"url",
                    							lv_url_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:2614:3: ( (lv_cancelled_6_0= 'cancelled' ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==35) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalProgram.g:2615:4: (lv_cancelled_6_0= 'cancelled' )
                    {
                    // InternalProgram.g:2615:4: (lv_cancelled_6_0= 'cancelled' )
                    // InternalProgram.g:2616:5: lv_cancelled_6_0= 'cancelled'
                    {
                    lv_cancelled_6_0=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_cancelled_6_0, grammarAccess.getClinicAccess().getCancelledCancelledKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClinicRule());
                    					}
                    					setWithLastConsumed(current, "cancelled", true, "cancelled");
                    				

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
    // InternalProgram.g:2632:1: entryRuleLunch returns [EObject current=null] : iv_ruleLunch= ruleLunch EOF ;
    public final EObject entryRuleLunch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLunch = null;


        try {
            // InternalProgram.g:2632:46: (iv_ruleLunch= ruleLunch EOF )
            // InternalProgram.g:2633:2: iv_ruleLunch= ruleLunch EOF
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
    // InternalProgram.g:2639:1: ruleLunch returns [EObject current=null] : (otherlv_0= 'Lunch' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleLunch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_abstract_3_0=null;


        	enterRule();

        try {
            // InternalProgram.g:2645:2: ( (otherlv_0= 'Lunch' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? ) )
            // InternalProgram.g:2646:2: (otherlv_0= 'Lunch' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? )
            {
            // InternalProgram.g:2646:2: (otherlv_0= 'Lunch' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? )
            // InternalProgram.g:2647:3: otherlv_0= 'Lunch' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLunchAccess().getLunchKeyword_0());
            		
            // InternalProgram.g:2651:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalProgram.g:2652:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalProgram.g:2652:4: (lv_name_1_0= RULE_STRING )
            // InternalProgram.g:2653:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_45); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLunchAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLunchRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalProgram.g:2669:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==31) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalProgram.g:2670:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getLunchAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:2674:4: ( (lv_abstract_3_0= RULE_STRING ) )
                    // InternalProgram.g:2675:5: (lv_abstract_3_0= RULE_STRING )
                    {
                    // InternalProgram.g:2675:5: (lv_abstract_3_0= RULE_STRING )
                    // InternalProgram.g:2676:6: lv_abstract_3_0= RULE_STRING
                    {
                    lv_abstract_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_abstract_3_0, grammarAccess.getLunchAccess().getAbstractSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLunchRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"abstract",
                    							lv_abstract_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

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
    // InternalProgram.g:2697:1: entryRuleCoffeeBreak returns [EObject current=null] : iv_ruleCoffeeBreak= ruleCoffeeBreak EOF ;
    public final EObject entryRuleCoffeeBreak() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoffeeBreak = null;


        try {
            // InternalProgram.g:2697:52: (iv_ruleCoffeeBreak= ruleCoffeeBreak EOF )
            // InternalProgram.g:2698:2: iv_ruleCoffeeBreak= ruleCoffeeBreak EOF
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
    // InternalProgram.g:2704:1: ruleCoffeeBreak returns [EObject current=null] : (otherlv_0= 'CoffeeBreak' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleCoffeeBreak() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_abstract_3_0=null;


        	enterRule();

        try {
            // InternalProgram.g:2710:2: ( (otherlv_0= 'CoffeeBreak' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? ) )
            // InternalProgram.g:2711:2: (otherlv_0= 'CoffeeBreak' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? )
            {
            // InternalProgram.g:2711:2: (otherlv_0= 'CoffeeBreak' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? )
            // InternalProgram.g:2712:3: otherlv_0= 'CoffeeBreak' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCoffeeBreakAccess().getCoffeeBreakKeyword_0());
            		
            // InternalProgram.g:2716:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalProgram.g:2717:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalProgram.g:2717:4: (lv_name_1_0= RULE_STRING )
            // InternalProgram.g:2718:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_45); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCoffeeBreakAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoffeeBreakRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalProgram.g:2734:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==31) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalProgram.g:2735:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getCoffeeBreakAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:2739:4: ( (lv_abstract_3_0= RULE_STRING ) )
                    // InternalProgram.g:2740:5: (lv_abstract_3_0= RULE_STRING )
                    {
                    // InternalProgram.g:2740:5: (lv_abstract_3_0= RULE_STRING )
                    // InternalProgram.g:2741:6: lv_abstract_3_0= RULE_STRING
                    {
                    lv_abstract_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_abstract_3_0, grammarAccess.getCoffeeBreakAccess().getAbstractSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCoffeeBreakRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"abstract",
                    							lv_abstract_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

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


    // $ANTLR start "entryRuleMeeting"
    // InternalProgram.g:2762:1: entryRuleMeeting returns [EObject current=null] : iv_ruleMeeting= ruleMeeting EOF ;
    public final EObject entryRuleMeeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeeting = null;


        try {
            // InternalProgram.g:2762:48: (iv_ruleMeeting= ruleMeeting EOF )
            // InternalProgram.g:2763:2: iv_ruleMeeting= ruleMeeting EOF
            {
             newCompositeNode(grammarAccess.getMeetingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeeting=ruleMeeting();

            state._fsp--;

             current =iv_ruleMeeting; 
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
    // $ANTLR end "entryRuleMeeting"


    // $ANTLR start "ruleMeeting"
    // InternalProgram.g:2769:1: ruleMeeting returns [EObject current=null] : (otherlv_0= 'Meeting' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'participants' ( (lv_participants_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_participants_7_0= rulePerson ) ) )* )? ( (lv_cancelled_8_0= 'cancelled' ) )? ) ;
    public final EObject ruleMeeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_abstract_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_cancelled_8_0=null;
        EObject lv_participants_5_0 = null;

        EObject lv_participants_7_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:2775:2: ( (otherlv_0= 'Meeting' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'participants' ( (lv_participants_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_participants_7_0= rulePerson ) ) )* )? ( (lv_cancelled_8_0= 'cancelled' ) )? ) )
            // InternalProgram.g:2776:2: (otherlv_0= 'Meeting' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'participants' ( (lv_participants_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_participants_7_0= rulePerson ) ) )* )? ( (lv_cancelled_8_0= 'cancelled' ) )? )
            {
            // InternalProgram.g:2776:2: (otherlv_0= 'Meeting' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'participants' ( (lv_participants_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_participants_7_0= rulePerson ) ) )* )? ( (lv_cancelled_8_0= 'cancelled' ) )? )
            // InternalProgram.g:2777:3: otherlv_0= 'Meeting' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? (otherlv_4= 'participants' ( (lv_participants_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_participants_7_0= rulePerson ) ) )* )? ( (lv_cancelled_8_0= 'cancelled' ) )?
            {
            otherlv_0=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMeetingAccess().getMeetingKeyword_0());
            		
            // InternalProgram.g:2781:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalProgram.g:2782:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalProgram.g:2782:4: (lv_name_1_0= RULE_STRING )
            // InternalProgram.g:2783:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_46); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMeetingAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeetingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalProgram.g:2799:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==31) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalProgram.g:2800:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getMeetingAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:2804:4: ( (lv_abstract_3_0= RULE_STRING ) )
                    // InternalProgram.g:2805:5: (lv_abstract_3_0= RULE_STRING )
                    {
                    // InternalProgram.g:2805:5: (lv_abstract_3_0= RULE_STRING )
                    // InternalProgram.g:2806:6: lv_abstract_3_0= RULE_STRING
                    {
                    lv_abstract_3_0=(Token)match(input,RULE_STRING,FOLLOW_47); 

                    						newLeafNode(lv_abstract_3_0, grammarAccess.getMeetingAccess().getAbstractSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMeetingRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"abstract",
                    							lv_abstract_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:2823:3: (otherlv_4= 'participants' ( (lv_participants_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_participants_7_0= rulePerson ) ) )* )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==53) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalProgram.g:2824:4: otherlv_4= 'participants' ( (lv_participants_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_participants_7_0= rulePerson ) ) )*
                    {
                    otherlv_4=(Token)match(input,53,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getMeetingAccess().getParticipantsKeyword_3_0());
                    			
                    // InternalProgram.g:2828:4: ( (lv_participants_5_0= rulePerson ) )
                    // InternalProgram.g:2829:5: (lv_participants_5_0= rulePerson )
                    {
                    // InternalProgram.g:2829:5: (lv_participants_5_0= rulePerson )
                    // InternalProgram.g:2830:6: lv_participants_5_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getMeetingAccess().getParticipantsPersonParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_participants_5_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeetingRule());
                    						}
                    						add(
                    							current,
                    							"participants",
                    							lv_participants_5_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:2847:4: (otherlv_6= ',' ( (lv_participants_7_0= rulePerson ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==14) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalProgram.g:2848:5: otherlv_6= ',' ( (lv_participants_7_0= rulePerson ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getMeetingAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalProgram.g:2852:5: ( (lv_participants_7_0= rulePerson ) )
                    	    // InternalProgram.g:2853:6: (lv_participants_7_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:2853:6: (lv_participants_7_0= rulePerson )
                    	    // InternalProgram.g:2854:7: lv_participants_7_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getMeetingAccess().getParticipantsPersonParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
                    	    lv_participants_7_0=rulePerson();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMeetingRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"participants",
                    	    								lv_participants_7_0,
                    	    								"fr.inria.diverse.models2016.dsl.Program.Person");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalProgram.g:2873:3: ( (lv_cancelled_8_0= 'cancelled' ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==35) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalProgram.g:2874:4: (lv_cancelled_8_0= 'cancelled' )
                    {
                    // InternalProgram.g:2874:4: (lv_cancelled_8_0= 'cancelled' )
                    // InternalProgram.g:2875:5: lv_cancelled_8_0= 'cancelled'
                    {
                    lv_cancelled_8_0=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_cancelled_8_0, grammarAccess.getMeetingAccess().getCancelledCancelledKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMeetingRule());
                    					}
                    					setWithLastConsumed(current, "cancelled", true, "cancelled");
                    				

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
    // $ANTLR end "ruleMeeting"


    // $ANTLR start "entryRuleOpening"
    // InternalProgram.g:2891:1: entryRuleOpening returns [EObject current=null] : iv_ruleOpening= ruleOpening EOF ;
    public final EObject entryRuleOpening() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpening = null;


        try {
            // InternalProgram.g:2891:48: (iv_ruleOpening= ruleOpening EOF )
            // InternalProgram.g:2892:2: iv_ruleOpening= ruleOpening EOF
            {
             newCompositeNode(grammarAccess.getOpeningRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpening=ruleOpening();

            state._fsp--;

             current =iv_ruleOpening; 
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
    // $ANTLR end "entryRuleOpening"


    // $ANTLR start "ruleOpening"
    // InternalProgram.g:2898:1: ruleOpening returns [EObject current=null] : (otherlv_0= 'Opening' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? ( (lv_cancelled_4_0= 'cancelled' ) )? ) ;
    public final EObject ruleOpening() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_abstract_3_0=null;
        Token lv_cancelled_4_0=null;


        	enterRule();

        try {
            // InternalProgram.g:2904:2: ( (otherlv_0= 'Opening' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? ( (lv_cancelled_4_0= 'cancelled' ) )? ) )
            // InternalProgram.g:2905:2: (otherlv_0= 'Opening' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? ( (lv_cancelled_4_0= 'cancelled' ) )? )
            {
            // InternalProgram.g:2905:2: (otherlv_0= 'Opening' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? ( (lv_cancelled_4_0= 'cancelled' ) )? )
            // InternalProgram.g:2906:3: otherlv_0= 'Opening' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )? ( (lv_cancelled_4_0= 'cancelled' ) )?
            {
            otherlv_0=(Token)match(input,54,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOpeningAccess().getOpeningKeyword_0());
            		
            // InternalProgram.g:2910:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalProgram.g:2911:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalProgram.g:2911:4: (lv_name_1_0= RULE_STRING )
            // InternalProgram.g:2912:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_44); 

            					newLeafNode(lv_name_1_0, grammarAccess.getOpeningAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpeningRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalProgram.g:2928:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==31) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalProgram.g:2929:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getOpeningAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:2933:4: ( (lv_abstract_3_0= RULE_STRING ) )
                    // InternalProgram.g:2934:5: (lv_abstract_3_0= RULE_STRING )
                    {
                    // InternalProgram.g:2934:5: (lv_abstract_3_0= RULE_STRING )
                    // InternalProgram.g:2935:6: lv_abstract_3_0= RULE_STRING
                    {
                    lv_abstract_3_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

                    						newLeafNode(lv_abstract_3_0, grammarAccess.getOpeningAccess().getAbstractSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOpeningRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"abstract",
                    							lv_abstract_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:2952:3: ( (lv_cancelled_4_0= 'cancelled' ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==35) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalProgram.g:2953:4: (lv_cancelled_4_0= 'cancelled' )
                    {
                    // InternalProgram.g:2953:4: (lv_cancelled_4_0= 'cancelled' )
                    // InternalProgram.g:2954:5: lv_cancelled_4_0= 'cancelled'
                    {
                    lv_cancelled_4_0=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_cancelled_4_0, grammarAccess.getOpeningAccess().getCancelledCancelledKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOpeningRule());
                    					}
                    					setWithLastConsumed(current, "cancelled", true, "cancelled");
                    				

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
    // $ANTLR end "ruleOpening"


    // $ANTLR start "entryRulePaper"
    // InternalProgram.g:2970:1: entryRulePaper returns [EObject current=null] : iv_rulePaper= rulePaper EOF ;
    public final EObject entryRulePaper() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePaper = null;


        try {
            // InternalProgram.g:2970:46: (iv_rulePaper= rulePaper EOF )
            // InternalProgram.g:2971:2: iv_rulePaper= rulePaper EOF
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
    // InternalProgram.g:2977:1: rulePaper returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'authors' ( (lv_authors_3_0= rulePerson ) ) (otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) ) )* (otherlv_6= 'abstract' ( (lv_abstract_7_0= RULE_STRING ) ) )? (otherlv_8= 'preprint' ( (lv_preprint_9_0= RULE_STRING ) ) )? (otherlv_10= 'kind' ( (otherlv_11= RULE_STRING ) ) )? (otherlv_12= 'proceedings' ( (lv_proceedings_13_0= RULE_STRING ) ) )? ( (lv_cancelled_14_0= 'cancelled' ) )? ) ;
    public final EObject rulePaper() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_abstract_7_0=null;
        Token otherlv_8=null;
        Token lv_preprint_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_proceedings_13_0=null;
        Token lv_cancelled_14_0=null;
        EObject lv_authors_3_0 = null;

        EObject lv_authors_5_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:2983:2: ( ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'authors' ( (lv_authors_3_0= rulePerson ) ) (otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) ) )* (otherlv_6= 'abstract' ( (lv_abstract_7_0= RULE_STRING ) ) )? (otherlv_8= 'preprint' ( (lv_preprint_9_0= RULE_STRING ) ) )? (otherlv_10= 'kind' ( (otherlv_11= RULE_STRING ) ) )? (otherlv_12= 'proceedings' ( (lv_proceedings_13_0= RULE_STRING ) ) )? ( (lv_cancelled_14_0= 'cancelled' ) )? ) )
            // InternalProgram.g:2984:2: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'authors' ( (lv_authors_3_0= rulePerson ) ) (otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) ) )* (otherlv_6= 'abstract' ( (lv_abstract_7_0= RULE_STRING ) ) )? (otherlv_8= 'preprint' ( (lv_preprint_9_0= RULE_STRING ) ) )? (otherlv_10= 'kind' ( (otherlv_11= RULE_STRING ) ) )? (otherlv_12= 'proceedings' ( (lv_proceedings_13_0= RULE_STRING ) ) )? ( (lv_cancelled_14_0= 'cancelled' ) )? )
            {
            // InternalProgram.g:2984:2: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'authors' ( (lv_authors_3_0= rulePerson ) ) (otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) ) )* (otherlv_6= 'abstract' ( (lv_abstract_7_0= RULE_STRING ) ) )? (otherlv_8= 'preprint' ( (lv_preprint_9_0= RULE_STRING ) ) )? (otherlv_10= 'kind' ( (otherlv_11= RULE_STRING ) ) )? (otherlv_12= 'proceedings' ( (lv_proceedings_13_0= RULE_STRING ) ) )? ( (lv_cancelled_14_0= 'cancelled' ) )? )
            // InternalProgram.g:2985:3: () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'authors' ( (lv_authors_3_0= rulePerson ) ) (otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) ) )* (otherlv_6= 'abstract' ( (lv_abstract_7_0= RULE_STRING ) ) )? (otherlv_8= 'preprint' ( (lv_preprint_9_0= RULE_STRING ) ) )? (otherlv_10= 'kind' ( (otherlv_11= RULE_STRING ) ) )? (otherlv_12= 'proceedings' ( (lv_proceedings_13_0= RULE_STRING ) ) )? ( (lv_cancelled_14_0= 'cancelled' ) )?
            {
            // InternalProgram.g:2985:3: ()
            // InternalProgram.g:2986:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPaperAccess().getPaperAction_0(),
            					current);
            			

            }

            // InternalProgram.g:2992:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalProgram.g:2993:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalProgram.g:2993:4: (lv_name_1_0= RULE_STRING )
            // InternalProgram.g:2994:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_48); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPaperAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPaperRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getPaperAccess().getAuthorsKeyword_2());
            		
            // InternalProgram.g:3014:3: ( (lv_authors_3_0= rulePerson ) )
            // InternalProgram.g:3015:4: (lv_authors_3_0= rulePerson )
            {
            // InternalProgram.g:3015:4: (lv_authors_3_0= rulePerson )
            // InternalProgram.g:3016:5: lv_authors_3_0= rulePerson
            {

            					newCompositeNode(grammarAccess.getPaperAccess().getAuthorsPersonParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_49);
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

            // InternalProgram.g:3033:3: (otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==14) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalProgram.g:3034:4: otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getPaperAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalProgram.g:3038:4: ( (lv_authors_5_0= rulePerson ) )
            	    // InternalProgram.g:3039:5: (lv_authors_5_0= rulePerson )
            	    {
            	    // InternalProgram.g:3039:5: (lv_authors_5_0= rulePerson )
            	    // InternalProgram.g:3040:6: lv_authors_5_0= rulePerson
            	    {

            	    						newCompositeNode(grammarAccess.getPaperAccess().getAuthorsPersonParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_49);
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
            	    break loop75;
                }
            } while (true);

            // InternalProgram.g:3058:3: (otherlv_6= 'abstract' ( (lv_abstract_7_0= RULE_STRING ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==31) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalProgram.g:3059:4: otherlv_6= 'abstract' ( (lv_abstract_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getPaperAccess().getAbstractKeyword_5_0());
                    			
                    // InternalProgram.g:3063:4: ( (lv_abstract_7_0= RULE_STRING ) )
                    // InternalProgram.g:3064:5: (lv_abstract_7_0= RULE_STRING )
                    {
                    // InternalProgram.g:3064:5: (lv_abstract_7_0= RULE_STRING )
                    // InternalProgram.g:3065:6: lv_abstract_7_0= RULE_STRING
                    {
                    lv_abstract_7_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

                    						newLeafNode(lv_abstract_7_0, grammarAccess.getPaperAccess().getAbstractSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPaperRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"abstract",
                    							lv_abstract_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:3082:3: (otherlv_8= 'preprint' ( (lv_preprint_9_0= RULE_STRING ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==56) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalProgram.g:3083:4: otherlv_8= 'preprint' ( (lv_preprint_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,56,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getPaperAccess().getPreprintKeyword_6_0());
                    			
                    // InternalProgram.g:3087:4: ( (lv_preprint_9_0= RULE_STRING ) )
                    // InternalProgram.g:3088:5: (lv_preprint_9_0= RULE_STRING )
                    {
                    // InternalProgram.g:3088:5: (lv_preprint_9_0= RULE_STRING )
                    // InternalProgram.g:3089:6: lv_preprint_9_0= RULE_STRING
                    {
                    lv_preprint_9_0=(Token)match(input,RULE_STRING,FOLLOW_51); 

                    						newLeafNode(lv_preprint_9_0, grammarAccess.getPaperAccess().getPreprintSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPaperRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"preprint",
                    							lv_preprint_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:3106:3: (otherlv_10= 'kind' ( (otherlv_11= RULE_STRING ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==57) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalProgram.g:3107:4: otherlv_10= 'kind' ( (otherlv_11= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,57,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getPaperAccess().getKindKeyword_7_0());
                    			
                    // InternalProgram.g:3111:4: ( (otherlv_11= RULE_STRING ) )
                    // InternalProgram.g:3112:5: (otherlv_11= RULE_STRING )
                    {
                    // InternalProgram.g:3112:5: (otherlv_11= RULE_STRING )
                    // InternalProgram.g:3113:6: otherlv_11= RULE_STRING
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPaperRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_STRING,FOLLOW_52); 

                    						newLeafNode(otherlv_11, grammarAccess.getPaperAccess().getKindKindCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:3125:3: (otherlv_12= 'proceedings' ( (lv_proceedings_13_0= RULE_STRING ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==58) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalProgram.g:3126:4: otherlv_12= 'proceedings' ( (lv_proceedings_13_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,58,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getPaperAccess().getProceedingsKeyword_8_0());
                    			
                    // InternalProgram.g:3130:4: ( (lv_proceedings_13_0= RULE_STRING ) )
                    // InternalProgram.g:3131:5: (lv_proceedings_13_0= RULE_STRING )
                    {
                    // InternalProgram.g:3131:5: (lv_proceedings_13_0= RULE_STRING )
                    // InternalProgram.g:3132:6: lv_proceedings_13_0= RULE_STRING
                    {
                    lv_proceedings_13_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

                    						newLeafNode(lv_proceedings_13_0, grammarAccess.getPaperAccess().getProceedingsSTRINGTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPaperRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"proceedings",
                    							lv_proceedings_13_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:3149:3: ( (lv_cancelled_14_0= 'cancelled' ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==35) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalProgram.g:3150:4: (lv_cancelled_14_0= 'cancelled' )
                    {
                    // InternalProgram.g:3150:4: (lv_cancelled_14_0= 'cancelled' )
                    // InternalProgram.g:3151:5: lv_cancelled_14_0= 'cancelled'
                    {
                    lv_cancelled_14_0=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_cancelled_14_0, grammarAccess.getPaperAccess().getCancelledCancelledKeyword_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPaperRule());
                    					}
                    					setWithLastConsumed(current, "cancelled", true, "cancelled");
                    				

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
    // InternalProgram.g:3167:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalProgram.g:3167:47: (iv_rulePerson= rulePerson EOF )
            // InternalProgram.g:3168:2: iv_rulePerson= rulePerson EOF
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
    // InternalProgram.g:3174:1: rulePerson returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'email' ( (lv_email_3_0= RULE_STRING ) ) )? (otherlv_4= 'homepage' ( (lv_homepage_5_0= RULE_STRING ) ) )? ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_email_3_0=null;
        Token otherlv_4=null;
        Token lv_homepage_5_0=null;


        	enterRule();

        try {
            // InternalProgram.g:3180:2: ( ( () ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'email' ( (lv_email_3_0= RULE_STRING ) ) )? (otherlv_4= 'homepage' ( (lv_homepage_5_0= RULE_STRING ) ) )? ) )
            // InternalProgram.g:3181:2: ( () ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'email' ( (lv_email_3_0= RULE_STRING ) ) )? (otherlv_4= 'homepage' ( (lv_homepage_5_0= RULE_STRING ) ) )? )
            {
            // InternalProgram.g:3181:2: ( () ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'email' ( (lv_email_3_0= RULE_STRING ) ) )? (otherlv_4= 'homepage' ( (lv_homepage_5_0= RULE_STRING ) ) )? )
            // InternalProgram.g:3182:3: () ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'email' ( (lv_email_3_0= RULE_STRING ) ) )? (otherlv_4= 'homepage' ( (lv_homepage_5_0= RULE_STRING ) ) )?
            {
            // InternalProgram.g:3182:3: ()
            // InternalProgram.g:3183:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPersonAccess().getPersonAction_0(),
            					current);
            			

            }

            // InternalProgram.g:3189:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalProgram.g:3190:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalProgram.g:3190:4: (lv_name_1_0= RULE_STRING )
            // InternalProgram.g:3191:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_53); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPersonAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalProgram.g:3207:3: (otherlv_2= 'email' ( (lv_email_3_0= RULE_STRING ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==59) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalProgram.g:3208:4: otherlv_2= 'email' ( (lv_email_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,59,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getPersonAccess().getEmailKeyword_2_0());
                    			
                    // InternalProgram.g:3212:4: ( (lv_email_3_0= RULE_STRING ) )
                    // InternalProgram.g:3213:5: (lv_email_3_0= RULE_STRING )
                    {
                    // InternalProgram.g:3213:5: (lv_email_3_0= RULE_STRING )
                    // InternalProgram.g:3214:6: lv_email_3_0= RULE_STRING
                    {
                    lv_email_3_0=(Token)match(input,RULE_STRING,FOLLOW_54); 

                    						newLeafNode(lv_email_3_0, grammarAccess.getPersonAccess().getEmailSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPersonRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"email",
                    							lv_email_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:3231:3: (otherlv_4= 'homepage' ( (lv_homepage_5_0= RULE_STRING ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==60) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalProgram.g:3232:4: otherlv_4= 'homepage' ( (lv_homepage_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,60,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getPersonAccess().getHomepageKeyword_3_0());
                    			
                    // InternalProgram.g:3236:4: ( (lv_homepage_5_0= RULE_STRING ) )
                    // InternalProgram.g:3237:5: (lv_homepage_5_0= RULE_STRING )
                    {
                    // InternalProgram.g:3237:5: (lv_homepage_5_0= RULE_STRING )
                    // InternalProgram.g:3238:6: lv_homepage_5_0= RULE_STRING
                    {
                    lv_homepage_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_homepage_5_0, grammarAccess.getPersonAccess().getHomepageSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPersonRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"homepage",
                    							lv_homepage_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

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


    // $ANTLR start "entryRuleKind"
    // InternalProgram.g:3259:1: entryRuleKind returns [EObject current=null] : iv_ruleKind= ruleKind EOF ;
    public final EObject entryRuleKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKind = null;


        try {
            // InternalProgram.g:3259:45: (iv_ruleKind= ruleKind EOF )
            // InternalProgram.g:3260:2: iv_ruleKind= ruleKind EOF
            {
             newCompositeNode(grammarAccess.getKindRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKind=ruleKind();

            state._fsp--;

             current =iv_ruleKind; 
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
    // $ANTLR end "entryRuleKind"


    // $ANTLR start "ruleKind"
    // InternalProgram.g:3266:1: ruleKind returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleKind() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalProgram.g:3272:2: ( ( () ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalProgram.g:3273:2: ( () ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalProgram.g:3273:2: ( () ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalProgram.g:3274:3: () ( (lv_name_1_0= RULE_STRING ) )
            {
            // InternalProgram.g:3274:3: ()
            // InternalProgram.g:3275:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKindAccess().getKindAction_0(),
            					current);
            			

            }

            // InternalProgram.g:3281:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalProgram.g:3282:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalProgram.g:3282:4: (lv_name_1_0= RULE_STRING )
            // InternalProgram.g:3283:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getKindAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKindRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleKind"


    // $ANTLR start "ruleWeekDay"
    // InternalProgram.g:3303:1: ruleWeekDay returns [Enumerator current=null] : ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) ) ;
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
            // InternalProgram.g:3309:2: ( ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) ) )
            // InternalProgram.g:3310:2: ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) )
            {
            // InternalProgram.g:3310:2: ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) )
            int alt83=7;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt83=1;
                }
                break;
            case 62:
                {
                alt83=2;
                }
                break;
            case 63:
                {
                alt83=3;
                }
                break;
            case 64:
                {
                alt83=4;
                }
                break;
            case 65:
                {
                alt83=5;
                }
                break;
            case 66:
                {
                alt83=6;
                }
                break;
            case 67:
                {
                alt83=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // InternalProgram.g:3311:3: (enumLiteral_0= 'Monday' )
                    {
                    // InternalProgram.g:3311:3: (enumLiteral_0= 'Monday' )
                    // InternalProgram.g:3312:4: enumLiteral_0= 'Monday'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getMondayEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWeekDayAccess().getMondayEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalProgram.g:3319:3: (enumLiteral_1= 'Tuesday' )
                    {
                    // InternalProgram.g:3319:3: (enumLiteral_1= 'Tuesday' )
                    // InternalProgram.g:3320:4: enumLiteral_1= 'Tuesday'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getTuesdayEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWeekDayAccess().getTuesdayEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalProgram.g:3327:3: (enumLiteral_2= 'Wednesday' )
                    {
                    // InternalProgram.g:3327:3: (enumLiteral_2= 'Wednesday' )
                    // InternalProgram.g:3328:4: enumLiteral_2= 'Wednesday'
                    {
                    enumLiteral_2=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getWednesdayEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWeekDayAccess().getWednesdayEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalProgram.g:3335:3: (enumLiteral_3= 'Thursday' )
                    {
                    // InternalProgram.g:3335:3: (enumLiteral_3= 'Thursday' )
                    // InternalProgram.g:3336:4: enumLiteral_3= 'Thursday'
                    {
                    enumLiteral_3=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getThursdayEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWeekDayAccess().getThursdayEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalProgram.g:3343:3: (enumLiteral_4= 'Friday' )
                    {
                    // InternalProgram.g:3343:3: (enumLiteral_4= 'Friday' )
                    // InternalProgram.g:3344:4: enumLiteral_4= 'Friday'
                    {
                    enumLiteral_4=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getFridayEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getWeekDayAccess().getFridayEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalProgram.g:3351:3: (enumLiteral_5= 'Saturday' )
                    {
                    // InternalProgram.g:3351:3: (enumLiteral_5= 'Saturday' )
                    // InternalProgram.g:3352:4: enumLiteral_5= 'Saturday'
                    {
                    enumLiteral_5=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getSaturdayEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getWeekDayAccess().getSaturdayEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalProgram.g:3359:3: (enumLiteral_6= 'Sunday' )
                    {
                    // InternalProgram.g:3359:3: (enumLiteral_6= 'Sunday' )
                    // InternalProgram.g:3360:4: enumLiteral_6= 'Sunday'
                    {
                    enumLiteral_6=(Token)match(input,67,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000031A002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000031C002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000710002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x005FE6D120000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0xE000000000080000L,0x000000000000000FL});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000022L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000C0010002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080010002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000E80000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000E00000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000C00004002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800004002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002880000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002800000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000108C0000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010840000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000840000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000182880000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000182800000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000180800000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100800000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100880000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000102880000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000102800000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000880000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0020000880000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0020000800000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0700000880004002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0700000800000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0600000800000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0400000800000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x1000000000000002L});

}