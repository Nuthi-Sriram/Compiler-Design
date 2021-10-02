%{
    #include<stdio.h>
    #include<stdlib.h>
%}

DIGIT {0-9}
letter {a-zA-Z}
ID {a-zA-Z}{a-zA-Z0-9}*

%%
if|then|begin|end|procedure|function|for {printf("A keyword: %s\n", yytext);}
int|float|double|char {printf("A data types: %s\n", yytext);}
{ID} {printf("An identifier: %s\n", yytext);}

