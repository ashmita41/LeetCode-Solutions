class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new ArrayDeque<>();
        int fresh = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 2) {
                    //that means its a rotten orange and every minute it will rot adjacent oranges too
                    q.offer(new int[]{i,j});
                } else if(grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        if(fresh == 0) return 0;
        int minutes = 0;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        //multi-source bfs from rotten oranges
        while(!q.isEmpty() && fresh>0) {
            int size = q.size();
            for(int i = 0; i < size; i++) {
                int[] point = q.poll();
                for(int dir[] : dirs) {
                    int x = point[0] + dir[0];
                    int y = point[1] + dir[1];
                    if(x < 0 || y < 0 || x >= grid.length || y >= grid[x].length || grid[x][y] == 0 || grid[x][y] == 2) continue;
                    grid[x][y] = 2;
                    q.offer(new int[]{x, y});
                    fresh--;
                }
            }
            minutes++;

        }

        if(fresh == 0) {
            return minutes;
        }
        return -1;
    }
}