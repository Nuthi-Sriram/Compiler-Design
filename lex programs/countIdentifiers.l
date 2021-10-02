/*Write a lex program to count the number of identifiers by setting the macros (digits, letters)*/

digit[0-9]
letter[a-zA-Z]
%{
    int count;
%}
%%
{letter}({letter}|{digit})* count++;
%%
int main(void){
    yylex();
    printf("The number of identifiers is %d\n", count);
    return 0;
}
