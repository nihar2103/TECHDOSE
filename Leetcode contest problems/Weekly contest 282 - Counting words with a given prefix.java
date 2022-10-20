class Solution {
    public int prefixCount(String[] words, String pref) {
    int n = 0;
    for(String s : words) {
        if(s.indexOf(pref)==0) 
            n++;
    }
    return n; 
    }
}
