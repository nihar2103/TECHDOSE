class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int len = nums.length;
        var oddArr = new int[len / 2];
        var evenArr = new int[len - len / 2];
        
        int j = 0, k = 0;
        for (int i = 0; i < len; i++) {
            if (i % 2 == 0){
                evenArr[j++] = nums[i];
            }
            else{
                oddArr[k++] = nums[i];
            }
        }
        Arrays.sort(evenArr); Arrays.sort(oddArr);
        j = 0; k = oddArr.length - 1;        
        for (int i = 0; i < len; i++) {
            nums[i] = i % 2 == 0 ? evenArr[j++] : oddArr[k--];
        }
        return nums;
     }
}
