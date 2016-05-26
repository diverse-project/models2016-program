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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'talk duration'", "'resources'", "'papers'", "'{'", "';'", "'}'", "'events'", "'program'", "'room'", "'capacity'", "'date'", "'.'", "':'", "'-'", "'in'", "','", "'TalkSession'", "'chair'", "'abstract'", "'Panel'", "'panelists'", "'moderators'", "'Workshop'", "'url'", "'name'", "'organizers'", "'Tutorial'", "'DoctoralSymposium'", "'EducatorSymposium'", "'Reception'", "'Clinic'", "'Lunch'", "'CoffeeBreak'", "'Meeting'", "'authors'", "'preprint'", "'kind'", "'email'", "'homepage'", "'Monday'", "'Tuesday'", "'Wednesday'", "'Thursday'", "'Friday'", "'Saturday'", "'Sunday'", "'Practice and Innovation'", "'Research'"
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
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
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
    // InternalProgram.g:72:1: ruleConference returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'talk duration' ( (lv_talkDuration_3_0= ruleEIntegerObject ) ) (otherlv_4= 'resources' ( (lv_resources_5_0= ruleResource ) ) ( (lv_resources_6_0= ruleResource ) )* )? (otherlv_7= 'papers' otherlv_8= '{' ( (lv_papers_9_0= rulePaper ) ) (otherlv_10= ';' ( (lv_papers_11_0= rulePaper ) ) )* otherlv_12= '}' )? (otherlv_13= 'events' otherlv_14= '{' ( (lv_events_15_0= ruleEvent ) ) (otherlv_16= ';' ( (lv_events_17_0= ruleEvent ) ) )* otherlv_18= '}' )? (otherlv_19= 'program' ( (lv_program_20_0= ruleProgram ) ) )? ) ;
    public final EObject ruleConference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_talkDuration_3_0 = null;

        EObject lv_resources_5_0 = null;

        EObject lv_resources_6_0 = null;

        EObject lv_papers_9_0 = null;

        EObject lv_papers_11_0 = null;

        EObject lv_events_15_0 = null;

        EObject lv_events_17_0 = null;

        EObject lv_program_20_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:78:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'talk duration' ( (lv_talkDuration_3_0= ruleEIntegerObject ) ) (otherlv_4= 'resources' ( (lv_resources_5_0= ruleResource ) ) ( (lv_resources_6_0= ruleResource ) )* )? (otherlv_7= 'papers' otherlv_8= '{' ( (lv_papers_9_0= rulePaper ) ) (otherlv_10= ';' ( (lv_papers_11_0= rulePaper ) ) )* otherlv_12= '}' )? (otherlv_13= 'events' otherlv_14= '{' ( (lv_events_15_0= ruleEvent ) ) (otherlv_16= ';' ( (lv_events_17_0= ruleEvent ) ) )* otherlv_18= '}' )? (otherlv_19= 'program' ( (lv_program_20_0= ruleProgram ) ) )? ) )
            // InternalProgram.g:79:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'talk duration' ( (lv_talkDuration_3_0= ruleEIntegerObject ) ) (otherlv_4= 'resources' ( (lv_resources_5_0= ruleResource ) ) ( (lv_resources_6_0= ruleResource ) )* )? (otherlv_7= 'papers' otherlv_8= '{' ( (lv_papers_9_0= rulePaper ) ) (otherlv_10= ';' ( (lv_papers_11_0= rulePaper ) ) )* otherlv_12= '}' )? (otherlv_13= 'events' otherlv_14= '{' ( (lv_events_15_0= ruleEvent ) ) (otherlv_16= ';' ( (lv_events_17_0= ruleEvent ) ) )* otherlv_18= '}' )? (otherlv_19= 'program' ( (lv_program_20_0= ruleProgram ) ) )? )
            {
            // InternalProgram.g:79:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'talk duration' ( (lv_talkDuration_3_0= ruleEIntegerObject ) ) (otherlv_4= 'resources' ( (lv_resources_5_0= ruleResource ) ) ( (lv_resources_6_0= ruleResource ) )* )? (otherlv_7= 'papers' otherlv_8= '{' ( (lv_papers_9_0= rulePaper ) ) (otherlv_10= ';' ( (lv_papers_11_0= rulePaper ) ) )* otherlv_12= '}' )? (otherlv_13= 'events' otherlv_14= '{' ( (lv_events_15_0= ruleEvent ) ) (otherlv_16= ';' ( (lv_events_17_0= ruleEvent ) ) )* otherlv_18= '}' )? (otherlv_19= 'program' ( (lv_program_20_0= ruleProgram ) ) )? )
            // InternalProgram.g:80:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'talk duration' ( (lv_talkDuration_3_0= ruleEIntegerObject ) ) (otherlv_4= 'resources' ( (lv_resources_5_0= ruleResource ) ) ( (lv_resources_6_0= ruleResource ) )* )? (otherlv_7= 'papers' otherlv_8= '{' ( (lv_papers_9_0= rulePaper ) ) (otherlv_10= ';' ( (lv_papers_11_0= rulePaper ) ) )* otherlv_12= '}' )? (otherlv_13= 'events' otherlv_14= '{' ( (lv_events_15_0= ruleEvent ) ) (otherlv_16= ';' ( (lv_events_17_0= ruleEvent ) ) )* otherlv_18= '}' )? (otherlv_19= 'program' ( (lv_program_20_0= ruleProgram ) ) )?
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

            otherlv_2=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getConferenceAccess().getTalkDurationKeyword_2());
            		
            // InternalProgram.g:110:3: ( (lv_talkDuration_3_0= ruleEIntegerObject ) )
            // InternalProgram.g:111:4: (lv_talkDuration_3_0= ruleEIntegerObject )
            {
            // InternalProgram.g:111:4: (lv_talkDuration_3_0= ruleEIntegerObject )
            // InternalProgram.g:112:5: lv_talkDuration_3_0= ruleEIntegerObject
            {

            					newCompositeNode(grammarAccess.getConferenceAccess().getTalkDurationEIntegerObjectParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_talkDuration_3_0=ruleEIntegerObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConferenceRule());
            					}
            					set(
            						current,
            						"talkDuration",
            						lv_talkDuration_3_0,
            						"fr.inria.diverse.models2016.dsl.Program.EIntegerObject");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:129:3: (otherlv_4= 'resources' ( (lv_resources_5_0= ruleResource ) ) ( (lv_resources_6_0= ruleResource ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalProgram.g:130:4: otherlv_4= 'resources' ( (lv_resources_5_0= ruleResource ) ) ( (lv_resources_6_0= ruleResource ) )*
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getConferenceAccess().getResourcesKeyword_4_0());
                    			
                    // InternalProgram.g:134:4: ( (lv_resources_5_0= ruleResource ) )
                    // InternalProgram.g:135:5: (lv_resources_5_0= ruleResource )
                    {
                    // InternalProgram.g:135:5: (lv_resources_5_0= ruleResource )
                    // InternalProgram.g:136:6: lv_resources_5_0= ruleResource
                    {

                    						newCompositeNode(grammarAccess.getConferenceAccess().getResourcesResourceParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_resources_5_0=ruleResource();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConferenceRule());
                    						}
                    						add(
                    							current,
                    							"resources",
                    							lv_resources_5_0,
                    							"fr.inria.diverse.models2016.dsl.Program.Resource");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:153:4: ( (lv_resources_6_0= ruleResource ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==19) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalProgram.g:154:5: (lv_resources_6_0= ruleResource )
                    	    {
                    	    // InternalProgram.g:154:5: (lv_resources_6_0= ruleResource )
                    	    // InternalProgram.g:155:6: lv_resources_6_0= ruleResource
                    	    {

                    	    						newCompositeNode(grammarAccess.getConferenceAccess().getResourcesResourceParserRuleCall_4_2_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_resources_6_0=ruleResource();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getConferenceRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"resources",
                    	    							lv_resources_6_0,
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

            // InternalProgram.g:173:3: (otherlv_7= 'papers' otherlv_8= '{' ( (lv_papers_9_0= rulePaper ) ) (otherlv_10= ';' ( (lv_papers_11_0= rulePaper ) ) )* otherlv_12= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalProgram.g:174:4: otherlv_7= 'papers' otherlv_8= '{' ( (lv_papers_9_0= rulePaper ) ) (otherlv_10= ';' ( (lv_papers_11_0= rulePaper ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getConferenceAccess().getPapersKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getConferenceAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalProgram.g:182:4: ( (lv_papers_9_0= rulePaper ) )
                    // InternalProgram.g:183:5: (lv_papers_9_0= rulePaper )
                    {
                    // InternalProgram.g:183:5: (lv_papers_9_0= rulePaper )
                    // InternalProgram.g:184:6: lv_papers_9_0= rulePaper
                    {

                    						newCompositeNode(grammarAccess.getConferenceAccess().getPapersPaperParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_10);
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

                    // InternalProgram.g:201:4: (otherlv_10= ';' ( (lv_papers_11_0= rulePaper ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalProgram.g:202:5: otherlv_10= ';' ( (lv_papers_11_0= rulePaper ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FOLLOW_9); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getConferenceAccess().getSemicolonKeyword_5_3_0());
                    	    				
                    	    // InternalProgram.g:206:5: ( (lv_papers_11_0= rulePaper ) )
                    	    // InternalProgram.g:207:6: (lv_papers_11_0= rulePaper )
                    	    {
                    	    // InternalProgram.g:207:6: (lv_papers_11_0= rulePaper )
                    	    // InternalProgram.g:208:7: lv_papers_11_0= rulePaper
                    	    {

                    	    							newCompositeNode(grammarAccess.getConferenceAccess().getPapersPaperParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_papers_11_0=rulePaper();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConferenceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"papers",
                    	    								lv_papers_11_0,
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

                    otherlv_12=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_12, grammarAccess.getConferenceAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalProgram.g:231:3: (otherlv_13= 'events' otherlv_14= '{' ( (lv_events_15_0= ruleEvent ) ) (otherlv_16= ';' ( (lv_events_17_0= ruleEvent ) ) )* otherlv_18= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalProgram.g:232:4: otherlv_13= 'events' otherlv_14= '{' ( (lv_events_15_0= ruleEvent ) ) (otherlv_16= ';' ( (lv_events_17_0= ruleEvent ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_13, grammarAccess.getConferenceAccess().getEventsKeyword_6_0());
                    			
                    otherlv_14=(Token)match(input,14,FOLLOW_12); 

                    				newLeafNode(otherlv_14, grammarAccess.getConferenceAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalProgram.g:240:4: ( (lv_events_15_0= ruleEvent ) )
                    // InternalProgram.g:241:5: (lv_events_15_0= ruleEvent )
                    {
                    // InternalProgram.g:241:5: (lv_events_15_0= ruleEvent )
                    // InternalProgram.g:242:6: lv_events_15_0= ruleEvent
                    {

                    						newCompositeNode(grammarAccess.getConferenceAccess().getEventsEventParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
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

                    // InternalProgram.g:259:4: (otherlv_16= ';' ( (lv_events_17_0= ruleEvent ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalProgram.g:260:5: otherlv_16= ';' ( (lv_events_17_0= ruleEvent ) )
                    	    {
                    	    otherlv_16=(Token)match(input,15,FOLLOW_12); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getConferenceAccess().getSemicolonKeyword_6_3_0());
                    	    				
                    	    // InternalProgram.g:264:5: ( (lv_events_17_0= ruleEvent ) )
                    	    // InternalProgram.g:265:6: (lv_events_17_0= ruleEvent )
                    	    {
                    	    // InternalProgram.g:265:6: (lv_events_17_0= ruleEvent )
                    	    // InternalProgram.g:266:7: lv_events_17_0= ruleEvent
                    	    {

                    	    							newCompositeNode(grammarAccess.getConferenceAccess().getEventsEventParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_events_17_0=ruleEvent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConferenceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"events",
                    	    								lv_events_17_0,
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

                    otherlv_18=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getConferenceAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalProgram.g:289:3: (otherlv_19= 'program' ( (lv_program_20_0= ruleProgram ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalProgram.g:290:4: otherlv_19= 'program' ( (lv_program_20_0= ruleProgram ) )
                    {
                    otherlv_19=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_19, grammarAccess.getConferenceAccess().getProgramKeyword_7_0());
                    			
                    // InternalProgram.g:294:4: ( (lv_program_20_0= ruleProgram ) )
                    // InternalProgram.g:295:5: (lv_program_20_0= ruleProgram )
                    {
                    // InternalProgram.g:295:5: (lv_program_20_0= ruleProgram )
                    // InternalProgram.g:296:6: lv_program_20_0= ruleProgram
                    {

                    						newCompositeNode(grammarAccess.getConferenceAccess().getProgramProgramParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_program_20_0=ruleProgram();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConferenceRule());
                    						}
                    						set(
                    							current,
                    							"program",
                    							lv_program_20_0,
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
    // InternalProgram.g:318:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalProgram.g:318:49: (iv_ruleResource= ruleResource EOF )
            // InternalProgram.g:319:2: iv_ruleResource= ruleResource EOF
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
    // InternalProgram.g:325:1: ruleResource returns [EObject current=null] : this_Room_0= ruleRoom ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        EObject this_Room_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:331:2: (this_Room_0= ruleRoom )
            // InternalProgram.g:332:2: this_Room_0= ruleRoom
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
    // InternalProgram.g:343:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalProgram.g:343:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalProgram.g:344:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalProgram.g:350:1: ruleEvent returns [EObject current=null] : (this_TalkSession_0= ruleTalkSession | this_Panel_1= rulePanel | this_Workshop_2= ruleWorkshop | this_Tutorial_3= ruleTutorial | this_DoctoralSymposium_4= ruleDoctoralSymposium | this_EducatorSymposium_5= ruleEducatorSymposium | this_Reception_6= ruleReception | this_Clinic_7= ruleClinic | this_Lunch_8= ruleLunch | this_CoffeeBreak_9= ruleCoffeeBreak | this_Meeting_10= ruleMeeting ) ;
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



        	enterRule();

        try {
            // InternalProgram.g:356:2: ( (this_TalkSession_0= ruleTalkSession | this_Panel_1= rulePanel | this_Workshop_2= ruleWorkshop | this_Tutorial_3= ruleTutorial | this_DoctoralSymposium_4= ruleDoctoralSymposium | this_EducatorSymposium_5= ruleEducatorSymposium | this_Reception_6= ruleReception | this_Clinic_7= ruleClinic | this_Lunch_8= ruleLunch | this_CoffeeBreak_9= ruleCoffeeBreak | this_Meeting_10= ruleMeeting ) )
            // InternalProgram.g:357:2: (this_TalkSession_0= ruleTalkSession | this_Panel_1= rulePanel | this_Workshop_2= ruleWorkshop | this_Tutorial_3= ruleTutorial | this_DoctoralSymposium_4= ruleDoctoralSymposium | this_EducatorSymposium_5= ruleEducatorSymposium | this_Reception_6= ruleReception | this_Clinic_7= ruleClinic | this_Lunch_8= ruleLunch | this_CoffeeBreak_9= ruleCoffeeBreak | this_Meeting_10= ruleMeeting )
            {
            // InternalProgram.g:357:2: (this_TalkSession_0= ruleTalkSession | this_Panel_1= rulePanel | this_Workshop_2= ruleWorkshop | this_Tutorial_3= ruleTutorial | this_DoctoralSymposium_4= ruleDoctoralSymposium | this_EducatorSymposium_5= ruleEducatorSymposium | this_Reception_6= ruleReception | this_Clinic_7= ruleClinic | this_Lunch_8= ruleLunch | this_CoffeeBreak_9= ruleCoffeeBreak | this_Meeting_10= ruleMeeting )
            int alt8=11;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt8=1;
                }
                break;
            case 30:
                {
                alt8=2;
                }
                break;
            case 33:
                {
                alt8=3;
                }
                break;
            case 37:
                {
                alt8=4;
                }
                break;
            case 38:
                {
                alt8=5;
                }
                break;
            case 39:
                {
                alt8=6;
                }
                break;
            case 40:
                {
                alt8=7;
                }
                break;
            case 41:
                {
                alt8=8;
                }
                break;
            case 42:
                {
                alt8=9;
                }
                break;
            case 43:
                {
                alt8=10;
                }
                break;
            case 44:
                {
                alt8=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalProgram.g:358:3: this_TalkSession_0= ruleTalkSession
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
                    // InternalProgram.g:367:3: this_Panel_1= rulePanel
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
                    // InternalProgram.g:376:3: this_Workshop_2= ruleWorkshop
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
                    // InternalProgram.g:385:3: this_Tutorial_3= ruleTutorial
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
                    // InternalProgram.g:394:3: this_DoctoralSymposium_4= ruleDoctoralSymposium
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
                    // InternalProgram.g:403:3: this_EducatorSymposium_5= ruleEducatorSymposium
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
                    // InternalProgram.g:412:3: this_Reception_6= ruleReception
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
                    // InternalProgram.g:421:3: this_Clinic_7= ruleClinic
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
                    // InternalProgram.g:430:3: this_Lunch_8= ruleLunch
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
                    // InternalProgram.g:439:3: this_CoffeeBreak_9= ruleCoffeeBreak
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
                    // InternalProgram.g:448:3: this_Meeting_10= ruleMeeting
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getMeetingParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_Meeting_10=ruleMeeting();

                    state._fsp--;


                    			current = this_Meeting_10;
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
    // InternalProgram.g:460:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalProgram.g:460:47: (iv_ruleEString= ruleEString EOF )
            // InternalProgram.g:461:2: iv_ruleEString= ruleEString EOF
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
    // InternalProgram.g:467:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalProgram.g:473:2: (this_STRING_0= RULE_STRING )
            // InternalProgram.g:474:2: this_STRING_0= RULE_STRING
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
    // InternalProgram.g:484:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalProgram.g:484:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalProgram.g:485:2: iv_ruleProgram= ruleProgram EOF
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
    // InternalProgram.g:491:1: ruleProgram returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )* )? otherlv_4= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_days_2_0 = null;

        EObject lv_days_3_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:497:2: ( ( () otherlv_1= '{' ( ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )* )? otherlv_4= '}' ) )
            // InternalProgram.g:498:2: ( () otherlv_1= '{' ( ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )* )? otherlv_4= '}' )
            {
            // InternalProgram.g:498:2: ( () otherlv_1= '{' ( ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )* )? otherlv_4= '}' )
            // InternalProgram.g:499:3: () otherlv_1= '{' ( ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )* )? otherlv_4= '}'
            {
            // InternalProgram.g:499:3: ()
            // InternalProgram.g:500:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProgramAccess().getProgramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalProgram.g:510:3: ( ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=50 && LA10_0<=56)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalProgram.g:511:4: ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )*
                    {
                    // InternalProgram.g:511:4: ( (lv_days_2_0= ruleDay ) )
                    // InternalProgram.g:512:5: (lv_days_2_0= ruleDay )
                    {
                    // InternalProgram.g:512:5: (lv_days_2_0= ruleDay )
                    // InternalProgram.g:513:6: lv_days_2_0= ruleDay
                    {

                    						newCompositeNode(grammarAccess.getProgramAccess().getDaysDayParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    // InternalProgram.g:530:4: ( (lv_days_3_0= ruleDay ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=50 && LA9_0<=56)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalProgram.g:531:5: (lv_days_3_0= ruleDay )
                    	    {
                    	    // InternalProgram.g:531:5: (lv_days_3_0= ruleDay )
                    	    // InternalProgram.g:532:6: lv_days_3_0= ruleDay
                    	    {

                    	    						newCompositeNode(grammarAccess.getProgramAccess().getDaysDayParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
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

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalProgram.g:558:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // InternalProgram.g:558:45: (iv_ruleRoom= ruleRoom EOF )
            // InternalProgram.g:559:2: iv_ruleRoom= ruleRoom EOF
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
    // InternalProgram.g:565:1: ruleRoom returns [EObject current=null] : ( () otherlv_1= 'room' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEIntegerObject ) ) )? ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_capacity_4_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:571:2: ( ( () otherlv_1= 'room' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEIntegerObject ) ) )? ) )
            // InternalProgram.g:572:2: ( () otherlv_1= 'room' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEIntegerObject ) ) )? )
            {
            // InternalProgram.g:572:2: ( () otherlv_1= 'room' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEIntegerObject ) ) )? )
            // InternalProgram.g:573:3: () otherlv_1= 'room' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEIntegerObject ) ) )?
            {
            // InternalProgram.g:573:3: ()
            // InternalProgram.g:574:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoomAccess().getRoomAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRoomAccess().getRoomKeyword_1());
            		
            // InternalProgram.g:584:3: ( (lv_name_2_0= ruleEString ) )
            // InternalProgram.g:585:4: (lv_name_2_0= ruleEString )
            {
            // InternalProgram.g:585:4: (lv_name_2_0= ruleEString )
            // InternalProgram.g:586:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoomAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
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

            // InternalProgram.g:603:3: (otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEIntegerObject ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalProgram.g:604:4: otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEIntegerObject ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getRoomAccess().getCapacityKeyword_3_0());
                    			
                    // InternalProgram.g:608:4: ( (lv_capacity_4_0= ruleEIntegerObject ) )
                    // InternalProgram.g:609:5: (lv_capacity_4_0= ruleEIntegerObject )
                    {
                    // InternalProgram.g:609:5: (lv_capacity_4_0= ruleEIntegerObject )
                    // InternalProgram.g:610:6: lv_capacity_4_0= ruleEIntegerObject
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
    // InternalProgram.g:632:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // InternalProgram.g:632:54: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // InternalProgram.g:633:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
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
    // InternalProgram.g:639:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalProgram.g:645:2: (this_INT_0= RULE_INT )
            // InternalProgram.g:646:2: this_INT_0= RULE_INT
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
    // InternalProgram.g:656:1: entryRuleDay returns [EObject current=null] : iv_ruleDay= ruleDay EOF ;
    public final EObject entryRuleDay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDay = null;


        try {
            // InternalProgram.g:656:44: (iv_ruleDay= ruleDay EOF )
            // InternalProgram.g:657:2: iv_ruleDay= ruleDay EOF
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
    // InternalProgram.g:663:1: ruleDay returns [EObject current=null] : ( ( (lv_weekday_0_0= ruleWeekDay ) ) (otherlv_1= 'date' ( (lv_date_2_0= ruleDayDataType ) ) )? ( ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )* )? ) ;
    public final EObject ruleDay() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_weekday_0_0 = null;

        AntlrDatatypeRuleToken lv_date_2_0 = null;

        EObject lv_sessions_3_0 = null;

        EObject lv_sessions_4_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:669:2: ( ( ( (lv_weekday_0_0= ruleWeekDay ) ) (otherlv_1= 'date' ( (lv_date_2_0= ruleDayDataType ) ) )? ( ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )* )? ) )
            // InternalProgram.g:670:2: ( ( (lv_weekday_0_0= ruleWeekDay ) ) (otherlv_1= 'date' ( (lv_date_2_0= ruleDayDataType ) ) )? ( ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )* )? )
            {
            // InternalProgram.g:670:2: ( ( (lv_weekday_0_0= ruleWeekDay ) ) (otherlv_1= 'date' ( (lv_date_2_0= ruleDayDataType ) ) )? ( ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )* )? )
            // InternalProgram.g:671:3: ( (lv_weekday_0_0= ruleWeekDay ) ) (otherlv_1= 'date' ( (lv_date_2_0= ruleDayDataType ) ) )? ( ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )* )?
            {
            // InternalProgram.g:671:3: ( (lv_weekday_0_0= ruleWeekDay ) )
            // InternalProgram.g:672:4: (lv_weekday_0_0= ruleWeekDay )
            {
            // InternalProgram.g:672:4: (lv_weekday_0_0= ruleWeekDay )
            // InternalProgram.g:673:5: lv_weekday_0_0= ruleWeekDay
            {

            					newCompositeNode(grammarAccess.getDayAccess().getWeekdayWeekDayEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
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

            // InternalProgram.g:690:3: (otherlv_1= 'date' ( (lv_date_2_0= ruleDayDataType ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalProgram.g:691:4: otherlv_1= 'date' ( (lv_date_2_0= ruleDayDataType ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getDayAccess().getDateKeyword_1_0());
                    			
                    // InternalProgram.g:695:4: ( (lv_date_2_0= ruleDayDataType ) )
                    // InternalProgram.g:696:5: (lv_date_2_0= ruleDayDataType )
                    {
                    // InternalProgram.g:696:5: (lv_date_2_0= ruleDayDataType )
                    // InternalProgram.g:697:6: lv_date_2_0= ruleDayDataType
                    {

                    						newCompositeNode(grammarAccess.getDayAccess().getDateDayDataTypeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_17);
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

            // InternalProgram.g:715:3: ( ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalProgram.g:716:4: ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )*
                    {
                    // InternalProgram.g:716:4: ( (lv_sessions_3_0= ruleSession ) )
                    // InternalProgram.g:717:5: (lv_sessions_3_0= ruleSession )
                    {
                    // InternalProgram.g:717:5: (lv_sessions_3_0= ruleSession )
                    // InternalProgram.g:718:6: lv_sessions_3_0= ruleSession
                    {

                    						newCompositeNode(grammarAccess.getDayAccess().getSessionsSessionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_17);
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

                    // InternalProgram.g:735:4: ( (lv_sessions_4_0= ruleSession ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_INT) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalProgram.g:736:5: (lv_sessions_4_0= ruleSession )
                    	    {
                    	    // InternalProgram.g:736:5: (lv_sessions_4_0= ruleSession )
                    	    // InternalProgram.g:737:6: lv_sessions_4_0= ruleSession
                    	    {

                    	    						newCompositeNode(grammarAccess.getDayAccess().getSessionsSessionParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
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
    // InternalProgram.g:759:1: entryRuleDayDataType returns [String current=null] : iv_ruleDayDataType= ruleDayDataType EOF ;
    public final String entryRuleDayDataType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDayDataType = null;


        try {
            // InternalProgram.g:759:51: (iv_ruleDayDataType= ruleDayDataType EOF )
            // InternalProgram.g:760:2: iv_ruleDayDataType= ruleDayDataType EOF
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
    // InternalProgram.g:766:1: ruleDayDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDayDataType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalProgram.g:772:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) )
            // InternalProgram.g:773:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
            {
            // InternalProgram.g:773:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
            // InternalProgram.g:774:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDayDataTypeAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,22,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDayDataTypeAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_18); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDayDataTypeAccess().getINTTerminalRuleCall_2());
            		
            kw=(Token)match(input,22,FOLLOW_4); 

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
    // InternalProgram.g:809:1: entryRuleHourDataType returns [String current=null] : iv_ruleHourDataType= ruleHourDataType EOF ;
    public final String entryRuleHourDataType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHourDataType = null;


        try {
            // InternalProgram.g:809:52: (iv_ruleHourDataType= ruleHourDataType EOF )
            // InternalProgram.g:810:2: iv_ruleHourDataType= ruleHourDataType EOF
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
    // InternalProgram.g:816:1: ruleHourDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= ':' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleHourDataType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalProgram.g:822:2: ( (this_INT_0= RULE_INT kw= ':' this_INT_2= RULE_INT ) )
            // InternalProgram.g:823:2: (this_INT_0= RULE_INT kw= ':' this_INT_2= RULE_INT )
            {
            // InternalProgram.g:823:2: (this_INT_0= RULE_INT kw= ':' this_INT_2= RULE_INT )
            // InternalProgram.g:824:3: this_INT_0= RULE_INT kw= ':' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getHourDataTypeAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,23,FOLLOW_4); 

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
    // InternalProgram.g:847:1: entryRuleSession returns [EObject current=null] : iv_ruleSession= ruleSession EOF ;
    public final EObject entryRuleSession() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSession = null;


        try {
            // InternalProgram.g:847:48: (iv_ruleSession= ruleSession EOF )
            // InternalProgram.g:848:2: iv_ruleSession= ruleSession EOF
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
    // InternalProgram.g:854:1: ruleSession returns [EObject current=null] : ( () ( (lv_startingTime_1_0= ruleHourDataType ) ) otherlv_2= '-' ( (lv_endingTime_3_0= ruleHourDataType ) ) otherlv_4= 'in' ( ( ruleEString ) ) otherlv_6= ':' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ;
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
            // InternalProgram.g:860:2: ( ( () ( (lv_startingTime_1_0= ruleHourDataType ) ) otherlv_2= '-' ( (lv_endingTime_3_0= ruleHourDataType ) ) otherlv_4= 'in' ( ( ruleEString ) ) otherlv_6= ':' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) )
            // InternalProgram.g:861:2: ( () ( (lv_startingTime_1_0= ruleHourDataType ) ) otherlv_2= '-' ( (lv_endingTime_3_0= ruleHourDataType ) ) otherlv_4= 'in' ( ( ruleEString ) ) otherlv_6= ':' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )
            {
            // InternalProgram.g:861:2: ( () ( (lv_startingTime_1_0= ruleHourDataType ) ) otherlv_2= '-' ( (lv_endingTime_3_0= ruleHourDataType ) ) otherlv_4= 'in' ( ( ruleEString ) ) otherlv_6= ':' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )
            // InternalProgram.g:862:3: () ( (lv_startingTime_1_0= ruleHourDataType ) ) otherlv_2= '-' ( (lv_endingTime_3_0= ruleHourDataType ) ) otherlv_4= 'in' ( ( ruleEString ) ) otherlv_6= ':' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )*
            {
            // InternalProgram.g:862:3: ()
            // InternalProgram.g:863:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSessionAccess().getSessionAction_0(),
            					current);
            			

            }

            // InternalProgram.g:869:3: ( (lv_startingTime_1_0= ruleHourDataType ) )
            // InternalProgram.g:870:4: (lv_startingTime_1_0= ruleHourDataType )
            {
            // InternalProgram.g:870:4: (lv_startingTime_1_0= ruleHourDataType )
            // InternalProgram.g:871:5: lv_startingTime_1_0= ruleHourDataType
            {

            					newCompositeNode(grammarAccess.getSessionAccess().getStartingTimeHourDataTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_2=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSessionAccess().getHyphenMinusKeyword_2());
            		
            // InternalProgram.g:892:3: ( (lv_endingTime_3_0= ruleHourDataType ) )
            // InternalProgram.g:893:4: (lv_endingTime_3_0= ruleHourDataType )
            {
            // InternalProgram.g:893:4: (lv_endingTime_3_0= ruleHourDataType )
            // InternalProgram.g:894:5: lv_endingTime_3_0= ruleHourDataType
            {

            					newCompositeNode(grammarAccess.getSessionAccess().getEndingTimeHourDataTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_4=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getSessionAccess().getInKeyword_4());
            		
            // InternalProgram.g:915:3: ( ( ruleEString ) )
            // InternalProgram.g:916:4: ( ruleEString )
            {
            // InternalProgram.g:916:4: ( ruleEString )
            // InternalProgram.g:917:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSessionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSessionAccess().getRoomRoomCrossReference_5_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getSessionAccess().getColonKeyword_6());
            		
            // InternalProgram.g:935:3: ( ( ruleEString ) )
            // InternalProgram.g:936:4: ( ruleEString )
            {
            // InternalProgram.g:936:4: ( ruleEString )
            // InternalProgram.g:937:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSessionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSessionAccess().getEventsEventCrossReference_7_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:951:3: (otherlv_8= ',' ( ( ruleEString ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalProgram.g:952:4: otherlv_8= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,26,FOLLOW_9); 

            	    				newLeafNode(otherlv_8, grammarAccess.getSessionAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalProgram.g:956:4: ( ( ruleEString ) )
            	    // InternalProgram.g:957:5: ( ruleEString )
            	    {
            	    // InternalProgram.g:957:5: ( ruleEString )
            	    // InternalProgram.g:958:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSessionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getSessionAccess().getEventsEventCrossReference_8_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
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
    // InternalProgram.g:977:1: entryRuleTalkSession returns [EObject current=null] : iv_ruleTalkSession= ruleTalkSession EOF ;
    public final EObject entryRuleTalkSession() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTalkSession = null;


        try {
            // InternalProgram.g:977:52: (iv_ruleTalkSession= ruleTalkSession EOF )
            // InternalProgram.g:978:2: iv_ruleTalkSession= ruleTalkSession EOF
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
    // InternalProgram.g:984:1: ruleTalkSession returns [EObject current=null] : (otherlv_0= 'TalkSession' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) ) )? (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'papers' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? ) ;
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
            // InternalProgram.g:990:2: ( (otherlv_0= 'TalkSession' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) ) )? (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'papers' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? ) )
            // InternalProgram.g:991:2: (otherlv_0= 'TalkSession' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) ) )? (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'papers' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? )
            {
            // InternalProgram.g:991:2: (otherlv_0= 'TalkSession' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) ) )? (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'papers' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? )
            // InternalProgram.g:992:3: otherlv_0= 'TalkSession' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) ) )? (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'papers' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTalkSessionAccess().getTalkSessionKeyword_0());
            		
            // InternalProgram.g:996:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:997:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:997:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:998:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTalkSessionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
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

            // InternalProgram.g:1015:3: (otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalProgram.g:1016:4: otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getTalkSessionAccess().getChairKeyword_2_0());
                    			
                    // InternalProgram.g:1020:4: ( (lv_chair_3_0= rulePerson ) )
                    // InternalProgram.g:1021:5: (lv_chair_3_0= rulePerson )
                    {
                    // InternalProgram.g:1021:5: (lv_chair_3_0= rulePerson )
                    // InternalProgram.g:1022:6: lv_chair_3_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getTalkSessionAccess().getChairPersonParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_24);
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

            // InternalProgram.g:1040:3: (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalProgram.g:1041:4: otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getTalkSessionAccess().getAbstractKeyword_3_0());
                    			
                    // InternalProgram.g:1045:4: ( (lv_abstract_5_0= ruleEString ) )
                    // InternalProgram.g:1046:5: (lv_abstract_5_0= ruleEString )
                    {
                    // InternalProgram.g:1046:5: (lv_abstract_5_0= ruleEString )
                    // InternalProgram.g:1047:6: lv_abstract_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTalkSessionAccess().getAbstractEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_25);
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

            // InternalProgram.g:1065:3: (otherlv_6= 'papers' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==13) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalProgram.g:1066:4: otherlv_6= 'papers' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getTalkSessionAccess().getPapersKeyword_4_0());
                    			
                    // InternalProgram.g:1070:4: ( ( ruleEString ) )
                    // InternalProgram.g:1071:5: ( ruleEString )
                    {
                    // InternalProgram.g:1071:5: ( ruleEString )
                    // InternalProgram.g:1072:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTalkSessionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTalkSessionAccess().getPapersPaperCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProgram.g:1086:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==26) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalProgram.g:1087:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,26,FOLLOW_9); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getTalkSessionAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalProgram.g:1091:5: ( ( ruleEString ) )
                    	    // InternalProgram.g:1092:6: ( ruleEString )
                    	    {
                    	    // InternalProgram.g:1092:6: ( ruleEString )
                    	    // InternalProgram.g:1093:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTalkSessionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTalkSessionAccess().getPapersPaperCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
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
    // InternalProgram.g:1113:1: entryRulePanel returns [EObject current=null] : iv_rulePanel= rulePanel EOF ;
    public final EObject entryRulePanel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePanel = null;


        try {
            // InternalProgram.g:1113:46: (iv_rulePanel= rulePanel EOF )
            // InternalProgram.g:1114:2: iv_rulePanel= rulePanel EOF
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
    // InternalProgram.g:1120:1: rulePanel returns [EObject current=null] : (otherlv_0= 'Panel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )* )? (otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )* )? ) ;
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
            // InternalProgram.g:1126:2: ( (otherlv_0= 'Panel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )* )? (otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )* )? ) )
            // InternalProgram.g:1127:2: (otherlv_0= 'Panel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )* )? (otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )* )? )
            {
            // InternalProgram.g:1127:2: (otherlv_0= 'Panel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )* )? (otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )* )? )
            // InternalProgram.g:1128:3: otherlv_0= 'Panel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )* )? (otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )* )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPanelAccess().getPanelKeyword_0());
            		
            // InternalProgram.g:1132:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1133:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1133:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1134:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPanelAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
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

            // InternalProgram.g:1151:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalProgram.g:1152:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getPanelAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1156:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:1157:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:1157:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:1158:6: lv_abstract_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPanelAccess().getAbstractEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_27);
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

            // InternalProgram.g:1176:3: (otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalProgram.g:1177:4: otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )*
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getPanelAccess().getPanelistsKeyword_3_0());
                    			
                    // InternalProgram.g:1181:4: ( (lv_panelists_5_0= rulePerson ) )
                    // InternalProgram.g:1182:5: (lv_panelists_5_0= rulePerson )
                    {
                    // InternalProgram.g:1182:5: (lv_panelists_5_0= rulePerson )
                    // InternalProgram.g:1183:6: lv_panelists_5_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getPanelAccess().getPanelistsPersonParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    // InternalProgram.g:1200:4: (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==26) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalProgram.g:1201:5: otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) )
                    	    {
                    	    otherlv_6=(Token)match(input,26,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPanelAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalProgram.g:1205:5: ( (lv_panelists_7_0= rulePerson ) )
                    	    // InternalProgram.g:1206:6: (lv_panelists_7_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:1206:6: (lv_panelists_7_0= rulePerson )
                    	    // InternalProgram.g:1207:7: lv_panelists_7_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getPanelAccess().getPanelistsPersonParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_28);
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

            // InternalProgram.g:1226:3: (otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalProgram.g:1227:4: otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )*
                    {
                    otherlv_8=(Token)match(input,32,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getPanelAccess().getModeratorsKeyword_4_0());
                    			
                    // InternalProgram.g:1231:4: ( (lv_moderators_9_0= rulePerson ) )
                    // InternalProgram.g:1232:5: (lv_moderators_9_0= rulePerson )
                    {
                    // InternalProgram.g:1232:5: (lv_moderators_9_0= rulePerson )
                    // InternalProgram.g:1233:6: lv_moderators_9_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getPanelAccess().getModeratorsPersonParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_22);
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

                    // InternalProgram.g:1250:4: (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==26) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalProgram.g:1251:5: otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) )
                    	    {
                    	    otherlv_10=(Token)match(input,26,FOLLOW_9); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getPanelAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalProgram.g:1255:5: ( (lv_moderators_11_0= rulePerson ) )
                    	    // InternalProgram.g:1256:6: (lv_moderators_11_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:1256:6: (lv_moderators_11_0= rulePerson )
                    	    // InternalProgram.g:1257:7: lv_moderators_11_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getPanelAccess().getModeratorsPersonParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
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
    // InternalProgram.g:1280:1: entryRuleWorkshop returns [EObject current=null] : iv_ruleWorkshop= ruleWorkshop EOF ;
    public final EObject entryRuleWorkshop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkshop = null;


        try {
            // InternalProgram.g:1280:49: (iv_ruleWorkshop= ruleWorkshop EOF )
            // InternalProgram.g:1281:2: iv_ruleWorkshop= ruleWorkshop EOF
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
    // InternalProgram.g:1287:1: ruleWorkshop returns [EObject current=null] : (otherlv_0= 'Workshop' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) )? (otherlv_6= 'name' ( (lv_fullName_7_0= ruleEString ) ) )? (otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )* )? ) ;
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
            // InternalProgram.g:1293:2: ( (otherlv_0= 'Workshop' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) )? (otherlv_6= 'name' ( (lv_fullName_7_0= ruleEString ) ) )? (otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )* )? ) )
            // InternalProgram.g:1294:2: (otherlv_0= 'Workshop' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) )? (otherlv_6= 'name' ( (lv_fullName_7_0= ruleEString ) ) )? (otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )* )? )
            {
            // InternalProgram.g:1294:2: (otherlv_0= 'Workshop' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) )? (otherlv_6= 'name' ( (lv_fullName_7_0= ruleEString ) ) )? (otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )* )? )
            // InternalProgram.g:1295:3: otherlv_0= 'Workshop' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) )? (otherlv_6= 'name' ( (lv_fullName_7_0= ruleEString ) ) )? (otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )* )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkshopAccess().getWorkshopKeyword_0());
            		
            // InternalProgram.g:1299:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1300:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1300:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1301:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWorkshopAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
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

            // InternalProgram.g:1318:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalProgram.g:1319:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getWorkshopAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1323:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:1324:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:1324:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:1325:6: lv_abstract_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getWorkshopAccess().getAbstractEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_30);
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

            // InternalProgram.g:1343:3: (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==34) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalProgram.g:1344:4: otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getWorkshopAccess().getUrlKeyword_3_0());
                    			
                    // InternalProgram.g:1348:4: ( (lv_url_5_0= ruleEString ) )
                    // InternalProgram.g:1349:5: (lv_url_5_0= ruleEString )
                    {
                    // InternalProgram.g:1349:5: (lv_url_5_0= ruleEString )
                    // InternalProgram.g:1350:6: lv_url_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getWorkshopAccess().getUrlEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_31);
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

            // InternalProgram.g:1368:3: (otherlv_6= 'name' ( (lv_fullName_7_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalProgram.g:1369:4: otherlv_6= 'name' ( (lv_fullName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getWorkshopAccess().getNameKeyword_4_0());
                    			
                    // InternalProgram.g:1373:4: ( (lv_fullName_7_0= ruleEString ) )
                    // InternalProgram.g:1374:5: (lv_fullName_7_0= ruleEString )
                    {
                    // InternalProgram.g:1374:5: (lv_fullName_7_0= ruleEString )
                    // InternalProgram.g:1375:6: lv_fullName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getWorkshopAccess().getFullNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_32);
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

            // InternalProgram.g:1393:3: (otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalProgram.g:1394:4: otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )*
                    {
                    otherlv_8=(Token)match(input,36,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getWorkshopAccess().getOrganizersKeyword_5_0());
                    			
                    // InternalProgram.g:1398:4: ( (lv_organizers_9_0= rulePerson ) )
                    // InternalProgram.g:1399:5: (lv_organizers_9_0= rulePerson )
                    {
                    // InternalProgram.g:1399:5: (lv_organizers_9_0= rulePerson )
                    // InternalProgram.g:1400:6: lv_organizers_9_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getWorkshopAccess().getOrganizersPersonParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_22);
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

                    // InternalProgram.g:1417:4: (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==26) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalProgram.g:1418:5: otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) )
                    	    {
                    	    otherlv_10=(Token)match(input,26,FOLLOW_9); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getWorkshopAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalProgram.g:1422:5: ( (lv_organizers_11_0= rulePerson ) )
                    	    // InternalProgram.g:1423:6: (lv_organizers_11_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:1423:6: (lv_organizers_11_0= rulePerson )
                    	    // InternalProgram.g:1424:7: lv_organizers_11_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getWorkshopAccess().getOrganizersPersonParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
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
    // InternalProgram.g:1447:1: entryRuleTutorial returns [EObject current=null] : iv_ruleTutorial= ruleTutorial EOF ;
    public final EObject entryRuleTutorial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTutorial = null;


        try {
            // InternalProgram.g:1447:49: (iv_ruleTutorial= ruleTutorial EOF )
            // InternalProgram.g:1448:2: iv_ruleTutorial= ruleTutorial EOF
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
    // InternalProgram.g:1454:1: ruleTutorial returns [EObject current=null] : (otherlv_0= 'Tutorial' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? ) ;
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
            // InternalProgram.g:1460:2: ( (otherlv_0= 'Tutorial' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? ) )
            // InternalProgram.g:1461:2: (otherlv_0= 'Tutorial' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? )
            {
            // InternalProgram.g:1461:2: (otherlv_0= 'Tutorial' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? )
            // InternalProgram.g:1462:3: otherlv_0= 'Tutorial' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTutorialAccess().getTutorialKeyword_0());
            		
            // InternalProgram.g:1466:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1467:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1467:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1468:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTutorialAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
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

            // InternalProgram.g:1485:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==29) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalProgram.g:1486:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getTutorialAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1490:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:1491:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:1491:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:1492:6: lv_abstract_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTutorialAccess().getAbstractEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_32);
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

            // InternalProgram.g:1510:3: (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==36) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalProgram.g:1511:4: otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )*
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getTutorialAccess().getOrganizersKeyword_3_0());
                    			
                    // InternalProgram.g:1515:4: ( (lv_organizers_5_0= rulePerson ) )
                    // InternalProgram.g:1516:5: (lv_organizers_5_0= rulePerson )
                    {
                    // InternalProgram.g:1516:5: (lv_organizers_5_0= rulePerson )
                    // InternalProgram.g:1517:6: lv_organizers_5_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getTutorialAccess().getOrganizersPersonParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_22);
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

                    // InternalProgram.g:1534:4: (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==26) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalProgram.g:1535:5: otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) )
                    	    {
                    	    otherlv_6=(Token)match(input,26,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getTutorialAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalProgram.g:1539:5: ( (lv_organizers_7_0= rulePerson ) )
                    	    // InternalProgram.g:1540:6: (lv_organizers_7_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:1540:6: (lv_organizers_7_0= rulePerson )
                    	    // InternalProgram.g:1541:7: lv_organizers_7_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getTutorialAccess().getOrganizersPersonParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
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
                    	    break loop31;
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
    // InternalProgram.g:1564:1: entryRuleDoctoralSymposium returns [EObject current=null] : iv_ruleDoctoralSymposium= ruleDoctoralSymposium EOF ;
    public final EObject entryRuleDoctoralSymposium() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoctoralSymposium = null;


        try {
            // InternalProgram.g:1564:58: (iv_ruleDoctoralSymposium= ruleDoctoralSymposium EOF )
            // InternalProgram.g:1565:2: iv_ruleDoctoralSymposium= ruleDoctoralSymposium EOF
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
    // InternalProgram.g:1571:1: ruleDoctoralSymposium returns [EObject current=null] : (otherlv_0= 'DoctoralSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? ) ;
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
            // InternalProgram.g:1577:2: ( (otherlv_0= 'DoctoralSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? ) )
            // InternalProgram.g:1578:2: (otherlv_0= 'DoctoralSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? )
            {
            // InternalProgram.g:1578:2: (otherlv_0= 'DoctoralSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? )
            // InternalProgram.g:1579:3: otherlv_0= 'DoctoralSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDoctoralSymposiumAccess().getDoctoralSymposiumKeyword_0());
            		
            // InternalProgram.g:1583:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1584:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1584:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1585:5: lv_name_1_0= ruleEString
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

            // InternalProgram.g:1602:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==29) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalProgram.g:1603:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getDoctoralSymposiumAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1607:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:1608:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:1608:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:1609:6: lv_abstract_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDoctoralSymposiumAccess().getAbstractEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_32);
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

            // InternalProgram.g:1627:3: (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==36) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalProgram.g:1628:4: otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )*
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getDoctoralSymposiumAccess().getOrganizersKeyword_3_0());
                    			
                    // InternalProgram.g:1632:4: ( (lv_organizers_5_0= rulePerson ) )
                    // InternalProgram.g:1633:5: (lv_organizers_5_0= rulePerson )
                    {
                    // InternalProgram.g:1633:5: (lv_organizers_5_0= rulePerson )
                    // InternalProgram.g:1634:6: lv_organizers_5_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getDoctoralSymposiumAccess().getOrganizersPersonParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_22);
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

                    // InternalProgram.g:1651:4: (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==26) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalProgram.g:1652:5: otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) )
                    	    {
                    	    otherlv_6=(Token)match(input,26,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getDoctoralSymposiumAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalProgram.g:1656:5: ( (lv_organizers_7_0= rulePerson ) )
                    	    // InternalProgram.g:1657:6: (lv_organizers_7_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:1657:6: (lv_organizers_7_0= rulePerson )
                    	    // InternalProgram.g:1658:7: lv_organizers_7_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getDoctoralSymposiumAccess().getOrganizersPersonParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
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
                    	    break loop34;
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
    // InternalProgram.g:1681:1: entryRuleEducatorSymposium returns [EObject current=null] : iv_ruleEducatorSymposium= ruleEducatorSymposium EOF ;
    public final EObject entryRuleEducatorSymposium() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEducatorSymposium = null;


        try {
            // InternalProgram.g:1681:58: (iv_ruleEducatorSymposium= ruleEducatorSymposium EOF )
            // InternalProgram.g:1682:2: iv_ruleEducatorSymposium= ruleEducatorSymposium EOF
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
    // InternalProgram.g:1688:1: ruleEducatorSymposium returns [EObject current=null] : (otherlv_0= 'EducatorSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? ) ;
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
            // InternalProgram.g:1694:2: ( (otherlv_0= 'EducatorSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? ) )
            // InternalProgram.g:1695:2: (otherlv_0= 'EducatorSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? )
            {
            // InternalProgram.g:1695:2: (otherlv_0= 'EducatorSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? )
            // InternalProgram.g:1696:3: otherlv_0= 'EducatorSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getEducatorSymposiumAccess().getEducatorSymposiumKeyword_0());
            		
            // InternalProgram.g:1700:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1701:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1701:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1702:5: lv_name_1_0= ruleEString
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

            // InternalProgram.g:1719:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==29) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalProgram.g:1720:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getEducatorSymposiumAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1724:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:1725:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:1725:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:1726:6: lv_abstract_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEducatorSymposiumAccess().getAbstractEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_32);
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

            // InternalProgram.g:1744:3: (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==36) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalProgram.g:1745:4: otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )*
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getEducatorSymposiumAccess().getOrganizersKeyword_3_0());
                    			
                    // InternalProgram.g:1749:4: ( (lv_organizers_5_0= rulePerson ) )
                    // InternalProgram.g:1750:5: (lv_organizers_5_0= rulePerson )
                    {
                    // InternalProgram.g:1750:5: (lv_organizers_5_0= rulePerson )
                    // InternalProgram.g:1751:6: lv_organizers_5_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getEducatorSymposiumAccess().getOrganizersPersonParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_22);
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

                    // InternalProgram.g:1768:4: (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==26) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalProgram.g:1769:5: otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) )
                    	    {
                    	    otherlv_6=(Token)match(input,26,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getEducatorSymposiumAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalProgram.g:1773:5: ( (lv_organizers_7_0= rulePerson ) )
                    	    // InternalProgram.g:1774:6: (lv_organizers_7_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:1774:6: (lv_organizers_7_0= rulePerson )
                    	    // InternalProgram.g:1775:7: lv_organizers_7_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getEducatorSymposiumAccess().getOrganizersPersonParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
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
                    	    break loop37;
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
    // InternalProgram.g:1798:1: entryRuleReception returns [EObject current=null] : iv_ruleReception= ruleReception EOF ;
    public final EObject entryRuleReception() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReception = null;


        try {
            // InternalProgram.g:1798:50: (iv_ruleReception= ruleReception EOF )
            // InternalProgram.g:1799:2: iv_ruleReception= ruleReception EOF
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
    // InternalProgram.g:1805:1: ruleReception returns [EObject current=null] : (otherlv_0= 'Reception' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleReception() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_abstract_3_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:1811:2: ( (otherlv_0= 'Reception' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) )
            // InternalProgram.g:1812:2: (otherlv_0= 'Reception' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            {
            // InternalProgram.g:1812:2: (otherlv_0= 'Reception' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            // InternalProgram.g:1813:3: otherlv_0= 'Reception' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,40,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReceptionAccess().getReceptionKeyword_0());
            		
            // InternalProgram.g:1817:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1818:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1818:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1819:5: lv_name_1_0= ruleEString
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

            // InternalProgram.g:1836:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==29) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalProgram.g:1837:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getReceptionAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1841:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:1842:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:1842:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:1843:6: lv_abstract_3_0= ruleEString
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
    // InternalProgram.g:1865:1: entryRuleClinic returns [EObject current=null] : iv_ruleClinic= ruleClinic EOF ;
    public final EObject entryRuleClinic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClinic = null;


        try {
            // InternalProgram.g:1865:47: (iv_ruleClinic= ruleClinic EOF )
            // InternalProgram.g:1866:2: iv_ruleClinic= ruleClinic EOF
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
    // InternalProgram.g:1872:1: ruleClinic returns [EObject current=null] : (otherlv_0= 'Clinic' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleClinic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_abstract_3_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:1878:2: ( (otherlv_0= 'Clinic' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) )
            // InternalProgram.g:1879:2: (otherlv_0= 'Clinic' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            {
            // InternalProgram.g:1879:2: (otherlv_0= 'Clinic' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            // InternalProgram.g:1880:3: otherlv_0= 'Clinic' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,41,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getClinicAccess().getClinicKeyword_0());
            		
            // InternalProgram.g:1884:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1885:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1885:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1886:5: lv_name_1_0= ruleEString
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

            // InternalProgram.g:1903:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==29) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalProgram.g:1904:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getClinicAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1908:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:1909:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:1909:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:1910:6: lv_abstract_3_0= ruleEString
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
    // InternalProgram.g:1932:1: entryRuleLunch returns [EObject current=null] : iv_ruleLunch= ruleLunch EOF ;
    public final EObject entryRuleLunch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLunch = null;


        try {
            // InternalProgram.g:1932:46: (iv_ruleLunch= ruleLunch EOF )
            // InternalProgram.g:1933:2: iv_ruleLunch= ruleLunch EOF
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
    // InternalProgram.g:1939:1: ruleLunch returns [EObject current=null] : (otherlv_0= 'Lunch' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleLunch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_abstract_3_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:1945:2: ( (otherlv_0= 'Lunch' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) )
            // InternalProgram.g:1946:2: (otherlv_0= 'Lunch' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            {
            // InternalProgram.g:1946:2: (otherlv_0= 'Lunch' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            // InternalProgram.g:1947:3: otherlv_0= 'Lunch' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLunchAccess().getLunchKeyword_0());
            		
            // InternalProgram.g:1951:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1952:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1952:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1953:5: lv_name_1_0= ruleEString
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

            // InternalProgram.g:1970:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==29) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalProgram.g:1971:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getLunchAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1975:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:1976:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:1976:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:1977:6: lv_abstract_3_0= ruleEString
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
    // InternalProgram.g:1999:1: entryRuleCoffeeBreak returns [EObject current=null] : iv_ruleCoffeeBreak= ruleCoffeeBreak EOF ;
    public final EObject entryRuleCoffeeBreak() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoffeeBreak = null;


        try {
            // InternalProgram.g:1999:52: (iv_ruleCoffeeBreak= ruleCoffeeBreak EOF )
            // InternalProgram.g:2000:2: iv_ruleCoffeeBreak= ruleCoffeeBreak EOF
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
    // InternalProgram.g:2006:1: ruleCoffeeBreak returns [EObject current=null] : (otherlv_0= 'CoffeeBreak' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleCoffeeBreak() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_abstract_3_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:2012:2: ( (otherlv_0= 'CoffeeBreak' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) )
            // InternalProgram.g:2013:2: (otherlv_0= 'CoffeeBreak' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            {
            // InternalProgram.g:2013:2: (otherlv_0= 'CoffeeBreak' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            // InternalProgram.g:2014:3: otherlv_0= 'CoffeeBreak' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,43,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getCoffeeBreakAccess().getCoffeeBreakKeyword_0());
            		
            // InternalProgram.g:2018:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:2019:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:2019:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:2020:5: lv_name_1_0= ruleEString
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

            // InternalProgram.g:2037:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==29) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalProgram.g:2038:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getCoffeeBreakAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:2042:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:2043:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:2043:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:2044:6: lv_abstract_3_0= ruleEString
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
    // InternalProgram.g:2066:1: entryRuleMeeting returns [EObject current=null] : iv_ruleMeeting= ruleMeeting EOF ;
    public final EObject entryRuleMeeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeeting = null;


        try {
            // InternalProgram.g:2066:48: (iv_ruleMeeting= ruleMeeting EOF )
            // InternalProgram.g:2067:2: iv_ruleMeeting= ruleMeeting EOF
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
    // InternalProgram.g:2073:1: ruleMeeting returns [EObject current=null] : (otherlv_0= 'Meeting' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleMeeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_abstract_3_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:2079:2: ( (otherlv_0= 'Meeting' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) )
            // InternalProgram.g:2080:2: (otherlv_0= 'Meeting' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            {
            // InternalProgram.g:2080:2: (otherlv_0= 'Meeting' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            // InternalProgram.g:2081:3: otherlv_0= 'Meeting' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMeetingAccess().getMeetingKeyword_0());
            		
            // InternalProgram.g:2085:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:2086:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:2086:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:2087:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeetingAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
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

            // InternalProgram.g:2104:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==29) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalProgram.g:2105:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getMeetingAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:2109:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:2110:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:2110:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:2111:6: lv_abstract_3_0= ruleEString
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


    // $ANTLR start "entryRulePaper"
    // InternalProgram.g:2133:1: entryRulePaper returns [EObject current=null] : iv_rulePaper= rulePaper EOF ;
    public final EObject entryRulePaper() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePaper = null;


        try {
            // InternalProgram.g:2133:46: (iv_rulePaper= rulePaper EOF )
            // InternalProgram.g:2134:2: iv_rulePaper= rulePaper EOF
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
    // InternalProgram.g:2140:1: rulePaper returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'authors' ( (lv_authors_3_0= rulePerson ) ) (otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) ) )* (otherlv_6= 'abstract' ( (lv_abstract_7_0= ruleEString ) ) )? (otherlv_8= 'preprint' ( (lv_preprint_9_0= ruleEString ) ) )? (otherlv_10= 'kind' ( (lv_kind_11_0= ruleTrack ) ) )? ) ;
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
            // InternalProgram.g:2146:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'authors' ( (lv_authors_3_0= rulePerson ) ) (otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) ) )* (otherlv_6= 'abstract' ( (lv_abstract_7_0= ruleEString ) ) )? (otherlv_8= 'preprint' ( (lv_preprint_9_0= ruleEString ) ) )? (otherlv_10= 'kind' ( (lv_kind_11_0= ruleTrack ) ) )? ) )
            // InternalProgram.g:2147:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'authors' ( (lv_authors_3_0= rulePerson ) ) (otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) ) )* (otherlv_6= 'abstract' ( (lv_abstract_7_0= ruleEString ) ) )? (otherlv_8= 'preprint' ( (lv_preprint_9_0= ruleEString ) ) )? (otherlv_10= 'kind' ( (lv_kind_11_0= ruleTrack ) ) )? )
            {
            // InternalProgram.g:2147:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'authors' ( (lv_authors_3_0= rulePerson ) ) (otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) ) )* (otherlv_6= 'abstract' ( (lv_abstract_7_0= ruleEString ) ) )? (otherlv_8= 'preprint' ( (lv_preprint_9_0= ruleEString ) ) )? (otherlv_10= 'kind' ( (lv_kind_11_0= ruleTrack ) ) )? )
            // InternalProgram.g:2148:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'authors' ( (lv_authors_3_0= rulePerson ) ) (otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) ) )* (otherlv_6= 'abstract' ( (lv_abstract_7_0= ruleEString ) ) )? (otherlv_8= 'preprint' ( (lv_preprint_9_0= ruleEString ) ) )? (otherlv_10= 'kind' ( (lv_kind_11_0= ruleTrack ) ) )?
            {
            // InternalProgram.g:2148:3: ()
            // InternalProgram.g:2149:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPaperAccess().getPaperAction_0(),
            					current);
            			

            }

            // InternalProgram.g:2155:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:2156:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:2156:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:2157:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,45,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getPaperAccess().getAuthorsKeyword_2());
            		
            // InternalProgram.g:2178:3: ( (lv_authors_3_0= rulePerson ) )
            // InternalProgram.g:2179:4: (lv_authors_3_0= rulePerson )
            {
            // InternalProgram.g:2179:4: (lv_authors_3_0= rulePerson )
            // InternalProgram.g:2180:5: lv_authors_3_0= rulePerson
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

            // InternalProgram.g:2197:3: (otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==26) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalProgram.g:2198:4: otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_9); 

            	    				newLeafNode(otherlv_4, grammarAccess.getPaperAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalProgram.g:2202:4: ( (lv_authors_5_0= rulePerson ) )
            	    // InternalProgram.g:2203:5: (lv_authors_5_0= rulePerson )
            	    {
            	    // InternalProgram.g:2203:5: (lv_authors_5_0= rulePerson )
            	    // InternalProgram.g:2204:6: lv_authors_5_0= rulePerson
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

            // InternalProgram.g:2222:3: (otherlv_6= 'abstract' ( (lv_abstract_7_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==29) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalProgram.g:2223:4: otherlv_6= 'abstract' ( (lv_abstract_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getPaperAccess().getAbstractKeyword_5_0());
                    			
                    // InternalProgram.g:2227:4: ( (lv_abstract_7_0= ruleEString ) )
                    // InternalProgram.g:2228:5: (lv_abstract_7_0= ruleEString )
                    {
                    // InternalProgram.g:2228:5: (lv_abstract_7_0= ruleEString )
                    // InternalProgram.g:2229:6: lv_abstract_7_0= ruleEString
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

            // InternalProgram.g:2247:3: (otherlv_8= 'preprint' ( (lv_preprint_9_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==46) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalProgram.g:2248:4: otherlv_8= 'preprint' ( (lv_preprint_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,46,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getPaperAccess().getPreprintKeyword_6_0());
                    			
                    // InternalProgram.g:2252:4: ( (lv_preprint_9_0= ruleEString ) )
                    // InternalProgram.g:2253:5: (lv_preprint_9_0= ruleEString )
                    {
                    // InternalProgram.g:2253:5: (lv_preprint_9_0= ruleEString )
                    // InternalProgram.g:2254:6: lv_preprint_9_0= ruleEString
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

            // InternalProgram.g:2272:3: (otherlv_10= 'kind' ( (lv_kind_11_0= ruleTrack ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==47) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalProgram.g:2273:4: otherlv_10= 'kind' ( (lv_kind_11_0= ruleTrack ) )
                    {
                    otherlv_10=(Token)match(input,47,FOLLOW_39); 

                    				newLeafNode(otherlv_10, grammarAccess.getPaperAccess().getKindKeyword_7_0());
                    			
                    // InternalProgram.g:2277:4: ( (lv_kind_11_0= ruleTrack ) )
                    // InternalProgram.g:2278:5: (lv_kind_11_0= ruleTrack )
                    {
                    // InternalProgram.g:2278:5: (lv_kind_11_0= ruleTrack )
                    // InternalProgram.g:2279:6: lv_kind_11_0= ruleTrack
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
    // InternalProgram.g:2301:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalProgram.g:2301:47: (iv_rulePerson= rulePerson EOF )
            // InternalProgram.g:2302:2: iv_rulePerson= rulePerson EOF
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
    // InternalProgram.g:2308:1: rulePerson returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'email' ( (lv_email_3_0= ruleEString ) ) )? (otherlv_4= 'homepage' ( (lv_homepage_5_0= ruleEString ) ) )? ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_email_3_0 = null;

        AntlrDatatypeRuleToken lv_homepage_5_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:2314:2: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'email' ( (lv_email_3_0= ruleEString ) ) )? (otherlv_4= 'homepage' ( (lv_homepage_5_0= ruleEString ) ) )? ) )
            // InternalProgram.g:2315:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'email' ( (lv_email_3_0= ruleEString ) ) )? (otherlv_4= 'homepage' ( (lv_homepage_5_0= ruleEString ) ) )? )
            {
            // InternalProgram.g:2315:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'email' ( (lv_email_3_0= ruleEString ) ) )? (otherlv_4= 'homepage' ( (lv_homepage_5_0= ruleEString ) ) )? )
            // InternalProgram.g:2316:3: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'email' ( (lv_email_3_0= ruleEString ) ) )? (otherlv_4= 'homepage' ( (lv_homepage_5_0= ruleEString ) ) )?
            {
            // InternalProgram.g:2316:3: ()
            // InternalProgram.g:2317:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPersonAccess().getPersonAction_0(),
            					current);
            			

            }

            // InternalProgram.g:2323:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:2324:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:2324:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:2325:5: lv_name_1_0= ruleEString
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

            // InternalProgram.g:2342:3: (otherlv_2= 'email' ( (lv_email_3_0= ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==48) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalProgram.g:2343:4: otherlv_2= 'email' ( (lv_email_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,48,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getPersonAccess().getEmailKeyword_2_0());
                    			
                    // InternalProgram.g:2347:4: ( (lv_email_3_0= ruleEString ) )
                    // InternalProgram.g:2348:5: (lv_email_3_0= ruleEString )
                    {
                    // InternalProgram.g:2348:5: (lv_email_3_0= ruleEString )
                    // InternalProgram.g:2349:6: lv_email_3_0= ruleEString
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

            // InternalProgram.g:2367:3: (otherlv_4= 'homepage' ( (lv_homepage_5_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==49) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalProgram.g:2368:4: otherlv_4= 'homepage' ( (lv_homepage_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,49,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getPersonAccess().getHomepageKeyword_3_0());
                    			
                    // InternalProgram.g:2372:4: ( (lv_homepage_5_0= ruleEString ) )
                    // InternalProgram.g:2373:5: (lv_homepage_5_0= ruleEString )
                    {
                    // InternalProgram.g:2373:5: (lv_homepage_5_0= ruleEString )
                    // InternalProgram.g:2374:6: lv_homepage_5_0= ruleEString
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
    // InternalProgram.g:2396:1: ruleWeekDay returns [Enumerator current=null] : ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) ) ;
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
            // InternalProgram.g:2402:2: ( ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) ) )
            // InternalProgram.g:2403:2: ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) )
            {
            // InternalProgram.g:2403:2: ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) )
            int alt50=7;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt50=1;
                }
                break;
            case 51:
                {
                alt50=2;
                }
                break;
            case 52:
                {
                alt50=3;
                }
                break;
            case 53:
                {
                alt50=4;
                }
                break;
            case 54:
                {
                alt50=5;
                }
                break;
            case 55:
                {
                alt50=6;
                }
                break;
            case 56:
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
                    // InternalProgram.g:2404:3: (enumLiteral_0= 'Monday' )
                    {
                    // InternalProgram.g:2404:3: (enumLiteral_0= 'Monday' )
                    // InternalProgram.g:2405:4: enumLiteral_0= 'Monday'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getMondayEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWeekDayAccess().getMondayEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalProgram.g:2412:3: (enumLiteral_1= 'Tuesday' )
                    {
                    // InternalProgram.g:2412:3: (enumLiteral_1= 'Tuesday' )
                    // InternalProgram.g:2413:4: enumLiteral_1= 'Tuesday'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getTuesdayEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWeekDayAccess().getTuesdayEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalProgram.g:2420:3: (enumLiteral_2= 'Wednesday' )
                    {
                    // InternalProgram.g:2420:3: (enumLiteral_2= 'Wednesday' )
                    // InternalProgram.g:2421:4: enumLiteral_2= 'Wednesday'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getWednesdayEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWeekDayAccess().getWednesdayEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalProgram.g:2428:3: (enumLiteral_3= 'Thursday' )
                    {
                    // InternalProgram.g:2428:3: (enumLiteral_3= 'Thursday' )
                    // InternalProgram.g:2429:4: enumLiteral_3= 'Thursday'
                    {
                    enumLiteral_3=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getThursdayEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWeekDayAccess().getThursdayEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalProgram.g:2436:3: (enumLiteral_4= 'Friday' )
                    {
                    // InternalProgram.g:2436:3: (enumLiteral_4= 'Friday' )
                    // InternalProgram.g:2437:4: enumLiteral_4= 'Friday'
                    {
                    enumLiteral_4=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getFridayEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getWeekDayAccess().getFridayEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalProgram.g:2444:3: (enumLiteral_5= 'Saturday' )
                    {
                    // InternalProgram.g:2444:3: (enumLiteral_5= 'Saturday' )
                    // InternalProgram.g:2445:4: enumLiteral_5= 'Saturday'
                    {
                    enumLiteral_5=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getSaturdayEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getWeekDayAccess().getSaturdayEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalProgram.g:2452:3: (enumLiteral_6= 'Sunday' )
                    {
                    // InternalProgram.g:2452:3: (enumLiteral_6= 'Sunday' )
                    // InternalProgram.g:2453:4: enumLiteral_6= 'Sunday'
                    {
                    enumLiteral_6=(Token)match(input,56,FOLLOW_2); 

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
    // InternalProgram.g:2463:1: ruleTrack returns [Enumerator current=null] : ( (enumLiteral_0= 'Practice and Innovation' ) | (enumLiteral_1= 'Research' ) ) ;
    public final Enumerator ruleTrack() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalProgram.g:2469:2: ( ( (enumLiteral_0= 'Practice and Innovation' ) | (enumLiteral_1= 'Research' ) ) )
            // InternalProgram.g:2470:2: ( (enumLiteral_0= 'Practice and Innovation' ) | (enumLiteral_1= 'Research' ) )
            {
            // InternalProgram.g:2470:2: ( (enumLiteral_0= 'Practice and Innovation' ) | (enumLiteral_1= 'Research' ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==57) ) {
                alt51=1;
            }
            else if ( (LA51_0==58) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalProgram.g:2471:3: (enumLiteral_0= 'Practice and Innovation' )
                    {
                    // InternalProgram.g:2471:3: (enumLiteral_0= 'Practice and Innovation' )
                    // InternalProgram.g:2472:4: enumLiteral_0= 'Practice and Innovation'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getTrackAccess().getPracticeAndInnovationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTrackAccess().getPracticeAndInnovationEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalProgram.g:2479:3: (enumLiteral_1= 'Research' )
                    {
                    // InternalProgram.g:2479:3: (enumLiteral_1= 'Research' )
                    // InternalProgram.g:2480:4: enumLiteral_1= 'Research'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000063002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000E2002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00001FE248000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x01FC000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200022L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000030002002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020002002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000001A0000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000104000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001C20000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001020000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000C00024000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0002000000000002L});

}