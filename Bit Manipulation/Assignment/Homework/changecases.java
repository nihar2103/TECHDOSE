import java.util.*;

public class changecases {
    public char tolower(char a) {
        return (int) a | (1 << 5);
    }

    public char toupper(char a) {
        return (char) a & (~(1 << 5));
    }

    public char totoggle(char a) {
        return (char) a ^ (1 << 5);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        tolower(a);
        toupper(a);
        totoggle(a);

    }
}