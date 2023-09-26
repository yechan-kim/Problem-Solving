#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i, j, m, T = 0, l[15][15] = {0};
    scanf("%d", &T);
    int *k;
    int *n;
    k = (int *)malloc(sizeof(int) * T);
    n = (int *)malloc(sizeof(int) * T);
    for (i = 0; i < T; i++)
    {
        scanf("%d %d", &k[i], &n[i]);
    }
    for (i = 0; i < T; i++)
    {
        for (j = 1; j <= k[i]; j++)
        {
            l[1][j] = 1;
        }
        for (m = 1; m <= n[i]; m++)
        {
            l[m][0] = m;
        }
        for (j = 1; j <= k[i]; j++)
        {
            for (m = 1; m <= n[i]; m++)
            {
                l[m][j] = l[m - 1][j] + l[m][j - 1];
            }
        }
    }
    for (i = 0; i < T; i++)
        printf("%d\n", l[n[i]][k[i]]);
}