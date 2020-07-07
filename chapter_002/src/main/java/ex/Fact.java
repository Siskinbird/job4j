package ex;

public class Fact {
    public static void main(String[] args) {
        System.out.println("Factorial : " + calc(-3));

    }

    public static int calc(int n) {
        int rsl = 1;
        if (n < 0) {
            throw new IllegalArgumentException("int n should be less then 0 .");
        }
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
