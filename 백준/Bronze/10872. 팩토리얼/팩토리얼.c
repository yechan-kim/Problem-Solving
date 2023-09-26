#include<stdio.h>
#include<stdlib.h>

int main()
{
	int i, T = 1, N = 0;
	scanf("%d", &N);
	for (i = 1; i <= N; i++)
		T *= i;
	printf("%d", T);
}