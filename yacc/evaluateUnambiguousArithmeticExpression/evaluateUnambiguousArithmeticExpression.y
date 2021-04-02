// Write a Yacc program to evaluate unambiguous arithmetic expression.
// E → E+T | E-T | T
// T → T*F | T/F |F
// F → num

%{
    #include<stdio.h>
    #include<stdlib.h>
%}

%token num id
//setting the precedence and left associativity of operators
%left '+' '-'
%left '*' '/'

//rules section
%%
    S: E    {
                printf("Result: %d\n", $$);
                return 0;
             }
E:E'+'T      { $$ = $1 + $3; }
 |E'-'T       { $$ = $1 - $3; }
 |T             { $$ = $1; }
 ;          
T:T'*'F         { $$ = $1 * $3; }
 |T'/'F             { $$ = $1 / $3; }
 |F             { $$ = $1; }
 ;
F:num           { $$ = $1; }
 ;
%%

int main(){
    printf("enter the expression \n");
    yyparse();
}

//for printing the error messages
int yyerror(char *s){
    printf("\nExpress is invalid");
    exit(0);
}
