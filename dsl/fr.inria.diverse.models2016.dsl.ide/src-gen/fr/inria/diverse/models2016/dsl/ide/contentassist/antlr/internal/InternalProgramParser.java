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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Monday'", "'Tuesday'", "'Wednesday'", "'Thursday'", "'Friday'", "'Saturday'", "'Sunday'", "'PracticeAndInnovation'", "'Research'", "'Conference'", "'{'", "'}'", "'ressources'", "','", "'events'", "'program'", "'Program'", "'days'", "'Room'", "'capacity'", "'-'", "'Day'", "'weekday'", "'date'", "'sessions'", "'.'", "':'", "'Session'", "'startingTime'", "'endingTime'", "'('", "')'", "'room'", "'TalkSession'", "'title'", "'abstract'", "'papers'", "'chair'", "'Panel'", "'panelists'", "'moderators'", "'Workshop'", "'url'", "'id'", "'organizers'", "'Tutorial'", "'DoctoralSymposium'", "'EducatorSymposium'", "'Reception'", "'Clinic'", "'Lunch'", "'Talk'", "'preprint'", "'kind'", "'authors'", "'Person'", "'email'", "'homepage'"
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


    // $ANTLR start "entryRuleRessource"
    // InternalProgram.g:78:1: entryRuleRessource : ruleRessource EOF ;
    public final void entryRuleRessource() throws RecognitionException {
        try {
            // InternalProgram.g:79:1: ( ruleRessource EOF )
            // InternalProgram.g:80:1: ruleRessource EOF
            {
             before(grammarAccess.getRessourceRule()); 
            pushFollow(FOLLOW_1);
            ruleRessource();

            state._fsp--;

             after(grammarAccess.getRessourceRule()); 
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
    // $ANTLR end "entryRuleRessource"


    // $ANTLR start "ruleRessource"
    // InternalProgram.g:87:1: ruleRessource : ( ruleRoom ) ;
    public final void ruleRessource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:91:2: ( ( ruleRoom ) )
            // InternalProgram.g:92:2: ( ruleRoom )
            {
            // InternalProgram.g:92:2: ( ruleRoom )
            // InternalProgram.g:93:3: ruleRoom
            {
             before(grammarAccess.getRessourceAccess().getRoomParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getRessourceAccess().getRoomParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRessource"


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
    // InternalProgram.g:212:1: ruleEIntegerObject : ( ( rule__EIntegerObject__Group__0 ) ) ;
    public final void ruleEIntegerObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:216:2: ( ( ( rule__EIntegerObject__Group__0 ) ) )
            // InternalProgram.g:217:2: ( ( rule__EIntegerObject__Group__0 ) )
            {
            // InternalProgram.g:217:2: ( ( rule__EIntegerObject__Group__0 ) )
            // InternalProgram.g:218:3: ( rule__EIntegerObject__Group__0 )
            {
             before(grammarAccess.getEIntegerObjectAccess().getGroup()); 
            // InternalProgram.g:219:3: ( rule__EIntegerObject__Group__0 )
            // InternalProgram.g:219:4: rule__EIntegerObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EIntegerObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntegerObjectAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleEDate"
    // InternalProgram.g:253:1: entryRuleEDate : ruleEDate EOF ;
    public final void entryRuleEDate() throws RecognitionException {
        try {
            // InternalProgram.g:254:1: ( ruleEDate EOF )
            // InternalProgram.g:255:1: ruleEDate EOF
            {
             before(grammarAccess.getEDateRule()); 
            pushFollow(FOLLOW_1);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getEDateRule()); 
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
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // InternalProgram.g:262:1: ruleEDate : ( ( rule__EDate__Alternatives ) ) ;
    public final void ruleEDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:266:2: ( ( ( rule__EDate__Alternatives ) ) )
            // InternalProgram.g:267:2: ( ( rule__EDate__Alternatives ) )
            {
            // InternalProgram.g:267:2: ( ( rule__EDate__Alternatives ) )
            // InternalProgram.g:268:3: ( rule__EDate__Alternatives )
            {
             before(grammarAccess.getEDateAccess().getAlternatives()); 
            // InternalProgram.g:269:3: ( rule__EDate__Alternatives )
            // InternalProgram.g:269:4: rule__EDate__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EDate__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEDateAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDate"


    // $ANTLR start "entryRuleSession"
    // InternalProgram.g:278:1: entryRuleSession : ruleSession EOF ;
    public final void entryRuleSession() throws RecognitionException {
        try {
            // InternalProgram.g:279:1: ( ruleSession EOF )
            // InternalProgram.g:280:1: ruleSession EOF
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
    // InternalProgram.g:287:1: ruleSession : ( ( rule__Session__Group__0 ) ) ;
    public final void ruleSession() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:291:2: ( ( ( rule__Session__Group__0 ) ) )
            // InternalProgram.g:292:2: ( ( rule__Session__Group__0 ) )
            {
            // InternalProgram.g:292:2: ( ( rule__Session__Group__0 ) )
            // InternalProgram.g:293:3: ( rule__Session__Group__0 )
            {
             before(grammarAccess.getSessionAccess().getGroup()); 
            // InternalProgram.g:294:3: ( rule__Session__Group__0 )
            // InternalProgram.g:294:4: rule__Session__Group__0
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
    // InternalProgram.g:303:1: entryRuleTalkSession : ruleTalkSession EOF ;
    public final void entryRuleTalkSession() throws RecognitionException {
        try {
            // InternalProgram.g:304:1: ( ruleTalkSession EOF )
            // InternalProgram.g:305:1: ruleTalkSession EOF
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
    // InternalProgram.g:312:1: ruleTalkSession : ( ( rule__TalkSession__Group__0 ) ) ;
    public final void ruleTalkSession() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:316:2: ( ( ( rule__TalkSession__Group__0 ) ) )
            // InternalProgram.g:317:2: ( ( rule__TalkSession__Group__0 ) )
            {
            // InternalProgram.g:317:2: ( ( rule__TalkSession__Group__0 ) )
            // InternalProgram.g:318:3: ( rule__TalkSession__Group__0 )
            {
             before(grammarAccess.getTalkSessionAccess().getGroup()); 
            // InternalProgram.g:319:3: ( rule__TalkSession__Group__0 )
            // InternalProgram.g:319:4: rule__TalkSession__Group__0
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
    // InternalProgram.g:328:1: entryRulePanel : rulePanel EOF ;
    public final void entryRulePanel() throws RecognitionException {
        try {
            // InternalProgram.g:329:1: ( rulePanel EOF )
            // InternalProgram.g:330:1: rulePanel EOF
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
    // InternalProgram.g:337:1: rulePanel : ( ( rule__Panel__Group__0 ) ) ;
    public final void rulePanel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:341:2: ( ( ( rule__Panel__Group__0 ) ) )
            // InternalProgram.g:342:2: ( ( rule__Panel__Group__0 ) )
            {
            // InternalProgram.g:342:2: ( ( rule__Panel__Group__0 ) )
            // InternalProgram.g:343:3: ( rule__Panel__Group__0 )
            {
             before(grammarAccess.getPanelAccess().getGroup()); 
            // InternalProgram.g:344:3: ( rule__Panel__Group__0 )
            // InternalProgram.g:344:4: rule__Panel__Group__0
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
    // InternalProgram.g:353:1: entryRuleWorkshop : ruleWorkshop EOF ;
    public final void entryRuleWorkshop() throws RecognitionException {
        try {
            // InternalProgram.g:354:1: ( ruleWorkshop EOF )
            // InternalProgram.g:355:1: ruleWorkshop EOF
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
    // InternalProgram.g:362:1: ruleWorkshop : ( ( rule__Workshop__Group__0 ) ) ;
    public final void ruleWorkshop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:366:2: ( ( ( rule__Workshop__Group__0 ) ) )
            // InternalProgram.g:367:2: ( ( rule__Workshop__Group__0 ) )
            {
            // InternalProgram.g:367:2: ( ( rule__Workshop__Group__0 ) )
            // InternalProgram.g:368:3: ( rule__Workshop__Group__0 )
            {
             before(grammarAccess.getWorkshopAccess().getGroup()); 
            // InternalProgram.g:369:3: ( rule__Workshop__Group__0 )
            // InternalProgram.g:369:4: rule__Workshop__Group__0
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
    // InternalProgram.g:378:1: entryRuleTutorial : ruleTutorial EOF ;
    public final void entryRuleTutorial() throws RecognitionException {
        try {
            // InternalProgram.g:379:1: ( ruleTutorial EOF )
            // InternalProgram.g:380:1: ruleTutorial EOF
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
    // InternalProgram.g:387:1: ruleTutorial : ( ( rule__Tutorial__Group__0 ) ) ;
    public final void ruleTutorial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:391:2: ( ( ( rule__Tutorial__Group__0 ) ) )
            // InternalProgram.g:392:2: ( ( rule__Tutorial__Group__0 ) )
            {
            // InternalProgram.g:392:2: ( ( rule__Tutorial__Group__0 ) )
            // InternalProgram.g:393:3: ( rule__Tutorial__Group__0 )
            {
             before(grammarAccess.getTutorialAccess().getGroup()); 
            // InternalProgram.g:394:3: ( rule__Tutorial__Group__0 )
            // InternalProgram.g:394:4: rule__Tutorial__Group__0
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
    // InternalProgram.g:403:1: entryRuleDoctoralSymposium : ruleDoctoralSymposium EOF ;
    public final void entryRuleDoctoralSymposium() throws RecognitionException {
        try {
            // InternalProgram.g:404:1: ( ruleDoctoralSymposium EOF )
            // InternalProgram.g:405:1: ruleDoctoralSymposium EOF
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
    // InternalProgram.g:412:1: ruleDoctoralSymposium : ( ( rule__DoctoralSymposium__Group__0 ) ) ;
    public final void ruleDoctoralSymposium() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:416:2: ( ( ( rule__DoctoralSymposium__Group__0 ) ) )
            // InternalProgram.g:417:2: ( ( rule__DoctoralSymposium__Group__0 ) )
            {
            // InternalProgram.g:417:2: ( ( rule__DoctoralSymposium__Group__0 ) )
            // InternalProgram.g:418:3: ( rule__DoctoralSymposium__Group__0 )
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getGroup()); 
            // InternalProgram.g:419:3: ( rule__DoctoralSymposium__Group__0 )
            // InternalProgram.g:419:4: rule__DoctoralSymposium__Group__0
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
    // InternalProgram.g:428:1: entryRuleEducatorSymposium : ruleEducatorSymposium EOF ;
    public final void entryRuleEducatorSymposium() throws RecognitionException {
        try {
            // InternalProgram.g:429:1: ( ruleEducatorSymposium EOF )
            // InternalProgram.g:430:1: ruleEducatorSymposium EOF
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
    // InternalProgram.g:437:1: ruleEducatorSymposium : ( ( rule__EducatorSymposium__Group__0 ) ) ;
    public final void ruleEducatorSymposium() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:441:2: ( ( ( rule__EducatorSymposium__Group__0 ) ) )
            // InternalProgram.g:442:2: ( ( rule__EducatorSymposium__Group__0 ) )
            {
            // InternalProgram.g:442:2: ( ( rule__EducatorSymposium__Group__0 ) )
            // InternalProgram.g:443:3: ( rule__EducatorSymposium__Group__0 )
            {
             before(grammarAccess.getEducatorSymposiumAccess().getGroup()); 
            // InternalProgram.g:444:3: ( rule__EducatorSymposium__Group__0 )
            // InternalProgram.g:444:4: rule__EducatorSymposium__Group__0
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
    // InternalProgram.g:453:1: entryRuleReception : ruleReception EOF ;
    public final void entryRuleReception() throws RecognitionException {
        try {
            // InternalProgram.g:454:1: ( ruleReception EOF )
            // InternalProgram.g:455:1: ruleReception EOF
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
    // InternalProgram.g:462:1: ruleReception : ( ( rule__Reception__Group__0 ) ) ;
    public final void ruleReception() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:466:2: ( ( ( rule__Reception__Group__0 ) ) )
            // InternalProgram.g:467:2: ( ( rule__Reception__Group__0 ) )
            {
            // InternalProgram.g:467:2: ( ( rule__Reception__Group__0 ) )
            // InternalProgram.g:468:3: ( rule__Reception__Group__0 )
            {
             before(grammarAccess.getReceptionAccess().getGroup()); 
            // InternalProgram.g:469:3: ( rule__Reception__Group__0 )
            // InternalProgram.g:469:4: rule__Reception__Group__0
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
    // InternalProgram.g:478:1: entryRuleClinic : ruleClinic EOF ;
    public final void entryRuleClinic() throws RecognitionException {
        try {
            // InternalProgram.g:479:1: ( ruleClinic EOF )
            // InternalProgram.g:480:1: ruleClinic EOF
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
    // InternalProgram.g:487:1: ruleClinic : ( ( rule__Clinic__Group__0 ) ) ;
    public final void ruleClinic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:491:2: ( ( ( rule__Clinic__Group__0 ) ) )
            // InternalProgram.g:492:2: ( ( rule__Clinic__Group__0 ) )
            {
            // InternalProgram.g:492:2: ( ( rule__Clinic__Group__0 ) )
            // InternalProgram.g:493:3: ( rule__Clinic__Group__0 )
            {
             before(grammarAccess.getClinicAccess().getGroup()); 
            // InternalProgram.g:494:3: ( rule__Clinic__Group__0 )
            // InternalProgram.g:494:4: rule__Clinic__Group__0
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
    // InternalProgram.g:503:1: entryRuleLunch : ruleLunch EOF ;
    public final void entryRuleLunch() throws RecognitionException {
        try {
            // InternalProgram.g:504:1: ( ruleLunch EOF )
            // InternalProgram.g:505:1: ruleLunch EOF
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
    // InternalProgram.g:512:1: ruleLunch : ( ( rule__Lunch__Group__0 ) ) ;
    public final void ruleLunch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:516:2: ( ( ( rule__Lunch__Group__0 ) ) )
            // InternalProgram.g:517:2: ( ( rule__Lunch__Group__0 ) )
            {
            // InternalProgram.g:517:2: ( ( rule__Lunch__Group__0 ) )
            // InternalProgram.g:518:3: ( rule__Lunch__Group__0 )
            {
             before(grammarAccess.getLunchAccess().getGroup()); 
            // InternalProgram.g:519:3: ( rule__Lunch__Group__0 )
            // InternalProgram.g:519:4: rule__Lunch__Group__0
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


    // $ANTLR start "entryRuleTalk"
    // InternalProgram.g:528:1: entryRuleTalk : ruleTalk EOF ;
    public final void entryRuleTalk() throws RecognitionException {
        try {
            // InternalProgram.g:529:1: ( ruleTalk EOF )
            // InternalProgram.g:530:1: ruleTalk EOF
            {
             before(grammarAccess.getTalkRule()); 
            pushFollow(FOLLOW_1);
            ruleTalk();

            state._fsp--;

             after(grammarAccess.getTalkRule()); 
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
    // $ANTLR end "entryRuleTalk"


    // $ANTLR start "ruleTalk"
    // InternalProgram.g:537:1: ruleTalk : ( ( rule__Talk__Group__0 ) ) ;
    public final void ruleTalk() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:541:2: ( ( ( rule__Talk__Group__0 ) ) )
            // InternalProgram.g:542:2: ( ( rule__Talk__Group__0 ) )
            {
            // InternalProgram.g:542:2: ( ( rule__Talk__Group__0 ) )
            // InternalProgram.g:543:3: ( rule__Talk__Group__0 )
            {
             before(grammarAccess.getTalkAccess().getGroup()); 
            // InternalProgram.g:544:3: ( rule__Talk__Group__0 )
            // InternalProgram.g:544:4: rule__Talk__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Talk__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTalk"


    // $ANTLR start "entryRulePerson"
    // InternalProgram.g:553:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalProgram.g:554:1: ( rulePerson EOF )
            // InternalProgram.g:555:1: rulePerson EOF
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
    // InternalProgram.g:562:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:566:2: ( ( ( rule__Person__Group__0 ) ) )
            // InternalProgram.g:567:2: ( ( rule__Person__Group__0 ) )
            {
            // InternalProgram.g:567:2: ( ( rule__Person__Group__0 ) )
            // InternalProgram.g:568:3: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // InternalProgram.g:569:3: ( rule__Person__Group__0 )
            // InternalProgram.g:569:4: rule__Person__Group__0
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
    // InternalProgram.g:578:1: ruleWeekDay : ( ( rule__WeekDay__Alternatives ) ) ;
    public final void ruleWeekDay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:582:1: ( ( ( rule__WeekDay__Alternatives ) ) )
            // InternalProgram.g:583:2: ( ( rule__WeekDay__Alternatives ) )
            {
            // InternalProgram.g:583:2: ( ( rule__WeekDay__Alternatives ) )
            // InternalProgram.g:584:3: ( rule__WeekDay__Alternatives )
            {
             before(grammarAccess.getWeekDayAccess().getAlternatives()); 
            // InternalProgram.g:585:3: ( rule__WeekDay__Alternatives )
            // InternalProgram.g:585:4: rule__WeekDay__Alternatives
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
    // InternalProgram.g:594:1: ruleTrack : ( ( rule__Track__Alternatives ) ) ;
    public final void ruleTrack() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:598:1: ( ( ( rule__Track__Alternatives ) ) )
            // InternalProgram.g:599:2: ( ( rule__Track__Alternatives ) )
            {
            // InternalProgram.g:599:2: ( ( rule__Track__Alternatives ) )
            // InternalProgram.g:600:3: ( rule__Track__Alternatives )
            {
             before(grammarAccess.getTrackAccess().getAlternatives()); 
            // InternalProgram.g:601:3: ( rule__Track__Alternatives )
            // InternalProgram.g:601:4: rule__Track__Alternatives
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
    // InternalProgram.g:609:1: rule__Event__Alternatives : ( ( ruleTalkSession ) | ( rulePanel ) | ( ruleWorkshop ) | ( ruleTutorial ) | ( ruleDoctoralSymposium ) | ( ruleEducatorSymposium ) | ( ruleReception ) | ( ruleClinic ) | ( ruleLunch ) );
    public final void rule__Event__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:613:1: ( ( ruleTalkSession ) | ( rulePanel ) | ( ruleWorkshop ) | ( ruleTutorial ) | ( ruleDoctoralSymposium ) | ( ruleEducatorSymposium ) | ( ruleReception ) | ( ruleClinic ) | ( ruleLunch ) )
            int alt1=9;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt1=1;
                }
                break;
            case 49:
                {
                alt1=2;
                }
                break;
            case 52:
                {
                alt1=3;
                }
                break;
            case 56:
                {
                alt1=4;
                }
                break;
            case 57:
                {
                alt1=5;
                }
                break;
            case 58:
                {
                alt1=6;
                }
                break;
            case 59:
                {
                alt1=7;
                }
                break;
            case 60:
                {
                alt1=8;
                }
                break;
            case 61:
                {
                alt1=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalProgram.g:614:2: ( ruleTalkSession )
                    {
                    // InternalProgram.g:614:2: ( ruleTalkSession )
                    // InternalProgram.g:615:3: ruleTalkSession
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
                    // InternalProgram.g:620:2: ( rulePanel )
                    {
                    // InternalProgram.g:620:2: ( rulePanel )
                    // InternalProgram.g:621:3: rulePanel
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
                    // InternalProgram.g:626:2: ( ruleWorkshop )
                    {
                    // InternalProgram.g:626:2: ( ruleWorkshop )
                    // InternalProgram.g:627:3: ruleWorkshop
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
                    // InternalProgram.g:632:2: ( ruleTutorial )
                    {
                    // InternalProgram.g:632:2: ( ruleTutorial )
                    // InternalProgram.g:633:3: ruleTutorial
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
                    // InternalProgram.g:638:2: ( ruleDoctoralSymposium )
                    {
                    // InternalProgram.g:638:2: ( ruleDoctoralSymposium )
                    // InternalProgram.g:639:3: ruleDoctoralSymposium
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
                    // InternalProgram.g:644:2: ( ruleEducatorSymposium )
                    {
                    // InternalProgram.g:644:2: ( ruleEducatorSymposium )
                    // InternalProgram.g:645:3: ruleEducatorSymposium
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
                    // InternalProgram.g:650:2: ( ruleReception )
                    {
                    // InternalProgram.g:650:2: ( ruleReception )
                    // InternalProgram.g:651:3: ruleReception
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
                    // InternalProgram.g:656:2: ( ruleClinic )
                    {
                    // InternalProgram.g:656:2: ( ruleClinic )
                    // InternalProgram.g:657:3: ruleClinic
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
                    // InternalProgram.g:662:2: ( ruleLunch )
                    {
                    // InternalProgram.g:662:2: ( ruleLunch )
                    // InternalProgram.g:663:3: ruleLunch
                    {
                     before(grammarAccess.getEventAccess().getLunchParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleLunch();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getLunchParserRuleCall_8()); 

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


    // $ANTLR start "rule__EDate__Alternatives"
    // InternalProgram.g:672:1: rule__EDate__Alternatives : ( ( ( rule__EDate__Group_0__0 ) ) | ( ( rule__EDate__Group_1__0 ) ) );
    public final void rule__EDate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:676:1: ( ( ( rule__EDate__Group_0__0 ) ) | ( ( rule__EDate__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==37) ) {
                    alt2=2;
                }
                else if ( (LA2_1==36) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalProgram.g:677:2: ( ( rule__EDate__Group_0__0 ) )
                    {
                    // InternalProgram.g:677:2: ( ( rule__EDate__Group_0__0 ) )
                    // InternalProgram.g:678:3: ( rule__EDate__Group_0__0 )
                    {
                     before(grammarAccess.getEDateAccess().getGroup_0()); 
                    // InternalProgram.g:679:3: ( rule__EDate__Group_0__0 )
                    // InternalProgram.g:679:4: rule__EDate__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDate__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEDateAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProgram.g:683:2: ( ( rule__EDate__Group_1__0 ) )
                    {
                    // InternalProgram.g:683:2: ( ( rule__EDate__Group_1__0 ) )
                    // InternalProgram.g:684:3: ( rule__EDate__Group_1__0 )
                    {
                     before(grammarAccess.getEDateAccess().getGroup_1()); 
                    // InternalProgram.g:685:3: ( rule__EDate__Group_1__0 )
                    // InternalProgram.g:685:4: rule__EDate__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDate__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEDateAccess().getGroup_1()); 

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
    // $ANTLR end "rule__EDate__Alternatives"


    // $ANTLR start "rule__WeekDay__Alternatives"
    // InternalProgram.g:693:1: rule__WeekDay__Alternatives : ( ( ( 'Monday' ) ) | ( ( 'Tuesday' ) ) | ( ( 'Wednesday' ) ) | ( ( 'Thursday' ) ) | ( ( 'Friday' ) ) | ( ( 'Saturday' ) ) | ( ( 'Sunday' ) ) );
    public final void rule__WeekDay__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:697:1: ( ( ( 'Monday' ) ) | ( ( 'Tuesday' ) ) | ( ( 'Wednesday' ) ) | ( ( 'Thursday' ) ) | ( ( 'Friday' ) ) | ( ( 'Saturday' ) ) | ( ( 'Sunday' ) ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case 17:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalProgram.g:698:2: ( ( 'Monday' ) )
                    {
                    // InternalProgram.g:698:2: ( ( 'Monday' ) )
                    // InternalProgram.g:699:3: ( 'Monday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getMondayEnumLiteralDeclaration_0()); 
                    // InternalProgram.g:700:3: ( 'Monday' )
                    // InternalProgram.g:700:4: 'Monday'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getMondayEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProgram.g:704:2: ( ( 'Tuesday' ) )
                    {
                    // InternalProgram.g:704:2: ( ( 'Tuesday' ) )
                    // InternalProgram.g:705:3: ( 'Tuesday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getTuesdayEnumLiteralDeclaration_1()); 
                    // InternalProgram.g:706:3: ( 'Tuesday' )
                    // InternalProgram.g:706:4: 'Tuesday'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getTuesdayEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProgram.g:710:2: ( ( 'Wednesday' ) )
                    {
                    // InternalProgram.g:710:2: ( ( 'Wednesday' ) )
                    // InternalProgram.g:711:3: ( 'Wednesday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getWednesdayEnumLiteralDeclaration_2()); 
                    // InternalProgram.g:712:3: ( 'Wednesday' )
                    // InternalProgram.g:712:4: 'Wednesday'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getWednesdayEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalProgram.g:716:2: ( ( 'Thursday' ) )
                    {
                    // InternalProgram.g:716:2: ( ( 'Thursday' ) )
                    // InternalProgram.g:717:3: ( 'Thursday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getThursdayEnumLiteralDeclaration_3()); 
                    // InternalProgram.g:718:3: ( 'Thursday' )
                    // InternalProgram.g:718:4: 'Thursday'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getThursdayEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalProgram.g:722:2: ( ( 'Friday' ) )
                    {
                    // InternalProgram.g:722:2: ( ( 'Friday' ) )
                    // InternalProgram.g:723:3: ( 'Friday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getFridayEnumLiteralDeclaration_4()); 
                    // InternalProgram.g:724:3: ( 'Friday' )
                    // InternalProgram.g:724:4: 'Friday'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getFridayEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalProgram.g:728:2: ( ( 'Saturday' ) )
                    {
                    // InternalProgram.g:728:2: ( ( 'Saturday' ) )
                    // InternalProgram.g:729:3: ( 'Saturday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getSaturdayEnumLiteralDeclaration_5()); 
                    // InternalProgram.g:730:3: ( 'Saturday' )
                    // InternalProgram.g:730:4: 'Saturday'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getSaturdayEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalProgram.g:734:2: ( ( 'Sunday' ) )
                    {
                    // InternalProgram.g:734:2: ( ( 'Sunday' ) )
                    // InternalProgram.g:735:3: ( 'Sunday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getSundayEnumLiteralDeclaration_6()); 
                    // InternalProgram.g:736:3: ( 'Sunday' )
                    // InternalProgram.g:736:4: 'Sunday'
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
    // InternalProgram.g:744:1: rule__Track__Alternatives : ( ( ( 'PracticeAndInnovation' ) ) | ( ( 'Research' ) ) );
    public final void rule__Track__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:748:1: ( ( ( 'PracticeAndInnovation' ) ) | ( ( 'Research' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalProgram.g:749:2: ( ( 'PracticeAndInnovation' ) )
                    {
                    // InternalProgram.g:749:2: ( ( 'PracticeAndInnovation' ) )
                    // InternalProgram.g:750:3: ( 'PracticeAndInnovation' )
                    {
                     before(grammarAccess.getTrackAccess().getPracticeAndInnovationEnumLiteralDeclaration_0()); 
                    // InternalProgram.g:751:3: ( 'PracticeAndInnovation' )
                    // InternalProgram.g:751:4: 'PracticeAndInnovation'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTrackAccess().getPracticeAndInnovationEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProgram.g:755:2: ( ( 'Research' ) )
                    {
                    // InternalProgram.g:755:2: ( ( 'Research' ) )
                    // InternalProgram.g:756:3: ( 'Research' )
                    {
                     before(grammarAccess.getTrackAccess().getResearchEnumLiteralDeclaration_1()); 
                    // InternalProgram.g:757:3: ( 'Research' )
                    // InternalProgram.g:757:4: 'Research'
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
    // InternalProgram.g:765:1: rule__Conference__Group__0 : rule__Conference__Group__0__Impl rule__Conference__Group__1 ;
    public final void rule__Conference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:769:1: ( rule__Conference__Group__0__Impl rule__Conference__Group__1 )
            // InternalProgram.g:770:2: rule__Conference__Group__0__Impl rule__Conference__Group__1
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
    // InternalProgram.g:777:1: rule__Conference__Group__0__Impl : ( () ) ;
    public final void rule__Conference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:781:1: ( ( () ) )
            // InternalProgram.g:782:1: ( () )
            {
            // InternalProgram.g:782:1: ( () )
            // InternalProgram.g:783:2: ()
            {
             before(grammarAccess.getConferenceAccess().getConferenceAction_0()); 
            // InternalProgram.g:784:2: ()
            // InternalProgram.g:784:3: 
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
    // InternalProgram.g:792:1: rule__Conference__Group__1 : rule__Conference__Group__1__Impl rule__Conference__Group__2 ;
    public final void rule__Conference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:796:1: ( rule__Conference__Group__1__Impl rule__Conference__Group__2 )
            // InternalProgram.g:797:2: rule__Conference__Group__1__Impl rule__Conference__Group__2
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
    // InternalProgram.g:804:1: rule__Conference__Group__1__Impl : ( 'Conference' ) ;
    public final void rule__Conference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:808:1: ( ( 'Conference' ) )
            // InternalProgram.g:809:1: ( 'Conference' )
            {
            // InternalProgram.g:809:1: ( 'Conference' )
            // InternalProgram.g:810:2: 'Conference'
            {
             before(grammarAccess.getConferenceAccess().getConferenceKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalProgram.g:819:1: rule__Conference__Group__2 : rule__Conference__Group__2__Impl rule__Conference__Group__3 ;
    public final void rule__Conference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:823:1: ( rule__Conference__Group__2__Impl rule__Conference__Group__3 )
            // InternalProgram.g:824:2: rule__Conference__Group__2__Impl rule__Conference__Group__3
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
    // InternalProgram.g:831:1: rule__Conference__Group__2__Impl : ( ( rule__Conference__NameAssignment_2 ) ) ;
    public final void rule__Conference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:835:1: ( ( ( rule__Conference__NameAssignment_2 ) ) )
            // InternalProgram.g:836:1: ( ( rule__Conference__NameAssignment_2 ) )
            {
            // InternalProgram.g:836:1: ( ( rule__Conference__NameAssignment_2 ) )
            // InternalProgram.g:837:2: ( rule__Conference__NameAssignment_2 )
            {
             before(grammarAccess.getConferenceAccess().getNameAssignment_2()); 
            // InternalProgram.g:838:2: ( rule__Conference__NameAssignment_2 )
            // InternalProgram.g:838:3: rule__Conference__NameAssignment_2
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
    // InternalProgram.g:846:1: rule__Conference__Group__3 : rule__Conference__Group__3__Impl rule__Conference__Group__4 ;
    public final void rule__Conference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:850:1: ( rule__Conference__Group__3__Impl rule__Conference__Group__4 )
            // InternalProgram.g:851:2: rule__Conference__Group__3__Impl rule__Conference__Group__4
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
    // InternalProgram.g:858:1: rule__Conference__Group__3__Impl : ( '{' ) ;
    public final void rule__Conference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:862:1: ( ( '{' ) )
            // InternalProgram.g:863:1: ( '{' )
            {
            // InternalProgram.g:863:1: ( '{' )
            // InternalProgram.g:864:2: '{'
            {
             before(grammarAccess.getConferenceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalProgram.g:873:1: rule__Conference__Group__4 : rule__Conference__Group__4__Impl rule__Conference__Group__5 ;
    public final void rule__Conference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:877:1: ( rule__Conference__Group__4__Impl rule__Conference__Group__5 )
            // InternalProgram.g:878:2: rule__Conference__Group__4__Impl rule__Conference__Group__5
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
    // InternalProgram.g:885:1: rule__Conference__Group__4__Impl : ( ( rule__Conference__Group_4__0 )? ) ;
    public final void rule__Conference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:889:1: ( ( ( rule__Conference__Group_4__0 )? ) )
            // InternalProgram.g:890:1: ( ( rule__Conference__Group_4__0 )? )
            {
            // InternalProgram.g:890:1: ( ( rule__Conference__Group_4__0 )? )
            // InternalProgram.g:891:2: ( rule__Conference__Group_4__0 )?
            {
             before(grammarAccess.getConferenceAccess().getGroup_4()); 
            // InternalProgram.g:892:2: ( rule__Conference__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalProgram.g:892:3: rule__Conference__Group_4__0
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
    // InternalProgram.g:900:1: rule__Conference__Group__5 : rule__Conference__Group__5__Impl rule__Conference__Group__6 ;
    public final void rule__Conference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:904:1: ( rule__Conference__Group__5__Impl rule__Conference__Group__6 )
            // InternalProgram.g:905:2: rule__Conference__Group__5__Impl rule__Conference__Group__6
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
    // InternalProgram.g:912:1: rule__Conference__Group__5__Impl : ( ( rule__Conference__Group_5__0 )? ) ;
    public final void rule__Conference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:916:1: ( ( ( rule__Conference__Group_5__0 )? ) )
            // InternalProgram.g:917:1: ( ( rule__Conference__Group_5__0 )? )
            {
            // InternalProgram.g:917:1: ( ( rule__Conference__Group_5__0 )? )
            // InternalProgram.g:918:2: ( rule__Conference__Group_5__0 )?
            {
             before(grammarAccess.getConferenceAccess().getGroup_5()); 
            // InternalProgram.g:919:2: ( rule__Conference__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalProgram.g:919:3: rule__Conference__Group_5__0
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
    // InternalProgram.g:927:1: rule__Conference__Group__6 : rule__Conference__Group__6__Impl rule__Conference__Group__7 ;
    public final void rule__Conference__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:931:1: ( rule__Conference__Group__6__Impl rule__Conference__Group__7 )
            // InternalProgram.g:932:2: rule__Conference__Group__6__Impl rule__Conference__Group__7
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
    // InternalProgram.g:939:1: rule__Conference__Group__6__Impl : ( ( rule__Conference__Group_6__0 )? ) ;
    public final void rule__Conference__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:943:1: ( ( ( rule__Conference__Group_6__0 )? ) )
            // InternalProgram.g:944:1: ( ( rule__Conference__Group_6__0 )? )
            {
            // InternalProgram.g:944:1: ( ( rule__Conference__Group_6__0 )? )
            // InternalProgram.g:945:2: ( rule__Conference__Group_6__0 )?
            {
             before(grammarAccess.getConferenceAccess().getGroup_6()); 
            // InternalProgram.g:946:2: ( rule__Conference__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalProgram.g:946:3: rule__Conference__Group_6__0
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
    // InternalProgram.g:954:1: rule__Conference__Group__7 : rule__Conference__Group__7__Impl ;
    public final void rule__Conference__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:958:1: ( rule__Conference__Group__7__Impl )
            // InternalProgram.g:959:2: rule__Conference__Group__7__Impl
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
    // InternalProgram.g:965:1: rule__Conference__Group__7__Impl : ( '}' ) ;
    public final void rule__Conference__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:969:1: ( ( '}' ) )
            // InternalProgram.g:970:1: ( '}' )
            {
            // InternalProgram.g:970:1: ( '}' )
            // InternalProgram.g:971:2: '}'
            {
             before(grammarAccess.getConferenceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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
    // InternalProgram.g:981:1: rule__Conference__Group_4__0 : rule__Conference__Group_4__0__Impl rule__Conference__Group_4__1 ;
    public final void rule__Conference__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:985:1: ( rule__Conference__Group_4__0__Impl rule__Conference__Group_4__1 )
            // InternalProgram.g:986:2: rule__Conference__Group_4__0__Impl rule__Conference__Group_4__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalProgram.g:993:1: rule__Conference__Group_4__0__Impl : ( 'ressources' ) ;
    public final void rule__Conference__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:997:1: ( ( 'ressources' ) )
            // InternalProgram.g:998:1: ( 'ressources' )
            {
            // InternalProgram.g:998:1: ( 'ressources' )
            // InternalProgram.g:999:2: 'ressources'
            {
             before(grammarAccess.getConferenceAccess().getRessourcesKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getRessourcesKeyword_4_0()); 

            }


            }

        }
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
    // InternalProgram.g:1008:1: rule__Conference__Group_4__1 : rule__Conference__Group_4__1__Impl rule__Conference__Group_4__2 ;
    public final void rule__Conference__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1012:1: ( rule__Conference__Group_4__1__Impl rule__Conference__Group_4__2 )
            // InternalProgram.g:1013:2: rule__Conference__Group_4__1__Impl rule__Conference__Group_4__2
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
    // InternalProgram.g:1020:1: rule__Conference__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Conference__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1024:1: ( ( '{' ) )
            // InternalProgram.g:1025:1: ( '{' )
            {
            // InternalProgram.g:1025:1: ( '{' )
            // InternalProgram.g:1026:2: '{'
            {
             before(grammarAccess.getConferenceAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
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
    // InternalProgram.g:1035:1: rule__Conference__Group_4__2 : rule__Conference__Group_4__2__Impl rule__Conference__Group_4__3 ;
    public final void rule__Conference__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1039:1: ( rule__Conference__Group_4__2__Impl rule__Conference__Group_4__3 )
            // InternalProgram.g:1040:2: rule__Conference__Group_4__2__Impl rule__Conference__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__Conference__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group_4__3();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:1047:1: rule__Conference__Group_4__2__Impl : ( ( rule__Conference__RessourcesAssignment_4_2 ) ) ;
    public final void rule__Conference__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1051:1: ( ( ( rule__Conference__RessourcesAssignment_4_2 ) ) )
            // InternalProgram.g:1052:1: ( ( rule__Conference__RessourcesAssignment_4_2 ) )
            {
            // InternalProgram.g:1052:1: ( ( rule__Conference__RessourcesAssignment_4_2 ) )
            // InternalProgram.g:1053:2: ( rule__Conference__RessourcesAssignment_4_2 )
            {
             before(grammarAccess.getConferenceAccess().getRessourcesAssignment_4_2()); 
            // InternalProgram.g:1054:2: ( rule__Conference__RessourcesAssignment_4_2 )
            // InternalProgram.g:1054:3: rule__Conference__RessourcesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Conference__RessourcesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getConferenceAccess().getRessourcesAssignment_4_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Conference__Group_4__3"
    // InternalProgram.g:1062:1: rule__Conference__Group_4__3 : rule__Conference__Group_4__3__Impl rule__Conference__Group_4__4 ;
    public final void rule__Conference__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1066:1: ( rule__Conference__Group_4__3__Impl rule__Conference__Group_4__4 )
            // InternalProgram.g:1067:2: rule__Conference__Group_4__3__Impl rule__Conference__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__Conference__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_4__3"


    // $ANTLR start "rule__Conference__Group_4__3__Impl"
    // InternalProgram.g:1074:1: rule__Conference__Group_4__3__Impl : ( ( rule__Conference__Group_4_3__0 )* ) ;
    public final void rule__Conference__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1078:1: ( ( ( rule__Conference__Group_4_3__0 )* ) )
            // InternalProgram.g:1079:1: ( ( rule__Conference__Group_4_3__0 )* )
            {
            // InternalProgram.g:1079:1: ( ( rule__Conference__Group_4_3__0 )* )
            // InternalProgram.g:1080:2: ( rule__Conference__Group_4_3__0 )*
            {
             before(grammarAccess.getConferenceAccess().getGroup_4_3()); 
            // InternalProgram.g:1081:2: ( rule__Conference__Group_4_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalProgram.g:1081:3: rule__Conference__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Conference__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getConferenceAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_4__3__Impl"


    // $ANTLR start "rule__Conference__Group_4__4"
    // InternalProgram.g:1089:1: rule__Conference__Group_4__4 : rule__Conference__Group_4__4__Impl ;
    public final void rule__Conference__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1093:1: ( rule__Conference__Group_4__4__Impl )
            // InternalProgram.g:1094:2: rule__Conference__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conference__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_4__4"


    // $ANTLR start "rule__Conference__Group_4__4__Impl"
    // InternalProgram.g:1100:1: rule__Conference__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Conference__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1104:1: ( ( '}' ) )
            // InternalProgram.g:1105:1: ( '}' )
            {
            // InternalProgram.g:1105:1: ( '}' )
            // InternalProgram.g:1106:2: '}'
            {
             before(grammarAccess.getConferenceAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_4__4__Impl"


    // $ANTLR start "rule__Conference__Group_4_3__0"
    // InternalProgram.g:1116:1: rule__Conference__Group_4_3__0 : rule__Conference__Group_4_3__0__Impl rule__Conference__Group_4_3__1 ;
    public final void rule__Conference__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1120:1: ( rule__Conference__Group_4_3__0__Impl rule__Conference__Group_4_3__1 )
            // InternalProgram.g:1121:2: rule__Conference__Group_4_3__0__Impl rule__Conference__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Conference__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conference__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_4_3__0"


    // $ANTLR start "rule__Conference__Group_4_3__0__Impl"
    // InternalProgram.g:1128:1: rule__Conference__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Conference__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1132:1: ( ( ',' ) )
            // InternalProgram.g:1133:1: ( ',' )
            {
            // InternalProgram.g:1133:1: ( ',' )
            // InternalProgram.g:1134:2: ','
            {
             before(grammarAccess.getConferenceAccess().getCommaKeyword_4_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_4_3__0__Impl"


    // $ANTLR start "rule__Conference__Group_4_3__1"
    // InternalProgram.g:1143:1: rule__Conference__Group_4_3__1 : rule__Conference__Group_4_3__1__Impl ;
    public final void rule__Conference__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1147:1: ( rule__Conference__Group_4_3__1__Impl )
            // InternalProgram.g:1148:2: rule__Conference__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conference__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_4_3__1"


    // $ANTLR start "rule__Conference__Group_4_3__1__Impl"
    // InternalProgram.g:1154:1: rule__Conference__Group_4_3__1__Impl : ( ( rule__Conference__RessourcesAssignment_4_3_1 ) ) ;
    public final void rule__Conference__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1158:1: ( ( ( rule__Conference__RessourcesAssignment_4_3_1 ) ) )
            // InternalProgram.g:1159:1: ( ( rule__Conference__RessourcesAssignment_4_3_1 ) )
            {
            // InternalProgram.g:1159:1: ( ( rule__Conference__RessourcesAssignment_4_3_1 ) )
            // InternalProgram.g:1160:2: ( rule__Conference__RessourcesAssignment_4_3_1 )
            {
             before(grammarAccess.getConferenceAccess().getRessourcesAssignment_4_3_1()); 
            // InternalProgram.g:1161:2: ( rule__Conference__RessourcesAssignment_4_3_1 )
            // InternalProgram.g:1161:3: rule__Conference__RessourcesAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Conference__RessourcesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConferenceAccess().getRessourcesAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__Group_4_3__1__Impl"


    // $ANTLR start "rule__Conference__Group_5__0"
    // InternalProgram.g:1170:1: rule__Conference__Group_5__0 : rule__Conference__Group_5__0__Impl rule__Conference__Group_5__1 ;
    public final void rule__Conference__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1174:1: ( rule__Conference__Group_5__0__Impl rule__Conference__Group_5__1 )
            // InternalProgram.g:1175:2: rule__Conference__Group_5__0__Impl rule__Conference__Group_5__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalProgram.g:1182:1: rule__Conference__Group_5__0__Impl : ( 'events' ) ;
    public final void rule__Conference__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1186:1: ( ( 'events' ) )
            // InternalProgram.g:1187:1: ( 'events' )
            {
            // InternalProgram.g:1187:1: ( 'events' )
            // InternalProgram.g:1188:2: 'events'
            {
             before(grammarAccess.getConferenceAccess().getEventsKeyword_5_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getEventsKeyword_5_0()); 

            }


            }

        }
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
    // InternalProgram.g:1197:1: rule__Conference__Group_5__1 : rule__Conference__Group_5__1__Impl rule__Conference__Group_5__2 ;
    public final void rule__Conference__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1201:1: ( rule__Conference__Group_5__1__Impl rule__Conference__Group_5__2 )
            // InternalProgram.g:1202:2: rule__Conference__Group_5__1__Impl rule__Conference__Group_5__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalProgram.g:1209:1: rule__Conference__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Conference__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1213:1: ( ( '{' ) )
            // InternalProgram.g:1214:1: ( '{' )
            {
            // InternalProgram.g:1214:1: ( '{' )
            // InternalProgram.g:1215:2: '{'
            {
             before(grammarAccess.getConferenceAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalProgram.g:1224:1: rule__Conference__Group_5__2 : rule__Conference__Group_5__2__Impl rule__Conference__Group_5__3 ;
    public final void rule__Conference__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1228:1: ( rule__Conference__Group_5__2__Impl rule__Conference__Group_5__3 )
            // InternalProgram.g:1229:2: rule__Conference__Group_5__2__Impl rule__Conference__Group_5__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalProgram.g:1236:1: rule__Conference__Group_5__2__Impl : ( ( rule__Conference__EventsAssignment_5_2 ) ) ;
    public final void rule__Conference__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1240:1: ( ( ( rule__Conference__EventsAssignment_5_2 ) ) )
            // InternalProgram.g:1241:1: ( ( rule__Conference__EventsAssignment_5_2 ) )
            {
            // InternalProgram.g:1241:1: ( ( rule__Conference__EventsAssignment_5_2 ) )
            // InternalProgram.g:1242:2: ( rule__Conference__EventsAssignment_5_2 )
            {
             before(grammarAccess.getConferenceAccess().getEventsAssignment_5_2()); 
            // InternalProgram.g:1243:2: ( rule__Conference__EventsAssignment_5_2 )
            // InternalProgram.g:1243:3: rule__Conference__EventsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Conference__EventsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getConferenceAccess().getEventsAssignment_5_2()); 

            }


            }

        }
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
    // InternalProgram.g:1251:1: rule__Conference__Group_5__3 : rule__Conference__Group_5__3__Impl rule__Conference__Group_5__4 ;
    public final void rule__Conference__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1255:1: ( rule__Conference__Group_5__3__Impl rule__Conference__Group_5__4 )
            // InternalProgram.g:1256:2: rule__Conference__Group_5__3__Impl rule__Conference__Group_5__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalProgram.g:1263:1: rule__Conference__Group_5__3__Impl : ( ( rule__Conference__Group_5_3__0 )* ) ;
    public final void rule__Conference__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1267:1: ( ( ( rule__Conference__Group_5_3__0 )* ) )
            // InternalProgram.g:1268:1: ( ( rule__Conference__Group_5_3__0 )* )
            {
            // InternalProgram.g:1268:1: ( ( rule__Conference__Group_5_3__0 )* )
            // InternalProgram.g:1269:2: ( rule__Conference__Group_5_3__0 )*
            {
             before(grammarAccess.getConferenceAccess().getGroup_5_3()); 
            // InternalProgram.g:1270:2: ( rule__Conference__Group_5_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalProgram.g:1270:3: rule__Conference__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
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
    // InternalProgram.g:1278:1: rule__Conference__Group_5__4 : rule__Conference__Group_5__4__Impl ;
    public final void rule__Conference__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1282:1: ( rule__Conference__Group_5__4__Impl )
            // InternalProgram.g:1283:2: rule__Conference__Group_5__4__Impl
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
    // InternalProgram.g:1289:1: rule__Conference__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Conference__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1293:1: ( ( '}' ) )
            // InternalProgram.g:1294:1: ( '}' )
            {
            // InternalProgram.g:1294:1: ( '}' )
            // InternalProgram.g:1295:2: '}'
            {
             before(grammarAccess.getConferenceAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalProgram.g:1305:1: rule__Conference__Group_5_3__0 : rule__Conference__Group_5_3__0__Impl rule__Conference__Group_5_3__1 ;
    public final void rule__Conference__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1309:1: ( rule__Conference__Group_5_3__0__Impl rule__Conference__Group_5_3__1 )
            // InternalProgram.g:1310:2: rule__Conference__Group_5_3__0__Impl rule__Conference__Group_5_3__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalProgram.g:1317:1: rule__Conference__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Conference__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1321:1: ( ( ',' ) )
            // InternalProgram.g:1322:1: ( ',' )
            {
            // InternalProgram.g:1322:1: ( ',' )
            // InternalProgram.g:1323:2: ','
            {
             before(grammarAccess.getConferenceAccess().getCommaKeyword_5_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
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
    // InternalProgram.g:1332:1: rule__Conference__Group_5_3__1 : rule__Conference__Group_5_3__1__Impl ;
    public final void rule__Conference__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1336:1: ( rule__Conference__Group_5_3__1__Impl )
            // InternalProgram.g:1337:2: rule__Conference__Group_5_3__1__Impl
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
    // InternalProgram.g:1343:1: rule__Conference__Group_5_3__1__Impl : ( ( rule__Conference__EventsAssignment_5_3_1 ) ) ;
    public final void rule__Conference__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1347:1: ( ( ( rule__Conference__EventsAssignment_5_3_1 ) ) )
            // InternalProgram.g:1348:1: ( ( rule__Conference__EventsAssignment_5_3_1 ) )
            {
            // InternalProgram.g:1348:1: ( ( rule__Conference__EventsAssignment_5_3_1 ) )
            // InternalProgram.g:1349:2: ( rule__Conference__EventsAssignment_5_3_1 )
            {
             before(grammarAccess.getConferenceAccess().getEventsAssignment_5_3_1()); 
            // InternalProgram.g:1350:2: ( rule__Conference__EventsAssignment_5_3_1 )
            // InternalProgram.g:1350:3: rule__Conference__EventsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Conference__EventsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConferenceAccess().getEventsAssignment_5_3_1()); 

            }


            }

        }
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
    // InternalProgram.g:1359:1: rule__Conference__Group_6__0 : rule__Conference__Group_6__0__Impl rule__Conference__Group_6__1 ;
    public final void rule__Conference__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1363:1: ( rule__Conference__Group_6__0__Impl rule__Conference__Group_6__1 )
            // InternalProgram.g:1364:2: rule__Conference__Group_6__0__Impl rule__Conference__Group_6__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalProgram.g:1371:1: rule__Conference__Group_6__0__Impl : ( 'program' ) ;
    public final void rule__Conference__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1375:1: ( ( 'program' ) )
            // InternalProgram.g:1376:1: ( 'program' )
            {
            // InternalProgram.g:1376:1: ( 'program' )
            // InternalProgram.g:1377:2: 'program'
            {
             before(grammarAccess.getConferenceAccess().getProgramKeyword_6_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getConferenceAccess().getProgramKeyword_6_0()); 

            }


            }

        }
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
    // InternalProgram.g:1386:1: rule__Conference__Group_6__1 : rule__Conference__Group_6__1__Impl ;
    public final void rule__Conference__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1390:1: ( rule__Conference__Group_6__1__Impl )
            // InternalProgram.g:1391:2: rule__Conference__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conference__Group_6__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:1397:1: rule__Conference__Group_6__1__Impl : ( ( rule__Conference__ProgramAssignment_6_1 ) ) ;
    public final void rule__Conference__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1401:1: ( ( ( rule__Conference__ProgramAssignment_6_1 ) ) )
            // InternalProgram.g:1402:1: ( ( rule__Conference__ProgramAssignment_6_1 ) )
            {
            // InternalProgram.g:1402:1: ( ( rule__Conference__ProgramAssignment_6_1 ) )
            // InternalProgram.g:1403:2: ( rule__Conference__ProgramAssignment_6_1 )
            {
             before(grammarAccess.getConferenceAccess().getProgramAssignment_6_1()); 
            // InternalProgram.g:1404:2: ( rule__Conference__ProgramAssignment_6_1 )
            // InternalProgram.g:1404:3: rule__Conference__ProgramAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Conference__ProgramAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getConferenceAccess().getProgramAssignment_6_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Program__Group__0"
    // InternalProgram.g:1413:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1417:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalProgram.g:1418:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalProgram.g:1425:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1429:1: ( ( () ) )
            // InternalProgram.g:1430:1: ( () )
            {
            // InternalProgram.g:1430:1: ( () )
            // InternalProgram.g:1431:2: ()
            {
             before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            // InternalProgram.g:1432:2: ()
            // InternalProgram.g:1432:3: 
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
    // InternalProgram.g:1440:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1444:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalProgram.g:1445:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalProgram.g:1452:1: rule__Program__Group__1__Impl : ( 'Program' ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1456:1: ( ( 'Program' ) )
            // InternalProgram.g:1457:1: ( 'Program' )
            {
            // InternalProgram.g:1457:1: ( 'Program' )
            // InternalProgram.g:1458:2: 'Program'
            {
             before(grammarAccess.getProgramAccess().getProgramKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getProgramKeyword_1()); 

            }


            }

        }
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
    // InternalProgram.g:1467:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1471:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalProgram.g:1472:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalProgram.g:1479:1: rule__Program__Group__2__Impl : ( '{' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1483:1: ( ( '{' ) )
            // InternalProgram.g:1484:1: ( '{' )
            {
            // InternalProgram.g:1484:1: ( '{' )
            // InternalProgram.g:1485:2: '{'
            {
             before(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalProgram.g:1494:1: rule__Program__Group__3 : rule__Program__Group__3__Impl rule__Program__Group__4 ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1498:1: ( rule__Program__Group__3__Impl rule__Program__Group__4 )
            // InternalProgram.g:1499:2: rule__Program__Group__3__Impl rule__Program__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Program__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__4();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:1506:1: rule__Program__Group__3__Impl : ( ( rule__Program__Group_3__0 )? ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1510:1: ( ( ( rule__Program__Group_3__0 )? ) )
            // InternalProgram.g:1511:1: ( ( rule__Program__Group_3__0 )? )
            {
            // InternalProgram.g:1511:1: ( ( rule__Program__Group_3__0 )? )
            // InternalProgram.g:1512:2: ( rule__Program__Group_3__0 )?
            {
             before(grammarAccess.getProgramAccess().getGroup_3()); 
            // InternalProgram.g:1513:2: ( rule__Program__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalProgram.g:1513:3: rule__Program__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Program__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgramAccess().getGroup_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Program__Group__4"
    // InternalProgram.g:1521:1: rule__Program__Group__4 : rule__Program__Group__4__Impl ;
    public final void rule__Program__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1525:1: ( rule__Program__Group__4__Impl )
            // InternalProgram.g:1526:2: rule__Program__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__4"


    // $ANTLR start "rule__Program__Group__4__Impl"
    // InternalProgram.g:1532:1: rule__Program__Group__4__Impl : ( '}' ) ;
    public final void rule__Program__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1536:1: ( ( '}' ) )
            // InternalProgram.g:1537:1: ( '}' )
            {
            // InternalProgram.g:1537:1: ( '}' )
            // InternalProgram.g:1538:2: '}'
            {
             before(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__4__Impl"


    // $ANTLR start "rule__Program__Group_3__0"
    // InternalProgram.g:1548:1: rule__Program__Group_3__0 : rule__Program__Group_3__0__Impl rule__Program__Group_3__1 ;
    public final void rule__Program__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1552:1: ( rule__Program__Group_3__0__Impl rule__Program__Group_3__1 )
            // InternalProgram.g:1553:2: rule__Program__Group_3__0__Impl rule__Program__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3__0"


    // $ANTLR start "rule__Program__Group_3__0__Impl"
    // InternalProgram.g:1560:1: rule__Program__Group_3__0__Impl : ( 'days' ) ;
    public final void rule__Program__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1564:1: ( ( 'days' ) )
            // InternalProgram.g:1565:1: ( 'days' )
            {
            // InternalProgram.g:1565:1: ( 'days' )
            // InternalProgram.g:1566:2: 'days'
            {
             before(grammarAccess.getProgramAccess().getDaysKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getDaysKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3__0__Impl"


    // $ANTLR start "rule__Program__Group_3__1"
    // InternalProgram.g:1575:1: rule__Program__Group_3__1 : rule__Program__Group_3__1__Impl rule__Program__Group_3__2 ;
    public final void rule__Program__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1579:1: ( rule__Program__Group_3__1__Impl rule__Program__Group_3__2 )
            // InternalProgram.g:1580:2: rule__Program__Group_3__1__Impl rule__Program__Group_3__2
            {
            pushFollow(FOLLOW_13);
            rule__Program__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3__1"


    // $ANTLR start "rule__Program__Group_3__1__Impl"
    // InternalProgram.g:1587:1: rule__Program__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Program__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1591:1: ( ( '{' ) )
            // InternalProgram.g:1592:1: ( '{' )
            {
            // InternalProgram.g:1592:1: ( '{' )
            // InternalProgram.g:1593:2: '{'
            {
             before(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3__1__Impl"


    // $ANTLR start "rule__Program__Group_3__2"
    // InternalProgram.g:1602:1: rule__Program__Group_3__2 : rule__Program__Group_3__2__Impl rule__Program__Group_3__3 ;
    public final void rule__Program__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1606:1: ( rule__Program__Group_3__2__Impl rule__Program__Group_3__3 )
            // InternalProgram.g:1607:2: rule__Program__Group_3__2__Impl rule__Program__Group_3__3
            {
            pushFollow(FOLLOW_8);
            rule__Program__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3__2"


    // $ANTLR start "rule__Program__Group_3__2__Impl"
    // InternalProgram.g:1614:1: rule__Program__Group_3__2__Impl : ( ( rule__Program__DaysAssignment_3_2 ) ) ;
    public final void rule__Program__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1618:1: ( ( ( rule__Program__DaysAssignment_3_2 ) ) )
            // InternalProgram.g:1619:1: ( ( rule__Program__DaysAssignment_3_2 ) )
            {
            // InternalProgram.g:1619:1: ( ( rule__Program__DaysAssignment_3_2 ) )
            // InternalProgram.g:1620:2: ( rule__Program__DaysAssignment_3_2 )
            {
             before(grammarAccess.getProgramAccess().getDaysAssignment_3_2()); 
            // InternalProgram.g:1621:2: ( rule__Program__DaysAssignment_3_2 )
            // InternalProgram.g:1621:3: rule__Program__DaysAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Program__DaysAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getDaysAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3__2__Impl"


    // $ANTLR start "rule__Program__Group_3__3"
    // InternalProgram.g:1629:1: rule__Program__Group_3__3 : rule__Program__Group_3__3__Impl rule__Program__Group_3__4 ;
    public final void rule__Program__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1633:1: ( rule__Program__Group_3__3__Impl rule__Program__Group_3__4 )
            // InternalProgram.g:1634:2: rule__Program__Group_3__3__Impl rule__Program__Group_3__4
            {
            pushFollow(FOLLOW_8);
            rule__Program__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3__3"


    // $ANTLR start "rule__Program__Group_3__3__Impl"
    // InternalProgram.g:1641:1: rule__Program__Group_3__3__Impl : ( ( rule__Program__Group_3_3__0 )* ) ;
    public final void rule__Program__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1645:1: ( ( ( rule__Program__Group_3_3__0 )* ) )
            // InternalProgram.g:1646:1: ( ( rule__Program__Group_3_3__0 )* )
            {
            // InternalProgram.g:1646:1: ( ( rule__Program__Group_3_3__0 )* )
            // InternalProgram.g:1647:2: ( rule__Program__Group_3_3__0 )*
            {
             before(grammarAccess.getProgramAccess().getGroup_3_3()); 
            // InternalProgram.g:1648:2: ( rule__Program__Group_3_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalProgram.g:1648:3: rule__Program__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Program__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3__3__Impl"


    // $ANTLR start "rule__Program__Group_3__4"
    // InternalProgram.g:1656:1: rule__Program__Group_3__4 : rule__Program__Group_3__4__Impl ;
    public final void rule__Program__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1660:1: ( rule__Program__Group_3__4__Impl )
            // InternalProgram.g:1661:2: rule__Program__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3__4"


    // $ANTLR start "rule__Program__Group_3__4__Impl"
    // InternalProgram.g:1667:1: rule__Program__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Program__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1671:1: ( ( '}' ) )
            // InternalProgram.g:1672:1: ( '}' )
            {
            // InternalProgram.g:1672:1: ( '}' )
            // InternalProgram.g:1673:2: '}'
            {
             before(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3__4__Impl"


    // $ANTLR start "rule__Program__Group_3_3__0"
    // InternalProgram.g:1683:1: rule__Program__Group_3_3__0 : rule__Program__Group_3_3__0__Impl rule__Program__Group_3_3__1 ;
    public final void rule__Program__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1687:1: ( rule__Program__Group_3_3__0__Impl rule__Program__Group_3_3__1 )
            // InternalProgram.g:1688:2: rule__Program__Group_3_3__0__Impl rule__Program__Group_3_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Program__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3_3__0"


    // $ANTLR start "rule__Program__Group_3_3__0__Impl"
    // InternalProgram.g:1695:1: rule__Program__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Program__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1699:1: ( ( ',' ) )
            // InternalProgram.g:1700:1: ( ',' )
            {
            // InternalProgram.g:1700:1: ( ',' )
            // InternalProgram.g:1701:2: ','
            {
             before(grammarAccess.getProgramAccess().getCommaKeyword_3_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3_3__0__Impl"


    // $ANTLR start "rule__Program__Group_3_3__1"
    // InternalProgram.g:1710:1: rule__Program__Group_3_3__1 : rule__Program__Group_3_3__1__Impl ;
    public final void rule__Program__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1714:1: ( rule__Program__Group_3_3__1__Impl )
            // InternalProgram.g:1715:2: rule__Program__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3_3__1"


    // $ANTLR start "rule__Program__Group_3_3__1__Impl"
    // InternalProgram.g:1721:1: rule__Program__Group_3_3__1__Impl : ( ( rule__Program__DaysAssignment_3_3_1 ) ) ;
    public final void rule__Program__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1725:1: ( ( ( rule__Program__DaysAssignment_3_3_1 ) ) )
            // InternalProgram.g:1726:1: ( ( rule__Program__DaysAssignment_3_3_1 ) )
            {
            // InternalProgram.g:1726:1: ( ( rule__Program__DaysAssignment_3_3_1 ) )
            // InternalProgram.g:1727:2: ( rule__Program__DaysAssignment_3_3_1 )
            {
             before(grammarAccess.getProgramAccess().getDaysAssignment_3_3_1()); 
            // InternalProgram.g:1728:2: ( rule__Program__DaysAssignment_3_3_1 )
            // InternalProgram.g:1728:3: rule__Program__DaysAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__DaysAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getDaysAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_3_3__1__Impl"


    // $ANTLR start "rule__Room__Group__0"
    // InternalProgram.g:1737:1: rule__Room__Group__0 : rule__Room__Group__0__Impl rule__Room__Group__1 ;
    public final void rule__Room__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1741:1: ( rule__Room__Group__0__Impl rule__Room__Group__1 )
            // InternalProgram.g:1742:2: rule__Room__Group__0__Impl rule__Room__Group__1
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
    // InternalProgram.g:1749:1: rule__Room__Group__0__Impl : ( () ) ;
    public final void rule__Room__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1753:1: ( ( () ) )
            // InternalProgram.g:1754:1: ( () )
            {
            // InternalProgram.g:1754:1: ( () )
            // InternalProgram.g:1755:2: ()
            {
             before(grammarAccess.getRoomAccess().getRoomAction_0()); 
            // InternalProgram.g:1756:2: ()
            // InternalProgram.g:1756:3: 
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
    // InternalProgram.g:1764:1: rule__Room__Group__1 : rule__Room__Group__1__Impl rule__Room__Group__2 ;
    public final void rule__Room__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1768:1: ( rule__Room__Group__1__Impl rule__Room__Group__2 )
            // InternalProgram.g:1769:2: rule__Room__Group__1__Impl rule__Room__Group__2
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
    // InternalProgram.g:1776:1: rule__Room__Group__1__Impl : ( 'Room' ) ;
    public final void rule__Room__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1780:1: ( ( 'Room' ) )
            // InternalProgram.g:1781:1: ( 'Room' )
            {
            // InternalProgram.g:1781:1: ( 'Room' )
            // InternalProgram.g:1782:2: 'Room'
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
    // InternalProgram.g:1791:1: rule__Room__Group__2 : rule__Room__Group__2__Impl rule__Room__Group__3 ;
    public final void rule__Room__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1795:1: ( rule__Room__Group__2__Impl rule__Room__Group__3 )
            // InternalProgram.g:1796:2: rule__Room__Group__2__Impl rule__Room__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalProgram.g:1803:1: rule__Room__Group__2__Impl : ( ( rule__Room__NameAssignment_2 ) ) ;
    public final void rule__Room__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1807:1: ( ( ( rule__Room__NameAssignment_2 ) ) )
            // InternalProgram.g:1808:1: ( ( rule__Room__NameAssignment_2 ) )
            {
            // InternalProgram.g:1808:1: ( ( rule__Room__NameAssignment_2 ) )
            // InternalProgram.g:1809:2: ( rule__Room__NameAssignment_2 )
            {
             before(grammarAccess.getRoomAccess().getNameAssignment_2()); 
            // InternalProgram.g:1810:2: ( rule__Room__NameAssignment_2 )
            // InternalProgram.g:1810:3: rule__Room__NameAssignment_2
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
    // InternalProgram.g:1818:1: rule__Room__Group__3 : rule__Room__Group__3__Impl rule__Room__Group__4 ;
    public final void rule__Room__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1822:1: ( rule__Room__Group__3__Impl rule__Room__Group__4 )
            // InternalProgram.g:1823:2: rule__Room__Group__3__Impl rule__Room__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Room__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__4();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:1830:1: rule__Room__Group__3__Impl : ( '{' ) ;
    public final void rule__Room__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1834:1: ( ( '{' ) )
            // InternalProgram.g:1835:1: ( '{' )
            {
            // InternalProgram.g:1835:1: ( '{' )
            // InternalProgram.g:1836:2: '{'
            {
             before(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Room__Group__4"
    // InternalProgram.g:1845:1: rule__Room__Group__4 : rule__Room__Group__4__Impl rule__Room__Group__5 ;
    public final void rule__Room__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1849:1: ( rule__Room__Group__4__Impl rule__Room__Group__5 )
            // InternalProgram.g:1850:2: rule__Room__Group__4__Impl rule__Room__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Room__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__4"


    // $ANTLR start "rule__Room__Group__4__Impl"
    // InternalProgram.g:1857:1: rule__Room__Group__4__Impl : ( ( rule__Room__Group_4__0 )? ) ;
    public final void rule__Room__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1861:1: ( ( ( rule__Room__Group_4__0 )? ) )
            // InternalProgram.g:1862:1: ( ( rule__Room__Group_4__0 )? )
            {
            // InternalProgram.g:1862:1: ( ( rule__Room__Group_4__0 )? )
            // InternalProgram.g:1863:2: ( rule__Room__Group_4__0 )?
            {
             before(grammarAccess.getRoomAccess().getGroup_4()); 
            // InternalProgram.g:1864:2: ( rule__Room__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalProgram.g:1864:3: rule__Room__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Room__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoomAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__4__Impl"


    // $ANTLR start "rule__Room__Group__5"
    // InternalProgram.g:1872:1: rule__Room__Group__5 : rule__Room__Group__5__Impl ;
    public final void rule__Room__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1876:1: ( rule__Room__Group__5__Impl )
            // InternalProgram.g:1877:2: rule__Room__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__5"


    // $ANTLR start "rule__Room__Group__5__Impl"
    // InternalProgram.g:1883:1: rule__Room__Group__5__Impl : ( '}' ) ;
    public final void rule__Room__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1887:1: ( ( '}' ) )
            // InternalProgram.g:1888:1: ( '}' )
            {
            // InternalProgram.g:1888:1: ( '}' )
            // InternalProgram.g:1889:2: '}'
            {
             before(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__5__Impl"


    // $ANTLR start "rule__Room__Group_4__0"
    // InternalProgram.g:1899:1: rule__Room__Group_4__0 : rule__Room__Group_4__0__Impl rule__Room__Group_4__1 ;
    public final void rule__Room__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1903:1: ( rule__Room__Group_4__0__Impl rule__Room__Group_4__1 )
            // InternalProgram.g:1904:2: rule__Room__Group_4__0__Impl rule__Room__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__Room__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_4__0"


    // $ANTLR start "rule__Room__Group_4__0__Impl"
    // InternalProgram.g:1911:1: rule__Room__Group_4__0__Impl : ( 'capacity' ) ;
    public final void rule__Room__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1915:1: ( ( 'capacity' ) )
            // InternalProgram.g:1916:1: ( 'capacity' )
            {
            // InternalProgram.g:1916:1: ( 'capacity' )
            // InternalProgram.g:1917:2: 'capacity'
            {
             before(grammarAccess.getRoomAccess().getCapacityKeyword_4_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getCapacityKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_4__0__Impl"


    // $ANTLR start "rule__Room__Group_4__1"
    // InternalProgram.g:1926:1: rule__Room__Group_4__1 : rule__Room__Group_4__1__Impl ;
    public final void rule__Room__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1930:1: ( rule__Room__Group_4__1__Impl )
            // InternalProgram.g:1931:2: rule__Room__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_4__1"


    // $ANTLR start "rule__Room__Group_4__1__Impl"
    // InternalProgram.g:1937:1: rule__Room__Group_4__1__Impl : ( ( rule__Room__CapacityAssignment_4_1 ) ) ;
    public final void rule__Room__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1941:1: ( ( ( rule__Room__CapacityAssignment_4_1 ) ) )
            // InternalProgram.g:1942:1: ( ( rule__Room__CapacityAssignment_4_1 ) )
            {
            // InternalProgram.g:1942:1: ( ( rule__Room__CapacityAssignment_4_1 ) )
            // InternalProgram.g:1943:2: ( rule__Room__CapacityAssignment_4_1 )
            {
             before(grammarAccess.getRoomAccess().getCapacityAssignment_4_1()); 
            // InternalProgram.g:1944:2: ( rule__Room__CapacityAssignment_4_1 )
            // InternalProgram.g:1944:3: rule__Room__CapacityAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Room__CapacityAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getCapacityAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_4__1__Impl"


    // $ANTLR start "rule__EIntegerObject__Group__0"
    // InternalProgram.g:1953:1: rule__EIntegerObject__Group__0 : rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1 ;
    public final void rule__EIntegerObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1957:1: ( rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1 )
            // InternalProgram.g:1958:2: rule__EIntegerObject__Group__0__Impl rule__EIntegerObject__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__EIntegerObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EIntegerObject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EIntegerObject__Group__0"


    // $ANTLR start "rule__EIntegerObject__Group__0__Impl"
    // InternalProgram.g:1965:1: rule__EIntegerObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EIntegerObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1969:1: ( ( ( '-' )? ) )
            // InternalProgram.g:1970:1: ( ( '-' )? )
            {
            // InternalProgram.g:1970:1: ( ( '-' )? )
            // InternalProgram.g:1971:2: ( '-' )?
            {
             before(grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0()); 
            // InternalProgram.g:1972:2: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalProgram.g:1972:3: '-'
                    {
                    match(input,31,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EIntegerObject__Group__0__Impl"


    // $ANTLR start "rule__EIntegerObject__Group__1"
    // InternalProgram.g:1980:1: rule__EIntegerObject__Group__1 : rule__EIntegerObject__Group__1__Impl ;
    public final void rule__EIntegerObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1984:1: ( rule__EIntegerObject__Group__1__Impl )
            // InternalProgram.g:1985:2: rule__EIntegerObject__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EIntegerObject__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EIntegerObject__Group__1"


    // $ANTLR start "rule__EIntegerObject__Group__1__Impl"
    // InternalProgram.g:1991:1: rule__EIntegerObject__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EIntegerObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:1995:1: ( ( RULE_INT ) )
            // InternalProgram.g:1996:1: ( RULE_INT )
            {
            // InternalProgram.g:1996:1: ( RULE_INT )
            // InternalProgram.g:1997:2: RULE_INT
            {
             before(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EIntegerObject__Group__1__Impl"


    // $ANTLR start "rule__Day__Group__0"
    // InternalProgram.g:2007:1: rule__Day__Group__0 : rule__Day__Group__0__Impl rule__Day__Group__1 ;
    public final void rule__Day__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2011:1: ( rule__Day__Group__0__Impl rule__Day__Group__1 )
            // InternalProgram.g:2012:2: rule__Day__Group__0__Impl rule__Day__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalProgram.g:2019:1: rule__Day__Group__0__Impl : ( 'Day' ) ;
    public final void rule__Day__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2023:1: ( ( 'Day' ) )
            // InternalProgram.g:2024:1: ( 'Day' )
            {
            // InternalProgram.g:2024:1: ( 'Day' )
            // InternalProgram.g:2025:2: 'Day'
            {
             before(grammarAccess.getDayAccess().getDayKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDayAccess().getDayKeyword_0()); 

            }


            }

        }
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
    // InternalProgram.g:2034:1: rule__Day__Group__1 : rule__Day__Group__1__Impl rule__Day__Group__2 ;
    public final void rule__Day__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2038:1: ( rule__Day__Group__1__Impl rule__Day__Group__2 )
            // InternalProgram.g:2039:2: rule__Day__Group__1__Impl rule__Day__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalProgram.g:2046:1: rule__Day__Group__1__Impl : ( '{' ) ;
    public final void rule__Day__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2050:1: ( ( '{' ) )
            // InternalProgram.g:2051:1: ( '{' )
            {
            // InternalProgram.g:2051:1: ( '{' )
            // InternalProgram.g:2052:2: '{'
            {
             before(grammarAccess.getDayAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDayAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalProgram.g:2061:1: rule__Day__Group__2 : rule__Day__Group__2__Impl rule__Day__Group__3 ;
    public final void rule__Day__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2065:1: ( rule__Day__Group__2__Impl rule__Day__Group__3 )
            // InternalProgram.g:2066:2: rule__Day__Group__2__Impl rule__Day__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Day__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Day__Group__3();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:2073:1: rule__Day__Group__2__Impl : ( 'weekday' ) ;
    public final void rule__Day__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2077:1: ( ( 'weekday' ) )
            // InternalProgram.g:2078:1: ( 'weekday' )
            {
            // InternalProgram.g:2078:1: ( 'weekday' )
            // InternalProgram.g:2079:2: 'weekday'
            {
             before(grammarAccess.getDayAccess().getWeekdayKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDayAccess().getWeekdayKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Day__Group__3"
    // InternalProgram.g:2088:1: rule__Day__Group__3 : rule__Day__Group__3__Impl rule__Day__Group__4 ;
    public final void rule__Day__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2092:1: ( rule__Day__Group__3__Impl rule__Day__Group__4 )
            // InternalProgram.g:2093:2: rule__Day__Group__3__Impl rule__Day__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Day__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Day__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group__3"


    // $ANTLR start "rule__Day__Group__3__Impl"
    // InternalProgram.g:2100:1: rule__Day__Group__3__Impl : ( ( rule__Day__WeekdayAssignment_3 ) ) ;
    public final void rule__Day__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2104:1: ( ( ( rule__Day__WeekdayAssignment_3 ) ) )
            // InternalProgram.g:2105:1: ( ( rule__Day__WeekdayAssignment_3 ) )
            {
            // InternalProgram.g:2105:1: ( ( rule__Day__WeekdayAssignment_3 ) )
            // InternalProgram.g:2106:2: ( rule__Day__WeekdayAssignment_3 )
            {
             before(grammarAccess.getDayAccess().getWeekdayAssignment_3()); 
            // InternalProgram.g:2107:2: ( rule__Day__WeekdayAssignment_3 )
            // InternalProgram.g:2107:3: rule__Day__WeekdayAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Day__WeekdayAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDayAccess().getWeekdayAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group__3__Impl"


    // $ANTLR start "rule__Day__Group__4"
    // InternalProgram.g:2115:1: rule__Day__Group__4 : rule__Day__Group__4__Impl rule__Day__Group__5 ;
    public final void rule__Day__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2119:1: ( rule__Day__Group__4__Impl rule__Day__Group__5 )
            // InternalProgram.g:2120:2: rule__Day__Group__4__Impl rule__Day__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Day__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Day__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group__4"


    // $ANTLR start "rule__Day__Group__4__Impl"
    // InternalProgram.g:2127:1: rule__Day__Group__4__Impl : ( ( rule__Day__Group_4__0 )? ) ;
    public final void rule__Day__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2131:1: ( ( ( rule__Day__Group_4__0 )? ) )
            // InternalProgram.g:2132:1: ( ( rule__Day__Group_4__0 )? )
            {
            // InternalProgram.g:2132:1: ( ( rule__Day__Group_4__0 )? )
            // InternalProgram.g:2133:2: ( rule__Day__Group_4__0 )?
            {
             before(grammarAccess.getDayAccess().getGroup_4()); 
            // InternalProgram.g:2134:2: ( rule__Day__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalProgram.g:2134:3: rule__Day__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Day__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDayAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group__4__Impl"


    // $ANTLR start "rule__Day__Group__5"
    // InternalProgram.g:2142:1: rule__Day__Group__5 : rule__Day__Group__5__Impl rule__Day__Group__6 ;
    public final void rule__Day__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2146:1: ( rule__Day__Group__5__Impl rule__Day__Group__6 )
            // InternalProgram.g:2147:2: rule__Day__Group__5__Impl rule__Day__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Day__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Day__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group__5"


    // $ANTLR start "rule__Day__Group__5__Impl"
    // InternalProgram.g:2154:1: rule__Day__Group__5__Impl : ( ( rule__Day__Group_5__0 )? ) ;
    public final void rule__Day__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2158:1: ( ( ( rule__Day__Group_5__0 )? ) )
            // InternalProgram.g:2159:1: ( ( rule__Day__Group_5__0 )? )
            {
            // InternalProgram.g:2159:1: ( ( rule__Day__Group_5__0 )? )
            // InternalProgram.g:2160:2: ( rule__Day__Group_5__0 )?
            {
             before(grammarAccess.getDayAccess().getGroup_5()); 
            // InternalProgram.g:2161:2: ( rule__Day__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalProgram.g:2161:3: rule__Day__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Day__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDayAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group__5__Impl"


    // $ANTLR start "rule__Day__Group__6"
    // InternalProgram.g:2169:1: rule__Day__Group__6 : rule__Day__Group__6__Impl ;
    public final void rule__Day__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2173:1: ( rule__Day__Group__6__Impl )
            // InternalProgram.g:2174:2: rule__Day__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Day__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group__6"


    // $ANTLR start "rule__Day__Group__6__Impl"
    // InternalProgram.g:2180:1: rule__Day__Group__6__Impl : ( '}' ) ;
    public final void rule__Day__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2184:1: ( ( '}' ) )
            // InternalProgram.g:2185:1: ( '}' )
            {
            // InternalProgram.g:2185:1: ( '}' )
            // InternalProgram.g:2186:2: '}'
            {
             before(grammarAccess.getDayAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDayAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group__6__Impl"


    // $ANTLR start "rule__Day__Group_4__0"
    // InternalProgram.g:2196:1: rule__Day__Group_4__0 : rule__Day__Group_4__0__Impl rule__Day__Group_4__1 ;
    public final void rule__Day__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2200:1: ( rule__Day__Group_4__0__Impl rule__Day__Group_4__1 )
            // InternalProgram.g:2201:2: rule__Day__Group_4__0__Impl rule__Day__Group_4__1
            {
            pushFollow(FOLLOW_19);
            rule__Day__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Day__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group_4__0"


    // $ANTLR start "rule__Day__Group_4__0__Impl"
    // InternalProgram.g:2208:1: rule__Day__Group_4__0__Impl : ( 'date' ) ;
    public final void rule__Day__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2212:1: ( ( 'date' ) )
            // InternalProgram.g:2213:1: ( 'date' )
            {
            // InternalProgram.g:2213:1: ( 'date' )
            // InternalProgram.g:2214:2: 'date'
            {
             before(grammarAccess.getDayAccess().getDateKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDayAccess().getDateKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group_4__0__Impl"


    // $ANTLR start "rule__Day__Group_4__1"
    // InternalProgram.g:2223:1: rule__Day__Group_4__1 : rule__Day__Group_4__1__Impl ;
    public final void rule__Day__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2227:1: ( rule__Day__Group_4__1__Impl )
            // InternalProgram.g:2228:2: rule__Day__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Day__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group_4__1"


    // $ANTLR start "rule__Day__Group_4__1__Impl"
    // InternalProgram.g:2234:1: rule__Day__Group_4__1__Impl : ( ( rule__Day__DateAssignment_4_1 ) ) ;
    public final void rule__Day__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2238:1: ( ( ( rule__Day__DateAssignment_4_1 ) ) )
            // InternalProgram.g:2239:1: ( ( rule__Day__DateAssignment_4_1 ) )
            {
            // InternalProgram.g:2239:1: ( ( rule__Day__DateAssignment_4_1 ) )
            // InternalProgram.g:2240:2: ( rule__Day__DateAssignment_4_1 )
            {
             before(grammarAccess.getDayAccess().getDateAssignment_4_1()); 
            // InternalProgram.g:2241:2: ( rule__Day__DateAssignment_4_1 )
            // InternalProgram.g:2241:3: rule__Day__DateAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Day__DateAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDayAccess().getDateAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group_4__1__Impl"


    // $ANTLR start "rule__Day__Group_5__0"
    // InternalProgram.g:2250:1: rule__Day__Group_5__0 : rule__Day__Group_5__0__Impl rule__Day__Group_5__1 ;
    public final void rule__Day__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2254:1: ( rule__Day__Group_5__0__Impl rule__Day__Group_5__1 )
            // InternalProgram.g:2255:2: rule__Day__Group_5__0__Impl rule__Day__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Day__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Day__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group_5__0"


    // $ANTLR start "rule__Day__Group_5__0__Impl"
    // InternalProgram.g:2262:1: rule__Day__Group_5__0__Impl : ( 'sessions' ) ;
    public final void rule__Day__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2266:1: ( ( 'sessions' ) )
            // InternalProgram.g:2267:1: ( 'sessions' )
            {
            // InternalProgram.g:2267:1: ( 'sessions' )
            // InternalProgram.g:2268:2: 'sessions'
            {
             before(grammarAccess.getDayAccess().getSessionsKeyword_5_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDayAccess().getSessionsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group_5__0__Impl"


    // $ANTLR start "rule__Day__Group_5__1"
    // InternalProgram.g:2277:1: rule__Day__Group_5__1 : rule__Day__Group_5__1__Impl rule__Day__Group_5__2 ;
    public final void rule__Day__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2281:1: ( rule__Day__Group_5__1__Impl rule__Day__Group_5__2 )
            // InternalProgram.g:2282:2: rule__Day__Group_5__1__Impl rule__Day__Group_5__2
            {
            pushFollow(FOLLOW_20);
            rule__Day__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Day__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group_5__1"


    // $ANTLR start "rule__Day__Group_5__1__Impl"
    // InternalProgram.g:2289:1: rule__Day__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Day__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2293:1: ( ( '{' ) )
            // InternalProgram.g:2294:1: ( '{' )
            {
            // InternalProgram.g:2294:1: ( '{' )
            // InternalProgram.g:2295:2: '{'
            {
             before(grammarAccess.getDayAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDayAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group_5__1__Impl"


    // $ANTLR start "rule__Day__Group_5__2"
    // InternalProgram.g:2304:1: rule__Day__Group_5__2 : rule__Day__Group_5__2__Impl rule__Day__Group_5__3 ;
    public final void rule__Day__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2308:1: ( rule__Day__Group_5__2__Impl rule__Day__Group_5__3 )
            // InternalProgram.g:2309:2: rule__Day__Group_5__2__Impl rule__Day__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__Day__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Day__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group_5__2"


    // $ANTLR start "rule__Day__Group_5__2__Impl"
    // InternalProgram.g:2316:1: rule__Day__Group_5__2__Impl : ( ( rule__Day__SessionsAssignment_5_2 ) ) ;
    public final void rule__Day__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2320:1: ( ( ( rule__Day__SessionsAssignment_5_2 ) ) )
            // InternalProgram.g:2321:1: ( ( rule__Day__SessionsAssignment_5_2 ) )
            {
            // InternalProgram.g:2321:1: ( ( rule__Day__SessionsAssignment_5_2 ) )
            // InternalProgram.g:2322:2: ( rule__Day__SessionsAssignment_5_2 )
            {
             before(grammarAccess.getDayAccess().getSessionsAssignment_5_2()); 
            // InternalProgram.g:2323:2: ( rule__Day__SessionsAssignment_5_2 )
            // InternalProgram.g:2323:3: rule__Day__SessionsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Day__SessionsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getDayAccess().getSessionsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group_5__2__Impl"


    // $ANTLR start "rule__Day__Group_5__3"
    // InternalProgram.g:2331:1: rule__Day__Group_5__3 : rule__Day__Group_5__3__Impl rule__Day__Group_5__4 ;
    public final void rule__Day__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2335:1: ( rule__Day__Group_5__3__Impl rule__Day__Group_5__4 )
            // InternalProgram.g:2336:2: rule__Day__Group_5__3__Impl rule__Day__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__Day__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Day__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group_5__3"


    // $ANTLR start "rule__Day__Group_5__3__Impl"
    // InternalProgram.g:2343:1: rule__Day__Group_5__3__Impl : ( ( rule__Day__Group_5_3__0 )* ) ;
    public final void rule__Day__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2347:1: ( ( ( rule__Day__Group_5_3__0 )* ) )
            // InternalProgram.g:2348:1: ( ( rule__Day__Group_5_3__0 )* )
            {
            // InternalProgram.g:2348:1: ( ( rule__Day__Group_5_3__0 )* )
            // InternalProgram.g:2349:2: ( rule__Day__Group_5_3__0 )*
            {
             before(grammarAccess.getDayAccess().getGroup_5_3()); 
            // InternalProgram.g:2350:2: ( rule__Day__Group_5_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalProgram.g:2350:3: rule__Day__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Day__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getDayAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group_5__3__Impl"


    // $ANTLR start "rule__Day__Group_5__4"
    // InternalProgram.g:2358:1: rule__Day__Group_5__4 : rule__Day__Group_5__4__Impl ;
    public final void rule__Day__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2362:1: ( rule__Day__Group_5__4__Impl )
            // InternalProgram.g:2363:2: rule__Day__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Day__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group_5__4"


    // $ANTLR start "rule__Day__Group_5__4__Impl"
    // InternalProgram.g:2369:1: rule__Day__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Day__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2373:1: ( ( '}' ) )
            // InternalProgram.g:2374:1: ( '}' )
            {
            // InternalProgram.g:2374:1: ( '}' )
            // InternalProgram.g:2375:2: '}'
            {
             before(grammarAccess.getDayAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDayAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group_5__4__Impl"


    // $ANTLR start "rule__Day__Group_5_3__0"
    // InternalProgram.g:2385:1: rule__Day__Group_5_3__0 : rule__Day__Group_5_3__0__Impl rule__Day__Group_5_3__1 ;
    public final void rule__Day__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2389:1: ( rule__Day__Group_5_3__0__Impl rule__Day__Group_5_3__1 )
            // InternalProgram.g:2390:2: rule__Day__Group_5_3__0__Impl rule__Day__Group_5_3__1
            {
            pushFollow(FOLLOW_20);
            rule__Day__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Day__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group_5_3__0"


    // $ANTLR start "rule__Day__Group_5_3__0__Impl"
    // InternalProgram.g:2397:1: rule__Day__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Day__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2401:1: ( ( ',' ) )
            // InternalProgram.g:2402:1: ( ',' )
            {
            // InternalProgram.g:2402:1: ( ',' )
            // InternalProgram.g:2403:2: ','
            {
             before(grammarAccess.getDayAccess().getCommaKeyword_5_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDayAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group_5_3__0__Impl"


    // $ANTLR start "rule__Day__Group_5_3__1"
    // InternalProgram.g:2412:1: rule__Day__Group_5_3__1 : rule__Day__Group_5_3__1__Impl ;
    public final void rule__Day__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2416:1: ( rule__Day__Group_5_3__1__Impl )
            // InternalProgram.g:2417:2: rule__Day__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Day__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group_5_3__1"


    // $ANTLR start "rule__Day__Group_5_3__1__Impl"
    // InternalProgram.g:2423:1: rule__Day__Group_5_3__1__Impl : ( ( rule__Day__SessionsAssignment_5_3_1 ) ) ;
    public final void rule__Day__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2427:1: ( ( ( rule__Day__SessionsAssignment_5_3_1 ) ) )
            // InternalProgram.g:2428:1: ( ( rule__Day__SessionsAssignment_5_3_1 ) )
            {
            // InternalProgram.g:2428:1: ( ( rule__Day__SessionsAssignment_5_3_1 ) )
            // InternalProgram.g:2429:2: ( rule__Day__SessionsAssignment_5_3_1 )
            {
             before(grammarAccess.getDayAccess().getSessionsAssignment_5_3_1()); 
            // InternalProgram.g:2430:2: ( rule__Day__SessionsAssignment_5_3_1 )
            // InternalProgram.g:2430:3: rule__Day__SessionsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Day__SessionsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDayAccess().getSessionsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group_5_3__1__Impl"


    // $ANTLR start "rule__EDate__Group_0__0"
    // InternalProgram.g:2439:1: rule__EDate__Group_0__0 : rule__EDate__Group_0__0__Impl rule__EDate__Group_0__1 ;
    public final void rule__EDate__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2443:1: ( rule__EDate__Group_0__0__Impl rule__EDate__Group_0__1 )
            // InternalProgram.g:2444:2: rule__EDate__Group_0__0__Impl rule__EDate__Group_0__1
            {
            pushFollow(FOLLOW_21);
            rule__EDate__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDate__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDate__Group_0__0"


    // $ANTLR start "rule__EDate__Group_0__0__Impl"
    // InternalProgram.g:2451:1: rule__EDate__Group_0__0__Impl : ( RULE_INT ) ;
    public final void rule__EDate__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2455:1: ( ( RULE_INT ) )
            // InternalProgram.g:2456:1: ( RULE_INT )
            {
            // InternalProgram.g:2456:1: ( RULE_INT )
            // InternalProgram.g:2457:2: RULE_INT
            {
             before(grammarAccess.getEDateAccess().getINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDateAccess().getINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDate__Group_0__0__Impl"


    // $ANTLR start "rule__EDate__Group_0__1"
    // InternalProgram.g:2466:1: rule__EDate__Group_0__1 : rule__EDate__Group_0__1__Impl rule__EDate__Group_0__2 ;
    public final void rule__EDate__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2470:1: ( rule__EDate__Group_0__1__Impl rule__EDate__Group_0__2 )
            // InternalProgram.g:2471:2: rule__EDate__Group_0__1__Impl rule__EDate__Group_0__2
            {
            pushFollow(FOLLOW_19);
            rule__EDate__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDate__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDate__Group_0__1"


    // $ANTLR start "rule__EDate__Group_0__1__Impl"
    // InternalProgram.g:2478:1: rule__EDate__Group_0__1__Impl : ( '.' ) ;
    public final void rule__EDate__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2482:1: ( ( '.' ) )
            // InternalProgram.g:2483:1: ( '.' )
            {
            // InternalProgram.g:2483:1: ( '.' )
            // InternalProgram.g:2484:2: '.'
            {
             before(grammarAccess.getEDateAccess().getFullStopKeyword_0_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEDateAccess().getFullStopKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDate__Group_0__1__Impl"


    // $ANTLR start "rule__EDate__Group_0__2"
    // InternalProgram.g:2493:1: rule__EDate__Group_0__2 : rule__EDate__Group_0__2__Impl rule__EDate__Group_0__3 ;
    public final void rule__EDate__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2497:1: ( rule__EDate__Group_0__2__Impl rule__EDate__Group_0__3 )
            // InternalProgram.g:2498:2: rule__EDate__Group_0__2__Impl rule__EDate__Group_0__3
            {
            pushFollow(FOLLOW_21);
            rule__EDate__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDate__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDate__Group_0__2"


    // $ANTLR start "rule__EDate__Group_0__2__Impl"
    // InternalProgram.g:2505:1: rule__EDate__Group_0__2__Impl : ( RULE_INT ) ;
    public final void rule__EDate__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2509:1: ( ( RULE_INT ) )
            // InternalProgram.g:2510:1: ( RULE_INT )
            {
            // InternalProgram.g:2510:1: ( RULE_INT )
            // InternalProgram.g:2511:2: RULE_INT
            {
             before(grammarAccess.getEDateAccess().getINTTerminalRuleCall_0_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDateAccess().getINTTerminalRuleCall_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDate__Group_0__2__Impl"


    // $ANTLR start "rule__EDate__Group_0__3"
    // InternalProgram.g:2520:1: rule__EDate__Group_0__3 : rule__EDate__Group_0__3__Impl rule__EDate__Group_0__4 ;
    public final void rule__EDate__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2524:1: ( rule__EDate__Group_0__3__Impl rule__EDate__Group_0__4 )
            // InternalProgram.g:2525:2: rule__EDate__Group_0__3__Impl rule__EDate__Group_0__4
            {
            pushFollow(FOLLOW_19);
            rule__EDate__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDate__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDate__Group_0__3"


    // $ANTLR start "rule__EDate__Group_0__3__Impl"
    // InternalProgram.g:2532:1: rule__EDate__Group_0__3__Impl : ( '.' ) ;
    public final void rule__EDate__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2536:1: ( ( '.' ) )
            // InternalProgram.g:2537:1: ( '.' )
            {
            // InternalProgram.g:2537:1: ( '.' )
            // InternalProgram.g:2538:2: '.'
            {
             before(grammarAccess.getEDateAccess().getFullStopKeyword_0_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEDateAccess().getFullStopKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDate__Group_0__3__Impl"


    // $ANTLR start "rule__EDate__Group_0__4"
    // InternalProgram.g:2547:1: rule__EDate__Group_0__4 : rule__EDate__Group_0__4__Impl ;
    public final void rule__EDate__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2551:1: ( rule__EDate__Group_0__4__Impl )
            // InternalProgram.g:2552:2: rule__EDate__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDate__Group_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDate__Group_0__4"


    // $ANTLR start "rule__EDate__Group_0__4__Impl"
    // InternalProgram.g:2558:1: rule__EDate__Group_0__4__Impl : ( RULE_INT ) ;
    public final void rule__EDate__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2562:1: ( ( RULE_INT ) )
            // InternalProgram.g:2563:1: ( RULE_INT )
            {
            // InternalProgram.g:2563:1: ( RULE_INT )
            // InternalProgram.g:2564:2: RULE_INT
            {
             before(grammarAccess.getEDateAccess().getINTTerminalRuleCall_0_4()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDateAccess().getINTTerminalRuleCall_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDate__Group_0__4__Impl"


    // $ANTLR start "rule__EDate__Group_1__0"
    // InternalProgram.g:2574:1: rule__EDate__Group_1__0 : rule__EDate__Group_1__0__Impl rule__EDate__Group_1__1 ;
    public final void rule__EDate__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2578:1: ( rule__EDate__Group_1__0__Impl rule__EDate__Group_1__1 )
            // InternalProgram.g:2579:2: rule__EDate__Group_1__0__Impl rule__EDate__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__EDate__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDate__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDate__Group_1__0"


    // $ANTLR start "rule__EDate__Group_1__0__Impl"
    // InternalProgram.g:2586:1: rule__EDate__Group_1__0__Impl : ( RULE_INT ) ;
    public final void rule__EDate__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2590:1: ( ( RULE_INT ) )
            // InternalProgram.g:2591:1: ( RULE_INT )
            {
            // InternalProgram.g:2591:1: ( RULE_INT )
            // InternalProgram.g:2592:2: RULE_INT
            {
             before(grammarAccess.getEDateAccess().getINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDateAccess().getINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDate__Group_1__0__Impl"


    // $ANTLR start "rule__EDate__Group_1__1"
    // InternalProgram.g:2601:1: rule__EDate__Group_1__1 : rule__EDate__Group_1__1__Impl rule__EDate__Group_1__2 ;
    public final void rule__EDate__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2605:1: ( rule__EDate__Group_1__1__Impl rule__EDate__Group_1__2 )
            // InternalProgram.g:2606:2: rule__EDate__Group_1__1__Impl rule__EDate__Group_1__2
            {
            pushFollow(FOLLOW_19);
            rule__EDate__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDate__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDate__Group_1__1"


    // $ANTLR start "rule__EDate__Group_1__1__Impl"
    // InternalProgram.g:2613:1: rule__EDate__Group_1__1__Impl : ( ':' ) ;
    public final void rule__EDate__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2617:1: ( ( ':' ) )
            // InternalProgram.g:2618:1: ( ':' )
            {
            // InternalProgram.g:2618:1: ( ':' )
            // InternalProgram.g:2619:2: ':'
            {
             before(grammarAccess.getEDateAccess().getColonKeyword_1_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEDateAccess().getColonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDate__Group_1__1__Impl"


    // $ANTLR start "rule__EDate__Group_1__2"
    // InternalProgram.g:2628:1: rule__EDate__Group_1__2 : rule__EDate__Group_1__2__Impl ;
    public final void rule__EDate__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2632:1: ( rule__EDate__Group_1__2__Impl )
            // InternalProgram.g:2633:2: rule__EDate__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDate__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDate__Group_1__2"


    // $ANTLR start "rule__EDate__Group_1__2__Impl"
    // InternalProgram.g:2639:1: rule__EDate__Group_1__2__Impl : ( RULE_INT ) ;
    public final void rule__EDate__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2643:1: ( ( RULE_INT ) )
            // InternalProgram.g:2644:1: ( RULE_INT )
            {
            // InternalProgram.g:2644:1: ( RULE_INT )
            // InternalProgram.g:2645:2: RULE_INT
            {
             before(grammarAccess.getEDateAccess().getINTTerminalRuleCall_1_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDateAccess().getINTTerminalRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDate__Group_1__2__Impl"


    // $ANTLR start "rule__Session__Group__0"
    // InternalProgram.g:2655:1: rule__Session__Group__0 : rule__Session__Group__0__Impl rule__Session__Group__1 ;
    public final void rule__Session__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2659:1: ( rule__Session__Group__0__Impl rule__Session__Group__1 )
            // InternalProgram.g:2660:2: rule__Session__Group__0__Impl rule__Session__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalProgram.g:2667:1: rule__Session__Group__0__Impl : ( () ) ;
    public final void rule__Session__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2671:1: ( ( () ) )
            // InternalProgram.g:2672:1: ( () )
            {
            // InternalProgram.g:2672:1: ( () )
            // InternalProgram.g:2673:2: ()
            {
             before(grammarAccess.getSessionAccess().getSessionAction_0()); 
            // InternalProgram.g:2674:2: ()
            // InternalProgram.g:2674:3: 
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
    // InternalProgram.g:2682:1: rule__Session__Group__1 : rule__Session__Group__1__Impl rule__Session__Group__2 ;
    public final void rule__Session__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2686:1: ( rule__Session__Group__1__Impl rule__Session__Group__2 )
            // InternalProgram.g:2687:2: rule__Session__Group__1__Impl rule__Session__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalProgram.g:2694:1: rule__Session__Group__1__Impl : ( 'Session' ) ;
    public final void rule__Session__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2698:1: ( ( 'Session' ) )
            // InternalProgram.g:2699:1: ( 'Session' )
            {
            // InternalProgram.g:2699:1: ( 'Session' )
            // InternalProgram.g:2700:2: 'Session'
            {
             before(grammarAccess.getSessionAccess().getSessionKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getSessionKeyword_1()); 

            }


            }

        }
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
    // InternalProgram.g:2709:1: rule__Session__Group__2 : rule__Session__Group__2__Impl rule__Session__Group__3 ;
    public final void rule__Session__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2713:1: ( rule__Session__Group__2__Impl rule__Session__Group__3 )
            // InternalProgram.g:2714:2: rule__Session__Group__2__Impl rule__Session__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalProgram.g:2721:1: rule__Session__Group__2__Impl : ( '{' ) ;
    public final void rule__Session__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2725:1: ( ( '{' ) )
            // InternalProgram.g:2726:1: ( '{' )
            {
            // InternalProgram.g:2726:1: ( '{' )
            // InternalProgram.g:2727:2: '{'
            {
             before(grammarAccess.getSessionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalProgram.g:2736:1: rule__Session__Group__3 : rule__Session__Group__3__Impl rule__Session__Group__4 ;
    public final void rule__Session__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2740:1: ( rule__Session__Group__3__Impl rule__Session__Group__4 )
            // InternalProgram.g:2741:2: rule__Session__Group__3__Impl rule__Session__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalProgram.g:2748:1: rule__Session__Group__3__Impl : ( ( rule__Session__Group_3__0 )? ) ;
    public final void rule__Session__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2752:1: ( ( ( rule__Session__Group_3__0 )? ) )
            // InternalProgram.g:2753:1: ( ( rule__Session__Group_3__0 )? )
            {
            // InternalProgram.g:2753:1: ( ( rule__Session__Group_3__0 )? )
            // InternalProgram.g:2754:2: ( rule__Session__Group_3__0 )?
            {
             before(grammarAccess.getSessionAccess().getGroup_3()); 
            // InternalProgram.g:2755:2: ( rule__Session__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalProgram.g:2755:3: rule__Session__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Session__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSessionAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalProgram.g:2763:1: rule__Session__Group__4 : rule__Session__Group__4__Impl rule__Session__Group__5 ;
    public final void rule__Session__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2767:1: ( rule__Session__Group__4__Impl rule__Session__Group__5 )
            // InternalProgram.g:2768:2: rule__Session__Group__4__Impl rule__Session__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalProgram.g:2775:1: rule__Session__Group__4__Impl : ( ( rule__Session__Group_4__0 )? ) ;
    public final void rule__Session__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2779:1: ( ( ( rule__Session__Group_4__0 )? ) )
            // InternalProgram.g:2780:1: ( ( rule__Session__Group_4__0 )? )
            {
            // InternalProgram.g:2780:1: ( ( rule__Session__Group_4__0 )? )
            // InternalProgram.g:2781:2: ( rule__Session__Group_4__0 )?
            {
             before(grammarAccess.getSessionAccess().getGroup_4()); 
            // InternalProgram.g:2782:2: ( rule__Session__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==40) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalProgram.g:2782:3: rule__Session__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Session__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSessionAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalProgram.g:2790:1: rule__Session__Group__5 : rule__Session__Group__5__Impl rule__Session__Group__6 ;
    public final void rule__Session__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2794:1: ( rule__Session__Group__5__Impl rule__Session__Group__6 )
            // InternalProgram.g:2795:2: rule__Session__Group__5__Impl rule__Session__Group__6
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
    // InternalProgram.g:2802:1: rule__Session__Group__5__Impl : ( ( rule__Session__Group_5__0 )? ) ;
    public final void rule__Session__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2806:1: ( ( ( rule__Session__Group_5__0 )? ) )
            // InternalProgram.g:2807:1: ( ( rule__Session__Group_5__0 )? )
            {
            // InternalProgram.g:2807:1: ( ( rule__Session__Group_5__0 )? )
            // InternalProgram.g:2808:2: ( rule__Session__Group_5__0 )?
            {
             before(grammarAccess.getSessionAccess().getGroup_5()); 
            // InternalProgram.g:2809:2: ( rule__Session__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalProgram.g:2809:3: rule__Session__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Session__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSessionAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalProgram.g:2817:1: rule__Session__Group__6 : rule__Session__Group__6__Impl rule__Session__Group__7 ;
    public final void rule__Session__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2821:1: ( rule__Session__Group__6__Impl rule__Session__Group__7 )
            // InternalProgram.g:2822:2: rule__Session__Group__6__Impl rule__Session__Group__7
            {
            pushFollow(FOLLOW_23);
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
    // InternalProgram.g:2829:1: rule__Session__Group__6__Impl : ( ( rule__Session__Group_6__0 )? ) ;
    public final void rule__Session__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2833:1: ( ( ( rule__Session__Group_6__0 )? ) )
            // InternalProgram.g:2834:1: ( ( rule__Session__Group_6__0 )? )
            {
            // InternalProgram.g:2834:1: ( ( rule__Session__Group_6__0 )? )
            // InternalProgram.g:2835:2: ( rule__Session__Group_6__0 )?
            {
             before(grammarAccess.getSessionAccess().getGroup_6()); 
            // InternalProgram.g:2836:2: ( rule__Session__Group_6__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==43) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalProgram.g:2836:3: rule__Session__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Session__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSessionAccess().getGroup_6()); 

            }


            }

        }
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
    // InternalProgram.g:2844:1: rule__Session__Group__7 : rule__Session__Group__7__Impl ;
    public final void rule__Session__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2848:1: ( rule__Session__Group__7__Impl )
            // InternalProgram.g:2849:2: rule__Session__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Session__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:2855:1: rule__Session__Group__7__Impl : ( '}' ) ;
    public final void rule__Session__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2859:1: ( ( '}' ) )
            // InternalProgram.g:2860:1: ( '}' )
            {
            // InternalProgram.g:2860:1: ( '}' )
            // InternalProgram.g:2861:2: '}'
            {
             before(grammarAccess.getSessionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Session__Group_3__0"
    // InternalProgram.g:2871:1: rule__Session__Group_3__0 : rule__Session__Group_3__0__Impl rule__Session__Group_3__1 ;
    public final void rule__Session__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2875:1: ( rule__Session__Group_3__0__Impl rule__Session__Group_3__1 )
            // InternalProgram.g:2876:2: rule__Session__Group_3__0__Impl rule__Session__Group_3__1
            {
            pushFollow(FOLLOW_19);
            rule__Session__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_3__0"


    // $ANTLR start "rule__Session__Group_3__0__Impl"
    // InternalProgram.g:2883:1: rule__Session__Group_3__0__Impl : ( 'startingTime' ) ;
    public final void rule__Session__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2887:1: ( ( 'startingTime' ) )
            // InternalProgram.g:2888:1: ( 'startingTime' )
            {
            // InternalProgram.g:2888:1: ( 'startingTime' )
            // InternalProgram.g:2889:2: 'startingTime'
            {
             before(grammarAccess.getSessionAccess().getStartingTimeKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getStartingTimeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_3__0__Impl"


    // $ANTLR start "rule__Session__Group_3__1"
    // InternalProgram.g:2898:1: rule__Session__Group_3__1 : rule__Session__Group_3__1__Impl ;
    public final void rule__Session__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2902:1: ( rule__Session__Group_3__1__Impl )
            // InternalProgram.g:2903:2: rule__Session__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Session__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_3__1"


    // $ANTLR start "rule__Session__Group_3__1__Impl"
    // InternalProgram.g:2909:1: rule__Session__Group_3__1__Impl : ( ( rule__Session__StartingTimeAssignment_3_1 ) ) ;
    public final void rule__Session__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2913:1: ( ( ( rule__Session__StartingTimeAssignment_3_1 ) ) )
            // InternalProgram.g:2914:1: ( ( rule__Session__StartingTimeAssignment_3_1 ) )
            {
            // InternalProgram.g:2914:1: ( ( rule__Session__StartingTimeAssignment_3_1 ) )
            // InternalProgram.g:2915:2: ( rule__Session__StartingTimeAssignment_3_1 )
            {
             before(grammarAccess.getSessionAccess().getStartingTimeAssignment_3_1()); 
            // InternalProgram.g:2916:2: ( rule__Session__StartingTimeAssignment_3_1 )
            // InternalProgram.g:2916:3: rule__Session__StartingTimeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Session__StartingTimeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getStartingTimeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_3__1__Impl"


    // $ANTLR start "rule__Session__Group_4__0"
    // InternalProgram.g:2925:1: rule__Session__Group_4__0 : rule__Session__Group_4__0__Impl rule__Session__Group_4__1 ;
    public final void rule__Session__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2929:1: ( rule__Session__Group_4__0__Impl rule__Session__Group_4__1 )
            // InternalProgram.g:2930:2: rule__Session__Group_4__0__Impl rule__Session__Group_4__1
            {
            pushFollow(FOLLOW_19);
            rule__Session__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_4__0"


    // $ANTLR start "rule__Session__Group_4__0__Impl"
    // InternalProgram.g:2937:1: rule__Session__Group_4__0__Impl : ( 'endingTime' ) ;
    public final void rule__Session__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2941:1: ( ( 'endingTime' ) )
            // InternalProgram.g:2942:1: ( 'endingTime' )
            {
            // InternalProgram.g:2942:1: ( 'endingTime' )
            // InternalProgram.g:2943:2: 'endingTime'
            {
             before(grammarAccess.getSessionAccess().getEndingTimeKeyword_4_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getEndingTimeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_4__0__Impl"


    // $ANTLR start "rule__Session__Group_4__1"
    // InternalProgram.g:2952:1: rule__Session__Group_4__1 : rule__Session__Group_4__1__Impl ;
    public final void rule__Session__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2956:1: ( rule__Session__Group_4__1__Impl )
            // InternalProgram.g:2957:2: rule__Session__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Session__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_4__1"


    // $ANTLR start "rule__Session__Group_4__1__Impl"
    // InternalProgram.g:2963:1: rule__Session__Group_4__1__Impl : ( ( rule__Session__EndingTimeAssignment_4_1 ) ) ;
    public final void rule__Session__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2967:1: ( ( ( rule__Session__EndingTimeAssignment_4_1 ) ) )
            // InternalProgram.g:2968:1: ( ( rule__Session__EndingTimeAssignment_4_1 ) )
            {
            // InternalProgram.g:2968:1: ( ( rule__Session__EndingTimeAssignment_4_1 ) )
            // InternalProgram.g:2969:2: ( rule__Session__EndingTimeAssignment_4_1 )
            {
             before(grammarAccess.getSessionAccess().getEndingTimeAssignment_4_1()); 
            // InternalProgram.g:2970:2: ( rule__Session__EndingTimeAssignment_4_1 )
            // InternalProgram.g:2970:3: rule__Session__EndingTimeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Session__EndingTimeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getEndingTimeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_4__1__Impl"


    // $ANTLR start "rule__Session__Group_5__0"
    // InternalProgram.g:2979:1: rule__Session__Group_5__0 : rule__Session__Group_5__0__Impl rule__Session__Group_5__1 ;
    public final void rule__Session__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2983:1: ( rule__Session__Group_5__0__Impl rule__Session__Group_5__1 )
            // InternalProgram.g:2984:2: rule__Session__Group_5__0__Impl rule__Session__Group_5__1
            {
            pushFollow(FOLLOW_24);
            rule__Session__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_5__0"


    // $ANTLR start "rule__Session__Group_5__0__Impl"
    // InternalProgram.g:2991:1: rule__Session__Group_5__0__Impl : ( 'events' ) ;
    public final void rule__Session__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:2995:1: ( ( 'events' ) )
            // InternalProgram.g:2996:1: ( 'events' )
            {
            // InternalProgram.g:2996:1: ( 'events' )
            // InternalProgram.g:2997:2: 'events'
            {
             before(grammarAccess.getSessionAccess().getEventsKeyword_5_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getEventsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_5__0__Impl"


    // $ANTLR start "rule__Session__Group_5__1"
    // InternalProgram.g:3006:1: rule__Session__Group_5__1 : rule__Session__Group_5__1__Impl rule__Session__Group_5__2 ;
    public final void rule__Session__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3010:1: ( rule__Session__Group_5__1__Impl rule__Session__Group_5__2 )
            // InternalProgram.g:3011:2: rule__Session__Group_5__1__Impl rule__Session__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__Session__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_5__1"


    // $ANTLR start "rule__Session__Group_5__1__Impl"
    // InternalProgram.g:3018:1: rule__Session__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Session__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3022:1: ( ( '(' ) )
            // InternalProgram.g:3023:1: ( '(' )
            {
            // InternalProgram.g:3023:1: ( '(' )
            // InternalProgram.g:3024:2: '('
            {
             before(grammarAccess.getSessionAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_5__1__Impl"


    // $ANTLR start "rule__Session__Group_5__2"
    // InternalProgram.g:3033:1: rule__Session__Group_5__2 : rule__Session__Group_5__2__Impl rule__Session__Group_5__3 ;
    public final void rule__Session__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3037:1: ( rule__Session__Group_5__2__Impl rule__Session__Group_5__3 )
            // InternalProgram.g:3038:2: rule__Session__Group_5__2__Impl rule__Session__Group_5__3
            {
            pushFollow(FOLLOW_25);
            rule__Session__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_5__2"


    // $ANTLR start "rule__Session__Group_5__2__Impl"
    // InternalProgram.g:3045:1: rule__Session__Group_5__2__Impl : ( ( rule__Session__EventsAssignment_5_2 ) ) ;
    public final void rule__Session__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3049:1: ( ( ( rule__Session__EventsAssignment_5_2 ) ) )
            // InternalProgram.g:3050:1: ( ( rule__Session__EventsAssignment_5_2 ) )
            {
            // InternalProgram.g:3050:1: ( ( rule__Session__EventsAssignment_5_2 ) )
            // InternalProgram.g:3051:2: ( rule__Session__EventsAssignment_5_2 )
            {
             before(grammarAccess.getSessionAccess().getEventsAssignment_5_2()); 
            // InternalProgram.g:3052:2: ( rule__Session__EventsAssignment_5_2 )
            // InternalProgram.g:3052:3: rule__Session__EventsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Session__EventsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getEventsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_5__2__Impl"


    // $ANTLR start "rule__Session__Group_5__3"
    // InternalProgram.g:3060:1: rule__Session__Group_5__3 : rule__Session__Group_5__3__Impl rule__Session__Group_5__4 ;
    public final void rule__Session__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3064:1: ( rule__Session__Group_5__3__Impl rule__Session__Group_5__4 )
            // InternalProgram.g:3065:2: rule__Session__Group_5__3__Impl rule__Session__Group_5__4
            {
            pushFollow(FOLLOW_25);
            rule__Session__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_5__3"


    // $ANTLR start "rule__Session__Group_5__3__Impl"
    // InternalProgram.g:3072:1: rule__Session__Group_5__3__Impl : ( ( rule__Session__Group_5_3__0 )* ) ;
    public final void rule__Session__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3076:1: ( ( ( rule__Session__Group_5_3__0 )* ) )
            // InternalProgram.g:3077:1: ( ( rule__Session__Group_5_3__0 )* )
            {
            // InternalProgram.g:3077:1: ( ( rule__Session__Group_5_3__0 )* )
            // InternalProgram.g:3078:2: ( rule__Session__Group_5_3__0 )*
            {
             before(grammarAccess.getSessionAccess().getGroup_5_3()); 
            // InternalProgram.g:3079:2: ( rule__Session__Group_5_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==24) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalProgram.g:3079:3: rule__Session__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Session__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getSessionAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_5__3__Impl"


    // $ANTLR start "rule__Session__Group_5__4"
    // InternalProgram.g:3087:1: rule__Session__Group_5__4 : rule__Session__Group_5__4__Impl ;
    public final void rule__Session__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3091:1: ( rule__Session__Group_5__4__Impl )
            // InternalProgram.g:3092:2: rule__Session__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Session__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_5__4"


    // $ANTLR start "rule__Session__Group_5__4__Impl"
    // InternalProgram.g:3098:1: rule__Session__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Session__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3102:1: ( ( ')' ) )
            // InternalProgram.g:3103:1: ( ')' )
            {
            // InternalProgram.g:3103:1: ( ')' )
            // InternalProgram.g:3104:2: ')'
            {
             before(grammarAccess.getSessionAccess().getRightParenthesisKeyword_5_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_5__4__Impl"


    // $ANTLR start "rule__Session__Group_5_3__0"
    // InternalProgram.g:3114:1: rule__Session__Group_5_3__0 : rule__Session__Group_5_3__0__Impl rule__Session__Group_5_3__1 ;
    public final void rule__Session__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3118:1: ( rule__Session__Group_5_3__0__Impl rule__Session__Group_5_3__1 )
            // InternalProgram.g:3119:2: rule__Session__Group_5_3__0__Impl rule__Session__Group_5_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Session__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_5_3__0"


    // $ANTLR start "rule__Session__Group_5_3__0__Impl"
    // InternalProgram.g:3126:1: rule__Session__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Session__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3130:1: ( ( ',' ) )
            // InternalProgram.g:3131:1: ( ',' )
            {
            // InternalProgram.g:3131:1: ( ',' )
            // InternalProgram.g:3132:2: ','
            {
             before(grammarAccess.getSessionAccess().getCommaKeyword_5_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_5_3__0__Impl"


    // $ANTLR start "rule__Session__Group_5_3__1"
    // InternalProgram.g:3141:1: rule__Session__Group_5_3__1 : rule__Session__Group_5_3__1__Impl ;
    public final void rule__Session__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3145:1: ( rule__Session__Group_5_3__1__Impl )
            // InternalProgram.g:3146:2: rule__Session__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Session__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_5_3__1"


    // $ANTLR start "rule__Session__Group_5_3__1__Impl"
    // InternalProgram.g:3152:1: rule__Session__Group_5_3__1__Impl : ( ( rule__Session__EventsAssignment_5_3_1 ) ) ;
    public final void rule__Session__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3156:1: ( ( ( rule__Session__EventsAssignment_5_3_1 ) ) )
            // InternalProgram.g:3157:1: ( ( rule__Session__EventsAssignment_5_3_1 ) )
            {
            // InternalProgram.g:3157:1: ( ( rule__Session__EventsAssignment_5_3_1 ) )
            // InternalProgram.g:3158:2: ( rule__Session__EventsAssignment_5_3_1 )
            {
             before(grammarAccess.getSessionAccess().getEventsAssignment_5_3_1()); 
            // InternalProgram.g:3159:2: ( rule__Session__EventsAssignment_5_3_1 )
            // InternalProgram.g:3159:3: rule__Session__EventsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Session__EventsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getEventsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_5_3__1__Impl"


    // $ANTLR start "rule__Session__Group_6__0"
    // InternalProgram.g:3168:1: rule__Session__Group_6__0 : rule__Session__Group_6__0__Impl rule__Session__Group_6__1 ;
    public final void rule__Session__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3172:1: ( rule__Session__Group_6__0__Impl rule__Session__Group_6__1 )
            // InternalProgram.g:3173:2: rule__Session__Group_6__0__Impl rule__Session__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Session__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_6__0"


    // $ANTLR start "rule__Session__Group_6__0__Impl"
    // InternalProgram.g:3180:1: rule__Session__Group_6__0__Impl : ( 'room' ) ;
    public final void rule__Session__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3184:1: ( ( 'room' ) )
            // InternalProgram.g:3185:1: ( 'room' )
            {
            // InternalProgram.g:3185:1: ( 'room' )
            // InternalProgram.g:3186:2: 'room'
            {
             before(grammarAccess.getSessionAccess().getRoomKeyword_6_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getRoomKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_6__0__Impl"


    // $ANTLR start "rule__Session__Group_6__1"
    // InternalProgram.g:3195:1: rule__Session__Group_6__1 : rule__Session__Group_6__1__Impl ;
    public final void rule__Session__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3199:1: ( rule__Session__Group_6__1__Impl )
            // InternalProgram.g:3200:2: rule__Session__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Session__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_6__1"


    // $ANTLR start "rule__Session__Group_6__1__Impl"
    // InternalProgram.g:3206:1: rule__Session__Group_6__1__Impl : ( ( rule__Session__RoomAssignment_6_1 ) ) ;
    public final void rule__Session__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3210:1: ( ( ( rule__Session__RoomAssignment_6_1 ) ) )
            // InternalProgram.g:3211:1: ( ( rule__Session__RoomAssignment_6_1 ) )
            {
            // InternalProgram.g:3211:1: ( ( rule__Session__RoomAssignment_6_1 ) )
            // InternalProgram.g:3212:2: ( rule__Session__RoomAssignment_6_1 )
            {
             before(grammarAccess.getSessionAccess().getRoomAssignment_6_1()); 
            // InternalProgram.g:3213:2: ( rule__Session__RoomAssignment_6_1 )
            // InternalProgram.g:3213:3: rule__Session__RoomAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Session__RoomAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getRoomAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_6__1__Impl"


    // $ANTLR start "rule__TalkSession__Group__0"
    // InternalProgram.g:3222:1: rule__TalkSession__Group__0 : rule__TalkSession__Group__0__Impl rule__TalkSession__Group__1 ;
    public final void rule__TalkSession__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3226:1: ( rule__TalkSession__Group__0__Impl rule__TalkSession__Group__1 )
            // InternalProgram.g:3227:2: rule__TalkSession__Group__0__Impl rule__TalkSession__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalProgram.g:3234:1: rule__TalkSession__Group__0__Impl : ( 'TalkSession' ) ;
    public final void rule__TalkSession__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3238:1: ( ( 'TalkSession' ) )
            // InternalProgram.g:3239:1: ( 'TalkSession' )
            {
            // InternalProgram.g:3239:1: ( 'TalkSession' )
            // InternalProgram.g:3240:2: 'TalkSession'
            {
             before(grammarAccess.getTalkSessionAccess().getTalkSessionKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalProgram.g:3249:1: rule__TalkSession__Group__1 : rule__TalkSession__Group__1__Impl rule__TalkSession__Group__2 ;
    public final void rule__TalkSession__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3253:1: ( rule__TalkSession__Group__1__Impl rule__TalkSession__Group__2 )
            // InternalProgram.g:3254:2: rule__TalkSession__Group__1__Impl rule__TalkSession__Group__2
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
    // InternalProgram.g:3261:1: rule__TalkSession__Group__1__Impl : ( '{' ) ;
    public final void rule__TalkSession__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3265:1: ( ( '{' ) )
            // InternalProgram.g:3266:1: ( '{' )
            {
            // InternalProgram.g:3266:1: ( '{' )
            // InternalProgram.g:3267:2: '{'
            {
             before(grammarAccess.getTalkSessionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTalkSessionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalProgram.g:3276:1: rule__TalkSession__Group__2 : rule__TalkSession__Group__2__Impl rule__TalkSession__Group__3 ;
    public final void rule__TalkSession__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3280:1: ( rule__TalkSession__Group__2__Impl rule__TalkSession__Group__3 )
            // InternalProgram.g:3281:2: rule__TalkSession__Group__2__Impl rule__TalkSession__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalProgram.g:3288:1: rule__TalkSession__Group__2__Impl : ( 'title' ) ;
    public final void rule__TalkSession__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3292:1: ( ( 'title' ) )
            // InternalProgram.g:3293:1: ( 'title' )
            {
            // InternalProgram.g:3293:1: ( 'title' )
            // InternalProgram.g:3294:2: 'title'
            {
             before(grammarAccess.getTalkSessionAccess().getTitleKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTalkSessionAccess().getTitleKeyword_2()); 

            }


            }

        }
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
    // InternalProgram.g:3303:1: rule__TalkSession__Group__3 : rule__TalkSession__Group__3__Impl rule__TalkSession__Group__4 ;
    public final void rule__TalkSession__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3307:1: ( rule__TalkSession__Group__3__Impl rule__TalkSession__Group__4 )
            // InternalProgram.g:3308:2: rule__TalkSession__Group__3__Impl rule__TalkSession__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalProgram.g:3315:1: rule__TalkSession__Group__3__Impl : ( ( rule__TalkSession__NameAssignment_3 ) ) ;
    public final void rule__TalkSession__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3319:1: ( ( ( rule__TalkSession__NameAssignment_3 ) ) )
            // InternalProgram.g:3320:1: ( ( rule__TalkSession__NameAssignment_3 ) )
            {
            // InternalProgram.g:3320:1: ( ( rule__TalkSession__NameAssignment_3 ) )
            // InternalProgram.g:3321:2: ( rule__TalkSession__NameAssignment_3 )
            {
             before(grammarAccess.getTalkSessionAccess().getNameAssignment_3()); 
            // InternalProgram.g:3322:2: ( rule__TalkSession__NameAssignment_3 )
            // InternalProgram.g:3322:3: rule__TalkSession__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TalkSession__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTalkSessionAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalProgram.g:3330:1: rule__TalkSession__Group__4 : rule__TalkSession__Group__4__Impl rule__TalkSession__Group__5 ;
    public final void rule__TalkSession__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3334:1: ( rule__TalkSession__Group__4__Impl rule__TalkSession__Group__5 )
            // InternalProgram.g:3335:2: rule__TalkSession__Group__4__Impl rule__TalkSession__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__TalkSession__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TalkSession__Group__5();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:3342:1: rule__TalkSession__Group__4__Impl : ( ( rule__TalkSession__Group_4__0 )? ) ;
    public final void rule__TalkSession__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3346:1: ( ( ( rule__TalkSession__Group_4__0 )? ) )
            // InternalProgram.g:3347:1: ( ( rule__TalkSession__Group_4__0 )? )
            {
            // InternalProgram.g:3347:1: ( ( rule__TalkSession__Group_4__0 )? )
            // InternalProgram.g:3348:2: ( rule__TalkSession__Group_4__0 )?
            {
             before(grammarAccess.getTalkSessionAccess().getGroup_4()); 
            // InternalProgram.g:3349:2: ( rule__TalkSession__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==46) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalProgram.g:3349:3: rule__TalkSession__Group_4__0
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


    // $ANTLR start "rule__TalkSession__Group__5"
    // InternalProgram.g:3357:1: rule__TalkSession__Group__5 : rule__TalkSession__Group__5__Impl rule__TalkSession__Group__6 ;
    public final void rule__TalkSession__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3361:1: ( rule__TalkSession__Group__5__Impl rule__TalkSession__Group__6 )
            // InternalProgram.g:3362:2: rule__TalkSession__Group__5__Impl rule__TalkSession__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__TalkSession__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TalkSession__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group__5"


    // $ANTLR start "rule__TalkSession__Group__5__Impl"
    // InternalProgram.g:3369:1: rule__TalkSession__Group__5__Impl : ( ( rule__TalkSession__Group_5__0 )? ) ;
    public final void rule__TalkSession__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3373:1: ( ( ( rule__TalkSession__Group_5__0 )? ) )
            // InternalProgram.g:3374:1: ( ( rule__TalkSession__Group_5__0 )? )
            {
            // InternalProgram.g:3374:1: ( ( rule__TalkSession__Group_5__0 )? )
            // InternalProgram.g:3375:2: ( rule__TalkSession__Group_5__0 )?
            {
             before(grammarAccess.getTalkSessionAccess().getGroup_5()); 
            // InternalProgram.g:3376:2: ( rule__TalkSession__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==47) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalProgram.g:3376:3: rule__TalkSession__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TalkSession__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTalkSessionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group__5__Impl"


    // $ANTLR start "rule__TalkSession__Group__6"
    // InternalProgram.g:3384:1: rule__TalkSession__Group__6 : rule__TalkSession__Group__6__Impl rule__TalkSession__Group__7 ;
    public final void rule__TalkSession__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3388:1: ( rule__TalkSession__Group__6__Impl rule__TalkSession__Group__7 )
            // InternalProgram.g:3389:2: rule__TalkSession__Group__6__Impl rule__TalkSession__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__TalkSession__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TalkSession__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group__6"


    // $ANTLR start "rule__TalkSession__Group__6__Impl"
    // InternalProgram.g:3396:1: rule__TalkSession__Group__6__Impl : ( ( rule__TalkSession__Group_6__0 )? ) ;
    public final void rule__TalkSession__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3400:1: ( ( ( rule__TalkSession__Group_6__0 )? ) )
            // InternalProgram.g:3401:1: ( ( rule__TalkSession__Group_6__0 )? )
            {
            // InternalProgram.g:3401:1: ( ( rule__TalkSession__Group_6__0 )? )
            // InternalProgram.g:3402:2: ( rule__TalkSession__Group_6__0 )?
            {
             before(grammarAccess.getTalkSessionAccess().getGroup_6()); 
            // InternalProgram.g:3403:2: ( rule__TalkSession__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==48) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalProgram.g:3403:3: rule__TalkSession__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TalkSession__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTalkSessionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group__6__Impl"


    // $ANTLR start "rule__TalkSession__Group__7"
    // InternalProgram.g:3411:1: rule__TalkSession__Group__7 : rule__TalkSession__Group__7__Impl ;
    public final void rule__TalkSession__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3415:1: ( rule__TalkSession__Group__7__Impl )
            // InternalProgram.g:3416:2: rule__TalkSession__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TalkSession__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group__7"


    // $ANTLR start "rule__TalkSession__Group__7__Impl"
    // InternalProgram.g:3422:1: rule__TalkSession__Group__7__Impl : ( '}' ) ;
    public final void rule__TalkSession__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3426:1: ( ( '}' ) )
            // InternalProgram.g:3427:1: ( '}' )
            {
            // InternalProgram.g:3427:1: ( '}' )
            // InternalProgram.g:3428:2: '}'
            {
             before(grammarAccess.getTalkSessionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTalkSessionAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group__7__Impl"


    // $ANTLR start "rule__TalkSession__Group_4__0"
    // InternalProgram.g:3438:1: rule__TalkSession__Group_4__0 : rule__TalkSession__Group_4__0__Impl rule__TalkSession__Group_4__1 ;
    public final void rule__TalkSession__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3442:1: ( rule__TalkSession__Group_4__0__Impl rule__TalkSession__Group_4__1 )
            // InternalProgram.g:3443:2: rule__TalkSession__Group_4__0__Impl rule__TalkSession__Group_4__1
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
    // InternalProgram.g:3450:1: rule__TalkSession__Group_4__0__Impl : ( 'abstract' ) ;
    public final void rule__TalkSession__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3454:1: ( ( 'abstract' ) )
            // InternalProgram.g:3455:1: ( 'abstract' )
            {
            // InternalProgram.g:3455:1: ( 'abstract' )
            // InternalProgram.g:3456:2: 'abstract'
            {
             before(grammarAccess.getTalkSessionAccess().getAbstractKeyword_4_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTalkSessionAccess().getAbstractKeyword_4_0()); 

            }


            }

        }
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
    // InternalProgram.g:3465:1: rule__TalkSession__Group_4__1 : rule__TalkSession__Group_4__1__Impl ;
    public final void rule__TalkSession__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3469:1: ( rule__TalkSession__Group_4__1__Impl )
            // InternalProgram.g:3470:2: rule__TalkSession__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TalkSession__Group_4__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:3476:1: rule__TalkSession__Group_4__1__Impl : ( ( rule__TalkSession__AbstractAssignment_4_1 ) ) ;
    public final void rule__TalkSession__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3480:1: ( ( ( rule__TalkSession__AbstractAssignment_4_1 ) ) )
            // InternalProgram.g:3481:1: ( ( rule__TalkSession__AbstractAssignment_4_1 ) )
            {
            // InternalProgram.g:3481:1: ( ( rule__TalkSession__AbstractAssignment_4_1 ) )
            // InternalProgram.g:3482:2: ( rule__TalkSession__AbstractAssignment_4_1 )
            {
             before(grammarAccess.getTalkSessionAccess().getAbstractAssignment_4_1()); 
            // InternalProgram.g:3483:2: ( rule__TalkSession__AbstractAssignment_4_1 )
            // InternalProgram.g:3483:3: rule__TalkSession__AbstractAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__TalkSession__AbstractAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTalkSessionAccess().getAbstractAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__TalkSession__Group_5__0"
    // InternalProgram.g:3492:1: rule__TalkSession__Group_5__0 : rule__TalkSession__Group_5__0__Impl rule__TalkSession__Group_5__1 ;
    public final void rule__TalkSession__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3496:1: ( rule__TalkSession__Group_5__0__Impl rule__TalkSession__Group_5__1 )
            // InternalProgram.g:3497:2: rule__TalkSession__Group_5__0__Impl rule__TalkSession__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__TalkSession__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TalkSession__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_5__0"


    // $ANTLR start "rule__TalkSession__Group_5__0__Impl"
    // InternalProgram.g:3504:1: rule__TalkSession__Group_5__0__Impl : ( 'papers' ) ;
    public final void rule__TalkSession__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3508:1: ( ( 'papers' ) )
            // InternalProgram.g:3509:1: ( 'papers' )
            {
            // InternalProgram.g:3509:1: ( 'papers' )
            // InternalProgram.g:3510:2: 'papers'
            {
             before(grammarAccess.getTalkSessionAccess().getPapersKeyword_5_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getTalkSessionAccess().getPapersKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_5__0__Impl"


    // $ANTLR start "rule__TalkSession__Group_5__1"
    // InternalProgram.g:3519:1: rule__TalkSession__Group_5__1 : rule__TalkSession__Group_5__1__Impl rule__TalkSession__Group_5__2 ;
    public final void rule__TalkSession__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3523:1: ( rule__TalkSession__Group_5__1__Impl rule__TalkSession__Group_5__2 )
            // InternalProgram.g:3524:2: rule__TalkSession__Group_5__1__Impl rule__TalkSession__Group_5__2
            {
            pushFollow(FOLLOW_28);
            rule__TalkSession__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TalkSession__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_5__1"


    // $ANTLR start "rule__TalkSession__Group_5__1__Impl"
    // InternalProgram.g:3531:1: rule__TalkSession__Group_5__1__Impl : ( '{' ) ;
    public final void rule__TalkSession__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3535:1: ( ( '{' ) )
            // InternalProgram.g:3536:1: ( '{' )
            {
            // InternalProgram.g:3536:1: ( '{' )
            // InternalProgram.g:3537:2: '{'
            {
             before(grammarAccess.getTalkSessionAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTalkSessionAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_5__1__Impl"


    // $ANTLR start "rule__TalkSession__Group_5__2"
    // InternalProgram.g:3546:1: rule__TalkSession__Group_5__2 : rule__TalkSession__Group_5__2__Impl rule__TalkSession__Group_5__3 ;
    public final void rule__TalkSession__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3550:1: ( rule__TalkSession__Group_5__2__Impl rule__TalkSession__Group_5__3 )
            // InternalProgram.g:3551:2: rule__TalkSession__Group_5__2__Impl rule__TalkSession__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__TalkSession__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TalkSession__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_5__2"


    // $ANTLR start "rule__TalkSession__Group_5__2__Impl"
    // InternalProgram.g:3558:1: rule__TalkSession__Group_5__2__Impl : ( ( rule__TalkSession__PapersAssignment_5_2 ) ) ;
    public final void rule__TalkSession__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3562:1: ( ( ( rule__TalkSession__PapersAssignment_5_2 ) ) )
            // InternalProgram.g:3563:1: ( ( rule__TalkSession__PapersAssignment_5_2 ) )
            {
            // InternalProgram.g:3563:1: ( ( rule__TalkSession__PapersAssignment_5_2 ) )
            // InternalProgram.g:3564:2: ( rule__TalkSession__PapersAssignment_5_2 )
            {
             before(grammarAccess.getTalkSessionAccess().getPapersAssignment_5_2()); 
            // InternalProgram.g:3565:2: ( rule__TalkSession__PapersAssignment_5_2 )
            // InternalProgram.g:3565:3: rule__TalkSession__PapersAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__TalkSession__PapersAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getTalkSessionAccess().getPapersAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_5__2__Impl"


    // $ANTLR start "rule__TalkSession__Group_5__3"
    // InternalProgram.g:3573:1: rule__TalkSession__Group_5__3 : rule__TalkSession__Group_5__3__Impl rule__TalkSession__Group_5__4 ;
    public final void rule__TalkSession__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3577:1: ( rule__TalkSession__Group_5__3__Impl rule__TalkSession__Group_5__4 )
            // InternalProgram.g:3578:2: rule__TalkSession__Group_5__3__Impl rule__TalkSession__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__TalkSession__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TalkSession__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_5__3"


    // $ANTLR start "rule__TalkSession__Group_5__3__Impl"
    // InternalProgram.g:3585:1: rule__TalkSession__Group_5__3__Impl : ( ( rule__TalkSession__Group_5_3__0 )* ) ;
    public final void rule__TalkSession__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3589:1: ( ( ( rule__TalkSession__Group_5_3__0 )* ) )
            // InternalProgram.g:3590:1: ( ( rule__TalkSession__Group_5_3__0 )* )
            {
            // InternalProgram.g:3590:1: ( ( rule__TalkSession__Group_5_3__0 )* )
            // InternalProgram.g:3591:2: ( rule__TalkSession__Group_5_3__0 )*
            {
             before(grammarAccess.getTalkSessionAccess().getGroup_5_3()); 
            // InternalProgram.g:3592:2: ( rule__TalkSession__Group_5_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==24) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalProgram.g:3592:3: rule__TalkSession__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__TalkSession__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getTalkSessionAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_5__3__Impl"


    // $ANTLR start "rule__TalkSession__Group_5__4"
    // InternalProgram.g:3600:1: rule__TalkSession__Group_5__4 : rule__TalkSession__Group_5__4__Impl ;
    public final void rule__TalkSession__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3604:1: ( rule__TalkSession__Group_5__4__Impl )
            // InternalProgram.g:3605:2: rule__TalkSession__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TalkSession__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_5__4"


    // $ANTLR start "rule__TalkSession__Group_5__4__Impl"
    // InternalProgram.g:3611:1: rule__TalkSession__Group_5__4__Impl : ( '}' ) ;
    public final void rule__TalkSession__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3615:1: ( ( '}' ) )
            // InternalProgram.g:3616:1: ( '}' )
            {
            // InternalProgram.g:3616:1: ( '}' )
            // InternalProgram.g:3617:2: '}'
            {
             before(grammarAccess.getTalkSessionAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTalkSessionAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_5__4__Impl"


    // $ANTLR start "rule__TalkSession__Group_5_3__0"
    // InternalProgram.g:3627:1: rule__TalkSession__Group_5_3__0 : rule__TalkSession__Group_5_3__0__Impl rule__TalkSession__Group_5_3__1 ;
    public final void rule__TalkSession__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3631:1: ( rule__TalkSession__Group_5_3__0__Impl rule__TalkSession__Group_5_3__1 )
            // InternalProgram.g:3632:2: rule__TalkSession__Group_5_3__0__Impl rule__TalkSession__Group_5_3__1
            {
            pushFollow(FOLLOW_28);
            rule__TalkSession__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TalkSession__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_5_3__0"


    // $ANTLR start "rule__TalkSession__Group_5_3__0__Impl"
    // InternalProgram.g:3639:1: rule__TalkSession__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__TalkSession__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3643:1: ( ( ',' ) )
            // InternalProgram.g:3644:1: ( ',' )
            {
            // InternalProgram.g:3644:1: ( ',' )
            // InternalProgram.g:3645:2: ','
            {
             before(grammarAccess.getTalkSessionAccess().getCommaKeyword_5_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTalkSessionAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_5_3__0__Impl"


    // $ANTLR start "rule__TalkSession__Group_5_3__1"
    // InternalProgram.g:3654:1: rule__TalkSession__Group_5_3__1 : rule__TalkSession__Group_5_3__1__Impl ;
    public final void rule__TalkSession__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3658:1: ( rule__TalkSession__Group_5_3__1__Impl )
            // InternalProgram.g:3659:2: rule__TalkSession__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TalkSession__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_5_3__1"


    // $ANTLR start "rule__TalkSession__Group_5_3__1__Impl"
    // InternalProgram.g:3665:1: rule__TalkSession__Group_5_3__1__Impl : ( ( rule__TalkSession__PapersAssignment_5_3_1 ) ) ;
    public final void rule__TalkSession__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3669:1: ( ( ( rule__TalkSession__PapersAssignment_5_3_1 ) ) )
            // InternalProgram.g:3670:1: ( ( rule__TalkSession__PapersAssignment_5_3_1 ) )
            {
            // InternalProgram.g:3670:1: ( ( rule__TalkSession__PapersAssignment_5_3_1 ) )
            // InternalProgram.g:3671:2: ( rule__TalkSession__PapersAssignment_5_3_1 )
            {
             before(grammarAccess.getTalkSessionAccess().getPapersAssignment_5_3_1()); 
            // InternalProgram.g:3672:2: ( rule__TalkSession__PapersAssignment_5_3_1 )
            // InternalProgram.g:3672:3: rule__TalkSession__PapersAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TalkSession__PapersAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTalkSessionAccess().getPapersAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_5_3__1__Impl"


    // $ANTLR start "rule__TalkSession__Group_6__0"
    // InternalProgram.g:3681:1: rule__TalkSession__Group_6__0 : rule__TalkSession__Group_6__0__Impl rule__TalkSession__Group_6__1 ;
    public final void rule__TalkSession__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3685:1: ( rule__TalkSession__Group_6__0__Impl rule__TalkSession__Group_6__1 )
            // InternalProgram.g:3686:2: rule__TalkSession__Group_6__0__Impl rule__TalkSession__Group_6__1
            {
            pushFollow(FOLLOW_29);
            rule__TalkSession__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TalkSession__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_6__0"


    // $ANTLR start "rule__TalkSession__Group_6__0__Impl"
    // InternalProgram.g:3693:1: rule__TalkSession__Group_6__0__Impl : ( 'chair' ) ;
    public final void rule__TalkSession__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3697:1: ( ( 'chair' ) )
            // InternalProgram.g:3698:1: ( 'chair' )
            {
            // InternalProgram.g:3698:1: ( 'chair' )
            // InternalProgram.g:3699:2: 'chair'
            {
             before(grammarAccess.getTalkSessionAccess().getChairKeyword_6_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getTalkSessionAccess().getChairKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_6__0__Impl"


    // $ANTLR start "rule__TalkSession__Group_6__1"
    // InternalProgram.g:3708:1: rule__TalkSession__Group_6__1 : rule__TalkSession__Group_6__1__Impl ;
    public final void rule__TalkSession__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3712:1: ( rule__TalkSession__Group_6__1__Impl )
            // InternalProgram.g:3713:2: rule__TalkSession__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TalkSession__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_6__1"


    // $ANTLR start "rule__TalkSession__Group_6__1__Impl"
    // InternalProgram.g:3719:1: rule__TalkSession__Group_6__1__Impl : ( ( rule__TalkSession__ChairAssignment_6_1 ) ) ;
    public final void rule__TalkSession__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3723:1: ( ( ( rule__TalkSession__ChairAssignment_6_1 ) ) )
            // InternalProgram.g:3724:1: ( ( rule__TalkSession__ChairAssignment_6_1 ) )
            {
            // InternalProgram.g:3724:1: ( ( rule__TalkSession__ChairAssignment_6_1 ) )
            // InternalProgram.g:3725:2: ( rule__TalkSession__ChairAssignment_6_1 )
            {
             before(grammarAccess.getTalkSessionAccess().getChairAssignment_6_1()); 
            // InternalProgram.g:3726:2: ( rule__TalkSession__ChairAssignment_6_1 )
            // InternalProgram.g:3726:3: rule__TalkSession__ChairAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__TalkSession__ChairAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTalkSessionAccess().getChairAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__Group_6__1__Impl"


    // $ANTLR start "rule__Panel__Group__0"
    // InternalProgram.g:3735:1: rule__Panel__Group__0 : rule__Panel__Group__0__Impl rule__Panel__Group__1 ;
    public final void rule__Panel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3739:1: ( rule__Panel__Group__0__Impl rule__Panel__Group__1 )
            // InternalProgram.g:3740:2: rule__Panel__Group__0__Impl rule__Panel__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalProgram.g:3747:1: rule__Panel__Group__0__Impl : ( 'Panel' ) ;
    public final void rule__Panel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3751:1: ( ( 'Panel' ) )
            // InternalProgram.g:3752:1: ( 'Panel' )
            {
            // InternalProgram.g:3752:1: ( 'Panel' )
            // InternalProgram.g:3753:2: 'Panel'
            {
             before(grammarAccess.getPanelAccess().getPanelKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalProgram.g:3762:1: rule__Panel__Group__1 : rule__Panel__Group__1__Impl rule__Panel__Group__2 ;
    public final void rule__Panel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3766:1: ( rule__Panel__Group__1__Impl rule__Panel__Group__2 )
            // InternalProgram.g:3767:2: rule__Panel__Group__1__Impl rule__Panel__Group__2
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
    // InternalProgram.g:3774:1: rule__Panel__Group__1__Impl : ( '{' ) ;
    public final void rule__Panel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3778:1: ( ( '{' ) )
            // InternalProgram.g:3779:1: ( '{' )
            {
            // InternalProgram.g:3779:1: ( '{' )
            // InternalProgram.g:3780:2: '{'
            {
             before(grammarAccess.getPanelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPanelAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalProgram.g:3789:1: rule__Panel__Group__2 : rule__Panel__Group__2__Impl rule__Panel__Group__3 ;
    public final void rule__Panel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3793:1: ( rule__Panel__Group__2__Impl rule__Panel__Group__3 )
            // InternalProgram.g:3794:2: rule__Panel__Group__2__Impl rule__Panel__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalProgram.g:3801:1: rule__Panel__Group__2__Impl : ( 'title' ) ;
    public final void rule__Panel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3805:1: ( ( 'title' ) )
            // InternalProgram.g:3806:1: ( 'title' )
            {
            // InternalProgram.g:3806:1: ( 'title' )
            // InternalProgram.g:3807:2: 'title'
            {
             before(grammarAccess.getPanelAccess().getTitleKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPanelAccess().getTitleKeyword_2()); 

            }


            }

        }
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
    // InternalProgram.g:3816:1: rule__Panel__Group__3 : rule__Panel__Group__3__Impl rule__Panel__Group__4 ;
    public final void rule__Panel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3820:1: ( rule__Panel__Group__3__Impl rule__Panel__Group__4 )
            // InternalProgram.g:3821:2: rule__Panel__Group__3__Impl rule__Panel__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalProgram.g:3828:1: rule__Panel__Group__3__Impl : ( ( rule__Panel__NameAssignment_3 ) ) ;
    public final void rule__Panel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3832:1: ( ( ( rule__Panel__NameAssignment_3 ) ) )
            // InternalProgram.g:3833:1: ( ( rule__Panel__NameAssignment_3 ) )
            {
            // InternalProgram.g:3833:1: ( ( rule__Panel__NameAssignment_3 ) )
            // InternalProgram.g:3834:2: ( rule__Panel__NameAssignment_3 )
            {
             before(grammarAccess.getPanelAccess().getNameAssignment_3()); 
            // InternalProgram.g:3835:2: ( rule__Panel__NameAssignment_3 )
            // InternalProgram.g:3835:3: rule__Panel__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Panel__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPanelAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalProgram.g:3843:1: rule__Panel__Group__4 : rule__Panel__Group__4__Impl rule__Panel__Group__5 ;
    public final void rule__Panel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3847:1: ( rule__Panel__Group__4__Impl rule__Panel__Group__5 )
            // InternalProgram.g:3848:2: rule__Panel__Group__4__Impl rule__Panel__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalProgram.g:3855:1: rule__Panel__Group__4__Impl : ( ( rule__Panel__Group_4__0 )? ) ;
    public final void rule__Panel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3859:1: ( ( ( rule__Panel__Group_4__0 )? ) )
            // InternalProgram.g:3860:1: ( ( rule__Panel__Group_4__0 )? )
            {
            // InternalProgram.g:3860:1: ( ( rule__Panel__Group_4__0 )? )
            // InternalProgram.g:3861:2: ( rule__Panel__Group_4__0 )?
            {
             before(grammarAccess.getPanelAccess().getGroup_4()); 
            // InternalProgram.g:3862:2: ( rule__Panel__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==46) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalProgram.g:3862:3: rule__Panel__Group_4__0
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
    // InternalProgram.g:3870:1: rule__Panel__Group__5 : rule__Panel__Group__5__Impl rule__Panel__Group__6 ;
    public final void rule__Panel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3874:1: ( rule__Panel__Group__5__Impl rule__Panel__Group__6 )
            // InternalProgram.g:3875:2: rule__Panel__Group__5__Impl rule__Panel__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__Panel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group__6();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:3882:1: rule__Panel__Group__5__Impl : ( ( rule__Panel__Group_5__0 )? ) ;
    public final void rule__Panel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3886:1: ( ( ( rule__Panel__Group_5__0 )? ) )
            // InternalProgram.g:3887:1: ( ( rule__Panel__Group_5__0 )? )
            {
            // InternalProgram.g:3887:1: ( ( rule__Panel__Group_5__0 )? )
            // InternalProgram.g:3888:2: ( rule__Panel__Group_5__0 )?
            {
             before(grammarAccess.getPanelAccess().getGroup_5()); 
            // InternalProgram.g:3889:2: ( rule__Panel__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==50) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalProgram.g:3889:3: rule__Panel__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Panel__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPanelAccess().getGroup_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Panel__Group__6"
    // InternalProgram.g:3897:1: rule__Panel__Group__6 : rule__Panel__Group__6__Impl rule__Panel__Group__7 ;
    public final void rule__Panel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3901:1: ( rule__Panel__Group__6__Impl rule__Panel__Group__7 )
            // InternalProgram.g:3902:2: rule__Panel__Group__6__Impl rule__Panel__Group__7
            {
            pushFollow(FOLLOW_30);
            rule__Panel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__6"


    // $ANTLR start "rule__Panel__Group__6__Impl"
    // InternalProgram.g:3909:1: rule__Panel__Group__6__Impl : ( ( rule__Panel__Group_6__0 )? ) ;
    public final void rule__Panel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3913:1: ( ( ( rule__Panel__Group_6__0 )? ) )
            // InternalProgram.g:3914:1: ( ( rule__Panel__Group_6__0 )? )
            {
            // InternalProgram.g:3914:1: ( ( rule__Panel__Group_6__0 )? )
            // InternalProgram.g:3915:2: ( rule__Panel__Group_6__0 )?
            {
             before(grammarAccess.getPanelAccess().getGroup_6()); 
            // InternalProgram.g:3916:2: ( rule__Panel__Group_6__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==51) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalProgram.g:3916:3: rule__Panel__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Panel__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPanelAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__6__Impl"


    // $ANTLR start "rule__Panel__Group__7"
    // InternalProgram.g:3924:1: rule__Panel__Group__7 : rule__Panel__Group__7__Impl ;
    public final void rule__Panel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3928:1: ( rule__Panel__Group__7__Impl )
            // InternalProgram.g:3929:2: rule__Panel__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Panel__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__7"


    // $ANTLR start "rule__Panel__Group__7__Impl"
    // InternalProgram.g:3935:1: rule__Panel__Group__7__Impl : ( '}' ) ;
    public final void rule__Panel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3939:1: ( ( '}' ) )
            // InternalProgram.g:3940:1: ( '}' )
            {
            // InternalProgram.g:3940:1: ( '}' )
            // InternalProgram.g:3941:2: '}'
            {
             before(grammarAccess.getPanelAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPanelAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__7__Impl"


    // $ANTLR start "rule__Panel__Group_4__0"
    // InternalProgram.g:3951:1: rule__Panel__Group_4__0 : rule__Panel__Group_4__0__Impl rule__Panel__Group_4__1 ;
    public final void rule__Panel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3955:1: ( rule__Panel__Group_4__0__Impl rule__Panel__Group_4__1 )
            // InternalProgram.g:3956:2: rule__Panel__Group_4__0__Impl rule__Panel__Group_4__1
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
    // InternalProgram.g:3963:1: rule__Panel__Group_4__0__Impl : ( 'abstract' ) ;
    public final void rule__Panel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3967:1: ( ( 'abstract' ) )
            // InternalProgram.g:3968:1: ( 'abstract' )
            {
            // InternalProgram.g:3968:1: ( 'abstract' )
            // InternalProgram.g:3969:2: 'abstract'
            {
             before(grammarAccess.getPanelAccess().getAbstractKeyword_4_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getPanelAccess().getAbstractKeyword_4_0()); 

            }


            }

        }
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
    // InternalProgram.g:3978:1: rule__Panel__Group_4__1 : rule__Panel__Group_4__1__Impl ;
    public final void rule__Panel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3982:1: ( rule__Panel__Group_4__1__Impl )
            // InternalProgram.g:3983:2: rule__Panel__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Panel__Group_4__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:3989:1: rule__Panel__Group_4__1__Impl : ( ( rule__Panel__AbstractAssignment_4_1 ) ) ;
    public final void rule__Panel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:3993:1: ( ( ( rule__Panel__AbstractAssignment_4_1 ) ) )
            // InternalProgram.g:3994:1: ( ( rule__Panel__AbstractAssignment_4_1 ) )
            {
            // InternalProgram.g:3994:1: ( ( rule__Panel__AbstractAssignment_4_1 ) )
            // InternalProgram.g:3995:2: ( rule__Panel__AbstractAssignment_4_1 )
            {
             before(grammarAccess.getPanelAccess().getAbstractAssignment_4_1()); 
            // InternalProgram.g:3996:2: ( rule__Panel__AbstractAssignment_4_1 )
            // InternalProgram.g:3996:3: rule__Panel__AbstractAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Panel__AbstractAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPanelAccess().getAbstractAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Panel__Group_5__0"
    // InternalProgram.g:4005:1: rule__Panel__Group_5__0 : rule__Panel__Group_5__0__Impl rule__Panel__Group_5__1 ;
    public final void rule__Panel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4009:1: ( rule__Panel__Group_5__0__Impl rule__Panel__Group_5__1 )
            // InternalProgram.g:4010:2: rule__Panel__Group_5__0__Impl rule__Panel__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Panel__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_5__0"


    // $ANTLR start "rule__Panel__Group_5__0__Impl"
    // InternalProgram.g:4017:1: rule__Panel__Group_5__0__Impl : ( 'panelists' ) ;
    public final void rule__Panel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4021:1: ( ( 'panelists' ) )
            // InternalProgram.g:4022:1: ( 'panelists' )
            {
            // InternalProgram.g:4022:1: ( 'panelists' )
            // InternalProgram.g:4023:2: 'panelists'
            {
             before(grammarAccess.getPanelAccess().getPanelistsKeyword_5_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getPanelAccess().getPanelistsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_5__0__Impl"


    // $ANTLR start "rule__Panel__Group_5__1"
    // InternalProgram.g:4032:1: rule__Panel__Group_5__1 : rule__Panel__Group_5__1__Impl rule__Panel__Group_5__2 ;
    public final void rule__Panel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4036:1: ( rule__Panel__Group_5__1__Impl rule__Panel__Group_5__2 )
            // InternalProgram.g:4037:2: rule__Panel__Group_5__1__Impl rule__Panel__Group_5__2
            {
            pushFollow(FOLLOW_29);
            rule__Panel__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_5__1"


    // $ANTLR start "rule__Panel__Group_5__1__Impl"
    // InternalProgram.g:4044:1: rule__Panel__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Panel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4048:1: ( ( '{' ) )
            // InternalProgram.g:4049:1: ( '{' )
            {
            // InternalProgram.g:4049:1: ( '{' )
            // InternalProgram.g:4050:2: '{'
            {
             before(grammarAccess.getPanelAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPanelAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_5__1__Impl"


    // $ANTLR start "rule__Panel__Group_5__2"
    // InternalProgram.g:4059:1: rule__Panel__Group_5__2 : rule__Panel__Group_5__2__Impl rule__Panel__Group_5__3 ;
    public final void rule__Panel__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4063:1: ( rule__Panel__Group_5__2__Impl rule__Panel__Group_5__3 )
            // InternalProgram.g:4064:2: rule__Panel__Group_5__2__Impl rule__Panel__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__Panel__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_5__2"


    // $ANTLR start "rule__Panel__Group_5__2__Impl"
    // InternalProgram.g:4071:1: rule__Panel__Group_5__2__Impl : ( ( rule__Panel__PanelistsAssignment_5_2 ) ) ;
    public final void rule__Panel__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4075:1: ( ( ( rule__Panel__PanelistsAssignment_5_2 ) ) )
            // InternalProgram.g:4076:1: ( ( rule__Panel__PanelistsAssignment_5_2 ) )
            {
            // InternalProgram.g:4076:1: ( ( rule__Panel__PanelistsAssignment_5_2 ) )
            // InternalProgram.g:4077:2: ( rule__Panel__PanelistsAssignment_5_2 )
            {
             before(grammarAccess.getPanelAccess().getPanelistsAssignment_5_2()); 
            // InternalProgram.g:4078:2: ( rule__Panel__PanelistsAssignment_5_2 )
            // InternalProgram.g:4078:3: rule__Panel__PanelistsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Panel__PanelistsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getPanelAccess().getPanelistsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_5__2__Impl"


    // $ANTLR start "rule__Panel__Group_5__3"
    // InternalProgram.g:4086:1: rule__Panel__Group_5__3 : rule__Panel__Group_5__3__Impl rule__Panel__Group_5__4 ;
    public final void rule__Panel__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4090:1: ( rule__Panel__Group_5__3__Impl rule__Panel__Group_5__4 )
            // InternalProgram.g:4091:2: rule__Panel__Group_5__3__Impl rule__Panel__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__Panel__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_5__3"


    // $ANTLR start "rule__Panel__Group_5__3__Impl"
    // InternalProgram.g:4098:1: rule__Panel__Group_5__3__Impl : ( ( rule__Panel__Group_5_3__0 )* ) ;
    public final void rule__Panel__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4102:1: ( ( ( rule__Panel__Group_5_3__0 )* ) )
            // InternalProgram.g:4103:1: ( ( rule__Panel__Group_5_3__0 )* )
            {
            // InternalProgram.g:4103:1: ( ( rule__Panel__Group_5_3__0 )* )
            // InternalProgram.g:4104:2: ( rule__Panel__Group_5_3__0 )*
            {
             before(grammarAccess.getPanelAccess().getGroup_5_3()); 
            // InternalProgram.g:4105:2: ( rule__Panel__Group_5_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==24) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalProgram.g:4105:3: rule__Panel__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Panel__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getPanelAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_5__3__Impl"


    // $ANTLR start "rule__Panel__Group_5__4"
    // InternalProgram.g:4113:1: rule__Panel__Group_5__4 : rule__Panel__Group_5__4__Impl ;
    public final void rule__Panel__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4117:1: ( rule__Panel__Group_5__4__Impl )
            // InternalProgram.g:4118:2: rule__Panel__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Panel__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_5__4"


    // $ANTLR start "rule__Panel__Group_5__4__Impl"
    // InternalProgram.g:4124:1: rule__Panel__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Panel__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4128:1: ( ( '}' ) )
            // InternalProgram.g:4129:1: ( '}' )
            {
            // InternalProgram.g:4129:1: ( '}' )
            // InternalProgram.g:4130:2: '}'
            {
             before(grammarAccess.getPanelAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPanelAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_5__4__Impl"


    // $ANTLR start "rule__Panel__Group_5_3__0"
    // InternalProgram.g:4140:1: rule__Panel__Group_5_3__0 : rule__Panel__Group_5_3__0__Impl rule__Panel__Group_5_3__1 ;
    public final void rule__Panel__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4144:1: ( rule__Panel__Group_5_3__0__Impl rule__Panel__Group_5_3__1 )
            // InternalProgram.g:4145:2: rule__Panel__Group_5_3__0__Impl rule__Panel__Group_5_3__1
            {
            pushFollow(FOLLOW_29);
            rule__Panel__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_5_3__0"


    // $ANTLR start "rule__Panel__Group_5_3__0__Impl"
    // InternalProgram.g:4152:1: rule__Panel__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Panel__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4156:1: ( ( ',' ) )
            // InternalProgram.g:4157:1: ( ',' )
            {
            // InternalProgram.g:4157:1: ( ',' )
            // InternalProgram.g:4158:2: ','
            {
             before(grammarAccess.getPanelAccess().getCommaKeyword_5_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPanelAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_5_3__0__Impl"


    // $ANTLR start "rule__Panel__Group_5_3__1"
    // InternalProgram.g:4167:1: rule__Panel__Group_5_3__1 : rule__Panel__Group_5_3__1__Impl ;
    public final void rule__Panel__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4171:1: ( rule__Panel__Group_5_3__1__Impl )
            // InternalProgram.g:4172:2: rule__Panel__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Panel__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_5_3__1"


    // $ANTLR start "rule__Panel__Group_5_3__1__Impl"
    // InternalProgram.g:4178:1: rule__Panel__Group_5_3__1__Impl : ( ( rule__Panel__PanelistsAssignment_5_3_1 ) ) ;
    public final void rule__Panel__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4182:1: ( ( ( rule__Panel__PanelistsAssignment_5_3_1 ) ) )
            // InternalProgram.g:4183:1: ( ( rule__Panel__PanelistsAssignment_5_3_1 ) )
            {
            // InternalProgram.g:4183:1: ( ( rule__Panel__PanelistsAssignment_5_3_1 ) )
            // InternalProgram.g:4184:2: ( rule__Panel__PanelistsAssignment_5_3_1 )
            {
             before(grammarAccess.getPanelAccess().getPanelistsAssignment_5_3_1()); 
            // InternalProgram.g:4185:2: ( rule__Panel__PanelistsAssignment_5_3_1 )
            // InternalProgram.g:4185:3: rule__Panel__PanelistsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Panel__PanelistsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPanelAccess().getPanelistsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_5_3__1__Impl"


    // $ANTLR start "rule__Panel__Group_6__0"
    // InternalProgram.g:4194:1: rule__Panel__Group_6__0 : rule__Panel__Group_6__0__Impl rule__Panel__Group_6__1 ;
    public final void rule__Panel__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4198:1: ( rule__Panel__Group_6__0__Impl rule__Panel__Group_6__1 )
            // InternalProgram.g:4199:2: rule__Panel__Group_6__0__Impl rule__Panel__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__Panel__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_6__0"


    // $ANTLR start "rule__Panel__Group_6__0__Impl"
    // InternalProgram.g:4206:1: rule__Panel__Group_6__0__Impl : ( 'moderators' ) ;
    public final void rule__Panel__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4210:1: ( ( 'moderators' ) )
            // InternalProgram.g:4211:1: ( 'moderators' )
            {
            // InternalProgram.g:4211:1: ( 'moderators' )
            // InternalProgram.g:4212:2: 'moderators'
            {
             before(grammarAccess.getPanelAccess().getModeratorsKeyword_6_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getPanelAccess().getModeratorsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_6__0__Impl"


    // $ANTLR start "rule__Panel__Group_6__1"
    // InternalProgram.g:4221:1: rule__Panel__Group_6__1 : rule__Panel__Group_6__1__Impl rule__Panel__Group_6__2 ;
    public final void rule__Panel__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4225:1: ( rule__Panel__Group_6__1__Impl rule__Panel__Group_6__2 )
            // InternalProgram.g:4226:2: rule__Panel__Group_6__1__Impl rule__Panel__Group_6__2
            {
            pushFollow(FOLLOW_29);
            rule__Panel__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_6__1"


    // $ANTLR start "rule__Panel__Group_6__1__Impl"
    // InternalProgram.g:4233:1: rule__Panel__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Panel__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4237:1: ( ( '{' ) )
            // InternalProgram.g:4238:1: ( '{' )
            {
            // InternalProgram.g:4238:1: ( '{' )
            // InternalProgram.g:4239:2: '{'
            {
             before(grammarAccess.getPanelAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPanelAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_6__1__Impl"


    // $ANTLR start "rule__Panel__Group_6__2"
    // InternalProgram.g:4248:1: rule__Panel__Group_6__2 : rule__Panel__Group_6__2__Impl rule__Panel__Group_6__3 ;
    public final void rule__Panel__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4252:1: ( rule__Panel__Group_6__2__Impl rule__Panel__Group_6__3 )
            // InternalProgram.g:4253:2: rule__Panel__Group_6__2__Impl rule__Panel__Group_6__3
            {
            pushFollow(FOLLOW_8);
            rule__Panel__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_6__2"


    // $ANTLR start "rule__Panel__Group_6__2__Impl"
    // InternalProgram.g:4260:1: rule__Panel__Group_6__2__Impl : ( ( rule__Panel__ModeratorsAssignment_6_2 ) ) ;
    public final void rule__Panel__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4264:1: ( ( ( rule__Panel__ModeratorsAssignment_6_2 ) ) )
            // InternalProgram.g:4265:1: ( ( rule__Panel__ModeratorsAssignment_6_2 ) )
            {
            // InternalProgram.g:4265:1: ( ( rule__Panel__ModeratorsAssignment_6_2 ) )
            // InternalProgram.g:4266:2: ( rule__Panel__ModeratorsAssignment_6_2 )
            {
             before(grammarAccess.getPanelAccess().getModeratorsAssignment_6_2()); 
            // InternalProgram.g:4267:2: ( rule__Panel__ModeratorsAssignment_6_2 )
            // InternalProgram.g:4267:3: rule__Panel__ModeratorsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Panel__ModeratorsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getPanelAccess().getModeratorsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_6__2__Impl"


    // $ANTLR start "rule__Panel__Group_6__3"
    // InternalProgram.g:4275:1: rule__Panel__Group_6__3 : rule__Panel__Group_6__3__Impl rule__Panel__Group_6__4 ;
    public final void rule__Panel__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4279:1: ( rule__Panel__Group_6__3__Impl rule__Panel__Group_6__4 )
            // InternalProgram.g:4280:2: rule__Panel__Group_6__3__Impl rule__Panel__Group_6__4
            {
            pushFollow(FOLLOW_8);
            rule__Panel__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_6__3"


    // $ANTLR start "rule__Panel__Group_6__3__Impl"
    // InternalProgram.g:4287:1: rule__Panel__Group_6__3__Impl : ( ( rule__Panel__Group_6_3__0 )* ) ;
    public final void rule__Panel__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4291:1: ( ( ( rule__Panel__Group_6_3__0 )* ) )
            // InternalProgram.g:4292:1: ( ( rule__Panel__Group_6_3__0 )* )
            {
            // InternalProgram.g:4292:1: ( ( rule__Panel__Group_6_3__0 )* )
            // InternalProgram.g:4293:2: ( rule__Panel__Group_6_3__0 )*
            {
             before(grammarAccess.getPanelAccess().getGroup_6_3()); 
            // InternalProgram.g:4294:2: ( rule__Panel__Group_6_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==24) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalProgram.g:4294:3: rule__Panel__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Panel__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getPanelAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_6__3__Impl"


    // $ANTLR start "rule__Panel__Group_6__4"
    // InternalProgram.g:4302:1: rule__Panel__Group_6__4 : rule__Panel__Group_6__4__Impl ;
    public final void rule__Panel__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4306:1: ( rule__Panel__Group_6__4__Impl )
            // InternalProgram.g:4307:2: rule__Panel__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Panel__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_6__4"


    // $ANTLR start "rule__Panel__Group_6__4__Impl"
    // InternalProgram.g:4313:1: rule__Panel__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Panel__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4317:1: ( ( '}' ) )
            // InternalProgram.g:4318:1: ( '}' )
            {
            // InternalProgram.g:4318:1: ( '}' )
            // InternalProgram.g:4319:2: '}'
            {
             before(grammarAccess.getPanelAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPanelAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_6__4__Impl"


    // $ANTLR start "rule__Panel__Group_6_3__0"
    // InternalProgram.g:4329:1: rule__Panel__Group_6_3__0 : rule__Panel__Group_6_3__0__Impl rule__Panel__Group_6_3__1 ;
    public final void rule__Panel__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4333:1: ( rule__Panel__Group_6_3__0__Impl rule__Panel__Group_6_3__1 )
            // InternalProgram.g:4334:2: rule__Panel__Group_6_3__0__Impl rule__Panel__Group_6_3__1
            {
            pushFollow(FOLLOW_29);
            rule__Panel__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panel__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_6_3__0"


    // $ANTLR start "rule__Panel__Group_6_3__0__Impl"
    // InternalProgram.g:4341:1: rule__Panel__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Panel__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4345:1: ( ( ',' ) )
            // InternalProgram.g:4346:1: ( ',' )
            {
            // InternalProgram.g:4346:1: ( ',' )
            // InternalProgram.g:4347:2: ','
            {
             before(grammarAccess.getPanelAccess().getCommaKeyword_6_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPanelAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_6_3__0__Impl"


    // $ANTLR start "rule__Panel__Group_6_3__1"
    // InternalProgram.g:4356:1: rule__Panel__Group_6_3__1 : rule__Panel__Group_6_3__1__Impl ;
    public final void rule__Panel__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4360:1: ( rule__Panel__Group_6_3__1__Impl )
            // InternalProgram.g:4361:2: rule__Panel__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Panel__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_6_3__1"


    // $ANTLR start "rule__Panel__Group_6_3__1__Impl"
    // InternalProgram.g:4367:1: rule__Panel__Group_6_3__1__Impl : ( ( rule__Panel__ModeratorsAssignment_6_3_1 ) ) ;
    public final void rule__Panel__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4371:1: ( ( ( rule__Panel__ModeratorsAssignment_6_3_1 ) ) )
            // InternalProgram.g:4372:1: ( ( rule__Panel__ModeratorsAssignment_6_3_1 ) )
            {
            // InternalProgram.g:4372:1: ( ( rule__Panel__ModeratorsAssignment_6_3_1 ) )
            // InternalProgram.g:4373:2: ( rule__Panel__ModeratorsAssignment_6_3_1 )
            {
             before(grammarAccess.getPanelAccess().getModeratorsAssignment_6_3_1()); 
            // InternalProgram.g:4374:2: ( rule__Panel__ModeratorsAssignment_6_3_1 )
            // InternalProgram.g:4374:3: rule__Panel__ModeratorsAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Panel__ModeratorsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPanelAccess().getModeratorsAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group_6_3__1__Impl"


    // $ANTLR start "rule__Workshop__Group__0"
    // InternalProgram.g:4383:1: rule__Workshop__Group__0 : rule__Workshop__Group__0__Impl rule__Workshop__Group__1 ;
    public final void rule__Workshop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4387:1: ( rule__Workshop__Group__0__Impl rule__Workshop__Group__1 )
            // InternalProgram.g:4388:2: rule__Workshop__Group__0__Impl rule__Workshop__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalProgram.g:4395:1: rule__Workshop__Group__0__Impl : ( 'Workshop' ) ;
    public final void rule__Workshop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4399:1: ( ( 'Workshop' ) )
            // InternalProgram.g:4400:1: ( 'Workshop' )
            {
            // InternalProgram.g:4400:1: ( 'Workshop' )
            // InternalProgram.g:4401:2: 'Workshop'
            {
             before(grammarAccess.getWorkshopAccess().getWorkshopKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalProgram.g:4410:1: rule__Workshop__Group__1 : rule__Workshop__Group__1__Impl rule__Workshop__Group__2 ;
    public final void rule__Workshop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4414:1: ( rule__Workshop__Group__1__Impl rule__Workshop__Group__2 )
            // InternalProgram.g:4415:2: rule__Workshop__Group__1__Impl rule__Workshop__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalProgram.g:4422:1: rule__Workshop__Group__1__Impl : ( '{' ) ;
    public final void rule__Workshop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4426:1: ( ( '{' ) )
            // InternalProgram.g:4427:1: ( '{' )
            {
            // InternalProgram.g:4427:1: ( '{' )
            // InternalProgram.g:4428:2: '{'
            {
             before(grammarAccess.getWorkshopAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWorkshopAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalProgram.g:4437:1: rule__Workshop__Group__2 : rule__Workshop__Group__2__Impl rule__Workshop__Group__3 ;
    public final void rule__Workshop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4441:1: ( rule__Workshop__Group__2__Impl rule__Workshop__Group__3 )
            // InternalProgram.g:4442:2: rule__Workshop__Group__2__Impl rule__Workshop__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalProgram.g:4449:1: rule__Workshop__Group__2__Impl : ( 'title' ) ;
    public final void rule__Workshop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4453:1: ( ( 'title' ) )
            // InternalProgram.g:4454:1: ( 'title' )
            {
            // InternalProgram.g:4454:1: ( 'title' )
            // InternalProgram.g:4455:2: 'title'
            {
             before(grammarAccess.getWorkshopAccess().getTitleKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getWorkshopAccess().getTitleKeyword_2()); 

            }


            }

        }
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
    // InternalProgram.g:4464:1: rule__Workshop__Group__3 : rule__Workshop__Group__3__Impl rule__Workshop__Group__4 ;
    public final void rule__Workshop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4468:1: ( rule__Workshop__Group__3__Impl rule__Workshop__Group__4 )
            // InternalProgram.g:4469:2: rule__Workshop__Group__3__Impl rule__Workshop__Group__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalProgram.g:4476:1: rule__Workshop__Group__3__Impl : ( ( rule__Workshop__NameAssignment_3 ) ) ;
    public final void rule__Workshop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4480:1: ( ( ( rule__Workshop__NameAssignment_3 ) ) )
            // InternalProgram.g:4481:1: ( ( rule__Workshop__NameAssignment_3 ) )
            {
            // InternalProgram.g:4481:1: ( ( rule__Workshop__NameAssignment_3 ) )
            // InternalProgram.g:4482:2: ( rule__Workshop__NameAssignment_3 )
            {
             before(grammarAccess.getWorkshopAccess().getNameAssignment_3()); 
            // InternalProgram.g:4483:2: ( rule__Workshop__NameAssignment_3 )
            // InternalProgram.g:4483:3: rule__Workshop__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Workshop__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWorkshopAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalProgram.g:4491:1: rule__Workshop__Group__4 : rule__Workshop__Group__4__Impl rule__Workshop__Group__5 ;
    public final void rule__Workshop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4495:1: ( rule__Workshop__Group__4__Impl rule__Workshop__Group__5 )
            // InternalProgram.g:4496:2: rule__Workshop__Group__4__Impl rule__Workshop__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalProgram.g:4503:1: rule__Workshop__Group__4__Impl : ( ( rule__Workshop__Group_4__0 )? ) ;
    public final void rule__Workshop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4507:1: ( ( ( rule__Workshop__Group_4__0 )? ) )
            // InternalProgram.g:4508:1: ( ( rule__Workshop__Group_4__0 )? )
            {
            // InternalProgram.g:4508:1: ( ( rule__Workshop__Group_4__0 )? )
            // InternalProgram.g:4509:2: ( rule__Workshop__Group_4__0 )?
            {
             before(grammarAccess.getWorkshopAccess().getGroup_4()); 
            // InternalProgram.g:4510:2: ( rule__Workshop__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==46) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalProgram.g:4510:3: rule__Workshop__Group_4__0
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
    // InternalProgram.g:4518:1: rule__Workshop__Group__5 : rule__Workshop__Group__5__Impl rule__Workshop__Group__6 ;
    public final void rule__Workshop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4522:1: ( rule__Workshop__Group__5__Impl rule__Workshop__Group__6 )
            // InternalProgram.g:4523:2: rule__Workshop__Group__5__Impl rule__Workshop__Group__6
            {
            pushFollow(FOLLOW_31);
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
    // InternalProgram.g:4530:1: rule__Workshop__Group__5__Impl : ( ( rule__Workshop__Group_5__0 )? ) ;
    public final void rule__Workshop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4534:1: ( ( ( rule__Workshop__Group_5__0 )? ) )
            // InternalProgram.g:4535:1: ( ( rule__Workshop__Group_5__0 )? )
            {
            // InternalProgram.g:4535:1: ( ( rule__Workshop__Group_5__0 )? )
            // InternalProgram.g:4536:2: ( rule__Workshop__Group_5__0 )?
            {
             before(grammarAccess.getWorkshopAccess().getGroup_5()); 
            // InternalProgram.g:4537:2: ( rule__Workshop__Group_5__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==53) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalProgram.g:4537:3: rule__Workshop__Group_5__0
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
    // InternalProgram.g:4545:1: rule__Workshop__Group__6 : rule__Workshop__Group__6__Impl rule__Workshop__Group__7 ;
    public final void rule__Workshop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4549:1: ( rule__Workshop__Group__6__Impl rule__Workshop__Group__7 )
            // InternalProgram.g:4550:2: rule__Workshop__Group__6__Impl rule__Workshop__Group__7
            {
            pushFollow(FOLLOW_31);
            rule__Workshop__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workshop__Group__7();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:4557:1: rule__Workshop__Group__6__Impl : ( ( rule__Workshop__Group_6__0 )? ) ;
    public final void rule__Workshop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4561:1: ( ( ( rule__Workshop__Group_6__0 )? ) )
            // InternalProgram.g:4562:1: ( ( rule__Workshop__Group_6__0 )? )
            {
            // InternalProgram.g:4562:1: ( ( rule__Workshop__Group_6__0 )? )
            // InternalProgram.g:4563:2: ( rule__Workshop__Group_6__0 )?
            {
             before(grammarAccess.getWorkshopAccess().getGroup_6()); 
            // InternalProgram.g:4564:2: ( rule__Workshop__Group_6__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==54) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalProgram.g:4564:3: rule__Workshop__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Workshop__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkshopAccess().getGroup_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Workshop__Group__7"
    // InternalProgram.g:4572:1: rule__Workshop__Group__7 : rule__Workshop__Group__7__Impl rule__Workshop__Group__8 ;
    public final void rule__Workshop__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4576:1: ( rule__Workshop__Group__7__Impl rule__Workshop__Group__8 )
            // InternalProgram.g:4577:2: rule__Workshop__Group__7__Impl rule__Workshop__Group__8
            {
            pushFollow(FOLLOW_31);
            rule__Workshop__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workshop__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group__7"


    // $ANTLR start "rule__Workshop__Group__7__Impl"
    // InternalProgram.g:4584:1: rule__Workshop__Group__7__Impl : ( ( rule__Workshop__Group_7__0 )? ) ;
    public final void rule__Workshop__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4588:1: ( ( ( rule__Workshop__Group_7__0 )? ) )
            // InternalProgram.g:4589:1: ( ( rule__Workshop__Group_7__0 )? )
            {
            // InternalProgram.g:4589:1: ( ( rule__Workshop__Group_7__0 )? )
            // InternalProgram.g:4590:2: ( rule__Workshop__Group_7__0 )?
            {
             before(grammarAccess.getWorkshopAccess().getGroup_7()); 
            // InternalProgram.g:4591:2: ( rule__Workshop__Group_7__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==55) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalProgram.g:4591:3: rule__Workshop__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Workshop__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkshopAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group__7__Impl"


    // $ANTLR start "rule__Workshop__Group__8"
    // InternalProgram.g:4599:1: rule__Workshop__Group__8 : rule__Workshop__Group__8__Impl ;
    public final void rule__Workshop__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4603:1: ( rule__Workshop__Group__8__Impl )
            // InternalProgram.g:4604:2: rule__Workshop__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Workshop__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group__8"


    // $ANTLR start "rule__Workshop__Group__8__Impl"
    // InternalProgram.g:4610:1: rule__Workshop__Group__8__Impl : ( '}' ) ;
    public final void rule__Workshop__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4614:1: ( ( '}' ) )
            // InternalProgram.g:4615:1: ( '}' )
            {
            // InternalProgram.g:4615:1: ( '}' )
            // InternalProgram.g:4616:2: '}'
            {
             before(grammarAccess.getWorkshopAccess().getRightCurlyBracketKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getWorkshopAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group__8__Impl"


    // $ANTLR start "rule__Workshop__Group_4__0"
    // InternalProgram.g:4626:1: rule__Workshop__Group_4__0 : rule__Workshop__Group_4__0__Impl rule__Workshop__Group_4__1 ;
    public final void rule__Workshop__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4630:1: ( rule__Workshop__Group_4__0__Impl rule__Workshop__Group_4__1 )
            // InternalProgram.g:4631:2: rule__Workshop__Group_4__0__Impl rule__Workshop__Group_4__1
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
    // InternalProgram.g:4638:1: rule__Workshop__Group_4__0__Impl : ( 'abstract' ) ;
    public final void rule__Workshop__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4642:1: ( ( 'abstract' ) )
            // InternalProgram.g:4643:1: ( 'abstract' )
            {
            // InternalProgram.g:4643:1: ( 'abstract' )
            // InternalProgram.g:4644:2: 'abstract'
            {
             before(grammarAccess.getWorkshopAccess().getAbstractKeyword_4_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getWorkshopAccess().getAbstractKeyword_4_0()); 

            }


            }

        }
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
    // InternalProgram.g:4653:1: rule__Workshop__Group_4__1 : rule__Workshop__Group_4__1__Impl ;
    public final void rule__Workshop__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4657:1: ( rule__Workshop__Group_4__1__Impl )
            // InternalProgram.g:4658:2: rule__Workshop__Group_4__1__Impl
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
    // InternalProgram.g:4664:1: rule__Workshop__Group_4__1__Impl : ( ( rule__Workshop__AbstractAssignment_4_1 ) ) ;
    public final void rule__Workshop__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4668:1: ( ( ( rule__Workshop__AbstractAssignment_4_1 ) ) )
            // InternalProgram.g:4669:1: ( ( rule__Workshop__AbstractAssignment_4_1 ) )
            {
            // InternalProgram.g:4669:1: ( ( rule__Workshop__AbstractAssignment_4_1 ) )
            // InternalProgram.g:4670:2: ( rule__Workshop__AbstractAssignment_4_1 )
            {
             before(grammarAccess.getWorkshopAccess().getAbstractAssignment_4_1()); 
            // InternalProgram.g:4671:2: ( rule__Workshop__AbstractAssignment_4_1 )
            // InternalProgram.g:4671:3: rule__Workshop__AbstractAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Workshop__AbstractAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkshopAccess().getAbstractAssignment_4_1()); 

            }


            }

        }
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
    // InternalProgram.g:4680:1: rule__Workshop__Group_5__0 : rule__Workshop__Group_5__0__Impl rule__Workshop__Group_5__1 ;
    public final void rule__Workshop__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4684:1: ( rule__Workshop__Group_5__0__Impl rule__Workshop__Group_5__1 )
            // InternalProgram.g:4685:2: rule__Workshop__Group_5__0__Impl rule__Workshop__Group_5__1
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
    // InternalProgram.g:4692:1: rule__Workshop__Group_5__0__Impl : ( 'url' ) ;
    public final void rule__Workshop__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4696:1: ( ( 'url' ) )
            // InternalProgram.g:4697:1: ( 'url' )
            {
            // InternalProgram.g:4697:1: ( 'url' )
            // InternalProgram.g:4698:2: 'url'
            {
             before(grammarAccess.getWorkshopAccess().getUrlKeyword_5_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getWorkshopAccess().getUrlKeyword_5_0()); 

            }


            }

        }
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
    // InternalProgram.g:4707:1: rule__Workshop__Group_5__1 : rule__Workshop__Group_5__1__Impl ;
    public final void rule__Workshop__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4711:1: ( rule__Workshop__Group_5__1__Impl )
            // InternalProgram.g:4712:2: rule__Workshop__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Workshop__Group_5__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:4718:1: rule__Workshop__Group_5__1__Impl : ( ( rule__Workshop__UrlAssignment_5_1 ) ) ;
    public final void rule__Workshop__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4722:1: ( ( ( rule__Workshop__UrlAssignment_5_1 ) ) )
            // InternalProgram.g:4723:1: ( ( rule__Workshop__UrlAssignment_5_1 ) )
            {
            // InternalProgram.g:4723:1: ( ( rule__Workshop__UrlAssignment_5_1 ) )
            // InternalProgram.g:4724:2: ( rule__Workshop__UrlAssignment_5_1 )
            {
             before(grammarAccess.getWorkshopAccess().getUrlAssignment_5_1()); 
            // InternalProgram.g:4725:2: ( rule__Workshop__UrlAssignment_5_1 )
            // InternalProgram.g:4725:3: rule__Workshop__UrlAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Workshop__UrlAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkshopAccess().getUrlAssignment_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Workshop__Group_6__0"
    // InternalProgram.g:4734:1: rule__Workshop__Group_6__0 : rule__Workshop__Group_6__0__Impl rule__Workshop__Group_6__1 ;
    public final void rule__Workshop__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4738:1: ( rule__Workshop__Group_6__0__Impl rule__Workshop__Group_6__1 )
            // InternalProgram.g:4739:2: rule__Workshop__Group_6__0__Impl rule__Workshop__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Workshop__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workshop__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_6__0"


    // $ANTLR start "rule__Workshop__Group_6__0__Impl"
    // InternalProgram.g:4746:1: rule__Workshop__Group_6__0__Impl : ( 'id' ) ;
    public final void rule__Workshop__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4750:1: ( ( 'id' ) )
            // InternalProgram.g:4751:1: ( 'id' )
            {
            // InternalProgram.g:4751:1: ( 'id' )
            // InternalProgram.g:4752:2: 'id'
            {
             before(grammarAccess.getWorkshopAccess().getIdKeyword_6_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getWorkshopAccess().getIdKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_6__0__Impl"


    // $ANTLR start "rule__Workshop__Group_6__1"
    // InternalProgram.g:4761:1: rule__Workshop__Group_6__1 : rule__Workshop__Group_6__1__Impl ;
    public final void rule__Workshop__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4765:1: ( rule__Workshop__Group_6__1__Impl )
            // InternalProgram.g:4766:2: rule__Workshop__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Workshop__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_6__1"


    // $ANTLR start "rule__Workshop__Group_6__1__Impl"
    // InternalProgram.g:4772:1: rule__Workshop__Group_6__1__Impl : ( ( rule__Workshop__IdAssignment_6_1 ) ) ;
    public final void rule__Workshop__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4776:1: ( ( ( rule__Workshop__IdAssignment_6_1 ) ) )
            // InternalProgram.g:4777:1: ( ( rule__Workshop__IdAssignment_6_1 ) )
            {
            // InternalProgram.g:4777:1: ( ( rule__Workshop__IdAssignment_6_1 ) )
            // InternalProgram.g:4778:2: ( rule__Workshop__IdAssignment_6_1 )
            {
             before(grammarAccess.getWorkshopAccess().getIdAssignment_6_1()); 
            // InternalProgram.g:4779:2: ( rule__Workshop__IdAssignment_6_1 )
            // InternalProgram.g:4779:3: rule__Workshop__IdAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Workshop__IdAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkshopAccess().getIdAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_6__1__Impl"


    // $ANTLR start "rule__Workshop__Group_7__0"
    // InternalProgram.g:4788:1: rule__Workshop__Group_7__0 : rule__Workshop__Group_7__0__Impl rule__Workshop__Group_7__1 ;
    public final void rule__Workshop__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4792:1: ( rule__Workshop__Group_7__0__Impl rule__Workshop__Group_7__1 )
            // InternalProgram.g:4793:2: rule__Workshop__Group_7__0__Impl rule__Workshop__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__Workshop__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workshop__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_7__0"


    // $ANTLR start "rule__Workshop__Group_7__0__Impl"
    // InternalProgram.g:4800:1: rule__Workshop__Group_7__0__Impl : ( 'organizers' ) ;
    public final void rule__Workshop__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4804:1: ( ( 'organizers' ) )
            // InternalProgram.g:4805:1: ( 'organizers' )
            {
            // InternalProgram.g:4805:1: ( 'organizers' )
            // InternalProgram.g:4806:2: 'organizers'
            {
             before(grammarAccess.getWorkshopAccess().getOrganizersKeyword_7_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getWorkshopAccess().getOrganizersKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_7__0__Impl"


    // $ANTLR start "rule__Workshop__Group_7__1"
    // InternalProgram.g:4815:1: rule__Workshop__Group_7__1 : rule__Workshop__Group_7__1__Impl rule__Workshop__Group_7__2 ;
    public final void rule__Workshop__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4819:1: ( rule__Workshop__Group_7__1__Impl rule__Workshop__Group_7__2 )
            // InternalProgram.g:4820:2: rule__Workshop__Group_7__1__Impl rule__Workshop__Group_7__2
            {
            pushFollow(FOLLOW_29);
            rule__Workshop__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workshop__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_7__1"


    // $ANTLR start "rule__Workshop__Group_7__1__Impl"
    // InternalProgram.g:4827:1: rule__Workshop__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Workshop__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4831:1: ( ( '{' ) )
            // InternalProgram.g:4832:1: ( '{' )
            {
            // InternalProgram.g:4832:1: ( '{' )
            // InternalProgram.g:4833:2: '{'
            {
             before(grammarAccess.getWorkshopAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWorkshopAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_7__1__Impl"


    // $ANTLR start "rule__Workshop__Group_7__2"
    // InternalProgram.g:4842:1: rule__Workshop__Group_7__2 : rule__Workshop__Group_7__2__Impl rule__Workshop__Group_7__3 ;
    public final void rule__Workshop__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4846:1: ( rule__Workshop__Group_7__2__Impl rule__Workshop__Group_7__3 )
            // InternalProgram.g:4847:2: rule__Workshop__Group_7__2__Impl rule__Workshop__Group_7__3
            {
            pushFollow(FOLLOW_8);
            rule__Workshop__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workshop__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_7__2"


    // $ANTLR start "rule__Workshop__Group_7__2__Impl"
    // InternalProgram.g:4854:1: rule__Workshop__Group_7__2__Impl : ( ( rule__Workshop__OrganizersAssignment_7_2 ) ) ;
    public final void rule__Workshop__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4858:1: ( ( ( rule__Workshop__OrganizersAssignment_7_2 ) ) )
            // InternalProgram.g:4859:1: ( ( rule__Workshop__OrganizersAssignment_7_2 ) )
            {
            // InternalProgram.g:4859:1: ( ( rule__Workshop__OrganizersAssignment_7_2 ) )
            // InternalProgram.g:4860:2: ( rule__Workshop__OrganizersAssignment_7_2 )
            {
             before(grammarAccess.getWorkshopAccess().getOrganizersAssignment_7_2()); 
            // InternalProgram.g:4861:2: ( rule__Workshop__OrganizersAssignment_7_2 )
            // InternalProgram.g:4861:3: rule__Workshop__OrganizersAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Workshop__OrganizersAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkshopAccess().getOrganizersAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_7__2__Impl"


    // $ANTLR start "rule__Workshop__Group_7__3"
    // InternalProgram.g:4869:1: rule__Workshop__Group_7__3 : rule__Workshop__Group_7__3__Impl rule__Workshop__Group_7__4 ;
    public final void rule__Workshop__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4873:1: ( rule__Workshop__Group_7__3__Impl rule__Workshop__Group_7__4 )
            // InternalProgram.g:4874:2: rule__Workshop__Group_7__3__Impl rule__Workshop__Group_7__4
            {
            pushFollow(FOLLOW_8);
            rule__Workshop__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workshop__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_7__3"


    // $ANTLR start "rule__Workshop__Group_7__3__Impl"
    // InternalProgram.g:4881:1: rule__Workshop__Group_7__3__Impl : ( ( rule__Workshop__Group_7_3__0 )* ) ;
    public final void rule__Workshop__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4885:1: ( ( ( rule__Workshop__Group_7_3__0 )* ) )
            // InternalProgram.g:4886:1: ( ( rule__Workshop__Group_7_3__0 )* )
            {
            // InternalProgram.g:4886:1: ( ( rule__Workshop__Group_7_3__0 )* )
            // InternalProgram.g:4887:2: ( rule__Workshop__Group_7_3__0 )*
            {
             before(grammarAccess.getWorkshopAccess().getGroup_7_3()); 
            // InternalProgram.g:4888:2: ( rule__Workshop__Group_7_3__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==24) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalProgram.g:4888:3: rule__Workshop__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Workshop__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getWorkshopAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_7__3__Impl"


    // $ANTLR start "rule__Workshop__Group_7__4"
    // InternalProgram.g:4896:1: rule__Workshop__Group_7__4 : rule__Workshop__Group_7__4__Impl ;
    public final void rule__Workshop__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4900:1: ( rule__Workshop__Group_7__4__Impl )
            // InternalProgram.g:4901:2: rule__Workshop__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Workshop__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_7__4"


    // $ANTLR start "rule__Workshop__Group_7__4__Impl"
    // InternalProgram.g:4907:1: rule__Workshop__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Workshop__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4911:1: ( ( '}' ) )
            // InternalProgram.g:4912:1: ( '}' )
            {
            // InternalProgram.g:4912:1: ( '}' )
            // InternalProgram.g:4913:2: '}'
            {
             before(grammarAccess.getWorkshopAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getWorkshopAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_7__4__Impl"


    // $ANTLR start "rule__Workshop__Group_7_3__0"
    // InternalProgram.g:4923:1: rule__Workshop__Group_7_3__0 : rule__Workshop__Group_7_3__0__Impl rule__Workshop__Group_7_3__1 ;
    public final void rule__Workshop__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4927:1: ( rule__Workshop__Group_7_3__0__Impl rule__Workshop__Group_7_3__1 )
            // InternalProgram.g:4928:2: rule__Workshop__Group_7_3__0__Impl rule__Workshop__Group_7_3__1
            {
            pushFollow(FOLLOW_29);
            rule__Workshop__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workshop__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_7_3__0"


    // $ANTLR start "rule__Workshop__Group_7_3__0__Impl"
    // InternalProgram.g:4935:1: rule__Workshop__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Workshop__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4939:1: ( ( ',' ) )
            // InternalProgram.g:4940:1: ( ',' )
            {
            // InternalProgram.g:4940:1: ( ',' )
            // InternalProgram.g:4941:2: ','
            {
             before(grammarAccess.getWorkshopAccess().getCommaKeyword_7_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getWorkshopAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_7_3__0__Impl"


    // $ANTLR start "rule__Workshop__Group_7_3__1"
    // InternalProgram.g:4950:1: rule__Workshop__Group_7_3__1 : rule__Workshop__Group_7_3__1__Impl ;
    public final void rule__Workshop__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4954:1: ( rule__Workshop__Group_7_3__1__Impl )
            // InternalProgram.g:4955:2: rule__Workshop__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Workshop__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_7_3__1"


    // $ANTLR start "rule__Workshop__Group_7_3__1__Impl"
    // InternalProgram.g:4961:1: rule__Workshop__Group_7_3__1__Impl : ( ( rule__Workshop__OrganizersAssignment_7_3_1 ) ) ;
    public final void rule__Workshop__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4965:1: ( ( ( rule__Workshop__OrganizersAssignment_7_3_1 ) ) )
            // InternalProgram.g:4966:1: ( ( rule__Workshop__OrganizersAssignment_7_3_1 ) )
            {
            // InternalProgram.g:4966:1: ( ( rule__Workshop__OrganizersAssignment_7_3_1 ) )
            // InternalProgram.g:4967:2: ( rule__Workshop__OrganizersAssignment_7_3_1 )
            {
             before(grammarAccess.getWorkshopAccess().getOrganizersAssignment_7_3_1()); 
            // InternalProgram.g:4968:2: ( rule__Workshop__OrganizersAssignment_7_3_1 )
            // InternalProgram.g:4968:3: rule__Workshop__OrganizersAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Workshop__OrganizersAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkshopAccess().getOrganizersAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__Group_7_3__1__Impl"


    // $ANTLR start "rule__Tutorial__Group__0"
    // InternalProgram.g:4977:1: rule__Tutorial__Group__0 : rule__Tutorial__Group__0__Impl rule__Tutorial__Group__1 ;
    public final void rule__Tutorial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4981:1: ( rule__Tutorial__Group__0__Impl rule__Tutorial__Group__1 )
            // InternalProgram.g:4982:2: rule__Tutorial__Group__0__Impl rule__Tutorial__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalProgram.g:4989:1: rule__Tutorial__Group__0__Impl : ( 'Tutorial' ) ;
    public final void rule__Tutorial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:4993:1: ( ( 'Tutorial' ) )
            // InternalProgram.g:4994:1: ( 'Tutorial' )
            {
            // InternalProgram.g:4994:1: ( 'Tutorial' )
            // InternalProgram.g:4995:2: 'Tutorial'
            {
             before(grammarAccess.getTutorialAccess().getTutorialKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalProgram.g:5004:1: rule__Tutorial__Group__1 : rule__Tutorial__Group__1__Impl rule__Tutorial__Group__2 ;
    public final void rule__Tutorial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5008:1: ( rule__Tutorial__Group__1__Impl rule__Tutorial__Group__2 )
            // InternalProgram.g:5009:2: rule__Tutorial__Group__1__Impl rule__Tutorial__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalProgram.g:5016:1: rule__Tutorial__Group__1__Impl : ( '{' ) ;
    public final void rule__Tutorial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5020:1: ( ( '{' ) )
            // InternalProgram.g:5021:1: ( '{' )
            {
            // InternalProgram.g:5021:1: ( '{' )
            // InternalProgram.g:5022:2: '{'
            {
             before(grammarAccess.getTutorialAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTutorialAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalProgram.g:5031:1: rule__Tutorial__Group__2 : rule__Tutorial__Group__2__Impl rule__Tutorial__Group__3 ;
    public final void rule__Tutorial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5035:1: ( rule__Tutorial__Group__2__Impl rule__Tutorial__Group__3 )
            // InternalProgram.g:5036:2: rule__Tutorial__Group__2__Impl rule__Tutorial__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalProgram.g:5043:1: rule__Tutorial__Group__2__Impl : ( 'title' ) ;
    public final void rule__Tutorial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5047:1: ( ( 'title' ) )
            // InternalProgram.g:5048:1: ( 'title' )
            {
            // InternalProgram.g:5048:1: ( 'title' )
            // InternalProgram.g:5049:2: 'title'
            {
             before(grammarAccess.getTutorialAccess().getTitleKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTutorialAccess().getTitleKeyword_2()); 

            }


            }

        }
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
    // InternalProgram.g:5058:1: rule__Tutorial__Group__3 : rule__Tutorial__Group__3__Impl rule__Tutorial__Group__4 ;
    public final void rule__Tutorial__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5062:1: ( rule__Tutorial__Group__3__Impl rule__Tutorial__Group__4 )
            // InternalProgram.g:5063:2: rule__Tutorial__Group__3__Impl rule__Tutorial__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalProgram.g:5070:1: rule__Tutorial__Group__3__Impl : ( ( rule__Tutorial__NameAssignment_3 ) ) ;
    public final void rule__Tutorial__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5074:1: ( ( ( rule__Tutorial__NameAssignment_3 ) ) )
            // InternalProgram.g:5075:1: ( ( rule__Tutorial__NameAssignment_3 ) )
            {
            // InternalProgram.g:5075:1: ( ( rule__Tutorial__NameAssignment_3 ) )
            // InternalProgram.g:5076:2: ( rule__Tutorial__NameAssignment_3 )
            {
             before(grammarAccess.getTutorialAccess().getNameAssignment_3()); 
            // InternalProgram.g:5077:2: ( rule__Tutorial__NameAssignment_3 )
            // InternalProgram.g:5077:3: rule__Tutorial__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Tutorial__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTutorialAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalProgram.g:5085:1: rule__Tutorial__Group__4 : rule__Tutorial__Group__4__Impl rule__Tutorial__Group__5 ;
    public final void rule__Tutorial__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5089:1: ( rule__Tutorial__Group__4__Impl rule__Tutorial__Group__5 )
            // InternalProgram.g:5090:2: rule__Tutorial__Group__4__Impl rule__Tutorial__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__Tutorial__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tutorial__Group__5();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:5097:1: rule__Tutorial__Group__4__Impl : ( ( rule__Tutorial__Group_4__0 )? ) ;
    public final void rule__Tutorial__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5101:1: ( ( ( rule__Tutorial__Group_4__0 )? ) )
            // InternalProgram.g:5102:1: ( ( rule__Tutorial__Group_4__0 )? )
            {
            // InternalProgram.g:5102:1: ( ( rule__Tutorial__Group_4__0 )? )
            // InternalProgram.g:5103:2: ( rule__Tutorial__Group_4__0 )?
            {
             before(grammarAccess.getTutorialAccess().getGroup_4()); 
            // InternalProgram.g:5104:2: ( rule__Tutorial__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==46) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalProgram.g:5104:3: rule__Tutorial__Group_4__0
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


    // $ANTLR start "rule__Tutorial__Group__5"
    // InternalProgram.g:5112:1: rule__Tutorial__Group__5 : rule__Tutorial__Group__5__Impl rule__Tutorial__Group__6 ;
    public final void rule__Tutorial__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5116:1: ( rule__Tutorial__Group__5__Impl rule__Tutorial__Group__6 )
            // InternalProgram.g:5117:2: rule__Tutorial__Group__5__Impl rule__Tutorial__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__Tutorial__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tutorial__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group__5"


    // $ANTLR start "rule__Tutorial__Group__5__Impl"
    // InternalProgram.g:5124:1: rule__Tutorial__Group__5__Impl : ( ( rule__Tutorial__Group_5__0 )? ) ;
    public final void rule__Tutorial__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5128:1: ( ( ( rule__Tutorial__Group_5__0 )? ) )
            // InternalProgram.g:5129:1: ( ( rule__Tutorial__Group_5__0 )? )
            {
            // InternalProgram.g:5129:1: ( ( rule__Tutorial__Group_5__0 )? )
            // InternalProgram.g:5130:2: ( rule__Tutorial__Group_5__0 )?
            {
             before(grammarAccess.getTutorialAccess().getGroup_5()); 
            // InternalProgram.g:5131:2: ( rule__Tutorial__Group_5__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==54) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalProgram.g:5131:3: rule__Tutorial__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tutorial__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTutorialAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group__5__Impl"


    // $ANTLR start "rule__Tutorial__Group__6"
    // InternalProgram.g:5139:1: rule__Tutorial__Group__6 : rule__Tutorial__Group__6__Impl rule__Tutorial__Group__7 ;
    public final void rule__Tutorial__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5143:1: ( rule__Tutorial__Group__6__Impl rule__Tutorial__Group__7 )
            // InternalProgram.g:5144:2: rule__Tutorial__Group__6__Impl rule__Tutorial__Group__7
            {
            pushFollow(FOLLOW_32);
            rule__Tutorial__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tutorial__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group__6"


    // $ANTLR start "rule__Tutorial__Group__6__Impl"
    // InternalProgram.g:5151:1: rule__Tutorial__Group__6__Impl : ( ( rule__Tutorial__Group_6__0 )? ) ;
    public final void rule__Tutorial__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5155:1: ( ( ( rule__Tutorial__Group_6__0 )? ) )
            // InternalProgram.g:5156:1: ( ( rule__Tutorial__Group_6__0 )? )
            {
            // InternalProgram.g:5156:1: ( ( rule__Tutorial__Group_6__0 )? )
            // InternalProgram.g:5157:2: ( rule__Tutorial__Group_6__0 )?
            {
             before(grammarAccess.getTutorialAccess().getGroup_6()); 
            // InternalProgram.g:5158:2: ( rule__Tutorial__Group_6__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==55) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalProgram.g:5158:3: rule__Tutorial__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tutorial__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTutorialAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group__6__Impl"


    // $ANTLR start "rule__Tutorial__Group__7"
    // InternalProgram.g:5166:1: rule__Tutorial__Group__7 : rule__Tutorial__Group__7__Impl ;
    public final void rule__Tutorial__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5170:1: ( rule__Tutorial__Group__7__Impl )
            // InternalProgram.g:5171:2: rule__Tutorial__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tutorial__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group__7"


    // $ANTLR start "rule__Tutorial__Group__7__Impl"
    // InternalProgram.g:5177:1: rule__Tutorial__Group__7__Impl : ( '}' ) ;
    public final void rule__Tutorial__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5181:1: ( ( '}' ) )
            // InternalProgram.g:5182:1: ( '}' )
            {
            // InternalProgram.g:5182:1: ( '}' )
            // InternalProgram.g:5183:2: '}'
            {
             before(grammarAccess.getTutorialAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTutorialAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group__7__Impl"


    // $ANTLR start "rule__Tutorial__Group_4__0"
    // InternalProgram.g:5193:1: rule__Tutorial__Group_4__0 : rule__Tutorial__Group_4__0__Impl rule__Tutorial__Group_4__1 ;
    public final void rule__Tutorial__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5197:1: ( rule__Tutorial__Group_4__0__Impl rule__Tutorial__Group_4__1 )
            // InternalProgram.g:5198:2: rule__Tutorial__Group_4__0__Impl rule__Tutorial__Group_4__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalProgram.g:5205:1: rule__Tutorial__Group_4__0__Impl : ( 'abstract' ) ;
    public final void rule__Tutorial__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5209:1: ( ( 'abstract' ) )
            // InternalProgram.g:5210:1: ( 'abstract' )
            {
            // InternalProgram.g:5210:1: ( 'abstract' )
            // InternalProgram.g:5211:2: 'abstract'
            {
             before(grammarAccess.getTutorialAccess().getAbstractKeyword_4_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTutorialAccess().getAbstractKeyword_4_0()); 

            }


            }

        }
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
    // InternalProgram.g:5220:1: rule__Tutorial__Group_4__1 : rule__Tutorial__Group_4__1__Impl ;
    public final void rule__Tutorial__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5224:1: ( rule__Tutorial__Group_4__1__Impl )
            // InternalProgram.g:5225:2: rule__Tutorial__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tutorial__Group_4__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:5231:1: rule__Tutorial__Group_4__1__Impl : ( ( rule__Tutorial__AbstractAssignment_4_1 ) ) ;
    public final void rule__Tutorial__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5235:1: ( ( ( rule__Tutorial__AbstractAssignment_4_1 ) ) )
            // InternalProgram.g:5236:1: ( ( rule__Tutorial__AbstractAssignment_4_1 ) )
            {
            // InternalProgram.g:5236:1: ( ( rule__Tutorial__AbstractAssignment_4_1 ) )
            // InternalProgram.g:5237:2: ( rule__Tutorial__AbstractAssignment_4_1 )
            {
             before(grammarAccess.getTutorialAccess().getAbstractAssignment_4_1()); 
            // InternalProgram.g:5238:2: ( rule__Tutorial__AbstractAssignment_4_1 )
            // InternalProgram.g:5238:3: rule__Tutorial__AbstractAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Tutorial__AbstractAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTutorialAccess().getAbstractAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Tutorial__Group_5__0"
    // InternalProgram.g:5247:1: rule__Tutorial__Group_5__0 : rule__Tutorial__Group_5__0__Impl rule__Tutorial__Group_5__1 ;
    public final void rule__Tutorial__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5251:1: ( rule__Tutorial__Group_5__0__Impl rule__Tutorial__Group_5__1 )
            // InternalProgram.g:5252:2: rule__Tutorial__Group_5__0__Impl rule__Tutorial__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Tutorial__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tutorial__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_5__0"


    // $ANTLR start "rule__Tutorial__Group_5__0__Impl"
    // InternalProgram.g:5259:1: rule__Tutorial__Group_5__0__Impl : ( 'id' ) ;
    public final void rule__Tutorial__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5263:1: ( ( 'id' ) )
            // InternalProgram.g:5264:1: ( 'id' )
            {
            // InternalProgram.g:5264:1: ( 'id' )
            // InternalProgram.g:5265:2: 'id'
            {
             before(grammarAccess.getTutorialAccess().getIdKeyword_5_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getTutorialAccess().getIdKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_5__0__Impl"


    // $ANTLR start "rule__Tutorial__Group_5__1"
    // InternalProgram.g:5274:1: rule__Tutorial__Group_5__1 : rule__Tutorial__Group_5__1__Impl ;
    public final void rule__Tutorial__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5278:1: ( rule__Tutorial__Group_5__1__Impl )
            // InternalProgram.g:5279:2: rule__Tutorial__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tutorial__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_5__1"


    // $ANTLR start "rule__Tutorial__Group_5__1__Impl"
    // InternalProgram.g:5285:1: rule__Tutorial__Group_5__1__Impl : ( ( rule__Tutorial__IdAssignment_5_1 ) ) ;
    public final void rule__Tutorial__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5289:1: ( ( ( rule__Tutorial__IdAssignment_5_1 ) ) )
            // InternalProgram.g:5290:1: ( ( rule__Tutorial__IdAssignment_5_1 ) )
            {
            // InternalProgram.g:5290:1: ( ( rule__Tutorial__IdAssignment_5_1 ) )
            // InternalProgram.g:5291:2: ( rule__Tutorial__IdAssignment_5_1 )
            {
             before(grammarAccess.getTutorialAccess().getIdAssignment_5_1()); 
            // InternalProgram.g:5292:2: ( rule__Tutorial__IdAssignment_5_1 )
            // InternalProgram.g:5292:3: rule__Tutorial__IdAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Tutorial__IdAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTutorialAccess().getIdAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_5__1__Impl"


    // $ANTLR start "rule__Tutorial__Group_6__0"
    // InternalProgram.g:5301:1: rule__Tutorial__Group_6__0 : rule__Tutorial__Group_6__0__Impl rule__Tutorial__Group_6__1 ;
    public final void rule__Tutorial__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5305:1: ( rule__Tutorial__Group_6__0__Impl rule__Tutorial__Group_6__1 )
            // InternalProgram.g:5306:2: rule__Tutorial__Group_6__0__Impl rule__Tutorial__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__Tutorial__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tutorial__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_6__0"


    // $ANTLR start "rule__Tutorial__Group_6__0__Impl"
    // InternalProgram.g:5313:1: rule__Tutorial__Group_6__0__Impl : ( 'organizers' ) ;
    public final void rule__Tutorial__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5317:1: ( ( 'organizers' ) )
            // InternalProgram.g:5318:1: ( 'organizers' )
            {
            // InternalProgram.g:5318:1: ( 'organizers' )
            // InternalProgram.g:5319:2: 'organizers'
            {
             before(grammarAccess.getTutorialAccess().getOrganizersKeyword_6_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getTutorialAccess().getOrganizersKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_6__0__Impl"


    // $ANTLR start "rule__Tutorial__Group_6__1"
    // InternalProgram.g:5328:1: rule__Tutorial__Group_6__1 : rule__Tutorial__Group_6__1__Impl rule__Tutorial__Group_6__2 ;
    public final void rule__Tutorial__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5332:1: ( rule__Tutorial__Group_6__1__Impl rule__Tutorial__Group_6__2 )
            // InternalProgram.g:5333:2: rule__Tutorial__Group_6__1__Impl rule__Tutorial__Group_6__2
            {
            pushFollow(FOLLOW_29);
            rule__Tutorial__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tutorial__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_6__1"


    // $ANTLR start "rule__Tutorial__Group_6__1__Impl"
    // InternalProgram.g:5340:1: rule__Tutorial__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Tutorial__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5344:1: ( ( '{' ) )
            // InternalProgram.g:5345:1: ( '{' )
            {
            // InternalProgram.g:5345:1: ( '{' )
            // InternalProgram.g:5346:2: '{'
            {
             before(grammarAccess.getTutorialAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTutorialAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_6__1__Impl"


    // $ANTLR start "rule__Tutorial__Group_6__2"
    // InternalProgram.g:5355:1: rule__Tutorial__Group_6__2 : rule__Tutorial__Group_6__2__Impl rule__Tutorial__Group_6__3 ;
    public final void rule__Tutorial__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5359:1: ( rule__Tutorial__Group_6__2__Impl rule__Tutorial__Group_6__3 )
            // InternalProgram.g:5360:2: rule__Tutorial__Group_6__2__Impl rule__Tutorial__Group_6__3
            {
            pushFollow(FOLLOW_8);
            rule__Tutorial__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tutorial__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_6__2"


    // $ANTLR start "rule__Tutorial__Group_6__2__Impl"
    // InternalProgram.g:5367:1: rule__Tutorial__Group_6__2__Impl : ( ( rule__Tutorial__OrganizersAssignment_6_2 ) ) ;
    public final void rule__Tutorial__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5371:1: ( ( ( rule__Tutorial__OrganizersAssignment_6_2 ) ) )
            // InternalProgram.g:5372:1: ( ( rule__Tutorial__OrganizersAssignment_6_2 ) )
            {
            // InternalProgram.g:5372:1: ( ( rule__Tutorial__OrganizersAssignment_6_2 ) )
            // InternalProgram.g:5373:2: ( rule__Tutorial__OrganizersAssignment_6_2 )
            {
             before(grammarAccess.getTutorialAccess().getOrganizersAssignment_6_2()); 
            // InternalProgram.g:5374:2: ( rule__Tutorial__OrganizersAssignment_6_2 )
            // InternalProgram.g:5374:3: rule__Tutorial__OrganizersAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Tutorial__OrganizersAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getTutorialAccess().getOrganizersAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_6__2__Impl"


    // $ANTLR start "rule__Tutorial__Group_6__3"
    // InternalProgram.g:5382:1: rule__Tutorial__Group_6__3 : rule__Tutorial__Group_6__3__Impl rule__Tutorial__Group_6__4 ;
    public final void rule__Tutorial__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5386:1: ( rule__Tutorial__Group_6__3__Impl rule__Tutorial__Group_6__4 )
            // InternalProgram.g:5387:2: rule__Tutorial__Group_6__3__Impl rule__Tutorial__Group_6__4
            {
            pushFollow(FOLLOW_8);
            rule__Tutorial__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tutorial__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_6__3"


    // $ANTLR start "rule__Tutorial__Group_6__3__Impl"
    // InternalProgram.g:5394:1: rule__Tutorial__Group_6__3__Impl : ( ( rule__Tutorial__Group_6_3__0 )* ) ;
    public final void rule__Tutorial__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5398:1: ( ( ( rule__Tutorial__Group_6_3__0 )* ) )
            // InternalProgram.g:5399:1: ( ( rule__Tutorial__Group_6_3__0 )* )
            {
            // InternalProgram.g:5399:1: ( ( rule__Tutorial__Group_6_3__0 )* )
            // InternalProgram.g:5400:2: ( rule__Tutorial__Group_6_3__0 )*
            {
             before(grammarAccess.getTutorialAccess().getGroup_6_3()); 
            // InternalProgram.g:5401:2: ( rule__Tutorial__Group_6_3__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==24) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalProgram.g:5401:3: rule__Tutorial__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Tutorial__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getTutorialAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_6__3__Impl"


    // $ANTLR start "rule__Tutorial__Group_6__4"
    // InternalProgram.g:5409:1: rule__Tutorial__Group_6__4 : rule__Tutorial__Group_6__4__Impl ;
    public final void rule__Tutorial__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5413:1: ( rule__Tutorial__Group_6__4__Impl )
            // InternalProgram.g:5414:2: rule__Tutorial__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tutorial__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_6__4"


    // $ANTLR start "rule__Tutorial__Group_6__4__Impl"
    // InternalProgram.g:5420:1: rule__Tutorial__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Tutorial__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5424:1: ( ( '}' ) )
            // InternalProgram.g:5425:1: ( '}' )
            {
            // InternalProgram.g:5425:1: ( '}' )
            // InternalProgram.g:5426:2: '}'
            {
             before(grammarAccess.getTutorialAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTutorialAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_6__4__Impl"


    // $ANTLR start "rule__Tutorial__Group_6_3__0"
    // InternalProgram.g:5436:1: rule__Tutorial__Group_6_3__0 : rule__Tutorial__Group_6_3__0__Impl rule__Tutorial__Group_6_3__1 ;
    public final void rule__Tutorial__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5440:1: ( rule__Tutorial__Group_6_3__0__Impl rule__Tutorial__Group_6_3__1 )
            // InternalProgram.g:5441:2: rule__Tutorial__Group_6_3__0__Impl rule__Tutorial__Group_6_3__1
            {
            pushFollow(FOLLOW_29);
            rule__Tutorial__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tutorial__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_6_3__0"


    // $ANTLR start "rule__Tutorial__Group_6_3__0__Impl"
    // InternalProgram.g:5448:1: rule__Tutorial__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Tutorial__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5452:1: ( ( ',' ) )
            // InternalProgram.g:5453:1: ( ',' )
            {
            // InternalProgram.g:5453:1: ( ',' )
            // InternalProgram.g:5454:2: ','
            {
             before(grammarAccess.getTutorialAccess().getCommaKeyword_6_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTutorialAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_6_3__0__Impl"


    // $ANTLR start "rule__Tutorial__Group_6_3__1"
    // InternalProgram.g:5463:1: rule__Tutorial__Group_6_3__1 : rule__Tutorial__Group_6_3__1__Impl ;
    public final void rule__Tutorial__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5467:1: ( rule__Tutorial__Group_6_3__1__Impl )
            // InternalProgram.g:5468:2: rule__Tutorial__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tutorial__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_6_3__1"


    // $ANTLR start "rule__Tutorial__Group_6_3__1__Impl"
    // InternalProgram.g:5474:1: rule__Tutorial__Group_6_3__1__Impl : ( ( rule__Tutorial__OrganizersAssignment_6_3_1 ) ) ;
    public final void rule__Tutorial__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5478:1: ( ( ( rule__Tutorial__OrganizersAssignment_6_3_1 ) ) )
            // InternalProgram.g:5479:1: ( ( rule__Tutorial__OrganizersAssignment_6_3_1 ) )
            {
            // InternalProgram.g:5479:1: ( ( rule__Tutorial__OrganizersAssignment_6_3_1 ) )
            // InternalProgram.g:5480:2: ( rule__Tutorial__OrganizersAssignment_6_3_1 )
            {
             before(grammarAccess.getTutorialAccess().getOrganizersAssignment_6_3_1()); 
            // InternalProgram.g:5481:2: ( rule__Tutorial__OrganizersAssignment_6_3_1 )
            // InternalProgram.g:5481:3: rule__Tutorial__OrganizersAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Tutorial__OrganizersAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTutorialAccess().getOrganizersAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__Group_6_3__1__Impl"


    // $ANTLR start "rule__DoctoralSymposium__Group__0"
    // InternalProgram.g:5490:1: rule__DoctoralSymposium__Group__0 : rule__DoctoralSymposium__Group__0__Impl rule__DoctoralSymposium__Group__1 ;
    public final void rule__DoctoralSymposium__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5494:1: ( rule__DoctoralSymposium__Group__0__Impl rule__DoctoralSymposium__Group__1 )
            // InternalProgram.g:5495:2: rule__DoctoralSymposium__Group__0__Impl rule__DoctoralSymposium__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalProgram.g:5502:1: rule__DoctoralSymposium__Group__0__Impl : ( 'DoctoralSymposium' ) ;
    public final void rule__DoctoralSymposium__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5506:1: ( ( 'DoctoralSymposium' ) )
            // InternalProgram.g:5507:1: ( 'DoctoralSymposium' )
            {
            // InternalProgram.g:5507:1: ( 'DoctoralSymposium' )
            // InternalProgram.g:5508:2: 'DoctoralSymposium'
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getDoctoralSymposiumKeyword_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalProgram.g:5517:1: rule__DoctoralSymposium__Group__1 : rule__DoctoralSymposium__Group__1__Impl rule__DoctoralSymposium__Group__2 ;
    public final void rule__DoctoralSymposium__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5521:1: ( rule__DoctoralSymposium__Group__1__Impl rule__DoctoralSymposium__Group__2 )
            // InternalProgram.g:5522:2: rule__DoctoralSymposium__Group__1__Impl rule__DoctoralSymposium__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalProgram.g:5529:1: rule__DoctoralSymposium__Group__1__Impl : ( '{' ) ;
    public final void rule__DoctoralSymposium__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5533:1: ( ( '{' ) )
            // InternalProgram.g:5534:1: ( '{' )
            {
            // InternalProgram.g:5534:1: ( '{' )
            // InternalProgram.g:5535:2: '{'
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDoctoralSymposiumAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalProgram.g:5544:1: rule__DoctoralSymposium__Group__2 : rule__DoctoralSymposium__Group__2__Impl rule__DoctoralSymposium__Group__3 ;
    public final void rule__DoctoralSymposium__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5548:1: ( rule__DoctoralSymposium__Group__2__Impl rule__DoctoralSymposium__Group__3 )
            // InternalProgram.g:5549:2: rule__DoctoralSymposium__Group__2__Impl rule__DoctoralSymposium__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalProgram.g:5556:1: rule__DoctoralSymposium__Group__2__Impl : ( 'title' ) ;
    public final void rule__DoctoralSymposium__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5560:1: ( ( 'title' ) )
            // InternalProgram.g:5561:1: ( 'title' )
            {
            // InternalProgram.g:5561:1: ( 'title' )
            // InternalProgram.g:5562:2: 'title'
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getTitleKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getDoctoralSymposiumAccess().getTitleKeyword_2()); 

            }


            }

        }
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
    // InternalProgram.g:5571:1: rule__DoctoralSymposium__Group__3 : rule__DoctoralSymposium__Group__3__Impl rule__DoctoralSymposium__Group__4 ;
    public final void rule__DoctoralSymposium__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5575:1: ( rule__DoctoralSymposium__Group__3__Impl rule__DoctoralSymposium__Group__4 )
            // InternalProgram.g:5576:2: rule__DoctoralSymposium__Group__3__Impl rule__DoctoralSymposium__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalProgram.g:5583:1: rule__DoctoralSymposium__Group__3__Impl : ( ( rule__DoctoralSymposium__NameAssignment_3 ) ) ;
    public final void rule__DoctoralSymposium__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5587:1: ( ( ( rule__DoctoralSymposium__NameAssignment_3 ) ) )
            // InternalProgram.g:5588:1: ( ( rule__DoctoralSymposium__NameAssignment_3 ) )
            {
            // InternalProgram.g:5588:1: ( ( rule__DoctoralSymposium__NameAssignment_3 ) )
            // InternalProgram.g:5589:2: ( rule__DoctoralSymposium__NameAssignment_3 )
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getNameAssignment_3()); 
            // InternalProgram.g:5590:2: ( rule__DoctoralSymposium__NameAssignment_3 )
            // InternalProgram.g:5590:3: rule__DoctoralSymposium__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDoctoralSymposiumAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalProgram.g:5598:1: rule__DoctoralSymposium__Group__4 : rule__DoctoralSymposium__Group__4__Impl rule__DoctoralSymposium__Group__5 ;
    public final void rule__DoctoralSymposium__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5602:1: ( rule__DoctoralSymposium__Group__4__Impl rule__DoctoralSymposium__Group__5 )
            // InternalProgram.g:5603:2: rule__DoctoralSymposium__Group__4__Impl rule__DoctoralSymposium__Group__5
            {
            pushFollow(FOLLOW_33);
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
    // InternalProgram.g:5610:1: rule__DoctoralSymposium__Group__4__Impl : ( ( rule__DoctoralSymposium__Group_4__0 )? ) ;
    public final void rule__DoctoralSymposium__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5614:1: ( ( ( rule__DoctoralSymposium__Group_4__0 )? ) )
            // InternalProgram.g:5615:1: ( ( rule__DoctoralSymposium__Group_4__0 )? )
            {
            // InternalProgram.g:5615:1: ( ( rule__DoctoralSymposium__Group_4__0 )? )
            // InternalProgram.g:5616:2: ( rule__DoctoralSymposium__Group_4__0 )?
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getGroup_4()); 
            // InternalProgram.g:5617:2: ( rule__DoctoralSymposium__Group_4__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==46) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalProgram.g:5617:3: rule__DoctoralSymposium__Group_4__0
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
    // InternalProgram.g:5625:1: rule__DoctoralSymposium__Group__5 : rule__DoctoralSymposium__Group__5__Impl rule__DoctoralSymposium__Group__6 ;
    public final void rule__DoctoralSymposium__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5629:1: ( rule__DoctoralSymposium__Group__5__Impl rule__DoctoralSymposium__Group__6 )
            // InternalProgram.g:5630:2: rule__DoctoralSymposium__Group__5__Impl rule__DoctoralSymposium__Group__6
            {
            pushFollow(FOLLOW_33);
            rule__DoctoralSymposium__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__Group__6();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:5637:1: rule__DoctoralSymposium__Group__5__Impl : ( ( rule__DoctoralSymposium__Group_5__0 )? ) ;
    public final void rule__DoctoralSymposium__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5641:1: ( ( ( rule__DoctoralSymposium__Group_5__0 )? ) )
            // InternalProgram.g:5642:1: ( ( rule__DoctoralSymposium__Group_5__0 )? )
            {
            // InternalProgram.g:5642:1: ( ( rule__DoctoralSymposium__Group_5__0 )? )
            // InternalProgram.g:5643:2: ( rule__DoctoralSymposium__Group_5__0 )?
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getGroup_5()); 
            // InternalProgram.g:5644:2: ( rule__DoctoralSymposium__Group_5__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==55) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalProgram.g:5644:3: rule__DoctoralSymposium__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DoctoralSymposium__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDoctoralSymposiumAccess().getGroup_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__DoctoralSymposium__Group__6"
    // InternalProgram.g:5652:1: rule__DoctoralSymposium__Group__6 : rule__DoctoralSymposium__Group__6__Impl ;
    public final void rule__DoctoralSymposium__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5656:1: ( rule__DoctoralSymposium__Group__6__Impl )
            // InternalProgram.g:5657:2: rule__DoctoralSymposium__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group__6"


    // $ANTLR start "rule__DoctoralSymposium__Group__6__Impl"
    // InternalProgram.g:5663:1: rule__DoctoralSymposium__Group__6__Impl : ( '}' ) ;
    public final void rule__DoctoralSymposium__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5667:1: ( ( '}' ) )
            // InternalProgram.g:5668:1: ( '}' )
            {
            // InternalProgram.g:5668:1: ( '}' )
            // InternalProgram.g:5669:2: '}'
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDoctoralSymposiumAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group__6__Impl"


    // $ANTLR start "rule__DoctoralSymposium__Group_4__0"
    // InternalProgram.g:5679:1: rule__DoctoralSymposium__Group_4__0 : rule__DoctoralSymposium__Group_4__0__Impl rule__DoctoralSymposium__Group_4__1 ;
    public final void rule__DoctoralSymposium__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5683:1: ( rule__DoctoralSymposium__Group_4__0__Impl rule__DoctoralSymposium__Group_4__1 )
            // InternalProgram.g:5684:2: rule__DoctoralSymposium__Group_4__0__Impl rule__DoctoralSymposium__Group_4__1
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
    // InternalProgram.g:5691:1: rule__DoctoralSymposium__Group_4__0__Impl : ( 'abstract' ) ;
    public final void rule__DoctoralSymposium__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5695:1: ( ( 'abstract' ) )
            // InternalProgram.g:5696:1: ( 'abstract' )
            {
            // InternalProgram.g:5696:1: ( 'abstract' )
            // InternalProgram.g:5697:2: 'abstract'
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getAbstractKeyword_4_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getDoctoralSymposiumAccess().getAbstractKeyword_4_0()); 

            }


            }

        }
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
    // InternalProgram.g:5706:1: rule__DoctoralSymposium__Group_4__1 : rule__DoctoralSymposium__Group_4__1__Impl ;
    public final void rule__DoctoralSymposium__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5710:1: ( rule__DoctoralSymposium__Group_4__1__Impl )
            // InternalProgram.g:5711:2: rule__DoctoralSymposium__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__Group_4__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:5717:1: rule__DoctoralSymposium__Group_4__1__Impl : ( ( rule__DoctoralSymposium__AbstractAssignment_4_1 ) ) ;
    public final void rule__DoctoralSymposium__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5721:1: ( ( ( rule__DoctoralSymposium__AbstractAssignment_4_1 ) ) )
            // InternalProgram.g:5722:1: ( ( rule__DoctoralSymposium__AbstractAssignment_4_1 ) )
            {
            // InternalProgram.g:5722:1: ( ( rule__DoctoralSymposium__AbstractAssignment_4_1 ) )
            // InternalProgram.g:5723:2: ( rule__DoctoralSymposium__AbstractAssignment_4_1 )
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getAbstractAssignment_4_1()); 
            // InternalProgram.g:5724:2: ( rule__DoctoralSymposium__AbstractAssignment_4_1 )
            // InternalProgram.g:5724:3: rule__DoctoralSymposium__AbstractAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__AbstractAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDoctoralSymposiumAccess().getAbstractAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__DoctoralSymposium__Group_5__0"
    // InternalProgram.g:5733:1: rule__DoctoralSymposium__Group_5__0 : rule__DoctoralSymposium__Group_5__0__Impl rule__DoctoralSymposium__Group_5__1 ;
    public final void rule__DoctoralSymposium__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5737:1: ( rule__DoctoralSymposium__Group_5__0__Impl rule__DoctoralSymposium__Group_5__1 )
            // InternalProgram.g:5738:2: rule__DoctoralSymposium__Group_5__0__Impl rule__DoctoralSymposium__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__DoctoralSymposium__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_5__0"


    // $ANTLR start "rule__DoctoralSymposium__Group_5__0__Impl"
    // InternalProgram.g:5745:1: rule__DoctoralSymposium__Group_5__0__Impl : ( 'organizers' ) ;
    public final void rule__DoctoralSymposium__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5749:1: ( ( 'organizers' ) )
            // InternalProgram.g:5750:1: ( 'organizers' )
            {
            // InternalProgram.g:5750:1: ( 'organizers' )
            // InternalProgram.g:5751:2: 'organizers'
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getOrganizersKeyword_5_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getDoctoralSymposiumAccess().getOrganizersKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_5__0__Impl"


    // $ANTLR start "rule__DoctoralSymposium__Group_5__1"
    // InternalProgram.g:5760:1: rule__DoctoralSymposium__Group_5__1 : rule__DoctoralSymposium__Group_5__1__Impl rule__DoctoralSymposium__Group_5__2 ;
    public final void rule__DoctoralSymposium__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5764:1: ( rule__DoctoralSymposium__Group_5__1__Impl rule__DoctoralSymposium__Group_5__2 )
            // InternalProgram.g:5765:2: rule__DoctoralSymposium__Group_5__1__Impl rule__DoctoralSymposium__Group_5__2
            {
            pushFollow(FOLLOW_29);
            rule__DoctoralSymposium__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_5__1"


    // $ANTLR start "rule__DoctoralSymposium__Group_5__1__Impl"
    // InternalProgram.g:5772:1: rule__DoctoralSymposium__Group_5__1__Impl : ( '{' ) ;
    public final void rule__DoctoralSymposium__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5776:1: ( ( '{' ) )
            // InternalProgram.g:5777:1: ( '{' )
            {
            // InternalProgram.g:5777:1: ( '{' )
            // InternalProgram.g:5778:2: '{'
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDoctoralSymposiumAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_5__1__Impl"


    // $ANTLR start "rule__DoctoralSymposium__Group_5__2"
    // InternalProgram.g:5787:1: rule__DoctoralSymposium__Group_5__2 : rule__DoctoralSymposium__Group_5__2__Impl rule__DoctoralSymposium__Group_5__3 ;
    public final void rule__DoctoralSymposium__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5791:1: ( rule__DoctoralSymposium__Group_5__2__Impl rule__DoctoralSymposium__Group_5__3 )
            // InternalProgram.g:5792:2: rule__DoctoralSymposium__Group_5__2__Impl rule__DoctoralSymposium__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__DoctoralSymposium__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_5__2"


    // $ANTLR start "rule__DoctoralSymposium__Group_5__2__Impl"
    // InternalProgram.g:5799:1: rule__DoctoralSymposium__Group_5__2__Impl : ( ( rule__DoctoralSymposium__OrganizersAssignment_5_2 ) ) ;
    public final void rule__DoctoralSymposium__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5803:1: ( ( ( rule__DoctoralSymposium__OrganizersAssignment_5_2 ) ) )
            // InternalProgram.g:5804:1: ( ( rule__DoctoralSymposium__OrganizersAssignment_5_2 ) )
            {
            // InternalProgram.g:5804:1: ( ( rule__DoctoralSymposium__OrganizersAssignment_5_2 ) )
            // InternalProgram.g:5805:2: ( rule__DoctoralSymposium__OrganizersAssignment_5_2 )
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getOrganizersAssignment_5_2()); 
            // InternalProgram.g:5806:2: ( rule__DoctoralSymposium__OrganizersAssignment_5_2 )
            // InternalProgram.g:5806:3: rule__DoctoralSymposium__OrganizersAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__OrganizersAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getDoctoralSymposiumAccess().getOrganizersAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_5__2__Impl"


    // $ANTLR start "rule__DoctoralSymposium__Group_5__3"
    // InternalProgram.g:5814:1: rule__DoctoralSymposium__Group_5__3 : rule__DoctoralSymposium__Group_5__3__Impl rule__DoctoralSymposium__Group_5__4 ;
    public final void rule__DoctoralSymposium__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5818:1: ( rule__DoctoralSymposium__Group_5__3__Impl rule__DoctoralSymposium__Group_5__4 )
            // InternalProgram.g:5819:2: rule__DoctoralSymposium__Group_5__3__Impl rule__DoctoralSymposium__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__DoctoralSymposium__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_5__3"


    // $ANTLR start "rule__DoctoralSymposium__Group_5__3__Impl"
    // InternalProgram.g:5826:1: rule__DoctoralSymposium__Group_5__3__Impl : ( ( rule__DoctoralSymposium__Group_5_3__0 )* ) ;
    public final void rule__DoctoralSymposium__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5830:1: ( ( ( rule__DoctoralSymposium__Group_5_3__0 )* ) )
            // InternalProgram.g:5831:1: ( ( rule__DoctoralSymposium__Group_5_3__0 )* )
            {
            // InternalProgram.g:5831:1: ( ( rule__DoctoralSymposium__Group_5_3__0 )* )
            // InternalProgram.g:5832:2: ( rule__DoctoralSymposium__Group_5_3__0 )*
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getGroup_5_3()); 
            // InternalProgram.g:5833:2: ( rule__DoctoralSymposium__Group_5_3__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==24) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalProgram.g:5833:3: rule__DoctoralSymposium__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DoctoralSymposium__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getDoctoralSymposiumAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_5__3__Impl"


    // $ANTLR start "rule__DoctoralSymposium__Group_5__4"
    // InternalProgram.g:5841:1: rule__DoctoralSymposium__Group_5__4 : rule__DoctoralSymposium__Group_5__4__Impl ;
    public final void rule__DoctoralSymposium__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5845:1: ( rule__DoctoralSymposium__Group_5__4__Impl )
            // InternalProgram.g:5846:2: rule__DoctoralSymposium__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_5__4"


    // $ANTLR start "rule__DoctoralSymposium__Group_5__4__Impl"
    // InternalProgram.g:5852:1: rule__DoctoralSymposium__Group_5__4__Impl : ( '}' ) ;
    public final void rule__DoctoralSymposium__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5856:1: ( ( '}' ) )
            // InternalProgram.g:5857:1: ( '}' )
            {
            // InternalProgram.g:5857:1: ( '}' )
            // InternalProgram.g:5858:2: '}'
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDoctoralSymposiumAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_5__4__Impl"


    // $ANTLR start "rule__DoctoralSymposium__Group_5_3__0"
    // InternalProgram.g:5868:1: rule__DoctoralSymposium__Group_5_3__0 : rule__DoctoralSymposium__Group_5_3__0__Impl rule__DoctoralSymposium__Group_5_3__1 ;
    public final void rule__DoctoralSymposium__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5872:1: ( rule__DoctoralSymposium__Group_5_3__0__Impl rule__DoctoralSymposium__Group_5_3__1 )
            // InternalProgram.g:5873:2: rule__DoctoralSymposium__Group_5_3__0__Impl rule__DoctoralSymposium__Group_5_3__1
            {
            pushFollow(FOLLOW_29);
            rule__DoctoralSymposium__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_5_3__0"


    // $ANTLR start "rule__DoctoralSymposium__Group_5_3__0__Impl"
    // InternalProgram.g:5880:1: rule__DoctoralSymposium__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__DoctoralSymposium__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5884:1: ( ( ',' ) )
            // InternalProgram.g:5885:1: ( ',' )
            {
            // InternalProgram.g:5885:1: ( ',' )
            // InternalProgram.g:5886:2: ','
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getCommaKeyword_5_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDoctoralSymposiumAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_5_3__0__Impl"


    // $ANTLR start "rule__DoctoralSymposium__Group_5_3__1"
    // InternalProgram.g:5895:1: rule__DoctoralSymposium__Group_5_3__1 : rule__DoctoralSymposium__Group_5_3__1__Impl ;
    public final void rule__DoctoralSymposium__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5899:1: ( rule__DoctoralSymposium__Group_5_3__1__Impl )
            // InternalProgram.g:5900:2: rule__DoctoralSymposium__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_5_3__1"


    // $ANTLR start "rule__DoctoralSymposium__Group_5_3__1__Impl"
    // InternalProgram.g:5906:1: rule__DoctoralSymposium__Group_5_3__1__Impl : ( ( rule__DoctoralSymposium__OrganizersAssignment_5_3_1 ) ) ;
    public final void rule__DoctoralSymposium__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5910:1: ( ( ( rule__DoctoralSymposium__OrganizersAssignment_5_3_1 ) ) )
            // InternalProgram.g:5911:1: ( ( rule__DoctoralSymposium__OrganizersAssignment_5_3_1 ) )
            {
            // InternalProgram.g:5911:1: ( ( rule__DoctoralSymposium__OrganizersAssignment_5_3_1 ) )
            // InternalProgram.g:5912:2: ( rule__DoctoralSymposium__OrganizersAssignment_5_3_1 )
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getOrganizersAssignment_5_3_1()); 
            // InternalProgram.g:5913:2: ( rule__DoctoralSymposium__OrganizersAssignment_5_3_1 )
            // InternalProgram.g:5913:3: rule__DoctoralSymposium__OrganizersAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DoctoralSymposium__OrganizersAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDoctoralSymposiumAccess().getOrganizersAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__Group_5_3__1__Impl"


    // $ANTLR start "rule__EducatorSymposium__Group__0"
    // InternalProgram.g:5922:1: rule__EducatorSymposium__Group__0 : rule__EducatorSymposium__Group__0__Impl rule__EducatorSymposium__Group__1 ;
    public final void rule__EducatorSymposium__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5926:1: ( rule__EducatorSymposium__Group__0__Impl rule__EducatorSymposium__Group__1 )
            // InternalProgram.g:5927:2: rule__EducatorSymposium__Group__0__Impl rule__EducatorSymposium__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalProgram.g:5934:1: rule__EducatorSymposium__Group__0__Impl : ( 'EducatorSymposium' ) ;
    public final void rule__EducatorSymposium__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5938:1: ( ( 'EducatorSymposium' ) )
            // InternalProgram.g:5939:1: ( 'EducatorSymposium' )
            {
            // InternalProgram.g:5939:1: ( 'EducatorSymposium' )
            // InternalProgram.g:5940:2: 'EducatorSymposium'
            {
             before(grammarAccess.getEducatorSymposiumAccess().getEducatorSymposiumKeyword_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalProgram.g:5949:1: rule__EducatorSymposium__Group__1 : rule__EducatorSymposium__Group__1__Impl rule__EducatorSymposium__Group__2 ;
    public final void rule__EducatorSymposium__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5953:1: ( rule__EducatorSymposium__Group__1__Impl rule__EducatorSymposium__Group__2 )
            // InternalProgram.g:5954:2: rule__EducatorSymposium__Group__1__Impl rule__EducatorSymposium__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalProgram.g:5961:1: rule__EducatorSymposium__Group__1__Impl : ( '{' ) ;
    public final void rule__EducatorSymposium__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5965:1: ( ( '{' ) )
            // InternalProgram.g:5966:1: ( '{' )
            {
            // InternalProgram.g:5966:1: ( '{' )
            // InternalProgram.g:5967:2: '{'
            {
             before(grammarAccess.getEducatorSymposiumAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEducatorSymposiumAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalProgram.g:5976:1: rule__EducatorSymposium__Group__2 : rule__EducatorSymposium__Group__2__Impl rule__EducatorSymposium__Group__3 ;
    public final void rule__EducatorSymposium__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5980:1: ( rule__EducatorSymposium__Group__2__Impl rule__EducatorSymposium__Group__3 )
            // InternalProgram.g:5981:2: rule__EducatorSymposium__Group__2__Impl rule__EducatorSymposium__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalProgram.g:5988:1: rule__EducatorSymposium__Group__2__Impl : ( 'title' ) ;
    public final void rule__EducatorSymposium__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:5992:1: ( ( 'title' ) )
            // InternalProgram.g:5993:1: ( 'title' )
            {
            // InternalProgram.g:5993:1: ( 'title' )
            // InternalProgram.g:5994:2: 'title'
            {
             before(grammarAccess.getEducatorSymposiumAccess().getTitleKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getEducatorSymposiumAccess().getTitleKeyword_2()); 

            }


            }

        }
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
    // InternalProgram.g:6003:1: rule__EducatorSymposium__Group__3 : rule__EducatorSymposium__Group__3__Impl rule__EducatorSymposium__Group__4 ;
    public final void rule__EducatorSymposium__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6007:1: ( rule__EducatorSymposium__Group__3__Impl rule__EducatorSymposium__Group__4 )
            // InternalProgram.g:6008:2: rule__EducatorSymposium__Group__3__Impl rule__EducatorSymposium__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalProgram.g:6015:1: rule__EducatorSymposium__Group__3__Impl : ( ( rule__EducatorSymposium__NameAssignment_3 ) ) ;
    public final void rule__EducatorSymposium__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6019:1: ( ( ( rule__EducatorSymposium__NameAssignment_3 ) ) )
            // InternalProgram.g:6020:1: ( ( rule__EducatorSymposium__NameAssignment_3 ) )
            {
            // InternalProgram.g:6020:1: ( ( rule__EducatorSymposium__NameAssignment_3 ) )
            // InternalProgram.g:6021:2: ( rule__EducatorSymposium__NameAssignment_3 )
            {
             before(grammarAccess.getEducatorSymposiumAccess().getNameAssignment_3()); 
            // InternalProgram.g:6022:2: ( rule__EducatorSymposium__NameAssignment_3 )
            // InternalProgram.g:6022:3: rule__EducatorSymposium__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEducatorSymposiumAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalProgram.g:6030:1: rule__EducatorSymposium__Group__4 : rule__EducatorSymposium__Group__4__Impl rule__EducatorSymposium__Group__5 ;
    public final void rule__EducatorSymposium__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6034:1: ( rule__EducatorSymposium__Group__4__Impl rule__EducatorSymposium__Group__5 )
            // InternalProgram.g:6035:2: rule__EducatorSymposium__Group__4__Impl rule__EducatorSymposium__Group__5
            {
            pushFollow(FOLLOW_33);
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
    // InternalProgram.g:6042:1: rule__EducatorSymposium__Group__4__Impl : ( ( rule__EducatorSymposium__Group_4__0 )? ) ;
    public final void rule__EducatorSymposium__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6046:1: ( ( ( rule__EducatorSymposium__Group_4__0 )? ) )
            // InternalProgram.g:6047:1: ( ( rule__EducatorSymposium__Group_4__0 )? )
            {
            // InternalProgram.g:6047:1: ( ( rule__EducatorSymposium__Group_4__0 )? )
            // InternalProgram.g:6048:2: ( rule__EducatorSymposium__Group_4__0 )?
            {
             before(grammarAccess.getEducatorSymposiumAccess().getGroup_4()); 
            // InternalProgram.g:6049:2: ( rule__EducatorSymposium__Group_4__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==46) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalProgram.g:6049:3: rule__EducatorSymposium__Group_4__0
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
    // InternalProgram.g:6057:1: rule__EducatorSymposium__Group__5 : rule__EducatorSymposium__Group__5__Impl rule__EducatorSymposium__Group__6 ;
    public final void rule__EducatorSymposium__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6061:1: ( rule__EducatorSymposium__Group__5__Impl rule__EducatorSymposium__Group__6 )
            // InternalProgram.g:6062:2: rule__EducatorSymposium__Group__5__Impl rule__EducatorSymposium__Group__6
            {
            pushFollow(FOLLOW_33);
            rule__EducatorSymposium__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__Group__6();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:6069:1: rule__EducatorSymposium__Group__5__Impl : ( ( rule__EducatorSymposium__Group_5__0 )? ) ;
    public final void rule__EducatorSymposium__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6073:1: ( ( ( rule__EducatorSymposium__Group_5__0 )? ) )
            // InternalProgram.g:6074:1: ( ( rule__EducatorSymposium__Group_5__0 )? )
            {
            // InternalProgram.g:6074:1: ( ( rule__EducatorSymposium__Group_5__0 )? )
            // InternalProgram.g:6075:2: ( rule__EducatorSymposium__Group_5__0 )?
            {
             before(grammarAccess.getEducatorSymposiumAccess().getGroup_5()); 
            // InternalProgram.g:6076:2: ( rule__EducatorSymposium__Group_5__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==55) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalProgram.g:6076:3: rule__EducatorSymposium__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EducatorSymposium__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEducatorSymposiumAccess().getGroup_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__EducatorSymposium__Group__6"
    // InternalProgram.g:6084:1: rule__EducatorSymposium__Group__6 : rule__EducatorSymposium__Group__6__Impl ;
    public final void rule__EducatorSymposium__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6088:1: ( rule__EducatorSymposium__Group__6__Impl )
            // InternalProgram.g:6089:2: rule__EducatorSymposium__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group__6"


    // $ANTLR start "rule__EducatorSymposium__Group__6__Impl"
    // InternalProgram.g:6095:1: rule__EducatorSymposium__Group__6__Impl : ( '}' ) ;
    public final void rule__EducatorSymposium__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6099:1: ( ( '}' ) )
            // InternalProgram.g:6100:1: ( '}' )
            {
            // InternalProgram.g:6100:1: ( '}' )
            // InternalProgram.g:6101:2: '}'
            {
             before(grammarAccess.getEducatorSymposiumAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEducatorSymposiumAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group__6__Impl"


    // $ANTLR start "rule__EducatorSymposium__Group_4__0"
    // InternalProgram.g:6111:1: rule__EducatorSymposium__Group_4__0 : rule__EducatorSymposium__Group_4__0__Impl rule__EducatorSymposium__Group_4__1 ;
    public final void rule__EducatorSymposium__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6115:1: ( rule__EducatorSymposium__Group_4__0__Impl rule__EducatorSymposium__Group_4__1 )
            // InternalProgram.g:6116:2: rule__EducatorSymposium__Group_4__0__Impl rule__EducatorSymposium__Group_4__1
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
    // InternalProgram.g:6123:1: rule__EducatorSymposium__Group_4__0__Impl : ( 'abstract' ) ;
    public final void rule__EducatorSymposium__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6127:1: ( ( 'abstract' ) )
            // InternalProgram.g:6128:1: ( 'abstract' )
            {
            // InternalProgram.g:6128:1: ( 'abstract' )
            // InternalProgram.g:6129:2: 'abstract'
            {
             before(grammarAccess.getEducatorSymposiumAccess().getAbstractKeyword_4_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getEducatorSymposiumAccess().getAbstractKeyword_4_0()); 

            }


            }

        }
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
    // InternalProgram.g:6138:1: rule__EducatorSymposium__Group_4__1 : rule__EducatorSymposium__Group_4__1__Impl ;
    public final void rule__EducatorSymposium__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6142:1: ( rule__EducatorSymposium__Group_4__1__Impl )
            // InternalProgram.g:6143:2: rule__EducatorSymposium__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__Group_4__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:6149:1: rule__EducatorSymposium__Group_4__1__Impl : ( ( rule__EducatorSymposium__AbstractAssignment_4_1 ) ) ;
    public final void rule__EducatorSymposium__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6153:1: ( ( ( rule__EducatorSymposium__AbstractAssignment_4_1 ) ) )
            // InternalProgram.g:6154:1: ( ( rule__EducatorSymposium__AbstractAssignment_4_1 ) )
            {
            // InternalProgram.g:6154:1: ( ( rule__EducatorSymposium__AbstractAssignment_4_1 ) )
            // InternalProgram.g:6155:2: ( rule__EducatorSymposium__AbstractAssignment_4_1 )
            {
             before(grammarAccess.getEducatorSymposiumAccess().getAbstractAssignment_4_1()); 
            // InternalProgram.g:6156:2: ( rule__EducatorSymposium__AbstractAssignment_4_1 )
            // InternalProgram.g:6156:3: rule__EducatorSymposium__AbstractAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__AbstractAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEducatorSymposiumAccess().getAbstractAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__EducatorSymposium__Group_5__0"
    // InternalProgram.g:6165:1: rule__EducatorSymposium__Group_5__0 : rule__EducatorSymposium__Group_5__0__Impl rule__EducatorSymposium__Group_5__1 ;
    public final void rule__EducatorSymposium__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6169:1: ( rule__EducatorSymposium__Group_5__0__Impl rule__EducatorSymposium__Group_5__1 )
            // InternalProgram.g:6170:2: rule__EducatorSymposium__Group_5__0__Impl rule__EducatorSymposium__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__EducatorSymposium__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_5__0"


    // $ANTLR start "rule__EducatorSymposium__Group_5__0__Impl"
    // InternalProgram.g:6177:1: rule__EducatorSymposium__Group_5__0__Impl : ( 'organizers' ) ;
    public final void rule__EducatorSymposium__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6181:1: ( ( 'organizers' ) )
            // InternalProgram.g:6182:1: ( 'organizers' )
            {
            // InternalProgram.g:6182:1: ( 'organizers' )
            // InternalProgram.g:6183:2: 'organizers'
            {
             before(grammarAccess.getEducatorSymposiumAccess().getOrganizersKeyword_5_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getEducatorSymposiumAccess().getOrganizersKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_5__0__Impl"


    // $ANTLR start "rule__EducatorSymposium__Group_5__1"
    // InternalProgram.g:6192:1: rule__EducatorSymposium__Group_5__1 : rule__EducatorSymposium__Group_5__1__Impl rule__EducatorSymposium__Group_5__2 ;
    public final void rule__EducatorSymposium__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6196:1: ( rule__EducatorSymposium__Group_5__1__Impl rule__EducatorSymposium__Group_5__2 )
            // InternalProgram.g:6197:2: rule__EducatorSymposium__Group_5__1__Impl rule__EducatorSymposium__Group_5__2
            {
            pushFollow(FOLLOW_29);
            rule__EducatorSymposium__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_5__1"


    // $ANTLR start "rule__EducatorSymposium__Group_5__1__Impl"
    // InternalProgram.g:6204:1: rule__EducatorSymposium__Group_5__1__Impl : ( '{' ) ;
    public final void rule__EducatorSymposium__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6208:1: ( ( '{' ) )
            // InternalProgram.g:6209:1: ( '{' )
            {
            // InternalProgram.g:6209:1: ( '{' )
            // InternalProgram.g:6210:2: '{'
            {
             before(grammarAccess.getEducatorSymposiumAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEducatorSymposiumAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_5__1__Impl"


    // $ANTLR start "rule__EducatorSymposium__Group_5__2"
    // InternalProgram.g:6219:1: rule__EducatorSymposium__Group_5__2 : rule__EducatorSymposium__Group_5__2__Impl rule__EducatorSymposium__Group_5__3 ;
    public final void rule__EducatorSymposium__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6223:1: ( rule__EducatorSymposium__Group_5__2__Impl rule__EducatorSymposium__Group_5__3 )
            // InternalProgram.g:6224:2: rule__EducatorSymposium__Group_5__2__Impl rule__EducatorSymposium__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__EducatorSymposium__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_5__2"


    // $ANTLR start "rule__EducatorSymposium__Group_5__2__Impl"
    // InternalProgram.g:6231:1: rule__EducatorSymposium__Group_5__2__Impl : ( ( rule__EducatorSymposium__OrganizersAssignment_5_2 ) ) ;
    public final void rule__EducatorSymposium__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6235:1: ( ( ( rule__EducatorSymposium__OrganizersAssignment_5_2 ) ) )
            // InternalProgram.g:6236:1: ( ( rule__EducatorSymposium__OrganizersAssignment_5_2 ) )
            {
            // InternalProgram.g:6236:1: ( ( rule__EducatorSymposium__OrganizersAssignment_5_2 ) )
            // InternalProgram.g:6237:2: ( rule__EducatorSymposium__OrganizersAssignment_5_2 )
            {
             before(grammarAccess.getEducatorSymposiumAccess().getOrganizersAssignment_5_2()); 
            // InternalProgram.g:6238:2: ( rule__EducatorSymposium__OrganizersAssignment_5_2 )
            // InternalProgram.g:6238:3: rule__EducatorSymposium__OrganizersAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__OrganizersAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getEducatorSymposiumAccess().getOrganizersAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_5__2__Impl"


    // $ANTLR start "rule__EducatorSymposium__Group_5__3"
    // InternalProgram.g:6246:1: rule__EducatorSymposium__Group_5__3 : rule__EducatorSymposium__Group_5__3__Impl rule__EducatorSymposium__Group_5__4 ;
    public final void rule__EducatorSymposium__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6250:1: ( rule__EducatorSymposium__Group_5__3__Impl rule__EducatorSymposium__Group_5__4 )
            // InternalProgram.g:6251:2: rule__EducatorSymposium__Group_5__3__Impl rule__EducatorSymposium__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__EducatorSymposium__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_5__3"


    // $ANTLR start "rule__EducatorSymposium__Group_5__3__Impl"
    // InternalProgram.g:6258:1: rule__EducatorSymposium__Group_5__3__Impl : ( ( rule__EducatorSymposium__Group_5_3__0 )* ) ;
    public final void rule__EducatorSymposium__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6262:1: ( ( ( rule__EducatorSymposium__Group_5_3__0 )* ) )
            // InternalProgram.g:6263:1: ( ( rule__EducatorSymposium__Group_5_3__0 )* )
            {
            // InternalProgram.g:6263:1: ( ( rule__EducatorSymposium__Group_5_3__0 )* )
            // InternalProgram.g:6264:2: ( rule__EducatorSymposium__Group_5_3__0 )*
            {
             before(grammarAccess.getEducatorSymposiumAccess().getGroup_5_3()); 
            // InternalProgram.g:6265:2: ( rule__EducatorSymposium__Group_5_3__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==24) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalProgram.g:6265:3: rule__EducatorSymposium__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__EducatorSymposium__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getEducatorSymposiumAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_5__3__Impl"


    // $ANTLR start "rule__EducatorSymposium__Group_5__4"
    // InternalProgram.g:6273:1: rule__EducatorSymposium__Group_5__4 : rule__EducatorSymposium__Group_5__4__Impl ;
    public final void rule__EducatorSymposium__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6277:1: ( rule__EducatorSymposium__Group_5__4__Impl )
            // InternalProgram.g:6278:2: rule__EducatorSymposium__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_5__4"


    // $ANTLR start "rule__EducatorSymposium__Group_5__4__Impl"
    // InternalProgram.g:6284:1: rule__EducatorSymposium__Group_5__4__Impl : ( '}' ) ;
    public final void rule__EducatorSymposium__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6288:1: ( ( '}' ) )
            // InternalProgram.g:6289:1: ( '}' )
            {
            // InternalProgram.g:6289:1: ( '}' )
            // InternalProgram.g:6290:2: '}'
            {
             before(grammarAccess.getEducatorSymposiumAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEducatorSymposiumAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_5__4__Impl"


    // $ANTLR start "rule__EducatorSymposium__Group_5_3__0"
    // InternalProgram.g:6300:1: rule__EducatorSymposium__Group_5_3__0 : rule__EducatorSymposium__Group_5_3__0__Impl rule__EducatorSymposium__Group_5_3__1 ;
    public final void rule__EducatorSymposium__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6304:1: ( rule__EducatorSymposium__Group_5_3__0__Impl rule__EducatorSymposium__Group_5_3__1 )
            // InternalProgram.g:6305:2: rule__EducatorSymposium__Group_5_3__0__Impl rule__EducatorSymposium__Group_5_3__1
            {
            pushFollow(FOLLOW_29);
            rule__EducatorSymposium__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_5_3__0"


    // $ANTLR start "rule__EducatorSymposium__Group_5_3__0__Impl"
    // InternalProgram.g:6312:1: rule__EducatorSymposium__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__EducatorSymposium__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6316:1: ( ( ',' ) )
            // InternalProgram.g:6317:1: ( ',' )
            {
            // InternalProgram.g:6317:1: ( ',' )
            // InternalProgram.g:6318:2: ','
            {
             before(grammarAccess.getEducatorSymposiumAccess().getCommaKeyword_5_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEducatorSymposiumAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_5_3__0__Impl"


    // $ANTLR start "rule__EducatorSymposium__Group_5_3__1"
    // InternalProgram.g:6327:1: rule__EducatorSymposium__Group_5_3__1 : rule__EducatorSymposium__Group_5_3__1__Impl ;
    public final void rule__EducatorSymposium__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6331:1: ( rule__EducatorSymposium__Group_5_3__1__Impl )
            // InternalProgram.g:6332:2: rule__EducatorSymposium__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_5_3__1"


    // $ANTLR start "rule__EducatorSymposium__Group_5_3__1__Impl"
    // InternalProgram.g:6338:1: rule__EducatorSymposium__Group_5_3__1__Impl : ( ( rule__EducatorSymposium__OrganizersAssignment_5_3_1 ) ) ;
    public final void rule__EducatorSymposium__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6342:1: ( ( ( rule__EducatorSymposium__OrganizersAssignment_5_3_1 ) ) )
            // InternalProgram.g:6343:1: ( ( rule__EducatorSymposium__OrganizersAssignment_5_3_1 ) )
            {
            // InternalProgram.g:6343:1: ( ( rule__EducatorSymposium__OrganizersAssignment_5_3_1 ) )
            // InternalProgram.g:6344:2: ( rule__EducatorSymposium__OrganizersAssignment_5_3_1 )
            {
             before(grammarAccess.getEducatorSymposiumAccess().getOrganizersAssignment_5_3_1()); 
            // InternalProgram.g:6345:2: ( rule__EducatorSymposium__OrganizersAssignment_5_3_1 )
            // InternalProgram.g:6345:3: rule__EducatorSymposium__OrganizersAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EducatorSymposium__OrganizersAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEducatorSymposiumAccess().getOrganizersAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__Group_5_3__1__Impl"


    // $ANTLR start "rule__Reception__Group__0"
    // InternalProgram.g:6354:1: rule__Reception__Group__0 : rule__Reception__Group__0__Impl rule__Reception__Group__1 ;
    public final void rule__Reception__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6358:1: ( rule__Reception__Group__0__Impl rule__Reception__Group__1 )
            // InternalProgram.g:6359:2: rule__Reception__Group__0__Impl rule__Reception__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalProgram.g:6366:1: rule__Reception__Group__0__Impl : ( 'Reception' ) ;
    public final void rule__Reception__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6370:1: ( ( 'Reception' ) )
            // InternalProgram.g:6371:1: ( 'Reception' )
            {
            // InternalProgram.g:6371:1: ( 'Reception' )
            // InternalProgram.g:6372:2: 'Reception'
            {
             before(grammarAccess.getReceptionAccess().getReceptionKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalProgram.g:6381:1: rule__Reception__Group__1 : rule__Reception__Group__1__Impl rule__Reception__Group__2 ;
    public final void rule__Reception__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6385:1: ( rule__Reception__Group__1__Impl rule__Reception__Group__2 )
            // InternalProgram.g:6386:2: rule__Reception__Group__1__Impl rule__Reception__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalProgram.g:6393:1: rule__Reception__Group__1__Impl : ( '{' ) ;
    public final void rule__Reception__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6397:1: ( ( '{' ) )
            // InternalProgram.g:6398:1: ( '{' )
            {
            // InternalProgram.g:6398:1: ( '{' )
            // InternalProgram.g:6399:2: '{'
            {
             before(grammarAccess.getReceptionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getReceptionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalProgram.g:6408:1: rule__Reception__Group__2 : rule__Reception__Group__2__Impl rule__Reception__Group__3 ;
    public final void rule__Reception__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6412:1: ( rule__Reception__Group__2__Impl rule__Reception__Group__3 )
            // InternalProgram.g:6413:2: rule__Reception__Group__2__Impl rule__Reception__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalProgram.g:6420:1: rule__Reception__Group__2__Impl : ( 'title' ) ;
    public final void rule__Reception__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6424:1: ( ( 'title' ) )
            // InternalProgram.g:6425:1: ( 'title' )
            {
            // InternalProgram.g:6425:1: ( 'title' )
            // InternalProgram.g:6426:2: 'title'
            {
             before(grammarAccess.getReceptionAccess().getTitleKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getReceptionAccess().getTitleKeyword_2()); 

            }


            }

        }
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
    // InternalProgram.g:6435:1: rule__Reception__Group__3 : rule__Reception__Group__3__Impl rule__Reception__Group__4 ;
    public final void rule__Reception__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6439:1: ( rule__Reception__Group__3__Impl rule__Reception__Group__4 )
            // InternalProgram.g:6440:2: rule__Reception__Group__3__Impl rule__Reception__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__Reception__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reception__Group__4();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:6447:1: rule__Reception__Group__3__Impl : ( ( rule__Reception__NameAssignment_3 ) ) ;
    public final void rule__Reception__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6451:1: ( ( ( rule__Reception__NameAssignment_3 ) ) )
            // InternalProgram.g:6452:1: ( ( rule__Reception__NameAssignment_3 ) )
            {
            // InternalProgram.g:6452:1: ( ( rule__Reception__NameAssignment_3 ) )
            // InternalProgram.g:6453:2: ( rule__Reception__NameAssignment_3 )
            {
             before(grammarAccess.getReceptionAccess().getNameAssignment_3()); 
            // InternalProgram.g:6454:2: ( rule__Reception__NameAssignment_3 )
            // InternalProgram.g:6454:3: rule__Reception__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Reception__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReceptionAccess().getNameAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Reception__Group__4"
    // InternalProgram.g:6462:1: rule__Reception__Group__4 : rule__Reception__Group__4__Impl rule__Reception__Group__5 ;
    public final void rule__Reception__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6466:1: ( rule__Reception__Group__4__Impl rule__Reception__Group__5 )
            // InternalProgram.g:6467:2: rule__Reception__Group__4__Impl rule__Reception__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__Reception__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reception__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reception__Group__4"


    // $ANTLR start "rule__Reception__Group__4__Impl"
    // InternalProgram.g:6474:1: rule__Reception__Group__4__Impl : ( ( rule__Reception__Group_4__0 )? ) ;
    public final void rule__Reception__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6478:1: ( ( ( rule__Reception__Group_4__0 )? ) )
            // InternalProgram.g:6479:1: ( ( rule__Reception__Group_4__0 )? )
            {
            // InternalProgram.g:6479:1: ( ( rule__Reception__Group_4__0 )? )
            // InternalProgram.g:6480:2: ( rule__Reception__Group_4__0 )?
            {
             before(grammarAccess.getReceptionAccess().getGroup_4()); 
            // InternalProgram.g:6481:2: ( rule__Reception__Group_4__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==46) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalProgram.g:6481:3: rule__Reception__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reception__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReceptionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reception__Group__4__Impl"


    // $ANTLR start "rule__Reception__Group__5"
    // InternalProgram.g:6489:1: rule__Reception__Group__5 : rule__Reception__Group__5__Impl ;
    public final void rule__Reception__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6493:1: ( rule__Reception__Group__5__Impl )
            // InternalProgram.g:6494:2: rule__Reception__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reception__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reception__Group__5"


    // $ANTLR start "rule__Reception__Group__5__Impl"
    // InternalProgram.g:6500:1: rule__Reception__Group__5__Impl : ( '}' ) ;
    public final void rule__Reception__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6504:1: ( ( '}' ) )
            // InternalProgram.g:6505:1: ( '}' )
            {
            // InternalProgram.g:6505:1: ( '}' )
            // InternalProgram.g:6506:2: '}'
            {
             before(grammarAccess.getReceptionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getReceptionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reception__Group__5__Impl"


    // $ANTLR start "rule__Reception__Group_4__0"
    // InternalProgram.g:6516:1: rule__Reception__Group_4__0 : rule__Reception__Group_4__0__Impl rule__Reception__Group_4__1 ;
    public final void rule__Reception__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6520:1: ( rule__Reception__Group_4__0__Impl rule__Reception__Group_4__1 )
            // InternalProgram.g:6521:2: rule__Reception__Group_4__0__Impl rule__Reception__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Reception__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reception__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reception__Group_4__0"


    // $ANTLR start "rule__Reception__Group_4__0__Impl"
    // InternalProgram.g:6528:1: rule__Reception__Group_4__0__Impl : ( 'abstract' ) ;
    public final void rule__Reception__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6532:1: ( ( 'abstract' ) )
            // InternalProgram.g:6533:1: ( 'abstract' )
            {
            // InternalProgram.g:6533:1: ( 'abstract' )
            // InternalProgram.g:6534:2: 'abstract'
            {
             before(grammarAccess.getReceptionAccess().getAbstractKeyword_4_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getReceptionAccess().getAbstractKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reception__Group_4__0__Impl"


    // $ANTLR start "rule__Reception__Group_4__1"
    // InternalProgram.g:6543:1: rule__Reception__Group_4__1 : rule__Reception__Group_4__1__Impl ;
    public final void rule__Reception__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6547:1: ( rule__Reception__Group_4__1__Impl )
            // InternalProgram.g:6548:2: rule__Reception__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reception__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reception__Group_4__1"


    // $ANTLR start "rule__Reception__Group_4__1__Impl"
    // InternalProgram.g:6554:1: rule__Reception__Group_4__1__Impl : ( ( rule__Reception__AbstractAssignment_4_1 ) ) ;
    public final void rule__Reception__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6558:1: ( ( ( rule__Reception__AbstractAssignment_4_1 ) ) )
            // InternalProgram.g:6559:1: ( ( rule__Reception__AbstractAssignment_4_1 ) )
            {
            // InternalProgram.g:6559:1: ( ( rule__Reception__AbstractAssignment_4_1 ) )
            // InternalProgram.g:6560:2: ( rule__Reception__AbstractAssignment_4_1 )
            {
             before(grammarAccess.getReceptionAccess().getAbstractAssignment_4_1()); 
            // InternalProgram.g:6561:2: ( rule__Reception__AbstractAssignment_4_1 )
            // InternalProgram.g:6561:3: rule__Reception__AbstractAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Reception__AbstractAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getReceptionAccess().getAbstractAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reception__Group_4__1__Impl"


    // $ANTLR start "rule__Clinic__Group__0"
    // InternalProgram.g:6570:1: rule__Clinic__Group__0 : rule__Clinic__Group__0__Impl rule__Clinic__Group__1 ;
    public final void rule__Clinic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6574:1: ( rule__Clinic__Group__0__Impl rule__Clinic__Group__1 )
            // InternalProgram.g:6575:2: rule__Clinic__Group__0__Impl rule__Clinic__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalProgram.g:6582:1: rule__Clinic__Group__0__Impl : ( 'Clinic' ) ;
    public final void rule__Clinic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6586:1: ( ( 'Clinic' ) )
            // InternalProgram.g:6587:1: ( 'Clinic' )
            {
            // InternalProgram.g:6587:1: ( 'Clinic' )
            // InternalProgram.g:6588:2: 'Clinic'
            {
             before(grammarAccess.getClinicAccess().getClinicKeyword_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalProgram.g:6597:1: rule__Clinic__Group__1 : rule__Clinic__Group__1__Impl rule__Clinic__Group__2 ;
    public final void rule__Clinic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6601:1: ( rule__Clinic__Group__1__Impl rule__Clinic__Group__2 )
            // InternalProgram.g:6602:2: rule__Clinic__Group__1__Impl rule__Clinic__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalProgram.g:6609:1: rule__Clinic__Group__1__Impl : ( '{' ) ;
    public final void rule__Clinic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6613:1: ( ( '{' ) )
            // InternalProgram.g:6614:1: ( '{' )
            {
            // InternalProgram.g:6614:1: ( '{' )
            // InternalProgram.g:6615:2: '{'
            {
             before(grammarAccess.getClinicAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getClinicAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalProgram.g:6624:1: rule__Clinic__Group__2 : rule__Clinic__Group__2__Impl rule__Clinic__Group__3 ;
    public final void rule__Clinic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6628:1: ( rule__Clinic__Group__2__Impl rule__Clinic__Group__3 )
            // InternalProgram.g:6629:2: rule__Clinic__Group__2__Impl rule__Clinic__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalProgram.g:6636:1: rule__Clinic__Group__2__Impl : ( 'title' ) ;
    public final void rule__Clinic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6640:1: ( ( 'title' ) )
            // InternalProgram.g:6641:1: ( 'title' )
            {
            // InternalProgram.g:6641:1: ( 'title' )
            // InternalProgram.g:6642:2: 'title'
            {
             before(grammarAccess.getClinicAccess().getTitleKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getClinicAccess().getTitleKeyword_2()); 

            }


            }

        }
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
    // InternalProgram.g:6651:1: rule__Clinic__Group__3 : rule__Clinic__Group__3__Impl rule__Clinic__Group__4 ;
    public final void rule__Clinic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6655:1: ( rule__Clinic__Group__3__Impl rule__Clinic__Group__4 )
            // InternalProgram.g:6656:2: rule__Clinic__Group__3__Impl rule__Clinic__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalProgram.g:6663:1: rule__Clinic__Group__3__Impl : ( ( rule__Clinic__NameAssignment_3 ) ) ;
    public final void rule__Clinic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6667:1: ( ( ( rule__Clinic__NameAssignment_3 ) ) )
            // InternalProgram.g:6668:1: ( ( rule__Clinic__NameAssignment_3 ) )
            {
            // InternalProgram.g:6668:1: ( ( rule__Clinic__NameAssignment_3 ) )
            // InternalProgram.g:6669:2: ( rule__Clinic__NameAssignment_3 )
            {
             before(grammarAccess.getClinicAccess().getNameAssignment_3()); 
            // InternalProgram.g:6670:2: ( rule__Clinic__NameAssignment_3 )
            // InternalProgram.g:6670:3: rule__Clinic__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Clinic__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getClinicAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalProgram.g:6678:1: rule__Clinic__Group__4 : rule__Clinic__Group__4__Impl rule__Clinic__Group__5 ;
    public final void rule__Clinic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6682:1: ( rule__Clinic__Group__4__Impl rule__Clinic__Group__5 )
            // InternalProgram.g:6683:2: rule__Clinic__Group__4__Impl rule__Clinic__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__Clinic__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clinic__Group__5();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:6690:1: rule__Clinic__Group__4__Impl : ( ( rule__Clinic__Group_4__0 )? ) ;
    public final void rule__Clinic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6694:1: ( ( ( rule__Clinic__Group_4__0 )? ) )
            // InternalProgram.g:6695:1: ( ( rule__Clinic__Group_4__0 )? )
            {
            // InternalProgram.g:6695:1: ( ( rule__Clinic__Group_4__0 )? )
            // InternalProgram.g:6696:2: ( rule__Clinic__Group_4__0 )?
            {
             before(grammarAccess.getClinicAccess().getGroup_4()); 
            // InternalProgram.g:6697:2: ( rule__Clinic__Group_4__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==46) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalProgram.g:6697:3: rule__Clinic__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Clinic__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClinicAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Clinic__Group__5"
    // InternalProgram.g:6705:1: rule__Clinic__Group__5 : rule__Clinic__Group__5__Impl ;
    public final void rule__Clinic__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6709:1: ( rule__Clinic__Group__5__Impl )
            // InternalProgram.g:6710:2: rule__Clinic__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clinic__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clinic__Group__5"


    // $ANTLR start "rule__Clinic__Group__5__Impl"
    // InternalProgram.g:6716:1: rule__Clinic__Group__5__Impl : ( '}' ) ;
    public final void rule__Clinic__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6720:1: ( ( '}' ) )
            // InternalProgram.g:6721:1: ( '}' )
            {
            // InternalProgram.g:6721:1: ( '}' )
            // InternalProgram.g:6722:2: '}'
            {
             before(grammarAccess.getClinicAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getClinicAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clinic__Group__5__Impl"


    // $ANTLR start "rule__Clinic__Group_4__0"
    // InternalProgram.g:6732:1: rule__Clinic__Group_4__0 : rule__Clinic__Group_4__0__Impl rule__Clinic__Group_4__1 ;
    public final void rule__Clinic__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6736:1: ( rule__Clinic__Group_4__0__Impl rule__Clinic__Group_4__1 )
            // InternalProgram.g:6737:2: rule__Clinic__Group_4__0__Impl rule__Clinic__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Clinic__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clinic__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clinic__Group_4__0"


    // $ANTLR start "rule__Clinic__Group_4__0__Impl"
    // InternalProgram.g:6744:1: rule__Clinic__Group_4__0__Impl : ( 'abstract' ) ;
    public final void rule__Clinic__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6748:1: ( ( 'abstract' ) )
            // InternalProgram.g:6749:1: ( 'abstract' )
            {
            // InternalProgram.g:6749:1: ( 'abstract' )
            // InternalProgram.g:6750:2: 'abstract'
            {
             before(grammarAccess.getClinicAccess().getAbstractKeyword_4_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getClinicAccess().getAbstractKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clinic__Group_4__0__Impl"


    // $ANTLR start "rule__Clinic__Group_4__1"
    // InternalProgram.g:6759:1: rule__Clinic__Group_4__1 : rule__Clinic__Group_4__1__Impl ;
    public final void rule__Clinic__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6763:1: ( rule__Clinic__Group_4__1__Impl )
            // InternalProgram.g:6764:2: rule__Clinic__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clinic__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clinic__Group_4__1"


    // $ANTLR start "rule__Clinic__Group_4__1__Impl"
    // InternalProgram.g:6770:1: rule__Clinic__Group_4__1__Impl : ( ( rule__Clinic__AbstractAssignment_4_1 ) ) ;
    public final void rule__Clinic__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6774:1: ( ( ( rule__Clinic__AbstractAssignment_4_1 ) ) )
            // InternalProgram.g:6775:1: ( ( rule__Clinic__AbstractAssignment_4_1 ) )
            {
            // InternalProgram.g:6775:1: ( ( rule__Clinic__AbstractAssignment_4_1 ) )
            // InternalProgram.g:6776:2: ( rule__Clinic__AbstractAssignment_4_1 )
            {
             before(grammarAccess.getClinicAccess().getAbstractAssignment_4_1()); 
            // InternalProgram.g:6777:2: ( rule__Clinic__AbstractAssignment_4_1 )
            // InternalProgram.g:6777:3: rule__Clinic__AbstractAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Clinic__AbstractAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getClinicAccess().getAbstractAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clinic__Group_4__1__Impl"


    // $ANTLR start "rule__Lunch__Group__0"
    // InternalProgram.g:6786:1: rule__Lunch__Group__0 : rule__Lunch__Group__0__Impl rule__Lunch__Group__1 ;
    public final void rule__Lunch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6790:1: ( rule__Lunch__Group__0__Impl rule__Lunch__Group__1 )
            // InternalProgram.g:6791:2: rule__Lunch__Group__0__Impl rule__Lunch__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalProgram.g:6798:1: rule__Lunch__Group__0__Impl : ( 'Lunch' ) ;
    public final void rule__Lunch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6802:1: ( ( 'Lunch' ) )
            // InternalProgram.g:6803:1: ( 'Lunch' )
            {
            // InternalProgram.g:6803:1: ( 'Lunch' )
            // InternalProgram.g:6804:2: 'Lunch'
            {
             before(grammarAccess.getLunchAccess().getLunchKeyword_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalProgram.g:6813:1: rule__Lunch__Group__1 : rule__Lunch__Group__1__Impl rule__Lunch__Group__2 ;
    public final void rule__Lunch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6817:1: ( rule__Lunch__Group__1__Impl rule__Lunch__Group__2 )
            // InternalProgram.g:6818:2: rule__Lunch__Group__1__Impl rule__Lunch__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalProgram.g:6825:1: rule__Lunch__Group__1__Impl : ( '{' ) ;
    public final void rule__Lunch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6829:1: ( ( '{' ) )
            // InternalProgram.g:6830:1: ( '{' )
            {
            // InternalProgram.g:6830:1: ( '{' )
            // InternalProgram.g:6831:2: '{'
            {
             before(grammarAccess.getLunchAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLunchAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalProgram.g:6840:1: rule__Lunch__Group__2 : rule__Lunch__Group__2__Impl rule__Lunch__Group__3 ;
    public final void rule__Lunch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6844:1: ( rule__Lunch__Group__2__Impl rule__Lunch__Group__3 )
            // InternalProgram.g:6845:2: rule__Lunch__Group__2__Impl rule__Lunch__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Lunch__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lunch__Group__3();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:6852:1: rule__Lunch__Group__2__Impl : ( 'title' ) ;
    public final void rule__Lunch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6856:1: ( ( 'title' ) )
            // InternalProgram.g:6857:1: ( 'title' )
            {
            // InternalProgram.g:6857:1: ( 'title' )
            // InternalProgram.g:6858:2: 'title'
            {
             before(grammarAccess.getLunchAccess().getTitleKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getLunchAccess().getTitleKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Lunch__Group__3"
    // InternalProgram.g:6867:1: rule__Lunch__Group__3 : rule__Lunch__Group__3__Impl rule__Lunch__Group__4 ;
    public final void rule__Lunch__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6871:1: ( rule__Lunch__Group__3__Impl rule__Lunch__Group__4 )
            // InternalProgram.g:6872:2: rule__Lunch__Group__3__Impl rule__Lunch__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__Lunch__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lunch__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__Group__3"


    // $ANTLR start "rule__Lunch__Group__3__Impl"
    // InternalProgram.g:6879:1: rule__Lunch__Group__3__Impl : ( ( rule__Lunch__NameAssignment_3 ) ) ;
    public final void rule__Lunch__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6883:1: ( ( ( rule__Lunch__NameAssignment_3 ) ) )
            // InternalProgram.g:6884:1: ( ( rule__Lunch__NameAssignment_3 ) )
            {
            // InternalProgram.g:6884:1: ( ( rule__Lunch__NameAssignment_3 ) )
            // InternalProgram.g:6885:2: ( rule__Lunch__NameAssignment_3 )
            {
             before(grammarAccess.getLunchAccess().getNameAssignment_3()); 
            // InternalProgram.g:6886:2: ( rule__Lunch__NameAssignment_3 )
            // InternalProgram.g:6886:3: rule__Lunch__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Lunch__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLunchAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__Group__3__Impl"


    // $ANTLR start "rule__Lunch__Group__4"
    // InternalProgram.g:6894:1: rule__Lunch__Group__4 : rule__Lunch__Group__4__Impl rule__Lunch__Group__5 ;
    public final void rule__Lunch__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6898:1: ( rule__Lunch__Group__4__Impl rule__Lunch__Group__5 )
            // InternalProgram.g:6899:2: rule__Lunch__Group__4__Impl rule__Lunch__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__Lunch__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lunch__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__Group__4"


    // $ANTLR start "rule__Lunch__Group__4__Impl"
    // InternalProgram.g:6906:1: rule__Lunch__Group__4__Impl : ( ( rule__Lunch__Group_4__0 )? ) ;
    public final void rule__Lunch__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6910:1: ( ( ( rule__Lunch__Group_4__0 )? ) )
            // InternalProgram.g:6911:1: ( ( rule__Lunch__Group_4__0 )? )
            {
            // InternalProgram.g:6911:1: ( ( rule__Lunch__Group_4__0 )? )
            // InternalProgram.g:6912:2: ( rule__Lunch__Group_4__0 )?
            {
             before(grammarAccess.getLunchAccess().getGroup_4()); 
            // InternalProgram.g:6913:2: ( rule__Lunch__Group_4__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==46) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalProgram.g:6913:3: rule__Lunch__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lunch__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLunchAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__Group__4__Impl"


    // $ANTLR start "rule__Lunch__Group__5"
    // InternalProgram.g:6921:1: rule__Lunch__Group__5 : rule__Lunch__Group__5__Impl ;
    public final void rule__Lunch__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6925:1: ( rule__Lunch__Group__5__Impl )
            // InternalProgram.g:6926:2: rule__Lunch__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lunch__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__Group__5"


    // $ANTLR start "rule__Lunch__Group__5__Impl"
    // InternalProgram.g:6932:1: rule__Lunch__Group__5__Impl : ( '}' ) ;
    public final void rule__Lunch__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6936:1: ( ( '}' ) )
            // InternalProgram.g:6937:1: ( '}' )
            {
            // InternalProgram.g:6937:1: ( '}' )
            // InternalProgram.g:6938:2: '}'
            {
             before(grammarAccess.getLunchAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLunchAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__Group__5__Impl"


    // $ANTLR start "rule__Lunch__Group_4__0"
    // InternalProgram.g:6948:1: rule__Lunch__Group_4__0 : rule__Lunch__Group_4__0__Impl rule__Lunch__Group_4__1 ;
    public final void rule__Lunch__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6952:1: ( rule__Lunch__Group_4__0__Impl rule__Lunch__Group_4__1 )
            // InternalProgram.g:6953:2: rule__Lunch__Group_4__0__Impl rule__Lunch__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Lunch__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lunch__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__Group_4__0"


    // $ANTLR start "rule__Lunch__Group_4__0__Impl"
    // InternalProgram.g:6960:1: rule__Lunch__Group_4__0__Impl : ( 'abstract' ) ;
    public final void rule__Lunch__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6964:1: ( ( 'abstract' ) )
            // InternalProgram.g:6965:1: ( 'abstract' )
            {
            // InternalProgram.g:6965:1: ( 'abstract' )
            // InternalProgram.g:6966:2: 'abstract'
            {
             before(grammarAccess.getLunchAccess().getAbstractKeyword_4_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getLunchAccess().getAbstractKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__Group_4__0__Impl"


    // $ANTLR start "rule__Lunch__Group_4__1"
    // InternalProgram.g:6975:1: rule__Lunch__Group_4__1 : rule__Lunch__Group_4__1__Impl ;
    public final void rule__Lunch__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6979:1: ( rule__Lunch__Group_4__1__Impl )
            // InternalProgram.g:6980:2: rule__Lunch__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lunch__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__Group_4__1"


    // $ANTLR start "rule__Lunch__Group_4__1__Impl"
    // InternalProgram.g:6986:1: rule__Lunch__Group_4__1__Impl : ( ( rule__Lunch__AbstractAssignment_4_1 ) ) ;
    public final void rule__Lunch__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:6990:1: ( ( ( rule__Lunch__AbstractAssignment_4_1 ) ) )
            // InternalProgram.g:6991:1: ( ( rule__Lunch__AbstractAssignment_4_1 ) )
            {
            // InternalProgram.g:6991:1: ( ( rule__Lunch__AbstractAssignment_4_1 ) )
            // InternalProgram.g:6992:2: ( rule__Lunch__AbstractAssignment_4_1 )
            {
             before(grammarAccess.getLunchAccess().getAbstractAssignment_4_1()); 
            // InternalProgram.g:6993:2: ( rule__Lunch__AbstractAssignment_4_1 )
            // InternalProgram.g:6993:3: rule__Lunch__AbstractAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Lunch__AbstractAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLunchAccess().getAbstractAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__Group_4__1__Impl"


    // $ANTLR start "rule__Talk__Group__0"
    // InternalProgram.g:7002:1: rule__Talk__Group__0 : rule__Talk__Group__0__Impl rule__Talk__Group__1 ;
    public final void rule__Talk__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7006:1: ( rule__Talk__Group__0__Impl rule__Talk__Group__1 )
            // InternalProgram.g:7007:2: rule__Talk__Group__0__Impl rule__Talk__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Talk__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talk__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group__0"


    // $ANTLR start "rule__Talk__Group__0__Impl"
    // InternalProgram.g:7014:1: rule__Talk__Group__0__Impl : ( () ) ;
    public final void rule__Talk__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7018:1: ( ( () ) )
            // InternalProgram.g:7019:1: ( () )
            {
            // InternalProgram.g:7019:1: ( () )
            // InternalProgram.g:7020:2: ()
            {
             before(grammarAccess.getTalkAccess().getTalkAction_0()); 
            // InternalProgram.g:7021:2: ()
            // InternalProgram.g:7021:3: 
            {
            }

             after(grammarAccess.getTalkAccess().getTalkAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group__0__Impl"


    // $ANTLR start "rule__Talk__Group__1"
    // InternalProgram.g:7029:1: rule__Talk__Group__1 : rule__Talk__Group__1__Impl rule__Talk__Group__2 ;
    public final void rule__Talk__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7033:1: ( rule__Talk__Group__1__Impl rule__Talk__Group__2 )
            // InternalProgram.g:7034:2: rule__Talk__Group__1__Impl rule__Talk__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Talk__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talk__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group__1"


    // $ANTLR start "rule__Talk__Group__1__Impl"
    // InternalProgram.g:7041:1: rule__Talk__Group__1__Impl : ( 'Talk' ) ;
    public final void rule__Talk__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7045:1: ( ( 'Talk' ) )
            // InternalProgram.g:7046:1: ( 'Talk' )
            {
            // InternalProgram.g:7046:1: ( 'Talk' )
            // InternalProgram.g:7047:2: 'Talk'
            {
             before(grammarAccess.getTalkAccess().getTalkKeyword_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getTalkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group__1__Impl"


    // $ANTLR start "rule__Talk__Group__2"
    // InternalProgram.g:7056:1: rule__Talk__Group__2 : rule__Talk__Group__2__Impl rule__Talk__Group__3 ;
    public final void rule__Talk__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7060:1: ( rule__Talk__Group__2__Impl rule__Talk__Group__3 )
            // InternalProgram.g:7061:2: rule__Talk__Group__2__Impl rule__Talk__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__Talk__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talk__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group__2"


    // $ANTLR start "rule__Talk__Group__2__Impl"
    // InternalProgram.g:7068:1: rule__Talk__Group__2__Impl : ( '{' ) ;
    public final void rule__Talk__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7072:1: ( ( '{' ) )
            // InternalProgram.g:7073:1: ( '{' )
            {
            // InternalProgram.g:7073:1: ( '{' )
            // InternalProgram.g:7074:2: '{'
            {
             before(grammarAccess.getTalkAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group__2__Impl"


    // $ANTLR start "rule__Talk__Group__3"
    // InternalProgram.g:7083:1: rule__Talk__Group__3 : rule__Talk__Group__3__Impl rule__Talk__Group__4 ;
    public final void rule__Talk__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7087:1: ( rule__Talk__Group__3__Impl rule__Talk__Group__4 )
            // InternalProgram.g:7088:2: rule__Talk__Group__3__Impl rule__Talk__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__Talk__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talk__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group__3"


    // $ANTLR start "rule__Talk__Group__3__Impl"
    // InternalProgram.g:7095:1: rule__Talk__Group__3__Impl : ( ( rule__Talk__Group_3__0 )? ) ;
    public final void rule__Talk__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7099:1: ( ( ( rule__Talk__Group_3__0 )? ) )
            // InternalProgram.g:7100:1: ( ( rule__Talk__Group_3__0 )? )
            {
            // InternalProgram.g:7100:1: ( ( rule__Talk__Group_3__0 )? )
            // InternalProgram.g:7101:2: ( rule__Talk__Group_3__0 )?
            {
             before(grammarAccess.getTalkAccess().getGroup_3()); 
            // InternalProgram.g:7102:2: ( rule__Talk__Group_3__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==63) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalProgram.g:7102:3: rule__Talk__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Talk__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTalkAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group__3__Impl"


    // $ANTLR start "rule__Talk__Group__4"
    // InternalProgram.g:7110:1: rule__Talk__Group__4 : rule__Talk__Group__4__Impl rule__Talk__Group__5 ;
    public final void rule__Talk__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7114:1: ( rule__Talk__Group__4__Impl rule__Talk__Group__5 )
            // InternalProgram.g:7115:2: rule__Talk__Group__4__Impl rule__Talk__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__Talk__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talk__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group__4"


    // $ANTLR start "rule__Talk__Group__4__Impl"
    // InternalProgram.g:7122:1: rule__Talk__Group__4__Impl : ( ( rule__Talk__Group_4__0 )? ) ;
    public final void rule__Talk__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7126:1: ( ( ( rule__Talk__Group_4__0 )? ) )
            // InternalProgram.g:7127:1: ( ( rule__Talk__Group_4__0 )? )
            {
            // InternalProgram.g:7127:1: ( ( rule__Talk__Group_4__0 )? )
            // InternalProgram.g:7128:2: ( rule__Talk__Group_4__0 )?
            {
             before(grammarAccess.getTalkAccess().getGroup_4()); 
            // InternalProgram.g:7129:2: ( rule__Talk__Group_4__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==64) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalProgram.g:7129:3: rule__Talk__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Talk__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTalkAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group__4__Impl"


    // $ANTLR start "rule__Talk__Group__5"
    // InternalProgram.g:7137:1: rule__Talk__Group__5 : rule__Talk__Group__5__Impl rule__Talk__Group__6 ;
    public final void rule__Talk__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7141:1: ( rule__Talk__Group__5__Impl rule__Talk__Group__6 )
            // InternalProgram.g:7142:2: rule__Talk__Group__5__Impl rule__Talk__Group__6
            {
            pushFollow(FOLLOW_35);
            rule__Talk__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talk__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group__5"


    // $ANTLR start "rule__Talk__Group__5__Impl"
    // InternalProgram.g:7149:1: rule__Talk__Group__5__Impl : ( ( rule__Talk__Group_5__0 )? ) ;
    public final void rule__Talk__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7153:1: ( ( ( rule__Talk__Group_5__0 )? ) )
            // InternalProgram.g:7154:1: ( ( rule__Talk__Group_5__0 )? )
            {
            // InternalProgram.g:7154:1: ( ( rule__Talk__Group_5__0 )? )
            // InternalProgram.g:7155:2: ( rule__Talk__Group_5__0 )?
            {
             before(grammarAccess.getTalkAccess().getGroup_5()); 
            // InternalProgram.g:7156:2: ( rule__Talk__Group_5__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==65) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalProgram.g:7156:3: rule__Talk__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Talk__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTalkAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group__5__Impl"


    // $ANTLR start "rule__Talk__Group__6"
    // InternalProgram.g:7164:1: rule__Talk__Group__6 : rule__Talk__Group__6__Impl ;
    public final void rule__Talk__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7168:1: ( rule__Talk__Group__6__Impl )
            // InternalProgram.g:7169:2: rule__Talk__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Talk__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group__6"


    // $ANTLR start "rule__Talk__Group__6__Impl"
    // InternalProgram.g:7175:1: rule__Talk__Group__6__Impl : ( '}' ) ;
    public final void rule__Talk__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7179:1: ( ( '}' ) )
            // InternalProgram.g:7180:1: ( '}' )
            {
            // InternalProgram.g:7180:1: ( '}' )
            // InternalProgram.g:7181:2: '}'
            {
             before(grammarAccess.getTalkAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group__6__Impl"


    // $ANTLR start "rule__Talk__Group_3__0"
    // InternalProgram.g:7191:1: rule__Talk__Group_3__0 : rule__Talk__Group_3__0__Impl rule__Talk__Group_3__1 ;
    public final void rule__Talk__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7195:1: ( rule__Talk__Group_3__0__Impl rule__Talk__Group_3__1 )
            // InternalProgram.g:7196:2: rule__Talk__Group_3__0__Impl rule__Talk__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Talk__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talk__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_3__0"


    // $ANTLR start "rule__Talk__Group_3__0__Impl"
    // InternalProgram.g:7203:1: rule__Talk__Group_3__0__Impl : ( 'preprint' ) ;
    public final void rule__Talk__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7207:1: ( ( 'preprint' ) )
            // InternalProgram.g:7208:1: ( 'preprint' )
            {
            // InternalProgram.g:7208:1: ( 'preprint' )
            // InternalProgram.g:7209:2: 'preprint'
            {
             before(grammarAccess.getTalkAccess().getPreprintKeyword_3_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getPreprintKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_3__0__Impl"


    // $ANTLR start "rule__Talk__Group_3__1"
    // InternalProgram.g:7218:1: rule__Talk__Group_3__1 : rule__Talk__Group_3__1__Impl ;
    public final void rule__Talk__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7222:1: ( rule__Talk__Group_3__1__Impl )
            // InternalProgram.g:7223:2: rule__Talk__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Talk__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_3__1"


    // $ANTLR start "rule__Talk__Group_3__1__Impl"
    // InternalProgram.g:7229:1: rule__Talk__Group_3__1__Impl : ( ( rule__Talk__PreprintAssignment_3_1 ) ) ;
    public final void rule__Talk__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7233:1: ( ( ( rule__Talk__PreprintAssignment_3_1 ) ) )
            // InternalProgram.g:7234:1: ( ( rule__Talk__PreprintAssignment_3_1 ) )
            {
            // InternalProgram.g:7234:1: ( ( rule__Talk__PreprintAssignment_3_1 ) )
            // InternalProgram.g:7235:2: ( rule__Talk__PreprintAssignment_3_1 )
            {
             before(grammarAccess.getTalkAccess().getPreprintAssignment_3_1()); 
            // InternalProgram.g:7236:2: ( rule__Talk__PreprintAssignment_3_1 )
            // InternalProgram.g:7236:3: rule__Talk__PreprintAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Talk__PreprintAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getPreprintAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_3__1__Impl"


    // $ANTLR start "rule__Talk__Group_4__0"
    // InternalProgram.g:7245:1: rule__Talk__Group_4__0 : rule__Talk__Group_4__0__Impl rule__Talk__Group_4__1 ;
    public final void rule__Talk__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7249:1: ( rule__Talk__Group_4__0__Impl rule__Talk__Group_4__1 )
            // InternalProgram.g:7250:2: rule__Talk__Group_4__0__Impl rule__Talk__Group_4__1
            {
            pushFollow(FOLLOW_36);
            rule__Talk__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talk__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_4__0"


    // $ANTLR start "rule__Talk__Group_4__0__Impl"
    // InternalProgram.g:7257:1: rule__Talk__Group_4__0__Impl : ( 'kind' ) ;
    public final void rule__Talk__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7261:1: ( ( 'kind' ) )
            // InternalProgram.g:7262:1: ( 'kind' )
            {
            // InternalProgram.g:7262:1: ( 'kind' )
            // InternalProgram.g:7263:2: 'kind'
            {
             before(grammarAccess.getTalkAccess().getKindKeyword_4_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getKindKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_4__0__Impl"


    // $ANTLR start "rule__Talk__Group_4__1"
    // InternalProgram.g:7272:1: rule__Talk__Group_4__1 : rule__Talk__Group_4__1__Impl ;
    public final void rule__Talk__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7276:1: ( rule__Talk__Group_4__1__Impl )
            // InternalProgram.g:7277:2: rule__Talk__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Talk__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_4__1"


    // $ANTLR start "rule__Talk__Group_4__1__Impl"
    // InternalProgram.g:7283:1: rule__Talk__Group_4__1__Impl : ( ( rule__Talk__KindAssignment_4_1 ) ) ;
    public final void rule__Talk__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7287:1: ( ( ( rule__Talk__KindAssignment_4_1 ) ) )
            // InternalProgram.g:7288:1: ( ( rule__Talk__KindAssignment_4_1 ) )
            {
            // InternalProgram.g:7288:1: ( ( rule__Talk__KindAssignment_4_1 ) )
            // InternalProgram.g:7289:2: ( rule__Talk__KindAssignment_4_1 )
            {
             before(grammarAccess.getTalkAccess().getKindAssignment_4_1()); 
            // InternalProgram.g:7290:2: ( rule__Talk__KindAssignment_4_1 )
            // InternalProgram.g:7290:3: rule__Talk__KindAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Talk__KindAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getKindAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_4__1__Impl"


    // $ANTLR start "rule__Talk__Group_5__0"
    // InternalProgram.g:7299:1: rule__Talk__Group_5__0 : rule__Talk__Group_5__0__Impl rule__Talk__Group_5__1 ;
    public final void rule__Talk__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7303:1: ( rule__Talk__Group_5__0__Impl rule__Talk__Group_5__1 )
            // InternalProgram.g:7304:2: rule__Talk__Group_5__0__Impl rule__Talk__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Talk__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talk__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_5__0"


    // $ANTLR start "rule__Talk__Group_5__0__Impl"
    // InternalProgram.g:7311:1: rule__Talk__Group_5__0__Impl : ( 'authors' ) ;
    public final void rule__Talk__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7315:1: ( ( 'authors' ) )
            // InternalProgram.g:7316:1: ( 'authors' )
            {
            // InternalProgram.g:7316:1: ( 'authors' )
            // InternalProgram.g:7317:2: 'authors'
            {
             before(grammarAccess.getTalkAccess().getAuthorsKeyword_5_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getAuthorsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_5__0__Impl"


    // $ANTLR start "rule__Talk__Group_5__1"
    // InternalProgram.g:7326:1: rule__Talk__Group_5__1 : rule__Talk__Group_5__1__Impl rule__Talk__Group_5__2 ;
    public final void rule__Talk__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7330:1: ( rule__Talk__Group_5__1__Impl rule__Talk__Group_5__2 )
            // InternalProgram.g:7331:2: rule__Talk__Group_5__1__Impl rule__Talk__Group_5__2
            {
            pushFollow(FOLLOW_29);
            rule__Talk__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talk__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_5__1"


    // $ANTLR start "rule__Talk__Group_5__1__Impl"
    // InternalProgram.g:7338:1: rule__Talk__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Talk__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7342:1: ( ( '{' ) )
            // InternalProgram.g:7343:1: ( '{' )
            {
            // InternalProgram.g:7343:1: ( '{' )
            // InternalProgram.g:7344:2: '{'
            {
             before(grammarAccess.getTalkAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_5__1__Impl"


    // $ANTLR start "rule__Talk__Group_5__2"
    // InternalProgram.g:7353:1: rule__Talk__Group_5__2 : rule__Talk__Group_5__2__Impl rule__Talk__Group_5__3 ;
    public final void rule__Talk__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7357:1: ( rule__Talk__Group_5__2__Impl rule__Talk__Group_5__3 )
            // InternalProgram.g:7358:2: rule__Talk__Group_5__2__Impl rule__Talk__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__Talk__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talk__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_5__2"


    // $ANTLR start "rule__Talk__Group_5__2__Impl"
    // InternalProgram.g:7365:1: rule__Talk__Group_5__2__Impl : ( ( rule__Talk__AuthorsAssignment_5_2 ) ) ;
    public final void rule__Talk__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7369:1: ( ( ( rule__Talk__AuthorsAssignment_5_2 ) ) )
            // InternalProgram.g:7370:1: ( ( rule__Talk__AuthorsAssignment_5_2 ) )
            {
            // InternalProgram.g:7370:1: ( ( rule__Talk__AuthorsAssignment_5_2 ) )
            // InternalProgram.g:7371:2: ( rule__Talk__AuthorsAssignment_5_2 )
            {
             before(grammarAccess.getTalkAccess().getAuthorsAssignment_5_2()); 
            // InternalProgram.g:7372:2: ( rule__Talk__AuthorsAssignment_5_2 )
            // InternalProgram.g:7372:3: rule__Talk__AuthorsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Talk__AuthorsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getAuthorsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_5__2__Impl"


    // $ANTLR start "rule__Talk__Group_5__3"
    // InternalProgram.g:7380:1: rule__Talk__Group_5__3 : rule__Talk__Group_5__3__Impl rule__Talk__Group_5__4 ;
    public final void rule__Talk__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7384:1: ( rule__Talk__Group_5__3__Impl rule__Talk__Group_5__4 )
            // InternalProgram.g:7385:2: rule__Talk__Group_5__3__Impl rule__Talk__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__Talk__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talk__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_5__3"


    // $ANTLR start "rule__Talk__Group_5__3__Impl"
    // InternalProgram.g:7392:1: rule__Talk__Group_5__3__Impl : ( ( rule__Talk__Group_5_3__0 )* ) ;
    public final void rule__Talk__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7396:1: ( ( ( rule__Talk__Group_5_3__0 )* ) )
            // InternalProgram.g:7397:1: ( ( rule__Talk__Group_5_3__0 )* )
            {
            // InternalProgram.g:7397:1: ( ( rule__Talk__Group_5_3__0 )* )
            // InternalProgram.g:7398:2: ( rule__Talk__Group_5_3__0 )*
            {
             before(grammarAccess.getTalkAccess().getGroup_5_3()); 
            // InternalProgram.g:7399:2: ( rule__Talk__Group_5_3__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==24) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalProgram.g:7399:3: rule__Talk__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Talk__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getTalkAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_5__3__Impl"


    // $ANTLR start "rule__Talk__Group_5__4"
    // InternalProgram.g:7407:1: rule__Talk__Group_5__4 : rule__Talk__Group_5__4__Impl ;
    public final void rule__Talk__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7411:1: ( rule__Talk__Group_5__4__Impl )
            // InternalProgram.g:7412:2: rule__Talk__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Talk__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_5__4"


    // $ANTLR start "rule__Talk__Group_5__4__Impl"
    // InternalProgram.g:7418:1: rule__Talk__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Talk__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7422:1: ( ( '}' ) )
            // InternalProgram.g:7423:1: ( '}' )
            {
            // InternalProgram.g:7423:1: ( '}' )
            // InternalProgram.g:7424:2: '}'
            {
             before(grammarAccess.getTalkAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_5__4__Impl"


    // $ANTLR start "rule__Talk__Group_5_3__0"
    // InternalProgram.g:7434:1: rule__Talk__Group_5_3__0 : rule__Talk__Group_5_3__0__Impl rule__Talk__Group_5_3__1 ;
    public final void rule__Talk__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7438:1: ( rule__Talk__Group_5_3__0__Impl rule__Talk__Group_5_3__1 )
            // InternalProgram.g:7439:2: rule__Talk__Group_5_3__0__Impl rule__Talk__Group_5_3__1
            {
            pushFollow(FOLLOW_29);
            rule__Talk__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talk__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_5_3__0"


    // $ANTLR start "rule__Talk__Group_5_3__0__Impl"
    // InternalProgram.g:7446:1: rule__Talk__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Talk__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7450:1: ( ( ',' ) )
            // InternalProgram.g:7451:1: ( ',' )
            {
            // InternalProgram.g:7451:1: ( ',' )
            // InternalProgram.g:7452:2: ','
            {
             before(grammarAccess.getTalkAccess().getCommaKeyword_5_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_5_3__0__Impl"


    // $ANTLR start "rule__Talk__Group_5_3__1"
    // InternalProgram.g:7461:1: rule__Talk__Group_5_3__1 : rule__Talk__Group_5_3__1__Impl ;
    public final void rule__Talk__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7465:1: ( rule__Talk__Group_5_3__1__Impl )
            // InternalProgram.g:7466:2: rule__Talk__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Talk__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_5_3__1"


    // $ANTLR start "rule__Talk__Group_5_3__1__Impl"
    // InternalProgram.g:7472:1: rule__Talk__Group_5_3__1__Impl : ( ( rule__Talk__AuthorsAssignment_5_3_1 ) ) ;
    public final void rule__Talk__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7476:1: ( ( ( rule__Talk__AuthorsAssignment_5_3_1 ) ) )
            // InternalProgram.g:7477:1: ( ( rule__Talk__AuthorsAssignment_5_3_1 ) )
            {
            // InternalProgram.g:7477:1: ( ( rule__Talk__AuthorsAssignment_5_3_1 ) )
            // InternalProgram.g:7478:2: ( rule__Talk__AuthorsAssignment_5_3_1 )
            {
             before(grammarAccess.getTalkAccess().getAuthorsAssignment_5_3_1()); 
            // InternalProgram.g:7479:2: ( rule__Talk__AuthorsAssignment_5_3_1 )
            // InternalProgram.g:7479:3: rule__Talk__AuthorsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Talk__AuthorsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getAuthorsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_5_3__1__Impl"


    // $ANTLR start "rule__Person__Group__0"
    // InternalProgram.g:7488:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7492:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalProgram.g:7493:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalProgram.g:7500:1: rule__Person__Group__0__Impl : ( () ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7504:1: ( ( () ) )
            // InternalProgram.g:7505:1: ( () )
            {
            // InternalProgram.g:7505:1: ( () )
            // InternalProgram.g:7506:2: ()
            {
             before(grammarAccess.getPersonAccess().getPersonAction_0()); 
            // InternalProgram.g:7507:2: ()
            // InternalProgram.g:7507:3: 
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
    // InternalProgram.g:7515:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7519:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // InternalProgram.g:7520:2: rule__Person__Group__1__Impl rule__Person__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalProgram.g:7527:1: rule__Person__Group__1__Impl : ( 'Person' ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7531:1: ( ( 'Person' ) )
            // InternalProgram.g:7532:1: ( 'Person' )
            {
            // InternalProgram.g:7532:1: ( 'Person' )
            // InternalProgram.g:7533:2: 'Person'
            {
             before(grammarAccess.getPersonAccess().getPersonKeyword_1()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getPersonKeyword_1()); 

            }


            }

        }
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
    // InternalProgram.g:7542:1: rule__Person__Group__2 : rule__Person__Group__2__Impl rule__Person__Group__3 ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7546:1: ( rule__Person__Group__2__Impl rule__Person__Group__3 )
            // InternalProgram.g:7547:2: rule__Person__Group__2__Impl rule__Person__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalProgram.g:7554:1: rule__Person__Group__2__Impl : ( ( rule__Person__NameAssignment_2 ) ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7558:1: ( ( ( rule__Person__NameAssignment_2 ) ) )
            // InternalProgram.g:7559:1: ( ( rule__Person__NameAssignment_2 ) )
            {
            // InternalProgram.g:7559:1: ( ( rule__Person__NameAssignment_2 ) )
            // InternalProgram.g:7560:2: ( rule__Person__NameAssignment_2 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_2()); 
            // InternalProgram.g:7561:2: ( rule__Person__NameAssignment_2 )
            // InternalProgram.g:7561:3: rule__Person__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Person__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalProgram.g:7569:1: rule__Person__Group__3 : rule__Person__Group__3__Impl rule__Person__Group__4 ;
    public final void rule__Person__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7573:1: ( rule__Person__Group__3__Impl rule__Person__Group__4 )
            // InternalProgram.g:7574:2: rule__Person__Group__3__Impl rule__Person__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__Person__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__4();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:7581:1: rule__Person__Group__3__Impl : ( '{' ) ;
    public final void rule__Person__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7585:1: ( ( '{' ) )
            // InternalProgram.g:7586:1: ( '{' )
            {
            // InternalProgram.g:7586:1: ( '{' )
            // InternalProgram.g:7587:2: '{'
            {
             before(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Person__Group__4"
    // InternalProgram.g:7596:1: rule__Person__Group__4 : rule__Person__Group__4__Impl rule__Person__Group__5 ;
    public final void rule__Person__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7600:1: ( rule__Person__Group__4__Impl rule__Person__Group__5 )
            // InternalProgram.g:7601:2: rule__Person__Group__4__Impl rule__Person__Group__5
            {
            pushFollow(FOLLOW_37);
            rule__Person__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__4"


    // $ANTLR start "rule__Person__Group__4__Impl"
    // InternalProgram.g:7608:1: rule__Person__Group__4__Impl : ( ( rule__Person__Group_4__0 )? ) ;
    public final void rule__Person__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7612:1: ( ( ( rule__Person__Group_4__0 )? ) )
            // InternalProgram.g:7613:1: ( ( rule__Person__Group_4__0 )? )
            {
            // InternalProgram.g:7613:1: ( ( rule__Person__Group_4__0 )? )
            // InternalProgram.g:7614:2: ( rule__Person__Group_4__0 )?
            {
             before(grammarAccess.getPersonAccess().getGroup_4()); 
            // InternalProgram.g:7615:2: ( rule__Person__Group_4__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==67) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalProgram.g:7615:3: rule__Person__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Person__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersonAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__4__Impl"


    // $ANTLR start "rule__Person__Group__5"
    // InternalProgram.g:7623:1: rule__Person__Group__5 : rule__Person__Group__5__Impl rule__Person__Group__6 ;
    public final void rule__Person__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7627:1: ( rule__Person__Group__5__Impl rule__Person__Group__6 )
            // InternalProgram.g:7628:2: rule__Person__Group__5__Impl rule__Person__Group__6
            {
            pushFollow(FOLLOW_37);
            rule__Person__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__5"


    // $ANTLR start "rule__Person__Group__5__Impl"
    // InternalProgram.g:7635:1: rule__Person__Group__5__Impl : ( ( rule__Person__Group_5__0 )? ) ;
    public final void rule__Person__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7639:1: ( ( ( rule__Person__Group_5__0 )? ) )
            // InternalProgram.g:7640:1: ( ( rule__Person__Group_5__0 )? )
            {
            // InternalProgram.g:7640:1: ( ( rule__Person__Group_5__0 )? )
            // InternalProgram.g:7641:2: ( rule__Person__Group_5__0 )?
            {
             before(grammarAccess.getPersonAccess().getGroup_5()); 
            // InternalProgram.g:7642:2: ( rule__Person__Group_5__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==68) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalProgram.g:7642:3: rule__Person__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Person__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersonAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__5__Impl"


    // $ANTLR start "rule__Person__Group__6"
    // InternalProgram.g:7650:1: rule__Person__Group__6 : rule__Person__Group__6__Impl ;
    public final void rule__Person__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7654:1: ( rule__Person__Group__6__Impl )
            // InternalProgram.g:7655:2: rule__Person__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__6"


    // $ANTLR start "rule__Person__Group__6__Impl"
    // InternalProgram.g:7661:1: rule__Person__Group__6__Impl : ( '}' ) ;
    public final void rule__Person__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7665:1: ( ( '}' ) )
            // InternalProgram.g:7666:1: ( '}' )
            {
            // InternalProgram.g:7666:1: ( '}' )
            // InternalProgram.g:7667:2: '}'
            {
             before(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__6__Impl"


    // $ANTLR start "rule__Person__Group_4__0"
    // InternalProgram.g:7677:1: rule__Person__Group_4__0 : rule__Person__Group_4__0__Impl rule__Person__Group_4__1 ;
    public final void rule__Person__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7681:1: ( rule__Person__Group_4__0__Impl rule__Person__Group_4__1 )
            // InternalProgram.g:7682:2: rule__Person__Group_4__0__Impl rule__Person__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Person__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_4__0"


    // $ANTLR start "rule__Person__Group_4__0__Impl"
    // InternalProgram.g:7689:1: rule__Person__Group_4__0__Impl : ( 'email' ) ;
    public final void rule__Person__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7693:1: ( ( 'email' ) )
            // InternalProgram.g:7694:1: ( 'email' )
            {
            // InternalProgram.g:7694:1: ( 'email' )
            // InternalProgram.g:7695:2: 'email'
            {
             before(grammarAccess.getPersonAccess().getEmailKeyword_4_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getEmailKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_4__0__Impl"


    // $ANTLR start "rule__Person__Group_4__1"
    // InternalProgram.g:7704:1: rule__Person__Group_4__1 : rule__Person__Group_4__1__Impl ;
    public final void rule__Person__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7708:1: ( rule__Person__Group_4__1__Impl )
            // InternalProgram.g:7709:2: rule__Person__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_4__1"


    // $ANTLR start "rule__Person__Group_4__1__Impl"
    // InternalProgram.g:7715:1: rule__Person__Group_4__1__Impl : ( ( rule__Person__EmailAssignment_4_1 ) ) ;
    public final void rule__Person__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7719:1: ( ( ( rule__Person__EmailAssignment_4_1 ) ) )
            // InternalProgram.g:7720:1: ( ( rule__Person__EmailAssignment_4_1 ) )
            {
            // InternalProgram.g:7720:1: ( ( rule__Person__EmailAssignment_4_1 ) )
            // InternalProgram.g:7721:2: ( rule__Person__EmailAssignment_4_1 )
            {
             before(grammarAccess.getPersonAccess().getEmailAssignment_4_1()); 
            // InternalProgram.g:7722:2: ( rule__Person__EmailAssignment_4_1 )
            // InternalProgram.g:7722:3: rule__Person__EmailAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Person__EmailAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getEmailAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_4__1__Impl"


    // $ANTLR start "rule__Person__Group_5__0"
    // InternalProgram.g:7731:1: rule__Person__Group_5__0 : rule__Person__Group_5__0__Impl rule__Person__Group_5__1 ;
    public final void rule__Person__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7735:1: ( rule__Person__Group_5__0__Impl rule__Person__Group_5__1 )
            // InternalProgram.g:7736:2: rule__Person__Group_5__0__Impl rule__Person__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Person__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_5__0"


    // $ANTLR start "rule__Person__Group_5__0__Impl"
    // InternalProgram.g:7743:1: rule__Person__Group_5__0__Impl : ( 'homepage' ) ;
    public final void rule__Person__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7747:1: ( ( 'homepage' ) )
            // InternalProgram.g:7748:1: ( 'homepage' )
            {
            // InternalProgram.g:7748:1: ( 'homepage' )
            // InternalProgram.g:7749:2: 'homepage'
            {
             before(grammarAccess.getPersonAccess().getHomepageKeyword_5_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getHomepageKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_5__0__Impl"


    // $ANTLR start "rule__Person__Group_5__1"
    // InternalProgram.g:7758:1: rule__Person__Group_5__1 : rule__Person__Group_5__1__Impl ;
    public final void rule__Person__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7762:1: ( rule__Person__Group_5__1__Impl )
            // InternalProgram.g:7763:2: rule__Person__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_5__1"


    // $ANTLR start "rule__Person__Group_5__1__Impl"
    // InternalProgram.g:7769:1: rule__Person__Group_5__1__Impl : ( ( rule__Person__HomepageAssignment_5_1 ) ) ;
    public final void rule__Person__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7773:1: ( ( ( rule__Person__HomepageAssignment_5_1 ) ) )
            // InternalProgram.g:7774:1: ( ( rule__Person__HomepageAssignment_5_1 ) )
            {
            // InternalProgram.g:7774:1: ( ( rule__Person__HomepageAssignment_5_1 ) )
            // InternalProgram.g:7775:2: ( rule__Person__HomepageAssignment_5_1 )
            {
             before(grammarAccess.getPersonAccess().getHomepageAssignment_5_1()); 
            // InternalProgram.g:7776:2: ( rule__Person__HomepageAssignment_5_1 )
            // InternalProgram.g:7776:3: rule__Person__HomepageAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Person__HomepageAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getHomepageAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_5__1__Impl"


    // $ANTLR start "rule__Conference__NameAssignment_2"
    // InternalProgram.g:7785:1: rule__Conference__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Conference__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7789:1: ( ( ruleEString ) )
            // InternalProgram.g:7790:2: ( ruleEString )
            {
            // InternalProgram.g:7790:2: ( ruleEString )
            // InternalProgram.g:7791:3: ruleEString
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


    // $ANTLR start "rule__Conference__RessourcesAssignment_4_2"
    // InternalProgram.g:7800:1: rule__Conference__RessourcesAssignment_4_2 : ( ruleRessource ) ;
    public final void rule__Conference__RessourcesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7804:1: ( ( ruleRessource ) )
            // InternalProgram.g:7805:2: ( ruleRessource )
            {
            // InternalProgram.g:7805:2: ( ruleRessource )
            // InternalProgram.g:7806:3: ruleRessource
            {
             before(grammarAccess.getConferenceAccess().getRessourcesRessourceParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRessource();

            state._fsp--;

             after(grammarAccess.getConferenceAccess().getRessourcesRessourceParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__RessourcesAssignment_4_2"


    // $ANTLR start "rule__Conference__RessourcesAssignment_4_3_1"
    // InternalProgram.g:7815:1: rule__Conference__RessourcesAssignment_4_3_1 : ( ruleRessource ) ;
    public final void rule__Conference__RessourcesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7819:1: ( ( ruleRessource ) )
            // InternalProgram.g:7820:2: ( ruleRessource )
            {
            // InternalProgram.g:7820:2: ( ruleRessource )
            // InternalProgram.g:7821:3: ruleRessource
            {
             before(grammarAccess.getConferenceAccess().getRessourcesRessourceParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRessource();

            state._fsp--;

             after(grammarAccess.getConferenceAccess().getRessourcesRessourceParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__RessourcesAssignment_4_3_1"


    // $ANTLR start "rule__Conference__EventsAssignment_5_2"
    // InternalProgram.g:7830:1: rule__Conference__EventsAssignment_5_2 : ( ruleEvent ) ;
    public final void rule__Conference__EventsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7834:1: ( ( ruleEvent ) )
            // InternalProgram.g:7835:2: ( ruleEvent )
            {
            // InternalProgram.g:7835:2: ( ruleEvent )
            // InternalProgram.g:7836:3: ruleEvent
            {
             before(grammarAccess.getConferenceAccess().getEventsEventParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getConferenceAccess().getEventsEventParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__EventsAssignment_5_2"


    // $ANTLR start "rule__Conference__EventsAssignment_5_3_1"
    // InternalProgram.g:7845:1: rule__Conference__EventsAssignment_5_3_1 : ( ruleEvent ) ;
    public final void rule__Conference__EventsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7849:1: ( ( ruleEvent ) )
            // InternalProgram.g:7850:2: ( ruleEvent )
            {
            // InternalProgram.g:7850:2: ( ruleEvent )
            // InternalProgram.g:7851:3: ruleEvent
            {
             before(grammarAccess.getConferenceAccess().getEventsEventParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getConferenceAccess().getEventsEventParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__EventsAssignment_5_3_1"


    // $ANTLR start "rule__Conference__ProgramAssignment_6_1"
    // InternalProgram.g:7860:1: rule__Conference__ProgramAssignment_6_1 : ( ruleProgram ) ;
    public final void rule__Conference__ProgramAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7864:1: ( ( ruleProgram ) )
            // InternalProgram.g:7865:2: ( ruleProgram )
            {
            // InternalProgram.g:7865:2: ( ruleProgram )
            // InternalProgram.g:7866:3: ruleProgram
            {
             before(grammarAccess.getConferenceAccess().getProgramProgramParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getConferenceAccess().getProgramProgramParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conference__ProgramAssignment_6_1"


    // $ANTLR start "rule__Program__DaysAssignment_3_2"
    // InternalProgram.g:7875:1: rule__Program__DaysAssignment_3_2 : ( ruleDay ) ;
    public final void rule__Program__DaysAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7879:1: ( ( ruleDay ) )
            // InternalProgram.g:7880:2: ( ruleDay )
            {
            // InternalProgram.g:7880:2: ( ruleDay )
            // InternalProgram.g:7881:3: ruleDay
            {
             before(grammarAccess.getProgramAccess().getDaysDayParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDay();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getDaysDayParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__DaysAssignment_3_2"


    // $ANTLR start "rule__Program__DaysAssignment_3_3_1"
    // InternalProgram.g:7890:1: rule__Program__DaysAssignment_3_3_1 : ( ruleDay ) ;
    public final void rule__Program__DaysAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7894:1: ( ( ruleDay ) )
            // InternalProgram.g:7895:2: ( ruleDay )
            {
            // InternalProgram.g:7895:2: ( ruleDay )
            // InternalProgram.g:7896:3: ruleDay
            {
             before(grammarAccess.getProgramAccess().getDaysDayParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDay();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getDaysDayParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__DaysAssignment_3_3_1"


    // $ANTLR start "rule__Room__NameAssignment_2"
    // InternalProgram.g:7905:1: rule__Room__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Room__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7909:1: ( ( ruleEString ) )
            // InternalProgram.g:7910:2: ( ruleEString )
            {
            // InternalProgram.g:7910:2: ( ruleEString )
            // InternalProgram.g:7911:3: ruleEString
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


    // $ANTLR start "rule__Room__CapacityAssignment_4_1"
    // InternalProgram.g:7920:1: rule__Room__CapacityAssignment_4_1 : ( ruleEIntegerObject ) ;
    public final void rule__Room__CapacityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7924:1: ( ( ruleEIntegerObject ) )
            // InternalProgram.g:7925:2: ( ruleEIntegerObject )
            {
            // InternalProgram.g:7925:2: ( ruleEIntegerObject )
            // InternalProgram.g:7926:3: ruleEIntegerObject
            {
             before(grammarAccess.getRoomAccess().getCapacityEIntegerObjectParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEIntegerObject();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getCapacityEIntegerObjectParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__CapacityAssignment_4_1"


    // $ANTLR start "rule__Day__WeekdayAssignment_3"
    // InternalProgram.g:7935:1: rule__Day__WeekdayAssignment_3 : ( ruleWeekDay ) ;
    public final void rule__Day__WeekdayAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7939:1: ( ( ruleWeekDay ) )
            // InternalProgram.g:7940:2: ( ruleWeekDay )
            {
            // InternalProgram.g:7940:2: ( ruleWeekDay )
            // InternalProgram.g:7941:3: ruleWeekDay
            {
             before(grammarAccess.getDayAccess().getWeekdayWeekDayEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleWeekDay();

            state._fsp--;

             after(grammarAccess.getDayAccess().getWeekdayWeekDayEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__WeekdayAssignment_3"


    // $ANTLR start "rule__Day__DateAssignment_4_1"
    // InternalProgram.g:7950:1: rule__Day__DateAssignment_4_1 : ( ruleEDate ) ;
    public final void rule__Day__DateAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7954:1: ( ( ruleEDate ) )
            // InternalProgram.g:7955:2: ( ruleEDate )
            {
            // InternalProgram.g:7955:2: ( ruleEDate )
            // InternalProgram.g:7956:3: ruleEDate
            {
             before(grammarAccess.getDayAccess().getDateEDateParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getDayAccess().getDateEDateParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__DateAssignment_4_1"


    // $ANTLR start "rule__Day__SessionsAssignment_5_2"
    // InternalProgram.g:7965:1: rule__Day__SessionsAssignment_5_2 : ( ruleSession ) ;
    public final void rule__Day__SessionsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7969:1: ( ( ruleSession ) )
            // InternalProgram.g:7970:2: ( ruleSession )
            {
            // InternalProgram.g:7970:2: ( ruleSession )
            // InternalProgram.g:7971:3: ruleSession
            {
             before(grammarAccess.getDayAccess().getSessionsSessionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSession();

            state._fsp--;

             after(grammarAccess.getDayAccess().getSessionsSessionParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__SessionsAssignment_5_2"


    // $ANTLR start "rule__Day__SessionsAssignment_5_3_1"
    // InternalProgram.g:7980:1: rule__Day__SessionsAssignment_5_3_1 : ( ruleSession ) ;
    public final void rule__Day__SessionsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7984:1: ( ( ruleSession ) )
            // InternalProgram.g:7985:2: ( ruleSession )
            {
            // InternalProgram.g:7985:2: ( ruleSession )
            // InternalProgram.g:7986:3: ruleSession
            {
             before(grammarAccess.getDayAccess().getSessionsSessionParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSession();

            state._fsp--;

             after(grammarAccess.getDayAccess().getSessionsSessionParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__SessionsAssignment_5_3_1"


    // $ANTLR start "rule__Session__StartingTimeAssignment_3_1"
    // InternalProgram.g:7995:1: rule__Session__StartingTimeAssignment_3_1 : ( ruleEDate ) ;
    public final void rule__Session__StartingTimeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:7999:1: ( ( ruleEDate ) )
            // InternalProgram.g:8000:2: ( ruleEDate )
            {
            // InternalProgram.g:8000:2: ( ruleEDate )
            // InternalProgram.g:8001:3: ruleEDate
            {
             before(grammarAccess.getSessionAccess().getStartingTimeEDateParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getStartingTimeEDateParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__StartingTimeAssignment_3_1"


    // $ANTLR start "rule__Session__EndingTimeAssignment_4_1"
    // InternalProgram.g:8010:1: rule__Session__EndingTimeAssignment_4_1 : ( ruleEDate ) ;
    public final void rule__Session__EndingTimeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8014:1: ( ( ruleEDate ) )
            // InternalProgram.g:8015:2: ( ruleEDate )
            {
            // InternalProgram.g:8015:2: ( ruleEDate )
            // InternalProgram.g:8016:3: ruleEDate
            {
             before(grammarAccess.getSessionAccess().getEndingTimeEDateParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getEndingTimeEDateParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__EndingTimeAssignment_4_1"


    // $ANTLR start "rule__Session__EventsAssignment_5_2"
    // InternalProgram.g:8025:1: rule__Session__EventsAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__Session__EventsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8029:1: ( ( ( ruleEString ) ) )
            // InternalProgram.g:8030:2: ( ( ruleEString ) )
            {
            // InternalProgram.g:8030:2: ( ( ruleEString ) )
            // InternalProgram.g:8031:3: ( ruleEString )
            {
             before(grammarAccess.getSessionAccess().getEventsEventCrossReference_5_2_0()); 
            // InternalProgram.g:8032:3: ( ruleEString )
            // InternalProgram.g:8033:4: ruleEString
            {
             before(grammarAccess.getSessionAccess().getEventsEventEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getEventsEventEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getSessionAccess().getEventsEventCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__EventsAssignment_5_2"


    // $ANTLR start "rule__Session__EventsAssignment_5_3_1"
    // InternalProgram.g:8044:1: rule__Session__EventsAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Session__EventsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8048:1: ( ( ( ruleEString ) ) )
            // InternalProgram.g:8049:2: ( ( ruleEString ) )
            {
            // InternalProgram.g:8049:2: ( ( ruleEString ) )
            // InternalProgram.g:8050:3: ( ruleEString )
            {
             before(grammarAccess.getSessionAccess().getEventsEventCrossReference_5_3_1_0()); 
            // InternalProgram.g:8051:3: ( ruleEString )
            // InternalProgram.g:8052:4: ruleEString
            {
             before(grammarAccess.getSessionAccess().getEventsEventEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getEventsEventEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getSessionAccess().getEventsEventCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__EventsAssignment_5_3_1"


    // $ANTLR start "rule__Session__RoomAssignment_6_1"
    // InternalProgram.g:8063:1: rule__Session__RoomAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Session__RoomAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8067:1: ( ( ( ruleEString ) ) )
            // InternalProgram.g:8068:2: ( ( ruleEString ) )
            {
            // InternalProgram.g:8068:2: ( ( ruleEString ) )
            // InternalProgram.g:8069:3: ( ruleEString )
            {
             before(grammarAccess.getSessionAccess().getRoomRoomCrossReference_6_1_0()); 
            // InternalProgram.g:8070:3: ( ruleEString )
            // InternalProgram.g:8071:4: ruleEString
            {
             before(grammarAccess.getSessionAccess().getRoomRoomEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getRoomRoomEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getSessionAccess().getRoomRoomCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__RoomAssignment_6_1"


    // $ANTLR start "rule__TalkSession__NameAssignment_3"
    // InternalProgram.g:8082:1: rule__TalkSession__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__TalkSession__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8086:1: ( ( ruleEString ) )
            // InternalProgram.g:8087:2: ( ruleEString )
            {
            // InternalProgram.g:8087:2: ( ruleEString )
            // InternalProgram.g:8088:3: ruleEString
            {
             before(grammarAccess.getTalkSessionAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTalkSessionAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__NameAssignment_3"


    // $ANTLR start "rule__TalkSession__AbstractAssignment_4_1"
    // InternalProgram.g:8097:1: rule__TalkSession__AbstractAssignment_4_1 : ( ruleEString ) ;
    public final void rule__TalkSession__AbstractAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8101:1: ( ( ruleEString ) )
            // InternalProgram.g:8102:2: ( ruleEString )
            {
            // InternalProgram.g:8102:2: ( ruleEString )
            // InternalProgram.g:8103:3: ruleEString
            {
             before(grammarAccess.getTalkSessionAccess().getAbstractEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTalkSessionAccess().getAbstractEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__AbstractAssignment_4_1"


    // $ANTLR start "rule__TalkSession__PapersAssignment_5_2"
    // InternalProgram.g:8112:1: rule__TalkSession__PapersAssignment_5_2 : ( ruleTalk ) ;
    public final void rule__TalkSession__PapersAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8116:1: ( ( ruleTalk ) )
            // InternalProgram.g:8117:2: ( ruleTalk )
            {
            // InternalProgram.g:8117:2: ( ruleTalk )
            // InternalProgram.g:8118:3: ruleTalk
            {
             before(grammarAccess.getTalkSessionAccess().getPapersTalkParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTalk();

            state._fsp--;

             after(grammarAccess.getTalkSessionAccess().getPapersTalkParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__PapersAssignment_5_2"


    // $ANTLR start "rule__TalkSession__PapersAssignment_5_3_1"
    // InternalProgram.g:8127:1: rule__TalkSession__PapersAssignment_5_3_1 : ( ruleTalk ) ;
    public final void rule__TalkSession__PapersAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8131:1: ( ( ruleTalk ) )
            // InternalProgram.g:8132:2: ( ruleTalk )
            {
            // InternalProgram.g:8132:2: ( ruleTalk )
            // InternalProgram.g:8133:3: ruleTalk
            {
             before(grammarAccess.getTalkSessionAccess().getPapersTalkParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTalk();

            state._fsp--;

             after(grammarAccess.getTalkSessionAccess().getPapersTalkParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__PapersAssignment_5_3_1"


    // $ANTLR start "rule__TalkSession__ChairAssignment_6_1"
    // InternalProgram.g:8142:1: rule__TalkSession__ChairAssignment_6_1 : ( rulePerson ) ;
    public final void rule__TalkSession__ChairAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8146:1: ( ( rulePerson ) )
            // InternalProgram.g:8147:2: ( rulePerson )
            {
            // InternalProgram.g:8147:2: ( rulePerson )
            // InternalProgram.g:8148:3: rulePerson
            {
             before(grammarAccess.getTalkSessionAccess().getChairPersonParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getTalkSessionAccess().getChairPersonParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TalkSession__ChairAssignment_6_1"


    // $ANTLR start "rule__Panel__NameAssignment_3"
    // InternalProgram.g:8157:1: rule__Panel__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Panel__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8161:1: ( ( ruleEString ) )
            // InternalProgram.g:8162:2: ( ruleEString )
            {
            // InternalProgram.g:8162:2: ( ruleEString )
            // InternalProgram.g:8163:3: ruleEString
            {
             before(grammarAccess.getPanelAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPanelAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__NameAssignment_3"


    // $ANTLR start "rule__Panel__AbstractAssignment_4_1"
    // InternalProgram.g:8172:1: rule__Panel__AbstractAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Panel__AbstractAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8176:1: ( ( ruleEString ) )
            // InternalProgram.g:8177:2: ( ruleEString )
            {
            // InternalProgram.g:8177:2: ( ruleEString )
            // InternalProgram.g:8178:3: ruleEString
            {
             before(grammarAccess.getPanelAccess().getAbstractEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPanelAccess().getAbstractEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__AbstractAssignment_4_1"


    // $ANTLR start "rule__Panel__PanelistsAssignment_5_2"
    // InternalProgram.g:8187:1: rule__Panel__PanelistsAssignment_5_2 : ( rulePerson ) ;
    public final void rule__Panel__PanelistsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8191:1: ( ( rulePerson ) )
            // InternalProgram.g:8192:2: ( rulePerson )
            {
            // InternalProgram.g:8192:2: ( rulePerson )
            // InternalProgram.g:8193:3: rulePerson
            {
             before(grammarAccess.getPanelAccess().getPanelistsPersonParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPanelAccess().getPanelistsPersonParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__PanelistsAssignment_5_2"


    // $ANTLR start "rule__Panel__PanelistsAssignment_5_3_1"
    // InternalProgram.g:8202:1: rule__Panel__PanelistsAssignment_5_3_1 : ( rulePerson ) ;
    public final void rule__Panel__PanelistsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8206:1: ( ( rulePerson ) )
            // InternalProgram.g:8207:2: ( rulePerson )
            {
            // InternalProgram.g:8207:2: ( rulePerson )
            // InternalProgram.g:8208:3: rulePerson
            {
             before(grammarAccess.getPanelAccess().getPanelistsPersonParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPanelAccess().getPanelistsPersonParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__PanelistsAssignment_5_3_1"


    // $ANTLR start "rule__Panel__ModeratorsAssignment_6_2"
    // InternalProgram.g:8217:1: rule__Panel__ModeratorsAssignment_6_2 : ( rulePerson ) ;
    public final void rule__Panel__ModeratorsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8221:1: ( ( rulePerson ) )
            // InternalProgram.g:8222:2: ( rulePerson )
            {
            // InternalProgram.g:8222:2: ( rulePerson )
            // InternalProgram.g:8223:3: rulePerson
            {
             before(grammarAccess.getPanelAccess().getModeratorsPersonParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPanelAccess().getModeratorsPersonParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__ModeratorsAssignment_6_2"


    // $ANTLR start "rule__Panel__ModeratorsAssignment_6_3_1"
    // InternalProgram.g:8232:1: rule__Panel__ModeratorsAssignment_6_3_1 : ( rulePerson ) ;
    public final void rule__Panel__ModeratorsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8236:1: ( ( rulePerson ) )
            // InternalProgram.g:8237:2: ( rulePerson )
            {
            // InternalProgram.g:8237:2: ( rulePerson )
            // InternalProgram.g:8238:3: rulePerson
            {
             before(grammarAccess.getPanelAccess().getModeratorsPersonParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPanelAccess().getModeratorsPersonParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__ModeratorsAssignment_6_3_1"


    // $ANTLR start "rule__Workshop__NameAssignment_3"
    // InternalProgram.g:8247:1: rule__Workshop__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Workshop__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8251:1: ( ( ruleEString ) )
            // InternalProgram.g:8252:2: ( ruleEString )
            {
            // InternalProgram.g:8252:2: ( ruleEString )
            // InternalProgram.g:8253:3: ruleEString
            {
             before(grammarAccess.getWorkshopAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkshopAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__NameAssignment_3"


    // $ANTLR start "rule__Workshop__AbstractAssignment_4_1"
    // InternalProgram.g:8262:1: rule__Workshop__AbstractAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Workshop__AbstractAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8266:1: ( ( ruleEString ) )
            // InternalProgram.g:8267:2: ( ruleEString )
            {
            // InternalProgram.g:8267:2: ( ruleEString )
            // InternalProgram.g:8268:3: ruleEString
            {
             before(grammarAccess.getWorkshopAccess().getAbstractEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkshopAccess().getAbstractEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__AbstractAssignment_4_1"


    // $ANTLR start "rule__Workshop__UrlAssignment_5_1"
    // InternalProgram.g:8277:1: rule__Workshop__UrlAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Workshop__UrlAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8281:1: ( ( ruleEString ) )
            // InternalProgram.g:8282:2: ( ruleEString )
            {
            // InternalProgram.g:8282:2: ( ruleEString )
            // InternalProgram.g:8283:3: ruleEString
            {
             before(grammarAccess.getWorkshopAccess().getUrlEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkshopAccess().getUrlEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__UrlAssignment_5_1"


    // $ANTLR start "rule__Workshop__IdAssignment_6_1"
    // InternalProgram.g:8292:1: rule__Workshop__IdAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Workshop__IdAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8296:1: ( ( ruleEString ) )
            // InternalProgram.g:8297:2: ( ruleEString )
            {
            // InternalProgram.g:8297:2: ( ruleEString )
            // InternalProgram.g:8298:3: ruleEString
            {
             before(grammarAccess.getWorkshopAccess().getIdEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkshopAccess().getIdEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__IdAssignment_6_1"


    // $ANTLR start "rule__Workshop__OrganizersAssignment_7_2"
    // InternalProgram.g:8307:1: rule__Workshop__OrganizersAssignment_7_2 : ( rulePerson ) ;
    public final void rule__Workshop__OrganizersAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8311:1: ( ( rulePerson ) )
            // InternalProgram.g:8312:2: ( rulePerson )
            {
            // InternalProgram.g:8312:2: ( rulePerson )
            // InternalProgram.g:8313:3: rulePerson
            {
             before(grammarAccess.getWorkshopAccess().getOrganizersPersonParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getWorkshopAccess().getOrganizersPersonParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__OrganizersAssignment_7_2"


    // $ANTLR start "rule__Workshop__OrganizersAssignment_7_3_1"
    // InternalProgram.g:8322:1: rule__Workshop__OrganizersAssignment_7_3_1 : ( rulePerson ) ;
    public final void rule__Workshop__OrganizersAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8326:1: ( ( rulePerson ) )
            // InternalProgram.g:8327:2: ( rulePerson )
            {
            // InternalProgram.g:8327:2: ( rulePerson )
            // InternalProgram.g:8328:3: rulePerson
            {
             before(grammarAccess.getWorkshopAccess().getOrganizersPersonParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getWorkshopAccess().getOrganizersPersonParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workshop__OrganizersAssignment_7_3_1"


    // $ANTLR start "rule__Tutorial__NameAssignment_3"
    // InternalProgram.g:8337:1: rule__Tutorial__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Tutorial__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8341:1: ( ( ruleEString ) )
            // InternalProgram.g:8342:2: ( ruleEString )
            {
            // InternalProgram.g:8342:2: ( ruleEString )
            // InternalProgram.g:8343:3: ruleEString
            {
             before(grammarAccess.getTutorialAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTutorialAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__NameAssignment_3"


    // $ANTLR start "rule__Tutorial__AbstractAssignment_4_1"
    // InternalProgram.g:8352:1: rule__Tutorial__AbstractAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Tutorial__AbstractAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8356:1: ( ( ruleEString ) )
            // InternalProgram.g:8357:2: ( ruleEString )
            {
            // InternalProgram.g:8357:2: ( ruleEString )
            // InternalProgram.g:8358:3: ruleEString
            {
             before(grammarAccess.getTutorialAccess().getAbstractEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTutorialAccess().getAbstractEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__AbstractAssignment_4_1"


    // $ANTLR start "rule__Tutorial__IdAssignment_5_1"
    // InternalProgram.g:8367:1: rule__Tutorial__IdAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Tutorial__IdAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8371:1: ( ( ruleEString ) )
            // InternalProgram.g:8372:2: ( ruleEString )
            {
            // InternalProgram.g:8372:2: ( ruleEString )
            // InternalProgram.g:8373:3: ruleEString
            {
             before(grammarAccess.getTutorialAccess().getIdEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTutorialAccess().getIdEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__IdAssignment_5_1"


    // $ANTLR start "rule__Tutorial__OrganizersAssignment_6_2"
    // InternalProgram.g:8382:1: rule__Tutorial__OrganizersAssignment_6_2 : ( rulePerson ) ;
    public final void rule__Tutorial__OrganizersAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8386:1: ( ( rulePerson ) )
            // InternalProgram.g:8387:2: ( rulePerson )
            {
            // InternalProgram.g:8387:2: ( rulePerson )
            // InternalProgram.g:8388:3: rulePerson
            {
             before(grammarAccess.getTutorialAccess().getOrganizersPersonParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getTutorialAccess().getOrganizersPersonParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__OrganizersAssignment_6_2"


    // $ANTLR start "rule__Tutorial__OrganizersAssignment_6_3_1"
    // InternalProgram.g:8397:1: rule__Tutorial__OrganizersAssignment_6_3_1 : ( rulePerson ) ;
    public final void rule__Tutorial__OrganizersAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8401:1: ( ( rulePerson ) )
            // InternalProgram.g:8402:2: ( rulePerson )
            {
            // InternalProgram.g:8402:2: ( rulePerson )
            // InternalProgram.g:8403:3: rulePerson
            {
             before(grammarAccess.getTutorialAccess().getOrganizersPersonParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getTutorialAccess().getOrganizersPersonParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tutorial__OrganizersAssignment_6_3_1"


    // $ANTLR start "rule__DoctoralSymposium__NameAssignment_3"
    // InternalProgram.g:8412:1: rule__DoctoralSymposium__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__DoctoralSymposium__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8416:1: ( ( ruleEString ) )
            // InternalProgram.g:8417:2: ( ruleEString )
            {
            // InternalProgram.g:8417:2: ( ruleEString )
            // InternalProgram.g:8418:3: ruleEString
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDoctoralSymposiumAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__NameAssignment_3"


    // $ANTLR start "rule__DoctoralSymposium__AbstractAssignment_4_1"
    // InternalProgram.g:8427:1: rule__DoctoralSymposium__AbstractAssignment_4_1 : ( ruleEString ) ;
    public final void rule__DoctoralSymposium__AbstractAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8431:1: ( ( ruleEString ) )
            // InternalProgram.g:8432:2: ( ruleEString )
            {
            // InternalProgram.g:8432:2: ( ruleEString )
            // InternalProgram.g:8433:3: ruleEString
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getAbstractEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDoctoralSymposiumAccess().getAbstractEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__AbstractAssignment_4_1"


    // $ANTLR start "rule__DoctoralSymposium__OrganizersAssignment_5_2"
    // InternalProgram.g:8442:1: rule__DoctoralSymposium__OrganizersAssignment_5_2 : ( rulePerson ) ;
    public final void rule__DoctoralSymposium__OrganizersAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8446:1: ( ( rulePerson ) )
            // InternalProgram.g:8447:2: ( rulePerson )
            {
            // InternalProgram.g:8447:2: ( rulePerson )
            // InternalProgram.g:8448:3: rulePerson
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getOrganizersPersonParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getDoctoralSymposiumAccess().getOrganizersPersonParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__OrganizersAssignment_5_2"


    // $ANTLR start "rule__DoctoralSymposium__OrganizersAssignment_5_3_1"
    // InternalProgram.g:8457:1: rule__DoctoralSymposium__OrganizersAssignment_5_3_1 : ( rulePerson ) ;
    public final void rule__DoctoralSymposium__OrganizersAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8461:1: ( ( rulePerson ) )
            // InternalProgram.g:8462:2: ( rulePerson )
            {
            // InternalProgram.g:8462:2: ( rulePerson )
            // InternalProgram.g:8463:3: rulePerson
            {
             before(grammarAccess.getDoctoralSymposiumAccess().getOrganizersPersonParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getDoctoralSymposiumAccess().getOrganizersPersonParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoctoralSymposium__OrganizersAssignment_5_3_1"


    // $ANTLR start "rule__EducatorSymposium__NameAssignment_3"
    // InternalProgram.g:8472:1: rule__EducatorSymposium__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__EducatorSymposium__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8476:1: ( ( ruleEString ) )
            // InternalProgram.g:8477:2: ( ruleEString )
            {
            // InternalProgram.g:8477:2: ( ruleEString )
            // InternalProgram.g:8478:3: ruleEString
            {
             before(grammarAccess.getEducatorSymposiumAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEducatorSymposiumAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__NameAssignment_3"


    // $ANTLR start "rule__EducatorSymposium__AbstractAssignment_4_1"
    // InternalProgram.g:8487:1: rule__EducatorSymposium__AbstractAssignment_4_1 : ( ruleEString ) ;
    public final void rule__EducatorSymposium__AbstractAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8491:1: ( ( ruleEString ) )
            // InternalProgram.g:8492:2: ( ruleEString )
            {
            // InternalProgram.g:8492:2: ( ruleEString )
            // InternalProgram.g:8493:3: ruleEString
            {
             before(grammarAccess.getEducatorSymposiumAccess().getAbstractEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEducatorSymposiumAccess().getAbstractEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__AbstractAssignment_4_1"


    // $ANTLR start "rule__EducatorSymposium__OrganizersAssignment_5_2"
    // InternalProgram.g:8502:1: rule__EducatorSymposium__OrganizersAssignment_5_2 : ( rulePerson ) ;
    public final void rule__EducatorSymposium__OrganizersAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8506:1: ( ( rulePerson ) )
            // InternalProgram.g:8507:2: ( rulePerson )
            {
            // InternalProgram.g:8507:2: ( rulePerson )
            // InternalProgram.g:8508:3: rulePerson
            {
             before(grammarAccess.getEducatorSymposiumAccess().getOrganizersPersonParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getEducatorSymposiumAccess().getOrganizersPersonParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__OrganizersAssignment_5_2"


    // $ANTLR start "rule__EducatorSymposium__OrganizersAssignment_5_3_1"
    // InternalProgram.g:8517:1: rule__EducatorSymposium__OrganizersAssignment_5_3_1 : ( rulePerson ) ;
    public final void rule__EducatorSymposium__OrganizersAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8521:1: ( ( rulePerson ) )
            // InternalProgram.g:8522:2: ( rulePerson )
            {
            // InternalProgram.g:8522:2: ( rulePerson )
            // InternalProgram.g:8523:3: rulePerson
            {
             before(grammarAccess.getEducatorSymposiumAccess().getOrganizersPersonParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getEducatorSymposiumAccess().getOrganizersPersonParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EducatorSymposium__OrganizersAssignment_5_3_1"


    // $ANTLR start "rule__Reception__NameAssignment_3"
    // InternalProgram.g:8532:1: rule__Reception__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Reception__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8536:1: ( ( ruleEString ) )
            // InternalProgram.g:8537:2: ( ruleEString )
            {
            // InternalProgram.g:8537:2: ( ruleEString )
            // InternalProgram.g:8538:3: ruleEString
            {
             before(grammarAccess.getReceptionAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReceptionAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reception__NameAssignment_3"


    // $ANTLR start "rule__Reception__AbstractAssignment_4_1"
    // InternalProgram.g:8547:1: rule__Reception__AbstractAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Reception__AbstractAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8551:1: ( ( ruleEString ) )
            // InternalProgram.g:8552:2: ( ruleEString )
            {
            // InternalProgram.g:8552:2: ( ruleEString )
            // InternalProgram.g:8553:3: ruleEString
            {
             before(grammarAccess.getReceptionAccess().getAbstractEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReceptionAccess().getAbstractEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reception__AbstractAssignment_4_1"


    // $ANTLR start "rule__Clinic__NameAssignment_3"
    // InternalProgram.g:8562:1: rule__Clinic__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Clinic__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8566:1: ( ( ruleEString ) )
            // InternalProgram.g:8567:2: ( ruleEString )
            {
            // InternalProgram.g:8567:2: ( ruleEString )
            // InternalProgram.g:8568:3: ruleEString
            {
             before(grammarAccess.getClinicAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClinicAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clinic__NameAssignment_3"


    // $ANTLR start "rule__Clinic__AbstractAssignment_4_1"
    // InternalProgram.g:8577:1: rule__Clinic__AbstractAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Clinic__AbstractAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8581:1: ( ( ruleEString ) )
            // InternalProgram.g:8582:2: ( ruleEString )
            {
            // InternalProgram.g:8582:2: ( ruleEString )
            // InternalProgram.g:8583:3: ruleEString
            {
             before(grammarAccess.getClinicAccess().getAbstractEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClinicAccess().getAbstractEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clinic__AbstractAssignment_4_1"


    // $ANTLR start "rule__Lunch__NameAssignment_3"
    // InternalProgram.g:8592:1: rule__Lunch__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Lunch__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8596:1: ( ( ruleEString ) )
            // InternalProgram.g:8597:2: ( ruleEString )
            {
            // InternalProgram.g:8597:2: ( ruleEString )
            // InternalProgram.g:8598:3: ruleEString
            {
             before(grammarAccess.getLunchAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLunchAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__NameAssignment_3"


    // $ANTLR start "rule__Lunch__AbstractAssignment_4_1"
    // InternalProgram.g:8607:1: rule__Lunch__AbstractAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Lunch__AbstractAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8611:1: ( ( ruleEString ) )
            // InternalProgram.g:8612:2: ( ruleEString )
            {
            // InternalProgram.g:8612:2: ( ruleEString )
            // InternalProgram.g:8613:3: ruleEString
            {
             before(grammarAccess.getLunchAccess().getAbstractEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLunchAccess().getAbstractEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lunch__AbstractAssignment_4_1"


    // $ANTLR start "rule__Talk__PreprintAssignment_3_1"
    // InternalProgram.g:8622:1: rule__Talk__PreprintAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Talk__PreprintAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8626:1: ( ( ruleEString ) )
            // InternalProgram.g:8627:2: ( ruleEString )
            {
            // InternalProgram.g:8627:2: ( ruleEString )
            // InternalProgram.g:8628:3: ruleEString
            {
             before(grammarAccess.getTalkAccess().getPreprintEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTalkAccess().getPreprintEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__PreprintAssignment_3_1"


    // $ANTLR start "rule__Talk__KindAssignment_4_1"
    // InternalProgram.g:8637:1: rule__Talk__KindAssignment_4_1 : ( ruleTrack ) ;
    public final void rule__Talk__KindAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8641:1: ( ( ruleTrack ) )
            // InternalProgram.g:8642:2: ( ruleTrack )
            {
            // InternalProgram.g:8642:2: ( ruleTrack )
            // InternalProgram.g:8643:3: ruleTrack
            {
             before(grammarAccess.getTalkAccess().getKindTrackEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTrack();

            state._fsp--;

             after(grammarAccess.getTalkAccess().getKindTrackEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__KindAssignment_4_1"


    // $ANTLR start "rule__Talk__AuthorsAssignment_5_2"
    // InternalProgram.g:8652:1: rule__Talk__AuthorsAssignment_5_2 : ( rulePerson ) ;
    public final void rule__Talk__AuthorsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8656:1: ( ( rulePerson ) )
            // InternalProgram.g:8657:2: ( rulePerson )
            {
            // InternalProgram.g:8657:2: ( rulePerson )
            // InternalProgram.g:8658:3: rulePerson
            {
             before(grammarAccess.getTalkAccess().getAuthorsPersonParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getTalkAccess().getAuthorsPersonParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__AuthorsAssignment_5_2"


    // $ANTLR start "rule__Talk__AuthorsAssignment_5_3_1"
    // InternalProgram.g:8667:1: rule__Talk__AuthorsAssignment_5_3_1 : ( rulePerson ) ;
    public final void rule__Talk__AuthorsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8671:1: ( ( rulePerson ) )
            // InternalProgram.g:8672:2: ( rulePerson )
            {
            // InternalProgram.g:8672:2: ( rulePerson )
            // InternalProgram.g:8673:3: rulePerson
            {
             before(grammarAccess.getTalkAccess().getAuthorsPersonParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getTalkAccess().getAuthorsPersonParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__AuthorsAssignment_5_3_1"


    // $ANTLR start "rule__Person__NameAssignment_2"
    // InternalProgram.g:8682:1: rule__Person__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Person__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8686:1: ( ( ruleEString ) )
            // InternalProgram.g:8687:2: ( ruleEString )
            {
            // InternalProgram.g:8687:2: ( ruleEString )
            // InternalProgram.g:8688:3: ruleEString
            {
             before(grammarAccess.getPersonAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__NameAssignment_2"


    // $ANTLR start "rule__Person__EmailAssignment_4_1"
    // InternalProgram.g:8697:1: rule__Person__EmailAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Person__EmailAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8701:1: ( ( ruleEString ) )
            // InternalProgram.g:8702:2: ( ruleEString )
            {
            // InternalProgram.g:8702:2: ( ruleEString )
            // InternalProgram.g:8703:3: ruleEString
            {
             before(grammarAccess.getPersonAccess().getEmailEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getEmailEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__EmailAssignment_4_1"


    // $ANTLR start "rule__Person__HomepageAssignment_5_1"
    // InternalProgram.g:8712:1: rule__Person__HomepageAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Person__HomepageAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProgram.g:8716:1: ( ( ruleEString ) )
            // InternalProgram.g:8717:2: ( ruleEString )
            {
            // InternalProgram.g:8717:2: ( ruleEString )
            // InternalProgram.g:8718:3: ruleEString
            {
             before(grammarAccess.getPersonAccess().getHomepageEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getHomepageEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__HomepageAssignment_5_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000006C00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x3F12100000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000003F800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000C00400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000098002400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040001000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001C00000400000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000C400000400000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00E0400000400000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00C0400000400000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0080400000400000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000400000400000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x8000000000400000L,0x0000000000000003L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000018L});

}