package fr.inria.diverse.models2016.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.inria.diverse.models2016.dsl.services.ProgramGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProgramParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Monday'", "'Tuesday'", "'Wednesday'", "'Thursday'", "'Friday'", "'Saturday'", "'Sunday'", "'Conference'", "'talk duration'", "'kinds'", "','", "'resources'", "'papers'", "'{'", "'}'", "';'", "'events'", "'program'", "'room'", "'capacity'", "'date'", "'.'", "':'", "'-'", "'in'", "'TalkSession'", "'chair'", "'abstract'", "'Panel'", "'panelists'", "'moderators'", "'SRC'", "'Poster'", "'Keynote'", "'speaker'", "'SponsorKeynote'", "'Workshop'", "'url'", "'name'", "'organizers'", "'Tutorial'", "'DoctoralSymposium'", "'EducatorSymposium'", "'Reception'", "'Clinic'", "'Lunch'", "'CoffeeBreak'", "'Meeting'", "'Opening'", "'authors'", "'preprint'", "'kind'", "'email'", "'homepage'"
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

    	public void setGrammarAccess(ProgramGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleConference"
    // InternalProgram.g:53:1: entryRuleConference : ruleConference EOF ;
    public final void entryRuleConference() throws RecognitionException {
        try {
            // InternalProgram.g:54:1: ( ruleConference EOF )
            // InternalProgram.g:55:1: ruleConference EOF
            {
             before(grammarAccess.getConferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleConference();

            state._fsp--;

             after(grammarAccess.getConferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConference"


    // $ANTLR start "ruleConference"
    // InternalProgram.g:62:1: ruleConference : ( ( rule__Conference__Group__0 ) ) ;
    public final void ruleConference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:66:2: ( ( ( rule__Conference__Group__0 ) ) )
            // InternalProgram.g:67:2: ( ( rule__Conference__Group__0 ) )
            {
            // InternalProgram.g:67:2: ( ( rule__Conference__Group__0 ) )
            // InternalProgram.g:68:3: ( rule__Conference__Group__0 )
            {
             before(grammarAccess.getConferenceAccess().getGroup()); 
            // InternalProgram.g:69:3: ( rule__Conference__Group__0 )
            // InternalProgram.g:69:4: rule__Conference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Conference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConference"


    // $ANTLR start "entryRuleResource"
    // InternalProgram.g:78:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // InternalProgram.g:79:1: ( ruleResource EOF )
            // InternalProgram.g:80:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getResourceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalProgram.g:87:1: ruleResource : ( ruleRoom ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:91:2: ( ( ruleRoom ) )
            // InternalProgram.g:92:2: ( ruleRoom )
            {
            // InternalProgram.g:92:2: ( ruleRoom )
            // InternalProgram.g:93:3: ruleRoom
            {
             before(grammarAccess.getResourceAccess().getRoomParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getRoomParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleEvent"
    // InternalProgram.g:103:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalProgram.g:104:1: ( ruleEvent EOF )
            // InternalProgram.g:105:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalProgram.g:112:1: ruleEvent : ( ( rule__Event__Alternatives ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:116:2: ( ( ( rule__Event__Alternatives ) ) )
            // InternalProgram.g:117:2: ( ( rule__Event__Alternatives ) )
            {
            // InternalProgram.g:117:2: ( ( rule__Event__Alternatives ) )
            // InternalProgram.g:118:3: ( rule__Event__Alternatives )
            {
             before(grammarAccess.getEventAccess().getAlternatives()); 
            // InternalProgram.g:119:3: ( rule__Event__Alternatives )
            // InternalProgram.g:119:4: rule__Event__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Event__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleEString"
    // InternalProgram.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalProgram.g:129:1: ( ruleEString EOF )
            // InternalProgram.g:130:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalProgram.g:137:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:141:2: ( ( RULE_STRING ) )
            // InternalProgram.g:142:2: ( RULE_STRING )
            {
            // InternalProgram.g:142:2: ( RULE_STRING )
            // InternalProgram.g:143:3: RULE_STRING
            {
             before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleProgram"
    // InternalProgram.g:153:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalProgram.g:154:1: ( ruleProgram EOF )
            // InternalProgram.g:155:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalProgram.g:162:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:166:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalProgram.g:167:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalProgram.g:167:2: ( ( rule__Program__Group__0 ) )
            // InternalProgram.g:168:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalProgram.g:169:3: ( rule__Program__Group__0 )
            // InternalProgram.g:169:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleRoom"
    // InternalProgram.g:178:1: entryRuleRoom : ruleRoom EOF ;
    public final void entryRuleRoom() throws RecognitionException {
        try {
            // InternalProgram.g:179:1: ( ruleRoom EOF )
            // InternalProgram.g:180:1: ruleRoom EOF
            {
             before(grammarAccess.getRoomRule()); 
            pushFollow(FOLLOW_1);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getRoomRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoom"


    // $ANTLR start "ruleRoom"
    // InternalProgram.g:187:1: ruleRoom : ( ( rule__Room__Group__0 ) ) ;
    public final void ruleRoom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:191:2: ( ( ( rule__Room__Group__0 ) ) )
            // InternalProgram.g:192:2: ( ( rule__Room__Group__0 ) )
            {
            // InternalProgram.g:192:2: ( ( rule__Room__Group__0 ) )
            // InternalProgram.g:193:3: ( rule__Room__Group__0 )
            {
             before(grammarAccess.getRoomAccess().getGroup()); 
            // InternalProgram.g:194:3: ( rule__Room__Group__0 )
            // InternalProgram.g:194:4: rule__Room__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoom"


    // $ANTLR start "entryRuleEIntegerObject"
    // InternalProgram.g:203:1: entryRuleEIntegerObject : ruleEIntegerObject EOF ;
    public final void entryRuleEIntegerObject() throws RecognitionException {
        try {
            // InternalProgram.g:204:1: ( ruleEIntegerObject EOF )
            // InternalProgram.g:205:1: ruleEIntegerObject EOF
            {
             before(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getEIntegerObjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEIntegerObject"


    // $ANTLR start "ruleEIntegerObject"
    // InternalProgram.g:212:1: ruleEIntegerObject : ( RULE_INT ) ;
    public final void ruleEIntegerObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:216:2: ( ( RULE_INT ) )
            // InternalProgram.g:217:2: ( RULE_INT )
            {
            // InternalProgram.g:217:2: ( RULE_INT )
            // InternalProgram.g:218:3: RULE_INT
            {
             before(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEIntegerObject"


    // $ANTLR start "entryRuleDay"
    // InternalProgram.g:228:1: entryRuleDay : ruleDay EOF ;
    public final void entryRuleDay() throws RecognitionException {
        try {
            // InternalProgram.g:229:1: ( ruleDay EOF )
            // InternalProgram.g:230:1: ruleDay EOF
            {
             before(grammarAccess.getDayRule()); 
            pushFollow(FOLLOW_1);
            ruleDay();

            state._fsp--;

             after(grammarAccess.getDayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDay"


    // $ANTLR start "ruleDay"
    // InternalProgram.g:237:1: ruleDay : ( ( rule__Day__Group__0 ) ) ;
    public final void ruleDay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:241:2: ( ( ( rule__Day__Group__0 ) ) )
            // InternalProgram.g:242:2: ( ( rule__Day__Group__0 ) )
            {
            // InternalProgram.g:242:2: ( ( rule__Day__Group__0 ) )
            // InternalProgram.g:243:3: ( rule__Day__Group__0 )
            {
             before(grammarAccess.getDayAccess().getGroup()); 
            // InternalProgram.g:244:3: ( rule__Day__Group__0 )
            // InternalProgram.g:244:4: rule__Day__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Day__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDay"


    // $ANTLR start "entryRuleDayDataType"
    // InternalProgram.g:253:1: entryRuleDayDataType : ruleDayDataType EOF ;
    public final void entryRuleDayDataType() throws RecognitionException {
        try {
            // InternalProgram.g:254:1: ( ruleDayDataType EOF )
            // InternalProgram.g:255:1: ruleDayDataType EOF
            {
             before(grammarAccess.getDayDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDayDataType();

            state._fsp--;

             after(grammarAccess.getDayDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDayDataType"


    // $ANTLR start "ruleDayDataType"
    // InternalProgram.g:262:1: ruleDayDataType : ( ( rule__DayDataType__Group__0 ) ) ;
    public final void ruleDayDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:266:2: ( ( ( rule__DayDataType__Group__0 ) ) )
            // InternalProgram.g:267:2: ( ( rule__DayDataType__Group__0 ) )
            {
            // InternalProgram.g:267:2: ( ( rule__DayDataType__Group__0 ) )
            // InternalProgram.g:268:3: ( rule__DayDataType__Group__0 )
            {
             before(grammarAccess.getDayDataTypeAccess().getGroup()); 
            // InternalProgram.g:269:3: ( rule__DayDataType__Group__0 )
            // InternalProgram.g:269:4: rule__DayDataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DayDataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDayDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDayDataType"


    // $ANTLR start "entryRuleHourDataType"
    // InternalProgram.g:278:1: entryRuleHourDataType : ruleHourDataType EOF ;
    public final void entryRuleHourDataType() throws RecognitionException {
        try {
            // InternalProgram.g:279:1: ( ruleHourDataType EOF )
            // InternalProgram.g:280:1: ruleHourDataType EOF
            {
             before(grammarAccess.getHourDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleHourDataType();

            state._fsp--;

             after(grammarAccess.getHourDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHourDataType"


    // $ANTLR start "ruleHourDataType"
    // InternalProgram.g:287:1: ruleHourDataType : ( ( rule__HourDataType__Group__0 ) ) ;
    public final void ruleHourDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:291:2: ( ( ( rule__HourDataType__Group__0 ) ) )
            // InternalProgram.g:292:2: ( ( rule__HourDataType__Group__0 ) )
            {
            // InternalProgram.g:292:2: ( ( rule__HourDataType__Group__0 ) )
            // InternalProgram.g:293:3: ( rule__HourDataType__Group__0 )
            {
             before(grammarAccess.getHourDataTypeAccess().getGroup()); 
            // InternalProgram.g:294:3: ( rule__HourDataType__Group__0 )
            // InternalProgram.g:294:4: rule__HourDataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HourDataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHourDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHourDataType"


    // $ANTLR start "entryRuleSession"
    // InternalProgram.g:303:1: entryRuleSession : ruleSession EOF ;
    public final void entryRuleSession() throws RecognitionException {
        try {
            // InternalProgram.g:304:1: ( ruleSession EOF )
            // InternalProgram.g:305:1: ruleSession EOF
            {
             before(grammarAccess.getSessionRule()); 
            pushFollow(FOLLOW_1);
            ruleSession();

            state._fsp--;

             after(grammarAccess.getSessionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSession"


    // $ANTLR start "ruleSession"
    // InternalProgram.g:312:1: ruleSession : ( ( rule__Session__Group__0 ) ) ;
    public final void ruleSession() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:316:2: ( ( ( rule__Session__Group__0 ) ) )
            // InternalProgram.g:317:2: ( ( rule__Session__Group__0 ) )
            {
            // InternalProgram.g:317:2: ( ( rule__Session__Group__0 ) )
            // InternalProgram.g:318:3: ( rule__Session__Group__0 )
            {
             before(grammarAccess.getSessionAccess().getGroup()); 
            // InternalProgram.g:319:3: ( rule__Session__Group__0 )
            // InternalProgram.g:319:4: rule__Session__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Session__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSession"


    // $ANTLR start "entryRuleTalkSession"
    // InternalProgram.g:328:1: entryRuleTalkSession : ruleTalkSession EOF ;
    public final void entryRuleTalkSession() throws RecognitionException {
        try {
            // InternalProgram.g:329:1: ( ruleTalkSession EOF )
            // InternalProgram.g:330:1: ruleTalkSession EOF
            {
             before(grammarAccess.getTalkSessionRule()); 
            pushFollow(FOLLOW_1);
            ruleTalkSession();

            state._fsp--;

             after(grammarAccess.getTalkSessionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTalkSession"


    // $ANTLR start "ruleTalkSession"
    // InternalProgram.g:337:1: ruleTalkSession : ( ( rule__TalkSession__Group__0 ) ) ;
    public final void ruleTalkSession() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:341:2: ( ( ( rule__TalkSession__Group__0 ) ) )
            // InternalProgram.g:342:2: ( ( rule__TalkSession__Group__0 ) )
            {
            // InternalProgram.g:342:2: ( ( rule__TalkSession__Group__0 ) )
            // InternalProgram.g:343:3: ( rule__TalkSession__Group__0 )
            {
             before(grammarAccess.getTalkSessionAccess().getGroup()); 
            // InternalProgram.g:344:3: ( rule__TalkSession__Group__0 )
            // InternalProgram.g:344:4: rule__TalkSession__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TalkSession__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTalkSessionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTalkSession"


    // $ANTLR start "entryRulePanel"
    // InternalProgram.g:353:1: entryRulePanel : rulePanel EOF ;
    public final void entryRulePanel() throws RecognitionException {
        try {
            // InternalProgram.g:354:1: ( rulePanel EOF )
            // InternalProgram.g:355:1: rulePanel EOF
            {
             before(grammarAccess.getPanelRule()); 
            pushFollow(FOLLOW_1);
            rulePanel();

            state._fsp--;

             after(grammarAccess.getPanelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePanel"


    // $ANTLR start "rulePanel"
    // InternalProgram.g:362:1: rulePanel : ( ( rule__Panel__Group__0 ) ) ;
    public final void rulePanel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:366:2: ( ( ( rule__Panel__Group__0 ) ) )
            // InternalProgram.g:367:2: ( ( rule__Panel__Group__0 ) )
            {
            // InternalProgram.g:367:2: ( ( rule__Panel__Group__0 ) )
            // InternalProgram.g:368:3: ( rule__Panel__Group__0 )
            {
             before(grammarAccess.getPanelAccess().getGroup()); 
            // InternalProgram.g:369:3: ( rule__Panel__Group__0 )
            // InternalProgram.g:369:4: rule__Panel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Panel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPanelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePanel"


    // $ANTLR start "entryRuleSRC"
    // InternalProgram.g:378:1: entryRuleSRC : ruleSRC EOF ;
    public final void entryRuleSRC() throws RecognitionException {
        try {
            // InternalProgram.g:379:1: ( ruleSRC EOF )
            // InternalProgram.g:380:1: ruleSRC EOF
            {
             before(grammarAccess.getSRCRule()); 
            pushFollow(FOLLOW_1);
            ruleSRC();

            state._fsp--;

             after(grammarAccess.getSRCRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSRC"


    // $ANTLR start "ruleSRC"
    // InternalProgram.g:387:1: ruleSRC : ( ( rule__SRC__Group__0 ) ) ;
    public final void ruleSRC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:391:2: ( ( ( rule__SRC__Group__0 ) ) )
            // InternalProgram.g:392:2: ( ( rule__SRC__Group__0 ) )
            {
            // InternalProgram.g:392:2: ( ( rule__SRC__Group__0 ) )
            // InternalProgram.g:393:3: ( rule__SRC__Group__0 )
            {
             before(grammarAccess.getSRCAccess().getGroup()); 
            // InternalProgram.g:394:3: ( rule__SRC__Group__0 )
            // InternalProgram.g:394:4: rule__SRC__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SRC__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSRCAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSRC"


    // $ANTLR start "entryRulePoster"
    // InternalProgram.g:403:1: entryRulePoster : rulePoster EOF ;
    public final void entryRulePoster() throws RecognitionException {
        try {
            // InternalProgram.g:404:1: ( rulePoster EOF )
            // InternalProgram.g:405:1: rulePoster EOF
            {
             before(grammarAccess.getPosterRule()); 
            pushFollow(FOLLOW_1);
            rulePoster();

            state._fsp--;

             after(grammarAccess.getPosterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePoster"


    // $ANTLR start "rulePoster"
    // InternalProgram.g:412:1: rulePoster : ( ( rule__Poster__Group__0 ) ) ;
    public final void rulePoster() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:416:2: ( ( ( rule__Poster__Group__0 ) ) )
            // InternalProgram.g:417:2: ( ( rule__Poster__Group__0 ) )
            {
            // InternalProgram.g:417:2: ( ( rule__Poster__Group__0 ) )
            // InternalProgram.g:418:3: ( rule__Poster__Group__0 )
            {
             before(grammarAccess.getPosterAccess().getGroup()); 
            // InternalProgram.g:419:3: ( rule__Poster__Group__0 )
            // InternalProgram.g:419:4: rule__Poster__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Poster__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPosterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePoster"


    // $ANTLR start "entryRuleKeynote"
    // InternalProgram.g:428:1: entryRuleKeynote : ruleKeynote EOF ;
    public final void entryRuleKeynote() throws RecognitionException {
        try {
            // InternalProgram.g:429:1: ( ruleKeynote EOF )
            // InternalProgram.g:430:1: ruleKeynote EOF
            {
             before(grammarAccess.getKeynoteRule()); 
            pushFollow(FOLLOW_1);
            ruleKeynote();

            state._fsp--;

             after(grammarAccess.getKeynoteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKeynote"


    // $ANTLR start "ruleKeynote"
    // InternalProgram.g:437:1: ruleKeynote : ( ( rule__Keynote__Group__0 ) ) ;
    public final void ruleKeynote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:441:2: ( ( ( rule__Keynote__Group__0 ) ) )
            // InternalProgram.g:442:2: ( ( rule__Keynote__Group__0 ) )
            {
            // InternalProgram.g:442:2: ( ( rule__Keynote__Group__0 ) )
            // InternalProgram.g:443:3: ( rule__Keynote__Group__0 )
            {
             before(grammarAccess.getKeynoteAccess().getGroup()); 
            // InternalProgram.g:444:3: ( rule__Keynote__Group__0 )
            // InternalProgram.g:444:4: rule__Keynote__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Keynote__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKeynoteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeynote"


    // $ANTLR start "entryRuleSponsorKeynote"
    // InternalProgram.g:453:1: entryRuleSponsorKeynote : ruleSponsorKeynote EOF ;
    public final void entryRuleSponsorKeynote() throws RecognitionException {
        try {
            // InternalProgram.g:454:1: ( ruleSponsorKeynote EOF )
            // InternalProgram.g:455:1: ruleSponsorKeynote EOF
            {
             before(grammarAccess.getSponsorKeynoteRule()); 
            pushFollow(FOLLOW_1);
            ruleSponsorKeynote();

            state._fsp--;

             after(grammarAccess.getSponsorKeynoteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSponsorKeynote"


    // $ANTLR start "ruleSponsorKeynote"
    // InternalProgram.g:462:1: ruleSponsorKeynote : ( ( rule__SponsorKeynote__Group__0 ) ) ;
    public final void ruleSponsorKeynote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:466:2: ( ( ( rule__SponsorKeynote__Group__0 ) ) )
            // InternalProgram.g:467:2: ( ( rule__SponsorKeynote__Group__0 ) )
            {
            // InternalProgram.g:467:2: ( ( rule__SponsorKeynote__Group__0 ) )
            // InternalProgram.g:468:3: ( rule__SponsorKeynote__Group__0 )
            {
             before(grammarAccess.getSponsorKeynoteAccess().getGroup()); 
            // InternalProgram.g:469:3: ( rule__SponsorKeynote__Group__0 )
            // InternalProgram.g:469:4: rule__SponsorKeynote__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SponsorKeynote__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSponsorKeynoteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSponsorKeynote"


    // $ANTLR start "entryRuleWorkshop"
    // InternalProgram.g:478:1: entryRuleWorkshop : ruleWorkshop EOF ;
    public final void entryRuleWorkshop() throws RecognitionException {
        try {
            // InternalProgram.g:479:1: ( ruleWorkshop EOF )
            // InternalProgram.g:480:1: ruleWorkshop EOF
            {
             before(grammarAccess.getWorkshopRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkshop();

            state._fsp--;

             after(grammarAccess.getWorkshopRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWorkshop"


    // $ANTLR start "ruleWorkshop"
    // InternalProgram.g:487:1: ruleWorkshop : ( ( rule__Workshop__Group__0 ) ) ;
    public final void ruleWorkshop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:491:2: ( ( ( rule__Workshop__Group__0 ) ) )
            // InternalProgram.g:492:2: ( ( rule__Workshop__Group__0 ) )
            {
            // InternalProgram.g:492:2: ( ( rule__Workshop__Group__0 ) )
            // InternalProgram.g:493:3: ( rule__Workshop__Group__0 )
            {
             before(grammarAccess.getWorkshopAccess().getGroup()); 
            // InternalProgram.g:494:3: ( rule__Workshop__Group__0 )
            // InternalProgram.g:494:4: rule__Workshop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Workshop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkshopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkshop"


    // $ANTLR start "entryRuleTutorial"
    // InternalProgram.g:503:1: entryRuleTutorial : ruleTutorial EOF ;
    public final void entryRuleTutorial() throws RecognitionException {
        try {
            // InternalProgram.g:504:1: ( ruleTutorial EOF )
            // InternalProgram.g:505:1: ruleTutorial EOF
            {
             before(grammarAccess.getTutorialRule()); 
            pushFollow(FOLLOW_1);
            ruleTutorial();

            state._fsp--;

             after(grammarAccess.getTutorialRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTutorial"


    // $ANTLR start "ruleTutorial"
    // InternalProgram.g:512:1: ruleTutorial : ( ( rule__Tutorial__Group__0 ) ) ;
    public final void ruleTutorial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:516:2: ( ( ( rule__Tutorial__Group__0 ) ) )
            // InternalProgram.g:517:2: ( ( rule__Tutorial__Group__0 ) )
            {
            // InternalProgram.g:517:2: ( ( rule__Tutorial__Group__0 ) )
            // InternalProgram.g:518:3: ( rule__Tutorial__Group__0 )
            {
             before(grammarAccess.getTutorialAccess().getGroup()); 
            // InternalProgram.g:519:3: ( rule__Tutorial__Group__0 )
            // InternalProgram.g:519:4: rule__Tutorial__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tutorial__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTutorialAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTutorial"


    // $ANTLR start "entryRuleDoctoralSymposium"
    // InternalProgram.g:528:1: entryRuleDoctoralSymposium : ruleDoctoralSymposium EOF ;
    public final void entryRuleDoctoralSymposium() throws RecognitionException {
        try {
            // InternalProgram.g:529:1: ( ruleDoctoralSymposium EOF )
            // InternalProgram.g:530:1: ruleDoctoralSymposium EOF
            {
             before(grammarAccess.getDoctoralSymposiumRule()); 
            pushFollow(FOLLOW_1);
            ruleDoctoralSymposium();

            state._fsp--;

             after(grammarAccess.getDoctoralSymposiumRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDoctoralSymposium"


    // $ANTLR start "ruleDoctoralSymposium"
    // InternalProgram.g:537:1: ruleDoctoralSymposium : ( ( rule__DoctoralSymposium__Group__0 ) ) ;
    public final void ruleDoctoralSymposium() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:541:2: ( ( ( rule__DoctoralSymposium__Group__0 ) ) )
            // InternalProgram.g:542:2: ( ( rule__DoctoralSymposium__Group__0 ) )
            {
            // InternalProgram.g:542:2: ( ( rule__DoctoralSymposium__Group__0 ) )
            // InternalProgram.g:543:3: ( rule__DoctoralSymposium__Group__0 )
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getGroup()); 
            // InternalProgram.g:544:3: ( rule__DoctoralSymposium__Group__0 )
            // InternalProgram.g:544:4: rule__DoctoralSymposium__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoctoralSymposiumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoctoralSymposium"


    // $ANTLR start "entryRuleEducatorSymposium"
    // InternalProgram.g:553:1: entryRuleEducatorSymposium : ruleEducatorSymposium EOF ;
    public final void entryRuleEducatorSymposium() throws RecognitionException {
        try {
            // InternalProgram.g:554:1: ( ruleEducatorSymposium EOF )
            // InternalProgram.g:555:1: ruleEducatorSymposium EOF
            {
             before(grammarAccess.getEducatorSymposiumRule()); 
            pushFollow(FOLLOW_1);
            ruleEducatorSymposium();

            state._fsp--;

             after(grammarAccess.getEducatorSymposiumRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEducatorSymposium"


    // $ANTLR start "ruleEducatorSymposium"
    // InternalProgram.g:562:1: ruleEducatorSymposium : ( ( rule__EducatorSymposium__Group__0 ) ) ;
    public final void ruleEducatorSymposium() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:566:2: ( ( ( rule__EducatorSymposium__Group__0 ) ) )
            // InternalProgram.g:567:2: ( ( rule__EducatorSymposium__Group__0 ) )
            {
            // InternalProgram.g:567:2: ( ( rule__EducatorSymposium__Group__0 ) )
            // InternalProgram.g:568:3: ( rule__EducatorSymposium__Group__0 )
            {
             before(grammarAccess.getEducatorSymposiumAccess().getGroup()); 
            // InternalProgram.g:569:3: ( rule__EducatorSymposium__Group__0 )
            // InternalProgram.g:569:4: rule__EducatorSymposium__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEducatorSymposiumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEducatorSymposium"


    // $ANTLR start "entryRuleReception"
    // InternalProgram.g:578:1: entryRuleReception : ruleReception EOF ;
    public final void entryRuleReception() throws RecognitionException {
        try {
            // InternalProgram.g:579:1: ( ruleReception EOF )
            // InternalProgram.g:580:1: ruleReception EOF
            {
             before(grammarAccess.getReceptionRule()); 
            pushFollow(FOLLOW_1);
            ruleReception();

            state._fsp--;

             after(grammarAccess.getReceptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReception"


    // $ANTLR start "ruleReception"
    // InternalProgram.g:587:1: ruleReception : ( ( rule__Reception__Group__0 ) ) ;
    public final void ruleReception() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:591:2: ( ( ( rule__Reception__Group__0 ) ) )
            // InternalProgram.g:592:2: ( ( rule__Reception__Group__0 ) )
            {
            // InternalProgram.g:592:2: ( ( rule__Reception__Group__0 ) )
            // InternalProgram.g:593:3: ( rule__Reception__Group__0 )
            {
             before(grammarAccess.getReceptionAccess().getGroup()); 
            // InternalProgram.g:594:3: ( rule__Reception__Group__0 )
            // InternalProgram.g:594:4: rule__Reception__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reception__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReceptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReception"


    // $ANTLR start "entryRuleClinic"
    // InternalProgram.g:603:1: entryRuleClinic : ruleClinic EOF ;
    public final void entryRuleClinic() throws RecognitionException {
        try {
            // InternalProgram.g:604:1: ( ruleClinic EOF )
            // InternalProgram.g:605:1: ruleClinic EOF
            {
             before(grammarAccess.getClinicRule()); 
            pushFollow(FOLLOW_1);
            ruleClinic();

            state._fsp--;

             after(grammarAccess.getClinicRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClinic"


    // $ANTLR start "ruleClinic"
    // InternalProgram.g:612:1: ruleClinic : ( ( rule__Clinic__Group__0 ) ) ;
    public final void ruleClinic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:616:2: ( ( ( rule__Clinic__Group__0 ) ) )
            // InternalProgram.g:617:2: ( ( rule__Clinic__Group__0 ) )
            {
            // InternalProgram.g:617:2: ( ( rule__Clinic__Group__0 ) )
            // InternalProgram.g:618:3: ( rule__Clinic__Group__0 )
            {
             before(grammarAccess.getClinicAccess().getGroup()); 
            // InternalProgram.g:619:3: ( rule__Clinic__Group__0 )
            // InternalProgram.g:619:4: rule__Clinic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Clinic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClinicAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClinic"


    // $ANTLR start "entryRuleLunch"
    // InternalProgram.g:628:1: entryRuleLunch : ruleLunch EOF ;
    public final void entryRuleLunch() throws RecognitionException {
        try {
            // InternalProgram.g:629:1: ( ruleLunch EOF )
            // InternalProgram.g:630:1: ruleLunch EOF
            {
             before(grammarAccess.getLunchRule()); 
            pushFollow(FOLLOW_1);
            ruleLunch();

            state._fsp--;

             after(grammarAccess.getLunchRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLunch"


    // $ANTLR start "ruleLunch"
    // InternalProgram.g:637:1: ruleLunch : ( ( rule__Lunch__Group__0 ) ) ;
    public final void ruleLunch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:641:2: ( ( ( rule__Lunch__Group__0 ) ) )
            // InternalProgram.g:642:2: ( ( rule__Lunch__Group__0 ) )
            {
            // InternalProgram.g:642:2: ( ( rule__Lunch__Group__0 ) )
            // InternalProgram.g:643:3: ( rule__Lunch__Group__0 )
            {
             before(grammarAccess.getLunchAccess().getGroup()); 
            // InternalProgram.g:644:3: ( rule__Lunch__Group__0 )
            // InternalProgram.g:644:4: rule__Lunch__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Lunch__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLunchAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLunch"


    // $ANTLR start "entryRuleCoffeeBreak"
    // InternalProgram.g:653:1: entryRuleCoffeeBreak : ruleCoffeeBreak EOF ;
    public final void entryRuleCoffeeBreak() throws RecognitionException {
        try {
            // InternalProgram.g:654:1: ( ruleCoffeeBreak EOF )
            // InternalProgram.g:655:1: ruleCoffeeBreak EOF
            {
             before(grammarAccess.getCoffeeBreakRule()); 
            pushFollow(FOLLOW_1);
            ruleCoffeeBreak();

            state._fsp--;

             after(grammarAccess.getCoffeeBreakRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCoffeeBreak"


    // $ANTLR start "ruleCoffeeBreak"
    // InternalProgram.g:662:1: ruleCoffeeBreak : ( ( rule__CoffeeBreak__Group__0 ) ) ;
    public final void ruleCoffeeBreak() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:666:2: ( ( ( rule__CoffeeBreak__Group__0 ) ) )
            // InternalProgram.g:667:2: ( ( rule__CoffeeBreak__Group__0 ) )
            {
            // InternalProgram.g:667:2: ( ( rule__CoffeeBreak__Group__0 ) )
            // InternalProgram.g:668:3: ( rule__CoffeeBreak__Group__0 )
            {
             before(grammarAccess.getCoffeeBreakAccess().getGroup()); 
            // InternalProgram.g:669:3: ( rule__CoffeeBreak__Group__0 )
            // InternalProgram.g:669:4: rule__CoffeeBreak__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CoffeeBreak__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCoffeeBreakAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoffeeBreak"


    // $ANTLR start "entryRuleMeeting"
    // InternalProgram.g:678:1: entryRuleMeeting : ruleMeeting EOF ;
    public final void entryRuleMeeting() throws RecognitionException {
        try {
            // InternalProgram.g:679:1: ( ruleMeeting EOF )
            // InternalProgram.g:680:1: ruleMeeting EOF
            {
             before(grammarAccess.getMeetingRule()); 
            pushFollow(FOLLOW_1);
            ruleMeeting();

            state._fsp--;

             after(grammarAccess.getMeetingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMeeting"


    // $ANTLR start "ruleMeeting"
    // InternalProgram.g:687:1: ruleMeeting : ( ( rule__Meeting__Group__0 ) ) ;
    public final void ruleMeeting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:691:2: ( ( ( rule__Meeting__Group__0 ) ) )
            // InternalProgram.g:692:2: ( ( rule__Meeting__Group__0 ) )
            {
            // InternalProgram.g:692:2: ( ( rule__Meeting__Group__0 ) )
            // InternalProgram.g:693:3: ( rule__Meeting__Group__0 )
            {
             before(grammarAccess.getMeetingAccess().getGroup()); 
            // InternalProgram.g:694:3: ( rule__Meeting__Group__0 )
            // InternalProgram.g:694:4: rule__Meeting__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Meeting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMeetingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMeeting"


    // $ANTLR start "entryRuleOpening"
    // InternalProgram.g:703:1: entryRuleOpening : ruleOpening EOF ;
    public final void entryRuleOpening() throws RecognitionException {
        try {
            // InternalProgram.g:704:1: ( ruleOpening EOF )
            // InternalProgram.g:705:1: ruleOpening EOF
            {
             before(grammarAccess.getOpeningRule()); 
            pushFollow(FOLLOW_1);
            ruleOpening();

            state._fsp--;

             after(grammarAccess.getOpeningRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOpening"


    // $ANTLR start "ruleOpening"
    // InternalProgram.g:712:1: ruleOpening : ( ( rule__Opening__Group__0 ) ) ;
    public final void ruleOpening() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:716:2: ( ( ( rule__Opening__Group__0 ) ) )
            // InternalProgram.g:717:2: ( ( rule__Opening__Group__0 ) )
            {
            // InternalProgram.g:717:2: ( ( rule__Opening__Group__0 ) )
            // InternalProgram.g:718:3: ( rule__Opening__Group__0 )
            {
             before(grammarAccess.getOpeningAccess().getGroup()); 
            // InternalProgram.g:719:3: ( rule__Opening__Group__0 )
            // InternalProgram.g:719:4: rule__Opening__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Opening__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOpeningAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpening"


    // $ANTLR start "entryRulePaper"
    // InternalProgram.g:728:1: entryRulePaper : rulePaper EOF ;
    public final void entryRulePaper() throws RecognitionException {
        try {
            // InternalProgram.g:729:1: ( rulePaper EOF )
            // InternalProgram.g:730:1: rulePaper EOF
            {
             before(grammarAccess.getPaperRule()); 
            pushFollow(FOLLOW_1);
            rulePaper();

            state._fsp--;

             after(grammarAccess.getPaperRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePaper"


    // $ANTLR start "rulePaper"
    // InternalProgram.g:737:1: rulePaper : ( ( rule__Paper__Group__0 ) ) ;
    public final void rulePaper() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:741:2: ( ( ( rule__Paper__Group__0 ) ) )
            // InternalProgram.g:742:2: ( ( rule__Paper__Group__0 ) )
            {
            // InternalProgram.g:742:2: ( ( rule__Paper__Group__0 ) )
            // InternalProgram.g:743:3: ( rule__Paper__Group__0 )
            {
             before(grammarAccess.getPaperAccess().getGroup()); 
            // InternalProgram.g:744:3: ( rule__Paper__Group__0 )
            // InternalProgram.g:744:4: rule__Paper__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Paper__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPaperAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePaper"


    // $ANTLR start "entryRulePerson"
    // InternalProgram.g:753:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalProgram.g:754:1: ( rulePerson EOF )
            // InternalProgram.g:755:1: rulePerson EOF
            {
             before(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPersonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalProgram.g:762:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:766:2: ( ( ( rule__Person__Group__0 ) ) )
            // InternalProgram.g:767:2: ( ( rule__Person__Group__0 ) )
            {
            // InternalProgram.g:767:2: ( ( rule__Person__Group__0 ) )
            // InternalProgram.g:768:3: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // InternalProgram.g:769:3: ( rule__Person__Group__0 )
            // InternalProgram.g:769:4: rule__Person__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleKind"
    // InternalProgram.g:778:1: entryRuleKind : ruleKind EOF ;
    public final void entryRuleKind() throws RecognitionException {
        try {
            // InternalProgram.g:779:1: ( ruleKind EOF )
            // InternalProgram.g:780:1: ruleKind EOF
            {
             before(grammarAccess.getKindRule()); 
            pushFollow(FOLLOW_1);
            ruleKind();

            state._fsp--;

             after(grammarAccess.getKindRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKind"


    // $ANTLR start "ruleKind"
    // InternalProgram.g:787:1: ruleKind : ( ( rule__Kind__Group__0 ) ) ;
    public final void ruleKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:791:2: ( ( ( rule__Kind__Group__0 ) ) )
            // InternalProgram.g:792:2: ( ( rule__Kind__Group__0 ) )
            {
            // InternalProgram.g:792:2: ( ( rule__Kind__Group__0 ) )
            // InternalProgram.g:793:3: ( rule__Kind__Group__0 )
            {
             before(grammarAccess.getKindAccess().getGroup()); 
            // InternalProgram.g:794:3: ( rule__Kind__Group__0 )
            // InternalProgram.g:794:4: rule__Kind__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Kind__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKindAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKind"


    // $ANTLR start "ruleWeekDay"
    // InternalProgram.g:803:1: ruleWeekDay : ( ( rule__WeekDay__Alternatives ) ) ;
    public final void ruleWeekDay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:807:1: ( ( ( rule__WeekDay__Alternatives ) ) )
            // InternalProgram.g:808:2: ( ( rule__WeekDay__Alternatives ) )
            {
            // InternalProgram.g:808:2: ( ( rule__WeekDay__Alternatives ) )
            // InternalProgram.g:809:3: ( rule__WeekDay__Alternatives )
            {
             before(grammarAccess.getWeekDayAccess().getAlternatives()); 
            // InternalProgram.g:810:3: ( rule__WeekDay__Alternatives )
            // InternalProgram.g:810:4: rule__WeekDay__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WeekDay__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWeekDayAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWeekDay"


    // $ANTLR start "rule__Event__Alternatives"
    // InternalProgram.g:818:1: rule__Event__Alternatives : ( ( ruleTalkSession ) | ( rulePanel ) | ( ruleWorkshop ) | ( ruleTutorial ) | ( ruleDoctoralSymposium ) | ( ruleEducatorSymposium ) | ( ruleReception ) | ( ruleClinic ) | ( ruleLunch ) | ( ruleCoffeeBreak ) | ( ruleMeeting ) | ( ruleSRC ) | ( rulePoster ) | ( ruleKeynote ) | ( ruleSponsorKeynote ) | ( ruleOpening ) );
    public final void rule__Event__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:822:1: ( ( ruleTalkSession ) | ( rulePanel ) | ( ruleWorkshop ) | ( ruleTutorial ) | ( ruleDoctoralSymposium ) | ( ruleEducatorSymposium ) | ( ruleReception ) | ( ruleClinic ) | ( ruleLunch ) | ( ruleCoffeeBreak ) | ( ruleMeeting ) | ( ruleSRC ) | ( rulePoster ) | ( ruleKeynote ) | ( ruleSponsorKeynote ) | ( ruleOpening ) )
            int alt1=16;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt1=1;
                }
                break;
            case 39:
                {
                alt1=2;
                }
                break;
            case 47:
                {
                alt1=3;
                }
                break;
            case 51:
                {
                alt1=4;
                }
                break;
            case 52:
                {
                alt1=5;
                }
                break;
            case 53:
                {
                alt1=6;
                }
                break;
            case 54:
                {
                alt1=7;
                }
                break;
            case 55:
                {
                alt1=8;
                }
                break;
            case 56:
                {
                alt1=9;
                }
                break;
            case 57:
                {
                alt1=10;
                }
                break;
            case 58:
                {
                alt1=11;
                }
                break;
            case 42:
                {
                alt1=12;
                }
                break;
            case 43:
                {
                alt1=13;
                }
                break;
            case 44:
                {
                alt1=14;
                }
                break;
            case 46:
                {
                alt1=15;
                }
                break;
            case 59:
                {
                alt1=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalProgram.g:823:2: ( ruleTalkSession )
                    {
                    // InternalProgram.g:823:2: ( ruleTalkSession )
                    // InternalProgram.g:824:3: ruleTalkSession
                    {
                     before(grammarAccess.getEventAccess().getTalkSessionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTalkSession();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getTalkSessionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProgram.g:829:2: ( rulePanel )
                    {
                    // InternalProgram.g:829:2: ( rulePanel )
                    // InternalProgram.g:830:3: rulePanel
                    {
                     before(grammarAccess.getEventAccess().getPanelParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePanel();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getPanelParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProgram.g:835:2: ( ruleWorkshop )
                    {
                    // InternalProgram.g:835:2: ( ruleWorkshop )
                    // InternalProgram.g:836:3: ruleWorkshop
                    {
                     before(grammarAccess.getEventAccess().getWorkshopParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkshop();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getWorkshopParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalProgram.g:841:2: ( ruleTutorial )
                    {
                    // InternalProgram.g:841:2: ( ruleTutorial )
                    // InternalProgram.g:842:3: ruleTutorial
                    {
                     before(grammarAccess.getEventAccess().getTutorialParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleTutorial();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getTutorialParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalProgram.g:847:2: ( ruleDoctoralSymposium )
                    {
                    // InternalProgram.g:847:2: ( ruleDoctoralSymposium )
                    // InternalProgram.g:848:3: ruleDoctoralSymposium
                    {
                     before(grammarAccess.getEventAccess().getDoctoralSymposiumParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDoctoralSymposium();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getDoctoralSymposiumParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalProgram.g:853:2: ( ruleEducatorSymposium )
                    {
                    // InternalProgram.g:853:2: ( ruleEducatorSymposium )
                    // InternalProgram.g:854:3: ruleEducatorSymposium
                    {
                     before(grammarAccess.getEventAccess().getEducatorSymposiumParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleEducatorSymposium();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getEducatorSymposiumParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalProgram.g:859:2: ( ruleReception )
                    {
                    // InternalProgram.g:859:2: ( ruleReception )
                    // InternalProgram.g:860:3: ruleReception
                    {
                     before(grammarAccess.getEventAccess().getReceptionParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleReception();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getReceptionParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalProgram.g:865:2: ( ruleClinic )
                    {
                    // InternalProgram.g:865:2: ( ruleClinic )
                    // InternalProgram.g:866:3: ruleClinic
                    {
                     before(grammarAccess.getEventAccess().getClinicParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleClinic();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getClinicParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalProgram.g:871:2: ( ruleLunch )
                    {
                    // InternalProgram.g:871:2: ( ruleLunch )
                    // InternalProgram.g:872:3: ruleLunch
                    {
                     before(grammarAccess.getEventAccess().getLunchParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleLunch();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getLunchParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalProgram.g:877:2: ( ruleCoffeeBreak )
                    {
                    // InternalProgram.g:877:2: ( ruleCoffeeBreak )
                    // InternalProgram.g:878:3: ruleCoffeeBreak
                    {
                     before(grammarAccess.getEventAccess().getCoffeeBreakParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleCoffeeBreak();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getCoffeeBreakParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalProgram.g:883:2: ( ruleMeeting )
                    {
                    // InternalProgram.g:883:2: ( ruleMeeting )
                    // InternalProgram.g:884:3: ruleMeeting
                    {
                     before(grammarAccess.getEventAccess().getMeetingParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleMeeting();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getMeetingParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalProgram.g:889:2: ( ruleSRC )
                    {
                    // InternalProgram.g:889:2: ( ruleSRC )
                    // InternalProgram.g:890:3: ruleSRC
                    {
                     before(grammarAccess.getEventAccess().getSRCParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    ruleSRC();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getSRCParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalProgram.g:895:2: ( rulePoster )
                    {
                    // InternalProgram.g:895:2: ( rulePoster )
                    // InternalProgram.g:896:3: rulePoster
                    {
                     before(grammarAccess.getEventAccess().getPosterParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
                    rulePoster();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getPosterParserRuleCall_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalProgram.g:901:2: ( ruleKeynote )
                    {
                    // InternalProgram.g:901:2: ( ruleKeynote )
                    // InternalProgram.g:902:3: ruleKeynote
                    {
                     before(grammarAccess.getEventAccess().getKeynoteParserRuleCall_13()); 
                    pushFollow(FOLLOW_2);
                    ruleKeynote();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getKeynoteParserRuleCall_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalProgram.g:907:2: ( ruleSponsorKeynote )
                    {
                    // InternalProgram.g:907:2: ( ruleSponsorKeynote )
                    // InternalProgram.g:908:3: ruleSponsorKeynote
                    {
                     before(grammarAccess.getEventAccess().getSponsorKeynoteParserRuleCall_14()); 
                    pushFollow(FOLLOW_2);
                    ruleSponsorKeynote();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getSponsorKeynoteParserRuleCall_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalProgram.g:913:2: ( ruleOpening )
                    {
                    // InternalProgram.g:913:2: ( ruleOpening )
                    // InternalProgram.g:914:3: ruleOpening
                    {
                     before(grammarAccess.getEventAccess().getOpeningParserRuleCall_15()); 
                    pushFollow(FOLLOW_2);
                    ruleOpening();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getOpeningParserRuleCall_15()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Alternatives"


    // $ANTLR start "rule__WeekDay__Alternatives"
    // InternalProgram.g:923:1: rule__WeekDay__Alternatives : ( ( ( 'Monday' ) ) | ( ( 'Tuesday' ) ) | ( ( 'Wednesday' ) ) | ( ( 'Thursday' ) ) | ( ( 'Friday' ) ) | ( ( 'Saturday' ) ) | ( ( 'Sunday' ) ) );
    public final void rule__WeekDay__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:927:1: ( ( ( 'Monday' ) ) | ( ( 'Tuesday' ) ) | ( ( 'Wednesday' ) ) | ( ( 'Thursday' ) ) | ( ( 'Friday' ) ) | ( ( 'Saturday' ) ) | ( ( 'Sunday' ) ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
                }
                break;
            case 17:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalProgram.g:928:2: ( ( 'Monday' ) )
                    {
                    // InternalProgram.g:928:2: ( ( 'Monday' ) )
                    // InternalProgram.g:929:3: ( 'Monday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getMondayEnumLiteralDeclaration_0()); 
                    // InternalProgram.g:930:3: ( 'Monday' )
                    // InternalProgram.g:930:4: 'Monday'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getMondayEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProgram.g:934:2: ( ( 'Tuesday' ) )
                    {
                    // InternalProgram.g:934:2: ( ( 'Tuesday' ) )
                    // InternalProgram.g:935:3: ( 'Tuesday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getTuesdayEnumLiteralDeclaration_1()); 
                    // InternalProgram.g:936:3: ( 'Tuesday' )
                    // InternalProgram.g:936:4: 'Tuesday'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getTuesdayEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProgram.g:940:2: ( ( 'Wednesday' ) )
                    {
                    // InternalProgram.g:940:2: ( ( 'Wednesday' ) )
                    // InternalProgram.g:941:3: ( 'Wednesday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getWednesdayEnumLiteralDeclaration_2()); 
                    // InternalProgram.g:942:3: ( 'Wednesday' )
                    // InternalProgram.g:942:4: 'Wednesday'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getWednesdayEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalProgram.g:946:2: ( ( 'Thursday' ) )
                    {
                    // InternalProgram.g:946:2: ( ( 'Thursday' ) )
                    // InternalProgram.g:947:3: ( 'Thursday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getThursdayEnumLiteralDeclaration_3()); 
                    // InternalProgram.g:948:3: ( 'Thursday' )
                    // InternalProgram.g:948:4: 'Thursday'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getThursdayEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalProgram.g:952:2: ( ( 'Friday' ) )
                    {
                    // InternalProgram.g:952:2: ( ( 'Friday' ) )
                    // InternalProgram.g:953:3: ( 'Friday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getFridayEnumLiteralDeclaration_4()); 
                    // InternalProgram.g:954:3: ( 'Friday' )
                    // InternalProgram.g:954:4: 'Friday'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getFridayEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalProgram.g:958:2: ( ( 'Saturday' ) )
                    {
                    // InternalProgram.g:958:2: ( ( 'Saturday' ) )
                    // InternalProgram.g:959:3: ( 'Saturday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getSaturdayEnumLiteralDeclaration_5()); 
                    // InternalProgram.g:960:3: ( 'Saturday' )
                    // InternalProgram.g:960:4: 'Saturday'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getSaturdayEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalProgram.g:964:2: ( ( 'Sunday' ) )
                    {
                    // InternalProgram.g:964:2: ( ( 'Sunday' ) )
                    // InternalProgram.g:965:3: ( 'Sunday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getSundayEnumLiteralDeclaration_6()); 
                    // InternalProgram.g:966:3: ( 'Sunday' )
                    // InternalProgram.g:966:4: 'Sunday'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getSundayEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WeekDay__Alternatives"


    // $ANTLR start "rule__Conference__Group__0"
    // InternalProgram.g:974:1: rule__Conference__Group__0 : rule__Conference__Group__0__Impl rule__Conference__Group__1 ;
    public final void rule__Conference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:978:1: ( rule__Conference__Group__0__Impl rule__Conference__Group__1 )
            // InternalProgram.g:979:2: rule__Conference__Group__0__Impl rule__Conference__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Conference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group__0"


    // $ANTLR start "rule__Conference__Group__0__Impl"
    // InternalProgram.g:986:1: rule__Conference__Group__0__Impl : ( () ) ;
    public final void rule__Conference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:990:1: ( ( () ) )
            // InternalProgram.g:991:1: ( () )
            {
            // InternalProgram.g:991:1: ( () )
            // InternalProgram.g:992:2: ()
            {
             before(grammarAccess.getConferenceAccess().getConferenceAction_0()); 
            // InternalProgram.g:993:2: ()
            // InternalProgram.g:993:3: 
            {
            }

             after(grammarAccess.getConferenceAccess().getConferenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group__0__Impl"


    // $ANTLR start "rule__Conference__Group__1"
    // InternalProgram.g:1001:1: rule__Conference__Group__1 : rule__Conference__Group__1__Impl rule__Conference__Group__2 ;
    public final void rule__Conference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1005:1: ( rule__Conference__Group__1__Impl rule__Conference__Group__2 )
            // InternalProgram.g:1006:2: rule__Conference__Group__1__Impl rule__Conference__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Conference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group__1"


    // $ANTLR start "rule__Conference__Group__1__Impl"
    // InternalProgram.g:1013:1: rule__Conference__Group__1__Impl : ( 'Conference' ) ;
    public final void rule__Conference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1017:1: ( ( 'Conference' ) )
            // InternalProgram.g:1018:1: ( 'Conference' )
            {
            // InternalProgram.g:1018:1: ( 'Conference' )
            // InternalProgram.g:1019:2: 'Conference'
            {
             before(grammarAccess.getConferenceAccess().getConferenceKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getConferenceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group__1__Impl"


    // $ANTLR start "rule__Conference__Group__2"
    // InternalProgram.g:1028:1: rule__Conference__Group__2 : rule__Conference__Group__2__Impl rule__Conference__Group__3 ;
    public final void rule__Conference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1032:1: ( rule__Conference__Group__2__Impl rule__Conference__Group__3 )
            // InternalProgram.g:1033:2: rule__Conference__Group__2__Impl rule__Conference__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Conference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group__2"


    // $ANTLR start "rule__Conference__Group__2__Impl"
    // InternalProgram.g:1040:1: rule__Conference__Group__2__Impl : ( ( rule__Conference__NameAssignment_2 ) ) ;
    public final void rule__Conference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1044:1: ( ( ( rule__Conference__NameAssignment_2 ) ) )
            // InternalProgram.g:1045:1: ( ( rule__Conference__NameAssignment_2 ) )
            {
            // InternalProgram.g:1045:1: ( ( rule__Conference__NameAssignment_2 ) )
            // InternalProgram.g:1046:2: ( rule__Conference__NameAssignment_2 )
            {
             before(grammarAccess.getConferenceAccess().getNameAssignment_2()); 
            // InternalProgram.g:1047:2: ( rule__Conference__NameAssignment_2 )
            // InternalProgram.g:1047:3: rule__Conference__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Conference__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConferenceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group__2__Impl"


    // $ANTLR start "rule__Conference__Group__3"
    // InternalProgram.g:1055:1: rule__Conference__Group__3 : rule__Conference__Group__3__Impl rule__Conference__Group__4 ;
    public final void rule__Conference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1059:1: ( rule__Conference__Group__3__Impl rule__Conference__Group__4 )
            // InternalProgram.g:1060:2: rule__Conference__Group__3__Impl rule__Conference__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Conference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group__3"


    // $ANTLR start "rule__Conference__Group__3__Impl"
    // InternalProgram.g:1067:1: rule__Conference__Group__3__Impl : ( 'talk duration' ) ;
    public final void rule__Conference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1071:1: ( ( 'talk duration' ) )
            // InternalProgram.g:1072:1: ( 'talk duration' )
            {
            // InternalProgram.g:1072:1: ( 'talk duration' )
            // InternalProgram.g:1073:2: 'talk duration'
            {
             before(grammarAccess.getConferenceAccess().getTalkDurationKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getTalkDurationKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group__3__Impl"


    // $ANTLR start "rule__Conference__Group__4"
    // InternalProgram.g:1082:1: rule__Conference__Group__4 : rule__Conference__Group__4__Impl rule__Conference__Group__5 ;
    public final void rule__Conference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1086:1: ( rule__Conference__Group__4__Impl rule__Conference__Group__5 )
            // InternalProgram.g:1087:2: rule__Conference__Group__4__Impl rule__Conference__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Conference__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group__4"


    // $ANTLR start "rule__Conference__Group__4__Impl"
    // InternalProgram.g:1094:1: rule__Conference__Group__4__Impl : ( ( rule__Conference__TalkDurationAssignment_4 ) ) ;
    public final void rule__Conference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1098:1: ( ( ( rule__Conference__TalkDurationAssignment_4 ) ) )
            // InternalProgram.g:1099:1: ( ( rule__Conference__TalkDurationAssignment_4 ) )
            {
            // InternalProgram.g:1099:1: ( ( rule__Conference__TalkDurationAssignment_4 ) )
            // InternalProgram.g:1100:2: ( rule__Conference__TalkDurationAssignment_4 )
            {
             before(grammarAccess.getConferenceAccess().getTalkDurationAssignment_4()); 
            // InternalProgram.g:1101:2: ( rule__Conference__TalkDurationAssignment_4 )
            // InternalProgram.g:1101:3: rule__Conference__TalkDurationAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Conference__TalkDurationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConferenceAccess().getTalkDurationAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group__4__Impl"


    // $ANTLR start "rule__Conference__Group__5"
    // InternalProgram.g:1109:1: rule__Conference__Group__5 : rule__Conference__Group__5__Impl rule__Conference__Group__6 ;
    public final void rule__Conference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1113:1: ( rule__Conference__Group__5__Impl rule__Conference__Group__6 )
            // InternalProgram.g:1114:2: rule__Conference__Group__5__Impl rule__Conference__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Conference__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group__5"


    // $ANTLR start "rule__Conference__Group__5__Impl"
    // InternalProgram.g:1121:1: rule__Conference__Group__5__Impl : ( ( rule__Conference__Group_5__0 )? ) ;
    public final void rule__Conference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1125:1: ( ( ( rule__Conference__Group_5__0 )? ) )
            // InternalProgram.g:1126:1: ( ( rule__Conference__Group_5__0 )? )
            {
            // InternalProgram.g:1126:1: ( ( rule__Conference__Group_5__0 )? )
            // InternalProgram.g:1127:2: ( rule__Conference__Group_5__0 )?
            {
             before(grammarAccess.getConferenceAccess().getGroup_5()); 
            // InternalProgram.g:1128:2: ( rule__Conference__Group_5__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalProgram.g:1128:3: rule__Conference__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conference__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConferenceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group__5__Impl"


    // $ANTLR start "rule__Conference__Group__6"
    // InternalProgram.g:1136:1: rule__Conference__Group__6 : rule__Conference__Group__6__Impl rule__Conference__Group__7 ;
    public final void rule__Conference__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1140:1: ( rule__Conference__Group__6__Impl rule__Conference__Group__7 )
            // InternalProgram.g:1141:2: rule__Conference__Group__6__Impl rule__Conference__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Conference__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group__6"


    // $ANTLR start "rule__Conference__Group__6__Impl"
    // InternalProgram.g:1148:1: rule__Conference__Group__6__Impl : ( ( rule__Conference__Group_6__0 )? ) ;
    public final void rule__Conference__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1152:1: ( ( ( rule__Conference__Group_6__0 )? ) )
            // InternalProgram.g:1153:1: ( ( rule__Conference__Group_6__0 )? )
            {
            // InternalProgram.g:1153:1: ( ( rule__Conference__Group_6__0 )? )
            // InternalProgram.g:1154:2: ( rule__Conference__Group_6__0 )?
            {
             before(grammarAccess.getConferenceAccess().getGroup_6()); 
            // InternalProgram.g:1155:2: ( rule__Conference__Group_6__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalProgram.g:1155:3: rule__Conference__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conference__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConferenceAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group__6__Impl"


    // $ANTLR start "rule__Conference__Group__7"
    // InternalProgram.g:1163:1: rule__Conference__Group__7 : rule__Conference__Group__7__Impl rule__Conference__Group__8 ;
    public final void rule__Conference__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1167:1: ( rule__Conference__Group__7__Impl rule__Conference__Group__8 )
            // InternalProgram.g:1168:2: rule__Conference__Group__7__Impl rule__Conference__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Conference__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group__7"


    // $ANTLR start "rule__Conference__Group__7__Impl"
    // InternalProgram.g:1175:1: rule__Conference__Group__7__Impl : ( ( rule__Conference__Group_7__0 )? ) ;
    public final void rule__Conference__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1179:1: ( ( ( rule__Conference__Group_7__0 )? ) )
            // InternalProgram.g:1180:1: ( ( rule__Conference__Group_7__0 )? )
            {
            // InternalProgram.g:1180:1: ( ( rule__Conference__Group_7__0 )? )
            // InternalProgram.g:1181:2: ( rule__Conference__Group_7__0 )?
            {
             before(grammarAccess.getConferenceAccess().getGroup_7()); 
            // InternalProgram.g:1182:2: ( rule__Conference__Group_7__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalProgram.g:1182:3: rule__Conference__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conference__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConferenceAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group__7__Impl"


    // $ANTLR start "rule__Conference__Group__8"
    // InternalProgram.g:1190:1: rule__Conference__Group__8 : rule__Conference__Group__8__Impl rule__Conference__Group__9 ;
    public final void rule__Conference__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1194:1: ( rule__Conference__Group__8__Impl rule__Conference__Group__9 )
            // InternalProgram.g:1195:2: rule__Conference__Group__8__Impl rule__Conference__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__Conference__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group__8"


    // $ANTLR start "rule__Conference__Group__8__Impl"
    // InternalProgram.g:1202:1: rule__Conference__Group__8__Impl : ( ( rule__Conference__Group_8__0 )? ) ;
    public final void rule__Conference__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1206:1: ( ( ( rule__Conference__Group_8__0 )? ) )
            // InternalProgram.g:1207:1: ( ( rule__Conference__Group_8__0 )? )
            {
            // InternalProgram.g:1207:1: ( ( rule__Conference__Group_8__0 )? )
            // InternalProgram.g:1208:2: ( rule__Conference__Group_8__0 )?
            {
             before(grammarAccess.getConferenceAccess().getGroup_8()); 
            // InternalProgram.g:1209:2: ( rule__Conference__Group_8__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalProgram.g:1209:3: rule__Conference__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conference__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConferenceAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group__8__Impl"


    // $ANTLR start "rule__Conference__Group__9"
    // InternalProgram.g:1217:1: rule__Conference__Group__9 : rule__Conference__Group__9__Impl ;
    public final void rule__Conference__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1221:1: ( rule__Conference__Group__9__Impl )
            // InternalProgram.g:1222:2: rule__Conference__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conference__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group__9"


    // $ANTLR start "rule__Conference__Group__9__Impl"
    // InternalProgram.g:1228:1: rule__Conference__Group__9__Impl : ( ( rule__Conference__Group_9__0 )? ) ;
    public final void rule__Conference__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1232:1: ( ( ( rule__Conference__Group_9__0 )? ) )
            // InternalProgram.g:1233:1: ( ( rule__Conference__Group_9__0 )? )
            {
            // InternalProgram.g:1233:1: ( ( rule__Conference__Group_9__0 )? )
            // InternalProgram.g:1234:2: ( rule__Conference__Group_9__0 )?
            {
             before(grammarAccess.getConferenceAccess().getGroup_9()); 
            // InternalProgram.g:1235:2: ( rule__Conference__Group_9__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalProgram.g:1235:3: rule__Conference__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conference__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConferenceAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group__9__Impl"


    // $ANTLR start "rule__Conference__Group_5__0"
    // InternalProgram.g:1244:1: rule__Conference__Group_5__0 : rule__Conference__Group_5__0__Impl rule__Conference__Group_5__1 ;
    public final void rule__Conference__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1248:1: ( rule__Conference__Group_5__0__Impl rule__Conference__Group_5__1 )
            // InternalProgram.g:1249:2: rule__Conference__Group_5__0__Impl rule__Conference__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Conference__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_5__0"


    // $ANTLR start "rule__Conference__Group_5__0__Impl"
    // InternalProgram.g:1256:1: rule__Conference__Group_5__0__Impl : ( 'kinds' ) ;
    public final void rule__Conference__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1260:1: ( ( 'kinds' ) )
            // InternalProgram.g:1261:1: ( 'kinds' )
            {
            // InternalProgram.g:1261:1: ( 'kinds' )
            // InternalProgram.g:1262:2: 'kinds'
            {
             before(grammarAccess.getConferenceAccess().getKindsKeyword_5_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getKindsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_5__0__Impl"


    // $ANTLR start "rule__Conference__Group_5__1"
    // InternalProgram.g:1271:1: rule__Conference__Group_5__1 : rule__Conference__Group_5__1__Impl rule__Conference__Group_5__2 ;
    public final void rule__Conference__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1275:1: ( rule__Conference__Group_5__1__Impl rule__Conference__Group_5__2 )
            // InternalProgram.g:1276:2: rule__Conference__Group_5__1__Impl rule__Conference__Group_5__2
            {
            pushFollow(FOLLOW_8);
            rule__Conference__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_5__1"


    // $ANTLR start "rule__Conference__Group_5__1__Impl"
    // InternalProgram.g:1283:1: rule__Conference__Group_5__1__Impl : ( ( rule__Conference__KindsAssignment_5_1 ) ) ;
    public final void rule__Conference__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1287:1: ( ( ( rule__Conference__KindsAssignment_5_1 ) ) )
            // InternalProgram.g:1288:1: ( ( rule__Conference__KindsAssignment_5_1 ) )
            {
            // InternalProgram.g:1288:1: ( ( rule__Conference__KindsAssignment_5_1 ) )
            // InternalProgram.g:1289:2: ( rule__Conference__KindsAssignment_5_1 )
            {
             before(grammarAccess.getConferenceAccess().getKindsAssignment_5_1()); 
            // InternalProgram.g:1290:2: ( rule__Conference__KindsAssignment_5_1 )
            // InternalProgram.g:1290:3: rule__Conference__KindsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Conference__KindsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getConferenceAccess().getKindsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_5__1__Impl"


    // $ANTLR start "rule__Conference__Group_5__2"
    // InternalProgram.g:1298:1: rule__Conference__Group_5__2 : rule__Conference__Group_5__2__Impl ;
    public final void rule__Conference__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1302:1: ( rule__Conference__Group_5__2__Impl )
            // InternalProgram.g:1303:2: rule__Conference__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conference__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_5__2"


    // $ANTLR start "rule__Conference__Group_5__2__Impl"
    // InternalProgram.g:1309:1: rule__Conference__Group_5__2__Impl : ( ( rule__Conference__Group_5_2__0 )* ) ;
    public final void rule__Conference__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1313:1: ( ( ( rule__Conference__Group_5_2__0 )* ) )
            // InternalProgram.g:1314:1: ( ( rule__Conference__Group_5_2__0 )* )
            {
            // InternalProgram.g:1314:1: ( ( rule__Conference__Group_5_2__0 )* )
            // InternalProgram.g:1315:2: ( rule__Conference__Group_5_2__0 )*
            {
             before(grammarAccess.getConferenceAccess().getGroup_5_2()); 
            // InternalProgram.g:1316:2: ( rule__Conference__Group_5_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalProgram.g:1316:3: rule__Conference__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Conference__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getConferenceAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_5__2__Impl"


    // $ANTLR start "rule__Conference__Group_5_2__0"
    // InternalProgram.g:1325:1: rule__Conference__Group_5_2__0 : rule__Conference__Group_5_2__0__Impl rule__Conference__Group_5_2__1 ;
    public final void rule__Conference__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1329:1: ( rule__Conference__Group_5_2__0__Impl rule__Conference__Group_5_2__1 )
            // InternalProgram.g:1330:2: rule__Conference__Group_5_2__0__Impl rule__Conference__Group_5_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Conference__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_5_2__0"


    // $ANTLR start "rule__Conference__Group_5_2__0__Impl"
    // InternalProgram.g:1337:1: rule__Conference__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Conference__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1341:1: ( ( ',' ) )
            // InternalProgram.g:1342:1: ( ',' )
            {
            // InternalProgram.g:1342:1: ( ',' )
            // InternalProgram.g:1343:2: ','
            {
             before(grammarAccess.getConferenceAccess().getCommaKeyword_5_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getCommaKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_5_2__0__Impl"


    // $ANTLR start "rule__Conference__Group_5_2__1"
    // InternalProgram.g:1352:1: rule__Conference__Group_5_2__1 : rule__Conference__Group_5_2__1__Impl ;
    public final void rule__Conference__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1356:1: ( rule__Conference__Group_5_2__1__Impl )
            // InternalProgram.g:1357:2: rule__Conference__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conference__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_5_2__1"


    // $ANTLR start "rule__Conference__Group_5_2__1__Impl"
    // InternalProgram.g:1363:1: rule__Conference__Group_5_2__1__Impl : ( ( rule__Conference__KindsAssignment_5_2_1 ) ) ;
    public final void rule__Conference__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1367:1: ( ( ( rule__Conference__KindsAssignment_5_2_1 ) ) )
            // InternalProgram.g:1368:1: ( ( rule__Conference__KindsAssignment_5_2_1 ) )
            {
            // InternalProgram.g:1368:1: ( ( rule__Conference__KindsAssignment_5_2_1 ) )
            // InternalProgram.g:1369:2: ( rule__Conference__KindsAssignment_5_2_1 )
            {
             before(grammarAccess.getConferenceAccess().getKindsAssignment_5_2_1()); 
            // InternalProgram.g:1370:2: ( rule__Conference__KindsAssignment_5_2_1 )
            // InternalProgram.g:1370:3: rule__Conference__KindsAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Conference__KindsAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConferenceAccess().getKindsAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_5_2__1__Impl"


    // $ANTLR start "rule__Conference__Group_6__0"
    // InternalProgram.g:1379:1: rule__Conference__Group_6__0 : rule__Conference__Group_6__0__Impl rule__Conference__Group_6__1 ;
    public final void rule__Conference__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1383:1: ( rule__Conference__Group_6__0__Impl rule__Conference__Group_6__1 )
            // InternalProgram.g:1384:2: rule__Conference__Group_6__0__Impl rule__Conference__Group_6__1
            {
            pushFollow(FOLLOW_10);
            rule__Conference__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_6__0"


    // $ANTLR start "rule__Conference__Group_6__0__Impl"
    // InternalProgram.g:1391:1: rule__Conference__Group_6__0__Impl : ( 'resources' ) ;
    public final void rule__Conference__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1395:1: ( ( 'resources' ) )
            // InternalProgram.g:1396:1: ( 'resources' )
            {
            // InternalProgram.g:1396:1: ( 'resources' )
            // InternalProgram.g:1397:2: 'resources'
            {
             before(grammarAccess.getConferenceAccess().getResourcesKeyword_6_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getResourcesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_6__0__Impl"


    // $ANTLR start "rule__Conference__Group_6__1"
    // InternalProgram.g:1406:1: rule__Conference__Group_6__1 : rule__Conference__Group_6__1__Impl rule__Conference__Group_6__2 ;
    public final void rule__Conference__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1410:1: ( rule__Conference__Group_6__1__Impl rule__Conference__Group_6__2 )
            // InternalProgram.g:1411:2: rule__Conference__Group_6__1__Impl rule__Conference__Group_6__2
            {
            pushFollow(FOLLOW_10);
            rule__Conference__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_6__1"


    // $ANTLR start "rule__Conference__Group_6__1__Impl"
    // InternalProgram.g:1418:1: rule__Conference__Group_6__1__Impl : ( ( rule__Conference__ResourcesAssignment_6_1 ) ) ;
    public final void rule__Conference__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1422:1: ( ( ( rule__Conference__ResourcesAssignment_6_1 ) ) )
            // InternalProgram.g:1423:1: ( ( rule__Conference__ResourcesAssignment_6_1 ) )
            {
            // InternalProgram.g:1423:1: ( ( rule__Conference__ResourcesAssignment_6_1 ) )
            // InternalProgram.g:1424:2: ( rule__Conference__ResourcesAssignment_6_1 )
            {
             before(grammarAccess.getConferenceAccess().getResourcesAssignment_6_1()); 
            // InternalProgram.g:1425:2: ( rule__Conference__ResourcesAssignment_6_1 )
            // InternalProgram.g:1425:3: rule__Conference__ResourcesAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Conference__ResourcesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getConferenceAccess().getResourcesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_6__1__Impl"


    // $ANTLR start "rule__Conference__Group_6__2"
    // InternalProgram.g:1433:1: rule__Conference__Group_6__2 : rule__Conference__Group_6__2__Impl ;
    public final void rule__Conference__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1437:1: ( rule__Conference__Group_6__2__Impl )
            // InternalProgram.g:1438:2: rule__Conference__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conference__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_6__2"


    // $ANTLR start "rule__Conference__Group_6__2__Impl"
    // InternalProgram.g:1444:1: rule__Conference__Group_6__2__Impl : ( ( rule__Conference__ResourcesAssignment_6_2 )* ) ;
    public final void rule__Conference__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1448:1: ( ( ( rule__Conference__ResourcesAssignment_6_2 )* ) )
            // InternalProgram.g:1449:1: ( ( rule__Conference__ResourcesAssignment_6_2 )* )
            {
            // InternalProgram.g:1449:1: ( ( rule__Conference__ResourcesAssignment_6_2 )* )
            // InternalProgram.g:1450:2: ( rule__Conference__ResourcesAssignment_6_2 )*
            {
             before(grammarAccess.getConferenceAccess().getResourcesAssignment_6_2()); 
            // InternalProgram.g:1451:2: ( rule__Conference__ResourcesAssignment_6_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalProgram.g:1451:3: rule__Conference__ResourcesAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Conference__ResourcesAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getConferenceAccess().getResourcesAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_6__2__Impl"


    // $ANTLR start "rule__Conference__Group_7__0"
    // InternalProgram.g:1460:1: rule__Conference__Group_7__0 : rule__Conference__Group_7__0__Impl rule__Conference__Group_7__1 ;
    public final void rule__Conference__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1464:1: ( rule__Conference__Group_7__0__Impl rule__Conference__Group_7__1 )
            // InternalProgram.g:1465:2: rule__Conference__Group_7__0__Impl rule__Conference__Group_7__1
            {
            pushFollow(FOLLOW_12);
            rule__Conference__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_7__0"


    // $ANTLR start "rule__Conference__Group_7__0__Impl"
    // InternalProgram.g:1472:1: rule__Conference__Group_7__0__Impl : ( 'papers' ) ;
    public final void rule__Conference__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1476:1: ( ( 'papers' ) )
            // InternalProgram.g:1477:1: ( 'papers' )
            {
            // InternalProgram.g:1477:1: ( 'papers' )
            // InternalProgram.g:1478:2: 'papers'
            {
             before(grammarAccess.getConferenceAccess().getPapersKeyword_7_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getPapersKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_7__0__Impl"


    // $ANTLR start "rule__Conference__Group_7__1"
    // InternalProgram.g:1487:1: rule__Conference__Group_7__1 : rule__Conference__Group_7__1__Impl rule__Conference__Group_7__2 ;
    public final void rule__Conference__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1491:1: ( rule__Conference__Group_7__1__Impl rule__Conference__Group_7__2 )
            // InternalProgram.g:1492:2: rule__Conference__Group_7__1__Impl rule__Conference__Group_7__2
            {
            pushFollow(FOLLOW_4);
            rule__Conference__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_7__1"


    // $ANTLR start "rule__Conference__Group_7__1__Impl"
    // InternalProgram.g:1499:1: rule__Conference__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Conference__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1503:1: ( ( '{' ) )
            // InternalProgram.g:1504:1: ( '{' )
            {
            // InternalProgram.g:1504:1: ( '{' )
            // InternalProgram.g:1505:2: '{'
            {
             before(grammarAccess.getConferenceAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_7__1__Impl"


    // $ANTLR start "rule__Conference__Group_7__2"
    // InternalProgram.g:1514:1: rule__Conference__Group_7__2 : rule__Conference__Group_7__2__Impl rule__Conference__Group_7__3 ;
    public final void rule__Conference__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1518:1: ( rule__Conference__Group_7__2__Impl rule__Conference__Group_7__3 )
            // InternalProgram.g:1519:2: rule__Conference__Group_7__2__Impl rule__Conference__Group_7__3
            {
            pushFollow(FOLLOW_13);
            rule__Conference__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_7__2"


    // $ANTLR start "rule__Conference__Group_7__2__Impl"
    // InternalProgram.g:1526:1: rule__Conference__Group_7__2__Impl : ( ( rule__Conference__PapersAssignment_7_2 ) ) ;
    public final void rule__Conference__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1530:1: ( ( ( rule__Conference__PapersAssignment_7_2 ) ) )
            // InternalProgram.g:1531:1: ( ( rule__Conference__PapersAssignment_7_2 ) )
            {
            // InternalProgram.g:1531:1: ( ( rule__Conference__PapersAssignment_7_2 ) )
            // InternalProgram.g:1532:2: ( rule__Conference__PapersAssignment_7_2 )
            {
             before(grammarAccess.getConferenceAccess().getPapersAssignment_7_2()); 
            // InternalProgram.g:1533:2: ( rule__Conference__PapersAssignment_7_2 )
            // InternalProgram.g:1533:3: rule__Conference__PapersAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Conference__PapersAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getConferenceAccess().getPapersAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_7__2__Impl"


    // $ANTLR start "rule__Conference__Group_7__3"
    // InternalProgram.g:1541:1: rule__Conference__Group_7__3 : rule__Conference__Group_7__3__Impl rule__Conference__Group_7__4 ;
    public final void rule__Conference__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1545:1: ( rule__Conference__Group_7__3__Impl rule__Conference__Group_7__4 )
            // InternalProgram.g:1546:2: rule__Conference__Group_7__3__Impl rule__Conference__Group_7__4
            {
            pushFollow(FOLLOW_13);
            rule__Conference__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_7__3"


    // $ANTLR start "rule__Conference__Group_7__3__Impl"
    // InternalProgram.g:1553:1: rule__Conference__Group_7__3__Impl : ( ( rule__Conference__Group_7_3__0 )* ) ;
    public final void rule__Conference__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1557:1: ( ( ( rule__Conference__Group_7_3__0 )* ) )
            // InternalProgram.g:1558:1: ( ( rule__Conference__Group_7_3__0 )* )
            {
            // InternalProgram.g:1558:1: ( ( rule__Conference__Group_7_3__0 )* )
            // InternalProgram.g:1559:2: ( rule__Conference__Group_7_3__0 )*
            {
             before(grammarAccess.getConferenceAccess().getGroup_7_3()); 
            // InternalProgram.g:1560:2: ( rule__Conference__Group_7_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalProgram.g:1560:3: rule__Conference__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Conference__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getConferenceAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_7__3__Impl"


    // $ANTLR start "rule__Conference__Group_7__4"
    // InternalProgram.g:1568:1: rule__Conference__Group_7__4 : rule__Conference__Group_7__4__Impl ;
    public final void rule__Conference__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1572:1: ( rule__Conference__Group_7__4__Impl )
            // InternalProgram.g:1573:2: rule__Conference__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conference__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_7__4"


    // $ANTLR start "rule__Conference__Group_7__4__Impl"
    // InternalProgram.g:1579:1: rule__Conference__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Conference__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1583:1: ( ( '}' ) )
            // InternalProgram.g:1584:1: ( '}' )
            {
            // InternalProgram.g:1584:1: ( '}' )
            // InternalProgram.g:1585:2: '}'
            {
             before(grammarAccess.getConferenceAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_7__4__Impl"


    // $ANTLR start "rule__Conference__Group_7_3__0"
    // InternalProgram.g:1595:1: rule__Conference__Group_7_3__0 : rule__Conference__Group_7_3__0__Impl rule__Conference__Group_7_3__1 ;
    public final void rule__Conference__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1599:1: ( rule__Conference__Group_7_3__0__Impl rule__Conference__Group_7_3__1 )
            // InternalProgram.g:1600:2: rule__Conference__Group_7_3__0__Impl rule__Conference__Group_7_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Conference__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_7_3__0"


    // $ANTLR start "rule__Conference__Group_7_3__0__Impl"
    // InternalProgram.g:1607:1: rule__Conference__Group_7_3__0__Impl : ( ';' ) ;
    public final void rule__Conference__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1611:1: ( ( ';' ) )
            // InternalProgram.g:1612:1: ( ';' )
            {
            // InternalProgram.g:1612:1: ( ';' )
            // InternalProgram.g:1613:2: ';'
            {
             before(grammarAccess.getConferenceAccess().getSemicolonKeyword_7_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getSemicolonKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_7_3__0__Impl"


    // $ANTLR start "rule__Conference__Group_7_3__1"
    // InternalProgram.g:1622:1: rule__Conference__Group_7_3__1 : rule__Conference__Group_7_3__1__Impl ;
    public final void rule__Conference__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1626:1: ( rule__Conference__Group_7_3__1__Impl )
            // InternalProgram.g:1627:2: rule__Conference__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conference__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_7_3__1"


    // $ANTLR start "rule__Conference__Group_7_3__1__Impl"
    // InternalProgram.g:1633:1: rule__Conference__Group_7_3__1__Impl : ( ( rule__Conference__PapersAssignment_7_3_1 ) ) ;
    public final void rule__Conference__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1637:1: ( ( ( rule__Conference__PapersAssignment_7_3_1 ) ) )
            // InternalProgram.g:1638:1: ( ( rule__Conference__PapersAssignment_7_3_1 ) )
            {
            // InternalProgram.g:1638:1: ( ( rule__Conference__PapersAssignment_7_3_1 ) )
            // InternalProgram.g:1639:2: ( rule__Conference__PapersAssignment_7_3_1 )
            {
             before(grammarAccess.getConferenceAccess().getPapersAssignment_7_3_1()); 
            // InternalProgram.g:1640:2: ( rule__Conference__PapersAssignment_7_3_1 )
            // InternalProgram.g:1640:3: rule__Conference__PapersAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Conference__PapersAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConferenceAccess().getPapersAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_7_3__1__Impl"


    // $ANTLR start "rule__Conference__Group_8__0"
    // InternalProgram.g:1649:1: rule__Conference__Group_8__0 : rule__Conference__Group_8__0__Impl rule__Conference__Group_8__1 ;
    public final void rule__Conference__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1653:1: ( rule__Conference__Group_8__0__Impl rule__Conference__Group_8__1 )
            // InternalProgram.g:1654:2: rule__Conference__Group_8__0__Impl rule__Conference__Group_8__1
            {
            pushFollow(FOLLOW_12);
            rule__Conference__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_8__0"


    // $ANTLR start "rule__Conference__Group_8__0__Impl"
    // InternalProgram.g:1661:1: rule__Conference__Group_8__0__Impl : ( 'events' ) ;
    public final void rule__Conference__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1665:1: ( ( 'events' ) )
            // InternalProgram.g:1666:1: ( 'events' )
            {
            // InternalProgram.g:1666:1: ( 'events' )
            // InternalProgram.g:1667:2: 'events'
            {
             before(grammarAccess.getConferenceAccess().getEventsKeyword_8_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getEventsKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_8__0__Impl"


    // $ANTLR start "rule__Conference__Group_8__1"
    // InternalProgram.g:1676:1: rule__Conference__Group_8__1 : rule__Conference__Group_8__1__Impl rule__Conference__Group_8__2 ;
    public final void rule__Conference__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1680:1: ( rule__Conference__Group_8__1__Impl rule__Conference__Group_8__2 )
            // InternalProgram.g:1681:2: rule__Conference__Group_8__1__Impl rule__Conference__Group_8__2
            {
            pushFollow(FOLLOW_15);
            rule__Conference__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_8__1"


    // $ANTLR start "rule__Conference__Group_8__1__Impl"
    // InternalProgram.g:1688:1: rule__Conference__Group_8__1__Impl : ( '{' ) ;
    public final void rule__Conference__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1692:1: ( ( '{' ) )
            // InternalProgram.g:1693:1: ( '{' )
            {
            // InternalProgram.g:1693:1: ( '{' )
            // InternalProgram.g:1694:2: '{'
            {
             before(grammarAccess.getConferenceAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_8__1__Impl"


    // $ANTLR start "rule__Conference__Group_8__2"
    // InternalProgram.g:1703:1: rule__Conference__Group_8__2 : rule__Conference__Group_8__2__Impl rule__Conference__Group_8__3 ;
    public final void rule__Conference__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1707:1: ( rule__Conference__Group_8__2__Impl rule__Conference__Group_8__3 )
            // InternalProgram.g:1708:2: rule__Conference__Group_8__2__Impl rule__Conference__Group_8__3
            {
            pushFollow(FOLLOW_13);
            rule__Conference__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_8__2"


    // $ANTLR start "rule__Conference__Group_8__2__Impl"
    // InternalProgram.g:1715:1: rule__Conference__Group_8__2__Impl : ( ( rule__Conference__EventsAssignment_8_2 ) ) ;
    public final void rule__Conference__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1719:1: ( ( ( rule__Conference__EventsAssignment_8_2 ) ) )
            // InternalProgram.g:1720:1: ( ( rule__Conference__EventsAssignment_8_2 ) )
            {
            // InternalProgram.g:1720:1: ( ( rule__Conference__EventsAssignment_8_2 ) )
            // InternalProgram.g:1721:2: ( rule__Conference__EventsAssignment_8_2 )
            {
             before(grammarAccess.getConferenceAccess().getEventsAssignment_8_2()); 
            // InternalProgram.g:1722:2: ( rule__Conference__EventsAssignment_8_2 )
            // InternalProgram.g:1722:3: rule__Conference__EventsAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Conference__EventsAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getConferenceAccess().getEventsAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_8__2__Impl"


    // $ANTLR start "rule__Conference__Group_8__3"
    // InternalProgram.g:1730:1: rule__Conference__Group_8__3 : rule__Conference__Group_8__3__Impl rule__Conference__Group_8__4 ;
    public final void rule__Conference__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1734:1: ( rule__Conference__Group_8__3__Impl rule__Conference__Group_8__4 )
            // InternalProgram.g:1735:2: rule__Conference__Group_8__3__Impl rule__Conference__Group_8__4
            {
            pushFollow(FOLLOW_13);
            rule__Conference__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_8__3"


    // $ANTLR start "rule__Conference__Group_8__3__Impl"
    // InternalProgram.g:1742:1: rule__Conference__Group_8__3__Impl : ( ( rule__Conference__Group_8_3__0 )* ) ;
    public final void rule__Conference__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1746:1: ( ( ( rule__Conference__Group_8_3__0 )* ) )
            // InternalProgram.g:1747:1: ( ( rule__Conference__Group_8_3__0 )* )
            {
            // InternalProgram.g:1747:1: ( ( rule__Conference__Group_8_3__0 )* )
            // InternalProgram.g:1748:2: ( rule__Conference__Group_8_3__0 )*
            {
             before(grammarAccess.getConferenceAccess().getGroup_8_3()); 
            // InternalProgram.g:1749:2: ( rule__Conference__Group_8_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalProgram.g:1749:3: rule__Conference__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Conference__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getConferenceAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_8__3__Impl"


    // $ANTLR start "rule__Conference__Group_8__4"
    // InternalProgram.g:1757:1: rule__Conference__Group_8__4 : rule__Conference__Group_8__4__Impl ;
    public final void rule__Conference__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1761:1: ( rule__Conference__Group_8__4__Impl )
            // InternalProgram.g:1762:2: rule__Conference__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conference__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_8__4"


    // $ANTLR start "rule__Conference__Group_8__4__Impl"
    // InternalProgram.g:1768:1: rule__Conference__Group_8__4__Impl : ( '}' ) ;
    public final void rule__Conference__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1772:1: ( ( '}' ) )
            // InternalProgram.g:1773:1: ( '}' )
            {
            // InternalProgram.g:1773:1: ( '}' )
            // InternalProgram.g:1774:2: '}'
            {
             before(grammarAccess.getConferenceAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getRightCurlyBracketKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_8__4__Impl"


    // $ANTLR start "rule__Conference__Group_8_3__0"
    // InternalProgram.g:1784:1: rule__Conference__Group_8_3__0 : rule__Conference__Group_8_3__0__Impl rule__Conference__Group_8_3__1 ;
    public final void rule__Conference__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1788:1: ( rule__Conference__Group_8_3__0__Impl rule__Conference__Group_8_3__1 )
            // InternalProgram.g:1789:2: rule__Conference__Group_8_3__0__Impl rule__Conference__Group_8_3__1
            {
            pushFollow(FOLLOW_15);
            rule__Conference__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_8_3__0"


    // $ANTLR start "rule__Conference__Group_8_3__0__Impl"
    // InternalProgram.g:1796:1: rule__Conference__Group_8_3__0__Impl : ( ';' ) ;
    public final void rule__Conference__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1800:1: ( ( ';' ) )
            // InternalProgram.g:1801:1: ( ';' )
            {
            // InternalProgram.g:1801:1: ( ';' )
            // InternalProgram.g:1802:2: ';'
            {
             before(grammarAccess.getConferenceAccess().getSemicolonKeyword_8_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getSemicolonKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_8_3__0__Impl"


    // $ANTLR start "rule__Conference__Group_8_3__1"
    // InternalProgram.g:1811:1: rule__Conference__Group_8_3__1 : rule__Conference__Group_8_3__1__Impl ;
    public final void rule__Conference__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1815:1: ( rule__Conference__Group_8_3__1__Impl )
            // InternalProgram.g:1816:2: rule__Conference__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conference__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_8_3__1"


    // $ANTLR start "rule__Conference__Group_8_3__1__Impl"
    // InternalProgram.g:1822:1: rule__Conference__Group_8_3__1__Impl : ( ( rule__Conference__EventsAssignment_8_3_1 ) ) ;
    public final void rule__Conference__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1826:1: ( ( ( rule__Conference__EventsAssignment_8_3_1 ) ) )
            // InternalProgram.g:1827:1: ( ( rule__Conference__EventsAssignment_8_3_1 ) )
            {
            // InternalProgram.g:1827:1: ( ( rule__Conference__EventsAssignment_8_3_1 ) )
            // InternalProgram.g:1828:2: ( rule__Conference__EventsAssignment_8_3_1 )
            {
             before(grammarAccess.getConferenceAccess().getEventsAssignment_8_3_1()); 
            // InternalProgram.g:1829:2: ( rule__Conference__EventsAssignment_8_3_1 )
            // InternalProgram.g:1829:3: rule__Conference__EventsAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Conference__EventsAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConferenceAccess().getEventsAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_8_3__1__Impl"


    // $ANTLR start "rule__Conference__Group_9__0"
    // InternalProgram.g:1838:1: rule__Conference__Group_9__0 : rule__Conference__Group_9__0__Impl rule__Conference__Group_9__1 ;
    public final void rule__Conference__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1842:1: ( rule__Conference__Group_9__0__Impl rule__Conference__Group_9__1 )
            // InternalProgram.g:1843:2: rule__Conference__Group_9__0__Impl rule__Conference__Group_9__1
            {
            pushFollow(FOLLOW_12);
            rule__Conference__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_9__0"


    // $ANTLR start "rule__Conference__Group_9__0__Impl"
    // InternalProgram.g:1850:1: rule__Conference__Group_9__0__Impl : ( 'program' ) ;
    public final void rule__Conference__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1854:1: ( ( 'program' ) )
            // InternalProgram.g:1855:1: ( 'program' )
            {
            // InternalProgram.g:1855:1: ( 'program' )
            // InternalProgram.g:1856:2: 'program'
            {
             before(grammarAccess.getConferenceAccess().getProgramKeyword_9_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getProgramKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_9__0__Impl"


    // $ANTLR start "rule__Conference__Group_9__1"
    // InternalProgram.g:1865:1: rule__Conference__Group_9__1 : rule__Conference__Group_9__1__Impl ;
    public final void rule__Conference__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1869:1: ( rule__Conference__Group_9__1__Impl )
            // InternalProgram.g:1870:2: rule__Conference__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conference__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_9__1"


    // $ANTLR start "rule__Conference__Group_9__1__Impl"
    // InternalProgram.g:1876:1: rule__Conference__Group_9__1__Impl : ( ( rule__Conference__ProgramAssignment_9_1 ) ) ;
    public final void rule__Conference__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1880:1: ( ( ( rule__Conference__ProgramAssignment_9_1 ) ) )
            // InternalProgram.g:1881:1: ( ( rule__Conference__ProgramAssignment_9_1 ) )
            {
            // InternalProgram.g:1881:1: ( ( rule__Conference__ProgramAssignment_9_1 ) )
            // InternalProgram.g:1882:2: ( rule__Conference__ProgramAssignment_9_1 )
            {
             before(grammarAccess.getConferenceAccess().getProgramAssignment_9_1()); 
            // InternalProgram.g:1883:2: ( rule__Conference__ProgramAssignment_9_1 )
            // InternalProgram.g:1883:3: rule__Conference__ProgramAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Conference__ProgramAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getConferenceAccess().getProgramAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_9__1__Impl"


    // $ANTLR start "rule__Program__Group__0"
    // InternalProgram.g:1892:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1896:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalProgram.g:1897:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalProgram.g:1904:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1908:1: ( ( () ) )
            // InternalProgram.g:1909:1: ( () )
            {
            // InternalProgram.g:1909:1: ( () )
            // InternalProgram.g:1910:2: ()
            {
             before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            // InternalProgram.g:1911:2: ()
            // InternalProgram.g:1911:3: 
            {
            }

             after(grammarAccess.getProgramAccess().getProgramAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalProgram.g:1919:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1923:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalProgram.g:1924:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalProgram.g:1931:1: rule__Program__Group__1__Impl : ( '{' ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1935:1: ( ( '{' ) )
            // InternalProgram.g:1936:1: ( '{' )
            {
            // InternalProgram.g:1936:1: ( '{' )
            // InternalProgram.g:1937:2: '{'
            {
             before(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // InternalProgram.g:1946:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1950:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalProgram.g:1951:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Program__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // InternalProgram.g:1958:1: rule__Program__Group__2__Impl : ( ( rule__Program__Group_2__0 )? ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1962:1: ( ( ( rule__Program__Group_2__0 )? ) )
            // InternalProgram.g:1963:1: ( ( rule__Program__Group_2__0 )? )
            {
            // InternalProgram.g:1963:1: ( ( rule__Program__Group_2__0 )? )
            // InternalProgram.g:1964:2: ( rule__Program__Group_2__0 )?
            {
             before(grammarAccess.getProgramAccess().getGroup_2()); 
            // InternalProgram.g:1965:2: ( rule__Program__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=11 && LA12_0<=17)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalProgram.g:1965:3: rule__Program__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Program__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgramAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program__Group__3"
    // InternalProgram.g:1973:1: rule__Program__Group__3 : rule__Program__Group__3__Impl ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1977:1: ( rule__Program__Group__3__Impl )
            // InternalProgram.g:1978:2: rule__Program__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3"


    // $ANTLR start "rule__Program__Group__3__Impl"
    // InternalProgram.g:1984:1: rule__Program__Group__3__Impl : ( '}' ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1988:1: ( ( '}' ) )
            // InternalProgram.g:1989:1: ( '}' )
            {
            // InternalProgram.g:1989:1: ( '}' )
            // InternalProgram.g:1990:2: '}'
            {
             before(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3__Impl"


    // $ANTLR start "rule__Program__Group_2__0"
    // InternalProgram.g:2000:1: rule__Program__Group_2__0 : rule__Program__Group_2__0__Impl rule__Program__Group_2__1 ;
    public final void rule__Program__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2004:1: ( rule__Program__Group_2__0__Impl rule__Program__Group_2__1 )
            // InternalProgram.g:2005:2: rule__Program__Group_2__0__Impl rule__Program__Group_2__1
            {
            pushFollow(FOLLOW_17);
            rule__Program__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_2__0"


    // $ANTLR start "rule__Program__Group_2__0__Impl"
    // InternalProgram.g:2012:1: rule__Program__Group_2__0__Impl : ( ( rule__Program__DaysAssignment_2_0 ) ) ;
    public final void rule__Program__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2016:1: ( ( ( rule__Program__DaysAssignment_2_0 ) ) )
            // InternalProgram.g:2017:1: ( ( rule__Program__DaysAssignment_2_0 ) )
            {
            // InternalProgram.g:2017:1: ( ( rule__Program__DaysAssignment_2_0 ) )
            // InternalProgram.g:2018:2: ( rule__Program__DaysAssignment_2_0 )
            {
             before(grammarAccess.getProgramAccess().getDaysAssignment_2_0()); 
            // InternalProgram.g:2019:2: ( rule__Program__DaysAssignment_2_0 )
            // InternalProgram.g:2019:3: rule__Program__DaysAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Program__DaysAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getDaysAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_2__0__Impl"


    // $ANTLR start "rule__Program__Group_2__1"
    // InternalProgram.g:2027:1: rule__Program__Group_2__1 : rule__Program__Group_2__1__Impl ;
    public final void rule__Program__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2031:1: ( rule__Program__Group_2__1__Impl )
            // InternalProgram.g:2032:2: rule__Program__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_2__1"


    // $ANTLR start "rule__Program__Group_2__1__Impl"
    // InternalProgram.g:2038:1: rule__Program__Group_2__1__Impl : ( ( rule__Program__DaysAssignment_2_1 )* ) ;
    public final void rule__Program__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2042:1: ( ( ( rule__Program__DaysAssignment_2_1 )* ) )
            // InternalProgram.g:2043:1: ( ( rule__Program__DaysAssignment_2_1 )* )
            {
            // InternalProgram.g:2043:1: ( ( rule__Program__DaysAssignment_2_1 )* )
            // InternalProgram.g:2044:2: ( rule__Program__DaysAssignment_2_1 )*
            {
             before(grammarAccess.getProgramAccess().getDaysAssignment_2_1()); 
            // InternalProgram.g:2045:2: ( rule__Program__DaysAssignment_2_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=11 && LA13_0<=17)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalProgram.g:2045:3: rule__Program__DaysAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Program__DaysAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getDaysAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_2__1__Impl"


    // $ANTLR start "rule__Room__Group__0"
    // InternalProgram.g:2054:1: rule__Room__Group__0 : rule__Room__Group__0__Impl rule__Room__Group__1 ;
    public final void rule__Room__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2058:1: ( rule__Room__Group__0__Impl rule__Room__Group__1 )
            // InternalProgram.g:2059:2: rule__Room__Group__0__Impl rule__Room__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Room__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__0"


    // $ANTLR start "rule__Room__Group__0__Impl"
    // InternalProgram.g:2066:1: rule__Room__Group__0__Impl : ( () ) ;
    public final void rule__Room__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2070:1: ( ( () ) )
            // InternalProgram.g:2071:1: ( () )
            {
            // InternalProgram.g:2071:1: ( () )
            // InternalProgram.g:2072:2: ()
            {
             before(grammarAccess.getRoomAccess().getRoomAction_0()); 
            // InternalProgram.g:2073:2: ()
            // InternalProgram.g:2073:3: 
            {
            }

             after(grammarAccess.getRoomAccess().getRoomAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__0__Impl"


    // $ANTLR start "rule__Room__Group__1"
    // InternalProgram.g:2081:1: rule__Room__Group__1 : rule__Room__Group__1__Impl rule__Room__Group__2 ;
    public final void rule__Room__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2085:1: ( rule__Room__Group__1__Impl rule__Room__Group__2 )
            // InternalProgram.g:2086:2: rule__Room__Group__1__Impl rule__Room__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Room__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__1"


    // $ANTLR start "rule__Room__Group__1__Impl"
    // InternalProgram.g:2093:1: rule__Room__Group__1__Impl : ( 'room' ) ;
    public final void rule__Room__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2097:1: ( ( 'room' ) )
            // InternalProgram.g:2098:1: ( 'room' )
            {
            // InternalProgram.g:2098:1: ( 'room' )
            // InternalProgram.g:2099:2: 'room'
            {
             before(grammarAccess.getRoomAccess().getRoomKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRoomKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__1__Impl"


    // $ANTLR start "rule__Room__Group__2"
    // InternalProgram.g:2108:1: rule__Room__Group__2 : rule__Room__Group__2__Impl rule__Room__Group__3 ;
    public final void rule__Room__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2112:1: ( rule__Room__Group__2__Impl rule__Room__Group__3 )
            // InternalProgram.g:2113:2: rule__Room__Group__2__Impl rule__Room__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Room__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__2"


    // $ANTLR start "rule__Room__Group__2__Impl"
    // InternalProgram.g:2120:1: rule__Room__Group__2__Impl : ( ( rule__Room__NameAssignment_2 ) ) ;
    public final void rule__Room__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2124:1: ( ( ( rule__Room__NameAssignment_2 ) ) )
            // InternalProgram.g:2125:1: ( ( rule__Room__NameAssignment_2 ) )
            {
            // InternalProgram.g:2125:1: ( ( rule__Room__NameAssignment_2 ) )
            // InternalProgram.g:2126:2: ( rule__Room__NameAssignment_2 )
            {
             before(grammarAccess.getRoomAccess().getNameAssignment_2()); 
            // InternalProgram.g:2127:2: ( rule__Room__NameAssignment_2 )
            // InternalProgram.g:2127:3: rule__Room__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Room__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__2__Impl"


    // $ANTLR start "rule__Room__Group__3"
    // InternalProgram.g:2135:1: rule__Room__Group__3 : rule__Room__Group__3__Impl ;
    public final void rule__Room__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2139:1: ( rule__Room__Group__3__Impl )
            // InternalProgram.g:2140:2: rule__Room__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__3"


    // $ANTLR start "rule__Room__Group__3__Impl"
    // InternalProgram.g:2146:1: rule__Room__Group__3__Impl : ( ( rule__Room__Group_3__0 )? ) ;
    public final void rule__Room__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2150:1: ( ( ( rule__Room__Group_3__0 )? ) )
            // InternalProgram.g:2151:1: ( ( rule__Room__Group_3__0 )? )
            {
            // InternalProgram.g:2151:1: ( ( rule__Room__Group_3__0 )? )
            // InternalProgram.g:2152:2: ( rule__Room__Group_3__0 )?
            {
             before(grammarAccess.getRoomAccess().getGroup_3()); 
            // InternalProgram.g:2153:2: ( rule__Room__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalProgram.g:2153:3: rule__Room__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Room__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoomAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__3__Impl"


    // $ANTLR start "rule__Room__Group_3__0"
    // InternalProgram.g:2162:1: rule__Room__Group_3__0 : rule__Room__Group_3__0__Impl rule__Room__Group_3__1 ;
    public final void rule__Room__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2166:1: ( rule__Room__Group_3__0__Impl rule__Room__Group_3__1 )
            // InternalProgram.g:2167:2: rule__Room__Group_3__0__Impl rule__Room__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Room__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_3__0"


    // $ANTLR start "rule__Room__Group_3__0__Impl"
    // InternalProgram.g:2174:1: rule__Room__Group_3__0__Impl : ( 'capacity' ) ;
    public final void rule__Room__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2178:1: ( ( 'capacity' ) )
            // InternalProgram.g:2179:1: ( 'capacity' )
            {
            // InternalProgram.g:2179:1: ( 'capacity' )
            // InternalProgram.g:2180:2: 'capacity'
            {
             before(grammarAccess.getRoomAccess().getCapacityKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getCapacityKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_3__0__Impl"


    // $ANTLR start "rule__Room__Group_3__1"
    // InternalProgram.g:2189:1: rule__Room__Group_3__1 : rule__Room__Group_3__1__Impl ;
    public final void rule__Room__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2193:1: ( rule__Room__Group_3__1__Impl )
            // InternalProgram.g:2194:2: rule__Room__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_3__1"


    // $ANTLR start "rule__Room__Group_3__1__Impl"
    // InternalProgram.g:2200:1: rule__Room__Group_3__1__Impl : ( ( rule__Room__CapacityAssignment_3_1 ) ) ;
    public final void rule__Room__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2204:1: ( ( ( rule__Room__CapacityAssignment_3_1 ) ) )
            // InternalProgram.g:2205:1: ( ( rule__Room__CapacityAssignment_3_1 ) )
            {
            // InternalProgram.g:2205:1: ( ( rule__Room__CapacityAssignment_3_1 ) )
            // InternalProgram.g:2206:2: ( rule__Room__CapacityAssignment_3_1 )
            {
             before(grammarAccess.getRoomAccess().getCapacityAssignment_3_1()); 
            // InternalProgram.g:2207:2: ( rule__Room__CapacityAssignment_3_1 )
            // InternalProgram.g:2207:3: rule__Room__CapacityAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Room__CapacityAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getCapacityAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_3__1__Impl"


    // $ANTLR start "rule__Day__Group__0"
    // InternalProgram.g:2216:1: rule__Day__Group__0 : rule__Day__Group__0__Impl rule__Day__Group__1 ;
    public final void rule__Day__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2220:1: ( rule__Day__Group__0__Impl rule__Day__Group__1 )
            // InternalProgram.g:2221:2: rule__Day__Group__0__Impl rule__Day__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Day__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Day__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group__0"


    // $ANTLR start "rule__Day__Group__0__Impl"
    // InternalProgram.g:2228:1: rule__Day__Group__0__Impl : ( ( rule__Day__WeekdayAssignment_0 ) ) ;
    public final void rule__Day__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2232:1: ( ( ( rule__Day__WeekdayAssignment_0 ) ) )
            // InternalProgram.g:2233:1: ( ( rule__Day__WeekdayAssignment_0 ) )
            {
            // InternalProgram.g:2233:1: ( ( rule__Day__WeekdayAssignment_0 ) )
            // InternalProgram.g:2234:2: ( rule__Day__WeekdayAssignment_0 )
            {
             before(grammarAccess.getDayAccess().getWeekdayAssignment_0()); 
            // InternalProgram.g:2235:2: ( rule__Day__WeekdayAssignment_0 )
            // InternalProgram.g:2235:3: rule__Day__WeekdayAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Day__WeekdayAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDayAccess().getWeekdayAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group__0__Impl"


    // $ANTLR start "rule__Day__Group__1"
    // InternalProgram.g:2243:1: rule__Day__Group__1 : rule__Day__Group__1__Impl rule__Day__Group__2 ;
    public final void rule__Day__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2247:1: ( rule__Day__Group__1__Impl rule__Day__Group__2 )
            // InternalProgram.g:2248:2: rule__Day__Group__1__Impl rule__Day__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Day__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Day__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group__1"


    // $ANTLR start "rule__Day__Group__1__Impl"
    // InternalProgram.g:2255:1: rule__Day__Group__1__Impl : ( ( rule__Day__Group_1__0 )? ) ;
    public final void rule__Day__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2259:1: ( ( ( rule__Day__Group_1__0 )? ) )
            // InternalProgram.g:2260:1: ( ( rule__Day__Group_1__0 )? )
            {
            // InternalProgram.g:2260:1: ( ( rule__Day__Group_1__0 )? )
            // InternalProgram.g:2261:2: ( rule__Day__Group_1__0 )?
            {
             before(grammarAccess.getDayAccess().getGroup_1()); 
            // InternalProgram.g:2262:2: ( rule__Day__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalProgram.g:2262:3: rule__Day__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Day__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDayAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group__1__Impl"


    // $ANTLR start "rule__Day__Group__2"
    // InternalProgram.g:2270:1: rule__Day__Group__2 : rule__Day__Group__2__Impl ;
    public final void rule__Day__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2274:1: ( rule__Day__Group__2__Impl )
            // InternalProgram.g:2275:2: rule__Day__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Day__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group__2"


    // $ANTLR start "rule__Day__Group__2__Impl"
    // InternalProgram.g:2281:1: rule__Day__Group__2__Impl : ( ( rule__Day__Group_2__0 )? ) ;
    public final void rule__Day__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2285:1: ( ( ( rule__Day__Group_2__0 )? ) )
            // InternalProgram.g:2286:1: ( ( rule__Day__Group_2__0 )? )
            {
            // InternalProgram.g:2286:1: ( ( rule__Day__Group_2__0 )? )
            // InternalProgram.g:2287:2: ( rule__Day__Group_2__0 )?
            {
             before(grammarAccess.getDayAccess().getGroup_2()); 
            // InternalProgram.g:2288:2: ( rule__Day__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalProgram.g:2288:3: rule__Day__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Day__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDayAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group__2__Impl"


    // $ANTLR start "rule__Day__Group_1__0"
    // InternalProgram.g:2297:1: rule__Day__Group_1__0 : rule__Day__Group_1__0__Impl rule__Day__Group_1__1 ;
    public final void rule__Day__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2301:1: ( rule__Day__Group_1__0__Impl rule__Day__Group_1__1 )
            // InternalProgram.g:2302:2: rule__Day__Group_1__0__Impl rule__Day__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Day__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Day__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group_1__0"


    // $ANTLR start "rule__Day__Group_1__0__Impl"
    // InternalProgram.g:2309:1: rule__Day__Group_1__0__Impl : ( 'date' ) ;
    public final void rule__Day__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2313:1: ( ( 'date' ) )
            // InternalProgram.g:2314:1: ( 'date' )
            {
            // InternalProgram.g:2314:1: ( 'date' )
            // InternalProgram.g:2315:2: 'date'
            {
             before(grammarAccess.getDayAccess().getDateKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDayAccess().getDateKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group_1__0__Impl"


    // $ANTLR start "rule__Day__Group_1__1"
    // InternalProgram.g:2324:1: rule__Day__Group_1__1 : rule__Day__Group_1__1__Impl ;
    public final void rule__Day__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2328:1: ( rule__Day__Group_1__1__Impl )
            // InternalProgram.g:2329:2: rule__Day__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Day__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group_1__1"


    // $ANTLR start "rule__Day__Group_1__1__Impl"
    // InternalProgram.g:2335:1: rule__Day__Group_1__1__Impl : ( ( rule__Day__DateAssignment_1_1 ) ) ;
    public final void rule__Day__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2339:1: ( ( ( rule__Day__DateAssignment_1_1 ) ) )
            // InternalProgram.g:2340:1: ( ( rule__Day__DateAssignment_1_1 ) )
            {
            // InternalProgram.g:2340:1: ( ( rule__Day__DateAssignment_1_1 ) )
            // InternalProgram.g:2341:2: ( rule__Day__DateAssignment_1_1 )
            {
             before(grammarAccess.getDayAccess().getDateAssignment_1_1()); 
            // InternalProgram.g:2342:2: ( rule__Day__DateAssignment_1_1 )
            // InternalProgram.g:2342:3: rule__Day__DateAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Day__DateAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDayAccess().getDateAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group_1__1__Impl"


    // $ANTLR start "rule__Day__Group_2__0"
    // InternalProgram.g:2351:1: rule__Day__Group_2__0 : rule__Day__Group_2__0__Impl rule__Day__Group_2__1 ;
    public final void rule__Day__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2355:1: ( rule__Day__Group_2__0__Impl rule__Day__Group_2__1 )
            // InternalProgram.g:2356:2: rule__Day__Group_2__0__Impl rule__Day__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Day__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Day__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group_2__0"


    // $ANTLR start "rule__Day__Group_2__0__Impl"
    // InternalProgram.g:2363:1: rule__Day__Group_2__0__Impl : ( ( rule__Day__SessionsAssignment_2_0 ) ) ;
    public final void rule__Day__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2367:1: ( ( ( rule__Day__SessionsAssignment_2_0 ) ) )
            // InternalProgram.g:2368:1: ( ( rule__Day__SessionsAssignment_2_0 ) )
            {
            // InternalProgram.g:2368:1: ( ( rule__Day__SessionsAssignment_2_0 ) )
            // InternalProgram.g:2369:2: ( rule__Day__SessionsAssignment_2_0 )
            {
             before(grammarAccess.getDayAccess().getSessionsAssignment_2_0()); 
            // InternalProgram.g:2370:2: ( rule__Day__SessionsAssignment_2_0 )
            // InternalProgram.g:2370:3: rule__Day__SessionsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Day__SessionsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getDayAccess().getSessionsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group_2__0__Impl"


    // $ANTLR start "rule__Day__Group_2__1"
    // InternalProgram.g:2378:1: rule__Day__Group_2__1 : rule__Day__Group_2__1__Impl ;
    public final void rule__Day__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2382:1: ( rule__Day__Group_2__1__Impl )
            // InternalProgram.g:2383:2: rule__Day__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Day__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group_2__1"


    // $ANTLR start "rule__Day__Group_2__1__Impl"
    // InternalProgram.g:2389:1: rule__Day__Group_2__1__Impl : ( ( rule__Day__SessionsAssignment_2_1 )* ) ;
    public final void rule__Day__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2393:1: ( ( ( rule__Day__SessionsAssignment_2_1 )* ) )
            // InternalProgram.g:2394:1: ( ( rule__Day__SessionsAssignment_2_1 )* )
            {
            // InternalProgram.g:2394:1: ( ( rule__Day__SessionsAssignment_2_1 )* )
            // InternalProgram.g:2395:2: ( rule__Day__SessionsAssignment_2_1 )*
            {
             before(grammarAccess.getDayAccess().getSessionsAssignment_2_1()); 
            // InternalProgram.g:2396:2: ( rule__Day__SessionsAssignment_2_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_INT) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalProgram.g:2396:3: rule__Day__SessionsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Day__SessionsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getDayAccess().getSessionsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group_2__1__Impl"


    // $ANTLR start "rule__DayDataType__Group__0"
    // InternalProgram.g:2405:1: rule__DayDataType__Group__0 : rule__DayDataType__Group__0__Impl rule__DayDataType__Group__1 ;
    public final void rule__DayDataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2409:1: ( rule__DayDataType__Group__0__Impl rule__DayDataType__Group__1 )
            // InternalProgram.g:2410:2: rule__DayDataType__Group__0__Impl rule__DayDataType__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__DayDataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DayDataType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DayDataType__Group__0"


    // $ANTLR start "rule__DayDataType__Group__0__Impl"
    // InternalProgram.g:2417:1: rule__DayDataType__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DayDataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2421:1: ( ( RULE_INT ) )
            // InternalProgram.g:2422:1: ( RULE_INT )
            {
            // InternalProgram.g:2422:1: ( RULE_INT )
            // InternalProgram.g:2423:2: RULE_INT
            {
             before(grammarAccess.getDayDataTypeAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDayDataTypeAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DayDataType__Group__0__Impl"


    // $ANTLR start "rule__DayDataType__Group__1"
    // InternalProgram.g:2432:1: rule__DayDataType__Group__1 : rule__DayDataType__Group__1__Impl rule__DayDataType__Group__2 ;
    public final void rule__DayDataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2436:1: ( rule__DayDataType__Group__1__Impl rule__DayDataType__Group__2 )
            // InternalProgram.g:2437:2: rule__DayDataType__Group__1__Impl rule__DayDataType__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__DayDataType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DayDataType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DayDataType__Group__1"


    // $ANTLR start "rule__DayDataType__Group__1__Impl"
    // InternalProgram.g:2444:1: rule__DayDataType__Group__1__Impl : ( '.' ) ;
    public final void rule__DayDataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2448:1: ( ( '.' ) )
            // InternalProgram.g:2449:1: ( '.' )
            {
            // InternalProgram.g:2449:1: ( '.' )
            // InternalProgram.g:2450:2: '.'
            {
             before(grammarAccess.getDayDataTypeAccess().getFullStopKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDayDataTypeAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DayDataType__Group__1__Impl"


    // $ANTLR start "rule__DayDataType__Group__2"
    // InternalProgram.g:2459:1: rule__DayDataType__Group__2 : rule__DayDataType__Group__2__Impl rule__DayDataType__Group__3 ;
    public final void rule__DayDataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2463:1: ( rule__DayDataType__Group__2__Impl rule__DayDataType__Group__3 )
            // InternalProgram.g:2464:2: rule__DayDataType__Group__2__Impl rule__DayDataType__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__DayDataType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DayDataType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DayDataType__Group__2"


    // $ANTLR start "rule__DayDataType__Group__2__Impl"
    // InternalProgram.g:2471:1: rule__DayDataType__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DayDataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2475:1: ( ( RULE_INT ) )
            // InternalProgram.g:2476:1: ( RULE_INT )
            {
            // InternalProgram.g:2476:1: ( RULE_INT )
            // InternalProgram.g:2477:2: RULE_INT
            {
             before(grammarAccess.getDayDataTypeAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDayDataTypeAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DayDataType__Group__2__Impl"


    // $ANTLR start "rule__DayDataType__Group__3"
    // InternalProgram.g:2486:1: rule__DayDataType__Group__3 : rule__DayDataType__Group__3__Impl rule__DayDataType__Group__4 ;
    public final void rule__DayDataType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2490:1: ( rule__DayDataType__Group__3__Impl rule__DayDataType__Group__4 )
            // InternalProgram.g:2491:2: rule__DayDataType__Group__3__Impl rule__DayDataType__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__DayDataType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DayDataType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DayDataType__Group__3"


    // $ANTLR start "rule__DayDataType__Group__3__Impl"
    // InternalProgram.g:2498:1: rule__DayDataType__Group__3__Impl : ( '.' ) ;
    public final void rule__DayDataType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2502:1: ( ( '.' ) )
            // InternalProgram.g:2503:1: ( '.' )
            {
            // InternalProgram.g:2503:1: ( '.' )
            // InternalProgram.g:2504:2: '.'
            {
             before(grammarAccess.getDayDataTypeAccess().getFullStopKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDayDataTypeAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DayDataType__Group__3__Impl"


    // $ANTLR start "rule__DayDataType__Group__4"
    // InternalProgram.g:2513:1: rule__DayDataType__Group__4 : rule__DayDataType__Group__4__Impl ;
    public final void rule__DayDataType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2517:1: ( rule__DayDataType__Group__4__Impl )
            // InternalProgram.g:2518:2: rule__DayDataType__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DayDataType__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DayDataType__Group__4"


    // $ANTLR start "rule__DayDataType__Group__4__Impl"
    // InternalProgram.g:2524:1: rule__DayDataType__Group__4__Impl : ( RULE_INT ) ;
    public final void rule__DayDataType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2528:1: ( ( RULE_INT ) )
            // InternalProgram.g:2529:1: ( RULE_INT )
            {
            // InternalProgram.g:2529:1: ( RULE_INT )
            // InternalProgram.g:2530:2: RULE_INT
            {
             before(grammarAccess.getDayDataTypeAccess().getINTTerminalRuleCall_4()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDayDataTypeAccess().getINTTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DayDataType__Group__4__Impl"


    // $ANTLR start "rule__HourDataType__Group__0"
    // InternalProgram.g:2540:1: rule__HourDataType__Group__0 : rule__HourDataType__Group__0__Impl rule__HourDataType__Group__1 ;
    public final void rule__HourDataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2544:1: ( rule__HourDataType__Group__0__Impl rule__HourDataType__Group__1 )
            // InternalProgram.g:2545:2: rule__HourDataType__Group__0__Impl rule__HourDataType__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__HourDataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HourDataType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HourDataType__Group__0"


    // $ANTLR start "rule__HourDataType__Group__0__Impl"
    // InternalProgram.g:2552:1: rule__HourDataType__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__HourDataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2556:1: ( ( RULE_INT ) )
            // InternalProgram.g:2557:1: ( RULE_INT )
            {
            // InternalProgram.g:2557:1: ( RULE_INT )
            // InternalProgram.g:2558:2: RULE_INT
            {
             before(grammarAccess.getHourDataTypeAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getHourDataTypeAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HourDataType__Group__0__Impl"


    // $ANTLR start "rule__HourDataType__Group__1"
    // InternalProgram.g:2567:1: rule__HourDataType__Group__1 : rule__HourDataType__Group__1__Impl rule__HourDataType__Group__2 ;
    public final void rule__HourDataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2571:1: ( rule__HourDataType__Group__1__Impl rule__HourDataType__Group__2 )
            // InternalProgram.g:2572:2: rule__HourDataType__Group__1__Impl rule__HourDataType__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__HourDataType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HourDataType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HourDataType__Group__1"


    // $ANTLR start "rule__HourDataType__Group__1__Impl"
    // InternalProgram.g:2579:1: rule__HourDataType__Group__1__Impl : ( ':' ) ;
    public final void rule__HourDataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2583:1: ( ( ':' ) )
            // InternalProgram.g:2584:1: ( ':' )
            {
            // InternalProgram.g:2584:1: ( ':' )
            // InternalProgram.g:2585:2: ':'
            {
             before(grammarAccess.getHourDataTypeAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getHourDataTypeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HourDataType__Group__1__Impl"


    // $ANTLR start "rule__HourDataType__Group__2"
    // InternalProgram.g:2594:1: rule__HourDataType__Group__2 : rule__HourDataType__Group__2__Impl ;
    public final void rule__HourDataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2598:1: ( rule__HourDataType__Group__2__Impl )
            // InternalProgram.g:2599:2: rule__HourDataType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HourDataType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HourDataType__Group__2"


    // $ANTLR start "rule__HourDataType__Group__2__Impl"
    // InternalProgram.g:2605:1: rule__HourDataType__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__HourDataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2609:1: ( ( RULE_INT ) )
            // InternalProgram.g:2610:1: ( RULE_INT )
            {
            // InternalProgram.g:2610:1: ( RULE_INT )
            // InternalProgram.g:2611:2: RULE_INT
            {
             before(grammarAccess.getHourDataTypeAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getHourDataTypeAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HourDataType__Group__2__Impl"


    // $ANTLR start "rule__Session__Group__0"
    // InternalProgram.g:2621:1: rule__Session__Group__0 : rule__Session__Group__0__Impl rule__Session__Group__1 ;
    public final void rule__Session__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2625:1: ( rule__Session__Group__0__Impl rule__Session__Group__1 )
            // InternalProgram.g:2626:2: rule__Session__Group__0__Impl rule__Session__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Session__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__0"


    // $ANTLR start "rule__Session__Group__0__Impl"
    // InternalProgram.g:2633:1: rule__Session__Group__0__Impl : ( () ) ;
    public final void rule__Session__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2637:1: ( ( () ) )
            // InternalProgram.g:2638:1: ( () )
            {
            // InternalProgram.g:2638:1: ( () )
            // InternalProgram.g:2639:2: ()
            {
             before(grammarAccess.getSessionAccess().getSessionAction_0()); 
            // InternalProgram.g:2640:2: ()
            // InternalProgram.g:2640:3: 
            {
            }

             after(grammarAccess.getSessionAccess().getSessionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__0__Impl"


    // $ANTLR start "rule__Session__Group__1"
    // InternalProgram.g:2648:1: rule__Session__Group__1 : rule__Session__Group__1__Impl rule__Session__Group__2 ;
    public final void rule__Session__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2652:1: ( rule__Session__Group__1__Impl rule__Session__Group__2 )
            // InternalProgram.g:2653:2: rule__Session__Group__1__Impl rule__Session__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Session__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__1"


    // $ANTLR start "rule__Session__Group__1__Impl"
    // InternalProgram.g:2660:1: rule__Session__Group__1__Impl : ( ( rule__Session__StartingTimeAssignment_1 ) ) ;
    public final void rule__Session__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2664:1: ( ( ( rule__Session__StartingTimeAssignment_1 ) ) )
            // InternalProgram.g:2665:1: ( ( rule__Session__StartingTimeAssignment_1 ) )
            {
            // InternalProgram.g:2665:1: ( ( rule__Session__StartingTimeAssignment_1 ) )
            // InternalProgram.g:2666:2: ( rule__Session__StartingTimeAssignment_1 )
            {
             before(grammarAccess.getSessionAccess().getStartingTimeAssignment_1()); 
            // InternalProgram.g:2667:2: ( rule__Session__StartingTimeAssignment_1 )
            // InternalProgram.g:2667:3: rule__Session__StartingTimeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Session__StartingTimeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getStartingTimeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__1__Impl"


    // $ANTLR start "rule__Session__Group__2"
    // InternalProgram.g:2675:1: rule__Session__Group__2 : rule__Session__Group__2__Impl rule__Session__Group__3 ;
    public final void rule__Session__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2679:1: ( rule__Session__Group__2__Impl rule__Session__Group__3 )
            // InternalProgram.g:2680:2: rule__Session__Group__2__Impl rule__Session__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Session__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__2"


    // $ANTLR start "rule__Session__Group__2__Impl"
    // InternalProgram.g:2687:1: rule__Session__Group__2__Impl : ( '-' ) ;
    public final void rule__Session__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2691:1: ( ( '-' ) )
            // InternalProgram.g:2692:1: ( '-' )
            {
            // InternalProgram.g:2692:1: ( '-' )
            // InternalProgram.g:2693:2: '-'
            {
             before(grammarAccess.getSessionAccess().getHyphenMinusKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getHyphenMinusKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__2__Impl"


    // $ANTLR start "rule__Session__Group__3"
    // InternalProgram.g:2702:1: rule__Session__Group__3 : rule__Session__Group__3__Impl rule__Session__Group__4 ;
    public final void rule__Session__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2706:1: ( rule__Session__Group__3__Impl rule__Session__Group__4 )
            // InternalProgram.g:2707:2: rule__Session__Group__3__Impl rule__Session__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Session__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__3"


    // $ANTLR start "rule__Session__Group__3__Impl"
    // InternalProgram.g:2714:1: rule__Session__Group__3__Impl : ( ( rule__Session__EndingTimeAssignment_3 ) ) ;
    public final void rule__Session__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2718:1: ( ( ( rule__Session__EndingTimeAssignment_3 ) ) )
            // InternalProgram.g:2719:1: ( ( rule__Session__EndingTimeAssignment_3 ) )
            {
            // InternalProgram.g:2719:1: ( ( rule__Session__EndingTimeAssignment_3 ) )
            // InternalProgram.g:2720:2: ( rule__Session__EndingTimeAssignment_3 )
            {
             before(grammarAccess.getSessionAccess().getEndingTimeAssignment_3()); 
            // InternalProgram.g:2721:2: ( rule__Session__EndingTimeAssignment_3 )
            // InternalProgram.g:2721:3: rule__Session__EndingTimeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Session__EndingTimeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getEndingTimeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__3__Impl"


    // $ANTLR start "rule__Session__Group__4"
    // InternalProgram.g:2729:1: rule__Session__Group__4 : rule__Session__Group__4__Impl rule__Session__Group__5 ;
    public final void rule__Session__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2733:1: ( rule__Session__Group__4__Impl rule__Session__Group__5 )
            // InternalProgram.g:2734:2: rule__Session__Group__4__Impl rule__Session__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Session__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__4"


    // $ANTLR start "rule__Session__Group__4__Impl"
    // InternalProgram.g:2741:1: rule__Session__Group__4__Impl : ( 'in' ) ;
    public final void rule__Session__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2745:1: ( ( 'in' ) )
            // InternalProgram.g:2746:1: ( 'in' )
            {
            // InternalProgram.g:2746:1: ( 'in' )
            // InternalProgram.g:2747:2: 'in'
            {
             before(grammarAccess.getSessionAccess().getInKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getInKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__4__Impl"


    // $ANTLR start "rule__Session__Group__5"
    // InternalProgram.g:2756:1: rule__Session__Group__5 : rule__Session__Group__5__Impl rule__Session__Group__6 ;
    public final void rule__Session__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2760:1: ( rule__Session__Group__5__Impl rule__Session__Group__6 )
            // InternalProgram.g:2761:2: rule__Session__Group__5__Impl rule__Session__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Session__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__5"


    // $ANTLR start "rule__Session__Group__5__Impl"
    // InternalProgram.g:2768:1: rule__Session__Group__5__Impl : ( ( rule__Session__RoomAssignment_5 ) ) ;
    public final void rule__Session__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2772:1: ( ( ( rule__Session__RoomAssignment_5 ) ) )
            // InternalProgram.g:2773:1: ( ( rule__Session__RoomAssignment_5 ) )
            {
            // InternalProgram.g:2773:1: ( ( rule__Session__RoomAssignment_5 ) )
            // InternalProgram.g:2774:2: ( rule__Session__RoomAssignment_5 )
            {
             before(grammarAccess.getSessionAccess().getRoomAssignment_5()); 
            // InternalProgram.g:2775:2: ( rule__Session__RoomAssignment_5 )
            // InternalProgram.g:2775:3: rule__Session__RoomAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Session__RoomAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getRoomAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__5__Impl"


    // $ANTLR start "rule__Session__Group__6"
    // InternalProgram.g:2783:1: rule__Session__Group__6 : rule__Session__Group__6__Impl rule__Session__Group__7 ;
    public final void rule__Session__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2787:1: ( rule__Session__Group__6__Impl rule__Session__Group__7 )
            // InternalProgram.g:2788:2: rule__Session__Group__6__Impl rule__Session__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__Session__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__6"


    // $ANTLR start "rule__Session__Group__6__Impl"
    // InternalProgram.g:2795:1: rule__Session__Group__6__Impl : ( ':' ) ;
    public final void rule__Session__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2799:1: ( ( ':' ) )
            // InternalProgram.g:2800:1: ( ':' )
            {
            // InternalProgram.g:2800:1: ( ':' )
            // InternalProgram.g:2801:2: ':'
            {
             before(grammarAccess.getSessionAccess().getColonKeyword_6()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getColonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__6__Impl"


    // $ANTLR start "rule__Session__Group__7"
    // InternalProgram.g:2810:1: rule__Session__Group__7 : rule__Session__Group__7__Impl rule__Session__Group__8 ;
    public final void rule__Session__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2814:1: ( rule__Session__Group__7__Impl rule__Session__Group__8 )
            // InternalProgram.g:2815:2: rule__Session__Group__7__Impl rule__Session__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Session__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__7"


    // $ANTLR start "rule__Session__Group__7__Impl"
    // InternalProgram.g:2822:1: rule__Session__Group__7__Impl : ( ( rule__Session__EventsAssignment_7 ) ) ;
    public final void rule__Session__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2826:1: ( ( ( rule__Session__EventsAssignment_7 ) ) )
            // InternalProgram.g:2827:1: ( ( rule__Session__EventsAssignment_7 ) )
            {
            // InternalProgram.g:2827:1: ( ( rule__Session__EventsAssignment_7 ) )
            // InternalProgram.g:2828:2: ( rule__Session__EventsAssignment_7 )
            {
             before(grammarAccess.getSessionAccess().getEventsAssignment_7()); 
            // InternalProgram.g:2829:2: ( rule__Session__EventsAssignment_7 )
            // InternalProgram.g:2829:3: rule__Session__EventsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Session__EventsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getEventsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__7__Impl"


    // $ANTLR start "rule__Session__Group__8"
    // InternalProgram.g:2837:1: rule__Session__Group__8 : rule__Session__Group__8__Impl ;
    public final void rule__Session__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2841:1: ( rule__Session__Group__8__Impl )
            // InternalProgram.g:2842:2: rule__Session__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Session__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__8"


    // $ANTLR start "rule__Session__Group__8__Impl"
    // InternalProgram.g:2848:1: rule__Session__Group__8__Impl : ( ( rule__Session__Group_8__0 )* ) ;
    public final void rule__Session__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2852:1: ( ( ( rule__Session__Group_8__0 )* ) )
            // InternalProgram.g:2853:1: ( ( rule__Session__Group_8__0 )* )
            {
            // InternalProgram.g:2853:1: ( ( rule__Session__Group_8__0 )* )
            // InternalProgram.g:2854:2: ( rule__Session__Group_8__0 )*
            {
             before(grammarAccess.getSessionAccess().getGroup_8()); 
            // InternalProgram.g:2855:2: ( rule__Session__Group_8__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==21) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalProgram.g:2855:3: rule__Session__Group_8__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Session__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getSessionAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__8__Impl"


    // $ANTLR start "rule__Session__Group_8__0"
    // InternalProgram.g:2864:1: rule__Session__Group_8__0 : rule__Session__Group_8__0__Impl rule__Session__Group_8__1 ;
    public final void rule__Session__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2868:1: ( rule__Session__Group_8__0__Impl rule__Session__Group_8__1 )
            // InternalProgram.g:2869:2: rule__Session__Group_8__0__Impl rule__Session__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__Session__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_8__0"


    // $ANTLR start "rule__Session__Group_8__0__Impl"
    // InternalProgram.g:2876:1: rule__Session__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Session__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2880:1: ( ( ',' ) )
            // InternalProgram.g:2881:1: ( ',' )
            {
            // InternalProgram.g:2881:1: ( ',' )
            // InternalProgram.g:2882:2: ','
            {
             before(grammarAccess.getSessionAccess().getCommaKeyword_8_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_8__0__Impl"


    // $ANTLR start "rule__Session__Group_8__1"
    // InternalProgram.g:2891:1: rule__Session__Group_8__1 : rule__Session__Group_8__1__Impl ;
    public final void rule__Session__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2895:1: ( rule__Session__Group_8__1__Impl )
            // InternalProgram.g:2896:2: rule__Session__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Session__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_8__1"


    // $ANTLR start "rule__Session__Group_8__1__Impl"
    // InternalProgram.g:2902:1: rule__Session__Group_8__1__Impl : ( ( rule__Session__EventsAssignment_8_1 ) ) ;
    public final void rule__Session__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2906:1: ( ( ( rule__Session__EventsAssignment_8_1 ) ) )
            // InternalProgram.g:2907:1: ( ( rule__Session__EventsAssignment_8_1 ) )
            {
            // InternalProgram.g:2907:1: ( ( rule__Session__EventsAssignment_8_1 ) )
            // InternalProgram.g:2908:2: ( rule__Session__EventsAssignment_8_1 )
            {
             before(grammarAccess.getSessionAccess().getEventsAssignment_8_1()); 
            // InternalProgram.g:2909:2: ( rule__Session__EventsAssignment_8_1 )
            // InternalProgram.g:2909:3: rule__Session__EventsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Session__EventsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getEventsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_8__1__Impl"


    // $ANTLR start "rule__TalkSession__Group__0"
    // InternalProgram.g:2918:1: rule__TalkSession__Group__0 : rule__TalkSession__Group__0__Impl rule__TalkSession__Group__1 ;
    public final void rule__TalkSession__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2922:1: ( rule__TalkSession__Group__0__Impl rule__TalkSession__Group__1 )
            // InternalProgram.g:2923:2: rule__TalkSession__Group__0__Impl rule__TalkSession__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TalkSession__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TalkSession__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group__0"


    // $ANTLR start "rule__TalkSession__Group__0__Impl"
    // InternalProgram.g:2930:1: rule__TalkSession__Group__0__Impl : ( 'TalkSession' ) ;
    public final void rule__TalkSession__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2934:1: ( ( 'TalkSession' ) )
            // InternalProgram.g:2935:1: ( 'TalkSession' )
            {
            // InternalProgram.g:2935:1: ( 'TalkSession' )
            // InternalProgram.g:2936:2: 'TalkSession'
            {
             before(grammarAccess.getTalkSessionAccess().getTalkSessionKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTalkSessionAccess().getTalkSessionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group__0__Impl"


    // $ANTLR start "rule__TalkSession__Group__1"
    // InternalProgram.g:2945:1: rule__TalkSession__Group__1 : rule__TalkSession__Group__1__Impl rule__TalkSession__Group__2 ;
    public final void rule__TalkSession__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2949:1: ( rule__TalkSession__Group__1__Impl rule__TalkSession__Group__2 )
            // InternalProgram.g:2950:2: rule__TalkSession__Group__1__Impl rule__TalkSession__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__TalkSession__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TalkSession__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group__1"


    // $ANTLR start "rule__TalkSession__Group__1__Impl"
    // InternalProgram.g:2957:1: rule__TalkSession__Group__1__Impl : ( ( rule__TalkSession__NameAssignment_1 ) ) ;
    public final void rule__TalkSession__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2961:1: ( ( ( rule__TalkSession__NameAssignment_1 ) ) )
            // InternalProgram.g:2962:1: ( ( rule__TalkSession__NameAssignment_1 ) )
            {
            // InternalProgram.g:2962:1: ( ( rule__TalkSession__NameAssignment_1 ) )
            // InternalProgram.g:2963:2: ( rule__TalkSession__NameAssignment_1 )
            {
             before(grammarAccess.getTalkSessionAccess().getNameAssignment_1()); 
            // InternalProgram.g:2964:2: ( rule__TalkSession__NameAssignment_1 )
            // InternalProgram.g:2964:3: rule__TalkSession__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TalkSession__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTalkSessionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group__1__Impl"


    // $ANTLR start "rule__TalkSession__Group__2"
    // InternalProgram.g:2972:1: rule__TalkSession__Group__2 : rule__TalkSession__Group__2__Impl rule__TalkSession__Group__3 ;
    public final void rule__TalkSession__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2976:1: ( rule__TalkSession__Group__2__Impl rule__TalkSession__Group__3 )
            // InternalProgram.g:2977:2: rule__TalkSession__Group__2__Impl rule__TalkSession__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__TalkSession__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TalkSession__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group__2"


    // $ANTLR start "rule__TalkSession__Group__2__Impl"
    // InternalProgram.g:2984:1: rule__TalkSession__Group__2__Impl : ( ( rule__TalkSession__Group_2__0 )? ) ;
    public final void rule__TalkSession__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2988:1: ( ( ( rule__TalkSession__Group_2__0 )? ) )
            // InternalProgram.g:2989:1: ( ( rule__TalkSession__Group_2__0 )? )
            {
            // InternalProgram.g:2989:1: ( ( rule__TalkSession__Group_2__0 )? )
            // InternalProgram.g:2990:2: ( rule__TalkSession__Group_2__0 )?
            {
             before(grammarAccess.getTalkSessionAccess().getGroup_2()); 
            // InternalProgram.g:2991:2: ( rule__TalkSession__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalProgram.g:2991:3: rule__TalkSession__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TalkSession__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTalkSessionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group__2__Impl"


    // $ANTLR start "rule__TalkSession__Group__3"
    // InternalProgram.g:2999:1: rule__TalkSession__Group__3 : rule__TalkSession__Group__3__Impl rule__TalkSession__Group__4 ;
    public final void rule__TalkSession__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3003:1: ( rule__TalkSession__Group__3__Impl rule__TalkSession__Group__4 )
            // InternalProgram.g:3004:2: rule__TalkSession__Group__3__Impl rule__TalkSession__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__TalkSession__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TalkSession__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group__3"


    // $ANTLR start "rule__TalkSession__Group__3__Impl"
    // InternalProgram.g:3011:1: rule__TalkSession__Group__3__Impl : ( ( rule__TalkSession__Group_3__0 )? ) ;
    public final void rule__TalkSession__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3015:1: ( ( ( rule__TalkSession__Group_3__0 )? ) )
            // InternalProgram.g:3016:1: ( ( rule__TalkSession__Group_3__0 )? )
            {
            // InternalProgram.g:3016:1: ( ( rule__TalkSession__Group_3__0 )? )
            // InternalProgram.g:3017:2: ( rule__TalkSession__Group_3__0 )?
            {
             before(grammarAccess.getTalkSessionAccess().getGroup_3()); 
            // InternalProgram.g:3018:2: ( rule__TalkSession__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalProgram.g:3018:3: rule__TalkSession__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TalkSession__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTalkSessionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group__3__Impl"


    // $ANTLR start "rule__TalkSession__Group__4"
    // InternalProgram.g:3026:1: rule__TalkSession__Group__4 : rule__TalkSession__Group__4__Impl ;
    public final void rule__TalkSession__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3030:1: ( rule__TalkSession__Group__4__Impl )
            // InternalProgram.g:3031:2: rule__TalkSession__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TalkSession__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group__4"


    // $ANTLR start "rule__TalkSession__Group__4__Impl"
    // InternalProgram.g:3037:1: rule__TalkSession__Group__4__Impl : ( ( rule__TalkSession__Group_4__0 )? ) ;
    public final void rule__TalkSession__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3041:1: ( ( ( rule__TalkSession__Group_4__0 )? ) )
            // InternalProgram.g:3042:1: ( ( rule__TalkSession__Group_4__0 )? )
            {
            // InternalProgram.g:3042:1: ( ( rule__TalkSession__Group_4__0 )? )
            // InternalProgram.g:3043:2: ( rule__TalkSession__Group_4__0 )?
            {
             before(grammarAccess.getTalkSessionAccess().getGroup_4()); 
            // InternalProgram.g:3044:2: ( rule__TalkSession__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalProgram.g:3044:3: rule__TalkSession__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TalkSession__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTalkSessionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group__4__Impl"


    // $ANTLR start "rule__TalkSession__Group_2__0"
    // InternalProgram.g:3053:1: rule__TalkSession__Group_2__0 : rule__TalkSession__Group_2__0__Impl rule__TalkSession__Group_2__1 ;
    public final void rule__TalkSession__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3057:1: ( rule__TalkSession__Group_2__0__Impl rule__TalkSession__Group_2__1 )
            // InternalProgram.g:3058:2: rule__TalkSession__Group_2__0__Impl rule__TalkSession__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__TalkSession__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TalkSession__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_2__0"


    // $ANTLR start "rule__TalkSession__Group_2__0__Impl"
    // InternalProgram.g:3065:1: rule__TalkSession__Group_2__0__Impl : ( 'chair' ) ;
    public final void rule__TalkSession__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3069:1: ( ( 'chair' ) )
            // InternalProgram.g:3070:1: ( 'chair' )
            {
            // InternalProgram.g:3070:1: ( 'chair' )
            // InternalProgram.g:3071:2: 'chair'
            {
             before(grammarAccess.getTalkSessionAccess().getChairKeyword_2_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTalkSessionAccess().getChairKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_2__0__Impl"


    // $ANTLR start "rule__TalkSession__Group_2__1"
    // InternalProgram.g:3080:1: rule__TalkSession__Group_2__1 : rule__TalkSession__Group_2__1__Impl ;
    public final void rule__TalkSession__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3084:1: ( rule__TalkSession__Group_2__1__Impl )
            // InternalProgram.g:3085:2: rule__TalkSession__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TalkSession__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_2__1"


    // $ANTLR start "rule__TalkSession__Group_2__1__Impl"
    // InternalProgram.g:3091:1: rule__TalkSession__Group_2__1__Impl : ( ( rule__TalkSession__ChairAssignment_2_1 ) ) ;
    public final void rule__TalkSession__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3095:1: ( ( ( rule__TalkSession__ChairAssignment_2_1 ) ) )
            // InternalProgram.g:3096:1: ( ( rule__TalkSession__ChairAssignment_2_1 ) )
            {
            // InternalProgram.g:3096:1: ( ( rule__TalkSession__ChairAssignment_2_1 ) )
            // InternalProgram.g:3097:2: ( rule__TalkSession__ChairAssignment_2_1 )
            {
             before(grammarAccess.getTalkSessionAccess().getChairAssignment_2_1()); 
            // InternalProgram.g:3098:2: ( rule__TalkSession__ChairAssignment_2_1 )
            // InternalProgram.g:3098:3: rule__TalkSession__ChairAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TalkSession__ChairAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTalkSessionAccess().getChairAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_2__1__Impl"


    // $ANTLR start "rule__TalkSession__Group_3__0"
    // InternalProgram.g:3107:1: rule__TalkSession__Group_3__0 : rule__TalkSession__Group_3__0__Impl rule__TalkSession__Group_3__1 ;
    public final void rule__TalkSession__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3111:1: ( rule__TalkSession__Group_3__0__Impl rule__TalkSession__Group_3__1 )
            // InternalProgram.g:3112:2: rule__TalkSession__Group_3__0__Impl rule__TalkSession__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__TalkSession__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TalkSession__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_3__0"


    // $ANTLR start "rule__TalkSession__Group_3__0__Impl"
    // InternalProgram.g:3119:1: rule__TalkSession__Group_3__0__Impl : ( 'abstract' ) ;
    public final void rule__TalkSession__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3123:1: ( ( 'abstract' ) )
            // InternalProgram.g:3124:1: ( 'abstract' )
            {
            // InternalProgram.g:3124:1: ( 'abstract' )
            // InternalProgram.g:3125:2: 'abstract'
            {
             before(grammarAccess.getTalkSessionAccess().getAbstractKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTalkSessionAccess().getAbstractKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_3__0__Impl"


    // $ANTLR start "rule__TalkSession__Group_3__1"
    // InternalProgram.g:3134:1: rule__TalkSession__Group_3__1 : rule__TalkSession__Group_3__1__Impl ;
    public final void rule__TalkSession__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3138:1: ( rule__TalkSession__Group_3__1__Impl )
            // InternalProgram.g:3139:2: rule__TalkSession__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TalkSession__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_3__1"


    // $ANTLR start "rule__TalkSession__Group_3__1__Impl"
    // InternalProgram.g:3145:1: rule__TalkSession__Group_3__1__Impl : ( ( rule__TalkSession__AbstractAssignment_3_1 ) ) ;
    public final void rule__TalkSession__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3149:1: ( ( ( rule__TalkSession__AbstractAssignment_3_1 ) ) )
            // InternalProgram.g:3150:1: ( ( rule__TalkSession__AbstractAssignment_3_1 ) )
            {
            // InternalProgram.g:3150:1: ( ( rule__TalkSession__AbstractAssignment_3_1 ) )
            // InternalProgram.g:3151:2: ( rule__TalkSession__AbstractAssignment_3_1 )
            {
             before(grammarAccess.getTalkSessionAccess().getAbstractAssignment_3_1()); 
            // InternalProgram.g:3152:2: ( rule__TalkSession__AbstractAssignment_3_1 )
            // InternalProgram.g:3152:3: rule__TalkSession__AbstractAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TalkSession__AbstractAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTalkSessionAccess().getAbstractAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_3__1__Impl"


    // $ANTLR start "rule__TalkSession__Group_4__0"
    // InternalProgram.g:3161:1: rule__TalkSession__Group_4__0 : rule__TalkSession__Group_4__0__Impl rule__TalkSession__Group_4__1 ;
    public final void rule__TalkSession__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3165:1: ( rule__TalkSession__Group_4__0__Impl rule__TalkSession__Group_4__1 )
            // InternalProgram.g:3166:2: rule__TalkSession__Group_4__0__Impl rule__TalkSession__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__TalkSession__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TalkSession__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_4__0"


    // $ANTLR start "rule__TalkSession__Group_4__0__Impl"
    // InternalProgram.g:3173:1: rule__TalkSession__Group_4__0__Impl : ( 'papers' ) ;
    public final void rule__TalkSession__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3177:1: ( ( 'papers' ) )
            // InternalProgram.g:3178:1: ( 'papers' )
            {
            // InternalProgram.g:3178:1: ( 'papers' )
            // InternalProgram.g:3179:2: 'papers'
            {
             before(grammarAccess.getTalkSessionAccess().getPapersKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTalkSessionAccess().getPapersKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_4__0__Impl"


    // $ANTLR start "rule__TalkSession__Group_4__1"
    // InternalProgram.g:3188:1: rule__TalkSession__Group_4__1 : rule__TalkSession__Group_4__1__Impl rule__TalkSession__Group_4__2 ;
    public final void rule__TalkSession__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3192:1: ( rule__TalkSession__Group_4__1__Impl rule__TalkSession__Group_4__2 )
            // InternalProgram.g:3193:2: rule__TalkSession__Group_4__1__Impl rule__TalkSession__Group_4__2
            {
            pushFollow(FOLLOW_8);
            rule__TalkSession__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TalkSession__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_4__1"


    // $ANTLR start "rule__TalkSession__Group_4__1__Impl"
    // InternalProgram.g:3200:1: rule__TalkSession__Group_4__1__Impl : ( ( rule__TalkSession__PapersAssignment_4_1 ) ) ;
    public final void rule__TalkSession__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3204:1: ( ( ( rule__TalkSession__PapersAssignment_4_1 ) ) )
            // InternalProgram.g:3205:1: ( ( rule__TalkSession__PapersAssignment_4_1 ) )
            {
            // InternalProgram.g:3205:1: ( ( rule__TalkSession__PapersAssignment_4_1 ) )
            // InternalProgram.g:3206:2: ( rule__TalkSession__PapersAssignment_4_1 )
            {
             before(grammarAccess.getTalkSessionAccess().getPapersAssignment_4_1()); 
            // InternalProgram.g:3207:2: ( rule__TalkSession__PapersAssignment_4_1 )
            // InternalProgram.g:3207:3: rule__TalkSession__PapersAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__TalkSession__PapersAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTalkSessionAccess().getPapersAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_4__1__Impl"


    // $ANTLR start "rule__TalkSession__Group_4__2"
    // InternalProgram.g:3215:1: rule__TalkSession__Group_4__2 : rule__TalkSession__Group_4__2__Impl ;
    public final void rule__TalkSession__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3219:1: ( rule__TalkSession__Group_4__2__Impl )
            // InternalProgram.g:3220:2: rule__TalkSession__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TalkSession__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_4__2"


    // $ANTLR start "rule__TalkSession__Group_4__2__Impl"
    // InternalProgram.g:3226:1: rule__TalkSession__Group_4__2__Impl : ( ( rule__TalkSession__Group_4_2__0 )* ) ;
    public final void rule__TalkSession__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3230:1: ( ( ( rule__TalkSession__Group_4_2__0 )* ) )
            // InternalProgram.g:3231:1: ( ( rule__TalkSession__Group_4_2__0 )* )
            {
            // InternalProgram.g:3231:1: ( ( rule__TalkSession__Group_4_2__0 )* )
            // InternalProgram.g:3232:2: ( rule__TalkSession__Group_4_2__0 )*
            {
             before(grammarAccess.getTalkSessionAccess().getGroup_4_2()); 
            // InternalProgram.g:3233:2: ( rule__TalkSession__Group_4_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==21) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalProgram.g:3233:3: rule__TalkSession__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__TalkSession__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getTalkSessionAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_4__2__Impl"


    // $ANTLR start "rule__TalkSession__Group_4_2__0"
    // InternalProgram.g:3242:1: rule__TalkSession__Group_4_2__0 : rule__TalkSession__Group_4_2__0__Impl rule__TalkSession__Group_4_2__1 ;
    public final void rule__TalkSession__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3246:1: ( rule__TalkSession__Group_4_2__0__Impl rule__TalkSession__Group_4_2__1 )
            // InternalProgram.g:3247:2: rule__TalkSession__Group_4_2__0__Impl rule__TalkSession__Group_4_2__1
            {
            pushFollow(FOLLOW_4);
            rule__TalkSession__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TalkSession__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_4_2__0"


    // $ANTLR start "rule__TalkSession__Group_4_2__0__Impl"
    // InternalProgram.g:3254:1: rule__TalkSession__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__TalkSession__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3258:1: ( ( ',' ) )
            // InternalProgram.g:3259:1: ( ',' )
            {
            // InternalProgram.g:3259:1: ( ',' )
            // InternalProgram.g:3260:2: ','
            {
             before(grammarAccess.getTalkSessionAccess().getCommaKeyword_4_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTalkSessionAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_4_2__0__Impl"


    // $ANTLR start "rule__TalkSession__Group_4_2__1"
    // InternalProgram.g:3269:1: rule__TalkSession__Group_4_2__1 : rule__TalkSession__Group_4_2__1__Impl ;
    public final void rule__TalkSession__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3273:1: ( rule__TalkSession__Group_4_2__1__Impl )
            // InternalProgram.g:3274:2: rule__TalkSession__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TalkSession__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_4_2__1"


    // $ANTLR start "rule__TalkSession__Group_4_2__1__Impl"
    // InternalProgram.g:3280:1: rule__TalkSession__Group_4_2__1__Impl : ( ( rule__TalkSession__PapersAssignment_4_2_1 ) ) ;
    public final void rule__TalkSession__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3284:1: ( ( ( rule__TalkSession__PapersAssignment_4_2_1 ) ) )
            // InternalProgram.g:3285:1: ( ( rule__TalkSession__PapersAssignment_4_2_1 ) )
            {
            // InternalProgram.g:3285:1: ( ( rule__TalkSession__PapersAssignment_4_2_1 ) )
            // InternalProgram.g:3286:2: ( rule__TalkSession__PapersAssignment_4_2_1 )
            {
             before(grammarAccess.getTalkSessionAccess().getPapersAssignment_4_2_1()); 
            // InternalProgram.g:3287:2: ( rule__TalkSession__PapersAssignment_4_2_1 )
            // InternalProgram.g:3287:3: rule__TalkSession__PapersAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TalkSession__PapersAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTalkSessionAccess().getPapersAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_4_2__1__Impl"


    // $ANTLR start "rule__Panel__Group__0"
    // InternalProgram.g:3296:1: rule__Panel__Group__0 : rule__Panel__Group__0__Impl rule__Panel__Group__1 ;
    public final void rule__Panel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3300:1: ( rule__Panel__Group__0__Impl rule__Panel__Group__1 )
            // InternalProgram.g:3301:2: rule__Panel__Group__0__Impl rule__Panel__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Panel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__0"


    // $ANTLR start "rule__Panel__Group__0__Impl"
    // InternalProgram.g:3308:1: rule__Panel__Group__0__Impl : ( 'Panel' ) ;
    public final void rule__Panel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3312:1: ( ( 'Panel' ) )
            // InternalProgram.g:3313:1: ( 'Panel' )
            {
            // InternalProgram.g:3313:1: ( 'Panel' )
            // InternalProgram.g:3314:2: 'Panel'
            {
             before(grammarAccess.getPanelAccess().getPanelKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPanelAccess().getPanelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__0__Impl"


    // $ANTLR start "rule__Panel__Group__1"
    // InternalProgram.g:3323:1: rule__Panel__Group__1 : rule__Panel__Group__1__Impl rule__Panel__Group__2 ;
    public final void rule__Panel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3327:1: ( rule__Panel__Group__1__Impl rule__Panel__Group__2 )
            // InternalProgram.g:3328:2: rule__Panel__Group__1__Impl rule__Panel__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Panel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__1"


    // $ANTLR start "rule__Panel__Group__1__Impl"
    // InternalProgram.g:3335:1: rule__Panel__Group__1__Impl : ( ( rule__Panel__NameAssignment_1 ) ) ;
    public final void rule__Panel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3339:1: ( ( ( rule__Panel__NameAssignment_1 ) ) )
            // InternalProgram.g:3340:1: ( ( rule__Panel__NameAssignment_1 ) )
            {
            // InternalProgram.g:3340:1: ( ( rule__Panel__NameAssignment_1 ) )
            // InternalProgram.g:3341:2: ( rule__Panel__NameAssignment_1 )
            {
             before(grammarAccess.getPanelAccess().getNameAssignment_1()); 
            // InternalProgram.g:3342:2: ( rule__Panel__NameAssignment_1 )
            // InternalProgram.g:3342:3: rule__Panel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Panel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPanelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__1__Impl"


    // $ANTLR start "rule__Panel__Group__2"
    // InternalProgram.g:3350:1: rule__Panel__Group__2 : rule__Panel__Group__2__Impl rule__Panel__Group__3 ;
    public final void rule__Panel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3354:1: ( rule__Panel__Group__2__Impl rule__Panel__Group__3 )
            // InternalProgram.g:3355:2: rule__Panel__Group__2__Impl rule__Panel__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Panel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__2"


    // $ANTLR start "rule__Panel__Group__2__Impl"
    // InternalProgram.g:3362:1: rule__Panel__Group__2__Impl : ( ( rule__Panel__Group_2__0 )? ) ;
    public final void rule__Panel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3366:1: ( ( ( rule__Panel__Group_2__0 )? ) )
            // InternalProgram.g:3367:1: ( ( rule__Panel__Group_2__0 )? )
            {
            // InternalProgram.g:3367:1: ( ( rule__Panel__Group_2__0 )? )
            // InternalProgram.g:3368:2: ( rule__Panel__Group_2__0 )?
            {
             before(grammarAccess.getPanelAccess().getGroup_2()); 
            // InternalProgram.g:3369:2: ( rule__Panel__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalProgram.g:3369:3: rule__Panel__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Panel__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPanelAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__2__Impl"


    // $ANTLR start "rule__Panel__Group__3"
    // InternalProgram.g:3377:1: rule__Panel__Group__3 : rule__Panel__Group__3__Impl rule__Panel__Group__4 ;
    public final void rule__Panel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3381:1: ( rule__Panel__Group__3__Impl rule__Panel__Group__4 )
            // InternalProgram.g:3382:2: rule__Panel__Group__3__Impl rule__Panel__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Panel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__3"


    // $ANTLR start "rule__Panel__Group__3__Impl"
    // InternalProgram.g:3389:1: rule__Panel__Group__3__Impl : ( ( rule__Panel__Group_3__0 )? ) ;
    public final void rule__Panel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3393:1: ( ( ( rule__Panel__Group_3__0 )? ) )
            // InternalProgram.g:3394:1: ( ( rule__Panel__Group_3__0 )? )
            {
            // InternalProgram.g:3394:1: ( ( rule__Panel__Group_3__0 )? )
            // InternalProgram.g:3395:2: ( rule__Panel__Group_3__0 )?
            {
             before(grammarAccess.getPanelAccess().getGroup_3()); 
            // InternalProgram.g:3396:2: ( rule__Panel__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalProgram.g:3396:3: rule__Panel__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Panel__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPanelAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__3__Impl"


    // $ANTLR start "rule__Panel__Group__4"
    // InternalProgram.g:3404:1: rule__Panel__Group__4 : rule__Panel__Group__4__Impl ;
    public final void rule__Panel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3408:1: ( rule__Panel__Group__4__Impl )
            // InternalProgram.g:3409:2: rule__Panel__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Panel__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__4"


    // $ANTLR start "rule__Panel__Group__4__Impl"
    // InternalProgram.g:3415:1: rule__Panel__Group__4__Impl : ( ( rule__Panel__Group_4__0 )? ) ;
    public final void rule__Panel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3419:1: ( ( ( rule__Panel__Group_4__0 )? ) )
            // InternalProgram.g:3420:1: ( ( rule__Panel__Group_4__0 )? )
            {
            // InternalProgram.g:3420:1: ( ( rule__Panel__Group_4__0 )? )
            // InternalProgram.g:3421:2: ( rule__Panel__Group_4__0 )?
            {
             before(grammarAccess.getPanelAccess().getGroup_4()); 
            // InternalProgram.g:3422:2: ( rule__Panel__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalProgram.g:3422:3: rule__Panel__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Panel__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPanelAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__4__Impl"


    // $ANTLR start "rule__Panel__Group_2__0"
    // InternalProgram.g:3431:1: rule__Panel__Group_2__0 : rule__Panel__Group_2__0__Impl rule__Panel__Group_2__1 ;
    public final void rule__Panel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3435:1: ( rule__Panel__Group_2__0__Impl rule__Panel__Group_2__1 )
            // InternalProgram.g:3436:2: rule__Panel__Group_2__0__Impl rule__Panel__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Panel__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_2__0"


    // $ANTLR start "rule__Panel__Group_2__0__Impl"
    // InternalProgram.g:3443:1: rule__Panel__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__Panel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3447:1: ( ( 'abstract' ) )
            // InternalProgram.g:3448:1: ( 'abstract' )
            {
            // InternalProgram.g:3448:1: ( 'abstract' )
            // InternalProgram.g:3449:2: 'abstract'
            {
             before(grammarAccess.getPanelAccess().getAbstractKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPanelAccess().getAbstractKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_2__0__Impl"


    // $ANTLR start "rule__Panel__Group_2__1"
    // InternalProgram.g:3458:1: rule__Panel__Group_2__1 : rule__Panel__Group_2__1__Impl ;
    public final void rule__Panel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3462:1: ( rule__Panel__Group_2__1__Impl )
            // InternalProgram.g:3463:2: rule__Panel__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Panel__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_2__1"


    // $ANTLR start "rule__Panel__Group_2__1__Impl"
    // InternalProgram.g:3469:1: rule__Panel__Group_2__1__Impl : ( ( rule__Panel__AbstractAssignment_2_1 ) ) ;
    public final void rule__Panel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3473:1: ( ( ( rule__Panel__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:3474:1: ( ( rule__Panel__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:3474:1: ( ( rule__Panel__AbstractAssignment_2_1 ) )
            // InternalProgram.g:3475:2: ( rule__Panel__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getPanelAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:3476:2: ( rule__Panel__AbstractAssignment_2_1 )
            // InternalProgram.g:3476:3: rule__Panel__AbstractAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Panel__AbstractAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPanelAccess().getAbstractAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_2__1__Impl"


    // $ANTLR start "rule__Panel__Group_3__0"
    // InternalProgram.g:3485:1: rule__Panel__Group_3__0 : rule__Panel__Group_3__0__Impl rule__Panel__Group_3__1 ;
    public final void rule__Panel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3489:1: ( rule__Panel__Group_3__0__Impl rule__Panel__Group_3__1 )
            // InternalProgram.g:3490:2: rule__Panel__Group_3__0__Impl rule__Panel__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Panel__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_3__0"


    // $ANTLR start "rule__Panel__Group_3__0__Impl"
    // InternalProgram.g:3497:1: rule__Panel__Group_3__0__Impl : ( 'panelists' ) ;
    public final void rule__Panel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3501:1: ( ( 'panelists' ) )
            // InternalProgram.g:3502:1: ( 'panelists' )
            {
            // InternalProgram.g:3502:1: ( 'panelists' )
            // InternalProgram.g:3503:2: 'panelists'
            {
             before(grammarAccess.getPanelAccess().getPanelistsKeyword_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPanelAccess().getPanelistsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_3__0__Impl"


    // $ANTLR start "rule__Panel__Group_3__1"
    // InternalProgram.g:3512:1: rule__Panel__Group_3__1 : rule__Panel__Group_3__1__Impl rule__Panel__Group_3__2 ;
    public final void rule__Panel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3516:1: ( rule__Panel__Group_3__1__Impl rule__Panel__Group_3__2 )
            // InternalProgram.g:3517:2: rule__Panel__Group_3__1__Impl rule__Panel__Group_3__2
            {
            pushFollow(FOLLOW_8);
            rule__Panel__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_3__1"


    // $ANTLR start "rule__Panel__Group_3__1__Impl"
    // InternalProgram.g:3524:1: rule__Panel__Group_3__1__Impl : ( ( rule__Panel__PanelistsAssignment_3_1 ) ) ;
    public final void rule__Panel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3528:1: ( ( ( rule__Panel__PanelistsAssignment_3_1 ) ) )
            // InternalProgram.g:3529:1: ( ( rule__Panel__PanelistsAssignment_3_1 ) )
            {
            // InternalProgram.g:3529:1: ( ( rule__Panel__PanelistsAssignment_3_1 ) )
            // InternalProgram.g:3530:2: ( rule__Panel__PanelistsAssignment_3_1 )
            {
             before(grammarAccess.getPanelAccess().getPanelistsAssignment_3_1()); 
            // InternalProgram.g:3531:2: ( rule__Panel__PanelistsAssignment_3_1 )
            // InternalProgram.g:3531:3: rule__Panel__PanelistsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Panel__PanelistsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPanelAccess().getPanelistsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_3__1__Impl"


    // $ANTLR start "rule__Panel__Group_3__2"
    // InternalProgram.g:3539:1: rule__Panel__Group_3__2 : rule__Panel__Group_3__2__Impl ;
    public final void rule__Panel__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3543:1: ( rule__Panel__Group_3__2__Impl )
            // InternalProgram.g:3544:2: rule__Panel__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Panel__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_3__2"


    // $ANTLR start "rule__Panel__Group_3__2__Impl"
    // InternalProgram.g:3550:1: rule__Panel__Group_3__2__Impl : ( ( rule__Panel__Group_3_2__0 )* ) ;
    public final void rule__Panel__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3554:1: ( ( ( rule__Panel__Group_3_2__0 )* ) )
            // InternalProgram.g:3555:1: ( ( rule__Panel__Group_3_2__0 )* )
            {
            // InternalProgram.g:3555:1: ( ( rule__Panel__Group_3_2__0 )* )
            // InternalProgram.g:3556:2: ( rule__Panel__Group_3_2__0 )*
            {
             before(grammarAccess.getPanelAccess().getGroup_3_2()); 
            // InternalProgram.g:3557:2: ( rule__Panel__Group_3_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==21) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalProgram.g:3557:3: rule__Panel__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Panel__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getPanelAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_3__2__Impl"


    // $ANTLR start "rule__Panel__Group_3_2__0"
    // InternalProgram.g:3566:1: rule__Panel__Group_3_2__0 : rule__Panel__Group_3_2__0__Impl rule__Panel__Group_3_2__1 ;
    public final void rule__Panel__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3570:1: ( rule__Panel__Group_3_2__0__Impl rule__Panel__Group_3_2__1 )
            // InternalProgram.g:3571:2: rule__Panel__Group_3_2__0__Impl rule__Panel__Group_3_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Panel__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_3_2__0"


    // $ANTLR start "rule__Panel__Group_3_2__0__Impl"
    // InternalProgram.g:3578:1: rule__Panel__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Panel__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3582:1: ( ( ',' ) )
            // InternalProgram.g:3583:1: ( ',' )
            {
            // InternalProgram.g:3583:1: ( ',' )
            // InternalProgram.g:3584:2: ','
            {
             before(grammarAccess.getPanelAccess().getCommaKeyword_3_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPanelAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_3_2__0__Impl"


    // $ANTLR start "rule__Panel__Group_3_2__1"
    // InternalProgram.g:3593:1: rule__Panel__Group_3_2__1 : rule__Panel__Group_3_2__1__Impl ;
    public final void rule__Panel__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3597:1: ( rule__Panel__Group_3_2__1__Impl )
            // InternalProgram.g:3598:2: rule__Panel__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Panel__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_3_2__1"


    // $ANTLR start "rule__Panel__Group_3_2__1__Impl"
    // InternalProgram.g:3604:1: rule__Panel__Group_3_2__1__Impl : ( ( rule__Panel__PanelistsAssignment_3_2_1 ) ) ;
    public final void rule__Panel__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3608:1: ( ( ( rule__Panel__PanelistsAssignment_3_2_1 ) ) )
            // InternalProgram.g:3609:1: ( ( rule__Panel__PanelistsAssignment_3_2_1 ) )
            {
            // InternalProgram.g:3609:1: ( ( rule__Panel__PanelistsAssignment_3_2_1 ) )
            // InternalProgram.g:3610:2: ( rule__Panel__PanelistsAssignment_3_2_1 )
            {
             before(grammarAccess.getPanelAccess().getPanelistsAssignment_3_2_1()); 
            // InternalProgram.g:3611:2: ( rule__Panel__PanelistsAssignment_3_2_1 )
            // InternalProgram.g:3611:3: rule__Panel__PanelistsAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Panel__PanelistsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPanelAccess().getPanelistsAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_3_2__1__Impl"


    // $ANTLR start "rule__Panel__Group_4__0"
    // InternalProgram.g:3620:1: rule__Panel__Group_4__0 : rule__Panel__Group_4__0__Impl rule__Panel__Group_4__1 ;
    public final void rule__Panel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3624:1: ( rule__Panel__Group_4__0__Impl rule__Panel__Group_4__1 )
            // InternalProgram.g:3625:2: rule__Panel__Group_4__0__Impl rule__Panel__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Panel__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_4__0"


    // $ANTLR start "rule__Panel__Group_4__0__Impl"
    // InternalProgram.g:3632:1: rule__Panel__Group_4__0__Impl : ( 'moderators' ) ;
    public final void rule__Panel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3636:1: ( ( 'moderators' ) )
            // InternalProgram.g:3637:1: ( 'moderators' )
            {
            // InternalProgram.g:3637:1: ( 'moderators' )
            // InternalProgram.g:3638:2: 'moderators'
            {
             before(grammarAccess.getPanelAccess().getModeratorsKeyword_4_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPanelAccess().getModeratorsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_4__0__Impl"


    // $ANTLR start "rule__Panel__Group_4__1"
    // InternalProgram.g:3647:1: rule__Panel__Group_4__1 : rule__Panel__Group_4__1__Impl rule__Panel__Group_4__2 ;
    public final void rule__Panel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3651:1: ( rule__Panel__Group_4__1__Impl rule__Panel__Group_4__2 )
            // InternalProgram.g:3652:2: rule__Panel__Group_4__1__Impl rule__Panel__Group_4__2
            {
            pushFollow(FOLLOW_8);
            rule__Panel__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_4__1"


    // $ANTLR start "rule__Panel__Group_4__1__Impl"
    // InternalProgram.g:3659:1: rule__Panel__Group_4__1__Impl : ( ( rule__Panel__ModeratorsAssignment_4_1 ) ) ;
    public final void rule__Panel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3663:1: ( ( ( rule__Panel__ModeratorsAssignment_4_1 ) ) )
            // InternalProgram.g:3664:1: ( ( rule__Panel__ModeratorsAssignment_4_1 ) )
            {
            // InternalProgram.g:3664:1: ( ( rule__Panel__ModeratorsAssignment_4_1 ) )
            // InternalProgram.g:3665:2: ( rule__Panel__ModeratorsAssignment_4_1 )
            {
             before(grammarAccess.getPanelAccess().getModeratorsAssignment_4_1()); 
            // InternalProgram.g:3666:2: ( rule__Panel__ModeratorsAssignment_4_1 )
            // InternalProgram.g:3666:3: rule__Panel__ModeratorsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Panel__ModeratorsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPanelAccess().getModeratorsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_4__1__Impl"


    // $ANTLR start "rule__Panel__Group_4__2"
    // InternalProgram.g:3674:1: rule__Panel__Group_4__2 : rule__Panel__Group_4__2__Impl ;
    public final void rule__Panel__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3678:1: ( rule__Panel__Group_4__2__Impl )
            // InternalProgram.g:3679:2: rule__Panel__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Panel__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_4__2"


    // $ANTLR start "rule__Panel__Group_4__2__Impl"
    // InternalProgram.g:3685:1: rule__Panel__Group_4__2__Impl : ( ( rule__Panel__Group_4_2__0 )* ) ;
    public final void rule__Panel__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3689:1: ( ( ( rule__Panel__Group_4_2__0 )* ) )
            // InternalProgram.g:3690:1: ( ( rule__Panel__Group_4_2__0 )* )
            {
            // InternalProgram.g:3690:1: ( ( rule__Panel__Group_4_2__0 )* )
            // InternalProgram.g:3691:2: ( rule__Panel__Group_4_2__0 )*
            {
             before(grammarAccess.getPanelAccess().getGroup_4_2()); 
            // InternalProgram.g:3692:2: ( rule__Panel__Group_4_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==21) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalProgram.g:3692:3: rule__Panel__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Panel__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getPanelAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_4__2__Impl"


    // $ANTLR start "rule__Panel__Group_4_2__0"
    // InternalProgram.g:3701:1: rule__Panel__Group_4_2__0 : rule__Panel__Group_4_2__0__Impl rule__Panel__Group_4_2__1 ;
    public final void rule__Panel__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3705:1: ( rule__Panel__Group_4_2__0__Impl rule__Panel__Group_4_2__1 )
            // InternalProgram.g:3706:2: rule__Panel__Group_4_2__0__Impl rule__Panel__Group_4_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Panel__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_4_2__0"


    // $ANTLR start "rule__Panel__Group_4_2__0__Impl"
    // InternalProgram.g:3713:1: rule__Panel__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Panel__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3717:1: ( ( ',' ) )
            // InternalProgram.g:3718:1: ( ',' )
            {
            // InternalProgram.g:3718:1: ( ',' )
            // InternalProgram.g:3719:2: ','
            {
             before(grammarAccess.getPanelAccess().getCommaKeyword_4_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPanelAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_4_2__0__Impl"


    // $ANTLR start "rule__Panel__Group_4_2__1"
    // InternalProgram.g:3728:1: rule__Panel__Group_4_2__1 : rule__Panel__Group_4_2__1__Impl ;
    public final void rule__Panel__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3732:1: ( rule__Panel__Group_4_2__1__Impl )
            // InternalProgram.g:3733:2: rule__Panel__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Panel__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_4_2__1"


    // $ANTLR start "rule__Panel__Group_4_2__1__Impl"
    // InternalProgram.g:3739:1: rule__Panel__Group_4_2__1__Impl : ( ( rule__Panel__ModeratorsAssignment_4_2_1 ) ) ;
    public final void rule__Panel__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3743:1: ( ( ( rule__Panel__ModeratorsAssignment_4_2_1 ) ) )
            // InternalProgram.g:3744:1: ( ( rule__Panel__ModeratorsAssignment_4_2_1 ) )
            {
            // InternalProgram.g:3744:1: ( ( rule__Panel__ModeratorsAssignment_4_2_1 ) )
            // InternalProgram.g:3745:2: ( rule__Panel__ModeratorsAssignment_4_2_1 )
            {
             before(grammarAccess.getPanelAccess().getModeratorsAssignment_4_2_1()); 
            // InternalProgram.g:3746:2: ( rule__Panel__ModeratorsAssignment_4_2_1 )
            // InternalProgram.g:3746:3: rule__Panel__ModeratorsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Panel__ModeratorsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPanelAccess().getModeratorsAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_4_2__1__Impl"


    // $ANTLR start "rule__SRC__Group__0"
    // InternalProgram.g:3755:1: rule__SRC__Group__0 : rule__SRC__Group__0__Impl rule__SRC__Group__1 ;
    public final void rule__SRC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3759:1: ( rule__SRC__Group__0__Impl rule__SRC__Group__1 )
            // InternalProgram.g:3760:2: rule__SRC__Group__0__Impl rule__SRC__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SRC__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SRC__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRC__Group__0"


    // $ANTLR start "rule__SRC__Group__0__Impl"
    // InternalProgram.g:3767:1: rule__SRC__Group__0__Impl : ( 'SRC' ) ;
    public final void rule__SRC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3771:1: ( ( 'SRC' ) )
            // InternalProgram.g:3772:1: ( 'SRC' )
            {
            // InternalProgram.g:3772:1: ( 'SRC' )
            // InternalProgram.g:3773:2: 'SRC'
            {
             before(grammarAccess.getSRCAccess().getSRCKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSRCAccess().getSRCKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRC__Group__0__Impl"


    // $ANTLR start "rule__SRC__Group__1"
    // InternalProgram.g:3782:1: rule__SRC__Group__1 : rule__SRC__Group__1__Impl rule__SRC__Group__2 ;
    public final void rule__SRC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3786:1: ( rule__SRC__Group__1__Impl rule__SRC__Group__2 )
            // InternalProgram.g:3787:2: rule__SRC__Group__1__Impl rule__SRC__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__SRC__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SRC__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRC__Group__1"


    // $ANTLR start "rule__SRC__Group__1__Impl"
    // InternalProgram.g:3794:1: rule__SRC__Group__1__Impl : ( ( rule__SRC__NameAssignment_1 ) ) ;
    public final void rule__SRC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3798:1: ( ( ( rule__SRC__NameAssignment_1 ) ) )
            // InternalProgram.g:3799:1: ( ( rule__SRC__NameAssignment_1 ) )
            {
            // InternalProgram.g:3799:1: ( ( rule__SRC__NameAssignment_1 ) )
            // InternalProgram.g:3800:2: ( rule__SRC__NameAssignment_1 )
            {
             before(grammarAccess.getSRCAccess().getNameAssignment_1()); 
            // InternalProgram.g:3801:2: ( rule__SRC__NameAssignment_1 )
            // InternalProgram.g:3801:3: rule__SRC__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SRC__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSRCAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRC__Group__1__Impl"


    // $ANTLR start "rule__SRC__Group__2"
    // InternalProgram.g:3809:1: rule__SRC__Group__2 : rule__SRC__Group__2__Impl ;
    public final void rule__SRC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3813:1: ( rule__SRC__Group__2__Impl )
            // InternalProgram.g:3814:2: rule__SRC__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SRC__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRC__Group__2"


    // $ANTLR start "rule__SRC__Group__2__Impl"
    // InternalProgram.g:3820:1: rule__SRC__Group__2__Impl : ( ( rule__SRC__Group_2__0 )? ) ;
    public final void rule__SRC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3824:1: ( ( ( rule__SRC__Group_2__0 )? ) )
            // InternalProgram.g:3825:1: ( ( rule__SRC__Group_2__0 )? )
            {
            // InternalProgram.g:3825:1: ( ( rule__SRC__Group_2__0 )? )
            // InternalProgram.g:3826:2: ( rule__SRC__Group_2__0 )?
            {
             before(grammarAccess.getSRCAccess().getGroup_2()); 
            // InternalProgram.g:3827:2: ( rule__SRC__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalProgram.g:3827:3: rule__SRC__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SRC__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSRCAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRC__Group__2__Impl"


    // $ANTLR start "rule__SRC__Group_2__0"
    // InternalProgram.g:3836:1: rule__SRC__Group_2__0 : rule__SRC__Group_2__0__Impl rule__SRC__Group_2__1 ;
    public final void rule__SRC__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3840:1: ( rule__SRC__Group_2__0__Impl rule__SRC__Group_2__1 )
            // InternalProgram.g:3841:2: rule__SRC__Group_2__0__Impl rule__SRC__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__SRC__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SRC__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRC__Group_2__0"


    // $ANTLR start "rule__SRC__Group_2__0__Impl"
    // InternalProgram.g:3848:1: rule__SRC__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__SRC__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3852:1: ( ( 'abstract' ) )
            // InternalProgram.g:3853:1: ( 'abstract' )
            {
            // InternalProgram.g:3853:1: ( 'abstract' )
            // InternalProgram.g:3854:2: 'abstract'
            {
             before(grammarAccess.getSRCAccess().getAbstractKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSRCAccess().getAbstractKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRC__Group_2__0__Impl"


    // $ANTLR start "rule__SRC__Group_2__1"
    // InternalProgram.g:3863:1: rule__SRC__Group_2__1 : rule__SRC__Group_2__1__Impl ;
    public final void rule__SRC__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3867:1: ( rule__SRC__Group_2__1__Impl )
            // InternalProgram.g:3868:2: rule__SRC__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SRC__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRC__Group_2__1"


    // $ANTLR start "rule__SRC__Group_2__1__Impl"
    // InternalProgram.g:3874:1: rule__SRC__Group_2__1__Impl : ( ( rule__SRC__AbstractAssignment_2_1 ) ) ;
    public final void rule__SRC__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3878:1: ( ( ( rule__SRC__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:3879:1: ( ( rule__SRC__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:3879:1: ( ( rule__SRC__AbstractAssignment_2_1 ) )
            // InternalProgram.g:3880:2: ( rule__SRC__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getSRCAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:3881:2: ( rule__SRC__AbstractAssignment_2_1 )
            // InternalProgram.g:3881:3: rule__SRC__AbstractAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SRC__AbstractAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSRCAccess().getAbstractAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRC__Group_2__1__Impl"


    // $ANTLR start "rule__Poster__Group__0"
    // InternalProgram.g:3890:1: rule__Poster__Group__0 : rule__Poster__Group__0__Impl rule__Poster__Group__1 ;
    public final void rule__Poster__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3894:1: ( rule__Poster__Group__0__Impl rule__Poster__Group__1 )
            // InternalProgram.g:3895:2: rule__Poster__Group__0__Impl rule__Poster__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Poster__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Poster__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poster__Group__0"


    // $ANTLR start "rule__Poster__Group__0__Impl"
    // InternalProgram.g:3902:1: rule__Poster__Group__0__Impl : ( 'Poster' ) ;
    public final void rule__Poster__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3906:1: ( ( 'Poster' ) )
            // InternalProgram.g:3907:1: ( 'Poster' )
            {
            // InternalProgram.g:3907:1: ( 'Poster' )
            // InternalProgram.g:3908:2: 'Poster'
            {
             before(grammarAccess.getPosterAccess().getPosterKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getPosterAccess().getPosterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poster__Group__0__Impl"


    // $ANTLR start "rule__Poster__Group__1"
    // InternalProgram.g:3917:1: rule__Poster__Group__1 : rule__Poster__Group__1__Impl rule__Poster__Group__2 ;
    public final void rule__Poster__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3921:1: ( rule__Poster__Group__1__Impl rule__Poster__Group__2 )
            // InternalProgram.g:3922:2: rule__Poster__Group__1__Impl rule__Poster__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Poster__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Poster__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poster__Group__1"


    // $ANTLR start "rule__Poster__Group__1__Impl"
    // InternalProgram.g:3929:1: rule__Poster__Group__1__Impl : ( ( rule__Poster__NameAssignment_1 ) ) ;
    public final void rule__Poster__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3933:1: ( ( ( rule__Poster__NameAssignment_1 ) ) )
            // InternalProgram.g:3934:1: ( ( rule__Poster__NameAssignment_1 ) )
            {
            // InternalProgram.g:3934:1: ( ( rule__Poster__NameAssignment_1 ) )
            // InternalProgram.g:3935:2: ( rule__Poster__NameAssignment_1 )
            {
             before(grammarAccess.getPosterAccess().getNameAssignment_1()); 
            // InternalProgram.g:3936:2: ( rule__Poster__NameAssignment_1 )
            // InternalProgram.g:3936:3: rule__Poster__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Poster__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPosterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poster__Group__1__Impl"


    // $ANTLR start "rule__Poster__Group__2"
    // InternalProgram.g:3944:1: rule__Poster__Group__2 : rule__Poster__Group__2__Impl ;
    public final void rule__Poster__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3948:1: ( rule__Poster__Group__2__Impl )
            // InternalProgram.g:3949:2: rule__Poster__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Poster__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poster__Group__2"


    // $ANTLR start "rule__Poster__Group__2__Impl"
    // InternalProgram.g:3955:1: rule__Poster__Group__2__Impl : ( ( rule__Poster__Group_2__0 )? ) ;
    public final void rule__Poster__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3959:1: ( ( ( rule__Poster__Group_2__0 )? ) )
            // InternalProgram.g:3960:1: ( ( rule__Poster__Group_2__0 )? )
            {
            // InternalProgram.g:3960:1: ( ( rule__Poster__Group_2__0 )? )
            // InternalProgram.g:3961:2: ( rule__Poster__Group_2__0 )?
            {
             before(grammarAccess.getPosterAccess().getGroup_2()); 
            // InternalProgram.g:3962:2: ( rule__Poster__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==38) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalProgram.g:3962:3: rule__Poster__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Poster__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPosterAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poster__Group__2__Impl"


    // $ANTLR start "rule__Poster__Group_2__0"
    // InternalProgram.g:3971:1: rule__Poster__Group_2__0 : rule__Poster__Group_2__0__Impl rule__Poster__Group_2__1 ;
    public final void rule__Poster__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3975:1: ( rule__Poster__Group_2__0__Impl rule__Poster__Group_2__1 )
            // InternalProgram.g:3976:2: rule__Poster__Group_2__0__Impl rule__Poster__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Poster__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Poster__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poster__Group_2__0"


    // $ANTLR start "rule__Poster__Group_2__0__Impl"
    // InternalProgram.g:3983:1: rule__Poster__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__Poster__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3987:1: ( ( 'abstract' ) )
            // InternalProgram.g:3988:1: ( 'abstract' )
            {
            // InternalProgram.g:3988:1: ( 'abstract' )
            // InternalProgram.g:3989:2: 'abstract'
            {
             before(grammarAccess.getPosterAccess().getAbstractKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPosterAccess().getAbstractKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poster__Group_2__0__Impl"


    // $ANTLR start "rule__Poster__Group_2__1"
    // InternalProgram.g:3998:1: rule__Poster__Group_2__1 : rule__Poster__Group_2__1__Impl ;
    public final void rule__Poster__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4002:1: ( rule__Poster__Group_2__1__Impl )
            // InternalProgram.g:4003:2: rule__Poster__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Poster__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poster__Group_2__1"


    // $ANTLR start "rule__Poster__Group_2__1__Impl"
    // InternalProgram.g:4009:1: rule__Poster__Group_2__1__Impl : ( ( rule__Poster__AbstractAssignment_2_1 ) ) ;
    public final void rule__Poster__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4013:1: ( ( ( rule__Poster__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:4014:1: ( ( rule__Poster__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:4014:1: ( ( rule__Poster__AbstractAssignment_2_1 ) )
            // InternalProgram.g:4015:2: ( rule__Poster__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getPosterAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:4016:2: ( rule__Poster__AbstractAssignment_2_1 )
            // InternalProgram.g:4016:3: rule__Poster__AbstractAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Poster__AbstractAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPosterAccess().getAbstractAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poster__Group_2__1__Impl"


    // $ANTLR start "rule__Keynote__Group__0"
    // InternalProgram.g:4025:1: rule__Keynote__Group__0 : rule__Keynote__Group__0__Impl rule__Keynote__Group__1 ;
    public final void rule__Keynote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4029:1: ( rule__Keynote__Group__0__Impl rule__Keynote__Group__1 )
            // InternalProgram.g:4030:2: rule__Keynote__Group__0__Impl rule__Keynote__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Keynote__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Keynote__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__Group__0"


    // $ANTLR start "rule__Keynote__Group__0__Impl"
    // InternalProgram.g:4037:1: rule__Keynote__Group__0__Impl : ( 'Keynote' ) ;
    public final void rule__Keynote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4041:1: ( ( 'Keynote' ) )
            // InternalProgram.g:4042:1: ( 'Keynote' )
            {
            // InternalProgram.g:4042:1: ( 'Keynote' )
            // InternalProgram.g:4043:2: 'Keynote'
            {
             before(grammarAccess.getKeynoteAccess().getKeynoteKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getKeynoteAccess().getKeynoteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__Group__0__Impl"


    // $ANTLR start "rule__Keynote__Group__1"
    // InternalProgram.g:4052:1: rule__Keynote__Group__1 : rule__Keynote__Group__1__Impl rule__Keynote__Group__2 ;
    public final void rule__Keynote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4056:1: ( rule__Keynote__Group__1__Impl rule__Keynote__Group__2 )
            // InternalProgram.g:4057:2: rule__Keynote__Group__1__Impl rule__Keynote__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Keynote__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Keynote__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__Group__1"


    // $ANTLR start "rule__Keynote__Group__1__Impl"
    // InternalProgram.g:4064:1: rule__Keynote__Group__1__Impl : ( ( rule__Keynote__NameAssignment_1 ) ) ;
    public final void rule__Keynote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4068:1: ( ( ( rule__Keynote__NameAssignment_1 ) ) )
            // InternalProgram.g:4069:1: ( ( rule__Keynote__NameAssignment_1 ) )
            {
            // InternalProgram.g:4069:1: ( ( rule__Keynote__NameAssignment_1 ) )
            // InternalProgram.g:4070:2: ( rule__Keynote__NameAssignment_1 )
            {
             before(grammarAccess.getKeynoteAccess().getNameAssignment_1()); 
            // InternalProgram.g:4071:2: ( rule__Keynote__NameAssignment_1 )
            // InternalProgram.g:4071:3: rule__Keynote__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Keynote__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKeynoteAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__Group__1__Impl"


    // $ANTLR start "rule__Keynote__Group__2"
    // InternalProgram.g:4079:1: rule__Keynote__Group__2 : rule__Keynote__Group__2__Impl rule__Keynote__Group__3 ;
    public final void rule__Keynote__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4083:1: ( rule__Keynote__Group__2__Impl rule__Keynote__Group__3 )
            // InternalProgram.g:4084:2: rule__Keynote__Group__2__Impl rule__Keynote__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Keynote__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Keynote__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__Group__2"


    // $ANTLR start "rule__Keynote__Group__2__Impl"
    // InternalProgram.g:4091:1: rule__Keynote__Group__2__Impl : ( ( rule__Keynote__Group_2__0 )? ) ;
    public final void rule__Keynote__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4095:1: ( ( ( rule__Keynote__Group_2__0 )? ) )
            // InternalProgram.g:4096:1: ( ( rule__Keynote__Group_2__0 )? )
            {
            // InternalProgram.g:4096:1: ( ( rule__Keynote__Group_2__0 )? )
            // InternalProgram.g:4097:2: ( rule__Keynote__Group_2__0 )?
            {
             before(grammarAccess.getKeynoteAccess().getGroup_2()); 
            // InternalProgram.g:4098:2: ( rule__Keynote__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==38) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalProgram.g:4098:3: rule__Keynote__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Keynote__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKeynoteAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__Group__2__Impl"


    // $ANTLR start "rule__Keynote__Group__3"
    // InternalProgram.g:4106:1: rule__Keynote__Group__3 : rule__Keynote__Group__3__Impl ;
    public final void rule__Keynote__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4110:1: ( rule__Keynote__Group__3__Impl )
            // InternalProgram.g:4111:2: rule__Keynote__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Keynote__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__Group__3"


    // $ANTLR start "rule__Keynote__Group__3__Impl"
    // InternalProgram.g:4117:1: rule__Keynote__Group__3__Impl : ( ( rule__Keynote__Group_3__0 )? ) ;
    public final void rule__Keynote__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4121:1: ( ( ( rule__Keynote__Group_3__0 )? ) )
            // InternalProgram.g:4122:1: ( ( rule__Keynote__Group_3__0 )? )
            {
            // InternalProgram.g:4122:1: ( ( rule__Keynote__Group_3__0 )? )
            // InternalProgram.g:4123:2: ( rule__Keynote__Group_3__0 )?
            {
             before(grammarAccess.getKeynoteAccess().getGroup_3()); 
            // InternalProgram.g:4124:2: ( rule__Keynote__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==45) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalProgram.g:4124:3: rule__Keynote__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Keynote__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKeynoteAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__Group__3__Impl"


    // $ANTLR start "rule__Keynote__Group_2__0"
    // InternalProgram.g:4133:1: rule__Keynote__Group_2__0 : rule__Keynote__Group_2__0__Impl rule__Keynote__Group_2__1 ;
    public final void rule__Keynote__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4137:1: ( rule__Keynote__Group_2__0__Impl rule__Keynote__Group_2__1 )
            // InternalProgram.g:4138:2: rule__Keynote__Group_2__0__Impl rule__Keynote__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Keynote__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Keynote__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__Group_2__0"


    // $ANTLR start "rule__Keynote__Group_2__0__Impl"
    // InternalProgram.g:4145:1: rule__Keynote__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__Keynote__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4149:1: ( ( 'abstract' ) )
            // InternalProgram.g:4150:1: ( 'abstract' )
            {
            // InternalProgram.g:4150:1: ( 'abstract' )
            // InternalProgram.g:4151:2: 'abstract'
            {
             before(grammarAccess.getKeynoteAccess().getAbstractKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getKeynoteAccess().getAbstractKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__Group_2__0__Impl"


    // $ANTLR start "rule__Keynote__Group_2__1"
    // InternalProgram.g:4160:1: rule__Keynote__Group_2__1 : rule__Keynote__Group_2__1__Impl ;
    public final void rule__Keynote__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4164:1: ( rule__Keynote__Group_2__1__Impl )
            // InternalProgram.g:4165:2: rule__Keynote__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Keynote__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__Group_2__1"


    // $ANTLR start "rule__Keynote__Group_2__1__Impl"
    // InternalProgram.g:4171:1: rule__Keynote__Group_2__1__Impl : ( ( rule__Keynote__AbstractAssignment_2_1 ) ) ;
    public final void rule__Keynote__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4175:1: ( ( ( rule__Keynote__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:4176:1: ( ( rule__Keynote__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:4176:1: ( ( rule__Keynote__AbstractAssignment_2_1 ) )
            // InternalProgram.g:4177:2: ( rule__Keynote__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getKeynoteAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:4178:2: ( rule__Keynote__AbstractAssignment_2_1 )
            // InternalProgram.g:4178:3: rule__Keynote__AbstractAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Keynote__AbstractAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getKeynoteAccess().getAbstractAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__Group_2__1__Impl"


    // $ANTLR start "rule__Keynote__Group_3__0"
    // InternalProgram.g:4187:1: rule__Keynote__Group_3__0 : rule__Keynote__Group_3__0__Impl rule__Keynote__Group_3__1 ;
    public final void rule__Keynote__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4191:1: ( rule__Keynote__Group_3__0__Impl rule__Keynote__Group_3__1 )
            // InternalProgram.g:4192:2: rule__Keynote__Group_3__0__Impl rule__Keynote__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Keynote__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Keynote__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__Group_3__0"


    // $ANTLR start "rule__Keynote__Group_3__0__Impl"
    // InternalProgram.g:4199:1: rule__Keynote__Group_3__0__Impl : ( 'speaker' ) ;
    public final void rule__Keynote__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4203:1: ( ( 'speaker' ) )
            // InternalProgram.g:4204:1: ( 'speaker' )
            {
            // InternalProgram.g:4204:1: ( 'speaker' )
            // InternalProgram.g:4205:2: 'speaker'
            {
             before(grammarAccess.getKeynoteAccess().getSpeakerKeyword_3_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getKeynoteAccess().getSpeakerKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__Group_3__0__Impl"


    // $ANTLR start "rule__Keynote__Group_3__1"
    // InternalProgram.g:4214:1: rule__Keynote__Group_3__1 : rule__Keynote__Group_3__1__Impl ;
    public final void rule__Keynote__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4218:1: ( rule__Keynote__Group_3__1__Impl )
            // InternalProgram.g:4219:2: rule__Keynote__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Keynote__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__Group_3__1"


    // $ANTLR start "rule__Keynote__Group_3__1__Impl"
    // InternalProgram.g:4225:1: rule__Keynote__Group_3__1__Impl : ( ( rule__Keynote__SpeakerAssignment_3_1 ) ) ;
    public final void rule__Keynote__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4229:1: ( ( ( rule__Keynote__SpeakerAssignment_3_1 ) ) )
            // InternalProgram.g:4230:1: ( ( rule__Keynote__SpeakerAssignment_3_1 ) )
            {
            // InternalProgram.g:4230:1: ( ( rule__Keynote__SpeakerAssignment_3_1 ) )
            // InternalProgram.g:4231:2: ( rule__Keynote__SpeakerAssignment_3_1 )
            {
             before(grammarAccess.getKeynoteAccess().getSpeakerAssignment_3_1()); 
            // InternalProgram.g:4232:2: ( rule__Keynote__SpeakerAssignment_3_1 )
            // InternalProgram.g:4232:3: rule__Keynote__SpeakerAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Keynote__SpeakerAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getKeynoteAccess().getSpeakerAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__Group_3__1__Impl"


    // $ANTLR start "rule__SponsorKeynote__Group__0"
    // InternalProgram.g:4241:1: rule__SponsorKeynote__Group__0 : rule__SponsorKeynote__Group__0__Impl rule__SponsorKeynote__Group__1 ;
    public final void rule__SponsorKeynote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4245:1: ( rule__SponsorKeynote__Group__0__Impl rule__SponsorKeynote__Group__1 )
            // InternalProgram.g:4246:2: rule__SponsorKeynote__Group__0__Impl rule__SponsorKeynote__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SponsorKeynote__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SponsorKeynote__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SponsorKeynote__Group__0"


    // $ANTLR start "rule__SponsorKeynote__Group__0__Impl"
    // InternalProgram.g:4253:1: rule__SponsorKeynote__Group__0__Impl : ( 'SponsorKeynote' ) ;
    public final void rule__SponsorKeynote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4257:1: ( ( 'SponsorKeynote' ) )
            // InternalProgram.g:4258:1: ( 'SponsorKeynote' )
            {
            // InternalProgram.g:4258:1: ( 'SponsorKeynote' )
            // InternalProgram.g:4259:2: 'SponsorKeynote'
            {
             before(grammarAccess.getSponsorKeynoteAccess().getSponsorKeynoteKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSponsorKeynoteAccess().getSponsorKeynoteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SponsorKeynote__Group__0__Impl"


    // $ANTLR start "rule__SponsorKeynote__Group__1"
    // InternalProgram.g:4268:1: rule__SponsorKeynote__Group__1 : rule__SponsorKeynote__Group__1__Impl rule__SponsorKeynote__Group__2 ;
    public final void rule__SponsorKeynote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4272:1: ( rule__SponsorKeynote__Group__1__Impl rule__SponsorKeynote__Group__2 )
            // InternalProgram.g:4273:2: rule__SponsorKeynote__Group__1__Impl rule__SponsorKeynote__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__SponsorKeynote__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SponsorKeynote__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SponsorKeynote__Group__1"


    // $ANTLR start "rule__SponsorKeynote__Group__1__Impl"
    // InternalProgram.g:4280:1: rule__SponsorKeynote__Group__1__Impl : ( ( rule__SponsorKeynote__NameAssignment_1 ) ) ;
    public final void rule__SponsorKeynote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4284:1: ( ( ( rule__SponsorKeynote__NameAssignment_1 ) ) )
            // InternalProgram.g:4285:1: ( ( rule__SponsorKeynote__NameAssignment_1 ) )
            {
            // InternalProgram.g:4285:1: ( ( rule__SponsorKeynote__NameAssignment_1 ) )
            // InternalProgram.g:4286:2: ( rule__SponsorKeynote__NameAssignment_1 )
            {
             before(grammarAccess.getSponsorKeynoteAccess().getNameAssignment_1()); 
            // InternalProgram.g:4287:2: ( rule__SponsorKeynote__NameAssignment_1 )
            // InternalProgram.g:4287:3: rule__SponsorKeynote__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SponsorKeynote__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSponsorKeynoteAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SponsorKeynote__Group__1__Impl"


    // $ANTLR start "rule__SponsorKeynote__Group__2"
    // InternalProgram.g:4295:1: rule__SponsorKeynote__Group__2 : rule__SponsorKeynote__Group__2__Impl rule__SponsorKeynote__Group__3 ;
    public final void rule__SponsorKeynote__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4299:1: ( rule__SponsorKeynote__Group__2__Impl rule__SponsorKeynote__Group__3 )
            // InternalProgram.g:4300:2: rule__SponsorKeynote__Group__2__Impl rule__SponsorKeynote__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__SponsorKeynote__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SponsorKeynote__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SponsorKeynote__Group__2"


    // $ANTLR start "rule__SponsorKeynote__Group__2__Impl"
    // InternalProgram.g:4307:1: rule__SponsorKeynote__Group__2__Impl : ( ( rule__SponsorKeynote__Group_2__0 )? ) ;
    public final void rule__SponsorKeynote__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4311:1: ( ( ( rule__SponsorKeynote__Group_2__0 )? ) )
            // InternalProgram.g:4312:1: ( ( rule__SponsorKeynote__Group_2__0 )? )
            {
            // InternalProgram.g:4312:1: ( ( rule__SponsorKeynote__Group_2__0 )? )
            // InternalProgram.g:4313:2: ( rule__SponsorKeynote__Group_2__0 )?
            {
             before(grammarAccess.getSponsorKeynoteAccess().getGroup_2()); 
            // InternalProgram.g:4314:2: ( rule__SponsorKeynote__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalProgram.g:4314:3: rule__SponsorKeynote__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SponsorKeynote__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSponsorKeynoteAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SponsorKeynote__Group__2__Impl"


    // $ANTLR start "rule__SponsorKeynote__Group__3"
    // InternalProgram.g:4322:1: rule__SponsorKeynote__Group__3 : rule__SponsorKeynote__Group__3__Impl ;
    public final void rule__SponsorKeynote__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4326:1: ( rule__SponsorKeynote__Group__3__Impl )
            // InternalProgram.g:4327:2: rule__SponsorKeynote__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SponsorKeynote__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SponsorKeynote__Group__3"


    // $ANTLR start "rule__SponsorKeynote__Group__3__Impl"
    // InternalProgram.g:4333:1: rule__SponsorKeynote__Group__3__Impl : ( ( rule__SponsorKeynote__Group_3__0 )? ) ;
    public final void rule__SponsorKeynote__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4337:1: ( ( ( rule__SponsorKeynote__Group_3__0 )? ) )
            // InternalProgram.g:4338:1: ( ( rule__SponsorKeynote__Group_3__0 )? )
            {
            // InternalProgram.g:4338:1: ( ( rule__SponsorKeynote__Group_3__0 )? )
            // InternalProgram.g:4339:2: ( rule__SponsorKeynote__Group_3__0 )?
            {
             before(grammarAccess.getSponsorKeynoteAccess().getGroup_3()); 
            // InternalProgram.g:4340:2: ( rule__SponsorKeynote__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==45) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalProgram.g:4340:3: rule__SponsorKeynote__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SponsorKeynote__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSponsorKeynoteAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SponsorKeynote__Group__3__Impl"


    // $ANTLR start "rule__SponsorKeynote__Group_2__0"
    // InternalProgram.g:4349:1: rule__SponsorKeynote__Group_2__0 : rule__SponsorKeynote__Group_2__0__Impl rule__SponsorKeynote__Group_2__1 ;
    public final void rule__SponsorKeynote__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4353:1: ( rule__SponsorKeynote__Group_2__0__Impl rule__SponsorKeynote__Group_2__1 )
            // InternalProgram.g:4354:2: rule__SponsorKeynote__Group_2__0__Impl rule__SponsorKeynote__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__SponsorKeynote__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SponsorKeynote__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SponsorKeynote__Group_2__0"


    // $ANTLR start "rule__SponsorKeynote__Group_2__0__Impl"
    // InternalProgram.g:4361:1: rule__SponsorKeynote__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__SponsorKeynote__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4365:1: ( ( 'abstract' ) )
            // InternalProgram.g:4366:1: ( 'abstract' )
            {
            // InternalProgram.g:4366:1: ( 'abstract' )
            // InternalProgram.g:4367:2: 'abstract'
            {
             before(grammarAccess.getSponsorKeynoteAccess().getAbstractKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSponsorKeynoteAccess().getAbstractKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SponsorKeynote__Group_2__0__Impl"


    // $ANTLR start "rule__SponsorKeynote__Group_2__1"
    // InternalProgram.g:4376:1: rule__SponsorKeynote__Group_2__1 : rule__SponsorKeynote__Group_2__1__Impl ;
    public final void rule__SponsorKeynote__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4380:1: ( rule__SponsorKeynote__Group_2__1__Impl )
            // InternalProgram.g:4381:2: rule__SponsorKeynote__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SponsorKeynote__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SponsorKeynote__Group_2__1"


    // $ANTLR start "rule__SponsorKeynote__Group_2__1__Impl"
    // InternalProgram.g:4387:1: rule__SponsorKeynote__Group_2__1__Impl : ( ( rule__SponsorKeynote__AbstractAssignment_2_1 ) ) ;
    public final void rule__SponsorKeynote__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4391:1: ( ( ( rule__SponsorKeynote__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:4392:1: ( ( rule__SponsorKeynote__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:4392:1: ( ( rule__SponsorKeynote__AbstractAssignment_2_1 ) )
            // InternalProgram.g:4393:2: ( rule__SponsorKeynote__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getSponsorKeynoteAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:4394:2: ( rule__SponsorKeynote__AbstractAssignment_2_1 )
            // InternalProgram.g:4394:3: rule__SponsorKeynote__AbstractAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SponsorKeynote__AbstractAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSponsorKeynoteAccess().getAbstractAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SponsorKeynote__Group_2__1__Impl"


    // $ANTLR start "rule__SponsorKeynote__Group_3__0"
    // InternalProgram.g:4403:1: rule__SponsorKeynote__Group_3__0 : rule__SponsorKeynote__Group_3__0__Impl rule__SponsorKeynote__Group_3__1 ;
    public final void rule__SponsorKeynote__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4407:1: ( rule__SponsorKeynote__Group_3__0__Impl rule__SponsorKeynote__Group_3__1 )
            // InternalProgram.g:4408:2: rule__SponsorKeynote__Group_3__0__Impl rule__SponsorKeynote__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__SponsorKeynote__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SponsorKeynote__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SponsorKeynote__Group_3__0"


    // $ANTLR start "rule__SponsorKeynote__Group_3__0__Impl"
    // InternalProgram.g:4415:1: rule__SponsorKeynote__Group_3__0__Impl : ( 'speaker' ) ;
    public final void rule__SponsorKeynote__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4419:1: ( ( 'speaker' ) )
            // InternalProgram.g:4420:1: ( 'speaker' )
            {
            // InternalProgram.g:4420:1: ( 'speaker' )
            // InternalProgram.g:4421:2: 'speaker'
            {
             before(grammarAccess.getSponsorKeynoteAccess().getSpeakerKeyword_3_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSponsorKeynoteAccess().getSpeakerKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SponsorKeynote__Group_3__0__Impl"


    // $ANTLR start "rule__SponsorKeynote__Group_3__1"
    // InternalProgram.g:4430:1: rule__SponsorKeynote__Group_3__1 : rule__SponsorKeynote__Group_3__1__Impl ;
    public final void rule__SponsorKeynote__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4434:1: ( rule__SponsorKeynote__Group_3__1__Impl )
            // InternalProgram.g:4435:2: rule__SponsorKeynote__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SponsorKeynote__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SponsorKeynote__Group_3__1"


    // $ANTLR start "rule__SponsorKeynote__Group_3__1__Impl"
    // InternalProgram.g:4441:1: rule__SponsorKeynote__Group_3__1__Impl : ( ( rule__SponsorKeynote__SpeakerAssignment_3_1 ) ) ;
    public final void rule__SponsorKeynote__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4445:1: ( ( ( rule__SponsorKeynote__SpeakerAssignment_3_1 ) ) )
            // InternalProgram.g:4446:1: ( ( rule__SponsorKeynote__SpeakerAssignment_3_1 ) )
            {
            // InternalProgram.g:4446:1: ( ( rule__SponsorKeynote__SpeakerAssignment_3_1 ) )
            // InternalProgram.g:4447:2: ( rule__SponsorKeynote__SpeakerAssignment_3_1 )
            {
             before(grammarAccess.getSponsorKeynoteAccess().getSpeakerAssignment_3_1()); 
            // InternalProgram.g:4448:2: ( rule__SponsorKeynote__SpeakerAssignment_3_1 )
            // InternalProgram.g:4448:3: rule__SponsorKeynote__SpeakerAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SponsorKeynote__SpeakerAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSponsorKeynoteAccess().getSpeakerAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SponsorKeynote__Group_3__1__Impl"


    // $ANTLR start "rule__Workshop__Group__0"
    // InternalProgram.g:4457:1: rule__Workshop__Group__0 : rule__Workshop__Group__0__Impl rule__Workshop__Group__1 ;
    public final void rule__Workshop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4461:1: ( rule__Workshop__Group__0__Impl rule__Workshop__Group__1 )
            // InternalProgram.g:4462:2: rule__Workshop__Group__0__Impl rule__Workshop__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Workshop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workshop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group__0"


    // $ANTLR start "rule__Workshop__Group__0__Impl"
    // InternalProgram.g:4469:1: rule__Workshop__Group__0__Impl : ( 'Workshop' ) ;
    public final void rule__Workshop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4473:1: ( ( 'Workshop' ) )
            // InternalProgram.g:4474:1: ( 'Workshop' )
            {
            // InternalProgram.g:4474:1: ( 'Workshop' )
            // InternalProgram.g:4475:2: 'Workshop'
            {
             before(grammarAccess.getWorkshopAccess().getWorkshopKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getWorkshopAccess().getWorkshopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group__0__Impl"


    // $ANTLR start "rule__Workshop__Group__1"
    // InternalProgram.g:4484:1: rule__Workshop__Group__1 : rule__Workshop__Group__1__Impl rule__Workshop__Group__2 ;
    public final void rule__Workshop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4488:1: ( rule__Workshop__Group__1__Impl rule__Workshop__Group__2 )
            // InternalProgram.g:4489:2: rule__Workshop__Group__1__Impl rule__Workshop__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__Workshop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workshop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group__1"


    // $ANTLR start "rule__Workshop__Group__1__Impl"
    // InternalProgram.g:4496:1: rule__Workshop__Group__1__Impl : ( ( rule__Workshop__NameAssignment_1 ) ) ;
    public final void rule__Workshop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4500:1: ( ( ( rule__Workshop__NameAssignment_1 ) ) )
            // InternalProgram.g:4501:1: ( ( rule__Workshop__NameAssignment_1 ) )
            {
            // InternalProgram.g:4501:1: ( ( rule__Workshop__NameAssignment_1 ) )
            // InternalProgram.g:4502:2: ( rule__Workshop__NameAssignment_1 )
            {
             before(grammarAccess.getWorkshopAccess().getNameAssignment_1()); 
            // InternalProgram.g:4503:2: ( rule__Workshop__NameAssignment_1 )
            // InternalProgram.g:4503:3: rule__Workshop__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Workshop__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkshopAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group__1__Impl"


    // $ANTLR start "rule__Workshop__Group__2"
    // InternalProgram.g:4511:1: rule__Workshop__Group__2 : rule__Workshop__Group__2__Impl rule__Workshop__Group__3 ;
    public final void rule__Workshop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4515:1: ( rule__Workshop__Group__2__Impl rule__Workshop__Group__3 )
            // InternalProgram.g:4516:2: rule__Workshop__Group__2__Impl rule__Workshop__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Workshop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workshop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group__2"


    // $ANTLR start "rule__Workshop__Group__2__Impl"
    // InternalProgram.g:4523:1: rule__Workshop__Group__2__Impl : ( ( rule__Workshop__Group_2__0 )? ) ;
    public final void rule__Workshop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4527:1: ( ( ( rule__Workshop__Group_2__0 )? ) )
            // InternalProgram.g:4528:1: ( ( rule__Workshop__Group_2__0 )? )
            {
            // InternalProgram.g:4528:1: ( ( rule__Workshop__Group_2__0 )? )
            // InternalProgram.g:4529:2: ( rule__Workshop__Group_2__0 )?
            {
             before(grammarAccess.getWorkshopAccess().getGroup_2()); 
            // InternalProgram.g:4530:2: ( rule__Workshop__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==38) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalProgram.g:4530:3: rule__Workshop__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Workshop__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkshopAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group__2__Impl"


    // $ANTLR start "rule__Workshop__Group__3"
    // InternalProgram.g:4538:1: rule__Workshop__Group__3 : rule__Workshop__Group__3__Impl rule__Workshop__Group__4 ;
    public final void rule__Workshop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4542:1: ( rule__Workshop__Group__3__Impl rule__Workshop__Group__4 )
            // InternalProgram.g:4543:2: rule__Workshop__Group__3__Impl rule__Workshop__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__Workshop__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workshop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group__3"


    // $ANTLR start "rule__Workshop__Group__3__Impl"
    // InternalProgram.g:4550:1: rule__Workshop__Group__3__Impl : ( ( rule__Workshop__Group_3__0 )? ) ;
    public final void rule__Workshop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4554:1: ( ( ( rule__Workshop__Group_3__0 )? ) )
            // InternalProgram.g:4555:1: ( ( rule__Workshop__Group_3__0 )? )
            {
            // InternalProgram.g:4555:1: ( ( rule__Workshop__Group_3__0 )? )
            // InternalProgram.g:4556:2: ( rule__Workshop__Group_3__0 )?
            {
             before(grammarAccess.getWorkshopAccess().getGroup_3()); 
            // InternalProgram.g:4557:2: ( rule__Workshop__Group_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==48) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalProgram.g:4557:3: rule__Workshop__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Workshop__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkshopAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group__3__Impl"


    // $ANTLR start "rule__Workshop__Group__4"
    // InternalProgram.g:4565:1: rule__Workshop__Group__4 : rule__Workshop__Group__4__Impl rule__Workshop__Group__5 ;
    public final void rule__Workshop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4569:1: ( rule__Workshop__Group__4__Impl rule__Workshop__Group__5 )
            // InternalProgram.g:4570:2: rule__Workshop__Group__4__Impl rule__Workshop__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__Workshop__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workshop__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group__4"


    // $ANTLR start "rule__Workshop__Group__4__Impl"
    // InternalProgram.g:4577:1: rule__Workshop__Group__4__Impl : ( ( rule__Workshop__Group_4__0 )? ) ;
    public final void rule__Workshop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4581:1: ( ( ( rule__Workshop__Group_4__0 )? ) )
            // InternalProgram.g:4582:1: ( ( rule__Workshop__Group_4__0 )? )
            {
            // InternalProgram.g:4582:1: ( ( rule__Workshop__Group_4__0 )? )
            // InternalProgram.g:4583:2: ( rule__Workshop__Group_4__0 )?
            {
             before(grammarAccess.getWorkshopAccess().getGroup_4()); 
            // InternalProgram.g:4584:2: ( rule__Workshop__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==49) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalProgram.g:4584:3: rule__Workshop__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Workshop__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkshopAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group__4__Impl"


    // $ANTLR start "rule__Workshop__Group__5"
    // InternalProgram.g:4592:1: rule__Workshop__Group__5 : rule__Workshop__Group__5__Impl ;
    public final void rule__Workshop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4596:1: ( rule__Workshop__Group__5__Impl )
            // InternalProgram.g:4597:2: rule__Workshop__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Workshop__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group__5"


    // $ANTLR start "rule__Workshop__Group__5__Impl"
    // InternalProgram.g:4603:1: rule__Workshop__Group__5__Impl : ( ( rule__Workshop__Group_5__0 )? ) ;
    public final void rule__Workshop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4607:1: ( ( ( rule__Workshop__Group_5__0 )? ) )
            // InternalProgram.g:4608:1: ( ( rule__Workshop__Group_5__0 )? )
            {
            // InternalProgram.g:4608:1: ( ( rule__Workshop__Group_5__0 )? )
            // InternalProgram.g:4609:2: ( rule__Workshop__Group_5__0 )?
            {
             before(grammarAccess.getWorkshopAccess().getGroup_5()); 
            // InternalProgram.g:4610:2: ( rule__Workshop__Group_5__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==50) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalProgram.g:4610:3: rule__Workshop__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Workshop__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkshopAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group__5__Impl"


    // $ANTLR start "rule__Workshop__Group_2__0"
    // InternalProgram.g:4619:1: rule__Workshop__Group_2__0 : rule__Workshop__Group_2__0__Impl rule__Workshop__Group_2__1 ;
    public final void rule__Workshop__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4623:1: ( rule__Workshop__Group_2__0__Impl rule__Workshop__Group_2__1 )
            // InternalProgram.g:4624:2: rule__Workshop__Group_2__0__Impl rule__Workshop__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Workshop__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workshop__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_2__0"


    // $ANTLR start "rule__Workshop__Group_2__0__Impl"
    // InternalProgram.g:4631:1: rule__Workshop__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__Workshop__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4635:1: ( ( 'abstract' ) )
            // InternalProgram.g:4636:1: ( 'abstract' )
            {
            // InternalProgram.g:4636:1: ( 'abstract' )
            // InternalProgram.g:4637:2: 'abstract'
            {
             before(grammarAccess.getWorkshopAccess().getAbstractKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getWorkshopAccess().getAbstractKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_2__0__Impl"


    // $ANTLR start "rule__Workshop__Group_2__1"
    // InternalProgram.g:4646:1: rule__Workshop__Group_2__1 : rule__Workshop__Group_2__1__Impl ;
    public final void rule__Workshop__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4650:1: ( rule__Workshop__Group_2__1__Impl )
            // InternalProgram.g:4651:2: rule__Workshop__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Workshop__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_2__1"


    // $ANTLR start "rule__Workshop__Group_2__1__Impl"
    // InternalProgram.g:4657:1: rule__Workshop__Group_2__1__Impl : ( ( rule__Workshop__AbstractAssignment_2_1 ) ) ;
    public final void rule__Workshop__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4661:1: ( ( ( rule__Workshop__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:4662:1: ( ( rule__Workshop__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:4662:1: ( ( rule__Workshop__AbstractAssignment_2_1 ) )
            // InternalProgram.g:4663:2: ( rule__Workshop__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getWorkshopAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:4664:2: ( rule__Workshop__AbstractAssignment_2_1 )
            // InternalProgram.g:4664:3: rule__Workshop__AbstractAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Workshop__AbstractAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkshopAccess().getAbstractAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_2__1__Impl"


    // $ANTLR start "rule__Workshop__Group_3__0"
    // InternalProgram.g:4673:1: rule__Workshop__Group_3__0 : rule__Workshop__Group_3__0__Impl rule__Workshop__Group_3__1 ;
    public final void rule__Workshop__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4677:1: ( rule__Workshop__Group_3__0__Impl rule__Workshop__Group_3__1 )
            // InternalProgram.g:4678:2: rule__Workshop__Group_3__0__Impl rule__Workshop__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Workshop__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workshop__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_3__0"


    // $ANTLR start "rule__Workshop__Group_3__0__Impl"
    // InternalProgram.g:4685:1: rule__Workshop__Group_3__0__Impl : ( 'url' ) ;
    public final void rule__Workshop__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4689:1: ( ( 'url' ) )
            // InternalProgram.g:4690:1: ( 'url' )
            {
            // InternalProgram.g:4690:1: ( 'url' )
            // InternalProgram.g:4691:2: 'url'
            {
             before(grammarAccess.getWorkshopAccess().getUrlKeyword_3_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getWorkshopAccess().getUrlKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_3__0__Impl"


    // $ANTLR start "rule__Workshop__Group_3__1"
    // InternalProgram.g:4700:1: rule__Workshop__Group_3__1 : rule__Workshop__Group_3__1__Impl ;
    public final void rule__Workshop__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4704:1: ( rule__Workshop__Group_3__1__Impl )
            // InternalProgram.g:4705:2: rule__Workshop__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Workshop__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_3__1"


    // $ANTLR start "rule__Workshop__Group_3__1__Impl"
    // InternalProgram.g:4711:1: rule__Workshop__Group_3__1__Impl : ( ( rule__Workshop__UrlAssignment_3_1 ) ) ;
    public final void rule__Workshop__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4715:1: ( ( ( rule__Workshop__UrlAssignment_3_1 ) ) )
            // InternalProgram.g:4716:1: ( ( rule__Workshop__UrlAssignment_3_1 ) )
            {
            // InternalProgram.g:4716:1: ( ( rule__Workshop__UrlAssignment_3_1 ) )
            // InternalProgram.g:4717:2: ( rule__Workshop__UrlAssignment_3_1 )
            {
             before(grammarAccess.getWorkshopAccess().getUrlAssignment_3_1()); 
            // InternalProgram.g:4718:2: ( rule__Workshop__UrlAssignment_3_1 )
            // InternalProgram.g:4718:3: rule__Workshop__UrlAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Workshop__UrlAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkshopAccess().getUrlAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_3__1__Impl"


    // $ANTLR start "rule__Workshop__Group_4__0"
    // InternalProgram.g:4727:1: rule__Workshop__Group_4__0 : rule__Workshop__Group_4__0__Impl rule__Workshop__Group_4__1 ;
    public final void rule__Workshop__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4731:1: ( rule__Workshop__Group_4__0__Impl rule__Workshop__Group_4__1 )
            // InternalProgram.g:4732:2: rule__Workshop__Group_4__0__Impl rule__Workshop__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Workshop__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workshop__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_4__0"


    // $ANTLR start "rule__Workshop__Group_4__0__Impl"
    // InternalProgram.g:4739:1: rule__Workshop__Group_4__0__Impl : ( 'name' ) ;
    public final void rule__Workshop__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4743:1: ( ( 'name' ) )
            // InternalProgram.g:4744:1: ( 'name' )
            {
            // InternalProgram.g:4744:1: ( 'name' )
            // InternalProgram.g:4745:2: 'name'
            {
             before(grammarAccess.getWorkshopAccess().getNameKeyword_4_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getWorkshopAccess().getNameKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_4__0__Impl"


    // $ANTLR start "rule__Workshop__Group_4__1"
    // InternalProgram.g:4754:1: rule__Workshop__Group_4__1 : rule__Workshop__Group_4__1__Impl ;
    public final void rule__Workshop__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4758:1: ( rule__Workshop__Group_4__1__Impl )
            // InternalProgram.g:4759:2: rule__Workshop__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Workshop__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_4__1"


    // $ANTLR start "rule__Workshop__Group_4__1__Impl"
    // InternalProgram.g:4765:1: rule__Workshop__Group_4__1__Impl : ( ( rule__Workshop__FullNameAssignment_4_1 ) ) ;
    public final void rule__Workshop__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4769:1: ( ( ( rule__Workshop__FullNameAssignment_4_1 ) ) )
            // InternalProgram.g:4770:1: ( ( rule__Workshop__FullNameAssignment_4_1 ) )
            {
            // InternalProgram.g:4770:1: ( ( rule__Workshop__FullNameAssignment_4_1 ) )
            // InternalProgram.g:4771:2: ( rule__Workshop__FullNameAssignment_4_1 )
            {
             before(grammarAccess.getWorkshopAccess().getFullNameAssignment_4_1()); 
            // InternalProgram.g:4772:2: ( rule__Workshop__FullNameAssignment_4_1 )
            // InternalProgram.g:4772:3: rule__Workshop__FullNameAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Workshop__FullNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkshopAccess().getFullNameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_4__1__Impl"


    // $ANTLR start "rule__Workshop__Group_5__0"
    // InternalProgram.g:4781:1: rule__Workshop__Group_5__0 : rule__Workshop__Group_5__0__Impl rule__Workshop__Group_5__1 ;
    public final void rule__Workshop__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4785:1: ( rule__Workshop__Group_5__0__Impl rule__Workshop__Group_5__1 )
            // InternalProgram.g:4786:2: rule__Workshop__Group_5__0__Impl rule__Workshop__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Workshop__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workshop__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_5__0"


    // $ANTLR start "rule__Workshop__Group_5__0__Impl"
    // InternalProgram.g:4793:1: rule__Workshop__Group_5__0__Impl : ( 'organizers' ) ;
    public final void rule__Workshop__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4797:1: ( ( 'organizers' ) )
            // InternalProgram.g:4798:1: ( 'organizers' )
            {
            // InternalProgram.g:4798:1: ( 'organizers' )
            // InternalProgram.g:4799:2: 'organizers'
            {
             before(grammarAccess.getWorkshopAccess().getOrganizersKeyword_5_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getWorkshopAccess().getOrganizersKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_5__0__Impl"


    // $ANTLR start "rule__Workshop__Group_5__1"
    // InternalProgram.g:4808:1: rule__Workshop__Group_5__1 : rule__Workshop__Group_5__1__Impl rule__Workshop__Group_5__2 ;
    public final void rule__Workshop__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4812:1: ( rule__Workshop__Group_5__1__Impl rule__Workshop__Group_5__2 )
            // InternalProgram.g:4813:2: rule__Workshop__Group_5__1__Impl rule__Workshop__Group_5__2
            {
            pushFollow(FOLLOW_8);
            rule__Workshop__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workshop__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_5__1"


    // $ANTLR start "rule__Workshop__Group_5__1__Impl"
    // InternalProgram.g:4820:1: rule__Workshop__Group_5__1__Impl : ( ( rule__Workshop__OrganizersAssignment_5_1 ) ) ;
    public final void rule__Workshop__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4824:1: ( ( ( rule__Workshop__OrganizersAssignment_5_1 ) ) )
            // InternalProgram.g:4825:1: ( ( rule__Workshop__OrganizersAssignment_5_1 ) )
            {
            // InternalProgram.g:4825:1: ( ( rule__Workshop__OrganizersAssignment_5_1 ) )
            // InternalProgram.g:4826:2: ( rule__Workshop__OrganizersAssignment_5_1 )
            {
             before(grammarAccess.getWorkshopAccess().getOrganizersAssignment_5_1()); 
            // InternalProgram.g:4827:2: ( rule__Workshop__OrganizersAssignment_5_1 )
            // InternalProgram.g:4827:3: rule__Workshop__OrganizersAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Workshop__OrganizersAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkshopAccess().getOrganizersAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_5__1__Impl"


    // $ANTLR start "rule__Workshop__Group_5__2"
    // InternalProgram.g:4835:1: rule__Workshop__Group_5__2 : rule__Workshop__Group_5__2__Impl ;
    public final void rule__Workshop__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4839:1: ( rule__Workshop__Group_5__2__Impl )
            // InternalProgram.g:4840:2: rule__Workshop__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Workshop__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_5__2"


    // $ANTLR start "rule__Workshop__Group_5__2__Impl"
    // InternalProgram.g:4846:1: rule__Workshop__Group_5__2__Impl : ( ( rule__Workshop__Group_5_2__0 )* ) ;
    public final void rule__Workshop__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4850:1: ( ( ( rule__Workshop__Group_5_2__0 )* ) )
            // InternalProgram.g:4851:1: ( ( rule__Workshop__Group_5_2__0 )* )
            {
            // InternalProgram.g:4851:1: ( ( rule__Workshop__Group_5_2__0 )* )
            // InternalProgram.g:4852:2: ( rule__Workshop__Group_5_2__0 )*
            {
             before(grammarAccess.getWorkshopAccess().getGroup_5_2()); 
            // InternalProgram.g:4853:2: ( rule__Workshop__Group_5_2__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==21) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalProgram.g:4853:3: rule__Workshop__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Workshop__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getWorkshopAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_5__2__Impl"


    // $ANTLR start "rule__Workshop__Group_5_2__0"
    // InternalProgram.g:4862:1: rule__Workshop__Group_5_2__0 : rule__Workshop__Group_5_2__0__Impl rule__Workshop__Group_5_2__1 ;
    public final void rule__Workshop__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4866:1: ( rule__Workshop__Group_5_2__0__Impl rule__Workshop__Group_5_2__1 )
            // InternalProgram.g:4867:2: rule__Workshop__Group_5_2__0__Impl rule__Workshop__Group_5_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Workshop__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workshop__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_5_2__0"


    // $ANTLR start "rule__Workshop__Group_5_2__0__Impl"
    // InternalProgram.g:4874:1: rule__Workshop__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Workshop__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4878:1: ( ( ',' ) )
            // InternalProgram.g:4879:1: ( ',' )
            {
            // InternalProgram.g:4879:1: ( ',' )
            // InternalProgram.g:4880:2: ','
            {
             before(grammarAccess.getWorkshopAccess().getCommaKeyword_5_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWorkshopAccess().getCommaKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_5_2__0__Impl"


    // $ANTLR start "rule__Workshop__Group_5_2__1"
    // InternalProgram.g:4889:1: rule__Workshop__Group_5_2__1 : rule__Workshop__Group_5_2__1__Impl ;
    public final void rule__Workshop__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4893:1: ( rule__Workshop__Group_5_2__1__Impl )
            // InternalProgram.g:4894:2: rule__Workshop__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Workshop__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_5_2__1"


    // $ANTLR start "rule__Workshop__Group_5_2__1__Impl"
    // InternalProgram.g:4900:1: rule__Workshop__Group_5_2__1__Impl : ( ( rule__Workshop__OrganizersAssignment_5_2_1 ) ) ;
    public final void rule__Workshop__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4904:1: ( ( ( rule__Workshop__OrganizersAssignment_5_2_1 ) ) )
            // InternalProgram.g:4905:1: ( ( rule__Workshop__OrganizersAssignment_5_2_1 ) )
            {
            // InternalProgram.g:4905:1: ( ( rule__Workshop__OrganizersAssignment_5_2_1 ) )
            // InternalProgram.g:4906:2: ( rule__Workshop__OrganizersAssignment_5_2_1 )
            {
             before(grammarAccess.getWorkshopAccess().getOrganizersAssignment_5_2_1()); 
            // InternalProgram.g:4907:2: ( rule__Workshop__OrganizersAssignment_5_2_1 )
            // InternalProgram.g:4907:3: rule__Workshop__OrganizersAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Workshop__OrganizersAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkshopAccess().getOrganizersAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_5_2__1__Impl"


    // $ANTLR start "rule__Tutorial__Group__0"
    // InternalProgram.g:4916:1: rule__Tutorial__Group__0 : rule__Tutorial__Group__0__Impl rule__Tutorial__Group__1 ;
    public final void rule__Tutorial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4920:1: ( rule__Tutorial__Group__0__Impl rule__Tutorial__Group__1 )
            // InternalProgram.g:4921:2: rule__Tutorial__Group__0__Impl rule__Tutorial__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Tutorial__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tutorial__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group__0"


    // $ANTLR start "rule__Tutorial__Group__0__Impl"
    // InternalProgram.g:4928:1: rule__Tutorial__Group__0__Impl : ( 'Tutorial' ) ;
    public final void rule__Tutorial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4932:1: ( ( 'Tutorial' ) )
            // InternalProgram.g:4933:1: ( 'Tutorial' )
            {
            // InternalProgram.g:4933:1: ( 'Tutorial' )
            // InternalProgram.g:4934:2: 'Tutorial'
            {
             before(grammarAccess.getTutorialAccess().getTutorialKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTutorialAccess().getTutorialKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group__0__Impl"


    // $ANTLR start "rule__Tutorial__Group__1"
    // InternalProgram.g:4943:1: rule__Tutorial__Group__1 : rule__Tutorial__Group__1__Impl rule__Tutorial__Group__2 ;
    public final void rule__Tutorial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4947:1: ( rule__Tutorial__Group__1__Impl rule__Tutorial__Group__2 )
            // InternalProgram.g:4948:2: rule__Tutorial__Group__1__Impl rule__Tutorial__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__Tutorial__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tutorial__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group__1"


    // $ANTLR start "rule__Tutorial__Group__1__Impl"
    // InternalProgram.g:4955:1: rule__Tutorial__Group__1__Impl : ( ( rule__Tutorial__NameAssignment_1 ) ) ;
    public final void rule__Tutorial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4959:1: ( ( ( rule__Tutorial__NameAssignment_1 ) ) )
            // InternalProgram.g:4960:1: ( ( rule__Tutorial__NameAssignment_1 ) )
            {
            // InternalProgram.g:4960:1: ( ( rule__Tutorial__NameAssignment_1 ) )
            // InternalProgram.g:4961:2: ( rule__Tutorial__NameAssignment_1 )
            {
             before(grammarAccess.getTutorialAccess().getNameAssignment_1()); 
            // InternalProgram.g:4962:2: ( rule__Tutorial__NameAssignment_1 )
            // InternalProgram.g:4962:3: rule__Tutorial__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tutorial__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTutorialAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group__1__Impl"


    // $ANTLR start "rule__Tutorial__Group__2"
    // InternalProgram.g:4970:1: rule__Tutorial__Group__2 : rule__Tutorial__Group__2__Impl rule__Tutorial__Group__3 ;
    public final void rule__Tutorial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4974:1: ( rule__Tutorial__Group__2__Impl rule__Tutorial__Group__3 )
            // InternalProgram.g:4975:2: rule__Tutorial__Group__2__Impl rule__Tutorial__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Tutorial__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tutorial__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group__2"


    // $ANTLR start "rule__Tutorial__Group__2__Impl"
    // InternalProgram.g:4982:1: rule__Tutorial__Group__2__Impl : ( ( rule__Tutorial__Group_2__0 )? ) ;
    public final void rule__Tutorial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4986:1: ( ( ( rule__Tutorial__Group_2__0 )? ) )
            // InternalProgram.g:4987:1: ( ( rule__Tutorial__Group_2__0 )? )
            {
            // InternalProgram.g:4987:1: ( ( rule__Tutorial__Group_2__0 )? )
            // InternalProgram.g:4988:2: ( rule__Tutorial__Group_2__0 )?
            {
             before(grammarAccess.getTutorialAccess().getGroup_2()); 
            // InternalProgram.g:4989:2: ( rule__Tutorial__Group_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==38) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalProgram.g:4989:3: rule__Tutorial__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tutorial__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTutorialAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group__2__Impl"


    // $ANTLR start "rule__Tutorial__Group__3"
    // InternalProgram.g:4997:1: rule__Tutorial__Group__3 : rule__Tutorial__Group__3__Impl ;
    public final void rule__Tutorial__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5001:1: ( rule__Tutorial__Group__3__Impl )
            // InternalProgram.g:5002:2: rule__Tutorial__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tutorial__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group__3"


    // $ANTLR start "rule__Tutorial__Group__3__Impl"
    // InternalProgram.g:5008:1: rule__Tutorial__Group__3__Impl : ( ( rule__Tutorial__Group_3__0 )? ) ;
    public final void rule__Tutorial__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5012:1: ( ( ( rule__Tutorial__Group_3__0 )? ) )
            // InternalProgram.g:5013:1: ( ( rule__Tutorial__Group_3__0 )? )
            {
            // InternalProgram.g:5013:1: ( ( rule__Tutorial__Group_3__0 )? )
            // InternalProgram.g:5014:2: ( rule__Tutorial__Group_3__0 )?
            {
             before(grammarAccess.getTutorialAccess().getGroup_3()); 
            // InternalProgram.g:5015:2: ( rule__Tutorial__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==50) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalProgram.g:5015:3: rule__Tutorial__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tutorial__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTutorialAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group__3__Impl"


    // $ANTLR start "rule__Tutorial__Group_2__0"
    // InternalProgram.g:5024:1: rule__Tutorial__Group_2__0 : rule__Tutorial__Group_2__0__Impl rule__Tutorial__Group_2__1 ;
    public final void rule__Tutorial__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5028:1: ( rule__Tutorial__Group_2__0__Impl rule__Tutorial__Group_2__1 )
            // InternalProgram.g:5029:2: rule__Tutorial__Group_2__0__Impl rule__Tutorial__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Tutorial__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tutorial__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_2__0"


    // $ANTLR start "rule__Tutorial__Group_2__0__Impl"
    // InternalProgram.g:5036:1: rule__Tutorial__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__Tutorial__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5040:1: ( ( 'abstract' ) )
            // InternalProgram.g:5041:1: ( 'abstract' )
            {
            // InternalProgram.g:5041:1: ( 'abstract' )
            // InternalProgram.g:5042:2: 'abstract'
            {
             before(grammarAccess.getTutorialAccess().getAbstractKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTutorialAccess().getAbstractKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_2__0__Impl"


    // $ANTLR start "rule__Tutorial__Group_2__1"
    // InternalProgram.g:5051:1: rule__Tutorial__Group_2__1 : rule__Tutorial__Group_2__1__Impl ;
    public final void rule__Tutorial__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5055:1: ( rule__Tutorial__Group_2__1__Impl )
            // InternalProgram.g:5056:2: rule__Tutorial__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tutorial__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_2__1"


    // $ANTLR start "rule__Tutorial__Group_2__1__Impl"
    // InternalProgram.g:5062:1: rule__Tutorial__Group_2__1__Impl : ( ( rule__Tutorial__AbstractAssignment_2_1 ) ) ;
    public final void rule__Tutorial__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5066:1: ( ( ( rule__Tutorial__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:5067:1: ( ( rule__Tutorial__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:5067:1: ( ( rule__Tutorial__AbstractAssignment_2_1 ) )
            // InternalProgram.g:5068:2: ( rule__Tutorial__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getTutorialAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:5069:2: ( rule__Tutorial__AbstractAssignment_2_1 )
            // InternalProgram.g:5069:3: rule__Tutorial__AbstractAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Tutorial__AbstractAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTutorialAccess().getAbstractAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_2__1__Impl"


    // $ANTLR start "rule__Tutorial__Group_3__0"
    // InternalProgram.g:5078:1: rule__Tutorial__Group_3__0 : rule__Tutorial__Group_3__0__Impl rule__Tutorial__Group_3__1 ;
    public final void rule__Tutorial__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5082:1: ( rule__Tutorial__Group_3__0__Impl rule__Tutorial__Group_3__1 )
            // InternalProgram.g:5083:2: rule__Tutorial__Group_3__0__Impl rule__Tutorial__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Tutorial__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tutorial__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_3__0"


    // $ANTLR start "rule__Tutorial__Group_3__0__Impl"
    // InternalProgram.g:5090:1: rule__Tutorial__Group_3__0__Impl : ( 'organizers' ) ;
    public final void rule__Tutorial__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5094:1: ( ( 'organizers' ) )
            // InternalProgram.g:5095:1: ( 'organizers' )
            {
            // InternalProgram.g:5095:1: ( 'organizers' )
            // InternalProgram.g:5096:2: 'organizers'
            {
             before(grammarAccess.getTutorialAccess().getOrganizersKeyword_3_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTutorialAccess().getOrganizersKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_3__0__Impl"


    // $ANTLR start "rule__Tutorial__Group_3__1"
    // InternalProgram.g:5105:1: rule__Tutorial__Group_3__1 : rule__Tutorial__Group_3__1__Impl rule__Tutorial__Group_3__2 ;
    public final void rule__Tutorial__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5109:1: ( rule__Tutorial__Group_3__1__Impl rule__Tutorial__Group_3__2 )
            // InternalProgram.g:5110:2: rule__Tutorial__Group_3__1__Impl rule__Tutorial__Group_3__2
            {
            pushFollow(FOLLOW_8);
            rule__Tutorial__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tutorial__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_3__1"


    // $ANTLR start "rule__Tutorial__Group_3__1__Impl"
    // InternalProgram.g:5117:1: rule__Tutorial__Group_3__1__Impl : ( ( rule__Tutorial__OrganizersAssignment_3_1 ) ) ;
    public final void rule__Tutorial__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5121:1: ( ( ( rule__Tutorial__OrganizersAssignment_3_1 ) ) )
            // InternalProgram.g:5122:1: ( ( rule__Tutorial__OrganizersAssignment_3_1 ) )
            {
            // InternalProgram.g:5122:1: ( ( rule__Tutorial__OrganizersAssignment_3_1 ) )
            // InternalProgram.g:5123:2: ( rule__Tutorial__OrganizersAssignment_3_1 )
            {
             before(grammarAccess.getTutorialAccess().getOrganizersAssignment_3_1()); 
            // InternalProgram.g:5124:2: ( rule__Tutorial__OrganizersAssignment_3_1 )
            // InternalProgram.g:5124:3: rule__Tutorial__OrganizersAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Tutorial__OrganizersAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTutorialAccess().getOrganizersAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_3__1__Impl"


    // $ANTLR start "rule__Tutorial__Group_3__2"
    // InternalProgram.g:5132:1: rule__Tutorial__Group_3__2 : rule__Tutorial__Group_3__2__Impl ;
    public final void rule__Tutorial__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5136:1: ( rule__Tutorial__Group_3__2__Impl )
            // InternalProgram.g:5137:2: rule__Tutorial__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tutorial__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_3__2"


    // $ANTLR start "rule__Tutorial__Group_3__2__Impl"
    // InternalProgram.g:5143:1: rule__Tutorial__Group_3__2__Impl : ( ( rule__Tutorial__Group_3_2__0 )* ) ;
    public final void rule__Tutorial__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5147:1: ( ( ( rule__Tutorial__Group_3_2__0 )* ) )
            // InternalProgram.g:5148:1: ( ( rule__Tutorial__Group_3_2__0 )* )
            {
            // InternalProgram.g:5148:1: ( ( rule__Tutorial__Group_3_2__0 )* )
            // InternalProgram.g:5149:2: ( rule__Tutorial__Group_3_2__0 )*
            {
             before(grammarAccess.getTutorialAccess().getGroup_3_2()); 
            // InternalProgram.g:5150:2: ( rule__Tutorial__Group_3_2__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==21) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalProgram.g:5150:3: rule__Tutorial__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Tutorial__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getTutorialAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_3__2__Impl"


    // $ANTLR start "rule__Tutorial__Group_3_2__0"
    // InternalProgram.g:5159:1: rule__Tutorial__Group_3_2__0 : rule__Tutorial__Group_3_2__0__Impl rule__Tutorial__Group_3_2__1 ;
    public final void rule__Tutorial__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5163:1: ( rule__Tutorial__Group_3_2__0__Impl rule__Tutorial__Group_3_2__1 )
            // InternalProgram.g:5164:2: rule__Tutorial__Group_3_2__0__Impl rule__Tutorial__Group_3_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Tutorial__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tutorial__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_3_2__0"


    // $ANTLR start "rule__Tutorial__Group_3_2__0__Impl"
    // InternalProgram.g:5171:1: rule__Tutorial__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Tutorial__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5175:1: ( ( ',' ) )
            // InternalProgram.g:5176:1: ( ',' )
            {
            // InternalProgram.g:5176:1: ( ',' )
            // InternalProgram.g:5177:2: ','
            {
             before(grammarAccess.getTutorialAccess().getCommaKeyword_3_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTutorialAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_3_2__0__Impl"


    // $ANTLR start "rule__Tutorial__Group_3_2__1"
    // InternalProgram.g:5186:1: rule__Tutorial__Group_3_2__1 : rule__Tutorial__Group_3_2__1__Impl ;
    public final void rule__Tutorial__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5190:1: ( rule__Tutorial__Group_3_2__1__Impl )
            // InternalProgram.g:5191:2: rule__Tutorial__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tutorial__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_3_2__1"


    // $ANTLR start "rule__Tutorial__Group_3_2__1__Impl"
    // InternalProgram.g:5197:1: rule__Tutorial__Group_3_2__1__Impl : ( ( rule__Tutorial__OrganizersAssignment_3_2_1 ) ) ;
    public final void rule__Tutorial__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5201:1: ( ( ( rule__Tutorial__OrganizersAssignment_3_2_1 ) ) )
            // InternalProgram.g:5202:1: ( ( rule__Tutorial__OrganizersAssignment_3_2_1 ) )
            {
            // InternalProgram.g:5202:1: ( ( rule__Tutorial__OrganizersAssignment_3_2_1 ) )
            // InternalProgram.g:5203:2: ( rule__Tutorial__OrganizersAssignment_3_2_1 )
            {
             before(grammarAccess.getTutorialAccess().getOrganizersAssignment_3_2_1()); 
            // InternalProgram.g:5204:2: ( rule__Tutorial__OrganizersAssignment_3_2_1 )
            // InternalProgram.g:5204:3: rule__Tutorial__OrganizersAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Tutorial__OrganizersAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTutorialAccess().getOrganizersAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_3_2__1__Impl"


    // $ANTLR start "rule__DoctoralSymposium__Group__0"
    // InternalProgram.g:5213:1: rule__DoctoralSymposium__Group__0 : rule__DoctoralSymposium__Group__0__Impl rule__DoctoralSymposium__Group__1 ;
    public final void rule__DoctoralSymposium__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5217:1: ( rule__DoctoralSymposium__Group__0__Impl rule__DoctoralSymposium__Group__1 )
            // InternalProgram.g:5218:2: rule__DoctoralSymposium__Group__0__Impl rule__DoctoralSymposium__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DoctoralSymposium__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group__0"


    // $ANTLR start "rule__DoctoralSymposium__Group__0__Impl"
    // InternalProgram.g:5225:1: rule__DoctoralSymposium__Group__0__Impl : ( 'DoctoralSymposium' ) ;
    public final void rule__DoctoralSymposium__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5229:1: ( ( 'DoctoralSymposium' ) )
            // InternalProgram.g:5230:1: ( 'DoctoralSymposium' )
            {
            // InternalProgram.g:5230:1: ( 'DoctoralSymposium' )
            // InternalProgram.g:5231:2: 'DoctoralSymposium'
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getDoctoralSymposiumKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getDoctoralSymposiumAccess().getDoctoralSymposiumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group__0__Impl"


    // $ANTLR start "rule__DoctoralSymposium__Group__1"
    // InternalProgram.g:5240:1: rule__DoctoralSymposium__Group__1 : rule__DoctoralSymposium__Group__1__Impl rule__DoctoralSymposium__Group__2 ;
    public final void rule__DoctoralSymposium__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5244:1: ( rule__DoctoralSymposium__Group__1__Impl rule__DoctoralSymposium__Group__2 )
            // InternalProgram.g:5245:2: rule__DoctoralSymposium__Group__1__Impl rule__DoctoralSymposium__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__DoctoralSymposium__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group__1"


    // $ANTLR start "rule__DoctoralSymposium__Group__1__Impl"
    // InternalProgram.g:5252:1: rule__DoctoralSymposium__Group__1__Impl : ( ( rule__DoctoralSymposium__NameAssignment_1 ) ) ;
    public final void rule__DoctoralSymposium__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5256:1: ( ( ( rule__DoctoralSymposium__NameAssignment_1 ) ) )
            // InternalProgram.g:5257:1: ( ( rule__DoctoralSymposium__NameAssignment_1 ) )
            {
            // InternalProgram.g:5257:1: ( ( rule__DoctoralSymposium__NameAssignment_1 ) )
            // InternalProgram.g:5258:2: ( rule__DoctoralSymposium__NameAssignment_1 )
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getNameAssignment_1()); 
            // InternalProgram.g:5259:2: ( rule__DoctoralSymposium__NameAssignment_1 )
            // InternalProgram.g:5259:3: rule__DoctoralSymposium__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDoctoralSymposiumAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group__1__Impl"


    // $ANTLR start "rule__DoctoralSymposium__Group__2"
    // InternalProgram.g:5267:1: rule__DoctoralSymposium__Group__2 : rule__DoctoralSymposium__Group__2__Impl rule__DoctoralSymposium__Group__3 ;
    public final void rule__DoctoralSymposium__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5271:1: ( rule__DoctoralSymposium__Group__2__Impl rule__DoctoralSymposium__Group__3 )
            // InternalProgram.g:5272:2: rule__DoctoralSymposium__Group__2__Impl rule__DoctoralSymposium__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__DoctoralSymposium__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group__2"


    // $ANTLR start "rule__DoctoralSymposium__Group__2__Impl"
    // InternalProgram.g:5279:1: rule__DoctoralSymposium__Group__2__Impl : ( ( rule__DoctoralSymposium__Group_2__0 )? ) ;
    public final void rule__DoctoralSymposium__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5283:1: ( ( ( rule__DoctoralSymposium__Group_2__0 )? ) )
            // InternalProgram.g:5284:1: ( ( rule__DoctoralSymposium__Group_2__0 )? )
            {
            // InternalProgram.g:5284:1: ( ( rule__DoctoralSymposium__Group_2__0 )? )
            // InternalProgram.g:5285:2: ( rule__DoctoralSymposium__Group_2__0 )?
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getGroup_2()); 
            // InternalProgram.g:5286:2: ( rule__DoctoralSymposium__Group_2__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==38) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalProgram.g:5286:3: rule__DoctoralSymposium__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DoctoralSymposium__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDoctoralSymposiumAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group__2__Impl"


    // $ANTLR start "rule__DoctoralSymposium__Group__3"
    // InternalProgram.g:5294:1: rule__DoctoralSymposium__Group__3 : rule__DoctoralSymposium__Group__3__Impl ;
    public final void rule__DoctoralSymposium__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5298:1: ( rule__DoctoralSymposium__Group__3__Impl )
            // InternalProgram.g:5299:2: rule__DoctoralSymposium__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group__3"


    // $ANTLR start "rule__DoctoralSymposium__Group__3__Impl"
    // InternalProgram.g:5305:1: rule__DoctoralSymposium__Group__3__Impl : ( ( rule__DoctoralSymposium__Group_3__0 )? ) ;
    public final void rule__DoctoralSymposium__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5309:1: ( ( ( rule__DoctoralSymposium__Group_3__0 )? ) )
            // InternalProgram.g:5310:1: ( ( rule__DoctoralSymposium__Group_3__0 )? )
            {
            // InternalProgram.g:5310:1: ( ( rule__DoctoralSymposium__Group_3__0 )? )
            // InternalProgram.g:5311:2: ( rule__DoctoralSymposium__Group_3__0 )?
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getGroup_3()); 
            // InternalProgram.g:5312:2: ( rule__DoctoralSymposium__Group_3__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==50) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalProgram.g:5312:3: rule__DoctoralSymposium__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DoctoralSymposium__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDoctoralSymposiumAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group__3__Impl"


    // $ANTLR start "rule__DoctoralSymposium__Group_2__0"
    // InternalProgram.g:5321:1: rule__DoctoralSymposium__Group_2__0 : rule__DoctoralSymposium__Group_2__0__Impl rule__DoctoralSymposium__Group_2__1 ;
    public final void rule__DoctoralSymposium__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5325:1: ( rule__DoctoralSymposium__Group_2__0__Impl rule__DoctoralSymposium__Group_2__1 )
            // InternalProgram.g:5326:2: rule__DoctoralSymposium__Group_2__0__Impl rule__DoctoralSymposium__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__DoctoralSymposium__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_2__0"


    // $ANTLR start "rule__DoctoralSymposium__Group_2__0__Impl"
    // InternalProgram.g:5333:1: rule__DoctoralSymposium__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__DoctoralSymposium__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5337:1: ( ( 'abstract' ) )
            // InternalProgram.g:5338:1: ( 'abstract' )
            {
            // InternalProgram.g:5338:1: ( 'abstract' )
            // InternalProgram.g:5339:2: 'abstract'
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getAbstractKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDoctoralSymposiumAccess().getAbstractKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_2__0__Impl"


    // $ANTLR start "rule__DoctoralSymposium__Group_2__1"
    // InternalProgram.g:5348:1: rule__DoctoralSymposium__Group_2__1 : rule__DoctoralSymposium__Group_2__1__Impl ;
    public final void rule__DoctoralSymposium__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5352:1: ( rule__DoctoralSymposium__Group_2__1__Impl )
            // InternalProgram.g:5353:2: rule__DoctoralSymposium__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_2__1"


    // $ANTLR start "rule__DoctoralSymposium__Group_2__1__Impl"
    // InternalProgram.g:5359:1: rule__DoctoralSymposium__Group_2__1__Impl : ( ( rule__DoctoralSymposium__AbstractAssignment_2_1 ) ) ;
    public final void rule__DoctoralSymposium__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5363:1: ( ( ( rule__DoctoralSymposium__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:5364:1: ( ( rule__DoctoralSymposium__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:5364:1: ( ( rule__DoctoralSymposium__AbstractAssignment_2_1 ) )
            // InternalProgram.g:5365:2: ( rule__DoctoralSymposium__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:5366:2: ( rule__DoctoralSymposium__AbstractAssignment_2_1 )
            // InternalProgram.g:5366:3: rule__DoctoralSymposium__AbstractAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__AbstractAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDoctoralSymposiumAccess().getAbstractAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_2__1__Impl"


    // $ANTLR start "rule__DoctoralSymposium__Group_3__0"
    // InternalProgram.g:5375:1: rule__DoctoralSymposium__Group_3__0 : rule__DoctoralSymposium__Group_3__0__Impl rule__DoctoralSymposium__Group_3__1 ;
    public final void rule__DoctoralSymposium__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5379:1: ( rule__DoctoralSymposium__Group_3__0__Impl rule__DoctoralSymposium__Group_3__1 )
            // InternalProgram.g:5380:2: rule__DoctoralSymposium__Group_3__0__Impl rule__DoctoralSymposium__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__DoctoralSymposium__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_3__0"


    // $ANTLR start "rule__DoctoralSymposium__Group_3__0__Impl"
    // InternalProgram.g:5387:1: rule__DoctoralSymposium__Group_3__0__Impl : ( 'organizers' ) ;
    public final void rule__DoctoralSymposium__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5391:1: ( ( 'organizers' ) )
            // InternalProgram.g:5392:1: ( 'organizers' )
            {
            // InternalProgram.g:5392:1: ( 'organizers' )
            // InternalProgram.g:5393:2: 'organizers'
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getOrganizersKeyword_3_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getDoctoralSymposiumAccess().getOrganizersKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_3__0__Impl"


    // $ANTLR start "rule__DoctoralSymposium__Group_3__1"
    // InternalProgram.g:5402:1: rule__DoctoralSymposium__Group_3__1 : rule__DoctoralSymposium__Group_3__1__Impl rule__DoctoralSymposium__Group_3__2 ;
    public final void rule__DoctoralSymposium__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5406:1: ( rule__DoctoralSymposium__Group_3__1__Impl rule__DoctoralSymposium__Group_3__2 )
            // InternalProgram.g:5407:2: rule__DoctoralSymposium__Group_3__1__Impl rule__DoctoralSymposium__Group_3__2
            {
            pushFollow(FOLLOW_8);
            rule__DoctoralSymposium__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_3__1"


    // $ANTLR start "rule__DoctoralSymposium__Group_3__1__Impl"
    // InternalProgram.g:5414:1: rule__DoctoralSymposium__Group_3__1__Impl : ( ( rule__DoctoralSymposium__OrganizersAssignment_3_1 ) ) ;
    public final void rule__DoctoralSymposium__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5418:1: ( ( ( rule__DoctoralSymposium__OrganizersAssignment_3_1 ) ) )
            // InternalProgram.g:5419:1: ( ( rule__DoctoralSymposium__OrganizersAssignment_3_1 ) )
            {
            // InternalProgram.g:5419:1: ( ( rule__DoctoralSymposium__OrganizersAssignment_3_1 ) )
            // InternalProgram.g:5420:2: ( rule__DoctoralSymposium__OrganizersAssignment_3_1 )
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getOrganizersAssignment_3_1()); 
            // InternalProgram.g:5421:2: ( rule__DoctoralSymposium__OrganizersAssignment_3_1 )
            // InternalProgram.g:5421:3: rule__DoctoralSymposium__OrganizersAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__OrganizersAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDoctoralSymposiumAccess().getOrganizersAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_3__1__Impl"


    // $ANTLR start "rule__DoctoralSymposium__Group_3__2"
    // InternalProgram.g:5429:1: rule__DoctoralSymposium__Group_3__2 : rule__DoctoralSymposium__Group_3__2__Impl ;
    public final void rule__DoctoralSymposium__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5433:1: ( rule__DoctoralSymposium__Group_3__2__Impl )
            // InternalProgram.g:5434:2: rule__DoctoralSymposium__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_3__2"


    // $ANTLR start "rule__DoctoralSymposium__Group_3__2__Impl"
    // InternalProgram.g:5440:1: rule__DoctoralSymposium__Group_3__2__Impl : ( ( rule__DoctoralSymposium__Group_3_2__0 )* ) ;
    public final void rule__DoctoralSymposium__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5444:1: ( ( ( rule__DoctoralSymposium__Group_3_2__0 )* ) )
            // InternalProgram.g:5445:1: ( ( rule__DoctoralSymposium__Group_3_2__0 )* )
            {
            // InternalProgram.g:5445:1: ( ( rule__DoctoralSymposium__Group_3_2__0 )* )
            // InternalProgram.g:5446:2: ( rule__DoctoralSymposium__Group_3_2__0 )*
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getGroup_3_2()); 
            // InternalProgram.g:5447:2: ( rule__DoctoralSymposium__Group_3_2__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==21) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalProgram.g:5447:3: rule__DoctoralSymposium__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DoctoralSymposium__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getDoctoralSymposiumAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_3__2__Impl"


    // $ANTLR start "rule__DoctoralSymposium__Group_3_2__0"
    // InternalProgram.g:5456:1: rule__DoctoralSymposium__Group_3_2__0 : rule__DoctoralSymposium__Group_3_2__0__Impl rule__DoctoralSymposium__Group_3_2__1 ;
    public final void rule__DoctoralSymposium__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5460:1: ( rule__DoctoralSymposium__Group_3_2__0__Impl rule__DoctoralSymposium__Group_3_2__1 )
            // InternalProgram.g:5461:2: rule__DoctoralSymposium__Group_3_2__0__Impl rule__DoctoralSymposium__Group_3_2__1
            {
            pushFollow(FOLLOW_4);
            rule__DoctoralSymposium__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_3_2__0"


    // $ANTLR start "rule__DoctoralSymposium__Group_3_2__0__Impl"
    // InternalProgram.g:5468:1: rule__DoctoralSymposium__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__DoctoralSymposium__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5472:1: ( ( ',' ) )
            // InternalProgram.g:5473:1: ( ',' )
            {
            // InternalProgram.g:5473:1: ( ',' )
            // InternalProgram.g:5474:2: ','
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getCommaKeyword_3_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDoctoralSymposiumAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_3_2__0__Impl"


    // $ANTLR start "rule__DoctoralSymposium__Group_3_2__1"
    // InternalProgram.g:5483:1: rule__DoctoralSymposium__Group_3_2__1 : rule__DoctoralSymposium__Group_3_2__1__Impl ;
    public final void rule__DoctoralSymposium__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5487:1: ( rule__DoctoralSymposium__Group_3_2__1__Impl )
            // InternalProgram.g:5488:2: rule__DoctoralSymposium__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_3_2__1"


    // $ANTLR start "rule__DoctoralSymposium__Group_3_2__1__Impl"
    // InternalProgram.g:5494:1: rule__DoctoralSymposium__Group_3_2__1__Impl : ( ( rule__DoctoralSymposium__OrganizersAssignment_3_2_1 ) ) ;
    public final void rule__DoctoralSymposium__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5498:1: ( ( ( rule__DoctoralSymposium__OrganizersAssignment_3_2_1 ) ) )
            // InternalProgram.g:5499:1: ( ( rule__DoctoralSymposium__OrganizersAssignment_3_2_1 ) )
            {
            // InternalProgram.g:5499:1: ( ( rule__DoctoralSymposium__OrganizersAssignment_3_2_1 ) )
            // InternalProgram.g:5500:2: ( rule__DoctoralSymposium__OrganizersAssignment_3_2_1 )
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getOrganizersAssignment_3_2_1()); 
            // InternalProgram.g:5501:2: ( rule__DoctoralSymposium__OrganizersAssignment_3_2_1 )
            // InternalProgram.g:5501:3: rule__DoctoralSymposium__OrganizersAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__OrganizersAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDoctoralSymposiumAccess().getOrganizersAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_3_2__1__Impl"


    // $ANTLR start "rule__EducatorSymposium__Group__0"
    // InternalProgram.g:5510:1: rule__EducatorSymposium__Group__0 : rule__EducatorSymposium__Group__0__Impl rule__EducatorSymposium__Group__1 ;
    public final void rule__EducatorSymposium__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5514:1: ( rule__EducatorSymposium__Group__0__Impl rule__EducatorSymposium__Group__1 )
            // InternalProgram.g:5515:2: rule__EducatorSymposium__Group__0__Impl rule__EducatorSymposium__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__EducatorSymposium__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group__0"


    // $ANTLR start "rule__EducatorSymposium__Group__0__Impl"
    // InternalProgram.g:5522:1: rule__EducatorSymposium__Group__0__Impl : ( 'EducatorSymposium' ) ;
    public final void rule__EducatorSymposium__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5526:1: ( ( 'EducatorSymposium' ) )
            // InternalProgram.g:5527:1: ( 'EducatorSymposium' )
            {
            // InternalProgram.g:5527:1: ( 'EducatorSymposium' )
            // InternalProgram.g:5528:2: 'EducatorSymposium'
            {
             before(grammarAccess.getEducatorSymposiumAccess().getEducatorSymposiumKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getEducatorSymposiumAccess().getEducatorSymposiumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group__0__Impl"


    // $ANTLR start "rule__EducatorSymposium__Group__1"
    // InternalProgram.g:5537:1: rule__EducatorSymposium__Group__1 : rule__EducatorSymposium__Group__1__Impl rule__EducatorSymposium__Group__2 ;
    public final void rule__EducatorSymposium__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5541:1: ( rule__EducatorSymposium__Group__1__Impl rule__EducatorSymposium__Group__2 )
            // InternalProgram.g:5542:2: rule__EducatorSymposium__Group__1__Impl rule__EducatorSymposium__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__EducatorSymposium__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group__1"


    // $ANTLR start "rule__EducatorSymposium__Group__1__Impl"
    // InternalProgram.g:5549:1: rule__EducatorSymposium__Group__1__Impl : ( ( rule__EducatorSymposium__NameAssignment_1 ) ) ;
    public final void rule__EducatorSymposium__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5553:1: ( ( ( rule__EducatorSymposium__NameAssignment_1 ) ) )
            // InternalProgram.g:5554:1: ( ( rule__EducatorSymposium__NameAssignment_1 ) )
            {
            // InternalProgram.g:5554:1: ( ( rule__EducatorSymposium__NameAssignment_1 ) )
            // InternalProgram.g:5555:2: ( rule__EducatorSymposium__NameAssignment_1 )
            {
             before(grammarAccess.getEducatorSymposiumAccess().getNameAssignment_1()); 
            // InternalProgram.g:5556:2: ( rule__EducatorSymposium__NameAssignment_1 )
            // InternalProgram.g:5556:3: rule__EducatorSymposium__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEducatorSymposiumAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group__1__Impl"


    // $ANTLR start "rule__EducatorSymposium__Group__2"
    // InternalProgram.g:5564:1: rule__EducatorSymposium__Group__2 : rule__EducatorSymposium__Group__2__Impl rule__EducatorSymposium__Group__3 ;
    public final void rule__EducatorSymposium__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5568:1: ( rule__EducatorSymposium__Group__2__Impl rule__EducatorSymposium__Group__3 )
            // InternalProgram.g:5569:2: rule__EducatorSymposium__Group__2__Impl rule__EducatorSymposium__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__EducatorSymposium__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group__2"


    // $ANTLR start "rule__EducatorSymposium__Group__2__Impl"
    // InternalProgram.g:5576:1: rule__EducatorSymposium__Group__2__Impl : ( ( rule__EducatorSymposium__Group_2__0 )? ) ;
    public final void rule__EducatorSymposium__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5580:1: ( ( ( rule__EducatorSymposium__Group_2__0 )? ) )
            // InternalProgram.g:5581:1: ( ( rule__EducatorSymposium__Group_2__0 )? )
            {
            // InternalProgram.g:5581:1: ( ( rule__EducatorSymposium__Group_2__0 )? )
            // InternalProgram.g:5582:2: ( rule__EducatorSymposium__Group_2__0 )?
            {
             before(grammarAccess.getEducatorSymposiumAccess().getGroup_2()); 
            // InternalProgram.g:5583:2: ( rule__EducatorSymposium__Group_2__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==38) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalProgram.g:5583:3: rule__EducatorSymposium__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EducatorSymposium__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEducatorSymposiumAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group__2__Impl"


    // $ANTLR start "rule__EducatorSymposium__Group__3"
    // InternalProgram.g:5591:1: rule__EducatorSymposium__Group__3 : rule__EducatorSymposium__Group__3__Impl ;
    public final void rule__EducatorSymposium__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5595:1: ( rule__EducatorSymposium__Group__3__Impl )
            // InternalProgram.g:5596:2: rule__EducatorSymposium__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group__3"


    // $ANTLR start "rule__EducatorSymposium__Group__3__Impl"
    // InternalProgram.g:5602:1: rule__EducatorSymposium__Group__3__Impl : ( ( rule__EducatorSymposium__Group_3__0 )? ) ;
    public final void rule__EducatorSymposium__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5606:1: ( ( ( rule__EducatorSymposium__Group_3__0 )? ) )
            // InternalProgram.g:5607:1: ( ( rule__EducatorSymposium__Group_3__0 )? )
            {
            // InternalProgram.g:5607:1: ( ( rule__EducatorSymposium__Group_3__0 )? )
            // InternalProgram.g:5608:2: ( rule__EducatorSymposium__Group_3__0 )?
            {
             before(grammarAccess.getEducatorSymposiumAccess().getGroup_3()); 
            // InternalProgram.g:5609:2: ( rule__EducatorSymposium__Group_3__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==50) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalProgram.g:5609:3: rule__EducatorSymposium__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EducatorSymposium__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEducatorSymposiumAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group__3__Impl"


    // $ANTLR start "rule__EducatorSymposium__Group_2__0"
    // InternalProgram.g:5618:1: rule__EducatorSymposium__Group_2__0 : rule__EducatorSymposium__Group_2__0__Impl rule__EducatorSymposium__Group_2__1 ;
    public final void rule__EducatorSymposium__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5622:1: ( rule__EducatorSymposium__Group_2__0__Impl rule__EducatorSymposium__Group_2__1 )
            // InternalProgram.g:5623:2: rule__EducatorSymposium__Group_2__0__Impl rule__EducatorSymposium__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__EducatorSymposium__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_2__0"


    // $ANTLR start "rule__EducatorSymposium__Group_2__0__Impl"
    // InternalProgram.g:5630:1: rule__EducatorSymposium__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__EducatorSymposium__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5634:1: ( ( 'abstract' ) )
            // InternalProgram.g:5635:1: ( 'abstract' )
            {
            // InternalProgram.g:5635:1: ( 'abstract' )
            // InternalProgram.g:5636:2: 'abstract'
            {
             before(grammarAccess.getEducatorSymposiumAccess().getAbstractKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEducatorSymposiumAccess().getAbstractKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_2__0__Impl"


    // $ANTLR start "rule__EducatorSymposium__Group_2__1"
    // InternalProgram.g:5645:1: rule__EducatorSymposium__Group_2__1 : rule__EducatorSymposium__Group_2__1__Impl ;
    public final void rule__EducatorSymposium__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5649:1: ( rule__EducatorSymposium__Group_2__1__Impl )
            // InternalProgram.g:5650:2: rule__EducatorSymposium__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_2__1"


    // $ANTLR start "rule__EducatorSymposium__Group_2__1__Impl"
    // InternalProgram.g:5656:1: rule__EducatorSymposium__Group_2__1__Impl : ( ( rule__EducatorSymposium__AbstractAssignment_2_1 ) ) ;
    public final void rule__EducatorSymposium__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5660:1: ( ( ( rule__EducatorSymposium__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:5661:1: ( ( rule__EducatorSymposium__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:5661:1: ( ( rule__EducatorSymposium__AbstractAssignment_2_1 ) )
            // InternalProgram.g:5662:2: ( rule__EducatorSymposium__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getEducatorSymposiumAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:5663:2: ( rule__EducatorSymposium__AbstractAssignment_2_1 )
            // InternalProgram.g:5663:3: rule__EducatorSymposium__AbstractAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__AbstractAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEducatorSymposiumAccess().getAbstractAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_2__1__Impl"


    // $ANTLR start "rule__EducatorSymposium__Group_3__0"
    // InternalProgram.g:5672:1: rule__EducatorSymposium__Group_3__0 : rule__EducatorSymposium__Group_3__0__Impl rule__EducatorSymposium__Group_3__1 ;
    public final void rule__EducatorSymposium__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5676:1: ( rule__EducatorSymposium__Group_3__0__Impl rule__EducatorSymposium__Group_3__1 )
            // InternalProgram.g:5677:2: rule__EducatorSymposium__Group_3__0__Impl rule__EducatorSymposium__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__EducatorSymposium__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_3__0"


    // $ANTLR start "rule__EducatorSymposium__Group_3__0__Impl"
    // InternalProgram.g:5684:1: rule__EducatorSymposium__Group_3__0__Impl : ( 'organizers' ) ;
    public final void rule__EducatorSymposium__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5688:1: ( ( 'organizers' ) )
            // InternalProgram.g:5689:1: ( 'organizers' )
            {
            // InternalProgram.g:5689:1: ( 'organizers' )
            // InternalProgram.g:5690:2: 'organizers'
            {
             before(grammarAccess.getEducatorSymposiumAccess().getOrganizersKeyword_3_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getEducatorSymposiumAccess().getOrganizersKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_3__0__Impl"


    // $ANTLR start "rule__EducatorSymposium__Group_3__1"
    // InternalProgram.g:5699:1: rule__EducatorSymposium__Group_3__1 : rule__EducatorSymposium__Group_3__1__Impl rule__EducatorSymposium__Group_3__2 ;
    public final void rule__EducatorSymposium__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5703:1: ( rule__EducatorSymposium__Group_3__1__Impl rule__EducatorSymposium__Group_3__2 )
            // InternalProgram.g:5704:2: rule__EducatorSymposium__Group_3__1__Impl rule__EducatorSymposium__Group_3__2
            {
            pushFollow(FOLLOW_8);
            rule__EducatorSymposium__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_3__1"


    // $ANTLR start "rule__EducatorSymposium__Group_3__1__Impl"
    // InternalProgram.g:5711:1: rule__EducatorSymposium__Group_3__1__Impl : ( ( rule__EducatorSymposium__OrganizersAssignment_3_1 ) ) ;
    public final void rule__EducatorSymposium__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5715:1: ( ( ( rule__EducatorSymposium__OrganizersAssignment_3_1 ) ) )
            // InternalProgram.g:5716:1: ( ( rule__EducatorSymposium__OrganizersAssignment_3_1 ) )
            {
            // InternalProgram.g:5716:1: ( ( rule__EducatorSymposium__OrganizersAssignment_3_1 ) )
            // InternalProgram.g:5717:2: ( rule__EducatorSymposium__OrganizersAssignment_3_1 )
            {
             before(grammarAccess.getEducatorSymposiumAccess().getOrganizersAssignment_3_1()); 
            // InternalProgram.g:5718:2: ( rule__EducatorSymposium__OrganizersAssignment_3_1 )
            // InternalProgram.g:5718:3: rule__EducatorSymposium__OrganizersAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__OrganizersAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEducatorSymposiumAccess().getOrganizersAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_3__1__Impl"


    // $ANTLR start "rule__EducatorSymposium__Group_3__2"
    // InternalProgram.g:5726:1: rule__EducatorSymposium__Group_3__2 : rule__EducatorSymposium__Group_3__2__Impl ;
    public final void rule__EducatorSymposium__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5730:1: ( rule__EducatorSymposium__Group_3__2__Impl )
            // InternalProgram.g:5731:2: rule__EducatorSymposium__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_3__2"


    // $ANTLR start "rule__EducatorSymposium__Group_3__2__Impl"
    // InternalProgram.g:5737:1: rule__EducatorSymposium__Group_3__2__Impl : ( ( rule__EducatorSymposium__Group_3_2__0 )* ) ;
    public final void rule__EducatorSymposium__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5741:1: ( ( ( rule__EducatorSymposium__Group_3_2__0 )* ) )
            // InternalProgram.g:5742:1: ( ( rule__EducatorSymposium__Group_3_2__0 )* )
            {
            // InternalProgram.g:5742:1: ( ( rule__EducatorSymposium__Group_3_2__0 )* )
            // InternalProgram.g:5743:2: ( rule__EducatorSymposium__Group_3_2__0 )*
            {
             before(grammarAccess.getEducatorSymposiumAccess().getGroup_3_2()); 
            // InternalProgram.g:5744:2: ( rule__EducatorSymposium__Group_3_2__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==21) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalProgram.g:5744:3: rule__EducatorSymposium__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__EducatorSymposium__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getEducatorSymposiumAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_3__2__Impl"


    // $ANTLR start "rule__EducatorSymposium__Group_3_2__0"
    // InternalProgram.g:5753:1: rule__EducatorSymposium__Group_3_2__0 : rule__EducatorSymposium__Group_3_2__0__Impl rule__EducatorSymposium__Group_3_2__1 ;
    public final void rule__EducatorSymposium__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5757:1: ( rule__EducatorSymposium__Group_3_2__0__Impl rule__EducatorSymposium__Group_3_2__1 )
            // InternalProgram.g:5758:2: rule__EducatorSymposium__Group_3_2__0__Impl rule__EducatorSymposium__Group_3_2__1
            {
            pushFollow(FOLLOW_4);
            rule__EducatorSymposium__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_3_2__0"


    // $ANTLR start "rule__EducatorSymposium__Group_3_2__0__Impl"
    // InternalProgram.g:5765:1: rule__EducatorSymposium__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__EducatorSymposium__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5769:1: ( ( ',' ) )
            // InternalProgram.g:5770:1: ( ',' )
            {
            // InternalProgram.g:5770:1: ( ',' )
            // InternalProgram.g:5771:2: ','
            {
             before(grammarAccess.getEducatorSymposiumAccess().getCommaKeyword_3_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEducatorSymposiumAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_3_2__0__Impl"


    // $ANTLR start "rule__EducatorSymposium__Group_3_2__1"
    // InternalProgram.g:5780:1: rule__EducatorSymposium__Group_3_2__1 : rule__EducatorSymposium__Group_3_2__1__Impl ;
    public final void rule__EducatorSymposium__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5784:1: ( rule__EducatorSymposium__Group_3_2__1__Impl )
            // InternalProgram.g:5785:2: rule__EducatorSymposium__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_3_2__1"


    // $ANTLR start "rule__EducatorSymposium__Group_3_2__1__Impl"
    // InternalProgram.g:5791:1: rule__EducatorSymposium__Group_3_2__1__Impl : ( ( rule__EducatorSymposium__OrganizersAssignment_3_2_1 ) ) ;
    public final void rule__EducatorSymposium__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5795:1: ( ( ( rule__EducatorSymposium__OrganizersAssignment_3_2_1 ) ) )
            // InternalProgram.g:5796:1: ( ( rule__EducatorSymposium__OrganizersAssignment_3_2_1 ) )
            {
            // InternalProgram.g:5796:1: ( ( rule__EducatorSymposium__OrganizersAssignment_3_2_1 ) )
            // InternalProgram.g:5797:2: ( rule__EducatorSymposium__OrganizersAssignment_3_2_1 )
            {
             before(grammarAccess.getEducatorSymposiumAccess().getOrganizersAssignment_3_2_1()); 
            // InternalProgram.g:5798:2: ( rule__EducatorSymposium__OrganizersAssignment_3_2_1 )
            // InternalProgram.g:5798:3: rule__EducatorSymposium__OrganizersAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__OrganizersAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEducatorSymposiumAccess().getOrganizersAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_3_2__1__Impl"


    // $ANTLR start "rule__Reception__Group__0"
    // InternalProgram.g:5807:1: rule__Reception__Group__0 : rule__Reception__Group__0__Impl rule__Reception__Group__1 ;
    public final void rule__Reception__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5811:1: ( rule__Reception__Group__0__Impl rule__Reception__Group__1 )
            // InternalProgram.g:5812:2: rule__Reception__Group__0__Impl rule__Reception__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Reception__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reception__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reception__Group__0"


    // $ANTLR start "rule__Reception__Group__0__Impl"
    // InternalProgram.g:5819:1: rule__Reception__Group__0__Impl : ( 'Reception' ) ;
    public final void rule__Reception__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5823:1: ( ( 'Reception' ) )
            // InternalProgram.g:5824:1: ( 'Reception' )
            {
            // InternalProgram.g:5824:1: ( 'Reception' )
            // InternalProgram.g:5825:2: 'Reception'
            {
             before(grammarAccess.getReceptionAccess().getReceptionKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getReceptionAccess().getReceptionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reception__Group__0__Impl"


    // $ANTLR start "rule__Reception__Group__1"
    // InternalProgram.g:5834:1: rule__Reception__Group__1 : rule__Reception__Group__1__Impl rule__Reception__Group__2 ;
    public final void rule__Reception__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5838:1: ( rule__Reception__Group__1__Impl rule__Reception__Group__2 )
            // InternalProgram.g:5839:2: rule__Reception__Group__1__Impl rule__Reception__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Reception__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reception__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reception__Group__1"


    // $ANTLR start "rule__Reception__Group__1__Impl"
    // InternalProgram.g:5846:1: rule__Reception__Group__1__Impl : ( ( rule__Reception__NameAssignment_1 ) ) ;
    public final void rule__Reception__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5850:1: ( ( ( rule__Reception__NameAssignment_1 ) ) )
            // InternalProgram.g:5851:1: ( ( rule__Reception__NameAssignment_1 ) )
            {
            // InternalProgram.g:5851:1: ( ( rule__Reception__NameAssignment_1 ) )
            // InternalProgram.g:5852:2: ( rule__Reception__NameAssignment_1 )
            {
             before(grammarAccess.getReceptionAccess().getNameAssignment_1()); 
            // InternalProgram.g:5853:2: ( rule__Reception__NameAssignment_1 )
            // InternalProgram.g:5853:3: rule__Reception__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Reception__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReceptionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reception__Group__1__Impl"


    // $ANTLR start "rule__Reception__Group__2"
    // InternalProgram.g:5861:1: rule__Reception__Group__2 : rule__Reception__Group__2__Impl ;
    public final void rule__Reception__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5865:1: ( rule__Reception__Group__2__Impl )
            // InternalProgram.g:5866:2: rule__Reception__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reception__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reception__Group__2"


    // $ANTLR start "rule__Reception__Group__2__Impl"
    // InternalProgram.g:5872:1: rule__Reception__Group__2__Impl : ( ( rule__Reception__Group_2__0 )? ) ;
    public final void rule__Reception__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5876:1: ( ( ( rule__Reception__Group_2__0 )? ) )
            // InternalProgram.g:5877:1: ( ( rule__Reception__Group_2__0 )? )
            {
            // InternalProgram.g:5877:1: ( ( rule__Reception__Group_2__0 )? )
            // InternalProgram.g:5878:2: ( rule__Reception__Group_2__0 )?
            {
             before(grammarAccess.getReceptionAccess().getGroup_2()); 
            // InternalProgram.g:5879:2: ( rule__Reception__Group_2__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==38) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalProgram.g:5879:3: rule__Reception__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reception__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReceptionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reception__Group__2__Impl"


    // $ANTLR start "rule__Reception__Group_2__0"
    // InternalProgram.g:5888:1: rule__Reception__Group_2__0 : rule__Reception__Group_2__0__Impl rule__Reception__Group_2__1 ;
    public final void rule__Reception__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5892:1: ( rule__Reception__Group_2__0__Impl rule__Reception__Group_2__1 )
            // InternalProgram.g:5893:2: rule__Reception__Group_2__0__Impl rule__Reception__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Reception__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reception__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reception__Group_2__0"


    // $ANTLR start "rule__Reception__Group_2__0__Impl"
    // InternalProgram.g:5900:1: rule__Reception__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__Reception__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5904:1: ( ( 'abstract' ) )
            // InternalProgram.g:5905:1: ( 'abstract' )
            {
            // InternalProgram.g:5905:1: ( 'abstract' )
            // InternalProgram.g:5906:2: 'abstract'
            {
             before(grammarAccess.getReceptionAccess().getAbstractKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getReceptionAccess().getAbstractKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reception__Group_2__0__Impl"


    // $ANTLR start "rule__Reception__Group_2__1"
    // InternalProgram.g:5915:1: rule__Reception__Group_2__1 : rule__Reception__Group_2__1__Impl ;
    public final void rule__Reception__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5919:1: ( rule__Reception__Group_2__1__Impl )
            // InternalProgram.g:5920:2: rule__Reception__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reception__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reception__Group_2__1"


    // $ANTLR start "rule__Reception__Group_2__1__Impl"
    // InternalProgram.g:5926:1: rule__Reception__Group_2__1__Impl : ( ( rule__Reception__AbstractAssignment_2_1 ) ) ;
    public final void rule__Reception__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5930:1: ( ( ( rule__Reception__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:5931:1: ( ( rule__Reception__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:5931:1: ( ( rule__Reception__AbstractAssignment_2_1 ) )
            // InternalProgram.g:5932:2: ( rule__Reception__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getReceptionAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:5933:2: ( rule__Reception__AbstractAssignment_2_1 )
            // InternalProgram.g:5933:3: rule__Reception__AbstractAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Reception__AbstractAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getReceptionAccess().getAbstractAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reception__Group_2__1__Impl"


    // $ANTLR start "rule__Clinic__Group__0"
    // InternalProgram.g:5942:1: rule__Clinic__Group__0 : rule__Clinic__Group__0__Impl rule__Clinic__Group__1 ;
    public final void rule__Clinic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5946:1: ( rule__Clinic__Group__0__Impl rule__Clinic__Group__1 )
            // InternalProgram.g:5947:2: rule__Clinic__Group__0__Impl rule__Clinic__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Clinic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clinic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clinic__Group__0"


    // $ANTLR start "rule__Clinic__Group__0__Impl"
    // InternalProgram.g:5954:1: rule__Clinic__Group__0__Impl : ( 'Clinic' ) ;
    public final void rule__Clinic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5958:1: ( ( 'Clinic' ) )
            // InternalProgram.g:5959:1: ( 'Clinic' )
            {
            // InternalProgram.g:5959:1: ( 'Clinic' )
            // InternalProgram.g:5960:2: 'Clinic'
            {
             before(grammarAccess.getClinicAccess().getClinicKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getClinicAccess().getClinicKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clinic__Group__0__Impl"


    // $ANTLR start "rule__Clinic__Group__1"
    // InternalProgram.g:5969:1: rule__Clinic__Group__1 : rule__Clinic__Group__1__Impl rule__Clinic__Group__2 ;
    public final void rule__Clinic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5973:1: ( rule__Clinic__Group__1__Impl rule__Clinic__Group__2 )
            // InternalProgram.g:5974:2: rule__Clinic__Group__1__Impl rule__Clinic__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Clinic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clinic__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clinic__Group__1"


    // $ANTLR start "rule__Clinic__Group__1__Impl"
    // InternalProgram.g:5981:1: rule__Clinic__Group__1__Impl : ( ( rule__Clinic__NameAssignment_1 ) ) ;
    public final void rule__Clinic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5985:1: ( ( ( rule__Clinic__NameAssignment_1 ) ) )
            // InternalProgram.g:5986:1: ( ( rule__Clinic__NameAssignment_1 ) )
            {
            // InternalProgram.g:5986:1: ( ( rule__Clinic__NameAssignment_1 ) )
            // InternalProgram.g:5987:2: ( rule__Clinic__NameAssignment_1 )
            {
             before(grammarAccess.getClinicAccess().getNameAssignment_1()); 
            // InternalProgram.g:5988:2: ( rule__Clinic__NameAssignment_1 )
            // InternalProgram.g:5988:3: rule__Clinic__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Clinic__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClinicAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clinic__Group__1__Impl"


    // $ANTLR start "rule__Clinic__Group__2"
    // InternalProgram.g:5996:1: rule__Clinic__Group__2 : rule__Clinic__Group__2__Impl ;
    public final void rule__Clinic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6000:1: ( rule__Clinic__Group__2__Impl )
            // InternalProgram.g:6001:2: rule__Clinic__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clinic__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clinic__Group__2"


    // $ANTLR start "rule__Clinic__Group__2__Impl"
    // InternalProgram.g:6007:1: rule__Clinic__Group__2__Impl : ( ( rule__Clinic__Group_2__0 )? ) ;
    public final void rule__Clinic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6011:1: ( ( ( rule__Clinic__Group_2__0 )? ) )
            // InternalProgram.g:6012:1: ( ( rule__Clinic__Group_2__0 )? )
            {
            // InternalProgram.g:6012:1: ( ( rule__Clinic__Group_2__0 )? )
            // InternalProgram.g:6013:2: ( rule__Clinic__Group_2__0 )?
            {
             before(grammarAccess.getClinicAccess().getGroup_2()); 
            // InternalProgram.g:6014:2: ( rule__Clinic__Group_2__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==38) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalProgram.g:6014:3: rule__Clinic__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Clinic__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClinicAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clinic__Group__2__Impl"


    // $ANTLR start "rule__Clinic__Group_2__0"
    // InternalProgram.g:6023:1: rule__Clinic__Group_2__0 : rule__Clinic__Group_2__0__Impl rule__Clinic__Group_2__1 ;
    public final void rule__Clinic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6027:1: ( rule__Clinic__Group_2__0__Impl rule__Clinic__Group_2__1 )
            // InternalProgram.g:6028:2: rule__Clinic__Group_2__0__Impl rule__Clinic__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Clinic__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clinic__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clinic__Group_2__0"


    // $ANTLR start "rule__Clinic__Group_2__0__Impl"
    // InternalProgram.g:6035:1: rule__Clinic__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__Clinic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6039:1: ( ( 'abstract' ) )
            // InternalProgram.g:6040:1: ( 'abstract' )
            {
            // InternalProgram.g:6040:1: ( 'abstract' )
            // InternalProgram.g:6041:2: 'abstract'
            {
             before(grammarAccess.getClinicAccess().getAbstractKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getClinicAccess().getAbstractKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clinic__Group_2__0__Impl"


    // $ANTLR start "rule__Clinic__Group_2__1"
    // InternalProgram.g:6050:1: rule__Clinic__Group_2__1 : rule__Clinic__Group_2__1__Impl ;
    public final void rule__Clinic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6054:1: ( rule__Clinic__Group_2__1__Impl )
            // InternalProgram.g:6055:2: rule__Clinic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clinic__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clinic__Group_2__1"


    // $ANTLR start "rule__Clinic__Group_2__1__Impl"
    // InternalProgram.g:6061:1: rule__Clinic__Group_2__1__Impl : ( ( rule__Clinic__AbstractAssignment_2_1 ) ) ;
    public final void rule__Clinic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6065:1: ( ( ( rule__Clinic__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:6066:1: ( ( rule__Clinic__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:6066:1: ( ( rule__Clinic__AbstractAssignment_2_1 ) )
            // InternalProgram.g:6067:2: ( rule__Clinic__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getClinicAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:6068:2: ( rule__Clinic__AbstractAssignment_2_1 )
            // InternalProgram.g:6068:3: rule__Clinic__AbstractAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Clinic__AbstractAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClinicAccess().getAbstractAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clinic__Group_2__1__Impl"


    // $ANTLR start "rule__Lunch__Group__0"
    // InternalProgram.g:6077:1: rule__Lunch__Group__0 : rule__Lunch__Group__0__Impl rule__Lunch__Group__1 ;
    public final void rule__Lunch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6081:1: ( rule__Lunch__Group__0__Impl rule__Lunch__Group__1 )
            // InternalProgram.g:6082:2: rule__Lunch__Group__0__Impl rule__Lunch__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Lunch__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lunch__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__Group__0"


    // $ANTLR start "rule__Lunch__Group__0__Impl"
    // InternalProgram.g:6089:1: rule__Lunch__Group__0__Impl : ( 'Lunch' ) ;
    public final void rule__Lunch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6093:1: ( ( 'Lunch' ) )
            // InternalProgram.g:6094:1: ( 'Lunch' )
            {
            // InternalProgram.g:6094:1: ( 'Lunch' )
            // InternalProgram.g:6095:2: 'Lunch'
            {
             before(grammarAccess.getLunchAccess().getLunchKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getLunchAccess().getLunchKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__Group__0__Impl"


    // $ANTLR start "rule__Lunch__Group__1"
    // InternalProgram.g:6104:1: rule__Lunch__Group__1 : rule__Lunch__Group__1__Impl rule__Lunch__Group__2 ;
    public final void rule__Lunch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6108:1: ( rule__Lunch__Group__1__Impl rule__Lunch__Group__2 )
            // InternalProgram.g:6109:2: rule__Lunch__Group__1__Impl rule__Lunch__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Lunch__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lunch__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__Group__1"


    // $ANTLR start "rule__Lunch__Group__1__Impl"
    // InternalProgram.g:6116:1: rule__Lunch__Group__1__Impl : ( ( rule__Lunch__NameAssignment_1 ) ) ;
    public final void rule__Lunch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6120:1: ( ( ( rule__Lunch__NameAssignment_1 ) ) )
            // InternalProgram.g:6121:1: ( ( rule__Lunch__NameAssignment_1 ) )
            {
            // InternalProgram.g:6121:1: ( ( rule__Lunch__NameAssignment_1 ) )
            // InternalProgram.g:6122:2: ( rule__Lunch__NameAssignment_1 )
            {
             before(grammarAccess.getLunchAccess().getNameAssignment_1()); 
            // InternalProgram.g:6123:2: ( rule__Lunch__NameAssignment_1 )
            // InternalProgram.g:6123:3: rule__Lunch__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Lunch__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLunchAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__Group__1__Impl"


    // $ANTLR start "rule__Lunch__Group__2"
    // InternalProgram.g:6131:1: rule__Lunch__Group__2 : rule__Lunch__Group__2__Impl ;
    public final void rule__Lunch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6135:1: ( rule__Lunch__Group__2__Impl )
            // InternalProgram.g:6136:2: rule__Lunch__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lunch__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__Group__2"


    // $ANTLR start "rule__Lunch__Group__2__Impl"
    // InternalProgram.g:6142:1: rule__Lunch__Group__2__Impl : ( ( rule__Lunch__Group_2__0 )? ) ;
    public final void rule__Lunch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6146:1: ( ( ( rule__Lunch__Group_2__0 )? ) )
            // InternalProgram.g:6147:1: ( ( rule__Lunch__Group_2__0 )? )
            {
            // InternalProgram.g:6147:1: ( ( rule__Lunch__Group_2__0 )? )
            // InternalProgram.g:6148:2: ( rule__Lunch__Group_2__0 )?
            {
             before(grammarAccess.getLunchAccess().getGroup_2()); 
            // InternalProgram.g:6149:2: ( rule__Lunch__Group_2__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==38) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalProgram.g:6149:3: rule__Lunch__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lunch__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLunchAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__Group__2__Impl"


    // $ANTLR start "rule__Lunch__Group_2__0"
    // InternalProgram.g:6158:1: rule__Lunch__Group_2__0 : rule__Lunch__Group_2__0__Impl rule__Lunch__Group_2__1 ;
    public final void rule__Lunch__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6162:1: ( rule__Lunch__Group_2__0__Impl rule__Lunch__Group_2__1 )
            // InternalProgram.g:6163:2: rule__Lunch__Group_2__0__Impl rule__Lunch__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Lunch__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lunch__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__Group_2__0"


    // $ANTLR start "rule__Lunch__Group_2__0__Impl"
    // InternalProgram.g:6170:1: rule__Lunch__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__Lunch__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6174:1: ( ( 'abstract' ) )
            // InternalProgram.g:6175:1: ( 'abstract' )
            {
            // InternalProgram.g:6175:1: ( 'abstract' )
            // InternalProgram.g:6176:2: 'abstract'
            {
             before(grammarAccess.getLunchAccess().getAbstractKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLunchAccess().getAbstractKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__Group_2__0__Impl"


    // $ANTLR start "rule__Lunch__Group_2__1"
    // InternalProgram.g:6185:1: rule__Lunch__Group_2__1 : rule__Lunch__Group_2__1__Impl ;
    public final void rule__Lunch__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6189:1: ( rule__Lunch__Group_2__1__Impl )
            // InternalProgram.g:6190:2: rule__Lunch__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lunch__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__Group_2__1"


    // $ANTLR start "rule__Lunch__Group_2__1__Impl"
    // InternalProgram.g:6196:1: rule__Lunch__Group_2__1__Impl : ( ( rule__Lunch__AbstractAssignment_2_1 ) ) ;
    public final void rule__Lunch__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6200:1: ( ( ( rule__Lunch__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:6201:1: ( ( rule__Lunch__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:6201:1: ( ( rule__Lunch__AbstractAssignment_2_1 ) )
            // InternalProgram.g:6202:2: ( rule__Lunch__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getLunchAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:6203:2: ( rule__Lunch__AbstractAssignment_2_1 )
            // InternalProgram.g:6203:3: rule__Lunch__AbstractAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Lunch__AbstractAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLunchAccess().getAbstractAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__Group_2__1__Impl"


    // $ANTLR start "rule__CoffeeBreak__Group__0"
    // InternalProgram.g:6212:1: rule__CoffeeBreak__Group__0 : rule__CoffeeBreak__Group__0__Impl rule__CoffeeBreak__Group__1 ;
    public final void rule__CoffeeBreak__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6216:1: ( rule__CoffeeBreak__Group__0__Impl rule__CoffeeBreak__Group__1 )
            // InternalProgram.g:6217:2: rule__CoffeeBreak__Group__0__Impl rule__CoffeeBreak__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CoffeeBreak__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoffeeBreak__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoffeeBreak__Group__0"


    // $ANTLR start "rule__CoffeeBreak__Group__0__Impl"
    // InternalProgram.g:6224:1: rule__CoffeeBreak__Group__0__Impl : ( 'CoffeeBreak' ) ;
    public final void rule__CoffeeBreak__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6228:1: ( ( 'CoffeeBreak' ) )
            // InternalProgram.g:6229:1: ( 'CoffeeBreak' )
            {
            // InternalProgram.g:6229:1: ( 'CoffeeBreak' )
            // InternalProgram.g:6230:2: 'CoffeeBreak'
            {
             before(grammarAccess.getCoffeeBreakAccess().getCoffeeBreakKeyword_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getCoffeeBreakAccess().getCoffeeBreakKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoffeeBreak__Group__0__Impl"


    // $ANTLR start "rule__CoffeeBreak__Group__1"
    // InternalProgram.g:6239:1: rule__CoffeeBreak__Group__1 : rule__CoffeeBreak__Group__1__Impl rule__CoffeeBreak__Group__2 ;
    public final void rule__CoffeeBreak__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6243:1: ( rule__CoffeeBreak__Group__1__Impl rule__CoffeeBreak__Group__2 )
            // InternalProgram.g:6244:2: rule__CoffeeBreak__Group__1__Impl rule__CoffeeBreak__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__CoffeeBreak__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoffeeBreak__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoffeeBreak__Group__1"


    // $ANTLR start "rule__CoffeeBreak__Group__1__Impl"
    // InternalProgram.g:6251:1: rule__CoffeeBreak__Group__1__Impl : ( ( rule__CoffeeBreak__NameAssignment_1 ) ) ;
    public final void rule__CoffeeBreak__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6255:1: ( ( ( rule__CoffeeBreak__NameAssignment_1 ) ) )
            // InternalProgram.g:6256:1: ( ( rule__CoffeeBreak__NameAssignment_1 ) )
            {
            // InternalProgram.g:6256:1: ( ( rule__CoffeeBreak__NameAssignment_1 ) )
            // InternalProgram.g:6257:2: ( rule__CoffeeBreak__NameAssignment_1 )
            {
             before(grammarAccess.getCoffeeBreakAccess().getNameAssignment_1()); 
            // InternalProgram.g:6258:2: ( rule__CoffeeBreak__NameAssignment_1 )
            // InternalProgram.g:6258:3: rule__CoffeeBreak__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CoffeeBreak__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCoffeeBreakAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoffeeBreak__Group__1__Impl"


    // $ANTLR start "rule__CoffeeBreak__Group__2"
    // InternalProgram.g:6266:1: rule__CoffeeBreak__Group__2 : rule__CoffeeBreak__Group__2__Impl ;
    public final void rule__CoffeeBreak__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6270:1: ( rule__CoffeeBreak__Group__2__Impl )
            // InternalProgram.g:6271:2: rule__CoffeeBreak__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoffeeBreak__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoffeeBreak__Group__2"


    // $ANTLR start "rule__CoffeeBreak__Group__2__Impl"
    // InternalProgram.g:6277:1: rule__CoffeeBreak__Group__2__Impl : ( ( rule__CoffeeBreak__Group_2__0 )? ) ;
    public final void rule__CoffeeBreak__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6281:1: ( ( ( rule__CoffeeBreak__Group_2__0 )? ) )
            // InternalProgram.g:6282:1: ( ( rule__CoffeeBreak__Group_2__0 )? )
            {
            // InternalProgram.g:6282:1: ( ( rule__CoffeeBreak__Group_2__0 )? )
            // InternalProgram.g:6283:2: ( rule__CoffeeBreak__Group_2__0 )?
            {
             before(grammarAccess.getCoffeeBreakAccess().getGroup_2()); 
            // InternalProgram.g:6284:2: ( rule__CoffeeBreak__Group_2__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==38) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalProgram.g:6284:3: rule__CoffeeBreak__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoffeeBreak__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCoffeeBreakAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoffeeBreak__Group__2__Impl"


    // $ANTLR start "rule__CoffeeBreak__Group_2__0"
    // InternalProgram.g:6293:1: rule__CoffeeBreak__Group_2__0 : rule__CoffeeBreak__Group_2__0__Impl rule__CoffeeBreak__Group_2__1 ;
    public final void rule__CoffeeBreak__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6297:1: ( rule__CoffeeBreak__Group_2__0__Impl rule__CoffeeBreak__Group_2__1 )
            // InternalProgram.g:6298:2: rule__CoffeeBreak__Group_2__0__Impl rule__CoffeeBreak__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__CoffeeBreak__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoffeeBreak__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoffeeBreak__Group_2__0"


    // $ANTLR start "rule__CoffeeBreak__Group_2__0__Impl"
    // InternalProgram.g:6305:1: rule__CoffeeBreak__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__CoffeeBreak__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6309:1: ( ( 'abstract' ) )
            // InternalProgram.g:6310:1: ( 'abstract' )
            {
            // InternalProgram.g:6310:1: ( 'abstract' )
            // InternalProgram.g:6311:2: 'abstract'
            {
             before(grammarAccess.getCoffeeBreakAccess().getAbstractKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCoffeeBreakAccess().getAbstractKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoffeeBreak__Group_2__0__Impl"


    // $ANTLR start "rule__CoffeeBreak__Group_2__1"
    // InternalProgram.g:6320:1: rule__CoffeeBreak__Group_2__1 : rule__CoffeeBreak__Group_2__1__Impl ;
    public final void rule__CoffeeBreak__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6324:1: ( rule__CoffeeBreak__Group_2__1__Impl )
            // InternalProgram.g:6325:2: rule__CoffeeBreak__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoffeeBreak__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoffeeBreak__Group_2__1"


    // $ANTLR start "rule__CoffeeBreak__Group_2__1__Impl"
    // InternalProgram.g:6331:1: rule__CoffeeBreak__Group_2__1__Impl : ( ( rule__CoffeeBreak__AbstractAssignment_2_1 ) ) ;
    public final void rule__CoffeeBreak__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6335:1: ( ( ( rule__CoffeeBreak__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:6336:1: ( ( rule__CoffeeBreak__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:6336:1: ( ( rule__CoffeeBreak__AbstractAssignment_2_1 ) )
            // InternalProgram.g:6337:2: ( rule__CoffeeBreak__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getCoffeeBreakAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:6338:2: ( rule__CoffeeBreak__AbstractAssignment_2_1 )
            // InternalProgram.g:6338:3: rule__CoffeeBreak__AbstractAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CoffeeBreak__AbstractAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCoffeeBreakAccess().getAbstractAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoffeeBreak__Group_2__1__Impl"


    // $ANTLR start "rule__Meeting__Group__0"
    // InternalProgram.g:6347:1: rule__Meeting__Group__0 : rule__Meeting__Group__0__Impl rule__Meeting__Group__1 ;
    public final void rule__Meeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6351:1: ( rule__Meeting__Group__0__Impl rule__Meeting__Group__1 )
            // InternalProgram.g:6352:2: rule__Meeting__Group__0__Impl rule__Meeting__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Meeting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meeting__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group__0"


    // $ANTLR start "rule__Meeting__Group__0__Impl"
    // InternalProgram.g:6359:1: rule__Meeting__Group__0__Impl : ( 'Meeting' ) ;
    public final void rule__Meeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6363:1: ( ( 'Meeting' ) )
            // InternalProgram.g:6364:1: ( 'Meeting' )
            {
            // InternalProgram.g:6364:1: ( 'Meeting' )
            // InternalProgram.g:6365:2: 'Meeting'
            {
             before(grammarAccess.getMeetingAccess().getMeetingKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getMeetingAccess().getMeetingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group__0__Impl"


    // $ANTLR start "rule__Meeting__Group__1"
    // InternalProgram.g:6374:1: rule__Meeting__Group__1 : rule__Meeting__Group__1__Impl rule__Meeting__Group__2 ;
    public final void rule__Meeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6378:1: ( rule__Meeting__Group__1__Impl rule__Meeting__Group__2 )
            // InternalProgram.g:6379:2: rule__Meeting__Group__1__Impl rule__Meeting__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Meeting__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meeting__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group__1"


    // $ANTLR start "rule__Meeting__Group__1__Impl"
    // InternalProgram.g:6386:1: rule__Meeting__Group__1__Impl : ( ( rule__Meeting__NameAssignment_1 ) ) ;
    public final void rule__Meeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6390:1: ( ( ( rule__Meeting__NameAssignment_1 ) ) )
            // InternalProgram.g:6391:1: ( ( rule__Meeting__NameAssignment_1 ) )
            {
            // InternalProgram.g:6391:1: ( ( rule__Meeting__NameAssignment_1 ) )
            // InternalProgram.g:6392:2: ( rule__Meeting__NameAssignment_1 )
            {
             before(grammarAccess.getMeetingAccess().getNameAssignment_1()); 
            // InternalProgram.g:6393:2: ( rule__Meeting__NameAssignment_1 )
            // InternalProgram.g:6393:3: rule__Meeting__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Meeting__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMeetingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group__1__Impl"


    // $ANTLR start "rule__Meeting__Group__2"
    // InternalProgram.g:6401:1: rule__Meeting__Group__2 : rule__Meeting__Group__2__Impl ;
    public final void rule__Meeting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6405:1: ( rule__Meeting__Group__2__Impl )
            // InternalProgram.g:6406:2: rule__Meeting__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Meeting__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group__2"


    // $ANTLR start "rule__Meeting__Group__2__Impl"
    // InternalProgram.g:6412:1: rule__Meeting__Group__2__Impl : ( ( rule__Meeting__Group_2__0 )? ) ;
    public final void rule__Meeting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6416:1: ( ( ( rule__Meeting__Group_2__0 )? ) )
            // InternalProgram.g:6417:1: ( ( rule__Meeting__Group_2__0 )? )
            {
            // InternalProgram.g:6417:1: ( ( rule__Meeting__Group_2__0 )? )
            // InternalProgram.g:6418:2: ( rule__Meeting__Group_2__0 )?
            {
             before(grammarAccess.getMeetingAccess().getGroup_2()); 
            // InternalProgram.g:6419:2: ( rule__Meeting__Group_2__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==38) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalProgram.g:6419:3: rule__Meeting__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Meeting__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeetingAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group__2__Impl"


    // $ANTLR start "rule__Meeting__Group_2__0"
    // InternalProgram.g:6428:1: rule__Meeting__Group_2__0 : rule__Meeting__Group_2__0__Impl rule__Meeting__Group_2__1 ;
    public final void rule__Meeting__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6432:1: ( rule__Meeting__Group_2__0__Impl rule__Meeting__Group_2__1 )
            // InternalProgram.g:6433:2: rule__Meeting__Group_2__0__Impl rule__Meeting__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Meeting__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meeting__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group_2__0"


    // $ANTLR start "rule__Meeting__Group_2__0__Impl"
    // InternalProgram.g:6440:1: rule__Meeting__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__Meeting__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6444:1: ( ( 'abstract' ) )
            // InternalProgram.g:6445:1: ( 'abstract' )
            {
            // InternalProgram.g:6445:1: ( 'abstract' )
            // InternalProgram.g:6446:2: 'abstract'
            {
             before(grammarAccess.getMeetingAccess().getAbstractKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMeetingAccess().getAbstractKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group_2__0__Impl"


    // $ANTLR start "rule__Meeting__Group_2__1"
    // InternalProgram.g:6455:1: rule__Meeting__Group_2__1 : rule__Meeting__Group_2__1__Impl ;
    public final void rule__Meeting__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6459:1: ( rule__Meeting__Group_2__1__Impl )
            // InternalProgram.g:6460:2: rule__Meeting__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Meeting__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group_2__1"


    // $ANTLR start "rule__Meeting__Group_2__1__Impl"
    // InternalProgram.g:6466:1: rule__Meeting__Group_2__1__Impl : ( ( rule__Meeting__AbstractAssignment_2_1 ) ) ;
    public final void rule__Meeting__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6470:1: ( ( ( rule__Meeting__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:6471:1: ( ( rule__Meeting__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:6471:1: ( ( rule__Meeting__AbstractAssignment_2_1 ) )
            // InternalProgram.g:6472:2: ( rule__Meeting__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getMeetingAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:6473:2: ( rule__Meeting__AbstractAssignment_2_1 )
            // InternalProgram.g:6473:3: rule__Meeting__AbstractAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Meeting__AbstractAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMeetingAccess().getAbstractAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group_2__1__Impl"


    // $ANTLR start "rule__Opening__Group__0"
    // InternalProgram.g:6482:1: rule__Opening__Group__0 : rule__Opening__Group__0__Impl rule__Opening__Group__1 ;
    public final void rule__Opening__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6486:1: ( rule__Opening__Group__0__Impl rule__Opening__Group__1 )
            // InternalProgram.g:6487:2: rule__Opening__Group__0__Impl rule__Opening__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Opening__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Opening__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Opening__Group__0"


    // $ANTLR start "rule__Opening__Group__0__Impl"
    // InternalProgram.g:6494:1: rule__Opening__Group__0__Impl : ( 'Opening' ) ;
    public final void rule__Opening__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6498:1: ( ( 'Opening' ) )
            // InternalProgram.g:6499:1: ( 'Opening' )
            {
            // InternalProgram.g:6499:1: ( 'Opening' )
            // InternalProgram.g:6500:2: 'Opening'
            {
             before(grammarAccess.getOpeningAccess().getOpeningKeyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getOpeningAccess().getOpeningKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Opening__Group__0__Impl"


    // $ANTLR start "rule__Opening__Group__1"
    // InternalProgram.g:6509:1: rule__Opening__Group__1 : rule__Opening__Group__1__Impl rule__Opening__Group__2 ;
    public final void rule__Opening__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6513:1: ( rule__Opening__Group__1__Impl rule__Opening__Group__2 )
            // InternalProgram.g:6514:2: rule__Opening__Group__1__Impl rule__Opening__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Opening__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Opening__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Opening__Group__1"


    // $ANTLR start "rule__Opening__Group__1__Impl"
    // InternalProgram.g:6521:1: rule__Opening__Group__1__Impl : ( ( rule__Opening__NameAssignment_1 ) ) ;
    public final void rule__Opening__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6525:1: ( ( ( rule__Opening__NameAssignment_1 ) ) )
            // InternalProgram.g:6526:1: ( ( rule__Opening__NameAssignment_1 ) )
            {
            // InternalProgram.g:6526:1: ( ( rule__Opening__NameAssignment_1 ) )
            // InternalProgram.g:6527:2: ( rule__Opening__NameAssignment_1 )
            {
             before(grammarAccess.getOpeningAccess().getNameAssignment_1()); 
            // InternalProgram.g:6528:2: ( rule__Opening__NameAssignment_1 )
            // InternalProgram.g:6528:3: rule__Opening__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Opening__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOpeningAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Opening__Group__1__Impl"


    // $ANTLR start "rule__Opening__Group__2"
    // InternalProgram.g:6536:1: rule__Opening__Group__2 : rule__Opening__Group__2__Impl ;
    public final void rule__Opening__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6540:1: ( rule__Opening__Group__2__Impl )
            // InternalProgram.g:6541:2: rule__Opening__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Opening__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Opening__Group__2"


    // $ANTLR start "rule__Opening__Group__2__Impl"
    // InternalProgram.g:6547:1: rule__Opening__Group__2__Impl : ( ( rule__Opening__Group_2__0 )? ) ;
    public final void rule__Opening__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6551:1: ( ( ( rule__Opening__Group_2__0 )? ) )
            // InternalProgram.g:6552:1: ( ( rule__Opening__Group_2__0 )? )
            {
            // InternalProgram.g:6552:1: ( ( rule__Opening__Group_2__0 )? )
            // InternalProgram.g:6553:2: ( rule__Opening__Group_2__0 )?
            {
             before(grammarAccess.getOpeningAccess().getGroup_2()); 
            // InternalProgram.g:6554:2: ( rule__Opening__Group_2__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==38) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalProgram.g:6554:3: rule__Opening__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Opening__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpeningAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Opening__Group__2__Impl"


    // $ANTLR start "rule__Opening__Group_2__0"
    // InternalProgram.g:6563:1: rule__Opening__Group_2__0 : rule__Opening__Group_2__0__Impl rule__Opening__Group_2__1 ;
    public final void rule__Opening__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6567:1: ( rule__Opening__Group_2__0__Impl rule__Opening__Group_2__1 )
            // InternalProgram.g:6568:2: rule__Opening__Group_2__0__Impl rule__Opening__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Opening__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Opening__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Opening__Group_2__0"


    // $ANTLR start "rule__Opening__Group_2__0__Impl"
    // InternalProgram.g:6575:1: rule__Opening__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__Opening__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6579:1: ( ( 'abstract' ) )
            // InternalProgram.g:6580:1: ( 'abstract' )
            {
            // InternalProgram.g:6580:1: ( 'abstract' )
            // InternalProgram.g:6581:2: 'abstract'
            {
             before(grammarAccess.getOpeningAccess().getAbstractKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getOpeningAccess().getAbstractKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Opening__Group_2__0__Impl"


    // $ANTLR start "rule__Opening__Group_2__1"
    // InternalProgram.g:6590:1: rule__Opening__Group_2__1 : rule__Opening__Group_2__1__Impl ;
    public final void rule__Opening__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6594:1: ( rule__Opening__Group_2__1__Impl )
            // InternalProgram.g:6595:2: rule__Opening__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Opening__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Opening__Group_2__1"


    // $ANTLR start "rule__Opening__Group_2__1__Impl"
    // InternalProgram.g:6601:1: rule__Opening__Group_2__1__Impl : ( ( rule__Opening__AbstractAssignment_2_1 ) ) ;
    public final void rule__Opening__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6605:1: ( ( ( rule__Opening__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:6606:1: ( ( rule__Opening__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:6606:1: ( ( rule__Opening__AbstractAssignment_2_1 ) )
            // InternalProgram.g:6607:2: ( rule__Opening__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getOpeningAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:6608:2: ( rule__Opening__AbstractAssignment_2_1 )
            // InternalProgram.g:6608:3: rule__Opening__AbstractAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Opening__AbstractAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOpeningAccess().getAbstractAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Opening__Group_2__1__Impl"


    // $ANTLR start "rule__Paper__Group__0"
    // InternalProgram.g:6617:1: rule__Paper__Group__0 : rule__Paper__Group__0__Impl rule__Paper__Group__1 ;
    public final void rule__Paper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6621:1: ( rule__Paper__Group__0__Impl rule__Paper__Group__1 )
            // InternalProgram.g:6622:2: rule__Paper__Group__0__Impl rule__Paper__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Paper__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paper__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group__0"


    // $ANTLR start "rule__Paper__Group__0__Impl"
    // InternalProgram.g:6629:1: rule__Paper__Group__0__Impl : ( () ) ;
    public final void rule__Paper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6633:1: ( ( () ) )
            // InternalProgram.g:6634:1: ( () )
            {
            // InternalProgram.g:6634:1: ( () )
            // InternalProgram.g:6635:2: ()
            {
             before(grammarAccess.getPaperAccess().getPaperAction_0()); 
            // InternalProgram.g:6636:2: ()
            // InternalProgram.g:6636:3: 
            {
            }

             after(grammarAccess.getPaperAccess().getPaperAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group__0__Impl"


    // $ANTLR start "rule__Paper__Group__1"
    // InternalProgram.g:6644:1: rule__Paper__Group__1 : rule__Paper__Group__1__Impl rule__Paper__Group__2 ;
    public final void rule__Paper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6648:1: ( rule__Paper__Group__1__Impl rule__Paper__Group__2 )
            // InternalProgram.g:6649:2: rule__Paper__Group__1__Impl rule__Paper__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__Paper__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paper__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group__1"


    // $ANTLR start "rule__Paper__Group__1__Impl"
    // InternalProgram.g:6656:1: rule__Paper__Group__1__Impl : ( ( rule__Paper__NameAssignment_1 ) ) ;
    public final void rule__Paper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6660:1: ( ( ( rule__Paper__NameAssignment_1 ) ) )
            // InternalProgram.g:6661:1: ( ( rule__Paper__NameAssignment_1 ) )
            {
            // InternalProgram.g:6661:1: ( ( rule__Paper__NameAssignment_1 ) )
            // InternalProgram.g:6662:2: ( rule__Paper__NameAssignment_1 )
            {
             before(grammarAccess.getPaperAccess().getNameAssignment_1()); 
            // InternalProgram.g:6663:2: ( rule__Paper__NameAssignment_1 )
            // InternalProgram.g:6663:3: rule__Paper__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Paper__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPaperAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group__1__Impl"


    // $ANTLR start "rule__Paper__Group__2"
    // InternalProgram.g:6671:1: rule__Paper__Group__2 : rule__Paper__Group__2__Impl rule__Paper__Group__3 ;
    public final void rule__Paper__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6675:1: ( rule__Paper__Group__2__Impl rule__Paper__Group__3 )
            // InternalProgram.g:6676:2: rule__Paper__Group__2__Impl rule__Paper__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Paper__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paper__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group__2"


    // $ANTLR start "rule__Paper__Group__2__Impl"
    // InternalProgram.g:6683:1: rule__Paper__Group__2__Impl : ( 'authors' ) ;
    public final void rule__Paper__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6687:1: ( ( 'authors' ) )
            // InternalProgram.g:6688:1: ( 'authors' )
            {
            // InternalProgram.g:6688:1: ( 'authors' )
            // InternalProgram.g:6689:2: 'authors'
            {
             before(grammarAccess.getPaperAccess().getAuthorsKeyword_2()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getPaperAccess().getAuthorsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group__2__Impl"


    // $ANTLR start "rule__Paper__Group__3"
    // InternalProgram.g:6698:1: rule__Paper__Group__3 : rule__Paper__Group__3__Impl rule__Paper__Group__4 ;
    public final void rule__Paper__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6702:1: ( rule__Paper__Group__3__Impl rule__Paper__Group__4 )
            // InternalProgram.g:6703:2: rule__Paper__Group__3__Impl rule__Paper__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__Paper__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paper__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group__3"


    // $ANTLR start "rule__Paper__Group__3__Impl"
    // InternalProgram.g:6710:1: rule__Paper__Group__3__Impl : ( ( rule__Paper__AuthorsAssignment_3 ) ) ;
    public final void rule__Paper__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6714:1: ( ( ( rule__Paper__AuthorsAssignment_3 ) ) )
            // InternalProgram.g:6715:1: ( ( rule__Paper__AuthorsAssignment_3 ) )
            {
            // InternalProgram.g:6715:1: ( ( rule__Paper__AuthorsAssignment_3 ) )
            // InternalProgram.g:6716:2: ( rule__Paper__AuthorsAssignment_3 )
            {
             before(grammarAccess.getPaperAccess().getAuthorsAssignment_3()); 
            // InternalProgram.g:6717:2: ( rule__Paper__AuthorsAssignment_3 )
            // InternalProgram.g:6717:3: rule__Paper__AuthorsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Paper__AuthorsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPaperAccess().getAuthorsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group__3__Impl"


    // $ANTLR start "rule__Paper__Group__4"
    // InternalProgram.g:6725:1: rule__Paper__Group__4 : rule__Paper__Group__4__Impl rule__Paper__Group__5 ;
    public final void rule__Paper__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6729:1: ( rule__Paper__Group__4__Impl rule__Paper__Group__5 )
            // InternalProgram.g:6730:2: rule__Paper__Group__4__Impl rule__Paper__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__Paper__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paper__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group__4"


    // $ANTLR start "rule__Paper__Group__4__Impl"
    // InternalProgram.g:6737:1: rule__Paper__Group__4__Impl : ( ( rule__Paper__Group_4__0 )* ) ;
    public final void rule__Paper__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6741:1: ( ( ( rule__Paper__Group_4__0 )* ) )
            // InternalProgram.g:6742:1: ( ( rule__Paper__Group_4__0 )* )
            {
            // InternalProgram.g:6742:1: ( ( rule__Paper__Group_4__0 )* )
            // InternalProgram.g:6743:2: ( rule__Paper__Group_4__0 )*
            {
             before(grammarAccess.getPaperAccess().getGroup_4()); 
            // InternalProgram.g:6744:2: ( rule__Paper__Group_4__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==21) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalProgram.g:6744:3: rule__Paper__Group_4__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Paper__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

             after(grammarAccess.getPaperAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group__4__Impl"


    // $ANTLR start "rule__Paper__Group__5"
    // InternalProgram.g:6752:1: rule__Paper__Group__5 : rule__Paper__Group__5__Impl rule__Paper__Group__6 ;
    public final void rule__Paper__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6756:1: ( rule__Paper__Group__5__Impl rule__Paper__Group__6 )
            // InternalProgram.g:6757:2: rule__Paper__Group__5__Impl rule__Paper__Group__6
            {
            pushFollow(FOLLOW_33);
            rule__Paper__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paper__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group__5"


    // $ANTLR start "rule__Paper__Group__5__Impl"
    // InternalProgram.g:6764:1: rule__Paper__Group__5__Impl : ( ( rule__Paper__Group_5__0 )? ) ;
    public final void rule__Paper__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6768:1: ( ( ( rule__Paper__Group_5__0 )? ) )
            // InternalProgram.g:6769:1: ( ( rule__Paper__Group_5__0 )? )
            {
            // InternalProgram.g:6769:1: ( ( rule__Paper__Group_5__0 )? )
            // InternalProgram.g:6770:2: ( rule__Paper__Group_5__0 )?
            {
             before(grammarAccess.getPaperAccess().getGroup_5()); 
            // InternalProgram.g:6771:2: ( rule__Paper__Group_5__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==38) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalProgram.g:6771:3: rule__Paper__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Paper__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPaperAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group__5__Impl"


    // $ANTLR start "rule__Paper__Group__6"
    // InternalProgram.g:6779:1: rule__Paper__Group__6 : rule__Paper__Group__6__Impl rule__Paper__Group__7 ;
    public final void rule__Paper__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6783:1: ( rule__Paper__Group__6__Impl rule__Paper__Group__7 )
            // InternalProgram.g:6784:2: rule__Paper__Group__6__Impl rule__Paper__Group__7
            {
            pushFollow(FOLLOW_33);
            rule__Paper__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paper__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group__6"


    // $ANTLR start "rule__Paper__Group__6__Impl"
    // InternalProgram.g:6791:1: rule__Paper__Group__6__Impl : ( ( rule__Paper__Group_6__0 )? ) ;
    public final void rule__Paper__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6795:1: ( ( ( rule__Paper__Group_6__0 )? ) )
            // InternalProgram.g:6796:1: ( ( rule__Paper__Group_6__0 )? )
            {
            // InternalProgram.g:6796:1: ( ( rule__Paper__Group_6__0 )? )
            // InternalProgram.g:6797:2: ( rule__Paper__Group_6__0 )?
            {
             before(grammarAccess.getPaperAccess().getGroup_6()); 
            // InternalProgram.g:6798:2: ( rule__Paper__Group_6__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==61) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalProgram.g:6798:3: rule__Paper__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Paper__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPaperAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group__6__Impl"


    // $ANTLR start "rule__Paper__Group__7"
    // InternalProgram.g:6806:1: rule__Paper__Group__7 : rule__Paper__Group__7__Impl ;
    public final void rule__Paper__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6810:1: ( rule__Paper__Group__7__Impl )
            // InternalProgram.g:6811:2: rule__Paper__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Paper__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group__7"


    // $ANTLR start "rule__Paper__Group__7__Impl"
    // InternalProgram.g:6817:1: rule__Paper__Group__7__Impl : ( ( rule__Paper__Group_7__0 )? ) ;
    public final void rule__Paper__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6821:1: ( ( ( rule__Paper__Group_7__0 )? ) )
            // InternalProgram.g:6822:1: ( ( rule__Paper__Group_7__0 )? )
            {
            // InternalProgram.g:6822:1: ( ( rule__Paper__Group_7__0 )? )
            // InternalProgram.g:6823:2: ( rule__Paper__Group_7__0 )?
            {
             before(grammarAccess.getPaperAccess().getGroup_7()); 
            // InternalProgram.g:6824:2: ( rule__Paper__Group_7__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==62) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalProgram.g:6824:3: rule__Paper__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Paper__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPaperAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group__7__Impl"


    // $ANTLR start "rule__Paper__Group_4__0"
    // InternalProgram.g:6833:1: rule__Paper__Group_4__0 : rule__Paper__Group_4__0__Impl rule__Paper__Group_4__1 ;
    public final void rule__Paper__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6837:1: ( rule__Paper__Group_4__0__Impl rule__Paper__Group_4__1 )
            // InternalProgram.g:6838:2: rule__Paper__Group_4__0__Impl rule__Paper__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Paper__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paper__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group_4__0"


    // $ANTLR start "rule__Paper__Group_4__0__Impl"
    // InternalProgram.g:6845:1: rule__Paper__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Paper__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6849:1: ( ( ',' ) )
            // InternalProgram.g:6850:1: ( ',' )
            {
            // InternalProgram.g:6850:1: ( ',' )
            // InternalProgram.g:6851:2: ','
            {
             before(grammarAccess.getPaperAccess().getCommaKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPaperAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group_4__0__Impl"


    // $ANTLR start "rule__Paper__Group_4__1"
    // InternalProgram.g:6860:1: rule__Paper__Group_4__1 : rule__Paper__Group_4__1__Impl ;
    public final void rule__Paper__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6864:1: ( rule__Paper__Group_4__1__Impl )
            // InternalProgram.g:6865:2: rule__Paper__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Paper__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group_4__1"


    // $ANTLR start "rule__Paper__Group_4__1__Impl"
    // InternalProgram.g:6871:1: rule__Paper__Group_4__1__Impl : ( ( rule__Paper__AuthorsAssignment_4_1 ) ) ;
    public final void rule__Paper__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6875:1: ( ( ( rule__Paper__AuthorsAssignment_4_1 ) ) )
            // InternalProgram.g:6876:1: ( ( rule__Paper__AuthorsAssignment_4_1 ) )
            {
            // InternalProgram.g:6876:1: ( ( rule__Paper__AuthorsAssignment_4_1 ) )
            // InternalProgram.g:6877:2: ( rule__Paper__AuthorsAssignment_4_1 )
            {
             before(grammarAccess.getPaperAccess().getAuthorsAssignment_4_1()); 
            // InternalProgram.g:6878:2: ( rule__Paper__AuthorsAssignment_4_1 )
            // InternalProgram.g:6878:3: rule__Paper__AuthorsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Paper__AuthorsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPaperAccess().getAuthorsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group_4__1__Impl"


    // $ANTLR start "rule__Paper__Group_5__0"
    // InternalProgram.g:6887:1: rule__Paper__Group_5__0 : rule__Paper__Group_5__0__Impl rule__Paper__Group_5__1 ;
    public final void rule__Paper__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6891:1: ( rule__Paper__Group_5__0__Impl rule__Paper__Group_5__1 )
            // InternalProgram.g:6892:2: rule__Paper__Group_5__0__Impl rule__Paper__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Paper__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paper__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group_5__0"


    // $ANTLR start "rule__Paper__Group_5__0__Impl"
    // InternalProgram.g:6899:1: rule__Paper__Group_5__0__Impl : ( 'abstract' ) ;
    public final void rule__Paper__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6903:1: ( ( 'abstract' ) )
            // InternalProgram.g:6904:1: ( 'abstract' )
            {
            // InternalProgram.g:6904:1: ( 'abstract' )
            // InternalProgram.g:6905:2: 'abstract'
            {
             before(grammarAccess.getPaperAccess().getAbstractKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPaperAccess().getAbstractKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group_5__0__Impl"


    // $ANTLR start "rule__Paper__Group_5__1"
    // InternalProgram.g:6914:1: rule__Paper__Group_5__1 : rule__Paper__Group_5__1__Impl ;
    public final void rule__Paper__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6918:1: ( rule__Paper__Group_5__1__Impl )
            // InternalProgram.g:6919:2: rule__Paper__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Paper__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group_5__1"


    // $ANTLR start "rule__Paper__Group_5__1__Impl"
    // InternalProgram.g:6925:1: rule__Paper__Group_5__1__Impl : ( ( rule__Paper__AbstractAssignment_5_1 ) ) ;
    public final void rule__Paper__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6929:1: ( ( ( rule__Paper__AbstractAssignment_5_1 ) ) )
            // InternalProgram.g:6930:1: ( ( rule__Paper__AbstractAssignment_5_1 ) )
            {
            // InternalProgram.g:6930:1: ( ( rule__Paper__AbstractAssignment_5_1 ) )
            // InternalProgram.g:6931:2: ( rule__Paper__AbstractAssignment_5_1 )
            {
             before(grammarAccess.getPaperAccess().getAbstractAssignment_5_1()); 
            // InternalProgram.g:6932:2: ( rule__Paper__AbstractAssignment_5_1 )
            // InternalProgram.g:6932:3: rule__Paper__AbstractAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Paper__AbstractAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPaperAccess().getAbstractAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group_5__1__Impl"


    // $ANTLR start "rule__Paper__Group_6__0"
    // InternalProgram.g:6941:1: rule__Paper__Group_6__0 : rule__Paper__Group_6__0__Impl rule__Paper__Group_6__1 ;
    public final void rule__Paper__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6945:1: ( rule__Paper__Group_6__0__Impl rule__Paper__Group_6__1 )
            // InternalProgram.g:6946:2: rule__Paper__Group_6__0__Impl rule__Paper__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Paper__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paper__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group_6__0"


    // $ANTLR start "rule__Paper__Group_6__0__Impl"
    // InternalProgram.g:6953:1: rule__Paper__Group_6__0__Impl : ( 'preprint' ) ;
    public final void rule__Paper__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6957:1: ( ( 'preprint' ) )
            // InternalProgram.g:6958:1: ( 'preprint' )
            {
            // InternalProgram.g:6958:1: ( 'preprint' )
            // InternalProgram.g:6959:2: 'preprint'
            {
             before(grammarAccess.getPaperAccess().getPreprintKeyword_6_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getPaperAccess().getPreprintKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group_6__0__Impl"


    // $ANTLR start "rule__Paper__Group_6__1"
    // InternalProgram.g:6968:1: rule__Paper__Group_6__1 : rule__Paper__Group_6__1__Impl ;
    public final void rule__Paper__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6972:1: ( rule__Paper__Group_6__1__Impl )
            // InternalProgram.g:6973:2: rule__Paper__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Paper__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group_6__1"


    // $ANTLR start "rule__Paper__Group_6__1__Impl"
    // InternalProgram.g:6979:1: rule__Paper__Group_6__1__Impl : ( ( rule__Paper__PreprintAssignment_6_1 ) ) ;
    public final void rule__Paper__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6983:1: ( ( ( rule__Paper__PreprintAssignment_6_1 ) ) )
            // InternalProgram.g:6984:1: ( ( rule__Paper__PreprintAssignment_6_1 ) )
            {
            // InternalProgram.g:6984:1: ( ( rule__Paper__PreprintAssignment_6_1 ) )
            // InternalProgram.g:6985:2: ( rule__Paper__PreprintAssignment_6_1 )
            {
             before(grammarAccess.getPaperAccess().getPreprintAssignment_6_1()); 
            // InternalProgram.g:6986:2: ( rule__Paper__PreprintAssignment_6_1 )
            // InternalProgram.g:6986:3: rule__Paper__PreprintAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Paper__PreprintAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPaperAccess().getPreprintAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group_6__1__Impl"


    // $ANTLR start "rule__Paper__Group_7__0"
    // InternalProgram.g:6995:1: rule__Paper__Group_7__0 : rule__Paper__Group_7__0__Impl rule__Paper__Group_7__1 ;
    public final void rule__Paper__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6999:1: ( rule__Paper__Group_7__0__Impl rule__Paper__Group_7__1 )
            // InternalProgram.g:7000:2: rule__Paper__Group_7__0__Impl rule__Paper__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__Paper__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paper__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group_7__0"


    // $ANTLR start "rule__Paper__Group_7__0__Impl"
    // InternalProgram.g:7007:1: rule__Paper__Group_7__0__Impl : ( 'kind' ) ;
    public final void rule__Paper__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7011:1: ( ( 'kind' ) )
            // InternalProgram.g:7012:1: ( 'kind' )
            {
            // InternalProgram.g:7012:1: ( 'kind' )
            // InternalProgram.g:7013:2: 'kind'
            {
             before(grammarAccess.getPaperAccess().getKindKeyword_7_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getPaperAccess().getKindKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group_7__0__Impl"


    // $ANTLR start "rule__Paper__Group_7__1"
    // InternalProgram.g:7022:1: rule__Paper__Group_7__1 : rule__Paper__Group_7__1__Impl ;
    public final void rule__Paper__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7026:1: ( rule__Paper__Group_7__1__Impl )
            // InternalProgram.g:7027:2: rule__Paper__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Paper__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group_7__1"


    // $ANTLR start "rule__Paper__Group_7__1__Impl"
    // InternalProgram.g:7033:1: rule__Paper__Group_7__1__Impl : ( ( rule__Paper__KindAssignment_7_1 ) ) ;
    public final void rule__Paper__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7037:1: ( ( ( rule__Paper__KindAssignment_7_1 ) ) )
            // InternalProgram.g:7038:1: ( ( rule__Paper__KindAssignment_7_1 ) )
            {
            // InternalProgram.g:7038:1: ( ( rule__Paper__KindAssignment_7_1 ) )
            // InternalProgram.g:7039:2: ( rule__Paper__KindAssignment_7_1 )
            {
             before(grammarAccess.getPaperAccess().getKindAssignment_7_1()); 
            // InternalProgram.g:7040:2: ( rule__Paper__KindAssignment_7_1 )
            // InternalProgram.g:7040:3: rule__Paper__KindAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Paper__KindAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPaperAccess().getKindAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group_7__1__Impl"


    // $ANTLR start "rule__Person__Group__0"
    // InternalProgram.g:7049:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7053:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalProgram.g:7054:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Person__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__0"


    // $ANTLR start "rule__Person__Group__0__Impl"
    // InternalProgram.g:7061:1: rule__Person__Group__0__Impl : ( () ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7065:1: ( ( () ) )
            // InternalProgram.g:7066:1: ( () )
            {
            // InternalProgram.g:7066:1: ( () )
            // InternalProgram.g:7067:2: ()
            {
             before(grammarAccess.getPersonAccess().getPersonAction_0()); 
            // InternalProgram.g:7068:2: ()
            // InternalProgram.g:7068:3: 
            {
            }

             after(grammarAccess.getPersonAccess().getPersonAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__0__Impl"


    // $ANTLR start "rule__Person__Group__1"
    // InternalProgram.g:7076:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7080:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // InternalProgram.g:7081:2: rule__Person__Group__1__Impl rule__Person__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__Person__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__1"


    // $ANTLR start "rule__Person__Group__1__Impl"
    // InternalProgram.g:7088:1: rule__Person__Group__1__Impl : ( ( rule__Person__NameAssignment_1 ) ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7092:1: ( ( ( rule__Person__NameAssignment_1 ) ) )
            // InternalProgram.g:7093:1: ( ( rule__Person__NameAssignment_1 ) )
            {
            // InternalProgram.g:7093:1: ( ( rule__Person__NameAssignment_1 ) )
            // InternalProgram.g:7094:2: ( rule__Person__NameAssignment_1 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_1()); 
            // InternalProgram.g:7095:2: ( rule__Person__NameAssignment_1 )
            // InternalProgram.g:7095:3: rule__Person__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Person__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__1__Impl"


    // $ANTLR start "rule__Person__Group__2"
    // InternalProgram.g:7103:1: rule__Person__Group__2 : rule__Person__Group__2__Impl rule__Person__Group__3 ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7107:1: ( rule__Person__Group__2__Impl rule__Person__Group__3 )
            // InternalProgram.g:7108:2: rule__Person__Group__2__Impl rule__Person__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__Person__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__2"


    // $ANTLR start "rule__Person__Group__2__Impl"
    // InternalProgram.g:7115:1: rule__Person__Group__2__Impl : ( ( rule__Person__Group_2__0 )? ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7119:1: ( ( ( rule__Person__Group_2__0 )? ) )
            // InternalProgram.g:7120:1: ( ( rule__Person__Group_2__0 )? )
            {
            // InternalProgram.g:7120:1: ( ( rule__Person__Group_2__0 )? )
            // InternalProgram.g:7121:2: ( rule__Person__Group_2__0 )?
            {
             before(grammarAccess.getPersonAccess().getGroup_2()); 
            // InternalProgram.g:7122:2: ( rule__Person__Group_2__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==63) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalProgram.g:7122:3: rule__Person__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Person__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersonAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__2__Impl"


    // $ANTLR start "rule__Person__Group__3"
    // InternalProgram.g:7130:1: rule__Person__Group__3 : rule__Person__Group__3__Impl ;
    public final void rule__Person__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7134:1: ( rule__Person__Group__3__Impl )
            // InternalProgram.g:7135:2: rule__Person__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__3"


    // $ANTLR start "rule__Person__Group__3__Impl"
    // InternalProgram.g:7141:1: rule__Person__Group__3__Impl : ( ( rule__Person__Group_3__0 )? ) ;
    public final void rule__Person__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7145:1: ( ( ( rule__Person__Group_3__0 )? ) )
            // InternalProgram.g:7146:1: ( ( rule__Person__Group_3__0 )? )
            {
            // InternalProgram.g:7146:1: ( ( rule__Person__Group_3__0 )? )
            // InternalProgram.g:7147:2: ( rule__Person__Group_3__0 )?
            {
             before(grammarAccess.getPersonAccess().getGroup_3()); 
            // InternalProgram.g:7148:2: ( rule__Person__Group_3__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==64) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalProgram.g:7148:3: rule__Person__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Person__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersonAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__3__Impl"


    // $ANTLR start "rule__Person__Group_2__0"
    // InternalProgram.g:7157:1: rule__Person__Group_2__0 : rule__Person__Group_2__0__Impl rule__Person__Group_2__1 ;
    public final void rule__Person__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7161:1: ( rule__Person__Group_2__0__Impl rule__Person__Group_2__1 )
            // InternalProgram.g:7162:2: rule__Person__Group_2__0__Impl rule__Person__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Person__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_2__0"


    // $ANTLR start "rule__Person__Group_2__0__Impl"
    // InternalProgram.g:7169:1: rule__Person__Group_2__0__Impl : ( 'email' ) ;
    public final void rule__Person__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7173:1: ( ( 'email' ) )
            // InternalProgram.g:7174:1: ( 'email' )
            {
            // InternalProgram.g:7174:1: ( 'email' )
            // InternalProgram.g:7175:2: 'email'
            {
             before(grammarAccess.getPersonAccess().getEmailKeyword_2_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getEmailKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_2__0__Impl"


    // $ANTLR start "rule__Person__Group_2__1"
    // InternalProgram.g:7184:1: rule__Person__Group_2__1 : rule__Person__Group_2__1__Impl ;
    public final void rule__Person__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7188:1: ( rule__Person__Group_2__1__Impl )
            // InternalProgram.g:7189:2: rule__Person__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_2__1"


    // $ANTLR start "rule__Person__Group_2__1__Impl"
    // InternalProgram.g:7195:1: rule__Person__Group_2__1__Impl : ( ( rule__Person__EmailAssignment_2_1 ) ) ;
    public final void rule__Person__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7199:1: ( ( ( rule__Person__EmailAssignment_2_1 ) ) )
            // InternalProgram.g:7200:1: ( ( rule__Person__EmailAssignment_2_1 ) )
            {
            // InternalProgram.g:7200:1: ( ( rule__Person__EmailAssignment_2_1 ) )
            // InternalProgram.g:7201:2: ( rule__Person__EmailAssignment_2_1 )
            {
             before(grammarAccess.getPersonAccess().getEmailAssignment_2_1()); 
            // InternalProgram.g:7202:2: ( rule__Person__EmailAssignment_2_1 )
            // InternalProgram.g:7202:3: rule__Person__EmailAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Person__EmailAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getEmailAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_2__1__Impl"


    // $ANTLR start "rule__Person__Group_3__0"
    // InternalProgram.g:7211:1: rule__Person__Group_3__0 : rule__Person__Group_3__0__Impl rule__Person__Group_3__1 ;
    public final void rule__Person__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7215:1: ( rule__Person__Group_3__0__Impl rule__Person__Group_3__1 )
            // InternalProgram.g:7216:2: rule__Person__Group_3__0__Impl rule__Person__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Person__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_3__0"


    // $ANTLR start "rule__Person__Group_3__0__Impl"
    // InternalProgram.g:7223:1: rule__Person__Group_3__0__Impl : ( 'homepage' ) ;
    public final void rule__Person__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7227:1: ( ( 'homepage' ) )
            // InternalProgram.g:7228:1: ( 'homepage' )
            {
            // InternalProgram.g:7228:1: ( 'homepage' )
            // InternalProgram.g:7229:2: 'homepage'
            {
             before(grammarAccess.getPersonAccess().getHomepageKeyword_3_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getHomepageKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_3__0__Impl"


    // $ANTLR start "rule__Person__Group_3__1"
    // InternalProgram.g:7238:1: rule__Person__Group_3__1 : rule__Person__Group_3__1__Impl ;
    public final void rule__Person__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7242:1: ( rule__Person__Group_3__1__Impl )
            // InternalProgram.g:7243:2: rule__Person__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_3__1"


    // $ANTLR start "rule__Person__Group_3__1__Impl"
    // InternalProgram.g:7249:1: rule__Person__Group_3__1__Impl : ( ( rule__Person__HomepageAssignment_3_1 ) ) ;
    public final void rule__Person__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7253:1: ( ( ( rule__Person__HomepageAssignment_3_1 ) ) )
            // InternalProgram.g:7254:1: ( ( rule__Person__HomepageAssignment_3_1 ) )
            {
            // InternalProgram.g:7254:1: ( ( rule__Person__HomepageAssignment_3_1 ) )
            // InternalProgram.g:7255:2: ( rule__Person__HomepageAssignment_3_1 )
            {
             before(grammarAccess.getPersonAccess().getHomepageAssignment_3_1()); 
            // InternalProgram.g:7256:2: ( rule__Person__HomepageAssignment_3_1 )
            // InternalProgram.g:7256:3: rule__Person__HomepageAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Person__HomepageAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getHomepageAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_3__1__Impl"


    // $ANTLR start "rule__Kind__Group__0"
    // InternalProgram.g:7265:1: rule__Kind__Group__0 : rule__Kind__Group__0__Impl rule__Kind__Group__1 ;
    public final void rule__Kind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7269:1: ( rule__Kind__Group__0__Impl rule__Kind__Group__1 )
            // InternalProgram.g:7270:2: rule__Kind__Group__0__Impl rule__Kind__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Kind__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Kind__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__0"


    // $ANTLR start "rule__Kind__Group__0__Impl"
    // InternalProgram.g:7277:1: rule__Kind__Group__0__Impl : ( () ) ;
    public final void rule__Kind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7281:1: ( ( () ) )
            // InternalProgram.g:7282:1: ( () )
            {
            // InternalProgram.g:7282:1: ( () )
            // InternalProgram.g:7283:2: ()
            {
             before(grammarAccess.getKindAccess().getKindAction_0()); 
            // InternalProgram.g:7284:2: ()
            // InternalProgram.g:7284:3: 
            {
            }

             after(grammarAccess.getKindAccess().getKindAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__0__Impl"


    // $ANTLR start "rule__Kind__Group__1"
    // InternalProgram.g:7292:1: rule__Kind__Group__1 : rule__Kind__Group__1__Impl ;
    public final void rule__Kind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7296:1: ( rule__Kind__Group__1__Impl )
            // InternalProgram.g:7297:2: rule__Kind__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Kind__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__1"


    // $ANTLR start "rule__Kind__Group__1__Impl"
    // InternalProgram.g:7303:1: rule__Kind__Group__1__Impl : ( ( rule__Kind__NameAssignment_1 ) ) ;
    public final void rule__Kind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7307:1: ( ( ( rule__Kind__NameAssignment_1 ) ) )
            // InternalProgram.g:7308:1: ( ( rule__Kind__NameAssignment_1 ) )
            {
            // InternalProgram.g:7308:1: ( ( rule__Kind__NameAssignment_1 ) )
            // InternalProgram.g:7309:2: ( rule__Kind__NameAssignment_1 )
            {
             before(grammarAccess.getKindAccess().getNameAssignment_1()); 
            // InternalProgram.g:7310:2: ( rule__Kind__NameAssignment_1 )
            // InternalProgram.g:7310:3: rule__Kind__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Kind__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKindAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Group__1__Impl"


    // $ANTLR start "rule__Conference__NameAssignment_2"
    // InternalProgram.g:7319:1: rule__Conference__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Conference__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7323:1: ( ( ruleEString ) )
            // InternalProgram.g:7324:2: ( ruleEString )
            {
            // InternalProgram.g:7324:2: ( ruleEString )
            // InternalProgram.g:7325:3: ruleEString
            {
             before(grammarAccess.getConferenceAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConferenceAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__NameAssignment_2"


    // $ANTLR start "rule__Conference__TalkDurationAssignment_4"
    // InternalProgram.g:7334:1: rule__Conference__TalkDurationAssignment_4 : ( ruleEIntegerObject ) ;
    public final void rule__Conference__TalkDurationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7338:1: ( ( ruleEIntegerObject ) )
            // InternalProgram.g:7339:2: ( ruleEIntegerObject )
            {
            // InternalProgram.g:7339:2: ( ruleEIntegerObject )
            // InternalProgram.g:7340:3: ruleEIntegerObject
            {
             before(grammarAccess.getConferenceAccess().getTalkDurationEIntegerObjectParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getConferenceAccess().getTalkDurationEIntegerObjectParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__TalkDurationAssignment_4"


    // $ANTLR start "rule__Conference__KindsAssignment_5_1"
    // InternalProgram.g:7349:1: rule__Conference__KindsAssignment_5_1 : ( ruleKind ) ;
    public final void rule__Conference__KindsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7353:1: ( ( ruleKind ) )
            // InternalProgram.g:7354:2: ( ruleKind )
            {
            // InternalProgram.g:7354:2: ( ruleKind )
            // InternalProgram.g:7355:3: ruleKind
            {
             before(grammarAccess.getConferenceAccess().getKindsKindParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKind();

            state._fsp--;

             after(grammarAccess.getConferenceAccess().getKindsKindParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__KindsAssignment_5_1"


    // $ANTLR start "rule__Conference__KindsAssignment_5_2_1"
    // InternalProgram.g:7364:1: rule__Conference__KindsAssignment_5_2_1 : ( ruleKind ) ;
    public final void rule__Conference__KindsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7368:1: ( ( ruleKind ) )
            // InternalProgram.g:7369:2: ( ruleKind )
            {
            // InternalProgram.g:7369:2: ( ruleKind )
            // InternalProgram.g:7370:3: ruleKind
            {
             before(grammarAccess.getConferenceAccess().getKindsKindParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKind();

            state._fsp--;

             after(grammarAccess.getConferenceAccess().getKindsKindParserRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__KindsAssignment_5_2_1"


    // $ANTLR start "rule__Conference__ResourcesAssignment_6_1"
    // InternalProgram.g:7379:1: rule__Conference__ResourcesAssignment_6_1 : ( ruleResource ) ;
    public final void rule__Conference__ResourcesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7383:1: ( ( ruleResource ) )
            // InternalProgram.g:7384:2: ( ruleResource )
            {
            // InternalProgram.g:7384:2: ( ruleResource )
            // InternalProgram.g:7385:3: ruleResource
            {
             before(grammarAccess.getConferenceAccess().getResourcesResourceParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getConferenceAccess().getResourcesResourceParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__ResourcesAssignment_6_1"


    // $ANTLR start "rule__Conference__ResourcesAssignment_6_2"
    // InternalProgram.g:7394:1: rule__Conference__ResourcesAssignment_6_2 : ( ruleResource ) ;
    public final void rule__Conference__ResourcesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7398:1: ( ( ruleResource ) )
            // InternalProgram.g:7399:2: ( ruleResource )
            {
            // InternalProgram.g:7399:2: ( ruleResource )
            // InternalProgram.g:7400:3: ruleResource
            {
             before(grammarAccess.getConferenceAccess().getResourcesResourceParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getConferenceAccess().getResourcesResourceParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__ResourcesAssignment_6_2"


    // $ANTLR start "rule__Conference__PapersAssignment_7_2"
    // InternalProgram.g:7409:1: rule__Conference__PapersAssignment_7_2 : ( rulePaper ) ;
    public final void rule__Conference__PapersAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7413:1: ( ( rulePaper ) )
            // InternalProgram.g:7414:2: ( rulePaper )
            {
            // InternalProgram.g:7414:2: ( rulePaper )
            // InternalProgram.g:7415:3: rulePaper
            {
             before(grammarAccess.getConferenceAccess().getPapersPaperParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            rulePaper();

            state._fsp--;

             after(grammarAccess.getConferenceAccess().getPapersPaperParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__PapersAssignment_7_2"


    // $ANTLR start "rule__Conference__PapersAssignment_7_3_1"
    // InternalProgram.g:7424:1: rule__Conference__PapersAssignment_7_3_1 : ( rulePaper ) ;
    public final void rule__Conference__PapersAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7428:1: ( ( rulePaper ) )
            // InternalProgram.g:7429:2: ( rulePaper )
            {
            // InternalProgram.g:7429:2: ( rulePaper )
            // InternalProgram.g:7430:3: rulePaper
            {
             before(grammarAccess.getConferenceAccess().getPapersPaperParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePaper();

            state._fsp--;

             after(grammarAccess.getConferenceAccess().getPapersPaperParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__PapersAssignment_7_3_1"


    // $ANTLR start "rule__Conference__EventsAssignment_8_2"
    // InternalProgram.g:7439:1: rule__Conference__EventsAssignment_8_2 : ( ruleEvent ) ;
    public final void rule__Conference__EventsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7443:1: ( ( ruleEvent ) )
            // InternalProgram.g:7444:2: ( ruleEvent )
            {
            // InternalProgram.g:7444:2: ( ruleEvent )
            // InternalProgram.g:7445:3: ruleEvent
            {
             before(grammarAccess.getConferenceAccess().getEventsEventParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getConferenceAccess().getEventsEventParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__EventsAssignment_8_2"


    // $ANTLR start "rule__Conference__EventsAssignment_8_3_1"
    // InternalProgram.g:7454:1: rule__Conference__EventsAssignment_8_3_1 : ( ruleEvent ) ;
    public final void rule__Conference__EventsAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7458:1: ( ( ruleEvent ) )
            // InternalProgram.g:7459:2: ( ruleEvent )
            {
            // InternalProgram.g:7459:2: ( ruleEvent )
            // InternalProgram.g:7460:3: ruleEvent
            {
             before(grammarAccess.getConferenceAccess().getEventsEventParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getConferenceAccess().getEventsEventParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__EventsAssignment_8_3_1"


    // $ANTLR start "rule__Conference__ProgramAssignment_9_1"
    // InternalProgram.g:7469:1: rule__Conference__ProgramAssignment_9_1 : ( ruleProgram ) ;
    public final void rule__Conference__ProgramAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7473:1: ( ( ruleProgram ) )
            // InternalProgram.g:7474:2: ( ruleProgram )
            {
            // InternalProgram.g:7474:2: ( ruleProgram )
            // InternalProgram.g:7475:3: ruleProgram
            {
             before(grammarAccess.getConferenceAccess().getProgramProgramParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getConferenceAccess().getProgramProgramParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__ProgramAssignment_9_1"


    // $ANTLR start "rule__Program__DaysAssignment_2_0"
    // InternalProgram.g:7484:1: rule__Program__DaysAssignment_2_0 : ( ruleDay ) ;
    public final void rule__Program__DaysAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7488:1: ( ( ruleDay ) )
            // InternalProgram.g:7489:2: ( ruleDay )
            {
            // InternalProgram.g:7489:2: ( ruleDay )
            // InternalProgram.g:7490:3: ruleDay
            {
             before(grammarAccess.getProgramAccess().getDaysDayParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDay();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getDaysDayParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__DaysAssignment_2_0"


    // $ANTLR start "rule__Program__DaysAssignment_2_1"
    // InternalProgram.g:7499:1: rule__Program__DaysAssignment_2_1 : ( ruleDay ) ;
    public final void rule__Program__DaysAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7503:1: ( ( ruleDay ) )
            // InternalProgram.g:7504:2: ( ruleDay )
            {
            // InternalProgram.g:7504:2: ( ruleDay )
            // InternalProgram.g:7505:3: ruleDay
            {
             before(grammarAccess.getProgramAccess().getDaysDayParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDay();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getDaysDayParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__DaysAssignment_2_1"


    // $ANTLR start "rule__Room__NameAssignment_2"
    // InternalProgram.g:7514:1: rule__Room__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Room__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7518:1: ( ( ruleEString ) )
            // InternalProgram.g:7519:2: ( ruleEString )
            {
            // InternalProgram.g:7519:2: ( ruleEString )
            // InternalProgram.g:7520:3: ruleEString
            {
             before(grammarAccess.getRoomAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__NameAssignment_2"


    // $ANTLR start "rule__Room__CapacityAssignment_3_1"
    // InternalProgram.g:7529:1: rule__Room__CapacityAssignment_3_1 : ( ruleEIntegerObject ) ;
    public final void rule__Room__CapacityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7533:1: ( ( ruleEIntegerObject ) )
            // InternalProgram.g:7534:2: ( ruleEIntegerObject )
            {
            // InternalProgram.g:7534:2: ( ruleEIntegerObject )
            // InternalProgram.g:7535:3: ruleEIntegerObject
            {
             before(grammarAccess.getRoomAccess().getCapacityEIntegerObjectParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getCapacityEIntegerObjectParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__CapacityAssignment_3_1"


    // $ANTLR start "rule__Day__WeekdayAssignment_0"
    // InternalProgram.g:7544:1: rule__Day__WeekdayAssignment_0 : ( ruleWeekDay ) ;
    public final void rule__Day__WeekdayAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7548:1: ( ( ruleWeekDay ) )
            // InternalProgram.g:7549:2: ( ruleWeekDay )
            {
            // InternalProgram.g:7549:2: ( ruleWeekDay )
            // InternalProgram.g:7550:3: ruleWeekDay
            {
             before(grammarAccess.getDayAccess().getWeekdayWeekDayEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleWeekDay();

            state._fsp--;

             after(grammarAccess.getDayAccess().getWeekdayWeekDayEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__WeekdayAssignment_0"


    // $ANTLR start "rule__Day__DateAssignment_1_1"
    // InternalProgram.g:7559:1: rule__Day__DateAssignment_1_1 : ( ruleDayDataType ) ;
    public final void rule__Day__DateAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7563:1: ( ( ruleDayDataType ) )
            // InternalProgram.g:7564:2: ( ruleDayDataType )
            {
            // InternalProgram.g:7564:2: ( ruleDayDataType )
            // InternalProgram.g:7565:3: ruleDayDataType
            {
             before(grammarAccess.getDayAccess().getDateDayDataTypeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDayDataType();

            state._fsp--;

             after(grammarAccess.getDayAccess().getDateDayDataTypeParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__DateAssignment_1_1"


    // $ANTLR start "rule__Day__SessionsAssignment_2_0"
    // InternalProgram.g:7574:1: rule__Day__SessionsAssignment_2_0 : ( ruleSession ) ;
    public final void rule__Day__SessionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7578:1: ( ( ruleSession ) )
            // InternalProgram.g:7579:2: ( ruleSession )
            {
            // InternalProgram.g:7579:2: ( ruleSession )
            // InternalProgram.g:7580:3: ruleSession
            {
             before(grammarAccess.getDayAccess().getSessionsSessionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSession();

            state._fsp--;

             after(grammarAccess.getDayAccess().getSessionsSessionParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__SessionsAssignment_2_0"


    // $ANTLR start "rule__Day__SessionsAssignment_2_1"
    // InternalProgram.g:7589:1: rule__Day__SessionsAssignment_2_1 : ( ruleSession ) ;
    public final void rule__Day__SessionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7593:1: ( ( ruleSession ) )
            // InternalProgram.g:7594:2: ( ruleSession )
            {
            // InternalProgram.g:7594:2: ( ruleSession )
            // InternalProgram.g:7595:3: ruleSession
            {
             before(grammarAccess.getDayAccess().getSessionsSessionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSession();

            state._fsp--;

             after(grammarAccess.getDayAccess().getSessionsSessionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__SessionsAssignment_2_1"


    // $ANTLR start "rule__Session__StartingTimeAssignment_1"
    // InternalProgram.g:7604:1: rule__Session__StartingTimeAssignment_1 : ( ruleHourDataType ) ;
    public final void rule__Session__StartingTimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7608:1: ( ( ruleHourDataType ) )
            // InternalProgram.g:7609:2: ( ruleHourDataType )
            {
            // InternalProgram.g:7609:2: ( ruleHourDataType )
            // InternalProgram.g:7610:3: ruleHourDataType
            {
             before(grammarAccess.getSessionAccess().getStartingTimeHourDataTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHourDataType();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getStartingTimeHourDataTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__StartingTimeAssignment_1"


    // $ANTLR start "rule__Session__EndingTimeAssignment_3"
    // InternalProgram.g:7619:1: rule__Session__EndingTimeAssignment_3 : ( ruleHourDataType ) ;
    public final void rule__Session__EndingTimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7623:1: ( ( ruleHourDataType ) )
            // InternalProgram.g:7624:2: ( ruleHourDataType )
            {
            // InternalProgram.g:7624:2: ( ruleHourDataType )
            // InternalProgram.g:7625:3: ruleHourDataType
            {
             before(grammarAccess.getSessionAccess().getEndingTimeHourDataTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleHourDataType();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getEndingTimeHourDataTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__EndingTimeAssignment_3"


    // $ANTLR start "rule__Session__RoomAssignment_5"
    // InternalProgram.g:7634:1: rule__Session__RoomAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Session__RoomAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7638:1: ( ( ( ruleEString ) ) )
            // InternalProgram.g:7639:2: ( ( ruleEString ) )
            {
            // InternalProgram.g:7639:2: ( ( ruleEString ) )
            // InternalProgram.g:7640:3: ( ruleEString )
            {
             before(grammarAccess.getSessionAccess().getRoomRoomCrossReference_5_0()); 
            // InternalProgram.g:7641:3: ( ruleEString )
            // InternalProgram.g:7642:4: ruleEString
            {
             before(grammarAccess.getSessionAccess().getRoomRoomEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getRoomRoomEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getSessionAccess().getRoomRoomCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__RoomAssignment_5"


    // $ANTLR start "rule__Session__EventsAssignment_7"
    // InternalProgram.g:7653:1: rule__Session__EventsAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__Session__EventsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7657:1: ( ( ( ruleEString ) ) )
            // InternalProgram.g:7658:2: ( ( ruleEString ) )
            {
            // InternalProgram.g:7658:2: ( ( ruleEString ) )
            // InternalProgram.g:7659:3: ( ruleEString )
            {
             before(grammarAccess.getSessionAccess().getEventsEventCrossReference_7_0()); 
            // InternalProgram.g:7660:3: ( ruleEString )
            // InternalProgram.g:7661:4: ruleEString
            {
             before(grammarAccess.getSessionAccess().getEventsEventEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getEventsEventEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getSessionAccess().getEventsEventCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__EventsAssignment_7"


    // $ANTLR start "rule__Session__EventsAssignment_8_1"
    // InternalProgram.g:7672:1: rule__Session__EventsAssignment_8_1 : ( ( ruleEString ) ) ;
    public final void rule__Session__EventsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7676:1: ( ( ( ruleEString ) ) )
            // InternalProgram.g:7677:2: ( ( ruleEString ) )
            {
            // InternalProgram.g:7677:2: ( ( ruleEString ) )
            // InternalProgram.g:7678:3: ( ruleEString )
            {
             before(grammarAccess.getSessionAccess().getEventsEventCrossReference_8_1_0()); 
            // InternalProgram.g:7679:3: ( ruleEString )
            // InternalProgram.g:7680:4: ruleEString
            {
             before(grammarAccess.getSessionAccess().getEventsEventEStringParserRuleCall_8_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getEventsEventEStringParserRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getSessionAccess().getEventsEventCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__EventsAssignment_8_1"


    // $ANTLR start "rule__TalkSession__NameAssignment_1"
    // InternalProgram.g:7691:1: rule__TalkSession__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TalkSession__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7695:1: ( ( ruleEString ) )
            // InternalProgram.g:7696:2: ( ruleEString )
            {
            // InternalProgram.g:7696:2: ( ruleEString )
            // InternalProgram.g:7697:3: ruleEString
            {
             before(grammarAccess.getTalkSessionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTalkSessionAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__NameAssignment_1"


    // $ANTLR start "rule__TalkSession__ChairAssignment_2_1"
    // InternalProgram.g:7706:1: rule__TalkSession__ChairAssignment_2_1 : ( rulePerson ) ;
    public final void rule__TalkSession__ChairAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7710:1: ( ( rulePerson ) )
            // InternalProgram.g:7711:2: ( rulePerson )
            {
            // InternalProgram.g:7711:2: ( rulePerson )
            // InternalProgram.g:7712:3: rulePerson
            {
             before(grammarAccess.getTalkSessionAccess().getChairPersonParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getTalkSessionAccess().getChairPersonParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__ChairAssignment_2_1"


    // $ANTLR start "rule__TalkSession__AbstractAssignment_3_1"
    // InternalProgram.g:7721:1: rule__TalkSession__AbstractAssignment_3_1 : ( ruleEString ) ;
    public final void rule__TalkSession__AbstractAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7725:1: ( ( ruleEString ) )
            // InternalProgram.g:7726:2: ( ruleEString )
            {
            // InternalProgram.g:7726:2: ( ruleEString )
            // InternalProgram.g:7727:3: ruleEString
            {
             before(grammarAccess.getTalkSessionAccess().getAbstractEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTalkSessionAccess().getAbstractEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__AbstractAssignment_3_1"


    // $ANTLR start "rule__TalkSession__PapersAssignment_4_1"
    // InternalProgram.g:7736:1: rule__TalkSession__PapersAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__TalkSession__PapersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7740:1: ( ( ( ruleEString ) ) )
            // InternalProgram.g:7741:2: ( ( ruleEString ) )
            {
            // InternalProgram.g:7741:2: ( ( ruleEString ) )
            // InternalProgram.g:7742:3: ( ruleEString )
            {
             before(grammarAccess.getTalkSessionAccess().getPapersPaperCrossReference_4_1_0()); 
            // InternalProgram.g:7743:3: ( ruleEString )
            // InternalProgram.g:7744:4: ruleEString
            {
             before(grammarAccess.getTalkSessionAccess().getPapersPaperEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTalkSessionAccess().getPapersPaperEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getTalkSessionAccess().getPapersPaperCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__PapersAssignment_4_1"


    // $ANTLR start "rule__TalkSession__PapersAssignment_4_2_1"
    // InternalProgram.g:7755:1: rule__TalkSession__PapersAssignment_4_2_1 : ( ( ruleEString ) ) ;
    public final void rule__TalkSession__PapersAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7759:1: ( ( ( ruleEString ) ) )
            // InternalProgram.g:7760:2: ( ( ruleEString ) )
            {
            // InternalProgram.g:7760:2: ( ( ruleEString ) )
            // InternalProgram.g:7761:3: ( ruleEString )
            {
             before(grammarAccess.getTalkSessionAccess().getPapersPaperCrossReference_4_2_1_0()); 
            // InternalProgram.g:7762:3: ( ruleEString )
            // InternalProgram.g:7763:4: ruleEString
            {
             before(grammarAccess.getTalkSessionAccess().getPapersPaperEStringParserRuleCall_4_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTalkSessionAccess().getPapersPaperEStringParserRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getTalkSessionAccess().getPapersPaperCrossReference_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__PapersAssignment_4_2_1"


    // $ANTLR start "rule__Panel__NameAssignment_1"
    // InternalProgram.g:7774:1: rule__Panel__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Panel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7778:1: ( ( ruleEString ) )
            // InternalProgram.g:7779:2: ( ruleEString )
            {
            // InternalProgram.g:7779:2: ( ruleEString )
            // InternalProgram.g:7780:3: ruleEString
            {
             before(grammarAccess.getPanelAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPanelAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__NameAssignment_1"


    // $ANTLR start "rule__Panel__AbstractAssignment_2_1"
    // InternalProgram.g:7789:1: rule__Panel__AbstractAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Panel__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7793:1: ( ( ruleEString ) )
            // InternalProgram.g:7794:2: ( ruleEString )
            {
            // InternalProgram.g:7794:2: ( ruleEString )
            // InternalProgram.g:7795:3: ruleEString
            {
             before(grammarAccess.getPanelAccess().getAbstractEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPanelAccess().getAbstractEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__AbstractAssignment_2_1"


    // $ANTLR start "rule__Panel__PanelistsAssignment_3_1"
    // InternalProgram.g:7804:1: rule__Panel__PanelistsAssignment_3_1 : ( rulePerson ) ;
    public final void rule__Panel__PanelistsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7808:1: ( ( rulePerson ) )
            // InternalProgram.g:7809:2: ( rulePerson )
            {
            // InternalProgram.g:7809:2: ( rulePerson )
            // InternalProgram.g:7810:3: rulePerson
            {
             before(grammarAccess.getPanelAccess().getPanelistsPersonParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPanelAccess().getPanelistsPersonParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__PanelistsAssignment_3_1"


    // $ANTLR start "rule__Panel__PanelistsAssignment_3_2_1"
    // InternalProgram.g:7819:1: rule__Panel__PanelistsAssignment_3_2_1 : ( rulePerson ) ;
    public final void rule__Panel__PanelistsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7823:1: ( ( rulePerson ) )
            // InternalProgram.g:7824:2: ( rulePerson )
            {
            // InternalProgram.g:7824:2: ( rulePerson )
            // InternalProgram.g:7825:3: rulePerson
            {
             before(grammarAccess.getPanelAccess().getPanelistsPersonParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPanelAccess().getPanelistsPersonParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__PanelistsAssignment_3_2_1"


    // $ANTLR start "rule__Panel__ModeratorsAssignment_4_1"
    // InternalProgram.g:7834:1: rule__Panel__ModeratorsAssignment_4_1 : ( rulePerson ) ;
    public final void rule__Panel__ModeratorsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7838:1: ( ( rulePerson ) )
            // InternalProgram.g:7839:2: ( rulePerson )
            {
            // InternalProgram.g:7839:2: ( rulePerson )
            // InternalProgram.g:7840:3: rulePerson
            {
             before(grammarAccess.getPanelAccess().getModeratorsPersonParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPanelAccess().getModeratorsPersonParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__ModeratorsAssignment_4_1"


    // $ANTLR start "rule__Panel__ModeratorsAssignment_4_2_1"
    // InternalProgram.g:7849:1: rule__Panel__ModeratorsAssignment_4_2_1 : ( rulePerson ) ;
    public final void rule__Panel__ModeratorsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7853:1: ( ( rulePerson ) )
            // InternalProgram.g:7854:2: ( rulePerson )
            {
            // InternalProgram.g:7854:2: ( rulePerson )
            // InternalProgram.g:7855:3: rulePerson
            {
             before(grammarAccess.getPanelAccess().getModeratorsPersonParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPanelAccess().getModeratorsPersonParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__ModeratorsAssignment_4_2_1"


    // $ANTLR start "rule__SRC__NameAssignment_1"
    // InternalProgram.g:7864:1: rule__SRC__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__SRC__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7868:1: ( ( ruleEString ) )
            // InternalProgram.g:7869:2: ( ruleEString )
            {
            // InternalProgram.g:7869:2: ( ruleEString )
            // InternalProgram.g:7870:3: ruleEString
            {
             before(grammarAccess.getSRCAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSRCAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRC__NameAssignment_1"


    // $ANTLR start "rule__SRC__AbstractAssignment_2_1"
    // InternalProgram.g:7879:1: rule__SRC__AbstractAssignment_2_1 : ( ruleEString ) ;
    public final void rule__SRC__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7883:1: ( ( ruleEString ) )
            // InternalProgram.g:7884:2: ( ruleEString )
            {
            // InternalProgram.g:7884:2: ( ruleEString )
            // InternalProgram.g:7885:3: ruleEString
            {
             before(grammarAccess.getSRCAccess().getAbstractEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSRCAccess().getAbstractEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRC__AbstractAssignment_2_1"


    // $ANTLR start "rule__Poster__NameAssignment_1"
    // InternalProgram.g:7894:1: rule__Poster__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Poster__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7898:1: ( ( ruleEString ) )
            // InternalProgram.g:7899:2: ( ruleEString )
            {
            // InternalProgram.g:7899:2: ( ruleEString )
            // InternalProgram.g:7900:3: ruleEString
            {
             before(grammarAccess.getPosterAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPosterAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poster__NameAssignment_1"


    // $ANTLR start "rule__Poster__AbstractAssignment_2_1"
    // InternalProgram.g:7909:1: rule__Poster__AbstractAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Poster__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7913:1: ( ( ruleEString ) )
            // InternalProgram.g:7914:2: ( ruleEString )
            {
            // InternalProgram.g:7914:2: ( ruleEString )
            // InternalProgram.g:7915:3: ruleEString
            {
             before(grammarAccess.getPosterAccess().getAbstractEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPosterAccess().getAbstractEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poster__AbstractAssignment_2_1"


    // $ANTLR start "rule__Keynote__NameAssignment_1"
    // InternalProgram.g:7924:1: rule__Keynote__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Keynote__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7928:1: ( ( ruleEString ) )
            // InternalProgram.g:7929:2: ( ruleEString )
            {
            // InternalProgram.g:7929:2: ( ruleEString )
            // InternalProgram.g:7930:3: ruleEString
            {
             before(grammarAccess.getKeynoteAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKeynoteAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__NameAssignment_1"


    // $ANTLR start "rule__Keynote__AbstractAssignment_2_1"
    // InternalProgram.g:7939:1: rule__Keynote__AbstractAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Keynote__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7943:1: ( ( ruleEString ) )
            // InternalProgram.g:7944:2: ( ruleEString )
            {
            // InternalProgram.g:7944:2: ( ruleEString )
            // InternalProgram.g:7945:3: ruleEString
            {
             before(grammarAccess.getKeynoteAccess().getAbstractEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKeynoteAccess().getAbstractEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__AbstractAssignment_2_1"


    // $ANTLR start "rule__Keynote__SpeakerAssignment_3_1"
    // InternalProgram.g:7954:1: rule__Keynote__SpeakerAssignment_3_1 : ( rulePerson ) ;
    public final void rule__Keynote__SpeakerAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7958:1: ( ( rulePerson ) )
            // InternalProgram.g:7959:2: ( rulePerson )
            {
            // InternalProgram.g:7959:2: ( rulePerson )
            // InternalProgram.g:7960:3: rulePerson
            {
             before(grammarAccess.getKeynoteAccess().getSpeakerPersonParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getKeynoteAccess().getSpeakerPersonParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__SpeakerAssignment_3_1"


    // $ANTLR start "rule__SponsorKeynote__NameAssignment_1"
    // InternalProgram.g:7969:1: rule__SponsorKeynote__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__SponsorKeynote__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7973:1: ( ( ruleEString ) )
            // InternalProgram.g:7974:2: ( ruleEString )
            {
            // InternalProgram.g:7974:2: ( ruleEString )
            // InternalProgram.g:7975:3: ruleEString
            {
             before(grammarAccess.getSponsorKeynoteAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSponsorKeynoteAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SponsorKeynote__NameAssignment_1"


    // $ANTLR start "rule__SponsorKeynote__AbstractAssignment_2_1"
    // InternalProgram.g:7984:1: rule__SponsorKeynote__AbstractAssignment_2_1 : ( ruleEString ) ;
    public final void rule__SponsorKeynote__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7988:1: ( ( ruleEString ) )
            // InternalProgram.g:7989:2: ( ruleEString )
            {
            // InternalProgram.g:7989:2: ( ruleEString )
            // InternalProgram.g:7990:3: ruleEString
            {
             before(grammarAccess.getSponsorKeynoteAccess().getAbstractEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSponsorKeynoteAccess().getAbstractEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SponsorKeynote__AbstractAssignment_2_1"


    // $ANTLR start "rule__SponsorKeynote__SpeakerAssignment_3_1"
    // InternalProgram.g:7999:1: rule__SponsorKeynote__SpeakerAssignment_3_1 : ( rulePerson ) ;
    public final void rule__SponsorKeynote__SpeakerAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8003:1: ( ( rulePerson ) )
            // InternalProgram.g:8004:2: ( rulePerson )
            {
            // InternalProgram.g:8004:2: ( rulePerson )
            // InternalProgram.g:8005:3: rulePerson
            {
             before(grammarAccess.getSponsorKeynoteAccess().getSpeakerPersonParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getSponsorKeynoteAccess().getSpeakerPersonParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SponsorKeynote__SpeakerAssignment_3_1"


    // $ANTLR start "rule__Workshop__NameAssignment_1"
    // InternalProgram.g:8014:1: rule__Workshop__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Workshop__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8018:1: ( ( ruleEString ) )
            // InternalProgram.g:8019:2: ( ruleEString )
            {
            // InternalProgram.g:8019:2: ( ruleEString )
            // InternalProgram.g:8020:3: ruleEString
            {
             before(grammarAccess.getWorkshopAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkshopAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__NameAssignment_1"


    // $ANTLR start "rule__Workshop__AbstractAssignment_2_1"
    // InternalProgram.g:8029:1: rule__Workshop__AbstractAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Workshop__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8033:1: ( ( ruleEString ) )
            // InternalProgram.g:8034:2: ( ruleEString )
            {
            // InternalProgram.g:8034:2: ( ruleEString )
            // InternalProgram.g:8035:3: ruleEString
            {
             before(grammarAccess.getWorkshopAccess().getAbstractEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkshopAccess().getAbstractEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__AbstractAssignment_2_1"


    // $ANTLR start "rule__Workshop__UrlAssignment_3_1"
    // InternalProgram.g:8044:1: rule__Workshop__UrlAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Workshop__UrlAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8048:1: ( ( ruleEString ) )
            // InternalProgram.g:8049:2: ( ruleEString )
            {
            // InternalProgram.g:8049:2: ( ruleEString )
            // InternalProgram.g:8050:3: ruleEString
            {
             before(grammarAccess.getWorkshopAccess().getUrlEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkshopAccess().getUrlEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__UrlAssignment_3_1"


    // $ANTLR start "rule__Workshop__FullNameAssignment_4_1"
    // InternalProgram.g:8059:1: rule__Workshop__FullNameAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Workshop__FullNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8063:1: ( ( ruleEString ) )
            // InternalProgram.g:8064:2: ( ruleEString )
            {
            // InternalProgram.g:8064:2: ( ruleEString )
            // InternalProgram.g:8065:3: ruleEString
            {
             before(grammarAccess.getWorkshopAccess().getFullNameEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkshopAccess().getFullNameEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__FullNameAssignment_4_1"


    // $ANTLR start "rule__Workshop__OrganizersAssignment_5_1"
    // InternalProgram.g:8074:1: rule__Workshop__OrganizersAssignment_5_1 : ( rulePerson ) ;
    public final void rule__Workshop__OrganizersAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8078:1: ( ( rulePerson ) )
            // InternalProgram.g:8079:2: ( rulePerson )
            {
            // InternalProgram.g:8079:2: ( rulePerson )
            // InternalProgram.g:8080:3: rulePerson
            {
             before(grammarAccess.getWorkshopAccess().getOrganizersPersonParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getWorkshopAccess().getOrganizersPersonParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__OrganizersAssignment_5_1"


    // $ANTLR start "rule__Workshop__OrganizersAssignment_5_2_1"
    // InternalProgram.g:8089:1: rule__Workshop__OrganizersAssignment_5_2_1 : ( rulePerson ) ;
    public final void rule__Workshop__OrganizersAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8093:1: ( ( rulePerson ) )
            // InternalProgram.g:8094:2: ( rulePerson )
            {
            // InternalProgram.g:8094:2: ( rulePerson )
            // InternalProgram.g:8095:3: rulePerson
            {
             before(grammarAccess.getWorkshopAccess().getOrganizersPersonParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getWorkshopAccess().getOrganizersPersonParserRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__OrganizersAssignment_5_2_1"


    // $ANTLR start "rule__Tutorial__NameAssignment_1"
    // InternalProgram.g:8104:1: rule__Tutorial__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Tutorial__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8108:1: ( ( ruleEString ) )
            // InternalProgram.g:8109:2: ( ruleEString )
            {
            // InternalProgram.g:8109:2: ( ruleEString )
            // InternalProgram.g:8110:3: ruleEString
            {
             before(grammarAccess.getTutorialAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTutorialAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__NameAssignment_1"


    // $ANTLR start "rule__Tutorial__AbstractAssignment_2_1"
    // InternalProgram.g:8119:1: rule__Tutorial__AbstractAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Tutorial__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8123:1: ( ( ruleEString ) )
            // InternalProgram.g:8124:2: ( ruleEString )
            {
            // InternalProgram.g:8124:2: ( ruleEString )
            // InternalProgram.g:8125:3: ruleEString
            {
             before(grammarAccess.getTutorialAccess().getAbstractEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTutorialAccess().getAbstractEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__AbstractAssignment_2_1"


    // $ANTLR start "rule__Tutorial__OrganizersAssignment_3_1"
    // InternalProgram.g:8134:1: rule__Tutorial__OrganizersAssignment_3_1 : ( rulePerson ) ;
    public final void rule__Tutorial__OrganizersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8138:1: ( ( rulePerson ) )
            // InternalProgram.g:8139:2: ( rulePerson )
            {
            // InternalProgram.g:8139:2: ( rulePerson )
            // InternalProgram.g:8140:3: rulePerson
            {
             before(grammarAccess.getTutorialAccess().getOrganizersPersonParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getTutorialAccess().getOrganizersPersonParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__OrganizersAssignment_3_1"


    // $ANTLR start "rule__Tutorial__OrganizersAssignment_3_2_1"
    // InternalProgram.g:8149:1: rule__Tutorial__OrganizersAssignment_3_2_1 : ( rulePerson ) ;
    public final void rule__Tutorial__OrganizersAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8153:1: ( ( rulePerson ) )
            // InternalProgram.g:8154:2: ( rulePerson )
            {
            // InternalProgram.g:8154:2: ( rulePerson )
            // InternalProgram.g:8155:3: rulePerson
            {
             before(grammarAccess.getTutorialAccess().getOrganizersPersonParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getTutorialAccess().getOrganizersPersonParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__OrganizersAssignment_3_2_1"


    // $ANTLR start "rule__DoctoralSymposium__NameAssignment_1"
    // InternalProgram.g:8164:1: rule__DoctoralSymposium__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__DoctoralSymposium__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8168:1: ( ( ruleEString ) )
            // InternalProgram.g:8169:2: ( ruleEString )
            {
            // InternalProgram.g:8169:2: ( ruleEString )
            // InternalProgram.g:8170:3: ruleEString
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDoctoralSymposiumAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__NameAssignment_1"


    // $ANTLR start "rule__DoctoralSymposium__AbstractAssignment_2_1"
    // InternalProgram.g:8179:1: rule__DoctoralSymposium__AbstractAssignment_2_1 : ( ruleEString ) ;
    public final void rule__DoctoralSymposium__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8183:1: ( ( ruleEString ) )
            // InternalProgram.g:8184:2: ( ruleEString )
            {
            // InternalProgram.g:8184:2: ( ruleEString )
            // InternalProgram.g:8185:3: ruleEString
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getAbstractEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDoctoralSymposiumAccess().getAbstractEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__AbstractAssignment_2_1"


    // $ANTLR start "rule__DoctoralSymposium__OrganizersAssignment_3_1"
    // InternalProgram.g:8194:1: rule__DoctoralSymposium__OrganizersAssignment_3_1 : ( rulePerson ) ;
    public final void rule__DoctoralSymposium__OrganizersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8198:1: ( ( rulePerson ) )
            // InternalProgram.g:8199:2: ( rulePerson )
            {
            // InternalProgram.g:8199:2: ( rulePerson )
            // InternalProgram.g:8200:3: rulePerson
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getOrganizersPersonParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getDoctoralSymposiumAccess().getOrganizersPersonParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__OrganizersAssignment_3_1"


    // $ANTLR start "rule__DoctoralSymposium__OrganizersAssignment_3_2_1"
    // InternalProgram.g:8209:1: rule__DoctoralSymposium__OrganizersAssignment_3_2_1 : ( rulePerson ) ;
    public final void rule__DoctoralSymposium__OrganizersAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8213:1: ( ( rulePerson ) )
            // InternalProgram.g:8214:2: ( rulePerson )
            {
            // InternalProgram.g:8214:2: ( rulePerson )
            // InternalProgram.g:8215:3: rulePerson
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getOrganizersPersonParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getDoctoralSymposiumAccess().getOrganizersPersonParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__OrganizersAssignment_3_2_1"


    // $ANTLR start "rule__EducatorSymposium__NameAssignment_1"
    // InternalProgram.g:8224:1: rule__EducatorSymposium__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__EducatorSymposium__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8228:1: ( ( ruleEString ) )
            // InternalProgram.g:8229:2: ( ruleEString )
            {
            // InternalProgram.g:8229:2: ( ruleEString )
            // InternalProgram.g:8230:3: ruleEString
            {
             before(grammarAccess.getEducatorSymposiumAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEducatorSymposiumAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__NameAssignment_1"


    // $ANTLR start "rule__EducatorSymposium__AbstractAssignment_2_1"
    // InternalProgram.g:8239:1: rule__EducatorSymposium__AbstractAssignment_2_1 : ( ruleEString ) ;
    public final void rule__EducatorSymposium__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8243:1: ( ( ruleEString ) )
            // InternalProgram.g:8244:2: ( ruleEString )
            {
            // InternalProgram.g:8244:2: ( ruleEString )
            // InternalProgram.g:8245:3: ruleEString
            {
             before(grammarAccess.getEducatorSymposiumAccess().getAbstractEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEducatorSymposiumAccess().getAbstractEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__AbstractAssignment_2_1"


    // $ANTLR start "rule__EducatorSymposium__OrganizersAssignment_3_1"
    // InternalProgram.g:8254:1: rule__EducatorSymposium__OrganizersAssignment_3_1 : ( rulePerson ) ;
    public final void rule__EducatorSymposium__OrganizersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8258:1: ( ( rulePerson ) )
            // InternalProgram.g:8259:2: ( rulePerson )
            {
            // InternalProgram.g:8259:2: ( rulePerson )
            // InternalProgram.g:8260:3: rulePerson
            {
             before(grammarAccess.getEducatorSymposiumAccess().getOrganizersPersonParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getEducatorSymposiumAccess().getOrganizersPersonParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__OrganizersAssignment_3_1"


    // $ANTLR start "rule__EducatorSymposium__OrganizersAssignment_3_2_1"
    // InternalProgram.g:8269:1: rule__EducatorSymposium__OrganizersAssignment_3_2_1 : ( rulePerson ) ;
    public final void rule__EducatorSymposium__OrganizersAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8273:1: ( ( rulePerson ) )
            // InternalProgram.g:8274:2: ( rulePerson )
            {
            // InternalProgram.g:8274:2: ( rulePerson )
            // InternalProgram.g:8275:3: rulePerson
            {
             before(grammarAccess.getEducatorSymposiumAccess().getOrganizersPersonParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getEducatorSymposiumAccess().getOrganizersPersonParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__OrganizersAssignment_3_2_1"


    // $ANTLR start "rule__Reception__NameAssignment_1"
    // InternalProgram.g:8284:1: rule__Reception__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Reception__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8288:1: ( ( ruleEString ) )
            // InternalProgram.g:8289:2: ( ruleEString )
            {
            // InternalProgram.g:8289:2: ( ruleEString )
            // InternalProgram.g:8290:3: ruleEString
            {
             before(grammarAccess.getReceptionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReceptionAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reception__NameAssignment_1"


    // $ANTLR start "rule__Reception__AbstractAssignment_2_1"
    // InternalProgram.g:8299:1: rule__Reception__AbstractAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Reception__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8303:1: ( ( ruleEString ) )
            // InternalProgram.g:8304:2: ( ruleEString )
            {
            // InternalProgram.g:8304:2: ( ruleEString )
            // InternalProgram.g:8305:3: ruleEString
            {
             before(grammarAccess.getReceptionAccess().getAbstractEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReceptionAccess().getAbstractEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reception__AbstractAssignment_2_1"


    // $ANTLR start "rule__Clinic__NameAssignment_1"
    // InternalProgram.g:8314:1: rule__Clinic__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Clinic__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8318:1: ( ( ruleEString ) )
            // InternalProgram.g:8319:2: ( ruleEString )
            {
            // InternalProgram.g:8319:2: ( ruleEString )
            // InternalProgram.g:8320:3: ruleEString
            {
             before(grammarAccess.getClinicAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClinicAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clinic__NameAssignment_1"


    // $ANTLR start "rule__Clinic__AbstractAssignment_2_1"
    // InternalProgram.g:8329:1: rule__Clinic__AbstractAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Clinic__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8333:1: ( ( ruleEString ) )
            // InternalProgram.g:8334:2: ( ruleEString )
            {
            // InternalProgram.g:8334:2: ( ruleEString )
            // InternalProgram.g:8335:3: ruleEString
            {
             before(grammarAccess.getClinicAccess().getAbstractEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClinicAccess().getAbstractEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clinic__AbstractAssignment_2_1"


    // $ANTLR start "rule__Lunch__NameAssignment_1"
    // InternalProgram.g:8344:1: rule__Lunch__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Lunch__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8348:1: ( ( ruleEString ) )
            // InternalProgram.g:8349:2: ( ruleEString )
            {
            // InternalProgram.g:8349:2: ( ruleEString )
            // InternalProgram.g:8350:3: ruleEString
            {
             before(grammarAccess.getLunchAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLunchAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__NameAssignment_1"


    // $ANTLR start "rule__Lunch__AbstractAssignment_2_1"
    // InternalProgram.g:8359:1: rule__Lunch__AbstractAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Lunch__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8363:1: ( ( ruleEString ) )
            // InternalProgram.g:8364:2: ( ruleEString )
            {
            // InternalProgram.g:8364:2: ( ruleEString )
            // InternalProgram.g:8365:3: ruleEString
            {
             before(grammarAccess.getLunchAccess().getAbstractEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLunchAccess().getAbstractEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__AbstractAssignment_2_1"


    // $ANTLR start "rule__CoffeeBreak__NameAssignment_1"
    // InternalProgram.g:8374:1: rule__CoffeeBreak__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CoffeeBreak__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8378:1: ( ( ruleEString ) )
            // InternalProgram.g:8379:2: ( ruleEString )
            {
            // InternalProgram.g:8379:2: ( ruleEString )
            // InternalProgram.g:8380:3: ruleEString
            {
             before(grammarAccess.getCoffeeBreakAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCoffeeBreakAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoffeeBreak__NameAssignment_1"


    // $ANTLR start "rule__CoffeeBreak__AbstractAssignment_2_1"
    // InternalProgram.g:8389:1: rule__CoffeeBreak__AbstractAssignment_2_1 : ( ruleEString ) ;
    public final void rule__CoffeeBreak__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8393:1: ( ( ruleEString ) )
            // InternalProgram.g:8394:2: ( ruleEString )
            {
            // InternalProgram.g:8394:2: ( ruleEString )
            // InternalProgram.g:8395:3: ruleEString
            {
             before(grammarAccess.getCoffeeBreakAccess().getAbstractEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCoffeeBreakAccess().getAbstractEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoffeeBreak__AbstractAssignment_2_1"


    // $ANTLR start "rule__Meeting__NameAssignment_1"
    // InternalProgram.g:8404:1: rule__Meeting__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Meeting__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8408:1: ( ( ruleEString ) )
            // InternalProgram.g:8409:2: ( ruleEString )
            {
            // InternalProgram.g:8409:2: ( ruleEString )
            // InternalProgram.g:8410:3: ruleEString
            {
             before(grammarAccess.getMeetingAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMeetingAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__NameAssignment_1"


    // $ANTLR start "rule__Meeting__AbstractAssignment_2_1"
    // InternalProgram.g:8419:1: rule__Meeting__AbstractAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Meeting__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8423:1: ( ( ruleEString ) )
            // InternalProgram.g:8424:2: ( ruleEString )
            {
            // InternalProgram.g:8424:2: ( ruleEString )
            // InternalProgram.g:8425:3: ruleEString
            {
             before(grammarAccess.getMeetingAccess().getAbstractEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMeetingAccess().getAbstractEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__AbstractAssignment_2_1"


    // $ANTLR start "rule__Opening__NameAssignment_1"
    // InternalProgram.g:8434:1: rule__Opening__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Opening__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8438:1: ( ( ruleEString ) )
            // InternalProgram.g:8439:2: ( ruleEString )
            {
            // InternalProgram.g:8439:2: ( ruleEString )
            // InternalProgram.g:8440:3: ruleEString
            {
             before(grammarAccess.getOpeningAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpeningAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Opening__NameAssignment_1"


    // $ANTLR start "rule__Opening__AbstractAssignment_2_1"
    // InternalProgram.g:8449:1: rule__Opening__AbstractAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Opening__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8453:1: ( ( ruleEString ) )
            // InternalProgram.g:8454:2: ( ruleEString )
            {
            // InternalProgram.g:8454:2: ( ruleEString )
            // InternalProgram.g:8455:3: ruleEString
            {
             before(grammarAccess.getOpeningAccess().getAbstractEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpeningAccess().getAbstractEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Opening__AbstractAssignment_2_1"


    // $ANTLR start "rule__Paper__NameAssignment_1"
    // InternalProgram.g:8464:1: rule__Paper__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Paper__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8468:1: ( ( ruleEString ) )
            // InternalProgram.g:8469:2: ( ruleEString )
            {
            // InternalProgram.g:8469:2: ( ruleEString )
            // InternalProgram.g:8470:3: ruleEString
            {
             before(grammarAccess.getPaperAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPaperAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__NameAssignment_1"


    // $ANTLR start "rule__Paper__AuthorsAssignment_3"
    // InternalProgram.g:8479:1: rule__Paper__AuthorsAssignment_3 : ( rulePerson ) ;
    public final void rule__Paper__AuthorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8483:1: ( ( rulePerson ) )
            // InternalProgram.g:8484:2: ( rulePerson )
            {
            // InternalProgram.g:8484:2: ( rulePerson )
            // InternalProgram.g:8485:3: rulePerson
            {
             before(grammarAccess.getPaperAccess().getAuthorsPersonParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPaperAccess().getAuthorsPersonParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__AuthorsAssignment_3"


    // $ANTLR start "rule__Paper__AuthorsAssignment_4_1"
    // InternalProgram.g:8494:1: rule__Paper__AuthorsAssignment_4_1 : ( rulePerson ) ;
    public final void rule__Paper__AuthorsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8498:1: ( ( rulePerson ) )
            // InternalProgram.g:8499:2: ( rulePerson )
            {
            // InternalProgram.g:8499:2: ( rulePerson )
            // InternalProgram.g:8500:3: rulePerson
            {
             before(grammarAccess.getPaperAccess().getAuthorsPersonParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPaperAccess().getAuthorsPersonParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__AuthorsAssignment_4_1"


    // $ANTLR start "rule__Paper__AbstractAssignment_5_1"
    // InternalProgram.g:8509:1: rule__Paper__AbstractAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Paper__AbstractAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8513:1: ( ( ruleEString ) )
            // InternalProgram.g:8514:2: ( ruleEString )
            {
            // InternalProgram.g:8514:2: ( ruleEString )
            // InternalProgram.g:8515:3: ruleEString
            {
             before(grammarAccess.getPaperAccess().getAbstractEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPaperAccess().getAbstractEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__AbstractAssignment_5_1"


    // $ANTLR start "rule__Paper__PreprintAssignment_6_1"
    // InternalProgram.g:8524:1: rule__Paper__PreprintAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Paper__PreprintAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8528:1: ( ( ruleEString ) )
            // InternalProgram.g:8529:2: ( ruleEString )
            {
            // InternalProgram.g:8529:2: ( ruleEString )
            // InternalProgram.g:8530:3: ruleEString
            {
             before(grammarAccess.getPaperAccess().getPreprintEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPaperAccess().getPreprintEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__PreprintAssignment_6_1"


    // $ANTLR start "rule__Paper__KindAssignment_7_1"
    // InternalProgram.g:8539:1: rule__Paper__KindAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__Paper__KindAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8543:1: ( ( ( ruleEString ) ) )
            // InternalProgram.g:8544:2: ( ( ruleEString ) )
            {
            // InternalProgram.g:8544:2: ( ( ruleEString ) )
            // InternalProgram.g:8545:3: ( ruleEString )
            {
             before(grammarAccess.getPaperAccess().getKindKindCrossReference_7_1_0()); 
            // InternalProgram.g:8546:3: ( ruleEString )
            // InternalProgram.g:8547:4: ruleEString
            {
             before(grammarAccess.getPaperAccess().getKindKindEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPaperAccess().getKindKindEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getPaperAccess().getKindKindCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__KindAssignment_7_1"


    // $ANTLR start "rule__Person__NameAssignment_1"
    // InternalProgram.g:8558:1: rule__Person__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Person__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8562:1: ( ( ruleEString ) )
            // InternalProgram.g:8563:2: ( ruleEString )
            {
            // InternalProgram.g:8563:2: ( ruleEString )
            // InternalProgram.g:8564:3: ruleEString
            {
             before(grammarAccess.getPersonAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__NameAssignment_1"


    // $ANTLR start "rule__Person__EmailAssignment_2_1"
    // InternalProgram.g:8573:1: rule__Person__EmailAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Person__EmailAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8577:1: ( ( ruleEString ) )
            // InternalProgram.g:8578:2: ( ruleEString )
            {
            // InternalProgram.g:8578:2: ( ruleEString )
            // InternalProgram.g:8579:3: ruleEString
            {
             before(grammarAccess.getPersonAccess().getEmailEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getEmailEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__EmailAssignment_2_1"


    // $ANTLR start "rule__Person__HomepageAssignment_3_1"
    // InternalProgram.g:8588:1: rule__Person__HomepageAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Person__HomepageAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8592:1: ( ( ruleEString ) )
            // InternalProgram.g:8593:2: ( ruleEString )
            {
            // InternalProgram.g:8593:2: ( ruleEString )
            // InternalProgram.g:8594:3: ruleEString
            {
             before(grammarAccess.getPersonAccess().getHomepageEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getHomepageEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__HomepageAssignment_3_1"


    // $ANTLR start "rule__Kind__NameAssignment_1"
    // InternalProgram.g:8603:1: rule__Kind__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Kind__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8607:1: ( ( ruleEString ) )
            // InternalProgram.g:8608:2: ( ruleEString )
            {
            // InternalProgram.g:8608:2: ( ruleEString )
            // InternalProgram.g:8609:3: ruleEString
            {
             before(grammarAccess.getKindAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKindAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000018D00000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0FF8DC9000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000203F800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000003F800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000003F802L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000006000800000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000034000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000204000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0007004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0004004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x6000004000200000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});

}