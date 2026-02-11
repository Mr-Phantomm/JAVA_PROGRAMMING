package ShortestDistance;

import java.util.PriorityQueue;

public class Graph {

    Integer[][] adj;
    int N;

    Graph(int N) {
        this.N = N;
        this.adj = new Integer[N][N];

        for (int i = 0; i < N; i++) {
            adj[i][i] = 0;
        }
    }

    class QueueNode {
        public int currNode;
        public int currDistance;

        QueueNode(int currNode, int currDistance) {
            this.currNode = currNode;
            this.currDistance = currDistance;
        }
    }

    public void addEdge(int a, int b, int dist) {
        adj[a][b] = dist;
    }

    public Integer[] shortestDistanceFromGivenNode(int a) {
        Integer[] shortestDistances = new Integer[N];

        PriorityQueue<QueueNode> q = new PriorityQueue<>((q1, q2) -> {
            return Integer.compare(q1.currDistance, q2.currDistance);
        });

        q.add(new QueueNode(a, 0));

        while (q.size() != 0) {

            QueueNode qNode = q.poll();

            if (shortestDistances[qNode.currNode] == null || shortestDistances[qNode.currNode] > qNode.currDistance) {
                shortestDistances[qNode.currNode] = qNode.currDistance;
            } else {
                continue;
            }

            int newNode = qNode.currNode;

            for (int i = 0; i < N; i++) {
                if (newNode != i && this.adj[newNode][i] != null) {
                    q.add(new QueueNode(i, this.adj[newNode][i] + qNode.currDistance));
                }
            }
        }

        return shortestDistances;
    }

}