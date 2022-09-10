import java.util.*;

class GFG {

    static boolean isPrime(int n) {

        if (n<=1)
            return false;

        for (int i=2;i<n;i++)
            if (n%i==0)
                return false;

        return true;
    }
    static void printPrime(int n) {
        for (int i=2;i<=n;i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        printPrime(n);
    }
}
class GFG {
    
    static boolean isPrime(int n) {
        // Corner case
        if (n<=1)
            return false;

        // Check from 2 to n-1
        for (int i=2;i<n;i++)
            if (n%i==0)
                return false;

        return true;
    }
    static void printPrime(int n) {
        for (int i=2;i<=n;i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int n=7;
        printPrime(n);
    }
}