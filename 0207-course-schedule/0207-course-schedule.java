class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(); 
        int[] indegree = new int[numCourses];
        for(int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for(int j = 0; j < prerequisites.length; j++) {
            int v = prerequisites[j][0];
            int u = prerequisites[j][1];
            adj.get(u).add(v);
            indegree[v]++;
        }

        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 0; i < indegree.length; i++) {
            if(indegree[i] == 0) {
                q.add(i);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();

        //bfs
        while(!q.isEmpty()) {
            int curr = q.remove();
            result.add(curr);
            for(int v : adj.get(curr)) {
                indegree[v]--;
                if(indegree[v] == 0) {
                    q.add(v);
                }
            }
        }

        if(result.size() == numCourses) {
            return true;
        }

        return false;
    }
}