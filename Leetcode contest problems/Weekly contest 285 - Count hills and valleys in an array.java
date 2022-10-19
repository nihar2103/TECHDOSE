class Solution {
    public int countHillValley(int[] nums) {
        int len = nums.length;
        int countHillValley = 0;
        int prev = nums[0];
        for (int i = 1; i < len - 1; i++) {
            if (prev < nums[i] && nums[i] > nums[i + 1] || prev > nums[i] && nums[i] < nums[i + 1]) {
                prev = nums[i];
                countHillValley++;
            }
        }
        return countHillValley;
    }
}
