import java.util.*;

class Main {
    static boolean isprime(int a) {
        if (a<=1)
            return false;
        for (int i=2;i < a/2;i++) {
            if (a%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (isprime(a)) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("It is not a prime number");
        }
    }
}
