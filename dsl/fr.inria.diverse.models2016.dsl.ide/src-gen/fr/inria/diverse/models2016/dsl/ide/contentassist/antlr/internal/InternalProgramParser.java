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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Monday'", "'Tuesday'", "'Wednesday'", "'Thursday'", "'Friday'", "'Saturday'", "'Sunday'", "'Practice and Innovation'", "'Research'", "'talk duration'", "'resources'", "'papers'", "'{'", "'}'", "';'", "'events'", "'program'", "'room'", "'capacity'", "'date'", "'.'", "':'", "'-'", "'in'", "','", "'TalkSession'", "'chair'", "'abstract'", "'Panel'", "'panelists'", "'moderators'", "'Workshop'", "'url'", "'id'", "'organizers'", "'Tutorial'", "'DoctoralSymposium'", "'EducatorSymposium'", "'Reception'", "'Clinic'", "'Lunch'", "'CoffeeBreak'", "'Meeting'", "'authors'", "'preprint'", "'kind'", "'email'", "'homepage'"
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


    // $ANTLR start "entryRuleWorkshop"
    // InternalProgram.g:378:1: entryRuleWorkshop : ruleWorkshop EOF ;
    public final void entryRuleWorkshop() throws RecognitionException {
        try {
            // InternalProgram.g:379:1: ( ruleWorkshop EOF )
            // InternalProgram.g:380:1: ruleWorkshop EOF
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
    // InternalProgram.g:387:1: ruleWorkshop : ( ( rule__Workshop__Group__0 ) ) ;
    public final void ruleWorkshop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:391:2: ( ( ( rule__Workshop__Group__0 ) ) )
            // InternalProgram.g:392:2: ( ( rule__Workshop__Group__0 ) )
            {
            // InternalProgram.g:392:2: ( ( rule__Workshop__Group__0 ) )
            // InternalProgram.g:393:3: ( rule__Workshop__Group__0 )
            {
             before(grammarAccess.getWorkshopAccess().getGroup()); 
            // InternalProgram.g:394:3: ( rule__Workshop__Group__0 )
            // InternalProgram.g:394:4: rule__Workshop__Group__0
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
    // InternalProgram.g:403:1: entryRuleTutorial : ruleTutorial EOF ;
    public final void entryRuleTutorial() throws RecognitionException {
        try {
            // InternalProgram.g:404:1: ( ruleTutorial EOF )
            // InternalProgram.g:405:1: ruleTutorial EOF
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
    // InternalProgram.g:412:1: ruleTutorial : ( ( rule__Tutorial__Group__0 ) ) ;
    public final void ruleTutorial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:416:2: ( ( ( rule__Tutorial__Group__0 ) ) )
            // InternalProgram.g:417:2: ( ( rule__Tutorial__Group__0 ) )
            {
            // InternalProgram.g:417:2: ( ( rule__Tutorial__Group__0 ) )
            // InternalProgram.g:418:3: ( rule__Tutorial__Group__0 )
            {
             before(grammarAccess.getTutorialAccess().getGroup()); 
            // InternalProgram.g:419:3: ( rule__Tutorial__Group__0 )
            // InternalProgram.g:419:4: rule__Tutorial__Group__0
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
    // InternalProgram.g:428:1: entryRuleDoctoralSymposium : ruleDoctoralSymposium EOF ;
    public final void entryRuleDoctoralSymposium() throws RecognitionException {
        try {
            // InternalProgram.g:429:1: ( ruleDoctoralSymposium EOF )
            // InternalProgram.g:430:1: ruleDoctoralSymposium EOF
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
    // InternalProgram.g:437:1: ruleDoctoralSymposium : ( ( rule__DoctoralSymposium__Group__0 ) ) ;
    public final void ruleDoctoralSymposium() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:441:2: ( ( ( rule__DoctoralSymposium__Group__0 ) ) )
            // InternalProgram.g:442:2: ( ( rule__DoctoralSymposium__Group__0 ) )
            {
            // InternalProgram.g:442:2: ( ( rule__DoctoralSymposium__Group__0 ) )
            // InternalProgram.g:443:3: ( rule__DoctoralSymposium__Group__0 )
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getGroup()); 
            // InternalProgram.g:444:3: ( rule__DoctoralSymposium__Group__0 )
            // InternalProgram.g:444:4: rule__DoctoralSymposium__Group__0
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
    // InternalProgram.g:453:1: entryRuleEducatorSymposium : ruleEducatorSymposium EOF ;
    public final void entryRuleEducatorSymposium() throws RecognitionException {
        try {
            // InternalProgram.g:454:1: ( ruleEducatorSymposium EOF )
            // InternalProgram.g:455:1: ruleEducatorSymposium EOF
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
    // InternalProgram.g:462:1: ruleEducatorSymposium : ( ( rule__EducatorSymposium__Group__0 ) ) ;
    public final void ruleEducatorSymposium() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:466:2: ( ( ( rule__EducatorSymposium__Group__0 ) ) )
            // InternalProgram.g:467:2: ( ( rule__EducatorSymposium__Group__0 ) )
            {
            // InternalProgram.g:467:2: ( ( rule__EducatorSymposium__Group__0 ) )
            // InternalProgram.g:468:3: ( rule__EducatorSymposium__Group__0 )
            {
             before(grammarAccess.getEducatorSymposiumAccess().getGroup()); 
            // InternalProgram.g:469:3: ( rule__EducatorSymposium__Group__0 )
            // InternalProgram.g:469:4: rule__EducatorSymposium__Group__0
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
    // InternalProgram.g:478:1: entryRuleReception : ruleReception EOF ;
    public final void entryRuleReception() throws RecognitionException {
        try {
            // InternalProgram.g:479:1: ( ruleReception EOF )
            // InternalProgram.g:480:1: ruleReception EOF
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
    // InternalProgram.g:487:1: ruleReception : ( ( rule__Reception__Group__0 ) ) ;
    public final void ruleReception() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:491:2: ( ( ( rule__Reception__Group__0 ) ) )
            // InternalProgram.g:492:2: ( ( rule__Reception__Group__0 ) )
            {
            // InternalProgram.g:492:2: ( ( rule__Reception__Group__0 ) )
            // InternalProgram.g:493:3: ( rule__Reception__Group__0 )
            {
             before(grammarAccess.getReceptionAccess().getGroup()); 
            // InternalProgram.g:494:3: ( rule__Reception__Group__0 )
            // InternalProgram.g:494:4: rule__Reception__Group__0
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
    // InternalProgram.g:503:1: entryRuleClinic : ruleClinic EOF ;
    public final void entryRuleClinic() throws RecognitionException {
        try {
            // InternalProgram.g:504:1: ( ruleClinic EOF )
            // InternalProgram.g:505:1: ruleClinic EOF
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
    // InternalProgram.g:512:1: ruleClinic : ( ( rule__Clinic__Group__0 ) ) ;
    public final void ruleClinic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:516:2: ( ( ( rule__Clinic__Group__0 ) ) )
            // InternalProgram.g:517:2: ( ( rule__Clinic__Group__0 ) )
            {
            // InternalProgram.g:517:2: ( ( rule__Clinic__Group__0 ) )
            // InternalProgram.g:518:3: ( rule__Clinic__Group__0 )
            {
             before(grammarAccess.getClinicAccess().getGroup()); 
            // InternalProgram.g:519:3: ( rule__Clinic__Group__0 )
            // InternalProgram.g:519:4: rule__Clinic__Group__0
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
    // InternalProgram.g:528:1: entryRuleLunch : ruleLunch EOF ;
    public final void entryRuleLunch() throws RecognitionException {
        try {
            // InternalProgram.g:529:1: ( ruleLunch EOF )
            // InternalProgram.g:530:1: ruleLunch EOF
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
    // InternalProgram.g:537:1: ruleLunch : ( ( rule__Lunch__Group__0 ) ) ;
    public final void ruleLunch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:541:2: ( ( ( rule__Lunch__Group__0 ) ) )
            // InternalProgram.g:542:2: ( ( rule__Lunch__Group__0 ) )
            {
            // InternalProgram.g:542:2: ( ( rule__Lunch__Group__0 ) )
            // InternalProgram.g:543:3: ( rule__Lunch__Group__0 )
            {
             before(grammarAccess.getLunchAccess().getGroup()); 
            // InternalProgram.g:544:3: ( rule__Lunch__Group__0 )
            // InternalProgram.g:544:4: rule__Lunch__Group__0
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
    // InternalProgram.g:553:1: entryRuleCoffeeBreak : ruleCoffeeBreak EOF ;
    public final void entryRuleCoffeeBreak() throws RecognitionException {
        try {
            // InternalProgram.g:554:1: ( ruleCoffeeBreak EOF )
            // InternalProgram.g:555:1: ruleCoffeeBreak EOF
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
    // InternalProgram.g:562:1: ruleCoffeeBreak : ( ( rule__CoffeeBreak__Group__0 ) ) ;
    public final void ruleCoffeeBreak() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:566:2: ( ( ( rule__CoffeeBreak__Group__0 ) ) )
            // InternalProgram.g:567:2: ( ( rule__CoffeeBreak__Group__0 ) )
            {
            // InternalProgram.g:567:2: ( ( rule__CoffeeBreak__Group__0 ) )
            // InternalProgram.g:568:3: ( rule__CoffeeBreak__Group__0 )
            {
             before(grammarAccess.getCoffeeBreakAccess().getGroup()); 
            // InternalProgram.g:569:3: ( rule__CoffeeBreak__Group__0 )
            // InternalProgram.g:569:4: rule__CoffeeBreak__Group__0
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
    // InternalProgram.g:578:1: entryRuleMeeting : ruleMeeting EOF ;
    public final void entryRuleMeeting() throws RecognitionException {
        try {
            // InternalProgram.g:579:1: ( ruleMeeting EOF )
            // InternalProgram.g:580:1: ruleMeeting EOF
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
    // InternalProgram.g:587:1: ruleMeeting : ( ( rule__Meeting__Group__0 ) ) ;
    public final void ruleMeeting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:591:2: ( ( ( rule__Meeting__Group__0 ) ) )
            // InternalProgram.g:592:2: ( ( rule__Meeting__Group__0 ) )
            {
            // InternalProgram.g:592:2: ( ( rule__Meeting__Group__0 ) )
            // InternalProgram.g:593:3: ( rule__Meeting__Group__0 )
            {
             before(grammarAccess.getMeetingAccess().getGroup()); 
            // InternalProgram.g:594:3: ( rule__Meeting__Group__0 )
            // InternalProgram.g:594:4: rule__Meeting__Group__0
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


    // $ANTLR start "entryRulePaper"
    // InternalProgram.g:603:1: entryRulePaper : rulePaper EOF ;
    public final void entryRulePaper() throws RecognitionException {
        try {
            // InternalProgram.g:604:1: ( rulePaper EOF )
            // InternalProgram.g:605:1: rulePaper EOF
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
    // InternalProgram.g:612:1: rulePaper : ( ( rule__Paper__Group__0 ) ) ;
    public final void rulePaper() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:616:2: ( ( ( rule__Paper__Group__0 ) ) )
            // InternalProgram.g:617:2: ( ( rule__Paper__Group__0 ) )
            {
            // InternalProgram.g:617:2: ( ( rule__Paper__Group__0 ) )
            // InternalProgram.g:618:3: ( rule__Paper__Group__0 )
            {
             before(grammarAccess.getPaperAccess().getGroup()); 
            // InternalProgram.g:619:3: ( rule__Paper__Group__0 )
            // InternalProgram.g:619:4: rule__Paper__Group__0
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
    // InternalProgram.g:628:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalProgram.g:629:1: ( rulePerson EOF )
            // InternalProgram.g:630:1: rulePerson EOF
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
    // InternalProgram.g:637:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:641:2: ( ( ( rule__Person__Group__0 ) ) )
            // InternalProgram.g:642:2: ( ( rule__Person__Group__0 ) )
            {
            // InternalProgram.g:642:2: ( ( rule__Person__Group__0 ) )
            // InternalProgram.g:643:3: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // InternalProgram.g:644:3: ( rule__Person__Group__0 )
            // InternalProgram.g:644:4: rule__Person__Group__0
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


    // $ANTLR start "ruleWeekDay"
    // InternalProgram.g:653:1: ruleWeekDay : ( ( rule__WeekDay__Alternatives ) ) ;
    public final void ruleWeekDay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:657:1: ( ( ( rule__WeekDay__Alternatives ) ) )
            // InternalProgram.g:658:2: ( ( rule__WeekDay__Alternatives ) )
            {
            // InternalProgram.g:658:2: ( ( rule__WeekDay__Alternatives ) )
            // InternalProgram.g:659:3: ( rule__WeekDay__Alternatives )
            {
             before(grammarAccess.getWeekDayAccess().getAlternatives()); 
            // InternalProgram.g:660:3: ( rule__WeekDay__Alternatives )
            // InternalProgram.g:660:4: rule__WeekDay__Alternatives
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


    // $ANTLR start "ruleTrack"
    // InternalProgram.g:669:1: ruleTrack : ( ( rule__Track__Alternatives ) ) ;
    public final void ruleTrack() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:673:1: ( ( ( rule__Track__Alternatives ) ) )
            // InternalProgram.g:674:2: ( ( rule__Track__Alternatives ) )
            {
            // InternalProgram.g:674:2: ( ( rule__Track__Alternatives ) )
            // InternalProgram.g:675:3: ( rule__Track__Alternatives )
            {
             before(grammarAccess.getTrackAccess().getAlternatives()); 
            // InternalProgram.g:676:3: ( rule__Track__Alternatives )
            // InternalProgram.g:676:4: rule__Track__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Track__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTrackAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrack"


    // $ANTLR start "rule__Event__Alternatives"
    // InternalProgram.g:684:1: rule__Event__Alternatives : ( ( ruleTalkSession ) | ( rulePanel ) | ( ruleWorkshop ) | ( ruleTutorial ) | ( ruleDoctoralSymposium ) | ( ruleEducatorSymposium ) | ( ruleReception ) | ( ruleClinic ) | ( ruleLunch ) | ( ruleCoffeeBreak ) | ( ruleMeeting ) );
    public final void rule__Event__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:688:1: ( ( ruleTalkSession ) | ( rulePanel ) | ( ruleWorkshop ) | ( ruleTutorial ) | ( ruleDoctoralSymposium ) | ( ruleEducatorSymposium ) | ( ruleReception ) | ( ruleClinic ) | ( ruleLunch ) | ( ruleCoffeeBreak ) | ( ruleMeeting ) )
            int alt1=11;
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
            case 42:
                {
                alt1=3;
                }
                break;
            case 46:
                {
                alt1=4;
                }
                break;
            case 47:
                {
                alt1=5;
                }
                break;
            case 48:
                {
                alt1=6;
                }
                break;
            case 49:
                {
                alt1=7;
                }
                break;
            case 50:
                {
                alt1=8;
                }
                break;
            case 51:
                {
                alt1=9;
                }
                break;
            case 52:
                {
                alt1=10;
                }
                break;
            case 53:
                {
                alt1=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalProgram.g:689:2: ( ruleTalkSession )
                    {
                    // InternalProgram.g:689:2: ( ruleTalkSession )
                    // InternalProgram.g:690:3: ruleTalkSession
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
                    // InternalProgram.g:695:2: ( rulePanel )
                    {
                    // InternalProgram.g:695:2: ( rulePanel )
                    // InternalProgram.g:696:3: rulePanel
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
                    // InternalProgram.g:701:2: ( ruleWorkshop )
                    {
                    // InternalProgram.g:701:2: ( ruleWorkshop )
                    // InternalProgram.g:702:3: ruleWorkshop
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
                    // InternalProgram.g:707:2: ( ruleTutorial )
                    {
                    // InternalProgram.g:707:2: ( ruleTutorial )
                    // InternalProgram.g:708:3: ruleTutorial
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
                    // InternalProgram.g:713:2: ( ruleDoctoralSymposium )
                    {
                    // InternalProgram.g:713:2: ( ruleDoctoralSymposium )
                    // InternalProgram.g:714:3: ruleDoctoralSymposium
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
                    // InternalProgram.g:719:2: ( ruleEducatorSymposium )
                    {
                    // InternalProgram.g:719:2: ( ruleEducatorSymposium )
                    // InternalProgram.g:720:3: ruleEducatorSymposium
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
                    // InternalProgram.g:725:2: ( ruleReception )
                    {
                    // InternalProgram.g:725:2: ( ruleReception )
                    // InternalProgram.g:726:3: ruleReception
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
                    // InternalProgram.g:731:2: ( ruleClinic )
                    {
                    // InternalProgram.g:731:2: ( ruleClinic )
                    // InternalProgram.g:732:3: ruleClinic
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
                    // InternalProgram.g:737:2: ( ruleLunch )
                    {
                    // InternalProgram.g:737:2: ( ruleLunch )
                    // InternalProgram.g:738:3: ruleLunch
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
                    // InternalProgram.g:743:2: ( ruleCoffeeBreak )
                    {
                    // InternalProgram.g:743:2: ( ruleCoffeeBreak )
                    // InternalProgram.g:744:3: ruleCoffeeBreak
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
                    // InternalProgram.g:749:2: ( ruleMeeting )
                    {
                    // InternalProgram.g:749:2: ( ruleMeeting )
                    // InternalProgram.g:750:3: ruleMeeting
                    {
                     before(grammarAccess.getEventAccess().getMeetingParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleMeeting();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getMeetingParserRuleCall_10()); 

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
    // InternalProgram.g:759:1: rule__WeekDay__Alternatives : ( ( ( 'Monday' ) ) | ( ( 'Tuesday' ) ) | ( ( 'Wednesday' ) ) | ( ( 'Thursday' ) ) | ( ( 'Friday' ) ) | ( ( 'Saturday' ) ) | ( ( 'Sunday' ) ) );
    public final void rule__WeekDay__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:763:1: ( ( ( 'Monday' ) ) | ( ( 'Tuesday' ) ) | ( ( 'Wednesday' ) ) | ( ( 'Thursday' ) ) | ( ( 'Friday' ) ) | ( ( 'Saturday' ) ) | ( ( 'Sunday' ) ) )
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
                    // InternalProgram.g:764:2: ( ( 'Monday' ) )
                    {
                    // InternalProgram.g:764:2: ( ( 'Monday' ) )
                    // InternalProgram.g:765:3: ( 'Monday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getMondayEnumLiteralDeclaration_0()); 
                    // InternalProgram.g:766:3: ( 'Monday' )
                    // InternalProgram.g:766:4: 'Monday'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getMondayEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProgram.g:770:2: ( ( 'Tuesday' ) )
                    {
                    // InternalProgram.g:770:2: ( ( 'Tuesday' ) )
                    // InternalProgram.g:771:3: ( 'Tuesday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getTuesdayEnumLiteralDeclaration_1()); 
                    // InternalProgram.g:772:3: ( 'Tuesday' )
                    // InternalProgram.g:772:4: 'Tuesday'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getTuesdayEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProgram.g:776:2: ( ( 'Wednesday' ) )
                    {
                    // InternalProgram.g:776:2: ( ( 'Wednesday' ) )
                    // InternalProgram.g:777:3: ( 'Wednesday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getWednesdayEnumLiteralDeclaration_2()); 
                    // InternalProgram.g:778:3: ( 'Wednesday' )
                    // InternalProgram.g:778:4: 'Wednesday'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getWednesdayEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalProgram.g:782:2: ( ( 'Thursday' ) )
                    {
                    // InternalProgram.g:782:2: ( ( 'Thursday' ) )
                    // InternalProgram.g:783:3: ( 'Thursday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getThursdayEnumLiteralDeclaration_3()); 
                    // InternalProgram.g:784:3: ( 'Thursday' )
                    // InternalProgram.g:784:4: 'Thursday'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getThursdayEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalProgram.g:788:2: ( ( 'Friday' ) )
                    {
                    // InternalProgram.g:788:2: ( ( 'Friday' ) )
                    // InternalProgram.g:789:3: ( 'Friday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getFridayEnumLiteralDeclaration_4()); 
                    // InternalProgram.g:790:3: ( 'Friday' )
                    // InternalProgram.g:790:4: 'Friday'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getFridayEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalProgram.g:794:2: ( ( 'Saturday' ) )
                    {
                    // InternalProgram.g:794:2: ( ( 'Saturday' ) )
                    // InternalProgram.g:795:3: ( 'Saturday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getSaturdayEnumLiteralDeclaration_5()); 
                    // InternalProgram.g:796:3: ( 'Saturday' )
                    // InternalProgram.g:796:4: 'Saturday'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getSaturdayEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalProgram.g:800:2: ( ( 'Sunday' ) )
                    {
                    // InternalProgram.g:800:2: ( ( 'Sunday' ) )
                    // InternalProgram.g:801:3: ( 'Sunday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getSundayEnumLiteralDeclaration_6()); 
                    // InternalProgram.g:802:3: ( 'Sunday' )
                    // InternalProgram.g:802:4: 'Sunday'
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


    // $ANTLR start "rule__Track__Alternatives"
    // InternalProgram.g:810:1: rule__Track__Alternatives : ( ( ( 'Practice and Innovation' ) ) | ( ( 'Research' ) ) );
    public final void rule__Track__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:814:1: ( ( ( 'Practice and Innovation' ) ) | ( ( 'Research' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalProgram.g:815:2: ( ( 'Practice and Innovation' ) )
                    {
                    // InternalProgram.g:815:2: ( ( 'Practice and Innovation' ) )
                    // InternalProgram.g:816:3: ( 'Practice and Innovation' )
                    {
                     before(grammarAccess.getTrackAccess().getPracticeAndInnovationEnumLiteralDeclaration_0()); 
                    // InternalProgram.g:817:3: ( 'Practice and Innovation' )
                    // InternalProgram.g:817:4: 'Practice and Innovation'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTrackAccess().getPracticeAndInnovationEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProgram.g:821:2: ( ( 'Research' ) )
                    {
                    // InternalProgram.g:821:2: ( ( 'Research' ) )
                    // InternalProgram.g:822:3: ( 'Research' )
                    {
                     before(grammarAccess.getTrackAccess().getResearchEnumLiteralDeclaration_1()); 
                    // InternalProgram.g:823:3: ( 'Research' )
                    // InternalProgram.g:823:4: 'Research'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTrackAccess().getResearchEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Track__Alternatives"


    // $ANTLR start "rule__Conference__Group__0"
    // InternalProgram.g:831:1: rule__Conference__Group__0 : rule__Conference__Group__0__Impl rule__Conference__Group__1 ;
    public final void rule__Conference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:835:1: ( rule__Conference__Group__0__Impl rule__Conference__Group__1 )
            // InternalProgram.g:836:2: rule__Conference__Group__0__Impl rule__Conference__Group__1
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
    // InternalProgram.g:843:1: rule__Conference__Group__0__Impl : ( () ) ;
    public final void rule__Conference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:847:1: ( ( () ) )
            // InternalProgram.g:848:1: ( () )
            {
            // InternalProgram.g:848:1: ( () )
            // InternalProgram.g:849:2: ()
            {
             before(grammarAccess.getConferenceAccess().getConferenceAction_0()); 
            // InternalProgram.g:850:2: ()
            // InternalProgram.g:850:3: 
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
    // InternalProgram.g:858:1: rule__Conference__Group__1 : rule__Conference__Group__1__Impl rule__Conference__Group__2 ;
    public final void rule__Conference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:862:1: ( rule__Conference__Group__1__Impl rule__Conference__Group__2 )
            // InternalProgram.g:863:2: rule__Conference__Group__1__Impl rule__Conference__Group__2
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
    // InternalProgram.g:870:1: rule__Conference__Group__1__Impl : ( ( rule__Conference__NameAssignment_1 ) ) ;
    public final void rule__Conference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:874:1: ( ( ( rule__Conference__NameAssignment_1 ) ) )
            // InternalProgram.g:875:1: ( ( rule__Conference__NameAssignment_1 ) )
            {
            // InternalProgram.g:875:1: ( ( rule__Conference__NameAssignment_1 ) )
            // InternalProgram.g:876:2: ( rule__Conference__NameAssignment_1 )
            {
             before(grammarAccess.getConferenceAccess().getNameAssignment_1()); 
            // InternalProgram.g:877:2: ( rule__Conference__NameAssignment_1 )
            // InternalProgram.g:877:3: rule__Conference__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Conference__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConferenceAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalProgram.g:885:1: rule__Conference__Group__2 : rule__Conference__Group__2__Impl rule__Conference__Group__3 ;
    public final void rule__Conference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:889:1: ( rule__Conference__Group__2__Impl rule__Conference__Group__3 )
            // InternalProgram.g:890:2: rule__Conference__Group__2__Impl rule__Conference__Group__3
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
    // InternalProgram.g:897:1: rule__Conference__Group__2__Impl : ( 'talk duration' ) ;
    public final void rule__Conference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:901:1: ( ( 'talk duration' ) )
            // InternalProgram.g:902:1: ( 'talk duration' )
            {
            // InternalProgram.g:902:1: ( 'talk duration' )
            // InternalProgram.g:903:2: 'talk duration'
            {
             before(grammarAccess.getConferenceAccess().getTalkDurationKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getTalkDurationKeyword_2()); 

            }


            }

        }
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
    // InternalProgram.g:912:1: rule__Conference__Group__3 : rule__Conference__Group__3__Impl rule__Conference__Group__4 ;
    public final void rule__Conference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:916:1: ( rule__Conference__Group__3__Impl rule__Conference__Group__4 )
            // InternalProgram.g:917:2: rule__Conference__Group__3__Impl rule__Conference__Group__4
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
    // InternalProgram.g:924:1: rule__Conference__Group__3__Impl : ( ( rule__Conference__TalkDurationAssignment_3 ) ) ;
    public final void rule__Conference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:928:1: ( ( ( rule__Conference__TalkDurationAssignment_3 ) ) )
            // InternalProgram.g:929:1: ( ( rule__Conference__TalkDurationAssignment_3 ) )
            {
            // InternalProgram.g:929:1: ( ( rule__Conference__TalkDurationAssignment_3 ) )
            // InternalProgram.g:930:2: ( rule__Conference__TalkDurationAssignment_3 )
            {
             before(grammarAccess.getConferenceAccess().getTalkDurationAssignment_3()); 
            // InternalProgram.g:931:2: ( rule__Conference__TalkDurationAssignment_3 )
            // InternalProgram.g:931:3: rule__Conference__TalkDurationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Conference__TalkDurationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConferenceAccess().getTalkDurationAssignment_3()); 

            }


            }

        }
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
    // InternalProgram.g:939:1: rule__Conference__Group__4 : rule__Conference__Group__4__Impl rule__Conference__Group__5 ;
    public final void rule__Conference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:943:1: ( rule__Conference__Group__4__Impl rule__Conference__Group__5 )
            // InternalProgram.g:944:2: rule__Conference__Group__4__Impl rule__Conference__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalProgram.g:951:1: rule__Conference__Group__4__Impl : ( ( rule__Conference__Group_4__0 )? ) ;
    public final void rule__Conference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:955:1: ( ( ( rule__Conference__Group_4__0 )? ) )
            // InternalProgram.g:956:1: ( ( rule__Conference__Group_4__0 )? )
            {
            // InternalProgram.g:956:1: ( ( rule__Conference__Group_4__0 )? )
            // InternalProgram.g:957:2: ( rule__Conference__Group_4__0 )?
            {
             before(grammarAccess.getConferenceAccess().getGroup_4()); 
            // InternalProgram.g:958:2: ( rule__Conference__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalProgram.g:958:3: rule__Conference__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conference__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConferenceAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalProgram.g:966:1: rule__Conference__Group__5 : rule__Conference__Group__5__Impl rule__Conference__Group__6 ;
    public final void rule__Conference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:970:1: ( rule__Conference__Group__5__Impl rule__Conference__Group__6 )
            // InternalProgram.g:971:2: rule__Conference__Group__5__Impl rule__Conference__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalProgram.g:978:1: rule__Conference__Group__5__Impl : ( ( rule__Conference__Group_5__0 )? ) ;
    public final void rule__Conference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:982:1: ( ( ( rule__Conference__Group_5__0 )? ) )
            // InternalProgram.g:983:1: ( ( rule__Conference__Group_5__0 )? )
            {
            // InternalProgram.g:983:1: ( ( rule__Conference__Group_5__0 )? )
            // InternalProgram.g:984:2: ( rule__Conference__Group_5__0 )?
            {
             before(grammarAccess.getConferenceAccess().getGroup_5()); 
            // InternalProgram.g:985:2: ( rule__Conference__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalProgram.g:985:3: rule__Conference__Group_5__0
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
    // InternalProgram.g:993:1: rule__Conference__Group__6 : rule__Conference__Group__6__Impl rule__Conference__Group__7 ;
    public final void rule__Conference__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:997:1: ( rule__Conference__Group__6__Impl rule__Conference__Group__7 )
            // InternalProgram.g:998:2: rule__Conference__Group__6__Impl rule__Conference__Group__7
            {
            pushFollow(FOLLOW_6);
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
    // InternalProgram.g:1005:1: rule__Conference__Group__6__Impl : ( ( rule__Conference__Group_6__0 )? ) ;
    public final void rule__Conference__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1009:1: ( ( ( rule__Conference__Group_6__0 )? ) )
            // InternalProgram.g:1010:1: ( ( rule__Conference__Group_6__0 )? )
            {
            // InternalProgram.g:1010:1: ( ( rule__Conference__Group_6__0 )? )
            // InternalProgram.g:1011:2: ( rule__Conference__Group_6__0 )?
            {
             before(grammarAccess.getConferenceAccess().getGroup_6()); 
            // InternalProgram.g:1012:2: ( rule__Conference__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalProgram.g:1012:3: rule__Conference__Group_6__0
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
    // InternalProgram.g:1020:1: rule__Conference__Group__7 : rule__Conference__Group__7__Impl ;
    public final void rule__Conference__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1024:1: ( rule__Conference__Group__7__Impl )
            // InternalProgram.g:1025:2: rule__Conference__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conference__Group__7__Impl();

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
    // InternalProgram.g:1031:1: rule__Conference__Group__7__Impl : ( ( rule__Conference__Group_7__0 )? ) ;
    public final void rule__Conference__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1035:1: ( ( ( rule__Conference__Group_7__0 )? ) )
            // InternalProgram.g:1036:1: ( ( rule__Conference__Group_7__0 )? )
            {
            // InternalProgram.g:1036:1: ( ( rule__Conference__Group_7__0 )? )
            // InternalProgram.g:1037:2: ( rule__Conference__Group_7__0 )?
            {
             before(grammarAccess.getConferenceAccess().getGroup_7()); 
            // InternalProgram.g:1038:2: ( rule__Conference__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalProgram.g:1038:3: rule__Conference__Group_7__0
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


    // $ANTLR start "rule__Conference__Group_4__0"
    // InternalProgram.g:1047:1: rule__Conference__Group_4__0 : rule__Conference__Group_4__0__Impl rule__Conference__Group_4__1 ;
    public final void rule__Conference__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1051:1: ( rule__Conference__Group_4__0__Impl rule__Conference__Group_4__1 )
            // InternalProgram.g:1052:2: rule__Conference__Group_4__0__Impl rule__Conference__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__Conference__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group_4__1();

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
    // $ANTLR end "rule__Conference__Group_4__0"


    // $ANTLR start "rule__Conference__Group_4__0__Impl"
    // InternalProgram.g:1059:1: rule__Conference__Group_4__0__Impl : ( 'resources' ) ;
    public final void rule__Conference__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1063:1: ( ( 'resources' ) )
            // InternalProgram.g:1064:1: ( 'resources' )
            {
            // InternalProgram.g:1064:1: ( 'resources' )
            // InternalProgram.g:1065:2: 'resources'
            {
             before(grammarAccess.getConferenceAccess().getResourcesKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getResourcesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_4__0__Impl"


    // $ANTLR start "rule__Conference__Group_4__1"
    // InternalProgram.g:1074:1: rule__Conference__Group_4__1 : rule__Conference__Group_4__1__Impl rule__Conference__Group_4__2 ;
    public final void rule__Conference__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1078:1: ( rule__Conference__Group_4__1__Impl rule__Conference__Group_4__2 )
            // InternalProgram.g:1079:2: rule__Conference__Group_4__1__Impl rule__Conference__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__Conference__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group_4__2();

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
    // $ANTLR end "rule__Conference__Group_4__1"


    // $ANTLR start "rule__Conference__Group_4__1__Impl"
    // InternalProgram.g:1086:1: rule__Conference__Group_4__1__Impl : ( ( rule__Conference__ResourcesAssignment_4_1 ) ) ;
    public final void rule__Conference__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1090:1: ( ( ( rule__Conference__ResourcesAssignment_4_1 ) ) )
            // InternalProgram.g:1091:1: ( ( rule__Conference__ResourcesAssignment_4_1 ) )
            {
            // InternalProgram.g:1091:1: ( ( rule__Conference__ResourcesAssignment_4_1 ) )
            // InternalProgram.g:1092:2: ( rule__Conference__ResourcesAssignment_4_1 )
            {
             before(grammarAccess.getConferenceAccess().getResourcesAssignment_4_1()); 
            // InternalProgram.g:1093:2: ( rule__Conference__ResourcesAssignment_4_1 )
            // InternalProgram.g:1093:3: rule__Conference__ResourcesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Conference__ResourcesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getConferenceAccess().getResourcesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_4__1__Impl"


    // $ANTLR start "rule__Conference__Group_4__2"
    // InternalProgram.g:1101:1: rule__Conference__Group_4__2 : rule__Conference__Group_4__2__Impl ;
    public final void rule__Conference__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1105:1: ( rule__Conference__Group_4__2__Impl )
            // InternalProgram.g:1106:2: rule__Conference__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conference__Group_4__2__Impl();

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
    // $ANTLR end "rule__Conference__Group_4__2"


    // $ANTLR start "rule__Conference__Group_4__2__Impl"
    // InternalProgram.g:1112:1: rule__Conference__Group_4__2__Impl : ( ( rule__Conference__ResourcesAssignment_4_2 )* ) ;
    public final void rule__Conference__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1116:1: ( ( ( rule__Conference__ResourcesAssignment_4_2 )* ) )
            // InternalProgram.g:1117:1: ( ( rule__Conference__ResourcesAssignment_4_2 )* )
            {
            // InternalProgram.g:1117:1: ( ( rule__Conference__ResourcesAssignment_4_2 )* )
            // InternalProgram.g:1118:2: ( rule__Conference__ResourcesAssignment_4_2 )*
            {
             before(grammarAccess.getConferenceAccess().getResourcesAssignment_4_2()); 
            // InternalProgram.g:1119:2: ( rule__Conference__ResourcesAssignment_4_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==28) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalProgram.g:1119:3: rule__Conference__ResourcesAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Conference__ResourcesAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getConferenceAccess().getResourcesAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_4__2__Impl"


    // $ANTLR start "rule__Conference__Group_5__0"
    // InternalProgram.g:1128:1: rule__Conference__Group_5__0 : rule__Conference__Group_5__0__Impl rule__Conference__Group_5__1 ;
    public final void rule__Conference__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1132:1: ( rule__Conference__Group_5__0__Impl rule__Conference__Group_5__1 )
            // InternalProgram.g:1133:2: rule__Conference__Group_5__0__Impl rule__Conference__Group_5__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalProgram.g:1140:1: rule__Conference__Group_5__0__Impl : ( 'papers' ) ;
    public final void rule__Conference__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1144:1: ( ( 'papers' ) )
            // InternalProgram.g:1145:1: ( 'papers' )
            {
            // InternalProgram.g:1145:1: ( 'papers' )
            // InternalProgram.g:1146:2: 'papers'
            {
             before(grammarAccess.getConferenceAccess().getPapersKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getPapersKeyword_5_0()); 

            }


            }

        }
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
    // InternalProgram.g:1155:1: rule__Conference__Group_5__1 : rule__Conference__Group_5__1__Impl rule__Conference__Group_5__2 ;
    public final void rule__Conference__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1159:1: ( rule__Conference__Group_5__1__Impl rule__Conference__Group_5__2 )
            // InternalProgram.g:1160:2: rule__Conference__Group_5__1__Impl rule__Conference__Group_5__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:1167:1: rule__Conference__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Conference__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1171:1: ( ( '{' ) )
            // InternalProgram.g:1172:1: ( '{' )
            {
            // InternalProgram.g:1172:1: ( '{' )
            // InternalProgram.g:1173:2: '{'
            {
             before(grammarAccess.getConferenceAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
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
    // InternalProgram.g:1182:1: rule__Conference__Group_5__2 : rule__Conference__Group_5__2__Impl rule__Conference__Group_5__3 ;
    public final void rule__Conference__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1186:1: ( rule__Conference__Group_5__2__Impl rule__Conference__Group_5__3 )
            // InternalProgram.g:1187:2: rule__Conference__Group_5__2__Impl rule__Conference__Group_5__3
            {
            pushFollow(FOLLOW_10);
            rule__Conference__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group_5__3();

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
    // InternalProgram.g:1194:1: rule__Conference__Group_5__2__Impl : ( ( rule__Conference__PapersAssignment_5_2 ) ) ;
    public final void rule__Conference__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1198:1: ( ( ( rule__Conference__PapersAssignment_5_2 ) ) )
            // InternalProgram.g:1199:1: ( ( rule__Conference__PapersAssignment_5_2 ) )
            {
            // InternalProgram.g:1199:1: ( ( rule__Conference__PapersAssignment_5_2 ) )
            // InternalProgram.g:1200:2: ( rule__Conference__PapersAssignment_5_2 )
            {
             before(grammarAccess.getConferenceAccess().getPapersAssignment_5_2()); 
            // InternalProgram.g:1201:2: ( rule__Conference__PapersAssignment_5_2 )
            // InternalProgram.g:1201:3: rule__Conference__PapersAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Conference__PapersAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getConferenceAccess().getPapersAssignment_5_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Conference__Group_5__3"
    // InternalProgram.g:1209:1: rule__Conference__Group_5__3 : rule__Conference__Group_5__3__Impl rule__Conference__Group_5__4 ;
    public final void rule__Conference__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1213:1: ( rule__Conference__Group_5__3__Impl rule__Conference__Group_5__4 )
            // InternalProgram.g:1214:2: rule__Conference__Group_5__3__Impl rule__Conference__Group_5__4
            {
            pushFollow(FOLLOW_10);
            rule__Conference__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group_5__4();

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
    // $ANTLR end "rule__Conference__Group_5__3"


    // $ANTLR start "rule__Conference__Group_5__3__Impl"
    // InternalProgram.g:1221:1: rule__Conference__Group_5__3__Impl : ( ( rule__Conference__Group_5_3__0 )* ) ;
    public final void rule__Conference__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1225:1: ( ( ( rule__Conference__Group_5_3__0 )* ) )
            // InternalProgram.g:1226:1: ( ( rule__Conference__Group_5_3__0 )* )
            {
            // InternalProgram.g:1226:1: ( ( rule__Conference__Group_5_3__0 )* )
            // InternalProgram.g:1227:2: ( rule__Conference__Group_5_3__0 )*
            {
             before(grammarAccess.getConferenceAccess().getGroup_5_3()); 
            // InternalProgram.g:1228:2: ( rule__Conference__Group_5_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalProgram.g:1228:3: rule__Conference__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Conference__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getConferenceAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_5__3__Impl"


    // $ANTLR start "rule__Conference__Group_5__4"
    // InternalProgram.g:1236:1: rule__Conference__Group_5__4 : rule__Conference__Group_5__4__Impl ;
    public final void rule__Conference__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1240:1: ( rule__Conference__Group_5__4__Impl )
            // InternalProgram.g:1241:2: rule__Conference__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conference__Group_5__4__Impl();

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
    // $ANTLR end "rule__Conference__Group_5__4"


    // $ANTLR start "rule__Conference__Group_5__4__Impl"
    // InternalProgram.g:1247:1: rule__Conference__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Conference__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1251:1: ( ( '}' ) )
            // InternalProgram.g:1252:1: ( '}' )
            {
            // InternalProgram.g:1252:1: ( '}' )
            // InternalProgram.g:1253:2: '}'
            {
             before(grammarAccess.getConferenceAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_5__4__Impl"


    // $ANTLR start "rule__Conference__Group_5_3__0"
    // InternalProgram.g:1263:1: rule__Conference__Group_5_3__0 : rule__Conference__Group_5_3__0__Impl rule__Conference__Group_5_3__1 ;
    public final void rule__Conference__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1267:1: ( rule__Conference__Group_5_3__0__Impl rule__Conference__Group_5_3__1 )
            // InternalProgram.g:1268:2: rule__Conference__Group_5_3__0__Impl rule__Conference__Group_5_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Conference__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group_5_3__1();

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
    // $ANTLR end "rule__Conference__Group_5_3__0"


    // $ANTLR start "rule__Conference__Group_5_3__0__Impl"
    // InternalProgram.g:1275:1: rule__Conference__Group_5_3__0__Impl : ( ';' ) ;
    public final void rule__Conference__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1279:1: ( ( ';' ) )
            // InternalProgram.g:1280:1: ( ';' )
            {
            // InternalProgram.g:1280:1: ( ';' )
            // InternalProgram.g:1281:2: ';'
            {
             before(grammarAccess.getConferenceAccess().getSemicolonKeyword_5_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getSemicolonKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_5_3__0__Impl"


    // $ANTLR start "rule__Conference__Group_5_3__1"
    // InternalProgram.g:1290:1: rule__Conference__Group_5_3__1 : rule__Conference__Group_5_3__1__Impl ;
    public final void rule__Conference__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1294:1: ( rule__Conference__Group_5_3__1__Impl )
            // InternalProgram.g:1295:2: rule__Conference__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conference__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Conference__Group_5_3__1"


    // $ANTLR start "rule__Conference__Group_5_3__1__Impl"
    // InternalProgram.g:1301:1: rule__Conference__Group_5_3__1__Impl : ( ( rule__Conference__PapersAssignment_5_3_1 ) ) ;
    public final void rule__Conference__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1305:1: ( ( ( rule__Conference__PapersAssignment_5_3_1 ) ) )
            // InternalProgram.g:1306:1: ( ( rule__Conference__PapersAssignment_5_3_1 ) )
            {
            // InternalProgram.g:1306:1: ( ( rule__Conference__PapersAssignment_5_3_1 ) )
            // InternalProgram.g:1307:2: ( rule__Conference__PapersAssignment_5_3_1 )
            {
             before(grammarAccess.getConferenceAccess().getPapersAssignment_5_3_1()); 
            // InternalProgram.g:1308:2: ( rule__Conference__PapersAssignment_5_3_1 )
            // InternalProgram.g:1308:3: rule__Conference__PapersAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Conference__PapersAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConferenceAccess().getPapersAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_5_3__1__Impl"


    // $ANTLR start "rule__Conference__Group_6__0"
    // InternalProgram.g:1317:1: rule__Conference__Group_6__0 : rule__Conference__Group_6__0__Impl rule__Conference__Group_6__1 ;
    public final void rule__Conference__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1321:1: ( rule__Conference__Group_6__0__Impl rule__Conference__Group_6__1 )
            // InternalProgram.g:1322:2: rule__Conference__Group_6__0__Impl rule__Conference__Group_6__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalProgram.g:1329:1: rule__Conference__Group_6__0__Impl : ( 'events' ) ;
    public final void rule__Conference__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1333:1: ( ( 'events' ) )
            // InternalProgram.g:1334:1: ( 'events' )
            {
            // InternalProgram.g:1334:1: ( 'events' )
            // InternalProgram.g:1335:2: 'events'
            {
             before(grammarAccess.getConferenceAccess().getEventsKeyword_6_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getEventsKeyword_6_0()); 

            }


            }

        }
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
    // InternalProgram.g:1344:1: rule__Conference__Group_6__1 : rule__Conference__Group_6__1__Impl rule__Conference__Group_6__2 ;
    public final void rule__Conference__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1348:1: ( rule__Conference__Group_6__1__Impl rule__Conference__Group_6__2 )
            // InternalProgram.g:1349:2: rule__Conference__Group_6__1__Impl rule__Conference__Group_6__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalProgram.g:1356:1: rule__Conference__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Conference__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1360:1: ( ( '{' ) )
            // InternalProgram.g:1361:1: ( '{' )
            {
            // InternalProgram.g:1361:1: ( '{' )
            // InternalProgram.g:1362:2: '{'
            {
             before(grammarAccess.getConferenceAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
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
    // InternalProgram.g:1371:1: rule__Conference__Group_6__2 : rule__Conference__Group_6__2__Impl rule__Conference__Group_6__3 ;
    public final void rule__Conference__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1375:1: ( rule__Conference__Group_6__2__Impl rule__Conference__Group_6__3 )
            // InternalProgram.g:1376:2: rule__Conference__Group_6__2__Impl rule__Conference__Group_6__3
            {
            pushFollow(FOLLOW_10);
            rule__Conference__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group_6__3();

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
    // InternalProgram.g:1383:1: rule__Conference__Group_6__2__Impl : ( ( rule__Conference__EventsAssignment_6_2 ) ) ;
    public final void rule__Conference__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1387:1: ( ( ( rule__Conference__EventsAssignment_6_2 ) ) )
            // InternalProgram.g:1388:1: ( ( rule__Conference__EventsAssignment_6_2 ) )
            {
            // InternalProgram.g:1388:1: ( ( rule__Conference__EventsAssignment_6_2 ) )
            // InternalProgram.g:1389:2: ( rule__Conference__EventsAssignment_6_2 )
            {
             before(grammarAccess.getConferenceAccess().getEventsAssignment_6_2()); 
            // InternalProgram.g:1390:2: ( rule__Conference__EventsAssignment_6_2 )
            // InternalProgram.g:1390:3: rule__Conference__EventsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Conference__EventsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getConferenceAccess().getEventsAssignment_6_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Conference__Group_6__3"
    // InternalProgram.g:1398:1: rule__Conference__Group_6__3 : rule__Conference__Group_6__3__Impl rule__Conference__Group_6__4 ;
    public final void rule__Conference__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1402:1: ( rule__Conference__Group_6__3__Impl rule__Conference__Group_6__4 )
            // InternalProgram.g:1403:2: rule__Conference__Group_6__3__Impl rule__Conference__Group_6__4
            {
            pushFollow(FOLLOW_10);
            rule__Conference__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group_6__4();

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
    // $ANTLR end "rule__Conference__Group_6__3"


    // $ANTLR start "rule__Conference__Group_6__3__Impl"
    // InternalProgram.g:1410:1: rule__Conference__Group_6__3__Impl : ( ( rule__Conference__Group_6_3__0 )* ) ;
    public final void rule__Conference__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1414:1: ( ( ( rule__Conference__Group_6_3__0 )* ) )
            // InternalProgram.g:1415:1: ( ( rule__Conference__Group_6_3__0 )* )
            {
            // InternalProgram.g:1415:1: ( ( rule__Conference__Group_6_3__0 )* )
            // InternalProgram.g:1416:2: ( rule__Conference__Group_6_3__0 )*
            {
             before(grammarAccess.getConferenceAccess().getGroup_6_3()); 
            // InternalProgram.g:1417:2: ( rule__Conference__Group_6_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalProgram.g:1417:3: rule__Conference__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Conference__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getConferenceAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_6__3__Impl"


    // $ANTLR start "rule__Conference__Group_6__4"
    // InternalProgram.g:1425:1: rule__Conference__Group_6__4 : rule__Conference__Group_6__4__Impl ;
    public final void rule__Conference__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1429:1: ( rule__Conference__Group_6__4__Impl )
            // InternalProgram.g:1430:2: rule__Conference__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conference__Group_6__4__Impl();

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
    // $ANTLR end "rule__Conference__Group_6__4"


    // $ANTLR start "rule__Conference__Group_6__4__Impl"
    // InternalProgram.g:1436:1: rule__Conference__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Conference__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1440:1: ( ( '}' ) )
            // InternalProgram.g:1441:1: ( '}' )
            {
            // InternalProgram.g:1441:1: ( '}' )
            // InternalProgram.g:1442:2: '}'
            {
             before(grammarAccess.getConferenceAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_6__4__Impl"


    // $ANTLR start "rule__Conference__Group_6_3__0"
    // InternalProgram.g:1452:1: rule__Conference__Group_6_3__0 : rule__Conference__Group_6_3__0__Impl rule__Conference__Group_6_3__1 ;
    public final void rule__Conference__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1456:1: ( rule__Conference__Group_6_3__0__Impl rule__Conference__Group_6_3__1 )
            // InternalProgram.g:1457:2: rule__Conference__Group_6_3__0__Impl rule__Conference__Group_6_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Conference__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group_6_3__1();

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
    // $ANTLR end "rule__Conference__Group_6_3__0"


    // $ANTLR start "rule__Conference__Group_6_3__0__Impl"
    // InternalProgram.g:1464:1: rule__Conference__Group_6_3__0__Impl : ( ';' ) ;
    public final void rule__Conference__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1468:1: ( ( ';' ) )
            // InternalProgram.g:1469:1: ( ';' )
            {
            // InternalProgram.g:1469:1: ( ';' )
            // InternalProgram.g:1470:2: ';'
            {
             before(grammarAccess.getConferenceAccess().getSemicolonKeyword_6_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getSemicolonKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_6_3__0__Impl"


    // $ANTLR start "rule__Conference__Group_6_3__1"
    // InternalProgram.g:1479:1: rule__Conference__Group_6_3__1 : rule__Conference__Group_6_3__1__Impl ;
    public final void rule__Conference__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1483:1: ( rule__Conference__Group_6_3__1__Impl )
            // InternalProgram.g:1484:2: rule__Conference__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conference__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__Conference__Group_6_3__1"


    // $ANTLR start "rule__Conference__Group_6_3__1__Impl"
    // InternalProgram.g:1490:1: rule__Conference__Group_6_3__1__Impl : ( ( rule__Conference__EventsAssignment_6_3_1 ) ) ;
    public final void rule__Conference__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1494:1: ( ( ( rule__Conference__EventsAssignment_6_3_1 ) ) )
            // InternalProgram.g:1495:1: ( ( rule__Conference__EventsAssignment_6_3_1 ) )
            {
            // InternalProgram.g:1495:1: ( ( rule__Conference__EventsAssignment_6_3_1 ) )
            // InternalProgram.g:1496:2: ( rule__Conference__EventsAssignment_6_3_1 )
            {
             before(grammarAccess.getConferenceAccess().getEventsAssignment_6_3_1()); 
            // InternalProgram.g:1497:2: ( rule__Conference__EventsAssignment_6_3_1 )
            // InternalProgram.g:1497:3: rule__Conference__EventsAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Conference__EventsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConferenceAccess().getEventsAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_6_3__1__Impl"


    // $ANTLR start "rule__Conference__Group_7__0"
    // InternalProgram.g:1506:1: rule__Conference__Group_7__0 : rule__Conference__Group_7__0__Impl rule__Conference__Group_7__1 ;
    public final void rule__Conference__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1510:1: ( rule__Conference__Group_7__0__Impl rule__Conference__Group_7__1 )
            // InternalProgram.g:1511:2: rule__Conference__Group_7__0__Impl rule__Conference__Group_7__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalProgram.g:1518:1: rule__Conference__Group_7__0__Impl : ( 'program' ) ;
    public final void rule__Conference__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1522:1: ( ( 'program' ) )
            // InternalProgram.g:1523:1: ( 'program' )
            {
            // InternalProgram.g:1523:1: ( 'program' )
            // InternalProgram.g:1524:2: 'program'
            {
             before(grammarAccess.getConferenceAccess().getProgramKeyword_7_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getProgramKeyword_7_0()); 

            }


            }

        }
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
    // InternalProgram.g:1533:1: rule__Conference__Group_7__1 : rule__Conference__Group_7__1__Impl ;
    public final void rule__Conference__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1537:1: ( rule__Conference__Group_7__1__Impl )
            // InternalProgram.g:1538:2: rule__Conference__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conference__Group_7__1__Impl();

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
    // InternalProgram.g:1544:1: rule__Conference__Group_7__1__Impl : ( ( rule__Conference__ProgramAssignment_7_1 ) ) ;
    public final void rule__Conference__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1548:1: ( ( ( rule__Conference__ProgramAssignment_7_1 ) ) )
            // InternalProgram.g:1549:1: ( ( rule__Conference__ProgramAssignment_7_1 ) )
            {
            // InternalProgram.g:1549:1: ( ( rule__Conference__ProgramAssignment_7_1 ) )
            // InternalProgram.g:1550:2: ( rule__Conference__ProgramAssignment_7_1 )
            {
             before(grammarAccess.getConferenceAccess().getProgramAssignment_7_1()); 
            // InternalProgram.g:1551:2: ( rule__Conference__ProgramAssignment_7_1 )
            // InternalProgram.g:1551:3: rule__Conference__ProgramAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Conference__ProgramAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getConferenceAccess().getProgramAssignment_7_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Program__Group__0"
    // InternalProgram.g:1560:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1564:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalProgram.g:1565:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalProgram.g:1572:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1576:1: ( ( () ) )
            // InternalProgram.g:1577:1: ( () )
            {
            // InternalProgram.g:1577:1: ( () )
            // InternalProgram.g:1578:2: ()
            {
             before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            // InternalProgram.g:1579:2: ()
            // InternalProgram.g:1579:3: 
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
    // InternalProgram.g:1587:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1591:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalProgram.g:1592:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalProgram.g:1599:1: rule__Program__Group__1__Impl : ( '{' ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1603:1: ( ( '{' ) )
            // InternalProgram.g:1604:1: ( '{' )
            {
            // InternalProgram.g:1604:1: ( '{' )
            // InternalProgram.g:1605:2: '{'
            {
             before(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalProgram.g:1614:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1618:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalProgram.g:1619:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalProgram.g:1626:1: rule__Program__Group__2__Impl : ( ( rule__Program__Group_2__0 )? ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1630:1: ( ( ( rule__Program__Group_2__0 )? ) )
            // InternalProgram.g:1631:1: ( ( rule__Program__Group_2__0 )? )
            {
            // InternalProgram.g:1631:1: ( ( rule__Program__Group_2__0 )? )
            // InternalProgram.g:1632:2: ( rule__Program__Group_2__0 )?
            {
             before(grammarAccess.getProgramAccess().getGroup_2()); 
            // InternalProgram.g:1633:2: ( rule__Program__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=11 && LA11_0<=17)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalProgram.g:1633:3: rule__Program__Group_2__0
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
    // InternalProgram.g:1641:1: rule__Program__Group__3 : rule__Program__Group__3__Impl ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1645:1: ( rule__Program__Group__3__Impl )
            // InternalProgram.g:1646:2: rule__Program__Group__3__Impl
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
    // InternalProgram.g:1652:1: rule__Program__Group__3__Impl : ( '}' ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1656:1: ( ( '}' ) )
            // InternalProgram.g:1657:1: ( '}' )
            {
            // InternalProgram.g:1657:1: ( '}' )
            // InternalProgram.g:1658:2: '}'
            {
             before(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalProgram.g:1668:1: rule__Program__Group_2__0 : rule__Program__Group_2__0__Impl rule__Program__Group_2__1 ;
    public final void rule__Program__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1672:1: ( rule__Program__Group_2__0__Impl rule__Program__Group_2__1 )
            // InternalProgram.g:1673:2: rule__Program__Group_2__0__Impl rule__Program__Group_2__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalProgram.g:1680:1: rule__Program__Group_2__0__Impl : ( ( rule__Program__DaysAssignment_2_0 ) ) ;
    public final void rule__Program__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1684:1: ( ( ( rule__Program__DaysAssignment_2_0 ) ) )
            // InternalProgram.g:1685:1: ( ( rule__Program__DaysAssignment_2_0 ) )
            {
            // InternalProgram.g:1685:1: ( ( rule__Program__DaysAssignment_2_0 ) )
            // InternalProgram.g:1686:2: ( rule__Program__DaysAssignment_2_0 )
            {
             before(grammarAccess.getProgramAccess().getDaysAssignment_2_0()); 
            // InternalProgram.g:1687:2: ( rule__Program__DaysAssignment_2_0 )
            // InternalProgram.g:1687:3: rule__Program__DaysAssignment_2_0
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
    // InternalProgram.g:1695:1: rule__Program__Group_2__1 : rule__Program__Group_2__1__Impl ;
    public final void rule__Program__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1699:1: ( rule__Program__Group_2__1__Impl )
            // InternalProgram.g:1700:2: rule__Program__Group_2__1__Impl
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
    // InternalProgram.g:1706:1: rule__Program__Group_2__1__Impl : ( ( rule__Program__DaysAssignment_2_1 )* ) ;
    public final void rule__Program__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1710:1: ( ( ( rule__Program__DaysAssignment_2_1 )* ) )
            // InternalProgram.g:1711:1: ( ( rule__Program__DaysAssignment_2_1 )* )
            {
            // InternalProgram.g:1711:1: ( ( rule__Program__DaysAssignment_2_1 )* )
            // InternalProgram.g:1712:2: ( rule__Program__DaysAssignment_2_1 )*
            {
             before(grammarAccess.getProgramAccess().getDaysAssignment_2_1()); 
            // InternalProgram.g:1713:2: ( rule__Program__DaysAssignment_2_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=11 && LA12_0<=17)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalProgram.g:1713:3: rule__Program__DaysAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Program__DaysAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalProgram.g:1722:1: rule__Room__Group__0 : rule__Room__Group__0__Impl rule__Room__Group__1 ;
    public final void rule__Room__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1726:1: ( rule__Room__Group__0__Impl rule__Room__Group__1 )
            // InternalProgram.g:1727:2: rule__Room__Group__0__Impl rule__Room__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalProgram.g:1734:1: rule__Room__Group__0__Impl : ( () ) ;
    public final void rule__Room__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1738:1: ( ( () ) )
            // InternalProgram.g:1739:1: ( () )
            {
            // InternalProgram.g:1739:1: ( () )
            // InternalProgram.g:1740:2: ()
            {
             before(grammarAccess.getRoomAccess().getRoomAction_0()); 
            // InternalProgram.g:1741:2: ()
            // InternalProgram.g:1741:3: 
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
    // InternalProgram.g:1749:1: rule__Room__Group__1 : rule__Room__Group__1__Impl rule__Room__Group__2 ;
    public final void rule__Room__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1753:1: ( rule__Room__Group__1__Impl rule__Room__Group__2 )
            // InternalProgram.g:1754:2: rule__Room__Group__1__Impl rule__Room__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:1761:1: rule__Room__Group__1__Impl : ( 'room' ) ;
    public final void rule__Room__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1765:1: ( ( 'room' ) )
            // InternalProgram.g:1766:1: ( 'room' )
            {
            // InternalProgram.g:1766:1: ( 'room' )
            // InternalProgram.g:1767:2: 'room'
            {
             before(grammarAccess.getRoomAccess().getRoomKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalProgram.g:1776:1: rule__Room__Group__2 : rule__Room__Group__2__Impl rule__Room__Group__3 ;
    public final void rule__Room__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1780:1: ( rule__Room__Group__2__Impl rule__Room__Group__3 )
            // InternalProgram.g:1781:2: rule__Room__Group__2__Impl rule__Room__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalProgram.g:1788:1: rule__Room__Group__2__Impl : ( ( rule__Room__NameAssignment_2 ) ) ;
    public final void rule__Room__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1792:1: ( ( ( rule__Room__NameAssignment_2 ) ) )
            // InternalProgram.g:1793:1: ( ( rule__Room__NameAssignment_2 ) )
            {
            // InternalProgram.g:1793:1: ( ( rule__Room__NameAssignment_2 ) )
            // InternalProgram.g:1794:2: ( rule__Room__NameAssignment_2 )
            {
             before(grammarAccess.getRoomAccess().getNameAssignment_2()); 
            // InternalProgram.g:1795:2: ( rule__Room__NameAssignment_2 )
            // InternalProgram.g:1795:3: rule__Room__NameAssignment_2
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
    // InternalProgram.g:1803:1: rule__Room__Group__3 : rule__Room__Group__3__Impl ;
    public final void rule__Room__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1807:1: ( rule__Room__Group__3__Impl )
            // InternalProgram.g:1808:2: rule__Room__Group__3__Impl
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
    // InternalProgram.g:1814:1: rule__Room__Group__3__Impl : ( ( rule__Room__Group_3__0 )? ) ;
    public final void rule__Room__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1818:1: ( ( ( rule__Room__Group_3__0 )? ) )
            // InternalProgram.g:1819:1: ( ( rule__Room__Group_3__0 )? )
            {
            // InternalProgram.g:1819:1: ( ( rule__Room__Group_3__0 )? )
            // InternalProgram.g:1820:2: ( rule__Room__Group_3__0 )?
            {
             before(grammarAccess.getRoomAccess().getGroup_3()); 
            // InternalProgram.g:1821:2: ( rule__Room__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalProgram.g:1821:3: rule__Room__Group_3__0
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
    // InternalProgram.g:1830:1: rule__Room__Group_3__0 : rule__Room__Group_3__0__Impl rule__Room__Group_3__1 ;
    public final void rule__Room__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1834:1: ( rule__Room__Group_3__0__Impl rule__Room__Group_3__1 )
            // InternalProgram.g:1835:2: rule__Room__Group_3__0__Impl rule__Room__Group_3__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalProgram.g:1842:1: rule__Room__Group_3__0__Impl : ( 'capacity' ) ;
    public final void rule__Room__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1846:1: ( ( 'capacity' ) )
            // InternalProgram.g:1847:1: ( 'capacity' )
            {
            // InternalProgram.g:1847:1: ( 'capacity' )
            // InternalProgram.g:1848:2: 'capacity'
            {
             before(grammarAccess.getRoomAccess().getCapacityKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalProgram.g:1857:1: rule__Room__Group_3__1 : rule__Room__Group_3__1__Impl ;
    public final void rule__Room__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1861:1: ( rule__Room__Group_3__1__Impl )
            // InternalProgram.g:1862:2: rule__Room__Group_3__1__Impl
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
    // InternalProgram.g:1868:1: rule__Room__Group_3__1__Impl : ( ( rule__Room__CapacityAssignment_3_1 ) ) ;
    public final void rule__Room__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1872:1: ( ( ( rule__Room__CapacityAssignment_3_1 ) ) )
            // InternalProgram.g:1873:1: ( ( rule__Room__CapacityAssignment_3_1 ) )
            {
            // InternalProgram.g:1873:1: ( ( rule__Room__CapacityAssignment_3_1 ) )
            // InternalProgram.g:1874:2: ( rule__Room__CapacityAssignment_3_1 )
            {
             before(grammarAccess.getRoomAccess().getCapacityAssignment_3_1()); 
            // InternalProgram.g:1875:2: ( rule__Room__CapacityAssignment_3_1 )
            // InternalProgram.g:1875:3: rule__Room__CapacityAssignment_3_1
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
    // InternalProgram.g:1884:1: rule__Day__Group__0 : rule__Day__Group__0__Impl rule__Day__Group__1 ;
    public final void rule__Day__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1888:1: ( rule__Day__Group__0__Impl rule__Day__Group__1 )
            // InternalProgram.g:1889:2: rule__Day__Group__0__Impl rule__Day__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalProgram.g:1896:1: rule__Day__Group__0__Impl : ( ( rule__Day__WeekdayAssignment_0 ) ) ;
    public final void rule__Day__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1900:1: ( ( ( rule__Day__WeekdayAssignment_0 ) ) )
            // InternalProgram.g:1901:1: ( ( rule__Day__WeekdayAssignment_0 ) )
            {
            // InternalProgram.g:1901:1: ( ( rule__Day__WeekdayAssignment_0 ) )
            // InternalProgram.g:1902:2: ( rule__Day__WeekdayAssignment_0 )
            {
             before(grammarAccess.getDayAccess().getWeekdayAssignment_0()); 
            // InternalProgram.g:1903:2: ( rule__Day__WeekdayAssignment_0 )
            // InternalProgram.g:1903:3: rule__Day__WeekdayAssignment_0
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
    // InternalProgram.g:1911:1: rule__Day__Group__1 : rule__Day__Group__1__Impl rule__Day__Group__2 ;
    public final void rule__Day__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1915:1: ( rule__Day__Group__1__Impl rule__Day__Group__2 )
            // InternalProgram.g:1916:2: rule__Day__Group__1__Impl rule__Day__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalProgram.g:1923:1: rule__Day__Group__1__Impl : ( ( rule__Day__Group_1__0 )? ) ;
    public final void rule__Day__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1927:1: ( ( ( rule__Day__Group_1__0 )? ) )
            // InternalProgram.g:1928:1: ( ( rule__Day__Group_1__0 )? )
            {
            // InternalProgram.g:1928:1: ( ( rule__Day__Group_1__0 )? )
            // InternalProgram.g:1929:2: ( rule__Day__Group_1__0 )?
            {
             before(grammarAccess.getDayAccess().getGroup_1()); 
            // InternalProgram.g:1930:2: ( rule__Day__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalProgram.g:1930:3: rule__Day__Group_1__0
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
    // InternalProgram.g:1938:1: rule__Day__Group__2 : rule__Day__Group__2__Impl ;
    public final void rule__Day__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1942:1: ( rule__Day__Group__2__Impl )
            // InternalProgram.g:1943:2: rule__Day__Group__2__Impl
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
    // InternalProgram.g:1949:1: rule__Day__Group__2__Impl : ( ( rule__Day__Group_2__0 )? ) ;
    public final void rule__Day__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1953:1: ( ( ( rule__Day__Group_2__0 )? ) )
            // InternalProgram.g:1954:1: ( ( rule__Day__Group_2__0 )? )
            {
            // InternalProgram.g:1954:1: ( ( rule__Day__Group_2__0 )? )
            // InternalProgram.g:1955:2: ( rule__Day__Group_2__0 )?
            {
             before(grammarAccess.getDayAccess().getGroup_2()); 
            // InternalProgram.g:1956:2: ( rule__Day__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalProgram.g:1956:3: rule__Day__Group_2__0
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
    // InternalProgram.g:1965:1: rule__Day__Group_1__0 : rule__Day__Group_1__0__Impl rule__Day__Group_1__1 ;
    public final void rule__Day__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1969:1: ( rule__Day__Group_1__0__Impl rule__Day__Group_1__1 )
            // InternalProgram.g:1970:2: rule__Day__Group_1__0__Impl rule__Day__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalProgram.g:1977:1: rule__Day__Group_1__0__Impl : ( 'date' ) ;
    public final void rule__Day__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1981:1: ( ( 'date' ) )
            // InternalProgram.g:1982:1: ( 'date' )
            {
            // InternalProgram.g:1982:1: ( 'date' )
            // InternalProgram.g:1983:2: 'date'
            {
             before(grammarAccess.getDayAccess().getDateKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalProgram.g:1992:1: rule__Day__Group_1__1 : rule__Day__Group_1__1__Impl ;
    public final void rule__Day__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1996:1: ( rule__Day__Group_1__1__Impl )
            // InternalProgram.g:1997:2: rule__Day__Group_1__1__Impl
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
    // InternalProgram.g:2003:1: rule__Day__Group_1__1__Impl : ( ( rule__Day__DateAssignment_1_1 ) ) ;
    public final void rule__Day__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2007:1: ( ( ( rule__Day__DateAssignment_1_1 ) ) )
            // InternalProgram.g:2008:1: ( ( rule__Day__DateAssignment_1_1 ) )
            {
            // InternalProgram.g:2008:1: ( ( rule__Day__DateAssignment_1_1 ) )
            // InternalProgram.g:2009:2: ( rule__Day__DateAssignment_1_1 )
            {
             before(grammarAccess.getDayAccess().getDateAssignment_1_1()); 
            // InternalProgram.g:2010:2: ( rule__Day__DateAssignment_1_1 )
            // InternalProgram.g:2010:3: rule__Day__DateAssignment_1_1
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
    // InternalProgram.g:2019:1: rule__Day__Group_2__0 : rule__Day__Group_2__0__Impl rule__Day__Group_2__1 ;
    public final void rule__Day__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2023:1: ( rule__Day__Group_2__0__Impl rule__Day__Group_2__1 )
            // InternalProgram.g:2024:2: rule__Day__Group_2__0__Impl rule__Day__Group_2__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalProgram.g:2031:1: rule__Day__Group_2__0__Impl : ( ( rule__Day__SessionsAssignment_2_0 ) ) ;
    public final void rule__Day__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2035:1: ( ( ( rule__Day__SessionsAssignment_2_0 ) ) )
            // InternalProgram.g:2036:1: ( ( rule__Day__SessionsAssignment_2_0 ) )
            {
            // InternalProgram.g:2036:1: ( ( rule__Day__SessionsAssignment_2_0 ) )
            // InternalProgram.g:2037:2: ( rule__Day__SessionsAssignment_2_0 )
            {
             before(grammarAccess.getDayAccess().getSessionsAssignment_2_0()); 
            // InternalProgram.g:2038:2: ( rule__Day__SessionsAssignment_2_0 )
            // InternalProgram.g:2038:3: rule__Day__SessionsAssignment_2_0
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
    // InternalProgram.g:2046:1: rule__Day__Group_2__1 : rule__Day__Group_2__1__Impl ;
    public final void rule__Day__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2050:1: ( rule__Day__Group_2__1__Impl )
            // InternalProgram.g:2051:2: rule__Day__Group_2__1__Impl
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
    // InternalProgram.g:2057:1: rule__Day__Group_2__1__Impl : ( ( rule__Day__SessionsAssignment_2_1 )* ) ;
    public final void rule__Day__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2061:1: ( ( ( rule__Day__SessionsAssignment_2_1 )* ) )
            // InternalProgram.g:2062:1: ( ( rule__Day__SessionsAssignment_2_1 )* )
            {
            // InternalProgram.g:2062:1: ( ( rule__Day__SessionsAssignment_2_1 )* )
            // InternalProgram.g:2063:2: ( rule__Day__SessionsAssignment_2_1 )*
            {
             before(grammarAccess.getDayAccess().getSessionsAssignment_2_1()); 
            // InternalProgram.g:2064:2: ( rule__Day__SessionsAssignment_2_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_INT) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalProgram.g:2064:3: rule__Day__SessionsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Day__SessionsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalProgram.g:2073:1: rule__DayDataType__Group__0 : rule__DayDataType__Group__0__Impl rule__DayDataType__Group__1 ;
    public final void rule__DayDataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2077:1: ( rule__DayDataType__Group__0__Impl rule__DayDataType__Group__1 )
            // InternalProgram.g:2078:2: rule__DayDataType__Group__0__Impl rule__DayDataType__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalProgram.g:2085:1: rule__DayDataType__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DayDataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2089:1: ( ( RULE_INT ) )
            // InternalProgram.g:2090:1: ( RULE_INT )
            {
            // InternalProgram.g:2090:1: ( RULE_INT )
            // InternalProgram.g:2091:2: RULE_INT
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
    // InternalProgram.g:2100:1: rule__DayDataType__Group__1 : rule__DayDataType__Group__1__Impl rule__DayDataType__Group__2 ;
    public final void rule__DayDataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2104:1: ( rule__DayDataType__Group__1__Impl rule__DayDataType__Group__2 )
            // InternalProgram.g:2105:2: rule__DayDataType__Group__1__Impl rule__DayDataType__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalProgram.g:2112:1: rule__DayDataType__Group__1__Impl : ( '.' ) ;
    public final void rule__DayDataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2116:1: ( ( '.' ) )
            // InternalProgram.g:2117:1: ( '.' )
            {
            // InternalProgram.g:2117:1: ( '.' )
            // InternalProgram.g:2118:2: '.'
            {
             before(grammarAccess.getDayDataTypeAccess().getFullStopKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalProgram.g:2127:1: rule__DayDataType__Group__2 : rule__DayDataType__Group__2__Impl rule__DayDataType__Group__3 ;
    public final void rule__DayDataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2131:1: ( rule__DayDataType__Group__2__Impl rule__DayDataType__Group__3 )
            // InternalProgram.g:2132:2: rule__DayDataType__Group__2__Impl rule__DayDataType__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalProgram.g:2139:1: rule__DayDataType__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DayDataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2143:1: ( ( RULE_INT ) )
            // InternalProgram.g:2144:1: ( RULE_INT )
            {
            // InternalProgram.g:2144:1: ( RULE_INT )
            // InternalProgram.g:2145:2: RULE_INT
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
    // InternalProgram.g:2154:1: rule__DayDataType__Group__3 : rule__DayDataType__Group__3__Impl rule__DayDataType__Group__4 ;
    public final void rule__DayDataType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2158:1: ( rule__DayDataType__Group__3__Impl rule__DayDataType__Group__4 )
            // InternalProgram.g:2159:2: rule__DayDataType__Group__3__Impl rule__DayDataType__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalProgram.g:2166:1: rule__DayDataType__Group__3__Impl : ( '.' ) ;
    public final void rule__DayDataType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2170:1: ( ( '.' ) )
            // InternalProgram.g:2171:1: ( '.' )
            {
            // InternalProgram.g:2171:1: ( '.' )
            // InternalProgram.g:2172:2: '.'
            {
             before(grammarAccess.getDayDataTypeAccess().getFullStopKeyword_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalProgram.g:2181:1: rule__DayDataType__Group__4 : rule__DayDataType__Group__4__Impl ;
    public final void rule__DayDataType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2185:1: ( rule__DayDataType__Group__4__Impl )
            // InternalProgram.g:2186:2: rule__DayDataType__Group__4__Impl
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
    // InternalProgram.g:2192:1: rule__DayDataType__Group__4__Impl : ( RULE_INT ) ;
    public final void rule__DayDataType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2196:1: ( ( RULE_INT ) )
            // InternalProgram.g:2197:1: ( RULE_INT )
            {
            // InternalProgram.g:2197:1: ( RULE_INT )
            // InternalProgram.g:2198:2: RULE_INT
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
    // InternalProgram.g:2208:1: rule__HourDataType__Group__0 : rule__HourDataType__Group__0__Impl rule__HourDataType__Group__1 ;
    public final void rule__HourDataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2212:1: ( rule__HourDataType__Group__0__Impl rule__HourDataType__Group__1 )
            // InternalProgram.g:2213:2: rule__HourDataType__Group__0__Impl rule__HourDataType__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalProgram.g:2220:1: rule__HourDataType__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__HourDataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2224:1: ( ( RULE_INT ) )
            // InternalProgram.g:2225:1: ( RULE_INT )
            {
            // InternalProgram.g:2225:1: ( RULE_INT )
            // InternalProgram.g:2226:2: RULE_INT
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
    // InternalProgram.g:2235:1: rule__HourDataType__Group__1 : rule__HourDataType__Group__1__Impl rule__HourDataType__Group__2 ;
    public final void rule__HourDataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2239:1: ( rule__HourDataType__Group__1__Impl rule__HourDataType__Group__2 )
            // InternalProgram.g:2240:2: rule__HourDataType__Group__1__Impl rule__HourDataType__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalProgram.g:2247:1: rule__HourDataType__Group__1__Impl : ( ':' ) ;
    public final void rule__HourDataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2251:1: ( ( ':' ) )
            // InternalProgram.g:2252:1: ( ':' )
            {
            // InternalProgram.g:2252:1: ( ':' )
            // InternalProgram.g:2253:2: ':'
            {
             before(grammarAccess.getHourDataTypeAccess().getColonKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalProgram.g:2262:1: rule__HourDataType__Group__2 : rule__HourDataType__Group__2__Impl ;
    public final void rule__HourDataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2266:1: ( rule__HourDataType__Group__2__Impl )
            // InternalProgram.g:2267:2: rule__HourDataType__Group__2__Impl
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
    // InternalProgram.g:2273:1: rule__HourDataType__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__HourDataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2277:1: ( ( RULE_INT ) )
            // InternalProgram.g:2278:1: ( RULE_INT )
            {
            // InternalProgram.g:2278:1: ( RULE_INT )
            // InternalProgram.g:2279:2: RULE_INT
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
    // InternalProgram.g:2289:1: rule__Session__Group__0 : rule__Session__Group__0__Impl rule__Session__Group__1 ;
    public final void rule__Session__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2293:1: ( rule__Session__Group__0__Impl rule__Session__Group__1 )
            // InternalProgram.g:2294:2: rule__Session__Group__0__Impl rule__Session__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalProgram.g:2301:1: rule__Session__Group__0__Impl : ( () ) ;
    public final void rule__Session__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2305:1: ( ( () ) )
            // InternalProgram.g:2306:1: ( () )
            {
            // InternalProgram.g:2306:1: ( () )
            // InternalProgram.g:2307:2: ()
            {
             before(grammarAccess.getSessionAccess().getSessionAction_0()); 
            // InternalProgram.g:2308:2: ()
            // InternalProgram.g:2308:3: 
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
    // InternalProgram.g:2316:1: rule__Session__Group__1 : rule__Session__Group__1__Impl rule__Session__Group__2 ;
    public final void rule__Session__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2320:1: ( rule__Session__Group__1__Impl rule__Session__Group__2 )
            // InternalProgram.g:2321:2: rule__Session__Group__1__Impl rule__Session__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalProgram.g:2328:1: rule__Session__Group__1__Impl : ( ( rule__Session__StartingTimeAssignment_1 ) ) ;
    public final void rule__Session__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2332:1: ( ( ( rule__Session__StartingTimeAssignment_1 ) ) )
            // InternalProgram.g:2333:1: ( ( rule__Session__StartingTimeAssignment_1 ) )
            {
            // InternalProgram.g:2333:1: ( ( rule__Session__StartingTimeAssignment_1 ) )
            // InternalProgram.g:2334:2: ( rule__Session__StartingTimeAssignment_1 )
            {
             before(grammarAccess.getSessionAccess().getStartingTimeAssignment_1()); 
            // InternalProgram.g:2335:2: ( rule__Session__StartingTimeAssignment_1 )
            // InternalProgram.g:2335:3: rule__Session__StartingTimeAssignment_1
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
    // InternalProgram.g:2343:1: rule__Session__Group__2 : rule__Session__Group__2__Impl rule__Session__Group__3 ;
    public final void rule__Session__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2347:1: ( rule__Session__Group__2__Impl rule__Session__Group__3 )
            // InternalProgram.g:2348:2: rule__Session__Group__2__Impl rule__Session__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalProgram.g:2355:1: rule__Session__Group__2__Impl : ( '-' ) ;
    public final void rule__Session__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2359:1: ( ( '-' ) )
            // InternalProgram.g:2360:1: ( '-' )
            {
            // InternalProgram.g:2360:1: ( '-' )
            // InternalProgram.g:2361:2: '-'
            {
             before(grammarAccess.getSessionAccess().getHyphenMinusKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalProgram.g:2370:1: rule__Session__Group__3 : rule__Session__Group__3__Impl rule__Session__Group__4 ;
    public final void rule__Session__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2374:1: ( rule__Session__Group__3__Impl rule__Session__Group__4 )
            // InternalProgram.g:2375:2: rule__Session__Group__3__Impl rule__Session__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalProgram.g:2382:1: rule__Session__Group__3__Impl : ( ( rule__Session__EndingTimeAssignment_3 ) ) ;
    public final void rule__Session__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2386:1: ( ( ( rule__Session__EndingTimeAssignment_3 ) ) )
            // InternalProgram.g:2387:1: ( ( rule__Session__EndingTimeAssignment_3 ) )
            {
            // InternalProgram.g:2387:1: ( ( rule__Session__EndingTimeAssignment_3 ) )
            // InternalProgram.g:2388:2: ( rule__Session__EndingTimeAssignment_3 )
            {
             before(grammarAccess.getSessionAccess().getEndingTimeAssignment_3()); 
            // InternalProgram.g:2389:2: ( rule__Session__EndingTimeAssignment_3 )
            // InternalProgram.g:2389:3: rule__Session__EndingTimeAssignment_3
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
    // InternalProgram.g:2397:1: rule__Session__Group__4 : rule__Session__Group__4__Impl rule__Session__Group__5 ;
    public final void rule__Session__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2401:1: ( rule__Session__Group__4__Impl rule__Session__Group__5 )
            // InternalProgram.g:2402:2: rule__Session__Group__4__Impl rule__Session__Group__5
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:2409:1: rule__Session__Group__4__Impl : ( 'in' ) ;
    public final void rule__Session__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2413:1: ( ( 'in' ) )
            // InternalProgram.g:2414:1: ( 'in' )
            {
            // InternalProgram.g:2414:1: ( 'in' )
            // InternalProgram.g:2415:2: 'in'
            {
             before(grammarAccess.getSessionAccess().getInKeyword_4()); 
            match(input,34,FOLLOW_2); 
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
    // InternalProgram.g:2424:1: rule__Session__Group__5 : rule__Session__Group__5__Impl rule__Session__Group__6 ;
    public final void rule__Session__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2428:1: ( rule__Session__Group__5__Impl rule__Session__Group__6 )
            // InternalProgram.g:2429:2: rule__Session__Group__5__Impl rule__Session__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalProgram.g:2436:1: rule__Session__Group__5__Impl : ( ( rule__Session__RoomAssignment_5 ) ) ;
    public final void rule__Session__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2440:1: ( ( ( rule__Session__RoomAssignment_5 ) ) )
            // InternalProgram.g:2441:1: ( ( rule__Session__RoomAssignment_5 ) )
            {
            // InternalProgram.g:2441:1: ( ( rule__Session__RoomAssignment_5 ) )
            // InternalProgram.g:2442:2: ( rule__Session__RoomAssignment_5 )
            {
             before(grammarAccess.getSessionAccess().getRoomAssignment_5()); 
            // InternalProgram.g:2443:2: ( rule__Session__RoomAssignment_5 )
            // InternalProgram.g:2443:3: rule__Session__RoomAssignment_5
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
    // InternalProgram.g:2451:1: rule__Session__Group__6 : rule__Session__Group__6__Impl rule__Session__Group__7 ;
    public final void rule__Session__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2455:1: ( rule__Session__Group__6__Impl rule__Session__Group__7 )
            // InternalProgram.g:2456:2: rule__Session__Group__6__Impl rule__Session__Group__7
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:2463:1: rule__Session__Group__6__Impl : ( ':' ) ;
    public final void rule__Session__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2467:1: ( ( ':' ) )
            // InternalProgram.g:2468:1: ( ':' )
            {
            // InternalProgram.g:2468:1: ( ':' )
            // InternalProgram.g:2469:2: ':'
            {
             before(grammarAccess.getSessionAccess().getColonKeyword_6()); 
            match(input,32,FOLLOW_2); 
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
    // InternalProgram.g:2478:1: rule__Session__Group__7 : rule__Session__Group__7__Impl rule__Session__Group__8 ;
    public final void rule__Session__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2482:1: ( rule__Session__Group__7__Impl rule__Session__Group__8 )
            // InternalProgram.g:2483:2: rule__Session__Group__7__Impl rule__Session__Group__8
            {
            pushFollow(FOLLOW_23);
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
    // InternalProgram.g:2490:1: rule__Session__Group__7__Impl : ( ( rule__Session__EventsAssignment_7 ) ) ;
    public final void rule__Session__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2494:1: ( ( ( rule__Session__EventsAssignment_7 ) ) )
            // InternalProgram.g:2495:1: ( ( rule__Session__EventsAssignment_7 ) )
            {
            // InternalProgram.g:2495:1: ( ( rule__Session__EventsAssignment_7 ) )
            // InternalProgram.g:2496:2: ( rule__Session__EventsAssignment_7 )
            {
             before(grammarAccess.getSessionAccess().getEventsAssignment_7()); 
            // InternalProgram.g:2497:2: ( rule__Session__EventsAssignment_7 )
            // InternalProgram.g:2497:3: rule__Session__EventsAssignment_7
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
    // InternalProgram.g:2505:1: rule__Session__Group__8 : rule__Session__Group__8__Impl ;
    public final void rule__Session__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2509:1: ( rule__Session__Group__8__Impl )
            // InternalProgram.g:2510:2: rule__Session__Group__8__Impl
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
    // InternalProgram.g:2516:1: rule__Session__Group__8__Impl : ( ( rule__Session__Group_8__0 )* ) ;
    public final void rule__Session__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2520:1: ( ( ( rule__Session__Group_8__0 )* ) )
            // InternalProgram.g:2521:1: ( ( rule__Session__Group_8__0 )* )
            {
            // InternalProgram.g:2521:1: ( ( rule__Session__Group_8__0 )* )
            // InternalProgram.g:2522:2: ( rule__Session__Group_8__0 )*
            {
             before(grammarAccess.getSessionAccess().getGroup_8()); 
            // InternalProgram.g:2523:2: ( rule__Session__Group_8__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==35) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalProgram.g:2523:3: rule__Session__Group_8__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Session__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalProgram.g:2532:1: rule__Session__Group_8__0 : rule__Session__Group_8__0__Impl rule__Session__Group_8__1 ;
    public final void rule__Session__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2536:1: ( rule__Session__Group_8__0__Impl rule__Session__Group_8__1 )
            // InternalProgram.g:2537:2: rule__Session__Group_8__0__Impl rule__Session__Group_8__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:2544:1: rule__Session__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Session__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2548:1: ( ( ',' ) )
            // InternalProgram.g:2549:1: ( ',' )
            {
            // InternalProgram.g:2549:1: ( ',' )
            // InternalProgram.g:2550:2: ','
            {
             before(grammarAccess.getSessionAccess().getCommaKeyword_8_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalProgram.g:2559:1: rule__Session__Group_8__1 : rule__Session__Group_8__1__Impl ;
    public final void rule__Session__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2563:1: ( rule__Session__Group_8__1__Impl )
            // InternalProgram.g:2564:2: rule__Session__Group_8__1__Impl
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
    // InternalProgram.g:2570:1: rule__Session__Group_8__1__Impl : ( ( rule__Session__EventsAssignment_8_1 ) ) ;
    public final void rule__Session__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2574:1: ( ( ( rule__Session__EventsAssignment_8_1 ) ) )
            // InternalProgram.g:2575:1: ( ( rule__Session__EventsAssignment_8_1 ) )
            {
            // InternalProgram.g:2575:1: ( ( rule__Session__EventsAssignment_8_1 ) )
            // InternalProgram.g:2576:2: ( rule__Session__EventsAssignment_8_1 )
            {
             before(grammarAccess.getSessionAccess().getEventsAssignment_8_1()); 
            // InternalProgram.g:2577:2: ( rule__Session__EventsAssignment_8_1 )
            // InternalProgram.g:2577:3: rule__Session__EventsAssignment_8_1
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
    // InternalProgram.g:2586:1: rule__TalkSession__Group__0 : rule__TalkSession__Group__0__Impl rule__TalkSession__Group__1 ;
    public final void rule__TalkSession__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2590:1: ( rule__TalkSession__Group__0__Impl rule__TalkSession__Group__1 )
            // InternalProgram.g:2591:2: rule__TalkSession__Group__0__Impl rule__TalkSession__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:2598:1: rule__TalkSession__Group__0__Impl : ( 'TalkSession' ) ;
    public final void rule__TalkSession__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2602:1: ( ( 'TalkSession' ) )
            // InternalProgram.g:2603:1: ( 'TalkSession' )
            {
            // InternalProgram.g:2603:1: ( 'TalkSession' )
            // InternalProgram.g:2604:2: 'TalkSession'
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
    // InternalProgram.g:2613:1: rule__TalkSession__Group__1 : rule__TalkSession__Group__1__Impl rule__TalkSession__Group__2 ;
    public final void rule__TalkSession__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2617:1: ( rule__TalkSession__Group__1__Impl rule__TalkSession__Group__2 )
            // InternalProgram.g:2618:2: rule__TalkSession__Group__1__Impl rule__TalkSession__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalProgram.g:2625:1: rule__TalkSession__Group__1__Impl : ( ( rule__TalkSession__NameAssignment_1 ) ) ;
    public final void rule__TalkSession__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2629:1: ( ( ( rule__TalkSession__NameAssignment_1 ) ) )
            // InternalProgram.g:2630:1: ( ( rule__TalkSession__NameAssignment_1 ) )
            {
            // InternalProgram.g:2630:1: ( ( rule__TalkSession__NameAssignment_1 ) )
            // InternalProgram.g:2631:2: ( rule__TalkSession__NameAssignment_1 )
            {
             before(grammarAccess.getTalkSessionAccess().getNameAssignment_1()); 
            // InternalProgram.g:2632:2: ( rule__TalkSession__NameAssignment_1 )
            // InternalProgram.g:2632:3: rule__TalkSession__NameAssignment_1
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
    // InternalProgram.g:2640:1: rule__TalkSession__Group__2 : rule__TalkSession__Group__2__Impl rule__TalkSession__Group__3 ;
    public final void rule__TalkSession__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2644:1: ( rule__TalkSession__Group__2__Impl rule__TalkSession__Group__3 )
            // InternalProgram.g:2645:2: rule__TalkSession__Group__2__Impl rule__TalkSession__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalProgram.g:2652:1: rule__TalkSession__Group__2__Impl : ( ( rule__TalkSession__Group_2__0 )? ) ;
    public final void rule__TalkSession__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2656:1: ( ( ( rule__TalkSession__Group_2__0 )? ) )
            // InternalProgram.g:2657:1: ( ( rule__TalkSession__Group_2__0 )? )
            {
            // InternalProgram.g:2657:1: ( ( rule__TalkSession__Group_2__0 )? )
            // InternalProgram.g:2658:2: ( rule__TalkSession__Group_2__0 )?
            {
             before(grammarAccess.getTalkSessionAccess().getGroup_2()); 
            // InternalProgram.g:2659:2: ( rule__TalkSession__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalProgram.g:2659:3: rule__TalkSession__Group_2__0
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
    // InternalProgram.g:2667:1: rule__TalkSession__Group__3 : rule__TalkSession__Group__3__Impl rule__TalkSession__Group__4 ;
    public final void rule__TalkSession__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2671:1: ( rule__TalkSession__Group__3__Impl rule__TalkSession__Group__4 )
            // InternalProgram.g:2672:2: rule__TalkSession__Group__3__Impl rule__TalkSession__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalProgram.g:2679:1: rule__TalkSession__Group__3__Impl : ( ( rule__TalkSession__Group_3__0 )? ) ;
    public final void rule__TalkSession__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2683:1: ( ( ( rule__TalkSession__Group_3__0 )? ) )
            // InternalProgram.g:2684:1: ( ( rule__TalkSession__Group_3__0 )? )
            {
            // InternalProgram.g:2684:1: ( ( rule__TalkSession__Group_3__0 )? )
            // InternalProgram.g:2685:2: ( rule__TalkSession__Group_3__0 )?
            {
             before(grammarAccess.getTalkSessionAccess().getGroup_3()); 
            // InternalProgram.g:2686:2: ( rule__TalkSession__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalProgram.g:2686:3: rule__TalkSession__Group_3__0
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
    // InternalProgram.g:2694:1: rule__TalkSession__Group__4 : rule__TalkSession__Group__4__Impl ;
    public final void rule__TalkSession__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2698:1: ( rule__TalkSession__Group__4__Impl )
            // InternalProgram.g:2699:2: rule__TalkSession__Group__4__Impl
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
    // InternalProgram.g:2705:1: rule__TalkSession__Group__4__Impl : ( ( rule__TalkSession__Group_4__0 )? ) ;
    public final void rule__TalkSession__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2709:1: ( ( ( rule__TalkSession__Group_4__0 )? ) )
            // InternalProgram.g:2710:1: ( ( rule__TalkSession__Group_4__0 )? )
            {
            // InternalProgram.g:2710:1: ( ( rule__TalkSession__Group_4__0 )? )
            // InternalProgram.g:2711:2: ( rule__TalkSession__Group_4__0 )?
            {
             before(grammarAccess.getTalkSessionAccess().getGroup_4()); 
            // InternalProgram.g:2712:2: ( rule__TalkSession__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalProgram.g:2712:3: rule__TalkSession__Group_4__0
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
    // InternalProgram.g:2721:1: rule__TalkSession__Group_2__0 : rule__TalkSession__Group_2__0__Impl rule__TalkSession__Group_2__1 ;
    public final void rule__TalkSession__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2725:1: ( rule__TalkSession__Group_2__0__Impl rule__TalkSession__Group_2__1 )
            // InternalProgram.g:2726:2: rule__TalkSession__Group_2__0__Impl rule__TalkSession__Group_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:2733:1: rule__TalkSession__Group_2__0__Impl : ( 'chair' ) ;
    public final void rule__TalkSession__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2737:1: ( ( 'chair' ) )
            // InternalProgram.g:2738:1: ( 'chair' )
            {
            // InternalProgram.g:2738:1: ( 'chair' )
            // InternalProgram.g:2739:2: 'chair'
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
    // InternalProgram.g:2748:1: rule__TalkSession__Group_2__1 : rule__TalkSession__Group_2__1__Impl ;
    public final void rule__TalkSession__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2752:1: ( rule__TalkSession__Group_2__1__Impl )
            // InternalProgram.g:2753:2: rule__TalkSession__Group_2__1__Impl
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
    // InternalProgram.g:2759:1: rule__TalkSession__Group_2__1__Impl : ( ( rule__TalkSession__ChairAssignment_2_1 ) ) ;
    public final void rule__TalkSession__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2763:1: ( ( ( rule__TalkSession__ChairAssignment_2_1 ) ) )
            // InternalProgram.g:2764:1: ( ( rule__TalkSession__ChairAssignment_2_1 ) )
            {
            // InternalProgram.g:2764:1: ( ( rule__TalkSession__ChairAssignment_2_1 ) )
            // InternalProgram.g:2765:2: ( rule__TalkSession__ChairAssignment_2_1 )
            {
             before(grammarAccess.getTalkSessionAccess().getChairAssignment_2_1()); 
            // InternalProgram.g:2766:2: ( rule__TalkSession__ChairAssignment_2_1 )
            // InternalProgram.g:2766:3: rule__TalkSession__ChairAssignment_2_1
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
    // InternalProgram.g:2775:1: rule__TalkSession__Group_3__0 : rule__TalkSession__Group_3__0__Impl rule__TalkSession__Group_3__1 ;
    public final void rule__TalkSession__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2779:1: ( rule__TalkSession__Group_3__0__Impl rule__TalkSession__Group_3__1 )
            // InternalProgram.g:2780:2: rule__TalkSession__Group_3__0__Impl rule__TalkSession__Group_3__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:2787:1: rule__TalkSession__Group_3__0__Impl : ( 'abstract' ) ;
    public final void rule__TalkSession__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2791:1: ( ( 'abstract' ) )
            // InternalProgram.g:2792:1: ( 'abstract' )
            {
            // InternalProgram.g:2792:1: ( 'abstract' )
            // InternalProgram.g:2793:2: 'abstract'
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
    // InternalProgram.g:2802:1: rule__TalkSession__Group_3__1 : rule__TalkSession__Group_3__1__Impl ;
    public final void rule__TalkSession__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2806:1: ( rule__TalkSession__Group_3__1__Impl )
            // InternalProgram.g:2807:2: rule__TalkSession__Group_3__1__Impl
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
    // InternalProgram.g:2813:1: rule__TalkSession__Group_3__1__Impl : ( ( rule__TalkSession__AbstractAssignment_3_1 ) ) ;
    public final void rule__TalkSession__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2817:1: ( ( ( rule__TalkSession__AbstractAssignment_3_1 ) ) )
            // InternalProgram.g:2818:1: ( ( rule__TalkSession__AbstractAssignment_3_1 ) )
            {
            // InternalProgram.g:2818:1: ( ( rule__TalkSession__AbstractAssignment_3_1 ) )
            // InternalProgram.g:2819:2: ( rule__TalkSession__AbstractAssignment_3_1 )
            {
             before(grammarAccess.getTalkSessionAccess().getAbstractAssignment_3_1()); 
            // InternalProgram.g:2820:2: ( rule__TalkSession__AbstractAssignment_3_1 )
            // InternalProgram.g:2820:3: rule__TalkSession__AbstractAssignment_3_1
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
    // InternalProgram.g:2829:1: rule__TalkSession__Group_4__0 : rule__TalkSession__Group_4__0__Impl rule__TalkSession__Group_4__1 ;
    public final void rule__TalkSession__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2833:1: ( rule__TalkSession__Group_4__0__Impl rule__TalkSession__Group_4__1 )
            // InternalProgram.g:2834:2: rule__TalkSession__Group_4__0__Impl rule__TalkSession__Group_4__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:2841:1: rule__TalkSession__Group_4__0__Impl : ( 'papers' ) ;
    public final void rule__TalkSession__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2845:1: ( ( 'papers' ) )
            // InternalProgram.g:2846:1: ( 'papers' )
            {
            // InternalProgram.g:2846:1: ( 'papers' )
            // InternalProgram.g:2847:2: 'papers'
            {
             before(grammarAccess.getTalkSessionAccess().getPapersKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalProgram.g:2856:1: rule__TalkSession__Group_4__1 : rule__TalkSession__Group_4__1__Impl rule__TalkSession__Group_4__2 ;
    public final void rule__TalkSession__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2860:1: ( rule__TalkSession__Group_4__1__Impl rule__TalkSession__Group_4__2 )
            // InternalProgram.g:2861:2: rule__TalkSession__Group_4__1__Impl rule__TalkSession__Group_4__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalProgram.g:2868:1: rule__TalkSession__Group_4__1__Impl : ( ( rule__TalkSession__PapersAssignment_4_1 ) ) ;
    public final void rule__TalkSession__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2872:1: ( ( ( rule__TalkSession__PapersAssignment_4_1 ) ) )
            // InternalProgram.g:2873:1: ( ( rule__TalkSession__PapersAssignment_4_1 ) )
            {
            // InternalProgram.g:2873:1: ( ( rule__TalkSession__PapersAssignment_4_1 ) )
            // InternalProgram.g:2874:2: ( rule__TalkSession__PapersAssignment_4_1 )
            {
             before(grammarAccess.getTalkSessionAccess().getPapersAssignment_4_1()); 
            // InternalProgram.g:2875:2: ( rule__TalkSession__PapersAssignment_4_1 )
            // InternalProgram.g:2875:3: rule__TalkSession__PapersAssignment_4_1
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
    // InternalProgram.g:2883:1: rule__TalkSession__Group_4__2 : rule__TalkSession__Group_4__2__Impl ;
    public final void rule__TalkSession__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2887:1: ( rule__TalkSession__Group_4__2__Impl )
            // InternalProgram.g:2888:2: rule__TalkSession__Group_4__2__Impl
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
    // InternalProgram.g:2894:1: rule__TalkSession__Group_4__2__Impl : ( ( rule__TalkSession__Group_4_2__0 )* ) ;
    public final void rule__TalkSession__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2898:1: ( ( ( rule__TalkSession__Group_4_2__0 )* ) )
            // InternalProgram.g:2899:1: ( ( rule__TalkSession__Group_4_2__0 )* )
            {
            // InternalProgram.g:2899:1: ( ( rule__TalkSession__Group_4_2__0 )* )
            // InternalProgram.g:2900:2: ( rule__TalkSession__Group_4_2__0 )*
            {
             before(grammarAccess.getTalkSessionAccess().getGroup_4_2()); 
            // InternalProgram.g:2901:2: ( rule__TalkSession__Group_4_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==35) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalProgram.g:2901:3: rule__TalkSession__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__TalkSession__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalProgram.g:2910:1: rule__TalkSession__Group_4_2__0 : rule__TalkSession__Group_4_2__0__Impl rule__TalkSession__Group_4_2__1 ;
    public final void rule__TalkSession__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2914:1: ( rule__TalkSession__Group_4_2__0__Impl rule__TalkSession__Group_4_2__1 )
            // InternalProgram.g:2915:2: rule__TalkSession__Group_4_2__0__Impl rule__TalkSession__Group_4_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:2922:1: rule__TalkSession__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__TalkSession__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2926:1: ( ( ',' ) )
            // InternalProgram.g:2927:1: ( ',' )
            {
            // InternalProgram.g:2927:1: ( ',' )
            // InternalProgram.g:2928:2: ','
            {
             before(grammarAccess.getTalkSessionAccess().getCommaKeyword_4_2_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalProgram.g:2937:1: rule__TalkSession__Group_4_2__1 : rule__TalkSession__Group_4_2__1__Impl ;
    public final void rule__TalkSession__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2941:1: ( rule__TalkSession__Group_4_2__1__Impl )
            // InternalProgram.g:2942:2: rule__TalkSession__Group_4_2__1__Impl
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
    // InternalProgram.g:2948:1: rule__TalkSession__Group_4_2__1__Impl : ( ( rule__TalkSession__PapersAssignment_4_2_1 ) ) ;
    public final void rule__TalkSession__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2952:1: ( ( ( rule__TalkSession__PapersAssignment_4_2_1 ) ) )
            // InternalProgram.g:2953:1: ( ( rule__TalkSession__PapersAssignment_4_2_1 ) )
            {
            // InternalProgram.g:2953:1: ( ( rule__TalkSession__PapersAssignment_4_2_1 ) )
            // InternalProgram.g:2954:2: ( rule__TalkSession__PapersAssignment_4_2_1 )
            {
             before(grammarAccess.getTalkSessionAccess().getPapersAssignment_4_2_1()); 
            // InternalProgram.g:2955:2: ( rule__TalkSession__PapersAssignment_4_2_1 )
            // InternalProgram.g:2955:3: rule__TalkSession__PapersAssignment_4_2_1
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
    // InternalProgram.g:2964:1: rule__Panel__Group__0 : rule__Panel__Group__0__Impl rule__Panel__Group__1 ;
    public final void rule__Panel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2968:1: ( rule__Panel__Group__0__Impl rule__Panel__Group__1 )
            // InternalProgram.g:2969:2: rule__Panel__Group__0__Impl rule__Panel__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:2976:1: rule__Panel__Group__0__Impl : ( 'Panel' ) ;
    public final void rule__Panel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2980:1: ( ( 'Panel' ) )
            // InternalProgram.g:2981:1: ( 'Panel' )
            {
            // InternalProgram.g:2981:1: ( 'Panel' )
            // InternalProgram.g:2982:2: 'Panel'
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
    // InternalProgram.g:2991:1: rule__Panel__Group__1 : rule__Panel__Group__1__Impl rule__Panel__Group__2 ;
    public final void rule__Panel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2995:1: ( rule__Panel__Group__1__Impl rule__Panel__Group__2 )
            // InternalProgram.g:2996:2: rule__Panel__Group__1__Impl rule__Panel__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalProgram.g:3003:1: rule__Panel__Group__1__Impl : ( ( rule__Panel__NameAssignment_1 ) ) ;
    public final void rule__Panel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3007:1: ( ( ( rule__Panel__NameAssignment_1 ) ) )
            // InternalProgram.g:3008:1: ( ( rule__Panel__NameAssignment_1 ) )
            {
            // InternalProgram.g:3008:1: ( ( rule__Panel__NameAssignment_1 ) )
            // InternalProgram.g:3009:2: ( rule__Panel__NameAssignment_1 )
            {
             before(grammarAccess.getPanelAccess().getNameAssignment_1()); 
            // InternalProgram.g:3010:2: ( rule__Panel__NameAssignment_1 )
            // InternalProgram.g:3010:3: rule__Panel__NameAssignment_1
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
    // InternalProgram.g:3018:1: rule__Panel__Group__2 : rule__Panel__Group__2__Impl rule__Panel__Group__3 ;
    public final void rule__Panel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3022:1: ( rule__Panel__Group__2__Impl rule__Panel__Group__3 )
            // InternalProgram.g:3023:2: rule__Panel__Group__2__Impl rule__Panel__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalProgram.g:3030:1: rule__Panel__Group__2__Impl : ( ( rule__Panel__Group_2__0 )? ) ;
    public final void rule__Panel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3034:1: ( ( ( rule__Panel__Group_2__0 )? ) )
            // InternalProgram.g:3035:1: ( ( rule__Panel__Group_2__0 )? )
            {
            // InternalProgram.g:3035:1: ( ( rule__Panel__Group_2__0 )? )
            // InternalProgram.g:3036:2: ( rule__Panel__Group_2__0 )?
            {
             before(grammarAccess.getPanelAccess().getGroup_2()); 
            // InternalProgram.g:3037:2: ( rule__Panel__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalProgram.g:3037:3: rule__Panel__Group_2__0
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
    // InternalProgram.g:3045:1: rule__Panel__Group__3 : rule__Panel__Group__3__Impl rule__Panel__Group__4 ;
    public final void rule__Panel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3049:1: ( rule__Panel__Group__3__Impl rule__Panel__Group__4 )
            // InternalProgram.g:3050:2: rule__Panel__Group__3__Impl rule__Panel__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalProgram.g:3057:1: rule__Panel__Group__3__Impl : ( ( rule__Panel__Group_3__0 )? ) ;
    public final void rule__Panel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3061:1: ( ( ( rule__Panel__Group_3__0 )? ) )
            // InternalProgram.g:3062:1: ( ( rule__Panel__Group_3__0 )? )
            {
            // InternalProgram.g:3062:1: ( ( rule__Panel__Group_3__0 )? )
            // InternalProgram.g:3063:2: ( rule__Panel__Group_3__0 )?
            {
             before(grammarAccess.getPanelAccess().getGroup_3()); 
            // InternalProgram.g:3064:2: ( rule__Panel__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==40) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalProgram.g:3064:3: rule__Panel__Group_3__0
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
    // InternalProgram.g:3072:1: rule__Panel__Group__4 : rule__Panel__Group__4__Impl ;
    public final void rule__Panel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3076:1: ( rule__Panel__Group__4__Impl )
            // InternalProgram.g:3077:2: rule__Panel__Group__4__Impl
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
    // InternalProgram.g:3083:1: rule__Panel__Group__4__Impl : ( ( rule__Panel__Group_4__0 )? ) ;
    public final void rule__Panel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3087:1: ( ( ( rule__Panel__Group_4__0 )? ) )
            // InternalProgram.g:3088:1: ( ( rule__Panel__Group_4__0 )? )
            {
            // InternalProgram.g:3088:1: ( ( rule__Panel__Group_4__0 )? )
            // InternalProgram.g:3089:2: ( rule__Panel__Group_4__0 )?
            {
             before(grammarAccess.getPanelAccess().getGroup_4()); 
            // InternalProgram.g:3090:2: ( rule__Panel__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalProgram.g:3090:3: rule__Panel__Group_4__0
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
    // InternalProgram.g:3099:1: rule__Panel__Group_2__0 : rule__Panel__Group_2__0__Impl rule__Panel__Group_2__1 ;
    public final void rule__Panel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3103:1: ( rule__Panel__Group_2__0__Impl rule__Panel__Group_2__1 )
            // InternalProgram.g:3104:2: rule__Panel__Group_2__0__Impl rule__Panel__Group_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:3111:1: rule__Panel__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__Panel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3115:1: ( ( 'abstract' ) )
            // InternalProgram.g:3116:1: ( 'abstract' )
            {
            // InternalProgram.g:3116:1: ( 'abstract' )
            // InternalProgram.g:3117:2: 'abstract'
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
    // InternalProgram.g:3126:1: rule__Panel__Group_2__1 : rule__Panel__Group_2__1__Impl ;
    public final void rule__Panel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3130:1: ( rule__Panel__Group_2__1__Impl )
            // InternalProgram.g:3131:2: rule__Panel__Group_2__1__Impl
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
    // InternalProgram.g:3137:1: rule__Panel__Group_2__1__Impl : ( ( rule__Panel__AbstractAssignment_2_1 ) ) ;
    public final void rule__Panel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3141:1: ( ( ( rule__Panel__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:3142:1: ( ( rule__Panel__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:3142:1: ( ( rule__Panel__AbstractAssignment_2_1 ) )
            // InternalProgram.g:3143:2: ( rule__Panel__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getPanelAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:3144:2: ( rule__Panel__AbstractAssignment_2_1 )
            // InternalProgram.g:3144:3: rule__Panel__AbstractAssignment_2_1
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
    // InternalProgram.g:3153:1: rule__Panel__Group_3__0 : rule__Panel__Group_3__0__Impl rule__Panel__Group_3__1 ;
    public final void rule__Panel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3157:1: ( rule__Panel__Group_3__0__Impl rule__Panel__Group_3__1 )
            // InternalProgram.g:3158:2: rule__Panel__Group_3__0__Impl rule__Panel__Group_3__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:3165:1: rule__Panel__Group_3__0__Impl : ( 'panelists' ) ;
    public final void rule__Panel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3169:1: ( ( 'panelists' ) )
            // InternalProgram.g:3170:1: ( 'panelists' )
            {
            // InternalProgram.g:3170:1: ( 'panelists' )
            // InternalProgram.g:3171:2: 'panelists'
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
    // InternalProgram.g:3180:1: rule__Panel__Group_3__1 : rule__Panel__Group_3__1__Impl rule__Panel__Group_3__2 ;
    public final void rule__Panel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3184:1: ( rule__Panel__Group_3__1__Impl rule__Panel__Group_3__2 )
            // InternalProgram.g:3185:2: rule__Panel__Group_3__1__Impl rule__Panel__Group_3__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalProgram.g:3192:1: rule__Panel__Group_3__1__Impl : ( ( rule__Panel__PanelistsAssignment_3_1 ) ) ;
    public final void rule__Panel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3196:1: ( ( ( rule__Panel__PanelistsAssignment_3_1 ) ) )
            // InternalProgram.g:3197:1: ( ( rule__Panel__PanelistsAssignment_3_1 ) )
            {
            // InternalProgram.g:3197:1: ( ( rule__Panel__PanelistsAssignment_3_1 ) )
            // InternalProgram.g:3198:2: ( rule__Panel__PanelistsAssignment_3_1 )
            {
             before(grammarAccess.getPanelAccess().getPanelistsAssignment_3_1()); 
            // InternalProgram.g:3199:2: ( rule__Panel__PanelistsAssignment_3_1 )
            // InternalProgram.g:3199:3: rule__Panel__PanelistsAssignment_3_1
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
    // InternalProgram.g:3207:1: rule__Panel__Group_3__2 : rule__Panel__Group_3__2__Impl ;
    public final void rule__Panel__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3211:1: ( rule__Panel__Group_3__2__Impl )
            // InternalProgram.g:3212:2: rule__Panel__Group_3__2__Impl
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
    // InternalProgram.g:3218:1: rule__Panel__Group_3__2__Impl : ( ( rule__Panel__Group_3_2__0 )* ) ;
    public final void rule__Panel__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3222:1: ( ( ( rule__Panel__Group_3_2__0 )* ) )
            // InternalProgram.g:3223:1: ( ( rule__Panel__Group_3_2__0 )* )
            {
            // InternalProgram.g:3223:1: ( ( rule__Panel__Group_3_2__0 )* )
            // InternalProgram.g:3224:2: ( rule__Panel__Group_3_2__0 )*
            {
             before(grammarAccess.getPanelAccess().getGroup_3_2()); 
            // InternalProgram.g:3225:2: ( rule__Panel__Group_3_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==35) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalProgram.g:3225:3: rule__Panel__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Panel__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalProgram.g:3234:1: rule__Panel__Group_3_2__0 : rule__Panel__Group_3_2__0__Impl rule__Panel__Group_3_2__1 ;
    public final void rule__Panel__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3238:1: ( rule__Panel__Group_3_2__0__Impl rule__Panel__Group_3_2__1 )
            // InternalProgram.g:3239:2: rule__Panel__Group_3_2__0__Impl rule__Panel__Group_3_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:3246:1: rule__Panel__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Panel__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3250:1: ( ( ',' ) )
            // InternalProgram.g:3251:1: ( ',' )
            {
            // InternalProgram.g:3251:1: ( ',' )
            // InternalProgram.g:3252:2: ','
            {
             before(grammarAccess.getPanelAccess().getCommaKeyword_3_2_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalProgram.g:3261:1: rule__Panel__Group_3_2__1 : rule__Panel__Group_3_2__1__Impl ;
    public final void rule__Panel__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3265:1: ( rule__Panel__Group_3_2__1__Impl )
            // InternalProgram.g:3266:2: rule__Panel__Group_3_2__1__Impl
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
    // InternalProgram.g:3272:1: rule__Panel__Group_3_2__1__Impl : ( ( rule__Panel__PanelistsAssignment_3_2_1 ) ) ;
    public final void rule__Panel__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3276:1: ( ( ( rule__Panel__PanelistsAssignment_3_2_1 ) ) )
            // InternalProgram.g:3277:1: ( ( rule__Panel__PanelistsAssignment_3_2_1 ) )
            {
            // InternalProgram.g:3277:1: ( ( rule__Panel__PanelistsAssignment_3_2_1 ) )
            // InternalProgram.g:3278:2: ( rule__Panel__PanelistsAssignment_3_2_1 )
            {
             before(grammarAccess.getPanelAccess().getPanelistsAssignment_3_2_1()); 
            // InternalProgram.g:3279:2: ( rule__Panel__PanelistsAssignment_3_2_1 )
            // InternalProgram.g:3279:3: rule__Panel__PanelistsAssignment_3_2_1
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
    // InternalProgram.g:3288:1: rule__Panel__Group_4__0 : rule__Panel__Group_4__0__Impl rule__Panel__Group_4__1 ;
    public final void rule__Panel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3292:1: ( rule__Panel__Group_4__0__Impl rule__Panel__Group_4__1 )
            // InternalProgram.g:3293:2: rule__Panel__Group_4__0__Impl rule__Panel__Group_4__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:3300:1: rule__Panel__Group_4__0__Impl : ( 'moderators' ) ;
    public final void rule__Panel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3304:1: ( ( 'moderators' ) )
            // InternalProgram.g:3305:1: ( 'moderators' )
            {
            // InternalProgram.g:3305:1: ( 'moderators' )
            // InternalProgram.g:3306:2: 'moderators'
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
    // InternalProgram.g:3315:1: rule__Panel__Group_4__1 : rule__Panel__Group_4__1__Impl rule__Panel__Group_4__2 ;
    public final void rule__Panel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3319:1: ( rule__Panel__Group_4__1__Impl rule__Panel__Group_4__2 )
            // InternalProgram.g:3320:2: rule__Panel__Group_4__1__Impl rule__Panel__Group_4__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalProgram.g:3327:1: rule__Panel__Group_4__1__Impl : ( ( rule__Panel__ModeratorsAssignment_4_1 ) ) ;
    public final void rule__Panel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3331:1: ( ( ( rule__Panel__ModeratorsAssignment_4_1 ) ) )
            // InternalProgram.g:3332:1: ( ( rule__Panel__ModeratorsAssignment_4_1 ) )
            {
            // InternalProgram.g:3332:1: ( ( rule__Panel__ModeratorsAssignment_4_1 ) )
            // InternalProgram.g:3333:2: ( rule__Panel__ModeratorsAssignment_4_1 )
            {
             before(grammarAccess.getPanelAccess().getModeratorsAssignment_4_1()); 
            // InternalProgram.g:3334:2: ( rule__Panel__ModeratorsAssignment_4_1 )
            // InternalProgram.g:3334:3: rule__Panel__ModeratorsAssignment_4_1
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
    // InternalProgram.g:3342:1: rule__Panel__Group_4__2 : rule__Panel__Group_4__2__Impl ;
    public final void rule__Panel__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3346:1: ( rule__Panel__Group_4__2__Impl )
            // InternalProgram.g:3347:2: rule__Panel__Group_4__2__Impl
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
    // InternalProgram.g:3353:1: rule__Panel__Group_4__2__Impl : ( ( rule__Panel__Group_4_2__0 )* ) ;
    public final void rule__Panel__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3357:1: ( ( ( rule__Panel__Group_4_2__0 )* ) )
            // InternalProgram.g:3358:1: ( ( rule__Panel__Group_4_2__0 )* )
            {
            // InternalProgram.g:3358:1: ( ( rule__Panel__Group_4_2__0 )* )
            // InternalProgram.g:3359:2: ( rule__Panel__Group_4_2__0 )*
            {
             before(grammarAccess.getPanelAccess().getGroup_4_2()); 
            // InternalProgram.g:3360:2: ( rule__Panel__Group_4_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==35) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalProgram.g:3360:3: rule__Panel__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Panel__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalProgram.g:3369:1: rule__Panel__Group_4_2__0 : rule__Panel__Group_4_2__0__Impl rule__Panel__Group_4_2__1 ;
    public final void rule__Panel__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3373:1: ( rule__Panel__Group_4_2__0__Impl rule__Panel__Group_4_2__1 )
            // InternalProgram.g:3374:2: rule__Panel__Group_4_2__0__Impl rule__Panel__Group_4_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:3381:1: rule__Panel__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Panel__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3385:1: ( ( ',' ) )
            // InternalProgram.g:3386:1: ( ',' )
            {
            // InternalProgram.g:3386:1: ( ',' )
            // InternalProgram.g:3387:2: ','
            {
             before(grammarAccess.getPanelAccess().getCommaKeyword_4_2_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalProgram.g:3396:1: rule__Panel__Group_4_2__1 : rule__Panel__Group_4_2__1__Impl ;
    public final void rule__Panel__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3400:1: ( rule__Panel__Group_4_2__1__Impl )
            // InternalProgram.g:3401:2: rule__Panel__Group_4_2__1__Impl
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
    // InternalProgram.g:3407:1: rule__Panel__Group_4_2__1__Impl : ( ( rule__Panel__ModeratorsAssignment_4_2_1 ) ) ;
    public final void rule__Panel__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3411:1: ( ( ( rule__Panel__ModeratorsAssignment_4_2_1 ) ) )
            // InternalProgram.g:3412:1: ( ( rule__Panel__ModeratorsAssignment_4_2_1 ) )
            {
            // InternalProgram.g:3412:1: ( ( rule__Panel__ModeratorsAssignment_4_2_1 ) )
            // InternalProgram.g:3413:2: ( rule__Panel__ModeratorsAssignment_4_2_1 )
            {
             before(grammarAccess.getPanelAccess().getModeratorsAssignment_4_2_1()); 
            // InternalProgram.g:3414:2: ( rule__Panel__ModeratorsAssignment_4_2_1 )
            // InternalProgram.g:3414:3: rule__Panel__ModeratorsAssignment_4_2_1
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


    // $ANTLR start "rule__Workshop__Group__0"
    // InternalProgram.g:3423:1: rule__Workshop__Group__0 : rule__Workshop__Group__0__Impl rule__Workshop__Group__1 ;
    public final void rule__Workshop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3427:1: ( rule__Workshop__Group__0__Impl rule__Workshop__Group__1 )
            // InternalProgram.g:3428:2: rule__Workshop__Group__0__Impl rule__Workshop__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:3435:1: rule__Workshop__Group__0__Impl : ( 'Workshop' ) ;
    public final void rule__Workshop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3439:1: ( ( 'Workshop' ) )
            // InternalProgram.g:3440:1: ( 'Workshop' )
            {
            // InternalProgram.g:3440:1: ( 'Workshop' )
            // InternalProgram.g:3441:2: 'Workshop'
            {
             before(grammarAccess.getWorkshopAccess().getWorkshopKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalProgram.g:3450:1: rule__Workshop__Group__1 : rule__Workshop__Group__1__Impl rule__Workshop__Group__2 ;
    public final void rule__Workshop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3454:1: ( rule__Workshop__Group__1__Impl rule__Workshop__Group__2 )
            // InternalProgram.g:3455:2: rule__Workshop__Group__1__Impl rule__Workshop__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalProgram.g:3462:1: rule__Workshop__Group__1__Impl : ( ( rule__Workshop__NameAssignment_1 ) ) ;
    public final void rule__Workshop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3466:1: ( ( ( rule__Workshop__NameAssignment_1 ) ) )
            // InternalProgram.g:3467:1: ( ( rule__Workshop__NameAssignment_1 ) )
            {
            // InternalProgram.g:3467:1: ( ( rule__Workshop__NameAssignment_1 ) )
            // InternalProgram.g:3468:2: ( rule__Workshop__NameAssignment_1 )
            {
             before(grammarAccess.getWorkshopAccess().getNameAssignment_1()); 
            // InternalProgram.g:3469:2: ( rule__Workshop__NameAssignment_1 )
            // InternalProgram.g:3469:3: rule__Workshop__NameAssignment_1
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
    // InternalProgram.g:3477:1: rule__Workshop__Group__2 : rule__Workshop__Group__2__Impl rule__Workshop__Group__3 ;
    public final void rule__Workshop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3481:1: ( rule__Workshop__Group__2__Impl rule__Workshop__Group__3 )
            // InternalProgram.g:3482:2: rule__Workshop__Group__2__Impl rule__Workshop__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalProgram.g:3489:1: rule__Workshop__Group__2__Impl : ( ( rule__Workshop__Group_2__0 )? ) ;
    public final void rule__Workshop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3493:1: ( ( ( rule__Workshop__Group_2__0 )? ) )
            // InternalProgram.g:3494:1: ( ( rule__Workshop__Group_2__0 )? )
            {
            // InternalProgram.g:3494:1: ( ( rule__Workshop__Group_2__0 )? )
            // InternalProgram.g:3495:2: ( rule__Workshop__Group_2__0 )?
            {
             before(grammarAccess.getWorkshopAccess().getGroup_2()); 
            // InternalProgram.g:3496:2: ( rule__Workshop__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalProgram.g:3496:3: rule__Workshop__Group_2__0
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
    // InternalProgram.g:3504:1: rule__Workshop__Group__3 : rule__Workshop__Group__3__Impl rule__Workshop__Group__4 ;
    public final void rule__Workshop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3508:1: ( rule__Workshop__Group__3__Impl rule__Workshop__Group__4 )
            // InternalProgram.g:3509:2: rule__Workshop__Group__3__Impl rule__Workshop__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalProgram.g:3516:1: rule__Workshop__Group__3__Impl : ( ( rule__Workshop__Group_3__0 )? ) ;
    public final void rule__Workshop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3520:1: ( ( ( rule__Workshop__Group_3__0 )? ) )
            // InternalProgram.g:3521:1: ( ( rule__Workshop__Group_3__0 )? )
            {
            // InternalProgram.g:3521:1: ( ( rule__Workshop__Group_3__0 )? )
            // InternalProgram.g:3522:2: ( rule__Workshop__Group_3__0 )?
            {
             before(grammarAccess.getWorkshopAccess().getGroup_3()); 
            // InternalProgram.g:3523:2: ( rule__Workshop__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==43) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalProgram.g:3523:3: rule__Workshop__Group_3__0
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
    // InternalProgram.g:3531:1: rule__Workshop__Group__4 : rule__Workshop__Group__4__Impl rule__Workshop__Group__5 ;
    public final void rule__Workshop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3535:1: ( rule__Workshop__Group__4__Impl rule__Workshop__Group__5 )
            // InternalProgram.g:3536:2: rule__Workshop__Group__4__Impl rule__Workshop__Group__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalProgram.g:3543:1: rule__Workshop__Group__4__Impl : ( ( rule__Workshop__Group_4__0 )? ) ;
    public final void rule__Workshop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3547:1: ( ( ( rule__Workshop__Group_4__0 )? ) )
            // InternalProgram.g:3548:1: ( ( rule__Workshop__Group_4__0 )? )
            {
            // InternalProgram.g:3548:1: ( ( rule__Workshop__Group_4__0 )? )
            // InternalProgram.g:3549:2: ( rule__Workshop__Group_4__0 )?
            {
             before(grammarAccess.getWorkshopAccess().getGroup_4()); 
            // InternalProgram.g:3550:2: ( rule__Workshop__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==44) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalProgram.g:3550:3: rule__Workshop__Group_4__0
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
    // InternalProgram.g:3558:1: rule__Workshop__Group__5 : rule__Workshop__Group__5__Impl ;
    public final void rule__Workshop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3562:1: ( rule__Workshop__Group__5__Impl )
            // InternalProgram.g:3563:2: rule__Workshop__Group__5__Impl
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
    // InternalProgram.g:3569:1: rule__Workshop__Group__5__Impl : ( ( rule__Workshop__Group_5__0 )? ) ;
    public final void rule__Workshop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3573:1: ( ( ( rule__Workshop__Group_5__0 )? ) )
            // InternalProgram.g:3574:1: ( ( rule__Workshop__Group_5__0 )? )
            {
            // InternalProgram.g:3574:1: ( ( rule__Workshop__Group_5__0 )? )
            // InternalProgram.g:3575:2: ( rule__Workshop__Group_5__0 )?
            {
             before(grammarAccess.getWorkshopAccess().getGroup_5()); 
            // InternalProgram.g:3576:2: ( rule__Workshop__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==45) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalProgram.g:3576:3: rule__Workshop__Group_5__0
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
    // InternalProgram.g:3585:1: rule__Workshop__Group_2__0 : rule__Workshop__Group_2__0__Impl rule__Workshop__Group_2__1 ;
    public final void rule__Workshop__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3589:1: ( rule__Workshop__Group_2__0__Impl rule__Workshop__Group_2__1 )
            // InternalProgram.g:3590:2: rule__Workshop__Group_2__0__Impl rule__Workshop__Group_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:3597:1: rule__Workshop__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__Workshop__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3601:1: ( ( 'abstract' ) )
            // InternalProgram.g:3602:1: ( 'abstract' )
            {
            // InternalProgram.g:3602:1: ( 'abstract' )
            // InternalProgram.g:3603:2: 'abstract'
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
    // InternalProgram.g:3612:1: rule__Workshop__Group_2__1 : rule__Workshop__Group_2__1__Impl ;
    public final void rule__Workshop__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3616:1: ( rule__Workshop__Group_2__1__Impl )
            // InternalProgram.g:3617:2: rule__Workshop__Group_2__1__Impl
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
    // InternalProgram.g:3623:1: rule__Workshop__Group_2__1__Impl : ( ( rule__Workshop__AbstractAssignment_2_1 ) ) ;
    public final void rule__Workshop__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3627:1: ( ( ( rule__Workshop__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:3628:1: ( ( rule__Workshop__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:3628:1: ( ( rule__Workshop__AbstractAssignment_2_1 ) )
            // InternalProgram.g:3629:2: ( rule__Workshop__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getWorkshopAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:3630:2: ( rule__Workshop__AbstractAssignment_2_1 )
            // InternalProgram.g:3630:3: rule__Workshop__AbstractAssignment_2_1
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
    // InternalProgram.g:3639:1: rule__Workshop__Group_3__0 : rule__Workshop__Group_3__0__Impl rule__Workshop__Group_3__1 ;
    public final void rule__Workshop__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3643:1: ( rule__Workshop__Group_3__0__Impl rule__Workshop__Group_3__1 )
            // InternalProgram.g:3644:2: rule__Workshop__Group_3__0__Impl rule__Workshop__Group_3__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:3651:1: rule__Workshop__Group_3__0__Impl : ( 'url' ) ;
    public final void rule__Workshop__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3655:1: ( ( 'url' ) )
            // InternalProgram.g:3656:1: ( 'url' )
            {
            // InternalProgram.g:3656:1: ( 'url' )
            // InternalProgram.g:3657:2: 'url'
            {
             before(grammarAccess.getWorkshopAccess().getUrlKeyword_3_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalProgram.g:3666:1: rule__Workshop__Group_3__1 : rule__Workshop__Group_3__1__Impl ;
    public final void rule__Workshop__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3670:1: ( rule__Workshop__Group_3__1__Impl )
            // InternalProgram.g:3671:2: rule__Workshop__Group_3__1__Impl
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
    // InternalProgram.g:3677:1: rule__Workshop__Group_3__1__Impl : ( ( rule__Workshop__UrlAssignment_3_1 ) ) ;
    public final void rule__Workshop__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3681:1: ( ( ( rule__Workshop__UrlAssignment_3_1 ) ) )
            // InternalProgram.g:3682:1: ( ( rule__Workshop__UrlAssignment_3_1 ) )
            {
            // InternalProgram.g:3682:1: ( ( rule__Workshop__UrlAssignment_3_1 ) )
            // InternalProgram.g:3683:2: ( rule__Workshop__UrlAssignment_3_1 )
            {
             before(grammarAccess.getWorkshopAccess().getUrlAssignment_3_1()); 
            // InternalProgram.g:3684:2: ( rule__Workshop__UrlAssignment_3_1 )
            // InternalProgram.g:3684:3: rule__Workshop__UrlAssignment_3_1
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
    // InternalProgram.g:3693:1: rule__Workshop__Group_4__0 : rule__Workshop__Group_4__0__Impl rule__Workshop__Group_4__1 ;
    public final void rule__Workshop__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3697:1: ( rule__Workshop__Group_4__0__Impl rule__Workshop__Group_4__1 )
            // InternalProgram.g:3698:2: rule__Workshop__Group_4__0__Impl rule__Workshop__Group_4__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:3705:1: rule__Workshop__Group_4__0__Impl : ( 'id' ) ;
    public final void rule__Workshop__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3709:1: ( ( 'id' ) )
            // InternalProgram.g:3710:1: ( 'id' )
            {
            // InternalProgram.g:3710:1: ( 'id' )
            // InternalProgram.g:3711:2: 'id'
            {
             before(grammarAccess.getWorkshopAccess().getIdKeyword_4_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getWorkshopAccess().getIdKeyword_4_0()); 

            }


            }

        }
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
    // InternalProgram.g:3720:1: rule__Workshop__Group_4__1 : rule__Workshop__Group_4__1__Impl ;
    public final void rule__Workshop__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3724:1: ( rule__Workshop__Group_4__1__Impl )
            // InternalProgram.g:3725:2: rule__Workshop__Group_4__1__Impl
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
    // InternalProgram.g:3731:1: rule__Workshop__Group_4__1__Impl : ( ( rule__Workshop__IdAssignment_4_1 ) ) ;
    public final void rule__Workshop__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3735:1: ( ( ( rule__Workshop__IdAssignment_4_1 ) ) )
            // InternalProgram.g:3736:1: ( ( rule__Workshop__IdAssignment_4_1 ) )
            {
            // InternalProgram.g:3736:1: ( ( rule__Workshop__IdAssignment_4_1 ) )
            // InternalProgram.g:3737:2: ( rule__Workshop__IdAssignment_4_1 )
            {
             before(grammarAccess.getWorkshopAccess().getIdAssignment_4_1()); 
            // InternalProgram.g:3738:2: ( rule__Workshop__IdAssignment_4_1 )
            // InternalProgram.g:3738:3: rule__Workshop__IdAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Workshop__IdAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkshopAccess().getIdAssignment_4_1()); 

            }


            }

        }
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
    // InternalProgram.g:3747:1: rule__Workshop__Group_5__0 : rule__Workshop__Group_5__0__Impl rule__Workshop__Group_5__1 ;
    public final void rule__Workshop__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3751:1: ( rule__Workshop__Group_5__0__Impl rule__Workshop__Group_5__1 )
            // InternalProgram.g:3752:2: rule__Workshop__Group_5__0__Impl rule__Workshop__Group_5__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:3759:1: rule__Workshop__Group_5__0__Impl : ( 'organizers' ) ;
    public final void rule__Workshop__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3763:1: ( ( 'organizers' ) )
            // InternalProgram.g:3764:1: ( 'organizers' )
            {
            // InternalProgram.g:3764:1: ( 'organizers' )
            // InternalProgram.g:3765:2: 'organizers'
            {
             before(grammarAccess.getWorkshopAccess().getOrganizersKeyword_5_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalProgram.g:3774:1: rule__Workshop__Group_5__1 : rule__Workshop__Group_5__1__Impl rule__Workshop__Group_5__2 ;
    public final void rule__Workshop__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3778:1: ( rule__Workshop__Group_5__1__Impl rule__Workshop__Group_5__2 )
            // InternalProgram.g:3779:2: rule__Workshop__Group_5__1__Impl rule__Workshop__Group_5__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalProgram.g:3786:1: rule__Workshop__Group_5__1__Impl : ( ( rule__Workshop__OrganizersAssignment_5_1 ) ) ;
    public final void rule__Workshop__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3790:1: ( ( ( rule__Workshop__OrganizersAssignment_5_1 ) ) )
            // InternalProgram.g:3791:1: ( ( rule__Workshop__OrganizersAssignment_5_1 ) )
            {
            // InternalProgram.g:3791:1: ( ( rule__Workshop__OrganizersAssignment_5_1 ) )
            // InternalProgram.g:3792:2: ( rule__Workshop__OrganizersAssignment_5_1 )
            {
             before(grammarAccess.getWorkshopAccess().getOrganizersAssignment_5_1()); 
            // InternalProgram.g:3793:2: ( rule__Workshop__OrganizersAssignment_5_1 )
            // InternalProgram.g:3793:3: rule__Workshop__OrganizersAssignment_5_1
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
    // InternalProgram.g:3801:1: rule__Workshop__Group_5__2 : rule__Workshop__Group_5__2__Impl ;
    public final void rule__Workshop__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3805:1: ( rule__Workshop__Group_5__2__Impl )
            // InternalProgram.g:3806:2: rule__Workshop__Group_5__2__Impl
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
    // InternalProgram.g:3812:1: rule__Workshop__Group_5__2__Impl : ( ( rule__Workshop__Group_5_2__0 )* ) ;
    public final void rule__Workshop__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3816:1: ( ( ( rule__Workshop__Group_5_2__0 )* ) )
            // InternalProgram.g:3817:1: ( ( rule__Workshop__Group_5_2__0 )* )
            {
            // InternalProgram.g:3817:1: ( ( rule__Workshop__Group_5_2__0 )* )
            // InternalProgram.g:3818:2: ( rule__Workshop__Group_5_2__0 )*
            {
             before(grammarAccess.getWorkshopAccess().getGroup_5_2()); 
            // InternalProgram.g:3819:2: ( rule__Workshop__Group_5_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==35) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalProgram.g:3819:3: rule__Workshop__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Workshop__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalProgram.g:3828:1: rule__Workshop__Group_5_2__0 : rule__Workshop__Group_5_2__0__Impl rule__Workshop__Group_5_2__1 ;
    public final void rule__Workshop__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3832:1: ( rule__Workshop__Group_5_2__0__Impl rule__Workshop__Group_5_2__1 )
            // InternalProgram.g:3833:2: rule__Workshop__Group_5_2__0__Impl rule__Workshop__Group_5_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:3840:1: rule__Workshop__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Workshop__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3844:1: ( ( ',' ) )
            // InternalProgram.g:3845:1: ( ',' )
            {
            // InternalProgram.g:3845:1: ( ',' )
            // InternalProgram.g:3846:2: ','
            {
             before(grammarAccess.getWorkshopAccess().getCommaKeyword_5_2_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalProgram.g:3855:1: rule__Workshop__Group_5_2__1 : rule__Workshop__Group_5_2__1__Impl ;
    public final void rule__Workshop__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3859:1: ( rule__Workshop__Group_5_2__1__Impl )
            // InternalProgram.g:3860:2: rule__Workshop__Group_5_2__1__Impl
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
    // InternalProgram.g:3866:1: rule__Workshop__Group_5_2__1__Impl : ( ( rule__Workshop__OrganizersAssignment_5_2_1 ) ) ;
    public final void rule__Workshop__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3870:1: ( ( ( rule__Workshop__OrganizersAssignment_5_2_1 ) ) )
            // InternalProgram.g:3871:1: ( ( rule__Workshop__OrganizersAssignment_5_2_1 ) )
            {
            // InternalProgram.g:3871:1: ( ( rule__Workshop__OrganizersAssignment_5_2_1 ) )
            // InternalProgram.g:3872:2: ( rule__Workshop__OrganizersAssignment_5_2_1 )
            {
             before(grammarAccess.getWorkshopAccess().getOrganizersAssignment_5_2_1()); 
            // InternalProgram.g:3873:2: ( rule__Workshop__OrganizersAssignment_5_2_1 )
            // InternalProgram.g:3873:3: rule__Workshop__OrganizersAssignment_5_2_1
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
    // InternalProgram.g:3882:1: rule__Tutorial__Group__0 : rule__Tutorial__Group__0__Impl rule__Tutorial__Group__1 ;
    public final void rule__Tutorial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3886:1: ( rule__Tutorial__Group__0__Impl rule__Tutorial__Group__1 )
            // InternalProgram.g:3887:2: rule__Tutorial__Group__0__Impl rule__Tutorial__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:3894:1: rule__Tutorial__Group__0__Impl : ( 'Tutorial' ) ;
    public final void rule__Tutorial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3898:1: ( ( 'Tutorial' ) )
            // InternalProgram.g:3899:1: ( 'Tutorial' )
            {
            // InternalProgram.g:3899:1: ( 'Tutorial' )
            // InternalProgram.g:3900:2: 'Tutorial'
            {
             before(grammarAccess.getTutorialAccess().getTutorialKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalProgram.g:3909:1: rule__Tutorial__Group__1 : rule__Tutorial__Group__1__Impl rule__Tutorial__Group__2 ;
    public final void rule__Tutorial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3913:1: ( rule__Tutorial__Group__1__Impl rule__Tutorial__Group__2 )
            // InternalProgram.g:3914:2: rule__Tutorial__Group__1__Impl rule__Tutorial__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalProgram.g:3921:1: rule__Tutorial__Group__1__Impl : ( ( rule__Tutorial__NameAssignment_1 ) ) ;
    public final void rule__Tutorial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3925:1: ( ( ( rule__Tutorial__NameAssignment_1 ) ) )
            // InternalProgram.g:3926:1: ( ( rule__Tutorial__NameAssignment_1 ) )
            {
            // InternalProgram.g:3926:1: ( ( rule__Tutorial__NameAssignment_1 ) )
            // InternalProgram.g:3927:2: ( rule__Tutorial__NameAssignment_1 )
            {
             before(grammarAccess.getTutorialAccess().getNameAssignment_1()); 
            // InternalProgram.g:3928:2: ( rule__Tutorial__NameAssignment_1 )
            // InternalProgram.g:3928:3: rule__Tutorial__NameAssignment_1
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
    // InternalProgram.g:3936:1: rule__Tutorial__Group__2 : rule__Tutorial__Group__2__Impl rule__Tutorial__Group__3 ;
    public final void rule__Tutorial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3940:1: ( rule__Tutorial__Group__2__Impl rule__Tutorial__Group__3 )
            // InternalProgram.g:3941:2: rule__Tutorial__Group__2__Impl rule__Tutorial__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalProgram.g:3948:1: rule__Tutorial__Group__2__Impl : ( ( rule__Tutorial__Group_2__0 )? ) ;
    public final void rule__Tutorial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3952:1: ( ( ( rule__Tutorial__Group_2__0 )? ) )
            // InternalProgram.g:3953:1: ( ( rule__Tutorial__Group_2__0 )? )
            {
            // InternalProgram.g:3953:1: ( ( rule__Tutorial__Group_2__0 )? )
            // InternalProgram.g:3954:2: ( rule__Tutorial__Group_2__0 )?
            {
             before(grammarAccess.getTutorialAccess().getGroup_2()); 
            // InternalProgram.g:3955:2: ( rule__Tutorial__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalProgram.g:3955:3: rule__Tutorial__Group_2__0
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
    // InternalProgram.g:3963:1: rule__Tutorial__Group__3 : rule__Tutorial__Group__3__Impl rule__Tutorial__Group__4 ;
    public final void rule__Tutorial__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3967:1: ( rule__Tutorial__Group__3__Impl rule__Tutorial__Group__4 )
            // InternalProgram.g:3968:2: rule__Tutorial__Group__3__Impl rule__Tutorial__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Tutorial__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tutorial__Group__4();

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
    // InternalProgram.g:3975:1: rule__Tutorial__Group__3__Impl : ( ( rule__Tutorial__Group_3__0 )? ) ;
    public final void rule__Tutorial__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3979:1: ( ( ( rule__Tutorial__Group_3__0 )? ) )
            // InternalProgram.g:3980:1: ( ( rule__Tutorial__Group_3__0 )? )
            {
            // InternalProgram.g:3980:1: ( ( rule__Tutorial__Group_3__0 )? )
            // InternalProgram.g:3981:2: ( rule__Tutorial__Group_3__0 )?
            {
             before(grammarAccess.getTutorialAccess().getGroup_3()); 
            // InternalProgram.g:3982:2: ( rule__Tutorial__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==44) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalProgram.g:3982:3: rule__Tutorial__Group_3__0
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


    // $ANTLR start "rule__Tutorial__Group__4"
    // InternalProgram.g:3990:1: rule__Tutorial__Group__4 : rule__Tutorial__Group__4__Impl ;
    public final void rule__Tutorial__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3994:1: ( rule__Tutorial__Group__4__Impl )
            // InternalProgram.g:3995:2: rule__Tutorial__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tutorial__Group__4__Impl();

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
    // $ANTLR end "rule__Tutorial__Group__4"


    // $ANTLR start "rule__Tutorial__Group__4__Impl"
    // InternalProgram.g:4001:1: rule__Tutorial__Group__4__Impl : ( ( rule__Tutorial__Group_4__0 )? ) ;
    public final void rule__Tutorial__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4005:1: ( ( ( rule__Tutorial__Group_4__0 )? ) )
            // InternalProgram.g:4006:1: ( ( rule__Tutorial__Group_4__0 )? )
            {
            // InternalProgram.g:4006:1: ( ( rule__Tutorial__Group_4__0 )? )
            // InternalProgram.g:4007:2: ( rule__Tutorial__Group_4__0 )?
            {
             before(grammarAccess.getTutorialAccess().getGroup_4()); 
            // InternalProgram.g:4008:2: ( rule__Tutorial__Group_4__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==45) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalProgram.g:4008:3: rule__Tutorial__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tutorial__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTutorialAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group__4__Impl"


    // $ANTLR start "rule__Tutorial__Group_2__0"
    // InternalProgram.g:4017:1: rule__Tutorial__Group_2__0 : rule__Tutorial__Group_2__0__Impl rule__Tutorial__Group_2__1 ;
    public final void rule__Tutorial__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4021:1: ( rule__Tutorial__Group_2__0__Impl rule__Tutorial__Group_2__1 )
            // InternalProgram.g:4022:2: rule__Tutorial__Group_2__0__Impl rule__Tutorial__Group_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:4029:1: rule__Tutorial__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__Tutorial__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4033:1: ( ( 'abstract' ) )
            // InternalProgram.g:4034:1: ( 'abstract' )
            {
            // InternalProgram.g:4034:1: ( 'abstract' )
            // InternalProgram.g:4035:2: 'abstract'
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
    // InternalProgram.g:4044:1: rule__Tutorial__Group_2__1 : rule__Tutorial__Group_2__1__Impl ;
    public final void rule__Tutorial__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4048:1: ( rule__Tutorial__Group_2__1__Impl )
            // InternalProgram.g:4049:2: rule__Tutorial__Group_2__1__Impl
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
    // InternalProgram.g:4055:1: rule__Tutorial__Group_2__1__Impl : ( ( rule__Tutorial__AbstractAssignment_2_1 ) ) ;
    public final void rule__Tutorial__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4059:1: ( ( ( rule__Tutorial__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:4060:1: ( ( rule__Tutorial__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:4060:1: ( ( rule__Tutorial__AbstractAssignment_2_1 ) )
            // InternalProgram.g:4061:2: ( rule__Tutorial__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getTutorialAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:4062:2: ( rule__Tutorial__AbstractAssignment_2_1 )
            // InternalProgram.g:4062:3: rule__Tutorial__AbstractAssignment_2_1
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
    // InternalProgram.g:4071:1: rule__Tutorial__Group_3__0 : rule__Tutorial__Group_3__0__Impl rule__Tutorial__Group_3__1 ;
    public final void rule__Tutorial__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4075:1: ( rule__Tutorial__Group_3__0__Impl rule__Tutorial__Group_3__1 )
            // InternalProgram.g:4076:2: rule__Tutorial__Group_3__0__Impl rule__Tutorial__Group_3__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:4083:1: rule__Tutorial__Group_3__0__Impl : ( 'id' ) ;
    public final void rule__Tutorial__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4087:1: ( ( 'id' ) )
            // InternalProgram.g:4088:1: ( 'id' )
            {
            // InternalProgram.g:4088:1: ( 'id' )
            // InternalProgram.g:4089:2: 'id'
            {
             before(grammarAccess.getTutorialAccess().getIdKeyword_3_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTutorialAccess().getIdKeyword_3_0()); 

            }


            }

        }
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
    // InternalProgram.g:4098:1: rule__Tutorial__Group_3__1 : rule__Tutorial__Group_3__1__Impl ;
    public final void rule__Tutorial__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4102:1: ( rule__Tutorial__Group_3__1__Impl )
            // InternalProgram.g:4103:2: rule__Tutorial__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tutorial__Group_3__1__Impl();

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
    // InternalProgram.g:4109:1: rule__Tutorial__Group_3__1__Impl : ( ( rule__Tutorial__IdAssignment_3_1 ) ) ;
    public final void rule__Tutorial__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4113:1: ( ( ( rule__Tutorial__IdAssignment_3_1 ) ) )
            // InternalProgram.g:4114:1: ( ( rule__Tutorial__IdAssignment_3_1 ) )
            {
            // InternalProgram.g:4114:1: ( ( rule__Tutorial__IdAssignment_3_1 ) )
            // InternalProgram.g:4115:2: ( rule__Tutorial__IdAssignment_3_1 )
            {
             before(grammarAccess.getTutorialAccess().getIdAssignment_3_1()); 
            // InternalProgram.g:4116:2: ( rule__Tutorial__IdAssignment_3_1 )
            // InternalProgram.g:4116:3: rule__Tutorial__IdAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Tutorial__IdAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTutorialAccess().getIdAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Tutorial__Group_4__0"
    // InternalProgram.g:4125:1: rule__Tutorial__Group_4__0 : rule__Tutorial__Group_4__0__Impl rule__Tutorial__Group_4__1 ;
    public final void rule__Tutorial__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4129:1: ( rule__Tutorial__Group_4__0__Impl rule__Tutorial__Group_4__1 )
            // InternalProgram.g:4130:2: rule__Tutorial__Group_4__0__Impl rule__Tutorial__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Tutorial__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tutorial__Group_4__1();

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
    // $ANTLR end "rule__Tutorial__Group_4__0"


    // $ANTLR start "rule__Tutorial__Group_4__0__Impl"
    // InternalProgram.g:4137:1: rule__Tutorial__Group_4__0__Impl : ( 'organizers' ) ;
    public final void rule__Tutorial__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4141:1: ( ( 'organizers' ) )
            // InternalProgram.g:4142:1: ( 'organizers' )
            {
            // InternalProgram.g:4142:1: ( 'organizers' )
            // InternalProgram.g:4143:2: 'organizers'
            {
             before(grammarAccess.getTutorialAccess().getOrganizersKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTutorialAccess().getOrganizersKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_4__0__Impl"


    // $ANTLR start "rule__Tutorial__Group_4__1"
    // InternalProgram.g:4152:1: rule__Tutorial__Group_4__1 : rule__Tutorial__Group_4__1__Impl rule__Tutorial__Group_4__2 ;
    public final void rule__Tutorial__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4156:1: ( rule__Tutorial__Group_4__1__Impl rule__Tutorial__Group_4__2 )
            // InternalProgram.g:4157:2: rule__Tutorial__Group_4__1__Impl rule__Tutorial__Group_4__2
            {
            pushFollow(FOLLOW_23);
            rule__Tutorial__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tutorial__Group_4__2();

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
    // $ANTLR end "rule__Tutorial__Group_4__1"


    // $ANTLR start "rule__Tutorial__Group_4__1__Impl"
    // InternalProgram.g:4164:1: rule__Tutorial__Group_4__1__Impl : ( ( rule__Tutorial__OrganizersAssignment_4_1 ) ) ;
    public final void rule__Tutorial__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4168:1: ( ( ( rule__Tutorial__OrganizersAssignment_4_1 ) ) )
            // InternalProgram.g:4169:1: ( ( rule__Tutorial__OrganizersAssignment_4_1 ) )
            {
            // InternalProgram.g:4169:1: ( ( rule__Tutorial__OrganizersAssignment_4_1 ) )
            // InternalProgram.g:4170:2: ( rule__Tutorial__OrganizersAssignment_4_1 )
            {
             before(grammarAccess.getTutorialAccess().getOrganizersAssignment_4_1()); 
            // InternalProgram.g:4171:2: ( rule__Tutorial__OrganizersAssignment_4_1 )
            // InternalProgram.g:4171:3: rule__Tutorial__OrganizersAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Tutorial__OrganizersAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTutorialAccess().getOrganizersAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_4__1__Impl"


    // $ANTLR start "rule__Tutorial__Group_4__2"
    // InternalProgram.g:4179:1: rule__Tutorial__Group_4__2 : rule__Tutorial__Group_4__2__Impl ;
    public final void rule__Tutorial__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4183:1: ( rule__Tutorial__Group_4__2__Impl )
            // InternalProgram.g:4184:2: rule__Tutorial__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tutorial__Group_4__2__Impl();

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
    // $ANTLR end "rule__Tutorial__Group_4__2"


    // $ANTLR start "rule__Tutorial__Group_4__2__Impl"
    // InternalProgram.g:4190:1: rule__Tutorial__Group_4__2__Impl : ( ( rule__Tutorial__Group_4_2__0 )* ) ;
    public final void rule__Tutorial__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4194:1: ( ( ( rule__Tutorial__Group_4_2__0 )* ) )
            // InternalProgram.g:4195:1: ( ( rule__Tutorial__Group_4_2__0 )* )
            {
            // InternalProgram.g:4195:1: ( ( rule__Tutorial__Group_4_2__0 )* )
            // InternalProgram.g:4196:2: ( rule__Tutorial__Group_4_2__0 )*
            {
             before(grammarAccess.getTutorialAccess().getGroup_4_2()); 
            // InternalProgram.g:4197:2: ( rule__Tutorial__Group_4_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==35) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalProgram.g:4197:3: rule__Tutorial__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Tutorial__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getTutorialAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_4__2__Impl"


    // $ANTLR start "rule__Tutorial__Group_4_2__0"
    // InternalProgram.g:4206:1: rule__Tutorial__Group_4_2__0 : rule__Tutorial__Group_4_2__0__Impl rule__Tutorial__Group_4_2__1 ;
    public final void rule__Tutorial__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4210:1: ( rule__Tutorial__Group_4_2__0__Impl rule__Tutorial__Group_4_2__1 )
            // InternalProgram.g:4211:2: rule__Tutorial__Group_4_2__0__Impl rule__Tutorial__Group_4_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Tutorial__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tutorial__Group_4_2__1();

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
    // $ANTLR end "rule__Tutorial__Group_4_2__0"


    // $ANTLR start "rule__Tutorial__Group_4_2__0__Impl"
    // InternalProgram.g:4218:1: rule__Tutorial__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Tutorial__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4222:1: ( ( ',' ) )
            // InternalProgram.g:4223:1: ( ',' )
            {
            // InternalProgram.g:4223:1: ( ',' )
            // InternalProgram.g:4224:2: ','
            {
             before(grammarAccess.getTutorialAccess().getCommaKeyword_4_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTutorialAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_4_2__0__Impl"


    // $ANTLR start "rule__Tutorial__Group_4_2__1"
    // InternalProgram.g:4233:1: rule__Tutorial__Group_4_2__1 : rule__Tutorial__Group_4_2__1__Impl ;
    public final void rule__Tutorial__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4237:1: ( rule__Tutorial__Group_4_2__1__Impl )
            // InternalProgram.g:4238:2: rule__Tutorial__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tutorial__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__Tutorial__Group_4_2__1"


    // $ANTLR start "rule__Tutorial__Group_4_2__1__Impl"
    // InternalProgram.g:4244:1: rule__Tutorial__Group_4_2__1__Impl : ( ( rule__Tutorial__OrganizersAssignment_4_2_1 ) ) ;
    public final void rule__Tutorial__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4248:1: ( ( ( rule__Tutorial__OrganizersAssignment_4_2_1 ) ) )
            // InternalProgram.g:4249:1: ( ( rule__Tutorial__OrganizersAssignment_4_2_1 ) )
            {
            // InternalProgram.g:4249:1: ( ( rule__Tutorial__OrganizersAssignment_4_2_1 ) )
            // InternalProgram.g:4250:2: ( rule__Tutorial__OrganizersAssignment_4_2_1 )
            {
             before(grammarAccess.getTutorialAccess().getOrganizersAssignment_4_2_1()); 
            // InternalProgram.g:4251:2: ( rule__Tutorial__OrganizersAssignment_4_2_1 )
            // InternalProgram.g:4251:3: rule__Tutorial__OrganizersAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Tutorial__OrganizersAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTutorialAccess().getOrganizersAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_4_2__1__Impl"


    // $ANTLR start "rule__DoctoralSymposium__Group__0"
    // InternalProgram.g:4260:1: rule__DoctoralSymposium__Group__0 : rule__DoctoralSymposium__Group__0__Impl rule__DoctoralSymposium__Group__1 ;
    public final void rule__DoctoralSymposium__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4264:1: ( rule__DoctoralSymposium__Group__0__Impl rule__DoctoralSymposium__Group__1 )
            // InternalProgram.g:4265:2: rule__DoctoralSymposium__Group__0__Impl rule__DoctoralSymposium__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:4272:1: rule__DoctoralSymposium__Group__0__Impl : ( 'DoctoralSymposium' ) ;
    public final void rule__DoctoralSymposium__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4276:1: ( ( 'DoctoralSymposium' ) )
            // InternalProgram.g:4277:1: ( 'DoctoralSymposium' )
            {
            // InternalProgram.g:4277:1: ( 'DoctoralSymposium' )
            // InternalProgram.g:4278:2: 'DoctoralSymposium'
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getDoctoralSymposiumKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalProgram.g:4287:1: rule__DoctoralSymposium__Group__1 : rule__DoctoralSymposium__Group__1__Impl rule__DoctoralSymposium__Group__2 ;
    public final void rule__DoctoralSymposium__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4291:1: ( rule__DoctoralSymposium__Group__1__Impl rule__DoctoralSymposium__Group__2 )
            // InternalProgram.g:4292:2: rule__DoctoralSymposium__Group__1__Impl rule__DoctoralSymposium__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalProgram.g:4299:1: rule__DoctoralSymposium__Group__1__Impl : ( ( rule__DoctoralSymposium__NameAssignment_1 ) ) ;
    public final void rule__DoctoralSymposium__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4303:1: ( ( ( rule__DoctoralSymposium__NameAssignment_1 ) ) )
            // InternalProgram.g:4304:1: ( ( rule__DoctoralSymposium__NameAssignment_1 ) )
            {
            // InternalProgram.g:4304:1: ( ( rule__DoctoralSymposium__NameAssignment_1 ) )
            // InternalProgram.g:4305:2: ( rule__DoctoralSymposium__NameAssignment_1 )
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getNameAssignment_1()); 
            // InternalProgram.g:4306:2: ( rule__DoctoralSymposium__NameAssignment_1 )
            // InternalProgram.g:4306:3: rule__DoctoralSymposium__NameAssignment_1
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
    // InternalProgram.g:4314:1: rule__DoctoralSymposium__Group__2 : rule__DoctoralSymposium__Group__2__Impl rule__DoctoralSymposium__Group__3 ;
    public final void rule__DoctoralSymposium__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4318:1: ( rule__DoctoralSymposium__Group__2__Impl rule__DoctoralSymposium__Group__3 )
            // InternalProgram.g:4319:2: rule__DoctoralSymposium__Group__2__Impl rule__DoctoralSymposium__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalProgram.g:4326:1: rule__DoctoralSymposium__Group__2__Impl : ( ( rule__DoctoralSymposium__Group_2__0 )? ) ;
    public final void rule__DoctoralSymposium__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4330:1: ( ( ( rule__DoctoralSymposium__Group_2__0 )? ) )
            // InternalProgram.g:4331:1: ( ( rule__DoctoralSymposium__Group_2__0 )? )
            {
            // InternalProgram.g:4331:1: ( ( rule__DoctoralSymposium__Group_2__0 )? )
            // InternalProgram.g:4332:2: ( rule__DoctoralSymposium__Group_2__0 )?
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getGroup_2()); 
            // InternalProgram.g:4333:2: ( rule__DoctoralSymposium__Group_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==38) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalProgram.g:4333:3: rule__DoctoralSymposium__Group_2__0
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
    // InternalProgram.g:4341:1: rule__DoctoralSymposium__Group__3 : rule__DoctoralSymposium__Group__3__Impl ;
    public final void rule__DoctoralSymposium__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4345:1: ( rule__DoctoralSymposium__Group__3__Impl )
            // InternalProgram.g:4346:2: rule__DoctoralSymposium__Group__3__Impl
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
    // InternalProgram.g:4352:1: rule__DoctoralSymposium__Group__3__Impl : ( ( rule__DoctoralSymposium__Group_3__0 )? ) ;
    public final void rule__DoctoralSymposium__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4356:1: ( ( ( rule__DoctoralSymposium__Group_3__0 )? ) )
            // InternalProgram.g:4357:1: ( ( rule__DoctoralSymposium__Group_3__0 )? )
            {
            // InternalProgram.g:4357:1: ( ( rule__DoctoralSymposium__Group_3__0 )? )
            // InternalProgram.g:4358:2: ( rule__DoctoralSymposium__Group_3__0 )?
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getGroup_3()); 
            // InternalProgram.g:4359:2: ( rule__DoctoralSymposium__Group_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==45) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalProgram.g:4359:3: rule__DoctoralSymposium__Group_3__0
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
    // InternalProgram.g:4368:1: rule__DoctoralSymposium__Group_2__0 : rule__DoctoralSymposium__Group_2__0__Impl rule__DoctoralSymposium__Group_2__1 ;
    public final void rule__DoctoralSymposium__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4372:1: ( rule__DoctoralSymposium__Group_2__0__Impl rule__DoctoralSymposium__Group_2__1 )
            // InternalProgram.g:4373:2: rule__DoctoralSymposium__Group_2__0__Impl rule__DoctoralSymposium__Group_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:4380:1: rule__DoctoralSymposium__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__DoctoralSymposium__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4384:1: ( ( 'abstract' ) )
            // InternalProgram.g:4385:1: ( 'abstract' )
            {
            // InternalProgram.g:4385:1: ( 'abstract' )
            // InternalProgram.g:4386:2: 'abstract'
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
    // InternalProgram.g:4395:1: rule__DoctoralSymposium__Group_2__1 : rule__DoctoralSymposium__Group_2__1__Impl ;
    public final void rule__DoctoralSymposium__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4399:1: ( rule__DoctoralSymposium__Group_2__1__Impl )
            // InternalProgram.g:4400:2: rule__DoctoralSymposium__Group_2__1__Impl
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
    // InternalProgram.g:4406:1: rule__DoctoralSymposium__Group_2__1__Impl : ( ( rule__DoctoralSymposium__AbstractAssignment_2_1 ) ) ;
    public final void rule__DoctoralSymposium__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4410:1: ( ( ( rule__DoctoralSymposium__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:4411:1: ( ( rule__DoctoralSymposium__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:4411:1: ( ( rule__DoctoralSymposium__AbstractAssignment_2_1 ) )
            // InternalProgram.g:4412:2: ( rule__DoctoralSymposium__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:4413:2: ( rule__DoctoralSymposium__AbstractAssignment_2_1 )
            // InternalProgram.g:4413:3: rule__DoctoralSymposium__AbstractAssignment_2_1
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
    // InternalProgram.g:4422:1: rule__DoctoralSymposium__Group_3__0 : rule__DoctoralSymposium__Group_3__0__Impl rule__DoctoralSymposium__Group_3__1 ;
    public final void rule__DoctoralSymposium__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4426:1: ( rule__DoctoralSymposium__Group_3__0__Impl rule__DoctoralSymposium__Group_3__1 )
            // InternalProgram.g:4427:2: rule__DoctoralSymposium__Group_3__0__Impl rule__DoctoralSymposium__Group_3__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:4434:1: rule__DoctoralSymposium__Group_3__0__Impl : ( 'organizers' ) ;
    public final void rule__DoctoralSymposium__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4438:1: ( ( 'organizers' ) )
            // InternalProgram.g:4439:1: ( 'organizers' )
            {
            // InternalProgram.g:4439:1: ( 'organizers' )
            // InternalProgram.g:4440:2: 'organizers'
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getOrganizersKeyword_3_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalProgram.g:4449:1: rule__DoctoralSymposium__Group_3__1 : rule__DoctoralSymposium__Group_3__1__Impl rule__DoctoralSymposium__Group_3__2 ;
    public final void rule__DoctoralSymposium__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4453:1: ( rule__DoctoralSymposium__Group_3__1__Impl rule__DoctoralSymposium__Group_3__2 )
            // InternalProgram.g:4454:2: rule__DoctoralSymposium__Group_3__1__Impl rule__DoctoralSymposium__Group_3__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalProgram.g:4461:1: rule__DoctoralSymposium__Group_3__1__Impl : ( ( rule__DoctoralSymposium__OrganizersAssignment_3_1 ) ) ;
    public final void rule__DoctoralSymposium__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4465:1: ( ( ( rule__DoctoralSymposium__OrganizersAssignment_3_1 ) ) )
            // InternalProgram.g:4466:1: ( ( rule__DoctoralSymposium__OrganizersAssignment_3_1 ) )
            {
            // InternalProgram.g:4466:1: ( ( rule__DoctoralSymposium__OrganizersAssignment_3_1 ) )
            // InternalProgram.g:4467:2: ( rule__DoctoralSymposium__OrganizersAssignment_3_1 )
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getOrganizersAssignment_3_1()); 
            // InternalProgram.g:4468:2: ( rule__DoctoralSymposium__OrganizersAssignment_3_1 )
            // InternalProgram.g:4468:3: rule__DoctoralSymposium__OrganizersAssignment_3_1
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
    // InternalProgram.g:4476:1: rule__DoctoralSymposium__Group_3__2 : rule__DoctoralSymposium__Group_3__2__Impl ;
    public final void rule__DoctoralSymposium__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4480:1: ( rule__DoctoralSymposium__Group_3__2__Impl )
            // InternalProgram.g:4481:2: rule__DoctoralSymposium__Group_3__2__Impl
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
    // InternalProgram.g:4487:1: rule__DoctoralSymposium__Group_3__2__Impl : ( ( rule__DoctoralSymposium__Group_3_2__0 )* ) ;
    public final void rule__DoctoralSymposium__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4491:1: ( ( ( rule__DoctoralSymposium__Group_3_2__0 )* ) )
            // InternalProgram.g:4492:1: ( ( rule__DoctoralSymposium__Group_3_2__0 )* )
            {
            // InternalProgram.g:4492:1: ( ( rule__DoctoralSymposium__Group_3_2__0 )* )
            // InternalProgram.g:4493:2: ( rule__DoctoralSymposium__Group_3_2__0 )*
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getGroup_3_2()); 
            // InternalProgram.g:4494:2: ( rule__DoctoralSymposium__Group_3_2__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==35) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalProgram.g:4494:3: rule__DoctoralSymposium__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__DoctoralSymposium__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalProgram.g:4503:1: rule__DoctoralSymposium__Group_3_2__0 : rule__DoctoralSymposium__Group_3_2__0__Impl rule__DoctoralSymposium__Group_3_2__1 ;
    public final void rule__DoctoralSymposium__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4507:1: ( rule__DoctoralSymposium__Group_3_2__0__Impl rule__DoctoralSymposium__Group_3_2__1 )
            // InternalProgram.g:4508:2: rule__DoctoralSymposium__Group_3_2__0__Impl rule__DoctoralSymposium__Group_3_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:4515:1: rule__DoctoralSymposium__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__DoctoralSymposium__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4519:1: ( ( ',' ) )
            // InternalProgram.g:4520:1: ( ',' )
            {
            // InternalProgram.g:4520:1: ( ',' )
            // InternalProgram.g:4521:2: ','
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getCommaKeyword_3_2_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalProgram.g:4530:1: rule__DoctoralSymposium__Group_3_2__1 : rule__DoctoralSymposium__Group_3_2__1__Impl ;
    public final void rule__DoctoralSymposium__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4534:1: ( rule__DoctoralSymposium__Group_3_2__1__Impl )
            // InternalProgram.g:4535:2: rule__DoctoralSymposium__Group_3_2__1__Impl
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
    // InternalProgram.g:4541:1: rule__DoctoralSymposium__Group_3_2__1__Impl : ( ( rule__DoctoralSymposium__OrganizersAssignment_3_2_1 ) ) ;
    public final void rule__DoctoralSymposium__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4545:1: ( ( ( rule__DoctoralSymposium__OrganizersAssignment_3_2_1 ) ) )
            // InternalProgram.g:4546:1: ( ( rule__DoctoralSymposium__OrganizersAssignment_3_2_1 ) )
            {
            // InternalProgram.g:4546:1: ( ( rule__DoctoralSymposium__OrganizersAssignment_3_2_1 ) )
            // InternalProgram.g:4547:2: ( rule__DoctoralSymposium__OrganizersAssignment_3_2_1 )
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getOrganizersAssignment_3_2_1()); 
            // InternalProgram.g:4548:2: ( rule__DoctoralSymposium__OrganizersAssignment_3_2_1 )
            // InternalProgram.g:4548:3: rule__DoctoralSymposium__OrganizersAssignment_3_2_1
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
    // InternalProgram.g:4557:1: rule__EducatorSymposium__Group__0 : rule__EducatorSymposium__Group__0__Impl rule__EducatorSymposium__Group__1 ;
    public final void rule__EducatorSymposium__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4561:1: ( rule__EducatorSymposium__Group__0__Impl rule__EducatorSymposium__Group__1 )
            // InternalProgram.g:4562:2: rule__EducatorSymposium__Group__0__Impl rule__EducatorSymposium__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:4569:1: rule__EducatorSymposium__Group__0__Impl : ( 'EducatorSymposium' ) ;
    public final void rule__EducatorSymposium__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4573:1: ( ( 'EducatorSymposium' ) )
            // InternalProgram.g:4574:1: ( 'EducatorSymposium' )
            {
            // InternalProgram.g:4574:1: ( 'EducatorSymposium' )
            // InternalProgram.g:4575:2: 'EducatorSymposium'
            {
             before(grammarAccess.getEducatorSymposiumAccess().getEducatorSymposiumKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalProgram.g:4584:1: rule__EducatorSymposium__Group__1 : rule__EducatorSymposium__Group__1__Impl rule__EducatorSymposium__Group__2 ;
    public final void rule__EducatorSymposium__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4588:1: ( rule__EducatorSymposium__Group__1__Impl rule__EducatorSymposium__Group__2 )
            // InternalProgram.g:4589:2: rule__EducatorSymposium__Group__1__Impl rule__EducatorSymposium__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalProgram.g:4596:1: rule__EducatorSymposium__Group__1__Impl : ( ( rule__EducatorSymposium__NameAssignment_1 ) ) ;
    public final void rule__EducatorSymposium__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4600:1: ( ( ( rule__EducatorSymposium__NameAssignment_1 ) ) )
            // InternalProgram.g:4601:1: ( ( rule__EducatorSymposium__NameAssignment_1 ) )
            {
            // InternalProgram.g:4601:1: ( ( rule__EducatorSymposium__NameAssignment_1 ) )
            // InternalProgram.g:4602:2: ( rule__EducatorSymposium__NameAssignment_1 )
            {
             before(grammarAccess.getEducatorSymposiumAccess().getNameAssignment_1()); 
            // InternalProgram.g:4603:2: ( rule__EducatorSymposium__NameAssignment_1 )
            // InternalProgram.g:4603:3: rule__EducatorSymposium__NameAssignment_1
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
    // InternalProgram.g:4611:1: rule__EducatorSymposium__Group__2 : rule__EducatorSymposium__Group__2__Impl rule__EducatorSymposium__Group__3 ;
    public final void rule__EducatorSymposium__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4615:1: ( rule__EducatorSymposium__Group__2__Impl rule__EducatorSymposium__Group__3 )
            // InternalProgram.g:4616:2: rule__EducatorSymposium__Group__2__Impl rule__EducatorSymposium__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalProgram.g:4623:1: rule__EducatorSymposium__Group__2__Impl : ( ( rule__EducatorSymposium__Group_2__0 )? ) ;
    public final void rule__EducatorSymposium__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4627:1: ( ( ( rule__EducatorSymposium__Group_2__0 )? ) )
            // InternalProgram.g:4628:1: ( ( rule__EducatorSymposium__Group_2__0 )? )
            {
            // InternalProgram.g:4628:1: ( ( rule__EducatorSymposium__Group_2__0 )? )
            // InternalProgram.g:4629:2: ( rule__EducatorSymposium__Group_2__0 )?
            {
             before(grammarAccess.getEducatorSymposiumAccess().getGroup_2()); 
            // InternalProgram.g:4630:2: ( rule__EducatorSymposium__Group_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==38) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalProgram.g:4630:3: rule__EducatorSymposium__Group_2__0
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
    // InternalProgram.g:4638:1: rule__EducatorSymposium__Group__3 : rule__EducatorSymposium__Group__3__Impl ;
    public final void rule__EducatorSymposium__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4642:1: ( rule__EducatorSymposium__Group__3__Impl )
            // InternalProgram.g:4643:2: rule__EducatorSymposium__Group__3__Impl
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
    // InternalProgram.g:4649:1: rule__EducatorSymposium__Group__3__Impl : ( ( rule__EducatorSymposium__Group_3__0 )? ) ;
    public final void rule__EducatorSymposium__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4653:1: ( ( ( rule__EducatorSymposium__Group_3__0 )? ) )
            // InternalProgram.g:4654:1: ( ( rule__EducatorSymposium__Group_3__0 )? )
            {
            // InternalProgram.g:4654:1: ( ( rule__EducatorSymposium__Group_3__0 )? )
            // InternalProgram.g:4655:2: ( rule__EducatorSymposium__Group_3__0 )?
            {
             before(grammarAccess.getEducatorSymposiumAccess().getGroup_3()); 
            // InternalProgram.g:4656:2: ( rule__EducatorSymposium__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==45) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalProgram.g:4656:3: rule__EducatorSymposium__Group_3__0
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
    // InternalProgram.g:4665:1: rule__EducatorSymposium__Group_2__0 : rule__EducatorSymposium__Group_2__0__Impl rule__EducatorSymposium__Group_2__1 ;
    public final void rule__EducatorSymposium__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4669:1: ( rule__EducatorSymposium__Group_2__0__Impl rule__EducatorSymposium__Group_2__1 )
            // InternalProgram.g:4670:2: rule__EducatorSymposium__Group_2__0__Impl rule__EducatorSymposium__Group_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:4677:1: rule__EducatorSymposium__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__EducatorSymposium__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4681:1: ( ( 'abstract' ) )
            // InternalProgram.g:4682:1: ( 'abstract' )
            {
            // InternalProgram.g:4682:1: ( 'abstract' )
            // InternalProgram.g:4683:2: 'abstract'
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
    // InternalProgram.g:4692:1: rule__EducatorSymposium__Group_2__1 : rule__EducatorSymposium__Group_2__1__Impl ;
    public final void rule__EducatorSymposium__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4696:1: ( rule__EducatorSymposium__Group_2__1__Impl )
            // InternalProgram.g:4697:2: rule__EducatorSymposium__Group_2__1__Impl
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
    // InternalProgram.g:4703:1: rule__EducatorSymposium__Group_2__1__Impl : ( ( rule__EducatorSymposium__AbstractAssignment_2_1 ) ) ;
    public final void rule__EducatorSymposium__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4707:1: ( ( ( rule__EducatorSymposium__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:4708:1: ( ( rule__EducatorSymposium__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:4708:1: ( ( rule__EducatorSymposium__AbstractAssignment_2_1 ) )
            // InternalProgram.g:4709:2: ( rule__EducatorSymposium__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getEducatorSymposiumAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:4710:2: ( rule__EducatorSymposium__AbstractAssignment_2_1 )
            // InternalProgram.g:4710:3: rule__EducatorSymposium__AbstractAssignment_2_1
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
    // InternalProgram.g:4719:1: rule__EducatorSymposium__Group_3__0 : rule__EducatorSymposium__Group_3__0__Impl rule__EducatorSymposium__Group_3__1 ;
    public final void rule__EducatorSymposium__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4723:1: ( rule__EducatorSymposium__Group_3__0__Impl rule__EducatorSymposium__Group_3__1 )
            // InternalProgram.g:4724:2: rule__EducatorSymposium__Group_3__0__Impl rule__EducatorSymposium__Group_3__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:4731:1: rule__EducatorSymposium__Group_3__0__Impl : ( 'organizers' ) ;
    public final void rule__EducatorSymposium__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4735:1: ( ( 'organizers' ) )
            // InternalProgram.g:4736:1: ( 'organizers' )
            {
            // InternalProgram.g:4736:1: ( 'organizers' )
            // InternalProgram.g:4737:2: 'organizers'
            {
             before(grammarAccess.getEducatorSymposiumAccess().getOrganizersKeyword_3_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalProgram.g:4746:1: rule__EducatorSymposium__Group_3__1 : rule__EducatorSymposium__Group_3__1__Impl rule__EducatorSymposium__Group_3__2 ;
    public final void rule__EducatorSymposium__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4750:1: ( rule__EducatorSymposium__Group_3__1__Impl rule__EducatorSymposium__Group_3__2 )
            // InternalProgram.g:4751:2: rule__EducatorSymposium__Group_3__1__Impl rule__EducatorSymposium__Group_3__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalProgram.g:4758:1: rule__EducatorSymposium__Group_3__1__Impl : ( ( rule__EducatorSymposium__OrganizersAssignment_3_1 ) ) ;
    public final void rule__EducatorSymposium__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4762:1: ( ( ( rule__EducatorSymposium__OrganizersAssignment_3_1 ) ) )
            // InternalProgram.g:4763:1: ( ( rule__EducatorSymposium__OrganizersAssignment_3_1 ) )
            {
            // InternalProgram.g:4763:1: ( ( rule__EducatorSymposium__OrganizersAssignment_3_1 ) )
            // InternalProgram.g:4764:2: ( rule__EducatorSymposium__OrganizersAssignment_3_1 )
            {
             before(grammarAccess.getEducatorSymposiumAccess().getOrganizersAssignment_3_1()); 
            // InternalProgram.g:4765:2: ( rule__EducatorSymposium__OrganizersAssignment_3_1 )
            // InternalProgram.g:4765:3: rule__EducatorSymposium__OrganizersAssignment_3_1
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
    // InternalProgram.g:4773:1: rule__EducatorSymposium__Group_3__2 : rule__EducatorSymposium__Group_3__2__Impl ;
    public final void rule__EducatorSymposium__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4777:1: ( rule__EducatorSymposium__Group_3__2__Impl )
            // InternalProgram.g:4778:2: rule__EducatorSymposium__Group_3__2__Impl
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
    // InternalProgram.g:4784:1: rule__EducatorSymposium__Group_3__2__Impl : ( ( rule__EducatorSymposium__Group_3_2__0 )* ) ;
    public final void rule__EducatorSymposium__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4788:1: ( ( ( rule__EducatorSymposium__Group_3_2__0 )* ) )
            // InternalProgram.g:4789:1: ( ( rule__EducatorSymposium__Group_3_2__0 )* )
            {
            // InternalProgram.g:4789:1: ( ( rule__EducatorSymposium__Group_3_2__0 )* )
            // InternalProgram.g:4790:2: ( rule__EducatorSymposium__Group_3_2__0 )*
            {
             before(grammarAccess.getEducatorSymposiumAccess().getGroup_3_2()); 
            // InternalProgram.g:4791:2: ( rule__EducatorSymposium__Group_3_2__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==35) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalProgram.g:4791:3: rule__EducatorSymposium__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__EducatorSymposium__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalProgram.g:4800:1: rule__EducatorSymposium__Group_3_2__0 : rule__EducatorSymposium__Group_3_2__0__Impl rule__EducatorSymposium__Group_3_2__1 ;
    public final void rule__EducatorSymposium__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4804:1: ( rule__EducatorSymposium__Group_3_2__0__Impl rule__EducatorSymposium__Group_3_2__1 )
            // InternalProgram.g:4805:2: rule__EducatorSymposium__Group_3_2__0__Impl rule__EducatorSymposium__Group_3_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:4812:1: rule__EducatorSymposium__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__EducatorSymposium__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4816:1: ( ( ',' ) )
            // InternalProgram.g:4817:1: ( ',' )
            {
            // InternalProgram.g:4817:1: ( ',' )
            // InternalProgram.g:4818:2: ','
            {
             before(grammarAccess.getEducatorSymposiumAccess().getCommaKeyword_3_2_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalProgram.g:4827:1: rule__EducatorSymposium__Group_3_2__1 : rule__EducatorSymposium__Group_3_2__1__Impl ;
    public final void rule__EducatorSymposium__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4831:1: ( rule__EducatorSymposium__Group_3_2__1__Impl )
            // InternalProgram.g:4832:2: rule__EducatorSymposium__Group_3_2__1__Impl
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
    // InternalProgram.g:4838:1: rule__EducatorSymposium__Group_3_2__1__Impl : ( ( rule__EducatorSymposium__OrganizersAssignment_3_2_1 ) ) ;
    public final void rule__EducatorSymposium__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4842:1: ( ( ( rule__EducatorSymposium__OrganizersAssignment_3_2_1 ) ) )
            // InternalProgram.g:4843:1: ( ( rule__EducatorSymposium__OrganizersAssignment_3_2_1 ) )
            {
            // InternalProgram.g:4843:1: ( ( rule__EducatorSymposium__OrganizersAssignment_3_2_1 ) )
            // InternalProgram.g:4844:2: ( rule__EducatorSymposium__OrganizersAssignment_3_2_1 )
            {
             before(grammarAccess.getEducatorSymposiumAccess().getOrganizersAssignment_3_2_1()); 
            // InternalProgram.g:4845:2: ( rule__EducatorSymposium__OrganizersAssignment_3_2_1 )
            // InternalProgram.g:4845:3: rule__EducatorSymposium__OrganizersAssignment_3_2_1
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
    // InternalProgram.g:4854:1: rule__Reception__Group__0 : rule__Reception__Group__0__Impl rule__Reception__Group__1 ;
    public final void rule__Reception__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4858:1: ( rule__Reception__Group__0__Impl rule__Reception__Group__1 )
            // InternalProgram.g:4859:2: rule__Reception__Group__0__Impl rule__Reception__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:4866:1: rule__Reception__Group__0__Impl : ( 'Reception' ) ;
    public final void rule__Reception__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4870:1: ( ( 'Reception' ) )
            // InternalProgram.g:4871:1: ( 'Reception' )
            {
            // InternalProgram.g:4871:1: ( 'Reception' )
            // InternalProgram.g:4872:2: 'Reception'
            {
             before(grammarAccess.getReceptionAccess().getReceptionKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalProgram.g:4881:1: rule__Reception__Group__1 : rule__Reception__Group__1__Impl rule__Reception__Group__2 ;
    public final void rule__Reception__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4885:1: ( rule__Reception__Group__1__Impl rule__Reception__Group__2 )
            // InternalProgram.g:4886:2: rule__Reception__Group__1__Impl rule__Reception__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalProgram.g:4893:1: rule__Reception__Group__1__Impl : ( ( rule__Reception__NameAssignment_1 ) ) ;
    public final void rule__Reception__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4897:1: ( ( ( rule__Reception__NameAssignment_1 ) ) )
            // InternalProgram.g:4898:1: ( ( rule__Reception__NameAssignment_1 ) )
            {
            // InternalProgram.g:4898:1: ( ( rule__Reception__NameAssignment_1 ) )
            // InternalProgram.g:4899:2: ( rule__Reception__NameAssignment_1 )
            {
             before(grammarAccess.getReceptionAccess().getNameAssignment_1()); 
            // InternalProgram.g:4900:2: ( rule__Reception__NameAssignment_1 )
            // InternalProgram.g:4900:3: rule__Reception__NameAssignment_1
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
    // InternalProgram.g:4908:1: rule__Reception__Group__2 : rule__Reception__Group__2__Impl ;
    public final void rule__Reception__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4912:1: ( rule__Reception__Group__2__Impl )
            // InternalProgram.g:4913:2: rule__Reception__Group__2__Impl
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
    // InternalProgram.g:4919:1: rule__Reception__Group__2__Impl : ( ( rule__Reception__Group_2__0 )? ) ;
    public final void rule__Reception__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4923:1: ( ( ( rule__Reception__Group_2__0 )? ) )
            // InternalProgram.g:4924:1: ( ( rule__Reception__Group_2__0 )? )
            {
            // InternalProgram.g:4924:1: ( ( rule__Reception__Group_2__0 )? )
            // InternalProgram.g:4925:2: ( rule__Reception__Group_2__0 )?
            {
             before(grammarAccess.getReceptionAccess().getGroup_2()); 
            // InternalProgram.g:4926:2: ( rule__Reception__Group_2__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==38) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalProgram.g:4926:3: rule__Reception__Group_2__0
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
    // InternalProgram.g:4935:1: rule__Reception__Group_2__0 : rule__Reception__Group_2__0__Impl rule__Reception__Group_2__1 ;
    public final void rule__Reception__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4939:1: ( rule__Reception__Group_2__0__Impl rule__Reception__Group_2__1 )
            // InternalProgram.g:4940:2: rule__Reception__Group_2__0__Impl rule__Reception__Group_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:4947:1: rule__Reception__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__Reception__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4951:1: ( ( 'abstract' ) )
            // InternalProgram.g:4952:1: ( 'abstract' )
            {
            // InternalProgram.g:4952:1: ( 'abstract' )
            // InternalProgram.g:4953:2: 'abstract'
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
    // InternalProgram.g:4962:1: rule__Reception__Group_2__1 : rule__Reception__Group_2__1__Impl ;
    public final void rule__Reception__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4966:1: ( rule__Reception__Group_2__1__Impl )
            // InternalProgram.g:4967:2: rule__Reception__Group_2__1__Impl
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
    // InternalProgram.g:4973:1: rule__Reception__Group_2__1__Impl : ( ( rule__Reception__AbstractAssignment_2_1 ) ) ;
    public final void rule__Reception__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4977:1: ( ( ( rule__Reception__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:4978:1: ( ( rule__Reception__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:4978:1: ( ( rule__Reception__AbstractAssignment_2_1 ) )
            // InternalProgram.g:4979:2: ( rule__Reception__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getReceptionAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:4980:2: ( rule__Reception__AbstractAssignment_2_1 )
            // InternalProgram.g:4980:3: rule__Reception__AbstractAssignment_2_1
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
    // InternalProgram.g:4989:1: rule__Clinic__Group__0 : rule__Clinic__Group__0__Impl rule__Clinic__Group__1 ;
    public final void rule__Clinic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4993:1: ( rule__Clinic__Group__0__Impl rule__Clinic__Group__1 )
            // InternalProgram.g:4994:2: rule__Clinic__Group__0__Impl rule__Clinic__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:5001:1: rule__Clinic__Group__0__Impl : ( 'Clinic' ) ;
    public final void rule__Clinic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5005:1: ( ( 'Clinic' ) )
            // InternalProgram.g:5006:1: ( 'Clinic' )
            {
            // InternalProgram.g:5006:1: ( 'Clinic' )
            // InternalProgram.g:5007:2: 'Clinic'
            {
             before(grammarAccess.getClinicAccess().getClinicKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalProgram.g:5016:1: rule__Clinic__Group__1 : rule__Clinic__Group__1__Impl rule__Clinic__Group__2 ;
    public final void rule__Clinic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5020:1: ( rule__Clinic__Group__1__Impl rule__Clinic__Group__2 )
            // InternalProgram.g:5021:2: rule__Clinic__Group__1__Impl rule__Clinic__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalProgram.g:5028:1: rule__Clinic__Group__1__Impl : ( ( rule__Clinic__NameAssignment_1 ) ) ;
    public final void rule__Clinic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5032:1: ( ( ( rule__Clinic__NameAssignment_1 ) ) )
            // InternalProgram.g:5033:1: ( ( rule__Clinic__NameAssignment_1 ) )
            {
            // InternalProgram.g:5033:1: ( ( rule__Clinic__NameAssignment_1 ) )
            // InternalProgram.g:5034:2: ( rule__Clinic__NameAssignment_1 )
            {
             before(grammarAccess.getClinicAccess().getNameAssignment_1()); 
            // InternalProgram.g:5035:2: ( rule__Clinic__NameAssignment_1 )
            // InternalProgram.g:5035:3: rule__Clinic__NameAssignment_1
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
    // InternalProgram.g:5043:1: rule__Clinic__Group__2 : rule__Clinic__Group__2__Impl ;
    public final void rule__Clinic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5047:1: ( rule__Clinic__Group__2__Impl )
            // InternalProgram.g:5048:2: rule__Clinic__Group__2__Impl
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
    // InternalProgram.g:5054:1: rule__Clinic__Group__2__Impl : ( ( rule__Clinic__Group_2__0 )? ) ;
    public final void rule__Clinic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5058:1: ( ( ( rule__Clinic__Group_2__0 )? ) )
            // InternalProgram.g:5059:1: ( ( rule__Clinic__Group_2__0 )? )
            {
            // InternalProgram.g:5059:1: ( ( rule__Clinic__Group_2__0 )? )
            // InternalProgram.g:5060:2: ( rule__Clinic__Group_2__0 )?
            {
             before(grammarAccess.getClinicAccess().getGroup_2()); 
            // InternalProgram.g:5061:2: ( rule__Clinic__Group_2__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==38) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalProgram.g:5061:3: rule__Clinic__Group_2__0
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
    // InternalProgram.g:5070:1: rule__Clinic__Group_2__0 : rule__Clinic__Group_2__0__Impl rule__Clinic__Group_2__1 ;
    public final void rule__Clinic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5074:1: ( rule__Clinic__Group_2__0__Impl rule__Clinic__Group_2__1 )
            // InternalProgram.g:5075:2: rule__Clinic__Group_2__0__Impl rule__Clinic__Group_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:5082:1: rule__Clinic__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__Clinic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5086:1: ( ( 'abstract' ) )
            // InternalProgram.g:5087:1: ( 'abstract' )
            {
            // InternalProgram.g:5087:1: ( 'abstract' )
            // InternalProgram.g:5088:2: 'abstract'
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
    // InternalProgram.g:5097:1: rule__Clinic__Group_2__1 : rule__Clinic__Group_2__1__Impl ;
    public final void rule__Clinic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5101:1: ( rule__Clinic__Group_2__1__Impl )
            // InternalProgram.g:5102:2: rule__Clinic__Group_2__1__Impl
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
    // InternalProgram.g:5108:1: rule__Clinic__Group_2__1__Impl : ( ( rule__Clinic__AbstractAssignment_2_1 ) ) ;
    public final void rule__Clinic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5112:1: ( ( ( rule__Clinic__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:5113:1: ( ( rule__Clinic__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:5113:1: ( ( rule__Clinic__AbstractAssignment_2_1 ) )
            // InternalProgram.g:5114:2: ( rule__Clinic__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getClinicAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:5115:2: ( rule__Clinic__AbstractAssignment_2_1 )
            // InternalProgram.g:5115:3: rule__Clinic__AbstractAssignment_2_1
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
    // InternalProgram.g:5124:1: rule__Lunch__Group__0 : rule__Lunch__Group__0__Impl rule__Lunch__Group__1 ;
    public final void rule__Lunch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5128:1: ( rule__Lunch__Group__0__Impl rule__Lunch__Group__1 )
            // InternalProgram.g:5129:2: rule__Lunch__Group__0__Impl rule__Lunch__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:5136:1: rule__Lunch__Group__0__Impl : ( 'Lunch' ) ;
    public final void rule__Lunch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5140:1: ( ( 'Lunch' ) )
            // InternalProgram.g:5141:1: ( 'Lunch' )
            {
            // InternalProgram.g:5141:1: ( 'Lunch' )
            // InternalProgram.g:5142:2: 'Lunch'
            {
             before(grammarAccess.getLunchAccess().getLunchKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalProgram.g:5151:1: rule__Lunch__Group__1 : rule__Lunch__Group__1__Impl rule__Lunch__Group__2 ;
    public final void rule__Lunch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5155:1: ( rule__Lunch__Group__1__Impl rule__Lunch__Group__2 )
            // InternalProgram.g:5156:2: rule__Lunch__Group__1__Impl rule__Lunch__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalProgram.g:5163:1: rule__Lunch__Group__1__Impl : ( ( rule__Lunch__NameAssignment_1 ) ) ;
    public final void rule__Lunch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5167:1: ( ( ( rule__Lunch__NameAssignment_1 ) ) )
            // InternalProgram.g:5168:1: ( ( rule__Lunch__NameAssignment_1 ) )
            {
            // InternalProgram.g:5168:1: ( ( rule__Lunch__NameAssignment_1 ) )
            // InternalProgram.g:5169:2: ( rule__Lunch__NameAssignment_1 )
            {
             before(grammarAccess.getLunchAccess().getNameAssignment_1()); 
            // InternalProgram.g:5170:2: ( rule__Lunch__NameAssignment_1 )
            // InternalProgram.g:5170:3: rule__Lunch__NameAssignment_1
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
    // InternalProgram.g:5178:1: rule__Lunch__Group__2 : rule__Lunch__Group__2__Impl ;
    public final void rule__Lunch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5182:1: ( rule__Lunch__Group__2__Impl )
            // InternalProgram.g:5183:2: rule__Lunch__Group__2__Impl
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
    // InternalProgram.g:5189:1: rule__Lunch__Group__2__Impl : ( ( rule__Lunch__Group_2__0 )? ) ;
    public final void rule__Lunch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5193:1: ( ( ( rule__Lunch__Group_2__0 )? ) )
            // InternalProgram.g:5194:1: ( ( rule__Lunch__Group_2__0 )? )
            {
            // InternalProgram.g:5194:1: ( ( rule__Lunch__Group_2__0 )? )
            // InternalProgram.g:5195:2: ( rule__Lunch__Group_2__0 )?
            {
             before(grammarAccess.getLunchAccess().getGroup_2()); 
            // InternalProgram.g:5196:2: ( rule__Lunch__Group_2__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==38) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalProgram.g:5196:3: rule__Lunch__Group_2__0
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
    // InternalProgram.g:5205:1: rule__Lunch__Group_2__0 : rule__Lunch__Group_2__0__Impl rule__Lunch__Group_2__1 ;
    public final void rule__Lunch__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5209:1: ( rule__Lunch__Group_2__0__Impl rule__Lunch__Group_2__1 )
            // InternalProgram.g:5210:2: rule__Lunch__Group_2__0__Impl rule__Lunch__Group_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:5217:1: rule__Lunch__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__Lunch__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5221:1: ( ( 'abstract' ) )
            // InternalProgram.g:5222:1: ( 'abstract' )
            {
            // InternalProgram.g:5222:1: ( 'abstract' )
            // InternalProgram.g:5223:2: 'abstract'
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
    // InternalProgram.g:5232:1: rule__Lunch__Group_2__1 : rule__Lunch__Group_2__1__Impl ;
    public final void rule__Lunch__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5236:1: ( rule__Lunch__Group_2__1__Impl )
            // InternalProgram.g:5237:2: rule__Lunch__Group_2__1__Impl
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
    // InternalProgram.g:5243:1: rule__Lunch__Group_2__1__Impl : ( ( rule__Lunch__AbstractAssignment_2_1 ) ) ;
    public final void rule__Lunch__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5247:1: ( ( ( rule__Lunch__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:5248:1: ( ( rule__Lunch__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:5248:1: ( ( rule__Lunch__AbstractAssignment_2_1 ) )
            // InternalProgram.g:5249:2: ( rule__Lunch__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getLunchAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:5250:2: ( rule__Lunch__AbstractAssignment_2_1 )
            // InternalProgram.g:5250:3: rule__Lunch__AbstractAssignment_2_1
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
    // InternalProgram.g:5259:1: rule__CoffeeBreak__Group__0 : rule__CoffeeBreak__Group__0__Impl rule__CoffeeBreak__Group__1 ;
    public final void rule__CoffeeBreak__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5263:1: ( rule__CoffeeBreak__Group__0__Impl rule__CoffeeBreak__Group__1 )
            // InternalProgram.g:5264:2: rule__CoffeeBreak__Group__0__Impl rule__CoffeeBreak__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:5271:1: rule__CoffeeBreak__Group__0__Impl : ( 'CoffeeBreak' ) ;
    public final void rule__CoffeeBreak__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5275:1: ( ( 'CoffeeBreak' ) )
            // InternalProgram.g:5276:1: ( 'CoffeeBreak' )
            {
            // InternalProgram.g:5276:1: ( 'CoffeeBreak' )
            // InternalProgram.g:5277:2: 'CoffeeBreak'
            {
             before(grammarAccess.getCoffeeBreakAccess().getCoffeeBreakKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalProgram.g:5286:1: rule__CoffeeBreak__Group__1 : rule__CoffeeBreak__Group__1__Impl rule__CoffeeBreak__Group__2 ;
    public final void rule__CoffeeBreak__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5290:1: ( rule__CoffeeBreak__Group__1__Impl rule__CoffeeBreak__Group__2 )
            // InternalProgram.g:5291:2: rule__CoffeeBreak__Group__1__Impl rule__CoffeeBreak__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalProgram.g:5298:1: rule__CoffeeBreak__Group__1__Impl : ( ( rule__CoffeeBreak__NameAssignment_1 ) ) ;
    public final void rule__CoffeeBreak__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5302:1: ( ( ( rule__CoffeeBreak__NameAssignment_1 ) ) )
            // InternalProgram.g:5303:1: ( ( rule__CoffeeBreak__NameAssignment_1 ) )
            {
            // InternalProgram.g:5303:1: ( ( rule__CoffeeBreak__NameAssignment_1 ) )
            // InternalProgram.g:5304:2: ( rule__CoffeeBreak__NameAssignment_1 )
            {
             before(grammarAccess.getCoffeeBreakAccess().getNameAssignment_1()); 
            // InternalProgram.g:5305:2: ( rule__CoffeeBreak__NameAssignment_1 )
            // InternalProgram.g:5305:3: rule__CoffeeBreak__NameAssignment_1
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
    // InternalProgram.g:5313:1: rule__CoffeeBreak__Group__2 : rule__CoffeeBreak__Group__2__Impl ;
    public final void rule__CoffeeBreak__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5317:1: ( rule__CoffeeBreak__Group__2__Impl )
            // InternalProgram.g:5318:2: rule__CoffeeBreak__Group__2__Impl
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
    // InternalProgram.g:5324:1: rule__CoffeeBreak__Group__2__Impl : ( ( rule__CoffeeBreak__Group_2__0 )? ) ;
    public final void rule__CoffeeBreak__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5328:1: ( ( ( rule__CoffeeBreak__Group_2__0 )? ) )
            // InternalProgram.g:5329:1: ( ( rule__CoffeeBreak__Group_2__0 )? )
            {
            // InternalProgram.g:5329:1: ( ( rule__CoffeeBreak__Group_2__0 )? )
            // InternalProgram.g:5330:2: ( rule__CoffeeBreak__Group_2__0 )?
            {
             before(grammarAccess.getCoffeeBreakAccess().getGroup_2()); 
            // InternalProgram.g:5331:2: ( rule__CoffeeBreak__Group_2__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==38) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalProgram.g:5331:3: rule__CoffeeBreak__Group_2__0
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
    // InternalProgram.g:5340:1: rule__CoffeeBreak__Group_2__0 : rule__CoffeeBreak__Group_2__0__Impl rule__CoffeeBreak__Group_2__1 ;
    public final void rule__CoffeeBreak__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5344:1: ( rule__CoffeeBreak__Group_2__0__Impl rule__CoffeeBreak__Group_2__1 )
            // InternalProgram.g:5345:2: rule__CoffeeBreak__Group_2__0__Impl rule__CoffeeBreak__Group_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:5352:1: rule__CoffeeBreak__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__CoffeeBreak__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5356:1: ( ( 'abstract' ) )
            // InternalProgram.g:5357:1: ( 'abstract' )
            {
            // InternalProgram.g:5357:1: ( 'abstract' )
            // InternalProgram.g:5358:2: 'abstract'
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
    // InternalProgram.g:5367:1: rule__CoffeeBreak__Group_2__1 : rule__CoffeeBreak__Group_2__1__Impl ;
    public final void rule__CoffeeBreak__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5371:1: ( rule__CoffeeBreak__Group_2__1__Impl )
            // InternalProgram.g:5372:2: rule__CoffeeBreak__Group_2__1__Impl
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
    // InternalProgram.g:5378:1: rule__CoffeeBreak__Group_2__1__Impl : ( ( rule__CoffeeBreak__AbstractAssignment_2_1 ) ) ;
    public final void rule__CoffeeBreak__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5382:1: ( ( ( rule__CoffeeBreak__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:5383:1: ( ( rule__CoffeeBreak__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:5383:1: ( ( rule__CoffeeBreak__AbstractAssignment_2_1 ) )
            // InternalProgram.g:5384:2: ( rule__CoffeeBreak__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getCoffeeBreakAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:5385:2: ( rule__CoffeeBreak__AbstractAssignment_2_1 )
            // InternalProgram.g:5385:3: rule__CoffeeBreak__AbstractAssignment_2_1
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
    // InternalProgram.g:5394:1: rule__Meeting__Group__0 : rule__Meeting__Group__0__Impl rule__Meeting__Group__1 ;
    public final void rule__Meeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5398:1: ( rule__Meeting__Group__0__Impl rule__Meeting__Group__1 )
            // InternalProgram.g:5399:2: rule__Meeting__Group__0__Impl rule__Meeting__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:5406:1: rule__Meeting__Group__0__Impl : ( 'Meeting' ) ;
    public final void rule__Meeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5410:1: ( ( 'Meeting' ) )
            // InternalProgram.g:5411:1: ( 'Meeting' )
            {
            // InternalProgram.g:5411:1: ( 'Meeting' )
            // InternalProgram.g:5412:2: 'Meeting'
            {
             before(grammarAccess.getMeetingAccess().getMeetingKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalProgram.g:5421:1: rule__Meeting__Group__1 : rule__Meeting__Group__1__Impl rule__Meeting__Group__2 ;
    public final void rule__Meeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5425:1: ( rule__Meeting__Group__1__Impl rule__Meeting__Group__2 )
            // InternalProgram.g:5426:2: rule__Meeting__Group__1__Impl rule__Meeting__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalProgram.g:5433:1: rule__Meeting__Group__1__Impl : ( ( rule__Meeting__NameAssignment_1 ) ) ;
    public final void rule__Meeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5437:1: ( ( ( rule__Meeting__NameAssignment_1 ) ) )
            // InternalProgram.g:5438:1: ( ( rule__Meeting__NameAssignment_1 ) )
            {
            // InternalProgram.g:5438:1: ( ( rule__Meeting__NameAssignment_1 ) )
            // InternalProgram.g:5439:2: ( rule__Meeting__NameAssignment_1 )
            {
             before(grammarAccess.getMeetingAccess().getNameAssignment_1()); 
            // InternalProgram.g:5440:2: ( rule__Meeting__NameAssignment_1 )
            // InternalProgram.g:5440:3: rule__Meeting__NameAssignment_1
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
    // InternalProgram.g:5448:1: rule__Meeting__Group__2 : rule__Meeting__Group__2__Impl ;
    public final void rule__Meeting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5452:1: ( rule__Meeting__Group__2__Impl )
            // InternalProgram.g:5453:2: rule__Meeting__Group__2__Impl
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
    // InternalProgram.g:5459:1: rule__Meeting__Group__2__Impl : ( ( rule__Meeting__Group_2__0 )? ) ;
    public final void rule__Meeting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5463:1: ( ( ( rule__Meeting__Group_2__0 )? ) )
            // InternalProgram.g:5464:1: ( ( rule__Meeting__Group_2__0 )? )
            {
            // InternalProgram.g:5464:1: ( ( rule__Meeting__Group_2__0 )? )
            // InternalProgram.g:5465:2: ( rule__Meeting__Group_2__0 )?
            {
             before(grammarAccess.getMeetingAccess().getGroup_2()); 
            // InternalProgram.g:5466:2: ( rule__Meeting__Group_2__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==38) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalProgram.g:5466:3: rule__Meeting__Group_2__0
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
    // InternalProgram.g:5475:1: rule__Meeting__Group_2__0 : rule__Meeting__Group_2__0__Impl rule__Meeting__Group_2__1 ;
    public final void rule__Meeting__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5479:1: ( rule__Meeting__Group_2__0__Impl rule__Meeting__Group_2__1 )
            // InternalProgram.g:5480:2: rule__Meeting__Group_2__0__Impl rule__Meeting__Group_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:5487:1: rule__Meeting__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__Meeting__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5491:1: ( ( 'abstract' ) )
            // InternalProgram.g:5492:1: ( 'abstract' )
            {
            // InternalProgram.g:5492:1: ( 'abstract' )
            // InternalProgram.g:5493:2: 'abstract'
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
    // InternalProgram.g:5502:1: rule__Meeting__Group_2__1 : rule__Meeting__Group_2__1__Impl ;
    public final void rule__Meeting__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5506:1: ( rule__Meeting__Group_2__1__Impl )
            // InternalProgram.g:5507:2: rule__Meeting__Group_2__1__Impl
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
    // InternalProgram.g:5513:1: rule__Meeting__Group_2__1__Impl : ( ( rule__Meeting__AbstractAssignment_2_1 ) ) ;
    public final void rule__Meeting__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5517:1: ( ( ( rule__Meeting__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:5518:1: ( ( rule__Meeting__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:5518:1: ( ( rule__Meeting__AbstractAssignment_2_1 ) )
            // InternalProgram.g:5519:2: ( rule__Meeting__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getMeetingAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:5520:2: ( rule__Meeting__AbstractAssignment_2_1 )
            // InternalProgram.g:5520:3: rule__Meeting__AbstractAssignment_2_1
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


    // $ANTLR start "rule__Paper__Group__0"
    // InternalProgram.g:5529:1: rule__Paper__Group__0 : rule__Paper__Group__0__Impl rule__Paper__Group__1 ;
    public final void rule__Paper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5533:1: ( rule__Paper__Group__0__Impl rule__Paper__Group__1 )
            // InternalProgram.g:5534:2: rule__Paper__Group__0__Impl rule__Paper__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:5541:1: rule__Paper__Group__0__Impl : ( () ) ;
    public final void rule__Paper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5545:1: ( ( () ) )
            // InternalProgram.g:5546:1: ( () )
            {
            // InternalProgram.g:5546:1: ( () )
            // InternalProgram.g:5547:2: ()
            {
             before(grammarAccess.getPaperAccess().getPaperAction_0()); 
            // InternalProgram.g:5548:2: ()
            // InternalProgram.g:5548:3: 
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
    // InternalProgram.g:5556:1: rule__Paper__Group__1 : rule__Paper__Group__1__Impl rule__Paper__Group__2 ;
    public final void rule__Paper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5560:1: ( rule__Paper__Group__1__Impl rule__Paper__Group__2 )
            // InternalProgram.g:5561:2: rule__Paper__Group__1__Impl rule__Paper__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalProgram.g:5568:1: rule__Paper__Group__1__Impl : ( ( rule__Paper__NameAssignment_1 ) ) ;
    public final void rule__Paper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5572:1: ( ( ( rule__Paper__NameAssignment_1 ) ) )
            // InternalProgram.g:5573:1: ( ( rule__Paper__NameAssignment_1 ) )
            {
            // InternalProgram.g:5573:1: ( ( rule__Paper__NameAssignment_1 ) )
            // InternalProgram.g:5574:2: ( rule__Paper__NameAssignment_1 )
            {
             before(grammarAccess.getPaperAccess().getNameAssignment_1()); 
            // InternalProgram.g:5575:2: ( rule__Paper__NameAssignment_1 )
            // InternalProgram.g:5575:3: rule__Paper__NameAssignment_1
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
    // InternalProgram.g:5583:1: rule__Paper__Group__2 : rule__Paper__Group__2__Impl rule__Paper__Group__3 ;
    public final void rule__Paper__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5587:1: ( rule__Paper__Group__2__Impl rule__Paper__Group__3 )
            // InternalProgram.g:5588:2: rule__Paper__Group__2__Impl rule__Paper__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:5595:1: rule__Paper__Group__2__Impl : ( 'authors' ) ;
    public final void rule__Paper__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5599:1: ( ( 'authors' ) )
            // InternalProgram.g:5600:1: ( 'authors' )
            {
            // InternalProgram.g:5600:1: ( 'authors' )
            // InternalProgram.g:5601:2: 'authors'
            {
             before(grammarAccess.getPaperAccess().getAuthorsKeyword_2()); 
            match(input,54,FOLLOW_2); 
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
    // InternalProgram.g:5610:1: rule__Paper__Group__3 : rule__Paper__Group__3__Impl rule__Paper__Group__4 ;
    public final void rule__Paper__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5614:1: ( rule__Paper__Group__3__Impl rule__Paper__Group__4 )
            // InternalProgram.g:5615:2: rule__Paper__Group__3__Impl rule__Paper__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalProgram.g:5622:1: rule__Paper__Group__3__Impl : ( ( rule__Paper__AuthorsAssignment_3 ) ) ;
    public final void rule__Paper__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5626:1: ( ( ( rule__Paper__AuthorsAssignment_3 ) ) )
            // InternalProgram.g:5627:1: ( ( rule__Paper__AuthorsAssignment_3 ) )
            {
            // InternalProgram.g:5627:1: ( ( rule__Paper__AuthorsAssignment_3 ) )
            // InternalProgram.g:5628:2: ( rule__Paper__AuthorsAssignment_3 )
            {
             before(grammarAccess.getPaperAccess().getAuthorsAssignment_3()); 
            // InternalProgram.g:5629:2: ( rule__Paper__AuthorsAssignment_3 )
            // InternalProgram.g:5629:3: rule__Paper__AuthorsAssignment_3
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
    // InternalProgram.g:5637:1: rule__Paper__Group__4 : rule__Paper__Group__4__Impl rule__Paper__Group__5 ;
    public final void rule__Paper__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5641:1: ( rule__Paper__Group__4__Impl rule__Paper__Group__5 )
            // InternalProgram.g:5642:2: rule__Paper__Group__4__Impl rule__Paper__Group__5
            {
            pushFollow(FOLLOW_32);
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
    // InternalProgram.g:5649:1: rule__Paper__Group__4__Impl : ( ( rule__Paper__Group_4__0 )* ) ;
    public final void rule__Paper__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5653:1: ( ( ( rule__Paper__Group_4__0 )* ) )
            // InternalProgram.g:5654:1: ( ( rule__Paper__Group_4__0 )* )
            {
            // InternalProgram.g:5654:1: ( ( rule__Paper__Group_4__0 )* )
            // InternalProgram.g:5655:2: ( rule__Paper__Group_4__0 )*
            {
             before(grammarAccess.getPaperAccess().getGroup_4()); 
            // InternalProgram.g:5656:2: ( rule__Paper__Group_4__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==35) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalProgram.g:5656:3: rule__Paper__Group_4__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Paper__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalProgram.g:5664:1: rule__Paper__Group__5 : rule__Paper__Group__5__Impl rule__Paper__Group__6 ;
    public final void rule__Paper__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5668:1: ( rule__Paper__Group__5__Impl rule__Paper__Group__6 )
            // InternalProgram.g:5669:2: rule__Paper__Group__5__Impl rule__Paper__Group__6
            {
            pushFollow(FOLLOW_32);
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
    // InternalProgram.g:5676:1: rule__Paper__Group__5__Impl : ( ( rule__Paper__Group_5__0 )? ) ;
    public final void rule__Paper__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5680:1: ( ( ( rule__Paper__Group_5__0 )? ) )
            // InternalProgram.g:5681:1: ( ( rule__Paper__Group_5__0 )? )
            {
            // InternalProgram.g:5681:1: ( ( rule__Paper__Group_5__0 )? )
            // InternalProgram.g:5682:2: ( rule__Paper__Group_5__0 )?
            {
             before(grammarAccess.getPaperAccess().getGroup_5()); 
            // InternalProgram.g:5683:2: ( rule__Paper__Group_5__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==38) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalProgram.g:5683:3: rule__Paper__Group_5__0
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
    // InternalProgram.g:5691:1: rule__Paper__Group__6 : rule__Paper__Group__6__Impl rule__Paper__Group__7 ;
    public final void rule__Paper__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5695:1: ( rule__Paper__Group__6__Impl rule__Paper__Group__7 )
            // InternalProgram.g:5696:2: rule__Paper__Group__6__Impl rule__Paper__Group__7
            {
            pushFollow(FOLLOW_32);
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
    // InternalProgram.g:5703:1: rule__Paper__Group__6__Impl : ( ( rule__Paper__Group_6__0 )? ) ;
    public final void rule__Paper__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5707:1: ( ( ( rule__Paper__Group_6__0 )? ) )
            // InternalProgram.g:5708:1: ( ( rule__Paper__Group_6__0 )? )
            {
            // InternalProgram.g:5708:1: ( ( rule__Paper__Group_6__0 )? )
            // InternalProgram.g:5709:2: ( rule__Paper__Group_6__0 )?
            {
             before(grammarAccess.getPaperAccess().getGroup_6()); 
            // InternalProgram.g:5710:2: ( rule__Paper__Group_6__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==55) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalProgram.g:5710:3: rule__Paper__Group_6__0
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
    // InternalProgram.g:5718:1: rule__Paper__Group__7 : rule__Paper__Group__7__Impl ;
    public final void rule__Paper__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5722:1: ( rule__Paper__Group__7__Impl )
            // InternalProgram.g:5723:2: rule__Paper__Group__7__Impl
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
    // InternalProgram.g:5729:1: rule__Paper__Group__7__Impl : ( ( rule__Paper__Group_7__0 )? ) ;
    public final void rule__Paper__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5733:1: ( ( ( rule__Paper__Group_7__0 )? ) )
            // InternalProgram.g:5734:1: ( ( rule__Paper__Group_7__0 )? )
            {
            // InternalProgram.g:5734:1: ( ( rule__Paper__Group_7__0 )? )
            // InternalProgram.g:5735:2: ( rule__Paper__Group_7__0 )?
            {
             before(grammarAccess.getPaperAccess().getGroup_7()); 
            // InternalProgram.g:5736:2: ( rule__Paper__Group_7__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==56) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalProgram.g:5736:3: rule__Paper__Group_7__0
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
    // InternalProgram.g:5745:1: rule__Paper__Group_4__0 : rule__Paper__Group_4__0__Impl rule__Paper__Group_4__1 ;
    public final void rule__Paper__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5749:1: ( rule__Paper__Group_4__0__Impl rule__Paper__Group_4__1 )
            // InternalProgram.g:5750:2: rule__Paper__Group_4__0__Impl rule__Paper__Group_4__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:5757:1: rule__Paper__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Paper__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5761:1: ( ( ',' ) )
            // InternalProgram.g:5762:1: ( ',' )
            {
            // InternalProgram.g:5762:1: ( ',' )
            // InternalProgram.g:5763:2: ','
            {
             before(grammarAccess.getPaperAccess().getCommaKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalProgram.g:5772:1: rule__Paper__Group_4__1 : rule__Paper__Group_4__1__Impl ;
    public final void rule__Paper__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5776:1: ( rule__Paper__Group_4__1__Impl )
            // InternalProgram.g:5777:2: rule__Paper__Group_4__1__Impl
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
    // InternalProgram.g:5783:1: rule__Paper__Group_4__1__Impl : ( ( rule__Paper__AuthorsAssignment_4_1 ) ) ;
    public final void rule__Paper__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5787:1: ( ( ( rule__Paper__AuthorsAssignment_4_1 ) ) )
            // InternalProgram.g:5788:1: ( ( rule__Paper__AuthorsAssignment_4_1 ) )
            {
            // InternalProgram.g:5788:1: ( ( rule__Paper__AuthorsAssignment_4_1 ) )
            // InternalProgram.g:5789:2: ( rule__Paper__AuthorsAssignment_4_1 )
            {
             before(grammarAccess.getPaperAccess().getAuthorsAssignment_4_1()); 
            // InternalProgram.g:5790:2: ( rule__Paper__AuthorsAssignment_4_1 )
            // InternalProgram.g:5790:3: rule__Paper__AuthorsAssignment_4_1
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
    // InternalProgram.g:5799:1: rule__Paper__Group_5__0 : rule__Paper__Group_5__0__Impl rule__Paper__Group_5__1 ;
    public final void rule__Paper__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5803:1: ( rule__Paper__Group_5__0__Impl rule__Paper__Group_5__1 )
            // InternalProgram.g:5804:2: rule__Paper__Group_5__0__Impl rule__Paper__Group_5__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:5811:1: rule__Paper__Group_5__0__Impl : ( 'abstract' ) ;
    public final void rule__Paper__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5815:1: ( ( 'abstract' ) )
            // InternalProgram.g:5816:1: ( 'abstract' )
            {
            // InternalProgram.g:5816:1: ( 'abstract' )
            // InternalProgram.g:5817:2: 'abstract'
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
    // InternalProgram.g:5826:1: rule__Paper__Group_5__1 : rule__Paper__Group_5__1__Impl ;
    public final void rule__Paper__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5830:1: ( rule__Paper__Group_5__1__Impl )
            // InternalProgram.g:5831:2: rule__Paper__Group_5__1__Impl
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
    // InternalProgram.g:5837:1: rule__Paper__Group_5__1__Impl : ( ( rule__Paper__AbstractAssignment_5_1 ) ) ;
    public final void rule__Paper__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5841:1: ( ( ( rule__Paper__AbstractAssignment_5_1 ) ) )
            // InternalProgram.g:5842:1: ( ( rule__Paper__AbstractAssignment_5_1 ) )
            {
            // InternalProgram.g:5842:1: ( ( rule__Paper__AbstractAssignment_5_1 ) )
            // InternalProgram.g:5843:2: ( rule__Paper__AbstractAssignment_5_1 )
            {
             before(grammarAccess.getPaperAccess().getAbstractAssignment_5_1()); 
            // InternalProgram.g:5844:2: ( rule__Paper__AbstractAssignment_5_1 )
            // InternalProgram.g:5844:3: rule__Paper__AbstractAssignment_5_1
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
    // InternalProgram.g:5853:1: rule__Paper__Group_6__0 : rule__Paper__Group_6__0__Impl rule__Paper__Group_6__1 ;
    public final void rule__Paper__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5857:1: ( rule__Paper__Group_6__0__Impl rule__Paper__Group_6__1 )
            // InternalProgram.g:5858:2: rule__Paper__Group_6__0__Impl rule__Paper__Group_6__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:5865:1: rule__Paper__Group_6__0__Impl : ( 'preprint' ) ;
    public final void rule__Paper__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5869:1: ( ( 'preprint' ) )
            // InternalProgram.g:5870:1: ( 'preprint' )
            {
            // InternalProgram.g:5870:1: ( 'preprint' )
            // InternalProgram.g:5871:2: 'preprint'
            {
             before(grammarAccess.getPaperAccess().getPreprintKeyword_6_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalProgram.g:5880:1: rule__Paper__Group_6__1 : rule__Paper__Group_6__1__Impl ;
    public final void rule__Paper__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5884:1: ( rule__Paper__Group_6__1__Impl )
            // InternalProgram.g:5885:2: rule__Paper__Group_6__1__Impl
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
    // InternalProgram.g:5891:1: rule__Paper__Group_6__1__Impl : ( ( rule__Paper__PreprintAssignment_6_1 ) ) ;
    public final void rule__Paper__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5895:1: ( ( ( rule__Paper__PreprintAssignment_6_1 ) ) )
            // InternalProgram.g:5896:1: ( ( rule__Paper__PreprintAssignment_6_1 ) )
            {
            // InternalProgram.g:5896:1: ( ( rule__Paper__PreprintAssignment_6_1 ) )
            // InternalProgram.g:5897:2: ( rule__Paper__PreprintAssignment_6_1 )
            {
             before(grammarAccess.getPaperAccess().getPreprintAssignment_6_1()); 
            // InternalProgram.g:5898:2: ( rule__Paper__PreprintAssignment_6_1 )
            // InternalProgram.g:5898:3: rule__Paper__PreprintAssignment_6_1
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
    // InternalProgram.g:5907:1: rule__Paper__Group_7__0 : rule__Paper__Group_7__0__Impl rule__Paper__Group_7__1 ;
    public final void rule__Paper__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5911:1: ( rule__Paper__Group_7__0__Impl rule__Paper__Group_7__1 )
            // InternalProgram.g:5912:2: rule__Paper__Group_7__0__Impl rule__Paper__Group_7__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalProgram.g:5919:1: rule__Paper__Group_7__0__Impl : ( 'kind' ) ;
    public final void rule__Paper__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5923:1: ( ( 'kind' ) )
            // InternalProgram.g:5924:1: ( 'kind' )
            {
            // InternalProgram.g:5924:1: ( 'kind' )
            // InternalProgram.g:5925:2: 'kind'
            {
             before(grammarAccess.getPaperAccess().getKindKeyword_7_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalProgram.g:5934:1: rule__Paper__Group_7__1 : rule__Paper__Group_7__1__Impl ;
    public final void rule__Paper__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5938:1: ( rule__Paper__Group_7__1__Impl )
            // InternalProgram.g:5939:2: rule__Paper__Group_7__1__Impl
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
    // InternalProgram.g:5945:1: rule__Paper__Group_7__1__Impl : ( ( rule__Paper__KindAssignment_7_1 ) ) ;
    public final void rule__Paper__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5949:1: ( ( ( rule__Paper__KindAssignment_7_1 ) ) )
            // InternalProgram.g:5950:1: ( ( rule__Paper__KindAssignment_7_1 ) )
            {
            // InternalProgram.g:5950:1: ( ( rule__Paper__KindAssignment_7_1 ) )
            // InternalProgram.g:5951:2: ( rule__Paper__KindAssignment_7_1 )
            {
             before(grammarAccess.getPaperAccess().getKindAssignment_7_1()); 
            // InternalProgram.g:5952:2: ( rule__Paper__KindAssignment_7_1 )
            // InternalProgram.g:5952:3: rule__Paper__KindAssignment_7_1
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
    // InternalProgram.g:5961:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5965:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalProgram.g:5966:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:5973:1: rule__Person__Group__0__Impl : ( () ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5977:1: ( ( () ) )
            // InternalProgram.g:5978:1: ( () )
            {
            // InternalProgram.g:5978:1: ( () )
            // InternalProgram.g:5979:2: ()
            {
             before(grammarAccess.getPersonAccess().getPersonAction_0()); 
            // InternalProgram.g:5980:2: ()
            // InternalProgram.g:5980:3: 
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
    // InternalProgram.g:5988:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5992:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // InternalProgram.g:5993:2: rule__Person__Group__1__Impl rule__Person__Group__2
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
    // InternalProgram.g:6000:1: rule__Person__Group__1__Impl : ( ( rule__Person__NameAssignment_1 ) ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6004:1: ( ( ( rule__Person__NameAssignment_1 ) ) )
            // InternalProgram.g:6005:1: ( ( rule__Person__NameAssignment_1 ) )
            {
            // InternalProgram.g:6005:1: ( ( rule__Person__NameAssignment_1 ) )
            // InternalProgram.g:6006:2: ( rule__Person__NameAssignment_1 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_1()); 
            // InternalProgram.g:6007:2: ( rule__Person__NameAssignment_1 )
            // InternalProgram.g:6007:3: rule__Person__NameAssignment_1
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
    // InternalProgram.g:6015:1: rule__Person__Group__2 : rule__Person__Group__2__Impl rule__Person__Group__3 ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6019:1: ( rule__Person__Group__2__Impl rule__Person__Group__3 )
            // InternalProgram.g:6020:2: rule__Person__Group__2__Impl rule__Person__Group__3
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
    // InternalProgram.g:6027:1: rule__Person__Group__2__Impl : ( ( rule__Person__Group_2__0 )? ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6031:1: ( ( ( rule__Person__Group_2__0 )? ) )
            // InternalProgram.g:6032:1: ( ( rule__Person__Group_2__0 )? )
            {
            // InternalProgram.g:6032:1: ( ( rule__Person__Group_2__0 )? )
            // InternalProgram.g:6033:2: ( rule__Person__Group_2__0 )?
            {
             before(grammarAccess.getPersonAccess().getGroup_2()); 
            // InternalProgram.g:6034:2: ( rule__Person__Group_2__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==57) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalProgram.g:6034:3: rule__Person__Group_2__0
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
    // InternalProgram.g:6042:1: rule__Person__Group__3 : rule__Person__Group__3__Impl ;
    public final void rule__Person__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6046:1: ( rule__Person__Group__3__Impl )
            // InternalProgram.g:6047:2: rule__Person__Group__3__Impl
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
    // InternalProgram.g:6053:1: rule__Person__Group__3__Impl : ( ( rule__Person__Group_3__0 )? ) ;
    public final void rule__Person__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6057:1: ( ( ( rule__Person__Group_3__0 )? ) )
            // InternalProgram.g:6058:1: ( ( rule__Person__Group_3__0 )? )
            {
            // InternalProgram.g:6058:1: ( ( rule__Person__Group_3__0 )? )
            // InternalProgram.g:6059:2: ( rule__Person__Group_3__0 )?
            {
             before(grammarAccess.getPersonAccess().getGroup_3()); 
            // InternalProgram.g:6060:2: ( rule__Person__Group_3__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==58) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalProgram.g:6060:3: rule__Person__Group_3__0
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
    // InternalProgram.g:6069:1: rule__Person__Group_2__0 : rule__Person__Group_2__0__Impl rule__Person__Group_2__1 ;
    public final void rule__Person__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6073:1: ( rule__Person__Group_2__0__Impl rule__Person__Group_2__1 )
            // InternalProgram.g:6074:2: rule__Person__Group_2__0__Impl rule__Person__Group_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:6081:1: rule__Person__Group_2__0__Impl : ( 'email' ) ;
    public final void rule__Person__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6085:1: ( ( 'email' ) )
            // InternalProgram.g:6086:1: ( 'email' )
            {
            // InternalProgram.g:6086:1: ( 'email' )
            // InternalProgram.g:6087:2: 'email'
            {
             before(grammarAccess.getPersonAccess().getEmailKeyword_2_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalProgram.g:6096:1: rule__Person__Group_2__1 : rule__Person__Group_2__1__Impl ;
    public final void rule__Person__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6100:1: ( rule__Person__Group_2__1__Impl )
            // InternalProgram.g:6101:2: rule__Person__Group_2__1__Impl
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
    // InternalProgram.g:6107:1: rule__Person__Group_2__1__Impl : ( ( rule__Person__EmailAssignment_2_1 ) ) ;
    public final void rule__Person__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6111:1: ( ( ( rule__Person__EmailAssignment_2_1 ) ) )
            // InternalProgram.g:6112:1: ( ( rule__Person__EmailAssignment_2_1 ) )
            {
            // InternalProgram.g:6112:1: ( ( rule__Person__EmailAssignment_2_1 ) )
            // InternalProgram.g:6113:2: ( rule__Person__EmailAssignment_2_1 )
            {
             before(grammarAccess.getPersonAccess().getEmailAssignment_2_1()); 
            // InternalProgram.g:6114:2: ( rule__Person__EmailAssignment_2_1 )
            // InternalProgram.g:6114:3: rule__Person__EmailAssignment_2_1
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
    // InternalProgram.g:6123:1: rule__Person__Group_3__0 : rule__Person__Group_3__0__Impl rule__Person__Group_3__1 ;
    public final void rule__Person__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6127:1: ( rule__Person__Group_3__0__Impl rule__Person__Group_3__1 )
            // InternalProgram.g:6128:2: rule__Person__Group_3__0__Impl rule__Person__Group_3__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:6135:1: rule__Person__Group_3__0__Impl : ( 'homepage' ) ;
    public final void rule__Person__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6139:1: ( ( 'homepage' ) )
            // InternalProgram.g:6140:1: ( 'homepage' )
            {
            // InternalProgram.g:6140:1: ( 'homepage' )
            // InternalProgram.g:6141:2: 'homepage'
            {
             before(grammarAccess.getPersonAccess().getHomepageKeyword_3_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalProgram.g:6150:1: rule__Person__Group_3__1 : rule__Person__Group_3__1__Impl ;
    public final void rule__Person__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6154:1: ( rule__Person__Group_3__1__Impl )
            // InternalProgram.g:6155:2: rule__Person__Group_3__1__Impl
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
    // InternalProgram.g:6161:1: rule__Person__Group_3__1__Impl : ( ( rule__Person__HomepageAssignment_3_1 ) ) ;
    public final void rule__Person__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6165:1: ( ( ( rule__Person__HomepageAssignment_3_1 ) ) )
            // InternalProgram.g:6166:1: ( ( rule__Person__HomepageAssignment_3_1 ) )
            {
            // InternalProgram.g:6166:1: ( ( rule__Person__HomepageAssignment_3_1 ) )
            // InternalProgram.g:6167:2: ( rule__Person__HomepageAssignment_3_1 )
            {
             before(grammarAccess.getPersonAccess().getHomepageAssignment_3_1()); 
            // InternalProgram.g:6168:2: ( rule__Person__HomepageAssignment_3_1 )
            // InternalProgram.g:6168:3: rule__Person__HomepageAssignment_3_1
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


    // $ANTLR start "rule__Conference__NameAssignment_1"
    // InternalProgram.g:6177:1: rule__Conference__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Conference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6181:1: ( ( ruleEString ) )
            // InternalProgram.g:6182:2: ( ruleEString )
            {
            // InternalProgram.g:6182:2: ( ruleEString )
            // InternalProgram.g:6183:3: ruleEString
            {
             before(grammarAccess.getConferenceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConferenceAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__NameAssignment_1"


    // $ANTLR start "rule__Conference__TalkDurationAssignment_3"
    // InternalProgram.g:6192:1: rule__Conference__TalkDurationAssignment_3 : ( ruleEIntegerObject ) ;
    public final void rule__Conference__TalkDurationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6196:1: ( ( ruleEIntegerObject ) )
            // InternalProgram.g:6197:2: ( ruleEIntegerObject )
            {
            // InternalProgram.g:6197:2: ( ruleEIntegerObject )
            // InternalProgram.g:6198:3: ruleEIntegerObject
            {
             before(grammarAccess.getConferenceAccess().getTalkDurationEIntegerObjectParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getConferenceAccess().getTalkDurationEIntegerObjectParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__TalkDurationAssignment_3"


    // $ANTLR start "rule__Conference__ResourcesAssignment_4_1"
    // InternalProgram.g:6207:1: rule__Conference__ResourcesAssignment_4_1 : ( ruleResource ) ;
    public final void rule__Conference__ResourcesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6211:1: ( ( ruleResource ) )
            // InternalProgram.g:6212:2: ( ruleResource )
            {
            // InternalProgram.g:6212:2: ( ruleResource )
            // InternalProgram.g:6213:3: ruleResource
            {
             before(grammarAccess.getConferenceAccess().getResourcesResourceParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getConferenceAccess().getResourcesResourceParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__ResourcesAssignment_4_1"


    // $ANTLR start "rule__Conference__ResourcesAssignment_4_2"
    // InternalProgram.g:6222:1: rule__Conference__ResourcesAssignment_4_2 : ( ruleResource ) ;
    public final void rule__Conference__ResourcesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6226:1: ( ( ruleResource ) )
            // InternalProgram.g:6227:2: ( ruleResource )
            {
            // InternalProgram.g:6227:2: ( ruleResource )
            // InternalProgram.g:6228:3: ruleResource
            {
             before(grammarAccess.getConferenceAccess().getResourcesResourceParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getConferenceAccess().getResourcesResourceParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__ResourcesAssignment_4_2"


    // $ANTLR start "rule__Conference__PapersAssignment_5_2"
    // InternalProgram.g:6237:1: rule__Conference__PapersAssignment_5_2 : ( rulePaper ) ;
    public final void rule__Conference__PapersAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6241:1: ( ( rulePaper ) )
            // InternalProgram.g:6242:2: ( rulePaper )
            {
            // InternalProgram.g:6242:2: ( rulePaper )
            // InternalProgram.g:6243:3: rulePaper
            {
             before(grammarAccess.getConferenceAccess().getPapersPaperParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            rulePaper();

            state._fsp--;

             after(grammarAccess.getConferenceAccess().getPapersPaperParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__PapersAssignment_5_2"


    // $ANTLR start "rule__Conference__PapersAssignment_5_3_1"
    // InternalProgram.g:6252:1: rule__Conference__PapersAssignment_5_3_1 : ( rulePaper ) ;
    public final void rule__Conference__PapersAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6256:1: ( ( rulePaper ) )
            // InternalProgram.g:6257:2: ( rulePaper )
            {
            // InternalProgram.g:6257:2: ( rulePaper )
            // InternalProgram.g:6258:3: rulePaper
            {
             before(grammarAccess.getConferenceAccess().getPapersPaperParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePaper();

            state._fsp--;

             after(grammarAccess.getConferenceAccess().getPapersPaperParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__PapersAssignment_5_3_1"


    // $ANTLR start "rule__Conference__EventsAssignment_6_2"
    // InternalProgram.g:6267:1: rule__Conference__EventsAssignment_6_2 : ( ruleEvent ) ;
    public final void rule__Conference__EventsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6271:1: ( ( ruleEvent ) )
            // InternalProgram.g:6272:2: ( ruleEvent )
            {
            // InternalProgram.g:6272:2: ( ruleEvent )
            // InternalProgram.g:6273:3: ruleEvent
            {
             before(grammarAccess.getConferenceAccess().getEventsEventParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getConferenceAccess().getEventsEventParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__EventsAssignment_6_2"


    // $ANTLR start "rule__Conference__EventsAssignment_6_3_1"
    // InternalProgram.g:6282:1: rule__Conference__EventsAssignment_6_3_1 : ( ruleEvent ) ;
    public final void rule__Conference__EventsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6286:1: ( ( ruleEvent ) )
            // InternalProgram.g:6287:2: ( ruleEvent )
            {
            // InternalProgram.g:6287:2: ( ruleEvent )
            // InternalProgram.g:6288:3: ruleEvent
            {
             before(grammarAccess.getConferenceAccess().getEventsEventParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getConferenceAccess().getEventsEventParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__EventsAssignment_6_3_1"


    // $ANTLR start "rule__Conference__ProgramAssignment_7_1"
    // InternalProgram.g:6297:1: rule__Conference__ProgramAssignment_7_1 : ( ruleProgram ) ;
    public final void rule__Conference__ProgramAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6301:1: ( ( ruleProgram ) )
            // InternalProgram.g:6302:2: ( ruleProgram )
            {
            // InternalProgram.g:6302:2: ( ruleProgram )
            // InternalProgram.g:6303:3: ruleProgram
            {
             before(grammarAccess.getConferenceAccess().getProgramProgramParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getConferenceAccess().getProgramProgramParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__ProgramAssignment_7_1"


    // $ANTLR start "rule__Program__DaysAssignment_2_0"
    // InternalProgram.g:6312:1: rule__Program__DaysAssignment_2_0 : ( ruleDay ) ;
    public final void rule__Program__DaysAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6316:1: ( ( ruleDay ) )
            // InternalProgram.g:6317:2: ( ruleDay )
            {
            // InternalProgram.g:6317:2: ( ruleDay )
            // InternalProgram.g:6318:3: ruleDay
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
    // InternalProgram.g:6327:1: rule__Program__DaysAssignment_2_1 : ( ruleDay ) ;
    public final void rule__Program__DaysAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6331:1: ( ( ruleDay ) )
            // InternalProgram.g:6332:2: ( ruleDay )
            {
            // InternalProgram.g:6332:2: ( ruleDay )
            // InternalProgram.g:6333:3: ruleDay
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
    // InternalProgram.g:6342:1: rule__Room__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Room__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6346:1: ( ( ruleEString ) )
            // InternalProgram.g:6347:2: ( ruleEString )
            {
            // InternalProgram.g:6347:2: ( ruleEString )
            // InternalProgram.g:6348:3: ruleEString
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
    // InternalProgram.g:6357:1: rule__Room__CapacityAssignment_3_1 : ( ruleEIntegerObject ) ;
    public final void rule__Room__CapacityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6361:1: ( ( ruleEIntegerObject ) )
            // InternalProgram.g:6362:2: ( ruleEIntegerObject )
            {
            // InternalProgram.g:6362:2: ( ruleEIntegerObject )
            // InternalProgram.g:6363:3: ruleEIntegerObject
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
    // InternalProgram.g:6372:1: rule__Day__WeekdayAssignment_0 : ( ruleWeekDay ) ;
    public final void rule__Day__WeekdayAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6376:1: ( ( ruleWeekDay ) )
            // InternalProgram.g:6377:2: ( ruleWeekDay )
            {
            // InternalProgram.g:6377:2: ( ruleWeekDay )
            // InternalProgram.g:6378:3: ruleWeekDay
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
    // InternalProgram.g:6387:1: rule__Day__DateAssignment_1_1 : ( ruleDayDataType ) ;
    public final void rule__Day__DateAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6391:1: ( ( ruleDayDataType ) )
            // InternalProgram.g:6392:2: ( ruleDayDataType )
            {
            // InternalProgram.g:6392:2: ( ruleDayDataType )
            // InternalProgram.g:6393:3: ruleDayDataType
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
    // InternalProgram.g:6402:1: rule__Day__SessionsAssignment_2_0 : ( ruleSession ) ;
    public final void rule__Day__SessionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6406:1: ( ( ruleSession ) )
            // InternalProgram.g:6407:2: ( ruleSession )
            {
            // InternalProgram.g:6407:2: ( ruleSession )
            // InternalProgram.g:6408:3: ruleSession
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
    // InternalProgram.g:6417:1: rule__Day__SessionsAssignment_2_1 : ( ruleSession ) ;
    public final void rule__Day__SessionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6421:1: ( ( ruleSession ) )
            // InternalProgram.g:6422:2: ( ruleSession )
            {
            // InternalProgram.g:6422:2: ( ruleSession )
            // InternalProgram.g:6423:3: ruleSession
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
    // InternalProgram.g:6432:1: rule__Session__StartingTimeAssignment_1 : ( ruleHourDataType ) ;
    public final void rule__Session__StartingTimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6436:1: ( ( ruleHourDataType ) )
            // InternalProgram.g:6437:2: ( ruleHourDataType )
            {
            // InternalProgram.g:6437:2: ( ruleHourDataType )
            // InternalProgram.g:6438:3: ruleHourDataType
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
    // InternalProgram.g:6447:1: rule__Session__EndingTimeAssignment_3 : ( ruleHourDataType ) ;
    public final void rule__Session__EndingTimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6451:1: ( ( ruleHourDataType ) )
            // InternalProgram.g:6452:2: ( ruleHourDataType )
            {
            // InternalProgram.g:6452:2: ( ruleHourDataType )
            // InternalProgram.g:6453:3: ruleHourDataType
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
    // InternalProgram.g:6462:1: rule__Session__RoomAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Session__RoomAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6466:1: ( ( ( ruleEString ) ) )
            // InternalProgram.g:6467:2: ( ( ruleEString ) )
            {
            // InternalProgram.g:6467:2: ( ( ruleEString ) )
            // InternalProgram.g:6468:3: ( ruleEString )
            {
             before(grammarAccess.getSessionAccess().getRoomRoomCrossReference_5_0()); 
            // InternalProgram.g:6469:3: ( ruleEString )
            // InternalProgram.g:6470:4: ruleEString
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
    // InternalProgram.g:6481:1: rule__Session__EventsAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__Session__EventsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6485:1: ( ( ( ruleEString ) ) )
            // InternalProgram.g:6486:2: ( ( ruleEString ) )
            {
            // InternalProgram.g:6486:2: ( ( ruleEString ) )
            // InternalProgram.g:6487:3: ( ruleEString )
            {
             before(grammarAccess.getSessionAccess().getEventsEventCrossReference_7_0()); 
            // InternalProgram.g:6488:3: ( ruleEString )
            // InternalProgram.g:6489:4: ruleEString
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
    // InternalProgram.g:6500:1: rule__Session__EventsAssignment_8_1 : ( ( ruleEString ) ) ;
    public final void rule__Session__EventsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6504:1: ( ( ( ruleEString ) ) )
            // InternalProgram.g:6505:2: ( ( ruleEString ) )
            {
            // InternalProgram.g:6505:2: ( ( ruleEString ) )
            // InternalProgram.g:6506:3: ( ruleEString )
            {
             before(grammarAccess.getSessionAccess().getEventsEventCrossReference_8_1_0()); 
            // InternalProgram.g:6507:3: ( ruleEString )
            // InternalProgram.g:6508:4: ruleEString
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
    // InternalProgram.g:6519:1: rule__TalkSession__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TalkSession__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6523:1: ( ( ruleEString ) )
            // InternalProgram.g:6524:2: ( ruleEString )
            {
            // InternalProgram.g:6524:2: ( ruleEString )
            // InternalProgram.g:6525:3: ruleEString
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
    // InternalProgram.g:6534:1: rule__TalkSession__ChairAssignment_2_1 : ( rulePerson ) ;
    public final void rule__TalkSession__ChairAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6538:1: ( ( rulePerson ) )
            // InternalProgram.g:6539:2: ( rulePerson )
            {
            // InternalProgram.g:6539:2: ( rulePerson )
            // InternalProgram.g:6540:3: rulePerson
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
    // InternalProgram.g:6549:1: rule__TalkSession__AbstractAssignment_3_1 : ( ruleEString ) ;
    public final void rule__TalkSession__AbstractAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6553:1: ( ( ruleEString ) )
            // InternalProgram.g:6554:2: ( ruleEString )
            {
            // InternalProgram.g:6554:2: ( ruleEString )
            // InternalProgram.g:6555:3: ruleEString
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
    // InternalProgram.g:6564:1: rule__TalkSession__PapersAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__TalkSession__PapersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6568:1: ( ( ( ruleEString ) ) )
            // InternalProgram.g:6569:2: ( ( ruleEString ) )
            {
            // InternalProgram.g:6569:2: ( ( ruleEString ) )
            // InternalProgram.g:6570:3: ( ruleEString )
            {
             before(grammarAccess.getTalkSessionAccess().getPapersPaperCrossReference_4_1_0()); 
            // InternalProgram.g:6571:3: ( ruleEString )
            // InternalProgram.g:6572:4: ruleEString
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
    // InternalProgram.g:6583:1: rule__TalkSession__PapersAssignment_4_2_1 : ( ( ruleEString ) ) ;
    public final void rule__TalkSession__PapersAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6587:1: ( ( ( ruleEString ) ) )
            // InternalProgram.g:6588:2: ( ( ruleEString ) )
            {
            // InternalProgram.g:6588:2: ( ( ruleEString ) )
            // InternalProgram.g:6589:3: ( ruleEString )
            {
             before(grammarAccess.getTalkSessionAccess().getPapersPaperCrossReference_4_2_1_0()); 
            // InternalProgram.g:6590:3: ( ruleEString )
            // InternalProgram.g:6591:4: ruleEString
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
    // InternalProgram.g:6602:1: rule__Panel__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Panel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6606:1: ( ( ruleEString ) )
            // InternalProgram.g:6607:2: ( ruleEString )
            {
            // InternalProgram.g:6607:2: ( ruleEString )
            // InternalProgram.g:6608:3: ruleEString
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
    // InternalProgram.g:6617:1: rule__Panel__AbstractAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Panel__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6621:1: ( ( ruleEString ) )
            // InternalProgram.g:6622:2: ( ruleEString )
            {
            // InternalProgram.g:6622:2: ( ruleEString )
            // InternalProgram.g:6623:3: ruleEString
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
    // InternalProgram.g:6632:1: rule__Panel__PanelistsAssignment_3_1 : ( rulePerson ) ;
    public final void rule__Panel__PanelistsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6636:1: ( ( rulePerson ) )
            // InternalProgram.g:6637:2: ( rulePerson )
            {
            // InternalProgram.g:6637:2: ( rulePerson )
            // InternalProgram.g:6638:3: rulePerson
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
    // InternalProgram.g:6647:1: rule__Panel__PanelistsAssignment_3_2_1 : ( rulePerson ) ;
    public final void rule__Panel__PanelistsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6651:1: ( ( rulePerson ) )
            // InternalProgram.g:6652:2: ( rulePerson )
            {
            // InternalProgram.g:6652:2: ( rulePerson )
            // InternalProgram.g:6653:3: rulePerson
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
    // InternalProgram.g:6662:1: rule__Panel__ModeratorsAssignment_4_1 : ( rulePerson ) ;
    public final void rule__Panel__ModeratorsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6666:1: ( ( rulePerson ) )
            // InternalProgram.g:6667:2: ( rulePerson )
            {
            // InternalProgram.g:6667:2: ( rulePerson )
            // InternalProgram.g:6668:3: rulePerson
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
    // InternalProgram.g:6677:1: rule__Panel__ModeratorsAssignment_4_2_1 : ( rulePerson ) ;
    public final void rule__Panel__ModeratorsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6681:1: ( ( rulePerson ) )
            // InternalProgram.g:6682:2: ( rulePerson )
            {
            // InternalProgram.g:6682:2: ( rulePerson )
            // InternalProgram.g:6683:3: rulePerson
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


    // $ANTLR start "rule__Workshop__NameAssignment_1"
    // InternalProgram.g:6692:1: rule__Workshop__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Workshop__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6696:1: ( ( ruleEString ) )
            // InternalProgram.g:6697:2: ( ruleEString )
            {
            // InternalProgram.g:6697:2: ( ruleEString )
            // InternalProgram.g:6698:3: ruleEString
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
    // InternalProgram.g:6707:1: rule__Workshop__AbstractAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Workshop__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6711:1: ( ( ruleEString ) )
            // InternalProgram.g:6712:2: ( ruleEString )
            {
            // InternalProgram.g:6712:2: ( ruleEString )
            // InternalProgram.g:6713:3: ruleEString
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
    // InternalProgram.g:6722:1: rule__Workshop__UrlAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Workshop__UrlAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6726:1: ( ( ruleEString ) )
            // InternalProgram.g:6727:2: ( ruleEString )
            {
            // InternalProgram.g:6727:2: ( ruleEString )
            // InternalProgram.g:6728:3: ruleEString
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


    // $ANTLR start "rule__Workshop__IdAssignment_4_1"
    // InternalProgram.g:6737:1: rule__Workshop__IdAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Workshop__IdAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6741:1: ( ( ruleEString ) )
            // InternalProgram.g:6742:2: ( ruleEString )
            {
            // InternalProgram.g:6742:2: ( ruleEString )
            // InternalProgram.g:6743:3: ruleEString
            {
             before(grammarAccess.getWorkshopAccess().getIdEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkshopAccess().getIdEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__IdAssignment_4_1"


    // $ANTLR start "rule__Workshop__OrganizersAssignment_5_1"
    // InternalProgram.g:6752:1: rule__Workshop__OrganizersAssignment_5_1 : ( rulePerson ) ;
    public final void rule__Workshop__OrganizersAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6756:1: ( ( rulePerson ) )
            // InternalProgram.g:6757:2: ( rulePerson )
            {
            // InternalProgram.g:6757:2: ( rulePerson )
            // InternalProgram.g:6758:3: rulePerson
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
    // InternalProgram.g:6767:1: rule__Workshop__OrganizersAssignment_5_2_1 : ( rulePerson ) ;
    public final void rule__Workshop__OrganizersAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6771:1: ( ( rulePerson ) )
            // InternalProgram.g:6772:2: ( rulePerson )
            {
            // InternalProgram.g:6772:2: ( rulePerson )
            // InternalProgram.g:6773:3: rulePerson
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
    // InternalProgram.g:6782:1: rule__Tutorial__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Tutorial__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6786:1: ( ( ruleEString ) )
            // InternalProgram.g:6787:2: ( ruleEString )
            {
            // InternalProgram.g:6787:2: ( ruleEString )
            // InternalProgram.g:6788:3: ruleEString
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
    // InternalProgram.g:6797:1: rule__Tutorial__AbstractAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Tutorial__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6801:1: ( ( ruleEString ) )
            // InternalProgram.g:6802:2: ( ruleEString )
            {
            // InternalProgram.g:6802:2: ( ruleEString )
            // InternalProgram.g:6803:3: ruleEString
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


    // $ANTLR start "rule__Tutorial__IdAssignment_3_1"
    // InternalProgram.g:6812:1: rule__Tutorial__IdAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Tutorial__IdAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6816:1: ( ( ruleEString ) )
            // InternalProgram.g:6817:2: ( ruleEString )
            {
            // InternalProgram.g:6817:2: ( ruleEString )
            // InternalProgram.g:6818:3: ruleEString
            {
             before(grammarAccess.getTutorialAccess().getIdEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTutorialAccess().getIdEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__IdAssignment_3_1"


    // $ANTLR start "rule__Tutorial__OrganizersAssignment_4_1"
    // InternalProgram.g:6827:1: rule__Tutorial__OrganizersAssignment_4_1 : ( rulePerson ) ;
    public final void rule__Tutorial__OrganizersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6831:1: ( ( rulePerson ) )
            // InternalProgram.g:6832:2: ( rulePerson )
            {
            // InternalProgram.g:6832:2: ( rulePerson )
            // InternalProgram.g:6833:3: rulePerson
            {
             before(grammarAccess.getTutorialAccess().getOrganizersPersonParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getTutorialAccess().getOrganizersPersonParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__OrganizersAssignment_4_1"


    // $ANTLR start "rule__Tutorial__OrganizersAssignment_4_2_1"
    // InternalProgram.g:6842:1: rule__Tutorial__OrganizersAssignment_4_2_1 : ( rulePerson ) ;
    public final void rule__Tutorial__OrganizersAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6846:1: ( ( rulePerson ) )
            // InternalProgram.g:6847:2: ( rulePerson )
            {
            // InternalProgram.g:6847:2: ( rulePerson )
            // InternalProgram.g:6848:3: rulePerson
            {
             before(grammarAccess.getTutorialAccess().getOrganizersPersonParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getTutorialAccess().getOrganizersPersonParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__OrganizersAssignment_4_2_1"


    // $ANTLR start "rule__DoctoralSymposium__NameAssignment_1"
    // InternalProgram.g:6857:1: rule__DoctoralSymposium__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__DoctoralSymposium__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6861:1: ( ( ruleEString ) )
            // InternalProgram.g:6862:2: ( ruleEString )
            {
            // InternalProgram.g:6862:2: ( ruleEString )
            // InternalProgram.g:6863:3: ruleEString
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
    // InternalProgram.g:6872:1: rule__DoctoralSymposium__AbstractAssignment_2_1 : ( ruleEString ) ;
    public final void rule__DoctoralSymposium__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6876:1: ( ( ruleEString ) )
            // InternalProgram.g:6877:2: ( ruleEString )
            {
            // InternalProgram.g:6877:2: ( ruleEString )
            // InternalProgram.g:6878:3: ruleEString
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
    // InternalProgram.g:6887:1: rule__DoctoralSymposium__OrganizersAssignment_3_1 : ( rulePerson ) ;
    public final void rule__DoctoralSymposium__OrganizersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6891:1: ( ( rulePerson ) )
            // InternalProgram.g:6892:2: ( rulePerson )
            {
            // InternalProgram.g:6892:2: ( rulePerson )
            // InternalProgram.g:6893:3: rulePerson
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
    // InternalProgram.g:6902:1: rule__DoctoralSymposium__OrganizersAssignment_3_2_1 : ( rulePerson ) ;
    public final void rule__DoctoralSymposium__OrganizersAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6906:1: ( ( rulePerson ) )
            // InternalProgram.g:6907:2: ( rulePerson )
            {
            // InternalProgram.g:6907:2: ( rulePerson )
            // InternalProgram.g:6908:3: rulePerson
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
    // InternalProgram.g:6917:1: rule__EducatorSymposium__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__EducatorSymposium__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6921:1: ( ( ruleEString ) )
            // InternalProgram.g:6922:2: ( ruleEString )
            {
            // InternalProgram.g:6922:2: ( ruleEString )
            // InternalProgram.g:6923:3: ruleEString
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
    // InternalProgram.g:6932:1: rule__EducatorSymposium__AbstractAssignment_2_1 : ( ruleEString ) ;
    public final void rule__EducatorSymposium__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6936:1: ( ( ruleEString ) )
            // InternalProgram.g:6937:2: ( ruleEString )
            {
            // InternalProgram.g:6937:2: ( ruleEString )
            // InternalProgram.g:6938:3: ruleEString
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
    // InternalProgram.g:6947:1: rule__EducatorSymposium__OrganizersAssignment_3_1 : ( rulePerson ) ;
    public final void rule__EducatorSymposium__OrganizersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6951:1: ( ( rulePerson ) )
            // InternalProgram.g:6952:2: ( rulePerson )
            {
            // InternalProgram.g:6952:2: ( rulePerson )
            // InternalProgram.g:6953:3: rulePerson
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
    // InternalProgram.g:6962:1: rule__EducatorSymposium__OrganizersAssignment_3_2_1 : ( rulePerson ) ;
    public final void rule__EducatorSymposium__OrganizersAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6966:1: ( ( rulePerson ) )
            // InternalProgram.g:6967:2: ( rulePerson )
            {
            // InternalProgram.g:6967:2: ( rulePerson )
            // InternalProgram.g:6968:3: rulePerson
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
    // InternalProgram.g:6977:1: rule__Reception__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Reception__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6981:1: ( ( ruleEString ) )
            // InternalProgram.g:6982:2: ( ruleEString )
            {
            // InternalProgram.g:6982:2: ( ruleEString )
            // InternalProgram.g:6983:3: ruleEString
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
    // InternalProgram.g:6992:1: rule__Reception__AbstractAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Reception__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6996:1: ( ( ruleEString ) )
            // InternalProgram.g:6997:2: ( ruleEString )
            {
            // InternalProgram.g:6997:2: ( ruleEString )
            // InternalProgram.g:6998:3: ruleEString
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
    // InternalProgram.g:7007:1: rule__Clinic__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Clinic__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7011:1: ( ( ruleEString ) )
            // InternalProgram.g:7012:2: ( ruleEString )
            {
            // InternalProgram.g:7012:2: ( ruleEString )
            // InternalProgram.g:7013:3: ruleEString
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
    // InternalProgram.g:7022:1: rule__Clinic__AbstractAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Clinic__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7026:1: ( ( ruleEString ) )
            // InternalProgram.g:7027:2: ( ruleEString )
            {
            // InternalProgram.g:7027:2: ( ruleEString )
            // InternalProgram.g:7028:3: ruleEString
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
    // InternalProgram.g:7037:1: rule__Lunch__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Lunch__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7041:1: ( ( ruleEString ) )
            // InternalProgram.g:7042:2: ( ruleEString )
            {
            // InternalProgram.g:7042:2: ( ruleEString )
            // InternalProgram.g:7043:3: ruleEString
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
    // InternalProgram.g:7052:1: rule__Lunch__AbstractAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Lunch__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7056:1: ( ( ruleEString ) )
            // InternalProgram.g:7057:2: ( ruleEString )
            {
            // InternalProgram.g:7057:2: ( ruleEString )
            // InternalProgram.g:7058:3: ruleEString
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
    // InternalProgram.g:7067:1: rule__CoffeeBreak__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CoffeeBreak__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7071:1: ( ( ruleEString ) )
            // InternalProgram.g:7072:2: ( ruleEString )
            {
            // InternalProgram.g:7072:2: ( ruleEString )
            // InternalProgram.g:7073:3: ruleEString
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
    // InternalProgram.g:7082:1: rule__CoffeeBreak__AbstractAssignment_2_1 : ( ruleEString ) ;
    public final void rule__CoffeeBreak__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7086:1: ( ( ruleEString ) )
            // InternalProgram.g:7087:2: ( ruleEString )
            {
            // InternalProgram.g:7087:2: ( ruleEString )
            // InternalProgram.g:7088:3: ruleEString
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
    // InternalProgram.g:7097:1: rule__Meeting__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Meeting__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7101:1: ( ( ruleEString ) )
            // InternalProgram.g:7102:2: ( ruleEString )
            {
            // InternalProgram.g:7102:2: ( ruleEString )
            // InternalProgram.g:7103:3: ruleEString
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
    // InternalProgram.g:7112:1: rule__Meeting__AbstractAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Meeting__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7116:1: ( ( ruleEString ) )
            // InternalProgram.g:7117:2: ( ruleEString )
            {
            // InternalProgram.g:7117:2: ( ruleEString )
            // InternalProgram.g:7118:3: ruleEString
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


    // $ANTLR start "rule__Paper__NameAssignment_1"
    // InternalProgram.g:7127:1: rule__Paper__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Paper__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7131:1: ( ( ruleEString ) )
            // InternalProgram.g:7132:2: ( ruleEString )
            {
            // InternalProgram.g:7132:2: ( ruleEString )
            // InternalProgram.g:7133:3: ruleEString
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
    // InternalProgram.g:7142:1: rule__Paper__AuthorsAssignment_3 : ( rulePerson ) ;
    public final void rule__Paper__AuthorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7146:1: ( ( rulePerson ) )
            // InternalProgram.g:7147:2: ( rulePerson )
            {
            // InternalProgram.g:7147:2: ( rulePerson )
            // InternalProgram.g:7148:3: rulePerson
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
    // InternalProgram.g:7157:1: rule__Paper__AuthorsAssignment_4_1 : ( rulePerson ) ;
    public final void rule__Paper__AuthorsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7161:1: ( ( rulePerson ) )
            // InternalProgram.g:7162:2: ( rulePerson )
            {
            // InternalProgram.g:7162:2: ( rulePerson )
            // InternalProgram.g:7163:3: rulePerson
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
    // InternalProgram.g:7172:1: rule__Paper__AbstractAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Paper__AbstractAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7176:1: ( ( ruleEString ) )
            // InternalProgram.g:7177:2: ( ruleEString )
            {
            // InternalProgram.g:7177:2: ( ruleEString )
            // InternalProgram.g:7178:3: ruleEString
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
    // InternalProgram.g:7187:1: rule__Paper__PreprintAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Paper__PreprintAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7191:1: ( ( ruleEString ) )
            // InternalProgram.g:7192:2: ( ruleEString )
            {
            // InternalProgram.g:7192:2: ( ruleEString )
            // InternalProgram.g:7193:3: ruleEString
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
    // InternalProgram.g:7202:1: rule__Paper__KindAssignment_7_1 : ( ruleTrack ) ;
    public final void rule__Paper__KindAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7206:1: ( ( ruleTrack ) )
            // InternalProgram.g:7207:2: ( ruleTrack )
            {
            // InternalProgram.g:7207:2: ( ruleTrack )
            // InternalProgram.g:7208:3: ruleTrack
            {
             before(grammarAccess.getPaperAccess().getKindTrackEnumRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTrack();

            state._fsp--;

             after(grammarAccess.getPaperAccess().getKindTrackEnumRuleCall_7_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:7217:1: rule__Person__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Person__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7221:1: ( ( ruleEString ) )
            // InternalProgram.g:7222:2: ( ruleEString )
            {
            // InternalProgram.g:7222:2: ( ruleEString )
            // InternalProgram.g:7223:3: ruleEString
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
    // InternalProgram.g:7232:1: rule__Person__EmailAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Person__EmailAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7236:1: ( ( ruleEString ) )
            // InternalProgram.g:7237:2: ( ruleEString )
            {
            // InternalProgram.g:7237:2: ( ruleEString )
            // InternalProgram.g:7238:3: ruleEString
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
    // InternalProgram.g:7247:1: rule__Person__HomepageAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Person__HomepageAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7251:1: ( ( ruleEString ) )
            // InternalProgram.g:7252:2: ( ruleEString )
            {
            // InternalProgram.g:7252:2: ( ruleEString )
            // InternalProgram.g:7253:3: ruleEString
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000C600000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x003FC49000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000103F800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000003F800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000003F802L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000006000400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000034000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000384000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000304000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000204000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0180004800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0600000000000000L});

}