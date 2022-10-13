class Solution {
    public String greatestLetter(String str) 
    {
        char ch= 'z' , CH = 'Z';
        
        for(int i=0; i<26;i++)
        {            
            if(str.indexOf(ch) != -1 && str.indexOf(CH) != -1)
                return "" + CH;
            
            else
            {
                ch--;
                CH--;
            }
        }
        return "";
    }
}
