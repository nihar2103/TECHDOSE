class Solution {
    public String digitSum(String s, int k) {
        while(s.length() > k){
            String str = "";
            for(int i=0; i<s.length(); i=i+k){
                int sum = 0;
                for(int j=i; j<s.length() && j<i+k ; j++)
                    sum += Character.getNumericValue(s.charAt(j));
                str += String.valueOf(sum);
            }
            s = str;
        }
        return s;
    }
}
