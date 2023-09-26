#include <stdio.h>

int main()
{
    int base[101][101] = {0};
    int i, j, k, a = 0, b = 0, c = 0, cnt = 0;
    scanf("%d", &c);
    for (i = 0; i < c; i++)
    {
        scanf("%d %d", &a, &b);
        for (j = a; j < a + 10; j++)
        {
            if (a > 100)
                break;
            for (k = b; k < b + 10; k++)
            {
                if (b > 100)
                    break;
                base[j][k] = 1;
            }
        }
    }
    for (i = 0; i < 101; i++)
    {
        for (j = 0; j < 101; j++)
        {
            if (base[i][j] == 1)
                cnt++;
        }
    }
    printf("%d", cnt);
}