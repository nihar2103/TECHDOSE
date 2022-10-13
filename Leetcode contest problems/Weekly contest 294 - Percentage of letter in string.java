class Solution {
    public int percentageLetter(String s, char letter) {
        int m=s.length();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==letter)
            {
                count++;
            }
        }
        int ans=(count*100)/m;
        return ans;
        
    }
}
