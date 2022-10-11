class Solution {
    public int countDaysTogether(String aA, String lA, String aB, String lB) {
         String from = "";
         if(aA.compareTo(aB) <= 0) {
             from = aB;
         }else{
             from = aA;
         }
        String to = "";
        if(lA.compareTo(lB) <= 0) {
             to = lA;
         }else{
             to = lB;
         }
        int[] day= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int AM = Integer.parseInt(from.substring(0,2));   
        int AD = Integer.parseInt(from.substring(3));    
        int LM = Integer.parseInt(to.substring(0,2));    
        int LD = Integer.parseInt(to.substring(3));      
        if(LM < AM) return 0;                                  
        else if(AM == LM && AD>LD) return 0;        
        else if(AM == LM && AD<=LD) {
            return LD-AD+1;
        }else{
           int m = LM-AM-1;
            int cntDay = 0;
            int temp = AM;
            while(m-->0) {
                cntDay+=day[temp++];
            }
            return cntDay+(day[AM-1]-AD)+LD+1;
        }
        
        
    }
}
