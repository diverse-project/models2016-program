package fr.irisa.models.program.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import fr.irisa.models.program.services.ProgramGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProgramParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Workshop'", "'Tutorial'", "'Symposium'", "'Clinic'", "'Break'", "'Lunch'", "'Poster'", "'SRC'", "'Main'", "'Bouvet 1'", "'Bouvet 2'", "'Charcot'", "'Vauban 1'", "'Vauban 2'", "'Lamannais 1'", "'Lamennais 2'", "'Lamennais 3'", "'Rotonde Surcouf'", "'Chateaubriand'", "'Lamennais 1+2'", "'Lamennais 4+5'", "'Grand Large'", "'Rotonde J. Cartier'", "'Monday'", "'Tuesday'", "'Wednesday'", "'Thursday'", "'Friday'", "'Saturday'", "'Sunday'", "':'", "'Session'", "'start'", "'end'", "','", "'('", "')'"
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




    // $ANTLR start "entryRuleProgram"
    // InternalProgram.g:60:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalProgram.g:61:1: ( ruleProgram EOF )
            // InternalProgram.g:62:1: ruleProgram EOF
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
    // InternalProgram.g:69:1: ruleProgram : ( ( rule__Program__Group__0 )? ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:73:2: ( ( ( rule__Program__Group__0 )? ) )
            // InternalProgram.g:74:1: ( ( rule__Program__Group__0 )? )
            {
            // InternalProgram.g:74:1: ( ( rule__Program__Group__0 )? )
            // InternalProgram.g:75:1: ( rule__Program__Group__0 )?
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalProgram.g:76:1: ( rule__Program__Group__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=34 && LA1_0<=40)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalProgram.g:76:2: rule__Program__Group__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Program__Group__0();

                    state._fsp--;


                    }
                    break;

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


    // $ANTLR start "entryRuleDay"
    // InternalProgram.g:88:1: entryRuleDay : ruleDay EOF ;
    public final void entryRuleDay() throws RecognitionException {
        try {
            // InternalProgram.g:89:1: ( ruleDay EOF )
            // InternalProgram.g:90:1: ruleDay EOF
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
    // InternalProgram.g:97:1: ruleDay : ( ( rule__Day__Group__0 ) ) ;
    public final void ruleDay() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:101:2: ( ( ( rule__Day__Group__0 ) ) )
            // InternalProgram.g:102:1: ( ( rule__Day__Group__0 ) )
            {
            // InternalProgram.g:102:1: ( ( rule__Day__Group__0 ) )
            // InternalProgram.g:103:1: ( rule__Day__Group__0 )
            {
             before(grammarAccess.getDayAccess().getGroup()); 
            // InternalProgram.g:104:1: ( rule__Day__Group__0 )
            // InternalProgram.g:104:2: rule__Day__Group__0
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


    // $ANTLR start "entryRuleSession"
    // InternalProgram.g:116:1: entryRuleSession : ruleSession EOF ;
    public final void entryRuleSession() throws RecognitionException {
        try {
            // InternalProgram.g:117:1: ( ruleSession EOF )
            // InternalProgram.g:118:1: ruleSession EOF
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
    // InternalProgram.g:125:1: ruleSession : ( ( rule__Session__Group__0 ) ) ;
    public final void ruleSession() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:129:2: ( ( ( rule__Session__Group__0 ) ) )
            // InternalProgram.g:130:1: ( ( rule__Session__Group__0 ) )
            {
            // InternalProgram.g:130:1: ( ( rule__Session__Group__0 ) )
            // InternalProgram.g:131:1: ( rule__Session__Group__0 )
            {
             before(grammarAccess.getSessionAccess().getGroup()); 
            // InternalProgram.g:132:1: ( rule__Session__Group__0 )
            // InternalProgram.g:132:2: rule__Session__Group__0
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


    // $ANTLR start "entryRuleTalk"
    // InternalProgram.g:144:1: entryRuleTalk : ruleTalk EOF ;
    public final void entryRuleTalk() throws RecognitionException {
        try {
            // InternalProgram.g:145:1: ( ruleTalk EOF )
            // InternalProgram.g:146:1: ruleTalk EOF
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
    // InternalProgram.g:153:1: ruleTalk : ( ( rule__Talk__Group__0 ) ) ;
    public final void ruleTalk() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:157:2: ( ( ( rule__Talk__Group__0 ) ) )
            // InternalProgram.g:158:1: ( ( rule__Talk__Group__0 ) )
            {
            // InternalProgram.g:158:1: ( ( rule__Talk__Group__0 ) )
            // InternalProgram.g:159:1: ( rule__Talk__Group__0 )
            {
             before(grammarAccess.getTalkAccess().getGroup()); 
            // InternalProgram.g:160:1: ( rule__Talk__Group__0 )
            // InternalProgram.g:160:2: rule__Talk__Group__0
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


    // $ANTLR start "ruleTalkType"
    // InternalProgram.g:173:1: ruleTalkType : ( ( rule__TalkType__Alternatives ) ) ;
    public final void ruleTalkType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:177:1: ( ( ( rule__TalkType__Alternatives ) ) )
            // InternalProgram.g:178:1: ( ( rule__TalkType__Alternatives ) )
            {
            // InternalProgram.g:178:1: ( ( rule__TalkType__Alternatives ) )
            // InternalProgram.g:179:1: ( rule__TalkType__Alternatives )
            {
             before(grammarAccess.getTalkTypeAccess().getAlternatives()); 
            // InternalProgram.g:180:1: ( rule__TalkType__Alternatives )
            // InternalProgram.g:180:2: rule__TalkType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TalkType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTalkTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTalkType"


    // $ANTLR start "ruleRoom"
    // InternalProgram.g:192:1: ruleRoom : ( ( rule__Room__Alternatives ) ) ;
    public final void ruleRoom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:196:1: ( ( ( rule__Room__Alternatives ) ) )
            // InternalProgram.g:197:1: ( ( rule__Room__Alternatives ) )
            {
            // InternalProgram.g:197:1: ( ( rule__Room__Alternatives ) )
            // InternalProgram.g:198:1: ( rule__Room__Alternatives )
            {
             before(grammarAccess.getRoomAccess().getAlternatives()); 
            // InternalProgram.g:199:1: ( rule__Room__Alternatives )
            // InternalProgram.g:199:2: rule__Room__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Room__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "ruleWeekDay"
    // InternalProgram.g:211:1: ruleWeekDay : ( ( rule__WeekDay__Alternatives ) ) ;
    public final void ruleWeekDay() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:215:1: ( ( ( rule__WeekDay__Alternatives ) ) )
            // InternalProgram.g:216:1: ( ( rule__WeekDay__Alternatives ) )
            {
            // InternalProgram.g:216:1: ( ( rule__WeekDay__Alternatives ) )
            // InternalProgram.g:217:1: ( rule__WeekDay__Alternatives )
            {
             before(grammarAccess.getWeekDayAccess().getAlternatives()); 
            // InternalProgram.g:218:1: ( rule__WeekDay__Alternatives )
            // InternalProgram.g:218:2: rule__WeekDay__Alternatives
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


    // $ANTLR start "rule__TalkType__Alternatives"
    // InternalProgram.g:229:1: rule__TalkType__Alternatives : ( ( ( 'Workshop' ) ) | ( ( 'Tutorial' ) ) | ( ( 'Symposium' ) ) | ( ( 'Clinic' ) ) | ( ( 'Break' ) ) | ( ( 'Lunch' ) ) | ( ( 'Poster' ) ) | ( ( 'SRC' ) ) | ( ( 'Main' ) ) );
    public final void rule__TalkType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:233:1: ( ( ( 'Workshop' ) ) | ( ( 'Tutorial' ) ) | ( ( 'Symposium' ) ) | ( ( 'Clinic' ) ) | ( ( 'Break' ) ) | ( ( 'Lunch' ) ) | ( ( 'Poster' ) ) | ( ( 'SRC' ) ) | ( ( 'Main' ) ) )
            int alt2=9;
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
            case 18:
                {
                alt2=8;
                }
                break;
            case 19:
                {
                alt2=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalProgram.g:234:1: ( ( 'Workshop' ) )
                    {
                    // InternalProgram.g:234:1: ( ( 'Workshop' ) )
                    // InternalProgram.g:235:1: ( 'Workshop' )
                    {
                     before(grammarAccess.getTalkTypeAccess().getWorkshopEnumLiteralDeclaration_0()); 
                    // InternalProgram.g:236:1: ( 'Workshop' )
                    // InternalProgram.g:236:3: 'Workshop'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTalkTypeAccess().getWorkshopEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProgram.g:241:6: ( ( 'Tutorial' ) )
                    {
                    // InternalProgram.g:241:6: ( ( 'Tutorial' ) )
                    // InternalProgram.g:242:1: ( 'Tutorial' )
                    {
                     before(grammarAccess.getTalkTypeAccess().getTutorialEnumLiteralDeclaration_1()); 
                    // InternalProgram.g:243:1: ( 'Tutorial' )
                    // InternalProgram.g:243:3: 'Tutorial'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTalkTypeAccess().getTutorialEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProgram.g:248:6: ( ( 'Symposium' ) )
                    {
                    // InternalProgram.g:248:6: ( ( 'Symposium' ) )
                    // InternalProgram.g:249:1: ( 'Symposium' )
                    {
                     before(grammarAccess.getTalkTypeAccess().getSymposiumEnumLiteralDeclaration_2()); 
                    // InternalProgram.g:250:1: ( 'Symposium' )
                    // InternalProgram.g:250:3: 'Symposium'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTalkTypeAccess().getSymposiumEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalProgram.g:255:6: ( ( 'Clinic' ) )
                    {
                    // InternalProgram.g:255:6: ( ( 'Clinic' ) )
                    // InternalProgram.g:256:1: ( 'Clinic' )
                    {
                     before(grammarAccess.getTalkTypeAccess().getClinicEnumLiteralDeclaration_3()); 
                    // InternalProgram.g:257:1: ( 'Clinic' )
                    // InternalProgram.g:257:3: 'Clinic'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTalkTypeAccess().getClinicEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalProgram.g:262:6: ( ( 'Break' ) )
                    {
                    // InternalProgram.g:262:6: ( ( 'Break' ) )
                    // InternalProgram.g:263:1: ( 'Break' )
                    {
                     before(grammarAccess.getTalkTypeAccess().getBreakEnumLiteralDeclaration_4()); 
                    // InternalProgram.g:264:1: ( 'Break' )
                    // InternalProgram.g:264:3: 'Break'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTalkTypeAccess().getBreakEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalProgram.g:269:6: ( ( 'Lunch' ) )
                    {
                    // InternalProgram.g:269:6: ( ( 'Lunch' ) )
                    // InternalProgram.g:270:1: ( 'Lunch' )
                    {
                     before(grammarAccess.getTalkTypeAccess().getLunchEnumLiteralDeclaration_5()); 
                    // InternalProgram.g:271:1: ( 'Lunch' )
                    // InternalProgram.g:271:3: 'Lunch'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTalkTypeAccess().getLunchEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalProgram.g:276:6: ( ( 'Poster' ) )
                    {
                    // InternalProgram.g:276:6: ( ( 'Poster' ) )
                    // InternalProgram.g:277:1: ( 'Poster' )
                    {
                     before(grammarAccess.getTalkTypeAccess().getPosterEnumLiteralDeclaration_6()); 
                    // InternalProgram.g:278:1: ( 'Poster' )
                    // InternalProgram.g:278:3: 'Poster'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTalkTypeAccess().getPosterEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalProgram.g:283:6: ( ( 'SRC' ) )
                    {
                    // InternalProgram.g:283:6: ( ( 'SRC' ) )
                    // InternalProgram.g:284:1: ( 'SRC' )
                    {
                     before(grammarAccess.getTalkTypeAccess().getSRCEnumLiteralDeclaration_7()); 
                    // InternalProgram.g:285:1: ( 'SRC' )
                    // InternalProgram.g:285:3: 'SRC'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTalkTypeAccess().getSRCEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalProgram.g:290:6: ( ( 'Main' ) )
                    {
                    // InternalProgram.g:290:6: ( ( 'Main' ) )
                    // InternalProgram.g:291:1: ( 'Main' )
                    {
                     before(grammarAccess.getTalkTypeAccess().getMainEnumLiteralDeclaration_8()); 
                    // InternalProgram.g:292:1: ( 'Main' )
                    // InternalProgram.g:292:3: 'Main'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTalkTypeAccess().getMainEnumLiteralDeclaration_8()); 

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
    // $ANTLR end "rule__TalkType__Alternatives"


    // $ANTLR start "rule__Room__Alternatives"
    // InternalProgram.g:302:1: rule__Room__Alternatives : ( ( ( 'Bouvet 1' ) ) | ( ( 'Bouvet 2' ) ) | ( ( 'Charcot' ) ) | ( ( 'Vauban 1' ) ) | ( ( 'Vauban 2' ) ) | ( ( 'Lamannais 1' ) ) | ( ( 'Lamennais 2' ) ) | ( ( 'Lamennais 3' ) ) | ( ( 'Rotonde Surcouf' ) ) | ( ( 'Chateaubriand' ) ) | ( ( 'Lamennais 1+2' ) ) | ( ( 'Lamennais 4+5' ) ) | ( ( 'Grand Large' ) ) | ( ( 'Rotonde J. Cartier' ) ) );
    public final void rule__Room__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:306:1: ( ( ( 'Bouvet 1' ) ) | ( ( 'Bouvet 2' ) ) | ( ( 'Charcot' ) ) | ( ( 'Vauban 1' ) ) | ( ( 'Vauban 2' ) ) | ( ( 'Lamannais 1' ) ) | ( ( 'Lamennais 2' ) ) | ( ( 'Lamennais 3' ) ) | ( ( 'Rotonde Surcouf' ) ) | ( ( 'Chateaubriand' ) ) | ( ( 'Lamennais 1+2' ) ) | ( ( 'Lamennais 4+5' ) ) | ( ( 'Grand Large' ) ) | ( ( 'Rotonde J. Cartier' ) ) )
            int alt3=14;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt3=1;
                }
                break;
            case 21:
                {
                alt3=2;
                }
                break;
            case 22:
                {
                alt3=3;
                }
                break;
            case 23:
                {
                alt3=4;
                }
                break;
            case 24:
                {
                alt3=5;
                }
                break;
            case 25:
                {
                alt3=6;
                }
                break;
            case 26:
                {
                alt3=7;
                }
                break;
            case 27:
                {
                alt3=8;
                }
                break;
            case 28:
                {
                alt3=9;
                }
                break;
            case 29:
                {
                alt3=10;
                }
                break;
            case 30:
                {
                alt3=11;
                }
                break;
            case 31:
                {
                alt3=12;
                }
                break;
            case 32:
                {
                alt3=13;
                }
                break;
            case 33:
                {
                alt3=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalProgram.g:307:1: ( ( 'Bouvet 1' ) )
                    {
                    // InternalProgram.g:307:1: ( ( 'Bouvet 1' ) )
                    // InternalProgram.g:308:1: ( 'Bouvet 1' )
                    {
                     before(grammarAccess.getRoomAccess().getBouvet1EnumLiteralDeclaration_0()); 
                    // InternalProgram.g:309:1: ( 'Bouvet 1' )
                    // InternalProgram.g:309:3: 'Bouvet 1'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomAccess().getBouvet1EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProgram.g:314:6: ( ( 'Bouvet 2' ) )
                    {
                    // InternalProgram.g:314:6: ( ( 'Bouvet 2' ) )
                    // InternalProgram.g:315:1: ( 'Bouvet 2' )
                    {
                     before(grammarAccess.getRoomAccess().getBouvet2EnumLiteralDeclaration_1()); 
                    // InternalProgram.g:316:1: ( 'Bouvet 2' )
                    // InternalProgram.g:316:3: 'Bouvet 2'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomAccess().getBouvet2EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProgram.g:321:6: ( ( 'Charcot' ) )
                    {
                    // InternalProgram.g:321:6: ( ( 'Charcot' ) )
                    // InternalProgram.g:322:1: ( 'Charcot' )
                    {
                     before(grammarAccess.getRoomAccess().getCharcotEnumLiteralDeclaration_2()); 
                    // InternalProgram.g:323:1: ( 'Charcot' )
                    // InternalProgram.g:323:3: 'Charcot'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomAccess().getCharcotEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalProgram.g:328:6: ( ( 'Vauban 1' ) )
                    {
                    // InternalProgram.g:328:6: ( ( 'Vauban 1' ) )
                    // InternalProgram.g:329:1: ( 'Vauban 1' )
                    {
                     before(grammarAccess.getRoomAccess().getVauban1EnumLiteralDeclaration_3()); 
                    // InternalProgram.g:330:1: ( 'Vauban 1' )
                    // InternalProgram.g:330:3: 'Vauban 1'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomAccess().getVauban1EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalProgram.g:335:6: ( ( 'Vauban 2' ) )
                    {
                    // InternalProgram.g:335:6: ( ( 'Vauban 2' ) )
                    // InternalProgram.g:336:1: ( 'Vauban 2' )
                    {
                     before(grammarAccess.getRoomAccess().getVauban2EnumLiteralDeclaration_4()); 
                    // InternalProgram.g:337:1: ( 'Vauban 2' )
                    // InternalProgram.g:337:3: 'Vauban 2'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomAccess().getVauban2EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalProgram.g:342:6: ( ( 'Lamannais 1' ) )
                    {
                    // InternalProgram.g:342:6: ( ( 'Lamannais 1' ) )
                    // InternalProgram.g:343:1: ( 'Lamannais 1' )
                    {
                     before(grammarAccess.getRoomAccess().getLamannais1EnumLiteralDeclaration_5()); 
                    // InternalProgram.g:344:1: ( 'Lamannais 1' )
                    // InternalProgram.g:344:3: 'Lamannais 1'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomAccess().getLamannais1EnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalProgram.g:349:6: ( ( 'Lamennais 2' ) )
                    {
                    // InternalProgram.g:349:6: ( ( 'Lamennais 2' ) )
                    // InternalProgram.g:350:1: ( 'Lamennais 2' )
                    {
                     before(grammarAccess.getRoomAccess().getLamennais2EnumLiteralDeclaration_6()); 
                    // InternalProgram.g:351:1: ( 'Lamennais 2' )
                    // InternalProgram.g:351:3: 'Lamennais 2'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomAccess().getLamennais2EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalProgram.g:356:6: ( ( 'Lamennais 3' ) )
                    {
                    // InternalProgram.g:356:6: ( ( 'Lamennais 3' ) )
                    // InternalProgram.g:357:1: ( 'Lamennais 3' )
                    {
                     before(grammarAccess.getRoomAccess().getLamennais3EnumLiteralDeclaration_7()); 
                    // InternalProgram.g:358:1: ( 'Lamennais 3' )
                    // InternalProgram.g:358:3: 'Lamennais 3'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomAccess().getLamennais3EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalProgram.g:363:6: ( ( 'Rotonde Surcouf' ) )
                    {
                    // InternalProgram.g:363:6: ( ( 'Rotonde Surcouf' ) )
                    // InternalProgram.g:364:1: ( 'Rotonde Surcouf' )
                    {
                     before(grammarAccess.getRoomAccess().getRotondeSurcoufEnumLiteralDeclaration_8()); 
                    // InternalProgram.g:365:1: ( 'Rotonde Surcouf' )
                    // InternalProgram.g:365:3: 'Rotonde Surcouf'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomAccess().getRotondeSurcoufEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalProgram.g:370:6: ( ( 'Chateaubriand' ) )
                    {
                    // InternalProgram.g:370:6: ( ( 'Chateaubriand' ) )
                    // InternalProgram.g:371:1: ( 'Chateaubriand' )
                    {
                     before(grammarAccess.getRoomAccess().getChateaubriandEnumLiteralDeclaration_9()); 
                    // InternalProgram.g:372:1: ( 'Chateaubriand' )
                    // InternalProgram.g:372:3: 'Chateaubriand'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomAccess().getChateaubriandEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalProgram.g:377:6: ( ( 'Lamennais 1+2' ) )
                    {
                    // InternalProgram.g:377:6: ( ( 'Lamennais 1+2' ) )
                    // InternalProgram.g:378:1: ( 'Lamennais 1+2' )
                    {
                     before(grammarAccess.getRoomAccess().getLamennais12EnumLiteralDeclaration_10()); 
                    // InternalProgram.g:379:1: ( 'Lamennais 1+2' )
                    // InternalProgram.g:379:3: 'Lamennais 1+2'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomAccess().getLamennais12EnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalProgram.g:384:6: ( ( 'Lamennais 4+5' ) )
                    {
                    // InternalProgram.g:384:6: ( ( 'Lamennais 4+5' ) )
                    // InternalProgram.g:385:1: ( 'Lamennais 4+5' )
                    {
                     before(grammarAccess.getRoomAccess().getLamennais45EnumLiteralDeclaration_11()); 
                    // InternalProgram.g:386:1: ( 'Lamennais 4+5' )
                    // InternalProgram.g:386:3: 'Lamennais 4+5'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomAccess().getLamennais45EnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalProgram.g:391:6: ( ( 'Grand Large' ) )
                    {
                    // InternalProgram.g:391:6: ( ( 'Grand Large' ) )
                    // InternalProgram.g:392:1: ( 'Grand Large' )
                    {
                     before(grammarAccess.getRoomAccess().getGrandLargeEnumLiteralDeclaration_12()); 
                    // InternalProgram.g:393:1: ( 'Grand Large' )
                    // InternalProgram.g:393:3: 'Grand Large'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomAccess().getGrandLargeEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalProgram.g:398:6: ( ( 'Rotonde J. Cartier' ) )
                    {
                    // InternalProgram.g:398:6: ( ( 'Rotonde J. Cartier' ) )
                    // InternalProgram.g:399:1: ( 'Rotonde J. Cartier' )
                    {
                     before(grammarAccess.getRoomAccess().getRotondeJCartierEnumLiteralDeclaration_13()); 
                    // InternalProgram.g:400:1: ( 'Rotonde J. Cartier' )
                    // InternalProgram.g:400:3: 'Rotonde J. Cartier'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomAccess().getRotondeJCartierEnumLiteralDeclaration_13()); 

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
    // $ANTLR end "rule__Room__Alternatives"


    // $ANTLR start "rule__WeekDay__Alternatives"
    // InternalProgram.g:410:1: rule__WeekDay__Alternatives : ( ( ( 'Monday' ) ) | ( ( 'Tuesday' ) ) | ( ( 'Wednesday' ) ) | ( ( 'Thursday' ) ) | ( ( 'Friday' ) ) | ( ( 'Saturday' ) ) | ( ( 'Sunday' ) ) );
    public final void rule__WeekDay__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:414:1: ( ( ( 'Monday' ) ) | ( ( 'Tuesday' ) ) | ( ( 'Wednesday' ) ) | ( ( 'Thursday' ) ) | ( ( 'Friday' ) ) | ( ( 'Saturday' ) ) | ( ( 'Sunday' ) ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt4=1;
                }
                break;
            case 35:
                {
                alt4=2;
                }
                break;
            case 36:
                {
                alt4=3;
                }
                break;
            case 37:
                {
                alt4=4;
                }
                break;
            case 38:
                {
                alt4=5;
                }
                break;
            case 39:
                {
                alt4=6;
                }
                break;
            case 40:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalProgram.g:415:1: ( ( 'Monday' ) )
                    {
                    // InternalProgram.g:415:1: ( ( 'Monday' ) )
                    // InternalProgram.g:416:1: ( 'Monday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getMondayEnumLiteralDeclaration_0()); 
                    // InternalProgram.g:417:1: ( 'Monday' )
                    // InternalProgram.g:417:3: 'Monday'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getMondayEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProgram.g:422:6: ( ( 'Tuesday' ) )
                    {
                    // InternalProgram.g:422:6: ( ( 'Tuesday' ) )
                    // InternalProgram.g:423:1: ( 'Tuesday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getTuesdayEnumLiteralDeclaration_1()); 
                    // InternalProgram.g:424:1: ( 'Tuesday' )
                    // InternalProgram.g:424:3: 'Tuesday'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getTuesdayEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProgram.g:429:6: ( ( 'Wednesday' ) )
                    {
                    // InternalProgram.g:429:6: ( ( 'Wednesday' ) )
                    // InternalProgram.g:430:1: ( 'Wednesday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getWednesdayEnumLiteralDeclaration_2()); 
                    // InternalProgram.g:431:1: ( 'Wednesday' )
                    // InternalProgram.g:431:3: 'Wednesday'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getWednesdayEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalProgram.g:436:6: ( ( 'Thursday' ) )
                    {
                    // InternalProgram.g:436:6: ( ( 'Thursday' ) )
                    // InternalProgram.g:437:1: ( 'Thursday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getThursdayEnumLiteralDeclaration_3()); 
                    // InternalProgram.g:438:1: ( 'Thursday' )
                    // InternalProgram.g:438:3: 'Thursday'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getThursdayEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalProgram.g:443:6: ( ( 'Friday' ) )
                    {
                    // InternalProgram.g:443:6: ( ( 'Friday' ) )
                    // InternalProgram.g:444:1: ( 'Friday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getFridayEnumLiteralDeclaration_4()); 
                    // InternalProgram.g:445:1: ( 'Friday' )
                    // InternalProgram.g:445:3: 'Friday'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getFridayEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalProgram.g:450:6: ( ( 'Saturday' ) )
                    {
                    // InternalProgram.g:450:6: ( ( 'Saturday' ) )
                    // InternalProgram.g:451:1: ( 'Saturday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getSaturdayEnumLiteralDeclaration_5()); 
                    // InternalProgram.g:452:1: ( 'Saturday' )
                    // InternalProgram.g:452:3: 'Saturday'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getWeekDayAccess().getSaturdayEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalProgram.g:457:6: ( ( 'Sunday' ) )
                    {
                    // InternalProgram.g:457:6: ( ( 'Sunday' ) )
                    // InternalProgram.g:458:1: ( 'Sunday' )
                    {
                     before(grammarAccess.getWeekDayAccess().getSundayEnumLiteralDeclaration_6()); 
                    // InternalProgram.g:459:1: ( 'Sunday' )
                    // InternalProgram.g:459:3: 'Sunday'
                    {
                    match(input,40,FOLLOW_2); 

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


    // $ANTLR start "rule__Program__Group__0"
    // InternalProgram.g:471:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:475:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalProgram.g:476:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalProgram.g:483:1: rule__Program__Group__0__Impl : ( ( rule__Program__DaysAssignment_0 ) ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:487:1: ( ( ( rule__Program__DaysAssignment_0 ) ) )
            // InternalProgram.g:488:1: ( ( rule__Program__DaysAssignment_0 ) )
            {
            // InternalProgram.g:488:1: ( ( rule__Program__DaysAssignment_0 ) )
            // InternalProgram.g:489:1: ( rule__Program__DaysAssignment_0 )
            {
             before(grammarAccess.getProgramAccess().getDaysAssignment_0()); 
            // InternalProgram.g:490:1: ( rule__Program__DaysAssignment_0 )
            // InternalProgram.g:490:2: rule__Program__DaysAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Program__DaysAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getDaysAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalProgram.g:500:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:504:1: ( rule__Program__Group__1__Impl )
            // InternalProgram.g:505:2: rule__Program__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:511:1: rule__Program__Group__1__Impl : ( ( rule__Program__DaysAssignment_1 )* ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:515:1: ( ( ( rule__Program__DaysAssignment_1 )* ) )
            // InternalProgram.g:516:1: ( ( rule__Program__DaysAssignment_1 )* )
            {
            // InternalProgram.g:516:1: ( ( rule__Program__DaysAssignment_1 )* )
            // InternalProgram.g:517:1: ( rule__Program__DaysAssignment_1 )*
            {
             before(grammarAccess.getProgramAccess().getDaysAssignment_1()); 
            // InternalProgram.g:518:1: ( rule__Program__DaysAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=34 && LA5_0<=40)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalProgram.g:518:2: rule__Program__DaysAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Program__DaysAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getDaysAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Day__Group__0"
    // InternalProgram.g:532:1: rule__Day__Group__0 : rule__Day__Group__0__Impl rule__Day__Group__1 ;
    public final void rule__Day__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:536:1: ( rule__Day__Group__0__Impl rule__Day__Group__1 )
            // InternalProgram.g:537:2: rule__Day__Group__0__Impl rule__Day__Group__1
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
    // InternalProgram.g:544:1: rule__Day__Group__0__Impl : ( ( rule__Day__WeekDayAssignment_0 ) ) ;
    public final void rule__Day__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:548:1: ( ( ( rule__Day__WeekDayAssignment_0 ) ) )
            // InternalProgram.g:549:1: ( ( rule__Day__WeekDayAssignment_0 ) )
            {
            // InternalProgram.g:549:1: ( ( rule__Day__WeekDayAssignment_0 ) )
            // InternalProgram.g:550:1: ( rule__Day__WeekDayAssignment_0 )
            {
             before(grammarAccess.getDayAccess().getWeekDayAssignment_0()); 
            // InternalProgram.g:551:1: ( rule__Day__WeekDayAssignment_0 )
            // InternalProgram.g:551:2: rule__Day__WeekDayAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Day__WeekDayAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDayAccess().getWeekDayAssignment_0()); 

            }


            }

        }
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
    // InternalProgram.g:561:1: rule__Day__Group__1 : rule__Day__Group__1__Impl rule__Day__Group__2 ;
    public final void rule__Day__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:565:1: ( rule__Day__Group__1__Impl rule__Day__Group__2 )
            // InternalProgram.g:566:2: rule__Day__Group__1__Impl rule__Day__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalProgram.g:573:1: rule__Day__Group__1__Impl : ( ':' ) ;
    public final void rule__Day__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:577:1: ( ( ':' ) )
            // InternalProgram.g:578:1: ( ':' )
            {
            // InternalProgram.g:578:1: ( ':' )
            // InternalProgram.g:579:1: ':'
            {
             before(grammarAccess.getDayAccess().getColonKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getDayAccess().getColonKeyword_1()); 

            }


            }

        }
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
    // InternalProgram.g:592:1: rule__Day__Group__2 : rule__Day__Group__2__Impl ;
    public final void rule__Day__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:596:1: ( rule__Day__Group__2__Impl )
            // InternalProgram.g:597:2: rule__Day__Group__2__Impl
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
    // InternalProgram.g:603:1: rule__Day__Group__2__Impl : ( ( rule__Day__Group_2__0 )? ) ;
    public final void rule__Day__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:607:1: ( ( ( rule__Day__Group_2__0 )? ) )
            // InternalProgram.g:608:1: ( ( rule__Day__Group_2__0 )? )
            {
            // InternalProgram.g:608:1: ( ( rule__Day__Group_2__0 )? )
            // InternalProgram.g:609:1: ( rule__Day__Group_2__0 )?
            {
             before(grammarAccess.getDayAccess().getGroup_2()); 
            // InternalProgram.g:610:1: ( rule__Day__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==42) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalProgram.g:610:2: rule__Day__Group_2__0
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


    // $ANTLR start "rule__Day__Group_2__0"
    // InternalProgram.g:626:1: rule__Day__Group_2__0 : rule__Day__Group_2__0__Impl rule__Day__Group_2__1 ;
    public final void rule__Day__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:630:1: ( rule__Day__Group_2__0__Impl rule__Day__Group_2__1 )
            // InternalProgram.g:631:2: rule__Day__Group_2__0__Impl rule__Day__Group_2__1
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
    // InternalProgram.g:638:1: rule__Day__Group_2__0__Impl : ( ( rule__Day__SessionsAssignment_2_0 ) ) ;
    public final void rule__Day__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:642:1: ( ( ( rule__Day__SessionsAssignment_2_0 ) ) )
            // InternalProgram.g:643:1: ( ( rule__Day__SessionsAssignment_2_0 ) )
            {
            // InternalProgram.g:643:1: ( ( rule__Day__SessionsAssignment_2_0 ) )
            // InternalProgram.g:644:1: ( rule__Day__SessionsAssignment_2_0 )
            {
             before(grammarAccess.getDayAccess().getSessionsAssignment_2_0()); 
            // InternalProgram.g:645:1: ( rule__Day__SessionsAssignment_2_0 )
            // InternalProgram.g:645:2: rule__Day__SessionsAssignment_2_0
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
    // InternalProgram.g:655:1: rule__Day__Group_2__1 : rule__Day__Group_2__1__Impl ;
    public final void rule__Day__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:659:1: ( rule__Day__Group_2__1__Impl )
            // InternalProgram.g:660:2: rule__Day__Group_2__1__Impl
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
    // InternalProgram.g:666:1: rule__Day__Group_2__1__Impl : ( ( rule__Day__SessionsAssignment_2_1 )* ) ;
    public final void rule__Day__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:670:1: ( ( ( rule__Day__SessionsAssignment_2_1 )* ) )
            // InternalProgram.g:671:1: ( ( rule__Day__SessionsAssignment_2_1 )* )
            {
            // InternalProgram.g:671:1: ( ( rule__Day__SessionsAssignment_2_1 )* )
            // InternalProgram.g:672:1: ( rule__Day__SessionsAssignment_2_1 )*
            {
             before(grammarAccess.getDayAccess().getSessionsAssignment_2_1()); 
            // InternalProgram.g:673:1: ( rule__Day__SessionsAssignment_2_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==42) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalProgram.g:673:2: rule__Day__SessionsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Day__SessionsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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


    // $ANTLR start "rule__Session__Group__0"
    // InternalProgram.g:687:1: rule__Session__Group__0 : rule__Session__Group__0__Impl rule__Session__Group__1 ;
    public final void rule__Session__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:691:1: ( rule__Session__Group__0__Impl rule__Session__Group__1 )
            // InternalProgram.g:692:2: rule__Session__Group__0__Impl rule__Session__Group__1
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
    // InternalProgram.g:699:1: rule__Session__Group__0__Impl : ( 'Session' ) ;
    public final void rule__Session__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:703:1: ( ( 'Session' ) )
            // InternalProgram.g:704:1: ( 'Session' )
            {
            // InternalProgram.g:704:1: ( 'Session' )
            // InternalProgram.g:705:1: 'Session'
            {
             before(grammarAccess.getSessionAccess().getSessionKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getSessionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group__0__Impl"


    // $ANTLR start "rule__Session__Group__1"
    // InternalProgram.g:718:1: rule__Session__Group__1 : rule__Session__Group__1__Impl rule__Session__Group__2 ;
    public final void rule__Session__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:722:1: ( rule__Session__Group__1__Impl rule__Session__Group__2 )
            // InternalProgram.g:723:2: rule__Session__Group__1__Impl rule__Session__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalProgram.g:730:1: rule__Session__Group__1__Impl : ( ':' ) ;
    public final void rule__Session__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:734:1: ( ( ':' ) )
            // InternalProgram.g:735:1: ( ':' )
            {
            // InternalProgram.g:735:1: ( ':' )
            // InternalProgram.g:736:1: ':'
            {
             before(grammarAccess.getSessionAccess().getColonKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getColonKeyword_1()); 

            }


            }

        }
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
    // InternalProgram.g:749:1: rule__Session__Group__2 : rule__Session__Group__2__Impl rule__Session__Group__3 ;
    public final void rule__Session__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:753:1: ( rule__Session__Group__2__Impl rule__Session__Group__3 )
            // InternalProgram.g:754:2: rule__Session__Group__2__Impl rule__Session__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalProgram.g:761:1: rule__Session__Group__2__Impl : ( ( rule__Session__NameAssignment_2 ) ) ;
    public final void rule__Session__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:765:1: ( ( ( rule__Session__NameAssignment_2 ) ) )
            // InternalProgram.g:766:1: ( ( rule__Session__NameAssignment_2 ) )
            {
            // InternalProgram.g:766:1: ( ( rule__Session__NameAssignment_2 ) )
            // InternalProgram.g:767:1: ( rule__Session__NameAssignment_2 )
            {
             before(grammarAccess.getSessionAccess().getNameAssignment_2()); 
            // InternalProgram.g:768:1: ( rule__Session__NameAssignment_2 )
            // InternalProgram.g:768:2: rule__Session__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Session__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalProgram.g:778:1: rule__Session__Group__3 : rule__Session__Group__3__Impl rule__Session__Group__4 ;
    public final void rule__Session__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:782:1: ( rule__Session__Group__3__Impl rule__Session__Group__4 )
            // InternalProgram.g:783:2: rule__Session__Group__3__Impl rule__Session__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalProgram.g:790:1: rule__Session__Group__3__Impl : ( 'start' ) ;
    public final void rule__Session__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:794:1: ( ( 'start' ) )
            // InternalProgram.g:795:1: ( 'start' )
            {
            // InternalProgram.g:795:1: ( 'start' )
            // InternalProgram.g:796:1: 'start'
            {
             before(grammarAccess.getSessionAccess().getStartKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getStartKeyword_3()); 

            }


            }

        }
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
    // InternalProgram.g:809:1: rule__Session__Group__4 : rule__Session__Group__4__Impl rule__Session__Group__5 ;
    public final void rule__Session__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:813:1: ( rule__Session__Group__4__Impl rule__Session__Group__5 )
            // InternalProgram.g:814:2: rule__Session__Group__4__Impl rule__Session__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalProgram.g:821:1: rule__Session__Group__4__Impl : ( ( rule__Session__StartAssignment_4 ) ) ;
    public final void rule__Session__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:825:1: ( ( ( rule__Session__StartAssignment_4 ) ) )
            // InternalProgram.g:826:1: ( ( rule__Session__StartAssignment_4 ) )
            {
            // InternalProgram.g:826:1: ( ( rule__Session__StartAssignment_4 ) )
            // InternalProgram.g:827:1: ( rule__Session__StartAssignment_4 )
            {
             before(grammarAccess.getSessionAccess().getStartAssignment_4()); 
            // InternalProgram.g:828:1: ( rule__Session__StartAssignment_4 )
            // InternalProgram.g:828:2: rule__Session__StartAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Session__StartAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getStartAssignment_4()); 

            }


            }

        }
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
    // InternalProgram.g:838:1: rule__Session__Group__5 : rule__Session__Group__5__Impl rule__Session__Group__6 ;
    public final void rule__Session__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:842:1: ( rule__Session__Group__5__Impl rule__Session__Group__6 )
            // InternalProgram.g:843:2: rule__Session__Group__5__Impl rule__Session__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalProgram.g:850:1: rule__Session__Group__5__Impl : ( 'end' ) ;
    public final void rule__Session__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:854:1: ( ( 'end' ) )
            // InternalProgram.g:855:1: ( 'end' )
            {
            // InternalProgram.g:855:1: ( 'end' )
            // InternalProgram.g:856:1: 'end'
            {
             before(grammarAccess.getSessionAccess().getEndKeyword_5()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getEndKeyword_5()); 

            }


            }

        }
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
    // InternalProgram.g:869:1: rule__Session__Group__6 : rule__Session__Group__6__Impl rule__Session__Group__7 ;
    public final void rule__Session__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:873:1: ( rule__Session__Group__6__Impl rule__Session__Group__7 )
            // InternalProgram.g:874:2: rule__Session__Group__6__Impl rule__Session__Group__7
            {
            pushFollow(FOLLOW_11);
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
    // InternalProgram.g:881:1: rule__Session__Group__6__Impl : ( ( rule__Session__EndAssignment_6 ) ) ;
    public final void rule__Session__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:885:1: ( ( ( rule__Session__EndAssignment_6 ) ) )
            // InternalProgram.g:886:1: ( ( rule__Session__EndAssignment_6 ) )
            {
            // InternalProgram.g:886:1: ( ( rule__Session__EndAssignment_6 ) )
            // InternalProgram.g:887:1: ( rule__Session__EndAssignment_6 )
            {
             before(grammarAccess.getSessionAccess().getEndAssignment_6()); 
            // InternalProgram.g:888:1: ( rule__Session__EndAssignment_6 )
            // InternalProgram.g:888:2: rule__Session__EndAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Session__EndAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getEndAssignment_6()); 

            }


            }

        }
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
    // InternalProgram.g:898:1: rule__Session__Group__7 : rule__Session__Group__7__Impl ;
    public final void rule__Session__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:902:1: ( rule__Session__Group__7__Impl )
            // InternalProgram.g:903:2: rule__Session__Group__7__Impl
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
    // InternalProgram.g:909:1: rule__Session__Group__7__Impl : ( ( rule__Session__Group_7__0 )? ) ;
    public final void rule__Session__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:913:1: ( ( ( rule__Session__Group_7__0 )? ) )
            // InternalProgram.g:914:1: ( ( rule__Session__Group_7__0 )? )
            {
            // InternalProgram.g:914:1: ( ( rule__Session__Group_7__0 )? )
            // InternalProgram.g:915:1: ( rule__Session__Group_7__0 )?
            {
             before(grammarAccess.getSessionAccess().getGroup_7()); 
            // InternalProgram.g:916:1: ( rule__Session__Group_7__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=11 && LA8_0<=19)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalProgram.g:916:2: rule__Session__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Session__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSessionAccess().getGroup_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Session__Group_7__0"
    // InternalProgram.g:942:1: rule__Session__Group_7__0 : rule__Session__Group_7__0__Impl rule__Session__Group_7__1 ;
    public final void rule__Session__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:946:1: ( rule__Session__Group_7__0__Impl rule__Session__Group_7__1 )
            // InternalProgram.g:947:2: rule__Session__Group_7__0__Impl rule__Session__Group_7__1
            {
            pushFollow(FOLLOW_11);
            rule__Session__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Session__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_7__0"


    // $ANTLR start "rule__Session__Group_7__0__Impl"
    // InternalProgram.g:954:1: rule__Session__Group_7__0__Impl : ( ( rule__Session__TalksAssignment_7_0 ) ) ;
    public final void rule__Session__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:958:1: ( ( ( rule__Session__TalksAssignment_7_0 ) ) )
            // InternalProgram.g:959:1: ( ( rule__Session__TalksAssignment_7_0 ) )
            {
            // InternalProgram.g:959:1: ( ( rule__Session__TalksAssignment_7_0 ) )
            // InternalProgram.g:960:1: ( rule__Session__TalksAssignment_7_0 )
            {
             before(grammarAccess.getSessionAccess().getTalksAssignment_7_0()); 
            // InternalProgram.g:961:1: ( rule__Session__TalksAssignment_7_0 )
            // InternalProgram.g:961:2: rule__Session__TalksAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__Session__TalksAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getSessionAccess().getTalksAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_7__0__Impl"


    // $ANTLR start "rule__Session__Group_7__1"
    // InternalProgram.g:971:1: rule__Session__Group_7__1 : rule__Session__Group_7__1__Impl ;
    public final void rule__Session__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:975:1: ( rule__Session__Group_7__1__Impl )
            // InternalProgram.g:976:2: rule__Session__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Session__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_7__1"


    // $ANTLR start "rule__Session__Group_7__1__Impl"
    // InternalProgram.g:982:1: rule__Session__Group_7__1__Impl : ( ( rule__Session__TalksAssignment_7_1 )* ) ;
    public final void rule__Session__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:986:1: ( ( ( rule__Session__TalksAssignment_7_1 )* ) )
            // InternalProgram.g:987:1: ( ( rule__Session__TalksAssignment_7_1 )* )
            {
            // InternalProgram.g:987:1: ( ( rule__Session__TalksAssignment_7_1 )* )
            // InternalProgram.g:988:1: ( rule__Session__TalksAssignment_7_1 )*
            {
             before(grammarAccess.getSessionAccess().getTalksAssignment_7_1()); 
            // InternalProgram.g:989:1: ( rule__Session__TalksAssignment_7_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=11 && LA9_0<=19)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalProgram.g:989:2: rule__Session__TalksAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Session__TalksAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSessionAccess().getTalksAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_7__1__Impl"


    // $ANTLR start "rule__Talk__Group__0"
    // InternalProgram.g:1003:1: rule__Talk__Group__0 : rule__Talk__Group__0__Impl rule__Talk__Group__1 ;
    public final void rule__Talk__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1007:1: ( rule__Talk__Group__0__Impl rule__Talk__Group__1 )
            // InternalProgram.g:1008:2: rule__Talk__Group__0__Impl rule__Talk__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalProgram.g:1015:1: rule__Talk__Group__0__Impl : ( ( rule__Talk__TypeAssignment_0 ) ) ;
    public final void rule__Talk__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1019:1: ( ( ( rule__Talk__TypeAssignment_0 ) ) )
            // InternalProgram.g:1020:1: ( ( rule__Talk__TypeAssignment_0 ) )
            {
            // InternalProgram.g:1020:1: ( ( rule__Talk__TypeAssignment_0 ) )
            // InternalProgram.g:1021:1: ( rule__Talk__TypeAssignment_0 )
            {
             before(grammarAccess.getTalkAccess().getTypeAssignment_0()); 
            // InternalProgram.g:1022:1: ( rule__Talk__TypeAssignment_0 )
            // InternalProgram.g:1022:2: rule__Talk__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Talk__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group__0__Impl"


    // $ANTLR start "rule__Talk__Group__1"
    // InternalProgram.g:1032:1: rule__Talk__Group__1 : rule__Talk__Group__1__Impl rule__Talk__Group__2 ;
    public final void rule__Talk__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1036:1: ( rule__Talk__Group__1__Impl rule__Talk__Group__2 )
            // InternalProgram.g:1037:2: rule__Talk__Group__1__Impl rule__Talk__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalProgram.g:1044:1: rule__Talk__Group__1__Impl : ( ':' ) ;
    public final void rule__Talk__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1048:1: ( ( ':' ) )
            // InternalProgram.g:1049:1: ( ':' )
            {
            // InternalProgram.g:1049:1: ( ':' )
            // InternalProgram.g:1050:1: ':'
            {
             before(grammarAccess.getTalkAccess().getColonKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getColonKeyword_1()); 

            }


            }

        }
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
    // InternalProgram.g:1063:1: rule__Talk__Group__2 : rule__Talk__Group__2__Impl rule__Talk__Group__3 ;
    public final void rule__Talk__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1067:1: ( rule__Talk__Group__2__Impl rule__Talk__Group__3 )
            // InternalProgram.g:1068:2: rule__Talk__Group__2__Impl rule__Talk__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalProgram.g:1075:1: rule__Talk__Group__2__Impl : ( ( rule__Talk__Group_2__0 )? ) ;
    public final void rule__Talk__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1079:1: ( ( ( rule__Talk__Group_2__0 )? ) )
            // InternalProgram.g:1080:1: ( ( rule__Talk__Group_2__0 )? )
            {
            // InternalProgram.g:1080:1: ( ( rule__Talk__Group_2__0 )? )
            // InternalProgram.g:1081:1: ( rule__Talk__Group_2__0 )?
            {
             before(grammarAccess.getTalkAccess().getGroup_2()); 
            // InternalProgram.g:1082:1: ( rule__Talk__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalProgram.g:1082:2: rule__Talk__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Talk__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTalkAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalProgram.g:1092:1: rule__Talk__Group__3 : rule__Talk__Group__3__Impl rule__Talk__Group__4 ;
    public final void rule__Talk__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1096:1: ( rule__Talk__Group__3__Impl rule__Talk__Group__4 )
            // InternalProgram.g:1097:2: rule__Talk__Group__3__Impl rule__Talk__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalProgram.g:1104:1: rule__Talk__Group__3__Impl : ( ( rule__Talk__RoomAssignment_3 ) ) ;
    public final void rule__Talk__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1108:1: ( ( ( rule__Talk__RoomAssignment_3 ) ) )
            // InternalProgram.g:1109:1: ( ( rule__Talk__RoomAssignment_3 ) )
            {
            // InternalProgram.g:1109:1: ( ( rule__Talk__RoomAssignment_3 ) )
            // InternalProgram.g:1110:1: ( rule__Talk__RoomAssignment_3 )
            {
             before(grammarAccess.getTalkAccess().getRoomAssignment_3()); 
            // InternalProgram.g:1111:1: ( rule__Talk__RoomAssignment_3 )
            // InternalProgram.g:1111:2: rule__Talk__RoomAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Talk__RoomAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getRoomAssignment_3()); 

            }


            }

        }
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
    // InternalProgram.g:1121:1: rule__Talk__Group__4 : rule__Talk__Group__4__Impl ;
    public final void rule__Talk__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1125:1: ( rule__Talk__Group__4__Impl )
            // InternalProgram.g:1126:2: rule__Talk__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Talk__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:1132:1: rule__Talk__Group__4__Impl : ( ( rule__Talk__Group_4__0 )? ) ;
    public final void rule__Talk__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1136:1: ( ( ( rule__Talk__Group_4__0 )? ) )
            // InternalProgram.g:1137:1: ( ( rule__Talk__Group_4__0 )? )
            {
            // InternalProgram.g:1137:1: ( ( rule__Talk__Group_4__0 )? )
            // InternalProgram.g:1138:1: ( rule__Talk__Group_4__0 )?
            {
             before(grammarAccess.getTalkAccess().getGroup_4()); 
            // InternalProgram.g:1139:1: ( rule__Talk__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==46) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalProgram.g:1139:2: rule__Talk__Group_4__0
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


    // $ANTLR start "rule__Talk__Group_2__0"
    // InternalProgram.g:1159:1: rule__Talk__Group_2__0 : rule__Talk__Group_2__0__Impl rule__Talk__Group_2__1 ;
    public final void rule__Talk__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1163:1: ( rule__Talk__Group_2__0__Impl rule__Talk__Group_2__1 )
            // InternalProgram.g:1164:2: rule__Talk__Group_2__0__Impl rule__Talk__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__Talk__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talk__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_2__0"


    // $ANTLR start "rule__Talk__Group_2__0__Impl"
    // InternalProgram.g:1171:1: rule__Talk__Group_2__0__Impl : ( ( rule__Talk__TilteAssignment_2_0 ) ) ;
    public final void rule__Talk__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1175:1: ( ( ( rule__Talk__TilteAssignment_2_0 ) ) )
            // InternalProgram.g:1176:1: ( ( rule__Talk__TilteAssignment_2_0 ) )
            {
            // InternalProgram.g:1176:1: ( ( rule__Talk__TilteAssignment_2_0 ) )
            // InternalProgram.g:1177:1: ( rule__Talk__TilteAssignment_2_0 )
            {
             before(grammarAccess.getTalkAccess().getTilteAssignment_2_0()); 
            // InternalProgram.g:1178:1: ( rule__Talk__TilteAssignment_2_0 )
            // InternalProgram.g:1178:2: rule__Talk__TilteAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Talk__TilteAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getTilteAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_2__0__Impl"


    // $ANTLR start "rule__Talk__Group_2__1"
    // InternalProgram.g:1188:1: rule__Talk__Group_2__1 : rule__Talk__Group_2__1__Impl ;
    public final void rule__Talk__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1192:1: ( rule__Talk__Group_2__1__Impl )
            // InternalProgram.g:1193:2: rule__Talk__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Talk__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_2__1"


    // $ANTLR start "rule__Talk__Group_2__1__Impl"
    // InternalProgram.g:1199:1: rule__Talk__Group_2__1__Impl : ( ',' ) ;
    public final void rule__Talk__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1203:1: ( ( ',' ) )
            // InternalProgram.g:1204:1: ( ',' )
            {
            // InternalProgram.g:1204:1: ( ',' )
            // InternalProgram.g:1205:1: ','
            {
             before(grammarAccess.getTalkAccess().getCommaKeyword_2_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getCommaKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_2__1__Impl"


    // $ANTLR start "rule__Talk__Group_4__0"
    // InternalProgram.g:1222:1: rule__Talk__Group_4__0 : rule__Talk__Group_4__0__Impl rule__Talk__Group_4__1 ;
    public final void rule__Talk__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1226:1: ( rule__Talk__Group_4__0__Impl rule__Talk__Group_4__1 )
            // InternalProgram.g:1227:2: rule__Talk__Group_4__0__Impl rule__Talk__Group_4__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalProgram.g:1234:1: rule__Talk__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Talk__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1238:1: ( ( '(' ) )
            // InternalProgram.g:1239:1: ( '(' )
            {
            // InternalProgram.g:1239:1: ( '(' )
            // InternalProgram.g:1240:1: '('
            {
             before(grammarAccess.getTalkAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getLeftParenthesisKeyword_4_0()); 

            }


            }

        }
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
    // InternalProgram.g:1253:1: rule__Talk__Group_4__1 : rule__Talk__Group_4__1__Impl rule__Talk__Group_4__2 ;
    public final void rule__Talk__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1257:1: ( rule__Talk__Group_4__1__Impl rule__Talk__Group_4__2 )
            // InternalProgram.g:1258:2: rule__Talk__Group_4__1__Impl rule__Talk__Group_4__2
            {
            pushFollow(FOLLOW_16);
            rule__Talk__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talk__Group_4__2();

            state._fsp--;


            }

        }
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
    // InternalProgram.g:1265:1: rule__Talk__Group_4__1__Impl : ( ( rule__Talk__Group_4_1__0 )? ) ;
    public final void rule__Talk__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1269:1: ( ( ( rule__Talk__Group_4_1__0 )? ) )
            // InternalProgram.g:1270:1: ( ( rule__Talk__Group_4_1__0 )? )
            {
            // InternalProgram.g:1270:1: ( ( rule__Talk__Group_4_1__0 )? )
            // InternalProgram.g:1271:1: ( rule__Talk__Group_4_1__0 )?
            {
             before(grammarAccess.getTalkAccess().getGroup_4_1()); 
            // InternalProgram.g:1272:1: ( rule__Talk__Group_4_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalProgram.g:1272:2: rule__Talk__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Talk__Group_4_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTalkAccess().getGroup_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Talk__Group_4__2"
    // InternalProgram.g:1282:1: rule__Talk__Group_4__2 : rule__Talk__Group_4__2__Impl ;
    public final void rule__Talk__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1286:1: ( rule__Talk__Group_4__2__Impl )
            // InternalProgram.g:1287:2: rule__Talk__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Talk__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_4__2"


    // $ANTLR start "rule__Talk__Group_4__2__Impl"
    // InternalProgram.g:1293:1: rule__Talk__Group_4__2__Impl : ( ')' ) ;
    public final void rule__Talk__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1297:1: ( ( ')' ) )
            // InternalProgram.g:1298:1: ( ')' )
            {
            // InternalProgram.g:1298:1: ( ')' )
            // InternalProgram.g:1299:1: ')'
            {
             before(grammarAccess.getTalkAccess().getRightParenthesisKeyword_4_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getRightParenthesisKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_4__2__Impl"


    // $ANTLR start "rule__Talk__Group_4_1__0"
    // InternalProgram.g:1318:1: rule__Talk__Group_4_1__0 : rule__Talk__Group_4_1__0__Impl rule__Talk__Group_4_1__1 ;
    public final void rule__Talk__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1322:1: ( rule__Talk__Group_4_1__0__Impl rule__Talk__Group_4_1__1 )
            // InternalProgram.g:1323:2: rule__Talk__Group_4_1__0__Impl rule__Talk__Group_4_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Talk__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talk__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_4_1__0"


    // $ANTLR start "rule__Talk__Group_4_1__0__Impl"
    // InternalProgram.g:1330:1: rule__Talk__Group_4_1__0__Impl : ( ( rule__Talk__SpeakersAssignment_4_1_0 ) ) ;
    public final void rule__Talk__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1334:1: ( ( ( rule__Talk__SpeakersAssignment_4_1_0 ) ) )
            // InternalProgram.g:1335:1: ( ( rule__Talk__SpeakersAssignment_4_1_0 ) )
            {
            // InternalProgram.g:1335:1: ( ( rule__Talk__SpeakersAssignment_4_1_0 ) )
            // InternalProgram.g:1336:1: ( rule__Talk__SpeakersAssignment_4_1_0 )
            {
             before(grammarAccess.getTalkAccess().getSpeakersAssignment_4_1_0()); 
            // InternalProgram.g:1337:1: ( rule__Talk__SpeakersAssignment_4_1_0 )
            // InternalProgram.g:1337:2: rule__Talk__SpeakersAssignment_4_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Talk__SpeakersAssignment_4_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getSpeakersAssignment_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_4_1__0__Impl"


    // $ANTLR start "rule__Talk__Group_4_1__1"
    // InternalProgram.g:1347:1: rule__Talk__Group_4_1__1 : rule__Talk__Group_4_1__1__Impl ;
    public final void rule__Talk__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1351:1: ( rule__Talk__Group_4_1__1__Impl )
            // InternalProgram.g:1352:2: rule__Talk__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Talk__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_4_1__1"


    // $ANTLR start "rule__Talk__Group_4_1__1__Impl"
    // InternalProgram.g:1358:1: rule__Talk__Group_4_1__1__Impl : ( ( rule__Talk__Group_4_1_1__0 )* ) ;
    public final void rule__Talk__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1362:1: ( ( ( rule__Talk__Group_4_1_1__0 )* ) )
            // InternalProgram.g:1363:1: ( ( rule__Talk__Group_4_1_1__0 )* )
            {
            // InternalProgram.g:1363:1: ( ( rule__Talk__Group_4_1_1__0 )* )
            // InternalProgram.g:1364:1: ( rule__Talk__Group_4_1_1__0 )*
            {
             before(grammarAccess.getTalkAccess().getGroup_4_1_1()); 
            // InternalProgram.g:1365:1: ( rule__Talk__Group_4_1_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==45) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalProgram.g:1365:2: rule__Talk__Group_4_1_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Talk__Group_4_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getTalkAccess().getGroup_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_4_1__1__Impl"


    // $ANTLR start "rule__Talk__Group_4_1_1__0"
    // InternalProgram.g:1379:1: rule__Talk__Group_4_1_1__0 : rule__Talk__Group_4_1_1__0__Impl rule__Talk__Group_4_1_1__1 ;
    public final void rule__Talk__Group_4_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1383:1: ( rule__Talk__Group_4_1_1__0__Impl rule__Talk__Group_4_1_1__1 )
            // InternalProgram.g:1384:2: rule__Talk__Group_4_1_1__0__Impl rule__Talk__Group_4_1_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Talk__Group_4_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talk__Group_4_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_4_1_1__0"


    // $ANTLR start "rule__Talk__Group_4_1_1__0__Impl"
    // InternalProgram.g:1391:1: rule__Talk__Group_4_1_1__0__Impl : ( ',' ) ;
    public final void rule__Talk__Group_4_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1395:1: ( ( ',' ) )
            // InternalProgram.g:1396:1: ( ',' )
            {
            // InternalProgram.g:1396:1: ( ',' )
            // InternalProgram.g:1397:1: ','
            {
             before(grammarAccess.getTalkAccess().getCommaKeyword_4_1_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getCommaKeyword_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_4_1_1__0__Impl"


    // $ANTLR start "rule__Talk__Group_4_1_1__1"
    // InternalProgram.g:1410:1: rule__Talk__Group_4_1_1__1 : rule__Talk__Group_4_1_1__1__Impl ;
    public final void rule__Talk__Group_4_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1414:1: ( rule__Talk__Group_4_1_1__1__Impl )
            // InternalProgram.g:1415:2: rule__Talk__Group_4_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Talk__Group_4_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_4_1_1__1"


    // $ANTLR start "rule__Talk__Group_4_1_1__1__Impl"
    // InternalProgram.g:1421:1: rule__Talk__Group_4_1_1__1__Impl : ( ( rule__Talk__SpeakersAssignment_4_1_1_1 ) ) ;
    public final void rule__Talk__Group_4_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1425:1: ( ( ( rule__Talk__SpeakersAssignment_4_1_1_1 ) ) )
            // InternalProgram.g:1426:1: ( ( rule__Talk__SpeakersAssignment_4_1_1_1 ) )
            {
            // InternalProgram.g:1426:1: ( ( rule__Talk__SpeakersAssignment_4_1_1_1 ) )
            // InternalProgram.g:1427:1: ( rule__Talk__SpeakersAssignment_4_1_1_1 )
            {
             before(grammarAccess.getTalkAccess().getSpeakersAssignment_4_1_1_1()); 
            // InternalProgram.g:1428:1: ( rule__Talk__SpeakersAssignment_4_1_1_1 )
            // InternalProgram.g:1428:2: rule__Talk__SpeakersAssignment_4_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Talk__SpeakersAssignment_4_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getSpeakersAssignment_4_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_4_1_1__1__Impl"


    // $ANTLR start "rule__Program__DaysAssignment_0"
    // InternalProgram.g:1443:1: rule__Program__DaysAssignment_0 : ( ruleDay ) ;
    public final void rule__Program__DaysAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1447:1: ( ( ruleDay ) )
            // InternalProgram.g:1448:1: ( ruleDay )
            {
            // InternalProgram.g:1448:1: ( ruleDay )
            // InternalProgram.g:1449:1: ruleDay
            {
             before(grammarAccess.getProgramAccess().getDaysDayParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDay();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getDaysDayParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__DaysAssignment_0"


    // $ANTLR start "rule__Program__DaysAssignment_1"
    // InternalProgram.g:1458:1: rule__Program__DaysAssignment_1 : ( ruleDay ) ;
    public final void rule__Program__DaysAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1462:1: ( ( ruleDay ) )
            // InternalProgram.g:1463:1: ( ruleDay )
            {
            // InternalProgram.g:1463:1: ( ruleDay )
            // InternalProgram.g:1464:1: ruleDay
            {
             before(grammarAccess.getProgramAccess().getDaysDayParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDay();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getDaysDayParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__DaysAssignment_1"


    // $ANTLR start "rule__Day__WeekDayAssignment_0"
    // InternalProgram.g:1473:1: rule__Day__WeekDayAssignment_0 : ( ruleWeekDay ) ;
    public final void rule__Day__WeekDayAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1477:1: ( ( ruleWeekDay ) )
            // InternalProgram.g:1478:1: ( ruleWeekDay )
            {
            // InternalProgram.g:1478:1: ( ruleWeekDay )
            // InternalProgram.g:1479:1: ruleWeekDay
            {
             before(grammarAccess.getDayAccess().getWeekDayWeekDayEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleWeekDay();

            state._fsp--;

             after(grammarAccess.getDayAccess().getWeekDayWeekDayEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__WeekDayAssignment_0"


    // $ANTLR start "rule__Day__SessionsAssignment_2_0"
    // InternalProgram.g:1488:1: rule__Day__SessionsAssignment_2_0 : ( ruleSession ) ;
    public final void rule__Day__SessionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1492:1: ( ( ruleSession ) )
            // InternalProgram.g:1493:1: ( ruleSession )
            {
            // InternalProgram.g:1493:1: ( ruleSession )
            // InternalProgram.g:1494:1: ruleSession
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
    // InternalProgram.g:1503:1: rule__Day__SessionsAssignment_2_1 : ( ruleSession ) ;
    public final void rule__Day__SessionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1507:1: ( ( ruleSession ) )
            // InternalProgram.g:1508:1: ( ruleSession )
            {
            // InternalProgram.g:1508:1: ( ruleSession )
            // InternalProgram.g:1509:1: ruleSession
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


    // $ANTLR start "rule__Session__NameAssignment_2"
    // InternalProgram.g:1518:1: rule__Session__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Session__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1522:1: ( ( RULE_STRING ) )
            // InternalProgram.g:1523:1: ( RULE_STRING )
            {
            // InternalProgram.g:1523:1: ( RULE_STRING )
            // InternalProgram.g:1524:1: RULE_STRING
            {
             before(grammarAccess.getSessionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__NameAssignment_2"


    // $ANTLR start "rule__Session__StartAssignment_4"
    // InternalProgram.g:1533:1: rule__Session__StartAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Session__StartAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1537:1: ( ( RULE_STRING ) )
            // InternalProgram.g:1538:1: ( RULE_STRING )
            {
            // InternalProgram.g:1538:1: ( RULE_STRING )
            // InternalProgram.g:1539:1: RULE_STRING
            {
             before(grammarAccess.getSessionAccess().getStartSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getStartSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__StartAssignment_4"


    // $ANTLR start "rule__Session__EndAssignment_6"
    // InternalProgram.g:1548:1: rule__Session__EndAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Session__EndAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1552:1: ( ( RULE_STRING ) )
            // InternalProgram.g:1553:1: ( RULE_STRING )
            {
            // InternalProgram.g:1553:1: ( RULE_STRING )
            // InternalProgram.g:1554:1: RULE_STRING
            {
             before(grammarAccess.getSessionAccess().getEndSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSessionAccess().getEndSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__EndAssignment_6"


    // $ANTLR start "rule__Session__TalksAssignment_7_0"
    // InternalProgram.g:1563:1: rule__Session__TalksAssignment_7_0 : ( ruleTalk ) ;
    public final void rule__Session__TalksAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1567:1: ( ( ruleTalk ) )
            // InternalProgram.g:1568:1: ( ruleTalk )
            {
            // InternalProgram.g:1568:1: ( ruleTalk )
            // InternalProgram.g:1569:1: ruleTalk
            {
             before(grammarAccess.getSessionAccess().getTalksTalkParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTalk();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getTalksTalkParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__TalksAssignment_7_0"


    // $ANTLR start "rule__Session__TalksAssignment_7_1"
    // InternalProgram.g:1578:1: rule__Session__TalksAssignment_7_1 : ( ruleTalk ) ;
    public final void rule__Session__TalksAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1582:1: ( ( ruleTalk ) )
            // InternalProgram.g:1583:1: ( ruleTalk )
            {
            // InternalProgram.g:1583:1: ( ruleTalk )
            // InternalProgram.g:1584:1: ruleTalk
            {
             before(grammarAccess.getSessionAccess().getTalksTalkParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTalk();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getTalksTalkParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__TalksAssignment_7_1"


    // $ANTLR start "rule__Talk__TypeAssignment_0"
    // InternalProgram.g:1593:1: rule__Talk__TypeAssignment_0 : ( ruleTalkType ) ;
    public final void rule__Talk__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1597:1: ( ( ruleTalkType ) )
            // InternalProgram.g:1598:1: ( ruleTalkType )
            {
            // InternalProgram.g:1598:1: ( ruleTalkType )
            // InternalProgram.g:1599:1: ruleTalkType
            {
             before(grammarAccess.getTalkAccess().getTypeTalkTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTalkType();

            state._fsp--;

             after(grammarAccess.getTalkAccess().getTypeTalkTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__TypeAssignment_0"


    // $ANTLR start "rule__Talk__TilteAssignment_2_0"
    // InternalProgram.g:1608:1: rule__Talk__TilteAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__Talk__TilteAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1612:1: ( ( RULE_STRING ) )
            // InternalProgram.g:1613:1: ( RULE_STRING )
            {
            // InternalProgram.g:1613:1: ( RULE_STRING )
            // InternalProgram.g:1614:1: RULE_STRING
            {
             before(grammarAccess.getTalkAccess().getTilteSTRINGTerminalRuleCall_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getTilteSTRINGTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__TilteAssignment_2_0"


    // $ANTLR start "rule__Talk__RoomAssignment_3"
    // InternalProgram.g:1623:1: rule__Talk__RoomAssignment_3 : ( ruleRoom ) ;
    public final void rule__Talk__RoomAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1627:1: ( ( ruleRoom ) )
            // InternalProgram.g:1628:1: ( ruleRoom )
            {
            // InternalProgram.g:1628:1: ( ruleRoom )
            // InternalProgram.g:1629:1: ruleRoom
            {
             before(grammarAccess.getTalkAccess().getRoomRoomEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getTalkAccess().getRoomRoomEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__RoomAssignment_3"


    // $ANTLR start "rule__Talk__SpeakersAssignment_4_1_0"
    // InternalProgram.g:1638:1: rule__Talk__SpeakersAssignment_4_1_0 : ( RULE_STRING ) ;
    public final void rule__Talk__SpeakersAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1642:1: ( ( RULE_STRING ) )
            // InternalProgram.g:1643:1: ( RULE_STRING )
            {
            // InternalProgram.g:1643:1: ( RULE_STRING )
            // InternalProgram.g:1644:1: RULE_STRING
            {
             before(grammarAccess.getTalkAccess().getSpeakersSTRINGTerminalRuleCall_4_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getSpeakersSTRINGTerminalRuleCall_4_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__SpeakersAssignment_4_1_0"


    // $ANTLR start "rule__Talk__SpeakersAssignment_4_1_1_1"
    // InternalProgram.g:1653:1: rule__Talk__SpeakersAssignment_4_1_1_1 : ( RULE_STRING ) ;
    public final void rule__Talk__SpeakersAssignment_4_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalProgram.g:1657:1: ( ( RULE_STRING ) )
            // InternalProgram.g:1658:1: ( RULE_STRING )
            {
            // InternalProgram.g:1658:1: ( RULE_STRING )
            // InternalProgram.g:1659:1: RULE_STRING
            {
             before(grammarAccess.getTalkAccess().getSpeakersSTRINGTerminalRuleCall_4_1_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTalkAccess().getSpeakersSTRINGTerminalRuleCall_4_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__SpeakersAssignment_4_1_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000001FC00000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000001FC00000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000FF800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000FF802L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000003FFF00010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000200000000002L});

}