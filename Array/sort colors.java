class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid= 0;
        int n = nums.length;
        int high = n-1;
        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums, low, mid);
                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            }
        }
    }
    
     public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}