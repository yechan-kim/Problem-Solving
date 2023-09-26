#include <stdio.h>

int main()
{
    int A, B, C;

    scanf("%d %d",&A,&B);
    scanf("%d",&C);

    B += C;

    if (B >= 60)
    {
        A += B / 60;
        B %= 60;
    }

    if (A >= 24)
        A %= 24;

    printf("%d %d",A,B);

    return 0;
}