class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        boolean[] visited = new boolean[numCourses];
        boolean[] inRecursion = new boolean[numCourses];
        for(int i = 0; i<numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for(int[] edge : prerequisites) {
            int u = edge[1];
            int v = edge[0];

            adj.get(u).add(v);
        }

        for(int j = 0; j < numCourses; j++) {
            if(!visited[j] && dfs(adj, j, visited, inRecursion)) {
                return false;
            }
        }

        return true;
    }

    private boolean dfs(ArrayList<ArrayList<Integer>> adj, int u , boolean[] visited, boolean[] inRecursion) {
        visited[u] = true;
        inRecursion[u] = true;

        for(int v : adj.get(u)) {
            if(inRecursion[v]) {
                return true;
            }
            
            if(!visited[v] && dfs(adj, v, visited, inRecursion)) {
                return true;
            }
        }

        inRecursion[u] = false;
        return false;
    }
}