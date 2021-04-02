// 2. Write a Yacc program to validate the ambiguous arithmetic expression.
// E →E+E | E-E |E*E |E/E |(E) | id | num

%{
    #include<stdio.h>
    #include<stdlib.h>
%}

//definition section

%token num  id      //token from the lex file
%left '+' '-'               //left associative
%left '*' '/'           
%%

E:E'+'E
 |E'-'E
 |E'*'E
 |E'/'E
 |'('E')'
 |id
 |num
 ;

%%

int main(){
    printf("Enter an expression\n");
    yyparse();
    printf("\n Expression is valid");
    return 0;
}

//if error occurred making use of the inbuilt library
int yyerror(char *s){
    printf("\n Expressoin is invalid");
    exit(0);
}