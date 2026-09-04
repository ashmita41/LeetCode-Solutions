class Solution {
    private void dfs(int r, int c, char[][] grid, boolean[][] visited) {
        visited[r][c] = true;
        if(r-1 >= 0 && !visited[r-1][c] && grid[r - 1][c] == '1') {
            dfs(r-1, c, grid, visited);
        }
        if(r+1 < grid.length && !visited[r+1][c] && grid[r + 1][c] == '1') {
            dfs(r+1, c, grid, visited);
        }
        if(c-1 >= 0 && !visited[r][c-1] && grid[r][c-1] == '1') {
            dfs(r, c-1, grid, visited);
        }
        if(c+1 < grid[r].length && !visited[r][c+1] && grid[r][c+1] == '1') {
            dfs(r, c+1, grid, visited);
        }
    }
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int island = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(!visited[i][j] && grid[i][j] == '1') {
                    dfs(i, j, grid, visited);
                    island++;
                }
            }
        }
        return island;
    }
}