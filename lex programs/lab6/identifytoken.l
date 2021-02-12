/** Write a lex program to identify the following tokens:
/*a. Header file
/*e. Multi-line comments
/*i. Digits
/*b. Keywords
/*f. identifiers
/*c. Relational Operators
/*g. Preprocessor Directive
/*d. Single Line Comment
/*h. Data Types*/


%{
#include<stdio.h>
#include<stdlib.h>
%}
digit[0-9]
letter[a-z]
id [a - z A - Z _][a - z A - Z 0 - 9 _]*

%%
if|then|begin|end|procedure|function|for {printf("A keyword %s\n", yytext);}

"void"|"int"|"float"|"double"|"char"|"unsigned int"|"short int"|"unsigned short int"|"long int"|"unsigned long int"|"long double"|"unsigned char" {printf("A datatype \n");}

{id} {printf("An identifier \n");}

{digit}+ {printf("An integer \n");}

{digit}+"."{digit}* {printf("A float point %s\n", yytext);}


"<="|">="|"=="|"!="|"<"|">" {printf("A realtional operator %s\n", yytext);}

#.* { printf("'%s' preproc\n", yytext); }

#include[<]([^>]+)[>]$ {printf("A header file %s\n", yytext);}

[/][/].*[^\n] {printf("Single Line Comment\n");}

[/]{1}[*]{1}[a-zA-Z0-9]*[*]{1}[/]{1} printf("MultiLine Comment");

%%

int main(){
    yylex();

    return 0;
}






