#include <stdio.h>
#include <string.h>

int main()
{
    int T;

    scanf("%d", &T);

    for (int i = 0; i < T; i++)
    {
        int cnt = 0;
        char arr_c[50];

        scanf("%s", arr_c);
        int len = strlen(arr_c);

        for (int j = 0; j < len; j++)
        {
            if (arr_c[j] == '(')
                cnt++;
            else if (arr_c[j] == ')')
                cnt--;
            if (cnt < 0)
                break;
        }
        if (cnt != 0)
            printf("NO\n");
        else
            printf("YES\n");
    }

    return 0;
}