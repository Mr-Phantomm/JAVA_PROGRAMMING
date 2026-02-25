#include <iostream>
#include <queue>
#include <vector>

using namespace std;

// Equivalent to the Java Node class
struct Node {
    int freq;
    int value;

    Node(int f, int v) : freq(f), value(v) {}
};

// Comparator: returns true if 'a' has lower priority than 'b'
// This creates a Max-Heap based on the 'value' field
struct CompareNodes {
    bool operator()(const Node& a, const Node& b) {
        return a.value < b.value; 
    }
};

int main() {
    // Standard I/O optimization
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int N, containers;
    if (!(cin >> N >> containers)) return 0;

    // Declaring the Priority Queue
    priority_queue<Node, vector<Node>, CompareNodes> pq;

    for (int i = 0; i < containers; i++) {
        int a, b;
        cin >> a >> b;
        pq.push(Node(a, b));
    }

    int ans = 0;
    while (N > 0 && !pq.empty()) {
        Node curr = pq.top(); // Java's poll() is split into top() and pop()
        pq.pop();

        if (N >= curr.freq) {
            ans += curr.freq * curr.value;
            N -= curr.freq;
        } else {
            ans += N * curr.value;
            N = 0; // Explicitly break or set to 0
            break;
        }
    }

    cout << ans << endl;

    return 0;
}
