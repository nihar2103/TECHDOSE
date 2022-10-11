bool findSubarrays(int* array, int m){
    int ctr[m],n=0;
    for(int i=0;i<m-1;i++){
        ctr[n++]=(array[i]+array[i+1]);
    }
    int a=0;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(ctr[i]==ctr[j]){
                a=1;
            }
        }
    }if(a==1){
        return true;
    }else{
        return false;
    }

}
