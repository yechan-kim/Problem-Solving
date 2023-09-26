#include<stdio.h>

int main()
{
	int A = 0, B = 0, C = 0, time = 0;
	scanf("%d", &time);
	if (time % 10 != 0)
		printf("-1");
	else
	{
		C = time / 10;
		B = C / 6;
		C = C % 6;
		A = B / 5;
		B = B % 5;
		printf("%d %d %d", A, B, C);
	}
}
