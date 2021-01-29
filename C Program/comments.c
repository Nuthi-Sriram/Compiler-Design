#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
bool isDelimiter(char ch)
{
    if (ch == ' ' || ch == '+' || ch == '-' || ch == '*' ||
        ch == '/' || ch == ',' || ch == ';' || ch == '>' ||
        ch == '<' || ch == '=' || ch == '(' || ch == ')' ||
        ch == '[' || ch == ']' || ch == '{' || ch == '}')
        return (true);
    return (false);
}

bool validIdentifier(char *str)
{
    if (str[0] == '0' || str[0] == '1' || str[0] == '2' ||
        str[0] == '3' || str[0] == '4' || str[0] == '5' ||
        str[0] == '6' || str[0] == '7' || str[0] == '8' ||
        str[0] == '9' || isDelimiter(str[0]) == true)
        return (false);
    return (true);
}
void main()
{
    char str[50];

    printf("\n\n Enter a string from keyboard :\n");
    printf("-----------------------------------\n");
    printf("Input the string : ");
    fgets(str, sizeof str, stdin);
    if (str[0] == '/' && str[1] == '/')
    {
        printf("\nThe string you entered is a singleline comment: %s\n", str);
    }
    else if (str[0] == '/' && str[1] == '*' && str[strlen(str) - 3] == '*' && str[strlen(str) - 2] == '/')
    {
        printf("\nThe string you entered is a multiline comment: %s\n", str);
    }
    else if (validIdentifier(str) == true && isDelimiter(str[strlen(str) - 1]) == false)
    {
        printf("\nThe string you entered is a valid identifier: %s\n", str);
    }
    //a*
    else if(str[0] == 'a' && str[strlen(str)]-2 == 'a'){
        bool flag='true';
        for(int i=0;i<strlen(str);i++){
            if(str[i] != 'a'){
                flag=false;
            }
        }
        if(flag){
            printf("\nThe string you entered is a a*: %s\n", str);
        }
    }
}
