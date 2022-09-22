class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
     ArrayList<List<Integer>> res=new ArrayList<List<Integer>>();
     if(arr==null || arr.length==0){
         return res;
     }
        Arrays.sort(arr);
        int n=arr.length;
     for(int i=0;i<n;i++){
        long target_3 = target - arr[i];
         for(int j=i+1;j<n;j++){
             long target2 = target_3 - arr[j];
             int front=j+1;
             int right=n-1;
             while(front<right){
                 int twosum=arr[front]+arr[right];
             if(twosum<target2){
                 front++;
             }
             else if(twosum>target2){
                 right--;
             }
             else{
                 List<Integer> quad=new ArrayList<>();
                 quad.add(arr[i]);
                 quad.add(arr[j]);
                 quad.add(arr[front]);
                 quad.add(arr[right]);
                 res.add(quad);
             
             while(front<right && arr[front]==quad.get(2)){
                 front++;
             }
             while(front<right && arr[right]==quad.get(3)){
                 right--;
             }
             }
             
         }
             while(j+1<n && arr[j+1]==arr[j]){
                 j++;
             }
     }
                      while(i+1<n && arr[i+1]==arr[i]){
                 i++;
             }
    }return res;
}
}
