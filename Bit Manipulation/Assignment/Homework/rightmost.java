import java.util.*;
import java.io.*;
public class rightmost {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int rm= a&~a;
    System.out.println(rm);
}
