class Solution {
    public int findComplement(int n) {
        int result=0;
        int pow=1;
        while(n>0){
            result+=(n%2^1)*pow;
            pow<<=1;
            n>>=1;
        }
        return result;
    }
}