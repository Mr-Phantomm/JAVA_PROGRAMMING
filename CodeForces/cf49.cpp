#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    int m, n;
    cin >> m >> n;

    vector<pair<int, int>> arr(n);
    for (int i = 0; i < n; ++i) {
        cin >> arr[i].first >> arr[i].second;
    }

    // Sort by second element in descending order
    sort(arr.begin(), arr.end(), [](pair<int, int> a, pair<int, int> b) {
        return b.second < a.second;
    });

    int ans = 0;
    int i = 0;
    while (m > 0 && i < n) {
        if (arr[i].first == m) {
            ans += arr[i].first * arr[i].second;
            m = 0;
        } else if (arr[i].first > m) {
            ans += m * arr[i].second;
            m = 0;
        } else {
            ans += arr[i].first * arr[i].second;
            m -= arr[i].first;
            ++i;
        }
    }

    cout << ans << endl;
    return 0;
}