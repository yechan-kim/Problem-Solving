#include<stdio.h>

int main()
{
    int i, N = 0, X = 0, a[10001] = { 0 };
    scanf("%d %d", &N, &X);
    for (i = 1; i <= N; i++)
    {
        scanf("%d", &a[i]);
    }
    for (i = 1; i <= N; i++)
    {
        if (a[i] < X)
            printf("%d ", a[i]);
    }

}