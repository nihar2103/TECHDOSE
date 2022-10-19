class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());

        byte[] temp = new byte[2001];

        for(int i: nums1) temp[i+1000] = 1;

        for(int i: nums2){
            if (temp[i+1000] == 0){
                temp[i+1000] = 2;
                ans.get(1).add(i);
            }
            else if (temp[i+1000] == 1){
                temp[i+1000] = 3;
            }
        }

        for(int i : nums1){
            if (temp[i+1000] == 1){
                ans.get(0).add(i);
                temp[i+1000] = 4;
            }
        }

        return ans;
    }
}
