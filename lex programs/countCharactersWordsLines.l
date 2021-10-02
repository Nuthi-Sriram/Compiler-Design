/*Write a lex program to count the number of characters, words, and lines.*/
%{
    int num_lines=0,num_char=0,num_words=0;
%}
%%
\n {++num_lines,++num_char;}
[^ \n\t]+ {++num_words, num_char+=yyleng;}
.  {++num_char;}
-1 return 0;    //for terminating using -1 in the terminal
%%
int wwrap(){
    return 1;
}
int main(void){
    yylex();
    printf("No. of lines = %d \nNo.of characters = %d\nNo. of words: = %d",num_lines,num_char,num_words);
}