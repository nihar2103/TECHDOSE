import java.io.*;
import java.util.*;

class Catalan {
    int catalan(int a) {
        if (a == 0 || a == 1) {
            return 1;
        }

        int cn = 0;

        for (int i = 0; i < a; i++) {
            cn = cn + catalan(i) * catalan(a - i - 1);
        }
        return cn;
    }

    public static void main(String args[]) {
        Catalan b = new Catalan();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println(b.catalan(i));
        }
    }
}
