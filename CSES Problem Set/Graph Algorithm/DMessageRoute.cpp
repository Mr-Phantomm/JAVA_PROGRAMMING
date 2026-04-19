#include <bits/stdc++.h>
using namespace std;

void fillStack(vector<int>& parent, stack<int>& st) {
    int i = parent.size() - 1;
    while (i != 0) {
        st.push(i);
        i = parent[i];
    }
    st.push(0);
}

void bfs(vector<vector<int>>& graph) {
    queue<int> q;
    q.push(0);
    vector<bool> visited(graph.size(), false);
    vector<int> parent(graph.size(), -1);
    parent[0] = 0;

    while (!q.empty()) {
        int curr = q.front();
        q.pop();
        if (curr == graph.size() - 1) break;

        for (int a : graph[curr]) {
            if (parent[curr] == a) continue;
            if (!visited[a]) {
                visited[a] = true;
                parent[a] = curr;
                q.push(a);
            }
        }
    }

    if (parent[graph.size() - 1] == -1) {
        cout << "IMPOSSIBLE\n";
        return;
    }

    stack<int> st;
    fillStack(parent, st);

    cout << st.size() << "\n";
    while (!st.empty()) {
        cout << (st.top() + 1) << " ";
        st.pop();
    }
    cout << "\n";
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int vertices, edges;
    cin >> vertices >> edges;

    vector<vector<int>> graph(vertices);
    for (int i = 0; i < edges; i++) {
        int u, v;
        cin >> u >> v;
        u--; v--;
        graph[u].push_back(v);
        graph[v].push_back(u);
    }

    bfs(graph);

    return 0;
}
