int commonFactors(int m, int n){
    int l=m*n;
    int res=0;
    for(int i=1;i<=l;i++){
        if(m%i==0 && n%i==0){
            res++;
            }
        }
        return res;

}
