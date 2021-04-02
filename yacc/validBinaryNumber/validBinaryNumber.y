// Write a Yacc program to check whether the given binary number is a valid number or not.
%{
#include<stdio.h>
#include<stdlib.h>
int flag;
int rem;
int temp;
%}

%token num

%%

S:E{
    flag=1;
    temp=num;
    printf("%d \n",num);
    while(temp!=0){
        rem=temp%10;
        // printf("%d+ val",rem);
        if(rem >1 || rem < 0){
            printf("test");
            flag=0;
        }
        temp=temp/10;
        
    }
    
    if(flag == 0){
        printf("\nNot a valid binary expression\n");
    }else{
        printf("Valid binary expression\n");
    }
    return 0;
}

E:num   { $$ = $1; }


%%

int main(){
    printf("enter the number:");
    yyparse();
}

int yyerror(){
    printf("Not a valid input");
    exit(1);
}