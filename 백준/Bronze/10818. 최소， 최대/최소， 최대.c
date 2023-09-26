#include <stdio.h>

int main()
{
    int i, N, a, max, min;

    scanf("%d\n", &N);
    scanf("%d", &a);
    max = a;
    min = a;
    for (i = 0; i < N - 1; i++)
    {
        scanf("%d", &a);
        if (a > max)
            max = a;
        else if (a < min)
            min = a;
    }
    printf("%d %d", min, max);

    return 0;
}