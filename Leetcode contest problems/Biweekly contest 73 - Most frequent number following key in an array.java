class Solution {
    public int mostFrequent(int[] nums, int key) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == key){
                map.put(nums[i+1], map.getOrDefault(nums[i+1], 0) + 1);
            }
        }
        int output = 0; 
        int maxCount = 0; 
        
        for (var entry : map.entrySet()) {
            if(maxCount < entry.getValue()){ 
                maxCount = entry.getValue(); 
                output = entry.getKey(); 
            }
        }
        
        return output;
    }
}
