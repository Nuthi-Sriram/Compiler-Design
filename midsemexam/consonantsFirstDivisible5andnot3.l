/*Write a lex program to recognize and maintain the count for all the input lines that begin with consonants. Also, recognize the integer numbers that are divisible by 3 but not by 5.*/
/*[Input should be from the file and output to be displayed in the terminal]*/
%{
    #include <stdio.h>
    #include <stdlib.h>
    #include <stdbool.h>
    int checker=0;
    int num_lines=0;
    int i;
    char ch;
%}

%%

\n  {++num_lines; printf("%d \n", num_lines);};
[0-9]+	 {i=atoi(yytext); /*askii to integer function by default input stored in yytext*/
		if(i%3==0 && i%5!=0) 
			printf("\nThe given number %d is divisible by 3 and not by 5\n", i); 
        else
            printf("\nThe given number %d is either not divisible by three or it is divisible by 5\n", i);
		}





%%

int main(void){
    yyin=fopen("ConsonantsandFiveTextFile.txt","r");
    yylex();
    
    return 0;
}