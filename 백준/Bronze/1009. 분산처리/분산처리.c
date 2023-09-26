#include<stdio.h>
#include<stdlib.h>

int main()
{
	int i, a = 0, b = 0, T = 0;
	scanf("%d", &T);
	int* l;
	l = (int*)malloc(sizeof(int) * T);
	for (i = 0; i < T; i++)
	{
		scanf("%d %d", &a, &b);
		if (a % 10 == 1)
			l[i] = 1;
		if (a % 10 == 2)
		{
			if (b % 4 == 1)
				l[i] = 2;
			if (b % 4 == 2)
				l[i] = 4;
			if (b % 4 == 3)
				l[i] = 8;
			if (b % 4 == 0)
				l[i] = 6;
		}
		if (a % 10 == 3)
		{
			if (b % 4 == 1)
				l[i] = 3;
			if (b % 4 == 2)
				l[i] = 9;
			if (b % 4 == 3)
				l[i] = 7;
			if (b % 4 == 0)
				l[i] = 1;
		}
		if (a % 10 == 4)
		{
			if (b % 2 == 1)
				l[i] = 4;
			if (b % 2 == 0)
				l[i] = 6;
		}
		if (a % 10 == 5)
			l[i] = 5;
		if (a % 10 == 6)
			l[i] = 6;
		if (a % 10 == 7)
		{
			if (b % 4 == 1)
				l[i] = 7;
			if (b % 4 == 2)
				l[i] = 9;
			if (b % 4 == 3)
				l[i] = 3;
			if (b % 4 == 0)
				l[i] = 1;
		}
		if (a % 10 == 8)
		{
			if (b % 4 == 1)
				l[i] = 8;
			if (b % 4 == 2)
				l[i] = 4;
			if (b % 4 == 3)
				l[i] = 2;
			if (b % 4 == 0)
				l[i] = 6;
		}
		if (a % 10 == 9)
		{
			if (b % 2 == 1)
				l[i] = 9;
			if (b % 2 == 0)
				l[i] = 1;
		}
		if (a % 10 == 0)
			l[i] = 10;

	}
	for (i = 0; i < T; i++)
	{
		printf("%d\n", l[i]);
	}
}
