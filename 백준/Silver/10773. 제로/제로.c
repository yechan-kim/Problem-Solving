#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define MAX_SIZE 100000

typedef struct
{
    int arr[MAX_SIZE];
    int top;
} stack;

void push(int X, stack *s);
void peek(stack *s);

int main()
{
    stack *s = (stack *)malloc(sizeof(stack));
    s->top = -1;

    int K, num, sum = 0;

    scanf("%d", &K);

    for (int i = 0; i < K; i++)
    {
        scanf("%d", &num);

        if (num == 0)
            peek(s);
        else
            push(num, s);
    }

    for (int i = 0; i < (s->top) + 1; i++)
        sum += s->arr[i];

    printf("%d", sum);

    free(s);

    return 0;
}

void push(int X, stack *s)
{
    s->arr[++(s->top)] = X;
}

void peek(stack *s)
{
    s->arr[(s->top)--];
}