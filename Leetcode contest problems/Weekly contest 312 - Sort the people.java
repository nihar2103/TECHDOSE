class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] res=new String[names.length];
        TreeMap <Integer, String> map = new TreeMap<> (Collections.reverseOrder());
        for(int i=0;i<names.length;i++){
            map.put(heights[i], names[i]);
            }
        int a=0;
        for(int b:map.keySet()){
            res[a++]=map.get(b);
            }
            return res;
    }
}
