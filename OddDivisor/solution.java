import java.util.*;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        while (n-- > 0) {
            long a = sc.nextLong();

            while (a % 2 == 0) {
                a /= 2;
            }

            if (a > 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}