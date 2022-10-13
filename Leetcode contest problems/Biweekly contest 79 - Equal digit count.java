class Solution {
    public boolean digitCount(String num) {
         
        int  iCount[] = new int[10];
        
        for(char c:num.toCharArray()){
            iCount[c-'0']++;
        }
        
        for(int i=0;i<num.length();i++){
            if(Character.getNumericValue(num.charAt(i)) != iCount[i])
            return false;   
        }
            
        return true;
    }
}
