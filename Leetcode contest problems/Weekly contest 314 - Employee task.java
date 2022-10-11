class Solution {
   public int hardestWorker(int m, int[][] logs) {
      if (logs.length == 0) return 0;
      int ans = logs[0][0];       
      int maxTime = logs[0][1] - 0;                               
      for (int i = 1; i < logs.length; i++) {
         int time = logs[i][1] - logs[i - 1][1];                   
         if (maxTime == time) {
            ans = ans < logs[i][0] ? ans : logs[i][0];
         } else if (maxTime < time) {
            maxTime = logs[i][1] - logs[i - 1][1];
            ans = logs[i][0];
         }
      }
      return ans;
   }
}
