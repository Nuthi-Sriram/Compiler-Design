/*Write a lex program to count the number of words from a given text (line).*/
%{ 
int num_words = 0; 
%} 
  
%% 
([a-zA-Z0-9])*    {num_words++;} 
  
"\n" {printf("%d\n", num_words); num_words = 0;} 
%% 
  
int yywrap(void){} 
  
int main() 
{    
    // The function that starts the analysis 
    yylex(); 
  
    return 0; 
} 