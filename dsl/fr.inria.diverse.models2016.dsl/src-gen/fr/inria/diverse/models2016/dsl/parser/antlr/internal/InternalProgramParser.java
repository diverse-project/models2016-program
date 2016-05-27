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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Conference'", "'talk duration'", "'kinds'", "','", "'resources'", "'papers'", "'{'", "';'", "'}'", "'events'", "'program'", "'room'", "'capacity'", "'date'", "'.'", "':'", "'-'", "'in'", "'TalkSession'", "'chair'", "'abstract'", "'Panel'", "'panelists'", "'moderators'", "'SRC'", "'Poster'", "'Keynote'", "'speaker'", "'SponsorKeynote'", "'Workshop'", "'url'", "'name'", "'organizers'", "'Tutorial'", "'DoctoralSymposium'", "'EducatorSymposium'", "'Reception'", "'Clinic'", "'Lunch'", "'CoffeeBreak'", "'Meeting'", "'Opening'", "'authors'", "'preprint'", "'kind'", "'email'", "'homepage'", "'Monday'", "'Tuesday'", "'Wednesday'", "'Thursday'", "'Friday'", "'Saturday'", "'Sunday'"
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
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
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
    // InternalProgram.g:72:1: ruleConference returns [EObject current=null] : ( () otherlv_1= 'Conference' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'talk duration' ( (lv_talkDuration_4_0= ruleEIntegerObject ) ) (otherlv_5= 'kinds' ( (lv_kinds_6_0= ruleKind ) ) (otherlv_7= ',' ( (lv_kinds_8_0= ruleKind ) ) )* )? (otherlv_9= 'resources' ( (lv_resources_10_0= ruleResource ) ) ( (lv_resources_11_0= ruleResource ) )* )? (otherlv_12= 'papers' otherlv_13= '{' ( (lv_papers_14_0= rulePaper ) ) (otherlv_15= ';' ( (lv_papers_16_0= rulePaper ) ) )* otherlv_17= '}' )? (otherlv_18= 'events' otherlv_19= '{' ( (lv_events_20_0= ruleEvent ) ) (otherlv_21= ';' ( (lv_events_22_0= ruleEvent ) ) )* otherlv_23= '}' )? (otherlv_24= 'program' ( (lv_program_25_0= ruleProgram ) ) )? ) ;
    public final EObject ruleConference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
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
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_talkDuration_4_0 = null;

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
            // InternalProgram.g:78:2: ( ( () otherlv_1= 'Conference' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'talk duration' ( (lv_talkDuration_4_0= ruleEIntegerObject ) ) (otherlv_5= 'kinds' ( (lv_kinds_6_0= ruleKind ) ) (otherlv_7= ',' ( (lv_kinds_8_0= ruleKind ) ) )* )? (otherlv_9= 'resources' ( (lv_resources_10_0= ruleResource ) ) ( (lv_resources_11_0= ruleResource ) )* )? (otherlv_12= 'papers' otherlv_13= '{' ( (lv_papers_14_0= rulePaper ) ) (otherlv_15= ';' ( (lv_papers_16_0= rulePaper ) ) )* otherlv_17= '}' )? (otherlv_18= 'events' otherlv_19= '{' ( (lv_events_20_0= ruleEvent ) ) (otherlv_21= ';' ( (lv_events_22_0= ruleEvent ) ) )* otherlv_23= '}' )? (otherlv_24= 'program' ( (lv_program_25_0= ruleProgram ) ) )? ) )
            // InternalProgram.g:79:2: ( () otherlv_1= 'Conference' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'talk duration' ( (lv_talkDuration_4_0= ruleEIntegerObject ) ) (otherlv_5= 'kinds' ( (lv_kinds_6_0= ruleKind ) ) (otherlv_7= ',' ( (lv_kinds_8_0= ruleKind ) ) )* )? (otherlv_9= 'resources' ( (lv_resources_10_0= ruleResource ) ) ( (lv_resources_11_0= ruleResource ) )* )? (otherlv_12= 'papers' otherlv_13= '{' ( (lv_papers_14_0= rulePaper ) ) (otherlv_15= ';' ( (lv_papers_16_0= rulePaper ) ) )* otherlv_17= '}' )? (otherlv_18= 'events' otherlv_19= '{' ( (lv_events_20_0= ruleEvent ) ) (otherlv_21= ';' ( (lv_events_22_0= ruleEvent ) ) )* otherlv_23= '}' )? (otherlv_24= 'program' ( (lv_program_25_0= ruleProgram ) ) )? )
            {
            // InternalProgram.g:79:2: ( () otherlv_1= 'Conference' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'talk duration' ( (lv_talkDuration_4_0= ruleEIntegerObject ) ) (otherlv_5= 'kinds' ( (lv_kinds_6_0= ruleKind ) ) (otherlv_7= ',' ( (lv_kinds_8_0= ruleKind ) ) )* )? (otherlv_9= 'resources' ( (lv_resources_10_0= ruleResource ) ) ( (lv_resources_11_0= ruleResource ) )* )? (otherlv_12= 'papers' otherlv_13= '{' ( (lv_papers_14_0= rulePaper ) ) (otherlv_15= ';' ( (lv_papers_16_0= rulePaper ) ) )* otherlv_17= '}' )? (otherlv_18= 'events' otherlv_19= '{' ( (lv_events_20_0= ruleEvent ) ) (otherlv_21= ';' ( (lv_events_22_0= ruleEvent ) ) )* otherlv_23= '}' )? (otherlv_24= 'program' ( (lv_program_25_0= ruleProgram ) ) )? )
            // InternalProgram.g:80:3: () otherlv_1= 'Conference' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'talk duration' ( (lv_talkDuration_4_0= ruleEIntegerObject ) ) (otherlv_5= 'kinds' ( (lv_kinds_6_0= ruleKind ) ) (otherlv_7= ',' ( (lv_kinds_8_0= ruleKind ) ) )* )? (otherlv_9= 'resources' ( (lv_resources_10_0= ruleResource ) ) ( (lv_resources_11_0= ruleResource ) )* )? (otherlv_12= 'papers' otherlv_13= '{' ( (lv_papers_14_0= rulePaper ) ) (otherlv_15= ';' ( (lv_papers_16_0= rulePaper ) ) )* otherlv_17= '}' )? (otherlv_18= 'events' otherlv_19= '{' ( (lv_events_20_0= ruleEvent ) ) (otherlv_21= ';' ( (lv_events_22_0= ruleEvent ) ) )* otherlv_23= '}' )? (otherlv_24= 'program' ( (lv_program_25_0= ruleProgram ) ) )?
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

            			newLeafNode(otherlv_3, grammarAccess.getConferenceAccess().getTalkDurationKeyword_3());
            		
            // InternalProgram.g:114:3: ( (lv_talkDuration_4_0= ruleEIntegerObject ) )
            // InternalProgram.g:115:4: (lv_talkDuration_4_0= ruleEIntegerObject )
            {
            // InternalProgram.g:115:4: (lv_talkDuration_4_0= ruleEIntegerObject )
            // InternalProgram.g:116:5: lv_talkDuration_4_0= ruleEIntegerObject
            {

            					newCompositeNode(grammarAccess.getConferenceAccess().getTalkDurationEIntegerObjectParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_talkDuration_4_0=ruleEIntegerObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConferenceRule());
            					}
            					set(
            						current,
            						"talkDuration",
            						lv_talkDuration_4_0,
            						"fr.inria.diverse.models2016.dsl.Program.EIntegerObject");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:133:3: (otherlv_5= 'kinds' ( (lv_kinds_6_0= ruleKind ) ) (otherlv_7= ',' ( (lv_kinds_8_0= ruleKind ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalProgram.g:134:4: otherlv_5= 'kinds' ( (lv_kinds_6_0= ruleKind ) ) (otherlv_7= ',' ( (lv_kinds_8_0= ruleKind ) ) )*
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getConferenceAccess().getKindsKeyword_5_0());
                    			
                    // InternalProgram.g:138:4: ( (lv_kinds_6_0= ruleKind ) )
                    // InternalProgram.g:139:5: (lv_kinds_6_0= ruleKind )
                    {
                    // InternalProgram.g:139:5: (lv_kinds_6_0= ruleKind )
                    // InternalProgram.g:140:6: lv_kinds_6_0= ruleKind
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

                    // InternalProgram.g:157:4: (otherlv_7= ',' ( (lv_kinds_8_0= ruleKind ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalProgram.g:158:5: otherlv_7= ',' ( (lv_kinds_8_0= ruleKind ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getConferenceAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalProgram.g:162:5: ( (lv_kinds_8_0= ruleKind ) )
                    	    // InternalProgram.g:163:6: (lv_kinds_8_0= ruleKind )
                    	    {
                    	    // InternalProgram.g:163:6: (lv_kinds_8_0= ruleKind )
                    	    // InternalProgram.g:164:7: lv_kinds_8_0= ruleKind
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

            // InternalProgram.g:183:3: (otherlv_9= 'resources' ( (lv_resources_10_0= ruleResource ) ) ( (lv_resources_11_0= ruleResource ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalProgram.g:184:4: otherlv_9= 'resources' ( (lv_resources_10_0= ruleResource ) ) ( (lv_resources_11_0= ruleResource ) )*
                    {
                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getConferenceAccess().getResourcesKeyword_6_0());
                    			
                    // InternalProgram.g:188:4: ( (lv_resources_10_0= ruleResource ) )
                    // InternalProgram.g:189:5: (lv_resources_10_0= ruleResource )
                    {
                    // InternalProgram.g:189:5: (lv_resources_10_0= ruleResource )
                    // InternalProgram.g:190:6: lv_resources_10_0= ruleResource
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

                    // InternalProgram.g:207:4: ( (lv_resources_11_0= ruleResource ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==22) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalProgram.g:208:5: (lv_resources_11_0= ruleResource )
                    	    {
                    	    // InternalProgram.g:208:5: (lv_resources_11_0= ruleResource )
                    	    // InternalProgram.g:209:6: lv_resources_11_0= ruleResource
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

            // InternalProgram.g:227:3: (otherlv_12= 'papers' otherlv_13= '{' ( (lv_papers_14_0= rulePaper ) ) (otherlv_15= ';' ( (lv_papers_16_0= rulePaper ) ) )* otherlv_17= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalProgram.g:228:4: otherlv_12= 'papers' otherlv_13= '{' ( (lv_papers_14_0= rulePaper ) ) (otherlv_15= ';' ( (lv_papers_16_0= rulePaper ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getConferenceAccess().getPapersKeyword_7_0());
                    			
                    otherlv_13=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getConferenceAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalProgram.g:236:4: ( (lv_papers_14_0= rulePaper ) )
                    // InternalProgram.g:237:5: (lv_papers_14_0= rulePaper )
                    {
                    // InternalProgram.g:237:5: (lv_papers_14_0= rulePaper )
                    // InternalProgram.g:238:6: lv_papers_14_0= rulePaper
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

                    // InternalProgram.g:255:4: (otherlv_15= ';' ( (lv_papers_16_0= rulePaper ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==18) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalProgram.g:256:5: otherlv_15= ';' ( (lv_papers_16_0= rulePaper ) )
                    	    {
                    	    otherlv_15=(Token)match(input,18,FOLLOW_3); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getConferenceAccess().getSemicolonKeyword_7_3_0());
                    	    				
                    	    // InternalProgram.g:260:5: ( (lv_papers_16_0= rulePaper ) )
                    	    // InternalProgram.g:261:6: (lv_papers_16_0= rulePaper )
                    	    {
                    	    // InternalProgram.g:261:6: (lv_papers_16_0= rulePaper )
                    	    // InternalProgram.g:262:7: lv_papers_16_0= rulePaper
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

            // InternalProgram.g:285:3: (otherlv_18= 'events' otherlv_19= '{' ( (lv_events_20_0= ruleEvent ) ) (otherlv_21= ';' ( (lv_events_22_0= ruleEvent ) ) )* otherlv_23= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalProgram.g:286:4: otherlv_18= 'events' otherlv_19= '{' ( (lv_events_20_0= ruleEvent ) ) (otherlv_21= ';' ( (lv_events_22_0= ruleEvent ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_18, grammarAccess.getConferenceAccess().getEventsKeyword_8_0());
                    			
                    otherlv_19=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_19, grammarAccess.getConferenceAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalProgram.g:294:4: ( (lv_events_20_0= ruleEvent ) )
                    // InternalProgram.g:295:5: (lv_events_20_0= ruleEvent )
                    {
                    // InternalProgram.g:295:5: (lv_events_20_0= ruleEvent )
                    // InternalProgram.g:296:6: lv_events_20_0= ruleEvent
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

                    // InternalProgram.g:313:4: (otherlv_21= ';' ( (lv_events_22_0= ruleEvent ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==18) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalProgram.g:314:5: otherlv_21= ';' ( (lv_events_22_0= ruleEvent ) )
                    	    {
                    	    otherlv_21=(Token)match(input,18,FOLLOW_13); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getConferenceAccess().getSemicolonKeyword_8_3_0());
                    	    				
                    	    // InternalProgram.g:318:5: ( (lv_events_22_0= ruleEvent ) )
                    	    // InternalProgram.g:319:6: (lv_events_22_0= ruleEvent )
                    	    {
                    	    // InternalProgram.g:319:6: (lv_events_22_0= ruleEvent )
                    	    // InternalProgram.g:320:7: lv_events_22_0= ruleEvent
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

            // InternalProgram.g:343:3: (otherlv_24= 'program' ( (lv_program_25_0= ruleProgram ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalProgram.g:344:4: otherlv_24= 'program' ( (lv_program_25_0= ruleProgram ) )
                    {
                    otherlv_24=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_24, grammarAccess.getConferenceAccess().getProgramKeyword_9_0());
                    			
                    // InternalProgram.g:348:4: ( (lv_program_25_0= ruleProgram ) )
                    // InternalProgram.g:349:5: (lv_program_25_0= ruleProgram )
                    {
                    // InternalProgram.g:349:5: (lv_program_25_0= ruleProgram )
                    // InternalProgram.g:350:6: lv_program_25_0= ruleProgram
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
    // InternalProgram.g:372:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalProgram.g:372:49: (iv_ruleResource= ruleResource EOF )
            // InternalProgram.g:373:2: iv_ruleResource= ruleResource EOF
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
    // InternalProgram.g:379:1: ruleResource returns [EObject current=null] : this_Room_0= ruleRoom ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        EObject this_Room_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:385:2: (this_Room_0= ruleRoom )
            // InternalProgram.g:386:2: this_Room_0= ruleRoom
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
    // InternalProgram.g:397:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalProgram.g:397:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalProgram.g:398:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalProgram.g:404:1: ruleEvent returns [EObject current=null] : (this_TalkSession_0= ruleTalkSession | this_Panel_1= rulePanel | this_Workshop_2= ruleWorkshop | this_Tutorial_3= ruleTutorial | this_DoctoralSymposium_4= ruleDoctoralSymposium | this_EducatorSymposium_5= ruleEducatorSymposium | this_Reception_6= ruleReception | this_Clinic_7= ruleClinic | this_Lunch_8= ruleLunch | this_CoffeeBreak_9= ruleCoffeeBreak | this_Meeting_10= ruleMeeting | this_SRC_11= ruleSRC | this_Poster_12= rulePoster | this_Keynote_13= ruleKeynote | this_SponsorKeynote_14= ruleSponsorKeynote | this_Opening_15= ruleOpening ) ;
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
            // InternalProgram.g:410:2: ( (this_TalkSession_0= ruleTalkSession | this_Panel_1= rulePanel | this_Workshop_2= ruleWorkshop | this_Tutorial_3= ruleTutorial | this_DoctoralSymposium_4= ruleDoctoralSymposium | this_EducatorSymposium_5= ruleEducatorSymposium | this_Reception_6= ruleReception | this_Clinic_7= ruleClinic | this_Lunch_8= ruleLunch | this_CoffeeBreak_9= ruleCoffeeBreak | this_Meeting_10= ruleMeeting | this_SRC_11= ruleSRC | this_Poster_12= rulePoster | this_Keynote_13= ruleKeynote | this_SponsorKeynote_14= ruleSponsorKeynote | this_Opening_15= ruleOpening ) )
            // InternalProgram.g:411:2: (this_TalkSession_0= ruleTalkSession | this_Panel_1= rulePanel | this_Workshop_2= ruleWorkshop | this_Tutorial_3= ruleTutorial | this_DoctoralSymposium_4= ruleDoctoralSymposium | this_EducatorSymposium_5= ruleEducatorSymposium | this_Reception_6= ruleReception | this_Clinic_7= ruleClinic | this_Lunch_8= ruleLunch | this_CoffeeBreak_9= ruleCoffeeBreak | this_Meeting_10= ruleMeeting | this_SRC_11= ruleSRC | this_Poster_12= rulePoster | this_Keynote_13= ruleKeynote | this_SponsorKeynote_14= ruleSponsorKeynote | this_Opening_15= ruleOpening )
            {
            // InternalProgram.g:411:2: (this_TalkSession_0= ruleTalkSession | this_Panel_1= rulePanel | this_Workshop_2= ruleWorkshop | this_Tutorial_3= ruleTutorial | this_DoctoralSymposium_4= ruleDoctoralSymposium | this_EducatorSymposium_5= ruleEducatorSymposium | this_Reception_6= ruleReception | this_Clinic_7= ruleClinic | this_Lunch_8= ruleLunch | this_CoffeeBreak_9= ruleCoffeeBreak | this_Meeting_10= ruleMeeting | this_SRC_11= ruleSRC | this_Poster_12= rulePoster | this_Keynote_13= ruleKeynote | this_SponsorKeynote_14= ruleSponsorKeynote | this_Opening_15= ruleOpening )
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
            case 40:
                {
                alt10=3;
                }
                break;
            case 44:
                {
                alt10=4;
                }
                break;
            case 45:
                {
                alt10=5;
                }
                break;
            case 46:
                {
                alt10=6;
                }
                break;
            case 47:
                {
                alt10=7;
                }
                break;
            case 48:
                {
                alt10=8;
                }
                break;
            case 49:
                {
                alt10=9;
                }
                break;
            case 50:
                {
                alt10=10;
                }
                break;
            case 51:
                {
                alt10=11;
                }
                break;
            case 35:
                {
                alt10=12;
                }
                break;
            case 36:
                {
                alt10=13;
                }
                break;
            case 37:
                {
                alt10=14;
                }
                break;
            case 39:
                {
                alt10=15;
                }
                break;
            case 52:
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
                    // InternalProgram.g:412:3: this_TalkSession_0= ruleTalkSession
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
                    // InternalProgram.g:421:3: this_Panel_1= rulePanel
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
                    // InternalProgram.g:430:3: this_Workshop_2= ruleWorkshop
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
                    // InternalProgram.g:439:3: this_Tutorial_3= ruleTutorial
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
                    // InternalProgram.g:448:3: this_DoctoralSymposium_4= ruleDoctoralSymposium
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
                    // InternalProgram.g:457:3: this_EducatorSymposium_5= ruleEducatorSymposium
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
                    // InternalProgram.g:466:3: this_Reception_6= ruleReception
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
                    // InternalProgram.g:475:3: this_Clinic_7= ruleClinic
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
                    // InternalProgram.g:484:3: this_Lunch_8= ruleLunch
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
                    // InternalProgram.g:493:3: this_CoffeeBreak_9= ruleCoffeeBreak
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
                    // InternalProgram.g:502:3: this_Meeting_10= ruleMeeting
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
                    // InternalProgram.g:511:3: this_SRC_11= ruleSRC
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
                    // InternalProgram.g:520:3: this_Poster_12= rulePoster
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
                    // InternalProgram.g:529:3: this_Keynote_13= ruleKeynote
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
                    // InternalProgram.g:538:3: this_SponsorKeynote_14= ruleSponsorKeynote
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
                    // InternalProgram.g:547:3: this_Opening_15= ruleOpening
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


    // $ANTLR start "entryRuleEString"
    // InternalProgram.g:559:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalProgram.g:559:47: (iv_ruleEString= ruleEString EOF )
            // InternalProgram.g:560:2: iv_ruleEString= ruleEString EOF
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
    // InternalProgram.g:566:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalProgram.g:572:2: (this_STRING_0= RULE_STRING )
            // InternalProgram.g:573:2: this_STRING_0= RULE_STRING
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
    // InternalProgram.g:583:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalProgram.g:583:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalProgram.g:584:2: iv_ruleProgram= ruleProgram EOF
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
    // InternalProgram.g:590:1: ruleProgram returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )* )? otherlv_4= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_days_2_0 = null;

        EObject lv_days_3_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:596:2: ( ( () otherlv_1= '{' ( ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )* )? otherlv_4= '}' ) )
            // InternalProgram.g:597:2: ( () otherlv_1= '{' ( ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )* )? otherlv_4= '}' )
            {
            // InternalProgram.g:597:2: ( () otherlv_1= '{' ( ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )* )? otherlv_4= '}' )
            // InternalProgram.g:598:3: () otherlv_1= '{' ( ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )* )? otherlv_4= '}'
            {
            // InternalProgram.g:598:3: ()
            // InternalProgram.g:599:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProgramAccess().getProgramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalProgram.g:609:3: ( ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=58 && LA12_0<=64)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalProgram.g:610:4: ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )*
                    {
                    // InternalProgram.g:610:4: ( (lv_days_2_0= ruleDay ) )
                    // InternalProgram.g:611:5: (lv_days_2_0= ruleDay )
                    {
                    // InternalProgram.g:611:5: (lv_days_2_0= ruleDay )
                    // InternalProgram.g:612:6: lv_days_2_0= ruleDay
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

                    // InternalProgram.g:629:4: ( (lv_days_3_0= ruleDay ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>=58 && LA11_0<=64)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalProgram.g:630:5: (lv_days_3_0= ruleDay )
                    	    {
                    	    // InternalProgram.g:630:5: (lv_days_3_0= ruleDay )
                    	    // InternalProgram.g:631:6: lv_days_3_0= ruleDay
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
    // InternalProgram.g:657:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // InternalProgram.g:657:45: (iv_ruleRoom= ruleRoom EOF )
            // InternalProgram.g:658:2: iv_ruleRoom= ruleRoom EOF
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
    // InternalProgram.g:664:1: ruleRoom returns [EObject current=null] : ( () otherlv_1= 'room' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEIntegerObject ) ) )? ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_capacity_4_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:670:2: ( ( () otherlv_1= 'room' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEIntegerObject ) ) )? ) )
            // InternalProgram.g:671:2: ( () otherlv_1= 'room' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEIntegerObject ) ) )? )
            {
            // InternalProgram.g:671:2: ( () otherlv_1= 'room' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEIntegerObject ) ) )? )
            // InternalProgram.g:672:3: () otherlv_1= 'room' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEIntegerObject ) ) )?
            {
            // InternalProgram.g:672:3: ()
            // InternalProgram.g:673:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoomAccess().getRoomAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRoomAccess().getRoomKeyword_1());
            		
            // InternalProgram.g:683:3: ( (lv_name_2_0= ruleEString ) )
            // InternalProgram.g:684:4: (lv_name_2_0= ruleEString )
            {
            // InternalProgram.g:684:4: (lv_name_2_0= ruleEString )
            // InternalProgram.g:685:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoomAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
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

            // InternalProgram.g:702:3: (otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEIntegerObject ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalProgram.g:703:4: otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEIntegerObject ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getRoomAccess().getCapacityKeyword_3_0());
                    			
                    // InternalProgram.g:707:4: ( (lv_capacity_4_0= ruleEIntegerObject ) )
                    // InternalProgram.g:708:5: (lv_capacity_4_0= ruleEIntegerObject )
                    {
                    // InternalProgram.g:708:5: (lv_capacity_4_0= ruleEIntegerObject )
                    // InternalProgram.g:709:6: lv_capacity_4_0= ruleEIntegerObject
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
    // InternalProgram.g:731:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // InternalProgram.g:731:54: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // InternalProgram.g:732:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
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
    // InternalProgram.g:738:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalProgram.g:744:2: (this_INT_0= RULE_INT )
            // InternalProgram.g:745:2: this_INT_0= RULE_INT
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
    // InternalProgram.g:755:1: entryRuleDay returns [EObject current=null] : iv_ruleDay= ruleDay EOF ;
    public final EObject entryRuleDay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDay = null;


        try {
            // InternalProgram.g:755:44: (iv_ruleDay= ruleDay EOF )
            // InternalProgram.g:756:2: iv_ruleDay= ruleDay EOF
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
    // InternalProgram.g:762:1: ruleDay returns [EObject current=null] : ( ( (lv_weekday_0_0= ruleWeekDay ) ) (otherlv_1= 'date' ( (lv_date_2_0= ruleDayDataType ) ) )? ( ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )* )? ) ;
    public final EObject ruleDay() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_weekday_0_0 = null;

        AntlrDatatypeRuleToken lv_date_2_0 = null;

        EObject lv_sessions_3_0 = null;

        EObject lv_sessions_4_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:768:2: ( ( ( (lv_weekday_0_0= ruleWeekDay ) ) (otherlv_1= 'date' ( (lv_date_2_0= ruleDayDataType ) ) )? ( ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )* )? ) )
            // InternalProgram.g:769:2: ( ( (lv_weekday_0_0= ruleWeekDay ) ) (otherlv_1= 'date' ( (lv_date_2_0= ruleDayDataType ) ) )? ( ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )* )? )
            {
            // InternalProgram.g:769:2: ( ( (lv_weekday_0_0= ruleWeekDay ) ) (otherlv_1= 'date' ( (lv_date_2_0= ruleDayDataType ) ) )? ( ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )* )? )
            // InternalProgram.g:770:3: ( (lv_weekday_0_0= ruleWeekDay ) ) (otherlv_1= 'date' ( (lv_date_2_0= ruleDayDataType ) ) )? ( ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )* )?
            {
            // InternalProgram.g:770:3: ( (lv_weekday_0_0= ruleWeekDay ) )
            // InternalProgram.g:771:4: (lv_weekday_0_0= ruleWeekDay )
            {
            // InternalProgram.g:771:4: (lv_weekday_0_0= ruleWeekDay )
            // InternalProgram.g:772:5: lv_weekday_0_0= ruleWeekDay
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

            // InternalProgram.g:789:3: (otherlv_1= 'date' ( (lv_date_2_0= ruleDayDataType ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalProgram.g:790:4: otherlv_1= 'date' ( (lv_date_2_0= ruleDayDataType ) )
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getDayAccess().getDateKeyword_1_0());
                    			
                    // InternalProgram.g:794:4: ( (lv_date_2_0= ruleDayDataType ) )
                    // InternalProgram.g:795:5: (lv_date_2_0= ruleDayDataType )
                    {
                    // InternalProgram.g:795:5: (lv_date_2_0= ruleDayDataType )
                    // InternalProgram.g:796:6: lv_date_2_0= ruleDayDataType
                    {

                    						newCompositeNode(grammarAccess.getDayAccess().getDateDayDataTypeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

            // InternalProgram.g:814:3: ( ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalProgram.g:815:4: ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )*
                    {
                    // InternalProgram.g:815:4: ( (lv_sessions_3_0= ruleSession ) )
                    // InternalProgram.g:816:5: (lv_sessions_3_0= ruleSession )
                    {
                    // InternalProgram.g:816:5: (lv_sessions_3_0= ruleSession )
                    // InternalProgram.g:817:6: lv_sessions_3_0= ruleSession
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

                    // InternalProgram.g:834:4: ( (lv_sessions_4_0= ruleSession ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_INT) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalProgram.g:835:5: (lv_sessions_4_0= ruleSession )
                    	    {
                    	    // InternalProgram.g:835:5: (lv_sessions_4_0= ruleSession )
                    	    // InternalProgram.g:836:6: lv_sessions_4_0= ruleSession
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


    // $ANTLR start "entryRuleDayDataType"
    // InternalProgram.g:858:1: entryRuleDayDataType returns [String current=null] : iv_ruleDayDataType= ruleDayDataType EOF ;
    public final String entryRuleDayDataType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDayDataType = null;


        try {
            // InternalProgram.g:858:51: (iv_ruleDayDataType= ruleDayDataType EOF )
            // InternalProgram.g:859:2: iv_ruleDayDataType= ruleDayDataType EOF
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
    // InternalProgram.g:865:1: ruleDayDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDayDataType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalProgram.g:871:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) )
            // InternalProgram.g:872:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
            {
            // InternalProgram.g:872:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
            // InternalProgram.g:873:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDayDataTypeAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,25,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDayDataTypeAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_19); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDayDataTypeAccess().getINTTerminalRuleCall_2());
            		
            kw=(Token)match(input,25,FOLLOW_5); 

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
    // InternalProgram.g:908:1: entryRuleHourDataType returns [String current=null] : iv_ruleHourDataType= ruleHourDataType EOF ;
    public final String entryRuleHourDataType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHourDataType = null;


        try {
            // InternalProgram.g:908:52: (iv_ruleHourDataType= ruleHourDataType EOF )
            // InternalProgram.g:909:2: iv_ruleHourDataType= ruleHourDataType EOF
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
    // InternalProgram.g:915:1: ruleHourDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= ':' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleHourDataType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalProgram.g:921:2: ( (this_INT_0= RULE_INT kw= ':' this_INT_2= RULE_INT ) )
            // InternalProgram.g:922:2: (this_INT_0= RULE_INT kw= ':' this_INT_2= RULE_INT )
            {
            // InternalProgram.g:922:2: (this_INT_0= RULE_INT kw= ':' this_INT_2= RULE_INT )
            // InternalProgram.g:923:3: this_INT_0= RULE_INT kw= ':' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getHourDataTypeAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,26,FOLLOW_5); 

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
    // InternalProgram.g:953:1: ruleSession returns [EObject current=null] : ( () ( (lv_startingTime_1_0= ruleHourDataType ) ) otherlv_2= '-' ( (lv_endingTime_3_0= ruleHourDataType ) ) otherlv_4= 'in' ( ( ruleEString ) ) otherlv_6= ':' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ;
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
            // InternalProgram.g:959:2: ( ( () ( (lv_startingTime_1_0= ruleHourDataType ) ) otherlv_2= '-' ( (lv_endingTime_3_0= ruleHourDataType ) ) otherlv_4= 'in' ( ( ruleEString ) ) otherlv_6= ':' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) )
            // InternalProgram.g:960:2: ( () ( (lv_startingTime_1_0= ruleHourDataType ) ) otherlv_2= '-' ( (lv_endingTime_3_0= ruleHourDataType ) ) otherlv_4= 'in' ( ( ruleEString ) ) otherlv_6= ':' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )
            {
            // InternalProgram.g:960:2: ( () ( (lv_startingTime_1_0= ruleHourDataType ) ) otherlv_2= '-' ( (lv_endingTime_3_0= ruleHourDataType ) ) otherlv_4= 'in' ( ( ruleEString ) ) otherlv_6= ':' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )
            // InternalProgram.g:961:3: () ( (lv_startingTime_1_0= ruleHourDataType ) ) otherlv_2= '-' ( (lv_endingTime_3_0= ruleHourDataType ) ) otherlv_4= 'in' ( ( ruleEString ) ) otherlv_6= ':' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )*
            {
            // InternalProgram.g:961:3: ()
            // InternalProgram.g:962:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSessionAccess().getSessionAction_0(),
            					current);
            			

            }

            // InternalProgram.g:968:3: ( (lv_startingTime_1_0= ruleHourDataType ) )
            // InternalProgram.g:969:4: (lv_startingTime_1_0= ruleHourDataType )
            {
            // InternalProgram.g:969:4: (lv_startingTime_1_0= ruleHourDataType )
            // InternalProgram.g:970:5: lv_startingTime_1_0= ruleHourDataType
            {

            					newCompositeNode(grammarAccess.getSessionAccess().getStartingTimeHourDataTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_2=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSessionAccess().getHyphenMinusKeyword_2());
            		
            // InternalProgram.g:991:3: ( (lv_endingTime_3_0= ruleHourDataType ) )
            // InternalProgram.g:992:4: (lv_endingTime_3_0= ruleHourDataType )
            {
            // InternalProgram.g:992:4: (lv_endingTime_3_0= ruleHourDataType )
            // InternalProgram.g:993:5: lv_endingTime_3_0= ruleHourDataType
            {

            					newCompositeNode(grammarAccess.getSessionAccess().getEndingTimeHourDataTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_4=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getSessionAccess().getInKeyword_4());
            		
            // InternalProgram.g:1014:3: ( ( ruleEString ) )
            // InternalProgram.g:1015:4: ( ruleEString )
            {
            // InternalProgram.g:1015:4: ( ruleEString )
            // InternalProgram.g:1016:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSessionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSessionAccess().getRoomRoomCrossReference_5_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getSessionAccess().getColonKeyword_6());
            		
            // InternalProgram.g:1034:3: ( ( ruleEString ) )
            // InternalProgram.g:1035:4: ( ruleEString )
            {
            // InternalProgram.g:1035:4: ( ruleEString )
            // InternalProgram.g:1036:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSessionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSessionAccess().getEventsEventCrossReference_7_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:1050:3: (otherlv_8= ',' ( ( ruleEString ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==14) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalProgram.g:1051:4: otherlv_8= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_8, grammarAccess.getSessionAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalProgram.g:1055:4: ( ( ruleEString ) )
            	    // InternalProgram.g:1056:5: ( ruleEString )
            	    {
            	    // InternalProgram.g:1056:5: ( ruleEString )
            	    // InternalProgram.g:1057:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSessionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getSessionAccess().getEventsEventCrossReference_8_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
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
    // InternalProgram.g:1076:1: entryRuleTalkSession returns [EObject current=null] : iv_ruleTalkSession= ruleTalkSession EOF ;
    public final EObject entryRuleTalkSession() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTalkSession = null;


        try {
            // InternalProgram.g:1076:52: (iv_ruleTalkSession= ruleTalkSession EOF )
            // InternalProgram.g:1077:2: iv_ruleTalkSession= ruleTalkSession EOF
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
    // InternalProgram.g:1083:1: ruleTalkSession returns [EObject current=null] : (otherlv_0= 'TalkSession' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) ) )? (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'papers' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? ) ;
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
            // InternalProgram.g:1089:2: ( (otherlv_0= 'TalkSession' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) ) )? (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'papers' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? ) )
            // InternalProgram.g:1090:2: (otherlv_0= 'TalkSession' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) ) )? (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'papers' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? )
            {
            // InternalProgram.g:1090:2: (otherlv_0= 'TalkSession' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) ) )? (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'papers' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? )
            // InternalProgram.g:1091:3: otherlv_0= 'TalkSession' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) ) )? (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'papers' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTalkSessionAccess().getTalkSessionKeyword_0());
            		
            // InternalProgram.g:1095:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1096:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1096:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1097:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTalkSessionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalProgram.g:1114:3: (otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalProgram.g:1115:4: otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getTalkSessionAccess().getChairKeyword_2_0());
                    			
                    // InternalProgram.g:1119:4: ( (lv_chair_3_0= rulePerson ) )
                    // InternalProgram.g:1120:5: (lv_chair_3_0= rulePerson )
                    {
                    // InternalProgram.g:1120:5: (lv_chair_3_0= rulePerson )
                    // InternalProgram.g:1121:6: lv_chair_3_0= rulePerson
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

            // InternalProgram.g:1139:3: (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalProgram.g:1140:4: otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTalkSessionAccess().getAbstractKeyword_3_0());
                    			
                    // InternalProgram.g:1144:4: ( (lv_abstract_5_0= ruleEString ) )
                    // InternalProgram.g:1145:5: (lv_abstract_5_0= ruleEString )
                    {
                    // InternalProgram.g:1145:5: (lv_abstract_5_0= ruleEString )
                    // InternalProgram.g:1146:6: lv_abstract_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTalkSessionAccess().getAbstractEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
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

            // InternalProgram.g:1164:3: (otherlv_6= 'papers' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==16) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalProgram.g:1165:4: otherlv_6= 'papers' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getTalkSessionAccess().getPapersKeyword_4_0());
                    			
                    // InternalProgram.g:1169:4: ( ( ruleEString ) )
                    // InternalProgram.g:1170:5: ( ruleEString )
                    {
                    // InternalProgram.g:1170:5: ( ruleEString )
                    // InternalProgram.g:1171:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTalkSessionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTalkSessionAccess().getPapersPaperCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:1185:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==14) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalProgram.g:1186:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getTalkSessionAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalProgram.g:1190:5: ( ( ruleEString ) )
                    	    // InternalProgram.g:1191:6: ( ruleEString )
                    	    {
                    	    // InternalProgram.g:1191:6: ( ruleEString )
                    	    // InternalProgram.g:1192:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTalkSessionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTalkSessionAccess().getPapersPaperCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

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
    // InternalProgram.g:1212:1: entryRulePanel returns [EObject current=null] : iv_rulePanel= rulePanel EOF ;
    public final EObject entryRulePanel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePanel = null;


        try {
            // InternalProgram.g:1212:46: (iv_rulePanel= rulePanel EOF )
            // InternalProgram.g:1213:2: iv_rulePanel= rulePanel EOF
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
    // InternalProgram.g:1219:1: rulePanel returns [EObject current=null] : (otherlv_0= 'Panel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )* )? (otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )* )? ) ;
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
            // InternalProgram.g:1225:2: ( (otherlv_0= 'Panel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )* )? (otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )* )? ) )
            // InternalProgram.g:1226:2: (otherlv_0= 'Panel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )* )? (otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )* )? )
            {
            // InternalProgram.g:1226:2: (otherlv_0= 'Panel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )* )? (otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )* )? )
            // InternalProgram.g:1227:3: otherlv_0= 'Panel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )* )? (otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )* )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPanelAccess().getPanelKeyword_0());
            		
            // InternalProgram.g:1231:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1232:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1232:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1233:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPanelAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalProgram.g:1250:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalProgram.g:1251:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getPanelAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1255:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:1256:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:1256:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:1257:6: lv_abstract_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPanelAccess().getAbstractEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_28);
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

            // InternalProgram.g:1275:3: (otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalProgram.g:1276:4: otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )*
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getPanelAccess().getPanelistsKeyword_3_0());
                    			
                    // InternalProgram.g:1280:4: ( (lv_panelists_5_0= rulePerson ) )
                    // InternalProgram.g:1281:5: (lv_panelists_5_0= rulePerson )
                    {
                    // InternalProgram.g:1281:5: (lv_panelists_5_0= rulePerson )
                    // InternalProgram.g:1282:6: lv_panelists_5_0= rulePerson
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

                    // InternalProgram.g:1299:4: (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==14) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalProgram.g:1300:5: otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPanelAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalProgram.g:1304:5: ( (lv_panelists_7_0= rulePerson ) )
                    	    // InternalProgram.g:1305:6: (lv_panelists_7_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:1305:6: (lv_panelists_7_0= rulePerson )
                    	    // InternalProgram.g:1306:7: lv_panelists_7_0= rulePerson
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

            // InternalProgram.g:1325:3: (otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==34) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalProgram.g:1326:4: otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )*
                    {
                    otherlv_8=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getPanelAccess().getModeratorsKeyword_4_0());
                    			
                    // InternalProgram.g:1330:4: ( (lv_moderators_9_0= rulePerson ) )
                    // InternalProgram.g:1331:5: (lv_moderators_9_0= rulePerson )
                    {
                    // InternalProgram.g:1331:5: (lv_moderators_9_0= rulePerson )
                    // InternalProgram.g:1332:6: lv_moderators_9_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getPanelAccess().getModeratorsPersonParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
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

                    // InternalProgram.g:1349:4: (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==14) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalProgram.g:1350:5: otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getPanelAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalProgram.g:1354:5: ( (lv_moderators_11_0= rulePerson ) )
                    	    // InternalProgram.g:1355:6: (lv_moderators_11_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:1355:6: (lv_moderators_11_0= rulePerson )
                    	    // InternalProgram.g:1356:7: lv_moderators_11_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getPanelAccess().getModeratorsPersonParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
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
    // InternalProgram.g:1379:1: entryRuleSRC returns [EObject current=null] : iv_ruleSRC= ruleSRC EOF ;
    public final EObject entryRuleSRC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSRC = null;


        try {
            // InternalProgram.g:1379:44: (iv_ruleSRC= ruleSRC EOF )
            // InternalProgram.g:1380:2: iv_ruleSRC= ruleSRC EOF
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
    // InternalProgram.g:1386:1: ruleSRC returns [EObject current=null] : (otherlv_0= 'SRC' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleSRC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_abstract_3_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:1392:2: ( (otherlv_0= 'SRC' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) )
            // InternalProgram.g:1393:2: (otherlv_0= 'SRC' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            {
            // InternalProgram.g:1393:2: (otherlv_0= 'SRC' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            // InternalProgram.g:1394:3: otherlv_0= 'SRC' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSRCAccess().getSRCKeyword_0());
            		
            // InternalProgram.g:1398:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1399:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1399:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1400:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSRCAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSRCRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:1417:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalProgram.g:1418:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getSRCAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1422:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:1423:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:1423:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:1424:6: lv_abstract_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSRCAccess().getAbstractEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_abstract_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSRCRule());
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
    // $ANTLR end "ruleSRC"


    // $ANTLR start "entryRulePoster"
    // InternalProgram.g:1446:1: entryRulePoster returns [EObject current=null] : iv_rulePoster= rulePoster EOF ;
    public final EObject entryRulePoster() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoster = null;


        try {
            // InternalProgram.g:1446:47: (iv_rulePoster= rulePoster EOF )
            // InternalProgram.g:1447:2: iv_rulePoster= rulePoster EOF
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
    // InternalProgram.g:1453:1: rulePoster returns [EObject current=null] : (otherlv_0= 'Poster' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) ;
    public final EObject rulePoster() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_abstract_3_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:1459:2: ( (otherlv_0= 'Poster' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) )
            // InternalProgram.g:1460:2: (otherlv_0= 'Poster' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            {
            // InternalProgram.g:1460:2: (otherlv_0= 'Poster' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            // InternalProgram.g:1461:3: otherlv_0= 'Poster' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPosterAccess().getPosterKeyword_0());
            		
            // InternalProgram.g:1465:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1466:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1466:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1467:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPosterAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPosterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:1484:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalProgram.g:1485:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getPosterAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1489:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:1490:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:1490:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:1491:6: lv_abstract_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPosterAccess().getAbstractEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_abstract_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPosterRule());
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
    // $ANTLR end "rulePoster"


    // $ANTLR start "entryRuleKeynote"
    // InternalProgram.g:1513:1: entryRuleKeynote returns [EObject current=null] : iv_ruleKeynote= ruleKeynote EOF ;
    public final EObject entryRuleKeynote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeynote = null;


        try {
            // InternalProgram.g:1513:48: (iv_ruleKeynote= ruleKeynote EOF )
            // InternalProgram.g:1514:2: iv_ruleKeynote= ruleKeynote EOF
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
    // InternalProgram.g:1520:1: ruleKeynote returns [EObject current=null] : (otherlv_0= 'Keynote' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) ) )? ) ;
    public final EObject ruleKeynote() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_abstract_3_0 = null;

        EObject lv_speaker_5_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:1526:2: ( (otherlv_0= 'Keynote' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) ) )? ) )
            // InternalProgram.g:1527:2: (otherlv_0= 'Keynote' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) ) )? )
            {
            // InternalProgram.g:1527:2: (otherlv_0= 'Keynote' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) ) )? )
            // InternalProgram.g:1528:3: otherlv_0= 'Keynote' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) ) )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getKeynoteAccess().getKeynoteKeyword_0());
            		
            // InternalProgram.g:1532:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1533:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1533:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1534:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKeynoteAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeynoteRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:1551:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==31) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalProgram.g:1552:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getKeynoteAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1556:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:1557:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:1557:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:1558:6: lv_abstract_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getKeynoteAccess().getAbstractEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_abstract_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKeynoteRule());
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

            // InternalProgram.g:1576:3: (otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==38) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalProgram.g:1577:4: otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) )
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getKeynoteAccess().getSpeakerKeyword_3_0());
                    			
                    // InternalProgram.g:1581:4: ( (lv_speaker_5_0= rulePerson ) )
                    // InternalProgram.g:1582:5: (lv_speaker_5_0= rulePerson )
                    {
                    // InternalProgram.g:1582:5: (lv_speaker_5_0= rulePerson )
                    // InternalProgram.g:1583:6: lv_speaker_5_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getKeynoteAccess().getSpeakerPersonParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
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
    // InternalProgram.g:1605:1: entryRuleSponsorKeynote returns [EObject current=null] : iv_ruleSponsorKeynote= ruleSponsorKeynote EOF ;
    public final EObject entryRuleSponsorKeynote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSponsorKeynote = null;


        try {
            // InternalProgram.g:1605:55: (iv_ruleSponsorKeynote= ruleSponsorKeynote EOF )
            // InternalProgram.g:1606:2: iv_ruleSponsorKeynote= ruleSponsorKeynote EOF
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
    // InternalProgram.g:1612:1: ruleSponsorKeynote returns [EObject current=null] : (otherlv_0= 'SponsorKeynote' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) ) )? ) ;
    public final EObject ruleSponsorKeynote() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_abstract_3_0 = null;

        EObject lv_speaker_5_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:1618:2: ( (otherlv_0= 'SponsorKeynote' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) ) )? ) )
            // InternalProgram.g:1619:2: (otherlv_0= 'SponsorKeynote' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) ) )? )
            {
            // InternalProgram.g:1619:2: (otherlv_0= 'SponsorKeynote' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) ) )? )
            // InternalProgram.g:1620:3: otherlv_0= 'SponsorKeynote' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) ) )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSponsorKeynoteAccess().getSponsorKeynoteKeyword_0());
            		
            // InternalProgram.g:1624:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1625:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1625:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1626:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSponsorKeynoteAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSponsorKeynoteRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:1643:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalProgram.g:1644:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getSponsorKeynoteAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1648:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:1649:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:1649:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:1650:6: lv_abstract_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSponsorKeynoteAccess().getAbstractEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_abstract_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSponsorKeynoteRule());
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

            // InternalProgram.g:1668:3: (otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalProgram.g:1669:4: otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) )
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getSponsorKeynoteAccess().getSpeakerKeyword_3_0());
                    			
                    // InternalProgram.g:1673:4: ( (lv_speaker_5_0= rulePerson ) )
                    // InternalProgram.g:1674:5: (lv_speaker_5_0= rulePerson )
                    {
                    // InternalProgram.g:1674:5: (lv_speaker_5_0= rulePerson )
                    // InternalProgram.g:1675:6: lv_speaker_5_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getSponsorKeynoteAccess().getSpeakerPersonParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
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
    // InternalProgram.g:1697:1: entryRuleWorkshop returns [EObject current=null] : iv_ruleWorkshop= ruleWorkshop EOF ;
    public final EObject entryRuleWorkshop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkshop = null;


        try {
            // InternalProgram.g:1697:49: (iv_ruleWorkshop= ruleWorkshop EOF )
            // InternalProgram.g:1698:2: iv_ruleWorkshop= ruleWorkshop EOF
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
    // InternalProgram.g:1704:1: ruleWorkshop returns [EObject current=null] : (otherlv_0= 'Workshop' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) )? (otherlv_6= 'name' ( (lv_fullName_7_0= ruleEString ) ) )? (otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )* )? ) ;
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

        AntlrDatatypeRuleToken lv_fullName_7_0 = null;

        EObject lv_organizers_9_0 = null;

        EObject lv_organizers_11_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:1710:2: ( (otherlv_0= 'Workshop' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) )? (otherlv_6= 'name' ( (lv_fullName_7_0= ruleEString ) ) )? (otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )* )? ) )
            // InternalProgram.g:1711:2: (otherlv_0= 'Workshop' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) )? (otherlv_6= 'name' ( (lv_fullName_7_0= ruleEString ) ) )? (otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )* )? )
            {
            // InternalProgram.g:1711:2: (otherlv_0= 'Workshop' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) )? (otherlv_6= 'name' ( (lv_fullName_7_0= ruleEString ) ) )? (otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )* )? )
            // InternalProgram.g:1712:3: otherlv_0= 'Workshop' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) )? (otherlv_6= 'name' ( (lv_fullName_7_0= ruleEString ) ) )? (otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )* )?
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkshopAccess().getWorkshopKeyword_0());
            		
            // InternalProgram.g:1716:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1717:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1717:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1718:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWorkshopAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
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

            // InternalProgram.g:1735:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==31) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalProgram.g:1736:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getWorkshopAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1740:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:1741:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:1741:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:1742:6: lv_abstract_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getWorkshopAccess().getAbstractEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_34);
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

            // InternalProgram.g:1760:3: (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==41) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalProgram.g:1761:4: otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getWorkshopAccess().getUrlKeyword_3_0());
                    			
                    // InternalProgram.g:1765:4: ( (lv_url_5_0= ruleEString ) )
                    // InternalProgram.g:1766:5: (lv_url_5_0= ruleEString )
                    {
                    // InternalProgram.g:1766:5: (lv_url_5_0= ruleEString )
                    // InternalProgram.g:1767:6: lv_url_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getWorkshopAccess().getUrlEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_35);
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

            // InternalProgram.g:1785:3: (otherlv_6= 'name' ( (lv_fullName_7_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==42) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalProgram.g:1786:4: otherlv_6= 'name' ( (lv_fullName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getWorkshopAccess().getNameKeyword_4_0());
                    			
                    // InternalProgram.g:1790:4: ( (lv_fullName_7_0= ruleEString ) )
                    // InternalProgram.g:1791:5: (lv_fullName_7_0= ruleEString )
                    {
                    // InternalProgram.g:1791:5: (lv_fullName_7_0= ruleEString )
                    // InternalProgram.g:1792:6: lv_fullName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getWorkshopAccess().getFullNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_fullName_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkshopRule());
                    						}
                    						set(
                    							current,
                    							"fullName",
                    							lv_fullName_7_0,
                    							"fr.inria.diverse.models2016.dsl.Program.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProgram.g:1810:3: (otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==43) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalProgram.g:1811:4: otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )*
                    {
                    otherlv_8=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getWorkshopAccess().getOrganizersKeyword_5_0());
                    			
                    // InternalProgram.g:1815:4: ( (lv_organizers_9_0= rulePerson ) )
                    // InternalProgram.g:1816:5: (lv_organizers_9_0= rulePerson )
                    {
                    // InternalProgram.g:1816:5: (lv_organizers_9_0= rulePerson )
                    // InternalProgram.g:1817:6: lv_organizers_9_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getWorkshopAccess().getOrganizersPersonParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_23);
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

                    // InternalProgram.g:1834:4: (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==14) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalProgram.g:1835:5: otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getWorkshopAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalProgram.g:1839:5: ( (lv_organizers_11_0= rulePerson ) )
                    	    // InternalProgram.g:1840:6: (lv_organizers_11_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:1840:6: (lv_organizers_11_0= rulePerson )
                    	    // InternalProgram.g:1841:7: lv_organizers_11_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getWorkshopAccess().getOrganizersPersonParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
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
                    	    break loop36;
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
    // InternalProgram.g:1864:1: entryRuleTutorial returns [EObject current=null] : iv_ruleTutorial= ruleTutorial EOF ;
    public final EObject entryRuleTutorial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTutorial = null;


        try {
            // InternalProgram.g:1864:49: (iv_ruleTutorial= ruleTutorial EOF )
            // InternalProgram.g:1865:2: iv_ruleTutorial= ruleTutorial EOF
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
    // InternalProgram.g:1871:1: ruleTutorial returns [EObject current=null] : (otherlv_0= 'Tutorial' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? ) ;
    public final EObject ruleTutorial() throws RecognitionException {
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
            // InternalProgram.g:1877:2: ( (otherlv_0= 'Tutorial' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? ) )
            // InternalProgram.g:1878:2: (otherlv_0= 'Tutorial' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? )
            {
            // InternalProgram.g:1878:2: (otherlv_0= 'Tutorial' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? )
            // InternalProgram.g:1879:3: otherlv_0= 'Tutorial' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTutorialAccess().getTutorialKeyword_0());
            		
            // InternalProgram.g:1883:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1884:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1884:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1885:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTutorialAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_37);
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

            // InternalProgram.g:1902:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==31) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalProgram.g:1903:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getTutorialAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1907:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:1908:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:1908:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:1909:6: lv_abstract_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTutorialAccess().getAbstractEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_36);
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

            // InternalProgram.g:1927:3: (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==43) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalProgram.g:1928:4: otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )*
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTutorialAccess().getOrganizersKeyword_3_0());
                    			
                    // InternalProgram.g:1932:4: ( (lv_organizers_5_0= rulePerson ) )
                    // InternalProgram.g:1933:5: (lv_organizers_5_0= rulePerson )
                    {
                    // InternalProgram.g:1933:5: (lv_organizers_5_0= rulePerson )
                    // InternalProgram.g:1934:6: lv_organizers_5_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getTutorialAccess().getOrganizersPersonParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
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

                    // InternalProgram.g:1951:4: (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==14) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalProgram.g:1952:5: otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getTutorialAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalProgram.g:1956:5: ( (lv_organizers_7_0= rulePerson ) )
                    	    // InternalProgram.g:1957:6: (lv_organizers_7_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:1957:6: (lv_organizers_7_0= rulePerson )
                    	    // InternalProgram.g:1958:7: lv_organizers_7_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getTutorialAccess().getOrganizersPersonParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
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
                    	    break loop39;
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
    // InternalProgram.g:1981:1: entryRuleDoctoralSymposium returns [EObject current=null] : iv_ruleDoctoralSymposium= ruleDoctoralSymposium EOF ;
    public final EObject entryRuleDoctoralSymposium() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoctoralSymposium = null;


        try {
            // InternalProgram.g:1981:58: (iv_ruleDoctoralSymposium= ruleDoctoralSymposium EOF )
            // InternalProgram.g:1982:2: iv_ruleDoctoralSymposium= ruleDoctoralSymposium EOF
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
    // InternalProgram.g:1988:1: ruleDoctoralSymposium returns [EObject current=null] : (otherlv_0= 'DoctoralSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? ) ;
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
            // InternalProgram.g:1994:2: ( (otherlv_0= 'DoctoralSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? ) )
            // InternalProgram.g:1995:2: (otherlv_0= 'DoctoralSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? )
            {
            // InternalProgram.g:1995:2: (otherlv_0= 'DoctoralSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? )
            // InternalProgram.g:1996:3: otherlv_0= 'DoctoralSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDoctoralSymposiumAccess().getDoctoralSymposiumKeyword_0());
            		
            // InternalProgram.g:2000:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:2001:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:2001:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:2002:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDoctoralSymposiumAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_37);
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

            // InternalProgram.g:2019:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==31) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalProgram.g:2020:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getDoctoralSymposiumAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:2024:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:2025:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:2025:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:2026:6: lv_abstract_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDoctoralSymposiumAccess().getAbstractEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_36);
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

            // InternalProgram.g:2044:3: (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==43) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalProgram.g:2045:4: otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )*
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getDoctoralSymposiumAccess().getOrganizersKeyword_3_0());
                    			
                    // InternalProgram.g:2049:4: ( (lv_organizers_5_0= rulePerson ) )
                    // InternalProgram.g:2050:5: (lv_organizers_5_0= rulePerson )
                    {
                    // InternalProgram.g:2050:5: (lv_organizers_5_0= rulePerson )
                    // InternalProgram.g:2051:6: lv_organizers_5_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getDoctoralSymposiumAccess().getOrganizersPersonParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
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

                    // InternalProgram.g:2068:4: (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==14) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalProgram.g:2069:5: otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getDoctoralSymposiumAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalProgram.g:2073:5: ( (lv_organizers_7_0= rulePerson ) )
                    	    // InternalProgram.g:2074:6: (lv_organizers_7_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:2074:6: (lv_organizers_7_0= rulePerson )
                    	    // InternalProgram.g:2075:7: lv_organizers_7_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getDoctoralSymposiumAccess().getOrganizersPersonParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
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
                    	    break loop42;
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
    // InternalProgram.g:2098:1: entryRuleEducatorSymposium returns [EObject current=null] : iv_ruleEducatorSymposium= ruleEducatorSymposium EOF ;
    public final EObject entryRuleEducatorSymposium() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEducatorSymposium = null;


        try {
            // InternalProgram.g:2098:58: (iv_ruleEducatorSymposium= ruleEducatorSymposium EOF )
            // InternalProgram.g:2099:2: iv_ruleEducatorSymposium= ruleEducatorSymposium EOF
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
    // InternalProgram.g:2105:1: ruleEducatorSymposium returns [EObject current=null] : (otherlv_0= 'EducatorSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? ) ;
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
            // InternalProgram.g:2111:2: ( (otherlv_0= 'EducatorSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? ) )
            // InternalProgram.g:2112:2: (otherlv_0= 'EducatorSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? )
            {
            // InternalProgram.g:2112:2: (otherlv_0= 'EducatorSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? )
            // InternalProgram.g:2113:3: otherlv_0= 'EducatorSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEducatorSymposiumAccess().getEducatorSymposiumKeyword_0());
            		
            // InternalProgram.g:2117:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:2118:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:2118:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:2119:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEducatorSymposiumAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_37);
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

            // InternalProgram.g:2136:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==31) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalProgram.g:2137:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getEducatorSymposiumAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:2141:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:2142:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:2142:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:2143:6: lv_abstract_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEducatorSymposiumAccess().getAbstractEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_36);
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

            // InternalProgram.g:2161:3: (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==43) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalProgram.g:2162:4: otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )*
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEducatorSymposiumAccess().getOrganizersKeyword_3_0());
                    			
                    // InternalProgram.g:2166:4: ( (lv_organizers_5_0= rulePerson ) )
                    // InternalProgram.g:2167:5: (lv_organizers_5_0= rulePerson )
                    {
                    // InternalProgram.g:2167:5: (lv_organizers_5_0= rulePerson )
                    // InternalProgram.g:2168:6: lv_organizers_5_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getEducatorSymposiumAccess().getOrganizersPersonParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
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

                    // InternalProgram.g:2185:4: (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==14) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalProgram.g:2186:5: otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getEducatorSymposiumAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalProgram.g:2190:5: ( (lv_organizers_7_0= rulePerson ) )
                    	    // InternalProgram.g:2191:6: (lv_organizers_7_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:2191:6: (lv_organizers_7_0= rulePerson )
                    	    // InternalProgram.g:2192:7: lv_organizers_7_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getEducatorSymposiumAccess().getOrganizersPersonParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
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
                    	    break loop45;
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
    // InternalProgram.g:2215:1: entryRuleReception returns [EObject current=null] : iv_ruleReception= ruleReception EOF ;
    public final EObject entryRuleReception() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReception = null;


        try {
            // InternalProgram.g:2215:50: (iv_ruleReception= ruleReception EOF )
            // InternalProgram.g:2216:2: iv_ruleReception= ruleReception EOF
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
    // InternalProgram.g:2222:1: ruleReception returns [EObject current=null] : (otherlv_0= 'Reception' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleReception() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_abstract_3_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:2228:2: ( (otherlv_0= 'Reception' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) )
            // InternalProgram.g:2229:2: (otherlv_0= 'Reception' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            {
            // InternalProgram.g:2229:2: (otherlv_0= 'Reception' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            // InternalProgram.g:2230:3: otherlv_0= 'Reception' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReceptionAccess().getReceptionKeyword_0());
            		
            // InternalProgram.g:2234:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:2235:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:2235:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:2236:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReceptionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalProgram.g:2253:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==31) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalProgram.g:2254:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getReceptionAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:2258:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:2259:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:2259:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:2260:6: lv_abstract_3_0= ruleEString
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
    // InternalProgram.g:2282:1: entryRuleClinic returns [EObject current=null] : iv_ruleClinic= ruleClinic EOF ;
    public final EObject entryRuleClinic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClinic = null;


        try {
            // InternalProgram.g:2282:47: (iv_ruleClinic= ruleClinic EOF )
            // InternalProgram.g:2283:2: iv_ruleClinic= ruleClinic EOF
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
    // InternalProgram.g:2289:1: ruleClinic returns [EObject current=null] : (otherlv_0= 'Clinic' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleClinic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_abstract_3_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:2295:2: ( (otherlv_0= 'Clinic' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) )
            // InternalProgram.g:2296:2: (otherlv_0= 'Clinic' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            {
            // InternalProgram.g:2296:2: (otherlv_0= 'Clinic' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            // InternalProgram.g:2297:3: otherlv_0= 'Clinic' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getClinicAccess().getClinicKeyword_0());
            		
            // InternalProgram.g:2301:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:2302:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:2302:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:2303:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClinicAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalProgram.g:2320:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==31) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalProgram.g:2321:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getClinicAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:2325:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:2326:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:2326:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:2327:6: lv_abstract_3_0= ruleEString
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
    // InternalProgram.g:2349:1: entryRuleLunch returns [EObject current=null] : iv_ruleLunch= ruleLunch EOF ;
    public final EObject entryRuleLunch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLunch = null;


        try {
            // InternalProgram.g:2349:46: (iv_ruleLunch= ruleLunch EOF )
            // InternalProgram.g:2350:2: iv_ruleLunch= ruleLunch EOF
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
    // InternalProgram.g:2356:1: ruleLunch returns [EObject current=null] : (otherlv_0= 'Lunch' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleLunch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_abstract_3_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:2362:2: ( (otherlv_0= 'Lunch' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) )
            // InternalProgram.g:2363:2: (otherlv_0= 'Lunch' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            {
            // InternalProgram.g:2363:2: (otherlv_0= 'Lunch' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            // InternalProgram.g:2364:3: otherlv_0= 'Lunch' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLunchAccess().getLunchKeyword_0());
            		
            // InternalProgram.g:2368:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:2369:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:2369:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:2370:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLunchAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalProgram.g:2387:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==31) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalProgram.g:2388:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getLunchAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:2392:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:2393:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:2393:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:2394:6: lv_abstract_3_0= ruleEString
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
    // InternalProgram.g:2416:1: entryRuleCoffeeBreak returns [EObject current=null] : iv_ruleCoffeeBreak= ruleCoffeeBreak EOF ;
    public final EObject entryRuleCoffeeBreak() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoffeeBreak = null;


        try {
            // InternalProgram.g:2416:52: (iv_ruleCoffeeBreak= ruleCoffeeBreak EOF )
            // InternalProgram.g:2417:2: iv_ruleCoffeeBreak= ruleCoffeeBreak EOF
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
    // InternalProgram.g:2423:1: ruleCoffeeBreak returns [EObject current=null] : (otherlv_0= 'CoffeeBreak' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleCoffeeBreak() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_abstract_3_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:2429:2: ( (otherlv_0= 'CoffeeBreak' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) )
            // InternalProgram.g:2430:2: (otherlv_0= 'CoffeeBreak' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            {
            // InternalProgram.g:2430:2: (otherlv_0= 'CoffeeBreak' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            // InternalProgram.g:2431:3: otherlv_0= 'CoffeeBreak' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCoffeeBreakAccess().getCoffeeBreakKeyword_0());
            		
            // InternalProgram.g:2435:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:2436:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:2436:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:2437:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCoffeeBreakAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalProgram.g:2454:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==31) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalProgram.g:2455:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getCoffeeBreakAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:2459:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:2460:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:2460:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:2461:6: lv_abstract_3_0= ruleEString
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


    // $ANTLR start "entryRuleMeeting"
    // InternalProgram.g:2483:1: entryRuleMeeting returns [EObject current=null] : iv_ruleMeeting= ruleMeeting EOF ;
    public final EObject entryRuleMeeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeeting = null;


        try {
            // InternalProgram.g:2483:48: (iv_ruleMeeting= ruleMeeting EOF )
            // InternalProgram.g:2484:2: iv_ruleMeeting= ruleMeeting EOF
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
    // InternalProgram.g:2490:1: ruleMeeting returns [EObject current=null] : (otherlv_0= 'Meeting' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleMeeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_abstract_3_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:2496:2: ( (otherlv_0= 'Meeting' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) )
            // InternalProgram.g:2497:2: (otherlv_0= 'Meeting' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            {
            // InternalProgram.g:2497:2: (otherlv_0= 'Meeting' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            // InternalProgram.g:2498:3: otherlv_0= 'Meeting' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMeetingAccess().getMeetingKeyword_0());
            		
            // InternalProgram.g:2502:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:2503:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:2503:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:2504:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeetingAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeetingRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:2521:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==31) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalProgram.g:2522:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getMeetingAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:2526:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:2527:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:2527:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:2528:6: lv_abstract_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeetingAccess().getAbstractEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_abstract_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeetingRule());
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
    // $ANTLR end "ruleMeeting"


    // $ANTLR start "entryRuleOpening"
    // InternalProgram.g:2550:1: entryRuleOpening returns [EObject current=null] : iv_ruleOpening= ruleOpening EOF ;
    public final EObject entryRuleOpening() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpening = null;


        try {
            // InternalProgram.g:2550:48: (iv_ruleOpening= ruleOpening EOF )
            // InternalProgram.g:2551:2: iv_ruleOpening= ruleOpening EOF
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
    // InternalProgram.g:2557:1: ruleOpening returns [EObject current=null] : (otherlv_0= 'Opening' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleOpening() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_abstract_3_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:2563:2: ( (otherlv_0= 'Opening' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) )
            // InternalProgram.g:2564:2: (otherlv_0= 'Opening' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            {
            // InternalProgram.g:2564:2: (otherlv_0= 'Opening' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            // InternalProgram.g:2565:3: otherlv_0= 'Opening' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOpeningAccess().getOpeningKeyword_0());
            		
            // InternalProgram.g:2569:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:2570:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:2570:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:2571:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOpeningAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOpeningRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:2588:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==31) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalProgram.g:2589:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getOpeningAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:2593:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:2594:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:2594:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:2595:6: lv_abstract_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOpeningAccess().getAbstractEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_abstract_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOpeningRule());
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
    // $ANTLR end "ruleOpening"


    // $ANTLR start "entryRulePaper"
    // InternalProgram.g:2617:1: entryRulePaper returns [EObject current=null] : iv_rulePaper= rulePaper EOF ;
    public final EObject entryRulePaper() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePaper = null;


        try {
            // InternalProgram.g:2617:46: (iv_rulePaper= rulePaper EOF )
            // InternalProgram.g:2618:2: iv_rulePaper= rulePaper EOF
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
    // InternalProgram.g:2624:1: rulePaper returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'authors' ( (lv_authors_3_0= rulePerson ) ) (otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) ) )* (otherlv_6= 'abstract' ( (lv_abstract_7_0= ruleEString ) ) )? (otherlv_8= 'preprint' ( (lv_preprint_9_0= ruleEString ) ) )? (otherlv_10= 'kind' ( ( ruleEString ) ) )? ) ;
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



        	enterRule();

        try {
            // InternalProgram.g:2630:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'authors' ( (lv_authors_3_0= rulePerson ) ) (otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) ) )* (otherlv_6= 'abstract' ( (lv_abstract_7_0= ruleEString ) ) )? (otherlv_8= 'preprint' ( (lv_preprint_9_0= ruleEString ) ) )? (otherlv_10= 'kind' ( ( ruleEString ) ) )? ) )
            // InternalProgram.g:2631:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'authors' ( (lv_authors_3_0= rulePerson ) ) (otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) ) )* (otherlv_6= 'abstract' ( (lv_abstract_7_0= ruleEString ) ) )? (otherlv_8= 'preprint' ( (lv_preprint_9_0= ruleEString ) ) )? (otherlv_10= 'kind' ( ( ruleEString ) ) )? )
            {
            // InternalProgram.g:2631:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'authors' ( (lv_authors_3_0= rulePerson ) ) (otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) ) )* (otherlv_6= 'abstract' ( (lv_abstract_7_0= ruleEString ) ) )? (otherlv_8= 'preprint' ( (lv_preprint_9_0= ruleEString ) ) )? (otherlv_10= 'kind' ( ( ruleEString ) ) )? )
            // InternalProgram.g:2632:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'authors' ( (lv_authors_3_0= rulePerson ) ) (otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) ) )* (otherlv_6= 'abstract' ( (lv_abstract_7_0= ruleEString ) ) )? (otherlv_8= 'preprint' ( (lv_preprint_9_0= ruleEString ) ) )? (otherlv_10= 'kind' ( ( ruleEString ) ) )?
            {
            // InternalProgram.g:2632:3: ()
            // InternalProgram.g:2633:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPaperAccess().getPaperAction_0(),
            					current);
            			

            }

            // InternalProgram.g:2639:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:2640:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:2640:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:2641:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPaperAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_38);
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

            otherlv_2=(Token)match(input,53,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getPaperAccess().getAuthorsKeyword_2());
            		
            // InternalProgram.g:2662:3: ( (lv_authors_3_0= rulePerson ) )
            // InternalProgram.g:2663:4: (lv_authors_3_0= rulePerson )
            {
            // InternalProgram.g:2663:4: (lv_authors_3_0= rulePerson )
            // InternalProgram.g:2664:5: lv_authors_3_0= rulePerson
            {

            					newCompositeNode(grammarAccess.getPaperAccess().getAuthorsPersonParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_39);
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

            // InternalProgram.g:2681:3: (otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==14) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalProgram.g:2682:4: otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getPaperAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalProgram.g:2686:4: ( (lv_authors_5_0= rulePerson ) )
            	    // InternalProgram.g:2687:5: (lv_authors_5_0= rulePerson )
            	    {
            	    // InternalProgram.g:2687:5: (lv_authors_5_0= rulePerson )
            	    // InternalProgram.g:2688:6: lv_authors_5_0= rulePerson
            	    {

            	    						newCompositeNode(grammarAccess.getPaperAccess().getAuthorsPersonParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_39);
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
            	    break loop53;
                }
            } while (true);

            // InternalProgram.g:2706:3: (otherlv_6= 'abstract' ( (lv_abstract_7_0= ruleEString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==31) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalProgram.g:2707:4: otherlv_6= 'abstract' ( (lv_abstract_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getPaperAccess().getAbstractKeyword_5_0());
                    			
                    // InternalProgram.g:2711:4: ( (lv_abstract_7_0= ruleEString ) )
                    // InternalProgram.g:2712:5: (lv_abstract_7_0= ruleEString )
                    {
                    // InternalProgram.g:2712:5: (lv_abstract_7_0= ruleEString )
                    // InternalProgram.g:2713:6: lv_abstract_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPaperAccess().getAbstractEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_40);
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

            // InternalProgram.g:2731:3: (otherlv_8= 'preprint' ( (lv_preprint_9_0= ruleEString ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==54) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalProgram.g:2732:4: otherlv_8= 'preprint' ( (lv_preprint_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,54,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getPaperAccess().getPreprintKeyword_6_0());
                    			
                    // InternalProgram.g:2736:4: ( (lv_preprint_9_0= ruleEString ) )
                    // InternalProgram.g:2737:5: (lv_preprint_9_0= ruleEString )
                    {
                    // InternalProgram.g:2737:5: (lv_preprint_9_0= ruleEString )
                    // InternalProgram.g:2738:6: lv_preprint_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPaperAccess().getPreprintEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_41);
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

            // InternalProgram.g:2756:3: (otherlv_10= 'kind' ( ( ruleEString ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==55) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalProgram.g:2757:4: otherlv_10= 'kind' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,55,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getPaperAccess().getKindKeyword_7_0());
                    			
                    // InternalProgram.g:2761:4: ( ( ruleEString ) )
                    // InternalProgram.g:2762:5: ( ruleEString )
                    {
                    // InternalProgram.g:2762:5: ( ruleEString )
                    // InternalProgram.g:2763:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPaperRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPaperAccess().getKindKindCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


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
    // InternalProgram.g:2782:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalProgram.g:2782:47: (iv_rulePerson= rulePerson EOF )
            // InternalProgram.g:2783:2: iv_rulePerson= rulePerson EOF
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
    // InternalProgram.g:2789:1: rulePerson returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'email' ( (lv_email_3_0= ruleEString ) ) )? (otherlv_4= 'homepage' ( (lv_homepage_5_0= ruleEString ) ) )? ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_email_3_0 = null;

        AntlrDatatypeRuleToken lv_homepage_5_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:2795:2: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'email' ( (lv_email_3_0= ruleEString ) ) )? (otherlv_4= 'homepage' ( (lv_homepage_5_0= ruleEString ) ) )? ) )
            // InternalProgram.g:2796:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'email' ( (lv_email_3_0= ruleEString ) ) )? (otherlv_4= 'homepage' ( (lv_homepage_5_0= ruleEString ) ) )? )
            {
            // InternalProgram.g:2796:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'email' ( (lv_email_3_0= ruleEString ) ) )? (otherlv_4= 'homepage' ( (lv_homepage_5_0= ruleEString ) ) )? )
            // InternalProgram.g:2797:3: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'email' ( (lv_email_3_0= ruleEString ) ) )? (otherlv_4= 'homepage' ( (lv_homepage_5_0= ruleEString ) ) )?
            {
            // InternalProgram.g:2797:3: ()
            // InternalProgram.g:2798:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPersonAccess().getPersonAction_0(),
            					current);
            			

            }

            // InternalProgram.g:2804:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:2805:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:2805:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:2806:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPersonAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_42);
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

            // InternalProgram.g:2823:3: (otherlv_2= 'email' ( (lv_email_3_0= ruleEString ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==56) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalProgram.g:2824:4: otherlv_2= 'email' ( (lv_email_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,56,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getPersonAccess().getEmailKeyword_2_0());
                    			
                    // InternalProgram.g:2828:4: ( (lv_email_3_0= ruleEString ) )
                    // InternalProgram.g:2829:5: (lv_email_3_0= ruleEString )
                    {
                    // InternalProgram.g:2829:5: (lv_email_3_0= ruleEString )
                    // InternalProgram.g:2830:6: lv_email_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getEmailEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_43);
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

            // InternalProgram.g:2848:3: (otherlv_4= 'homepage' ( (lv_homepage_5_0= ruleEString ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==57) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalProgram.g:2849:4: otherlv_4= 'homepage' ( (lv_homepage_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,57,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getPersonAccess().getHomepageKeyword_3_0());
                    			
                    // InternalProgram.g:2853:4: ( (lv_homepage_5_0= ruleEString ) )
                    // InternalProgram.g:2854:5: (lv_homepage_5_0= ruleEString )
                    {
                    // InternalProgram.g:2854:5: (lv_homepage_5_0= ruleEString )
                    // InternalProgram.g:2855:6: lv_homepage_5_0= ruleEString
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


    // $ANTLR start "entryRuleKind"
    // InternalProgram.g:2877:1: entryRuleKind returns [EObject current=null] : iv_ruleKind= ruleKind EOF ;
    public final EObject entryRuleKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKind = null;


        try {
            // InternalProgram.g:2877:45: (iv_ruleKind= ruleKind EOF )
            // InternalProgram.g:2878:2: iv_ruleKind= ruleKind EOF
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
    // InternalProgram.g:2884:1: ruleKind returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleKind() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:2890:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalProgram.g:2891:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalProgram.g:2891:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalProgram.g:2892:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalProgram.g:2892:3: ()
            // InternalProgram.g:2893:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKindAccess().getKindAction_0(),
            					current);
            			

            }

            // InternalProgram.g:2899:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:2900:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:2900:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:2901:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKindAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKindRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

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
    // InternalProgram.g:2922:1: ruleWeekDay returns [Enumerator current=null] : ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) ) ;
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
            // InternalProgram.g:2928:2: ( ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) ) )
            // InternalProgram.g:2929:2: ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) )
            {
            // InternalProgram.g:2929:2: ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) )
            int alt59=7;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt59=1;
                }
                break;
            case 59:
                {
                alt59=2;
                }
                break;
            case 60:
                {
                alt59=3;
                }
                break;
            case 61:
                {
                alt59=4;
                }
                break;
            case 62:
                {
                alt59=5;
                }
                break;
            case 63:
                {
                alt59=6;
                }
                break;
            case 64:
                {
                alt59=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalProgram.g:2930:3: (enumLiteral_0= 'Monday' )
                    {
                    // InternalProgram.g:2930:3: (enumLiteral_0= 'Monday' )
                    // InternalProgram.g:2931:4: enumLiteral_0= 'Monday'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getMondayEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWeekDayAccess().getMondayEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalProgram.g:2938:3: (enumLiteral_1= 'Tuesday' )
                    {
                    // InternalProgram.g:2938:3: (enumLiteral_1= 'Tuesday' )
                    // InternalProgram.g:2939:4: enumLiteral_1= 'Tuesday'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getTuesdayEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWeekDayAccess().getTuesdayEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalProgram.g:2946:3: (enumLiteral_2= 'Wednesday' )
                    {
                    // InternalProgram.g:2946:3: (enumLiteral_2= 'Wednesday' )
                    // InternalProgram.g:2947:4: enumLiteral_2= 'Wednesday'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getWednesdayEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWeekDayAccess().getWednesdayEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalProgram.g:2954:3: (enumLiteral_3= 'Thursday' )
                    {
                    // InternalProgram.g:2954:3: (enumLiteral_3= 'Thursday' )
                    // InternalProgram.g:2955:4: enumLiteral_3= 'Thursday'
                    {
                    enumLiteral_3=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getThursdayEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWeekDayAccess().getThursdayEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalProgram.g:2962:3: (enumLiteral_4= 'Friday' )
                    {
                    // InternalProgram.g:2962:3: (enumLiteral_4= 'Friday' )
                    // InternalProgram.g:2963:4: enumLiteral_4= 'Friday'
                    {
                    enumLiteral_4=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getFridayEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getWeekDayAccess().getFridayEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalProgram.g:2970:3: (enumLiteral_5= 'Saturday' )
                    {
                    // InternalProgram.g:2970:3: (enumLiteral_5= 'Saturday' )
                    // InternalProgram.g:2971:4: enumLiteral_5= 'Saturday'
                    {
                    enumLiteral_5=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getSaturdayEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getWeekDayAccess().getSaturdayEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalProgram.g:2978:3: (enumLiteral_6= 'Sunday' )
                    {
                    // InternalProgram.g:2978:3: (enumLiteral_6= 'Sunday' )
                    // InternalProgram.g:2979:4: enumLiteral_6= 'Sunday'
                    {
                    enumLiteral_6=(Token)match(input,64,FOLLOW_2); 

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
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x001FF1B920000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0xFC00000000080000L,0x0000000000000001L});
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
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000680000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400004002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004080000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000E0080000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000E0000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080080000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00C0000080004002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0200000000000002L});

}