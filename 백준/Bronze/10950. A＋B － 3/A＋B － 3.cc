#include <iostream>

using namespace std;

int main()
{
    int i, A, B, T = 0;
    cin >> T;
    for (i = 0; i < T; i++)
    {
        cin >> A >> B;
        cout << A + B << endl;
    }
    return 0;
}