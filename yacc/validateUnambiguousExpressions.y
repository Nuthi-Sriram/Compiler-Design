// 1. Write a Yacc program to validate the unambiguous arithmetic expression.
// E → E+T | E-T | T
// T → T*F | T/F |F
// F → num

%{
    #include<stdio.h>
    #include<stdlib.h>
%}

//definition section

%token num        //token from the lex file
%left '+' '-'               //left associative
%left '*' '/'           
%%

E:E'+'T
 |E'-'T
 |T
 ;
T:T'*'F
 |T'/'F
 |F
 ;
F:num
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