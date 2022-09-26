class Solution {
    public int findDays(int a[],int capacity){
        int days=1;
        int sum=0;
        for(int x:a){
            sum=sum+x;
            if(sum>capacity){
                days++;
                sum=x;
            }
        }
        return days;
    }
    
    public int shipWithinDays(int[] weights, int D) {
        int beg=0;
        int end=0;
        for(int w:weights){
            beg = Math.max(beg,w);
            end +=w;
        }
        int ans = 0;
        while(beg<=end){
            int mid = beg + (end-beg)/2;
            int days = findDays(weights,mid);
            if(days<=D){
                end=mid-1;
                ans = mid;
            }
            else{
                beg=mid+1;
            }
        }
        return ans;
    }
}
