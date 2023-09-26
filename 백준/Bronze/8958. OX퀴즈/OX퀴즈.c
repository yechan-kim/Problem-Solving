#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i, j, N = 0, cnt = 0, score = 0;
    scanf("%d", &N);
    int *a;
    a = (int *)malloc(sizeof(int) * N);
    for (i = 0; i < N; i++)
    {
        char c[81];
        scanf("%s", c);
        for (j = 0; j < 81; j++)
        {
            if (c[j] == 'O')
            {
                cnt++;
                score += cnt;
            }
            else if (c[j] == 'X')
            {
                cnt = 0;
            }
            else if (c[j] == 0)
                break;
        }
        a[i] = score;
        score = 0;
        cnt = 0;
    }
    for (i = 0; i < N; i++)
    {
        printf("%d\n", a[i]);
    }
}