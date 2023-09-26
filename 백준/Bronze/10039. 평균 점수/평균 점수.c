#include<stdio.h>

int main()
{
    int i, score[5] = { 0 }, sum = 0, avg = 0;
    for (i = 0; i < 5; i++)
    {
        scanf("%d", &score[i]);
        if (score[i] < 40)
            score[i] = 40;
        sum += score[i];
    }
    avg = sum / 5;
    printf("%d", avg);
}