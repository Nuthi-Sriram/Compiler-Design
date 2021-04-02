%{
    #include"y.tab.h"
    #include<stdlib.h>
    #include<stdio.h>
    extern yylval;
    // printf("%d test\n",atoi(yytext));
    // cool=atoi(yytext);
    // printf("%d number\n",cool);
%}

%%
[0-9]+ {
    yylval=atoi(yytext); 
    return num;}

[\t]+ ;
\n {return 0;}
. {return yytext[0];}
%%