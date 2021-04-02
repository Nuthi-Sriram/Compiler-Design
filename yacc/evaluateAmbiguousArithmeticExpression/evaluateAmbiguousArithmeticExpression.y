// Write a Yacc program to evaluate ambiguous arithmetic expression.
// E →E+E | E-E |E*E |E/E |(E) | num

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
 E:E'+'E       { $$ = $1 + $3; }
 |E'-'E      { $$ = $1 - $3; }
 |E'*'E      { $$ = $1 * $3; }
 |E'/'E      { $$ = $1 / $3; }
 |'('E')'        { $$ = $2; }
 |id             { $$ = $1; }
 |num            { $$ = $1; }
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
