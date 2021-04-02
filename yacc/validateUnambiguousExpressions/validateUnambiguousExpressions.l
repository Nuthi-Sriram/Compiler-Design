%{
    #include"y.tab.h"
    // comment we need not write #include<stdio.h> here as we are
//not using any printf statement.
%}

/*definted section*/

%%
[0-9]+ {return num;} //num is a token that will be identified by lex and given to the corresponding YACC file.
                    

. {return yytext[0];}
%%