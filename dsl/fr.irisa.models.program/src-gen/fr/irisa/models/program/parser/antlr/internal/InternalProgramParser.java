package fr.irisa.models.program.parser.antlr.internal; 

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
import fr.irisa.models.program.services.ProgramGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProgramParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'Session'", "'start'", "'end'", "','", "'('", "')'", "'Workshop'", "'Tutorial'", "'Symposium'", "'Clinic'", "'Break'", "'Lunch'", "'Poster'", "'SRC'", "'Main'", "'Bouvet 1'", "'Bouvet 2'", "'Charcot'", "'Vauban 1'", "'Vauban 2'", "'Lamannais 1'", "'Lamennais 2'", "'Lamennais 3'", "'Rotonde Surcouf'", "'Chateaubriand'", "'Lamennais 1+2'", "'Lamennais 4+5'", "'Grand Large'", "'Rotonde J. Cartier'", "'Monday'", "'Tuesday'", "'Wednesday'", "'Thursday'", "'Friday'", "'Saturday'", "'Sunday'"
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
    public static final int RULE_ID=5;
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
        	return "Program";	
       	}
       	
       	@Override
       	protected ProgramGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProgram"
    // InternalProgram.g:68:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalProgram.g:69:2: (iv_ruleProgram= ruleProgram EOF )
            // InternalProgram.g:70:2: iv_ruleProgram= ruleProgram EOF
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
    // InternalProgram.g:77:1: ruleProgram returns [EObject current=null] : ( ( (lv_days_0_0= ruleDay ) ) ( (lv_days_1_0= ruleDay ) )* )? ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_days_0_0 = null;

        EObject lv_days_1_0 = null;


         enterRule(); 
            
        try {
            // InternalProgram.g:80:28: ( ( ( (lv_days_0_0= ruleDay ) ) ( (lv_days_1_0= ruleDay ) )* )? )
            // InternalProgram.g:81:1: ( ( (lv_days_0_0= ruleDay ) ) ( (lv_days_1_0= ruleDay ) )* )?
            {
            // InternalProgram.g:81:1: ( ( (lv_days_0_0= ruleDay ) ) ( (lv_days_1_0= ruleDay ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=41 && LA2_0<=47)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalProgram.g:81:2: ( (lv_days_0_0= ruleDay ) ) ( (lv_days_1_0= ruleDay ) )*
                    {
                    // InternalProgram.g:81:2: ( (lv_days_0_0= ruleDay ) )
                    // InternalProgram.g:82:1: (lv_days_0_0= ruleDay )
                    {
                    // InternalProgram.g:82:1: (lv_days_0_0= ruleDay )
                    // InternalProgram.g:83:3: lv_days_0_0= ruleDay
                    {
                     
                    	        newCompositeNode(grammarAccess.getProgramAccess().getDaysDayParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_3);
                    lv_days_0_0=ruleDay();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProgramRule());
                    	        }
                           		add(
                           			current, 
                           			"days",
                            		lv_days_0_0, 
                            		"fr.irisa.models.program.Program.Day");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalProgram.g:99:2: ( (lv_days_1_0= ruleDay ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=41 && LA1_0<=47)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalProgram.g:100:1: (lv_days_1_0= ruleDay )
                    	    {
                    	    // InternalProgram.g:100:1: (lv_days_1_0= ruleDay )
                    	    // InternalProgram.g:101:3: lv_days_1_0= ruleDay
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProgramAccess().getDaysDayParserRuleCall_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_3);
                    	    lv_days_1_0=ruleDay();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"days",
                    	            		lv_days_1_0, 
                    	            		"fr.irisa.models.program.Program.Day");
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


    // $ANTLR start "entryRuleDay"
    // InternalProgram.g:125:1: entryRuleDay returns [EObject current=null] : iv_ruleDay= ruleDay EOF ;
    public final EObject entryRuleDay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDay = null;


        try {
            // InternalProgram.g:126:2: (iv_ruleDay= ruleDay EOF )
            // InternalProgram.g:127:2: iv_ruleDay= ruleDay EOF
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
    // InternalProgram.g:134:1: ruleDay returns [EObject current=null] : ( ( (lv_weekDay_0_0= ruleWeekDay ) ) otherlv_1= ':' ( ( (lv_sessions_2_0= ruleSession ) ) ( (lv_sessions_3_0= ruleSession ) )* )? ) ;
    public final EObject ruleDay() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_weekDay_0_0 = null;

        EObject lv_sessions_2_0 = null;

        EObject lv_sessions_3_0 = null;


         enterRule(); 
            
        try {
            // InternalProgram.g:137:28: ( ( ( (lv_weekDay_0_0= ruleWeekDay ) ) otherlv_1= ':' ( ( (lv_sessions_2_0= ruleSession ) ) ( (lv_sessions_3_0= ruleSession ) )* )? ) )
            // InternalProgram.g:138:1: ( ( (lv_weekDay_0_0= ruleWeekDay ) ) otherlv_1= ':' ( ( (lv_sessions_2_0= ruleSession ) ) ( (lv_sessions_3_0= ruleSession ) )* )? )
            {
            // InternalProgram.g:138:1: ( ( (lv_weekDay_0_0= ruleWeekDay ) ) otherlv_1= ':' ( ( (lv_sessions_2_0= ruleSession ) ) ( (lv_sessions_3_0= ruleSession ) )* )? )
            // InternalProgram.g:138:2: ( (lv_weekDay_0_0= ruleWeekDay ) ) otherlv_1= ':' ( ( (lv_sessions_2_0= ruleSession ) ) ( (lv_sessions_3_0= ruleSession ) )* )?
            {
            // InternalProgram.g:138:2: ( (lv_weekDay_0_0= ruleWeekDay ) )
            // InternalProgram.g:139:1: (lv_weekDay_0_0= ruleWeekDay )
            {
            // InternalProgram.g:139:1: (lv_weekDay_0_0= ruleWeekDay )
            // InternalProgram.g:140:3: lv_weekDay_0_0= ruleWeekDay
            {
             
            	        newCompositeNode(grammarAccess.getDayAccess().getWeekDayWeekDayEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_4);
            lv_weekDay_0_0=ruleWeekDay();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDayRule());
            	        }
                   		set(
                   			current, 
                   			"weekDay",
                    		lv_weekDay_0_0, 
                    		"fr.irisa.models.program.Program.WeekDay");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_5); 

                	newLeafNode(otherlv_1, grammarAccess.getDayAccess().getColonKeyword_1());
                
            // InternalProgram.g:160:1: ( ( (lv_sessions_2_0= ruleSession ) ) ( (lv_sessions_3_0= ruleSession ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalProgram.g:160:2: ( (lv_sessions_2_0= ruleSession ) ) ( (lv_sessions_3_0= ruleSession ) )*
                    {
                    // InternalProgram.g:160:2: ( (lv_sessions_2_0= ruleSession ) )
                    // InternalProgram.g:161:1: (lv_sessions_2_0= ruleSession )
                    {
                    // InternalProgram.g:161:1: (lv_sessions_2_0= ruleSession )
                    // InternalProgram.g:162:3: lv_sessions_2_0= ruleSession
                    {
                     
                    	        newCompositeNode(grammarAccess.getDayAccess().getSessionsSessionParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_5);
                    lv_sessions_2_0=ruleSession();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDayRule());
                    	        }
                           		add(
                           			current, 
                           			"sessions",
                            		lv_sessions_2_0, 
                            		"fr.irisa.models.program.Program.Session");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalProgram.g:178:2: ( (lv_sessions_3_0= ruleSession ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==12) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalProgram.g:179:1: (lv_sessions_3_0= ruleSession )
                    	    {
                    	    // InternalProgram.g:179:1: (lv_sessions_3_0= ruleSession )
                    	    // InternalProgram.g:180:3: lv_sessions_3_0= ruleSession
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDayAccess().getSessionsSessionParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_5);
                    	    lv_sessions_3_0=ruleSession();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDayRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sessions",
                    	            		lv_sessions_3_0, 
                    	            		"fr.irisa.models.program.Program.Session");
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


    // $ANTLR start "entryRuleSession"
    // InternalProgram.g:204:1: entryRuleSession returns [EObject current=null] : iv_ruleSession= ruleSession EOF ;
    public final EObject entryRuleSession() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSession = null;


        try {
            // InternalProgram.g:205:2: (iv_ruleSession= ruleSession EOF )
            // InternalProgram.g:206:2: iv_ruleSession= ruleSession EOF
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
    // InternalProgram.g:213:1: ruleSession returns [EObject current=null] : (otherlv_0= 'Session' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'start' ( (lv_start_4_0= RULE_STRING ) ) otherlv_5= 'end' ( (lv_end_6_0= RULE_STRING ) ) ( ( (lv_talks_7_0= ruleTalk ) ) ( (lv_talks_8_0= ruleTalk ) )* )? ) ;
    public final EObject ruleSession() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_start_4_0=null;
        Token otherlv_5=null;
        Token lv_end_6_0=null;
        EObject lv_talks_7_0 = null;

        EObject lv_talks_8_0 = null;


         enterRule(); 
            
        try {
            // InternalProgram.g:216:28: ( (otherlv_0= 'Session' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'start' ( (lv_start_4_0= RULE_STRING ) ) otherlv_5= 'end' ( (lv_end_6_0= RULE_STRING ) ) ( ( (lv_talks_7_0= ruleTalk ) ) ( (lv_talks_8_0= ruleTalk ) )* )? ) )
            // InternalProgram.g:217:1: (otherlv_0= 'Session' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'start' ( (lv_start_4_0= RULE_STRING ) ) otherlv_5= 'end' ( (lv_end_6_0= RULE_STRING ) ) ( ( (lv_talks_7_0= ruleTalk ) ) ( (lv_talks_8_0= ruleTalk ) )* )? )
            {
            // InternalProgram.g:217:1: (otherlv_0= 'Session' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'start' ( (lv_start_4_0= RULE_STRING ) ) otherlv_5= 'end' ( (lv_end_6_0= RULE_STRING ) ) ( ( (lv_talks_7_0= ruleTalk ) ) ( (lv_talks_8_0= ruleTalk ) )* )? )
            // InternalProgram.g:217:3: otherlv_0= 'Session' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'start' ( (lv_start_4_0= RULE_STRING ) ) otherlv_5= 'end' ( (lv_end_6_0= RULE_STRING ) ) ( ( (lv_talks_7_0= ruleTalk ) ) ( (lv_talks_8_0= ruleTalk ) )* )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getSessionAccess().getSessionKeyword_0());
                
            otherlv_1=(Token)match(input,11,FOLLOW_6); 

                	newLeafNode(otherlv_1, grammarAccess.getSessionAccess().getColonKeyword_1());
                
            // InternalProgram.g:225:1: ( (lv_name_2_0= RULE_STRING ) )
            // InternalProgram.g:226:1: (lv_name_2_0= RULE_STRING )
            {
            // InternalProgram.g:226:1: (lv_name_2_0= RULE_STRING )
            // InternalProgram.g:227:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            			newLeafNode(lv_name_2_0, grammarAccess.getSessionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSessionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

                	newLeafNode(otherlv_3, grammarAccess.getSessionAccess().getStartKeyword_3());
                
            // InternalProgram.g:247:1: ( (lv_start_4_0= RULE_STRING ) )
            // InternalProgram.g:248:1: (lv_start_4_0= RULE_STRING )
            {
            // InternalProgram.g:248:1: (lv_start_4_0= RULE_STRING )
            // InternalProgram.g:249:3: lv_start_4_0= RULE_STRING
            {
            lv_start_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            			newLeafNode(lv_start_4_0, grammarAccess.getSessionAccess().getStartSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSessionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"start",
                    		lv_start_4_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_6); 

                	newLeafNode(otherlv_5, grammarAccess.getSessionAccess().getEndKeyword_5());
                
            // InternalProgram.g:269:1: ( (lv_end_6_0= RULE_STRING ) )
            // InternalProgram.g:270:1: (lv_end_6_0= RULE_STRING )
            {
            // InternalProgram.g:270:1: (lv_end_6_0= RULE_STRING )
            // InternalProgram.g:271:3: lv_end_6_0= RULE_STRING
            {
            lv_end_6_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            			newLeafNode(lv_end_6_0, grammarAccess.getSessionAccess().getEndSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSessionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"end",
                    		lv_end_6_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            // InternalProgram.g:287:2: ( ( (lv_talks_7_0= ruleTalk ) ) ( (lv_talks_8_0= ruleTalk ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=18 && LA6_0<=26)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalProgram.g:287:3: ( (lv_talks_7_0= ruleTalk ) ) ( (lv_talks_8_0= ruleTalk ) )*
                    {
                    // InternalProgram.g:287:3: ( (lv_talks_7_0= ruleTalk ) )
                    // InternalProgram.g:288:1: (lv_talks_7_0= ruleTalk )
                    {
                    // InternalProgram.g:288:1: (lv_talks_7_0= ruleTalk )
                    // InternalProgram.g:289:3: lv_talks_7_0= ruleTalk
                    {
                     
                    	        newCompositeNode(grammarAccess.getSessionAccess().getTalksTalkParserRuleCall_7_0_0()); 
                    	    
                    pushFollow(FOLLOW_9);
                    lv_talks_7_0=ruleTalk();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSessionRule());
                    	        }
                           		add(
                           			current, 
                           			"talks",
                            		lv_talks_7_0, 
                            		"fr.irisa.models.program.Program.Talk");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalProgram.g:305:2: ( (lv_talks_8_0= ruleTalk ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=18 && LA5_0<=26)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalProgram.g:306:1: (lv_talks_8_0= ruleTalk )
                    	    {
                    	    // InternalProgram.g:306:1: (lv_talks_8_0= ruleTalk )
                    	    // InternalProgram.g:307:3: lv_talks_8_0= ruleTalk
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSessionAccess().getTalksTalkParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_9);
                    	    lv_talks_8_0=ruleTalk();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSessionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"talks",
                    	            		lv_talks_8_0, 
                    	            		"fr.irisa.models.program.Program.Talk");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

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


    // $ANTLR start "entryRuleTalk"
    // InternalProgram.g:331:1: entryRuleTalk returns [EObject current=null] : iv_ruleTalk= ruleTalk EOF ;
    public final EObject entryRuleTalk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTalk = null;


        try {
            // InternalProgram.g:332:2: (iv_ruleTalk= ruleTalk EOF )
            // InternalProgram.g:333:2: iv_ruleTalk= ruleTalk EOF
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
    // InternalProgram.g:340:1: ruleTalk returns [EObject current=null] : ( ( (lv_type_0_0= ruleTalkType ) ) otherlv_1= ':' ( ( (lv_tilte_2_0= RULE_STRING ) ) otherlv_3= ',' )? ( (lv_room_4_0= ruleRoom ) ) (otherlv_5= '(' ( ( (lv_speakers_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_speakers_8_0= RULE_STRING ) ) )* )? otherlv_9= ')' )? ) ;
    public final EObject ruleTalk() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_tilte_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_speakers_6_0=null;
        Token otherlv_7=null;
        Token lv_speakers_8_0=null;
        Token otherlv_9=null;
        Enumerator lv_type_0_0 = null;

        Enumerator lv_room_4_0 = null;


         enterRule(); 
            
        try {
            // InternalProgram.g:343:28: ( ( ( (lv_type_0_0= ruleTalkType ) ) otherlv_1= ':' ( ( (lv_tilte_2_0= RULE_STRING ) ) otherlv_3= ',' )? ( (lv_room_4_0= ruleRoom ) ) (otherlv_5= '(' ( ( (lv_speakers_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_speakers_8_0= RULE_STRING ) ) )* )? otherlv_9= ')' )? ) )
            // InternalProgram.g:344:1: ( ( (lv_type_0_0= ruleTalkType ) ) otherlv_1= ':' ( ( (lv_tilte_2_0= RULE_STRING ) ) otherlv_3= ',' )? ( (lv_room_4_0= ruleRoom ) ) (otherlv_5= '(' ( ( (lv_speakers_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_speakers_8_0= RULE_STRING ) ) )* )? otherlv_9= ')' )? )
            {
            // InternalProgram.g:344:1: ( ( (lv_type_0_0= ruleTalkType ) ) otherlv_1= ':' ( ( (lv_tilte_2_0= RULE_STRING ) ) otherlv_3= ',' )? ( (lv_room_4_0= ruleRoom ) ) (otherlv_5= '(' ( ( (lv_speakers_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_speakers_8_0= RULE_STRING ) ) )* )? otherlv_9= ')' )? )
            // InternalProgram.g:344:2: ( (lv_type_0_0= ruleTalkType ) ) otherlv_1= ':' ( ( (lv_tilte_2_0= RULE_STRING ) ) otherlv_3= ',' )? ( (lv_room_4_0= ruleRoom ) ) (otherlv_5= '(' ( ( (lv_speakers_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_speakers_8_0= RULE_STRING ) ) )* )? otherlv_9= ')' )?
            {
            // InternalProgram.g:344:2: ( (lv_type_0_0= ruleTalkType ) )
            // InternalProgram.g:345:1: (lv_type_0_0= ruleTalkType )
            {
            // InternalProgram.g:345:1: (lv_type_0_0= ruleTalkType )
            // InternalProgram.g:346:3: lv_type_0_0= ruleTalkType
            {
             
            	        newCompositeNode(grammarAccess.getTalkAccess().getTypeTalkTypeEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_4);
            lv_type_0_0=ruleTalkType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTalkRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"fr.irisa.models.program.Program.TalkType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_10); 

                	newLeafNode(otherlv_1, grammarAccess.getTalkAccess().getColonKeyword_1());
                
            // InternalProgram.g:366:1: ( ( (lv_tilte_2_0= RULE_STRING ) ) otherlv_3= ',' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalProgram.g:366:2: ( (lv_tilte_2_0= RULE_STRING ) ) otherlv_3= ','
                    {
                    // InternalProgram.g:366:2: ( (lv_tilte_2_0= RULE_STRING ) )
                    // InternalProgram.g:367:1: (lv_tilte_2_0= RULE_STRING )
                    {
                    // InternalProgram.g:367:1: (lv_tilte_2_0= RULE_STRING )
                    // InternalProgram.g:368:3: lv_tilte_2_0= RULE_STRING
                    {
                    lv_tilte_2_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    			newLeafNode(lv_tilte_2_0, grammarAccess.getTalkAccess().getTilteSTRINGTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTalkRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"tilte",
                            		lv_tilte_2_0, 
                            		"org.eclipse.xtext.common.Terminals.STRING");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,15,FOLLOW_10); 

                        	newLeafNode(otherlv_3, grammarAccess.getTalkAccess().getCommaKeyword_2_1());
                        

                    }
                    break;

            }

            // InternalProgram.g:388:3: ( (lv_room_4_0= ruleRoom ) )
            // InternalProgram.g:389:1: (lv_room_4_0= ruleRoom )
            {
            // InternalProgram.g:389:1: (lv_room_4_0= ruleRoom )
            // InternalProgram.g:390:3: lv_room_4_0= ruleRoom
            {
             
            	        newCompositeNode(grammarAccess.getTalkAccess().getRoomRoomEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_12);
            lv_room_4_0=ruleRoom();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTalkRule());
            	        }
                   		set(
                   			current, 
                   			"room",
                    		lv_room_4_0, 
                    		"fr.irisa.models.program.Program.Room");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalProgram.g:406:2: (otherlv_5= '(' ( ( (lv_speakers_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_speakers_8_0= RULE_STRING ) ) )* )? otherlv_9= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalProgram.g:406:4: otherlv_5= '(' ( ( (lv_speakers_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_speakers_8_0= RULE_STRING ) ) )* )? otherlv_9= ')'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_13); 

                        	newLeafNode(otherlv_5, grammarAccess.getTalkAccess().getLeftParenthesisKeyword_4_0());
                        
                    // InternalProgram.g:410:1: ( ( (lv_speakers_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_speakers_8_0= RULE_STRING ) ) )* )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_STRING) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalProgram.g:410:2: ( (lv_speakers_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_speakers_8_0= RULE_STRING ) ) )*
                            {
                            // InternalProgram.g:410:2: ( (lv_speakers_6_0= RULE_STRING ) )
                            // InternalProgram.g:411:1: (lv_speakers_6_0= RULE_STRING )
                            {
                            // InternalProgram.g:411:1: (lv_speakers_6_0= RULE_STRING )
                            // InternalProgram.g:412:3: lv_speakers_6_0= RULE_STRING
                            {
                            lv_speakers_6_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                            			newLeafNode(lv_speakers_6_0, grammarAccess.getTalkAccess().getSpeakersSTRINGTerminalRuleCall_4_1_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTalkRule());
                            	        }
                                   		addWithLastConsumed(
                                   			current, 
                                   			"speakers",
                                    		lv_speakers_6_0, 
                                    		"org.eclipse.xtext.common.Terminals.STRING");
                            	    

                            }


                            }

                            // InternalProgram.g:428:2: (otherlv_7= ',' ( (lv_speakers_8_0= RULE_STRING ) ) )*
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( (LA8_0==15) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // InternalProgram.g:428:4: otherlv_7= ',' ( (lv_speakers_8_0= RULE_STRING ) )
                            	    {
                            	    otherlv_7=(Token)match(input,15,FOLLOW_6); 

                            	        	newLeafNode(otherlv_7, grammarAccess.getTalkAccess().getCommaKeyword_4_1_1_0());
                            	        
                            	    // InternalProgram.g:432:1: ( (lv_speakers_8_0= RULE_STRING ) )
                            	    // InternalProgram.g:433:1: (lv_speakers_8_0= RULE_STRING )
                            	    {
                            	    // InternalProgram.g:433:1: (lv_speakers_8_0= RULE_STRING )
                            	    // InternalProgram.g:434:3: lv_speakers_8_0= RULE_STRING
                            	    {
                            	    lv_speakers_8_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                            	    			newLeafNode(lv_speakers_8_0, grammarAccess.getTalkAccess().getSpeakersSTRINGTerminalRuleCall_4_1_1_1_0()); 
                            	    		

                            	    	        if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getTalkRule());
                            	    	        }
                            	           		addWithLastConsumed(
                            	           			current, 
                            	           			"speakers",
                            	            		lv_speakers_8_0, 
                            	            		"org.eclipse.xtext.common.Terminals.STRING");
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop8;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,17,FOLLOW_2); 

                        	newLeafNode(otherlv_9, grammarAccess.getTalkAccess().getRightParenthesisKeyword_4_2());
                        

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
    // $ANTLR end "ruleTalk"


    // $ANTLR start "ruleTalkType"
    // InternalProgram.g:462:1: ruleTalkType returns [Enumerator current=null] : ( (enumLiteral_0= 'Workshop' ) | (enumLiteral_1= 'Tutorial' ) | (enumLiteral_2= 'Symposium' ) | (enumLiteral_3= 'Clinic' ) | (enumLiteral_4= 'Break' ) | (enumLiteral_5= 'Lunch' ) | (enumLiteral_6= 'Poster' ) | (enumLiteral_7= 'SRC' ) | (enumLiteral_8= 'Main' ) ) ;
    public final Enumerator ruleTalkType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;

         enterRule(); 
        try {
            // InternalProgram.g:464:28: ( ( (enumLiteral_0= 'Workshop' ) | (enumLiteral_1= 'Tutorial' ) | (enumLiteral_2= 'Symposium' ) | (enumLiteral_3= 'Clinic' ) | (enumLiteral_4= 'Break' ) | (enumLiteral_5= 'Lunch' ) | (enumLiteral_6= 'Poster' ) | (enumLiteral_7= 'SRC' ) | (enumLiteral_8= 'Main' ) ) )
            // InternalProgram.g:465:1: ( (enumLiteral_0= 'Workshop' ) | (enumLiteral_1= 'Tutorial' ) | (enumLiteral_2= 'Symposium' ) | (enumLiteral_3= 'Clinic' ) | (enumLiteral_4= 'Break' ) | (enumLiteral_5= 'Lunch' ) | (enumLiteral_6= 'Poster' ) | (enumLiteral_7= 'SRC' ) | (enumLiteral_8= 'Main' ) )
            {
            // InternalProgram.g:465:1: ( (enumLiteral_0= 'Workshop' ) | (enumLiteral_1= 'Tutorial' ) | (enumLiteral_2= 'Symposium' ) | (enumLiteral_3= 'Clinic' ) | (enumLiteral_4= 'Break' ) | (enumLiteral_5= 'Lunch' ) | (enumLiteral_6= 'Poster' ) | (enumLiteral_7= 'SRC' ) | (enumLiteral_8= 'Main' ) )
            int alt11=9;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt11=1;
                }
                break;
            case 19:
                {
                alt11=2;
                }
                break;
            case 20:
                {
                alt11=3;
                }
                break;
            case 21:
                {
                alt11=4;
                }
                break;
            case 22:
                {
                alt11=5;
                }
                break;
            case 23:
                {
                alt11=6;
                }
                break;
            case 24:
                {
                alt11=7;
                }
                break;
            case 25:
                {
                alt11=8;
                }
                break;
            case 26:
                {
                alt11=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalProgram.g:465:2: (enumLiteral_0= 'Workshop' )
                    {
                    // InternalProgram.g:465:2: (enumLiteral_0= 'Workshop' )
                    // InternalProgram.g:465:4: enumLiteral_0= 'Workshop'
                    {
                    enumLiteral_0=(Token)match(input,18,FOLLOW_2); 

                            current = grammarAccess.getTalkTypeAccess().getWorkshopEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTalkTypeAccess().getWorkshopEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalProgram.g:471:6: (enumLiteral_1= 'Tutorial' )
                    {
                    // InternalProgram.g:471:6: (enumLiteral_1= 'Tutorial' )
                    // InternalProgram.g:471:8: enumLiteral_1= 'Tutorial'
                    {
                    enumLiteral_1=(Token)match(input,19,FOLLOW_2); 

                            current = grammarAccess.getTalkTypeAccess().getTutorialEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTalkTypeAccess().getTutorialEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalProgram.g:477:6: (enumLiteral_2= 'Symposium' )
                    {
                    // InternalProgram.g:477:6: (enumLiteral_2= 'Symposium' )
                    // InternalProgram.g:477:8: enumLiteral_2= 'Symposium'
                    {
                    enumLiteral_2=(Token)match(input,20,FOLLOW_2); 

                            current = grammarAccess.getTalkTypeAccess().getSymposiumEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTalkTypeAccess().getSymposiumEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalProgram.g:483:6: (enumLiteral_3= 'Clinic' )
                    {
                    // InternalProgram.g:483:6: (enumLiteral_3= 'Clinic' )
                    // InternalProgram.g:483:8: enumLiteral_3= 'Clinic'
                    {
                    enumLiteral_3=(Token)match(input,21,FOLLOW_2); 

                            current = grammarAccess.getTalkTypeAccess().getClinicEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTalkTypeAccess().getClinicEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalProgram.g:489:6: (enumLiteral_4= 'Break' )
                    {
                    // InternalProgram.g:489:6: (enumLiteral_4= 'Break' )
                    // InternalProgram.g:489:8: enumLiteral_4= 'Break'
                    {
                    enumLiteral_4=(Token)match(input,22,FOLLOW_2); 

                            current = grammarAccess.getTalkTypeAccess().getBreakEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getTalkTypeAccess().getBreakEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // InternalProgram.g:495:6: (enumLiteral_5= 'Lunch' )
                    {
                    // InternalProgram.g:495:6: (enumLiteral_5= 'Lunch' )
                    // InternalProgram.g:495:8: enumLiteral_5= 'Lunch'
                    {
                    enumLiteral_5=(Token)match(input,23,FOLLOW_2); 

                            current = grammarAccess.getTalkTypeAccess().getLunchEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getTalkTypeAccess().getLunchEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // InternalProgram.g:501:6: (enumLiteral_6= 'Poster' )
                    {
                    // InternalProgram.g:501:6: (enumLiteral_6= 'Poster' )
                    // InternalProgram.g:501:8: enumLiteral_6= 'Poster'
                    {
                    enumLiteral_6=(Token)match(input,24,FOLLOW_2); 

                            current = grammarAccess.getTalkTypeAccess().getPosterEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getTalkTypeAccess().getPosterEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // InternalProgram.g:507:6: (enumLiteral_7= 'SRC' )
                    {
                    // InternalProgram.g:507:6: (enumLiteral_7= 'SRC' )
                    // InternalProgram.g:507:8: enumLiteral_7= 'SRC'
                    {
                    enumLiteral_7=(Token)match(input,25,FOLLOW_2); 

                            current = grammarAccess.getTalkTypeAccess().getSRCEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getTalkTypeAccess().getSRCEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // InternalProgram.g:513:6: (enumLiteral_8= 'Main' )
                    {
                    // InternalProgram.g:513:6: (enumLiteral_8= 'Main' )
                    // InternalProgram.g:513:8: enumLiteral_8= 'Main'
                    {
                    enumLiteral_8=(Token)match(input,26,FOLLOW_2); 

                            current = grammarAccess.getTalkTypeAccess().getMainEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getTalkTypeAccess().getMainEnumLiteralDeclaration_8()); 
                        

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
    // $ANTLR end "ruleTalkType"


    // $ANTLR start "ruleRoom"
    // InternalProgram.g:523:1: ruleRoom returns [Enumerator current=null] : ( (enumLiteral_0= 'Bouvet 1' ) | (enumLiteral_1= 'Bouvet 2' ) | (enumLiteral_2= 'Charcot' ) | (enumLiteral_3= 'Vauban 1' ) | (enumLiteral_4= 'Vauban 2' ) | (enumLiteral_5= 'Lamannais 1' ) | (enumLiteral_6= 'Lamennais 2' ) | (enumLiteral_7= 'Lamennais 3' ) | (enumLiteral_8= 'Rotonde Surcouf' ) | (enumLiteral_9= 'Chateaubriand' ) | (enumLiteral_10= 'Lamennais 1+2' ) | (enumLiteral_11= 'Lamennais 4+5' ) | (enumLiteral_12= 'Grand Large' ) | (enumLiteral_13= 'Rotonde J. Cartier' ) ) ;
    public final Enumerator ruleRoom() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;

         enterRule(); 
        try {
            // InternalProgram.g:525:28: ( ( (enumLiteral_0= 'Bouvet 1' ) | (enumLiteral_1= 'Bouvet 2' ) | (enumLiteral_2= 'Charcot' ) | (enumLiteral_3= 'Vauban 1' ) | (enumLiteral_4= 'Vauban 2' ) | (enumLiteral_5= 'Lamannais 1' ) | (enumLiteral_6= 'Lamennais 2' ) | (enumLiteral_7= 'Lamennais 3' ) | (enumLiteral_8= 'Rotonde Surcouf' ) | (enumLiteral_9= 'Chateaubriand' ) | (enumLiteral_10= 'Lamennais 1+2' ) | (enumLiteral_11= 'Lamennais 4+5' ) | (enumLiteral_12= 'Grand Large' ) | (enumLiteral_13= 'Rotonde J. Cartier' ) ) )
            // InternalProgram.g:526:1: ( (enumLiteral_0= 'Bouvet 1' ) | (enumLiteral_1= 'Bouvet 2' ) | (enumLiteral_2= 'Charcot' ) | (enumLiteral_3= 'Vauban 1' ) | (enumLiteral_4= 'Vauban 2' ) | (enumLiteral_5= 'Lamannais 1' ) | (enumLiteral_6= 'Lamennais 2' ) | (enumLiteral_7= 'Lamennais 3' ) | (enumLiteral_8= 'Rotonde Surcouf' ) | (enumLiteral_9= 'Chateaubriand' ) | (enumLiteral_10= 'Lamennais 1+2' ) | (enumLiteral_11= 'Lamennais 4+5' ) | (enumLiteral_12= 'Grand Large' ) | (enumLiteral_13= 'Rotonde J. Cartier' ) )
            {
            // InternalProgram.g:526:1: ( (enumLiteral_0= 'Bouvet 1' ) | (enumLiteral_1= 'Bouvet 2' ) | (enumLiteral_2= 'Charcot' ) | (enumLiteral_3= 'Vauban 1' ) | (enumLiteral_4= 'Vauban 2' ) | (enumLiteral_5= 'Lamannais 1' ) | (enumLiteral_6= 'Lamennais 2' ) | (enumLiteral_7= 'Lamennais 3' ) | (enumLiteral_8= 'Rotonde Surcouf' ) | (enumLiteral_9= 'Chateaubriand' ) | (enumLiteral_10= 'Lamennais 1+2' ) | (enumLiteral_11= 'Lamennais 4+5' ) | (enumLiteral_12= 'Grand Large' ) | (enumLiteral_13= 'Rotonde J. Cartier' ) )
            int alt12=14;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt12=1;
                }
                break;
            case 28:
                {
                alt12=2;
                }
                break;
            case 29:
                {
                alt12=3;
                }
                break;
            case 30:
                {
                alt12=4;
                }
                break;
            case 31:
                {
                alt12=5;
                }
                break;
            case 32:
                {
                alt12=6;
                }
                break;
            case 33:
                {
                alt12=7;
                }
                break;
            case 34:
                {
                alt12=8;
                }
                break;
            case 35:
                {
                alt12=9;
                }
                break;
            case 36:
                {
                alt12=10;
                }
                break;
            case 37:
                {
                alt12=11;
                }
                break;
            case 38:
                {
                alt12=12;
                }
                break;
            case 39:
                {
                alt12=13;
                }
                break;
            case 40:
                {
                alt12=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalProgram.g:526:2: (enumLiteral_0= 'Bouvet 1' )
                    {
                    // InternalProgram.g:526:2: (enumLiteral_0= 'Bouvet 1' )
                    // InternalProgram.g:526:4: enumLiteral_0= 'Bouvet 1'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                            current = grammarAccess.getRoomAccess().getBouvet1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRoomAccess().getBouvet1EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalProgram.g:532:6: (enumLiteral_1= 'Bouvet 2' )
                    {
                    // InternalProgram.g:532:6: (enumLiteral_1= 'Bouvet 2' )
                    // InternalProgram.g:532:8: enumLiteral_1= 'Bouvet 2'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                            current = grammarAccess.getRoomAccess().getBouvet2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getRoomAccess().getBouvet2EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalProgram.g:538:6: (enumLiteral_2= 'Charcot' )
                    {
                    // InternalProgram.g:538:6: (enumLiteral_2= 'Charcot' )
                    // InternalProgram.g:538:8: enumLiteral_2= 'Charcot'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_2); 

                            current = grammarAccess.getRoomAccess().getCharcotEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getRoomAccess().getCharcotEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalProgram.g:544:6: (enumLiteral_3= 'Vauban 1' )
                    {
                    // InternalProgram.g:544:6: (enumLiteral_3= 'Vauban 1' )
                    // InternalProgram.g:544:8: enumLiteral_3= 'Vauban 1'
                    {
                    enumLiteral_3=(Token)match(input,30,FOLLOW_2); 

                            current = grammarAccess.getRoomAccess().getVauban1EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getRoomAccess().getVauban1EnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalProgram.g:550:6: (enumLiteral_4= 'Vauban 2' )
                    {
                    // InternalProgram.g:550:6: (enumLiteral_4= 'Vauban 2' )
                    // InternalProgram.g:550:8: enumLiteral_4= 'Vauban 2'
                    {
                    enumLiteral_4=(Token)match(input,31,FOLLOW_2); 

                            current = grammarAccess.getRoomAccess().getVauban2EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getRoomAccess().getVauban2EnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // InternalProgram.g:556:6: (enumLiteral_5= 'Lamannais 1' )
                    {
                    // InternalProgram.g:556:6: (enumLiteral_5= 'Lamannais 1' )
                    // InternalProgram.g:556:8: enumLiteral_5= 'Lamannais 1'
                    {
                    enumLiteral_5=(Token)match(input,32,FOLLOW_2); 

                            current = grammarAccess.getRoomAccess().getLamannais1EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getRoomAccess().getLamannais1EnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // InternalProgram.g:562:6: (enumLiteral_6= 'Lamennais 2' )
                    {
                    // InternalProgram.g:562:6: (enumLiteral_6= 'Lamennais 2' )
                    // InternalProgram.g:562:8: enumLiteral_6= 'Lamennais 2'
                    {
                    enumLiteral_6=(Token)match(input,33,FOLLOW_2); 

                            current = grammarAccess.getRoomAccess().getLamennais2EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getRoomAccess().getLamennais2EnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // InternalProgram.g:568:6: (enumLiteral_7= 'Lamennais 3' )
                    {
                    // InternalProgram.g:568:6: (enumLiteral_7= 'Lamennais 3' )
                    // InternalProgram.g:568:8: enumLiteral_7= 'Lamennais 3'
                    {
                    enumLiteral_7=(Token)match(input,34,FOLLOW_2); 

                            current = grammarAccess.getRoomAccess().getLamennais3EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getRoomAccess().getLamennais3EnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // InternalProgram.g:574:6: (enumLiteral_8= 'Rotonde Surcouf' )
                    {
                    // InternalProgram.g:574:6: (enumLiteral_8= 'Rotonde Surcouf' )
                    // InternalProgram.g:574:8: enumLiteral_8= 'Rotonde Surcouf'
                    {
                    enumLiteral_8=(Token)match(input,35,FOLLOW_2); 

                            current = grammarAccess.getRoomAccess().getRotondeSurcoufEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getRoomAccess().getRotondeSurcoufEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // InternalProgram.g:580:6: (enumLiteral_9= 'Chateaubriand' )
                    {
                    // InternalProgram.g:580:6: (enumLiteral_9= 'Chateaubriand' )
                    // InternalProgram.g:580:8: enumLiteral_9= 'Chateaubriand'
                    {
                    enumLiteral_9=(Token)match(input,36,FOLLOW_2); 

                            current = grammarAccess.getRoomAccess().getChateaubriandEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getRoomAccess().getChateaubriandEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // InternalProgram.g:586:6: (enumLiteral_10= 'Lamennais 1+2' )
                    {
                    // InternalProgram.g:586:6: (enumLiteral_10= 'Lamennais 1+2' )
                    // InternalProgram.g:586:8: enumLiteral_10= 'Lamennais 1+2'
                    {
                    enumLiteral_10=(Token)match(input,37,FOLLOW_2); 

                            current = grammarAccess.getRoomAccess().getLamennais12EnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getRoomAccess().getLamennais12EnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // InternalProgram.g:592:6: (enumLiteral_11= 'Lamennais 4+5' )
                    {
                    // InternalProgram.g:592:6: (enumLiteral_11= 'Lamennais 4+5' )
                    // InternalProgram.g:592:8: enumLiteral_11= 'Lamennais 4+5'
                    {
                    enumLiteral_11=(Token)match(input,38,FOLLOW_2); 

                            current = grammarAccess.getRoomAccess().getLamennais45EnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getRoomAccess().getLamennais45EnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // InternalProgram.g:598:6: (enumLiteral_12= 'Grand Large' )
                    {
                    // InternalProgram.g:598:6: (enumLiteral_12= 'Grand Large' )
                    // InternalProgram.g:598:8: enumLiteral_12= 'Grand Large'
                    {
                    enumLiteral_12=(Token)match(input,39,FOLLOW_2); 

                            current = grammarAccess.getRoomAccess().getGrandLargeEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getRoomAccess().getGrandLargeEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // InternalProgram.g:604:6: (enumLiteral_13= 'Rotonde J. Cartier' )
                    {
                    // InternalProgram.g:604:6: (enumLiteral_13= 'Rotonde J. Cartier' )
                    // InternalProgram.g:604:8: enumLiteral_13= 'Rotonde J. Cartier'
                    {
                    enumLiteral_13=(Token)match(input,40,FOLLOW_2); 

                            current = grammarAccess.getRoomAccess().getRotondeJCartierEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getRoomAccess().getRotondeJCartierEnumLiteralDeclaration_13()); 
                        

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
    // $ANTLR end "ruleRoom"


    // $ANTLR start "ruleWeekDay"
    // InternalProgram.g:614:1: ruleWeekDay returns [Enumerator current=null] : ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) ) ;
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
            // InternalProgram.g:616:28: ( ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) ) )
            // InternalProgram.g:617:1: ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) )
            {
            // InternalProgram.g:617:1: ( (enumLiteral_0= 'Monday' ) | (enumLiteral_1= 'Tuesday' ) | (enumLiteral_2= 'Wednesday' ) | (enumLiteral_3= 'Thursday' ) | (enumLiteral_4= 'Friday' ) | (enumLiteral_5= 'Saturday' ) | (enumLiteral_6= 'Sunday' ) )
            int alt13=7;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt13=1;
                }
                break;
            case 42:
                {
                alt13=2;
                }
                break;
            case 43:
                {
                alt13=3;
                }
                break;
            case 44:
                {
                alt13=4;
                }
                break;
            case 45:
                {
                alt13=5;
                }
                break;
            case 46:
                {
                alt13=6;
                }
                break;
            case 47:
                {
                alt13=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalProgram.g:617:2: (enumLiteral_0= 'Monday' )
                    {
                    // InternalProgram.g:617:2: (enumLiteral_0= 'Monday' )
                    // InternalProgram.g:617:4: enumLiteral_0= 'Monday'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                            current = grammarAccess.getWeekDayAccess().getMondayEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getWeekDayAccess().getMondayEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalProgram.g:623:6: (enumLiteral_1= 'Tuesday' )
                    {
                    // InternalProgram.g:623:6: (enumLiteral_1= 'Tuesday' )
                    // InternalProgram.g:623:8: enumLiteral_1= 'Tuesday'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                            current = grammarAccess.getWeekDayAccess().getTuesdayEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getWeekDayAccess().getTuesdayEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalProgram.g:629:6: (enumLiteral_2= 'Wednesday' )
                    {
                    // InternalProgram.g:629:6: (enumLiteral_2= 'Wednesday' )
                    // InternalProgram.g:629:8: enumLiteral_2= 'Wednesday'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

                            current = grammarAccess.getWeekDayAccess().getWednesdayEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getWeekDayAccess().getWednesdayEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalProgram.g:635:6: (enumLiteral_3= 'Thursday' )
                    {
                    // InternalProgram.g:635:6: (enumLiteral_3= 'Thursday' )
                    // InternalProgram.g:635:8: enumLiteral_3= 'Thursday'
                    {
                    enumLiteral_3=(Token)match(input,44,FOLLOW_2); 

                            current = grammarAccess.getWeekDayAccess().getThursdayEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getWeekDayAccess().getThursdayEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalProgram.g:641:6: (enumLiteral_4= 'Friday' )
                    {
                    // InternalProgram.g:641:6: (enumLiteral_4= 'Friday' )
                    // InternalProgram.g:641:8: enumLiteral_4= 'Friday'
                    {
                    enumLiteral_4=(Token)match(input,45,FOLLOW_2); 

                            current = grammarAccess.getWeekDayAccess().getFridayEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getWeekDayAccess().getFridayEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // InternalProgram.g:647:6: (enumLiteral_5= 'Saturday' )
                    {
                    // InternalProgram.g:647:6: (enumLiteral_5= 'Saturday' )
                    // InternalProgram.g:647:8: enumLiteral_5= 'Saturday'
                    {
                    enumLiteral_5=(Token)match(input,46,FOLLOW_2); 

                            current = grammarAccess.getWeekDayAccess().getSaturdayEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getWeekDayAccess().getSaturdayEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // InternalProgram.g:653:6: (enumLiteral_6= 'Sunday' )
                    {
                    // InternalProgram.g:653:6: (enumLiteral_6= 'Sunday' )
                    // InternalProgram.g:653:8: enumLiteral_6= 'Sunday'
                    {
                    enumLiteral_6=(Token)match(input,47,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000FE0000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000007FC0002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000001FFF8000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000028000L});

}