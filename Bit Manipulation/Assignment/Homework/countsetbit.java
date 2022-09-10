class Solution {
    public int[] countBits(int a) {
        int output[]=new int[a+1];
        for(int i=1;i<output.length;i++){
            output[i]=output[i>>1]+i%2;
        }
            return output;
        
    }
}