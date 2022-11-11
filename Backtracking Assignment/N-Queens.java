class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i = 0; i < n;i++){
            for(int j = 0 ; j < n ; j++){
            board[i][j]='.';
            }
        }
        int[] leftRow = new int[n];
        int[] upperDia = new int[2*n-1];
        int[] lowerDia = new int[2*n-1];
        solve(0,board,ans,leftRow,upperDia,lowerDia,n);
        return ans;
    }
    void solve(int col, char[][] board ,List<List<String>> ans ,int[] leftRow,int[] upperDia, int[] lowerDia, int n){
        if(col == n){
		    List<String>ds = new ArrayList<>();
            for(int i = 0; i < n;i++){
                StringBuilder sb = new StringBuilder();
               for(int j = 0 ; j < n ; j++){
                  sb.append(board[i][j]);
                 }
                ds.add(sb.toString());
        }
        ans.add(new ArrayList<>(ds));
        return;
        }
        for(int row = 0; row < n;row++){
            
            if(leftRow[row]==0 && lowerDia[row+col]==0 && upperDia[n-1 +col-row]==0){
			    board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDia[row+col] = 1;
                upperDia[n-1+col-row]=1;
                solve(col+1,board,ans,leftRow,upperDia, lowerDia,n);
                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDia[row+col] = 0;
                upperDia[n-1+col-row]=0;
            }
        }
    }
}
