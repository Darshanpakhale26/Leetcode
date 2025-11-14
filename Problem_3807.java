// 3807 . Earliest Time to Finish One Task


import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Problem_3807 {
    public int earliestTime(int n, int[][] edges, int[] taskTime) {
        int m = edges.length;
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        Queue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.offer(new int[]{0, 0});
        boolean[] visited = new boolean[n];
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int u = cur[0];
            if (visited[u]) {
                continue;
            }
            visited[u] = true;
            for (int i = 0; i < m; i++) {
                int from = edges[i][0];
                int to = edges[i][1];
                int time = edges[i][2];
                if (from == u) {
                    if (dist[u] + time < dist[to]) {
                        dist[to] = dist[u] + time;
                        pq.offer(new int[]{to, dist[to]});
                    }
                } else if (to == u) {
                    if (dist[u] + time < dist[from]) {
                        dist[from] = dist[u] + time;
                        pq.offer(new int[]{from, dist[from]});
                    }
                }
            }
        }
        int earliestFinish = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (dist[i] != Integer.MAX_VALUE) {
                earliestFinish = Math.min(earliestFinish, dist[i] + taskTime[i]);
            }
        }
        return earliestFinish == Integer.MAX_VALUE ? -1 : earliestFinish;
    }
}
