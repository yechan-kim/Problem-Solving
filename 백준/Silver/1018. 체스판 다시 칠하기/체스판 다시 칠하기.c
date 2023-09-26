#include <stdio.h>

int i, j, a, b, N = 0, M = 0, A = 0, B = 0, cnt = 1000, cnt1 = 0, cnt2 = 0, cnta = 0, cntb = 0, cntc = 0, cntd = 0, tmpN = 0, tmpM = 0;
char chess[50][51];

int alpha(int tmpN, int tmpM, int A, int B)
{
    for (a = 0; a <= tmpN - 8; a++)
    {
        for (b = 0; b <= tmpM - 8; b++)
        {
            cnt1 = 0;
            cnt2 = 0;
            for (i = 0 + a; i < A + a; i++)
            {
                for (j = 0 + b; j < B + b; j++)
                {
                    if ((i + j) % 2 == 0)
                    {
                        if (chess[i][j] != 'W')
                            cnt1++;
                    }
                    if ((i + j) % 2 == 1)
                    {
                        if (chess[i][j] != 'B')
                            cnt1++;
                    }
                }
            }
            if (cnt > cnt1)
            {
                cnt = cnt1;
            }
            for (i = 0 + a; i < A + a; i++)
            {
                for (j = 0 + b; j < B + b; j++)
                {
                    if ((i + j) % 2 == 0)
                    {
                        if (chess[i][j] != 'B')
                            cnt2++;
                    }
                    if ((i + j) % 2 == 1)
                    {
                        if (chess[i][j] != 'W')
                            cnt2++;
                    }
                }
            }
            if (cnt > cnt2)
            {
                cnt = cnt2;
            }
        }
    }
}

int main()
{
    scanf("%d %d", &N, &M);
    for (i = 0; i < N; i++)
    {
        scanf("%s", &chess[i][0]);
    }

    alpha(N, M, 8, 8);
    cnta = cnt;
    alpha(N, 8, 8, M);
    cntb = cnt;
    alpha(8, M, N, 8);
    cntc = cnt;
    alpha(8, 8, N, M);
    cntd = cnt;
    if (cnt > cnta)
        cnt = cnta;
    if (cnt > cntb)
        cnt = cntb;
    if (cnt > cntc)
        cnt = cntc;
    if (cnt > cntd)
        cnt = cntd;
    printf("%d", cnt);
}