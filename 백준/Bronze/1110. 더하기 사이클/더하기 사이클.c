#include<stdio.h>

int main()
{
    int N = 0, T = 0, a = 0, b = 0, c = 0, cnt = 0;
    scanf("%d", &N);
    T = N;
    while (1)
    {
        a = N / 10;
        b = N % 10;
        c = (a + b) % 10;
        N = 10 * b + c;
        cnt++;
        if (N == T)
            break;
    }
    printf("%d", cnt);
}