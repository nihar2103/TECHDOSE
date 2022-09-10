import java.util.*;
class swap{
public static void swap1( int m,int n){
    m^=n;
    n^=m;
    m^=n;
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    swap1(m,n);
    
}
