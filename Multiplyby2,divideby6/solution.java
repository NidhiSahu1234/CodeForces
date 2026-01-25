import java.util.*;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();

        while (t-- > 0) {
            long n = sc.nextLong();

            long count2 = 0;

            long count3 = 0;

            while (n > 0 && n % 2 == 0) {
                count2++;

                n /= 2;
            }

            while (n > 0 && n % 3 == 0) {
                count3++;

                n /= 3;
            }

            if (n > 1 || count2 > count3) {
                System.out.println(-1);
            } else {
                System.out.println(2 * count3 - count2);
            }

        }

    }
}