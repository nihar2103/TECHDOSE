class Solution {
public boolean isValidSudoku(char[][] board) {
    Set<String> check = new HashSet<>();
    for(int i = 0; i < 9; i++){
        for(int j = 0; j < 9; j++){
            if(board[i][j] != '.'){
                String row = board[i][j] + "in row" + i;
                String col = board[i][j] + "in col" + j;
                String box = board[i][j] + "in box" + i/3 + "and" + j/3;
                if(check.contains(row) || check.contains(col) || check.contains(box)){
                    return false;
                }           
                check.add(row);
                check.add(col);
                check.add(box);
            }
        }
    }
    return true;
}
}
