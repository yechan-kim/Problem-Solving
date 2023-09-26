#include <stdio.h>

int main()
{
    int n = 1, a = 0, b = 0, c = 0, d = 0, e = 0, T[10036] = { 0 };
    for (n = 1; n <= 10000; n++)
    {
        a = n / 10000;
        b = (n - 10000 * a) / 1000;
        c = n / 1000;
        c = (n - 1000 * c) / 100;
        d = n / 100;
        d = (n - 100 * d) / 10;
        e = n % 10;
        T[n + a + b + c + d + e]++;
    }
    for (n = 1; n <= 10000; n++)
    {
        if (T[n] == 0)
        {
            printf("%d\n", n);
        }
    }
}