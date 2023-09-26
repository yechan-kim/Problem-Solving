#include <iostream>

using namespace std;

int main()
{
    int i, n = 0, sum = 0;

    cin >> n;
    for (i = 1; i <= n; i++)
        sum += i;
    cout << sum << endl;

    return 0;
}