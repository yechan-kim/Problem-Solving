#include <stdio.h>

int main()
{
    int n = 0, j = 0, a = 0, b = 0, c = 0, d = 0, cnt = 0;
    scanf("%d", &j);
    for (n = 1; n <= j; n++)
    {
        a = n / 1000;
        b = (n - 1000 * a) / 100;
        c = n / 100;
        c = (n - 100 * c) / 10;
        d = n % 10;
        
        if (a > 0)
        {

        }
        else if (b > 0)
        {
            if (b - c == c - d)
            {
                cnt++;
            }
        }
        else
        {
            cnt++;
        }
    }
    printf("%d", cnt);
}