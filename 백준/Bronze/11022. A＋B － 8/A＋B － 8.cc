#include <iostream>

using namespace std;

int main()
{
    int i, A, B, T = 0;

    cin >> T;

    for (i = 1; i <= T; i++)
    {
        cin >> A >> B;
        cout << "Case #" << i << ": " << A << " + " << B << " = " << A + B << endl;
    }

    return 0;
}