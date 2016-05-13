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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Rooms'", "'Days'", "'['", "'name'", "']'", "'Sessions'", "'start'", "'end'", "'Talks'", "'title'", "'room'", "'speakers'", "','"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalProgramParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalProgramParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalProgramParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g"; }


     
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:60:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:61:1: ( ruleProgram EOF )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:62:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram61);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram68); 

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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:69:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:73:2: ( ( ( rule__Program__Group__0 ) ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:74:1: ( ( rule__Program__Group__0 ) )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:74:1: ( ( rule__Program__Group__0 ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:75:1: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:76:1: ( rule__Program__Group__0 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:76:2: rule__Program__Group__0
            {
            pushFollow(FOLLOW_rule__Program__Group__0_in_ruleProgram94);
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:88:1: entryRuleRoom : ruleRoom EOF ;
    public final void entryRuleRoom() throws RecognitionException {
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:89:1: ( ruleRoom EOF )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:90:1: ruleRoom EOF
            {
             before(grammarAccess.getRoomRule()); 
            pushFollow(FOLLOW_ruleRoom_in_entryRuleRoom121);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getRoomRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRoom128); 

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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:97:1: ruleRoom : ( ( rule__Room__NameAssignment ) ) ;
    public final void ruleRoom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:101:2: ( ( ( rule__Room__NameAssignment ) ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:102:1: ( ( rule__Room__NameAssignment ) )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:102:1: ( ( rule__Room__NameAssignment ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:103:1: ( rule__Room__NameAssignment )
            {
             before(grammarAccess.getRoomAccess().getNameAssignment()); 
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:104:1: ( rule__Room__NameAssignment )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:104:2: rule__Room__NameAssignment
            {
            pushFollow(FOLLOW_rule__Room__NameAssignment_in_ruleRoom154);
            rule__Room__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getNameAssignment()); 

            }


            }

        }
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:116:1: entryRuleDay : ruleDay EOF ;
    public final void entryRuleDay() throws RecognitionException {
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:117:1: ( ruleDay EOF )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:118:1: ruleDay EOF
            {
             before(grammarAccess.getDayRule()); 
            pushFollow(FOLLOW_ruleDay_in_entryRuleDay181);
            ruleDay();

            state._fsp--;

             after(grammarAccess.getDayRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDay188); 

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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:125:1: ruleDay : ( ( rule__Day__Group__0 ) ) ;
    public final void ruleDay() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:129:2: ( ( ( rule__Day__Group__0 ) ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:130:1: ( ( rule__Day__Group__0 ) )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:130:1: ( ( rule__Day__Group__0 ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:131:1: ( rule__Day__Group__0 )
            {
             before(grammarAccess.getDayAccess().getGroup()); 
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:132:1: ( rule__Day__Group__0 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:132:2: rule__Day__Group__0
            {
            pushFollow(FOLLOW_rule__Day__Group__0_in_ruleDay214);
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:144:1: entryRuleSession : ruleSession EOF ;
    public final void entryRuleSession() throws RecognitionException {
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:145:1: ( ruleSession EOF )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:146:1: ruleSession EOF
            {
             before(grammarAccess.getSessionRule()); 
            pushFollow(FOLLOW_ruleSession_in_entryRuleSession241);
            ruleSession();

            state._fsp--;

             after(grammarAccess.getSessionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSession248); 

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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:153:1: ruleSession : ( ( rule__Session__Group__0 ) ) ;
    public final void ruleSession() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:157:2: ( ( ( rule__Session__Group__0 ) ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:158:1: ( ( rule__Session__Group__0 ) )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:158:1: ( ( rule__Session__Group__0 ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:159:1: ( rule__Session__Group__0 )
            {
             before(grammarAccess.getSessionAccess().getGroup()); 
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:160:1: ( rule__Session__Group__0 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:160:2: rule__Session__Group__0
            {
            pushFollow(FOLLOW_rule__Session__Group__0_in_ruleSession274);
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:172:1: entryRuleTalk : ruleTalk EOF ;
    public final void entryRuleTalk() throws RecognitionException {
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:173:1: ( ruleTalk EOF )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:174:1: ruleTalk EOF
            {
             before(grammarAccess.getTalkRule()); 
            pushFollow(FOLLOW_ruleTalk_in_entryRuleTalk301);
            ruleTalk();

            state._fsp--;

             after(grammarAccess.getTalkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTalk308); 

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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:181:1: ruleTalk : ( ( rule__Talk__Group__0 ) ) ;
    public final void ruleTalk() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:185:2: ( ( ( rule__Talk__Group__0 ) ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:186:1: ( ( rule__Talk__Group__0 ) )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:186:1: ( ( rule__Talk__Group__0 ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:187:1: ( rule__Talk__Group__0 )
            {
             before(grammarAccess.getTalkAccess().getGroup()); 
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:188:1: ( rule__Talk__Group__0 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:188:2: rule__Talk__Group__0
            {
            pushFollow(FOLLOW_rule__Talk__Group__0_in_ruleTalk334);
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


    // $ANTLR start "rule__Program__Group__0"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:202:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:206:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:207:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__0368);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__0371);
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:214:1: rule__Program__Group__0__Impl : ( ( rule__Program__Group_0__0 )? ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:218:1: ( ( ( rule__Program__Group_0__0 )? ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:219:1: ( ( rule__Program__Group_0__0 )? )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:219:1: ( ( rule__Program__Group_0__0 )? )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:220:1: ( rule__Program__Group_0__0 )?
            {
             before(grammarAccess.getProgramAccess().getGroup_0()); 
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:221:1: ( rule__Program__Group_0__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:221:2: rule__Program__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Program__Group_0__0_in_rule__Program__Group__0__Impl398);
                    rule__Program__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgramAccess().getGroup_0()); 

            }


            }

        }
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:231:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:235:1: ( rule__Program__Group__1__Impl )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:236:2: rule__Program__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__1429);
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:242:1: rule__Program__Group__1__Impl : ( ( rule__Program__Group_1__0 )? ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:246:1: ( ( ( rule__Program__Group_1__0 )? ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:247:1: ( ( rule__Program__Group_1__0 )? )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:247:1: ( ( rule__Program__Group_1__0 )? )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:248:1: ( rule__Program__Group_1__0 )?
            {
             before(grammarAccess.getProgramAccess().getGroup_1()); 
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:249:1: ( rule__Program__Group_1__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:249:2: rule__Program__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Program__Group_1__0_in_rule__Program__Group__1__Impl456);
                    rule__Program__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgramAccess().getGroup_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Program__Group_0__0"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:263:1: rule__Program__Group_0__0 : rule__Program__Group_0__0__Impl rule__Program__Group_0__1 ;
    public final void rule__Program__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:267:1: ( rule__Program__Group_0__0__Impl rule__Program__Group_0__1 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:268:2: rule__Program__Group_0__0__Impl rule__Program__Group_0__1
            {
            pushFollow(FOLLOW_rule__Program__Group_0__0__Impl_in_rule__Program__Group_0__0491);
            rule__Program__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0__1_in_rule__Program__Group_0__0494);
            rule__Program__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0__0"


    // $ANTLR start "rule__Program__Group_0__0__Impl"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:275:1: rule__Program__Group_0__0__Impl : ( 'Rooms' ) ;
    public final void rule__Program__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:279:1: ( ( 'Rooms' ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:280:1: ( 'Rooms' )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:280:1: ( 'Rooms' )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:281:1: 'Rooms'
            {
             before(grammarAccess.getProgramAccess().getRoomsKeyword_0_0()); 
            match(input,11,FOLLOW_11_in_rule__Program__Group_0__0__Impl522); 
             after(grammarAccess.getProgramAccess().getRoomsKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0__0__Impl"


    // $ANTLR start "rule__Program__Group_0__1"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:294:1: rule__Program__Group_0__1 : rule__Program__Group_0__1__Impl rule__Program__Group_0__2 ;
    public final void rule__Program__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:298:1: ( rule__Program__Group_0__1__Impl rule__Program__Group_0__2 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:299:2: rule__Program__Group_0__1__Impl rule__Program__Group_0__2
            {
            pushFollow(FOLLOW_rule__Program__Group_0__1__Impl_in_rule__Program__Group_0__1553);
            rule__Program__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_0__2_in_rule__Program__Group_0__1556);
            rule__Program__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0__1"


    // $ANTLR start "rule__Program__Group_0__1__Impl"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:306:1: rule__Program__Group_0__1__Impl : ( ( rule__Program__RoomsAssignment_0_1 ) ) ;
    public final void rule__Program__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:310:1: ( ( ( rule__Program__RoomsAssignment_0_1 ) ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:311:1: ( ( rule__Program__RoomsAssignment_0_1 ) )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:311:1: ( ( rule__Program__RoomsAssignment_0_1 ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:312:1: ( rule__Program__RoomsAssignment_0_1 )
            {
             before(grammarAccess.getProgramAccess().getRoomsAssignment_0_1()); 
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:313:1: ( rule__Program__RoomsAssignment_0_1 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:313:2: rule__Program__RoomsAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Program__RoomsAssignment_0_1_in_rule__Program__Group_0__1__Impl583);
            rule__Program__RoomsAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getRoomsAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0__1__Impl"


    // $ANTLR start "rule__Program__Group_0__2"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:323:1: rule__Program__Group_0__2 : rule__Program__Group_0__2__Impl ;
    public final void rule__Program__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:327:1: ( rule__Program__Group_0__2__Impl )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:328:2: rule__Program__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_0__2__Impl_in_rule__Program__Group_0__2613);
            rule__Program__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0__2"


    // $ANTLR start "rule__Program__Group_0__2__Impl"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:334:1: rule__Program__Group_0__2__Impl : ( ( rule__Program__RoomsAssignment_0_2 )* ) ;
    public final void rule__Program__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:338:1: ( ( ( rule__Program__RoomsAssignment_0_2 )* ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:339:1: ( ( rule__Program__RoomsAssignment_0_2 )* )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:339:1: ( ( rule__Program__RoomsAssignment_0_2 )* )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:340:1: ( rule__Program__RoomsAssignment_0_2 )*
            {
             before(grammarAccess.getProgramAccess().getRoomsAssignment_0_2()); 
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:341:1: ( rule__Program__RoomsAssignment_0_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:341:2: rule__Program__RoomsAssignment_0_2
            	    {
            	    pushFollow(FOLLOW_rule__Program__RoomsAssignment_0_2_in_rule__Program__Group_0__2__Impl640);
            	    rule__Program__RoomsAssignment_0_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getRoomsAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_0__2__Impl"


    // $ANTLR start "rule__Program__Group_1__0"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:357:1: rule__Program__Group_1__0 : rule__Program__Group_1__0__Impl rule__Program__Group_1__1 ;
    public final void rule__Program__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:361:1: ( rule__Program__Group_1__0__Impl rule__Program__Group_1__1 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:362:2: rule__Program__Group_1__0__Impl rule__Program__Group_1__1
            {
            pushFollow(FOLLOW_rule__Program__Group_1__0__Impl_in_rule__Program__Group_1__0677);
            rule__Program__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_1__1_in_rule__Program__Group_1__0680);
            rule__Program__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_1__0"


    // $ANTLR start "rule__Program__Group_1__0__Impl"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:369:1: rule__Program__Group_1__0__Impl : ( 'Days' ) ;
    public final void rule__Program__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:373:1: ( ( 'Days' ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:374:1: ( 'Days' )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:374:1: ( 'Days' )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:375:1: 'Days'
            {
             before(grammarAccess.getProgramAccess().getDaysKeyword_1_0()); 
            match(input,12,FOLLOW_12_in_rule__Program__Group_1__0__Impl708); 
             after(grammarAccess.getProgramAccess().getDaysKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_1__0__Impl"


    // $ANTLR start "rule__Program__Group_1__1"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:388:1: rule__Program__Group_1__1 : rule__Program__Group_1__1__Impl rule__Program__Group_1__2 ;
    public final void rule__Program__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:392:1: ( rule__Program__Group_1__1__Impl rule__Program__Group_1__2 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:393:2: rule__Program__Group_1__1__Impl rule__Program__Group_1__2
            {
            pushFollow(FOLLOW_rule__Program__Group_1__1__Impl_in_rule__Program__Group_1__1739);
            rule__Program__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_1__2_in_rule__Program__Group_1__1742);
            rule__Program__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_1__1"


    // $ANTLR start "rule__Program__Group_1__1__Impl"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:400:1: rule__Program__Group_1__1__Impl : ( ( rule__Program__DaysAssignment_1_1 ) ) ;
    public final void rule__Program__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:404:1: ( ( ( rule__Program__DaysAssignment_1_1 ) ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:405:1: ( ( rule__Program__DaysAssignment_1_1 ) )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:405:1: ( ( rule__Program__DaysAssignment_1_1 ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:406:1: ( rule__Program__DaysAssignment_1_1 )
            {
             before(grammarAccess.getProgramAccess().getDaysAssignment_1_1()); 
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:407:1: ( rule__Program__DaysAssignment_1_1 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:407:2: rule__Program__DaysAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Program__DaysAssignment_1_1_in_rule__Program__Group_1__1__Impl769);
            rule__Program__DaysAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getDaysAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_1__1__Impl"


    // $ANTLR start "rule__Program__Group_1__2"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:417:1: rule__Program__Group_1__2 : rule__Program__Group_1__2__Impl ;
    public final void rule__Program__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:421:1: ( rule__Program__Group_1__2__Impl )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:422:2: rule__Program__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_1__2__Impl_in_rule__Program__Group_1__2799);
            rule__Program__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_1__2"


    // $ANTLR start "rule__Program__Group_1__2__Impl"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:428:1: rule__Program__Group_1__2__Impl : ( ( rule__Program__DaysAssignment_1_2 )* ) ;
    public final void rule__Program__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:432:1: ( ( ( rule__Program__DaysAssignment_1_2 )* ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:433:1: ( ( rule__Program__DaysAssignment_1_2 )* )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:433:1: ( ( rule__Program__DaysAssignment_1_2 )* )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:434:1: ( rule__Program__DaysAssignment_1_2 )*
            {
             before(grammarAccess.getProgramAccess().getDaysAssignment_1_2()); 
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:435:1: ( rule__Program__DaysAssignment_1_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:435:2: rule__Program__DaysAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_rule__Program__DaysAssignment_1_2_in_rule__Program__Group_1__2__Impl826);
            	    rule__Program__DaysAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getDaysAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_1__2__Impl"


    // $ANTLR start "rule__Day__Group__0"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:451:1: rule__Day__Group__0 : rule__Day__Group__0__Impl rule__Day__Group__1 ;
    public final void rule__Day__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:455:1: ( rule__Day__Group__0__Impl rule__Day__Group__1 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:456:2: rule__Day__Group__0__Impl rule__Day__Group__1
            {
            pushFollow(FOLLOW_rule__Day__Group__0__Impl_in_rule__Day__Group__0863);
            rule__Day__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Day__Group__1_in_rule__Day__Group__0866);
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:463:1: rule__Day__Group__0__Impl : ( '[' ) ;
    public final void rule__Day__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:467:1: ( ( '[' ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:468:1: ( '[' )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:468:1: ( '[' )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:469:1: '['
            {
             before(grammarAccess.getDayAccess().getLeftSquareBracketKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Day__Group__0__Impl894); 
             after(grammarAccess.getDayAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:482:1: rule__Day__Group__1 : rule__Day__Group__1__Impl rule__Day__Group__2 ;
    public final void rule__Day__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:486:1: ( rule__Day__Group__1__Impl rule__Day__Group__2 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:487:2: rule__Day__Group__1__Impl rule__Day__Group__2
            {
            pushFollow(FOLLOW_rule__Day__Group__1__Impl_in_rule__Day__Group__1925);
            rule__Day__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Day__Group__2_in_rule__Day__Group__1928);
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:494:1: rule__Day__Group__1__Impl : ( 'name' ) ;
    public final void rule__Day__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:498:1: ( ( 'name' ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:499:1: ( 'name' )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:499:1: ( 'name' )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:500:1: 'name'
            {
             before(grammarAccess.getDayAccess().getNameKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__Day__Group__1__Impl956); 
             after(grammarAccess.getDayAccess().getNameKeyword_1()); 

            }


            }

        }
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:513:1: rule__Day__Group__2 : rule__Day__Group__2__Impl rule__Day__Group__3 ;
    public final void rule__Day__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:517:1: ( rule__Day__Group__2__Impl rule__Day__Group__3 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:518:2: rule__Day__Group__2__Impl rule__Day__Group__3
            {
            pushFollow(FOLLOW_rule__Day__Group__2__Impl_in_rule__Day__Group__2987);
            rule__Day__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Day__Group__3_in_rule__Day__Group__2990);
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:525:1: rule__Day__Group__2__Impl : ( ( rule__Day__NameAssignment_2 ) ) ;
    public final void rule__Day__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:529:1: ( ( ( rule__Day__NameAssignment_2 ) ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:530:1: ( ( rule__Day__NameAssignment_2 ) )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:530:1: ( ( rule__Day__NameAssignment_2 ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:531:1: ( rule__Day__NameAssignment_2 )
            {
             before(grammarAccess.getDayAccess().getNameAssignment_2()); 
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:532:1: ( rule__Day__NameAssignment_2 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:532:2: rule__Day__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Day__NameAssignment_2_in_rule__Day__Group__2__Impl1017);
            rule__Day__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDayAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:542:1: rule__Day__Group__3 : rule__Day__Group__3__Impl rule__Day__Group__4 ;
    public final void rule__Day__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:546:1: ( rule__Day__Group__3__Impl rule__Day__Group__4 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:547:2: rule__Day__Group__3__Impl rule__Day__Group__4
            {
            pushFollow(FOLLOW_rule__Day__Group__3__Impl_in_rule__Day__Group__31047);
            rule__Day__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Day__Group__4_in_rule__Day__Group__31050);
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:554:1: rule__Day__Group__3__Impl : ( ( rule__Day__Group_3__0 )? ) ;
    public final void rule__Day__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:558:1: ( ( ( rule__Day__Group_3__0 )? ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:559:1: ( ( rule__Day__Group_3__0 )? )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:559:1: ( ( rule__Day__Group_3__0 )? )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:560:1: ( rule__Day__Group_3__0 )?
            {
             before(grammarAccess.getDayAccess().getGroup_3()); 
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:561:1: ( rule__Day__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:561:2: rule__Day__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Day__Group_3__0_in_rule__Day__Group__3__Impl1077);
                    rule__Day__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDayAccess().getGroup_3()); 

            }


            }

        }
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:571:1: rule__Day__Group__4 : rule__Day__Group__4__Impl ;
    public final void rule__Day__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:575:1: ( rule__Day__Group__4__Impl )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:576:2: rule__Day__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Day__Group__4__Impl_in_rule__Day__Group__41108);
            rule__Day__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:582:1: rule__Day__Group__4__Impl : ( ']' ) ;
    public final void rule__Day__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:586:1: ( ( ']' ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:587:1: ( ']' )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:587:1: ( ']' )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:588:1: ']'
            {
             before(grammarAccess.getDayAccess().getRightSquareBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Day__Group__4__Impl1136); 
             after(grammarAccess.getDayAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Day__Group_3__0"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:611:1: rule__Day__Group_3__0 : rule__Day__Group_3__0__Impl rule__Day__Group_3__1 ;
    public final void rule__Day__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:615:1: ( rule__Day__Group_3__0__Impl rule__Day__Group_3__1 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:616:2: rule__Day__Group_3__0__Impl rule__Day__Group_3__1
            {
            pushFollow(FOLLOW_rule__Day__Group_3__0__Impl_in_rule__Day__Group_3__01177);
            rule__Day__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Day__Group_3__1_in_rule__Day__Group_3__01180);
            rule__Day__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group_3__0"


    // $ANTLR start "rule__Day__Group_3__0__Impl"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:623:1: rule__Day__Group_3__0__Impl : ( 'Sessions' ) ;
    public final void rule__Day__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:627:1: ( ( 'Sessions' ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:628:1: ( 'Sessions' )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:628:1: ( 'Sessions' )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:629:1: 'Sessions'
            {
             before(grammarAccess.getDayAccess().getSessionsKeyword_3_0()); 
            match(input,16,FOLLOW_16_in_rule__Day__Group_3__0__Impl1208); 
             after(grammarAccess.getDayAccess().getSessionsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group_3__0__Impl"


    // $ANTLR start "rule__Day__Group_3__1"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:642:1: rule__Day__Group_3__1 : rule__Day__Group_3__1__Impl rule__Day__Group_3__2 ;
    public final void rule__Day__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:646:1: ( rule__Day__Group_3__1__Impl rule__Day__Group_3__2 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:647:2: rule__Day__Group_3__1__Impl rule__Day__Group_3__2
            {
            pushFollow(FOLLOW_rule__Day__Group_3__1__Impl_in_rule__Day__Group_3__11239);
            rule__Day__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Day__Group_3__2_in_rule__Day__Group_3__11242);
            rule__Day__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group_3__1"


    // $ANTLR start "rule__Day__Group_3__1__Impl"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:654:1: rule__Day__Group_3__1__Impl : ( ( rule__Day__SessionsAssignment_3_1 ) ) ;
    public final void rule__Day__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:658:1: ( ( ( rule__Day__SessionsAssignment_3_1 ) ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:659:1: ( ( rule__Day__SessionsAssignment_3_1 ) )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:659:1: ( ( rule__Day__SessionsAssignment_3_1 ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:660:1: ( rule__Day__SessionsAssignment_3_1 )
            {
             before(grammarAccess.getDayAccess().getSessionsAssignment_3_1()); 
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:661:1: ( rule__Day__SessionsAssignment_3_1 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:661:2: rule__Day__SessionsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Day__SessionsAssignment_3_1_in_rule__Day__Group_3__1__Impl1269);
            rule__Day__SessionsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDayAccess().getSessionsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group_3__1__Impl"


    // $ANTLR start "rule__Day__Group_3__2"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:671:1: rule__Day__Group_3__2 : rule__Day__Group_3__2__Impl ;
    public final void rule__Day__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:675:1: ( rule__Day__Group_3__2__Impl )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:676:2: rule__Day__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Day__Group_3__2__Impl_in_rule__Day__Group_3__21299);
            rule__Day__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group_3__2"


    // $ANTLR start "rule__Day__Group_3__2__Impl"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:682:1: rule__Day__Group_3__2__Impl : ( ( rule__Day__SessionsAssignment_3_2 )* ) ;
    public final void rule__Day__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:686:1: ( ( ( rule__Day__SessionsAssignment_3_2 )* ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:687:1: ( ( rule__Day__SessionsAssignment_3_2 )* )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:687:1: ( ( rule__Day__SessionsAssignment_3_2 )* )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:688:1: ( rule__Day__SessionsAssignment_3_2 )*
            {
             before(grammarAccess.getDayAccess().getSessionsAssignment_3_2()); 
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:689:1: ( rule__Day__SessionsAssignment_3_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:689:2: rule__Day__SessionsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_rule__Day__SessionsAssignment_3_2_in_rule__Day__Group_3__2__Impl1326);
            	    rule__Day__SessionsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDayAccess().getSessionsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__Group_3__2__Impl"


    // $ANTLR start "rule__Session__Group__0"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:705:1: rule__Session__Group__0 : rule__Session__Group__0__Impl rule__Session__Group__1 ;
    public final void rule__Session__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:709:1: ( rule__Session__Group__0__Impl rule__Session__Group__1 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:710:2: rule__Session__Group__0__Impl rule__Session__Group__1
            {
            pushFollow(FOLLOW_rule__Session__Group__0__Impl_in_rule__Session__Group__01363);
            rule__Session__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Session__Group__1_in_rule__Session__Group__01366);
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:717:1: rule__Session__Group__0__Impl : ( '[' ) ;
    public final void rule__Session__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:721:1: ( ( '[' ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:722:1: ( '[' )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:722:1: ( '[' )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:723:1: '['
            {
             before(grammarAccess.getSessionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Session__Group__0__Impl1394); 
             after(grammarAccess.getSessionAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:736:1: rule__Session__Group__1 : rule__Session__Group__1__Impl rule__Session__Group__2 ;
    public final void rule__Session__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:740:1: ( rule__Session__Group__1__Impl rule__Session__Group__2 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:741:2: rule__Session__Group__1__Impl rule__Session__Group__2
            {
            pushFollow(FOLLOW_rule__Session__Group__1__Impl_in_rule__Session__Group__11425);
            rule__Session__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Session__Group__2_in_rule__Session__Group__11428);
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:748:1: rule__Session__Group__1__Impl : ( 'name' ) ;
    public final void rule__Session__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:752:1: ( ( 'name' ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:753:1: ( 'name' )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:753:1: ( 'name' )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:754:1: 'name'
            {
             before(grammarAccess.getSessionAccess().getNameKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__Session__Group__1__Impl1456); 
             after(grammarAccess.getSessionAccess().getNameKeyword_1()); 

            }


            }

        }
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:767:1: rule__Session__Group__2 : rule__Session__Group__2__Impl rule__Session__Group__3 ;
    public final void rule__Session__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:771:1: ( rule__Session__Group__2__Impl rule__Session__Group__3 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:772:2: rule__Session__Group__2__Impl rule__Session__Group__3
            {
            pushFollow(FOLLOW_rule__Session__Group__2__Impl_in_rule__Session__Group__21487);
            rule__Session__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Session__Group__3_in_rule__Session__Group__21490);
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:779:1: rule__Session__Group__2__Impl : ( ( rule__Session__NameAssignment_2 ) ) ;
    public final void rule__Session__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:783:1: ( ( ( rule__Session__NameAssignment_2 ) ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:784:1: ( ( rule__Session__NameAssignment_2 ) )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:784:1: ( ( rule__Session__NameAssignment_2 ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:785:1: ( rule__Session__NameAssignment_2 )
            {
             before(grammarAccess.getSessionAccess().getNameAssignment_2()); 
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:786:1: ( rule__Session__NameAssignment_2 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:786:2: rule__Session__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Session__NameAssignment_2_in_rule__Session__Group__2__Impl1517);
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:796:1: rule__Session__Group__3 : rule__Session__Group__3__Impl rule__Session__Group__4 ;
    public final void rule__Session__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:800:1: ( rule__Session__Group__3__Impl rule__Session__Group__4 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:801:2: rule__Session__Group__3__Impl rule__Session__Group__4
            {
            pushFollow(FOLLOW_rule__Session__Group__3__Impl_in_rule__Session__Group__31547);
            rule__Session__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Session__Group__4_in_rule__Session__Group__31550);
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:808:1: rule__Session__Group__3__Impl : ( 'start' ) ;
    public final void rule__Session__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:812:1: ( ( 'start' ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:813:1: ( 'start' )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:813:1: ( 'start' )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:814:1: 'start'
            {
             before(grammarAccess.getSessionAccess().getStartKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Session__Group__3__Impl1578); 
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:827:1: rule__Session__Group__4 : rule__Session__Group__4__Impl rule__Session__Group__5 ;
    public final void rule__Session__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:831:1: ( rule__Session__Group__4__Impl rule__Session__Group__5 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:832:2: rule__Session__Group__4__Impl rule__Session__Group__5
            {
            pushFollow(FOLLOW_rule__Session__Group__4__Impl_in_rule__Session__Group__41609);
            rule__Session__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Session__Group__5_in_rule__Session__Group__41612);
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:839:1: rule__Session__Group__4__Impl : ( ( rule__Session__StartAssignment_4 ) ) ;
    public final void rule__Session__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:843:1: ( ( ( rule__Session__StartAssignment_4 ) ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:844:1: ( ( rule__Session__StartAssignment_4 ) )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:844:1: ( ( rule__Session__StartAssignment_4 ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:845:1: ( rule__Session__StartAssignment_4 )
            {
             before(grammarAccess.getSessionAccess().getStartAssignment_4()); 
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:846:1: ( rule__Session__StartAssignment_4 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:846:2: rule__Session__StartAssignment_4
            {
            pushFollow(FOLLOW_rule__Session__StartAssignment_4_in_rule__Session__Group__4__Impl1639);
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:856:1: rule__Session__Group__5 : rule__Session__Group__5__Impl rule__Session__Group__6 ;
    public final void rule__Session__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:860:1: ( rule__Session__Group__5__Impl rule__Session__Group__6 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:861:2: rule__Session__Group__5__Impl rule__Session__Group__6
            {
            pushFollow(FOLLOW_rule__Session__Group__5__Impl_in_rule__Session__Group__51669);
            rule__Session__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Session__Group__6_in_rule__Session__Group__51672);
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:868:1: rule__Session__Group__5__Impl : ( 'end' ) ;
    public final void rule__Session__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:872:1: ( ( 'end' ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:873:1: ( 'end' )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:873:1: ( 'end' )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:874:1: 'end'
            {
             before(grammarAccess.getSessionAccess().getEndKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__Session__Group__5__Impl1700); 
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:887:1: rule__Session__Group__6 : rule__Session__Group__6__Impl rule__Session__Group__7 ;
    public final void rule__Session__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:891:1: ( rule__Session__Group__6__Impl rule__Session__Group__7 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:892:2: rule__Session__Group__6__Impl rule__Session__Group__7
            {
            pushFollow(FOLLOW_rule__Session__Group__6__Impl_in_rule__Session__Group__61731);
            rule__Session__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Session__Group__7_in_rule__Session__Group__61734);
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:899:1: rule__Session__Group__6__Impl : ( ( rule__Session__EndAssignment_6 ) ) ;
    public final void rule__Session__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:903:1: ( ( ( rule__Session__EndAssignment_6 ) ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:904:1: ( ( rule__Session__EndAssignment_6 ) )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:904:1: ( ( rule__Session__EndAssignment_6 ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:905:1: ( rule__Session__EndAssignment_6 )
            {
             before(grammarAccess.getSessionAccess().getEndAssignment_6()); 
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:906:1: ( rule__Session__EndAssignment_6 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:906:2: rule__Session__EndAssignment_6
            {
            pushFollow(FOLLOW_rule__Session__EndAssignment_6_in_rule__Session__Group__6__Impl1761);
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:916:1: rule__Session__Group__7 : rule__Session__Group__7__Impl rule__Session__Group__8 ;
    public final void rule__Session__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:920:1: ( rule__Session__Group__7__Impl rule__Session__Group__8 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:921:2: rule__Session__Group__7__Impl rule__Session__Group__8
            {
            pushFollow(FOLLOW_rule__Session__Group__7__Impl_in_rule__Session__Group__71791);
            rule__Session__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Session__Group__8_in_rule__Session__Group__71794);
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:928:1: rule__Session__Group__7__Impl : ( ( rule__Session__Group_7__0 )? ) ;
    public final void rule__Session__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:932:1: ( ( ( rule__Session__Group_7__0 )? ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:933:1: ( ( rule__Session__Group_7__0 )? )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:933:1: ( ( rule__Session__Group_7__0 )? )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:934:1: ( rule__Session__Group_7__0 )?
            {
             before(grammarAccess.getSessionAccess().getGroup_7()); 
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:935:1: ( rule__Session__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:935:2: rule__Session__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Session__Group_7__0_in_rule__Session__Group__7__Impl1821);
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


    // $ANTLR start "rule__Session__Group__8"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:945:1: rule__Session__Group__8 : rule__Session__Group__8__Impl ;
    public final void rule__Session__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:949:1: ( rule__Session__Group__8__Impl )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:950:2: rule__Session__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Session__Group__8__Impl_in_rule__Session__Group__81852);
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:956:1: rule__Session__Group__8__Impl : ( ']' ) ;
    public final void rule__Session__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:960:1: ( ( ']' ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:961:1: ( ']' )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:961:1: ( ']' )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:962:1: ']'
            {
             before(grammarAccess.getSessionAccess().getRightSquareBracketKeyword_8()); 
            match(input,15,FOLLOW_15_in_rule__Session__Group__8__Impl1880); 
             after(grammarAccess.getSessionAccess().getRightSquareBracketKeyword_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Session__Group_7__0"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:993:1: rule__Session__Group_7__0 : rule__Session__Group_7__0__Impl rule__Session__Group_7__1 ;
    public final void rule__Session__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:997:1: ( rule__Session__Group_7__0__Impl rule__Session__Group_7__1 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:998:2: rule__Session__Group_7__0__Impl rule__Session__Group_7__1
            {
            pushFollow(FOLLOW_rule__Session__Group_7__0__Impl_in_rule__Session__Group_7__01929);
            rule__Session__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Session__Group_7__1_in_rule__Session__Group_7__01932);
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1005:1: rule__Session__Group_7__0__Impl : ( 'Talks' ) ;
    public final void rule__Session__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1009:1: ( ( 'Talks' ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1010:1: ( 'Talks' )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1010:1: ( 'Talks' )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1011:1: 'Talks'
            {
             before(grammarAccess.getSessionAccess().getTalksKeyword_7_0()); 
            match(input,19,FOLLOW_19_in_rule__Session__Group_7__0__Impl1960); 
             after(grammarAccess.getSessionAccess().getTalksKeyword_7_0()); 

            }


            }

        }
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1024:1: rule__Session__Group_7__1 : rule__Session__Group_7__1__Impl rule__Session__Group_7__2 ;
    public final void rule__Session__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1028:1: ( rule__Session__Group_7__1__Impl rule__Session__Group_7__2 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1029:2: rule__Session__Group_7__1__Impl rule__Session__Group_7__2
            {
            pushFollow(FOLLOW_rule__Session__Group_7__1__Impl_in_rule__Session__Group_7__11991);
            rule__Session__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Session__Group_7__2_in_rule__Session__Group_7__11994);
            rule__Session__Group_7__2();

            state._fsp--;


            }

        }
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1036:1: rule__Session__Group_7__1__Impl : ( ( rule__Session__TalksAssignment_7_1 ) ) ;
    public final void rule__Session__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1040:1: ( ( ( rule__Session__TalksAssignment_7_1 ) ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1041:1: ( ( rule__Session__TalksAssignment_7_1 ) )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1041:1: ( ( rule__Session__TalksAssignment_7_1 ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1042:1: ( rule__Session__TalksAssignment_7_1 )
            {
             before(grammarAccess.getSessionAccess().getTalksAssignment_7_1()); 
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1043:1: ( rule__Session__TalksAssignment_7_1 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1043:2: rule__Session__TalksAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Session__TalksAssignment_7_1_in_rule__Session__Group_7__1__Impl2021);
            rule__Session__TalksAssignment_7_1();

            state._fsp--;


            }

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


    // $ANTLR start "rule__Session__Group_7__2"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1053:1: rule__Session__Group_7__2 : rule__Session__Group_7__2__Impl ;
    public final void rule__Session__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1057:1: ( rule__Session__Group_7__2__Impl )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1058:2: rule__Session__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__Session__Group_7__2__Impl_in_rule__Session__Group_7__22051);
            rule__Session__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_7__2"


    // $ANTLR start "rule__Session__Group_7__2__Impl"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1064:1: rule__Session__Group_7__2__Impl : ( ( rule__Session__TalksAssignment_7_2 )* ) ;
    public final void rule__Session__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1068:1: ( ( ( rule__Session__TalksAssignment_7_2 )* ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1069:1: ( ( rule__Session__TalksAssignment_7_2 )* )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1069:1: ( ( rule__Session__TalksAssignment_7_2 )* )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1070:1: ( rule__Session__TalksAssignment_7_2 )*
            {
             before(grammarAccess.getSessionAccess().getTalksAssignment_7_2()); 
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1071:1: ( rule__Session__TalksAssignment_7_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==13) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1071:2: rule__Session__TalksAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_rule__Session__TalksAssignment_7_2_in_rule__Session__Group_7__2__Impl2078);
            	    rule__Session__TalksAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSessionAccess().getTalksAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__Group_7__2__Impl"


    // $ANTLR start "rule__Talk__Group__0"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1087:1: rule__Talk__Group__0 : rule__Talk__Group__0__Impl rule__Talk__Group__1 ;
    public final void rule__Talk__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1091:1: ( rule__Talk__Group__0__Impl rule__Talk__Group__1 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1092:2: rule__Talk__Group__0__Impl rule__Talk__Group__1
            {
            pushFollow(FOLLOW_rule__Talk__Group__0__Impl_in_rule__Talk__Group__02115);
            rule__Talk__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Talk__Group__1_in_rule__Talk__Group__02118);
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1099:1: rule__Talk__Group__0__Impl : ( '[' ) ;
    public final void rule__Talk__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1103:1: ( ( '[' ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1104:1: ( '[' )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1104:1: ( '[' )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1105:1: '['
            {
             before(grammarAccess.getTalkAccess().getLeftSquareBracketKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Talk__Group__0__Impl2146); 
             after(grammarAccess.getTalkAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1118:1: rule__Talk__Group__1 : rule__Talk__Group__1__Impl rule__Talk__Group__2 ;
    public final void rule__Talk__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1122:1: ( rule__Talk__Group__1__Impl rule__Talk__Group__2 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1123:2: rule__Talk__Group__1__Impl rule__Talk__Group__2
            {
            pushFollow(FOLLOW_rule__Talk__Group__1__Impl_in_rule__Talk__Group__12177);
            rule__Talk__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Talk__Group__2_in_rule__Talk__Group__12180);
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1130:1: rule__Talk__Group__1__Impl : ( 'title' ) ;
    public final void rule__Talk__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1134:1: ( ( 'title' ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1135:1: ( 'title' )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1135:1: ( 'title' )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1136:1: 'title'
            {
             before(grammarAccess.getTalkAccess().getTitleKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Talk__Group__1__Impl2208); 
             after(grammarAccess.getTalkAccess().getTitleKeyword_1()); 

            }


            }

        }
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1149:1: rule__Talk__Group__2 : rule__Talk__Group__2__Impl rule__Talk__Group__3 ;
    public final void rule__Talk__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1153:1: ( rule__Talk__Group__2__Impl rule__Talk__Group__3 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1154:2: rule__Talk__Group__2__Impl rule__Talk__Group__3
            {
            pushFollow(FOLLOW_rule__Talk__Group__2__Impl_in_rule__Talk__Group__22239);
            rule__Talk__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Talk__Group__3_in_rule__Talk__Group__22242);
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1161:1: rule__Talk__Group__2__Impl : ( ( rule__Talk__TilteAssignment_2 ) ) ;
    public final void rule__Talk__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1165:1: ( ( ( rule__Talk__TilteAssignment_2 ) ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1166:1: ( ( rule__Talk__TilteAssignment_2 ) )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1166:1: ( ( rule__Talk__TilteAssignment_2 ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1167:1: ( rule__Talk__TilteAssignment_2 )
            {
             before(grammarAccess.getTalkAccess().getTilteAssignment_2()); 
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1168:1: ( rule__Talk__TilteAssignment_2 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1168:2: rule__Talk__TilteAssignment_2
            {
            pushFollow(FOLLOW_rule__Talk__TilteAssignment_2_in_rule__Talk__Group__2__Impl2269);
            rule__Talk__TilteAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getTilteAssignment_2()); 

            }


            }

        }
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1178:1: rule__Talk__Group__3 : rule__Talk__Group__3__Impl rule__Talk__Group__4 ;
    public final void rule__Talk__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1182:1: ( rule__Talk__Group__3__Impl rule__Talk__Group__4 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1183:2: rule__Talk__Group__3__Impl rule__Talk__Group__4
            {
            pushFollow(FOLLOW_rule__Talk__Group__3__Impl_in_rule__Talk__Group__32299);
            rule__Talk__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Talk__Group__4_in_rule__Talk__Group__32302);
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1190:1: rule__Talk__Group__3__Impl : ( 'room' ) ;
    public final void rule__Talk__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1194:1: ( ( 'room' ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1195:1: ( 'room' )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1195:1: ( 'room' )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1196:1: 'room'
            {
             before(grammarAccess.getTalkAccess().getRoomKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__Talk__Group__3__Impl2330); 
             after(grammarAccess.getTalkAccess().getRoomKeyword_3()); 

            }


            }

        }
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1209:1: rule__Talk__Group__4 : rule__Talk__Group__4__Impl rule__Talk__Group__5 ;
    public final void rule__Talk__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1213:1: ( rule__Talk__Group__4__Impl rule__Talk__Group__5 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1214:2: rule__Talk__Group__4__Impl rule__Talk__Group__5
            {
            pushFollow(FOLLOW_rule__Talk__Group__4__Impl_in_rule__Talk__Group__42361);
            rule__Talk__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Talk__Group__5_in_rule__Talk__Group__42364);
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1221:1: rule__Talk__Group__4__Impl : ( ( rule__Talk__RoomAssignment_4 ) ) ;
    public final void rule__Talk__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1225:1: ( ( ( rule__Talk__RoomAssignment_4 ) ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1226:1: ( ( rule__Talk__RoomAssignment_4 ) )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1226:1: ( ( rule__Talk__RoomAssignment_4 ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1227:1: ( rule__Talk__RoomAssignment_4 )
            {
             before(grammarAccess.getTalkAccess().getRoomAssignment_4()); 
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1228:1: ( rule__Talk__RoomAssignment_4 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1228:2: rule__Talk__RoomAssignment_4
            {
            pushFollow(FOLLOW_rule__Talk__RoomAssignment_4_in_rule__Talk__Group__4__Impl2391);
            rule__Talk__RoomAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getRoomAssignment_4()); 

            }


            }

        }
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1238:1: rule__Talk__Group__5 : rule__Talk__Group__5__Impl rule__Talk__Group__6 ;
    public final void rule__Talk__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1242:1: ( rule__Talk__Group__5__Impl rule__Talk__Group__6 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1243:2: rule__Talk__Group__5__Impl rule__Talk__Group__6
            {
            pushFollow(FOLLOW_rule__Talk__Group__5__Impl_in_rule__Talk__Group__52421);
            rule__Talk__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Talk__Group__6_in_rule__Talk__Group__52424);
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1250:1: rule__Talk__Group__5__Impl : ( ( rule__Talk__Group_5__0 )? ) ;
    public final void rule__Talk__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1254:1: ( ( ( rule__Talk__Group_5__0 )? ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1255:1: ( ( rule__Talk__Group_5__0 )? )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1255:1: ( ( rule__Talk__Group_5__0 )? )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1256:1: ( rule__Talk__Group_5__0 )?
            {
             before(grammarAccess.getTalkAccess().getGroup_5()); 
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1257:1: ( rule__Talk__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1257:2: rule__Talk__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Talk__Group_5__0_in_rule__Talk__Group__5__Impl2451);
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1267:1: rule__Talk__Group__6 : rule__Talk__Group__6__Impl ;
    public final void rule__Talk__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1271:1: ( rule__Talk__Group__6__Impl )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1272:2: rule__Talk__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Talk__Group__6__Impl_in_rule__Talk__Group__62482);
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1278:1: rule__Talk__Group__6__Impl : ( ']' ) ;
    public final void rule__Talk__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1282:1: ( ( ']' ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1283:1: ( ']' )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1283:1: ( ']' )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1284:1: ']'
            {
             before(grammarAccess.getTalkAccess().getRightSquareBracketKeyword_6()); 
            match(input,15,FOLLOW_15_in_rule__Talk__Group__6__Impl2510); 
             after(grammarAccess.getTalkAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Talk__Group_5__0"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1311:1: rule__Talk__Group_5__0 : rule__Talk__Group_5__0__Impl rule__Talk__Group_5__1 ;
    public final void rule__Talk__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1315:1: ( rule__Talk__Group_5__0__Impl rule__Talk__Group_5__1 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1316:2: rule__Talk__Group_5__0__Impl rule__Talk__Group_5__1
            {
            pushFollow(FOLLOW_rule__Talk__Group_5__0__Impl_in_rule__Talk__Group_5__02555);
            rule__Talk__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Talk__Group_5__1_in_rule__Talk__Group_5__02558);
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1323:1: rule__Talk__Group_5__0__Impl : ( 'speakers' ) ;
    public final void rule__Talk__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1327:1: ( ( 'speakers' ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1328:1: ( 'speakers' )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1328:1: ( 'speakers' )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1329:1: 'speakers'
            {
             before(grammarAccess.getTalkAccess().getSpeakersKeyword_5_0()); 
            match(input,22,FOLLOW_22_in_rule__Talk__Group_5__0__Impl2586); 
             after(grammarAccess.getTalkAccess().getSpeakersKeyword_5_0()); 

            }


            }

        }
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1342:1: rule__Talk__Group_5__1 : rule__Talk__Group_5__1__Impl rule__Talk__Group_5__2 ;
    public final void rule__Talk__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1346:1: ( rule__Talk__Group_5__1__Impl rule__Talk__Group_5__2 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1347:2: rule__Talk__Group_5__1__Impl rule__Talk__Group_5__2
            {
            pushFollow(FOLLOW_rule__Talk__Group_5__1__Impl_in_rule__Talk__Group_5__12617);
            rule__Talk__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Talk__Group_5__2_in_rule__Talk__Group_5__12620);
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1354:1: rule__Talk__Group_5__1__Impl : ( ( rule__Talk__SpeakersAssignment_5_1 ) ) ;
    public final void rule__Talk__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1358:1: ( ( ( rule__Talk__SpeakersAssignment_5_1 ) ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1359:1: ( ( rule__Talk__SpeakersAssignment_5_1 ) )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1359:1: ( ( rule__Talk__SpeakersAssignment_5_1 ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1360:1: ( rule__Talk__SpeakersAssignment_5_1 )
            {
             before(grammarAccess.getTalkAccess().getSpeakersAssignment_5_1()); 
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1361:1: ( rule__Talk__SpeakersAssignment_5_1 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1361:2: rule__Talk__SpeakersAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Talk__SpeakersAssignment_5_1_in_rule__Talk__Group_5__1__Impl2647);
            rule__Talk__SpeakersAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getSpeakersAssignment_5_1()); 

            }


            }

        }
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1371:1: rule__Talk__Group_5__2 : rule__Talk__Group_5__2__Impl ;
    public final void rule__Talk__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1375:1: ( rule__Talk__Group_5__2__Impl )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1376:2: rule__Talk__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Talk__Group_5__2__Impl_in_rule__Talk__Group_5__22677);
            rule__Talk__Group_5__2__Impl();

            state._fsp--;


            }

        }
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1382:1: rule__Talk__Group_5__2__Impl : ( ( rule__Talk__Group_5_2__0 )* ) ;
    public final void rule__Talk__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1386:1: ( ( ( rule__Talk__Group_5_2__0 )* ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1387:1: ( ( rule__Talk__Group_5_2__0 )* )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1387:1: ( ( rule__Talk__Group_5_2__0 )* )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1388:1: ( rule__Talk__Group_5_2__0 )*
            {
             before(grammarAccess.getTalkAccess().getGroup_5_2()); 
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1389:1: ( rule__Talk__Group_5_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1389:2: rule__Talk__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Talk__Group_5_2__0_in_rule__Talk__Group_5__2__Impl2704);
            	    rule__Talk__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getTalkAccess().getGroup_5_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Talk__Group_5_2__0"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1405:1: rule__Talk__Group_5_2__0 : rule__Talk__Group_5_2__0__Impl rule__Talk__Group_5_2__1 ;
    public final void rule__Talk__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1409:1: ( rule__Talk__Group_5_2__0__Impl rule__Talk__Group_5_2__1 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1410:2: rule__Talk__Group_5_2__0__Impl rule__Talk__Group_5_2__1
            {
            pushFollow(FOLLOW_rule__Talk__Group_5_2__0__Impl_in_rule__Talk__Group_5_2__02741);
            rule__Talk__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Talk__Group_5_2__1_in_rule__Talk__Group_5_2__02744);
            rule__Talk__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_5_2__0"


    // $ANTLR start "rule__Talk__Group_5_2__0__Impl"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1417:1: rule__Talk__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Talk__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1421:1: ( ( ',' ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1422:1: ( ',' )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1422:1: ( ',' )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1423:1: ','
            {
             before(grammarAccess.getTalkAccess().getCommaKeyword_5_2_0()); 
            match(input,23,FOLLOW_23_in_rule__Talk__Group_5_2__0__Impl2772); 
             after(grammarAccess.getTalkAccess().getCommaKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_5_2__0__Impl"


    // $ANTLR start "rule__Talk__Group_5_2__1"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1436:1: rule__Talk__Group_5_2__1 : rule__Talk__Group_5_2__1__Impl ;
    public final void rule__Talk__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1440:1: ( rule__Talk__Group_5_2__1__Impl )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1441:2: rule__Talk__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Talk__Group_5_2__1__Impl_in_rule__Talk__Group_5_2__12803);
            rule__Talk__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_5_2__1"


    // $ANTLR start "rule__Talk__Group_5_2__1__Impl"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1447:1: rule__Talk__Group_5_2__1__Impl : ( ( rule__Talk__SpeakersAssignment_5_2_1 ) ) ;
    public final void rule__Talk__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1451:1: ( ( ( rule__Talk__SpeakersAssignment_5_2_1 ) ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1452:1: ( ( rule__Talk__SpeakersAssignment_5_2_1 ) )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1452:1: ( ( rule__Talk__SpeakersAssignment_5_2_1 ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1453:1: ( rule__Talk__SpeakersAssignment_5_2_1 )
            {
             before(grammarAccess.getTalkAccess().getSpeakersAssignment_5_2_1()); 
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1454:1: ( rule__Talk__SpeakersAssignment_5_2_1 )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1454:2: rule__Talk__SpeakersAssignment_5_2_1
            {
            pushFollow(FOLLOW_rule__Talk__SpeakersAssignment_5_2_1_in_rule__Talk__Group_5_2__1__Impl2830);
            rule__Talk__SpeakersAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTalkAccess().getSpeakersAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__Group_5_2__1__Impl"


    // $ANTLR start "rule__Program__RoomsAssignment_0_1"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1469:1: rule__Program__RoomsAssignment_0_1 : ( ruleRoom ) ;
    public final void rule__Program__RoomsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1473:1: ( ( ruleRoom ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1474:1: ( ruleRoom )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1474:1: ( ruleRoom )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1475:1: ruleRoom
            {
             before(grammarAccess.getProgramAccess().getRoomsRoomParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleRoom_in_rule__Program__RoomsAssignment_0_12869);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getRoomsRoomParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__RoomsAssignment_0_1"


    // $ANTLR start "rule__Program__RoomsAssignment_0_2"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1484:1: rule__Program__RoomsAssignment_0_2 : ( ruleRoom ) ;
    public final void rule__Program__RoomsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1488:1: ( ( ruleRoom ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1489:1: ( ruleRoom )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1489:1: ( ruleRoom )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1490:1: ruleRoom
            {
             before(grammarAccess.getProgramAccess().getRoomsRoomParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleRoom_in_rule__Program__RoomsAssignment_0_22900);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getRoomsRoomParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__RoomsAssignment_0_2"


    // $ANTLR start "rule__Program__DaysAssignment_1_1"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1499:1: rule__Program__DaysAssignment_1_1 : ( ruleDay ) ;
    public final void rule__Program__DaysAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1503:1: ( ( ruleDay ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1504:1: ( ruleDay )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1504:1: ( ruleDay )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1505:1: ruleDay
            {
             before(grammarAccess.getProgramAccess().getDaysDayParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleDay_in_rule__Program__DaysAssignment_1_12931);
            ruleDay();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getDaysDayParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__DaysAssignment_1_1"


    // $ANTLR start "rule__Program__DaysAssignment_1_2"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1514:1: rule__Program__DaysAssignment_1_2 : ( ruleDay ) ;
    public final void rule__Program__DaysAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1518:1: ( ( ruleDay ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1519:1: ( ruleDay )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1519:1: ( ruleDay )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1520:1: ruleDay
            {
             before(grammarAccess.getProgramAccess().getDaysDayParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleDay_in_rule__Program__DaysAssignment_1_22962);
            ruleDay();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getDaysDayParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__DaysAssignment_1_2"


    // $ANTLR start "rule__Room__NameAssignment"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1529:1: rule__Room__NameAssignment : ( RULE_STRING ) ;
    public final void rule__Room__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1533:1: ( ( RULE_STRING ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1534:1: ( RULE_STRING )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1534:1: ( RULE_STRING )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1535:1: RULE_STRING
            {
             before(grammarAccess.getRoomAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Room__NameAssignment2993); 
             after(grammarAccess.getRoomAccess().getNameSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__NameAssignment"


    // $ANTLR start "rule__Day__NameAssignment_2"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1544:1: rule__Day__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Day__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1548:1: ( ( RULE_STRING ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1549:1: ( RULE_STRING )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1549:1: ( RULE_STRING )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1550:1: RULE_STRING
            {
             before(grammarAccess.getDayAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Day__NameAssignment_23024); 
             after(grammarAccess.getDayAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__NameAssignment_2"


    // $ANTLR start "rule__Day__SessionsAssignment_3_1"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1559:1: rule__Day__SessionsAssignment_3_1 : ( ruleSession ) ;
    public final void rule__Day__SessionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1563:1: ( ( ruleSession ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1564:1: ( ruleSession )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1564:1: ( ruleSession )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1565:1: ruleSession
            {
             before(grammarAccess.getDayAccess().getSessionsSessionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleSession_in_rule__Day__SessionsAssignment_3_13055);
            ruleSession();

            state._fsp--;

             after(grammarAccess.getDayAccess().getSessionsSessionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__SessionsAssignment_3_1"


    // $ANTLR start "rule__Day__SessionsAssignment_3_2"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1574:1: rule__Day__SessionsAssignment_3_2 : ( ruleSession ) ;
    public final void rule__Day__SessionsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1578:1: ( ( ruleSession ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1579:1: ( ruleSession )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1579:1: ( ruleSession )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1580:1: ruleSession
            {
             before(grammarAccess.getDayAccess().getSessionsSessionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleSession_in_rule__Day__SessionsAssignment_3_23086);
            ruleSession();

            state._fsp--;

             after(grammarAccess.getDayAccess().getSessionsSessionParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Day__SessionsAssignment_3_2"


    // $ANTLR start "rule__Session__NameAssignment_2"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1589:1: rule__Session__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Session__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1593:1: ( ( RULE_STRING ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1594:1: ( RULE_STRING )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1594:1: ( RULE_STRING )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1595:1: RULE_STRING
            {
             before(grammarAccess.getSessionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Session__NameAssignment_23117); 
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1604:1: rule__Session__StartAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Session__StartAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1608:1: ( ( RULE_STRING ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1609:1: ( RULE_STRING )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1609:1: ( RULE_STRING )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1610:1: RULE_STRING
            {
             before(grammarAccess.getSessionAccess().getStartSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Session__StartAssignment_43148); 
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
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1619:1: rule__Session__EndAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Session__EndAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1623:1: ( ( RULE_STRING ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1624:1: ( RULE_STRING )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1624:1: ( RULE_STRING )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1625:1: RULE_STRING
            {
             before(grammarAccess.getSessionAccess().getEndSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Session__EndAssignment_63179); 
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


    // $ANTLR start "rule__Session__TalksAssignment_7_1"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1634:1: rule__Session__TalksAssignment_7_1 : ( ruleTalk ) ;
    public final void rule__Session__TalksAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1638:1: ( ( ruleTalk ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1639:1: ( ruleTalk )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1639:1: ( ruleTalk )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1640:1: ruleTalk
            {
             before(grammarAccess.getSessionAccess().getTalksTalkParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleTalk_in_rule__Session__TalksAssignment_7_13210);
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


    // $ANTLR start "rule__Session__TalksAssignment_7_2"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1649:1: rule__Session__TalksAssignment_7_2 : ( ruleTalk ) ;
    public final void rule__Session__TalksAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1653:1: ( ( ruleTalk ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1654:1: ( ruleTalk )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1654:1: ( ruleTalk )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1655:1: ruleTalk
            {
             before(grammarAccess.getSessionAccess().getTalksTalkParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleTalk_in_rule__Session__TalksAssignment_7_23241);
            ruleTalk();

            state._fsp--;

             after(grammarAccess.getSessionAccess().getTalksTalkParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Session__TalksAssignment_7_2"


    // $ANTLR start "rule__Talk__TilteAssignment_2"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1664:1: rule__Talk__TilteAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Talk__TilteAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1668:1: ( ( RULE_STRING ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1669:1: ( RULE_STRING )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1669:1: ( RULE_STRING )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1670:1: RULE_STRING
            {
             before(grammarAccess.getTalkAccess().getTilteSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Talk__TilteAssignment_23272); 
             after(grammarAccess.getTalkAccess().getTilteSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__TilteAssignment_2"


    // $ANTLR start "rule__Talk__RoomAssignment_4"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1679:1: rule__Talk__RoomAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Talk__RoomAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1683:1: ( ( RULE_STRING ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1684:1: ( RULE_STRING )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1684:1: ( RULE_STRING )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1685:1: RULE_STRING
            {
             before(grammarAccess.getTalkAccess().getRoomSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Talk__RoomAssignment_43303); 
             after(grammarAccess.getTalkAccess().getRoomSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__RoomAssignment_4"


    // $ANTLR start "rule__Talk__SpeakersAssignment_5_1"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1694:1: rule__Talk__SpeakersAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Talk__SpeakersAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1698:1: ( ( RULE_STRING ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1699:1: ( RULE_STRING )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1699:1: ( RULE_STRING )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1700:1: RULE_STRING
            {
             before(grammarAccess.getTalkAccess().getSpeakersSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Talk__SpeakersAssignment_5_13334); 
             after(grammarAccess.getTalkAccess().getSpeakersSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__SpeakersAssignment_5_1"


    // $ANTLR start "rule__Talk__SpeakersAssignment_5_2_1"
    // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1709:1: rule__Talk__SpeakersAssignment_5_2_1 : ( RULE_STRING ) ;
    public final void rule__Talk__SpeakersAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1713:1: ( ( RULE_STRING ) )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1714:1: ( RULE_STRING )
            {
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1714:1: ( RULE_STRING )
            // ../fr.irisa.models.program.ui/src-gen/fr/irisa/models/program/ui/contentassist/antlr/internal/InternalProgram.g:1715:1: RULE_STRING
            {
             before(grammarAccess.getTalkAccess().getSpeakersSTRINGTerminalRuleCall_5_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Talk__SpeakersAssignment_5_2_13365); 
             after(grammarAccess.getTalkAccess().getSpeakersSTRINGTerminalRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talk__SpeakersAssignment_5_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0_in_ruleProgram94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoom_in_entryRuleRoom121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRoom128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Room__NameAssignment_in_ruleRoom154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDay_in_entryRuleDay181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDay188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Day__Group__0_in_ruleDay214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSession_in_entryRuleSession241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSession248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Session__Group__0_in_ruleSession274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTalk_in_entryRuleTalk301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTalk308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group__0_in_ruleTalk334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__0368 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__0371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0__0_in_rule__Program__Group__0__Impl398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_1__0_in_rule__Program__Group__1__Impl456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0__0__Impl_in_rule__Program__Group_0__0491 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group_0__1_in_rule__Program__Group_0__0494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Program__Group_0__0__Impl522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0__1__Impl_in_rule__Program__Group_0__1553 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Program__Group_0__2_in_rule__Program__Group_0__1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__RoomsAssignment_0_1_in_rule__Program__Group_0__1__Impl583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_0__2__Impl_in_rule__Program__Group_0__2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__RoomsAssignment_0_2_in_rule__Program__Group_0__2__Impl640 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Program__Group_1__0__Impl_in_rule__Program__Group_1__0677 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Program__Group_1__1_in_rule__Program__Group_1__0680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Program__Group_1__0__Impl708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_1__1__Impl_in_rule__Program__Group_1__1739 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Program__Group_1__2_in_rule__Program__Group_1__1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__DaysAssignment_1_1_in_rule__Program__Group_1__1__Impl769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_1__2__Impl_in_rule__Program__Group_1__2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__DaysAssignment_1_2_in_rule__Program__Group_1__2__Impl826 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Day__Group__0__Impl_in_rule__Day__Group__0863 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Day__Group__1_in_rule__Day__Group__0866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Day__Group__0__Impl894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Day__Group__1__Impl_in_rule__Day__Group__1925 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Day__Group__2_in_rule__Day__Group__1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Day__Group__1__Impl956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Day__Group__2__Impl_in_rule__Day__Group__2987 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Day__Group__3_in_rule__Day__Group__2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Day__NameAssignment_2_in_rule__Day__Group__2__Impl1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Day__Group__3__Impl_in_rule__Day__Group__31047 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Day__Group__4_in_rule__Day__Group__31050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Day__Group_3__0_in_rule__Day__Group__3__Impl1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Day__Group__4__Impl_in_rule__Day__Group__41108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Day__Group__4__Impl1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Day__Group_3__0__Impl_in_rule__Day__Group_3__01177 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Day__Group_3__1_in_rule__Day__Group_3__01180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Day__Group_3__0__Impl1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Day__Group_3__1__Impl_in_rule__Day__Group_3__11239 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Day__Group_3__2_in_rule__Day__Group_3__11242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Day__SessionsAssignment_3_1_in_rule__Day__Group_3__1__Impl1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Day__Group_3__2__Impl_in_rule__Day__Group_3__21299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Day__SessionsAssignment_3_2_in_rule__Day__Group_3__2__Impl1326 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Session__Group__0__Impl_in_rule__Session__Group__01363 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Session__Group__1_in_rule__Session__Group__01366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Session__Group__0__Impl1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Session__Group__1__Impl_in_rule__Session__Group__11425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Session__Group__2_in_rule__Session__Group__11428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Session__Group__1__Impl1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Session__Group__2__Impl_in_rule__Session__Group__21487 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Session__Group__3_in_rule__Session__Group__21490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Session__NameAssignment_2_in_rule__Session__Group__2__Impl1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Session__Group__3__Impl_in_rule__Session__Group__31547 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Session__Group__4_in_rule__Session__Group__31550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Session__Group__3__Impl1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Session__Group__4__Impl_in_rule__Session__Group__41609 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Session__Group__5_in_rule__Session__Group__41612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Session__StartAssignment_4_in_rule__Session__Group__4__Impl1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Session__Group__5__Impl_in_rule__Session__Group__51669 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Session__Group__6_in_rule__Session__Group__51672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Session__Group__5__Impl1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Session__Group__6__Impl_in_rule__Session__Group__61731 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_rule__Session__Group__7_in_rule__Session__Group__61734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Session__EndAssignment_6_in_rule__Session__Group__6__Impl1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Session__Group__7__Impl_in_rule__Session__Group__71791 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_rule__Session__Group__8_in_rule__Session__Group__71794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Session__Group_7__0_in_rule__Session__Group__7__Impl1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Session__Group__8__Impl_in_rule__Session__Group__81852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Session__Group__8__Impl1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Session__Group_7__0__Impl_in_rule__Session__Group_7__01929 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Session__Group_7__1_in_rule__Session__Group_7__01932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Session__Group_7__0__Impl1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Session__Group_7__1__Impl_in_rule__Session__Group_7__11991 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Session__Group_7__2_in_rule__Session__Group_7__11994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Session__TalksAssignment_7_1_in_rule__Session__Group_7__1__Impl2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Session__Group_7__2__Impl_in_rule__Session__Group_7__22051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Session__TalksAssignment_7_2_in_rule__Session__Group_7__2__Impl2078 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Talk__Group__0__Impl_in_rule__Talk__Group__02115 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Talk__Group__1_in_rule__Talk__Group__02118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Talk__Group__0__Impl2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group__1__Impl_in_rule__Talk__Group__12177 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Talk__Group__2_in_rule__Talk__Group__12180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Talk__Group__1__Impl2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group__2__Impl_in_rule__Talk__Group__22239 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Talk__Group__3_in_rule__Talk__Group__22242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__TilteAssignment_2_in_rule__Talk__Group__2__Impl2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group__3__Impl_in_rule__Talk__Group__32299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Talk__Group__4_in_rule__Talk__Group__32302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Talk__Group__3__Impl2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group__4__Impl_in_rule__Talk__Group__42361 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_rule__Talk__Group__5_in_rule__Talk__Group__42364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__RoomAssignment_4_in_rule__Talk__Group__4__Impl2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group__5__Impl_in_rule__Talk__Group__52421 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_rule__Talk__Group__6_in_rule__Talk__Group__52424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group_5__0_in_rule__Talk__Group__5__Impl2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group__6__Impl_in_rule__Talk__Group__62482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Talk__Group__6__Impl2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group_5__0__Impl_in_rule__Talk__Group_5__02555 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Talk__Group_5__1_in_rule__Talk__Group_5__02558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Talk__Group_5__0__Impl2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group_5__1__Impl_in_rule__Talk__Group_5__12617 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Talk__Group_5__2_in_rule__Talk__Group_5__12620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__SpeakersAssignment_5_1_in_rule__Talk__Group_5__1__Impl2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group_5__2__Impl_in_rule__Talk__Group_5__22677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group_5_2__0_in_rule__Talk__Group_5__2__Impl2704 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Talk__Group_5_2__0__Impl_in_rule__Talk__Group_5_2__02741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Talk__Group_5_2__1_in_rule__Talk__Group_5_2__02744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Talk__Group_5_2__0__Impl2772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__Group_5_2__1__Impl_in_rule__Talk__Group_5_2__12803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Talk__SpeakersAssignment_5_2_1_in_rule__Talk__Group_5_2__1__Impl2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoom_in_rule__Program__RoomsAssignment_0_12869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoom_in_rule__Program__RoomsAssignment_0_22900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDay_in_rule__Program__DaysAssignment_1_12931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDay_in_rule__Program__DaysAssignment_1_22962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Room__NameAssignment2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Day__NameAssignment_23024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSession_in_rule__Day__SessionsAssignment_3_13055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSession_in_rule__Day__SessionsAssignment_3_23086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Session__NameAssignment_23117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Session__StartAssignment_43148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Session__EndAssignment_63179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTalk_in_rule__Session__TalksAssignment_7_13210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTalk_in_rule__Session__TalksAssignment_7_23241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Talk__TilteAssignment_23272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Talk__RoomAssignment_43303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Talk__SpeakersAssignment_5_13334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Talk__SpeakersAssignment_5_2_13365 = new BitSet(new long[]{0x0000000000000002L});

}