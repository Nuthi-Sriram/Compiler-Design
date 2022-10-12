/*Write a lex program to display the words entered by using ECHO.*/
%%
.  ECHO; //match anything except the new line
\n ECHO; //match the new line
%%

int yywrap(void){
    return 1;
}

int main(void){
    yylex();
    return 0;
}
