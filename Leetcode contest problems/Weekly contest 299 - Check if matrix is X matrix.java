class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int m = grid.length;
        
        for(int i =0; i < m ; i++){
            if(grid[i][i] == 0 || grid[i][Math.abs(m-i-1)] == 0){
                return false;
            }
            
        }
     
        for(int i = 0; i < m ;i++){
            for(int j = 0; j < m ; j++){
                if(j == i || j == Math.abs(m-i-1)){
                    continue;
                }else if(grid[i][j] != 0){
                    return false;
                }
            }
        }
        
        return true;
    }
}
