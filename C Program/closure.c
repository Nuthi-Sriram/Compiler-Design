#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

void main()
{
    char str[50];

    printf("\n\n Enter a string from keyboard :\n");
    printf("-----------------------------------\n");
    printf("Input the string : ");
    fgets(str, sizeof str, stdin);
    //a*
    // if(strlen(str) == 1){ // For accepting the lambda
    //     printf("\nThe string you entered is a a*: %s\n", str);
    // }
    if(str[0] == '\n'){
        printf("\nThe string you entered is a a*: %s\n", str);
    }
    if (str[0] == 'a' && str[strlen(str) - 2] == 'a')
    {
        bool flag = true;
        for (int i = 0; i < strlen(str) - 2; i++)
        {
            if (str[i] != 'a')
            {
                flag = false;
            }
        }
        if (flag)
        {
            printf("\nThe string you entered is a (a*): %s\n", str);
        }
    }
    else if (strlen(str) == 4)
    {
        if (str[0] == 'a' && str[1] == 'b' && str[2] == 'b')
        {
            printf("\nThe string you entered is a (abb): %s\n", str);
        }
    }
    else if (str[strlen(str) - 2] == 'b')
    {
        bool flag = true;
        int i = 0;
        for (i = 0; i < strlen(str) - 2; i++)
        {
            if (str[i] == 'b')
            {
                break;
            }
        }
        for (; i < strlen(str) - 2; i++)
        {
            if (str[i] == 'a')
            {
                flag = false;
            }
        }
        if (flag)
        {
            printf("\nThe string you entered is a (a*b+): %s\n", str);
        }
        else
        {
            printf("\nThe string you entered is not a valid a*b+: %s\n", str);
        }
    }
}
