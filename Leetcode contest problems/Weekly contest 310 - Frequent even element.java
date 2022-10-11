class Solution {
    public int mostFrequentEven(int[] num) {
        int m=num.length;
        Map<Integer,Integer> map = new TreeMap<>();
        for(int a:num)
            if(a%2==0)
                map.put(a,map.getOrDefault(a,0)+1);
        
        int res=-1;
        int max = Integer.MIN_VALUE;
        for(int key : map.keySet()){
            int tot=map.get(key);
            if(tot>max) {
                max=tot;
                res=key;}
        }
        
        return res;
    }
}
