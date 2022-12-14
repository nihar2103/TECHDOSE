public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> indices = new HashMap<Character,Integer>();
        int len = 0;
        int start = -1;
        int end = 0;
        for(end=0; end < s.length(); end++){
            char c = s.charAt(end);
            if(indices.containsKey(c)){
                int newstart = indices.get(c);
                start = Math.max(start,newstart);
            }
            len = Math.max(len,end-start);
            indices.put(c,end);
        }
        return len;
    }
}
