#include <stdio.h>

int main()
{
    int i, j, N = 0, tmp = 0, a[1001] = {0};

    scanf("%d", &N);

    for (i = 0; i < N; i++)
    {
        scanf("%d", &a[i]);
    }

    for (i = 0; i < N - 1; i++)
    {
        for (j = i + 1; j < N; j++)
        {
            if (a[i] > a[j])
            {
                tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }
    }

    for (i = 0; i < N; i++)
    {
        printf("%d\n", a[i]);
    }
}
