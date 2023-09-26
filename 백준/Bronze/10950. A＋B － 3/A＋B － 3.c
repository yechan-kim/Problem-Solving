#include<stdio.h>

int main()
{
    int i, A, B, T = 0;
    scanf("%d", &T);
    for (i = 0; i < T; i++)
    {
        scanf("%d %d", &A, &B);
        printf("%d\n", A + B);
    }
}