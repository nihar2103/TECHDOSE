public class leastpower {
    public int leastpower1(int a) {
        int ctr = 0;
        while (a != 1) {
            a >>= 1;
            ctr++;
        }
        return 1;
    }
}