#include<stdio.h>
#include<stdlib.h>

int main()
{
	int i, F = 0;
	int N = 0, tmp = 0;
	scanf("%d %d", &N, &F);
	N = N - N % 100;
	tmp = N;
	while (1)
	{
		if (N % F == 0)
		{
			printf("%02d", N - tmp);
			break;
		}
		else
			N++;
	}
}