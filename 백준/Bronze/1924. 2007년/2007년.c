#include <stdio.h>

int main()
{
    int x = 0, y = 0;
    scanf("%d %d", &x, &y);
    if (x == 1)
        y += 0;
    else if (x == 2)
        y += 31;
    else if (x == 3)
        y += 59;
    else if (x == 4)
        y += 90;
    else if (x == 5)
        y += 120;
    else if (x == 6)
        y += 151;
    else if (x == 7)
        y += 181;
    else if (x == 8)
        y += 212;
    else if (x == 9)
        y += 243;
    else if (x == 10)
        y += 273;
    else if (x == 11)
        y += 304;
    else if (x == 12)
        y += 334;

    if (y % 7 == 0)
        printf("SUN");
    else if (y % 7 == 1)
        printf("MON");
    else if (y % 7 == 2)
        printf("TUE");
    else if (y % 7 == 3)
        printf("WED");
    else if (y % 7 == 4)
        printf("THU");
    else if (y % 7 == 5)
        printf("FRI");
    else if (y % 7 == 6)
        printf("SAT");
}