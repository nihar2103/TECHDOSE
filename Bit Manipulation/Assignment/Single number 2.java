class Solution {
    public int singleNumber(int[] nums) {
        int count[]=new int[32];
        int result=0;
        for(int i=0;i<32;i++){
            for(int j=0;j<nums.length;j++){
                if((nums[j]&(1<<i))!=0){
                    count[i]+=1;
                }
            }
        }
        for(int i=31;i>=0;i--){
            if(count[i]%3!=0){
                result=1<<i|result;
            }
        }
        return result;
        
    }
}