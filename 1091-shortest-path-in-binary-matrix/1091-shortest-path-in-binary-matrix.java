class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;

        if(grid[0][0] == 1 || grid[n-1][n-1] == 1) {
            return -1;
        }
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] { 0, 0, 1 });
        grid[0][0] = 1;

        int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 }, { 1, 1 }, { -1, 1 }, { 1, -1 }, { -1, -1 } };

        while (!queue.isEmpty()) {

            int[] curr = queue.poll();

            if(curr[0] == n-1 && curr[1] == n-1) {
                return curr[2];
            }

            for (int[] d : dirs) {
                int r = curr[0] + d[0];
                int c = curr[1] + d[1];
                int dis = curr[2];

                if (r < 0 || r >= n || c < 0 || c >= n) {
                    continue;
                }

                if (r == n - 1 && c == n - 1)
                    return dis + 1;

                if (grid[r][c] == 0) {
                    queue.offer(new int[]{r, c, dis + 1});
                    grid[r][c] = 1;
                }
            }
        }
        return -1;
    }
}