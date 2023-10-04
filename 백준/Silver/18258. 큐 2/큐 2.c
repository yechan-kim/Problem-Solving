#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct queue
{
    int arr[2000000];
    int front;
    int rear;
} queue;

void push(int X, queue *q);
void pop(queue *q);
void size(queue *q);
int empty(queue *q);
void empty_f(queue *q);
void front(queue *q);
void back(queue *q);

int main()
{
    queue *q = (queue *)malloc(sizeof(queue));
    q->front = 0;
    q->rear = 0;

    int N, num;
    char opt[6];

    scanf("%d", &N);

    for (int i = 0; i < N; i++)
    {

        scanf("%s", opt);

        if (strcmp(opt, "push") == 0)
        {
            scanf("%d", &num);
            push(num, q);
        }

        else if (strcmp(opt, "pop") == 0)
            pop(q);

        else if (strcmp(opt, "size") == 0)
            size(q);

        else if (strcmp(opt, "empty") == 0)
            empty_f(q);

        else if (strcmp(opt, "front") == 0)
            front(q);

        else if (strcmp(opt, "back") == 0)
            back(q);
    }

    free(q);

    return 0;
}

void push(int X, queue *q)
{
    if (q->rear == 2000000)
        return;
    else
    {
        q->arr[q->rear] = X;
        q->rear++;
    }
}

void pop(queue *q)
{
    if (empty(q))
        printf("-1\n");

    else
    {
        printf("%d\n", q->arr[q->front]);
        (q->front)++;
    }
}

void size(queue *q)
{
    printf("%d\n", q->rear - q->front);
}

int empty(queue *q)
{
    if (q->front == q->rear)
        return 1;

    else
        return 0;
}

void empty_f(queue *q)
{
    if (empty(q))
        printf("1\n");

    else
        printf("0\n");
}

void front(queue *q)
{
    if (empty(q))
        printf("-1\n");

    else
        printf("%d\n", q->arr[q->front]);
}

void back(queue *q)
{
    if (empty(q))
        printf("-1\n");

    else
        printf("%d\n", q->arr[q->rear - 1]);
}