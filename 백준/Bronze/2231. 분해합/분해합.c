#include <stdio.h>

int main()
{
    int i, N = 0;
    scanf("%d", &N);
    for (i = 1; i <= N; i++)
    {
        if (N == i + i / 1000000 + i / 100000 - i / 1000000 * 10 + i / 10000 - i / 100000 * 10 + i / 1000 - i / 10000 * 10 + i / 100 - i / 1000 * 10 + i / 10 - i / 100 * 10 + i % 10)
        {
            printf("%d", i);
            break;
        }
        if (i == N)
            printf("0");
    }
}