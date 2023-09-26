#include<stdio.h>

int main()
{
	int i, j, burger[3] = { 0 }, drink[2] = { 0 }, min = 0;
	for (i = 0; i < 3; i++)
	{
		scanf("%d", &burger[i]);
	}
	for (i = 0; i < 2; i++)
	{
		scanf("%d", &drink[i]);
	}
	min = burger[0] + drink[0];
	for (i = 0; i < 3; i++)
	{
		for (j = 0; j < 2; j++)
		{
			if (min > burger[i] + drink[j])
				min = burger[i] + drink[j];
		}
	}
	printf("%d", min - 50);
}
