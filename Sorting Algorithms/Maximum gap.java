class Solution {
    public int maximumGap(int[] nums) {
        int len=nums.length;
        if(len==1 )return 0;
        Arrays.sort(nums);
        List<Integer> mylst=new ArrayList<Integer>();
        for(int i=0;i<len-1;i++){
            int diff=nums[i+1]-nums[i];
            mylst.add(diff);
        }
        int max=0;
        for(int i:mylst){
            if(max<=i){
                max=i;
            }
        }
        return max;
    }
}
