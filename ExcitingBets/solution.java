import java.util.*;

public class solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        while (n-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (b > a) {
                long temp = a;
                a = b;
                b = temp;
            }

            if (a == b) {
                System.out.println("0 0");
            } else {
                long g = a - b;
                long moves = Math.min(b % g, g - (b % g));
                System.out.println(g + " " + moves);
            }
        }
    }
}