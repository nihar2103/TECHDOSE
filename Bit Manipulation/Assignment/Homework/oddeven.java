import java.util.*;
public class oddoreven {
    public static boolean oodoreven(int a){
        return (a&1)!=0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(oddoreven(a)==true?"Odd":"Even");
    }
}