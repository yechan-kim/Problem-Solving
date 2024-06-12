#include <stdio.h>

int main()
{
    int T, N;
    scanf("%d",&T);
    
    for(int i=0; i<T; i++)
    {
        scanf("%d",&N);
        printf("#%d %d\n",i+1,N/3);
    }
    
    return 0;
}