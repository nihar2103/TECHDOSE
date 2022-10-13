class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length()<8)return false;
        boolean res=false;
        
        boolean lc=false;
        boolean uc=false;
        boolean d=false;
        boolean sc=false;
        
        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            if(i>0 && ch==password.charAt(i-1))return false;
            
            if(ch>='0' && ch<='9')d=true;
            if(ch>='a' && ch<='z')lc=true;
            if(ch>='A' && ch<='Z')uc=true;
            if(ch=='!'||ch=='@'||ch=='#'||ch=='$'||ch=='%'||ch=='^'||ch=='&'||ch=='*'||ch=='('||ch==')'||ch=='-'||ch=='+')sc=true;
            
        }
        res=lc&uc&d&sc;
        return res;
    }
}
