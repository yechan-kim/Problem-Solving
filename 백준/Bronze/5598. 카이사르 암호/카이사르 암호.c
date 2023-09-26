#include <stdio.h>

int main()
{
    int i;
    char c[1001];
    scanf("%s", c);
    for (i = 0; i <= 1000; i++)
    {
        if (c[i] == 0)
            break;
        else
        {
            if (c[i] == 'A')
                c[i] = 'X';
            else if (c[i] == 'B')
                c[i] = 'Y';
            else if (c[i] == 'C')
                c[i] = 'Z';
            else
                c[i] -= 3;
        }
    }
    printf("%s", c);
}