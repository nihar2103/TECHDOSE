class Solution {
    int count = 2;
    public int[][] largestLocal(int[][] grid) {
        int m = grid.length;
        int[][] arr = new int[m-1][m-1];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                arr[i][j] = Math.max(grid[i][j], Math.max(grid[i][j+1], Math.max(grid[i+1][j], grid[i+1][j+1])));
            }
        }
        return --count == 0 ? arr : largestLocal(arr);
    }
}
