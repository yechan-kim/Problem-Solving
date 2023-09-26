#include <stdio.h>

int main()
{
    int i, j, N = 0, C = 0, cnt = 0, cnt1 = 0, A[101] = {0};
    scanf("%d %d", &N, &C);
    for (i = 1; i <= N; i++)
    {
        scanf("%d", &A[i]);
    }
    for (i = 1; i <= C; i++)
    {
        for (j = 1; j <= N; j++)
        {
            if (i % A[j] == 0)
                cnt1 = 1;
        }
        if (cnt1 == 1)
        {
            cnt++;
            cnt1 = 0;
        }
    }
    printf("%d", cnt);
}