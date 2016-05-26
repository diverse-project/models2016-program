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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'talk duration'", "'resources'", "'papers'", "'{'", "';'", "'}'", "'events'", "'program'", "'room'", "'capacity'", "'date'", "'.'", "':'", "'-'", "'in'", "','", "'TalkSession'", "'chair'", "'abstract'", "'Panel'", "'panelists'", "'moderators'", "'SRC'", "'Poster'", "'KeyNote'", "'speaker'", "'Workshop'", "'url'", "'name'", "'organizers'", "'Tutorial'", "'DoctoralSymposium'", "'EducatorSymposium'", "'Reception'", "'Clinic'", "'Lunch'", "'CoffeeBreak'", "'Meeting'", "'authors'", "'preprint'", "'kind'", "'email'", "'homepage'", "'Monday'", "'Tuesday'", "'Wednesday'", "'Thursday'", "'Friday'", "'Saturday'", "'Sunday'", "'Practice and Innovation'", "'Research'"
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
    // InternalProgram.g:350:1: ruleEvent returns [EObject current=null] : (this_TalkSession_0= ruleTalkSession | this_Panel_1= rulePanel | this_Workshop_2= ruleWorkshop | this_Tutorial_3= ruleTutorial | this_DoctoralSymposium_4= ruleDoctoralSymposium | this_EducatorSymposium_5= ruleEducatorSymposium | this_Reception_6= ruleReception | this_Clinic_7= ruleClinic | this_Lunch_8= ruleLunch | this_CoffeeBreak_9= ruleCoffeeBreak | this_Meeting_10= ruleMeeting | this_SRC_11= ruleSRC | this_Poster_12= rulePoster | this_KeyNote_13= ruleKeyNote ) ;
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

        EObject this_KeyNote_13 = null;



        	enterRule();

        try {
            // InternalProgram.g:356:2: ( (this_TalkSession_0= ruleTalkSession | this_Panel_1= rulePanel | this_Workshop_2= ruleWorkshop | this_Tutorial_3= ruleTutorial | this_DoctoralSymposium_4= ruleDoctoralSymposium | this_EducatorSymposium_5= ruleEducatorSymposium | this_Reception_6= ruleReception | this_Clinic_7= ruleClinic | this_Lunch_8= ruleLunch | this_CoffeeBreak_9= ruleCoffeeBreak | this_Meeting_10= ruleMeeting | this_SRC_11= ruleSRC | this_Poster_12= rulePoster | this_KeyNote_13= ruleKeyNote ) )
            // InternalProgram.g:357:2: (this_TalkSession_0= ruleTalkSession | this_Panel_1= rulePanel | this_Workshop_2= ruleWorkshop | this_Tutorial_3= ruleTutorial | this_DoctoralSymposium_4= ruleDoctoralSymposium | this_EducatorSymposium_5= ruleEducatorSymposium | this_Reception_6= ruleReception | this_Clinic_7= ruleClinic | this_Lunch_8= ruleLunch | this_CoffeeBreak_9= ruleCoffeeBreak | this_Meeting_10= ruleMeeting | this_SRC_11= ruleSRC | this_Poster_12= rulePoster | this_KeyNote_13= ruleKeyNote )
            {
            // InternalProgram.g:357:2: (this_TalkSession_0= ruleTalkSession | this_Panel_1= rulePanel | this_Workshop_2= ruleWorkshop | this_Tutorial_3= ruleTutorial | this_DoctoralSymposium_4= ruleDoctoralSymposium | this_EducatorSymposium_5= ruleEducatorSymposium | this_Reception_6= ruleReception | this_Clinic_7= ruleClinic | this_Lunch_8= ruleLunch | this_CoffeeBreak_9= ruleCoffeeBreak | this_Meeting_10= ruleMeeting | this_SRC_11= ruleSRC | this_Poster_12= rulePoster | this_KeyNote_13= ruleKeyNote )
            int alt8=14;
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
            case 37:
                {
                alt8=3;
                }
                break;
            case 41:
                {
                alt8=4;
                }
                break;
            case 42:
                {
                alt8=5;
                }
                break;
            case 43:
                {
                alt8=6;
                }
                break;
            case 44:
                {
                alt8=7;
                }
                break;
            case 45:
                {
                alt8=8;
                }
                break;
            case 46:
                {
                alt8=9;
                }
                break;
            case 47:
                {
                alt8=10;
                }
                break;
            case 48:
                {
                alt8=11;
                }
                break;
            case 33:
                {
                alt8=12;
                }
                break;
            case 34:
                {
                alt8=13;
                }
                break;
            case 35:
                {
                alt8=14;
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
                case 12 :
                    // InternalProgram.g:457:3: this_SRC_11= ruleSRC
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
                    // InternalProgram.g:466:3: this_Poster_12= rulePoster
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
                    // InternalProgram.g:475:3: this_KeyNote_13= ruleKeyNote
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getKeyNoteParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_KeyNote_13=ruleKeyNote();

                    state._fsp--;


                    			current = this_KeyNote_13;
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
    // InternalProgram.g:487:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalProgram.g:487:47: (iv_ruleEString= ruleEString EOF )
            // InternalProgram.g:488:2: iv_ruleEString= ruleEString EOF
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
    // InternalProgram.g:494:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalProgram.g:500:2: (this_STRING_0= RULE_STRING )
            // InternalProgram.g:501:2: this_STRING_0= RULE_STRING
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
    // InternalProgram.g:511:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalProgram.g:511:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalProgram.g:512:2: iv_ruleProgram= ruleProgram EOF
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
    // InternalProgram.g:518:1: ruleProgram returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )* )? otherlv_4= '}' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_days_2_0 = null;

        EObject lv_days_3_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:524:2: ( ( () otherlv_1= '{' ( ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )* )? otherlv_4= '}' ) )
            // InternalProgram.g:525:2: ( () otherlv_1= '{' ( ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )* )? otherlv_4= '}' )
            {
            // InternalProgram.g:525:2: ( () otherlv_1= '{' ( ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )* )? otherlv_4= '}' )
            // InternalProgram.g:526:3: () otherlv_1= '{' ( ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )* )? otherlv_4= '}'
            {
            // InternalProgram.g:526:3: ()
            // InternalProgram.g:527:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProgramAccess().getProgramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalProgram.g:537:3: ( ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=54 && LA10_0<=60)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalProgram.g:538:4: ( (lv_days_2_0= ruleDay ) ) ( (lv_days_3_0= ruleDay ) )*
                    {
                    // InternalProgram.g:538:4: ( (lv_days_2_0= ruleDay ) )
                    // InternalProgram.g:539:5: (lv_days_2_0= ruleDay )
                    {
                    // InternalProgram.g:539:5: (lv_days_2_0= ruleDay )
                    // InternalProgram.g:540:6: lv_days_2_0= ruleDay
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

                    // InternalProgram.g:557:4: ( (lv_days_3_0= ruleDay ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=54 && LA9_0<=60)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalProgram.g:558:5: (lv_days_3_0= ruleDay )
                    	    {
                    	    // InternalProgram.g:558:5: (lv_days_3_0= ruleDay )
                    	    // InternalProgram.g:559:6: lv_days_3_0= ruleDay
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
    // InternalProgram.g:585:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // InternalProgram.g:585:45: (iv_ruleRoom= ruleRoom EOF )
            // InternalProgram.g:586:2: iv_ruleRoom= ruleRoom EOF
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
    // InternalProgram.g:592:1: ruleRoom returns [EObject current=null] : ( () otherlv_1= 'room' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEIntegerObject ) ) )? ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_capacity_4_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:598:2: ( ( () otherlv_1= 'room' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEIntegerObject ) ) )? ) )
            // InternalProgram.g:599:2: ( () otherlv_1= 'room' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEIntegerObject ) ) )? )
            {
            // InternalProgram.g:599:2: ( () otherlv_1= 'room' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEIntegerObject ) ) )? )
            // InternalProgram.g:600:3: () otherlv_1= 'room' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEIntegerObject ) ) )?
            {
            // InternalProgram.g:600:3: ()
            // InternalProgram.g:601:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoomAccess().getRoomAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRoomAccess().getRoomKeyword_1());
            		
            // InternalProgram.g:611:3: ( (lv_name_2_0= ruleEString ) )
            // InternalProgram.g:612:4: (lv_name_2_0= ruleEString )
            {
            // InternalProgram.g:612:4: (lv_name_2_0= ruleEString )
            // InternalProgram.g:613:5: lv_name_2_0= ruleEString
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

            // InternalProgram.g:630:3: (otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEIntegerObject ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalProgram.g:631:4: otherlv_3= 'capacity' ( (lv_capacity_4_0= ruleEIntegerObject ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getRoomAccess().getCapacityKeyword_3_0());
                    			
                    // InternalProgram.g:635:4: ( (lv_capacity_4_0= ruleEIntegerObject ) )
                    // InternalProgram.g:636:5: (lv_capacity_4_0= ruleEIntegerObject )
                    {
                    // InternalProgram.g:636:5: (lv_capacity_4_0= ruleEIntegerObject )
                    // InternalProgram.g:637:6: lv_capacity_4_0= ruleEIntegerObject
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
    // InternalProgram.g:659:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // InternalProgram.g:659:54: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // InternalProgram.g:660:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
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
    // InternalProgram.g:666:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalProgram.g:672:2: (this_INT_0= RULE_INT )
            // InternalProgram.g:673:2: this_INT_0= RULE_INT
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
    // InternalProgram.g:683:1: entryRuleDay returns [EObject current=null] : iv_ruleDay= ruleDay EOF ;
    public final EObject entryRuleDay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDay = null;


        try {
            // InternalProgram.g:683:44: (iv_ruleDay= ruleDay EOF )
            // InternalProgram.g:684:2: iv_ruleDay= ruleDay EOF
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
    // InternalProgram.g:690:1: ruleDay returns [EObject current=null] : ( ( (lv_weekday_0_0= ruleWeekDay ) ) (otherlv_1= 'date' ( (lv_date_2_0= ruleDayDataType ) ) )? ( ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )* )? ) ;
    public final EObject ruleDay() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_weekday_0_0 = null;

        AntlrDatatypeRuleToken lv_date_2_0 = null;

        EObject lv_sessions_3_0 = null;

        EObject lv_sessions_4_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:696:2: ( ( ( (lv_weekday_0_0= ruleWeekDay ) ) (otherlv_1= 'date' ( (lv_date_2_0= ruleDayDataType ) ) )? ( ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )* )? ) )
            // InternalProgram.g:697:2: ( ( (lv_weekday_0_0= ruleWeekDay ) ) (otherlv_1= 'date' ( (lv_date_2_0= ruleDayDataType ) ) )? ( ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )* )? )
            {
            // InternalProgram.g:697:2: ( ( (lv_weekday_0_0= ruleWeekDay ) ) (otherlv_1= 'date' ( (lv_date_2_0= ruleDayDataType ) ) )? ( ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )* )? )
            // InternalProgram.g:698:3: ( (lv_weekday_0_0= ruleWeekDay ) ) (otherlv_1= 'date' ( (lv_date_2_0= ruleDayDataType ) ) )? ( ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )* )?
            {
            // InternalProgram.g:698:3: ( (lv_weekday_0_0= ruleWeekDay ) )
            // InternalProgram.g:699:4: (lv_weekday_0_0= ruleWeekDay )
            {
            // InternalProgram.g:699:4: (lv_weekday_0_0= ruleWeekDay )
            // InternalProgram.g:700:5: lv_weekday_0_0= ruleWeekDay
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

            // InternalProgram.g:717:3: (otherlv_1= 'date' ( (lv_date_2_0= ruleDayDataType ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalProgram.g:718:4: otherlv_1= 'date' ( (lv_date_2_0= ruleDayDataType ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getDayAccess().getDateKeyword_1_0());
                    			
                    // InternalProgram.g:722:4: ( (lv_date_2_0= ruleDayDataType ) )
                    // InternalProgram.g:723:5: (lv_date_2_0= ruleDayDataType )
                    {
                    // InternalProgram.g:723:5: (lv_date_2_0= ruleDayDataType )
                    // InternalProgram.g:724:6: lv_date_2_0= ruleDayDataType
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

            // InternalProgram.g:742:3: ( ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalProgram.g:743:4: ( (lv_sessions_3_0= ruleSession ) ) ( (lv_sessions_4_0= ruleSession ) )*
                    {
                    // InternalProgram.g:743:4: ( (lv_sessions_3_0= ruleSession ) )
                    // InternalProgram.g:744:5: (lv_sessions_3_0= ruleSession )
                    {
                    // InternalProgram.g:744:5: (lv_sessions_3_0= ruleSession )
                    // InternalProgram.g:745:6: lv_sessions_3_0= ruleSession
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

                    // InternalProgram.g:762:4: ( (lv_sessions_4_0= ruleSession ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_INT) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalProgram.g:763:5: (lv_sessions_4_0= ruleSession )
                    	    {
                    	    // InternalProgram.g:763:5: (lv_sessions_4_0= ruleSession )
                    	    // InternalProgram.g:764:6: lv_sessions_4_0= ruleSession
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
    // InternalProgram.g:786:1: entryRuleDayDataType returns [String current=null] : iv_ruleDayDataType= ruleDayDataType EOF ;
    public final String entryRuleDayDataType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDayDataType = null;


        try {
            // InternalProgram.g:786:51: (iv_ruleDayDataType= ruleDayDataType EOF )
            // InternalProgram.g:787:2: iv_ruleDayDataType= ruleDayDataType EOF
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
    // InternalProgram.g:793:1: ruleDayDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDayDataType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalProgram.g:799:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) )
            // InternalProgram.g:800:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
            {
            // InternalProgram.g:800:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
            // InternalProgram.g:801:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT
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
    // InternalProgram.g:836:1: entryRuleHourDataType returns [String current=null] : iv_ruleHourDataType= ruleHourDataType EOF ;
    public final String entryRuleHourDataType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHourDataType = null;


        try {
            // InternalProgram.g:836:52: (iv_ruleHourDataType= ruleHourDataType EOF )
            // InternalProgram.g:837:2: iv_ruleHourDataType= ruleHourDataType EOF
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
    // InternalProgram.g:843:1: ruleHourDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= ':' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleHourDataType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalProgram.g:849:2: ( (this_INT_0= RULE_INT kw= ':' this_INT_2= RULE_INT ) )
            // InternalProgram.g:850:2: (this_INT_0= RULE_INT kw= ':' this_INT_2= RULE_INT )
            {
            // InternalProgram.g:850:2: (this_INT_0= RULE_INT kw= ':' this_INT_2= RULE_INT )
            // InternalProgram.g:851:3: this_INT_0= RULE_INT kw= ':' this_INT_2= RULE_INT
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
    // InternalProgram.g:874:1: entryRuleSession returns [EObject current=null] : iv_ruleSession= ruleSession EOF ;
    public final EObject entryRuleSession() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSession = null;


        try {
            // InternalProgram.g:874:48: (iv_ruleSession= ruleSession EOF )
            // InternalProgram.g:875:2: iv_ruleSession= ruleSession EOF
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
    // InternalProgram.g:881:1: ruleSession returns [EObject current=null] : ( () ( (lv_startingTime_1_0= ruleHourDataType ) ) otherlv_2= '-' ( (lv_endingTime_3_0= ruleHourDataType ) ) otherlv_4= 'in' ( ( ruleEString ) ) otherlv_6= ':' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) ;
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
            // InternalProgram.g:887:2: ( ( () ( (lv_startingTime_1_0= ruleHourDataType ) ) otherlv_2= '-' ( (lv_endingTime_3_0= ruleHourDataType ) ) otherlv_4= 'in' ( ( ruleEString ) ) otherlv_6= ':' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* ) )
            // InternalProgram.g:888:2: ( () ( (lv_startingTime_1_0= ruleHourDataType ) ) otherlv_2= '-' ( (lv_endingTime_3_0= ruleHourDataType ) ) otherlv_4= 'in' ( ( ruleEString ) ) otherlv_6= ':' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )
            {
            // InternalProgram.g:888:2: ( () ( (lv_startingTime_1_0= ruleHourDataType ) ) otherlv_2= '-' ( (lv_endingTime_3_0= ruleHourDataType ) ) otherlv_4= 'in' ( ( ruleEString ) ) otherlv_6= ':' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )
            // InternalProgram.g:889:3: () ( (lv_startingTime_1_0= ruleHourDataType ) ) otherlv_2= '-' ( (lv_endingTime_3_0= ruleHourDataType ) ) otherlv_4= 'in' ( ( ruleEString ) ) otherlv_6= ':' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )*
            {
            // InternalProgram.g:889:3: ()
            // InternalProgram.g:890:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSessionAccess().getSessionAction_0(),
            					current);
            			

            }

            // InternalProgram.g:896:3: ( (lv_startingTime_1_0= ruleHourDataType ) )
            // InternalProgram.g:897:4: (lv_startingTime_1_0= ruleHourDataType )
            {
            // InternalProgram.g:897:4: (lv_startingTime_1_0= ruleHourDataType )
            // InternalProgram.g:898:5: lv_startingTime_1_0= ruleHourDataType
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
            		
            // InternalProgram.g:919:3: ( (lv_endingTime_3_0= ruleHourDataType ) )
            // InternalProgram.g:920:4: (lv_endingTime_3_0= ruleHourDataType )
            {
            // InternalProgram.g:920:4: (lv_endingTime_3_0= ruleHourDataType )
            // InternalProgram.g:921:5: lv_endingTime_3_0= ruleHourDataType
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
            		
            // InternalProgram.g:942:3: ( ( ruleEString ) )
            // InternalProgram.g:943:4: ( ruleEString )
            {
            // InternalProgram.g:943:4: ( ruleEString )
            // InternalProgram.g:944:5: ruleEString
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
            		
            // InternalProgram.g:962:3: ( ( ruleEString ) )
            // InternalProgram.g:963:4: ( ruleEString )
            {
            // InternalProgram.g:963:4: ( ruleEString )
            // InternalProgram.g:964:5: ruleEString
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

            // InternalProgram.g:978:3: (otherlv_8= ',' ( ( ruleEString ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalProgram.g:979:4: otherlv_8= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,26,FOLLOW_9); 

            	    				newLeafNode(otherlv_8, grammarAccess.getSessionAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalProgram.g:983:4: ( ( ruleEString ) )
            	    // InternalProgram.g:984:5: ( ruleEString )
            	    {
            	    // InternalProgram.g:984:5: ( ruleEString )
            	    // InternalProgram.g:985:6: ruleEString
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
    // InternalProgram.g:1004:1: entryRuleTalkSession returns [EObject current=null] : iv_ruleTalkSession= ruleTalkSession EOF ;
    public final EObject entryRuleTalkSession() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTalkSession = null;


        try {
            // InternalProgram.g:1004:52: (iv_ruleTalkSession= ruleTalkSession EOF )
            // InternalProgram.g:1005:2: iv_ruleTalkSession= ruleTalkSession EOF
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
    // InternalProgram.g:1011:1: ruleTalkSession returns [EObject current=null] : (otherlv_0= 'TalkSession' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) ) )? (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'papers' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? ) ;
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
            // InternalProgram.g:1017:2: ( (otherlv_0= 'TalkSession' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) ) )? (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'papers' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? ) )
            // InternalProgram.g:1018:2: (otherlv_0= 'TalkSession' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) ) )? (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'papers' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? )
            {
            // InternalProgram.g:1018:2: (otherlv_0= 'TalkSession' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) ) )? (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'papers' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? )
            // InternalProgram.g:1019:3: otherlv_0= 'TalkSession' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) ) )? (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )? (otherlv_6= 'papers' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTalkSessionAccess().getTalkSessionKeyword_0());
            		
            // InternalProgram.g:1023:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1024:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1024:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1025:5: lv_name_1_0= ruleEString
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

            // InternalProgram.g:1042:3: (otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalProgram.g:1043:4: otherlv_2= 'chair' ( (lv_chair_3_0= rulePerson ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getTalkSessionAccess().getChairKeyword_2_0());
                    			
                    // InternalProgram.g:1047:4: ( (lv_chair_3_0= rulePerson ) )
                    // InternalProgram.g:1048:5: (lv_chair_3_0= rulePerson )
                    {
                    // InternalProgram.g:1048:5: (lv_chair_3_0= rulePerson )
                    // InternalProgram.g:1049:6: lv_chair_3_0= rulePerson
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

            // InternalProgram.g:1067:3: (otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalProgram.g:1068:4: otherlv_4= 'abstract' ( (lv_abstract_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getTalkSessionAccess().getAbstractKeyword_3_0());
                    			
                    // InternalProgram.g:1072:4: ( (lv_abstract_5_0= ruleEString ) )
                    // InternalProgram.g:1073:5: (lv_abstract_5_0= ruleEString )
                    {
                    // InternalProgram.g:1073:5: (lv_abstract_5_0= ruleEString )
                    // InternalProgram.g:1074:6: lv_abstract_5_0= ruleEString
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

            // InternalProgram.g:1092:3: (otherlv_6= 'papers' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==13) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalProgram.g:1093:4: otherlv_6= 'papers' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getTalkSessionAccess().getPapersKeyword_4_0());
                    			
                    // InternalProgram.g:1097:4: ( ( ruleEString ) )
                    // InternalProgram.g:1098:5: ( ruleEString )
                    {
                    // InternalProgram.g:1098:5: ( ruleEString )
                    // InternalProgram.g:1099:6: ruleEString
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

                    // InternalProgram.g:1113:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==26) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalProgram.g:1114:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,26,FOLLOW_9); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getTalkSessionAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalProgram.g:1118:5: ( ( ruleEString ) )
                    	    // InternalProgram.g:1119:6: ( ruleEString )
                    	    {
                    	    // InternalProgram.g:1119:6: ( ruleEString )
                    	    // InternalProgram.g:1120:7: ruleEString
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
    // InternalProgram.g:1140:1: entryRulePanel returns [EObject current=null] : iv_rulePanel= rulePanel EOF ;
    public final EObject entryRulePanel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePanel = null;


        try {
            // InternalProgram.g:1140:46: (iv_rulePanel= rulePanel EOF )
            // InternalProgram.g:1141:2: iv_rulePanel= rulePanel EOF
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
    // InternalProgram.g:1147:1: rulePanel returns [EObject current=null] : (otherlv_0= 'Panel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )* )? (otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )* )? ) ;
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
            // InternalProgram.g:1153:2: ( (otherlv_0= 'Panel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )* )? (otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )* )? ) )
            // InternalProgram.g:1154:2: (otherlv_0= 'Panel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )* )? (otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )* )? )
            {
            // InternalProgram.g:1154:2: (otherlv_0= 'Panel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )* )? (otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )* )? )
            // InternalProgram.g:1155:3: otherlv_0= 'Panel' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )* )? (otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )* )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPanelAccess().getPanelKeyword_0());
            		
            // InternalProgram.g:1159:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1160:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1160:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1161:5: lv_name_1_0= ruleEString
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

            // InternalProgram.g:1178:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalProgram.g:1179:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getPanelAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1183:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:1184:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:1184:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:1185:6: lv_abstract_3_0= ruleEString
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

            // InternalProgram.g:1203:3: (otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalProgram.g:1204:4: otherlv_4= 'panelists' ( (lv_panelists_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )*
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getPanelAccess().getPanelistsKeyword_3_0());
                    			
                    // InternalProgram.g:1208:4: ( (lv_panelists_5_0= rulePerson ) )
                    // InternalProgram.g:1209:5: (lv_panelists_5_0= rulePerson )
                    {
                    // InternalProgram.g:1209:5: (lv_panelists_5_0= rulePerson )
                    // InternalProgram.g:1210:6: lv_panelists_5_0= rulePerson
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

                    // InternalProgram.g:1227:4: (otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==26) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalProgram.g:1228:5: otherlv_6= ',' ( (lv_panelists_7_0= rulePerson ) )
                    	    {
                    	    otherlv_6=(Token)match(input,26,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPanelAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalProgram.g:1232:5: ( (lv_panelists_7_0= rulePerson ) )
                    	    // InternalProgram.g:1233:6: (lv_panelists_7_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:1233:6: (lv_panelists_7_0= rulePerson )
                    	    // InternalProgram.g:1234:7: lv_panelists_7_0= rulePerson
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

            // InternalProgram.g:1253:3: (otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalProgram.g:1254:4: otherlv_8= 'moderators' ( (lv_moderators_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )*
                    {
                    otherlv_8=(Token)match(input,32,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getPanelAccess().getModeratorsKeyword_4_0());
                    			
                    // InternalProgram.g:1258:4: ( (lv_moderators_9_0= rulePerson ) )
                    // InternalProgram.g:1259:5: (lv_moderators_9_0= rulePerson )
                    {
                    // InternalProgram.g:1259:5: (lv_moderators_9_0= rulePerson )
                    // InternalProgram.g:1260:6: lv_moderators_9_0= rulePerson
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

                    // InternalProgram.g:1277:4: (otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==26) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalProgram.g:1278:5: otherlv_10= ',' ( (lv_moderators_11_0= rulePerson ) )
                    	    {
                    	    otherlv_10=(Token)match(input,26,FOLLOW_9); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getPanelAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalProgram.g:1282:5: ( (lv_moderators_11_0= rulePerson ) )
                    	    // InternalProgram.g:1283:6: (lv_moderators_11_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:1283:6: (lv_moderators_11_0= rulePerson )
                    	    // InternalProgram.g:1284:7: lv_moderators_11_0= rulePerson
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


    // $ANTLR start "entryRuleSRC"
    // InternalProgram.g:1307:1: entryRuleSRC returns [EObject current=null] : iv_ruleSRC= ruleSRC EOF ;
    public final EObject entryRuleSRC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSRC = null;


        try {
            // InternalProgram.g:1307:44: (iv_ruleSRC= ruleSRC EOF )
            // InternalProgram.g:1308:2: iv_ruleSRC= ruleSRC EOF
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
    // InternalProgram.g:1314:1: ruleSRC returns [EObject current=null] : (otherlv_0= 'SRC' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleSRC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_abstract_3_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:1320:2: ( (otherlv_0= 'SRC' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) )
            // InternalProgram.g:1321:2: (otherlv_0= 'SRC' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            {
            // InternalProgram.g:1321:2: (otherlv_0= 'SRC' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            // InternalProgram.g:1322:3: otherlv_0= 'SRC' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSRCAccess().getSRCKeyword_0());
            		
            // InternalProgram.g:1326:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1327:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1327:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1328:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSRCAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
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

            // InternalProgram.g:1345:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalProgram.g:1346:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getSRCAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1350:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:1351:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:1351:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:1352:6: lv_abstract_3_0= ruleEString
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
    // InternalProgram.g:1374:1: entryRulePoster returns [EObject current=null] : iv_rulePoster= rulePoster EOF ;
    public final EObject entryRulePoster() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoster = null;


        try {
            // InternalProgram.g:1374:47: (iv_rulePoster= rulePoster EOF )
            // InternalProgram.g:1375:2: iv_rulePoster= rulePoster EOF
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
    // InternalProgram.g:1381:1: rulePoster returns [EObject current=null] : (otherlv_0= 'Poster' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) ;
    public final EObject rulePoster() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_abstract_3_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:1387:2: ( (otherlv_0= 'Poster' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) )
            // InternalProgram.g:1388:2: (otherlv_0= 'Poster' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            {
            // InternalProgram.g:1388:2: (otherlv_0= 'Poster' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            // InternalProgram.g:1389:3: otherlv_0= 'Poster' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPosterAccess().getPosterKeyword_0());
            		
            // InternalProgram.g:1393:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1394:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1394:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1395:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPosterAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
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

            // InternalProgram.g:1412:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalProgram.g:1413:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getPosterAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1417:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:1418:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:1418:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:1419:6: lv_abstract_3_0= ruleEString
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


    // $ANTLR start "entryRuleKeyNote"
    // InternalProgram.g:1441:1: entryRuleKeyNote returns [EObject current=null] : iv_ruleKeyNote= ruleKeyNote EOF ;
    public final EObject entryRuleKeyNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyNote = null;


        try {
            // InternalProgram.g:1441:48: (iv_ruleKeyNote= ruleKeyNote EOF )
            // InternalProgram.g:1442:2: iv_ruleKeyNote= ruleKeyNote EOF
            {
             newCompositeNode(grammarAccess.getKeyNoteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeyNote=ruleKeyNote();

            state._fsp--;

             current =iv_ruleKeyNote; 
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
    // $ANTLR end "entryRuleKeyNote"


    // $ANTLR start "ruleKeyNote"
    // InternalProgram.g:1448:1: ruleKeyNote returns [EObject current=null] : (otherlv_0= 'KeyNote' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) ) )? ) ;
    public final EObject ruleKeyNote() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_abstract_3_0 = null;

        EObject lv_speaker_5_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:1454:2: ( (otherlv_0= 'KeyNote' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) ) )? ) )
            // InternalProgram.g:1455:2: (otherlv_0= 'KeyNote' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) ) )? )
            {
            // InternalProgram.g:1455:2: (otherlv_0= 'KeyNote' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) ) )? )
            // InternalProgram.g:1456:3: otherlv_0= 'KeyNote' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) ) )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getKeyNoteAccess().getKeyNoteKeyword_0());
            		
            // InternalProgram.g:1460:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1461:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1461:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1462:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKeyNoteAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeyNoteRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.inria.diverse.models2016.dsl.Program.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProgram.g:1479:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==29) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalProgram.g:1480:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getKeyNoteAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1484:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:1485:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:1485:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:1486:6: lv_abstract_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getKeyNoteAccess().getAbstractEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_abstract_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKeyNoteRule());
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

            // InternalProgram.g:1504:3: (otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==36) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalProgram.g:1505:4: otherlv_4= 'speaker' ( (lv_speaker_5_0= rulePerson ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getKeyNoteAccess().getSpeakerKeyword_3_0());
                    			
                    // InternalProgram.g:1509:4: ( (lv_speaker_5_0= rulePerson ) )
                    // InternalProgram.g:1510:5: (lv_speaker_5_0= rulePerson )
                    {
                    // InternalProgram.g:1510:5: (lv_speaker_5_0= rulePerson )
                    // InternalProgram.g:1511:6: lv_speaker_5_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getKeyNoteAccess().getSpeakerPersonParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_speaker_5_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKeyNoteRule());
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
    // $ANTLR end "ruleKeyNote"


    // $ANTLR start "entryRuleWorkshop"
    // InternalProgram.g:1533:1: entryRuleWorkshop returns [EObject current=null] : iv_ruleWorkshop= ruleWorkshop EOF ;
    public final EObject entryRuleWorkshop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkshop = null;


        try {
            // InternalProgram.g:1533:49: (iv_ruleWorkshop= ruleWorkshop EOF )
            // InternalProgram.g:1534:2: iv_ruleWorkshop= ruleWorkshop EOF
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
    // InternalProgram.g:1540:1: ruleWorkshop returns [EObject current=null] : (otherlv_0= 'Workshop' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) )? (otherlv_6= 'name' ( (lv_fullName_7_0= ruleEString ) ) )? (otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )* )? ) ;
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
            // InternalProgram.g:1546:2: ( (otherlv_0= 'Workshop' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) )? (otherlv_6= 'name' ( (lv_fullName_7_0= ruleEString ) ) )? (otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )* )? ) )
            // InternalProgram.g:1547:2: (otherlv_0= 'Workshop' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) )? (otherlv_6= 'name' ( (lv_fullName_7_0= ruleEString ) ) )? (otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )* )? )
            {
            // InternalProgram.g:1547:2: (otherlv_0= 'Workshop' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) )? (otherlv_6= 'name' ( (lv_fullName_7_0= ruleEString ) ) )? (otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )* )? )
            // InternalProgram.g:1548:3: otherlv_0= 'Workshop' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) )? (otherlv_6= 'name' ( (lv_fullName_7_0= ruleEString ) ) )? (otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )* )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkshopAccess().getWorkshopKeyword_0());
            		
            // InternalProgram.g:1552:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1553:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1553:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1554:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWorkshopAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_32);
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

            // InternalProgram.g:1571:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==29) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalProgram.g:1572:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getWorkshopAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1576:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:1577:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:1577:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:1578:6: lv_abstract_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getWorkshopAccess().getAbstractEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_33);
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

            // InternalProgram.g:1596:3: (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==38) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalProgram.g:1597:4: otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getWorkshopAccess().getUrlKeyword_3_0());
                    			
                    // InternalProgram.g:1601:4: ( (lv_url_5_0= ruleEString ) )
                    // InternalProgram.g:1602:5: (lv_url_5_0= ruleEString )
                    {
                    // InternalProgram.g:1602:5: (lv_url_5_0= ruleEString )
                    // InternalProgram.g:1603:6: lv_url_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getWorkshopAccess().getUrlEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_34);
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

            // InternalProgram.g:1621:3: (otherlv_6= 'name' ( (lv_fullName_7_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==39) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalProgram.g:1622:4: otherlv_6= 'name' ( (lv_fullName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,39,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getWorkshopAccess().getNameKeyword_4_0());
                    			
                    // InternalProgram.g:1626:4: ( (lv_fullName_7_0= ruleEString ) )
                    // InternalProgram.g:1627:5: (lv_fullName_7_0= ruleEString )
                    {
                    // InternalProgram.g:1627:5: (lv_fullName_7_0= ruleEString )
                    // InternalProgram.g:1628:6: lv_fullName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getWorkshopAccess().getFullNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_35);
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

            // InternalProgram.g:1646:3: (otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==40) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalProgram.g:1647:4: otherlv_8= 'organizers' ( (lv_organizers_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )*
                    {
                    otherlv_8=(Token)match(input,40,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getWorkshopAccess().getOrganizersKeyword_5_0());
                    			
                    // InternalProgram.g:1651:4: ( (lv_organizers_9_0= rulePerson ) )
                    // InternalProgram.g:1652:5: (lv_organizers_9_0= rulePerson )
                    {
                    // InternalProgram.g:1652:5: (lv_organizers_9_0= rulePerson )
                    // InternalProgram.g:1653:6: lv_organizers_9_0= rulePerson
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

                    // InternalProgram.g:1670:4: (otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==26) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalProgram.g:1671:5: otherlv_10= ',' ( (lv_organizers_11_0= rulePerson ) )
                    	    {
                    	    otherlv_10=(Token)match(input,26,FOLLOW_9); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getWorkshopAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalProgram.g:1675:5: ( (lv_organizers_11_0= rulePerson ) )
                    	    // InternalProgram.g:1676:6: (lv_organizers_11_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:1676:6: (lv_organizers_11_0= rulePerson )
                    	    // InternalProgram.g:1677:7: lv_organizers_11_0= rulePerson
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
    // $ANTLR end "ruleWorkshop"


    // $ANTLR start "entryRuleTutorial"
    // InternalProgram.g:1700:1: entryRuleTutorial returns [EObject current=null] : iv_ruleTutorial= ruleTutorial EOF ;
    public final EObject entryRuleTutorial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTutorial = null;


        try {
            // InternalProgram.g:1700:49: (iv_ruleTutorial= ruleTutorial EOF )
            // InternalProgram.g:1701:2: iv_ruleTutorial= ruleTutorial EOF
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
    // InternalProgram.g:1707:1: ruleTutorial returns [EObject current=null] : (otherlv_0= 'Tutorial' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? ) ;
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
            // InternalProgram.g:1713:2: ( (otherlv_0= 'Tutorial' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? ) )
            // InternalProgram.g:1714:2: (otherlv_0= 'Tutorial' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? )
            {
            // InternalProgram.g:1714:2: (otherlv_0= 'Tutorial' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? )
            // InternalProgram.g:1715:3: otherlv_0= 'Tutorial' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )?
            {
            otherlv_0=(Token)match(input,41,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTutorialAccess().getTutorialKeyword_0());
            		
            // InternalProgram.g:1719:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1720:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1720:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1721:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTutorialAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_36);
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

            // InternalProgram.g:1738:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==29) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalProgram.g:1739:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getTutorialAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1743:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:1744:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:1744:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:1745:6: lv_abstract_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTutorialAccess().getAbstractEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_35);
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

            // InternalProgram.g:1763:3: (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==40) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalProgram.g:1764:4: otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )*
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getTutorialAccess().getOrganizersKeyword_3_0());
                    			
                    // InternalProgram.g:1768:4: ( (lv_organizers_5_0= rulePerson ) )
                    // InternalProgram.g:1769:5: (lv_organizers_5_0= rulePerson )
                    {
                    // InternalProgram.g:1769:5: (lv_organizers_5_0= rulePerson )
                    // InternalProgram.g:1770:6: lv_organizers_5_0= rulePerson
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

                    // InternalProgram.g:1787:4: (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==26) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalProgram.g:1788:5: otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) )
                    	    {
                    	    otherlv_6=(Token)match(input,26,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getTutorialAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalProgram.g:1792:5: ( (lv_organizers_7_0= rulePerson ) )
                    	    // InternalProgram.g:1793:6: (lv_organizers_7_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:1793:6: (lv_organizers_7_0= rulePerson )
                    	    // InternalProgram.g:1794:7: lv_organizers_7_0= rulePerson
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
    // $ANTLR end "ruleTutorial"


    // $ANTLR start "entryRuleDoctoralSymposium"
    // InternalProgram.g:1817:1: entryRuleDoctoralSymposium returns [EObject current=null] : iv_ruleDoctoralSymposium= ruleDoctoralSymposium EOF ;
    public final EObject entryRuleDoctoralSymposium() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoctoralSymposium = null;


        try {
            // InternalProgram.g:1817:58: (iv_ruleDoctoralSymposium= ruleDoctoralSymposium EOF )
            // InternalProgram.g:1818:2: iv_ruleDoctoralSymposium= ruleDoctoralSymposium EOF
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
    // InternalProgram.g:1824:1: ruleDoctoralSymposium returns [EObject current=null] : (otherlv_0= 'DoctoralSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? ) ;
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
            // InternalProgram.g:1830:2: ( (otherlv_0= 'DoctoralSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? ) )
            // InternalProgram.g:1831:2: (otherlv_0= 'DoctoralSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? )
            {
            // InternalProgram.g:1831:2: (otherlv_0= 'DoctoralSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? )
            // InternalProgram.g:1832:3: otherlv_0= 'DoctoralSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDoctoralSymposiumAccess().getDoctoralSymposiumKeyword_0());
            		
            // InternalProgram.g:1836:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1837:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1837:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1838:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDoctoralSymposiumAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_36);
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

            // InternalProgram.g:1855:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==29) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalProgram.g:1856:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getDoctoralSymposiumAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1860:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:1861:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:1861:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:1862:6: lv_abstract_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDoctoralSymposiumAccess().getAbstractEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_35);
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

            // InternalProgram.g:1880:3: (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==40) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalProgram.g:1881:4: otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )*
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getDoctoralSymposiumAccess().getOrganizersKeyword_3_0());
                    			
                    // InternalProgram.g:1885:4: ( (lv_organizers_5_0= rulePerson ) )
                    // InternalProgram.g:1886:5: (lv_organizers_5_0= rulePerson )
                    {
                    // InternalProgram.g:1886:5: (lv_organizers_5_0= rulePerson )
                    // InternalProgram.g:1887:6: lv_organizers_5_0= rulePerson
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

                    // InternalProgram.g:1904:4: (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==26) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalProgram.g:1905:5: otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) )
                    	    {
                    	    otherlv_6=(Token)match(input,26,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getDoctoralSymposiumAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalProgram.g:1909:5: ( (lv_organizers_7_0= rulePerson ) )
                    	    // InternalProgram.g:1910:6: (lv_organizers_7_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:1910:6: (lv_organizers_7_0= rulePerson )
                    	    // InternalProgram.g:1911:7: lv_organizers_7_0= rulePerson
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
    // $ANTLR end "ruleDoctoralSymposium"


    // $ANTLR start "entryRuleEducatorSymposium"
    // InternalProgram.g:1934:1: entryRuleEducatorSymposium returns [EObject current=null] : iv_ruleEducatorSymposium= ruleEducatorSymposium EOF ;
    public final EObject entryRuleEducatorSymposium() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEducatorSymposium = null;


        try {
            // InternalProgram.g:1934:58: (iv_ruleEducatorSymposium= ruleEducatorSymposium EOF )
            // InternalProgram.g:1935:2: iv_ruleEducatorSymposium= ruleEducatorSymposium EOF
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
    // InternalProgram.g:1941:1: ruleEducatorSymposium returns [EObject current=null] : (otherlv_0= 'EducatorSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? ) ;
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
            // InternalProgram.g:1947:2: ( (otherlv_0= 'EducatorSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? ) )
            // InternalProgram.g:1948:2: (otherlv_0= 'EducatorSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? )
            {
            // InternalProgram.g:1948:2: (otherlv_0= 'EducatorSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )? )
            // InternalProgram.g:1949:3: otherlv_0= 'EducatorSymposium' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )?
            {
            otherlv_0=(Token)match(input,43,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getEducatorSymposiumAccess().getEducatorSymposiumKeyword_0());
            		
            // InternalProgram.g:1953:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:1954:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:1954:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:1955:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEducatorSymposiumAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_36);
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

            // InternalProgram.g:1972:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==29) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalProgram.g:1973:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getEducatorSymposiumAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:1977:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:1978:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:1978:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:1979:6: lv_abstract_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEducatorSymposiumAccess().getAbstractEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_35);
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

            // InternalProgram.g:1997:3: (otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==40) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalProgram.g:1998:4: otherlv_4= 'organizers' ( (lv_organizers_5_0= rulePerson ) ) (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )*
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getEducatorSymposiumAccess().getOrganizersKeyword_3_0());
                    			
                    // InternalProgram.g:2002:4: ( (lv_organizers_5_0= rulePerson ) )
                    // InternalProgram.g:2003:5: (lv_organizers_5_0= rulePerson )
                    {
                    // InternalProgram.g:2003:5: (lv_organizers_5_0= rulePerson )
                    // InternalProgram.g:2004:6: lv_organizers_5_0= rulePerson
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

                    // InternalProgram.g:2021:4: (otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==26) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalProgram.g:2022:5: otherlv_6= ',' ( (lv_organizers_7_0= rulePerson ) )
                    	    {
                    	    otherlv_6=(Token)match(input,26,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getEducatorSymposiumAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalProgram.g:2026:5: ( (lv_organizers_7_0= rulePerson ) )
                    	    // InternalProgram.g:2027:6: (lv_organizers_7_0= rulePerson )
                    	    {
                    	    // InternalProgram.g:2027:6: (lv_organizers_7_0= rulePerson )
                    	    // InternalProgram.g:2028:7: lv_organizers_7_0= rulePerson
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
                    	    break loop41;
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
    // InternalProgram.g:2051:1: entryRuleReception returns [EObject current=null] : iv_ruleReception= ruleReception EOF ;
    public final EObject entryRuleReception() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReception = null;


        try {
            // InternalProgram.g:2051:50: (iv_ruleReception= ruleReception EOF )
            // InternalProgram.g:2052:2: iv_ruleReception= ruleReception EOF
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
    // InternalProgram.g:2058:1: ruleReception returns [EObject current=null] : (otherlv_0= 'Reception' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleReception() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_abstract_3_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:2064:2: ( (otherlv_0= 'Reception' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) )
            // InternalProgram.g:2065:2: (otherlv_0= 'Reception' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            {
            // InternalProgram.g:2065:2: (otherlv_0= 'Reception' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            // InternalProgram.g:2066:3: otherlv_0= 'Reception' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getReceptionAccess().getReceptionKeyword_0());
            		
            // InternalProgram.g:2070:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:2071:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:2071:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:2072:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReceptionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
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

            // InternalProgram.g:2089:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==29) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalProgram.g:2090:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getReceptionAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:2094:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:2095:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:2095:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:2096:6: lv_abstract_3_0= ruleEString
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
    // InternalProgram.g:2118:1: entryRuleClinic returns [EObject current=null] : iv_ruleClinic= ruleClinic EOF ;
    public final EObject entryRuleClinic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClinic = null;


        try {
            // InternalProgram.g:2118:47: (iv_ruleClinic= ruleClinic EOF )
            // InternalProgram.g:2119:2: iv_ruleClinic= ruleClinic EOF
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
    // InternalProgram.g:2125:1: ruleClinic returns [EObject current=null] : (otherlv_0= 'Clinic' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleClinic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_abstract_3_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:2131:2: ( (otherlv_0= 'Clinic' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) )
            // InternalProgram.g:2132:2: (otherlv_0= 'Clinic' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            {
            // InternalProgram.g:2132:2: (otherlv_0= 'Clinic' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            // InternalProgram.g:2133:3: otherlv_0= 'Clinic' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getClinicAccess().getClinicKeyword_0());
            		
            // InternalProgram.g:2137:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:2138:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:2138:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:2139:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClinicAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
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

            // InternalProgram.g:2156:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==29) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalProgram.g:2157:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getClinicAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:2161:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:2162:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:2162:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:2163:6: lv_abstract_3_0= ruleEString
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
    // InternalProgram.g:2185:1: entryRuleLunch returns [EObject current=null] : iv_ruleLunch= ruleLunch EOF ;
    public final EObject entryRuleLunch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLunch = null;


        try {
            // InternalProgram.g:2185:46: (iv_ruleLunch= ruleLunch EOF )
            // InternalProgram.g:2186:2: iv_ruleLunch= ruleLunch EOF
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
    // InternalProgram.g:2192:1: ruleLunch returns [EObject current=null] : (otherlv_0= 'Lunch' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleLunch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_abstract_3_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:2198:2: ( (otherlv_0= 'Lunch' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) )
            // InternalProgram.g:2199:2: (otherlv_0= 'Lunch' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            {
            // InternalProgram.g:2199:2: (otherlv_0= 'Lunch' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            // InternalProgram.g:2200:3: otherlv_0= 'Lunch' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLunchAccess().getLunchKeyword_0());
            		
            // InternalProgram.g:2204:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:2205:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:2205:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:2206:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLunchAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
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

            // InternalProgram.g:2223:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==29) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalProgram.g:2224:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getLunchAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:2228:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:2229:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:2229:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:2230:6: lv_abstract_3_0= ruleEString
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
    // InternalProgram.g:2252:1: entryRuleCoffeeBreak returns [EObject current=null] : iv_ruleCoffeeBreak= ruleCoffeeBreak EOF ;
    public final EObject entryRuleCoffeeBreak() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoffeeBreak = null;


        try {
            // InternalProgram.g:2252:52: (iv_ruleCoffeeBreak= ruleCoffeeBreak EOF )
            // InternalProgram.g:2253:2: iv_ruleCoffeeBreak= ruleCoffeeBreak EOF
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
    // InternalProgram.g:2259:1: ruleCoffeeBreak returns [EObject current=null] : (otherlv_0= 'CoffeeBreak' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleCoffeeBreak() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_abstract_3_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:2265:2: ( (otherlv_0= 'CoffeeBreak' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) )
            // InternalProgram.g:2266:2: (otherlv_0= 'CoffeeBreak' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            {
            // InternalProgram.g:2266:2: (otherlv_0= 'CoffeeBreak' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            // InternalProgram.g:2267:3: otherlv_0= 'CoffeeBreak' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,47,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getCoffeeBreakAccess().getCoffeeBreakKeyword_0());
            		
            // InternalProgram.g:2271:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:2272:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:2272:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:2273:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCoffeeBreakAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
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

            // InternalProgram.g:2290:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==29) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalProgram.g:2291:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getCoffeeBreakAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:2295:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:2296:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:2296:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:2297:6: lv_abstract_3_0= ruleEString
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
    // InternalProgram.g:2319:1: entryRuleMeeting returns [EObject current=null] : iv_ruleMeeting= ruleMeeting EOF ;
    public final EObject entryRuleMeeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeeting = null;


        try {
            // InternalProgram.g:2319:48: (iv_ruleMeeting= ruleMeeting EOF )
            // InternalProgram.g:2320:2: iv_ruleMeeting= ruleMeeting EOF
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
    // InternalProgram.g:2326:1: ruleMeeting returns [EObject current=null] : (otherlv_0= 'Meeting' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleMeeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_abstract_3_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:2332:2: ( (otherlv_0= 'Meeting' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? ) )
            // InternalProgram.g:2333:2: (otherlv_0= 'Meeting' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            {
            // InternalProgram.g:2333:2: (otherlv_0= 'Meeting' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )? )
            // InternalProgram.g:2334:3: otherlv_0= 'Meeting' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,48,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMeetingAccess().getMeetingKeyword_0());
            		
            // InternalProgram.g:2338:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:2339:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:2339:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:2340:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeetingAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
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

            // InternalProgram.g:2357:3: (otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==29) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalProgram.g:2358:4: otherlv_2= 'abstract' ( (lv_abstract_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getMeetingAccess().getAbstractKeyword_2_0());
                    			
                    // InternalProgram.g:2362:4: ( (lv_abstract_3_0= ruleEString ) )
                    // InternalProgram.g:2363:5: (lv_abstract_3_0= ruleEString )
                    {
                    // InternalProgram.g:2363:5: (lv_abstract_3_0= ruleEString )
                    // InternalProgram.g:2364:6: lv_abstract_3_0= ruleEString
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
    // InternalProgram.g:2386:1: entryRulePaper returns [EObject current=null] : iv_rulePaper= rulePaper EOF ;
    public final EObject entryRulePaper() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePaper = null;


        try {
            // InternalProgram.g:2386:46: (iv_rulePaper= rulePaper EOF )
            // InternalProgram.g:2387:2: iv_rulePaper= rulePaper EOF
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
    // InternalProgram.g:2393:1: rulePaper returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'authors' ( (lv_authors_3_0= rulePerson ) ) (otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) ) )* (otherlv_6= 'abstract' ( (lv_abstract_7_0= ruleEString ) ) )? (otherlv_8= 'preprint' ( (lv_preprint_9_0= ruleEString ) ) )? (otherlv_10= 'kind' ( (lv_kind_11_0= ruleTrack ) ) )? ) ;
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
            // InternalProgram.g:2399:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'authors' ( (lv_authors_3_0= rulePerson ) ) (otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) ) )* (otherlv_6= 'abstract' ( (lv_abstract_7_0= ruleEString ) ) )? (otherlv_8= 'preprint' ( (lv_preprint_9_0= ruleEString ) ) )? (otherlv_10= 'kind' ( (lv_kind_11_0= ruleTrack ) ) )? ) )
            // InternalProgram.g:2400:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'authors' ( (lv_authors_3_0= rulePerson ) ) (otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) ) )* (otherlv_6= 'abstract' ( (lv_abstract_7_0= ruleEString ) ) )? (otherlv_8= 'preprint' ( (lv_preprint_9_0= ruleEString ) ) )? (otherlv_10= 'kind' ( (lv_kind_11_0= ruleTrack ) ) )? )
            {
            // InternalProgram.g:2400:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'authors' ( (lv_authors_3_0= rulePerson ) ) (otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) ) )* (otherlv_6= 'abstract' ( (lv_abstract_7_0= ruleEString ) ) )? (otherlv_8= 'preprint' ( (lv_preprint_9_0= ruleEString ) ) )? (otherlv_10= 'kind' ( (lv_kind_11_0= ruleTrack ) ) )? )
            // InternalProgram.g:2401:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'authors' ( (lv_authors_3_0= rulePerson ) ) (otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) ) )* (otherlv_6= 'abstract' ( (lv_abstract_7_0= ruleEString ) ) )? (otherlv_8= 'preprint' ( (lv_preprint_9_0= ruleEString ) ) )? (otherlv_10= 'kind' ( (lv_kind_11_0= ruleTrack ) ) )?
            {
            // InternalProgram.g:2401:3: ()
            // InternalProgram.g:2402:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPaperAccess().getPaperAction_0(),
            					current);
            			

            }

            // InternalProgram.g:2408:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:2409:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:2409:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:2410:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPaperAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_37);
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

            otherlv_2=(Token)match(input,49,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getPaperAccess().getAuthorsKeyword_2());
            		
            // InternalProgram.g:2431:3: ( (lv_authors_3_0= rulePerson ) )
            // InternalProgram.g:2432:4: (lv_authors_3_0= rulePerson )
            {
            // InternalProgram.g:2432:4: (lv_authors_3_0= rulePerson )
            // InternalProgram.g:2433:5: lv_authors_3_0= rulePerson
            {

            					newCompositeNode(grammarAccess.getPaperAccess().getAuthorsPersonParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_38);
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

            // InternalProgram.g:2450:3: (otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==26) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalProgram.g:2451:4: otherlv_4= ',' ( (lv_authors_5_0= rulePerson ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_9); 

            	    				newLeafNode(otherlv_4, grammarAccess.getPaperAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalProgram.g:2455:4: ( (lv_authors_5_0= rulePerson ) )
            	    // InternalProgram.g:2456:5: (lv_authors_5_0= rulePerson )
            	    {
            	    // InternalProgram.g:2456:5: (lv_authors_5_0= rulePerson )
            	    // InternalProgram.g:2457:6: lv_authors_5_0= rulePerson
            	    {

            	    						newCompositeNode(grammarAccess.getPaperAccess().getAuthorsPersonParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_38);
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
            	    break loop48;
                }
            } while (true);

            // InternalProgram.g:2475:3: (otherlv_6= 'abstract' ( (lv_abstract_7_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==29) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalProgram.g:2476:4: otherlv_6= 'abstract' ( (lv_abstract_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getPaperAccess().getAbstractKeyword_5_0());
                    			
                    // InternalProgram.g:2480:4: ( (lv_abstract_7_0= ruleEString ) )
                    // InternalProgram.g:2481:5: (lv_abstract_7_0= ruleEString )
                    {
                    // InternalProgram.g:2481:5: (lv_abstract_7_0= ruleEString )
                    // InternalProgram.g:2482:6: lv_abstract_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPaperAccess().getAbstractEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_39);
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

            // InternalProgram.g:2500:3: (otherlv_8= 'preprint' ( (lv_preprint_9_0= ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==50) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalProgram.g:2501:4: otherlv_8= 'preprint' ( (lv_preprint_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,50,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getPaperAccess().getPreprintKeyword_6_0());
                    			
                    // InternalProgram.g:2505:4: ( (lv_preprint_9_0= ruleEString ) )
                    // InternalProgram.g:2506:5: (lv_preprint_9_0= ruleEString )
                    {
                    // InternalProgram.g:2506:5: (lv_preprint_9_0= ruleEString )
                    // InternalProgram.g:2507:6: lv_preprint_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPaperAccess().getPreprintEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_40);
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

            // InternalProgram.g:2525:3: (otherlv_10= 'kind' ( (lv_kind_11_0= ruleTrack ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==51) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalProgram.g:2526:4: otherlv_10= 'kind' ( (lv_kind_11_0= ruleTrack ) )
                    {
                    otherlv_10=(Token)match(input,51,FOLLOW_41); 

                    				newLeafNode(otherlv_10, grammarAccess.getPaperAccess().getKindKeyword_7_0());
                    			
                    // InternalProgram.g:2530:4: ( (lv_kind_11_0= ruleTrack ) )
                    // InternalProgram.g:2531:5: (lv_kind_11_0= ruleTrack )
                    {
                    // InternalProgram.g:2531:5: (lv_kind_11_0= ruleTrack )
                    // InternalProgram.g:2532:6: lv_kind_11_0= ruleTrack
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
    // InternalProgram.g:2554:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalProgram.g:2554:47: (iv_rulePerson= rulePerson EOF )
            // InternalProgram.g:2555:2: iv_rulePerson= rulePerson EOF
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
    // InternalProgram.g:2561:1: rulePerson returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'email' ( (lv_email_3_0= ruleEString ) ) )? (otherlv_4= 'homepage' ( (lv_homepage_5_0= ruleEString ) ) )? ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_email_3_0 = null;

        AntlrDatatypeRuleToken lv_homepage_5_0 = null;



        	enterRule();

        try {
            // InternalProgram.g:2567:2: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'email' ( (lv_email_3_0= ruleEString ) ) )? (otherlv_4= 'homepage' ( (lv_homepage_5_0= ruleEString ) ) )? ) )
            // InternalProgram.g:2568:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'email' ( (lv_email_3_0= ruleEString ) ) )? (otherlv_4= 'homepage' ( (lv_homepage_5_0= ruleEString ) ) )? )
            {
            // InternalProgram.g:2568:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'email' ( (lv_email_3_0= ruleEString ) ) )? (otherlv_4= 'homepage' ( (lv_homepage_5_0= ruleEString ) ) )? )
            // InternalProgram.g:2569:3: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'email' ( (lv_email_3_0= ruleEString ) ) )? (otherlv_4= 'homepage' ( (lv_homepage_5_0= ruleEString ) ) )?
            {
            // InternalProgram.g:2569:3: ()
            // InternalProgram.g:2570:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPersonAccess().getPersonAction_0(),
            					current);
            			

            }

            // InternalProgram.g:2576:3: ( (lv_name_1_0= ruleEString ) )
            // InternalProgram.g:2577:4: (lv_name_1_0= ruleEString )
            {
            // InternalProgram.g:2577:4: (lv_name_1_0= ruleEString )
            // InternalProgram.g:2578:5: lv_name_1_0= ruleEString
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

            // InternalProgram.g:2595:3: (otherlv_2= 'email' ( (lv_email_3_0= ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==52) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalProgram.g:2596:4: otherlv_2= 'email' ( (lv_email_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,52,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getPersonAccess().getEmailKeyword_2_0());
                    			
                    // InternalProgram.g:2600:4: ( (lv_email_3_0= ruleEString ) )
                    // InternalProgram.g:2601:5: (lv_email_3_0= ruleEString )
                    {
                    // InternalProgram.g:2601:5: (lv_email_3_0= ruleEString )
                    // InternalProgram.g:2602:6: lv_email_3_0= ruleEString
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

            // InternalProgram.g:2620:3: (otherlv_4= 'homepage' ( (lv_homepage_5_0= ruleEString ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==53) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalProgram.g:2621:4: otherlv_4= 'homepage' ( (lv_homepage_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,53,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getPersonAccess().getHomepageKeyword_3_0());
                    			
                    // InternalProgram.g:2625:4: ( (lv_homepage_5_0= ruleEString ) )
                    // InternalProgram.g:2626:5: (lv_homepage_5_0= ruleEString )
                    {
                    // InternalProgram.g:2626:5: (lv_homepage_5_0= ruleEString )
                    // InternalProgram.g:2627:6: lv_homepage_5_0= ruleEString
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
    // InternalProgram.g:2649:1: ruleWeekDay returns [Enumerator current=null] : ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) ) ;
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
            // InternalProgram.g:2655:2: ( ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) ) )
            // InternalProgram.g:2656:2: ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) )
            {
            // InternalProgram.g:2656:2: ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) )
            int alt54=7;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt54=1;
                }
                break;
            case 55:
                {
                alt54=2;
                }
                break;
            case 56:
                {
                alt54=3;
                }
                break;
            case 57:
                {
                alt54=4;
                }
                break;
            case 58:
                {
                alt54=5;
                }
                break;
            case 59:
                {
                alt54=6;
                }
                break;
            case 60:
                {
                alt54=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalProgram.g:2657:3: (enumLiteral_0= 'Monday' )
                    {
                    // InternalProgram.g:2657:3: (enumLiteral_0= 'Monday' )
                    // InternalProgram.g:2658:4: enumLiteral_0= 'Monday'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getMondayEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWeekDayAccess().getMondayEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalProgram.g:2665:3: (enumLiteral_1= 'Tuesday' )
                    {
                    // InternalProgram.g:2665:3: (enumLiteral_1= 'Tuesday' )
                    // InternalProgram.g:2666:4: enumLiteral_1= 'Tuesday'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getTuesdayEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWeekDayAccess().getTuesdayEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalProgram.g:2673:3: (enumLiteral_2= 'Wednesday' )
                    {
                    // InternalProgram.g:2673:3: (enumLiteral_2= 'Wednesday' )
                    // InternalProgram.g:2674:4: enumLiteral_2= 'Wednesday'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getWednesdayEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWeekDayAccess().getWednesdayEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalProgram.g:2681:3: (enumLiteral_3= 'Thursday' )
                    {
                    // InternalProgram.g:2681:3: (enumLiteral_3= 'Thursday' )
                    // InternalProgram.g:2682:4: enumLiteral_3= 'Thursday'
                    {
                    enumLiteral_3=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getThursdayEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWeekDayAccess().getThursdayEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalProgram.g:2689:3: (enumLiteral_4= 'Friday' )
                    {
                    // InternalProgram.g:2689:3: (enumLiteral_4= 'Friday' )
                    // InternalProgram.g:2690:4: enumLiteral_4= 'Friday'
                    {
                    enumLiteral_4=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getFridayEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getWeekDayAccess().getFridayEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalProgram.g:2697:3: (enumLiteral_5= 'Saturday' )
                    {
                    // InternalProgram.g:2697:3: (enumLiteral_5= 'Saturday' )
                    // InternalProgram.g:2698:4: enumLiteral_5= 'Saturday'
                    {
                    enumLiteral_5=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getWeekDayAccess().getSaturdayEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getWeekDayAccess().getSaturdayEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalProgram.g:2705:3: (enumLiteral_6= 'Sunday' )
                    {
                    // InternalProgram.g:2705:3: (enumLiteral_6= 'Sunday' )
                    // InternalProgram.g:2706:4: enumLiteral_6= 'Sunday'
                    {
                    enumLiteral_6=(Token)match(input,60,FOLLOW_2); 

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
    // InternalProgram.g:2716:1: ruleTrack returns [Enumerator current=null] : ( (enumLiteral_0= 'Practice and Innovation' ) | (enumLiteral_1= 'Research' ) ) ;
    public final Enumerator ruleTrack() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalProgram.g:2722:2: ( ( (enumLiteral_0= 'Practice and Innovation' ) | (enumLiteral_1= 'Research' ) ) )
            // InternalProgram.g:2723:2: ( (enumLiteral_0= 'Practice and Innovation' ) | (enumLiteral_1= 'Research' ) )
            {
            // InternalProgram.g:2723:2: ( (enumLiteral_0= 'Practice and Innovation' ) | (enumLiteral_1= 'Research' ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==61) ) {
                alt55=1;
            }
            else if ( (LA55_0==62) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalProgram.g:2724:3: (enumLiteral_0= 'Practice and Innovation' )
                    {
                    // InternalProgram.g:2724:3: (enumLiteral_0= 'Practice and Innovation' )
                    // InternalProgram.g:2725:4: enumLiteral_0= 'Practice and Innovation'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getTrackAccess().getPracticeAndInnovationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTrackAccess().getPracticeAndInnovationEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalProgram.g:2732:3: (enumLiteral_1= 'Research' )
                    {
                    // InternalProgram.g:2732:3: (enumLiteral_1= 'Research' )
                    // InternalProgram.g:2733:4: enumLiteral_1= 'Research'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); 

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
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0001FE2E48000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x1FC0000000010000L});
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
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001020000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000001C020000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010020000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000C000024000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0020000000000002L});

}