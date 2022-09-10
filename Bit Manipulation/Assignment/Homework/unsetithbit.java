import java.util.*;
class Solution{
    public static int unsetIthBit(int a,int pos){
        return a&(~(1<<(pos-1)));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int pos=sc.nextInt();
    System.out.println(unsetIthBit(a,pos));

    }
}
