class Solution {
    public int largestInteger(int num) {
        int[] arr=new int[10];
        int temp=num;
        while(temp!=0){
            int r=temp%10;
            temp/=10;
            arr[r]++;
        }
        String str=String.valueOf(num);
        int even=8,odd=9;
        int ans=0;
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)-'0')%2==0)
            {
                while(arr[even]==0)
                    even-=2;
                ans=ans*10+even;
                arr[even]--;
            }
            else{
                while(arr[odd]==0)
                    odd-=2;
                ans=ans*10+odd;
                arr[odd]--;
            }
        }
        return ans;
    }
}
