#include<stdio.h>
#include<stdlib.h>

int main()
{
	int i, T = 0, H = 0, W = 0, N = 0;
	scanf("%d", &T);
	int* l;
	l = (int*)malloc(sizeof(int) * T);
	for (i = 0; i < T; i++)
	{
		scanf("%d %d %d", &H, &W, &N);
		if (N % H == 0)
			l[i] = H * 100 + N / H;
		else
			l[i] = N % H * 100 + N / H + 1;
	}
	for (i = 0; i < T; i++)
	{
		printf("%d\n", l[i]);
	}
}