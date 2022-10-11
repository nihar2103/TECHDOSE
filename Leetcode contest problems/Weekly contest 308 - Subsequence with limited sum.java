class Solution {
    public int[] answerQueries(int[] n, int[] queries) {
        Arrays.sort(n);
        int arr[] = new int[queries.length];
        for(int i=0; i<queries.length; i++){
            int count = 0, tot=0;
            for(int j=0; j<n.length; j++){
                if(tot + n[j] <= queries[i]){
                    tot += n[j];
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }
}
