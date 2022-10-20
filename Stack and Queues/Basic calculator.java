class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int result = 0;
        int num = 0;
        int sign=1;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
                num = num*10 + (int)(s.charAt(i)-'0');
            else if(s.charAt(i)=='+')
            {
                result+=num*sign;
                num=0;
                sign=1;
            }
            else if(s.charAt(i)=='-')
            {
                result+=num*sign;
                num=0;
                sign=-1;
            }
            else if(s.charAt(i)=='(')
            {
                st.push(result);
                st.push(sign);
                sign=1;
                result=0;
            }
            else if(s.charAt(i)==')')
            {
                result+=sign*num;
                num=0;
                result*=st.pop();
                result+=st.pop();
            }
        }
        if(num!=0)
            result+=sign*num;
        return result;
    }
}
