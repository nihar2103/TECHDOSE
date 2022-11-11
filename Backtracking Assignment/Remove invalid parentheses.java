class Solution {
    List<String>ans=new ArrayList<>();
    public List<String> removeInvalidParentheses(String s) {
        helper(s,0,0,'(',')');
        return ans;
    }
    void helper(String s,int is,int js,char op,char cl){
        int open=0,close=0;
        for(int i=is;i<s.length();i++){
            if(s.charAt(i)==op)open++;
            if(s.charAt(i)==cl)close++;
            if(close>open){
                for(int j=js;j<=i;j++){
                    if(s.charAt(j)==cl&&(j==js||s.charAt(j-1)!=cl)){
                        helper(s.substring(0,j)+s.substring(j+1,s.length()),i,j,op,cl);
                    }
                }
                return;
            }
        }
        String rev=new StringBuilder(s).reverse().toString();
        if(op=='('){
            helper(rev,0,0,')','(');
        }
        else{
            ans.add(rev);
        }
    }
}
