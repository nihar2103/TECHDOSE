class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permutation(nums, 0, ans);
        
        return ans;
    }
    private void permutation(int[] arr, int index, List<List<Integer>> ans)
    {
        if(index == arr.length)
        {
            List<Integer> dS = new ArrayList<>();
            
            for(int i = 0; i < arr.length; ++i)
                dS.add(arr[i]);
            
            ans.add(new ArrayList<>(dS));
            return;
        }
        
        for(int i = index; i < arr.length; ++i)
        {
            swap(arr, i, index);
            permutation(arr, index + 1, ans);
            swap(arr, i, index);
        }
    }
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
