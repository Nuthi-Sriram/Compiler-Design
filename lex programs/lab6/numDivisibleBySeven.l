/*Write a lex program to find whether a given number is divisible by 7 or not.*/
%{ 
int i; 
%} 

%% 

[0-9]+	 {i=atoi(yytext); /*askii to integer function by default input stored in yytext*/
		if(i%7==0) 
			printf("The given number %d is divisible by seven", i); 
        else
            printf("The given number %d is not divisible by seven", i);
		}
%% 

int yywrap(){} 

int main() 
{ 
    printf("Enter a number\n");
	yylex(); 
	return 0; 
} 
