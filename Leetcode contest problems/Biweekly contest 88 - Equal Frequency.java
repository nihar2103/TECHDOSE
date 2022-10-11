class Solution {
    public boolean equalFrequency(String word) {
        
        boolean res = false;
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Character> ch = new ArrayList<Character>();
         for(int i=0; i<word.length(); i++){
             if(ch.isEmpty()) ch.add(word.charAt(i));
             else if (ch.contains(word.charAt(i))) {
                 continue;
             }
             else{
                 ch.add(word.charAt(i));
             }
             int temp = frequency(word, word.charAt(i));
             a.add(temp);
        }
         if(a.size()==2&&a.contains(1)) return true;
         for(int i=0; i<a.size(); i++){
             a.set(i,a.get(i)-1);
             boolean check =  true;
             for(int j=0; j<a.size(); j++){
                 if(a.get(j)==0) continue;
                 int zor =0;
                 for(int k=0; k<a.size(); k++){
                     if(a.get(k)==0) continue;
                     zor = a.get(j) ^ a.get(k);
                     if(zor!=0) {
                         check = false;
                         break;
                     }
                 }
             }
             if(check) return true;
             a.set(i,a.get(i)+1);
         }
        return res;
    
    }
    public static int frequency(String word, char m){
        int count = 0;
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)==m){
                count ++;
            }
        }
        return count;
    }
}
