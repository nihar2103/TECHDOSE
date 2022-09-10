import java.util.*;
public class setIthBit {
    public static int ithbit(int a,int pos){
        return a|(1<<(pos-1));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int pos=sc.nextInt();
        ithbit(a,pos);
    }
}