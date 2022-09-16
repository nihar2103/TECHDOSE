class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=1; i<nums.length; i++){
            for (int j=0; j<i; j++){  
                if (nums[j]+nums[i]==target){
                        return new int[] {j,i}; 
                    }
            }  
        }
        return new int[] { 0,0};
    }
}