class Solution {
public int minMaxGame(int[] nums) {
    int m = nums.length;
    if(m == 1)
        return nums[0];
    int[] numsArr = new int[m/2];
    for(int i = 0; i < m/2; i++){
        if(i % 2 == 0){
            numsArr[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
        }
        else{
            numsArr[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
        }
    }
    
    return minMaxGame(numsArr);
}
}
