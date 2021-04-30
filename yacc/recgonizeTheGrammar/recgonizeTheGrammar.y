// YACC program to recognize the given grammar.  Assume that ^ is subtraction operation 
//and @ is the division operation and evaluate the valid expressions. 
//If not valid, display as invalid expression.


//             A → A ^ B | B

//             B → B @ D | ++D | D

//             D → num

%{
    #include<stdio.h>
    #include<stdlib.h>
%}

%token num 
%left '@' '^'

//rules section
%%
    S: A    {
                printf("Result: %d\n", $$);
                return 0;
             }
A:A'^'B      { $$ = $1 - $3; }
 |B             { $$ = $1; }
 ;          
B:B'@'D         { $$ = $1 / $3; }
 |'+''+'D             { $$ = 1 + $3; }
 |D             { $$ = $1; }
 ;
D:num           { $$ = $1; }
 ;
%%

int main(){
    printf("enter the expression \n");
    yyparse();
}


int yyerror(char *s){
    printf("\nExpression is invalid");
    exit(0);
}
