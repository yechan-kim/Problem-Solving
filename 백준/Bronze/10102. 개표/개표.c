#include <stdio.h>

int main()
{
    int V, i, cnta = 0, cntb = 0;
    char vote;

    scanf("%d", &V);
    for (i = 0; i <= V; i++)
    {
        scanf("%c", &vote);
        if (vote == 'A')
            cnta++;
        else if (vote == 'B')
            cntb++;
    }

    if (cnta == cntb)
        printf("Tie");
    else if (cnta > cntb)
        printf("A");
    else if (cntb > cnta)
        printf("B");

    return 0;
}