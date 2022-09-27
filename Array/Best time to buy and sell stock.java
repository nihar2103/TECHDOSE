class Solution {
    public int maxProfit(int[] price) {
        
        int max=0,min=price[0];
        for(int i=1;i<price.length;i++)   {
		
            if(min<price[i])
                max=Math.max(price[i]-min,max);
            else
                min=price[i];
        }
        return max;
    }
}
