class Solution {
    private static void bfs(int[][] isConnected, int u, boolean[] visited) {
        Queue<Integer> q = new ArrayDeque<>();
        visited[u] = true;
        q.add(u);

        while(!q.isEmpty()) {
            int node = q.peek();
            q.remove();
            for(int v = 0; v < isConnected.length; v++) {
                if(isConnected[u][v] == 1 && !visited[v]) {
                    bfs(isConnected, v, visited);
                }
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int cnt = 0;
        boolean[] visited = new boolean[isConnected.length];
        for(int u = 0; u < isConnected.length; u++) {
            if(!visited[u]) {
                cnt++;
                bfs(isConnected, u, visited);
            }
        }
        return cnt;
    }
}