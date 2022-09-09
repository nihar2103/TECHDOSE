class Solution {
    public int[] decode(int[] encoded) {
      int a=encoded.length+1;
        int res[]=new int[a];
        int all=0;
        int encode=0;
        for(int i=1;i<=a;i++)
            all=all^(i);
        for(int i=1;i<a;i+=2)
            encode=encode^encoded[i];
        int first=all^encode;
        res[0]=first;
        for(int i=1;i<a;i++)
        {
            res[i]=res[i-1]^encoded[i-1];
        }
        return res;  
    }
}