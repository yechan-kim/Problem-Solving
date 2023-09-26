#include<stdio.h>

int main()
{
    int i, n = 0, sum = 0;
    scanf("%d", &n);
    for (i = 1; i <= n; i++)
    {
        sum += i;
    }
    printf("%d", sum);
}