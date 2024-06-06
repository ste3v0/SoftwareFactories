package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int RULE_LOWERCASE_WORD=5;
    public static final int RULE_ID=8;
    public static final int RULE_WS=13;
    public static final int RULE_STRING=10;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_LOWERCASE_LETTER=7;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_UPERCASE_LETTER=6;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_UPPERCASE_WORD=4;
    public static final int T__17=17;
    public static final int RULE_INT=9;
    public static final int T__18=18;
    public static final int RULE_ML_COMMENT=11;
    public static final int EOF=-1;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( ':' )
            // InternalMyDsl.g:11:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:12:7: ( 'Um' )
            // InternalMyDsl.g:12:9: 'Um'
            {
            match("Um"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13:7: ( ', m\\u00F6chte ich als' )
            // InternalMyDsl.g:13:9: ', m\\u00F6chte ich als'
            {
            match(", m\u00F6chte ich als"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:14:7: ( '.' )
            // InternalMyDsl.g:14:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "RULE_UPPERCASE_WORD"
    public final void mRULE_UPPERCASE_WORD() throws RecognitionException {
        try {
            int _type = RULE_UPPERCASE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:410:21: ( RULE_UPERCASE_LETTER ( RULE_LOWERCASE_LETTER )+ )
            // InternalMyDsl.g:410:23: RULE_UPERCASE_LETTER ( RULE_LOWERCASE_LETTER )+
            {
            mRULE_UPERCASE_LETTER(); 
            // InternalMyDsl.g:410:44: ( RULE_LOWERCASE_LETTER )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='a' && LA1_0<='z')||LA1_0=='\u00DF'||LA1_0=='\u00E4'||LA1_0=='\u00F6'||LA1_0=='\u00FC') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:410:44: RULE_LOWERCASE_LETTER
            	    {
            	    mRULE_LOWERCASE_LETTER(); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UPPERCASE_WORD"

    // $ANTLR start "RULE_LOWERCASE_WORD"
    public final void mRULE_LOWERCASE_WORD() throws RecognitionException {
        try {
            int _type = RULE_LOWERCASE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:412:21: ( ( RULE_LOWERCASE_LETTER )+ )
            // InternalMyDsl.g:412:23: ( RULE_LOWERCASE_LETTER )+
            {
            // InternalMyDsl.g:412:23: ( RULE_LOWERCASE_LETTER )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='a' && LA2_0<='z')||LA2_0=='\u00DF'||LA2_0=='\u00E4'||LA2_0=='\u00F6'||LA2_0=='\u00FC') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:412:23: RULE_LOWERCASE_LETTER
            	    {
            	    mRULE_LOWERCASE_LETTER(); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LOWERCASE_WORD"

    // $ANTLR start "RULE_UPERCASE_LETTER"
    public final void mRULE_UPERCASE_LETTER() throws RecognitionException {
        try {
            // InternalMyDsl.g:414:31: ( ( 'A' .. 'Z' | '\\u00C4' | '\\u00DC' | '\\u00D6' ) )
            // InternalMyDsl.g:414:33: ( 'A' .. 'Z' | '\\u00C4' | '\\u00DC' | '\\u00D6' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='\u00C4'||input.LA(1)=='\u00D6'||input.LA(1)=='\u00DC' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UPERCASE_LETTER"

    // $ANTLR start "RULE_LOWERCASE_LETTER"
    public final void mRULE_LOWERCASE_LETTER() throws RecognitionException {
        try {
            // InternalMyDsl.g:416:32: ( ( 'a' .. 'z' | '\\u00E4' | '\\u00FC' | '\\u00F6' | '\\u00DF' ) )
            // InternalMyDsl.g:416:34: ( 'a' .. 'z' | '\\u00E4' | '\\u00FC' | '\\u00F6' | '\\u00DF' )
            {
            if ( (input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00DF'||input.LA(1)=='\u00E4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00FC' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LOWERCASE_LETTER"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:418:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:418:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:418:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:418:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:418:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:420:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:420:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:420:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:420:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:422:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:422:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:422:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:422:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:422:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMyDsl.g:422:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:422:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:422:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:422:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMyDsl.g:422:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:422:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:424:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:424:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:424:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:424:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:426:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:426:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:426:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:426:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalMyDsl.g:426:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:426:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:426:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalMyDsl.g:426:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:428:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:428:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:428:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:430:16: ( . )
            // InternalMyDsl.g:430:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyDsl.g:1:8: ( T__15 | T__16 | T__17 | T__18 | RULE_UPPERCASE_WORD | RULE_LOWERCASE_WORD | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=13;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalMyDsl.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: RULE_UPPERCASE_WORD
                {
                mRULE_UPPERCASE_WORD(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:54: RULE_LOWERCASE_WORD
                {
                mRULE_LOWERCASE_WORD(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:74: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:82: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:91: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:103: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:119: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:135: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:143: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\2\uffff\1\23\1\20\1\uffff\1\23\1\30\2\20\3\uffff\3\20\3\uffff\1\37\1\uffff\1\25\4\uffff\1\30\6\uffff";
    static final String DFA14_eofS =
        "\40\uffff";
    static final String DFA14_minS =
        "\1\0\1\uffff\1\141\1\40\1\uffff\1\141\1\60\1\101\1\141\3\uffff\2\0\1\52\3\uffff\1\60\1\uffff\1\60\4\uffff\1\60\6\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\uffff\1\u00fc\1\40\1\uffff\1\u00fc\2\172\1\u00fc\3\uffff\2\uffff\1\57\3\uffff\1\u00fc\1\uffff\1\172\4\uffff\1\172\6\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\4\uffff\1\6\1\7\1\10\3\uffff\1\14\1\15\1\1\1\uffff\1\7\1\uffff\1\5\1\3\1\4\1\6\1\uffff\1\10\1\11\1\12\1\13\1\14\1\2";
    static final String DFA14_specialS =
        "\1\2\13\uffff\1\1\1\0\22\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\20\2\17\2\20\1\17\22\20\1\17\1\20\1\14\4\20\1\15\4\20\1\3\1\20\1\4\1\16\12\13\1\1\6\20\24\5\1\2\5\5\3\20\1\7\1\12\1\20\32\6\111\20\1\10\21\20\1\10\5\20\1\10\2\20\1\11\4\20\1\11\21\20\1\11\5\20\1\11\uff03\20",
            "",
            "\14\24\1\22\15\24\144\uffff\1\25\4\uffff\1\25\21\uffff\1\25\5\uffff\1\25",
            "\1\26",
            "",
            "\32\24\144\uffff\1\25\4\uffff\1\25\21\uffff\1\25\5\uffff\1\25",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\31",
            "\32\23\4\uffff\1\23\1\uffff\32\23",
            "\32\25\144\uffff\1\25\4\uffff\1\25\21\uffff\1\25\5\uffff\1\25",
            "",
            "",
            "",
            "\0\33",
            "\0\33",
            "\1\34\4\uffff\1\35",
            "",
            "",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\24\144\uffff\1\25\4\uffff\1\25\21\uffff\1\25\5\uffff\1\25",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\24",
            "",
            "",
            "",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\31",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | RULE_UPPERCASE_WORD | RULE_LOWERCASE_WORD | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_13 = input.LA(1);

                        s = -1;
                        if ( ((LA14_13>='\u0000' && LA14_13<='\uFFFF')) ) {s = 27;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_12 = input.LA(1);

                        s = -1;
                        if ( ((LA14_12>='\u0000' && LA14_12<='\uFFFF')) ) {s = 27;}

                        else s = 16;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0==':') ) {s = 1;}

                        else if ( (LA14_0=='U') ) {s = 2;}

                        else if ( (LA14_0==',') ) {s = 3;}

                        else if ( (LA14_0=='.') ) {s = 4;}

                        else if ( ((LA14_0>='A' && LA14_0<='T')||(LA14_0>='V' && LA14_0<='Z')) ) {s = 5;}

                        else if ( ((LA14_0>='a' && LA14_0<='z')) ) {s = 6;}

                        else if ( (LA14_0=='^') ) {s = 7;}

                        else if ( (LA14_0=='\u00C4'||LA14_0=='\u00D6'||LA14_0=='\u00DC') ) {s = 8;}

                        else if ( (LA14_0=='\u00DF'||LA14_0=='\u00E4'||LA14_0=='\u00F6'||LA14_0=='\u00FC') ) {s = 9;}

                        else if ( (LA14_0=='_') ) {s = 10;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 11;}

                        else if ( (LA14_0=='\"') ) {s = 12;}

                        else if ( (LA14_0=='\'') ) {s = 13;}

                        else if ( (LA14_0=='/') ) {s = 14;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 15;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='+')||LA14_0=='-'||(LA14_0>=';' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\u00C3')||(LA14_0>='\u00C5' && LA14_0<='\u00D5')||(LA14_0>='\u00D7' && LA14_0<='\u00DB')||(LA14_0>='\u00DD' && LA14_0<='\u00DE')||(LA14_0>='\u00E0' && LA14_0<='\u00E3')||(LA14_0>='\u00E5' && LA14_0<='\u00F5')||(LA14_0>='\u00F7' && LA14_0<='\u00FB')||(LA14_0>='\u00FD' && LA14_0<='\uFFFF')) ) {s = 16;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}