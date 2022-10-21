class Solution {
    public int countPairs(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    if ((i*j) % k == 0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
