#include<stdio.h>
#include <stdlib.h>

int compare(void* first, void* second)
{
    if (*(int*)first > * (int*)second)
        return 1;
    else if (*(int*)first < *(int*)second)
        return -1;
    else
        return 0;
}

int main()
{
    int i, j, N = 0, tmp = 0;
    scanf("%d", &N);
    int* a;
    a = (int*)malloc(sizeof(int) * N);
    for (i = 0; i < N; i++)
    {
        scanf("%d", &a[i]);
    }
    qsort(a, N, sizeof(int), compare);
    for (i = 0; i < N; i++)
    {
        printf("%d\n", a[i]);
    }
}