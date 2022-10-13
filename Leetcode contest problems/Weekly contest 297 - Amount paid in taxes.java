class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double tax = 0.0;
        double previous = 0;
        for(int i = 0;i<brackets.length;i++)
        {
            double upper = brackets[i][0];
            double percentage = brackets[i][1];
            if(income >= upper)
            {
               tax+=((upper-previous)*percentage)/100;
               previous = upper;
            }
            else
            {
               tax+=((income-previous)*percentage)/100;
               previous = upper;
               break;
            }
        }
        return tax;
    }
}
