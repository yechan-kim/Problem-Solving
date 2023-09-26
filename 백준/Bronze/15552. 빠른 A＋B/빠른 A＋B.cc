#include <iostream>

using namespace std;

int main()
{
    cin.tie(NULL);
    cout.tie(NULL);
    ios::sync_with_stdio(false);

    int i, A, B, T = 0;

    cin >> T;

    for (i = 0; i < T; i++)
    {
        cin >> A >> B;
        cout << A + B << "\n";
    }

    return 0;
}