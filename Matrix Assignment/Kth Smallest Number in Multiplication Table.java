class Solution {
    public int findKthNumber(int m, int n, int k) {
        int a=0, b=m*n;
        while (a < b) {
            int mid=(a+b)/2, cnt=0;
            for (int i=1; i<=m; i++)
                cnt += n < mid/i ? n : mid/i;
            if (cnt >= k){
                b = mid;
            }
            else{  
                a = mid+1;
            }
        }
        return a;
    }
}
