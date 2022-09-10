import java.util.*;

class Main {
    static int combination(int a, int b) {
        return fact(a) / (fact(b) * fact(a-b));
    }

    static int fact(int a) {
        if (a==0)
            return 1;
        int result = 1;
        for (int i=2;i<=a;i++)
            result=result*i;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(combination(a, b));
    }
}
