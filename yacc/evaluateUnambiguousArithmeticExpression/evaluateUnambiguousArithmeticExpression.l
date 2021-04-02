%{
    /* Definition section*/
    #include "y.tab.h"
    extern yylval;
%}
 
%%
[0-9]+ {
    yylval=atoi(yytext);
    return num;} //num is a token that will be identified by lex and given to the corresponding YACC file.

[a-zA-Z]+    { return id; }
[ \t]+         ;  /*For skipping whitespaces*/
 
\n            { return 0; }
.            { return yytext[0]; }
%%