#include <iostream>
#include <vector>
using namespace std;

int main() {
    int T;
    cin >> T;  

    while (T--) {
        int n;
        cin >> n; 

        vector<int> arr(n);
        for (int i = 0; i < n; i++) {
            cin >> arr[i];  
        }

        
        cout << "Array: ";
        for (int num : arr) {
            cout << num << " ";
        }
        cout << endl;
    }

    return 0;
}
