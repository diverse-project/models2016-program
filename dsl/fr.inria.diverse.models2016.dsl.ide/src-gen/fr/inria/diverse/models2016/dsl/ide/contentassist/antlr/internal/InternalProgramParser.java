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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Monday'", "'Tuesday'", "'Wednesday'", "'Thursday'", "'Friday'", "'Saturday'", "'Sunday'", "'Conference'", "'talk duration'", "'kinds'", "','", "'resources'", "'papers'", "'{'", "'}'", "';'", "'events'", "'program'", "'room'", "'capacity'", "'date'", "'.'", "':'", "'-'", "'in'", "'TalkSession'", "'chair'", "'abstract'", "'Panel'", "'panelists'", "'moderators'", "'SRC'", "'url'", "'Poster'", "'Keynote'", "'speaker'", "'SponsorKeynote'", "'Workshop'", "'name'", "'organizers'", "'Tutorial'", "'DoctoralSymposium'", "'EducatorSymposium'", "'Reception'", "'Clinic'", "'Lunch'", "'CoffeeBreak'", "'Meeting'", "'participants'", "'Opening'", "'authors'", "'preprint'", "'kind'", "'proceedings'", "'email'", "'homepage'", "'cancelled'"
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


    // $ANTLR start "entryRuleProgram"
    // InternalProgram.g:128:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalProgram.g:129:1: ( ruleProgram EOF )
            // InternalProgram.g:130:1: ruleProgram EOF
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
    // InternalProgram.g:137:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:141:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalProgram.g:142:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalProgram.g:142:2: ( ( rule__Program__Group__0 ) )
            // InternalProgram.g:143:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalProgram.g:144:3: ( rule__Program__Group__0 )
            // InternalProgram.g:144:4: rule__Program__Group__0
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
    // InternalProgram.g:153:1: entryRuleRoom : ruleRoom EOF ;
    public final void entryRuleRoom() throws RecognitionException {
        try {
            // InternalProgram.g:154:1: ( ruleRoom EOF )
            // InternalProgram.g:155:1: ruleRoom EOF
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
    // InternalProgram.g:162:1: ruleRoom : ( ( rule__Room__Group__0 ) ) ;
    public final void ruleRoom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:166:2: ( ( ( rule__Room__Group__0 ) ) )
            // InternalProgram.g:167:2: ( ( rule__Room__Group__0 ) )
            {
            // InternalProgram.g:167:2: ( ( rule__Room__Group__0 ) )
            // InternalProgram.g:168:3: ( rule__Room__Group__0 )
            {
             before(grammarAccess.getRoomAccess().getGroup()); 
            // InternalProgram.g:169:3: ( rule__Room__Group__0 )
            // InternalProgram.g:169:4: rule__Room__Group__0
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


    // $ANTLR start "entryRuleDay"
    // InternalProgram.g:178:1: entryRuleDay : ruleDay EOF ;
    public final void entryRuleDay() throws RecognitionException {
        try {
            // InternalProgram.g:179:1: ( ruleDay EOF )
            // InternalProgram.g:180:1: ruleDay EOF
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
    // InternalProgram.g:187:1: ruleDay : ( ( rule__Day__Group__0 ) ) ;
    public final void ruleDay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:191:2: ( ( ( rule__Day__Group__0 ) ) )
            // InternalProgram.g:192:2: ( ( rule__Day__Group__0 ) )
            {
            // InternalProgram.g:192:2: ( ( rule__Day__Group__0 ) )
            // InternalProgram.g:193:3: ( rule__Day__Group__0 )
            {
             before(grammarAccess.getDayAccess().getGroup()); 
            // InternalProgram.g:194:3: ( rule__Day__Group__0 )
            // InternalProgram.g:194:4: rule__Day__Group__0
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


    // $ANTLR start "entryRuleDayDate"
    // InternalProgram.g:203:1: entryRuleDayDate : ruleDayDate EOF ;
    public final void entryRuleDayDate() throws RecognitionException {
        try {
            // InternalProgram.g:204:1: ( ruleDayDate EOF )
            // InternalProgram.g:205:1: ruleDayDate EOF
            {
             before(grammarAccess.getDayDateRule()); 
            pushFollow(FOLLOW_1);
            ruleDayDate();

            state._fsp--;

             after(grammarAccess.getDayDateRule()); 
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
    // $ANTLR end "entryRuleDayDate"


    // $ANTLR start "ruleDayDate"
    // InternalProgram.g:212:1: ruleDayDate : ( ( rule__DayDate__Group__0 ) ) ;
    public final void ruleDayDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:216:2: ( ( ( rule__DayDate__Group__0 ) ) )
            // InternalProgram.g:217:2: ( ( rule__DayDate__Group__0 ) )
            {
            // InternalProgram.g:217:2: ( ( rule__DayDate__Group__0 ) )
            // InternalProgram.g:218:3: ( rule__DayDate__Group__0 )
            {
             before(grammarAccess.getDayDateAccess().getGroup()); 
            // InternalProgram.g:219:3: ( rule__DayDate__Group__0 )
            // InternalProgram.g:219:4: rule__DayDate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DayDate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDayDateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDayDate"


    // $ANTLR start "entryRuleHourDate"
    // InternalProgram.g:228:1: entryRuleHourDate : ruleHourDate EOF ;
    public final void entryRuleHourDate() throws RecognitionException {
        try {
            // InternalProgram.g:229:1: ( ruleHourDate EOF )
            // InternalProgram.g:230:1: ruleHourDate EOF
            {
             before(grammarAccess.getHourDateRule()); 
            pushFollow(FOLLOW_1);
            ruleHourDate();

            state._fsp--;

             after(grammarAccess.getHourDateRule()); 
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
    // $ANTLR end "entryRuleHourDate"


    // $ANTLR start "ruleHourDate"
    // InternalProgram.g:237:1: ruleHourDate : ( ( rule__HourDate__Group__0 ) ) ;
    public final void ruleHourDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:241:2: ( ( ( rule__HourDate__Group__0 ) ) )
            // InternalProgram.g:242:2: ( ( rule__HourDate__Group__0 ) )
            {
            // InternalProgram.g:242:2: ( ( rule__HourDate__Group__0 ) )
            // InternalProgram.g:243:3: ( rule__HourDate__Group__0 )
            {
             before(grammarAccess.getHourDateAccess().getGroup()); 
            // InternalProgram.g:244:3: ( rule__HourDate__Group__0 )
            // InternalProgram.g:244:4: rule__HourDate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HourDate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHourDateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHourDate"


    // $ANTLR start "entryRuleSession"
    // InternalProgram.g:253:1: entryRuleSession : ruleSession EOF ;
    public final void entryRuleSession() throws RecognitionException {
        try {
            // InternalProgram.g:254:1: ( ruleSession EOF )
            // InternalProgram.g:255:1: ruleSession EOF
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
    // InternalProgram.g:262:1: ruleSession : ( ( rule__Session__Group__0 ) ) ;
    public final void ruleSession() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:266:2: ( ( ( rule__Session__Group__0 ) ) )
            // InternalProgram.g:267:2: ( ( rule__Session__Group__0 ) )
            {
            // InternalProgram.g:267:2: ( ( rule__Session__Group__0 ) )
            // InternalProgram.g:268:3: ( rule__Session__Group__0 )
            {
             before(grammarAccess.getSessionAccess().getGroup()); 
            // InternalProgram.g:269:3: ( rule__Session__Group__0 )
            // InternalProgram.g:269:4: rule__Session__Group__0
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
    // InternalProgram.g:278:1: entryRuleTalkSession : ruleTalkSession EOF ;
    public final void entryRuleTalkSession() throws RecognitionException {
        try {
            // InternalProgram.g:279:1: ( ruleTalkSession EOF )
            // InternalProgram.g:280:1: ruleTalkSession EOF
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
    // InternalProgram.g:287:1: ruleTalkSession : ( ( rule__TalkSession__Group__0 ) ) ;
    public final void ruleTalkSession() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:291:2: ( ( ( rule__TalkSession__Group__0 ) ) )
            // InternalProgram.g:292:2: ( ( rule__TalkSession__Group__0 ) )
            {
            // InternalProgram.g:292:2: ( ( rule__TalkSession__Group__0 ) )
            // InternalProgram.g:293:3: ( rule__TalkSession__Group__0 )
            {
             before(grammarAccess.getTalkSessionAccess().getGroup()); 
            // InternalProgram.g:294:3: ( rule__TalkSession__Group__0 )
            // InternalProgram.g:294:4: rule__TalkSession__Group__0
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
    // InternalProgram.g:303:1: entryRulePanel : rulePanel EOF ;
    public final void entryRulePanel() throws RecognitionException {
        try {
            // InternalProgram.g:304:1: ( rulePanel EOF )
            // InternalProgram.g:305:1: rulePanel EOF
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
    // InternalProgram.g:312:1: rulePanel : ( ( rule__Panel__Group__0 ) ) ;
    public final void rulePanel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:316:2: ( ( ( rule__Panel__Group__0 ) ) )
            // InternalProgram.g:317:2: ( ( rule__Panel__Group__0 ) )
            {
            // InternalProgram.g:317:2: ( ( rule__Panel__Group__0 ) )
            // InternalProgram.g:318:3: ( rule__Panel__Group__0 )
            {
             before(grammarAccess.getPanelAccess().getGroup()); 
            // InternalProgram.g:319:3: ( rule__Panel__Group__0 )
            // InternalProgram.g:319:4: rule__Panel__Group__0
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
    // InternalProgram.g:328:1: entryRuleSRC : ruleSRC EOF ;
    public final void entryRuleSRC() throws RecognitionException {
        try {
            // InternalProgram.g:329:1: ( ruleSRC EOF )
            // InternalProgram.g:330:1: ruleSRC EOF
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
    // InternalProgram.g:337:1: ruleSRC : ( ( rule__SRC__Group__0 ) ) ;
    public final void ruleSRC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:341:2: ( ( ( rule__SRC__Group__0 ) ) )
            // InternalProgram.g:342:2: ( ( rule__SRC__Group__0 ) )
            {
            // InternalProgram.g:342:2: ( ( rule__SRC__Group__0 ) )
            // InternalProgram.g:343:3: ( rule__SRC__Group__0 )
            {
             before(grammarAccess.getSRCAccess().getGroup()); 
            // InternalProgram.g:344:3: ( rule__SRC__Group__0 )
            // InternalProgram.g:344:4: rule__SRC__Group__0
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
    // InternalProgram.g:353:1: entryRulePoster : rulePoster EOF ;
    public final void entryRulePoster() throws RecognitionException {
        try {
            // InternalProgram.g:354:1: ( rulePoster EOF )
            // InternalProgram.g:355:1: rulePoster EOF
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
    // InternalProgram.g:362:1: rulePoster : ( ( rule__Poster__Group__0 ) ) ;
    public final void rulePoster() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:366:2: ( ( ( rule__Poster__Group__0 ) ) )
            // InternalProgram.g:367:2: ( ( rule__Poster__Group__0 ) )
            {
            // InternalProgram.g:367:2: ( ( rule__Poster__Group__0 ) )
            // InternalProgram.g:368:3: ( rule__Poster__Group__0 )
            {
             before(grammarAccess.getPosterAccess().getGroup()); 
            // InternalProgram.g:369:3: ( rule__Poster__Group__0 )
            // InternalProgram.g:369:4: rule__Poster__Group__0
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
    // InternalProgram.g:378:1: entryRuleKeynote : ruleKeynote EOF ;
    public final void entryRuleKeynote() throws RecognitionException {
        try {
            // InternalProgram.g:379:1: ( ruleKeynote EOF )
            // InternalProgram.g:380:1: ruleKeynote EOF
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
    // InternalProgram.g:387:1: ruleKeynote : ( ( rule__Keynote__Group__0 ) ) ;
    public final void ruleKeynote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:391:2: ( ( ( rule__Keynote__Group__0 ) ) )
            // InternalProgram.g:392:2: ( ( rule__Keynote__Group__0 ) )
            {
            // InternalProgram.g:392:2: ( ( rule__Keynote__Group__0 ) )
            // InternalProgram.g:393:3: ( rule__Keynote__Group__0 )
            {
             before(grammarAccess.getKeynoteAccess().getGroup()); 
            // InternalProgram.g:394:3: ( rule__Keynote__Group__0 )
            // InternalProgram.g:394:4: rule__Keynote__Group__0
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
    // InternalProgram.g:403:1: entryRuleSponsorKeynote : ruleSponsorKeynote EOF ;
    public final void entryRuleSponsorKeynote() throws RecognitionException {
        try {
            // InternalProgram.g:404:1: ( ruleSponsorKeynote EOF )
            // InternalProgram.g:405:1: ruleSponsorKeynote EOF
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
    // InternalProgram.g:412:1: ruleSponsorKeynote : ( ( rule__SponsorKeynote__Group__0 ) ) ;
    public final void ruleSponsorKeynote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:416:2: ( ( ( rule__SponsorKeynote__Group__0 ) ) )
            // InternalProgram.g:417:2: ( ( rule__SponsorKeynote__Group__0 ) )
            {
            // InternalProgram.g:417:2: ( ( rule__SponsorKeynote__Group__0 ) )
            // InternalProgram.g:418:3: ( rule__SponsorKeynote__Group__0 )
            {
             before(grammarAccess.getSponsorKeynoteAccess().getGroup()); 
            // InternalProgram.g:419:3: ( rule__SponsorKeynote__Group__0 )
            // InternalProgram.g:419:4: rule__SponsorKeynote__Group__0
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
    // InternalProgram.g:428:1: entryRuleWorkshop : ruleWorkshop EOF ;
    public final void entryRuleWorkshop() throws RecognitionException {
        try {
            // InternalProgram.g:429:1: ( ruleWorkshop EOF )
            // InternalProgram.g:430:1: ruleWorkshop EOF
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
    // InternalProgram.g:437:1: ruleWorkshop : ( ( rule__Workshop__Group__0 ) ) ;
    public final void ruleWorkshop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:441:2: ( ( ( rule__Workshop__Group__0 ) ) )
            // InternalProgram.g:442:2: ( ( rule__Workshop__Group__0 ) )
            {
            // InternalProgram.g:442:2: ( ( rule__Workshop__Group__0 ) )
            // InternalProgram.g:443:3: ( rule__Workshop__Group__0 )
            {
             before(grammarAccess.getWorkshopAccess().getGroup()); 
            // InternalProgram.g:444:3: ( rule__Workshop__Group__0 )
            // InternalProgram.g:444:4: rule__Workshop__Group__0
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
    // InternalProgram.g:453:1: entryRuleTutorial : ruleTutorial EOF ;
    public final void entryRuleTutorial() throws RecognitionException {
        try {
            // InternalProgram.g:454:1: ( ruleTutorial EOF )
            // InternalProgram.g:455:1: ruleTutorial EOF
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
    // InternalProgram.g:462:1: ruleTutorial : ( ( rule__Tutorial__Group__0 ) ) ;
    public final void ruleTutorial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:466:2: ( ( ( rule__Tutorial__Group__0 ) ) )
            // InternalProgram.g:467:2: ( ( rule__Tutorial__Group__0 ) )
            {
            // InternalProgram.g:467:2: ( ( rule__Tutorial__Group__0 ) )
            // InternalProgram.g:468:3: ( rule__Tutorial__Group__0 )
            {
             before(grammarAccess.getTutorialAccess().getGroup()); 
            // InternalProgram.g:469:3: ( rule__Tutorial__Group__0 )
            // InternalProgram.g:469:4: rule__Tutorial__Group__0
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
    // InternalProgram.g:478:1: entryRuleDoctoralSymposium : ruleDoctoralSymposium EOF ;
    public final void entryRuleDoctoralSymposium() throws RecognitionException {
        try {
            // InternalProgram.g:479:1: ( ruleDoctoralSymposium EOF )
            // InternalProgram.g:480:1: ruleDoctoralSymposium EOF
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
    // InternalProgram.g:487:1: ruleDoctoralSymposium : ( ( rule__DoctoralSymposium__Group__0 ) ) ;
    public final void ruleDoctoralSymposium() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:491:2: ( ( ( rule__DoctoralSymposium__Group__0 ) ) )
            // InternalProgram.g:492:2: ( ( rule__DoctoralSymposium__Group__0 ) )
            {
            // InternalProgram.g:492:2: ( ( rule__DoctoralSymposium__Group__0 ) )
            // InternalProgram.g:493:3: ( rule__DoctoralSymposium__Group__0 )
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getGroup()); 
            // InternalProgram.g:494:3: ( rule__DoctoralSymposium__Group__0 )
            // InternalProgram.g:494:4: rule__DoctoralSymposium__Group__0
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
    // InternalProgram.g:503:1: entryRuleEducatorSymposium : ruleEducatorSymposium EOF ;
    public final void entryRuleEducatorSymposium() throws RecognitionException {
        try {
            // InternalProgram.g:504:1: ( ruleEducatorSymposium EOF )
            // InternalProgram.g:505:1: ruleEducatorSymposium EOF
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
    // InternalProgram.g:512:1: ruleEducatorSymposium : ( ( rule__EducatorSymposium__Group__0 ) ) ;
    public final void ruleEducatorSymposium() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:516:2: ( ( ( rule__EducatorSymposium__Group__0 ) ) )
            // InternalProgram.g:517:2: ( ( rule__EducatorSymposium__Group__0 ) )
            {
            // InternalProgram.g:517:2: ( ( rule__EducatorSymposium__Group__0 ) )
            // InternalProgram.g:518:3: ( rule__EducatorSymposium__Group__0 )
            {
             before(grammarAccess.getEducatorSymposiumAccess().getGroup()); 
            // InternalProgram.g:519:3: ( rule__EducatorSymposium__Group__0 )
            // InternalProgram.g:519:4: rule__EducatorSymposium__Group__0
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
    // InternalProgram.g:528:1: entryRuleReception : ruleReception EOF ;
    public final void entryRuleReception() throws RecognitionException {
        try {
            // InternalProgram.g:529:1: ( ruleReception EOF )
            // InternalProgram.g:530:1: ruleReception EOF
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
    // InternalProgram.g:537:1: ruleReception : ( ( rule__Reception__Group__0 ) ) ;
    public final void ruleReception() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:541:2: ( ( ( rule__Reception__Group__0 ) ) )
            // InternalProgram.g:542:2: ( ( rule__Reception__Group__0 ) )
            {
            // InternalProgram.g:542:2: ( ( rule__Reception__Group__0 ) )
            // InternalProgram.g:543:3: ( rule__Reception__Group__0 )
            {
             before(grammarAccess.getReceptionAccess().getGroup()); 
            // InternalProgram.g:544:3: ( rule__Reception__Group__0 )
            // InternalProgram.g:544:4: rule__Reception__Group__0
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
    // InternalProgram.g:553:1: entryRuleClinic : ruleClinic EOF ;
    public final void entryRuleClinic() throws RecognitionException {
        try {
            // InternalProgram.g:554:1: ( ruleClinic EOF )
            // InternalProgram.g:555:1: ruleClinic EOF
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
    // InternalProgram.g:562:1: ruleClinic : ( ( rule__Clinic__Group__0 ) ) ;
    public final void ruleClinic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:566:2: ( ( ( rule__Clinic__Group__0 ) ) )
            // InternalProgram.g:567:2: ( ( rule__Clinic__Group__0 ) )
            {
            // InternalProgram.g:567:2: ( ( rule__Clinic__Group__0 ) )
            // InternalProgram.g:568:3: ( rule__Clinic__Group__0 )
            {
             before(grammarAccess.getClinicAccess().getGroup()); 
            // InternalProgram.g:569:3: ( rule__Clinic__Group__0 )
            // InternalProgram.g:569:4: rule__Clinic__Group__0
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
    // InternalProgram.g:578:1: entryRuleLunch : ruleLunch EOF ;
    public final void entryRuleLunch() throws RecognitionException {
        try {
            // InternalProgram.g:579:1: ( ruleLunch EOF )
            // InternalProgram.g:580:1: ruleLunch EOF
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
    // InternalProgram.g:587:1: ruleLunch : ( ( rule__Lunch__Group__0 ) ) ;
    public final void ruleLunch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:591:2: ( ( ( rule__Lunch__Group__0 ) ) )
            // InternalProgram.g:592:2: ( ( rule__Lunch__Group__0 ) )
            {
            // InternalProgram.g:592:2: ( ( rule__Lunch__Group__0 ) )
            // InternalProgram.g:593:3: ( rule__Lunch__Group__0 )
            {
             before(grammarAccess.getLunchAccess().getGroup()); 
            // InternalProgram.g:594:3: ( rule__Lunch__Group__0 )
            // InternalProgram.g:594:4: rule__Lunch__Group__0
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
    // InternalProgram.g:603:1: entryRuleCoffeeBreak : ruleCoffeeBreak EOF ;
    public final void entryRuleCoffeeBreak() throws RecognitionException {
        try {
            // InternalProgram.g:604:1: ( ruleCoffeeBreak EOF )
            // InternalProgram.g:605:1: ruleCoffeeBreak EOF
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
    // InternalProgram.g:612:1: ruleCoffeeBreak : ( ( rule__CoffeeBreak__Group__0 ) ) ;
    public final void ruleCoffeeBreak() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:616:2: ( ( ( rule__CoffeeBreak__Group__0 ) ) )
            // InternalProgram.g:617:2: ( ( rule__CoffeeBreak__Group__0 ) )
            {
            // InternalProgram.g:617:2: ( ( rule__CoffeeBreak__Group__0 ) )
            // InternalProgram.g:618:3: ( rule__CoffeeBreak__Group__0 )
            {
             before(grammarAccess.getCoffeeBreakAccess().getGroup()); 
            // InternalProgram.g:619:3: ( rule__CoffeeBreak__Group__0 )
            // InternalProgram.g:619:4: rule__CoffeeBreak__Group__0
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
    // InternalProgram.g:628:1: entryRuleMeeting : ruleMeeting EOF ;
    public final void entryRuleMeeting() throws RecognitionException {
        try {
            // InternalProgram.g:629:1: ( ruleMeeting EOF )
            // InternalProgram.g:630:1: ruleMeeting EOF
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
    // InternalProgram.g:637:1: ruleMeeting : ( ( rule__Meeting__Group__0 ) ) ;
    public final void ruleMeeting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:641:2: ( ( ( rule__Meeting__Group__0 ) ) )
            // InternalProgram.g:642:2: ( ( rule__Meeting__Group__0 ) )
            {
            // InternalProgram.g:642:2: ( ( rule__Meeting__Group__0 ) )
            // InternalProgram.g:643:3: ( rule__Meeting__Group__0 )
            {
             before(grammarAccess.getMeetingAccess().getGroup()); 
            // InternalProgram.g:644:3: ( rule__Meeting__Group__0 )
            // InternalProgram.g:644:4: rule__Meeting__Group__0
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
    // InternalProgram.g:653:1: entryRuleOpening : ruleOpening EOF ;
    public final void entryRuleOpening() throws RecognitionException {
        try {
            // InternalProgram.g:654:1: ( ruleOpening EOF )
            // InternalProgram.g:655:1: ruleOpening EOF
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
    // InternalProgram.g:662:1: ruleOpening : ( ( rule__Opening__Group__0 ) ) ;
    public final void ruleOpening() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:666:2: ( ( ( rule__Opening__Group__0 ) ) )
            // InternalProgram.g:667:2: ( ( rule__Opening__Group__0 ) )
            {
            // InternalProgram.g:667:2: ( ( rule__Opening__Group__0 ) )
            // InternalProgram.g:668:3: ( rule__Opening__Group__0 )
            {
             before(grammarAccess.getOpeningAccess().getGroup()); 
            // InternalProgram.g:669:3: ( rule__Opening__Group__0 )
            // InternalProgram.g:669:4: rule__Opening__Group__0
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
    // InternalProgram.g:678:1: entryRulePaper : rulePaper EOF ;
    public final void entryRulePaper() throws RecognitionException {
        try {
            // InternalProgram.g:679:1: ( rulePaper EOF )
            // InternalProgram.g:680:1: rulePaper EOF
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
    // InternalProgram.g:687:1: rulePaper : ( ( rule__Paper__Group__0 ) ) ;
    public final void rulePaper() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:691:2: ( ( ( rule__Paper__Group__0 ) ) )
            // InternalProgram.g:692:2: ( ( rule__Paper__Group__0 ) )
            {
            // InternalProgram.g:692:2: ( ( rule__Paper__Group__0 ) )
            // InternalProgram.g:693:3: ( rule__Paper__Group__0 )
            {
             before(grammarAccess.getPaperAccess().getGroup()); 
            // InternalProgram.g:694:3: ( rule__Paper__Group__0 )
            // InternalProgram.g:694:4: rule__Paper__Group__0
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
    // InternalProgram.g:703:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalProgram.g:704:1: ( rulePerson EOF )
            // InternalProgram.g:705:1: rulePerson EOF
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
    // InternalProgram.g:712:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:716:2: ( ( ( rule__Person__Group__0 ) ) )
            // InternalProgram.g:717:2: ( ( rule__Person__Group__0 ) )
            {
            // InternalProgram.g:717:2: ( ( rule__Person__Group__0 ) )
            // InternalProgram.g:718:3: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // InternalProgram.g:719:3: ( rule__Person__Group__0 )
            // InternalProgram.g:719:4: rule__Person__Group__0
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
    // InternalProgram.g:728:1: entryRuleKind : ruleKind EOF ;
    public final void entryRuleKind() throws RecognitionException {
        try {
            // InternalProgram.g:729:1: ( ruleKind EOF )
            // InternalProgram.g:730:1: ruleKind EOF
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
    // InternalProgram.g:737:1: ruleKind : ( ( rule__Kind__Group__0 ) ) ;
    public final void ruleKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:741:2: ( ( ( rule__Kind__Group__0 ) ) )
            // InternalProgram.g:742:2: ( ( rule__Kind__Group__0 ) )
            {
            // InternalProgram.g:742:2: ( ( rule__Kind__Group__0 ) )
            // InternalProgram.g:743:3: ( rule__Kind__Group__0 )
            {
             before(grammarAccess.getKindAccess().getGroup()); 
            // InternalProgram.g:744:3: ( rule__Kind__Group__0 )
            // InternalProgram.g:744:4: rule__Kind__Group__0
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
    // InternalProgram.g:753:1: ruleWeekDay : ( ( rule__WeekDay__Alternatives ) ) ;
    public final void ruleWeekDay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:757:1: ( ( ( rule__WeekDay__Alternatives ) ) )
            // InternalProgram.g:758:2: ( ( rule__WeekDay__Alternatives ) )
            {
            // InternalProgram.g:758:2: ( ( rule__WeekDay__Alternatives ) )
            // InternalProgram.g:759:3: ( rule__WeekDay__Alternatives )
            {
             before(grammarAccess.getWeekDayAccess().getAlternatives()); 
            // InternalProgram.g:760:3: ( rule__WeekDay__Alternatives )
            // InternalProgram.g:760:4: rule__WeekDay__Alternatives
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
    // InternalProgram.g:768:1: rule__Event__Alternatives : ( ( ruleTalkSession ) | ( rulePanel ) | ( ruleWorkshop ) | ( ruleTutorial ) | ( ruleDoctoralSymposium ) | ( ruleEducatorSymposium ) | ( ruleReception ) | ( ruleClinic ) | ( ruleLunch ) | ( ruleCoffeeBreak ) | ( ruleMeeting ) | ( ruleSRC ) | ( rulePoster ) | ( ruleKeynote ) | ( ruleSponsorKeynote ) | ( ruleOpening ) );
    public final void rule__Event__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:772:1: ( ( ruleTalkSession ) | ( rulePanel ) | ( ruleWorkshop ) | ( ruleTutorial ) | ( ruleDoctoralSymposium ) | ( ruleEducatorSymposium ) | ( ruleReception ) | ( ruleClinic ) | ( ruleLunch ) | ( ruleCoffeeBreak ) | ( ruleMeeting ) | ( ruleSRC ) | ( rulePoster ) | ( ruleKeynote ) | ( ruleSponsorKeynote ) | ( ruleOpening ) )
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
            case 48:
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
            case 44:
                {
                alt1=13;
                }
                break;
            case 45:
                {
                alt1=14;
                }
                break;
            case 47:
                {
                alt1=15;
                }
                break;
            case 60:
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
                    // InternalProgram.g:773:2: ( ruleTalkSession )
                    {
                    // InternalProgram.g:773:2: ( ruleTalkSession )
                    // InternalProgram.g:774:3: ruleTalkSession
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
                    // InternalProgram.g:779:2: ( rulePanel )
                    {
                    // InternalProgram.g:779:2: ( rulePanel )
                    // InternalProgram.g:780:3: rulePanel
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
                    // InternalProgram.g:785:2: ( ruleWorkshop )
                    {
                    // InternalProgram.g:785:2: ( ruleWorkshop )
                    // InternalProgram.g:786:3: ruleWorkshop
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
                    // InternalProgram.g:791:2: ( ruleTutorial )
                    {
                    // InternalProgram.g:791:2: ( ruleTutorial )
                    // InternalProgram.g:792:3: ruleTutorial
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
                    // InternalProgram.g:797:2: ( ruleDoctoralSymposium )
                    {
                    // InternalProgram.g:797:2: ( ruleDoctoralSymposium )
                    // InternalProgram.g:798:3: ruleDoctoralSymposium
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
                    // InternalProgram.g:803:2: ( ruleEducatorSymposium )
                    {
                    // InternalProgram.g:803:2: ( ruleEducatorSymposium )
                    // InternalProgram.g:804:3: ruleEducatorSymposium
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
                    // InternalProgram.g:809:2: ( ruleReception )
                    {
                    // InternalProgram.g:809:2: ( ruleReception )
                    // InternalProgram.g:810:3: ruleReception
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
                    // InternalProgram.g:815:2: ( ruleClinic )
                    {
                    // InternalProgram.g:815:2: ( ruleClinic )
                    // InternalProgram.g:816:3: ruleClinic
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
                    // InternalProgram.g:821:2: ( ruleLunch )
                    {
                    // InternalProgram.g:821:2: ( ruleLunch )
                    // InternalProgram.g:822:3: ruleLunch
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
                    // InternalProgram.g:827:2: ( ruleCoffeeBreak )
                    {
                    // InternalProgram.g:827:2: ( ruleCoffeeBreak )
                    // InternalProgram.g:828:3: ruleCoffeeBreak
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
                    // InternalProgram.g:833:2: ( ruleMeeting )
                    {
                    // InternalProgram.g:833:2: ( ruleMeeting )
                    // InternalProgram.g:834:3: ruleMeeting
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
                    // InternalProgram.g:839:2: ( ruleSRC )
                    {
                    // InternalProgram.g:839:2: ( ruleSRC )
                    // InternalProgram.g:840:3: ruleSRC
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
                    // InternalProgram.g:845:2: ( rulePoster )
                    {
                    // InternalProgram.g:845:2: ( rulePoster )
                    // InternalProgram.g:846:3: rulePoster
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
                    // InternalProgram.g:851:2: ( ruleKeynote )
                    {
                    // InternalProgram.g:851:2: ( ruleKeynote )
                    // InternalProgram.g:852:3: ruleKeynote
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
                    // InternalProgram.g:857:2: ( ruleSponsorKeynote )
                    {
                    // InternalProgram.g:857:2: ( ruleSponsorKeynote )
                    // InternalProgram.g:858:3: ruleSponsorKeynote
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
                    // InternalProgram.g:863:2: ( ruleOpening )
                    {
                    // InternalProgram.g:863:2: ( ruleOpening )
                    // InternalProgram.g:864:3: ruleOpening
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
    // InternalProgram.g:873:1: rule__WeekDay__Alternatives : ( ( ( 'Monday' ) ) | ( ( 'Tuesday' ) ) | ( ( 'Wednesday' ) ) | ( ( 'Thursday' ) ) | ( ( 'Friday' ) ) | ( ( 'Saturday' ) ) | ( ( 'Sunday' ) ) );
    public final void rule__WeekDay__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:877:1: ( ( ( 'Monday' ) ) | ( ( 'Tuesday' ) ) | ( ( 'Wednesday' ) ) | ( ( 'Thursday' ) ) | ( ( 'Friday' ) ) | ( ( 'Saturday' ) ) | ( ( 'Sunday' ) ) )
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
                    // InternalProgram.g:878:2: ( ( 'Monday' ) )
                    {
                    // InternalProgram.g:878:2: ( ( 'Monday' ) )
                    // InternalProgram.g:879:3: ( 'Monday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getMondayEnumLiteralDeclaration_0()); 
                    // InternalProgram.g:880:3: ( 'Monday' )
                    // InternalProgram.g:880:4: 'Monday'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getMondayEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProgram.g:884:2: ( ( 'Tuesday' ) )
                    {
                    // InternalProgram.g:884:2: ( ( 'Tuesday' ) )
                    // InternalProgram.g:885:3: ( 'Tuesday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getTuesdayEnumLiteralDeclaration_1()); 
                    // InternalProgram.g:886:3: ( 'Tuesday' )
                    // InternalProgram.g:886:4: 'Tuesday'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getTuesdayEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProgram.g:890:2: ( ( 'Wednesday' ) )
                    {
                    // InternalProgram.g:890:2: ( ( 'Wednesday' ) )
                    // InternalProgram.g:891:3: ( 'Wednesday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getWednesdayEnumLiteralDeclaration_2()); 
                    // InternalProgram.g:892:3: ( 'Wednesday' )
                    // InternalProgram.g:892:4: 'Wednesday'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getWednesdayEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalProgram.g:896:2: ( ( 'Thursday' ) )
                    {
                    // InternalProgram.g:896:2: ( ( 'Thursday' ) )
                    // InternalProgram.g:897:3: ( 'Thursday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getThursdayEnumLiteralDeclaration_3()); 
                    // InternalProgram.g:898:3: ( 'Thursday' )
                    // InternalProgram.g:898:4: 'Thursday'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getThursdayEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalProgram.g:902:2: ( ( 'Friday' ) )
                    {
                    // InternalProgram.g:902:2: ( ( 'Friday' ) )
                    // InternalProgram.g:903:3: ( 'Friday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getFridayEnumLiteralDeclaration_4()); 
                    // InternalProgram.g:904:3: ( 'Friday' )
                    // InternalProgram.g:904:4: 'Friday'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getFridayEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalProgram.g:908:2: ( ( 'Saturday' ) )
                    {
                    // InternalProgram.g:908:2: ( ( 'Saturday' ) )
                    // InternalProgram.g:909:3: ( 'Saturday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getSaturdayEnumLiteralDeclaration_5()); 
                    // InternalProgram.g:910:3: ( 'Saturday' )
                    // InternalProgram.g:910:4: 'Saturday'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getSaturdayEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalProgram.g:914:2: ( ( 'Sunday' ) )
                    {
                    // InternalProgram.g:914:2: ( ( 'Sunday' ) )
                    // InternalProgram.g:915:3: ( 'Sunday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getSundayEnumLiteralDeclaration_6()); 
                    // InternalProgram.g:916:3: ( 'Sunday' )
                    // InternalProgram.g:916:4: 'Sunday'
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
    // InternalProgram.g:924:1: rule__Conference__Group__0 : rule__Conference__Group__0__Impl rule__Conference__Group__1 ;
    public final void rule__Conference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:928:1: ( rule__Conference__Group__0__Impl rule__Conference__Group__1 )
            // InternalProgram.g:929:2: rule__Conference__Group__0__Impl rule__Conference__Group__1
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
    // InternalProgram.g:936:1: rule__Conference__Group__0__Impl : ( () ) ;
    public final void rule__Conference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:940:1: ( ( () ) )
            // InternalProgram.g:941:1: ( () )
            {
            // InternalProgram.g:941:1: ( () )
            // InternalProgram.g:942:2: ()
            {
             before(grammarAccess.getConferenceAccess().getConferenceAction_0()); 
            // InternalProgram.g:943:2: ()
            // InternalProgram.g:943:3: 
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
    // InternalProgram.g:951:1: rule__Conference__Group__1 : rule__Conference__Group__1__Impl rule__Conference__Group__2 ;
    public final void rule__Conference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:955:1: ( rule__Conference__Group__1__Impl rule__Conference__Group__2 )
            // InternalProgram.g:956:2: rule__Conference__Group__1__Impl rule__Conference__Group__2
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
    // InternalProgram.g:963:1: rule__Conference__Group__1__Impl : ( 'Conference' ) ;
    public final void rule__Conference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:967:1: ( ( 'Conference' ) )
            // InternalProgram.g:968:1: ( 'Conference' )
            {
            // InternalProgram.g:968:1: ( 'Conference' )
            // InternalProgram.g:969:2: 'Conference'
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
    // InternalProgram.g:978:1: rule__Conference__Group__2 : rule__Conference__Group__2__Impl rule__Conference__Group__3 ;
    public final void rule__Conference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:982:1: ( rule__Conference__Group__2__Impl rule__Conference__Group__3 )
            // InternalProgram.g:983:2: rule__Conference__Group__2__Impl rule__Conference__Group__3
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
    // InternalProgram.g:990:1: rule__Conference__Group__2__Impl : ( ( rule__Conference__NameAssignment_2 ) ) ;
    public final void rule__Conference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:994:1: ( ( ( rule__Conference__NameAssignment_2 ) ) )
            // InternalProgram.g:995:1: ( ( rule__Conference__NameAssignment_2 ) )
            {
            // InternalProgram.g:995:1: ( ( rule__Conference__NameAssignment_2 ) )
            // InternalProgram.g:996:2: ( rule__Conference__NameAssignment_2 )
            {
             before(grammarAccess.getConferenceAccess().getNameAssignment_2()); 
            // InternalProgram.g:997:2: ( rule__Conference__NameAssignment_2 )
            // InternalProgram.g:997:3: rule__Conference__NameAssignment_2
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
    // InternalProgram.g:1005:1: rule__Conference__Group__3 : rule__Conference__Group__3__Impl rule__Conference__Group__4 ;
    public final void rule__Conference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1009:1: ( rule__Conference__Group__3__Impl rule__Conference__Group__4 )
            // InternalProgram.g:1010:2: rule__Conference__Group__3__Impl rule__Conference__Group__4
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
    // InternalProgram.g:1017:1: rule__Conference__Group__3__Impl : ( 'talk duration' ) ;
    public final void rule__Conference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1021:1: ( ( 'talk duration' ) )
            // InternalProgram.g:1022:1: ( 'talk duration' )
            {
            // InternalProgram.g:1022:1: ( 'talk duration' )
            // InternalProgram.g:1023:2: 'talk duration'
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
    // InternalProgram.g:1032:1: rule__Conference__Group__4 : rule__Conference__Group__4__Impl rule__Conference__Group__5 ;
    public final void rule__Conference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1036:1: ( rule__Conference__Group__4__Impl rule__Conference__Group__5 )
            // InternalProgram.g:1037:2: rule__Conference__Group__4__Impl rule__Conference__Group__5
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
    // InternalProgram.g:1044:1: rule__Conference__Group__4__Impl : ( ( rule__Conference__TalkDurationAssignment_4 ) ) ;
    public final void rule__Conference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1048:1: ( ( ( rule__Conference__TalkDurationAssignment_4 ) ) )
            // InternalProgram.g:1049:1: ( ( rule__Conference__TalkDurationAssignment_4 ) )
            {
            // InternalProgram.g:1049:1: ( ( rule__Conference__TalkDurationAssignment_4 ) )
            // InternalProgram.g:1050:2: ( rule__Conference__TalkDurationAssignment_4 )
            {
             before(grammarAccess.getConferenceAccess().getTalkDurationAssignment_4()); 
            // InternalProgram.g:1051:2: ( rule__Conference__TalkDurationAssignment_4 )
            // InternalProgram.g:1051:3: rule__Conference__TalkDurationAssignment_4
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
    // InternalProgram.g:1059:1: rule__Conference__Group__5 : rule__Conference__Group__5__Impl rule__Conference__Group__6 ;
    public final void rule__Conference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1063:1: ( rule__Conference__Group__5__Impl rule__Conference__Group__6 )
            // InternalProgram.g:1064:2: rule__Conference__Group__5__Impl rule__Conference__Group__6
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
    // InternalProgram.g:1071:1: rule__Conference__Group__5__Impl : ( ( rule__Conference__Group_5__0 )? ) ;
    public final void rule__Conference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1075:1: ( ( ( rule__Conference__Group_5__0 )? ) )
            // InternalProgram.g:1076:1: ( ( rule__Conference__Group_5__0 )? )
            {
            // InternalProgram.g:1076:1: ( ( rule__Conference__Group_5__0 )? )
            // InternalProgram.g:1077:2: ( rule__Conference__Group_5__0 )?
            {
             before(grammarAccess.getConferenceAccess().getGroup_5()); 
            // InternalProgram.g:1078:2: ( rule__Conference__Group_5__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalProgram.g:1078:3: rule__Conference__Group_5__0
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
    // InternalProgram.g:1086:1: rule__Conference__Group__6 : rule__Conference__Group__6__Impl rule__Conference__Group__7 ;
    public final void rule__Conference__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1090:1: ( rule__Conference__Group__6__Impl rule__Conference__Group__7 )
            // InternalProgram.g:1091:2: rule__Conference__Group__6__Impl rule__Conference__Group__7
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
    // InternalProgram.g:1098:1: rule__Conference__Group__6__Impl : ( ( rule__Conference__Group_6__0 )? ) ;
    public final void rule__Conference__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1102:1: ( ( ( rule__Conference__Group_6__0 )? ) )
            // InternalProgram.g:1103:1: ( ( rule__Conference__Group_6__0 )? )
            {
            // InternalProgram.g:1103:1: ( ( rule__Conference__Group_6__0 )? )
            // InternalProgram.g:1104:2: ( rule__Conference__Group_6__0 )?
            {
             before(grammarAccess.getConferenceAccess().getGroup_6()); 
            // InternalProgram.g:1105:2: ( rule__Conference__Group_6__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalProgram.g:1105:3: rule__Conference__Group_6__0
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
    // InternalProgram.g:1113:1: rule__Conference__Group__7 : rule__Conference__Group__7__Impl rule__Conference__Group__8 ;
    public final void rule__Conference__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1117:1: ( rule__Conference__Group__7__Impl rule__Conference__Group__8 )
            // InternalProgram.g:1118:2: rule__Conference__Group__7__Impl rule__Conference__Group__8
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
    // InternalProgram.g:1125:1: rule__Conference__Group__7__Impl : ( ( rule__Conference__Group_7__0 )? ) ;
    public final void rule__Conference__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1129:1: ( ( ( rule__Conference__Group_7__0 )? ) )
            // InternalProgram.g:1130:1: ( ( rule__Conference__Group_7__0 )? )
            {
            // InternalProgram.g:1130:1: ( ( rule__Conference__Group_7__0 )? )
            // InternalProgram.g:1131:2: ( rule__Conference__Group_7__0 )?
            {
             before(grammarAccess.getConferenceAccess().getGroup_7()); 
            // InternalProgram.g:1132:2: ( rule__Conference__Group_7__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalProgram.g:1132:3: rule__Conference__Group_7__0
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
    // InternalProgram.g:1140:1: rule__Conference__Group__8 : rule__Conference__Group__8__Impl rule__Conference__Group__9 ;
    public final void rule__Conference__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1144:1: ( rule__Conference__Group__8__Impl rule__Conference__Group__9 )
            // InternalProgram.g:1145:2: rule__Conference__Group__8__Impl rule__Conference__Group__9
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
    // InternalProgram.g:1152:1: rule__Conference__Group__8__Impl : ( ( rule__Conference__Group_8__0 )? ) ;
    public final void rule__Conference__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1156:1: ( ( ( rule__Conference__Group_8__0 )? ) )
            // InternalProgram.g:1157:1: ( ( rule__Conference__Group_8__0 )? )
            {
            // InternalProgram.g:1157:1: ( ( rule__Conference__Group_8__0 )? )
            // InternalProgram.g:1158:2: ( rule__Conference__Group_8__0 )?
            {
             before(grammarAccess.getConferenceAccess().getGroup_8()); 
            // InternalProgram.g:1159:2: ( rule__Conference__Group_8__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalProgram.g:1159:3: rule__Conference__Group_8__0
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
    // InternalProgram.g:1167:1: rule__Conference__Group__9 : rule__Conference__Group__9__Impl ;
    public final void rule__Conference__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1171:1: ( rule__Conference__Group__9__Impl )
            // InternalProgram.g:1172:2: rule__Conference__Group__9__Impl
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
    // InternalProgram.g:1178:1: rule__Conference__Group__9__Impl : ( ( rule__Conference__Group_9__0 )? ) ;
    public final void rule__Conference__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1182:1: ( ( ( rule__Conference__Group_9__0 )? ) )
            // InternalProgram.g:1183:1: ( ( rule__Conference__Group_9__0 )? )
            {
            // InternalProgram.g:1183:1: ( ( rule__Conference__Group_9__0 )? )
            // InternalProgram.g:1184:2: ( rule__Conference__Group_9__0 )?
            {
             before(grammarAccess.getConferenceAccess().getGroup_9()); 
            // InternalProgram.g:1185:2: ( rule__Conference__Group_9__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalProgram.g:1185:3: rule__Conference__Group_9__0
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
    // InternalProgram.g:1194:1: rule__Conference__Group_5__0 : rule__Conference__Group_5__0__Impl rule__Conference__Group_5__1 ;
    public final void rule__Conference__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1198:1: ( rule__Conference__Group_5__0__Impl rule__Conference__Group_5__1 )
            // InternalProgram.g:1199:2: rule__Conference__Group_5__0__Impl rule__Conference__Group_5__1
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
    // InternalProgram.g:1206:1: rule__Conference__Group_5__0__Impl : ( 'kinds' ) ;
    public final void rule__Conference__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1210:1: ( ( 'kinds' ) )
            // InternalProgram.g:1211:1: ( 'kinds' )
            {
            // InternalProgram.g:1211:1: ( 'kinds' )
            // InternalProgram.g:1212:2: 'kinds'
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
    // InternalProgram.g:1221:1: rule__Conference__Group_5__1 : rule__Conference__Group_5__1__Impl rule__Conference__Group_5__2 ;
    public final void rule__Conference__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1225:1: ( rule__Conference__Group_5__1__Impl rule__Conference__Group_5__2 )
            // InternalProgram.g:1226:2: rule__Conference__Group_5__1__Impl rule__Conference__Group_5__2
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
    // InternalProgram.g:1233:1: rule__Conference__Group_5__1__Impl : ( ( rule__Conference__KindsAssignment_5_1 ) ) ;
    public final void rule__Conference__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1237:1: ( ( ( rule__Conference__KindsAssignment_5_1 ) ) )
            // InternalProgram.g:1238:1: ( ( rule__Conference__KindsAssignment_5_1 ) )
            {
            // InternalProgram.g:1238:1: ( ( rule__Conference__KindsAssignment_5_1 ) )
            // InternalProgram.g:1239:2: ( rule__Conference__KindsAssignment_5_1 )
            {
             before(grammarAccess.getConferenceAccess().getKindsAssignment_5_1()); 
            // InternalProgram.g:1240:2: ( rule__Conference__KindsAssignment_5_1 )
            // InternalProgram.g:1240:3: rule__Conference__KindsAssignment_5_1
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
    // InternalProgram.g:1248:1: rule__Conference__Group_5__2 : rule__Conference__Group_5__2__Impl ;
    public final void rule__Conference__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1252:1: ( rule__Conference__Group_5__2__Impl )
            // InternalProgram.g:1253:2: rule__Conference__Group_5__2__Impl
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
    // InternalProgram.g:1259:1: rule__Conference__Group_5__2__Impl : ( ( rule__Conference__Group_5_2__0 )* ) ;
    public final void rule__Conference__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1263:1: ( ( ( rule__Conference__Group_5_2__0 )* ) )
            // InternalProgram.g:1264:1: ( ( rule__Conference__Group_5_2__0 )* )
            {
            // InternalProgram.g:1264:1: ( ( rule__Conference__Group_5_2__0 )* )
            // InternalProgram.g:1265:2: ( rule__Conference__Group_5_2__0 )*
            {
             before(grammarAccess.getConferenceAccess().getGroup_5_2()); 
            // InternalProgram.g:1266:2: ( rule__Conference__Group_5_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalProgram.g:1266:3: rule__Conference__Group_5_2__0
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
    // InternalProgram.g:1275:1: rule__Conference__Group_5_2__0 : rule__Conference__Group_5_2__0__Impl rule__Conference__Group_5_2__1 ;
    public final void rule__Conference__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1279:1: ( rule__Conference__Group_5_2__0__Impl rule__Conference__Group_5_2__1 )
            // InternalProgram.g:1280:2: rule__Conference__Group_5_2__0__Impl rule__Conference__Group_5_2__1
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
    // InternalProgram.g:1287:1: rule__Conference__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Conference__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1291:1: ( ( ',' ) )
            // InternalProgram.g:1292:1: ( ',' )
            {
            // InternalProgram.g:1292:1: ( ',' )
            // InternalProgram.g:1293:2: ','
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
    // InternalProgram.g:1302:1: rule__Conference__Group_5_2__1 : rule__Conference__Group_5_2__1__Impl ;
    public final void rule__Conference__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1306:1: ( rule__Conference__Group_5_2__1__Impl )
            // InternalProgram.g:1307:2: rule__Conference__Group_5_2__1__Impl
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
    // InternalProgram.g:1313:1: rule__Conference__Group_5_2__1__Impl : ( ( rule__Conference__KindsAssignment_5_2_1 ) ) ;
    public final void rule__Conference__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1317:1: ( ( ( rule__Conference__KindsAssignment_5_2_1 ) ) )
            // InternalProgram.g:1318:1: ( ( rule__Conference__KindsAssignment_5_2_1 ) )
            {
            // InternalProgram.g:1318:1: ( ( rule__Conference__KindsAssignment_5_2_1 ) )
            // InternalProgram.g:1319:2: ( rule__Conference__KindsAssignment_5_2_1 )
            {
             before(grammarAccess.getConferenceAccess().getKindsAssignment_5_2_1()); 
            // InternalProgram.g:1320:2: ( rule__Conference__KindsAssignment_5_2_1 )
            // InternalProgram.g:1320:3: rule__Conference__KindsAssignment_5_2_1
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
    // InternalProgram.g:1329:1: rule__Conference__Group_6__0 : rule__Conference__Group_6__0__Impl rule__Conference__Group_6__1 ;
    public final void rule__Conference__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1333:1: ( rule__Conference__Group_6__0__Impl rule__Conference__Group_6__1 )
            // InternalProgram.g:1334:2: rule__Conference__Group_6__0__Impl rule__Conference__Group_6__1
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
    // InternalProgram.g:1341:1: rule__Conference__Group_6__0__Impl : ( 'resources' ) ;
    public final void rule__Conference__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1345:1: ( ( 'resources' ) )
            // InternalProgram.g:1346:1: ( 'resources' )
            {
            // InternalProgram.g:1346:1: ( 'resources' )
            // InternalProgram.g:1347:2: 'resources'
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
    // InternalProgram.g:1356:1: rule__Conference__Group_6__1 : rule__Conference__Group_6__1__Impl rule__Conference__Group_6__2 ;
    public final void rule__Conference__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1360:1: ( rule__Conference__Group_6__1__Impl rule__Conference__Group_6__2 )
            // InternalProgram.g:1361:2: rule__Conference__Group_6__1__Impl rule__Conference__Group_6__2
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
    // InternalProgram.g:1368:1: rule__Conference__Group_6__1__Impl : ( ( rule__Conference__ResourcesAssignment_6_1 ) ) ;
    public final void rule__Conference__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1372:1: ( ( ( rule__Conference__ResourcesAssignment_6_1 ) ) )
            // InternalProgram.g:1373:1: ( ( rule__Conference__ResourcesAssignment_6_1 ) )
            {
            // InternalProgram.g:1373:1: ( ( rule__Conference__ResourcesAssignment_6_1 ) )
            // InternalProgram.g:1374:2: ( rule__Conference__ResourcesAssignment_6_1 )
            {
             before(grammarAccess.getConferenceAccess().getResourcesAssignment_6_1()); 
            // InternalProgram.g:1375:2: ( rule__Conference__ResourcesAssignment_6_1 )
            // InternalProgram.g:1375:3: rule__Conference__ResourcesAssignment_6_1
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
    // InternalProgram.g:1383:1: rule__Conference__Group_6__2 : rule__Conference__Group_6__2__Impl ;
    public final void rule__Conference__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1387:1: ( rule__Conference__Group_6__2__Impl )
            // InternalProgram.g:1388:2: rule__Conference__Group_6__2__Impl
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
    // InternalProgram.g:1394:1: rule__Conference__Group_6__2__Impl : ( ( rule__Conference__ResourcesAssignment_6_2 )* ) ;
    public final void rule__Conference__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1398:1: ( ( ( rule__Conference__ResourcesAssignment_6_2 )* ) )
            // InternalProgram.g:1399:1: ( ( rule__Conference__ResourcesAssignment_6_2 )* )
            {
            // InternalProgram.g:1399:1: ( ( rule__Conference__ResourcesAssignment_6_2 )* )
            // InternalProgram.g:1400:2: ( rule__Conference__ResourcesAssignment_6_2 )*
            {
             before(grammarAccess.getConferenceAccess().getResourcesAssignment_6_2()); 
            // InternalProgram.g:1401:2: ( rule__Conference__ResourcesAssignment_6_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalProgram.g:1401:3: rule__Conference__ResourcesAssignment_6_2
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
    // InternalProgram.g:1410:1: rule__Conference__Group_7__0 : rule__Conference__Group_7__0__Impl rule__Conference__Group_7__1 ;
    public final void rule__Conference__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1414:1: ( rule__Conference__Group_7__0__Impl rule__Conference__Group_7__1 )
            // InternalProgram.g:1415:2: rule__Conference__Group_7__0__Impl rule__Conference__Group_7__1
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
    // InternalProgram.g:1422:1: rule__Conference__Group_7__0__Impl : ( 'papers' ) ;
    public final void rule__Conference__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1426:1: ( ( 'papers' ) )
            // InternalProgram.g:1427:1: ( 'papers' )
            {
            // InternalProgram.g:1427:1: ( 'papers' )
            // InternalProgram.g:1428:2: 'papers'
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
    // InternalProgram.g:1437:1: rule__Conference__Group_7__1 : rule__Conference__Group_7__1__Impl rule__Conference__Group_7__2 ;
    public final void rule__Conference__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1441:1: ( rule__Conference__Group_7__1__Impl rule__Conference__Group_7__2 )
            // InternalProgram.g:1442:2: rule__Conference__Group_7__1__Impl rule__Conference__Group_7__2
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
    // InternalProgram.g:1449:1: rule__Conference__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Conference__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1453:1: ( ( '{' ) )
            // InternalProgram.g:1454:1: ( '{' )
            {
            // InternalProgram.g:1454:1: ( '{' )
            // InternalProgram.g:1455:2: '{'
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
    // InternalProgram.g:1464:1: rule__Conference__Group_7__2 : rule__Conference__Group_7__2__Impl rule__Conference__Group_7__3 ;
    public final void rule__Conference__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1468:1: ( rule__Conference__Group_7__2__Impl rule__Conference__Group_7__3 )
            // InternalProgram.g:1469:2: rule__Conference__Group_7__2__Impl rule__Conference__Group_7__3
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
    // InternalProgram.g:1476:1: rule__Conference__Group_7__2__Impl : ( ( rule__Conference__PapersAssignment_7_2 ) ) ;
    public final void rule__Conference__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1480:1: ( ( ( rule__Conference__PapersAssignment_7_2 ) ) )
            // InternalProgram.g:1481:1: ( ( rule__Conference__PapersAssignment_7_2 ) )
            {
            // InternalProgram.g:1481:1: ( ( rule__Conference__PapersAssignment_7_2 ) )
            // InternalProgram.g:1482:2: ( rule__Conference__PapersAssignment_7_2 )
            {
             before(grammarAccess.getConferenceAccess().getPapersAssignment_7_2()); 
            // InternalProgram.g:1483:2: ( rule__Conference__PapersAssignment_7_2 )
            // InternalProgram.g:1483:3: rule__Conference__PapersAssignment_7_2
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
    // InternalProgram.g:1491:1: rule__Conference__Group_7__3 : rule__Conference__Group_7__3__Impl rule__Conference__Group_7__4 ;
    public final void rule__Conference__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1495:1: ( rule__Conference__Group_7__3__Impl rule__Conference__Group_7__4 )
            // InternalProgram.g:1496:2: rule__Conference__Group_7__3__Impl rule__Conference__Group_7__4
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
    // InternalProgram.g:1503:1: rule__Conference__Group_7__3__Impl : ( ( rule__Conference__Group_7_3__0 )* ) ;
    public final void rule__Conference__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1507:1: ( ( ( rule__Conference__Group_7_3__0 )* ) )
            // InternalProgram.g:1508:1: ( ( rule__Conference__Group_7_3__0 )* )
            {
            // InternalProgram.g:1508:1: ( ( rule__Conference__Group_7_3__0 )* )
            // InternalProgram.g:1509:2: ( rule__Conference__Group_7_3__0 )*
            {
             before(grammarAccess.getConferenceAccess().getGroup_7_3()); 
            // InternalProgram.g:1510:2: ( rule__Conference__Group_7_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalProgram.g:1510:3: rule__Conference__Group_7_3__0
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
    // InternalProgram.g:1518:1: rule__Conference__Group_7__4 : rule__Conference__Group_7__4__Impl ;
    public final void rule__Conference__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1522:1: ( rule__Conference__Group_7__4__Impl )
            // InternalProgram.g:1523:2: rule__Conference__Group_7__4__Impl
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
    // InternalProgram.g:1529:1: rule__Conference__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Conference__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1533:1: ( ( '}' ) )
            // InternalProgram.g:1534:1: ( '}' )
            {
            // InternalProgram.g:1534:1: ( '}' )
            // InternalProgram.g:1535:2: '}'
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
    // InternalProgram.g:1545:1: rule__Conference__Group_7_3__0 : rule__Conference__Group_7_3__0__Impl rule__Conference__Group_7_3__1 ;
    public final void rule__Conference__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1549:1: ( rule__Conference__Group_7_3__0__Impl rule__Conference__Group_7_3__1 )
            // InternalProgram.g:1550:2: rule__Conference__Group_7_3__0__Impl rule__Conference__Group_7_3__1
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
    // InternalProgram.g:1557:1: rule__Conference__Group_7_3__0__Impl : ( ';' ) ;
    public final void rule__Conference__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1561:1: ( ( ';' ) )
            // InternalProgram.g:1562:1: ( ';' )
            {
            // InternalProgram.g:1562:1: ( ';' )
            // InternalProgram.g:1563:2: ';'
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
    // InternalProgram.g:1572:1: rule__Conference__Group_7_3__1 : rule__Conference__Group_7_3__1__Impl ;
    public final void rule__Conference__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1576:1: ( rule__Conference__Group_7_3__1__Impl )
            // InternalProgram.g:1577:2: rule__Conference__Group_7_3__1__Impl
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
    // InternalProgram.g:1583:1: rule__Conference__Group_7_3__1__Impl : ( ( rule__Conference__PapersAssignment_7_3_1 ) ) ;
    public final void rule__Conference__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1587:1: ( ( ( rule__Conference__PapersAssignment_7_3_1 ) ) )
            // InternalProgram.g:1588:1: ( ( rule__Conference__PapersAssignment_7_3_1 ) )
            {
            // InternalProgram.g:1588:1: ( ( rule__Conference__PapersAssignment_7_3_1 ) )
            // InternalProgram.g:1589:2: ( rule__Conference__PapersAssignment_7_3_1 )
            {
             before(grammarAccess.getConferenceAccess().getPapersAssignment_7_3_1()); 
            // InternalProgram.g:1590:2: ( rule__Conference__PapersAssignment_7_3_1 )
            // InternalProgram.g:1590:3: rule__Conference__PapersAssignment_7_3_1
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
    // InternalProgram.g:1599:1: rule__Conference__Group_8__0 : rule__Conference__Group_8__0__Impl rule__Conference__Group_8__1 ;
    public final void rule__Conference__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1603:1: ( rule__Conference__Group_8__0__Impl rule__Conference__Group_8__1 )
            // InternalProgram.g:1604:2: rule__Conference__Group_8__0__Impl rule__Conference__Group_8__1
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
    // InternalProgram.g:1611:1: rule__Conference__Group_8__0__Impl : ( 'events' ) ;
    public final void rule__Conference__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1615:1: ( ( 'events' ) )
            // InternalProgram.g:1616:1: ( 'events' )
            {
            // InternalProgram.g:1616:1: ( 'events' )
            // InternalProgram.g:1617:2: 'events'
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
    // InternalProgram.g:1626:1: rule__Conference__Group_8__1 : rule__Conference__Group_8__1__Impl rule__Conference__Group_8__2 ;
    public final void rule__Conference__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1630:1: ( rule__Conference__Group_8__1__Impl rule__Conference__Group_8__2 )
            // InternalProgram.g:1631:2: rule__Conference__Group_8__1__Impl rule__Conference__Group_8__2
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
    // InternalProgram.g:1638:1: rule__Conference__Group_8__1__Impl : ( '{' ) ;
    public final void rule__Conference__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1642:1: ( ( '{' ) )
            // InternalProgram.g:1643:1: ( '{' )
            {
            // InternalProgram.g:1643:1: ( '{' )
            // InternalProgram.g:1644:2: '{'
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
    // InternalProgram.g:1653:1: rule__Conference__Group_8__2 : rule__Conference__Group_8__2__Impl rule__Conference__Group_8__3 ;
    public final void rule__Conference__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1657:1: ( rule__Conference__Group_8__2__Impl rule__Conference__Group_8__3 )
            // InternalProgram.g:1658:2: rule__Conference__Group_8__2__Impl rule__Conference__Group_8__3
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
    // InternalProgram.g:1665:1: rule__Conference__Group_8__2__Impl : ( ( rule__Conference__EventsAssignment_8_2 ) ) ;
    public final void rule__Conference__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1669:1: ( ( ( rule__Conference__EventsAssignment_8_2 ) ) )
            // InternalProgram.g:1670:1: ( ( rule__Conference__EventsAssignment_8_2 ) )
            {
            // InternalProgram.g:1670:1: ( ( rule__Conference__EventsAssignment_8_2 ) )
            // InternalProgram.g:1671:2: ( rule__Conference__EventsAssignment_8_2 )
            {
             before(grammarAccess.getConferenceAccess().getEventsAssignment_8_2()); 
            // InternalProgram.g:1672:2: ( rule__Conference__EventsAssignment_8_2 )
            // InternalProgram.g:1672:3: rule__Conference__EventsAssignment_8_2
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
    // InternalProgram.g:1680:1: rule__Conference__Group_8__3 : rule__Conference__Group_8__3__Impl rule__Conference__Group_8__4 ;
    public final void rule__Conference__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1684:1: ( rule__Conference__Group_8__3__Impl rule__Conference__Group_8__4 )
            // InternalProgram.g:1685:2: rule__Conference__Group_8__3__Impl rule__Conference__Group_8__4
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
    // InternalProgram.g:1692:1: rule__Conference__Group_8__3__Impl : ( ( rule__Conference__Group_8_3__0 )* ) ;
    public final void rule__Conference__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1696:1: ( ( ( rule__Conference__Group_8_3__0 )* ) )
            // InternalProgram.g:1697:1: ( ( rule__Conference__Group_8_3__0 )* )
            {
            // InternalProgram.g:1697:1: ( ( rule__Conference__Group_8_3__0 )* )
            // InternalProgram.g:1698:2: ( rule__Conference__Group_8_3__0 )*
            {
             before(grammarAccess.getConferenceAccess().getGroup_8_3()); 
            // InternalProgram.g:1699:2: ( rule__Conference__Group_8_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalProgram.g:1699:3: rule__Conference__Group_8_3__0
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
    // InternalProgram.g:1707:1: rule__Conference__Group_8__4 : rule__Conference__Group_8__4__Impl ;
    public final void rule__Conference__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1711:1: ( rule__Conference__Group_8__4__Impl )
            // InternalProgram.g:1712:2: rule__Conference__Group_8__4__Impl
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
    // InternalProgram.g:1718:1: rule__Conference__Group_8__4__Impl : ( '}' ) ;
    public final void rule__Conference__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1722:1: ( ( '}' ) )
            // InternalProgram.g:1723:1: ( '}' )
            {
            // InternalProgram.g:1723:1: ( '}' )
            // InternalProgram.g:1724:2: '}'
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
    // InternalProgram.g:1734:1: rule__Conference__Group_8_3__0 : rule__Conference__Group_8_3__0__Impl rule__Conference__Group_8_3__1 ;
    public final void rule__Conference__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1738:1: ( rule__Conference__Group_8_3__0__Impl rule__Conference__Group_8_3__1 )
            // InternalProgram.g:1739:2: rule__Conference__Group_8_3__0__Impl rule__Conference__Group_8_3__1
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
    // InternalProgram.g:1746:1: rule__Conference__Group_8_3__0__Impl : ( ';' ) ;
    public final void rule__Conference__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1750:1: ( ( ';' ) )
            // InternalProgram.g:1751:1: ( ';' )
            {
            // InternalProgram.g:1751:1: ( ';' )
            // InternalProgram.g:1752:2: ';'
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
    // InternalProgram.g:1761:1: rule__Conference__Group_8_3__1 : rule__Conference__Group_8_3__1__Impl ;
    public final void rule__Conference__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1765:1: ( rule__Conference__Group_8_3__1__Impl )
            // InternalProgram.g:1766:2: rule__Conference__Group_8_3__1__Impl
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
    // InternalProgram.g:1772:1: rule__Conference__Group_8_3__1__Impl : ( ( rule__Conference__EventsAssignment_8_3_1 ) ) ;
    public final void rule__Conference__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1776:1: ( ( ( rule__Conference__EventsAssignment_8_3_1 ) ) )
            // InternalProgram.g:1777:1: ( ( rule__Conference__EventsAssignment_8_3_1 ) )
            {
            // InternalProgram.g:1777:1: ( ( rule__Conference__EventsAssignment_8_3_1 ) )
            // InternalProgram.g:1778:2: ( rule__Conference__EventsAssignment_8_3_1 )
            {
             before(grammarAccess.getConferenceAccess().getEventsAssignment_8_3_1()); 
            // InternalProgram.g:1779:2: ( rule__Conference__EventsAssignment_8_3_1 )
            // InternalProgram.g:1779:3: rule__Conference__EventsAssignment_8_3_1
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
    // InternalProgram.g:1788:1: rule__Conference__Group_9__0 : rule__Conference__Group_9__0__Impl rule__Conference__Group_9__1 ;
    public final void rule__Conference__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1792:1: ( rule__Conference__Group_9__0__Impl rule__Conference__Group_9__1 )
            // InternalProgram.g:1793:2: rule__Conference__Group_9__0__Impl rule__Conference__Group_9__1
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
    // InternalProgram.g:1800:1: rule__Conference__Group_9__0__Impl : ( 'program' ) ;
    public final void rule__Conference__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1804:1: ( ( 'program' ) )
            // InternalProgram.g:1805:1: ( 'program' )
            {
            // InternalProgram.g:1805:1: ( 'program' )
            // InternalProgram.g:1806:2: 'program'
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
    // InternalProgram.g:1815:1: rule__Conference__Group_9__1 : rule__Conference__Group_9__1__Impl ;
    public final void rule__Conference__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1819:1: ( rule__Conference__Group_9__1__Impl )
            // InternalProgram.g:1820:2: rule__Conference__Group_9__1__Impl
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
    // InternalProgram.g:1826:1: rule__Conference__Group_9__1__Impl : ( ( rule__Conference__ProgramAssignment_9_1 ) ) ;
    public final void rule__Conference__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1830:1: ( ( ( rule__Conference__ProgramAssignment_9_1 ) ) )
            // InternalProgram.g:1831:1: ( ( rule__Conference__ProgramAssignment_9_1 ) )
            {
            // InternalProgram.g:1831:1: ( ( rule__Conference__ProgramAssignment_9_1 ) )
            // InternalProgram.g:1832:2: ( rule__Conference__ProgramAssignment_9_1 )
            {
             before(grammarAccess.getConferenceAccess().getProgramAssignment_9_1()); 
            // InternalProgram.g:1833:2: ( rule__Conference__ProgramAssignment_9_1 )
            // InternalProgram.g:1833:3: rule__Conference__ProgramAssignment_9_1
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
    // InternalProgram.g:1842:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1846:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalProgram.g:1847:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalProgram.g:1854:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1858:1: ( ( () ) )
            // InternalProgram.g:1859:1: ( () )
            {
            // InternalProgram.g:1859:1: ( () )
            // InternalProgram.g:1860:2: ()
            {
             before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            // InternalProgram.g:1861:2: ()
            // InternalProgram.g:1861:3: 
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
    // InternalProgram.g:1869:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1873:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalProgram.g:1874:2: rule__Program__Group__1__Impl rule__Program__Group__2
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
    // InternalProgram.g:1881:1: rule__Program__Group__1__Impl : ( '{' ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1885:1: ( ( '{' ) )
            // InternalProgram.g:1886:1: ( '{' )
            {
            // InternalProgram.g:1886:1: ( '{' )
            // InternalProgram.g:1887:2: '{'
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
    // InternalProgram.g:1896:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1900:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalProgram.g:1901:2: rule__Program__Group__2__Impl rule__Program__Group__3
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
    // InternalProgram.g:1908:1: rule__Program__Group__2__Impl : ( ( rule__Program__Group_2__0 )? ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1912:1: ( ( ( rule__Program__Group_2__0 )? ) )
            // InternalProgram.g:1913:1: ( ( rule__Program__Group_2__0 )? )
            {
            // InternalProgram.g:1913:1: ( ( rule__Program__Group_2__0 )? )
            // InternalProgram.g:1914:2: ( rule__Program__Group_2__0 )?
            {
             before(grammarAccess.getProgramAccess().getGroup_2()); 
            // InternalProgram.g:1915:2: ( rule__Program__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=11 && LA12_0<=17)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalProgram.g:1915:3: rule__Program__Group_2__0
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
    // InternalProgram.g:1923:1: rule__Program__Group__3 : rule__Program__Group__3__Impl ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1927:1: ( rule__Program__Group__3__Impl )
            // InternalProgram.g:1928:2: rule__Program__Group__3__Impl
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
    // InternalProgram.g:1934:1: rule__Program__Group__3__Impl : ( '}' ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1938:1: ( ( '}' ) )
            // InternalProgram.g:1939:1: ( '}' )
            {
            // InternalProgram.g:1939:1: ( '}' )
            // InternalProgram.g:1940:2: '}'
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
    // InternalProgram.g:1950:1: rule__Program__Group_2__0 : rule__Program__Group_2__0__Impl rule__Program__Group_2__1 ;
    public final void rule__Program__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1954:1: ( rule__Program__Group_2__0__Impl rule__Program__Group_2__1 )
            // InternalProgram.g:1955:2: rule__Program__Group_2__0__Impl rule__Program__Group_2__1
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
    // InternalProgram.g:1962:1: rule__Program__Group_2__0__Impl : ( ( rule__Program__DaysAssignment_2_0 ) ) ;
    public final void rule__Program__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1966:1: ( ( ( rule__Program__DaysAssignment_2_0 ) ) )
            // InternalProgram.g:1967:1: ( ( rule__Program__DaysAssignment_2_0 ) )
            {
            // InternalProgram.g:1967:1: ( ( rule__Program__DaysAssignment_2_0 ) )
            // InternalProgram.g:1968:2: ( rule__Program__DaysAssignment_2_0 )
            {
             before(grammarAccess.getProgramAccess().getDaysAssignment_2_0()); 
            // InternalProgram.g:1969:2: ( rule__Program__DaysAssignment_2_0 )
            // InternalProgram.g:1969:3: rule__Program__DaysAssignment_2_0
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
    // InternalProgram.g:1977:1: rule__Program__Group_2__1 : rule__Program__Group_2__1__Impl ;
    public final void rule__Program__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1981:1: ( rule__Program__Group_2__1__Impl )
            // InternalProgram.g:1982:2: rule__Program__Group_2__1__Impl
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
    // InternalProgram.g:1988:1: rule__Program__Group_2__1__Impl : ( ( rule__Program__DaysAssignment_2_1 )* ) ;
    public final void rule__Program__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1992:1: ( ( ( rule__Program__DaysAssignment_2_1 )* ) )
            // InternalProgram.g:1993:1: ( ( rule__Program__DaysAssignment_2_1 )* )
            {
            // InternalProgram.g:1993:1: ( ( rule__Program__DaysAssignment_2_1 )* )
            // InternalProgram.g:1994:2: ( rule__Program__DaysAssignment_2_1 )*
            {
             before(grammarAccess.getProgramAccess().getDaysAssignment_2_1()); 
            // InternalProgram.g:1995:2: ( rule__Program__DaysAssignment_2_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=11 && LA13_0<=17)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalProgram.g:1995:3: rule__Program__DaysAssignment_2_1
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
    // InternalProgram.g:2004:1: rule__Room__Group__0 : rule__Room__Group__0__Impl rule__Room__Group__1 ;
    public final void rule__Room__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2008:1: ( rule__Room__Group__0__Impl rule__Room__Group__1 )
            // InternalProgram.g:2009:2: rule__Room__Group__0__Impl rule__Room__Group__1
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
    // InternalProgram.g:2016:1: rule__Room__Group__0__Impl : ( () ) ;
    public final void rule__Room__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2020:1: ( ( () ) )
            // InternalProgram.g:2021:1: ( () )
            {
            // InternalProgram.g:2021:1: ( () )
            // InternalProgram.g:2022:2: ()
            {
             before(grammarAccess.getRoomAccess().getRoomAction_0()); 
            // InternalProgram.g:2023:2: ()
            // InternalProgram.g:2023:3: 
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
    // InternalProgram.g:2031:1: rule__Room__Group__1 : rule__Room__Group__1__Impl rule__Room__Group__2 ;
    public final void rule__Room__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2035:1: ( rule__Room__Group__1__Impl rule__Room__Group__2 )
            // InternalProgram.g:2036:2: rule__Room__Group__1__Impl rule__Room__Group__2
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
    // InternalProgram.g:2043:1: rule__Room__Group__1__Impl : ( 'room' ) ;
    public final void rule__Room__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2047:1: ( ( 'room' ) )
            // InternalProgram.g:2048:1: ( 'room' )
            {
            // InternalProgram.g:2048:1: ( 'room' )
            // InternalProgram.g:2049:2: 'room'
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
    // InternalProgram.g:2058:1: rule__Room__Group__2 : rule__Room__Group__2__Impl rule__Room__Group__3 ;
    public final void rule__Room__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2062:1: ( rule__Room__Group__2__Impl rule__Room__Group__3 )
            // InternalProgram.g:2063:2: rule__Room__Group__2__Impl rule__Room__Group__3
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
    // InternalProgram.g:2070:1: rule__Room__Group__2__Impl : ( ( rule__Room__NameAssignment_2 ) ) ;
    public final void rule__Room__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2074:1: ( ( ( rule__Room__NameAssignment_2 ) ) )
            // InternalProgram.g:2075:1: ( ( rule__Room__NameAssignment_2 ) )
            {
            // InternalProgram.g:2075:1: ( ( rule__Room__NameAssignment_2 ) )
            // InternalProgram.g:2076:2: ( rule__Room__NameAssignment_2 )
            {
             before(grammarAccess.getRoomAccess().getNameAssignment_2()); 
            // InternalProgram.g:2077:2: ( rule__Room__NameAssignment_2 )
            // InternalProgram.g:2077:3: rule__Room__NameAssignment_2
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
    // InternalProgram.g:2085:1: rule__Room__Group__3 : rule__Room__Group__3__Impl ;
    public final void rule__Room__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2089:1: ( rule__Room__Group__3__Impl )
            // InternalProgram.g:2090:2: rule__Room__Group__3__Impl
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
    // InternalProgram.g:2096:1: rule__Room__Group__3__Impl : ( ( rule__Room__Group_3__0 )? ) ;
    public final void rule__Room__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2100:1: ( ( ( rule__Room__Group_3__0 )? ) )
            // InternalProgram.g:2101:1: ( ( rule__Room__Group_3__0 )? )
            {
            // InternalProgram.g:2101:1: ( ( rule__Room__Group_3__0 )? )
            // InternalProgram.g:2102:2: ( rule__Room__Group_3__0 )?
            {
             before(grammarAccess.getRoomAccess().getGroup_3()); 
            // InternalProgram.g:2103:2: ( rule__Room__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalProgram.g:2103:3: rule__Room__Group_3__0
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
    // InternalProgram.g:2112:1: rule__Room__Group_3__0 : rule__Room__Group_3__0__Impl rule__Room__Group_3__1 ;
    public final void rule__Room__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2116:1: ( rule__Room__Group_3__0__Impl rule__Room__Group_3__1 )
            // InternalProgram.g:2117:2: rule__Room__Group_3__0__Impl rule__Room__Group_3__1
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
    // InternalProgram.g:2124:1: rule__Room__Group_3__0__Impl : ( 'capacity' ) ;
    public final void rule__Room__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2128:1: ( ( 'capacity' ) )
            // InternalProgram.g:2129:1: ( 'capacity' )
            {
            // InternalProgram.g:2129:1: ( 'capacity' )
            // InternalProgram.g:2130:2: 'capacity'
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
    // InternalProgram.g:2139:1: rule__Room__Group_3__1 : rule__Room__Group_3__1__Impl ;
    public final void rule__Room__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2143:1: ( rule__Room__Group_3__1__Impl )
            // InternalProgram.g:2144:2: rule__Room__Group_3__1__Impl
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
    // InternalProgram.g:2150:1: rule__Room__Group_3__1__Impl : ( ( rule__Room__CapacityAssignment_3_1 ) ) ;
    public final void rule__Room__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2154:1: ( ( ( rule__Room__CapacityAssignment_3_1 ) ) )
            // InternalProgram.g:2155:1: ( ( rule__Room__CapacityAssignment_3_1 ) )
            {
            // InternalProgram.g:2155:1: ( ( rule__Room__CapacityAssignment_3_1 ) )
            // InternalProgram.g:2156:2: ( rule__Room__CapacityAssignment_3_1 )
            {
             before(grammarAccess.getRoomAccess().getCapacityAssignment_3_1()); 
            // InternalProgram.g:2157:2: ( rule__Room__CapacityAssignment_3_1 )
            // InternalProgram.g:2157:3: rule__Room__CapacityAssignment_3_1
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
    // InternalProgram.g:2166:1: rule__Day__Group__0 : rule__Day__Group__0__Impl rule__Day__Group__1 ;
    public final void rule__Day__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2170:1: ( rule__Day__Group__0__Impl rule__Day__Group__1 )
            // InternalProgram.g:2171:2: rule__Day__Group__0__Impl rule__Day__Group__1
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
    // InternalProgram.g:2178:1: rule__Day__Group__0__Impl : ( ( rule__Day__WeekdayAssignment_0 ) ) ;
    public final void rule__Day__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2182:1: ( ( ( rule__Day__WeekdayAssignment_0 ) ) )
            // InternalProgram.g:2183:1: ( ( rule__Day__WeekdayAssignment_0 ) )
            {
            // InternalProgram.g:2183:1: ( ( rule__Day__WeekdayAssignment_0 ) )
            // InternalProgram.g:2184:2: ( rule__Day__WeekdayAssignment_0 )
            {
             before(grammarAccess.getDayAccess().getWeekdayAssignment_0()); 
            // InternalProgram.g:2185:2: ( rule__Day__WeekdayAssignment_0 )
            // InternalProgram.g:2185:3: rule__Day__WeekdayAssignment_0
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
    // InternalProgram.g:2193:1: rule__Day__Group__1 : rule__Day__Group__1__Impl rule__Day__Group__2 ;
    public final void rule__Day__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2197:1: ( rule__Day__Group__1__Impl rule__Day__Group__2 )
            // InternalProgram.g:2198:2: rule__Day__Group__1__Impl rule__Day__Group__2
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
    // InternalProgram.g:2205:1: rule__Day__Group__1__Impl : ( ( rule__Day__Group_1__0 )? ) ;
    public final void rule__Day__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2209:1: ( ( ( rule__Day__Group_1__0 )? ) )
            // InternalProgram.g:2210:1: ( ( rule__Day__Group_1__0 )? )
            {
            // InternalProgram.g:2210:1: ( ( rule__Day__Group_1__0 )? )
            // InternalProgram.g:2211:2: ( rule__Day__Group_1__0 )?
            {
             before(grammarAccess.getDayAccess().getGroup_1()); 
            // InternalProgram.g:2212:2: ( rule__Day__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalProgram.g:2212:3: rule__Day__Group_1__0
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
    // InternalProgram.g:2220:1: rule__Day__Group__2 : rule__Day__Group__2__Impl ;
    public final void rule__Day__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2224:1: ( rule__Day__Group__2__Impl )
            // InternalProgram.g:2225:2: rule__Day__Group__2__Impl
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
    // InternalProgram.g:2231:1: rule__Day__Group__2__Impl : ( ( rule__Day__Group_2__0 )? ) ;
    public final void rule__Day__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2235:1: ( ( ( rule__Day__Group_2__0 )? ) )
            // InternalProgram.g:2236:1: ( ( rule__Day__Group_2__0 )? )
            {
            // InternalProgram.g:2236:1: ( ( rule__Day__Group_2__0 )? )
            // InternalProgram.g:2237:2: ( rule__Day__Group_2__0 )?
            {
             before(grammarAccess.getDayAccess().getGroup_2()); 
            // InternalProgram.g:2238:2: ( rule__Day__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalProgram.g:2238:3: rule__Day__Group_2__0
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
    // InternalProgram.g:2247:1: rule__Day__Group_1__0 : rule__Day__Group_1__0__Impl rule__Day__Group_1__1 ;
    public final void rule__Day__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2251:1: ( rule__Day__Group_1__0__Impl rule__Day__Group_1__1 )
            // InternalProgram.g:2252:2: rule__Day__Group_1__0__Impl rule__Day__Group_1__1
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
    // InternalProgram.g:2259:1: rule__Day__Group_1__0__Impl : ( 'date' ) ;
    public final void rule__Day__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2263:1: ( ( 'date' ) )
            // InternalProgram.g:2264:1: ( 'date' )
            {
            // InternalProgram.g:2264:1: ( 'date' )
            // InternalProgram.g:2265:2: 'date'
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
    // InternalProgram.g:2274:1: rule__Day__Group_1__1 : rule__Day__Group_1__1__Impl ;
    public final void rule__Day__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2278:1: ( rule__Day__Group_1__1__Impl )
            // InternalProgram.g:2279:2: rule__Day__Group_1__1__Impl
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
    // InternalProgram.g:2285:1: rule__Day__Group_1__1__Impl : ( ( rule__Day__DateAssignment_1_1 ) ) ;
    public final void rule__Day__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2289:1: ( ( ( rule__Day__DateAssignment_1_1 ) ) )
            // InternalProgram.g:2290:1: ( ( rule__Day__DateAssignment_1_1 ) )
            {
            // InternalProgram.g:2290:1: ( ( rule__Day__DateAssignment_1_1 ) )
            // InternalProgram.g:2291:2: ( rule__Day__DateAssignment_1_1 )
            {
             before(grammarAccess.getDayAccess().getDateAssignment_1_1()); 
            // InternalProgram.g:2292:2: ( rule__Day__DateAssignment_1_1 )
            // InternalProgram.g:2292:3: rule__Day__DateAssignment_1_1
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
    // InternalProgram.g:2301:1: rule__Day__Group_2__0 : rule__Day__Group_2__0__Impl rule__Day__Group_2__1 ;
    public final void rule__Day__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2305:1: ( rule__Day__Group_2__0__Impl rule__Day__Group_2__1 )
            // InternalProgram.g:2306:2: rule__Day__Group_2__0__Impl rule__Day__Group_2__1
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
    // InternalProgram.g:2313:1: rule__Day__Group_2__0__Impl : ( ( rule__Day__SessionsAssignment_2_0 ) ) ;
    public final void rule__Day__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2317:1: ( ( ( rule__Day__SessionsAssignment_2_0 ) ) )
            // InternalProgram.g:2318:1: ( ( rule__Day__SessionsAssignment_2_0 ) )
            {
            // InternalProgram.g:2318:1: ( ( rule__Day__SessionsAssignment_2_0 ) )
            // InternalProgram.g:2319:2: ( rule__Day__SessionsAssignment_2_0 )
            {
             before(grammarAccess.getDayAccess().getSessionsAssignment_2_0()); 
            // InternalProgram.g:2320:2: ( rule__Day__SessionsAssignment_2_0 )
            // InternalProgram.g:2320:3: rule__Day__SessionsAssignment_2_0
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
    // InternalProgram.g:2328:1: rule__Day__Group_2__1 : rule__Day__Group_2__1__Impl ;
    public final void rule__Day__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2332:1: ( rule__Day__Group_2__1__Impl )
            // InternalProgram.g:2333:2: rule__Day__Group_2__1__Impl
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
    // InternalProgram.g:2339:1: rule__Day__Group_2__1__Impl : ( ( rule__Day__SessionsAssignment_2_1 )* ) ;
    public final void rule__Day__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2343:1: ( ( ( rule__Day__SessionsAssignment_2_1 )* ) )
            // InternalProgram.g:2344:1: ( ( rule__Day__SessionsAssignment_2_1 )* )
            {
            // InternalProgram.g:2344:1: ( ( rule__Day__SessionsAssignment_2_1 )* )
            // InternalProgram.g:2345:2: ( rule__Day__SessionsAssignment_2_1 )*
            {
             before(grammarAccess.getDayAccess().getSessionsAssignment_2_1()); 
            // InternalProgram.g:2346:2: ( rule__Day__SessionsAssignment_2_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_INT) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalProgram.g:2346:3: rule__Day__SessionsAssignment_2_1
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


    // $ANTLR start "rule__DayDate__Group__0"
    // InternalProgram.g:2355:1: rule__DayDate__Group__0 : rule__DayDate__Group__0__Impl rule__DayDate__Group__1 ;
    public final void rule__DayDate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2359:1: ( rule__DayDate__Group__0__Impl rule__DayDate__Group__1 )
            // InternalProgram.g:2360:2: rule__DayDate__Group__0__Impl rule__DayDate__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__DayDate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DayDate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DayDate__Group__0"


    // $ANTLR start "rule__DayDate__Group__0__Impl"
    // InternalProgram.g:2367:1: rule__DayDate__Group__0__Impl : ( ( rule__DayDate__YearAssignment_0 ) ) ;
    public final void rule__DayDate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2371:1: ( ( ( rule__DayDate__YearAssignment_0 ) ) )
            // InternalProgram.g:2372:1: ( ( rule__DayDate__YearAssignment_0 ) )
            {
            // InternalProgram.g:2372:1: ( ( rule__DayDate__YearAssignment_0 ) )
            // InternalProgram.g:2373:2: ( rule__DayDate__YearAssignment_0 )
            {
             before(grammarAccess.getDayDateAccess().getYearAssignment_0()); 
            // InternalProgram.g:2374:2: ( rule__DayDate__YearAssignment_0 )
            // InternalProgram.g:2374:3: rule__DayDate__YearAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DayDate__YearAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDayDateAccess().getYearAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DayDate__Group__0__Impl"


    // $ANTLR start "rule__DayDate__Group__1"
    // InternalProgram.g:2382:1: rule__DayDate__Group__1 : rule__DayDate__Group__1__Impl rule__DayDate__Group__2 ;
    public final void rule__DayDate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2386:1: ( rule__DayDate__Group__1__Impl rule__DayDate__Group__2 )
            // InternalProgram.g:2387:2: rule__DayDate__Group__1__Impl rule__DayDate__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__DayDate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DayDate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DayDate__Group__1"


    // $ANTLR start "rule__DayDate__Group__1__Impl"
    // InternalProgram.g:2394:1: rule__DayDate__Group__1__Impl : ( '.' ) ;
    public final void rule__DayDate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2398:1: ( ( '.' ) )
            // InternalProgram.g:2399:1: ( '.' )
            {
            // InternalProgram.g:2399:1: ( '.' )
            // InternalProgram.g:2400:2: '.'
            {
             before(grammarAccess.getDayDateAccess().getFullStopKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDayDateAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DayDate__Group__1__Impl"


    // $ANTLR start "rule__DayDate__Group__2"
    // InternalProgram.g:2409:1: rule__DayDate__Group__2 : rule__DayDate__Group__2__Impl rule__DayDate__Group__3 ;
    public final void rule__DayDate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2413:1: ( rule__DayDate__Group__2__Impl rule__DayDate__Group__3 )
            // InternalProgram.g:2414:2: rule__DayDate__Group__2__Impl rule__DayDate__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__DayDate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DayDate__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DayDate__Group__2"


    // $ANTLR start "rule__DayDate__Group__2__Impl"
    // InternalProgram.g:2421:1: rule__DayDate__Group__2__Impl : ( ( rule__DayDate__MonthAssignment_2 ) ) ;
    public final void rule__DayDate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2425:1: ( ( ( rule__DayDate__MonthAssignment_2 ) ) )
            // InternalProgram.g:2426:1: ( ( rule__DayDate__MonthAssignment_2 ) )
            {
            // InternalProgram.g:2426:1: ( ( rule__DayDate__MonthAssignment_2 ) )
            // InternalProgram.g:2427:2: ( rule__DayDate__MonthAssignment_2 )
            {
             before(grammarAccess.getDayDateAccess().getMonthAssignment_2()); 
            // InternalProgram.g:2428:2: ( rule__DayDate__MonthAssignment_2 )
            // InternalProgram.g:2428:3: rule__DayDate__MonthAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DayDate__MonthAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDayDateAccess().getMonthAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DayDate__Group__2__Impl"


    // $ANTLR start "rule__DayDate__Group__3"
    // InternalProgram.g:2436:1: rule__DayDate__Group__3 : rule__DayDate__Group__3__Impl rule__DayDate__Group__4 ;
    public final void rule__DayDate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2440:1: ( rule__DayDate__Group__3__Impl rule__DayDate__Group__4 )
            // InternalProgram.g:2441:2: rule__DayDate__Group__3__Impl rule__DayDate__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__DayDate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DayDate__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DayDate__Group__3"


    // $ANTLR start "rule__DayDate__Group__3__Impl"
    // InternalProgram.g:2448:1: rule__DayDate__Group__3__Impl : ( '.' ) ;
    public final void rule__DayDate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2452:1: ( ( '.' ) )
            // InternalProgram.g:2453:1: ( '.' )
            {
            // InternalProgram.g:2453:1: ( '.' )
            // InternalProgram.g:2454:2: '.'
            {
             before(grammarAccess.getDayDateAccess().getFullStopKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDayDateAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DayDate__Group__3__Impl"


    // $ANTLR start "rule__DayDate__Group__4"
    // InternalProgram.g:2463:1: rule__DayDate__Group__4 : rule__DayDate__Group__4__Impl ;
    public final void rule__DayDate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2467:1: ( rule__DayDate__Group__4__Impl )
            // InternalProgram.g:2468:2: rule__DayDate__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DayDate__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DayDate__Group__4"


    // $ANTLR start "rule__DayDate__Group__4__Impl"
    // InternalProgram.g:2474:1: rule__DayDate__Group__4__Impl : ( ( rule__DayDate__DayAssignment_4 ) ) ;
    public final void rule__DayDate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2478:1: ( ( ( rule__DayDate__DayAssignment_4 ) ) )
            // InternalProgram.g:2479:1: ( ( rule__DayDate__DayAssignment_4 ) )
            {
            // InternalProgram.g:2479:1: ( ( rule__DayDate__DayAssignment_4 ) )
            // InternalProgram.g:2480:2: ( rule__DayDate__DayAssignment_4 )
            {
             before(grammarAccess.getDayDateAccess().getDayAssignment_4()); 
            // InternalProgram.g:2481:2: ( rule__DayDate__DayAssignment_4 )
            // InternalProgram.g:2481:3: rule__DayDate__DayAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DayDate__DayAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDayDateAccess().getDayAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DayDate__Group__4__Impl"


    // $ANTLR start "rule__HourDate__Group__0"
    // InternalProgram.g:2490:1: rule__HourDate__Group__0 : rule__HourDate__Group__0__Impl rule__HourDate__Group__1 ;
    public final void rule__HourDate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2494:1: ( rule__HourDate__Group__0__Impl rule__HourDate__Group__1 )
            // InternalProgram.g:2495:2: rule__HourDate__Group__0__Impl rule__HourDate__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__HourDate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HourDate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HourDate__Group__0"


    // $ANTLR start "rule__HourDate__Group__0__Impl"
    // InternalProgram.g:2502:1: rule__HourDate__Group__0__Impl : ( ( rule__HourDate__HoursAssignment_0 ) ) ;
    public final void rule__HourDate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2506:1: ( ( ( rule__HourDate__HoursAssignment_0 ) ) )
            // InternalProgram.g:2507:1: ( ( rule__HourDate__HoursAssignment_0 ) )
            {
            // InternalProgram.g:2507:1: ( ( rule__HourDate__HoursAssignment_0 ) )
            // InternalProgram.g:2508:2: ( rule__HourDate__HoursAssignment_0 )
            {
             before(grammarAccess.getHourDateAccess().getHoursAssignment_0()); 
            // InternalProgram.g:2509:2: ( rule__HourDate__HoursAssignment_0 )
            // InternalProgram.g:2509:3: rule__HourDate__HoursAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__HourDate__HoursAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHourDateAccess().getHoursAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HourDate__Group__0__Impl"


    // $ANTLR start "rule__HourDate__Group__1"
    // InternalProgram.g:2517:1: rule__HourDate__Group__1 : rule__HourDate__Group__1__Impl rule__HourDate__Group__2 ;
    public final void rule__HourDate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2521:1: ( rule__HourDate__Group__1__Impl rule__HourDate__Group__2 )
            // InternalProgram.g:2522:2: rule__HourDate__Group__1__Impl rule__HourDate__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__HourDate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HourDate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HourDate__Group__1"


    // $ANTLR start "rule__HourDate__Group__1__Impl"
    // InternalProgram.g:2529:1: rule__HourDate__Group__1__Impl : ( ':' ) ;
    public final void rule__HourDate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2533:1: ( ( ':' ) )
            // InternalProgram.g:2534:1: ( ':' )
            {
            // InternalProgram.g:2534:1: ( ':' )
            // InternalProgram.g:2535:2: ':'
            {
             before(grammarAccess.getHourDateAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getHourDateAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HourDate__Group__1__Impl"


    // $ANTLR start "rule__HourDate__Group__2"
    // InternalProgram.g:2544:1: rule__HourDate__Group__2 : rule__HourDate__Group__2__Impl ;
    public final void rule__HourDate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2548:1: ( rule__HourDate__Group__2__Impl )
            // InternalProgram.g:2549:2: rule__HourDate__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HourDate__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HourDate__Group__2"


    // $ANTLR start "rule__HourDate__Group__2__Impl"
    // InternalProgram.g:2555:1: rule__HourDate__Group__2__Impl : ( ( rule__HourDate__MinutesAssignment_2 ) ) ;
    public final void rule__HourDate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2559:1: ( ( ( rule__HourDate__MinutesAssignment_2 ) ) )
            // InternalProgram.g:2560:1: ( ( rule__HourDate__MinutesAssignment_2 ) )
            {
            // InternalProgram.g:2560:1: ( ( rule__HourDate__MinutesAssignment_2 ) )
            // InternalProgram.g:2561:2: ( rule__HourDate__MinutesAssignment_2 )
            {
             before(grammarAccess.getHourDateAccess().getMinutesAssignment_2()); 
            // InternalProgram.g:2562:2: ( rule__HourDate__MinutesAssignment_2 )
            // InternalProgram.g:2562:3: rule__HourDate__MinutesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__HourDate__MinutesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHourDateAccess().getMinutesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HourDate__Group__2__Impl"


    // $ANTLR start "rule__Session__Group__0"
    // InternalProgram.g:2571:1: rule__Session__Group__0 : rule__Session__Group__0__Impl rule__Session__Group__1 ;
    public final void rule__Session__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2575:1: ( rule__Session__Group__0__Impl rule__Session__Group__1 )
            // InternalProgram.g:2576:2: rule__Session__Group__0__Impl rule__Session__Group__1
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
    // InternalProgram.g:2583:1: rule__Session__Group__0__Impl : ( () ) ;
    public final void rule__Session__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2587:1: ( ( () ) )
            // InternalProgram.g:2588:1: ( () )
            {
            // InternalProgram.g:2588:1: ( () )
            // InternalProgram.g:2589:2: ()
            {
             before(grammarAccess.getSessionAccess().getSessionAction_0()); 
            // InternalProgram.g:2590:2: ()
            // InternalProgram.g:2590:3: 
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
    // InternalProgram.g:2598:1: rule__Session__Group__1 : rule__Session__Group__1__Impl rule__Session__Group__2 ;
    public final void rule__Session__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2602:1: ( rule__Session__Group__1__Impl rule__Session__Group__2 )
            // InternalProgram.g:2603:2: rule__Session__Group__1__Impl rule__Session__Group__2
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
    // InternalProgram.g:2610:1: rule__Session__Group__1__Impl : ( ( rule__Session__StartingTimeAssignment_1 ) ) ;
    public final void rule__Session__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2614:1: ( ( ( rule__Session__StartingTimeAssignment_1 ) ) )
            // InternalProgram.g:2615:1: ( ( rule__Session__StartingTimeAssignment_1 ) )
            {
            // InternalProgram.g:2615:1: ( ( rule__Session__StartingTimeAssignment_1 ) )
            // InternalProgram.g:2616:2: ( rule__Session__StartingTimeAssignment_1 )
            {
             before(grammarAccess.getSessionAccess().getStartingTimeAssignment_1()); 
            // InternalProgram.g:2617:2: ( rule__Session__StartingTimeAssignment_1 )
            // InternalProgram.g:2617:3: rule__Session__StartingTimeAssignment_1
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
    // InternalProgram.g:2625:1: rule__Session__Group__2 : rule__Session__Group__2__Impl rule__Session__Group__3 ;
    public final void rule__Session__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2629:1: ( rule__Session__Group__2__Impl rule__Session__Group__3 )
            // InternalProgram.g:2630:2: rule__Session__Group__2__Impl rule__Session__Group__3
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
    // InternalProgram.g:2637:1: rule__Session__Group__2__Impl : ( '-' ) ;
    public final void rule__Session__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2641:1: ( ( '-' ) )
            // InternalProgram.g:2642:1: ( '-' )
            {
            // InternalProgram.g:2642:1: ( '-' )
            // InternalProgram.g:2643:2: '-'
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
    // InternalProgram.g:2652:1: rule__Session__Group__3 : rule__Session__Group__3__Impl rule__Session__Group__4 ;
    public final void rule__Session__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2656:1: ( rule__Session__Group__3__Impl rule__Session__Group__4 )
            // InternalProgram.g:2657:2: rule__Session__Group__3__Impl rule__Session__Group__4
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
    // InternalProgram.g:2664:1: rule__Session__Group__3__Impl : ( ( rule__Session__EndingTimeAssignment_3 ) ) ;
    public final void rule__Session__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2668:1: ( ( ( rule__Session__EndingTimeAssignment_3 ) ) )
            // InternalProgram.g:2669:1: ( ( rule__Session__EndingTimeAssignment_3 ) )
            {
            // InternalProgram.g:2669:1: ( ( rule__Session__EndingTimeAssignment_3 ) )
            // InternalProgram.g:2670:2: ( rule__Session__EndingTimeAssignment_3 )
            {
             before(grammarAccess.getSessionAccess().getEndingTimeAssignment_3()); 
            // InternalProgram.g:2671:2: ( rule__Session__EndingTimeAssignment_3 )
            // InternalProgram.g:2671:3: rule__Session__EndingTimeAssignment_3
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
    // InternalProgram.g:2679:1: rule__Session__Group__4 : rule__Session__Group__4__Impl rule__Session__Group__5 ;
    public final void rule__Session__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2683:1: ( rule__Session__Group__4__Impl rule__Session__Group__5 )
            // InternalProgram.g:2684:2: rule__Session__Group__4__Impl rule__Session__Group__5
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
    // InternalProgram.g:2691:1: rule__Session__Group__4__Impl : ( 'in' ) ;
    public final void rule__Session__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2695:1: ( ( 'in' ) )
            // InternalProgram.g:2696:1: ( 'in' )
            {
            // InternalProgram.g:2696:1: ( 'in' )
            // InternalProgram.g:2697:2: 'in'
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
    // InternalProgram.g:2706:1: rule__Session__Group__5 : rule__Session__Group__5__Impl rule__Session__Group__6 ;
    public final void rule__Session__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2710:1: ( rule__Session__Group__5__Impl rule__Session__Group__6 )
            // InternalProgram.g:2711:2: rule__Session__Group__5__Impl rule__Session__Group__6
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
    // InternalProgram.g:2718:1: rule__Session__Group__5__Impl : ( ( rule__Session__RoomAssignment_5 ) ) ;
    public final void rule__Session__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2722:1: ( ( ( rule__Session__RoomAssignment_5 ) ) )
            // InternalProgram.g:2723:1: ( ( rule__Session__RoomAssignment_5 ) )
            {
            // InternalProgram.g:2723:1: ( ( rule__Session__RoomAssignment_5 ) )
            // InternalProgram.g:2724:2: ( rule__Session__RoomAssignment_5 )
            {
             before(grammarAccess.getSessionAccess().getRoomAssignment_5()); 
            // InternalProgram.g:2725:2: ( rule__Session__RoomAssignment_5 )
            // InternalProgram.g:2725:3: rule__Session__RoomAssignment_5
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
    // InternalProgram.g:2733:1: rule__Session__Group__6 : rule__Session__Group__6__Impl rule__Session__Group__7 ;
    public final void rule__Session__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2737:1: ( rule__Session__Group__6__Impl rule__Session__Group__7 )
            // InternalProgram.g:2738:2: rule__Session__Group__6__Impl rule__Session__Group__7
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
    // InternalProgram.g:2745:1: rule__Session__Group__6__Impl : ( ':' ) ;
    public final void rule__Session__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2749:1: ( ( ':' ) )
            // InternalProgram.g:2750:1: ( ':' )
            {
            // InternalProgram.g:2750:1: ( ':' )
            // InternalProgram.g:2751:2: ':'
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
    // InternalProgram.g:2760:1: rule__Session__Group__7 : rule__Session__Group__7__Impl rule__Session__Group__8 ;
    public final void rule__Session__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2764:1: ( rule__Session__Group__7__Impl rule__Session__Group__8 )
            // InternalProgram.g:2765:2: rule__Session__Group__7__Impl rule__Session__Group__8
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
    // InternalProgram.g:2772:1: rule__Session__Group__7__Impl : ( ( rule__Session__EventsAssignment_7 ) ) ;
    public final void rule__Session__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2776:1: ( ( ( rule__Session__EventsAssignment_7 ) ) )
            // InternalProgram.g:2777:1: ( ( rule__Session__EventsAssignment_7 ) )
            {
            // InternalProgram.g:2777:1: ( ( rule__Session__EventsAssignment_7 ) )
            // InternalProgram.g:2778:2: ( rule__Session__EventsAssignment_7 )
            {
             before(grammarAccess.getSessionAccess().getEventsAssignment_7()); 
            // InternalProgram.g:2779:2: ( rule__Session__EventsAssignment_7 )
            // InternalProgram.g:2779:3: rule__Session__EventsAssignment_7
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
    // InternalProgram.g:2787:1: rule__Session__Group__8 : rule__Session__Group__8__Impl ;
    public final void rule__Session__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2791:1: ( rule__Session__Group__8__Impl )
            // InternalProgram.g:2792:2: rule__Session__Group__8__Impl
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
    // InternalProgram.g:2798:1: rule__Session__Group__8__Impl : ( ( rule__Session__Group_8__0 )* ) ;
    public final void rule__Session__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2802:1: ( ( ( rule__Session__Group_8__0 )* ) )
            // InternalProgram.g:2803:1: ( ( rule__Session__Group_8__0 )* )
            {
            // InternalProgram.g:2803:1: ( ( rule__Session__Group_8__0 )* )
            // InternalProgram.g:2804:2: ( rule__Session__Group_8__0 )*
            {
             before(grammarAccess.getSessionAccess().getGroup_8()); 
            // InternalProgram.g:2805:2: ( rule__Session__Group_8__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==21) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalProgram.g:2805:3: rule__Session__Group_8__0
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
    // InternalProgram.g:2814:1: rule__Session__Group_8__0 : rule__Session__Group_8__0__Impl rule__Session__Group_8__1 ;
    public final void rule__Session__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2818:1: ( rule__Session__Group_8__0__Impl rule__Session__Group_8__1 )
            // InternalProgram.g:2819:2: rule__Session__Group_8__0__Impl rule__Session__Group_8__1
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
    // InternalProgram.g:2826:1: rule__Session__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Session__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2830:1: ( ( ',' ) )
            // InternalProgram.g:2831:1: ( ',' )
            {
            // InternalProgram.g:2831:1: ( ',' )
            // InternalProgram.g:2832:2: ','
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
    // InternalProgram.g:2841:1: rule__Session__Group_8__1 : rule__Session__Group_8__1__Impl ;
    public final void rule__Session__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2845:1: ( rule__Session__Group_8__1__Impl )
            // InternalProgram.g:2846:2: rule__Session__Group_8__1__Impl
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
    // InternalProgram.g:2852:1: rule__Session__Group_8__1__Impl : ( ( rule__Session__EventsAssignment_8_1 ) ) ;
    public final void rule__Session__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2856:1: ( ( ( rule__Session__EventsAssignment_8_1 ) ) )
            // InternalProgram.g:2857:1: ( ( rule__Session__EventsAssignment_8_1 ) )
            {
            // InternalProgram.g:2857:1: ( ( rule__Session__EventsAssignment_8_1 ) )
            // InternalProgram.g:2858:2: ( rule__Session__EventsAssignment_8_1 )
            {
             before(grammarAccess.getSessionAccess().getEventsAssignment_8_1()); 
            // InternalProgram.g:2859:2: ( rule__Session__EventsAssignment_8_1 )
            // InternalProgram.g:2859:3: rule__Session__EventsAssignment_8_1
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
    // InternalProgram.g:2868:1: rule__TalkSession__Group__0 : rule__TalkSession__Group__0__Impl rule__TalkSession__Group__1 ;
    public final void rule__TalkSession__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2872:1: ( rule__TalkSession__Group__0__Impl rule__TalkSession__Group__1 )
            // InternalProgram.g:2873:2: rule__TalkSession__Group__0__Impl rule__TalkSession__Group__1
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
    // InternalProgram.g:2880:1: rule__TalkSession__Group__0__Impl : ( 'TalkSession' ) ;
    public final void rule__TalkSession__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2884:1: ( ( 'TalkSession' ) )
            // InternalProgram.g:2885:1: ( 'TalkSession' )
            {
            // InternalProgram.g:2885:1: ( 'TalkSession' )
            // InternalProgram.g:2886:2: 'TalkSession'
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
    // InternalProgram.g:2895:1: rule__TalkSession__Group__1 : rule__TalkSession__Group__1__Impl rule__TalkSession__Group__2 ;
    public final void rule__TalkSession__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2899:1: ( rule__TalkSession__Group__1__Impl rule__TalkSession__Group__2 )
            // InternalProgram.g:2900:2: rule__TalkSession__Group__1__Impl rule__TalkSession__Group__2
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
    // InternalProgram.g:2907:1: rule__TalkSession__Group__1__Impl : ( ( rule__TalkSession__NameAssignment_1 ) ) ;
    public final void rule__TalkSession__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2911:1: ( ( ( rule__TalkSession__NameAssignment_1 ) ) )
            // InternalProgram.g:2912:1: ( ( rule__TalkSession__NameAssignment_1 ) )
            {
            // InternalProgram.g:2912:1: ( ( rule__TalkSession__NameAssignment_1 ) )
            // InternalProgram.g:2913:2: ( rule__TalkSession__NameAssignment_1 )
            {
             before(grammarAccess.getTalkSessionAccess().getNameAssignment_1()); 
            // InternalProgram.g:2914:2: ( rule__TalkSession__NameAssignment_1 )
            // InternalProgram.g:2914:3: rule__TalkSession__NameAssignment_1
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
    // InternalProgram.g:2922:1: rule__TalkSession__Group__2 : rule__TalkSession__Group__2__Impl rule__TalkSession__Group__3 ;
    public final void rule__TalkSession__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2926:1: ( rule__TalkSession__Group__2__Impl rule__TalkSession__Group__3 )
            // InternalProgram.g:2927:2: rule__TalkSession__Group__2__Impl rule__TalkSession__Group__3
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
    // InternalProgram.g:2934:1: rule__TalkSession__Group__2__Impl : ( ( rule__TalkSession__Group_2__0 )? ) ;
    public final void rule__TalkSession__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2938:1: ( ( ( rule__TalkSession__Group_2__0 )? ) )
            // InternalProgram.g:2939:1: ( ( rule__TalkSession__Group_2__0 )? )
            {
            // InternalProgram.g:2939:1: ( ( rule__TalkSession__Group_2__0 )? )
            // InternalProgram.g:2940:2: ( rule__TalkSession__Group_2__0 )?
            {
             before(grammarAccess.getTalkSessionAccess().getGroup_2()); 
            // InternalProgram.g:2941:2: ( rule__TalkSession__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalProgram.g:2941:3: rule__TalkSession__Group_2__0
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
    // InternalProgram.g:2949:1: rule__TalkSession__Group__3 : rule__TalkSession__Group__3__Impl rule__TalkSession__Group__4 ;
    public final void rule__TalkSession__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2953:1: ( rule__TalkSession__Group__3__Impl rule__TalkSession__Group__4 )
            // InternalProgram.g:2954:2: rule__TalkSession__Group__3__Impl rule__TalkSession__Group__4
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
    // InternalProgram.g:2961:1: rule__TalkSession__Group__3__Impl : ( ( rule__TalkSession__Group_3__0 )? ) ;
    public final void rule__TalkSession__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2965:1: ( ( ( rule__TalkSession__Group_3__0 )? ) )
            // InternalProgram.g:2966:1: ( ( rule__TalkSession__Group_3__0 )? )
            {
            // InternalProgram.g:2966:1: ( ( rule__TalkSession__Group_3__0 )? )
            // InternalProgram.g:2967:2: ( rule__TalkSession__Group_3__0 )?
            {
             before(grammarAccess.getTalkSessionAccess().getGroup_3()); 
            // InternalProgram.g:2968:2: ( rule__TalkSession__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalProgram.g:2968:3: rule__TalkSession__Group_3__0
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
    // InternalProgram.g:2976:1: rule__TalkSession__Group__4 : rule__TalkSession__Group__4__Impl ;
    public final void rule__TalkSession__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2980:1: ( rule__TalkSession__Group__4__Impl )
            // InternalProgram.g:2981:2: rule__TalkSession__Group__4__Impl
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
    // InternalProgram.g:2987:1: rule__TalkSession__Group__4__Impl : ( ( rule__TalkSession__Group_4__0 )? ) ;
    public final void rule__TalkSession__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2991:1: ( ( ( rule__TalkSession__Group_4__0 )? ) )
            // InternalProgram.g:2992:1: ( ( rule__TalkSession__Group_4__0 )? )
            {
            // InternalProgram.g:2992:1: ( ( rule__TalkSession__Group_4__0 )? )
            // InternalProgram.g:2993:2: ( rule__TalkSession__Group_4__0 )?
            {
             before(grammarAccess.getTalkSessionAccess().getGroup_4()); 
            // InternalProgram.g:2994:2: ( rule__TalkSession__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalProgram.g:2994:3: rule__TalkSession__Group_4__0
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
    // InternalProgram.g:3003:1: rule__TalkSession__Group_2__0 : rule__TalkSession__Group_2__0__Impl rule__TalkSession__Group_2__1 ;
    public final void rule__TalkSession__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3007:1: ( rule__TalkSession__Group_2__0__Impl rule__TalkSession__Group_2__1 )
            // InternalProgram.g:3008:2: rule__TalkSession__Group_2__0__Impl rule__TalkSession__Group_2__1
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
    // InternalProgram.g:3015:1: rule__TalkSession__Group_2__0__Impl : ( 'chair' ) ;
    public final void rule__TalkSession__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3019:1: ( ( 'chair' ) )
            // InternalProgram.g:3020:1: ( 'chair' )
            {
            // InternalProgram.g:3020:1: ( 'chair' )
            // InternalProgram.g:3021:2: 'chair'
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
    // InternalProgram.g:3030:1: rule__TalkSession__Group_2__1 : rule__TalkSession__Group_2__1__Impl ;
    public final void rule__TalkSession__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3034:1: ( rule__TalkSession__Group_2__1__Impl )
            // InternalProgram.g:3035:2: rule__TalkSession__Group_2__1__Impl
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
    // InternalProgram.g:3041:1: rule__TalkSession__Group_2__1__Impl : ( ( rule__TalkSession__ChairAssignment_2_1 ) ) ;
    public final void rule__TalkSession__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3045:1: ( ( ( rule__TalkSession__ChairAssignment_2_1 ) ) )
            // InternalProgram.g:3046:1: ( ( rule__TalkSession__ChairAssignment_2_1 ) )
            {
            // InternalProgram.g:3046:1: ( ( rule__TalkSession__ChairAssignment_2_1 ) )
            // InternalProgram.g:3047:2: ( rule__TalkSession__ChairAssignment_2_1 )
            {
             before(grammarAccess.getTalkSessionAccess().getChairAssignment_2_1()); 
            // InternalProgram.g:3048:2: ( rule__TalkSession__ChairAssignment_2_1 )
            // InternalProgram.g:3048:3: rule__TalkSession__ChairAssignment_2_1
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
    // InternalProgram.g:3057:1: rule__TalkSession__Group_3__0 : rule__TalkSession__Group_3__0__Impl rule__TalkSession__Group_3__1 ;
    public final void rule__TalkSession__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3061:1: ( rule__TalkSession__Group_3__0__Impl rule__TalkSession__Group_3__1 )
            // InternalProgram.g:3062:2: rule__TalkSession__Group_3__0__Impl rule__TalkSession__Group_3__1
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
    // InternalProgram.g:3069:1: rule__TalkSession__Group_3__0__Impl : ( 'abstract' ) ;
    public final void rule__TalkSession__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3073:1: ( ( 'abstract' ) )
            // InternalProgram.g:3074:1: ( 'abstract' )
            {
            // InternalProgram.g:3074:1: ( 'abstract' )
            // InternalProgram.g:3075:2: 'abstract'
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
    // InternalProgram.g:3084:1: rule__TalkSession__Group_3__1 : rule__TalkSession__Group_3__1__Impl ;
    public final void rule__TalkSession__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3088:1: ( rule__TalkSession__Group_3__1__Impl )
            // InternalProgram.g:3089:2: rule__TalkSession__Group_3__1__Impl
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
    // InternalProgram.g:3095:1: rule__TalkSession__Group_3__1__Impl : ( ( rule__TalkSession__AbstractAssignment_3_1 ) ) ;
    public final void rule__TalkSession__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3099:1: ( ( ( rule__TalkSession__AbstractAssignment_3_1 ) ) )
            // InternalProgram.g:3100:1: ( ( rule__TalkSession__AbstractAssignment_3_1 ) )
            {
            // InternalProgram.g:3100:1: ( ( rule__TalkSession__AbstractAssignment_3_1 ) )
            // InternalProgram.g:3101:2: ( rule__TalkSession__AbstractAssignment_3_1 )
            {
             before(grammarAccess.getTalkSessionAccess().getAbstractAssignment_3_1()); 
            // InternalProgram.g:3102:2: ( rule__TalkSession__AbstractAssignment_3_1 )
            // InternalProgram.g:3102:3: rule__TalkSession__AbstractAssignment_3_1
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
    // InternalProgram.g:3111:1: rule__TalkSession__Group_4__0 : rule__TalkSession__Group_4__0__Impl rule__TalkSession__Group_4__1 ;
    public final void rule__TalkSession__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3115:1: ( rule__TalkSession__Group_4__0__Impl rule__TalkSession__Group_4__1 )
            // InternalProgram.g:3116:2: rule__TalkSession__Group_4__0__Impl rule__TalkSession__Group_4__1
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
    // InternalProgram.g:3123:1: rule__TalkSession__Group_4__0__Impl : ( 'papers' ) ;
    public final void rule__TalkSession__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3127:1: ( ( 'papers' ) )
            // InternalProgram.g:3128:1: ( 'papers' )
            {
            // InternalProgram.g:3128:1: ( 'papers' )
            // InternalProgram.g:3129:2: 'papers'
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
    // InternalProgram.g:3138:1: rule__TalkSession__Group_4__1 : rule__TalkSession__Group_4__1__Impl rule__TalkSession__Group_4__2 ;
    public final void rule__TalkSession__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3142:1: ( rule__TalkSession__Group_4__1__Impl rule__TalkSession__Group_4__2 )
            // InternalProgram.g:3143:2: rule__TalkSession__Group_4__1__Impl rule__TalkSession__Group_4__2
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
    // InternalProgram.g:3150:1: rule__TalkSession__Group_4__1__Impl : ( ( rule__TalkSession__PapersAssignment_4_1 ) ) ;
    public final void rule__TalkSession__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3154:1: ( ( ( rule__TalkSession__PapersAssignment_4_1 ) ) )
            // InternalProgram.g:3155:1: ( ( rule__TalkSession__PapersAssignment_4_1 ) )
            {
            // InternalProgram.g:3155:1: ( ( rule__TalkSession__PapersAssignment_4_1 ) )
            // InternalProgram.g:3156:2: ( rule__TalkSession__PapersAssignment_4_1 )
            {
             before(grammarAccess.getTalkSessionAccess().getPapersAssignment_4_1()); 
            // InternalProgram.g:3157:2: ( rule__TalkSession__PapersAssignment_4_1 )
            // InternalProgram.g:3157:3: rule__TalkSession__PapersAssignment_4_1
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
    // InternalProgram.g:3165:1: rule__TalkSession__Group_4__2 : rule__TalkSession__Group_4__2__Impl ;
    public final void rule__TalkSession__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3169:1: ( rule__TalkSession__Group_4__2__Impl )
            // InternalProgram.g:3170:2: rule__TalkSession__Group_4__2__Impl
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
    // InternalProgram.g:3176:1: rule__TalkSession__Group_4__2__Impl : ( ( rule__TalkSession__Group_4_2__0 )* ) ;
    public final void rule__TalkSession__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3180:1: ( ( ( rule__TalkSession__Group_4_2__0 )* ) )
            // InternalProgram.g:3181:1: ( ( rule__TalkSession__Group_4_2__0 )* )
            {
            // InternalProgram.g:3181:1: ( ( rule__TalkSession__Group_4_2__0 )* )
            // InternalProgram.g:3182:2: ( rule__TalkSession__Group_4_2__0 )*
            {
             before(grammarAccess.getTalkSessionAccess().getGroup_4_2()); 
            // InternalProgram.g:3183:2: ( rule__TalkSession__Group_4_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==21) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalProgram.g:3183:3: rule__TalkSession__Group_4_2__0
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
    // InternalProgram.g:3192:1: rule__TalkSession__Group_4_2__0 : rule__TalkSession__Group_4_2__0__Impl rule__TalkSession__Group_4_2__1 ;
    public final void rule__TalkSession__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3196:1: ( rule__TalkSession__Group_4_2__0__Impl rule__TalkSession__Group_4_2__1 )
            // InternalProgram.g:3197:2: rule__TalkSession__Group_4_2__0__Impl rule__TalkSession__Group_4_2__1
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
    // InternalProgram.g:3204:1: rule__TalkSession__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__TalkSession__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3208:1: ( ( ',' ) )
            // InternalProgram.g:3209:1: ( ',' )
            {
            // InternalProgram.g:3209:1: ( ',' )
            // InternalProgram.g:3210:2: ','
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
    // InternalProgram.g:3219:1: rule__TalkSession__Group_4_2__1 : rule__TalkSession__Group_4_2__1__Impl ;
    public final void rule__TalkSession__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3223:1: ( rule__TalkSession__Group_4_2__1__Impl )
            // InternalProgram.g:3224:2: rule__TalkSession__Group_4_2__1__Impl
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
    // InternalProgram.g:3230:1: rule__TalkSession__Group_4_2__1__Impl : ( ( rule__TalkSession__PapersAssignment_4_2_1 ) ) ;
    public final void rule__TalkSession__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3234:1: ( ( ( rule__TalkSession__PapersAssignment_4_2_1 ) ) )
            // InternalProgram.g:3235:1: ( ( rule__TalkSession__PapersAssignment_4_2_1 ) )
            {
            // InternalProgram.g:3235:1: ( ( rule__TalkSession__PapersAssignment_4_2_1 ) )
            // InternalProgram.g:3236:2: ( rule__TalkSession__PapersAssignment_4_2_1 )
            {
             before(grammarAccess.getTalkSessionAccess().getPapersAssignment_4_2_1()); 
            // InternalProgram.g:3237:2: ( rule__TalkSession__PapersAssignment_4_2_1 )
            // InternalProgram.g:3237:3: rule__TalkSession__PapersAssignment_4_2_1
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
    // InternalProgram.g:3246:1: rule__Panel__Group__0 : rule__Panel__Group__0__Impl rule__Panel__Group__1 ;
    public final void rule__Panel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3250:1: ( rule__Panel__Group__0__Impl rule__Panel__Group__1 )
            // InternalProgram.g:3251:2: rule__Panel__Group__0__Impl rule__Panel__Group__1
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
    // InternalProgram.g:3258:1: rule__Panel__Group__0__Impl : ( 'Panel' ) ;
    public final void rule__Panel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3262:1: ( ( 'Panel' ) )
            // InternalProgram.g:3263:1: ( 'Panel' )
            {
            // InternalProgram.g:3263:1: ( 'Panel' )
            // InternalProgram.g:3264:2: 'Panel'
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
    // InternalProgram.g:3273:1: rule__Panel__Group__1 : rule__Panel__Group__1__Impl rule__Panel__Group__2 ;
    public final void rule__Panel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3277:1: ( rule__Panel__Group__1__Impl rule__Panel__Group__2 )
            // InternalProgram.g:3278:2: rule__Panel__Group__1__Impl rule__Panel__Group__2
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
    // InternalProgram.g:3285:1: rule__Panel__Group__1__Impl : ( ( rule__Panel__NameAssignment_1 ) ) ;
    public final void rule__Panel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3289:1: ( ( ( rule__Panel__NameAssignment_1 ) ) )
            // InternalProgram.g:3290:1: ( ( rule__Panel__NameAssignment_1 ) )
            {
            // InternalProgram.g:3290:1: ( ( rule__Panel__NameAssignment_1 ) )
            // InternalProgram.g:3291:2: ( rule__Panel__NameAssignment_1 )
            {
             before(grammarAccess.getPanelAccess().getNameAssignment_1()); 
            // InternalProgram.g:3292:2: ( rule__Panel__NameAssignment_1 )
            // InternalProgram.g:3292:3: rule__Panel__NameAssignment_1
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
    // InternalProgram.g:3300:1: rule__Panel__Group__2 : rule__Panel__Group__2__Impl rule__Panel__Group__3 ;
    public final void rule__Panel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3304:1: ( rule__Panel__Group__2__Impl rule__Panel__Group__3 )
            // InternalProgram.g:3305:2: rule__Panel__Group__2__Impl rule__Panel__Group__3
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
    // InternalProgram.g:3312:1: rule__Panel__Group__2__Impl : ( ( rule__Panel__Group_2__0 )? ) ;
    public final void rule__Panel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3316:1: ( ( ( rule__Panel__Group_2__0 )? ) )
            // InternalProgram.g:3317:1: ( ( rule__Panel__Group_2__0 )? )
            {
            // InternalProgram.g:3317:1: ( ( rule__Panel__Group_2__0 )? )
            // InternalProgram.g:3318:2: ( rule__Panel__Group_2__0 )?
            {
             before(grammarAccess.getPanelAccess().getGroup_2()); 
            // InternalProgram.g:3319:2: ( rule__Panel__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalProgram.g:3319:3: rule__Panel__Group_2__0
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
    // InternalProgram.g:3327:1: rule__Panel__Group__3 : rule__Panel__Group__3__Impl rule__Panel__Group__4 ;
    public final void rule__Panel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3331:1: ( rule__Panel__Group__3__Impl rule__Panel__Group__4 )
            // InternalProgram.g:3332:2: rule__Panel__Group__3__Impl rule__Panel__Group__4
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
    // InternalProgram.g:3339:1: rule__Panel__Group__3__Impl : ( ( rule__Panel__Group_3__0 )? ) ;
    public final void rule__Panel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3343:1: ( ( ( rule__Panel__Group_3__0 )? ) )
            // InternalProgram.g:3344:1: ( ( rule__Panel__Group_3__0 )? )
            {
            // InternalProgram.g:3344:1: ( ( rule__Panel__Group_3__0 )? )
            // InternalProgram.g:3345:2: ( rule__Panel__Group_3__0 )?
            {
             before(grammarAccess.getPanelAccess().getGroup_3()); 
            // InternalProgram.g:3346:2: ( rule__Panel__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalProgram.g:3346:3: rule__Panel__Group_3__0
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
    // InternalProgram.g:3354:1: rule__Panel__Group__4 : rule__Panel__Group__4__Impl rule__Panel__Group__5 ;
    public final void rule__Panel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3358:1: ( rule__Panel__Group__4__Impl rule__Panel__Group__5 )
            // InternalProgram.g:3359:2: rule__Panel__Group__4__Impl rule__Panel__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__Panel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group__5();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:3366:1: rule__Panel__Group__4__Impl : ( ( rule__Panel__Group_4__0 )? ) ;
    public final void rule__Panel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3370:1: ( ( ( rule__Panel__Group_4__0 )? ) )
            // InternalProgram.g:3371:1: ( ( rule__Panel__Group_4__0 )? )
            {
            // InternalProgram.g:3371:1: ( ( rule__Panel__Group_4__0 )? )
            // InternalProgram.g:3372:2: ( rule__Panel__Group_4__0 )?
            {
             before(grammarAccess.getPanelAccess().getGroup_4()); 
            // InternalProgram.g:3373:2: ( rule__Panel__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalProgram.g:3373:3: rule__Panel__Group_4__0
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


    // $ANTLR start "rule__Panel__Group__5"
    // InternalProgram.g:3381:1: rule__Panel__Group__5 : rule__Panel__Group__5__Impl ;
    public final void rule__Panel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3385:1: ( rule__Panel__Group__5__Impl )
            // InternalProgram.g:3386:2: rule__Panel__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Panel__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__5"


    // $ANTLR start "rule__Panel__Group__5__Impl"
    // InternalProgram.g:3392:1: rule__Panel__Group__5__Impl : ( ( rule__Panel__CancelledAssignment_5 )? ) ;
    public final void rule__Panel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3396:1: ( ( ( rule__Panel__CancelledAssignment_5 )? ) )
            // InternalProgram.g:3397:1: ( ( rule__Panel__CancelledAssignment_5 )? )
            {
            // InternalProgram.g:3397:1: ( ( rule__Panel__CancelledAssignment_5 )? )
            // InternalProgram.g:3398:2: ( rule__Panel__CancelledAssignment_5 )?
            {
             before(grammarAccess.getPanelAccess().getCancelledAssignment_5()); 
            // InternalProgram.g:3399:2: ( rule__Panel__CancelledAssignment_5 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==67) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalProgram.g:3399:3: rule__Panel__CancelledAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Panel__CancelledAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPanelAccess().getCancelledAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__5__Impl"


    // $ANTLR start "rule__Panel__Group_2__0"
    // InternalProgram.g:3408:1: rule__Panel__Group_2__0 : rule__Panel__Group_2__0__Impl rule__Panel__Group_2__1 ;
    public final void rule__Panel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3412:1: ( rule__Panel__Group_2__0__Impl rule__Panel__Group_2__1 )
            // InternalProgram.g:3413:2: rule__Panel__Group_2__0__Impl rule__Panel__Group_2__1
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
    // InternalProgram.g:3420:1: rule__Panel__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__Panel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3424:1: ( ( 'abstract' ) )
            // InternalProgram.g:3425:1: ( 'abstract' )
            {
            // InternalProgram.g:3425:1: ( 'abstract' )
            // InternalProgram.g:3426:2: 'abstract'
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
    // InternalProgram.g:3435:1: rule__Panel__Group_2__1 : rule__Panel__Group_2__1__Impl ;
    public final void rule__Panel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3439:1: ( rule__Panel__Group_2__1__Impl )
            // InternalProgram.g:3440:2: rule__Panel__Group_2__1__Impl
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
    // InternalProgram.g:3446:1: rule__Panel__Group_2__1__Impl : ( ( rule__Panel__AbstractAssignment_2_1 ) ) ;
    public final void rule__Panel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3450:1: ( ( ( rule__Panel__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:3451:1: ( ( rule__Panel__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:3451:1: ( ( rule__Panel__AbstractAssignment_2_1 ) )
            // InternalProgram.g:3452:2: ( rule__Panel__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getPanelAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:3453:2: ( rule__Panel__AbstractAssignment_2_1 )
            // InternalProgram.g:3453:3: rule__Panel__AbstractAssignment_2_1
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
    // InternalProgram.g:3462:1: rule__Panel__Group_3__0 : rule__Panel__Group_3__0__Impl rule__Panel__Group_3__1 ;
    public final void rule__Panel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3466:1: ( rule__Panel__Group_3__0__Impl rule__Panel__Group_3__1 )
            // InternalProgram.g:3467:2: rule__Panel__Group_3__0__Impl rule__Panel__Group_3__1
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
    // InternalProgram.g:3474:1: rule__Panel__Group_3__0__Impl : ( 'panelists' ) ;
    public final void rule__Panel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3478:1: ( ( 'panelists' ) )
            // InternalProgram.g:3479:1: ( 'panelists' )
            {
            // InternalProgram.g:3479:1: ( 'panelists' )
            // InternalProgram.g:3480:2: 'panelists'
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
    // InternalProgram.g:3489:1: rule__Panel__Group_3__1 : rule__Panel__Group_3__1__Impl rule__Panel__Group_3__2 ;
    public final void rule__Panel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3493:1: ( rule__Panel__Group_3__1__Impl rule__Panel__Group_3__2 )
            // InternalProgram.g:3494:2: rule__Panel__Group_3__1__Impl rule__Panel__Group_3__2
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
    // InternalProgram.g:3501:1: rule__Panel__Group_3__1__Impl : ( ( rule__Panel__PanelistsAssignment_3_1 ) ) ;
    public final void rule__Panel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3505:1: ( ( ( rule__Panel__PanelistsAssignment_3_1 ) ) )
            // InternalProgram.g:3506:1: ( ( rule__Panel__PanelistsAssignment_3_1 ) )
            {
            // InternalProgram.g:3506:1: ( ( rule__Panel__PanelistsAssignment_3_1 ) )
            // InternalProgram.g:3507:2: ( rule__Panel__PanelistsAssignment_3_1 )
            {
             before(grammarAccess.getPanelAccess().getPanelistsAssignment_3_1()); 
            // InternalProgram.g:3508:2: ( rule__Panel__PanelistsAssignment_3_1 )
            // InternalProgram.g:3508:3: rule__Panel__PanelistsAssignment_3_1
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
    // InternalProgram.g:3516:1: rule__Panel__Group_3__2 : rule__Panel__Group_3__2__Impl ;
    public final void rule__Panel__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3520:1: ( rule__Panel__Group_3__2__Impl )
            // InternalProgram.g:3521:2: rule__Panel__Group_3__2__Impl
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
    // InternalProgram.g:3527:1: rule__Panel__Group_3__2__Impl : ( ( rule__Panel__Group_3_2__0 )* ) ;
    public final void rule__Panel__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3531:1: ( ( ( rule__Panel__Group_3_2__0 )* ) )
            // InternalProgram.g:3532:1: ( ( rule__Panel__Group_3_2__0 )* )
            {
            // InternalProgram.g:3532:1: ( ( rule__Panel__Group_3_2__0 )* )
            // InternalProgram.g:3533:2: ( rule__Panel__Group_3_2__0 )*
            {
             before(grammarAccess.getPanelAccess().getGroup_3_2()); 
            // InternalProgram.g:3534:2: ( rule__Panel__Group_3_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==21) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalProgram.g:3534:3: rule__Panel__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Panel__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalProgram.g:3543:1: rule__Panel__Group_3_2__0 : rule__Panel__Group_3_2__0__Impl rule__Panel__Group_3_2__1 ;
    public final void rule__Panel__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3547:1: ( rule__Panel__Group_3_2__0__Impl rule__Panel__Group_3_2__1 )
            // InternalProgram.g:3548:2: rule__Panel__Group_3_2__0__Impl rule__Panel__Group_3_2__1
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
    // InternalProgram.g:3555:1: rule__Panel__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Panel__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3559:1: ( ( ',' ) )
            // InternalProgram.g:3560:1: ( ',' )
            {
            // InternalProgram.g:3560:1: ( ',' )
            // InternalProgram.g:3561:2: ','
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
    // InternalProgram.g:3570:1: rule__Panel__Group_3_2__1 : rule__Panel__Group_3_2__1__Impl ;
    public final void rule__Panel__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3574:1: ( rule__Panel__Group_3_2__1__Impl )
            // InternalProgram.g:3575:2: rule__Panel__Group_3_2__1__Impl
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
    // InternalProgram.g:3581:1: rule__Panel__Group_3_2__1__Impl : ( ( rule__Panel__PanelistsAssignment_3_2_1 ) ) ;
    public final void rule__Panel__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3585:1: ( ( ( rule__Panel__PanelistsAssignment_3_2_1 ) ) )
            // InternalProgram.g:3586:1: ( ( rule__Panel__PanelistsAssignment_3_2_1 ) )
            {
            // InternalProgram.g:3586:1: ( ( rule__Panel__PanelistsAssignment_3_2_1 ) )
            // InternalProgram.g:3587:2: ( rule__Panel__PanelistsAssignment_3_2_1 )
            {
             before(grammarAccess.getPanelAccess().getPanelistsAssignment_3_2_1()); 
            // InternalProgram.g:3588:2: ( rule__Panel__PanelistsAssignment_3_2_1 )
            // InternalProgram.g:3588:3: rule__Panel__PanelistsAssignment_3_2_1
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
    // InternalProgram.g:3597:1: rule__Panel__Group_4__0 : rule__Panel__Group_4__0__Impl rule__Panel__Group_4__1 ;
    public final void rule__Panel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3601:1: ( rule__Panel__Group_4__0__Impl rule__Panel__Group_4__1 )
            // InternalProgram.g:3602:2: rule__Panel__Group_4__0__Impl rule__Panel__Group_4__1
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
    // InternalProgram.g:3609:1: rule__Panel__Group_4__0__Impl : ( 'moderators' ) ;
    public final void rule__Panel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3613:1: ( ( 'moderators' ) )
            // InternalProgram.g:3614:1: ( 'moderators' )
            {
            // InternalProgram.g:3614:1: ( 'moderators' )
            // InternalProgram.g:3615:2: 'moderators'
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
    // InternalProgram.g:3624:1: rule__Panel__Group_4__1 : rule__Panel__Group_4__1__Impl rule__Panel__Group_4__2 ;
    public final void rule__Panel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3628:1: ( rule__Panel__Group_4__1__Impl rule__Panel__Group_4__2 )
            // InternalProgram.g:3629:2: rule__Panel__Group_4__1__Impl rule__Panel__Group_4__2
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
    // InternalProgram.g:3636:1: rule__Panel__Group_4__1__Impl : ( ( rule__Panel__ModeratorsAssignment_4_1 ) ) ;
    public final void rule__Panel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3640:1: ( ( ( rule__Panel__ModeratorsAssignment_4_1 ) ) )
            // InternalProgram.g:3641:1: ( ( rule__Panel__ModeratorsAssignment_4_1 ) )
            {
            // InternalProgram.g:3641:1: ( ( rule__Panel__ModeratorsAssignment_4_1 ) )
            // InternalProgram.g:3642:2: ( rule__Panel__ModeratorsAssignment_4_1 )
            {
             before(grammarAccess.getPanelAccess().getModeratorsAssignment_4_1()); 
            // InternalProgram.g:3643:2: ( rule__Panel__ModeratorsAssignment_4_1 )
            // InternalProgram.g:3643:3: rule__Panel__ModeratorsAssignment_4_1
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
    // InternalProgram.g:3651:1: rule__Panel__Group_4__2 : rule__Panel__Group_4__2__Impl ;
    public final void rule__Panel__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3655:1: ( rule__Panel__Group_4__2__Impl )
            // InternalProgram.g:3656:2: rule__Panel__Group_4__2__Impl
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
    // InternalProgram.g:3662:1: rule__Panel__Group_4__2__Impl : ( ( rule__Panel__Group_4_2__0 )* ) ;
    public final void rule__Panel__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3666:1: ( ( ( rule__Panel__Group_4_2__0 )* ) )
            // InternalProgram.g:3667:1: ( ( rule__Panel__Group_4_2__0 )* )
            {
            // InternalProgram.g:3667:1: ( ( rule__Panel__Group_4_2__0 )* )
            // InternalProgram.g:3668:2: ( rule__Panel__Group_4_2__0 )*
            {
             before(grammarAccess.getPanelAccess().getGroup_4_2()); 
            // InternalProgram.g:3669:2: ( rule__Panel__Group_4_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==21) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalProgram.g:3669:3: rule__Panel__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Panel__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalProgram.g:3678:1: rule__Panel__Group_4_2__0 : rule__Panel__Group_4_2__0__Impl rule__Panel__Group_4_2__1 ;
    public final void rule__Panel__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3682:1: ( rule__Panel__Group_4_2__0__Impl rule__Panel__Group_4_2__1 )
            // InternalProgram.g:3683:2: rule__Panel__Group_4_2__0__Impl rule__Panel__Group_4_2__1
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
    // InternalProgram.g:3690:1: rule__Panel__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Panel__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3694:1: ( ( ',' ) )
            // InternalProgram.g:3695:1: ( ',' )
            {
            // InternalProgram.g:3695:1: ( ',' )
            // InternalProgram.g:3696:2: ','
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
    // InternalProgram.g:3705:1: rule__Panel__Group_4_2__1 : rule__Panel__Group_4_2__1__Impl ;
    public final void rule__Panel__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3709:1: ( rule__Panel__Group_4_2__1__Impl )
            // InternalProgram.g:3710:2: rule__Panel__Group_4_2__1__Impl
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
    // InternalProgram.g:3716:1: rule__Panel__Group_4_2__1__Impl : ( ( rule__Panel__ModeratorsAssignment_4_2_1 ) ) ;
    public final void rule__Panel__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3720:1: ( ( ( rule__Panel__ModeratorsAssignment_4_2_1 ) ) )
            // InternalProgram.g:3721:1: ( ( rule__Panel__ModeratorsAssignment_4_2_1 ) )
            {
            // InternalProgram.g:3721:1: ( ( rule__Panel__ModeratorsAssignment_4_2_1 ) )
            // InternalProgram.g:3722:2: ( rule__Panel__ModeratorsAssignment_4_2_1 )
            {
             before(grammarAccess.getPanelAccess().getModeratorsAssignment_4_2_1()); 
            // InternalProgram.g:3723:2: ( rule__Panel__ModeratorsAssignment_4_2_1 )
            // InternalProgram.g:3723:3: rule__Panel__ModeratorsAssignment_4_2_1
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
    // InternalProgram.g:3732:1: rule__SRC__Group__0 : rule__SRC__Group__0__Impl rule__SRC__Group__1 ;
    public final void rule__SRC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3736:1: ( rule__SRC__Group__0__Impl rule__SRC__Group__1 )
            // InternalProgram.g:3737:2: rule__SRC__Group__0__Impl rule__SRC__Group__1
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
    // InternalProgram.g:3744:1: rule__SRC__Group__0__Impl : ( 'SRC' ) ;
    public final void rule__SRC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3748:1: ( ( 'SRC' ) )
            // InternalProgram.g:3749:1: ( 'SRC' )
            {
            // InternalProgram.g:3749:1: ( 'SRC' )
            // InternalProgram.g:3750:2: 'SRC'
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
    // InternalProgram.g:3759:1: rule__SRC__Group__1 : rule__SRC__Group__1__Impl rule__SRC__Group__2 ;
    public final void rule__SRC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3763:1: ( rule__SRC__Group__1__Impl rule__SRC__Group__2 )
            // InternalProgram.g:3764:2: rule__SRC__Group__1__Impl rule__SRC__Group__2
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
    // InternalProgram.g:3771:1: rule__SRC__Group__1__Impl : ( ( rule__SRC__NameAssignment_1 ) ) ;
    public final void rule__SRC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3775:1: ( ( ( rule__SRC__NameAssignment_1 ) ) )
            // InternalProgram.g:3776:1: ( ( rule__SRC__NameAssignment_1 ) )
            {
            // InternalProgram.g:3776:1: ( ( rule__SRC__NameAssignment_1 ) )
            // InternalProgram.g:3777:2: ( rule__SRC__NameAssignment_1 )
            {
             before(grammarAccess.getSRCAccess().getNameAssignment_1()); 
            // InternalProgram.g:3778:2: ( rule__SRC__NameAssignment_1 )
            // InternalProgram.g:3778:3: rule__SRC__NameAssignment_1
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
    // InternalProgram.g:3786:1: rule__SRC__Group__2 : rule__SRC__Group__2__Impl rule__SRC__Group__3 ;
    public final void rule__SRC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3790:1: ( rule__SRC__Group__2__Impl rule__SRC__Group__3 )
            // InternalProgram.g:3791:2: rule__SRC__Group__2__Impl rule__SRC__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__SRC__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SRC__Group__3();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:3798:1: rule__SRC__Group__2__Impl : ( ( rule__SRC__Group_2__0 )? ) ;
    public final void rule__SRC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3802:1: ( ( ( rule__SRC__Group_2__0 )? ) )
            // InternalProgram.g:3803:1: ( ( rule__SRC__Group_2__0 )? )
            {
            // InternalProgram.g:3803:1: ( ( rule__SRC__Group_2__0 )? )
            // InternalProgram.g:3804:2: ( rule__SRC__Group_2__0 )?
            {
             before(grammarAccess.getSRCAccess().getGroup_2()); 
            // InternalProgram.g:3805:2: ( rule__SRC__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==38) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalProgram.g:3805:3: rule__SRC__Group_2__0
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


    // $ANTLR start "rule__SRC__Group__3"
    // InternalProgram.g:3813:1: rule__SRC__Group__3 : rule__SRC__Group__3__Impl rule__SRC__Group__4 ;
    public final void rule__SRC__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3817:1: ( rule__SRC__Group__3__Impl rule__SRC__Group__4 )
            // InternalProgram.g:3818:2: rule__SRC__Group__3__Impl rule__SRC__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__SRC__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SRC__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRC__Group__3"


    // $ANTLR start "rule__SRC__Group__3__Impl"
    // InternalProgram.g:3825:1: rule__SRC__Group__3__Impl : ( ( rule__SRC__Group_3__0 )? ) ;
    public final void rule__SRC__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3829:1: ( ( ( rule__SRC__Group_3__0 )? ) )
            // InternalProgram.g:3830:1: ( ( rule__SRC__Group_3__0 )? )
            {
            // InternalProgram.g:3830:1: ( ( rule__SRC__Group_3__0 )? )
            // InternalProgram.g:3831:2: ( rule__SRC__Group_3__0 )?
            {
             before(grammarAccess.getSRCAccess().getGroup_3()); 
            // InternalProgram.g:3832:2: ( rule__SRC__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==43) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalProgram.g:3832:3: rule__SRC__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SRC__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSRCAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRC__Group__3__Impl"


    // $ANTLR start "rule__SRC__Group__4"
    // InternalProgram.g:3840:1: rule__SRC__Group__4 : rule__SRC__Group__4__Impl ;
    public final void rule__SRC__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3844:1: ( rule__SRC__Group__4__Impl )
            // InternalProgram.g:3845:2: rule__SRC__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SRC__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRC__Group__4"


    // $ANTLR start "rule__SRC__Group__4__Impl"
    // InternalProgram.g:3851:1: rule__SRC__Group__4__Impl : ( ( rule__SRC__CancelledAssignment_4 )? ) ;
    public final void rule__SRC__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3855:1: ( ( ( rule__SRC__CancelledAssignment_4 )? ) )
            // InternalProgram.g:3856:1: ( ( rule__SRC__CancelledAssignment_4 )? )
            {
            // InternalProgram.g:3856:1: ( ( rule__SRC__CancelledAssignment_4 )? )
            // InternalProgram.g:3857:2: ( rule__SRC__CancelledAssignment_4 )?
            {
             before(grammarAccess.getSRCAccess().getCancelledAssignment_4()); 
            // InternalProgram.g:3858:2: ( rule__SRC__CancelledAssignment_4 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==67) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalProgram.g:3858:3: rule__SRC__CancelledAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__SRC__CancelledAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSRCAccess().getCancelledAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRC__Group__4__Impl"


    // $ANTLR start "rule__SRC__Group_2__0"
    // InternalProgram.g:3867:1: rule__SRC__Group_2__0 : rule__SRC__Group_2__0__Impl rule__SRC__Group_2__1 ;
    public final void rule__SRC__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3871:1: ( rule__SRC__Group_2__0__Impl rule__SRC__Group_2__1 )
            // InternalProgram.g:3872:2: rule__SRC__Group_2__0__Impl rule__SRC__Group_2__1
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
    // InternalProgram.g:3879:1: rule__SRC__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__SRC__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3883:1: ( ( 'abstract' ) )
            // InternalProgram.g:3884:1: ( 'abstract' )
            {
            // InternalProgram.g:3884:1: ( 'abstract' )
            // InternalProgram.g:3885:2: 'abstract'
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
    // InternalProgram.g:3894:1: rule__SRC__Group_2__1 : rule__SRC__Group_2__1__Impl ;
    public final void rule__SRC__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3898:1: ( rule__SRC__Group_2__1__Impl )
            // InternalProgram.g:3899:2: rule__SRC__Group_2__1__Impl
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
    // InternalProgram.g:3905:1: rule__SRC__Group_2__1__Impl : ( ( rule__SRC__AbstractAssignment_2_1 ) ) ;
    public final void rule__SRC__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3909:1: ( ( ( rule__SRC__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:3910:1: ( ( rule__SRC__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:3910:1: ( ( rule__SRC__AbstractAssignment_2_1 ) )
            // InternalProgram.g:3911:2: ( rule__SRC__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getSRCAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:3912:2: ( rule__SRC__AbstractAssignment_2_1 )
            // InternalProgram.g:3912:3: rule__SRC__AbstractAssignment_2_1
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


    // $ANTLR start "rule__SRC__Group_3__0"
    // InternalProgram.g:3921:1: rule__SRC__Group_3__0 : rule__SRC__Group_3__0__Impl rule__SRC__Group_3__1 ;
    public final void rule__SRC__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3925:1: ( rule__SRC__Group_3__0__Impl rule__SRC__Group_3__1 )
            // InternalProgram.g:3926:2: rule__SRC__Group_3__0__Impl rule__SRC__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__SRC__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SRC__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRC__Group_3__0"


    // $ANTLR start "rule__SRC__Group_3__0__Impl"
    // InternalProgram.g:3933:1: rule__SRC__Group_3__0__Impl : ( 'url' ) ;
    public final void rule__SRC__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3937:1: ( ( 'url' ) )
            // InternalProgram.g:3938:1: ( 'url' )
            {
            // InternalProgram.g:3938:1: ( 'url' )
            // InternalProgram.g:3939:2: 'url'
            {
             before(grammarAccess.getSRCAccess().getUrlKeyword_3_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSRCAccess().getUrlKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRC__Group_3__0__Impl"


    // $ANTLR start "rule__SRC__Group_3__1"
    // InternalProgram.g:3948:1: rule__SRC__Group_3__1 : rule__SRC__Group_3__1__Impl ;
    public final void rule__SRC__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3952:1: ( rule__SRC__Group_3__1__Impl )
            // InternalProgram.g:3953:2: rule__SRC__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SRC__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRC__Group_3__1"


    // $ANTLR start "rule__SRC__Group_3__1__Impl"
    // InternalProgram.g:3959:1: rule__SRC__Group_3__1__Impl : ( ( rule__SRC__UrlAssignment_3_1 ) ) ;
    public final void rule__SRC__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3963:1: ( ( ( rule__SRC__UrlAssignment_3_1 ) ) )
            // InternalProgram.g:3964:1: ( ( rule__SRC__UrlAssignment_3_1 ) )
            {
            // InternalProgram.g:3964:1: ( ( rule__SRC__UrlAssignment_3_1 ) )
            // InternalProgram.g:3965:2: ( rule__SRC__UrlAssignment_3_1 )
            {
             before(grammarAccess.getSRCAccess().getUrlAssignment_3_1()); 
            // InternalProgram.g:3966:2: ( rule__SRC__UrlAssignment_3_1 )
            // InternalProgram.g:3966:3: rule__SRC__UrlAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SRC__UrlAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSRCAccess().getUrlAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRC__Group_3__1__Impl"


    // $ANTLR start "rule__Poster__Group__0"
    // InternalProgram.g:3975:1: rule__Poster__Group__0 : rule__Poster__Group__0__Impl rule__Poster__Group__1 ;
    public final void rule__Poster__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3979:1: ( rule__Poster__Group__0__Impl rule__Poster__Group__1 )
            // InternalProgram.g:3980:2: rule__Poster__Group__0__Impl rule__Poster__Group__1
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
    // InternalProgram.g:3987:1: rule__Poster__Group__0__Impl : ( 'Poster' ) ;
    public final void rule__Poster__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3991:1: ( ( 'Poster' ) )
            // InternalProgram.g:3992:1: ( 'Poster' )
            {
            // InternalProgram.g:3992:1: ( 'Poster' )
            // InternalProgram.g:3993:2: 'Poster'
            {
             before(grammarAccess.getPosterAccess().getPosterKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalProgram.g:4002:1: rule__Poster__Group__1 : rule__Poster__Group__1__Impl rule__Poster__Group__2 ;
    public final void rule__Poster__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4006:1: ( rule__Poster__Group__1__Impl rule__Poster__Group__2 )
            // InternalProgram.g:4007:2: rule__Poster__Group__1__Impl rule__Poster__Group__2
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
    // InternalProgram.g:4014:1: rule__Poster__Group__1__Impl : ( ( rule__Poster__NameAssignment_1 ) ) ;
    public final void rule__Poster__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4018:1: ( ( ( rule__Poster__NameAssignment_1 ) ) )
            // InternalProgram.g:4019:1: ( ( rule__Poster__NameAssignment_1 ) )
            {
            // InternalProgram.g:4019:1: ( ( rule__Poster__NameAssignment_1 ) )
            // InternalProgram.g:4020:2: ( rule__Poster__NameAssignment_1 )
            {
             before(grammarAccess.getPosterAccess().getNameAssignment_1()); 
            // InternalProgram.g:4021:2: ( rule__Poster__NameAssignment_1 )
            // InternalProgram.g:4021:3: rule__Poster__NameAssignment_1
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
    // InternalProgram.g:4029:1: rule__Poster__Group__2 : rule__Poster__Group__2__Impl rule__Poster__Group__3 ;
    public final void rule__Poster__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4033:1: ( rule__Poster__Group__2__Impl rule__Poster__Group__3 )
            // InternalProgram.g:4034:2: rule__Poster__Group__2__Impl rule__Poster__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Poster__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Poster__Group__3();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:4041:1: rule__Poster__Group__2__Impl : ( ( rule__Poster__Group_2__0 )? ) ;
    public final void rule__Poster__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4045:1: ( ( ( rule__Poster__Group_2__0 )? ) )
            // InternalProgram.g:4046:1: ( ( rule__Poster__Group_2__0 )? )
            {
            // InternalProgram.g:4046:1: ( ( rule__Poster__Group_2__0 )? )
            // InternalProgram.g:4047:2: ( rule__Poster__Group_2__0 )?
            {
             before(grammarAccess.getPosterAccess().getGroup_2()); 
            // InternalProgram.g:4048:2: ( rule__Poster__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalProgram.g:4048:3: rule__Poster__Group_2__0
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


    // $ANTLR start "rule__Poster__Group__3"
    // InternalProgram.g:4056:1: rule__Poster__Group__3 : rule__Poster__Group__3__Impl rule__Poster__Group__4 ;
    public final void rule__Poster__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4060:1: ( rule__Poster__Group__3__Impl rule__Poster__Group__4 )
            // InternalProgram.g:4061:2: rule__Poster__Group__3__Impl rule__Poster__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Poster__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Poster__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poster__Group__3"


    // $ANTLR start "rule__Poster__Group__3__Impl"
    // InternalProgram.g:4068:1: rule__Poster__Group__3__Impl : ( ( rule__Poster__Group_3__0 )? ) ;
    public final void rule__Poster__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4072:1: ( ( ( rule__Poster__Group_3__0 )? ) )
            // InternalProgram.g:4073:1: ( ( rule__Poster__Group_3__0 )? )
            {
            // InternalProgram.g:4073:1: ( ( rule__Poster__Group_3__0 )? )
            // InternalProgram.g:4074:2: ( rule__Poster__Group_3__0 )?
            {
             before(grammarAccess.getPosterAccess().getGroup_3()); 
            // InternalProgram.g:4075:2: ( rule__Poster__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==43) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalProgram.g:4075:3: rule__Poster__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Poster__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPosterAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poster__Group__3__Impl"


    // $ANTLR start "rule__Poster__Group__4"
    // InternalProgram.g:4083:1: rule__Poster__Group__4 : rule__Poster__Group__4__Impl ;
    public final void rule__Poster__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4087:1: ( rule__Poster__Group__4__Impl )
            // InternalProgram.g:4088:2: rule__Poster__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Poster__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poster__Group__4"


    // $ANTLR start "rule__Poster__Group__4__Impl"
    // InternalProgram.g:4094:1: rule__Poster__Group__4__Impl : ( ( rule__Poster__CancelledAssignment_4 )? ) ;
    public final void rule__Poster__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4098:1: ( ( ( rule__Poster__CancelledAssignment_4 )? ) )
            // InternalProgram.g:4099:1: ( ( rule__Poster__CancelledAssignment_4 )? )
            {
            // InternalProgram.g:4099:1: ( ( rule__Poster__CancelledAssignment_4 )? )
            // InternalProgram.g:4100:2: ( rule__Poster__CancelledAssignment_4 )?
            {
             before(grammarAccess.getPosterAccess().getCancelledAssignment_4()); 
            // InternalProgram.g:4101:2: ( rule__Poster__CancelledAssignment_4 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==67) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalProgram.g:4101:3: rule__Poster__CancelledAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Poster__CancelledAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPosterAccess().getCancelledAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poster__Group__4__Impl"


    // $ANTLR start "rule__Poster__Group_2__0"
    // InternalProgram.g:4110:1: rule__Poster__Group_2__0 : rule__Poster__Group_2__0__Impl rule__Poster__Group_2__1 ;
    public final void rule__Poster__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4114:1: ( rule__Poster__Group_2__0__Impl rule__Poster__Group_2__1 )
            // InternalProgram.g:4115:2: rule__Poster__Group_2__0__Impl rule__Poster__Group_2__1
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
    // InternalProgram.g:4122:1: rule__Poster__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__Poster__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4126:1: ( ( 'abstract' ) )
            // InternalProgram.g:4127:1: ( 'abstract' )
            {
            // InternalProgram.g:4127:1: ( 'abstract' )
            // InternalProgram.g:4128:2: 'abstract'
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
    // InternalProgram.g:4137:1: rule__Poster__Group_2__1 : rule__Poster__Group_2__1__Impl ;
    public final void rule__Poster__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4141:1: ( rule__Poster__Group_2__1__Impl )
            // InternalProgram.g:4142:2: rule__Poster__Group_2__1__Impl
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
    // InternalProgram.g:4148:1: rule__Poster__Group_2__1__Impl : ( ( rule__Poster__AbstractAssignment_2_1 ) ) ;
    public final void rule__Poster__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4152:1: ( ( ( rule__Poster__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:4153:1: ( ( rule__Poster__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:4153:1: ( ( rule__Poster__AbstractAssignment_2_1 ) )
            // InternalProgram.g:4154:2: ( rule__Poster__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getPosterAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:4155:2: ( rule__Poster__AbstractAssignment_2_1 )
            // InternalProgram.g:4155:3: rule__Poster__AbstractAssignment_2_1
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


    // $ANTLR start "rule__Poster__Group_3__0"
    // InternalProgram.g:4164:1: rule__Poster__Group_3__0 : rule__Poster__Group_3__0__Impl rule__Poster__Group_3__1 ;
    public final void rule__Poster__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4168:1: ( rule__Poster__Group_3__0__Impl rule__Poster__Group_3__1 )
            // InternalProgram.g:4169:2: rule__Poster__Group_3__0__Impl rule__Poster__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Poster__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Poster__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poster__Group_3__0"


    // $ANTLR start "rule__Poster__Group_3__0__Impl"
    // InternalProgram.g:4176:1: rule__Poster__Group_3__0__Impl : ( 'url' ) ;
    public final void rule__Poster__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4180:1: ( ( 'url' ) )
            // InternalProgram.g:4181:1: ( 'url' )
            {
            // InternalProgram.g:4181:1: ( 'url' )
            // InternalProgram.g:4182:2: 'url'
            {
             before(grammarAccess.getPosterAccess().getUrlKeyword_3_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getPosterAccess().getUrlKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poster__Group_3__0__Impl"


    // $ANTLR start "rule__Poster__Group_3__1"
    // InternalProgram.g:4191:1: rule__Poster__Group_3__1 : rule__Poster__Group_3__1__Impl ;
    public final void rule__Poster__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4195:1: ( rule__Poster__Group_3__1__Impl )
            // InternalProgram.g:4196:2: rule__Poster__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Poster__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poster__Group_3__1"


    // $ANTLR start "rule__Poster__Group_3__1__Impl"
    // InternalProgram.g:4202:1: rule__Poster__Group_3__1__Impl : ( ( rule__Poster__UrlAssignment_3_1 ) ) ;
    public final void rule__Poster__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4206:1: ( ( ( rule__Poster__UrlAssignment_3_1 ) ) )
            // InternalProgram.g:4207:1: ( ( rule__Poster__UrlAssignment_3_1 ) )
            {
            // InternalProgram.g:4207:1: ( ( rule__Poster__UrlAssignment_3_1 ) )
            // InternalProgram.g:4208:2: ( rule__Poster__UrlAssignment_3_1 )
            {
             before(grammarAccess.getPosterAccess().getUrlAssignment_3_1()); 
            // InternalProgram.g:4209:2: ( rule__Poster__UrlAssignment_3_1 )
            // InternalProgram.g:4209:3: rule__Poster__UrlAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Poster__UrlAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPosterAccess().getUrlAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poster__Group_3__1__Impl"


    // $ANTLR start "rule__Keynote__Group__0"
    // InternalProgram.g:4218:1: rule__Keynote__Group__0 : rule__Keynote__Group__0__Impl rule__Keynote__Group__1 ;
    public final void rule__Keynote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4222:1: ( rule__Keynote__Group__0__Impl rule__Keynote__Group__1 )
            // InternalProgram.g:4223:2: rule__Keynote__Group__0__Impl rule__Keynote__Group__1
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
    // InternalProgram.g:4230:1: rule__Keynote__Group__0__Impl : ( 'Keynote' ) ;
    public final void rule__Keynote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4234:1: ( ( 'Keynote' ) )
            // InternalProgram.g:4235:1: ( 'Keynote' )
            {
            // InternalProgram.g:4235:1: ( 'Keynote' )
            // InternalProgram.g:4236:2: 'Keynote'
            {
             before(grammarAccess.getKeynoteAccess().getKeynoteKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalProgram.g:4245:1: rule__Keynote__Group__1 : rule__Keynote__Group__1__Impl rule__Keynote__Group__2 ;
    public final void rule__Keynote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4249:1: ( rule__Keynote__Group__1__Impl rule__Keynote__Group__2 )
            // InternalProgram.g:4250:2: rule__Keynote__Group__1__Impl rule__Keynote__Group__2
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
    // InternalProgram.g:4257:1: rule__Keynote__Group__1__Impl : ( ( rule__Keynote__NameAssignment_1 ) ) ;
    public final void rule__Keynote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4261:1: ( ( ( rule__Keynote__NameAssignment_1 ) ) )
            // InternalProgram.g:4262:1: ( ( rule__Keynote__NameAssignment_1 ) )
            {
            // InternalProgram.g:4262:1: ( ( rule__Keynote__NameAssignment_1 ) )
            // InternalProgram.g:4263:2: ( rule__Keynote__NameAssignment_1 )
            {
             before(grammarAccess.getKeynoteAccess().getNameAssignment_1()); 
            // InternalProgram.g:4264:2: ( rule__Keynote__NameAssignment_1 )
            // InternalProgram.g:4264:3: rule__Keynote__NameAssignment_1
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
    // InternalProgram.g:4272:1: rule__Keynote__Group__2 : rule__Keynote__Group__2__Impl rule__Keynote__Group__3 ;
    public final void rule__Keynote__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4276:1: ( rule__Keynote__Group__2__Impl rule__Keynote__Group__3 )
            // InternalProgram.g:4277:2: rule__Keynote__Group__2__Impl rule__Keynote__Group__3
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
    // InternalProgram.g:4284:1: rule__Keynote__Group__2__Impl : ( ( rule__Keynote__Group_2__0 )? ) ;
    public final void rule__Keynote__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4288:1: ( ( ( rule__Keynote__Group_2__0 )? ) )
            // InternalProgram.g:4289:1: ( ( rule__Keynote__Group_2__0 )? )
            {
            // InternalProgram.g:4289:1: ( ( rule__Keynote__Group_2__0 )? )
            // InternalProgram.g:4290:2: ( rule__Keynote__Group_2__0 )?
            {
             before(grammarAccess.getKeynoteAccess().getGroup_2()); 
            // InternalProgram.g:4291:2: ( rule__Keynote__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==38) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalProgram.g:4291:3: rule__Keynote__Group_2__0
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
    // InternalProgram.g:4299:1: rule__Keynote__Group__3 : rule__Keynote__Group__3__Impl rule__Keynote__Group__4 ;
    public final void rule__Keynote__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4303:1: ( rule__Keynote__Group__3__Impl rule__Keynote__Group__4 )
            // InternalProgram.g:4304:2: rule__Keynote__Group__3__Impl rule__Keynote__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Keynote__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Keynote__Group__4();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:4311:1: rule__Keynote__Group__3__Impl : ( ( rule__Keynote__Group_3__0 )? ) ;
    public final void rule__Keynote__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4315:1: ( ( ( rule__Keynote__Group_3__0 )? ) )
            // InternalProgram.g:4316:1: ( ( rule__Keynote__Group_3__0 )? )
            {
            // InternalProgram.g:4316:1: ( ( rule__Keynote__Group_3__0 )? )
            // InternalProgram.g:4317:2: ( rule__Keynote__Group_3__0 )?
            {
             before(grammarAccess.getKeynoteAccess().getGroup_3()); 
            // InternalProgram.g:4318:2: ( rule__Keynote__Group_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==46) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalProgram.g:4318:3: rule__Keynote__Group_3__0
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


    // $ANTLR start "rule__Keynote__Group__4"
    // InternalProgram.g:4326:1: rule__Keynote__Group__4 : rule__Keynote__Group__4__Impl rule__Keynote__Group__5 ;
    public final void rule__Keynote__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4330:1: ( rule__Keynote__Group__4__Impl rule__Keynote__Group__5 )
            // InternalProgram.g:4331:2: rule__Keynote__Group__4__Impl rule__Keynote__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__Keynote__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Keynote__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__Group__4"


    // $ANTLR start "rule__Keynote__Group__4__Impl"
    // InternalProgram.g:4338:1: rule__Keynote__Group__4__Impl : ( ( rule__Keynote__Group_4__0 )? ) ;
    public final void rule__Keynote__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4342:1: ( ( ( rule__Keynote__Group_4__0 )? ) )
            // InternalProgram.g:4343:1: ( ( rule__Keynote__Group_4__0 )? )
            {
            // InternalProgram.g:4343:1: ( ( rule__Keynote__Group_4__0 )? )
            // InternalProgram.g:4344:2: ( rule__Keynote__Group_4__0 )?
            {
             before(grammarAccess.getKeynoteAccess().getGroup_4()); 
            // InternalProgram.g:4345:2: ( rule__Keynote__Group_4__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==37) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalProgram.g:4345:3: rule__Keynote__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Keynote__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKeynoteAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__Group__4__Impl"


    // $ANTLR start "rule__Keynote__Group__5"
    // InternalProgram.g:4353:1: rule__Keynote__Group__5 : rule__Keynote__Group__5__Impl ;
    public final void rule__Keynote__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4357:1: ( rule__Keynote__Group__5__Impl )
            // InternalProgram.g:4358:2: rule__Keynote__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Keynote__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__Group__5"


    // $ANTLR start "rule__Keynote__Group__5__Impl"
    // InternalProgram.g:4364:1: rule__Keynote__Group__5__Impl : ( ( rule__Keynote__CancelledAssignment_5 )? ) ;
    public final void rule__Keynote__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4368:1: ( ( ( rule__Keynote__CancelledAssignment_5 )? ) )
            // InternalProgram.g:4369:1: ( ( rule__Keynote__CancelledAssignment_5 )? )
            {
            // InternalProgram.g:4369:1: ( ( rule__Keynote__CancelledAssignment_5 )? )
            // InternalProgram.g:4370:2: ( rule__Keynote__CancelledAssignment_5 )?
            {
             before(grammarAccess.getKeynoteAccess().getCancelledAssignment_5()); 
            // InternalProgram.g:4371:2: ( rule__Keynote__CancelledAssignment_5 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==67) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalProgram.g:4371:3: rule__Keynote__CancelledAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Keynote__CancelledAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKeynoteAccess().getCancelledAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__Group__5__Impl"


    // $ANTLR start "rule__Keynote__Group_2__0"
    // InternalProgram.g:4380:1: rule__Keynote__Group_2__0 : rule__Keynote__Group_2__0__Impl rule__Keynote__Group_2__1 ;
    public final void rule__Keynote__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4384:1: ( rule__Keynote__Group_2__0__Impl rule__Keynote__Group_2__1 )
            // InternalProgram.g:4385:2: rule__Keynote__Group_2__0__Impl rule__Keynote__Group_2__1
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
    // InternalProgram.g:4392:1: rule__Keynote__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__Keynote__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4396:1: ( ( 'abstract' ) )
            // InternalProgram.g:4397:1: ( 'abstract' )
            {
            // InternalProgram.g:4397:1: ( 'abstract' )
            // InternalProgram.g:4398:2: 'abstract'
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
    // InternalProgram.g:4407:1: rule__Keynote__Group_2__1 : rule__Keynote__Group_2__1__Impl ;
    public final void rule__Keynote__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4411:1: ( rule__Keynote__Group_2__1__Impl )
            // InternalProgram.g:4412:2: rule__Keynote__Group_2__1__Impl
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
    // InternalProgram.g:4418:1: rule__Keynote__Group_2__1__Impl : ( ( rule__Keynote__AbstractAssignment_2_1 ) ) ;
    public final void rule__Keynote__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4422:1: ( ( ( rule__Keynote__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:4423:1: ( ( rule__Keynote__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:4423:1: ( ( rule__Keynote__AbstractAssignment_2_1 ) )
            // InternalProgram.g:4424:2: ( rule__Keynote__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getKeynoteAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:4425:2: ( rule__Keynote__AbstractAssignment_2_1 )
            // InternalProgram.g:4425:3: rule__Keynote__AbstractAssignment_2_1
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
    // InternalProgram.g:4434:1: rule__Keynote__Group_3__0 : rule__Keynote__Group_3__0__Impl rule__Keynote__Group_3__1 ;
    public final void rule__Keynote__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4438:1: ( rule__Keynote__Group_3__0__Impl rule__Keynote__Group_3__1 )
            // InternalProgram.g:4439:2: rule__Keynote__Group_3__0__Impl rule__Keynote__Group_3__1
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
    // InternalProgram.g:4446:1: rule__Keynote__Group_3__0__Impl : ( 'speaker' ) ;
    public final void rule__Keynote__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4450:1: ( ( 'speaker' ) )
            // InternalProgram.g:4451:1: ( 'speaker' )
            {
            // InternalProgram.g:4451:1: ( 'speaker' )
            // InternalProgram.g:4452:2: 'speaker'
            {
             before(grammarAccess.getKeynoteAccess().getSpeakerKeyword_3_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalProgram.g:4461:1: rule__Keynote__Group_3__1 : rule__Keynote__Group_3__1__Impl ;
    public final void rule__Keynote__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4465:1: ( rule__Keynote__Group_3__1__Impl )
            // InternalProgram.g:4466:2: rule__Keynote__Group_3__1__Impl
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
    // InternalProgram.g:4472:1: rule__Keynote__Group_3__1__Impl : ( ( rule__Keynote__SpeakerAssignment_3_1 ) ) ;
    public final void rule__Keynote__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4476:1: ( ( ( rule__Keynote__SpeakerAssignment_3_1 ) ) )
            // InternalProgram.g:4477:1: ( ( rule__Keynote__SpeakerAssignment_3_1 ) )
            {
            // InternalProgram.g:4477:1: ( ( rule__Keynote__SpeakerAssignment_3_1 ) )
            // InternalProgram.g:4478:2: ( rule__Keynote__SpeakerAssignment_3_1 )
            {
             before(grammarAccess.getKeynoteAccess().getSpeakerAssignment_3_1()); 
            // InternalProgram.g:4479:2: ( rule__Keynote__SpeakerAssignment_3_1 )
            // InternalProgram.g:4479:3: rule__Keynote__SpeakerAssignment_3_1
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


    // $ANTLR start "rule__Keynote__Group_4__0"
    // InternalProgram.g:4488:1: rule__Keynote__Group_4__0 : rule__Keynote__Group_4__0__Impl rule__Keynote__Group_4__1 ;
    public final void rule__Keynote__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4492:1: ( rule__Keynote__Group_4__0__Impl rule__Keynote__Group_4__1 )
            // InternalProgram.g:4493:2: rule__Keynote__Group_4__0__Impl rule__Keynote__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Keynote__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Keynote__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__Group_4__0"


    // $ANTLR start "rule__Keynote__Group_4__0__Impl"
    // InternalProgram.g:4500:1: rule__Keynote__Group_4__0__Impl : ( 'chair' ) ;
    public final void rule__Keynote__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4504:1: ( ( 'chair' ) )
            // InternalProgram.g:4505:1: ( 'chair' )
            {
            // InternalProgram.g:4505:1: ( 'chair' )
            // InternalProgram.g:4506:2: 'chair'
            {
             before(grammarAccess.getKeynoteAccess().getChairKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getKeynoteAccess().getChairKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__Group_4__0__Impl"


    // $ANTLR start "rule__Keynote__Group_4__1"
    // InternalProgram.g:4515:1: rule__Keynote__Group_4__1 : rule__Keynote__Group_4__1__Impl ;
    public final void rule__Keynote__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4519:1: ( rule__Keynote__Group_4__1__Impl )
            // InternalProgram.g:4520:2: rule__Keynote__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Keynote__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__Group_4__1"


    // $ANTLR start "rule__Keynote__Group_4__1__Impl"
    // InternalProgram.g:4526:1: rule__Keynote__Group_4__1__Impl : ( ( rule__Keynote__ChairAssignment_4_1 ) ) ;
    public final void rule__Keynote__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4530:1: ( ( ( rule__Keynote__ChairAssignment_4_1 ) ) )
            // InternalProgram.g:4531:1: ( ( rule__Keynote__ChairAssignment_4_1 ) )
            {
            // InternalProgram.g:4531:1: ( ( rule__Keynote__ChairAssignment_4_1 ) )
            // InternalProgram.g:4532:2: ( rule__Keynote__ChairAssignment_4_1 )
            {
             before(grammarAccess.getKeynoteAccess().getChairAssignment_4_1()); 
            // InternalProgram.g:4533:2: ( rule__Keynote__ChairAssignment_4_1 )
            // InternalProgram.g:4533:3: rule__Keynote__ChairAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Keynote__ChairAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getKeynoteAccess().getChairAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__Group_4__1__Impl"


    // $ANTLR start "rule__SponsorKeynote__Group__0"
    // InternalProgram.g:4542:1: rule__SponsorKeynote__Group__0 : rule__SponsorKeynote__Group__0__Impl rule__SponsorKeynote__Group__1 ;
    public final void rule__SponsorKeynote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4546:1: ( rule__SponsorKeynote__Group__0__Impl rule__SponsorKeynote__Group__1 )
            // InternalProgram.g:4547:2: rule__SponsorKeynote__Group__0__Impl rule__SponsorKeynote__Group__1
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
    // InternalProgram.g:4554:1: rule__SponsorKeynote__Group__0__Impl : ( 'SponsorKeynote' ) ;
    public final void rule__SponsorKeynote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4558:1: ( ( 'SponsorKeynote' ) )
            // InternalProgram.g:4559:1: ( 'SponsorKeynote' )
            {
            // InternalProgram.g:4559:1: ( 'SponsorKeynote' )
            // InternalProgram.g:4560:2: 'SponsorKeynote'
            {
             before(grammarAccess.getSponsorKeynoteAccess().getSponsorKeynoteKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalProgram.g:4569:1: rule__SponsorKeynote__Group__1 : rule__SponsorKeynote__Group__1__Impl rule__SponsorKeynote__Group__2 ;
    public final void rule__SponsorKeynote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4573:1: ( rule__SponsorKeynote__Group__1__Impl rule__SponsorKeynote__Group__2 )
            // InternalProgram.g:4574:2: rule__SponsorKeynote__Group__1__Impl rule__SponsorKeynote__Group__2
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
    // InternalProgram.g:4581:1: rule__SponsorKeynote__Group__1__Impl : ( ( rule__SponsorKeynote__NameAssignment_1 ) ) ;
    public final void rule__SponsorKeynote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4585:1: ( ( ( rule__SponsorKeynote__NameAssignment_1 ) ) )
            // InternalProgram.g:4586:1: ( ( rule__SponsorKeynote__NameAssignment_1 ) )
            {
            // InternalProgram.g:4586:1: ( ( rule__SponsorKeynote__NameAssignment_1 ) )
            // InternalProgram.g:4587:2: ( rule__SponsorKeynote__NameAssignment_1 )
            {
             before(grammarAccess.getSponsorKeynoteAccess().getNameAssignment_1()); 
            // InternalProgram.g:4588:2: ( rule__SponsorKeynote__NameAssignment_1 )
            // InternalProgram.g:4588:3: rule__SponsorKeynote__NameAssignment_1
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
    // InternalProgram.g:4596:1: rule__SponsorKeynote__Group__2 : rule__SponsorKeynote__Group__2__Impl rule__SponsorKeynote__Group__3 ;
    public final void rule__SponsorKeynote__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4600:1: ( rule__SponsorKeynote__Group__2__Impl rule__SponsorKeynote__Group__3 )
            // InternalProgram.g:4601:2: rule__SponsorKeynote__Group__2__Impl rule__SponsorKeynote__Group__3
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
    // InternalProgram.g:4608:1: rule__SponsorKeynote__Group__2__Impl : ( ( rule__SponsorKeynote__Group_2__0 )? ) ;
    public final void rule__SponsorKeynote__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4612:1: ( ( ( rule__SponsorKeynote__Group_2__0 )? ) )
            // InternalProgram.g:4613:1: ( ( rule__SponsorKeynote__Group_2__0 )? )
            {
            // InternalProgram.g:4613:1: ( ( rule__SponsorKeynote__Group_2__0 )? )
            // InternalProgram.g:4614:2: ( rule__SponsorKeynote__Group_2__0 )?
            {
             before(grammarAccess.getSponsorKeynoteAccess().getGroup_2()); 
            // InternalProgram.g:4615:2: ( rule__SponsorKeynote__Group_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==38) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalProgram.g:4615:3: rule__SponsorKeynote__Group_2__0
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
    // InternalProgram.g:4623:1: rule__SponsorKeynote__Group__3 : rule__SponsorKeynote__Group__3__Impl rule__SponsorKeynote__Group__4 ;
    public final void rule__SponsorKeynote__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4627:1: ( rule__SponsorKeynote__Group__3__Impl rule__SponsorKeynote__Group__4 )
            // InternalProgram.g:4628:2: rule__SponsorKeynote__Group__3__Impl rule__SponsorKeynote__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__SponsorKeynote__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SponsorKeynote__Group__4();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:4635:1: rule__SponsorKeynote__Group__3__Impl : ( ( rule__SponsorKeynote__Group_3__0 )? ) ;
    public final void rule__SponsorKeynote__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4639:1: ( ( ( rule__SponsorKeynote__Group_3__0 )? ) )
            // InternalProgram.g:4640:1: ( ( rule__SponsorKeynote__Group_3__0 )? )
            {
            // InternalProgram.g:4640:1: ( ( rule__SponsorKeynote__Group_3__0 )? )
            // InternalProgram.g:4641:2: ( rule__SponsorKeynote__Group_3__0 )?
            {
             before(grammarAccess.getSponsorKeynoteAccess().getGroup_3()); 
            // InternalProgram.g:4642:2: ( rule__SponsorKeynote__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==46) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalProgram.g:4642:3: rule__SponsorKeynote__Group_3__0
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


    // $ANTLR start "rule__SponsorKeynote__Group__4"
    // InternalProgram.g:4650:1: rule__SponsorKeynote__Group__4 : rule__SponsorKeynote__Group__4__Impl rule__SponsorKeynote__Group__5 ;
    public final void rule__SponsorKeynote__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4654:1: ( rule__SponsorKeynote__Group__4__Impl rule__SponsorKeynote__Group__5 )
            // InternalProgram.g:4655:2: rule__SponsorKeynote__Group__4__Impl rule__SponsorKeynote__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__SponsorKeynote__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SponsorKeynote__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SponsorKeynote__Group__4"


    // $ANTLR start "rule__SponsorKeynote__Group__4__Impl"
    // InternalProgram.g:4662:1: rule__SponsorKeynote__Group__4__Impl : ( ( rule__SponsorKeynote__Group_4__0 )? ) ;
    public final void rule__SponsorKeynote__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4666:1: ( ( ( rule__SponsorKeynote__Group_4__0 )? ) )
            // InternalProgram.g:4667:1: ( ( rule__SponsorKeynote__Group_4__0 )? )
            {
            // InternalProgram.g:4667:1: ( ( rule__SponsorKeynote__Group_4__0 )? )
            // InternalProgram.g:4668:2: ( rule__SponsorKeynote__Group_4__0 )?
            {
             before(grammarAccess.getSponsorKeynoteAccess().getGroup_4()); 
            // InternalProgram.g:4669:2: ( rule__SponsorKeynote__Group_4__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==37) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalProgram.g:4669:3: rule__SponsorKeynote__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SponsorKeynote__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSponsorKeynoteAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SponsorKeynote__Group__4__Impl"


    // $ANTLR start "rule__SponsorKeynote__Group__5"
    // InternalProgram.g:4677:1: rule__SponsorKeynote__Group__5 : rule__SponsorKeynote__Group__5__Impl ;
    public final void rule__SponsorKeynote__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4681:1: ( rule__SponsorKeynote__Group__5__Impl )
            // InternalProgram.g:4682:2: rule__SponsorKeynote__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SponsorKeynote__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SponsorKeynote__Group__5"


    // $ANTLR start "rule__SponsorKeynote__Group__5__Impl"
    // InternalProgram.g:4688:1: rule__SponsorKeynote__Group__5__Impl : ( ( rule__SponsorKeynote__CancelledAssignment_5 )? ) ;
    public final void rule__SponsorKeynote__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4692:1: ( ( ( rule__SponsorKeynote__CancelledAssignment_5 )? ) )
            // InternalProgram.g:4693:1: ( ( rule__SponsorKeynote__CancelledAssignment_5 )? )
            {
            // InternalProgram.g:4693:1: ( ( rule__SponsorKeynote__CancelledAssignment_5 )? )
            // InternalProgram.g:4694:2: ( rule__SponsorKeynote__CancelledAssignment_5 )?
            {
             before(grammarAccess.getSponsorKeynoteAccess().getCancelledAssignment_5()); 
            // InternalProgram.g:4695:2: ( rule__SponsorKeynote__CancelledAssignment_5 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==67) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalProgram.g:4695:3: rule__SponsorKeynote__CancelledAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__SponsorKeynote__CancelledAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSponsorKeynoteAccess().getCancelledAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SponsorKeynote__Group__5__Impl"


    // $ANTLR start "rule__SponsorKeynote__Group_2__0"
    // InternalProgram.g:4704:1: rule__SponsorKeynote__Group_2__0 : rule__SponsorKeynote__Group_2__0__Impl rule__SponsorKeynote__Group_2__1 ;
    public final void rule__SponsorKeynote__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4708:1: ( rule__SponsorKeynote__Group_2__0__Impl rule__SponsorKeynote__Group_2__1 )
            // InternalProgram.g:4709:2: rule__SponsorKeynote__Group_2__0__Impl rule__SponsorKeynote__Group_2__1
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
    // InternalProgram.g:4716:1: rule__SponsorKeynote__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__SponsorKeynote__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4720:1: ( ( 'abstract' ) )
            // InternalProgram.g:4721:1: ( 'abstract' )
            {
            // InternalProgram.g:4721:1: ( 'abstract' )
            // InternalProgram.g:4722:2: 'abstract'
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
    // InternalProgram.g:4731:1: rule__SponsorKeynote__Group_2__1 : rule__SponsorKeynote__Group_2__1__Impl ;
    public final void rule__SponsorKeynote__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4735:1: ( rule__SponsorKeynote__Group_2__1__Impl )
            // InternalProgram.g:4736:2: rule__SponsorKeynote__Group_2__1__Impl
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
    // InternalProgram.g:4742:1: rule__SponsorKeynote__Group_2__1__Impl : ( ( rule__SponsorKeynote__AbstractAssignment_2_1 ) ) ;
    public final void rule__SponsorKeynote__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4746:1: ( ( ( rule__SponsorKeynote__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:4747:1: ( ( rule__SponsorKeynote__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:4747:1: ( ( rule__SponsorKeynote__AbstractAssignment_2_1 ) )
            // InternalProgram.g:4748:2: ( rule__SponsorKeynote__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getSponsorKeynoteAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:4749:2: ( rule__SponsorKeynote__AbstractAssignment_2_1 )
            // InternalProgram.g:4749:3: rule__SponsorKeynote__AbstractAssignment_2_1
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
    // InternalProgram.g:4758:1: rule__SponsorKeynote__Group_3__0 : rule__SponsorKeynote__Group_3__0__Impl rule__SponsorKeynote__Group_3__1 ;
    public final void rule__SponsorKeynote__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4762:1: ( rule__SponsorKeynote__Group_3__0__Impl rule__SponsorKeynote__Group_3__1 )
            // InternalProgram.g:4763:2: rule__SponsorKeynote__Group_3__0__Impl rule__SponsorKeynote__Group_3__1
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
    // InternalProgram.g:4770:1: rule__SponsorKeynote__Group_3__0__Impl : ( 'speaker' ) ;
    public final void rule__SponsorKeynote__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4774:1: ( ( 'speaker' ) )
            // InternalProgram.g:4775:1: ( 'speaker' )
            {
            // InternalProgram.g:4775:1: ( 'speaker' )
            // InternalProgram.g:4776:2: 'speaker'
            {
             before(grammarAccess.getSponsorKeynoteAccess().getSpeakerKeyword_3_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalProgram.g:4785:1: rule__SponsorKeynote__Group_3__1 : rule__SponsorKeynote__Group_3__1__Impl ;
    public final void rule__SponsorKeynote__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4789:1: ( rule__SponsorKeynote__Group_3__1__Impl )
            // InternalProgram.g:4790:2: rule__SponsorKeynote__Group_3__1__Impl
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
    // InternalProgram.g:4796:1: rule__SponsorKeynote__Group_3__1__Impl : ( ( rule__SponsorKeynote__SpeakerAssignment_3_1 ) ) ;
    public final void rule__SponsorKeynote__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4800:1: ( ( ( rule__SponsorKeynote__SpeakerAssignment_3_1 ) ) )
            // InternalProgram.g:4801:1: ( ( rule__SponsorKeynote__SpeakerAssignment_3_1 ) )
            {
            // InternalProgram.g:4801:1: ( ( rule__SponsorKeynote__SpeakerAssignment_3_1 ) )
            // InternalProgram.g:4802:2: ( rule__SponsorKeynote__SpeakerAssignment_3_1 )
            {
             before(grammarAccess.getSponsorKeynoteAccess().getSpeakerAssignment_3_1()); 
            // InternalProgram.g:4803:2: ( rule__SponsorKeynote__SpeakerAssignment_3_1 )
            // InternalProgram.g:4803:3: rule__SponsorKeynote__SpeakerAssignment_3_1
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


    // $ANTLR start "rule__SponsorKeynote__Group_4__0"
    // InternalProgram.g:4812:1: rule__SponsorKeynote__Group_4__0 : rule__SponsorKeynote__Group_4__0__Impl rule__SponsorKeynote__Group_4__1 ;
    public final void rule__SponsorKeynote__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4816:1: ( rule__SponsorKeynote__Group_4__0__Impl rule__SponsorKeynote__Group_4__1 )
            // InternalProgram.g:4817:2: rule__SponsorKeynote__Group_4__0__Impl rule__SponsorKeynote__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__SponsorKeynote__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SponsorKeynote__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SponsorKeynote__Group_4__0"


    // $ANTLR start "rule__SponsorKeynote__Group_4__0__Impl"
    // InternalProgram.g:4824:1: rule__SponsorKeynote__Group_4__0__Impl : ( 'chair' ) ;
    public final void rule__SponsorKeynote__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4828:1: ( ( 'chair' ) )
            // InternalProgram.g:4829:1: ( 'chair' )
            {
            // InternalProgram.g:4829:1: ( 'chair' )
            // InternalProgram.g:4830:2: 'chair'
            {
             before(grammarAccess.getSponsorKeynoteAccess().getChairKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSponsorKeynoteAccess().getChairKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SponsorKeynote__Group_4__0__Impl"


    // $ANTLR start "rule__SponsorKeynote__Group_4__1"
    // InternalProgram.g:4839:1: rule__SponsorKeynote__Group_4__1 : rule__SponsorKeynote__Group_4__1__Impl ;
    public final void rule__SponsorKeynote__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4843:1: ( rule__SponsorKeynote__Group_4__1__Impl )
            // InternalProgram.g:4844:2: rule__SponsorKeynote__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SponsorKeynote__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SponsorKeynote__Group_4__1"


    // $ANTLR start "rule__SponsorKeynote__Group_4__1__Impl"
    // InternalProgram.g:4850:1: rule__SponsorKeynote__Group_4__1__Impl : ( ( rule__SponsorKeynote__ChairAssignment_4_1 ) ) ;
    public final void rule__SponsorKeynote__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4854:1: ( ( ( rule__SponsorKeynote__ChairAssignment_4_1 ) ) )
            // InternalProgram.g:4855:1: ( ( rule__SponsorKeynote__ChairAssignment_4_1 ) )
            {
            // InternalProgram.g:4855:1: ( ( rule__SponsorKeynote__ChairAssignment_4_1 ) )
            // InternalProgram.g:4856:2: ( rule__SponsorKeynote__ChairAssignment_4_1 )
            {
             before(grammarAccess.getSponsorKeynoteAccess().getChairAssignment_4_1()); 
            // InternalProgram.g:4857:2: ( rule__SponsorKeynote__ChairAssignment_4_1 )
            // InternalProgram.g:4857:3: rule__SponsorKeynote__ChairAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SponsorKeynote__ChairAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSponsorKeynoteAccess().getChairAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SponsorKeynote__Group_4__1__Impl"


    // $ANTLR start "rule__Workshop__Group__0"
    // InternalProgram.g:4866:1: rule__Workshop__Group__0 : rule__Workshop__Group__0__Impl rule__Workshop__Group__1 ;
    public final void rule__Workshop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4870:1: ( rule__Workshop__Group__0__Impl rule__Workshop__Group__1 )
            // InternalProgram.g:4871:2: rule__Workshop__Group__0__Impl rule__Workshop__Group__1
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
    // InternalProgram.g:4878:1: rule__Workshop__Group__0__Impl : ( 'Workshop' ) ;
    public final void rule__Workshop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4882:1: ( ( 'Workshop' ) )
            // InternalProgram.g:4883:1: ( 'Workshop' )
            {
            // InternalProgram.g:4883:1: ( 'Workshop' )
            // InternalProgram.g:4884:2: 'Workshop'
            {
             before(grammarAccess.getWorkshopAccess().getWorkshopKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalProgram.g:4893:1: rule__Workshop__Group__1 : rule__Workshop__Group__1__Impl rule__Workshop__Group__2 ;
    public final void rule__Workshop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4897:1: ( rule__Workshop__Group__1__Impl rule__Workshop__Group__2 )
            // InternalProgram.g:4898:2: rule__Workshop__Group__1__Impl rule__Workshop__Group__2
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
    // InternalProgram.g:4905:1: rule__Workshop__Group__1__Impl : ( ( rule__Workshop__NameAssignment_1 ) ) ;
    public final void rule__Workshop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4909:1: ( ( ( rule__Workshop__NameAssignment_1 ) ) )
            // InternalProgram.g:4910:1: ( ( rule__Workshop__NameAssignment_1 ) )
            {
            // InternalProgram.g:4910:1: ( ( rule__Workshop__NameAssignment_1 ) )
            // InternalProgram.g:4911:2: ( rule__Workshop__NameAssignment_1 )
            {
             before(grammarAccess.getWorkshopAccess().getNameAssignment_1()); 
            // InternalProgram.g:4912:2: ( rule__Workshop__NameAssignment_1 )
            // InternalProgram.g:4912:3: rule__Workshop__NameAssignment_1
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
    // InternalProgram.g:4920:1: rule__Workshop__Group__2 : rule__Workshop__Group__2__Impl rule__Workshop__Group__3 ;
    public final void rule__Workshop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4924:1: ( rule__Workshop__Group__2__Impl rule__Workshop__Group__3 )
            // InternalProgram.g:4925:2: rule__Workshop__Group__2__Impl rule__Workshop__Group__3
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
    // InternalProgram.g:4932:1: rule__Workshop__Group__2__Impl : ( ( rule__Workshop__Group_2__0 )? ) ;
    public final void rule__Workshop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4936:1: ( ( ( rule__Workshop__Group_2__0 )? ) )
            // InternalProgram.g:4937:1: ( ( rule__Workshop__Group_2__0 )? )
            {
            // InternalProgram.g:4937:1: ( ( rule__Workshop__Group_2__0 )? )
            // InternalProgram.g:4938:2: ( rule__Workshop__Group_2__0 )?
            {
             before(grammarAccess.getWorkshopAccess().getGroup_2()); 
            // InternalProgram.g:4939:2: ( rule__Workshop__Group_2__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==38) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalProgram.g:4939:3: rule__Workshop__Group_2__0
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
    // InternalProgram.g:4947:1: rule__Workshop__Group__3 : rule__Workshop__Group__3__Impl rule__Workshop__Group__4 ;
    public final void rule__Workshop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4951:1: ( rule__Workshop__Group__3__Impl rule__Workshop__Group__4 )
            // InternalProgram.g:4952:2: rule__Workshop__Group__3__Impl rule__Workshop__Group__4
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
    // InternalProgram.g:4959:1: rule__Workshop__Group__3__Impl : ( ( rule__Workshop__Group_3__0 )? ) ;
    public final void rule__Workshop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4963:1: ( ( ( rule__Workshop__Group_3__0 )? ) )
            // InternalProgram.g:4964:1: ( ( rule__Workshop__Group_3__0 )? )
            {
            // InternalProgram.g:4964:1: ( ( rule__Workshop__Group_3__0 )? )
            // InternalProgram.g:4965:2: ( rule__Workshop__Group_3__0 )?
            {
             before(grammarAccess.getWorkshopAccess().getGroup_3()); 
            // InternalProgram.g:4966:2: ( rule__Workshop__Group_3__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==43) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalProgram.g:4966:3: rule__Workshop__Group_3__0
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
    // InternalProgram.g:4974:1: rule__Workshop__Group__4 : rule__Workshop__Group__4__Impl rule__Workshop__Group__5 ;
    public final void rule__Workshop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4978:1: ( rule__Workshop__Group__4__Impl rule__Workshop__Group__5 )
            // InternalProgram.g:4979:2: rule__Workshop__Group__4__Impl rule__Workshop__Group__5
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
    // InternalProgram.g:4986:1: rule__Workshop__Group__4__Impl : ( ( rule__Workshop__Group_4__0 )? ) ;
    public final void rule__Workshop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4990:1: ( ( ( rule__Workshop__Group_4__0 )? ) )
            // InternalProgram.g:4991:1: ( ( rule__Workshop__Group_4__0 )? )
            {
            // InternalProgram.g:4991:1: ( ( rule__Workshop__Group_4__0 )? )
            // InternalProgram.g:4992:2: ( rule__Workshop__Group_4__0 )?
            {
             before(grammarAccess.getWorkshopAccess().getGroup_4()); 
            // InternalProgram.g:4993:2: ( rule__Workshop__Group_4__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==49) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalProgram.g:4993:3: rule__Workshop__Group_4__0
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
    // InternalProgram.g:5001:1: rule__Workshop__Group__5 : rule__Workshop__Group__5__Impl rule__Workshop__Group__6 ;
    public final void rule__Workshop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5005:1: ( rule__Workshop__Group__5__Impl rule__Workshop__Group__6 )
            // InternalProgram.g:5006:2: rule__Workshop__Group__5__Impl rule__Workshop__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__Workshop__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workshop__Group__6();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:5013:1: rule__Workshop__Group__5__Impl : ( ( rule__Workshop__Group_5__0 )? ) ;
    public final void rule__Workshop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5017:1: ( ( ( rule__Workshop__Group_5__0 )? ) )
            // InternalProgram.g:5018:1: ( ( rule__Workshop__Group_5__0 )? )
            {
            // InternalProgram.g:5018:1: ( ( rule__Workshop__Group_5__0 )? )
            // InternalProgram.g:5019:2: ( rule__Workshop__Group_5__0 )?
            {
             before(grammarAccess.getWorkshopAccess().getGroup_5()); 
            // InternalProgram.g:5020:2: ( rule__Workshop__Group_5__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==50) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalProgram.g:5020:3: rule__Workshop__Group_5__0
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


    // $ANTLR start "rule__Workshop__Group__6"
    // InternalProgram.g:5028:1: rule__Workshop__Group__6 : rule__Workshop__Group__6__Impl ;
    public final void rule__Workshop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5032:1: ( rule__Workshop__Group__6__Impl )
            // InternalProgram.g:5033:2: rule__Workshop__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Workshop__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group__6"


    // $ANTLR start "rule__Workshop__Group__6__Impl"
    // InternalProgram.g:5039:1: rule__Workshop__Group__6__Impl : ( ( rule__Workshop__CancelledAssignment_6 )? ) ;
    public final void rule__Workshop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5043:1: ( ( ( rule__Workshop__CancelledAssignment_6 )? ) )
            // InternalProgram.g:5044:1: ( ( rule__Workshop__CancelledAssignment_6 )? )
            {
            // InternalProgram.g:5044:1: ( ( rule__Workshop__CancelledAssignment_6 )? )
            // InternalProgram.g:5045:2: ( rule__Workshop__CancelledAssignment_6 )?
            {
             before(grammarAccess.getWorkshopAccess().getCancelledAssignment_6()); 
            // InternalProgram.g:5046:2: ( rule__Workshop__CancelledAssignment_6 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==67) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalProgram.g:5046:3: rule__Workshop__CancelledAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Workshop__CancelledAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkshopAccess().getCancelledAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group__6__Impl"


    // $ANTLR start "rule__Workshop__Group_2__0"
    // InternalProgram.g:5055:1: rule__Workshop__Group_2__0 : rule__Workshop__Group_2__0__Impl rule__Workshop__Group_2__1 ;
    public final void rule__Workshop__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5059:1: ( rule__Workshop__Group_2__0__Impl rule__Workshop__Group_2__1 )
            // InternalProgram.g:5060:2: rule__Workshop__Group_2__0__Impl rule__Workshop__Group_2__1
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
    // InternalProgram.g:5067:1: rule__Workshop__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__Workshop__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5071:1: ( ( 'abstract' ) )
            // InternalProgram.g:5072:1: ( 'abstract' )
            {
            // InternalProgram.g:5072:1: ( 'abstract' )
            // InternalProgram.g:5073:2: 'abstract'
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
    // InternalProgram.g:5082:1: rule__Workshop__Group_2__1 : rule__Workshop__Group_2__1__Impl ;
    public final void rule__Workshop__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5086:1: ( rule__Workshop__Group_2__1__Impl )
            // InternalProgram.g:5087:2: rule__Workshop__Group_2__1__Impl
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
    // InternalProgram.g:5093:1: rule__Workshop__Group_2__1__Impl : ( ( rule__Workshop__AbstractAssignment_2_1 ) ) ;
    public final void rule__Workshop__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5097:1: ( ( ( rule__Workshop__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:5098:1: ( ( rule__Workshop__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:5098:1: ( ( rule__Workshop__AbstractAssignment_2_1 ) )
            // InternalProgram.g:5099:2: ( rule__Workshop__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getWorkshopAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:5100:2: ( rule__Workshop__AbstractAssignment_2_1 )
            // InternalProgram.g:5100:3: rule__Workshop__AbstractAssignment_2_1
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
    // InternalProgram.g:5109:1: rule__Workshop__Group_3__0 : rule__Workshop__Group_3__0__Impl rule__Workshop__Group_3__1 ;
    public final void rule__Workshop__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5113:1: ( rule__Workshop__Group_3__0__Impl rule__Workshop__Group_3__1 )
            // InternalProgram.g:5114:2: rule__Workshop__Group_3__0__Impl rule__Workshop__Group_3__1
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
    // InternalProgram.g:5121:1: rule__Workshop__Group_3__0__Impl : ( 'url' ) ;
    public final void rule__Workshop__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5125:1: ( ( 'url' ) )
            // InternalProgram.g:5126:1: ( 'url' )
            {
            // InternalProgram.g:5126:1: ( 'url' )
            // InternalProgram.g:5127:2: 'url'
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
    // InternalProgram.g:5136:1: rule__Workshop__Group_3__1 : rule__Workshop__Group_3__1__Impl ;
    public final void rule__Workshop__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5140:1: ( rule__Workshop__Group_3__1__Impl )
            // InternalProgram.g:5141:2: rule__Workshop__Group_3__1__Impl
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
    // InternalProgram.g:5147:1: rule__Workshop__Group_3__1__Impl : ( ( rule__Workshop__UrlAssignment_3_1 ) ) ;
    public final void rule__Workshop__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5151:1: ( ( ( rule__Workshop__UrlAssignment_3_1 ) ) )
            // InternalProgram.g:5152:1: ( ( rule__Workshop__UrlAssignment_3_1 ) )
            {
            // InternalProgram.g:5152:1: ( ( rule__Workshop__UrlAssignment_3_1 ) )
            // InternalProgram.g:5153:2: ( rule__Workshop__UrlAssignment_3_1 )
            {
             before(grammarAccess.getWorkshopAccess().getUrlAssignment_3_1()); 
            // InternalProgram.g:5154:2: ( rule__Workshop__UrlAssignment_3_1 )
            // InternalProgram.g:5154:3: rule__Workshop__UrlAssignment_3_1
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
    // InternalProgram.g:5163:1: rule__Workshop__Group_4__0 : rule__Workshop__Group_4__0__Impl rule__Workshop__Group_4__1 ;
    public final void rule__Workshop__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5167:1: ( rule__Workshop__Group_4__0__Impl rule__Workshop__Group_4__1 )
            // InternalProgram.g:5168:2: rule__Workshop__Group_4__0__Impl rule__Workshop__Group_4__1
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
    // InternalProgram.g:5175:1: rule__Workshop__Group_4__0__Impl : ( 'name' ) ;
    public final void rule__Workshop__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5179:1: ( ( 'name' ) )
            // InternalProgram.g:5180:1: ( 'name' )
            {
            // InternalProgram.g:5180:1: ( 'name' )
            // InternalProgram.g:5181:2: 'name'
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
    // InternalProgram.g:5190:1: rule__Workshop__Group_4__1 : rule__Workshop__Group_4__1__Impl ;
    public final void rule__Workshop__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5194:1: ( rule__Workshop__Group_4__1__Impl )
            // InternalProgram.g:5195:2: rule__Workshop__Group_4__1__Impl
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
    // InternalProgram.g:5201:1: rule__Workshop__Group_4__1__Impl : ( ( rule__Workshop__FullNameAssignment_4_1 ) ) ;
    public final void rule__Workshop__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5205:1: ( ( ( rule__Workshop__FullNameAssignment_4_1 ) ) )
            // InternalProgram.g:5206:1: ( ( rule__Workshop__FullNameAssignment_4_1 ) )
            {
            // InternalProgram.g:5206:1: ( ( rule__Workshop__FullNameAssignment_4_1 ) )
            // InternalProgram.g:5207:2: ( rule__Workshop__FullNameAssignment_4_1 )
            {
             before(grammarAccess.getWorkshopAccess().getFullNameAssignment_4_1()); 
            // InternalProgram.g:5208:2: ( rule__Workshop__FullNameAssignment_4_1 )
            // InternalProgram.g:5208:3: rule__Workshop__FullNameAssignment_4_1
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
    // InternalProgram.g:5217:1: rule__Workshop__Group_5__0 : rule__Workshop__Group_5__0__Impl rule__Workshop__Group_5__1 ;
    public final void rule__Workshop__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5221:1: ( rule__Workshop__Group_5__0__Impl rule__Workshop__Group_5__1 )
            // InternalProgram.g:5222:2: rule__Workshop__Group_5__0__Impl rule__Workshop__Group_5__1
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
    // InternalProgram.g:5229:1: rule__Workshop__Group_5__0__Impl : ( 'organizers' ) ;
    public final void rule__Workshop__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5233:1: ( ( 'organizers' ) )
            // InternalProgram.g:5234:1: ( 'organizers' )
            {
            // InternalProgram.g:5234:1: ( 'organizers' )
            // InternalProgram.g:5235:2: 'organizers'
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
    // InternalProgram.g:5244:1: rule__Workshop__Group_5__1 : rule__Workshop__Group_5__1__Impl rule__Workshop__Group_5__2 ;
    public final void rule__Workshop__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5248:1: ( rule__Workshop__Group_5__1__Impl rule__Workshop__Group_5__2 )
            // InternalProgram.g:5249:2: rule__Workshop__Group_5__1__Impl rule__Workshop__Group_5__2
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
    // InternalProgram.g:5256:1: rule__Workshop__Group_5__1__Impl : ( ( rule__Workshop__OrganizersAssignment_5_1 ) ) ;
    public final void rule__Workshop__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5260:1: ( ( ( rule__Workshop__OrganizersAssignment_5_1 ) ) )
            // InternalProgram.g:5261:1: ( ( rule__Workshop__OrganizersAssignment_5_1 ) )
            {
            // InternalProgram.g:5261:1: ( ( rule__Workshop__OrganizersAssignment_5_1 ) )
            // InternalProgram.g:5262:2: ( rule__Workshop__OrganizersAssignment_5_1 )
            {
             before(grammarAccess.getWorkshopAccess().getOrganizersAssignment_5_1()); 
            // InternalProgram.g:5263:2: ( rule__Workshop__OrganizersAssignment_5_1 )
            // InternalProgram.g:5263:3: rule__Workshop__OrganizersAssignment_5_1
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
    // InternalProgram.g:5271:1: rule__Workshop__Group_5__2 : rule__Workshop__Group_5__2__Impl ;
    public final void rule__Workshop__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5275:1: ( rule__Workshop__Group_5__2__Impl )
            // InternalProgram.g:5276:2: rule__Workshop__Group_5__2__Impl
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
    // InternalProgram.g:5282:1: rule__Workshop__Group_5__2__Impl : ( ( rule__Workshop__Group_5_2__0 )* ) ;
    public final void rule__Workshop__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5286:1: ( ( ( rule__Workshop__Group_5_2__0 )* ) )
            // InternalProgram.g:5287:1: ( ( rule__Workshop__Group_5_2__0 )* )
            {
            // InternalProgram.g:5287:1: ( ( rule__Workshop__Group_5_2__0 )* )
            // InternalProgram.g:5288:2: ( rule__Workshop__Group_5_2__0 )*
            {
             before(grammarAccess.getWorkshopAccess().getGroup_5_2()); 
            // InternalProgram.g:5289:2: ( rule__Workshop__Group_5_2__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==21) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalProgram.g:5289:3: rule__Workshop__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Workshop__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalProgram.g:5298:1: rule__Workshop__Group_5_2__0 : rule__Workshop__Group_5_2__0__Impl rule__Workshop__Group_5_2__1 ;
    public final void rule__Workshop__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5302:1: ( rule__Workshop__Group_5_2__0__Impl rule__Workshop__Group_5_2__1 )
            // InternalProgram.g:5303:2: rule__Workshop__Group_5_2__0__Impl rule__Workshop__Group_5_2__1
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
    // InternalProgram.g:5310:1: rule__Workshop__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Workshop__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5314:1: ( ( ',' ) )
            // InternalProgram.g:5315:1: ( ',' )
            {
            // InternalProgram.g:5315:1: ( ',' )
            // InternalProgram.g:5316:2: ','
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
    // InternalProgram.g:5325:1: rule__Workshop__Group_5_2__1 : rule__Workshop__Group_5_2__1__Impl ;
    public final void rule__Workshop__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5329:1: ( rule__Workshop__Group_5_2__1__Impl )
            // InternalProgram.g:5330:2: rule__Workshop__Group_5_2__1__Impl
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
    // InternalProgram.g:5336:1: rule__Workshop__Group_5_2__1__Impl : ( ( rule__Workshop__OrganizersAssignment_5_2_1 ) ) ;
    public final void rule__Workshop__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5340:1: ( ( ( rule__Workshop__OrganizersAssignment_5_2_1 ) ) )
            // InternalProgram.g:5341:1: ( ( rule__Workshop__OrganizersAssignment_5_2_1 ) )
            {
            // InternalProgram.g:5341:1: ( ( rule__Workshop__OrganizersAssignment_5_2_1 ) )
            // InternalProgram.g:5342:2: ( rule__Workshop__OrganizersAssignment_5_2_1 )
            {
             before(grammarAccess.getWorkshopAccess().getOrganizersAssignment_5_2_1()); 
            // InternalProgram.g:5343:2: ( rule__Workshop__OrganizersAssignment_5_2_1 )
            // InternalProgram.g:5343:3: rule__Workshop__OrganizersAssignment_5_2_1
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
    // InternalProgram.g:5352:1: rule__Tutorial__Group__0 : rule__Tutorial__Group__0__Impl rule__Tutorial__Group__1 ;
    public final void rule__Tutorial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5356:1: ( rule__Tutorial__Group__0__Impl rule__Tutorial__Group__1 )
            // InternalProgram.g:5357:2: rule__Tutorial__Group__0__Impl rule__Tutorial__Group__1
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
    // InternalProgram.g:5364:1: rule__Tutorial__Group__0__Impl : ( 'Tutorial' ) ;
    public final void rule__Tutorial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5368:1: ( ( 'Tutorial' ) )
            // InternalProgram.g:5369:1: ( 'Tutorial' )
            {
            // InternalProgram.g:5369:1: ( 'Tutorial' )
            // InternalProgram.g:5370:2: 'Tutorial'
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
    // InternalProgram.g:5379:1: rule__Tutorial__Group__1 : rule__Tutorial__Group__1__Impl rule__Tutorial__Group__2 ;
    public final void rule__Tutorial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5383:1: ( rule__Tutorial__Group__1__Impl rule__Tutorial__Group__2 )
            // InternalProgram.g:5384:2: rule__Tutorial__Group__1__Impl rule__Tutorial__Group__2
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
    // InternalProgram.g:5391:1: rule__Tutorial__Group__1__Impl : ( ( rule__Tutorial__NameAssignment_1 ) ) ;
    public final void rule__Tutorial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5395:1: ( ( ( rule__Tutorial__NameAssignment_1 ) ) )
            // InternalProgram.g:5396:1: ( ( rule__Tutorial__NameAssignment_1 ) )
            {
            // InternalProgram.g:5396:1: ( ( rule__Tutorial__NameAssignment_1 ) )
            // InternalProgram.g:5397:2: ( rule__Tutorial__NameAssignment_1 )
            {
             before(grammarAccess.getTutorialAccess().getNameAssignment_1()); 
            // InternalProgram.g:5398:2: ( rule__Tutorial__NameAssignment_1 )
            // InternalProgram.g:5398:3: rule__Tutorial__NameAssignment_1
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
    // InternalProgram.g:5406:1: rule__Tutorial__Group__2 : rule__Tutorial__Group__2__Impl rule__Tutorial__Group__3 ;
    public final void rule__Tutorial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5410:1: ( rule__Tutorial__Group__2__Impl rule__Tutorial__Group__3 )
            // InternalProgram.g:5411:2: rule__Tutorial__Group__2__Impl rule__Tutorial__Group__3
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
    // InternalProgram.g:5418:1: rule__Tutorial__Group__2__Impl : ( ( rule__Tutorial__Group_2__0 )? ) ;
    public final void rule__Tutorial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5422:1: ( ( ( rule__Tutorial__Group_2__0 )? ) )
            // InternalProgram.g:5423:1: ( ( rule__Tutorial__Group_2__0 )? )
            {
            // InternalProgram.g:5423:1: ( ( rule__Tutorial__Group_2__0 )? )
            // InternalProgram.g:5424:2: ( rule__Tutorial__Group_2__0 )?
            {
             before(grammarAccess.getTutorialAccess().getGroup_2()); 
            // InternalProgram.g:5425:2: ( rule__Tutorial__Group_2__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==38) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalProgram.g:5425:3: rule__Tutorial__Group_2__0
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
    // InternalProgram.g:5433:1: rule__Tutorial__Group__3 : rule__Tutorial__Group__3__Impl rule__Tutorial__Group__4 ;
    public final void rule__Tutorial__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5437:1: ( rule__Tutorial__Group__3__Impl rule__Tutorial__Group__4 )
            // InternalProgram.g:5438:2: rule__Tutorial__Group__3__Impl rule__Tutorial__Group__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalProgram.g:5445:1: rule__Tutorial__Group__3__Impl : ( ( rule__Tutorial__Group_3__0 )? ) ;
    public final void rule__Tutorial__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5449:1: ( ( ( rule__Tutorial__Group_3__0 )? ) )
            // InternalProgram.g:5450:1: ( ( rule__Tutorial__Group_3__0 )? )
            {
            // InternalProgram.g:5450:1: ( ( rule__Tutorial__Group_3__0 )? )
            // InternalProgram.g:5451:2: ( rule__Tutorial__Group_3__0 )?
            {
             before(grammarAccess.getTutorialAccess().getGroup_3()); 
            // InternalProgram.g:5452:2: ( rule__Tutorial__Group_3__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==50) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalProgram.g:5452:3: rule__Tutorial__Group_3__0
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
    // InternalProgram.g:5460:1: rule__Tutorial__Group__4 : rule__Tutorial__Group__4__Impl ;
    public final void rule__Tutorial__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5464:1: ( rule__Tutorial__Group__4__Impl )
            // InternalProgram.g:5465:2: rule__Tutorial__Group__4__Impl
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
    // InternalProgram.g:5471:1: rule__Tutorial__Group__4__Impl : ( ( rule__Tutorial__CancelledAssignment_4 )? ) ;
    public final void rule__Tutorial__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5475:1: ( ( ( rule__Tutorial__CancelledAssignment_4 )? ) )
            // InternalProgram.g:5476:1: ( ( rule__Tutorial__CancelledAssignment_4 )? )
            {
            // InternalProgram.g:5476:1: ( ( rule__Tutorial__CancelledAssignment_4 )? )
            // InternalProgram.g:5477:2: ( rule__Tutorial__CancelledAssignment_4 )?
            {
             before(grammarAccess.getTutorialAccess().getCancelledAssignment_4()); 
            // InternalProgram.g:5478:2: ( rule__Tutorial__CancelledAssignment_4 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==67) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalProgram.g:5478:3: rule__Tutorial__CancelledAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tutorial__CancelledAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTutorialAccess().getCancelledAssignment_4()); 

            }


            }

        }
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
    // InternalProgram.g:5487:1: rule__Tutorial__Group_2__0 : rule__Tutorial__Group_2__0__Impl rule__Tutorial__Group_2__1 ;
    public final void rule__Tutorial__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5491:1: ( rule__Tutorial__Group_2__0__Impl rule__Tutorial__Group_2__1 )
            // InternalProgram.g:5492:2: rule__Tutorial__Group_2__0__Impl rule__Tutorial__Group_2__1
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
    // InternalProgram.g:5499:1: rule__Tutorial__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__Tutorial__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5503:1: ( ( 'abstract' ) )
            // InternalProgram.g:5504:1: ( 'abstract' )
            {
            // InternalProgram.g:5504:1: ( 'abstract' )
            // InternalProgram.g:5505:2: 'abstract'
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
    // InternalProgram.g:5514:1: rule__Tutorial__Group_2__1 : rule__Tutorial__Group_2__1__Impl ;
    public final void rule__Tutorial__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5518:1: ( rule__Tutorial__Group_2__1__Impl )
            // InternalProgram.g:5519:2: rule__Tutorial__Group_2__1__Impl
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
    // InternalProgram.g:5525:1: rule__Tutorial__Group_2__1__Impl : ( ( rule__Tutorial__AbstractAssignment_2_1 ) ) ;
    public final void rule__Tutorial__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5529:1: ( ( ( rule__Tutorial__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:5530:1: ( ( rule__Tutorial__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:5530:1: ( ( rule__Tutorial__AbstractAssignment_2_1 ) )
            // InternalProgram.g:5531:2: ( rule__Tutorial__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getTutorialAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:5532:2: ( rule__Tutorial__AbstractAssignment_2_1 )
            // InternalProgram.g:5532:3: rule__Tutorial__AbstractAssignment_2_1
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
    // InternalProgram.g:5541:1: rule__Tutorial__Group_3__0 : rule__Tutorial__Group_3__0__Impl rule__Tutorial__Group_3__1 ;
    public final void rule__Tutorial__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5545:1: ( rule__Tutorial__Group_3__0__Impl rule__Tutorial__Group_3__1 )
            // InternalProgram.g:5546:2: rule__Tutorial__Group_3__0__Impl rule__Tutorial__Group_3__1
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
    // InternalProgram.g:5553:1: rule__Tutorial__Group_3__0__Impl : ( 'organizers' ) ;
    public final void rule__Tutorial__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5557:1: ( ( 'organizers' ) )
            // InternalProgram.g:5558:1: ( 'organizers' )
            {
            // InternalProgram.g:5558:1: ( 'organizers' )
            // InternalProgram.g:5559:2: 'organizers'
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
    // InternalProgram.g:5568:1: rule__Tutorial__Group_3__1 : rule__Tutorial__Group_3__1__Impl rule__Tutorial__Group_3__2 ;
    public final void rule__Tutorial__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5572:1: ( rule__Tutorial__Group_3__1__Impl rule__Tutorial__Group_3__2 )
            // InternalProgram.g:5573:2: rule__Tutorial__Group_3__1__Impl rule__Tutorial__Group_3__2
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
    // InternalProgram.g:5580:1: rule__Tutorial__Group_3__1__Impl : ( ( rule__Tutorial__OrganizersAssignment_3_1 ) ) ;
    public final void rule__Tutorial__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5584:1: ( ( ( rule__Tutorial__OrganizersAssignment_3_1 ) ) )
            // InternalProgram.g:5585:1: ( ( rule__Tutorial__OrganizersAssignment_3_1 ) )
            {
            // InternalProgram.g:5585:1: ( ( rule__Tutorial__OrganizersAssignment_3_1 ) )
            // InternalProgram.g:5586:2: ( rule__Tutorial__OrganizersAssignment_3_1 )
            {
             before(grammarAccess.getTutorialAccess().getOrganizersAssignment_3_1()); 
            // InternalProgram.g:5587:2: ( rule__Tutorial__OrganizersAssignment_3_1 )
            // InternalProgram.g:5587:3: rule__Tutorial__OrganizersAssignment_3_1
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
    // InternalProgram.g:5595:1: rule__Tutorial__Group_3__2 : rule__Tutorial__Group_3__2__Impl ;
    public final void rule__Tutorial__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5599:1: ( rule__Tutorial__Group_3__2__Impl )
            // InternalProgram.g:5600:2: rule__Tutorial__Group_3__2__Impl
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
    // InternalProgram.g:5606:1: rule__Tutorial__Group_3__2__Impl : ( ( rule__Tutorial__Group_3_2__0 )* ) ;
    public final void rule__Tutorial__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5610:1: ( ( ( rule__Tutorial__Group_3_2__0 )* ) )
            // InternalProgram.g:5611:1: ( ( rule__Tutorial__Group_3_2__0 )* )
            {
            // InternalProgram.g:5611:1: ( ( rule__Tutorial__Group_3_2__0 )* )
            // InternalProgram.g:5612:2: ( rule__Tutorial__Group_3_2__0 )*
            {
             before(grammarAccess.getTutorialAccess().getGroup_3_2()); 
            // InternalProgram.g:5613:2: ( rule__Tutorial__Group_3_2__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==21) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalProgram.g:5613:3: rule__Tutorial__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Tutorial__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
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
    // InternalProgram.g:5622:1: rule__Tutorial__Group_3_2__0 : rule__Tutorial__Group_3_2__0__Impl rule__Tutorial__Group_3_2__1 ;
    public final void rule__Tutorial__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5626:1: ( rule__Tutorial__Group_3_2__0__Impl rule__Tutorial__Group_3_2__1 )
            // InternalProgram.g:5627:2: rule__Tutorial__Group_3_2__0__Impl rule__Tutorial__Group_3_2__1
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
    // InternalProgram.g:5634:1: rule__Tutorial__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Tutorial__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5638:1: ( ( ',' ) )
            // InternalProgram.g:5639:1: ( ',' )
            {
            // InternalProgram.g:5639:1: ( ',' )
            // InternalProgram.g:5640:2: ','
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
    // InternalProgram.g:5649:1: rule__Tutorial__Group_3_2__1 : rule__Tutorial__Group_3_2__1__Impl ;
    public final void rule__Tutorial__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5653:1: ( rule__Tutorial__Group_3_2__1__Impl )
            // InternalProgram.g:5654:2: rule__Tutorial__Group_3_2__1__Impl
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
    // InternalProgram.g:5660:1: rule__Tutorial__Group_3_2__1__Impl : ( ( rule__Tutorial__OrganizersAssignment_3_2_1 ) ) ;
    public final void rule__Tutorial__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5664:1: ( ( ( rule__Tutorial__OrganizersAssignment_3_2_1 ) ) )
            // InternalProgram.g:5665:1: ( ( rule__Tutorial__OrganizersAssignment_3_2_1 ) )
            {
            // InternalProgram.g:5665:1: ( ( rule__Tutorial__OrganizersAssignment_3_2_1 ) )
            // InternalProgram.g:5666:2: ( rule__Tutorial__OrganizersAssignment_3_2_1 )
            {
             before(grammarAccess.getTutorialAccess().getOrganizersAssignment_3_2_1()); 
            // InternalProgram.g:5667:2: ( rule__Tutorial__OrganizersAssignment_3_2_1 )
            // InternalProgram.g:5667:3: rule__Tutorial__OrganizersAssignment_3_2_1
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
    // InternalProgram.g:5676:1: rule__DoctoralSymposium__Group__0 : rule__DoctoralSymposium__Group__0__Impl rule__DoctoralSymposium__Group__1 ;
    public final void rule__DoctoralSymposium__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5680:1: ( rule__DoctoralSymposium__Group__0__Impl rule__DoctoralSymposium__Group__1 )
            // InternalProgram.g:5681:2: rule__DoctoralSymposium__Group__0__Impl rule__DoctoralSymposium__Group__1
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
    // InternalProgram.g:5688:1: rule__DoctoralSymposium__Group__0__Impl : ( 'DoctoralSymposium' ) ;
    public final void rule__DoctoralSymposium__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5692:1: ( ( 'DoctoralSymposium' ) )
            // InternalProgram.g:5693:1: ( 'DoctoralSymposium' )
            {
            // InternalProgram.g:5693:1: ( 'DoctoralSymposium' )
            // InternalProgram.g:5694:2: 'DoctoralSymposium'
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
    // InternalProgram.g:5703:1: rule__DoctoralSymposium__Group__1 : rule__DoctoralSymposium__Group__1__Impl rule__DoctoralSymposium__Group__2 ;
    public final void rule__DoctoralSymposium__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5707:1: ( rule__DoctoralSymposium__Group__1__Impl rule__DoctoralSymposium__Group__2 )
            // InternalProgram.g:5708:2: rule__DoctoralSymposium__Group__1__Impl rule__DoctoralSymposium__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalProgram.g:5715:1: rule__DoctoralSymposium__Group__1__Impl : ( ( rule__DoctoralSymposium__NameAssignment_1 ) ) ;
    public final void rule__DoctoralSymposium__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5719:1: ( ( ( rule__DoctoralSymposium__NameAssignment_1 ) ) )
            // InternalProgram.g:5720:1: ( ( rule__DoctoralSymposium__NameAssignment_1 ) )
            {
            // InternalProgram.g:5720:1: ( ( rule__DoctoralSymposium__NameAssignment_1 ) )
            // InternalProgram.g:5721:2: ( rule__DoctoralSymposium__NameAssignment_1 )
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getNameAssignment_1()); 
            // InternalProgram.g:5722:2: ( rule__DoctoralSymposium__NameAssignment_1 )
            // InternalProgram.g:5722:3: rule__DoctoralSymposium__NameAssignment_1
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
    // InternalProgram.g:5730:1: rule__DoctoralSymposium__Group__2 : rule__DoctoralSymposium__Group__2__Impl rule__DoctoralSymposium__Group__3 ;
    public final void rule__DoctoralSymposium__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5734:1: ( rule__DoctoralSymposium__Group__2__Impl rule__DoctoralSymposium__Group__3 )
            // InternalProgram.g:5735:2: rule__DoctoralSymposium__Group__2__Impl rule__DoctoralSymposium__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalProgram.g:5742:1: rule__DoctoralSymposium__Group__2__Impl : ( ( rule__DoctoralSymposium__Group_2__0 )? ) ;
    public final void rule__DoctoralSymposium__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5746:1: ( ( ( rule__DoctoralSymposium__Group_2__0 )? ) )
            // InternalProgram.g:5747:1: ( ( rule__DoctoralSymposium__Group_2__0 )? )
            {
            // InternalProgram.g:5747:1: ( ( rule__DoctoralSymposium__Group_2__0 )? )
            // InternalProgram.g:5748:2: ( rule__DoctoralSymposium__Group_2__0 )?
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getGroup_2()); 
            // InternalProgram.g:5749:2: ( rule__DoctoralSymposium__Group_2__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==38) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalProgram.g:5749:3: rule__DoctoralSymposium__Group_2__0
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
    // InternalProgram.g:5757:1: rule__DoctoralSymposium__Group__3 : rule__DoctoralSymposium__Group__3__Impl rule__DoctoralSymposium__Group__4 ;
    public final void rule__DoctoralSymposium__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5761:1: ( rule__DoctoralSymposium__Group__3__Impl rule__DoctoralSymposium__Group__4 )
            // InternalProgram.g:5762:2: rule__DoctoralSymposium__Group__3__Impl rule__DoctoralSymposium__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__DoctoralSymposium__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__Group__4();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:5769:1: rule__DoctoralSymposium__Group__3__Impl : ( ( rule__DoctoralSymposium__Group_3__0 )? ) ;
    public final void rule__DoctoralSymposium__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5773:1: ( ( ( rule__DoctoralSymposium__Group_3__0 )? ) )
            // InternalProgram.g:5774:1: ( ( rule__DoctoralSymposium__Group_3__0 )? )
            {
            // InternalProgram.g:5774:1: ( ( rule__DoctoralSymposium__Group_3__0 )? )
            // InternalProgram.g:5775:2: ( rule__DoctoralSymposium__Group_3__0 )?
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getGroup_3()); 
            // InternalProgram.g:5776:2: ( rule__DoctoralSymposium__Group_3__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==43) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalProgram.g:5776:3: rule__DoctoralSymposium__Group_3__0
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


    // $ANTLR start "rule__DoctoralSymposium__Group__4"
    // InternalProgram.g:5784:1: rule__DoctoralSymposium__Group__4 : rule__DoctoralSymposium__Group__4__Impl rule__DoctoralSymposium__Group__5 ;
    public final void rule__DoctoralSymposium__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5788:1: ( rule__DoctoralSymposium__Group__4__Impl rule__DoctoralSymposium__Group__5 )
            // InternalProgram.g:5789:2: rule__DoctoralSymposium__Group__4__Impl rule__DoctoralSymposium__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__DoctoralSymposium__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group__4"


    // $ANTLR start "rule__DoctoralSymposium__Group__4__Impl"
    // InternalProgram.g:5796:1: rule__DoctoralSymposium__Group__4__Impl : ( ( rule__DoctoralSymposium__Group_4__0 )? ) ;
    public final void rule__DoctoralSymposium__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5800:1: ( ( ( rule__DoctoralSymposium__Group_4__0 )? ) )
            // InternalProgram.g:5801:1: ( ( rule__DoctoralSymposium__Group_4__0 )? )
            {
            // InternalProgram.g:5801:1: ( ( rule__DoctoralSymposium__Group_4__0 )? )
            // InternalProgram.g:5802:2: ( rule__DoctoralSymposium__Group_4__0 )?
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getGroup_4()); 
            // InternalProgram.g:5803:2: ( rule__DoctoralSymposium__Group_4__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==50) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalProgram.g:5803:3: rule__DoctoralSymposium__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DoctoralSymposium__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDoctoralSymposiumAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group__4__Impl"


    // $ANTLR start "rule__DoctoralSymposium__Group__5"
    // InternalProgram.g:5811:1: rule__DoctoralSymposium__Group__5 : rule__DoctoralSymposium__Group__5__Impl ;
    public final void rule__DoctoralSymposium__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5815:1: ( rule__DoctoralSymposium__Group__5__Impl )
            // InternalProgram.g:5816:2: rule__DoctoralSymposium__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group__5"


    // $ANTLR start "rule__DoctoralSymposium__Group__5__Impl"
    // InternalProgram.g:5822:1: rule__DoctoralSymposium__Group__5__Impl : ( ( rule__DoctoralSymposium__CancelledAssignment_5 )? ) ;
    public final void rule__DoctoralSymposium__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5826:1: ( ( ( rule__DoctoralSymposium__CancelledAssignment_5 )? ) )
            // InternalProgram.g:5827:1: ( ( rule__DoctoralSymposium__CancelledAssignment_5 )? )
            {
            // InternalProgram.g:5827:1: ( ( rule__DoctoralSymposium__CancelledAssignment_5 )? )
            // InternalProgram.g:5828:2: ( rule__DoctoralSymposium__CancelledAssignment_5 )?
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getCancelledAssignment_5()); 
            // InternalProgram.g:5829:2: ( rule__DoctoralSymposium__CancelledAssignment_5 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==67) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalProgram.g:5829:3: rule__DoctoralSymposium__CancelledAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__DoctoralSymposium__CancelledAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDoctoralSymposiumAccess().getCancelledAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group__5__Impl"


    // $ANTLR start "rule__DoctoralSymposium__Group_2__0"
    // InternalProgram.g:5838:1: rule__DoctoralSymposium__Group_2__0 : rule__DoctoralSymposium__Group_2__0__Impl rule__DoctoralSymposium__Group_2__1 ;
    public final void rule__DoctoralSymposium__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5842:1: ( rule__DoctoralSymposium__Group_2__0__Impl rule__DoctoralSymposium__Group_2__1 )
            // InternalProgram.g:5843:2: rule__DoctoralSymposium__Group_2__0__Impl rule__DoctoralSymposium__Group_2__1
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
    // InternalProgram.g:5850:1: rule__DoctoralSymposium__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__DoctoralSymposium__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5854:1: ( ( 'abstract' ) )
            // InternalProgram.g:5855:1: ( 'abstract' )
            {
            // InternalProgram.g:5855:1: ( 'abstract' )
            // InternalProgram.g:5856:2: 'abstract'
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
    // InternalProgram.g:5865:1: rule__DoctoralSymposium__Group_2__1 : rule__DoctoralSymposium__Group_2__1__Impl ;
    public final void rule__DoctoralSymposium__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5869:1: ( rule__DoctoralSymposium__Group_2__1__Impl )
            // InternalProgram.g:5870:2: rule__DoctoralSymposium__Group_2__1__Impl
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
    // InternalProgram.g:5876:1: rule__DoctoralSymposium__Group_2__1__Impl : ( ( rule__DoctoralSymposium__AbstractAssignment_2_1 ) ) ;
    public final void rule__DoctoralSymposium__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5880:1: ( ( ( rule__DoctoralSymposium__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:5881:1: ( ( rule__DoctoralSymposium__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:5881:1: ( ( rule__DoctoralSymposium__AbstractAssignment_2_1 ) )
            // InternalProgram.g:5882:2: ( rule__DoctoralSymposium__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:5883:2: ( rule__DoctoralSymposium__AbstractAssignment_2_1 )
            // InternalProgram.g:5883:3: rule__DoctoralSymposium__AbstractAssignment_2_1
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
    // InternalProgram.g:5892:1: rule__DoctoralSymposium__Group_3__0 : rule__DoctoralSymposium__Group_3__0__Impl rule__DoctoralSymposium__Group_3__1 ;
    public final void rule__DoctoralSymposium__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5896:1: ( rule__DoctoralSymposium__Group_3__0__Impl rule__DoctoralSymposium__Group_3__1 )
            // InternalProgram.g:5897:2: rule__DoctoralSymposium__Group_3__0__Impl rule__DoctoralSymposium__Group_3__1
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
    // InternalProgram.g:5904:1: rule__DoctoralSymposium__Group_3__0__Impl : ( 'url' ) ;
    public final void rule__DoctoralSymposium__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5908:1: ( ( 'url' ) )
            // InternalProgram.g:5909:1: ( 'url' )
            {
            // InternalProgram.g:5909:1: ( 'url' )
            // InternalProgram.g:5910:2: 'url'
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getUrlKeyword_3_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getDoctoralSymposiumAccess().getUrlKeyword_3_0()); 

            }


            }

        }
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
    // InternalProgram.g:5919:1: rule__DoctoralSymposium__Group_3__1 : rule__DoctoralSymposium__Group_3__1__Impl ;
    public final void rule__DoctoralSymposium__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5923:1: ( rule__DoctoralSymposium__Group_3__1__Impl )
            // InternalProgram.g:5924:2: rule__DoctoralSymposium__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__Group_3__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:5930:1: rule__DoctoralSymposium__Group_3__1__Impl : ( ( rule__DoctoralSymposium__UrlAssignment_3_1 ) ) ;
    public final void rule__DoctoralSymposium__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5934:1: ( ( ( rule__DoctoralSymposium__UrlAssignment_3_1 ) ) )
            // InternalProgram.g:5935:1: ( ( rule__DoctoralSymposium__UrlAssignment_3_1 ) )
            {
            // InternalProgram.g:5935:1: ( ( rule__DoctoralSymposium__UrlAssignment_3_1 ) )
            // InternalProgram.g:5936:2: ( rule__DoctoralSymposium__UrlAssignment_3_1 )
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getUrlAssignment_3_1()); 
            // InternalProgram.g:5937:2: ( rule__DoctoralSymposium__UrlAssignment_3_1 )
            // InternalProgram.g:5937:3: rule__DoctoralSymposium__UrlAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__UrlAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDoctoralSymposiumAccess().getUrlAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__DoctoralSymposium__Group_4__0"
    // InternalProgram.g:5946:1: rule__DoctoralSymposium__Group_4__0 : rule__DoctoralSymposium__Group_4__0__Impl rule__DoctoralSymposium__Group_4__1 ;
    public final void rule__DoctoralSymposium__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5950:1: ( rule__DoctoralSymposium__Group_4__0__Impl rule__DoctoralSymposium__Group_4__1 )
            // InternalProgram.g:5951:2: rule__DoctoralSymposium__Group_4__0__Impl rule__DoctoralSymposium__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__DoctoralSymposium__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_4__0"


    // $ANTLR start "rule__DoctoralSymposium__Group_4__0__Impl"
    // InternalProgram.g:5958:1: rule__DoctoralSymposium__Group_4__0__Impl : ( 'organizers' ) ;
    public final void rule__DoctoralSymposium__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5962:1: ( ( 'organizers' ) )
            // InternalProgram.g:5963:1: ( 'organizers' )
            {
            // InternalProgram.g:5963:1: ( 'organizers' )
            // InternalProgram.g:5964:2: 'organizers'
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getOrganizersKeyword_4_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getDoctoralSymposiumAccess().getOrganizersKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_4__0__Impl"


    // $ANTLR start "rule__DoctoralSymposium__Group_4__1"
    // InternalProgram.g:5973:1: rule__DoctoralSymposium__Group_4__1 : rule__DoctoralSymposium__Group_4__1__Impl rule__DoctoralSymposium__Group_4__2 ;
    public final void rule__DoctoralSymposium__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5977:1: ( rule__DoctoralSymposium__Group_4__1__Impl rule__DoctoralSymposium__Group_4__2 )
            // InternalProgram.g:5978:2: rule__DoctoralSymposium__Group_4__1__Impl rule__DoctoralSymposium__Group_4__2
            {
            pushFollow(FOLLOW_8);
            rule__DoctoralSymposium__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_4__1"


    // $ANTLR start "rule__DoctoralSymposium__Group_4__1__Impl"
    // InternalProgram.g:5985:1: rule__DoctoralSymposium__Group_4__1__Impl : ( ( rule__DoctoralSymposium__OrganizersAssignment_4_1 ) ) ;
    public final void rule__DoctoralSymposium__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5989:1: ( ( ( rule__DoctoralSymposium__OrganizersAssignment_4_1 ) ) )
            // InternalProgram.g:5990:1: ( ( rule__DoctoralSymposium__OrganizersAssignment_4_1 ) )
            {
            // InternalProgram.g:5990:1: ( ( rule__DoctoralSymposium__OrganizersAssignment_4_1 ) )
            // InternalProgram.g:5991:2: ( rule__DoctoralSymposium__OrganizersAssignment_4_1 )
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getOrganizersAssignment_4_1()); 
            // InternalProgram.g:5992:2: ( rule__DoctoralSymposium__OrganizersAssignment_4_1 )
            // InternalProgram.g:5992:3: rule__DoctoralSymposium__OrganizersAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__OrganizersAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDoctoralSymposiumAccess().getOrganizersAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_4__1__Impl"


    // $ANTLR start "rule__DoctoralSymposium__Group_4__2"
    // InternalProgram.g:6000:1: rule__DoctoralSymposium__Group_4__2 : rule__DoctoralSymposium__Group_4__2__Impl ;
    public final void rule__DoctoralSymposium__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6004:1: ( rule__DoctoralSymposium__Group_4__2__Impl )
            // InternalProgram.g:6005:2: rule__DoctoralSymposium__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_4__2"


    // $ANTLR start "rule__DoctoralSymposium__Group_4__2__Impl"
    // InternalProgram.g:6011:1: rule__DoctoralSymposium__Group_4__2__Impl : ( ( rule__DoctoralSymposium__Group_4_2__0 )* ) ;
    public final void rule__DoctoralSymposium__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6015:1: ( ( ( rule__DoctoralSymposium__Group_4_2__0 )* ) )
            // InternalProgram.g:6016:1: ( ( rule__DoctoralSymposium__Group_4_2__0 )* )
            {
            // InternalProgram.g:6016:1: ( ( rule__DoctoralSymposium__Group_4_2__0 )* )
            // InternalProgram.g:6017:2: ( rule__DoctoralSymposium__Group_4_2__0 )*
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getGroup_4_2()); 
            // InternalProgram.g:6018:2: ( rule__DoctoralSymposium__Group_4_2__0 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==21) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalProgram.g:6018:3: rule__DoctoralSymposium__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DoctoralSymposium__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

             after(grammarAccess.getDoctoralSymposiumAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_4__2__Impl"


    // $ANTLR start "rule__DoctoralSymposium__Group_4_2__0"
    // InternalProgram.g:6027:1: rule__DoctoralSymposium__Group_4_2__0 : rule__DoctoralSymposium__Group_4_2__0__Impl rule__DoctoralSymposium__Group_4_2__1 ;
    public final void rule__DoctoralSymposium__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6031:1: ( rule__DoctoralSymposium__Group_4_2__0__Impl rule__DoctoralSymposium__Group_4_2__1 )
            // InternalProgram.g:6032:2: rule__DoctoralSymposium__Group_4_2__0__Impl rule__DoctoralSymposium__Group_4_2__1
            {
            pushFollow(FOLLOW_4);
            rule__DoctoralSymposium__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_4_2__0"


    // $ANTLR start "rule__DoctoralSymposium__Group_4_2__0__Impl"
    // InternalProgram.g:6039:1: rule__DoctoralSymposium__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__DoctoralSymposium__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6043:1: ( ( ',' ) )
            // InternalProgram.g:6044:1: ( ',' )
            {
            // InternalProgram.g:6044:1: ( ',' )
            // InternalProgram.g:6045:2: ','
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getCommaKeyword_4_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDoctoralSymposiumAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_4_2__0__Impl"


    // $ANTLR start "rule__DoctoralSymposium__Group_4_2__1"
    // InternalProgram.g:6054:1: rule__DoctoralSymposium__Group_4_2__1 : rule__DoctoralSymposium__Group_4_2__1__Impl ;
    public final void rule__DoctoralSymposium__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6058:1: ( rule__DoctoralSymposium__Group_4_2__1__Impl )
            // InternalProgram.g:6059:2: rule__DoctoralSymposium__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_4_2__1"


    // $ANTLR start "rule__DoctoralSymposium__Group_4_2__1__Impl"
    // InternalProgram.g:6065:1: rule__DoctoralSymposium__Group_4_2__1__Impl : ( ( rule__DoctoralSymposium__OrganizersAssignment_4_2_1 ) ) ;
    public final void rule__DoctoralSymposium__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6069:1: ( ( ( rule__DoctoralSymposium__OrganizersAssignment_4_2_1 ) ) )
            // InternalProgram.g:6070:1: ( ( rule__DoctoralSymposium__OrganizersAssignment_4_2_1 ) )
            {
            // InternalProgram.g:6070:1: ( ( rule__DoctoralSymposium__OrganizersAssignment_4_2_1 ) )
            // InternalProgram.g:6071:2: ( rule__DoctoralSymposium__OrganizersAssignment_4_2_1 )
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getOrganizersAssignment_4_2_1()); 
            // InternalProgram.g:6072:2: ( rule__DoctoralSymposium__OrganizersAssignment_4_2_1 )
            // InternalProgram.g:6072:3: rule__DoctoralSymposium__OrganizersAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__OrganizersAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDoctoralSymposiumAccess().getOrganizersAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_4_2__1__Impl"


    // $ANTLR start "rule__EducatorSymposium__Group__0"
    // InternalProgram.g:6081:1: rule__EducatorSymposium__Group__0 : rule__EducatorSymposium__Group__0__Impl rule__EducatorSymposium__Group__1 ;
    public final void rule__EducatorSymposium__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6085:1: ( rule__EducatorSymposium__Group__0__Impl rule__EducatorSymposium__Group__1 )
            // InternalProgram.g:6086:2: rule__EducatorSymposium__Group__0__Impl rule__EducatorSymposium__Group__1
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
    // InternalProgram.g:6093:1: rule__EducatorSymposium__Group__0__Impl : ( 'EducatorSymposium' ) ;
    public final void rule__EducatorSymposium__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6097:1: ( ( 'EducatorSymposium' ) )
            // InternalProgram.g:6098:1: ( 'EducatorSymposium' )
            {
            // InternalProgram.g:6098:1: ( 'EducatorSymposium' )
            // InternalProgram.g:6099:2: 'EducatorSymposium'
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
    // InternalProgram.g:6108:1: rule__EducatorSymposium__Group__1 : rule__EducatorSymposium__Group__1__Impl rule__EducatorSymposium__Group__2 ;
    public final void rule__EducatorSymposium__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6112:1: ( rule__EducatorSymposium__Group__1__Impl rule__EducatorSymposium__Group__2 )
            // InternalProgram.g:6113:2: rule__EducatorSymposium__Group__1__Impl rule__EducatorSymposium__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalProgram.g:6120:1: rule__EducatorSymposium__Group__1__Impl : ( ( rule__EducatorSymposium__NameAssignment_1 ) ) ;
    public final void rule__EducatorSymposium__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6124:1: ( ( ( rule__EducatorSymposium__NameAssignment_1 ) ) )
            // InternalProgram.g:6125:1: ( ( rule__EducatorSymposium__NameAssignment_1 ) )
            {
            // InternalProgram.g:6125:1: ( ( rule__EducatorSymposium__NameAssignment_1 ) )
            // InternalProgram.g:6126:2: ( rule__EducatorSymposium__NameAssignment_1 )
            {
             before(grammarAccess.getEducatorSymposiumAccess().getNameAssignment_1()); 
            // InternalProgram.g:6127:2: ( rule__EducatorSymposium__NameAssignment_1 )
            // InternalProgram.g:6127:3: rule__EducatorSymposium__NameAssignment_1
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
    // InternalProgram.g:6135:1: rule__EducatorSymposium__Group__2 : rule__EducatorSymposium__Group__2__Impl rule__EducatorSymposium__Group__3 ;
    public final void rule__EducatorSymposium__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6139:1: ( rule__EducatorSymposium__Group__2__Impl rule__EducatorSymposium__Group__3 )
            // InternalProgram.g:6140:2: rule__EducatorSymposium__Group__2__Impl rule__EducatorSymposium__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalProgram.g:6147:1: rule__EducatorSymposium__Group__2__Impl : ( ( rule__EducatorSymposium__Group_2__0 )? ) ;
    public final void rule__EducatorSymposium__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6151:1: ( ( ( rule__EducatorSymposium__Group_2__0 )? ) )
            // InternalProgram.g:6152:1: ( ( rule__EducatorSymposium__Group_2__0 )? )
            {
            // InternalProgram.g:6152:1: ( ( rule__EducatorSymposium__Group_2__0 )? )
            // InternalProgram.g:6153:2: ( rule__EducatorSymposium__Group_2__0 )?
            {
             before(grammarAccess.getEducatorSymposiumAccess().getGroup_2()); 
            // InternalProgram.g:6154:2: ( rule__EducatorSymposium__Group_2__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==38) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalProgram.g:6154:3: rule__EducatorSymposium__Group_2__0
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
    // InternalProgram.g:6162:1: rule__EducatorSymposium__Group__3 : rule__EducatorSymposium__Group__3__Impl rule__EducatorSymposium__Group__4 ;
    public final void rule__EducatorSymposium__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6166:1: ( rule__EducatorSymposium__Group__3__Impl rule__EducatorSymposium__Group__4 )
            // InternalProgram.g:6167:2: rule__EducatorSymposium__Group__3__Impl rule__EducatorSymposium__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__EducatorSymposium__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__Group__4();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:6174:1: rule__EducatorSymposium__Group__3__Impl : ( ( rule__EducatorSymposium__Group_3__0 )? ) ;
    public final void rule__EducatorSymposium__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6178:1: ( ( ( rule__EducatorSymposium__Group_3__0 )? ) )
            // InternalProgram.g:6179:1: ( ( rule__EducatorSymposium__Group_3__0 )? )
            {
            // InternalProgram.g:6179:1: ( ( rule__EducatorSymposium__Group_3__0 )? )
            // InternalProgram.g:6180:2: ( rule__EducatorSymposium__Group_3__0 )?
            {
             before(grammarAccess.getEducatorSymposiumAccess().getGroup_3()); 
            // InternalProgram.g:6181:2: ( rule__EducatorSymposium__Group_3__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==43) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalProgram.g:6181:3: rule__EducatorSymposium__Group_3__0
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


    // $ANTLR start "rule__EducatorSymposium__Group__4"
    // InternalProgram.g:6189:1: rule__EducatorSymposium__Group__4 : rule__EducatorSymposium__Group__4__Impl rule__EducatorSymposium__Group__5 ;
    public final void rule__EducatorSymposium__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6193:1: ( rule__EducatorSymposium__Group__4__Impl rule__EducatorSymposium__Group__5 )
            // InternalProgram.g:6194:2: rule__EducatorSymposium__Group__4__Impl rule__EducatorSymposium__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__EducatorSymposium__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group__4"


    // $ANTLR start "rule__EducatorSymposium__Group__4__Impl"
    // InternalProgram.g:6201:1: rule__EducatorSymposium__Group__4__Impl : ( ( rule__EducatorSymposium__Group_4__0 )? ) ;
    public final void rule__EducatorSymposium__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6205:1: ( ( ( rule__EducatorSymposium__Group_4__0 )? ) )
            // InternalProgram.g:6206:1: ( ( rule__EducatorSymposium__Group_4__0 )? )
            {
            // InternalProgram.g:6206:1: ( ( rule__EducatorSymposium__Group_4__0 )? )
            // InternalProgram.g:6207:2: ( rule__EducatorSymposium__Group_4__0 )?
            {
             before(grammarAccess.getEducatorSymposiumAccess().getGroup_4()); 
            // InternalProgram.g:6208:2: ( rule__EducatorSymposium__Group_4__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==50) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalProgram.g:6208:3: rule__EducatorSymposium__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EducatorSymposium__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEducatorSymposiumAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group__4__Impl"


    // $ANTLR start "rule__EducatorSymposium__Group__5"
    // InternalProgram.g:6216:1: rule__EducatorSymposium__Group__5 : rule__EducatorSymposium__Group__5__Impl ;
    public final void rule__EducatorSymposium__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6220:1: ( rule__EducatorSymposium__Group__5__Impl )
            // InternalProgram.g:6221:2: rule__EducatorSymposium__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group__5"


    // $ANTLR start "rule__EducatorSymposium__Group__5__Impl"
    // InternalProgram.g:6227:1: rule__EducatorSymposium__Group__5__Impl : ( ( rule__EducatorSymposium__CancelledAssignment_5 )? ) ;
    public final void rule__EducatorSymposium__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6231:1: ( ( ( rule__EducatorSymposium__CancelledAssignment_5 )? ) )
            // InternalProgram.g:6232:1: ( ( rule__EducatorSymposium__CancelledAssignment_5 )? )
            {
            // InternalProgram.g:6232:1: ( ( rule__EducatorSymposium__CancelledAssignment_5 )? )
            // InternalProgram.g:6233:2: ( rule__EducatorSymposium__CancelledAssignment_5 )?
            {
             before(grammarAccess.getEducatorSymposiumAccess().getCancelledAssignment_5()); 
            // InternalProgram.g:6234:2: ( rule__EducatorSymposium__CancelledAssignment_5 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==67) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalProgram.g:6234:3: rule__EducatorSymposium__CancelledAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__EducatorSymposium__CancelledAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEducatorSymposiumAccess().getCancelledAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group__5__Impl"


    // $ANTLR start "rule__EducatorSymposium__Group_2__0"
    // InternalProgram.g:6243:1: rule__EducatorSymposium__Group_2__0 : rule__EducatorSymposium__Group_2__0__Impl rule__EducatorSymposium__Group_2__1 ;
    public final void rule__EducatorSymposium__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6247:1: ( rule__EducatorSymposium__Group_2__0__Impl rule__EducatorSymposium__Group_2__1 )
            // InternalProgram.g:6248:2: rule__EducatorSymposium__Group_2__0__Impl rule__EducatorSymposium__Group_2__1
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
    // InternalProgram.g:6255:1: rule__EducatorSymposium__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__EducatorSymposium__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6259:1: ( ( 'abstract' ) )
            // InternalProgram.g:6260:1: ( 'abstract' )
            {
            // InternalProgram.g:6260:1: ( 'abstract' )
            // InternalProgram.g:6261:2: 'abstract'
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
    // InternalProgram.g:6270:1: rule__EducatorSymposium__Group_2__1 : rule__EducatorSymposium__Group_2__1__Impl ;
    public final void rule__EducatorSymposium__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6274:1: ( rule__EducatorSymposium__Group_2__1__Impl )
            // InternalProgram.g:6275:2: rule__EducatorSymposium__Group_2__1__Impl
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
    // InternalProgram.g:6281:1: rule__EducatorSymposium__Group_2__1__Impl : ( ( rule__EducatorSymposium__AbstractAssignment_2_1 ) ) ;
    public final void rule__EducatorSymposium__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6285:1: ( ( ( rule__EducatorSymposium__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:6286:1: ( ( rule__EducatorSymposium__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:6286:1: ( ( rule__EducatorSymposium__AbstractAssignment_2_1 ) )
            // InternalProgram.g:6287:2: ( rule__EducatorSymposium__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getEducatorSymposiumAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:6288:2: ( rule__EducatorSymposium__AbstractAssignment_2_1 )
            // InternalProgram.g:6288:3: rule__EducatorSymposium__AbstractAssignment_2_1
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
    // InternalProgram.g:6297:1: rule__EducatorSymposium__Group_3__0 : rule__EducatorSymposium__Group_3__0__Impl rule__EducatorSymposium__Group_3__1 ;
    public final void rule__EducatorSymposium__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6301:1: ( rule__EducatorSymposium__Group_3__0__Impl rule__EducatorSymposium__Group_3__1 )
            // InternalProgram.g:6302:2: rule__EducatorSymposium__Group_3__0__Impl rule__EducatorSymposium__Group_3__1
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
    // InternalProgram.g:6309:1: rule__EducatorSymposium__Group_3__0__Impl : ( 'url' ) ;
    public final void rule__EducatorSymposium__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6313:1: ( ( 'url' ) )
            // InternalProgram.g:6314:1: ( 'url' )
            {
            // InternalProgram.g:6314:1: ( 'url' )
            // InternalProgram.g:6315:2: 'url'
            {
             before(grammarAccess.getEducatorSymposiumAccess().getUrlKeyword_3_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getEducatorSymposiumAccess().getUrlKeyword_3_0()); 

            }


            }

        }
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
    // InternalProgram.g:6324:1: rule__EducatorSymposium__Group_3__1 : rule__EducatorSymposium__Group_3__1__Impl ;
    public final void rule__EducatorSymposium__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6328:1: ( rule__EducatorSymposium__Group_3__1__Impl )
            // InternalProgram.g:6329:2: rule__EducatorSymposium__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__Group_3__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:6335:1: rule__EducatorSymposium__Group_3__1__Impl : ( ( rule__EducatorSymposium__UrlAssignment_3_1 ) ) ;
    public final void rule__EducatorSymposium__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6339:1: ( ( ( rule__EducatorSymposium__UrlAssignment_3_1 ) ) )
            // InternalProgram.g:6340:1: ( ( rule__EducatorSymposium__UrlAssignment_3_1 ) )
            {
            // InternalProgram.g:6340:1: ( ( rule__EducatorSymposium__UrlAssignment_3_1 ) )
            // InternalProgram.g:6341:2: ( rule__EducatorSymposium__UrlAssignment_3_1 )
            {
             before(grammarAccess.getEducatorSymposiumAccess().getUrlAssignment_3_1()); 
            // InternalProgram.g:6342:2: ( rule__EducatorSymposium__UrlAssignment_3_1 )
            // InternalProgram.g:6342:3: rule__EducatorSymposium__UrlAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__UrlAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEducatorSymposiumAccess().getUrlAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__EducatorSymposium__Group_4__0"
    // InternalProgram.g:6351:1: rule__EducatorSymposium__Group_4__0 : rule__EducatorSymposium__Group_4__0__Impl rule__EducatorSymposium__Group_4__1 ;
    public final void rule__EducatorSymposium__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6355:1: ( rule__EducatorSymposium__Group_4__0__Impl rule__EducatorSymposium__Group_4__1 )
            // InternalProgram.g:6356:2: rule__EducatorSymposium__Group_4__0__Impl rule__EducatorSymposium__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__EducatorSymposium__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_4__0"


    // $ANTLR start "rule__EducatorSymposium__Group_4__0__Impl"
    // InternalProgram.g:6363:1: rule__EducatorSymposium__Group_4__0__Impl : ( 'organizers' ) ;
    public final void rule__EducatorSymposium__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6367:1: ( ( 'organizers' ) )
            // InternalProgram.g:6368:1: ( 'organizers' )
            {
            // InternalProgram.g:6368:1: ( 'organizers' )
            // InternalProgram.g:6369:2: 'organizers'
            {
             before(grammarAccess.getEducatorSymposiumAccess().getOrganizersKeyword_4_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getEducatorSymposiumAccess().getOrganizersKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_4__0__Impl"


    // $ANTLR start "rule__EducatorSymposium__Group_4__1"
    // InternalProgram.g:6378:1: rule__EducatorSymposium__Group_4__1 : rule__EducatorSymposium__Group_4__1__Impl rule__EducatorSymposium__Group_4__2 ;
    public final void rule__EducatorSymposium__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6382:1: ( rule__EducatorSymposium__Group_4__1__Impl rule__EducatorSymposium__Group_4__2 )
            // InternalProgram.g:6383:2: rule__EducatorSymposium__Group_4__1__Impl rule__EducatorSymposium__Group_4__2
            {
            pushFollow(FOLLOW_8);
            rule__EducatorSymposium__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_4__1"


    // $ANTLR start "rule__EducatorSymposium__Group_4__1__Impl"
    // InternalProgram.g:6390:1: rule__EducatorSymposium__Group_4__1__Impl : ( ( rule__EducatorSymposium__OrganizersAssignment_4_1 ) ) ;
    public final void rule__EducatorSymposium__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6394:1: ( ( ( rule__EducatorSymposium__OrganizersAssignment_4_1 ) ) )
            // InternalProgram.g:6395:1: ( ( rule__EducatorSymposium__OrganizersAssignment_4_1 ) )
            {
            // InternalProgram.g:6395:1: ( ( rule__EducatorSymposium__OrganizersAssignment_4_1 ) )
            // InternalProgram.g:6396:2: ( rule__EducatorSymposium__OrganizersAssignment_4_1 )
            {
             before(grammarAccess.getEducatorSymposiumAccess().getOrganizersAssignment_4_1()); 
            // InternalProgram.g:6397:2: ( rule__EducatorSymposium__OrganizersAssignment_4_1 )
            // InternalProgram.g:6397:3: rule__EducatorSymposium__OrganizersAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__OrganizersAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEducatorSymposiumAccess().getOrganizersAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_4__1__Impl"


    // $ANTLR start "rule__EducatorSymposium__Group_4__2"
    // InternalProgram.g:6405:1: rule__EducatorSymposium__Group_4__2 : rule__EducatorSymposium__Group_4__2__Impl ;
    public final void rule__EducatorSymposium__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6409:1: ( rule__EducatorSymposium__Group_4__2__Impl )
            // InternalProgram.g:6410:2: rule__EducatorSymposium__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_4__2"


    // $ANTLR start "rule__EducatorSymposium__Group_4__2__Impl"
    // InternalProgram.g:6416:1: rule__EducatorSymposium__Group_4__2__Impl : ( ( rule__EducatorSymposium__Group_4_2__0 )* ) ;
    public final void rule__EducatorSymposium__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6420:1: ( ( ( rule__EducatorSymposium__Group_4_2__0 )* ) )
            // InternalProgram.g:6421:1: ( ( rule__EducatorSymposium__Group_4_2__0 )* )
            {
            // InternalProgram.g:6421:1: ( ( rule__EducatorSymposium__Group_4_2__0 )* )
            // InternalProgram.g:6422:2: ( rule__EducatorSymposium__Group_4_2__0 )*
            {
             before(grammarAccess.getEducatorSymposiumAccess().getGroup_4_2()); 
            // InternalProgram.g:6423:2: ( rule__EducatorSymposium__Group_4_2__0 )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==21) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalProgram.g:6423:3: rule__EducatorSymposium__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__EducatorSymposium__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

             after(grammarAccess.getEducatorSymposiumAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_4__2__Impl"


    // $ANTLR start "rule__EducatorSymposium__Group_4_2__0"
    // InternalProgram.g:6432:1: rule__EducatorSymposium__Group_4_2__0 : rule__EducatorSymposium__Group_4_2__0__Impl rule__EducatorSymposium__Group_4_2__1 ;
    public final void rule__EducatorSymposium__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6436:1: ( rule__EducatorSymposium__Group_4_2__0__Impl rule__EducatorSymposium__Group_4_2__1 )
            // InternalProgram.g:6437:2: rule__EducatorSymposium__Group_4_2__0__Impl rule__EducatorSymposium__Group_4_2__1
            {
            pushFollow(FOLLOW_4);
            rule__EducatorSymposium__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_4_2__0"


    // $ANTLR start "rule__EducatorSymposium__Group_4_2__0__Impl"
    // InternalProgram.g:6444:1: rule__EducatorSymposium__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__EducatorSymposium__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6448:1: ( ( ',' ) )
            // InternalProgram.g:6449:1: ( ',' )
            {
            // InternalProgram.g:6449:1: ( ',' )
            // InternalProgram.g:6450:2: ','
            {
             before(grammarAccess.getEducatorSymposiumAccess().getCommaKeyword_4_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEducatorSymposiumAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_4_2__0__Impl"


    // $ANTLR start "rule__EducatorSymposium__Group_4_2__1"
    // InternalProgram.g:6459:1: rule__EducatorSymposium__Group_4_2__1 : rule__EducatorSymposium__Group_4_2__1__Impl ;
    public final void rule__EducatorSymposium__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6463:1: ( rule__EducatorSymposium__Group_4_2__1__Impl )
            // InternalProgram.g:6464:2: rule__EducatorSymposium__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_4_2__1"


    // $ANTLR start "rule__EducatorSymposium__Group_4_2__1__Impl"
    // InternalProgram.g:6470:1: rule__EducatorSymposium__Group_4_2__1__Impl : ( ( rule__EducatorSymposium__OrganizersAssignment_4_2_1 ) ) ;
    public final void rule__EducatorSymposium__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6474:1: ( ( ( rule__EducatorSymposium__OrganizersAssignment_4_2_1 ) ) )
            // InternalProgram.g:6475:1: ( ( rule__EducatorSymposium__OrganizersAssignment_4_2_1 ) )
            {
            // InternalProgram.g:6475:1: ( ( rule__EducatorSymposium__OrganizersAssignment_4_2_1 ) )
            // InternalProgram.g:6476:2: ( rule__EducatorSymposium__OrganizersAssignment_4_2_1 )
            {
             before(grammarAccess.getEducatorSymposiumAccess().getOrganizersAssignment_4_2_1()); 
            // InternalProgram.g:6477:2: ( rule__EducatorSymposium__OrganizersAssignment_4_2_1 )
            // InternalProgram.g:6477:3: rule__EducatorSymposium__OrganizersAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__OrganizersAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEducatorSymposiumAccess().getOrganizersAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_4_2__1__Impl"


    // $ANTLR start "rule__Reception__Group__0"
    // InternalProgram.g:6486:1: rule__Reception__Group__0 : rule__Reception__Group__0__Impl rule__Reception__Group__1 ;
    public final void rule__Reception__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6490:1: ( rule__Reception__Group__0__Impl rule__Reception__Group__1 )
            // InternalProgram.g:6491:2: rule__Reception__Group__0__Impl rule__Reception__Group__1
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
    // InternalProgram.g:6498:1: rule__Reception__Group__0__Impl : ( 'Reception' ) ;
    public final void rule__Reception__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6502:1: ( ( 'Reception' ) )
            // InternalProgram.g:6503:1: ( 'Reception' )
            {
            // InternalProgram.g:6503:1: ( 'Reception' )
            // InternalProgram.g:6504:2: 'Reception'
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
    // InternalProgram.g:6513:1: rule__Reception__Group__1 : rule__Reception__Group__1__Impl rule__Reception__Group__2 ;
    public final void rule__Reception__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6517:1: ( rule__Reception__Group__1__Impl rule__Reception__Group__2 )
            // InternalProgram.g:6518:2: rule__Reception__Group__1__Impl rule__Reception__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalProgram.g:6525:1: rule__Reception__Group__1__Impl : ( ( rule__Reception__NameAssignment_1 ) ) ;
    public final void rule__Reception__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6529:1: ( ( ( rule__Reception__NameAssignment_1 ) ) )
            // InternalProgram.g:6530:1: ( ( rule__Reception__NameAssignment_1 ) )
            {
            // InternalProgram.g:6530:1: ( ( rule__Reception__NameAssignment_1 ) )
            // InternalProgram.g:6531:2: ( rule__Reception__NameAssignment_1 )
            {
             before(grammarAccess.getReceptionAccess().getNameAssignment_1()); 
            // InternalProgram.g:6532:2: ( rule__Reception__NameAssignment_1 )
            // InternalProgram.g:6532:3: rule__Reception__NameAssignment_1
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
    // InternalProgram.g:6540:1: rule__Reception__Group__2 : rule__Reception__Group__2__Impl rule__Reception__Group__3 ;
    public final void rule__Reception__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6544:1: ( rule__Reception__Group__2__Impl rule__Reception__Group__3 )
            // InternalProgram.g:6545:2: rule__Reception__Group__2__Impl rule__Reception__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Reception__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reception__Group__3();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:6552:1: rule__Reception__Group__2__Impl : ( ( rule__Reception__Group_2__0 )? ) ;
    public final void rule__Reception__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6556:1: ( ( ( rule__Reception__Group_2__0 )? ) )
            // InternalProgram.g:6557:1: ( ( rule__Reception__Group_2__0 )? )
            {
            // InternalProgram.g:6557:1: ( ( rule__Reception__Group_2__0 )? )
            // InternalProgram.g:6558:2: ( rule__Reception__Group_2__0 )?
            {
             before(grammarAccess.getReceptionAccess().getGroup_2()); 
            // InternalProgram.g:6559:2: ( rule__Reception__Group_2__0 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==38) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalProgram.g:6559:3: rule__Reception__Group_2__0
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


    // $ANTLR start "rule__Reception__Group__3"
    // InternalProgram.g:6567:1: rule__Reception__Group__3 : rule__Reception__Group__3__Impl ;
    public final void rule__Reception__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6571:1: ( rule__Reception__Group__3__Impl )
            // InternalProgram.g:6572:2: rule__Reception__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reception__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reception__Group__3"


    // $ANTLR start "rule__Reception__Group__3__Impl"
    // InternalProgram.g:6578:1: rule__Reception__Group__3__Impl : ( ( rule__Reception__CancelledAssignment_3 )? ) ;
    public final void rule__Reception__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6582:1: ( ( ( rule__Reception__CancelledAssignment_3 )? ) )
            // InternalProgram.g:6583:1: ( ( rule__Reception__CancelledAssignment_3 )? )
            {
            // InternalProgram.g:6583:1: ( ( rule__Reception__CancelledAssignment_3 )? )
            // InternalProgram.g:6584:2: ( rule__Reception__CancelledAssignment_3 )?
            {
             before(grammarAccess.getReceptionAccess().getCancelledAssignment_3()); 
            // InternalProgram.g:6585:2: ( rule__Reception__CancelledAssignment_3 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==67) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalProgram.g:6585:3: rule__Reception__CancelledAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reception__CancelledAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReceptionAccess().getCancelledAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reception__Group__3__Impl"


    // $ANTLR start "rule__Reception__Group_2__0"
    // InternalProgram.g:6594:1: rule__Reception__Group_2__0 : rule__Reception__Group_2__0__Impl rule__Reception__Group_2__1 ;
    public final void rule__Reception__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6598:1: ( rule__Reception__Group_2__0__Impl rule__Reception__Group_2__1 )
            // InternalProgram.g:6599:2: rule__Reception__Group_2__0__Impl rule__Reception__Group_2__1
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
    // InternalProgram.g:6606:1: rule__Reception__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__Reception__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6610:1: ( ( 'abstract' ) )
            // InternalProgram.g:6611:1: ( 'abstract' )
            {
            // InternalProgram.g:6611:1: ( 'abstract' )
            // InternalProgram.g:6612:2: 'abstract'
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
    // InternalProgram.g:6621:1: rule__Reception__Group_2__1 : rule__Reception__Group_2__1__Impl ;
    public final void rule__Reception__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6625:1: ( rule__Reception__Group_2__1__Impl )
            // InternalProgram.g:6626:2: rule__Reception__Group_2__1__Impl
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
    // InternalProgram.g:6632:1: rule__Reception__Group_2__1__Impl : ( ( rule__Reception__AbstractAssignment_2_1 ) ) ;
    public final void rule__Reception__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6636:1: ( ( ( rule__Reception__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:6637:1: ( ( rule__Reception__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:6637:1: ( ( rule__Reception__AbstractAssignment_2_1 ) )
            // InternalProgram.g:6638:2: ( rule__Reception__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getReceptionAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:6639:2: ( rule__Reception__AbstractAssignment_2_1 )
            // InternalProgram.g:6639:3: rule__Reception__AbstractAssignment_2_1
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
    // InternalProgram.g:6648:1: rule__Clinic__Group__0 : rule__Clinic__Group__0__Impl rule__Clinic__Group__1 ;
    public final void rule__Clinic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6652:1: ( rule__Clinic__Group__0__Impl rule__Clinic__Group__1 )
            // InternalProgram.g:6653:2: rule__Clinic__Group__0__Impl rule__Clinic__Group__1
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
    // InternalProgram.g:6660:1: rule__Clinic__Group__0__Impl : ( 'Clinic' ) ;
    public final void rule__Clinic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6664:1: ( ( 'Clinic' ) )
            // InternalProgram.g:6665:1: ( 'Clinic' )
            {
            // InternalProgram.g:6665:1: ( 'Clinic' )
            // InternalProgram.g:6666:2: 'Clinic'
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
    // InternalProgram.g:6675:1: rule__Clinic__Group__1 : rule__Clinic__Group__1__Impl rule__Clinic__Group__2 ;
    public final void rule__Clinic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6679:1: ( rule__Clinic__Group__1__Impl rule__Clinic__Group__2 )
            // InternalProgram.g:6680:2: rule__Clinic__Group__1__Impl rule__Clinic__Group__2
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
    // InternalProgram.g:6687:1: rule__Clinic__Group__1__Impl : ( ( rule__Clinic__NameAssignment_1 ) ) ;
    public final void rule__Clinic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6691:1: ( ( ( rule__Clinic__NameAssignment_1 ) ) )
            // InternalProgram.g:6692:1: ( ( rule__Clinic__NameAssignment_1 ) )
            {
            // InternalProgram.g:6692:1: ( ( rule__Clinic__NameAssignment_1 ) )
            // InternalProgram.g:6693:2: ( rule__Clinic__NameAssignment_1 )
            {
             before(grammarAccess.getClinicAccess().getNameAssignment_1()); 
            // InternalProgram.g:6694:2: ( rule__Clinic__NameAssignment_1 )
            // InternalProgram.g:6694:3: rule__Clinic__NameAssignment_1
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
    // InternalProgram.g:6702:1: rule__Clinic__Group__2 : rule__Clinic__Group__2__Impl rule__Clinic__Group__3 ;
    public final void rule__Clinic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6706:1: ( rule__Clinic__Group__2__Impl rule__Clinic__Group__3 )
            // InternalProgram.g:6707:2: rule__Clinic__Group__2__Impl rule__Clinic__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Clinic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clinic__Group__3();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:6714:1: rule__Clinic__Group__2__Impl : ( ( rule__Clinic__Group_2__0 )? ) ;
    public final void rule__Clinic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6718:1: ( ( ( rule__Clinic__Group_2__0 )? ) )
            // InternalProgram.g:6719:1: ( ( rule__Clinic__Group_2__0 )? )
            {
            // InternalProgram.g:6719:1: ( ( rule__Clinic__Group_2__0 )? )
            // InternalProgram.g:6720:2: ( rule__Clinic__Group_2__0 )?
            {
             before(grammarAccess.getClinicAccess().getGroup_2()); 
            // InternalProgram.g:6721:2: ( rule__Clinic__Group_2__0 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==38) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalProgram.g:6721:3: rule__Clinic__Group_2__0
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


    // $ANTLR start "rule__Clinic__Group__3"
    // InternalProgram.g:6729:1: rule__Clinic__Group__3 : rule__Clinic__Group__3__Impl rule__Clinic__Group__4 ;
    public final void rule__Clinic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6733:1: ( rule__Clinic__Group__3__Impl rule__Clinic__Group__4 )
            // InternalProgram.g:6734:2: rule__Clinic__Group__3__Impl rule__Clinic__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Clinic__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clinic__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clinic__Group__3"


    // $ANTLR start "rule__Clinic__Group__3__Impl"
    // InternalProgram.g:6741:1: rule__Clinic__Group__3__Impl : ( ( rule__Clinic__Group_3__0 )? ) ;
    public final void rule__Clinic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6745:1: ( ( ( rule__Clinic__Group_3__0 )? ) )
            // InternalProgram.g:6746:1: ( ( rule__Clinic__Group_3__0 )? )
            {
            // InternalProgram.g:6746:1: ( ( rule__Clinic__Group_3__0 )? )
            // InternalProgram.g:6747:2: ( rule__Clinic__Group_3__0 )?
            {
             before(grammarAccess.getClinicAccess().getGroup_3()); 
            // InternalProgram.g:6748:2: ( rule__Clinic__Group_3__0 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==43) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalProgram.g:6748:3: rule__Clinic__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Clinic__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClinicAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clinic__Group__3__Impl"


    // $ANTLR start "rule__Clinic__Group__4"
    // InternalProgram.g:6756:1: rule__Clinic__Group__4 : rule__Clinic__Group__4__Impl ;
    public final void rule__Clinic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6760:1: ( rule__Clinic__Group__4__Impl )
            // InternalProgram.g:6761:2: rule__Clinic__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clinic__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clinic__Group__4"


    // $ANTLR start "rule__Clinic__Group__4__Impl"
    // InternalProgram.g:6767:1: rule__Clinic__Group__4__Impl : ( ( rule__Clinic__CancelledAssignment_4 )? ) ;
    public final void rule__Clinic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6771:1: ( ( ( rule__Clinic__CancelledAssignment_4 )? ) )
            // InternalProgram.g:6772:1: ( ( rule__Clinic__CancelledAssignment_4 )? )
            {
            // InternalProgram.g:6772:1: ( ( rule__Clinic__CancelledAssignment_4 )? )
            // InternalProgram.g:6773:2: ( rule__Clinic__CancelledAssignment_4 )?
            {
             before(grammarAccess.getClinicAccess().getCancelledAssignment_4()); 
            // InternalProgram.g:6774:2: ( rule__Clinic__CancelledAssignment_4 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==67) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalProgram.g:6774:3: rule__Clinic__CancelledAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Clinic__CancelledAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClinicAccess().getCancelledAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clinic__Group__4__Impl"


    // $ANTLR start "rule__Clinic__Group_2__0"
    // InternalProgram.g:6783:1: rule__Clinic__Group_2__0 : rule__Clinic__Group_2__0__Impl rule__Clinic__Group_2__1 ;
    public final void rule__Clinic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6787:1: ( rule__Clinic__Group_2__0__Impl rule__Clinic__Group_2__1 )
            // InternalProgram.g:6788:2: rule__Clinic__Group_2__0__Impl rule__Clinic__Group_2__1
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
    // InternalProgram.g:6795:1: rule__Clinic__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__Clinic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6799:1: ( ( 'abstract' ) )
            // InternalProgram.g:6800:1: ( 'abstract' )
            {
            // InternalProgram.g:6800:1: ( 'abstract' )
            // InternalProgram.g:6801:2: 'abstract'
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
    // InternalProgram.g:6810:1: rule__Clinic__Group_2__1 : rule__Clinic__Group_2__1__Impl ;
    public final void rule__Clinic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6814:1: ( rule__Clinic__Group_2__1__Impl )
            // InternalProgram.g:6815:2: rule__Clinic__Group_2__1__Impl
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
    // InternalProgram.g:6821:1: rule__Clinic__Group_2__1__Impl : ( ( rule__Clinic__AbstractAssignment_2_1 ) ) ;
    public final void rule__Clinic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6825:1: ( ( ( rule__Clinic__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:6826:1: ( ( rule__Clinic__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:6826:1: ( ( rule__Clinic__AbstractAssignment_2_1 ) )
            // InternalProgram.g:6827:2: ( rule__Clinic__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getClinicAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:6828:2: ( rule__Clinic__AbstractAssignment_2_1 )
            // InternalProgram.g:6828:3: rule__Clinic__AbstractAssignment_2_1
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


    // $ANTLR start "rule__Clinic__Group_3__0"
    // InternalProgram.g:6837:1: rule__Clinic__Group_3__0 : rule__Clinic__Group_3__0__Impl rule__Clinic__Group_3__1 ;
    public final void rule__Clinic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6841:1: ( rule__Clinic__Group_3__0__Impl rule__Clinic__Group_3__1 )
            // InternalProgram.g:6842:2: rule__Clinic__Group_3__0__Impl rule__Clinic__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Clinic__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clinic__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clinic__Group_3__0"


    // $ANTLR start "rule__Clinic__Group_3__0__Impl"
    // InternalProgram.g:6849:1: rule__Clinic__Group_3__0__Impl : ( 'url' ) ;
    public final void rule__Clinic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6853:1: ( ( 'url' ) )
            // InternalProgram.g:6854:1: ( 'url' )
            {
            // InternalProgram.g:6854:1: ( 'url' )
            // InternalProgram.g:6855:2: 'url'
            {
             before(grammarAccess.getClinicAccess().getUrlKeyword_3_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getClinicAccess().getUrlKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clinic__Group_3__0__Impl"


    // $ANTLR start "rule__Clinic__Group_3__1"
    // InternalProgram.g:6864:1: rule__Clinic__Group_3__1 : rule__Clinic__Group_3__1__Impl ;
    public final void rule__Clinic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6868:1: ( rule__Clinic__Group_3__1__Impl )
            // InternalProgram.g:6869:2: rule__Clinic__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clinic__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clinic__Group_3__1"


    // $ANTLR start "rule__Clinic__Group_3__1__Impl"
    // InternalProgram.g:6875:1: rule__Clinic__Group_3__1__Impl : ( ( rule__Clinic__UrlAssignment_3_1 ) ) ;
    public final void rule__Clinic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6879:1: ( ( ( rule__Clinic__UrlAssignment_3_1 ) ) )
            // InternalProgram.g:6880:1: ( ( rule__Clinic__UrlAssignment_3_1 ) )
            {
            // InternalProgram.g:6880:1: ( ( rule__Clinic__UrlAssignment_3_1 ) )
            // InternalProgram.g:6881:2: ( rule__Clinic__UrlAssignment_3_1 )
            {
             before(grammarAccess.getClinicAccess().getUrlAssignment_3_1()); 
            // InternalProgram.g:6882:2: ( rule__Clinic__UrlAssignment_3_1 )
            // InternalProgram.g:6882:3: rule__Clinic__UrlAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Clinic__UrlAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClinicAccess().getUrlAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clinic__Group_3__1__Impl"


    // $ANTLR start "rule__Lunch__Group__0"
    // InternalProgram.g:6891:1: rule__Lunch__Group__0 : rule__Lunch__Group__0__Impl rule__Lunch__Group__1 ;
    public final void rule__Lunch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6895:1: ( rule__Lunch__Group__0__Impl rule__Lunch__Group__1 )
            // InternalProgram.g:6896:2: rule__Lunch__Group__0__Impl rule__Lunch__Group__1
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
    // InternalProgram.g:6903:1: rule__Lunch__Group__0__Impl : ( 'Lunch' ) ;
    public final void rule__Lunch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6907:1: ( ( 'Lunch' ) )
            // InternalProgram.g:6908:1: ( 'Lunch' )
            {
            // InternalProgram.g:6908:1: ( 'Lunch' )
            // InternalProgram.g:6909:2: 'Lunch'
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
    // InternalProgram.g:6918:1: rule__Lunch__Group__1 : rule__Lunch__Group__1__Impl rule__Lunch__Group__2 ;
    public final void rule__Lunch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6922:1: ( rule__Lunch__Group__1__Impl rule__Lunch__Group__2 )
            // InternalProgram.g:6923:2: rule__Lunch__Group__1__Impl rule__Lunch__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalProgram.g:6930:1: rule__Lunch__Group__1__Impl : ( ( rule__Lunch__NameAssignment_1 ) ) ;
    public final void rule__Lunch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6934:1: ( ( ( rule__Lunch__NameAssignment_1 ) ) )
            // InternalProgram.g:6935:1: ( ( rule__Lunch__NameAssignment_1 ) )
            {
            // InternalProgram.g:6935:1: ( ( rule__Lunch__NameAssignment_1 ) )
            // InternalProgram.g:6936:2: ( rule__Lunch__NameAssignment_1 )
            {
             before(grammarAccess.getLunchAccess().getNameAssignment_1()); 
            // InternalProgram.g:6937:2: ( rule__Lunch__NameAssignment_1 )
            // InternalProgram.g:6937:3: rule__Lunch__NameAssignment_1
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
    // InternalProgram.g:6945:1: rule__Lunch__Group__2 : rule__Lunch__Group__2__Impl ;
    public final void rule__Lunch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6949:1: ( rule__Lunch__Group__2__Impl )
            // InternalProgram.g:6950:2: rule__Lunch__Group__2__Impl
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
    // InternalProgram.g:6956:1: rule__Lunch__Group__2__Impl : ( ( rule__Lunch__Group_2__0 )? ) ;
    public final void rule__Lunch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6960:1: ( ( ( rule__Lunch__Group_2__0 )? ) )
            // InternalProgram.g:6961:1: ( ( rule__Lunch__Group_2__0 )? )
            {
            // InternalProgram.g:6961:1: ( ( rule__Lunch__Group_2__0 )? )
            // InternalProgram.g:6962:2: ( rule__Lunch__Group_2__0 )?
            {
             before(grammarAccess.getLunchAccess().getGroup_2()); 
            // InternalProgram.g:6963:2: ( rule__Lunch__Group_2__0 )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==38) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalProgram.g:6963:3: rule__Lunch__Group_2__0
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
    // InternalProgram.g:6972:1: rule__Lunch__Group_2__0 : rule__Lunch__Group_2__0__Impl rule__Lunch__Group_2__1 ;
    public final void rule__Lunch__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6976:1: ( rule__Lunch__Group_2__0__Impl rule__Lunch__Group_2__1 )
            // InternalProgram.g:6977:2: rule__Lunch__Group_2__0__Impl rule__Lunch__Group_2__1
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
    // InternalProgram.g:6984:1: rule__Lunch__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__Lunch__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6988:1: ( ( 'abstract' ) )
            // InternalProgram.g:6989:1: ( 'abstract' )
            {
            // InternalProgram.g:6989:1: ( 'abstract' )
            // InternalProgram.g:6990:2: 'abstract'
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
    // InternalProgram.g:6999:1: rule__Lunch__Group_2__1 : rule__Lunch__Group_2__1__Impl ;
    public final void rule__Lunch__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7003:1: ( rule__Lunch__Group_2__1__Impl )
            // InternalProgram.g:7004:2: rule__Lunch__Group_2__1__Impl
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
    // InternalProgram.g:7010:1: rule__Lunch__Group_2__1__Impl : ( ( rule__Lunch__AbstractAssignment_2_1 ) ) ;
    public final void rule__Lunch__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7014:1: ( ( ( rule__Lunch__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:7015:1: ( ( rule__Lunch__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:7015:1: ( ( rule__Lunch__AbstractAssignment_2_1 ) )
            // InternalProgram.g:7016:2: ( rule__Lunch__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getLunchAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:7017:2: ( rule__Lunch__AbstractAssignment_2_1 )
            // InternalProgram.g:7017:3: rule__Lunch__AbstractAssignment_2_1
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
    // InternalProgram.g:7026:1: rule__CoffeeBreak__Group__0 : rule__CoffeeBreak__Group__0__Impl rule__CoffeeBreak__Group__1 ;
    public final void rule__CoffeeBreak__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7030:1: ( rule__CoffeeBreak__Group__0__Impl rule__CoffeeBreak__Group__1 )
            // InternalProgram.g:7031:2: rule__CoffeeBreak__Group__0__Impl rule__CoffeeBreak__Group__1
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
    // InternalProgram.g:7038:1: rule__CoffeeBreak__Group__0__Impl : ( 'CoffeeBreak' ) ;
    public final void rule__CoffeeBreak__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7042:1: ( ( 'CoffeeBreak' ) )
            // InternalProgram.g:7043:1: ( 'CoffeeBreak' )
            {
            // InternalProgram.g:7043:1: ( 'CoffeeBreak' )
            // InternalProgram.g:7044:2: 'CoffeeBreak'
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
    // InternalProgram.g:7053:1: rule__CoffeeBreak__Group__1 : rule__CoffeeBreak__Group__1__Impl rule__CoffeeBreak__Group__2 ;
    public final void rule__CoffeeBreak__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7057:1: ( rule__CoffeeBreak__Group__1__Impl rule__CoffeeBreak__Group__2 )
            // InternalProgram.g:7058:2: rule__CoffeeBreak__Group__1__Impl rule__CoffeeBreak__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalProgram.g:7065:1: rule__CoffeeBreak__Group__1__Impl : ( ( rule__CoffeeBreak__NameAssignment_1 ) ) ;
    public final void rule__CoffeeBreak__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7069:1: ( ( ( rule__CoffeeBreak__NameAssignment_1 ) ) )
            // InternalProgram.g:7070:1: ( ( rule__CoffeeBreak__NameAssignment_1 ) )
            {
            // InternalProgram.g:7070:1: ( ( rule__CoffeeBreak__NameAssignment_1 ) )
            // InternalProgram.g:7071:2: ( rule__CoffeeBreak__NameAssignment_1 )
            {
             before(grammarAccess.getCoffeeBreakAccess().getNameAssignment_1()); 
            // InternalProgram.g:7072:2: ( rule__CoffeeBreak__NameAssignment_1 )
            // InternalProgram.g:7072:3: rule__CoffeeBreak__NameAssignment_1
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
    // InternalProgram.g:7080:1: rule__CoffeeBreak__Group__2 : rule__CoffeeBreak__Group__2__Impl ;
    public final void rule__CoffeeBreak__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7084:1: ( rule__CoffeeBreak__Group__2__Impl )
            // InternalProgram.g:7085:2: rule__CoffeeBreak__Group__2__Impl
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
    // InternalProgram.g:7091:1: rule__CoffeeBreak__Group__2__Impl : ( ( rule__CoffeeBreak__Group_2__0 )? ) ;
    public final void rule__CoffeeBreak__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7095:1: ( ( ( rule__CoffeeBreak__Group_2__0 )? ) )
            // InternalProgram.g:7096:1: ( ( rule__CoffeeBreak__Group_2__0 )? )
            {
            // InternalProgram.g:7096:1: ( ( rule__CoffeeBreak__Group_2__0 )? )
            // InternalProgram.g:7097:2: ( rule__CoffeeBreak__Group_2__0 )?
            {
             before(grammarAccess.getCoffeeBreakAccess().getGroup_2()); 
            // InternalProgram.g:7098:2: ( rule__CoffeeBreak__Group_2__0 )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==38) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalProgram.g:7098:3: rule__CoffeeBreak__Group_2__0
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
    // InternalProgram.g:7107:1: rule__CoffeeBreak__Group_2__0 : rule__CoffeeBreak__Group_2__0__Impl rule__CoffeeBreak__Group_2__1 ;
    public final void rule__CoffeeBreak__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7111:1: ( rule__CoffeeBreak__Group_2__0__Impl rule__CoffeeBreak__Group_2__1 )
            // InternalProgram.g:7112:2: rule__CoffeeBreak__Group_2__0__Impl rule__CoffeeBreak__Group_2__1
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
    // InternalProgram.g:7119:1: rule__CoffeeBreak__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__CoffeeBreak__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7123:1: ( ( 'abstract' ) )
            // InternalProgram.g:7124:1: ( 'abstract' )
            {
            // InternalProgram.g:7124:1: ( 'abstract' )
            // InternalProgram.g:7125:2: 'abstract'
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
    // InternalProgram.g:7134:1: rule__CoffeeBreak__Group_2__1 : rule__CoffeeBreak__Group_2__1__Impl ;
    public final void rule__CoffeeBreak__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7138:1: ( rule__CoffeeBreak__Group_2__1__Impl )
            // InternalProgram.g:7139:2: rule__CoffeeBreak__Group_2__1__Impl
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
    // InternalProgram.g:7145:1: rule__CoffeeBreak__Group_2__1__Impl : ( ( rule__CoffeeBreak__AbstractAssignment_2_1 ) ) ;
    public final void rule__CoffeeBreak__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7149:1: ( ( ( rule__CoffeeBreak__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:7150:1: ( ( rule__CoffeeBreak__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:7150:1: ( ( rule__CoffeeBreak__AbstractAssignment_2_1 ) )
            // InternalProgram.g:7151:2: ( rule__CoffeeBreak__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getCoffeeBreakAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:7152:2: ( rule__CoffeeBreak__AbstractAssignment_2_1 )
            // InternalProgram.g:7152:3: rule__CoffeeBreak__AbstractAssignment_2_1
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
    // InternalProgram.g:7161:1: rule__Meeting__Group__0 : rule__Meeting__Group__0__Impl rule__Meeting__Group__1 ;
    public final void rule__Meeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7165:1: ( rule__Meeting__Group__0__Impl rule__Meeting__Group__1 )
            // InternalProgram.g:7166:2: rule__Meeting__Group__0__Impl rule__Meeting__Group__1
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
    // InternalProgram.g:7173:1: rule__Meeting__Group__0__Impl : ( 'Meeting' ) ;
    public final void rule__Meeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7177:1: ( ( 'Meeting' ) )
            // InternalProgram.g:7178:1: ( 'Meeting' )
            {
            // InternalProgram.g:7178:1: ( 'Meeting' )
            // InternalProgram.g:7179:2: 'Meeting'
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
    // InternalProgram.g:7188:1: rule__Meeting__Group__1 : rule__Meeting__Group__1__Impl rule__Meeting__Group__2 ;
    public final void rule__Meeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7192:1: ( rule__Meeting__Group__1__Impl rule__Meeting__Group__2 )
            // InternalProgram.g:7193:2: rule__Meeting__Group__1__Impl rule__Meeting__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalProgram.g:7200:1: rule__Meeting__Group__1__Impl : ( ( rule__Meeting__NameAssignment_1 ) ) ;
    public final void rule__Meeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7204:1: ( ( ( rule__Meeting__NameAssignment_1 ) ) )
            // InternalProgram.g:7205:1: ( ( rule__Meeting__NameAssignment_1 ) )
            {
            // InternalProgram.g:7205:1: ( ( rule__Meeting__NameAssignment_1 ) )
            // InternalProgram.g:7206:2: ( rule__Meeting__NameAssignment_1 )
            {
             before(grammarAccess.getMeetingAccess().getNameAssignment_1()); 
            // InternalProgram.g:7207:2: ( rule__Meeting__NameAssignment_1 )
            // InternalProgram.g:7207:3: rule__Meeting__NameAssignment_1
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
    // InternalProgram.g:7215:1: rule__Meeting__Group__2 : rule__Meeting__Group__2__Impl rule__Meeting__Group__3 ;
    public final void rule__Meeting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7219:1: ( rule__Meeting__Group__2__Impl rule__Meeting__Group__3 )
            // InternalProgram.g:7220:2: rule__Meeting__Group__2__Impl rule__Meeting__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__Meeting__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meeting__Group__3();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:7227:1: rule__Meeting__Group__2__Impl : ( ( rule__Meeting__Group_2__0 )? ) ;
    public final void rule__Meeting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7231:1: ( ( ( rule__Meeting__Group_2__0 )? ) )
            // InternalProgram.g:7232:1: ( ( rule__Meeting__Group_2__0 )? )
            {
            // InternalProgram.g:7232:1: ( ( rule__Meeting__Group_2__0 )? )
            // InternalProgram.g:7233:2: ( rule__Meeting__Group_2__0 )?
            {
             before(grammarAccess.getMeetingAccess().getGroup_2()); 
            // InternalProgram.g:7234:2: ( rule__Meeting__Group_2__0 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==38) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalProgram.g:7234:3: rule__Meeting__Group_2__0
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


    // $ANTLR start "rule__Meeting__Group__3"
    // InternalProgram.g:7242:1: rule__Meeting__Group__3 : rule__Meeting__Group__3__Impl rule__Meeting__Group__4 ;
    public final void rule__Meeting__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7246:1: ( rule__Meeting__Group__3__Impl rule__Meeting__Group__4 )
            // InternalProgram.g:7247:2: rule__Meeting__Group__3__Impl rule__Meeting__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__Meeting__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meeting__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group__3"


    // $ANTLR start "rule__Meeting__Group__3__Impl"
    // InternalProgram.g:7254:1: rule__Meeting__Group__3__Impl : ( ( rule__Meeting__Group_3__0 )? ) ;
    public final void rule__Meeting__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7258:1: ( ( ( rule__Meeting__Group_3__0 )? ) )
            // InternalProgram.g:7259:1: ( ( rule__Meeting__Group_3__0 )? )
            {
            // InternalProgram.g:7259:1: ( ( rule__Meeting__Group_3__0 )? )
            // InternalProgram.g:7260:2: ( rule__Meeting__Group_3__0 )?
            {
             before(grammarAccess.getMeetingAccess().getGroup_3()); 
            // InternalProgram.g:7261:2: ( rule__Meeting__Group_3__0 )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==59) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalProgram.g:7261:3: rule__Meeting__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Meeting__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeetingAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group__3__Impl"


    // $ANTLR start "rule__Meeting__Group__4"
    // InternalProgram.g:7269:1: rule__Meeting__Group__4 : rule__Meeting__Group__4__Impl ;
    public final void rule__Meeting__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7273:1: ( rule__Meeting__Group__4__Impl )
            // InternalProgram.g:7274:2: rule__Meeting__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Meeting__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group__4"


    // $ANTLR start "rule__Meeting__Group__4__Impl"
    // InternalProgram.g:7280:1: rule__Meeting__Group__4__Impl : ( ( rule__Meeting__CancelledAssignment_4 )? ) ;
    public final void rule__Meeting__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7284:1: ( ( ( rule__Meeting__CancelledAssignment_4 )? ) )
            // InternalProgram.g:7285:1: ( ( rule__Meeting__CancelledAssignment_4 )? )
            {
            // InternalProgram.g:7285:1: ( ( rule__Meeting__CancelledAssignment_4 )? )
            // InternalProgram.g:7286:2: ( rule__Meeting__CancelledAssignment_4 )?
            {
             before(grammarAccess.getMeetingAccess().getCancelledAssignment_4()); 
            // InternalProgram.g:7287:2: ( rule__Meeting__CancelledAssignment_4 )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==67) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalProgram.g:7287:3: rule__Meeting__CancelledAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Meeting__CancelledAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeetingAccess().getCancelledAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group__4__Impl"


    // $ANTLR start "rule__Meeting__Group_2__0"
    // InternalProgram.g:7296:1: rule__Meeting__Group_2__0 : rule__Meeting__Group_2__0__Impl rule__Meeting__Group_2__1 ;
    public final void rule__Meeting__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7300:1: ( rule__Meeting__Group_2__0__Impl rule__Meeting__Group_2__1 )
            // InternalProgram.g:7301:2: rule__Meeting__Group_2__0__Impl rule__Meeting__Group_2__1
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
    // InternalProgram.g:7308:1: rule__Meeting__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__Meeting__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7312:1: ( ( 'abstract' ) )
            // InternalProgram.g:7313:1: ( 'abstract' )
            {
            // InternalProgram.g:7313:1: ( 'abstract' )
            // InternalProgram.g:7314:2: 'abstract'
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
    // InternalProgram.g:7323:1: rule__Meeting__Group_2__1 : rule__Meeting__Group_2__1__Impl ;
    public final void rule__Meeting__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7327:1: ( rule__Meeting__Group_2__1__Impl )
            // InternalProgram.g:7328:2: rule__Meeting__Group_2__1__Impl
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
    // InternalProgram.g:7334:1: rule__Meeting__Group_2__1__Impl : ( ( rule__Meeting__AbstractAssignment_2_1 ) ) ;
    public final void rule__Meeting__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7338:1: ( ( ( rule__Meeting__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:7339:1: ( ( rule__Meeting__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:7339:1: ( ( rule__Meeting__AbstractAssignment_2_1 ) )
            // InternalProgram.g:7340:2: ( rule__Meeting__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getMeetingAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:7341:2: ( rule__Meeting__AbstractAssignment_2_1 )
            // InternalProgram.g:7341:3: rule__Meeting__AbstractAssignment_2_1
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


    // $ANTLR start "rule__Meeting__Group_3__0"
    // InternalProgram.g:7350:1: rule__Meeting__Group_3__0 : rule__Meeting__Group_3__0__Impl rule__Meeting__Group_3__1 ;
    public final void rule__Meeting__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7354:1: ( rule__Meeting__Group_3__0__Impl rule__Meeting__Group_3__1 )
            // InternalProgram.g:7355:2: rule__Meeting__Group_3__0__Impl rule__Meeting__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Meeting__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meeting__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group_3__0"


    // $ANTLR start "rule__Meeting__Group_3__0__Impl"
    // InternalProgram.g:7362:1: rule__Meeting__Group_3__0__Impl : ( 'participants' ) ;
    public final void rule__Meeting__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7366:1: ( ( 'participants' ) )
            // InternalProgram.g:7367:1: ( 'participants' )
            {
            // InternalProgram.g:7367:1: ( 'participants' )
            // InternalProgram.g:7368:2: 'participants'
            {
             before(grammarAccess.getMeetingAccess().getParticipantsKeyword_3_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getMeetingAccess().getParticipantsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group_3__0__Impl"


    // $ANTLR start "rule__Meeting__Group_3__1"
    // InternalProgram.g:7377:1: rule__Meeting__Group_3__1 : rule__Meeting__Group_3__1__Impl rule__Meeting__Group_3__2 ;
    public final void rule__Meeting__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7381:1: ( rule__Meeting__Group_3__1__Impl rule__Meeting__Group_3__2 )
            // InternalProgram.g:7382:2: rule__Meeting__Group_3__1__Impl rule__Meeting__Group_3__2
            {
            pushFollow(FOLLOW_8);
            rule__Meeting__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meeting__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group_3__1"


    // $ANTLR start "rule__Meeting__Group_3__1__Impl"
    // InternalProgram.g:7389:1: rule__Meeting__Group_3__1__Impl : ( ( rule__Meeting__ParticipantsAssignment_3_1 ) ) ;
    public final void rule__Meeting__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7393:1: ( ( ( rule__Meeting__ParticipantsAssignment_3_1 ) ) )
            // InternalProgram.g:7394:1: ( ( rule__Meeting__ParticipantsAssignment_3_1 ) )
            {
            // InternalProgram.g:7394:1: ( ( rule__Meeting__ParticipantsAssignment_3_1 ) )
            // InternalProgram.g:7395:2: ( rule__Meeting__ParticipantsAssignment_3_1 )
            {
             before(grammarAccess.getMeetingAccess().getParticipantsAssignment_3_1()); 
            // InternalProgram.g:7396:2: ( rule__Meeting__ParticipantsAssignment_3_1 )
            // InternalProgram.g:7396:3: rule__Meeting__ParticipantsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Meeting__ParticipantsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMeetingAccess().getParticipantsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group_3__1__Impl"


    // $ANTLR start "rule__Meeting__Group_3__2"
    // InternalProgram.g:7404:1: rule__Meeting__Group_3__2 : rule__Meeting__Group_3__2__Impl ;
    public final void rule__Meeting__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7408:1: ( rule__Meeting__Group_3__2__Impl )
            // InternalProgram.g:7409:2: rule__Meeting__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Meeting__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group_3__2"


    // $ANTLR start "rule__Meeting__Group_3__2__Impl"
    // InternalProgram.g:7415:1: rule__Meeting__Group_3__2__Impl : ( ( rule__Meeting__Group_3_2__0 )* ) ;
    public final void rule__Meeting__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7419:1: ( ( ( rule__Meeting__Group_3_2__0 )* ) )
            // InternalProgram.g:7420:1: ( ( rule__Meeting__Group_3_2__0 )* )
            {
            // InternalProgram.g:7420:1: ( ( rule__Meeting__Group_3_2__0 )* )
            // InternalProgram.g:7421:2: ( rule__Meeting__Group_3_2__0 )*
            {
             before(grammarAccess.getMeetingAccess().getGroup_3_2()); 
            // InternalProgram.g:7422:2: ( rule__Meeting__Group_3_2__0 )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==21) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalProgram.g:7422:3: rule__Meeting__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Meeting__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

             after(grammarAccess.getMeetingAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group_3__2__Impl"


    // $ANTLR start "rule__Meeting__Group_3_2__0"
    // InternalProgram.g:7431:1: rule__Meeting__Group_3_2__0 : rule__Meeting__Group_3_2__0__Impl rule__Meeting__Group_3_2__1 ;
    public final void rule__Meeting__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7435:1: ( rule__Meeting__Group_3_2__0__Impl rule__Meeting__Group_3_2__1 )
            // InternalProgram.g:7436:2: rule__Meeting__Group_3_2__0__Impl rule__Meeting__Group_3_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Meeting__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Meeting__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group_3_2__0"


    // $ANTLR start "rule__Meeting__Group_3_2__0__Impl"
    // InternalProgram.g:7443:1: rule__Meeting__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Meeting__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7447:1: ( ( ',' ) )
            // InternalProgram.g:7448:1: ( ',' )
            {
            // InternalProgram.g:7448:1: ( ',' )
            // InternalProgram.g:7449:2: ','
            {
             before(grammarAccess.getMeetingAccess().getCommaKeyword_3_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMeetingAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group_3_2__0__Impl"


    // $ANTLR start "rule__Meeting__Group_3_2__1"
    // InternalProgram.g:7458:1: rule__Meeting__Group_3_2__1 : rule__Meeting__Group_3_2__1__Impl ;
    public final void rule__Meeting__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7462:1: ( rule__Meeting__Group_3_2__1__Impl )
            // InternalProgram.g:7463:2: rule__Meeting__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Meeting__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group_3_2__1"


    // $ANTLR start "rule__Meeting__Group_3_2__1__Impl"
    // InternalProgram.g:7469:1: rule__Meeting__Group_3_2__1__Impl : ( ( rule__Meeting__ParticipantsAssignment_3_2_1 ) ) ;
    public final void rule__Meeting__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7473:1: ( ( ( rule__Meeting__ParticipantsAssignment_3_2_1 ) ) )
            // InternalProgram.g:7474:1: ( ( rule__Meeting__ParticipantsAssignment_3_2_1 ) )
            {
            // InternalProgram.g:7474:1: ( ( rule__Meeting__ParticipantsAssignment_3_2_1 ) )
            // InternalProgram.g:7475:2: ( rule__Meeting__ParticipantsAssignment_3_2_1 )
            {
             before(grammarAccess.getMeetingAccess().getParticipantsAssignment_3_2_1()); 
            // InternalProgram.g:7476:2: ( rule__Meeting__ParticipantsAssignment_3_2_1 )
            // InternalProgram.g:7476:3: rule__Meeting__ParticipantsAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Meeting__ParticipantsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMeetingAccess().getParticipantsAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__Group_3_2__1__Impl"


    // $ANTLR start "rule__Opening__Group__0"
    // InternalProgram.g:7485:1: rule__Opening__Group__0 : rule__Opening__Group__0__Impl rule__Opening__Group__1 ;
    public final void rule__Opening__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7489:1: ( rule__Opening__Group__0__Impl rule__Opening__Group__1 )
            // InternalProgram.g:7490:2: rule__Opening__Group__0__Impl rule__Opening__Group__1
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
    // InternalProgram.g:7497:1: rule__Opening__Group__0__Impl : ( 'Opening' ) ;
    public final void rule__Opening__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7501:1: ( ( 'Opening' ) )
            // InternalProgram.g:7502:1: ( 'Opening' )
            {
            // InternalProgram.g:7502:1: ( 'Opening' )
            // InternalProgram.g:7503:2: 'Opening'
            {
             before(grammarAccess.getOpeningAccess().getOpeningKeyword_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalProgram.g:7512:1: rule__Opening__Group__1 : rule__Opening__Group__1__Impl rule__Opening__Group__2 ;
    public final void rule__Opening__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7516:1: ( rule__Opening__Group__1__Impl rule__Opening__Group__2 )
            // InternalProgram.g:7517:2: rule__Opening__Group__1__Impl rule__Opening__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalProgram.g:7524:1: rule__Opening__Group__1__Impl : ( ( rule__Opening__NameAssignment_1 ) ) ;
    public final void rule__Opening__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7528:1: ( ( ( rule__Opening__NameAssignment_1 ) ) )
            // InternalProgram.g:7529:1: ( ( rule__Opening__NameAssignment_1 ) )
            {
            // InternalProgram.g:7529:1: ( ( rule__Opening__NameAssignment_1 ) )
            // InternalProgram.g:7530:2: ( rule__Opening__NameAssignment_1 )
            {
             before(grammarAccess.getOpeningAccess().getNameAssignment_1()); 
            // InternalProgram.g:7531:2: ( rule__Opening__NameAssignment_1 )
            // InternalProgram.g:7531:3: rule__Opening__NameAssignment_1
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
    // InternalProgram.g:7539:1: rule__Opening__Group__2 : rule__Opening__Group__2__Impl rule__Opening__Group__3 ;
    public final void rule__Opening__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7543:1: ( rule__Opening__Group__2__Impl rule__Opening__Group__3 )
            // InternalProgram.g:7544:2: rule__Opening__Group__2__Impl rule__Opening__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Opening__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Opening__Group__3();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:7551:1: rule__Opening__Group__2__Impl : ( ( rule__Opening__Group_2__0 )? ) ;
    public final void rule__Opening__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7555:1: ( ( ( rule__Opening__Group_2__0 )? ) )
            // InternalProgram.g:7556:1: ( ( rule__Opening__Group_2__0 )? )
            {
            // InternalProgram.g:7556:1: ( ( rule__Opening__Group_2__0 )? )
            // InternalProgram.g:7557:2: ( rule__Opening__Group_2__0 )?
            {
             before(grammarAccess.getOpeningAccess().getGroup_2()); 
            // InternalProgram.g:7558:2: ( rule__Opening__Group_2__0 )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==38) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalProgram.g:7558:3: rule__Opening__Group_2__0
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


    // $ANTLR start "rule__Opening__Group__3"
    // InternalProgram.g:7566:1: rule__Opening__Group__3 : rule__Opening__Group__3__Impl ;
    public final void rule__Opening__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7570:1: ( rule__Opening__Group__3__Impl )
            // InternalProgram.g:7571:2: rule__Opening__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Opening__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Opening__Group__3"


    // $ANTLR start "rule__Opening__Group__3__Impl"
    // InternalProgram.g:7577:1: rule__Opening__Group__3__Impl : ( ( rule__Opening__CancelledAssignment_3 )? ) ;
    public final void rule__Opening__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7581:1: ( ( ( rule__Opening__CancelledAssignment_3 )? ) )
            // InternalProgram.g:7582:1: ( ( rule__Opening__CancelledAssignment_3 )? )
            {
            // InternalProgram.g:7582:1: ( ( rule__Opening__CancelledAssignment_3 )? )
            // InternalProgram.g:7583:2: ( rule__Opening__CancelledAssignment_3 )?
            {
             before(grammarAccess.getOpeningAccess().getCancelledAssignment_3()); 
            // InternalProgram.g:7584:2: ( rule__Opening__CancelledAssignment_3 )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==67) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalProgram.g:7584:3: rule__Opening__CancelledAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Opening__CancelledAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpeningAccess().getCancelledAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Opening__Group__3__Impl"


    // $ANTLR start "rule__Opening__Group_2__0"
    // InternalProgram.g:7593:1: rule__Opening__Group_2__0 : rule__Opening__Group_2__0__Impl rule__Opening__Group_2__1 ;
    public final void rule__Opening__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7597:1: ( rule__Opening__Group_2__0__Impl rule__Opening__Group_2__1 )
            // InternalProgram.g:7598:2: rule__Opening__Group_2__0__Impl rule__Opening__Group_2__1
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
    // InternalProgram.g:7605:1: rule__Opening__Group_2__0__Impl : ( 'abstract' ) ;
    public final void rule__Opening__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7609:1: ( ( 'abstract' ) )
            // InternalProgram.g:7610:1: ( 'abstract' )
            {
            // InternalProgram.g:7610:1: ( 'abstract' )
            // InternalProgram.g:7611:2: 'abstract'
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
    // InternalProgram.g:7620:1: rule__Opening__Group_2__1 : rule__Opening__Group_2__1__Impl ;
    public final void rule__Opening__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7624:1: ( rule__Opening__Group_2__1__Impl )
            // InternalProgram.g:7625:2: rule__Opening__Group_2__1__Impl
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
    // InternalProgram.g:7631:1: rule__Opening__Group_2__1__Impl : ( ( rule__Opening__AbstractAssignment_2_1 ) ) ;
    public final void rule__Opening__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7635:1: ( ( ( rule__Opening__AbstractAssignment_2_1 ) ) )
            // InternalProgram.g:7636:1: ( ( rule__Opening__AbstractAssignment_2_1 ) )
            {
            // InternalProgram.g:7636:1: ( ( rule__Opening__AbstractAssignment_2_1 ) )
            // InternalProgram.g:7637:2: ( rule__Opening__AbstractAssignment_2_1 )
            {
             before(grammarAccess.getOpeningAccess().getAbstractAssignment_2_1()); 
            // InternalProgram.g:7638:2: ( rule__Opening__AbstractAssignment_2_1 )
            // InternalProgram.g:7638:3: rule__Opening__AbstractAssignment_2_1
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
    // InternalProgram.g:7647:1: rule__Paper__Group__0 : rule__Paper__Group__0__Impl rule__Paper__Group__1 ;
    public final void rule__Paper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7651:1: ( rule__Paper__Group__0__Impl rule__Paper__Group__1 )
            // InternalProgram.g:7652:2: rule__Paper__Group__0__Impl rule__Paper__Group__1
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
    // InternalProgram.g:7659:1: rule__Paper__Group__0__Impl : ( () ) ;
    public final void rule__Paper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7663:1: ( ( () ) )
            // InternalProgram.g:7664:1: ( () )
            {
            // InternalProgram.g:7664:1: ( () )
            // InternalProgram.g:7665:2: ()
            {
             before(grammarAccess.getPaperAccess().getPaperAction_0()); 
            // InternalProgram.g:7666:2: ()
            // InternalProgram.g:7666:3: 
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
    // InternalProgram.g:7674:1: rule__Paper__Group__1 : rule__Paper__Group__1__Impl rule__Paper__Group__2 ;
    public final void rule__Paper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7678:1: ( rule__Paper__Group__1__Impl rule__Paper__Group__2 )
            // InternalProgram.g:7679:2: rule__Paper__Group__1__Impl rule__Paper__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalProgram.g:7686:1: rule__Paper__Group__1__Impl : ( ( rule__Paper__NameAssignment_1 ) ) ;
    public final void rule__Paper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7690:1: ( ( ( rule__Paper__NameAssignment_1 ) ) )
            // InternalProgram.g:7691:1: ( ( rule__Paper__NameAssignment_1 ) )
            {
            // InternalProgram.g:7691:1: ( ( rule__Paper__NameAssignment_1 ) )
            // InternalProgram.g:7692:2: ( rule__Paper__NameAssignment_1 )
            {
             before(grammarAccess.getPaperAccess().getNameAssignment_1()); 
            // InternalProgram.g:7693:2: ( rule__Paper__NameAssignment_1 )
            // InternalProgram.g:7693:3: rule__Paper__NameAssignment_1
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
    // InternalProgram.g:7701:1: rule__Paper__Group__2 : rule__Paper__Group__2__Impl rule__Paper__Group__3 ;
    public final void rule__Paper__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7705:1: ( rule__Paper__Group__2__Impl rule__Paper__Group__3 )
            // InternalProgram.g:7706:2: rule__Paper__Group__2__Impl rule__Paper__Group__3
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
    // InternalProgram.g:7713:1: rule__Paper__Group__2__Impl : ( 'authors' ) ;
    public final void rule__Paper__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7717:1: ( ( 'authors' ) )
            // InternalProgram.g:7718:1: ( 'authors' )
            {
            // InternalProgram.g:7718:1: ( 'authors' )
            // InternalProgram.g:7719:2: 'authors'
            {
             before(grammarAccess.getPaperAccess().getAuthorsKeyword_2()); 
            match(input,61,FOLLOW_2); 
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
    // InternalProgram.g:7728:1: rule__Paper__Group__3 : rule__Paper__Group__3__Impl rule__Paper__Group__4 ;
    public final void rule__Paper__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7732:1: ( rule__Paper__Group__3__Impl rule__Paper__Group__4 )
            // InternalProgram.g:7733:2: rule__Paper__Group__3__Impl rule__Paper__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalProgram.g:7740:1: rule__Paper__Group__3__Impl : ( ( rule__Paper__AuthorsAssignment_3 ) ) ;
    public final void rule__Paper__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7744:1: ( ( ( rule__Paper__AuthorsAssignment_3 ) ) )
            // InternalProgram.g:7745:1: ( ( rule__Paper__AuthorsAssignment_3 ) )
            {
            // InternalProgram.g:7745:1: ( ( rule__Paper__AuthorsAssignment_3 ) )
            // InternalProgram.g:7746:2: ( rule__Paper__AuthorsAssignment_3 )
            {
             before(grammarAccess.getPaperAccess().getAuthorsAssignment_3()); 
            // InternalProgram.g:7747:2: ( rule__Paper__AuthorsAssignment_3 )
            // InternalProgram.g:7747:3: rule__Paper__AuthorsAssignment_3
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
    // InternalProgram.g:7755:1: rule__Paper__Group__4 : rule__Paper__Group__4__Impl rule__Paper__Group__5 ;
    public final void rule__Paper__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7759:1: ( rule__Paper__Group__4__Impl rule__Paper__Group__5 )
            // InternalProgram.g:7760:2: rule__Paper__Group__4__Impl rule__Paper__Group__5
            {
            pushFollow(FOLLOW_37);
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
    // InternalProgram.g:7767:1: rule__Paper__Group__4__Impl : ( ( rule__Paper__Group_4__0 )* ) ;
    public final void rule__Paper__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7771:1: ( ( ( rule__Paper__Group_4__0 )* ) )
            // InternalProgram.g:7772:1: ( ( rule__Paper__Group_4__0 )* )
            {
            // InternalProgram.g:7772:1: ( ( rule__Paper__Group_4__0 )* )
            // InternalProgram.g:7773:2: ( rule__Paper__Group_4__0 )*
            {
             before(grammarAccess.getPaperAccess().getGroup_4()); 
            // InternalProgram.g:7774:2: ( rule__Paper__Group_4__0 )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==21) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalProgram.g:7774:3: rule__Paper__Group_4__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Paper__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop76;
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
    // InternalProgram.g:7782:1: rule__Paper__Group__5 : rule__Paper__Group__5__Impl rule__Paper__Group__6 ;
    public final void rule__Paper__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7786:1: ( rule__Paper__Group__5__Impl rule__Paper__Group__6 )
            // InternalProgram.g:7787:2: rule__Paper__Group__5__Impl rule__Paper__Group__6
            {
            pushFollow(FOLLOW_37);
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
    // InternalProgram.g:7794:1: rule__Paper__Group__5__Impl : ( ( rule__Paper__Group_5__0 )? ) ;
    public final void rule__Paper__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7798:1: ( ( ( rule__Paper__Group_5__0 )? ) )
            // InternalProgram.g:7799:1: ( ( rule__Paper__Group_5__0 )? )
            {
            // InternalProgram.g:7799:1: ( ( rule__Paper__Group_5__0 )? )
            // InternalProgram.g:7800:2: ( rule__Paper__Group_5__0 )?
            {
             before(grammarAccess.getPaperAccess().getGroup_5()); 
            // InternalProgram.g:7801:2: ( rule__Paper__Group_5__0 )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==38) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalProgram.g:7801:3: rule__Paper__Group_5__0
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
    // InternalProgram.g:7809:1: rule__Paper__Group__6 : rule__Paper__Group__6__Impl rule__Paper__Group__7 ;
    public final void rule__Paper__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7813:1: ( rule__Paper__Group__6__Impl rule__Paper__Group__7 )
            // InternalProgram.g:7814:2: rule__Paper__Group__6__Impl rule__Paper__Group__7
            {
            pushFollow(FOLLOW_37);
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
    // InternalProgram.g:7821:1: rule__Paper__Group__6__Impl : ( ( rule__Paper__Group_6__0 )? ) ;
    public final void rule__Paper__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7825:1: ( ( ( rule__Paper__Group_6__0 )? ) )
            // InternalProgram.g:7826:1: ( ( rule__Paper__Group_6__0 )? )
            {
            // InternalProgram.g:7826:1: ( ( rule__Paper__Group_6__0 )? )
            // InternalProgram.g:7827:2: ( rule__Paper__Group_6__0 )?
            {
             before(grammarAccess.getPaperAccess().getGroup_6()); 
            // InternalProgram.g:7828:2: ( rule__Paper__Group_6__0 )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==62) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalProgram.g:7828:3: rule__Paper__Group_6__0
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
    // InternalProgram.g:7836:1: rule__Paper__Group__7 : rule__Paper__Group__7__Impl rule__Paper__Group__8 ;
    public final void rule__Paper__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7840:1: ( rule__Paper__Group__7__Impl rule__Paper__Group__8 )
            // InternalProgram.g:7841:2: rule__Paper__Group__7__Impl rule__Paper__Group__8
            {
            pushFollow(FOLLOW_37);
            rule__Paper__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paper__Group__8();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:7848:1: rule__Paper__Group__7__Impl : ( ( rule__Paper__Group_7__0 )? ) ;
    public final void rule__Paper__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7852:1: ( ( ( rule__Paper__Group_7__0 )? ) )
            // InternalProgram.g:7853:1: ( ( rule__Paper__Group_7__0 )? )
            {
            // InternalProgram.g:7853:1: ( ( rule__Paper__Group_7__0 )? )
            // InternalProgram.g:7854:2: ( rule__Paper__Group_7__0 )?
            {
             before(grammarAccess.getPaperAccess().getGroup_7()); 
            // InternalProgram.g:7855:2: ( rule__Paper__Group_7__0 )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==63) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalProgram.g:7855:3: rule__Paper__Group_7__0
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


    // $ANTLR start "rule__Paper__Group__8"
    // InternalProgram.g:7863:1: rule__Paper__Group__8 : rule__Paper__Group__8__Impl rule__Paper__Group__9 ;
    public final void rule__Paper__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7867:1: ( rule__Paper__Group__8__Impl rule__Paper__Group__9 )
            // InternalProgram.g:7868:2: rule__Paper__Group__8__Impl rule__Paper__Group__9
            {
            pushFollow(FOLLOW_37);
            rule__Paper__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paper__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group__8"


    // $ANTLR start "rule__Paper__Group__8__Impl"
    // InternalProgram.g:7875:1: rule__Paper__Group__8__Impl : ( ( rule__Paper__Group_8__0 )? ) ;
    public final void rule__Paper__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7879:1: ( ( ( rule__Paper__Group_8__0 )? ) )
            // InternalProgram.g:7880:1: ( ( rule__Paper__Group_8__0 )? )
            {
            // InternalProgram.g:7880:1: ( ( rule__Paper__Group_8__0 )? )
            // InternalProgram.g:7881:2: ( rule__Paper__Group_8__0 )?
            {
             before(grammarAccess.getPaperAccess().getGroup_8()); 
            // InternalProgram.g:7882:2: ( rule__Paper__Group_8__0 )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==64) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalProgram.g:7882:3: rule__Paper__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Paper__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPaperAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group__8__Impl"


    // $ANTLR start "rule__Paper__Group__9"
    // InternalProgram.g:7890:1: rule__Paper__Group__9 : rule__Paper__Group__9__Impl ;
    public final void rule__Paper__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7894:1: ( rule__Paper__Group__9__Impl )
            // InternalProgram.g:7895:2: rule__Paper__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Paper__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group__9"


    // $ANTLR start "rule__Paper__Group__9__Impl"
    // InternalProgram.g:7901:1: rule__Paper__Group__9__Impl : ( ( rule__Paper__CancelledAssignment_9 )? ) ;
    public final void rule__Paper__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7905:1: ( ( ( rule__Paper__CancelledAssignment_9 )? ) )
            // InternalProgram.g:7906:1: ( ( rule__Paper__CancelledAssignment_9 )? )
            {
            // InternalProgram.g:7906:1: ( ( rule__Paper__CancelledAssignment_9 )? )
            // InternalProgram.g:7907:2: ( rule__Paper__CancelledAssignment_9 )?
            {
             before(grammarAccess.getPaperAccess().getCancelledAssignment_9()); 
            // InternalProgram.g:7908:2: ( rule__Paper__CancelledAssignment_9 )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==67) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalProgram.g:7908:3: rule__Paper__CancelledAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Paper__CancelledAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPaperAccess().getCancelledAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group__9__Impl"


    // $ANTLR start "rule__Paper__Group_4__0"
    // InternalProgram.g:7917:1: rule__Paper__Group_4__0 : rule__Paper__Group_4__0__Impl rule__Paper__Group_4__1 ;
    public final void rule__Paper__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7921:1: ( rule__Paper__Group_4__0__Impl rule__Paper__Group_4__1 )
            // InternalProgram.g:7922:2: rule__Paper__Group_4__0__Impl rule__Paper__Group_4__1
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
    // InternalProgram.g:7929:1: rule__Paper__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Paper__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7933:1: ( ( ',' ) )
            // InternalProgram.g:7934:1: ( ',' )
            {
            // InternalProgram.g:7934:1: ( ',' )
            // InternalProgram.g:7935:2: ','
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
    // InternalProgram.g:7944:1: rule__Paper__Group_4__1 : rule__Paper__Group_4__1__Impl ;
    public final void rule__Paper__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7948:1: ( rule__Paper__Group_4__1__Impl )
            // InternalProgram.g:7949:2: rule__Paper__Group_4__1__Impl
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
    // InternalProgram.g:7955:1: rule__Paper__Group_4__1__Impl : ( ( rule__Paper__AuthorsAssignment_4_1 ) ) ;
    public final void rule__Paper__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7959:1: ( ( ( rule__Paper__AuthorsAssignment_4_1 ) ) )
            // InternalProgram.g:7960:1: ( ( rule__Paper__AuthorsAssignment_4_1 ) )
            {
            // InternalProgram.g:7960:1: ( ( rule__Paper__AuthorsAssignment_4_1 ) )
            // InternalProgram.g:7961:2: ( rule__Paper__AuthorsAssignment_4_1 )
            {
             before(grammarAccess.getPaperAccess().getAuthorsAssignment_4_1()); 
            // InternalProgram.g:7962:2: ( rule__Paper__AuthorsAssignment_4_1 )
            // InternalProgram.g:7962:3: rule__Paper__AuthorsAssignment_4_1
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
    // InternalProgram.g:7971:1: rule__Paper__Group_5__0 : rule__Paper__Group_5__0__Impl rule__Paper__Group_5__1 ;
    public final void rule__Paper__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7975:1: ( rule__Paper__Group_5__0__Impl rule__Paper__Group_5__1 )
            // InternalProgram.g:7976:2: rule__Paper__Group_5__0__Impl rule__Paper__Group_5__1
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
    // InternalProgram.g:7983:1: rule__Paper__Group_5__0__Impl : ( 'abstract' ) ;
    public final void rule__Paper__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7987:1: ( ( 'abstract' ) )
            // InternalProgram.g:7988:1: ( 'abstract' )
            {
            // InternalProgram.g:7988:1: ( 'abstract' )
            // InternalProgram.g:7989:2: 'abstract'
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
    // InternalProgram.g:7998:1: rule__Paper__Group_5__1 : rule__Paper__Group_5__1__Impl ;
    public final void rule__Paper__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8002:1: ( rule__Paper__Group_5__1__Impl )
            // InternalProgram.g:8003:2: rule__Paper__Group_5__1__Impl
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
    // InternalProgram.g:8009:1: rule__Paper__Group_5__1__Impl : ( ( rule__Paper__AbstractAssignment_5_1 ) ) ;
    public final void rule__Paper__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8013:1: ( ( ( rule__Paper__AbstractAssignment_5_1 ) ) )
            // InternalProgram.g:8014:1: ( ( rule__Paper__AbstractAssignment_5_1 ) )
            {
            // InternalProgram.g:8014:1: ( ( rule__Paper__AbstractAssignment_5_1 ) )
            // InternalProgram.g:8015:2: ( rule__Paper__AbstractAssignment_5_1 )
            {
             before(grammarAccess.getPaperAccess().getAbstractAssignment_5_1()); 
            // InternalProgram.g:8016:2: ( rule__Paper__AbstractAssignment_5_1 )
            // InternalProgram.g:8016:3: rule__Paper__AbstractAssignment_5_1
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
    // InternalProgram.g:8025:1: rule__Paper__Group_6__0 : rule__Paper__Group_6__0__Impl rule__Paper__Group_6__1 ;
    public final void rule__Paper__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8029:1: ( rule__Paper__Group_6__0__Impl rule__Paper__Group_6__1 )
            // InternalProgram.g:8030:2: rule__Paper__Group_6__0__Impl rule__Paper__Group_6__1
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
    // InternalProgram.g:8037:1: rule__Paper__Group_6__0__Impl : ( 'preprint' ) ;
    public final void rule__Paper__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8041:1: ( ( 'preprint' ) )
            // InternalProgram.g:8042:1: ( 'preprint' )
            {
            // InternalProgram.g:8042:1: ( 'preprint' )
            // InternalProgram.g:8043:2: 'preprint'
            {
             before(grammarAccess.getPaperAccess().getPreprintKeyword_6_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalProgram.g:8052:1: rule__Paper__Group_6__1 : rule__Paper__Group_6__1__Impl ;
    public final void rule__Paper__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8056:1: ( rule__Paper__Group_6__1__Impl )
            // InternalProgram.g:8057:2: rule__Paper__Group_6__1__Impl
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
    // InternalProgram.g:8063:1: rule__Paper__Group_6__1__Impl : ( ( rule__Paper__PreprintAssignment_6_1 ) ) ;
    public final void rule__Paper__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8067:1: ( ( ( rule__Paper__PreprintAssignment_6_1 ) ) )
            // InternalProgram.g:8068:1: ( ( rule__Paper__PreprintAssignment_6_1 ) )
            {
            // InternalProgram.g:8068:1: ( ( rule__Paper__PreprintAssignment_6_1 ) )
            // InternalProgram.g:8069:2: ( rule__Paper__PreprintAssignment_6_1 )
            {
             before(grammarAccess.getPaperAccess().getPreprintAssignment_6_1()); 
            // InternalProgram.g:8070:2: ( rule__Paper__PreprintAssignment_6_1 )
            // InternalProgram.g:8070:3: rule__Paper__PreprintAssignment_6_1
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
    // InternalProgram.g:8079:1: rule__Paper__Group_7__0 : rule__Paper__Group_7__0__Impl rule__Paper__Group_7__1 ;
    public final void rule__Paper__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8083:1: ( rule__Paper__Group_7__0__Impl rule__Paper__Group_7__1 )
            // InternalProgram.g:8084:2: rule__Paper__Group_7__0__Impl rule__Paper__Group_7__1
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
    // InternalProgram.g:8091:1: rule__Paper__Group_7__0__Impl : ( 'kind' ) ;
    public final void rule__Paper__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8095:1: ( ( 'kind' ) )
            // InternalProgram.g:8096:1: ( 'kind' )
            {
            // InternalProgram.g:8096:1: ( 'kind' )
            // InternalProgram.g:8097:2: 'kind'
            {
             before(grammarAccess.getPaperAccess().getKindKeyword_7_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalProgram.g:8106:1: rule__Paper__Group_7__1 : rule__Paper__Group_7__1__Impl ;
    public final void rule__Paper__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8110:1: ( rule__Paper__Group_7__1__Impl )
            // InternalProgram.g:8111:2: rule__Paper__Group_7__1__Impl
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
    // InternalProgram.g:8117:1: rule__Paper__Group_7__1__Impl : ( ( rule__Paper__KindAssignment_7_1 ) ) ;
    public final void rule__Paper__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8121:1: ( ( ( rule__Paper__KindAssignment_7_1 ) ) )
            // InternalProgram.g:8122:1: ( ( rule__Paper__KindAssignment_7_1 ) )
            {
            // InternalProgram.g:8122:1: ( ( rule__Paper__KindAssignment_7_1 ) )
            // InternalProgram.g:8123:2: ( rule__Paper__KindAssignment_7_1 )
            {
             before(grammarAccess.getPaperAccess().getKindAssignment_7_1()); 
            // InternalProgram.g:8124:2: ( rule__Paper__KindAssignment_7_1 )
            // InternalProgram.g:8124:3: rule__Paper__KindAssignment_7_1
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


    // $ANTLR start "rule__Paper__Group_8__0"
    // InternalProgram.g:8133:1: rule__Paper__Group_8__0 : rule__Paper__Group_8__0__Impl rule__Paper__Group_8__1 ;
    public final void rule__Paper__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8137:1: ( rule__Paper__Group_8__0__Impl rule__Paper__Group_8__1 )
            // InternalProgram.g:8138:2: rule__Paper__Group_8__0__Impl rule__Paper__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__Paper__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paper__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group_8__0"


    // $ANTLR start "rule__Paper__Group_8__0__Impl"
    // InternalProgram.g:8145:1: rule__Paper__Group_8__0__Impl : ( 'proceedings' ) ;
    public final void rule__Paper__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8149:1: ( ( 'proceedings' ) )
            // InternalProgram.g:8150:1: ( 'proceedings' )
            {
            // InternalProgram.g:8150:1: ( 'proceedings' )
            // InternalProgram.g:8151:2: 'proceedings'
            {
             before(grammarAccess.getPaperAccess().getProceedingsKeyword_8_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getPaperAccess().getProceedingsKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group_8__0__Impl"


    // $ANTLR start "rule__Paper__Group_8__1"
    // InternalProgram.g:8160:1: rule__Paper__Group_8__1 : rule__Paper__Group_8__1__Impl ;
    public final void rule__Paper__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8164:1: ( rule__Paper__Group_8__1__Impl )
            // InternalProgram.g:8165:2: rule__Paper__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Paper__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group_8__1"


    // $ANTLR start "rule__Paper__Group_8__1__Impl"
    // InternalProgram.g:8171:1: rule__Paper__Group_8__1__Impl : ( ( rule__Paper__ProceedingsAssignment_8_1 ) ) ;
    public final void rule__Paper__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8175:1: ( ( ( rule__Paper__ProceedingsAssignment_8_1 ) ) )
            // InternalProgram.g:8176:1: ( ( rule__Paper__ProceedingsAssignment_8_1 ) )
            {
            // InternalProgram.g:8176:1: ( ( rule__Paper__ProceedingsAssignment_8_1 ) )
            // InternalProgram.g:8177:2: ( rule__Paper__ProceedingsAssignment_8_1 )
            {
             before(grammarAccess.getPaperAccess().getProceedingsAssignment_8_1()); 
            // InternalProgram.g:8178:2: ( rule__Paper__ProceedingsAssignment_8_1 )
            // InternalProgram.g:8178:3: rule__Paper__ProceedingsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Paper__ProceedingsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getPaperAccess().getProceedingsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__Group_8__1__Impl"


    // $ANTLR start "rule__Person__Group__0"
    // InternalProgram.g:8187:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8191:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalProgram.g:8192:2: rule__Person__Group__0__Impl rule__Person__Group__1
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
    // InternalProgram.g:8199:1: rule__Person__Group__0__Impl : ( () ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8203:1: ( ( () ) )
            // InternalProgram.g:8204:1: ( () )
            {
            // InternalProgram.g:8204:1: ( () )
            // InternalProgram.g:8205:2: ()
            {
             before(grammarAccess.getPersonAccess().getPersonAction_0()); 
            // InternalProgram.g:8206:2: ()
            // InternalProgram.g:8206:3: 
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
    // InternalProgram.g:8214:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8218:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // InternalProgram.g:8219:2: rule__Person__Group__1__Impl rule__Person__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalProgram.g:8226:1: rule__Person__Group__1__Impl : ( ( rule__Person__NameAssignment_1 ) ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8230:1: ( ( ( rule__Person__NameAssignment_1 ) ) )
            // InternalProgram.g:8231:1: ( ( rule__Person__NameAssignment_1 ) )
            {
            // InternalProgram.g:8231:1: ( ( rule__Person__NameAssignment_1 ) )
            // InternalProgram.g:8232:2: ( rule__Person__NameAssignment_1 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_1()); 
            // InternalProgram.g:8233:2: ( rule__Person__NameAssignment_1 )
            // InternalProgram.g:8233:3: rule__Person__NameAssignment_1
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
    // InternalProgram.g:8241:1: rule__Person__Group__2 : rule__Person__Group__2__Impl rule__Person__Group__3 ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8245:1: ( rule__Person__Group__2__Impl rule__Person__Group__3 )
            // InternalProgram.g:8246:2: rule__Person__Group__2__Impl rule__Person__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalProgram.g:8253:1: rule__Person__Group__2__Impl : ( ( rule__Person__Group_2__0 )? ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8257:1: ( ( ( rule__Person__Group_2__0 )? ) )
            // InternalProgram.g:8258:1: ( ( rule__Person__Group_2__0 )? )
            {
            // InternalProgram.g:8258:1: ( ( rule__Person__Group_2__0 )? )
            // InternalProgram.g:8259:2: ( rule__Person__Group_2__0 )?
            {
             before(grammarAccess.getPersonAccess().getGroup_2()); 
            // InternalProgram.g:8260:2: ( rule__Person__Group_2__0 )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==65) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalProgram.g:8260:3: rule__Person__Group_2__0
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
    // InternalProgram.g:8268:1: rule__Person__Group__3 : rule__Person__Group__3__Impl ;
    public final void rule__Person__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8272:1: ( rule__Person__Group__3__Impl )
            // InternalProgram.g:8273:2: rule__Person__Group__3__Impl
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
    // InternalProgram.g:8279:1: rule__Person__Group__3__Impl : ( ( rule__Person__Group_3__0 )? ) ;
    public final void rule__Person__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8283:1: ( ( ( rule__Person__Group_3__0 )? ) )
            // InternalProgram.g:8284:1: ( ( rule__Person__Group_3__0 )? )
            {
            // InternalProgram.g:8284:1: ( ( rule__Person__Group_3__0 )? )
            // InternalProgram.g:8285:2: ( rule__Person__Group_3__0 )?
            {
             before(grammarAccess.getPersonAccess().getGroup_3()); 
            // InternalProgram.g:8286:2: ( rule__Person__Group_3__0 )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==66) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalProgram.g:8286:3: rule__Person__Group_3__0
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
    // InternalProgram.g:8295:1: rule__Person__Group_2__0 : rule__Person__Group_2__0__Impl rule__Person__Group_2__1 ;
    public final void rule__Person__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8299:1: ( rule__Person__Group_2__0__Impl rule__Person__Group_2__1 )
            // InternalProgram.g:8300:2: rule__Person__Group_2__0__Impl rule__Person__Group_2__1
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
    // InternalProgram.g:8307:1: rule__Person__Group_2__0__Impl : ( 'email' ) ;
    public final void rule__Person__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8311:1: ( ( 'email' ) )
            // InternalProgram.g:8312:1: ( 'email' )
            {
            // InternalProgram.g:8312:1: ( 'email' )
            // InternalProgram.g:8313:2: 'email'
            {
             before(grammarAccess.getPersonAccess().getEmailKeyword_2_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalProgram.g:8322:1: rule__Person__Group_2__1 : rule__Person__Group_2__1__Impl ;
    public final void rule__Person__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8326:1: ( rule__Person__Group_2__1__Impl )
            // InternalProgram.g:8327:2: rule__Person__Group_2__1__Impl
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
    // InternalProgram.g:8333:1: rule__Person__Group_2__1__Impl : ( ( rule__Person__EmailAssignment_2_1 ) ) ;
    public final void rule__Person__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8337:1: ( ( ( rule__Person__EmailAssignment_2_1 ) ) )
            // InternalProgram.g:8338:1: ( ( rule__Person__EmailAssignment_2_1 ) )
            {
            // InternalProgram.g:8338:1: ( ( rule__Person__EmailAssignment_2_1 ) )
            // InternalProgram.g:8339:2: ( rule__Person__EmailAssignment_2_1 )
            {
             before(grammarAccess.getPersonAccess().getEmailAssignment_2_1()); 
            // InternalProgram.g:8340:2: ( rule__Person__EmailAssignment_2_1 )
            // InternalProgram.g:8340:3: rule__Person__EmailAssignment_2_1
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
    // InternalProgram.g:8349:1: rule__Person__Group_3__0 : rule__Person__Group_3__0__Impl rule__Person__Group_3__1 ;
    public final void rule__Person__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8353:1: ( rule__Person__Group_3__0__Impl rule__Person__Group_3__1 )
            // InternalProgram.g:8354:2: rule__Person__Group_3__0__Impl rule__Person__Group_3__1
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
    // InternalProgram.g:8361:1: rule__Person__Group_3__0__Impl : ( 'homepage' ) ;
    public final void rule__Person__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8365:1: ( ( 'homepage' ) )
            // InternalProgram.g:8366:1: ( 'homepage' )
            {
            // InternalProgram.g:8366:1: ( 'homepage' )
            // InternalProgram.g:8367:2: 'homepage'
            {
             before(grammarAccess.getPersonAccess().getHomepageKeyword_3_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalProgram.g:8376:1: rule__Person__Group_3__1 : rule__Person__Group_3__1__Impl ;
    public final void rule__Person__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8380:1: ( rule__Person__Group_3__1__Impl )
            // InternalProgram.g:8381:2: rule__Person__Group_3__1__Impl
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
    // InternalProgram.g:8387:1: rule__Person__Group_3__1__Impl : ( ( rule__Person__HomepageAssignment_3_1 ) ) ;
    public final void rule__Person__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8391:1: ( ( ( rule__Person__HomepageAssignment_3_1 ) ) )
            // InternalProgram.g:8392:1: ( ( rule__Person__HomepageAssignment_3_1 ) )
            {
            // InternalProgram.g:8392:1: ( ( rule__Person__HomepageAssignment_3_1 ) )
            // InternalProgram.g:8393:2: ( rule__Person__HomepageAssignment_3_1 )
            {
             before(grammarAccess.getPersonAccess().getHomepageAssignment_3_1()); 
            // InternalProgram.g:8394:2: ( rule__Person__HomepageAssignment_3_1 )
            // InternalProgram.g:8394:3: rule__Person__HomepageAssignment_3_1
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
    // InternalProgram.g:8403:1: rule__Kind__Group__0 : rule__Kind__Group__0__Impl rule__Kind__Group__1 ;
    public final void rule__Kind__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8407:1: ( rule__Kind__Group__0__Impl rule__Kind__Group__1 )
            // InternalProgram.g:8408:2: rule__Kind__Group__0__Impl rule__Kind__Group__1
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
    // InternalProgram.g:8415:1: rule__Kind__Group__0__Impl : ( () ) ;
    public final void rule__Kind__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8419:1: ( ( () ) )
            // InternalProgram.g:8420:1: ( () )
            {
            // InternalProgram.g:8420:1: ( () )
            // InternalProgram.g:8421:2: ()
            {
             before(grammarAccess.getKindAccess().getKindAction_0()); 
            // InternalProgram.g:8422:2: ()
            // InternalProgram.g:8422:3: 
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
    // InternalProgram.g:8430:1: rule__Kind__Group__1 : rule__Kind__Group__1__Impl ;
    public final void rule__Kind__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8434:1: ( rule__Kind__Group__1__Impl )
            // InternalProgram.g:8435:2: rule__Kind__Group__1__Impl
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
    // InternalProgram.g:8441:1: rule__Kind__Group__1__Impl : ( ( rule__Kind__NameAssignment_1 ) ) ;
    public final void rule__Kind__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8445:1: ( ( ( rule__Kind__NameAssignment_1 ) ) )
            // InternalProgram.g:8446:1: ( ( rule__Kind__NameAssignment_1 ) )
            {
            // InternalProgram.g:8446:1: ( ( rule__Kind__NameAssignment_1 ) )
            // InternalProgram.g:8447:2: ( rule__Kind__NameAssignment_1 )
            {
             before(grammarAccess.getKindAccess().getNameAssignment_1()); 
            // InternalProgram.g:8448:2: ( rule__Kind__NameAssignment_1 )
            // InternalProgram.g:8448:3: rule__Kind__NameAssignment_1
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
    // InternalProgram.g:8457:1: rule__Conference__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Conference__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8461:1: ( ( RULE_STRING ) )
            // InternalProgram.g:8462:2: ( RULE_STRING )
            {
            // InternalProgram.g:8462:2: ( RULE_STRING )
            // InternalProgram.g:8463:3: RULE_STRING
            {
             before(grammarAccess.getConferenceAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // InternalProgram.g:8472:1: rule__Conference__TalkDurationAssignment_4 : ( RULE_INT ) ;
    public final void rule__Conference__TalkDurationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8476:1: ( ( RULE_INT ) )
            // InternalProgram.g:8477:2: ( RULE_INT )
            {
            // InternalProgram.g:8477:2: ( RULE_INT )
            // InternalProgram.g:8478:3: RULE_INT
            {
             before(grammarAccess.getConferenceAccess().getTalkDurationINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getTalkDurationINTTerminalRuleCall_4_0()); 

            }


            }

        }
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
    // InternalProgram.g:8487:1: rule__Conference__KindsAssignment_5_1 : ( ruleKind ) ;
    public final void rule__Conference__KindsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8491:1: ( ( ruleKind ) )
            // InternalProgram.g:8492:2: ( ruleKind )
            {
            // InternalProgram.g:8492:2: ( ruleKind )
            // InternalProgram.g:8493:3: ruleKind
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
    // InternalProgram.g:8502:1: rule__Conference__KindsAssignment_5_2_1 : ( ruleKind ) ;
    public final void rule__Conference__KindsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8506:1: ( ( ruleKind ) )
            // InternalProgram.g:8507:2: ( ruleKind )
            {
            // InternalProgram.g:8507:2: ( ruleKind )
            // InternalProgram.g:8508:3: ruleKind
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
    // InternalProgram.g:8517:1: rule__Conference__ResourcesAssignment_6_1 : ( ruleResource ) ;
    public final void rule__Conference__ResourcesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8521:1: ( ( ruleResource ) )
            // InternalProgram.g:8522:2: ( ruleResource )
            {
            // InternalProgram.g:8522:2: ( ruleResource )
            // InternalProgram.g:8523:3: ruleResource
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
    // InternalProgram.g:8532:1: rule__Conference__ResourcesAssignment_6_2 : ( ruleResource ) ;
    public final void rule__Conference__ResourcesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8536:1: ( ( ruleResource ) )
            // InternalProgram.g:8537:2: ( ruleResource )
            {
            // InternalProgram.g:8537:2: ( ruleResource )
            // InternalProgram.g:8538:3: ruleResource
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
    // InternalProgram.g:8547:1: rule__Conference__PapersAssignment_7_2 : ( rulePaper ) ;
    public final void rule__Conference__PapersAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8551:1: ( ( rulePaper ) )
            // InternalProgram.g:8552:2: ( rulePaper )
            {
            // InternalProgram.g:8552:2: ( rulePaper )
            // InternalProgram.g:8553:3: rulePaper
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
    // InternalProgram.g:8562:1: rule__Conference__PapersAssignment_7_3_1 : ( rulePaper ) ;
    public final void rule__Conference__PapersAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8566:1: ( ( rulePaper ) )
            // InternalProgram.g:8567:2: ( rulePaper )
            {
            // InternalProgram.g:8567:2: ( rulePaper )
            // InternalProgram.g:8568:3: rulePaper
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
    // InternalProgram.g:8577:1: rule__Conference__EventsAssignment_8_2 : ( ruleEvent ) ;
    public final void rule__Conference__EventsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8581:1: ( ( ruleEvent ) )
            // InternalProgram.g:8582:2: ( ruleEvent )
            {
            // InternalProgram.g:8582:2: ( ruleEvent )
            // InternalProgram.g:8583:3: ruleEvent
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
    // InternalProgram.g:8592:1: rule__Conference__EventsAssignment_8_3_1 : ( ruleEvent ) ;
    public final void rule__Conference__EventsAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8596:1: ( ( ruleEvent ) )
            // InternalProgram.g:8597:2: ( ruleEvent )
            {
            // InternalProgram.g:8597:2: ( ruleEvent )
            // InternalProgram.g:8598:3: ruleEvent
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
    // InternalProgram.g:8607:1: rule__Conference__ProgramAssignment_9_1 : ( ruleProgram ) ;
    public final void rule__Conference__ProgramAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8611:1: ( ( ruleProgram ) )
            // InternalProgram.g:8612:2: ( ruleProgram )
            {
            // InternalProgram.g:8612:2: ( ruleProgram )
            // InternalProgram.g:8613:3: ruleProgram
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
    // InternalProgram.g:8622:1: rule__Program__DaysAssignment_2_0 : ( ruleDay ) ;
    public final void rule__Program__DaysAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8626:1: ( ( ruleDay ) )
            // InternalProgram.g:8627:2: ( ruleDay )
            {
            // InternalProgram.g:8627:2: ( ruleDay )
            // InternalProgram.g:8628:3: ruleDay
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
    // InternalProgram.g:8637:1: rule__Program__DaysAssignment_2_1 : ( ruleDay ) ;
    public final void rule__Program__DaysAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8641:1: ( ( ruleDay ) )
            // InternalProgram.g:8642:2: ( ruleDay )
            {
            // InternalProgram.g:8642:2: ( ruleDay )
            // InternalProgram.g:8643:3: ruleDay
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
    // InternalProgram.g:8652:1: rule__Room__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Room__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8656:1: ( ( RULE_STRING ) )
            // InternalProgram.g:8657:2: ( RULE_STRING )
            {
            // InternalProgram.g:8657:2: ( RULE_STRING )
            // InternalProgram.g:8658:3: RULE_STRING
            {
             before(grammarAccess.getRoomAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // InternalProgram.g:8667:1: rule__Room__CapacityAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__Room__CapacityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8671:1: ( ( RULE_INT ) )
            // InternalProgram.g:8672:2: ( RULE_INT )
            {
            // InternalProgram.g:8672:2: ( RULE_INT )
            // InternalProgram.g:8673:3: RULE_INT
            {
             before(grammarAccess.getRoomAccess().getCapacityINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getCapacityINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:8682:1: rule__Day__WeekdayAssignment_0 : ( ruleWeekDay ) ;
    public final void rule__Day__WeekdayAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8686:1: ( ( ruleWeekDay ) )
            // InternalProgram.g:8687:2: ( ruleWeekDay )
            {
            // InternalProgram.g:8687:2: ( ruleWeekDay )
            // InternalProgram.g:8688:3: ruleWeekDay
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
    // InternalProgram.g:8697:1: rule__Day__DateAssignment_1_1 : ( ruleDayDate ) ;
    public final void rule__Day__DateAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8701:1: ( ( ruleDayDate ) )
            // InternalProgram.g:8702:2: ( ruleDayDate )
            {
            // InternalProgram.g:8702:2: ( ruleDayDate )
            // InternalProgram.g:8703:3: ruleDayDate
            {
             before(grammarAccess.getDayAccess().getDateDayDateParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDayDate();

            state._fsp--;

             after(grammarAccess.getDayAccess().getDateDayDateParserRuleCall_1_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:8712:1: rule__Day__SessionsAssignment_2_0 : ( ruleSession ) ;
    public final void rule__Day__SessionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8716:1: ( ( ruleSession ) )
            // InternalProgram.g:8717:2: ( ruleSession )
            {
            // InternalProgram.g:8717:2: ( ruleSession )
            // InternalProgram.g:8718:3: ruleSession
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
    // InternalProgram.g:8727:1: rule__Day__SessionsAssignment_2_1 : ( ruleSession ) ;
    public final void rule__Day__SessionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8731:1: ( ( ruleSession ) )
            // InternalProgram.g:8732:2: ( ruleSession )
            {
            // InternalProgram.g:8732:2: ( ruleSession )
            // InternalProgram.g:8733:3: ruleSession
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


    // $ANTLR start "rule__DayDate__YearAssignment_0"
    // InternalProgram.g:8742:1: rule__DayDate__YearAssignment_0 : ( RULE_INT ) ;
    public final void rule__DayDate__YearAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8746:1: ( ( RULE_INT ) )
            // InternalProgram.g:8747:2: ( RULE_INT )
            {
            // InternalProgram.g:8747:2: ( RULE_INT )
            // InternalProgram.g:8748:3: RULE_INT
            {
             before(grammarAccess.getDayDateAccess().getYearINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDayDateAccess().getYearINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DayDate__YearAssignment_0"


    // $ANTLR start "rule__DayDate__MonthAssignment_2"
    // InternalProgram.g:8757:1: rule__DayDate__MonthAssignment_2 : ( RULE_INT ) ;
    public final void rule__DayDate__MonthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8761:1: ( ( RULE_INT ) )
            // InternalProgram.g:8762:2: ( RULE_INT )
            {
            // InternalProgram.g:8762:2: ( RULE_INT )
            // InternalProgram.g:8763:3: RULE_INT
            {
             before(grammarAccess.getDayDateAccess().getMonthINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDayDateAccess().getMonthINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DayDate__MonthAssignment_2"


    // $ANTLR start "rule__DayDate__DayAssignment_4"
    // InternalProgram.g:8772:1: rule__DayDate__DayAssignment_4 : ( RULE_INT ) ;
    public final void rule__DayDate__DayAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8776:1: ( ( RULE_INT ) )
            // InternalProgram.g:8777:2: ( RULE_INT )
            {
            // InternalProgram.g:8777:2: ( RULE_INT )
            // InternalProgram.g:8778:3: RULE_INT
            {
             before(grammarAccess.getDayDateAccess().getDayINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDayDateAccess().getDayINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DayDate__DayAssignment_4"


    // $ANTLR start "rule__HourDate__HoursAssignment_0"
    // InternalProgram.g:8787:1: rule__HourDate__HoursAssignment_0 : ( RULE_INT ) ;
    public final void rule__HourDate__HoursAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8791:1: ( ( RULE_INT ) )
            // InternalProgram.g:8792:2: ( RULE_INT )
            {
            // InternalProgram.g:8792:2: ( RULE_INT )
            // InternalProgram.g:8793:3: RULE_INT
            {
             before(grammarAccess.getHourDateAccess().getHoursINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getHourDateAccess().getHoursINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HourDate__HoursAssignment_0"


    // $ANTLR start "rule__HourDate__MinutesAssignment_2"
    // InternalProgram.g:8802:1: rule__HourDate__MinutesAssignment_2 : ( RULE_INT ) ;
    public final void rule__HourDate__MinutesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8806:1: ( ( RULE_INT ) )
            // InternalProgram.g:8807:2: ( RULE_INT )
            {
            // InternalProgram.g:8807:2: ( RULE_INT )
            // InternalProgram.g:8808:3: RULE_INT
            {
             before(grammarAccess.getHourDateAccess().getMinutesINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getHourDateAccess().getMinutesINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HourDate__MinutesAssignment_2"


    // $ANTLR start "rule__Session__StartingTimeAssignment_1"
    // InternalProgram.g:8817:1: rule__Session__StartingTimeAssignment_1 : ( ruleHourDate ) ;
    public final void rule__Session__StartingTimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8821:1: ( ( ruleHourDate ) )
            // InternalProgram.g:8822:2: ( ruleHourDate )
            {
            // InternalProgram.g:8822:2: ( ruleHourDate )
            // InternalProgram.g:8823:3: ruleHourDate
            {
             before(grammarAccess.getSessionAccess().getStartingTimeHourDateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHourDate();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getStartingTimeHourDateParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:8832:1: rule__Session__EndingTimeAssignment_3 : ( ruleHourDate ) ;
    public final void rule__Session__EndingTimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8836:1: ( ( ruleHourDate ) )
            // InternalProgram.g:8837:2: ( ruleHourDate )
            {
            // InternalProgram.g:8837:2: ( ruleHourDate )
            // InternalProgram.g:8838:3: ruleHourDate
            {
             before(grammarAccess.getSessionAccess().getEndingTimeHourDateParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleHourDate();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getEndingTimeHourDateParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalProgram.g:8847:1: rule__Session__RoomAssignment_5 : ( ( RULE_STRING ) ) ;
    public final void rule__Session__RoomAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8851:1: ( ( ( RULE_STRING ) ) )
            // InternalProgram.g:8852:2: ( ( RULE_STRING ) )
            {
            // InternalProgram.g:8852:2: ( ( RULE_STRING ) )
            // InternalProgram.g:8853:3: ( RULE_STRING )
            {
             before(grammarAccess.getSessionAccess().getRoomRoomCrossReference_5_0()); 
            // InternalProgram.g:8854:3: ( RULE_STRING )
            // InternalProgram.g:8855:4: RULE_STRING
            {
             before(grammarAccess.getSessionAccess().getRoomRoomSTRINGTerminalRuleCall_5_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getRoomRoomSTRINGTerminalRuleCall_5_0_1()); 

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
    // InternalProgram.g:8866:1: rule__Session__EventsAssignment_7 : ( ( RULE_STRING ) ) ;
    public final void rule__Session__EventsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8870:1: ( ( ( RULE_STRING ) ) )
            // InternalProgram.g:8871:2: ( ( RULE_STRING ) )
            {
            // InternalProgram.g:8871:2: ( ( RULE_STRING ) )
            // InternalProgram.g:8872:3: ( RULE_STRING )
            {
             before(grammarAccess.getSessionAccess().getEventsEventCrossReference_7_0()); 
            // InternalProgram.g:8873:3: ( RULE_STRING )
            // InternalProgram.g:8874:4: RULE_STRING
            {
             before(grammarAccess.getSessionAccess().getEventsEventSTRINGTerminalRuleCall_7_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getEventsEventSTRINGTerminalRuleCall_7_0_1()); 

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
    // InternalProgram.g:8885:1: rule__Session__EventsAssignment_8_1 : ( ( RULE_STRING ) ) ;
    public final void rule__Session__EventsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8889:1: ( ( ( RULE_STRING ) ) )
            // InternalProgram.g:8890:2: ( ( RULE_STRING ) )
            {
            // InternalProgram.g:8890:2: ( ( RULE_STRING ) )
            // InternalProgram.g:8891:3: ( RULE_STRING )
            {
             before(grammarAccess.getSessionAccess().getEventsEventCrossReference_8_1_0()); 
            // InternalProgram.g:8892:3: ( RULE_STRING )
            // InternalProgram.g:8893:4: RULE_STRING
            {
             before(grammarAccess.getSessionAccess().getEventsEventSTRINGTerminalRuleCall_8_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getEventsEventSTRINGTerminalRuleCall_8_1_0_1()); 

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
    // InternalProgram.g:8904:1: rule__TalkSession__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TalkSession__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8908:1: ( ( RULE_STRING ) )
            // InternalProgram.g:8909:2: ( RULE_STRING )
            {
            // InternalProgram.g:8909:2: ( RULE_STRING )
            // InternalProgram.g:8910:3: RULE_STRING
            {
             before(grammarAccess.getTalkSessionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTalkSessionAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:8919:1: rule__TalkSession__ChairAssignment_2_1 : ( rulePerson ) ;
    public final void rule__TalkSession__ChairAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8923:1: ( ( rulePerson ) )
            // InternalProgram.g:8924:2: ( rulePerson )
            {
            // InternalProgram.g:8924:2: ( rulePerson )
            // InternalProgram.g:8925:3: rulePerson
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
    // InternalProgram.g:8934:1: rule__TalkSession__AbstractAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__TalkSession__AbstractAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8938:1: ( ( RULE_STRING ) )
            // InternalProgram.g:8939:2: ( RULE_STRING )
            {
            // InternalProgram.g:8939:2: ( RULE_STRING )
            // InternalProgram.g:8940:3: RULE_STRING
            {
             before(grammarAccess.getTalkSessionAccess().getAbstractSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTalkSessionAccess().getAbstractSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:8949:1: rule__TalkSession__PapersAssignment_4_1 : ( ( RULE_STRING ) ) ;
    public final void rule__TalkSession__PapersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8953:1: ( ( ( RULE_STRING ) ) )
            // InternalProgram.g:8954:2: ( ( RULE_STRING ) )
            {
            // InternalProgram.g:8954:2: ( ( RULE_STRING ) )
            // InternalProgram.g:8955:3: ( RULE_STRING )
            {
             before(grammarAccess.getTalkSessionAccess().getPapersPaperCrossReference_4_1_0()); 
            // InternalProgram.g:8956:3: ( RULE_STRING )
            // InternalProgram.g:8957:4: RULE_STRING
            {
             before(grammarAccess.getTalkSessionAccess().getPapersPaperSTRINGTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTalkSessionAccess().getPapersPaperSTRINGTerminalRuleCall_4_1_0_1()); 

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
    // InternalProgram.g:8968:1: rule__TalkSession__PapersAssignment_4_2_1 : ( ( RULE_STRING ) ) ;
    public final void rule__TalkSession__PapersAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8972:1: ( ( ( RULE_STRING ) ) )
            // InternalProgram.g:8973:2: ( ( RULE_STRING ) )
            {
            // InternalProgram.g:8973:2: ( ( RULE_STRING ) )
            // InternalProgram.g:8974:3: ( RULE_STRING )
            {
             before(grammarAccess.getTalkSessionAccess().getPapersPaperCrossReference_4_2_1_0()); 
            // InternalProgram.g:8975:3: ( RULE_STRING )
            // InternalProgram.g:8976:4: RULE_STRING
            {
             before(grammarAccess.getTalkSessionAccess().getPapersPaperSTRINGTerminalRuleCall_4_2_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTalkSessionAccess().getPapersPaperSTRINGTerminalRuleCall_4_2_1_0_1()); 

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
    // InternalProgram.g:8987:1: rule__Panel__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Panel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8991:1: ( ( RULE_STRING ) )
            // InternalProgram.g:8992:2: ( RULE_STRING )
            {
            // InternalProgram.g:8992:2: ( RULE_STRING )
            // InternalProgram.g:8993:3: RULE_STRING
            {
             before(grammarAccess.getPanelAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPanelAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:9002:1: rule__Panel__AbstractAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Panel__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9006:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9007:2: ( RULE_STRING )
            {
            // InternalProgram.g:9007:2: ( RULE_STRING )
            // InternalProgram.g:9008:3: RULE_STRING
            {
             before(grammarAccess.getPanelAccess().getAbstractSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPanelAccess().getAbstractSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:9017:1: rule__Panel__PanelistsAssignment_3_1 : ( rulePerson ) ;
    public final void rule__Panel__PanelistsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9021:1: ( ( rulePerson ) )
            // InternalProgram.g:9022:2: ( rulePerson )
            {
            // InternalProgram.g:9022:2: ( rulePerson )
            // InternalProgram.g:9023:3: rulePerson
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
    // InternalProgram.g:9032:1: rule__Panel__PanelistsAssignment_3_2_1 : ( rulePerson ) ;
    public final void rule__Panel__PanelistsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9036:1: ( ( rulePerson ) )
            // InternalProgram.g:9037:2: ( rulePerson )
            {
            // InternalProgram.g:9037:2: ( rulePerson )
            // InternalProgram.g:9038:3: rulePerson
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
    // InternalProgram.g:9047:1: rule__Panel__ModeratorsAssignment_4_1 : ( rulePerson ) ;
    public final void rule__Panel__ModeratorsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9051:1: ( ( rulePerson ) )
            // InternalProgram.g:9052:2: ( rulePerson )
            {
            // InternalProgram.g:9052:2: ( rulePerson )
            // InternalProgram.g:9053:3: rulePerson
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
    // InternalProgram.g:9062:1: rule__Panel__ModeratorsAssignment_4_2_1 : ( rulePerson ) ;
    public final void rule__Panel__ModeratorsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9066:1: ( ( rulePerson ) )
            // InternalProgram.g:9067:2: ( rulePerson )
            {
            // InternalProgram.g:9067:2: ( rulePerson )
            // InternalProgram.g:9068:3: rulePerson
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


    // $ANTLR start "rule__Panel__CancelledAssignment_5"
    // InternalProgram.g:9077:1: rule__Panel__CancelledAssignment_5 : ( ( 'cancelled' ) ) ;
    public final void rule__Panel__CancelledAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9081:1: ( ( ( 'cancelled' ) ) )
            // InternalProgram.g:9082:2: ( ( 'cancelled' ) )
            {
            // InternalProgram.g:9082:2: ( ( 'cancelled' ) )
            // InternalProgram.g:9083:3: ( 'cancelled' )
            {
             before(grammarAccess.getPanelAccess().getCancelledCancelledKeyword_5_0()); 
            // InternalProgram.g:9084:3: ( 'cancelled' )
            // InternalProgram.g:9085:4: 'cancelled'
            {
             before(grammarAccess.getPanelAccess().getCancelledCancelledKeyword_5_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getPanelAccess().getCancelledCancelledKeyword_5_0()); 

            }

             after(grammarAccess.getPanelAccess().getCancelledCancelledKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__CancelledAssignment_5"


    // $ANTLR start "rule__SRC__NameAssignment_1"
    // InternalProgram.g:9096:1: rule__SRC__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__SRC__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9100:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9101:2: ( RULE_STRING )
            {
            // InternalProgram.g:9101:2: ( RULE_STRING )
            // InternalProgram.g:9102:3: RULE_STRING
            {
             before(grammarAccess.getSRCAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSRCAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:9111:1: rule__SRC__AbstractAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__SRC__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9115:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9116:2: ( RULE_STRING )
            {
            // InternalProgram.g:9116:2: ( RULE_STRING )
            // InternalProgram.g:9117:3: RULE_STRING
            {
             before(grammarAccess.getSRCAccess().getAbstractSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSRCAccess().getAbstractSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__SRC__UrlAssignment_3_1"
    // InternalProgram.g:9126:1: rule__SRC__UrlAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__SRC__UrlAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9130:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9131:2: ( RULE_STRING )
            {
            // InternalProgram.g:9131:2: ( RULE_STRING )
            // InternalProgram.g:9132:3: RULE_STRING
            {
             before(grammarAccess.getSRCAccess().getUrlSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSRCAccess().getUrlSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRC__UrlAssignment_3_1"


    // $ANTLR start "rule__SRC__CancelledAssignment_4"
    // InternalProgram.g:9141:1: rule__SRC__CancelledAssignment_4 : ( ( 'cancelled' ) ) ;
    public final void rule__SRC__CancelledAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9145:1: ( ( ( 'cancelled' ) ) )
            // InternalProgram.g:9146:2: ( ( 'cancelled' ) )
            {
            // InternalProgram.g:9146:2: ( ( 'cancelled' ) )
            // InternalProgram.g:9147:3: ( 'cancelled' )
            {
             before(grammarAccess.getSRCAccess().getCancelledCancelledKeyword_4_0()); 
            // InternalProgram.g:9148:3: ( 'cancelled' )
            // InternalProgram.g:9149:4: 'cancelled'
            {
             before(grammarAccess.getSRCAccess().getCancelledCancelledKeyword_4_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getSRCAccess().getCancelledCancelledKeyword_4_0()); 

            }

             after(grammarAccess.getSRCAccess().getCancelledCancelledKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SRC__CancelledAssignment_4"


    // $ANTLR start "rule__Poster__NameAssignment_1"
    // InternalProgram.g:9160:1: rule__Poster__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Poster__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9164:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9165:2: ( RULE_STRING )
            {
            // InternalProgram.g:9165:2: ( RULE_STRING )
            // InternalProgram.g:9166:3: RULE_STRING
            {
             before(grammarAccess.getPosterAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPosterAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:9175:1: rule__Poster__AbstractAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Poster__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9179:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9180:2: ( RULE_STRING )
            {
            // InternalProgram.g:9180:2: ( RULE_STRING )
            // InternalProgram.g:9181:3: RULE_STRING
            {
             before(grammarAccess.getPosterAccess().getAbstractSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPosterAccess().getAbstractSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Poster__UrlAssignment_3_1"
    // InternalProgram.g:9190:1: rule__Poster__UrlAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Poster__UrlAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9194:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9195:2: ( RULE_STRING )
            {
            // InternalProgram.g:9195:2: ( RULE_STRING )
            // InternalProgram.g:9196:3: RULE_STRING
            {
             before(grammarAccess.getPosterAccess().getUrlSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPosterAccess().getUrlSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poster__UrlAssignment_3_1"


    // $ANTLR start "rule__Poster__CancelledAssignment_4"
    // InternalProgram.g:9205:1: rule__Poster__CancelledAssignment_4 : ( ( 'cancelled' ) ) ;
    public final void rule__Poster__CancelledAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9209:1: ( ( ( 'cancelled' ) ) )
            // InternalProgram.g:9210:2: ( ( 'cancelled' ) )
            {
            // InternalProgram.g:9210:2: ( ( 'cancelled' ) )
            // InternalProgram.g:9211:3: ( 'cancelled' )
            {
             before(grammarAccess.getPosterAccess().getCancelledCancelledKeyword_4_0()); 
            // InternalProgram.g:9212:3: ( 'cancelled' )
            // InternalProgram.g:9213:4: 'cancelled'
            {
             before(grammarAccess.getPosterAccess().getCancelledCancelledKeyword_4_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getPosterAccess().getCancelledCancelledKeyword_4_0()); 

            }

             after(grammarAccess.getPosterAccess().getCancelledCancelledKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poster__CancelledAssignment_4"


    // $ANTLR start "rule__Keynote__NameAssignment_1"
    // InternalProgram.g:9224:1: rule__Keynote__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Keynote__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9228:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9229:2: ( RULE_STRING )
            {
            // InternalProgram.g:9229:2: ( RULE_STRING )
            // InternalProgram.g:9230:3: RULE_STRING
            {
             before(grammarAccess.getKeynoteAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getKeynoteAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:9239:1: rule__Keynote__AbstractAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Keynote__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9243:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9244:2: ( RULE_STRING )
            {
            // InternalProgram.g:9244:2: ( RULE_STRING )
            // InternalProgram.g:9245:3: RULE_STRING
            {
             before(grammarAccess.getKeynoteAccess().getAbstractSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getKeynoteAccess().getAbstractSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:9254:1: rule__Keynote__SpeakerAssignment_3_1 : ( rulePerson ) ;
    public final void rule__Keynote__SpeakerAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9258:1: ( ( rulePerson ) )
            // InternalProgram.g:9259:2: ( rulePerson )
            {
            // InternalProgram.g:9259:2: ( rulePerson )
            // InternalProgram.g:9260:3: rulePerson
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


    // $ANTLR start "rule__Keynote__ChairAssignment_4_1"
    // InternalProgram.g:9269:1: rule__Keynote__ChairAssignment_4_1 : ( rulePerson ) ;
    public final void rule__Keynote__ChairAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9273:1: ( ( rulePerson ) )
            // InternalProgram.g:9274:2: ( rulePerson )
            {
            // InternalProgram.g:9274:2: ( rulePerson )
            // InternalProgram.g:9275:3: rulePerson
            {
             before(grammarAccess.getKeynoteAccess().getChairPersonParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getKeynoteAccess().getChairPersonParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__ChairAssignment_4_1"


    // $ANTLR start "rule__Keynote__CancelledAssignment_5"
    // InternalProgram.g:9284:1: rule__Keynote__CancelledAssignment_5 : ( ( 'cancelled' ) ) ;
    public final void rule__Keynote__CancelledAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9288:1: ( ( ( 'cancelled' ) ) )
            // InternalProgram.g:9289:2: ( ( 'cancelled' ) )
            {
            // InternalProgram.g:9289:2: ( ( 'cancelled' ) )
            // InternalProgram.g:9290:3: ( 'cancelled' )
            {
             before(grammarAccess.getKeynoteAccess().getCancelledCancelledKeyword_5_0()); 
            // InternalProgram.g:9291:3: ( 'cancelled' )
            // InternalProgram.g:9292:4: 'cancelled'
            {
             before(grammarAccess.getKeynoteAccess().getCancelledCancelledKeyword_5_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getKeynoteAccess().getCancelledCancelledKeyword_5_0()); 

            }

             after(grammarAccess.getKeynoteAccess().getCancelledCancelledKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Keynote__CancelledAssignment_5"


    // $ANTLR start "rule__SponsorKeynote__NameAssignment_1"
    // InternalProgram.g:9303:1: rule__SponsorKeynote__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__SponsorKeynote__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9307:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9308:2: ( RULE_STRING )
            {
            // InternalProgram.g:9308:2: ( RULE_STRING )
            // InternalProgram.g:9309:3: RULE_STRING
            {
             before(grammarAccess.getSponsorKeynoteAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSponsorKeynoteAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:9318:1: rule__SponsorKeynote__AbstractAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__SponsorKeynote__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9322:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9323:2: ( RULE_STRING )
            {
            // InternalProgram.g:9323:2: ( RULE_STRING )
            // InternalProgram.g:9324:3: RULE_STRING
            {
             before(grammarAccess.getSponsorKeynoteAccess().getAbstractSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSponsorKeynoteAccess().getAbstractSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:9333:1: rule__SponsorKeynote__SpeakerAssignment_3_1 : ( rulePerson ) ;
    public final void rule__SponsorKeynote__SpeakerAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9337:1: ( ( rulePerson ) )
            // InternalProgram.g:9338:2: ( rulePerson )
            {
            // InternalProgram.g:9338:2: ( rulePerson )
            // InternalProgram.g:9339:3: rulePerson
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


    // $ANTLR start "rule__SponsorKeynote__ChairAssignment_4_1"
    // InternalProgram.g:9348:1: rule__SponsorKeynote__ChairAssignment_4_1 : ( rulePerson ) ;
    public final void rule__SponsorKeynote__ChairAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9352:1: ( ( rulePerson ) )
            // InternalProgram.g:9353:2: ( rulePerson )
            {
            // InternalProgram.g:9353:2: ( rulePerson )
            // InternalProgram.g:9354:3: rulePerson
            {
             before(grammarAccess.getSponsorKeynoteAccess().getChairPersonParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getSponsorKeynoteAccess().getChairPersonParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SponsorKeynote__ChairAssignment_4_1"


    // $ANTLR start "rule__SponsorKeynote__CancelledAssignment_5"
    // InternalProgram.g:9363:1: rule__SponsorKeynote__CancelledAssignment_5 : ( ( 'cancelled' ) ) ;
    public final void rule__SponsorKeynote__CancelledAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9367:1: ( ( ( 'cancelled' ) ) )
            // InternalProgram.g:9368:2: ( ( 'cancelled' ) )
            {
            // InternalProgram.g:9368:2: ( ( 'cancelled' ) )
            // InternalProgram.g:9369:3: ( 'cancelled' )
            {
             before(grammarAccess.getSponsorKeynoteAccess().getCancelledCancelledKeyword_5_0()); 
            // InternalProgram.g:9370:3: ( 'cancelled' )
            // InternalProgram.g:9371:4: 'cancelled'
            {
             before(grammarAccess.getSponsorKeynoteAccess().getCancelledCancelledKeyword_5_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getSponsorKeynoteAccess().getCancelledCancelledKeyword_5_0()); 

            }

             after(grammarAccess.getSponsorKeynoteAccess().getCancelledCancelledKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SponsorKeynote__CancelledAssignment_5"


    // $ANTLR start "rule__Workshop__NameAssignment_1"
    // InternalProgram.g:9382:1: rule__Workshop__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Workshop__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9386:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9387:2: ( RULE_STRING )
            {
            // InternalProgram.g:9387:2: ( RULE_STRING )
            // InternalProgram.g:9388:3: RULE_STRING
            {
             before(grammarAccess.getWorkshopAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getWorkshopAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:9397:1: rule__Workshop__AbstractAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Workshop__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9401:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9402:2: ( RULE_STRING )
            {
            // InternalProgram.g:9402:2: ( RULE_STRING )
            // InternalProgram.g:9403:3: RULE_STRING
            {
             before(grammarAccess.getWorkshopAccess().getAbstractSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getWorkshopAccess().getAbstractSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:9412:1: rule__Workshop__UrlAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Workshop__UrlAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9416:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9417:2: ( RULE_STRING )
            {
            // InternalProgram.g:9417:2: ( RULE_STRING )
            // InternalProgram.g:9418:3: RULE_STRING
            {
             before(grammarAccess.getWorkshopAccess().getUrlSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getWorkshopAccess().getUrlSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:9427:1: rule__Workshop__FullNameAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Workshop__FullNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9431:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9432:2: ( RULE_STRING )
            {
            // InternalProgram.g:9432:2: ( RULE_STRING )
            // InternalProgram.g:9433:3: RULE_STRING
            {
             before(grammarAccess.getWorkshopAccess().getFullNameSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getWorkshopAccess().getFullNameSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:9442:1: rule__Workshop__OrganizersAssignment_5_1 : ( rulePerson ) ;
    public final void rule__Workshop__OrganizersAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9446:1: ( ( rulePerson ) )
            // InternalProgram.g:9447:2: ( rulePerson )
            {
            // InternalProgram.g:9447:2: ( rulePerson )
            // InternalProgram.g:9448:3: rulePerson
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
    // InternalProgram.g:9457:1: rule__Workshop__OrganizersAssignment_5_2_1 : ( rulePerson ) ;
    public final void rule__Workshop__OrganizersAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9461:1: ( ( rulePerson ) )
            // InternalProgram.g:9462:2: ( rulePerson )
            {
            // InternalProgram.g:9462:2: ( rulePerson )
            // InternalProgram.g:9463:3: rulePerson
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


    // $ANTLR start "rule__Workshop__CancelledAssignment_6"
    // InternalProgram.g:9472:1: rule__Workshop__CancelledAssignment_6 : ( ( 'cancelled' ) ) ;
    public final void rule__Workshop__CancelledAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9476:1: ( ( ( 'cancelled' ) ) )
            // InternalProgram.g:9477:2: ( ( 'cancelled' ) )
            {
            // InternalProgram.g:9477:2: ( ( 'cancelled' ) )
            // InternalProgram.g:9478:3: ( 'cancelled' )
            {
             before(grammarAccess.getWorkshopAccess().getCancelledCancelledKeyword_6_0()); 
            // InternalProgram.g:9479:3: ( 'cancelled' )
            // InternalProgram.g:9480:4: 'cancelled'
            {
             before(grammarAccess.getWorkshopAccess().getCancelledCancelledKeyword_6_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getWorkshopAccess().getCancelledCancelledKeyword_6_0()); 

            }

             after(grammarAccess.getWorkshopAccess().getCancelledCancelledKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__CancelledAssignment_6"


    // $ANTLR start "rule__Tutorial__NameAssignment_1"
    // InternalProgram.g:9491:1: rule__Tutorial__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Tutorial__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9495:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9496:2: ( RULE_STRING )
            {
            // InternalProgram.g:9496:2: ( RULE_STRING )
            // InternalProgram.g:9497:3: RULE_STRING
            {
             before(grammarAccess.getTutorialAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTutorialAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:9506:1: rule__Tutorial__AbstractAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Tutorial__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9510:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9511:2: ( RULE_STRING )
            {
            // InternalProgram.g:9511:2: ( RULE_STRING )
            // InternalProgram.g:9512:3: RULE_STRING
            {
             before(grammarAccess.getTutorialAccess().getAbstractSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTutorialAccess().getAbstractSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:9521:1: rule__Tutorial__OrganizersAssignment_3_1 : ( rulePerson ) ;
    public final void rule__Tutorial__OrganizersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9525:1: ( ( rulePerson ) )
            // InternalProgram.g:9526:2: ( rulePerson )
            {
            // InternalProgram.g:9526:2: ( rulePerson )
            // InternalProgram.g:9527:3: rulePerson
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
    // InternalProgram.g:9536:1: rule__Tutorial__OrganizersAssignment_3_2_1 : ( rulePerson ) ;
    public final void rule__Tutorial__OrganizersAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9540:1: ( ( rulePerson ) )
            // InternalProgram.g:9541:2: ( rulePerson )
            {
            // InternalProgram.g:9541:2: ( rulePerson )
            // InternalProgram.g:9542:3: rulePerson
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


    // $ANTLR start "rule__Tutorial__CancelledAssignment_4"
    // InternalProgram.g:9551:1: rule__Tutorial__CancelledAssignment_4 : ( ( 'cancelled' ) ) ;
    public final void rule__Tutorial__CancelledAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9555:1: ( ( ( 'cancelled' ) ) )
            // InternalProgram.g:9556:2: ( ( 'cancelled' ) )
            {
            // InternalProgram.g:9556:2: ( ( 'cancelled' ) )
            // InternalProgram.g:9557:3: ( 'cancelled' )
            {
             before(grammarAccess.getTutorialAccess().getCancelledCancelledKeyword_4_0()); 
            // InternalProgram.g:9558:3: ( 'cancelled' )
            // InternalProgram.g:9559:4: 'cancelled'
            {
             before(grammarAccess.getTutorialAccess().getCancelledCancelledKeyword_4_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getTutorialAccess().getCancelledCancelledKeyword_4_0()); 

            }

             after(grammarAccess.getTutorialAccess().getCancelledCancelledKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__CancelledAssignment_4"


    // $ANTLR start "rule__DoctoralSymposium__NameAssignment_1"
    // InternalProgram.g:9570:1: rule__DoctoralSymposium__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DoctoralSymposium__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9574:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9575:2: ( RULE_STRING )
            {
            // InternalProgram.g:9575:2: ( RULE_STRING )
            // InternalProgram.g:9576:3: RULE_STRING
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDoctoralSymposiumAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:9585:1: rule__DoctoralSymposium__AbstractAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__DoctoralSymposium__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9589:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9590:2: ( RULE_STRING )
            {
            // InternalProgram.g:9590:2: ( RULE_STRING )
            // InternalProgram.g:9591:3: RULE_STRING
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getAbstractSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDoctoralSymposiumAccess().getAbstractSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__DoctoralSymposium__UrlAssignment_3_1"
    // InternalProgram.g:9600:1: rule__DoctoralSymposium__UrlAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__DoctoralSymposium__UrlAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9604:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9605:2: ( RULE_STRING )
            {
            // InternalProgram.g:9605:2: ( RULE_STRING )
            // InternalProgram.g:9606:3: RULE_STRING
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getUrlSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDoctoralSymposiumAccess().getUrlSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__UrlAssignment_3_1"


    // $ANTLR start "rule__DoctoralSymposium__OrganizersAssignment_4_1"
    // InternalProgram.g:9615:1: rule__DoctoralSymposium__OrganizersAssignment_4_1 : ( rulePerson ) ;
    public final void rule__DoctoralSymposium__OrganizersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9619:1: ( ( rulePerson ) )
            // InternalProgram.g:9620:2: ( rulePerson )
            {
            // InternalProgram.g:9620:2: ( rulePerson )
            // InternalProgram.g:9621:3: rulePerson
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getOrganizersPersonParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getDoctoralSymposiumAccess().getOrganizersPersonParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__OrganizersAssignment_4_1"


    // $ANTLR start "rule__DoctoralSymposium__OrganizersAssignment_4_2_1"
    // InternalProgram.g:9630:1: rule__DoctoralSymposium__OrganizersAssignment_4_2_1 : ( rulePerson ) ;
    public final void rule__DoctoralSymposium__OrganizersAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9634:1: ( ( rulePerson ) )
            // InternalProgram.g:9635:2: ( rulePerson )
            {
            // InternalProgram.g:9635:2: ( rulePerson )
            // InternalProgram.g:9636:3: rulePerson
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getOrganizersPersonParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getDoctoralSymposiumAccess().getOrganizersPersonParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__OrganizersAssignment_4_2_1"


    // $ANTLR start "rule__DoctoralSymposium__CancelledAssignment_5"
    // InternalProgram.g:9645:1: rule__DoctoralSymposium__CancelledAssignment_5 : ( ( 'cancelled' ) ) ;
    public final void rule__DoctoralSymposium__CancelledAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9649:1: ( ( ( 'cancelled' ) ) )
            // InternalProgram.g:9650:2: ( ( 'cancelled' ) )
            {
            // InternalProgram.g:9650:2: ( ( 'cancelled' ) )
            // InternalProgram.g:9651:3: ( 'cancelled' )
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getCancelledCancelledKeyword_5_0()); 
            // InternalProgram.g:9652:3: ( 'cancelled' )
            // InternalProgram.g:9653:4: 'cancelled'
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getCancelledCancelledKeyword_5_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getDoctoralSymposiumAccess().getCancelledCancelledKeyword_5_0()); 

            }

             after(grammarAccess.getDoctoralSymposiumAccess().getCancelledCancelledKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__CancelledAssignment_5"


    // $ANTLR start "rule__EducatorSymposium__NameAssignment_1"
    // InternalProgram.g:9664:1: rule__EducatorSymposium__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__EducatorSymposium__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9668:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9669:2: ( RULE_STRING )
            {
            // InternalProgram.g:9669:2: ( RULE_STRING )
            // InternalProgram.g:9670:3: RULE_STRING
            {
             before(grammarAccess.getEducatorSymposiumAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEducatorSymposiumAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:9679:1: rule__EducatorSymposium__AbstractAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__EducatorSymposium__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9683:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9684:2: ( RULE_STRING )
            {
            // InternalProgram.g:9684:2: ( RULE_STRING )
            // InternalProgram.g:9685:3: RULE_STRING
            {
             before(grammarAccess.getEducatorSymposiumAccess().getAbstractSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEducatorSymposiumAccess().getAbstractSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__EducatorSymposium__UrlAssignment_3_1"
    // InternalProgram.g:9694:1: rule__EducatorSymposium__UrlAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__EducatorSymposium__UrlAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9698:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9699:2: ( RULE_STRING )
            {
            // InternalProgram.g:9699:2: ( RULE_STRING )
            // InternalProgram.g:9700:3: RULE_STRING
            {
             before(grammarAccess.getEducatorSymposiumAccess().getUrlSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEducatorSymposiumAccess().getUrlSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__UrlAssignment_3_1"


    // $ANTLR start "rule__EducatorSymposium__OrganizersAssignment_4_1"
    // InternalProgram.g:9709:1: rule__EducatorSymposium__OrganizersAssignment_4_1 : ( rulePerson ) ;
    public final void rule__EducatorSymposium__OrganizersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9713:1: ( ( rulePerson ) )
            // InternalProgram.g:9714:2: ( rulePerson )
            {
            // InternalProgram.g:9714:2: ( rulePerson )
            // InternalProgram.g:9715:3: rulePerson
            {
             before(grammarAccess.getEducatorSymposiumAccess().getOrganizersPersonParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getEducatorSymposiumAccess().getOrganizersPersonParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__OrganizersAssignment_4_1"


    // $ANTLR start "rule__EducatorSymposium__OrganizersAssignment_4_2_1"
    // InternalProgram.g:9724:1: rule__EducatorSymposium__OrganizersAssignment_4_2_1 : ( rulePerson ) ;
    public final void rule__EducatorSymposium__OrganizersAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9728:1: ( ( rulePerson ) )
            // InternalProgram.g:9729:2: ( rulePerson )
            {
            // InternalProgram.g:9729:2: ( rulePerson )
            // InternalProgram.g:9730:3: rulePerson
            {
             before(grammarAccess.getEducatorSymposiumAccess().getOrganizersPersonParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getEducatorSymposiumAccess().getOrganizersPersonParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__OrganizersAssignment_4_2_1"


    // $ANTLR start "rule__EducatorSymposium__CancelledAssignment_5"
    // InternalProgram.g:9739:1: rule__EducatorSymposium__CancelledAssignment_5 : ( ( 'cancelled' ) ) ;
    public final void rule__EducatorSymposium__CancelledAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9743:1: ( ( ( 'cancelled' ) ) )
            // InternalProgram.g:9744:2: ( ( 'cancelled' ) )
            {
            // InternalProgram.g:9744:2: ( ( 'cancelled' ) )
            // InternalProgram.g:9745:3: ( 'cancelled' )
            {
             before(grammarAccess.getEducatorSymposiumAccess().getCancelledCancelledKeyword_5_0()); 
            // InternalProgram.g:9746:3: ( 'cancelled' )
            // InternalProgram.g:9747:4: 'cancelled'
            {
             before(grammarAccess.getEducatorSymposiumAccess().getCancelledCancelledKeyword_5_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getEducatorSymposiumAccess().getCancelledCancelledKeyword_5_0()); 

            }

             after(grammarAccess.getEducatorSymposiumAccess().getCancelledCancelledKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__CancelledAssignment_5"


    // $ANTLR start "rule__Reception__NameAssignment_1"
    // InternalProgram.g:9758:1: rule__Reception__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Reception__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9762:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9763:2: ( RULE_STRING )
            {
            // InternalProgram.g:9763:2: ( RULE_STRING )
            // InternalProgram.g:9764:3: RULE_STRING
            {
             before(grammarAccess.getReceptionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getReceptionAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:9773:1: rule__Reception__AbstractAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Reception__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9777:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9778:2: ( RULE_STRING )
            {
            // InternalProgram.g:9778:2: ( RULE_STRING )
            // InternalProgram.g:9779:3: RULE_STRING
            {
             before(grammarAccess.getReceptionAccess().getAbstractSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getReceptionAccess().getAbstractSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Reception__CancelledAssignment_3"
    // InternalProgram.g:9788:1: rule__Reception__CancelledAssignment_3 : ( ( 'cancelled' ) ) ;
    public final void rule__Reception__CancelledAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9792:1: ( ( ( 'cancelled' ) ) )
            // InternalProgram.g:9793:2: ( ( 'cancelled' ) )
            {
            // InternalProgram.g:9793:2: ( ( 'cancelled' ) )
            // InternalProgram.g:9794:3: ( 'cancelled' )
            {
             before(grammarAccess.getReceptionAccess().getCancelledCancelledKeyword_3_0()); 
            // InternalProgram.g:9795:3: ( 'cancelled' )
            // InternalProgram.g:9796:4: 'cancelled'
            {
             before(grammarAccess.getReceptionAccess().getCancelledCancelledKeyword_3_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getReceptionAccess().getCancelledCancelledKeyword_3_0()); 

            }

             after(grammarAccess.getReceptionAccess().getCancelledCancelledKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reception__CancelledAssignment_3"


    // $ANTLR start "rule__Clinic__NameAssignment_1"
    // InternalProgram.g:9807:1: rule__Clinic__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Clinic__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9811:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9812:2: ( RULE_STRING )
            {
            // InternalProgram.g:9812:2: ( RULE_STRING )
            // InternalProgram.g:9813:3: RULE_STRING
            {
             before(grammarAccess.getClinicAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getClinicAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:9822:1: rule__Clinic__AbstractAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Clinic__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9826:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9827:2: ( RULE_STRING )
            {
            // InternalProgram.g:9827:2: ( RULE_STRING )
            // InternalProgram.g:9828:3: RULE_STRING
            {
             before(grammarAccess.getClinicAccess().getAbstractSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getClinicAccess().getAbstractSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Clinic__UrlAssignment_3_1"
    // InternalProgram.g:9837:1: rule__Clinic__UrlAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Clinic__UrlAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9841:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9842:2: ( RULE_STRING )
            {
            // InternalProgram.g:9842:2: ( RULE_STRING )
            // InternalProgram.g:9843:3: RULE_STRING
            {
             before(grammarAccess.getClinicAccess().getUrlSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getClinicAccess().getUrlSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clinic__UrlAssignment_3_1"


    // $ANTLR start "rule__Clinic__CancelledAssignment_4"
    // InternalProgram.g:9852:1: rule__Clinic__CancelledAssignment_4 : ( ( 'cancelled' ) ) ;
    public final void rule__Clinic__CancelledAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9856:1: ( ( ( 'cancelled' ) ) )
            // InternalProgram.g:9857:2: ( ( 'cancelled' ) )
            {
            // InternalProgram.g:9857:2: ( ( 'cancelled' ) )
            // InternalProgram.g:9858:3: ( 'cancelled' )
            {
             before(grammarAccess.getClinicAccess().getCancelledCancelledKeyword_4_0()); 
            // InternalProgram.g:9859:3: ( 'cancelled' )
            // InternalProgram.g:9860:4: 'cancelled'
            {
             before(grammarAccess.getClinicAccess().getCancelledCancelledKeyword_4_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getClinicAccess().getCancelledCancelledKeyword_4_0()); 

            }

             after(grammarAccess.getClinicAccess().getCancelledCancelledKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clinic__CancelledAssignment_4"


    // $ANTLR start "rule__Lunch__NameAssignment_1"
    // InternalProgram.g:9871:1: rule__Lunch__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Lunch__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9875:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9876:2: ( RULE_STRING )
            {
            // InternalProgram.g:9876:2: ( RULE_STRING )
            // InternalProgram.g:9877:3: RULE_STRING
            {
             before(grammarAccess.getLunchAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLunchAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:9886:1: rule__Lunch__AbstractAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Lunch__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9890:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9891:2: ( RULE_STRING )
            {
            // InternalProgram.g:9891:2: ( RULE_STRING )
            // InternalProgram.g:9892:3: RULE_STRING
            {
             before(grammarAccess.getLunchAccess().getAbstractSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLunchAccess().getAbstractSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:9901:1: rule__CoffeeBreak__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CoffeeBreak__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9905:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9906:2: ( RULE_STRING )
            {
            // InternalProgram.g:9906:2: ( RULE_STRING )
            // InternalProgram.g:9907:3: RULE_STRING
            {
             before(grammarAccess.getCoffeeBreakAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCoffeeBreakAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:9916:1: rule__CoffeeBreak__AbstractAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__CoffeeBreak__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9920:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9921:2: ( RULE_STRING )
            {
            // InternalProgram.g:9921:2: ( RULE_STRING )
            // InternalProgram.g:9922:3: RULE_STRING
            {
             before(grammarAccess.getCoffeeBreakAccess().getAbstractSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCoffeeBreakAccess().getAbstractSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:9931:1: rule__Meeting__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Meeting__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9935:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9936:2: ( RULE_STRING )
            {
            // InternalProgram.g:9936:2: ( RULE_STRING )
            // InternalProgram.g:9937:3: RULE_STRING
            {
             before(grammarAccess.getMeetingAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMeetingAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:9946:1: rule__Meeting__AbstractAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Meeting__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9950:1: ( ( RULE_STRING ) )
            // InternalProgram.g:9951:2: ( RULE_STRING )
            {
            // InternalProgram.g:9951:2: ( RULE_STRING )
            // InternalProgram.g:9952:3: RULE_STRING
            {
             before(grammarAccess.getMeetingAccess().getAbstractSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMeetingAccess().getAbstractSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Meeting__ParticipantsAssignment_3_1"
    // InternalProgram.g:9961:1: rule__Meeting__ParticipantsAssignment_3_1 : ( rulePerson ) ;
    public final void rule__Meeting__ParticipantsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9965:1: ( ( rulePerson ) )
            // InternalProgram.g:9966:2: ( rulePerson )
            {
            // InternalProgram.g:9966:2: ( rulePerson )
            // InternalProgram.g:9967:3: rulePerson
            {
             before(grammarAccess.getMeetingAccess().getParticipantsPersonParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getMeetingAccess().getParticipantsPersonParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__ParticipantsAssignment_3_1"


    // $ANTLR start "rule__Meeting__ParticipantsAssignment_3_2_1"
    // InternalProgram.g:9976:1: rule__Meeting__ParticipantsAssignment_3_2_1 : ( rulePerson ) ;
    public final void rule__Meeting__ParticipantsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9980:1: ( ( rulePerson ) )
            // InternalProgram.g:9981:2: ( rulePerson )
            {
            // InternalProgram.g:9981:2: ( rulePerson )
            // InternalProgram.g:9982:3: rulePerson
            {
             before(grammarAccess.getMeetingAccess().getParticipantsPersonParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getMeetingAccess().getParticipantsPersonParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__ParticipantsAssignment_3_2_1"


    // $ANTLR start "rule__Meeting__CancelledAssignment_4"
    // InternalProgram.g:9991:1: rule__Meeting__CancelledAssignment_4 : ( ( 'cancelled' ) ) ;
    public final void rule__Meeting__CancelledAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:9995:1: ( ( ( 'cancelled' ) ) )
            // InternalProgram.g:9996:2: ( ( 'cancelled' ) )
            {
            // InternalProgram.g:9996:2: ( ( 'cancelled' ) )
            // InternalProgram.g:9997:3: ( 'cancelled' )
            {
             before(grammarAccess.getMeetingAccess().getCancelledCancelledKeyword_4_0()); 
            // InternalProgram.g:9998:3: ( 'cancelled' )
            // InternalProgram.g:9999:4: 'cancelled'
            {
             before(grammarAccess.getMeetingAccess().getCancelledCancelledKeyword_4_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getMeetingAccess().getCancelledCancelledKeyword_4_0()); 

            }

             after(grammarAccess.getMeetingAccess().getCancelledCancelledKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Meeting__CancelledAssignment_4"


    // $ANTLR start "rule__Opening__NameAssignment_1"
    // InternalProgram.g:10010:1: rule__Opening__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Opening__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:10014:1: ( ( RULE_STRING ) )
            // InternalProgram.g:10015:2: ( RULE_STRING )
            {
            // InternalProgram.g:10015:2: ( RULE_STRING )
            // InternalProgram.g:10016:3: RULE_STRING
            {
             before(grammarAccess.getOpeningAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOpeningAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:10025:1: rule__Opening__AbstractAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Opening__AbstractAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:10029:1: ( ( RULE_STRING ) )
            // InternalProgram.g:10030:2: ( RULE_STRING )
            {
            // InternalProgram.g:10030:2: ( RULE_STRING )
            // InternalProgram.g:10031:3: RULE_STRING
            {
             before(grammarAccess.getOpeningAccess().getAbstractSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOpeningAccess().getAbstractSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Opening__CancelledAssignment_3"
    // InternalProgram.g:10040:1: rule__Opening__CancelledAssignment_3 : ( ( 'cancelled' ) ) ;
    public final void rule__Opening__CancelledAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:10044:1: ( ( ( 'cancelled' ) ) )
            // InternalProgram.g:10045:2: ( ( 'cancelled' ) )
            {
            // InternalProgram.g:10045:2: ( ( 'cancelled' ) )
            // InternalProgram.g:10046:3: ( 'cancelled' )
            {
             before(grammarAccess.getOpeningAccess().getCancelledCancelledKeyword_3_0()); 
            // InternalProgram.g:10047:3: ( 'cancelled' )
            // InternalProgram.g:10048:4: 'cancelled'
            {
             before(grammarAccess.getOpeningAccess().getCancelledCancelledKeyword_3_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getOpeningAccess().getCancelledCancelledKeyword_3_0()); 

            }

             after(grammarAccess.getOpeningAccess().getCancelledCancelledKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Opening__CancelledAssignment_3"


    // $ANTLR start "rule__Paper__NameAssignment_1"
    // InternalProgram.g:10059:1: rule__Paper__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Paper__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:10063:1: ( ( RULE_STRING ) )
            // InternalProgram.g:10064:2: ( RULE_STRING )
            {
            // InternalProgram.g:10064:2: ( RULE_STRING )
            // InternalProgram.g:10065:3: RULE_STRING
            {
             before(grammarAccess.getPaperAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPaperAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:10074:1: rule__Paper__AuthorsAssignment_3 : ( rulePerson ) ;
    public final void rule__Paper__AuthorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:10078:1: ( ( rulePerson ) )
            // InternalProgram.g:10079:2: ( rulePerson )
            {
            // InternalProgram.g:10079:2: ( rulePerson )
            // InternalProgram.g:10080:3: rulePerson
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
    // InternalProgram.g:10089:1: rule__Paper__AuthorsAssignment_4_1 : ( rulePerson ) ;
    public final void rule__Paper__AuthorsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:10093:1: ( ( rulePerson ) )
            // InternalProgram.g:10094:2: ( rulePerson )
            {
            // InternalProgram.g:10094:2: ( rulePerson )
            // InternalProgram.g:10095:3: rulePerson
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
    // InternalProgram.g:10104:1: rule__Paper__AbstractAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Paper__AbstractAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:10108:1: ( ( RULE_STRING ) )
            // InternalProgram.g:10109:2: ( RULE_STRING )
            {
            // InternalProgram.g:10109:2: ( RULE_STRING )
            // InternalProgram.g:10110:3: RULE_STRING
            {
             before(grammarAccess.getPaperAccess().getAbstractSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPaperAccess().getAbstractSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:10119:1: rule__Paper__PreprintAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__Paper__PreprintAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:10123:1: ( ( RULE_STRING ) )
            // InternalProgram.g:10124:2: ( RULE_STRING )
            {
            // InternalProgram.g:10124:2: ( RULE_STRING )
            // InternalProgram.g:10125:3: RULE_STRING
            {
             before(grammarAccess.getPaperAccess().getPreprintSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPaperAccess().getPreprintSTRINGTerminalRuleCall_6_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:10134:1: rule__Paper__KindAssignment_7_1 : ( ( RULE_STRING ) ) ;
    public final void rule__Paper__KindAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:10138:1: ( ( ( RULE_STRING ) ) )
            // InternalProgram.g:10139:2: ( ( RULE_STRING ) )
            {
            // InternalProgram.g:10139:2: ( ( RULE_STRING ) )
            // InternalProgram.g:10140:3: ( RULE_STRING )
            {
             before(grammarAccess.getPaperAccess().getKindKindCrossReference_7_1_0()); 
            // InternalProgram.g:10141:3: ( RULE_STRING )
            // InternalProgram.g:10142:4: RULE_STRING
            {
             before(grammarAccess.getPaperAccess().getKindKindSTRINGTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPaperAccess().getKindKindSTRINGTerminalRuleCall_7_1_0_1()); 

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


    // $ANTLR start "rule__Paper__ProceedingsAssignment_8_1"
    // InternalProgram.g:10153:1: rule__Paper__ProceedingsAssignment_8_1 : ( RULE_STRING ) ;
    public final void rule__Paper__ProceedingsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:10157:1: ( ( RULE_STRING ) )
            // InternalProgram.g:10158:2: ( RULE_STRING )
            {
            // InternalProgram.g:10158:2: ( RULE_STRING )
            // InternalProgram.g:10159:3: RULE_STRING
            {
             before(grammarAccess.getPaperAccess().getProceedingsSTRINGTerminalRuleCall_8_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPaperAccess().getProceedingsSTRINGTerminalRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__ProceedingsAssignment_8_1"


    // $ANTLR start "rule__Paper__CancelledAssignment_9"
    // InternalProgram.g:10168:1: rule__Paper__CancelledAssignment_9 : ( ( 'cancelled' ) ) ;
    public final void rule__Paper__CancelledAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:10172:1: ( ( ( 'cancelled' ) ) )
            // InternalProgram.g:10173:2: ( ( 'cancelled' ) )
            {
            // InternalProgram.g:10173:2: ( ( 'cancelled' ) )
            // InternalProgram.g:10174:3: ( 'cancelled' )
            {
             before(grammarAccess.getPaperAccess().getCancelledCancelledKeyword_9_0()); 
            // InternalProgram.g:10175:3: ( 'cancelled' )
            // InternalProgram.g:10176:4: 'cancelled'
            {
             before(grammarAccess.getPaperAccess().getCancelledCancelledKeyword_9_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getPaperAccess().getCancelledCancelledKeyword_9_0()); 

            }

             after(grammarAccess.getPaperAccess().getCancelledCancelledKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paper__CancelledAssignment_9"


    // $ANTLR start "rule__Person__NameAssignment_1"
    // InternalProgram.g:10187:1: rule__Person__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Person__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:10191:1: ( ( RULE_STRING ) )
            // InternalProgram.g:10192:2: ( RULE_STRING )
            {
            // InternalProgram.g:10192:2: ( RULE_STRING )
            // InternalProgram.g:10193:3: RULE_STRING
            {
             before(grammarAccess.getPersonAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:10202:1: rule__Person__EmailAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Person__EmailAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:10206:1: ( ( RULE_STRING ) )
            // InternalProgram.g:10207:2: ( RULE_STRING )
            {
            // InternalProgram.g:10207:2: ( RULE_STRING )
            // InternalProgram.g:10208:3: RULE_STRING
            {
             before(grammarAccess.getPersonAccess().getEmailSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getEmailSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:10217:1: rule__Person__HomepageAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Person__HomepageAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:10221:1: ( ( RULE_STRING ) )
            // InternalProgram.g:10222:2: ( RULE_STRING )
            {
            // InternalProgram.g:10222:2: ( RULE_STRING )
            // InternalProgram.g:10223:3: RULE_STRING
            {
             before(grammarAccess.getPersonAccess().getHomepageSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getHomepageSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
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
    // InternalProgram.g:10232:1: rule__Kind__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Kind__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:10236:1: ( ( RULE_STRING ) )
            // InternalProgram.g:10237:2: ( RULE_STRING )
            {
            // InternalProgram.g:10237:2: ( RULE_STRING )
            // InternalProgram.g:10238:3: RULE_STRING
            {
             before(grammarAccess.getKindAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getKindAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x17F9B49000000000L});
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
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000034000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000084000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000406000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0006084000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0004004000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0004084000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0800004000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0xC000004000200000L,0x0000000000000009L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});

}