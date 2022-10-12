class Solution {
    public int minimumOperations(int[] n) {
        Set<Integer> s = new HashSet<>();
        for(int num: n) 
            if(num != 0) s.add(num);
   
        return s.size();
    }
}
