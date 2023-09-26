#include<stdio.h>
#include<stdlib.h>

int main()
{
	int i, n = 0;
	scanf("%d", &n);
	int* l;
	l = (int*)malloc(sizeof(int) * n+1);
	l[0] = 0;
	l[1] = 1;
	for (i = 2; i <= n; i++)
	{
		l[i] = l[i - 1] + l[i - 2];
	}
	printf("%d", l[n]);
}