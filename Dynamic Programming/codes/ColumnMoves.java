class Solution {
    static int[][] dp;

    public int noOfMoves(int[][] grid, int i, int j, int prev) {
        // Check for out-of-bounds indices
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return 0;
        }
        
        // Move only if the next cell has a strictly greater value
        if (grid[i][j] <= prev) {
            return 0;
        }
        
        // Memoization check
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        
        // Explore the three possible moves: (up-right), (right), and (down-right)
        int upRight = noOfMoves(grid, i - 1, j + 1, grid[i][j]);
        int right = noOfMoves(grid, i, j + 1, grid[i][j]);
        int downRight = noOfMoves(grid, i + 1, j + 1, grid[i][j]);
        
        // Maximum moves possible from this cell
        dp[i][j] = 1 + Math.max(upRight, Math.max(right, downRight));
        
        return dp[i][j];
    }

    public int maxMoves(int[][] grid) {
        int maxMoves = 0;
        int m = grid.length;
        int n = grid[0].length;
        
        // Initialize dp array with -1 for memoization
        dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        
        // Start from each cell in the first column
        for (int i = 0; i < m; i++) {
            maxMoves = Math.max(maxMoves, noOfMoves(grid, i, 0, -1));
        }
        
        return maxMoves - 1; // Subtract 1 because we want the count of moves, not cells
    }
}
