class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int[] ans = new int[matrix.length*matrix.length];
        int s = 0;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j< matrix.length; j++){
                ans[s] = matrix[i][j];
                s++;
            }
        }
       Arrays.sort(ans);
       int answer = ans[k-1];
       return answer;
      
    }
}