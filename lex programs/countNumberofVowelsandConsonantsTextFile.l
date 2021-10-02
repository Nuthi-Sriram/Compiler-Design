%{
    int const_count;
    int vowel_count;
%}

%%
[aeiouAEIOU] {++vowel_count;}
[a-zA-Z] {++const_count;}
%%

int main(void){
    yyin=fopen("vowelsConsonantsTextFile.txt","r");
    yylex();
    printf("The number of vowels are:%d\n",vowel_count);
    printf("The number of consonants are:%d\n",const_count);
    return 0;
}