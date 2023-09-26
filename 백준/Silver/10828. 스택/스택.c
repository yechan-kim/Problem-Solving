#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define MAX_SIZE 10000

typedef struct
{
    int arr[MAX_SIZE];
    int top;
} stack;

void push(int X, stack *s);
void pop(stack *s);
void size(stack *s);
int empty(stack *s);
void empty_f(stack *s);
void top(stack *s);

int main()
{
    stack *s = (stack *)malloc(sizeof(stack));
    s->top = -1;

    int N, num;
    char opt[6];

    scanf("%d", &N);

    for (int i = 0; i < N; i++)
    {

        scanf("%s", opt);

        if (strcmp(opt, "push") == 0)
        {
            scanf("%d", &num);
            push(num, s);
        }

        else if (strcmp(opt, "pop") == 0)
            pop(s);

        else if (strcmp(opt, "size") == 0)
            size(s);

        else if (strcmp(opt, "empty") == 0)
            empty_f(s);

        else if (strcmp(opt, "top") == 0)
            top(s);
    }

    free(s);

    return 0;
}

void push(int X, stack *s)
{
    s->arr[++(s->top)] = X;
}

void pop(stack *s)
{
    if (empty(s))
        printf("%d\n", -1);
    else
        printf("%d\n", s->arr[(s->top)--]);
}

void size(stack *s)
{
    printf("%d\n", (s->top) + 1);
}

int empty(stack *s)
{
    return (s->top == -1);
}

void empty_f(stack *s)
{
    printf("%d\n", s->top == -1);
}

void top(stack *s)
{
    if (empty(s))
        printf("%d\n", -1);
    else
        printf("%d\n", s->arr[(s->top)]);
}