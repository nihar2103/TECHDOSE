class Solution {
    public boolean isPowerOfTwo(int a) {
        long i=1;
        while(i<a){
            i*=2;
        }
        return i==a;
    }
}