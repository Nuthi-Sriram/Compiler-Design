%{
    #include"y.tab.h"
    #include<stdlib.h>
%}

/*definted section*/

%%
[0-9]+ {yylval=atoi(yytext); return num;}   //to send yacc as token integer
[a-zA-Z]+ {return id;}                      //to send the integer as a token integer
[\t]+ ;
\n {return 0;}
. {return yytext[0];}
%%