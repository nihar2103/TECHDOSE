class Solution {
    public int[] numberOfPairs(int[] nums) {
    Arrays.sort(nums);
    Stack<Integer> s = new Stack<Integer>();
    int pairs = 0;
    
        if (nums.length == 1) {
            return new int[]{0 , 1}; 
        }
        s.push(nums[0]);
        for(int i = 1; i < nums.length; i++){
            if(!s.isEmpty() && s.peek() == nums[i]){
                s.pop();
                pairs++;
            }
            else if(!s.isEmpty() && s.peek() != nums[i]){
                s.push(nums[i]);
            }
            else{
                s.push(nums[i]);
            }
        }
 
    return new int[]{pairs, s.size()};
    }
}
