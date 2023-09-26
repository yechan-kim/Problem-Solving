#include <stdio.h>

int main()
{
    int i, j, N = 0, tmp = 0;
    scanf("%d", &N);
    tmp = N;
    for (i = 0; i < N; i++)
    {
        for (j = 0; j < N; j++)
            if (N == j * 5 + i * 3)
            {
                if (tmp > j + i)
                    tmp = j + i;
            }
    }
    if (tmp == N)
        printf("-1");
    else
        printf("%d", tmp);
}