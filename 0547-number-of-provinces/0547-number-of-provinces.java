class Solution {
    private static void dfs(int[][] isConnected, int u, boolean[] visited) {
        visited[u] = true;

        //process all neighbours
        for(int v = 0; v < isConnected.length; v++) {
            if(!visited[v] && isConnected[u][v] == 1) {
                dfs(isConnected, v, visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int cnt = 0;
        boolean[] visited = new boolean[isConnected.length];
        for(int u = 0; u < isConnected.length; u++) {
            if(!visited[u]) {
                cnt++;
                dfs(isConnected, u, visited);
            }
        }
        return cnt;
    }
}