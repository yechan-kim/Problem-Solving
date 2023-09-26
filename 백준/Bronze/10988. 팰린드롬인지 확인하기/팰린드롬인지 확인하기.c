#include <stdio.h>
#include <stdlib.h>

int main()
{
    char c[100], tmp[100];
    int i, j, a = 0;
    scanf("%s", c);
    for (i = 0; i < 100; i++)
    {
        if (c[i] == 0)
        {
            a = i - 1;
            break;
        }   
    }
    for (i = 0; i <= a; i++)
    {
        tmp[a - i] = c[i];
    }
    for (i = 0; i <= a; i++)
    {
        if (c[i] != tmp[i])
        {
            printf("0");
            exit(0);
        }
    }
    printf("1");
}