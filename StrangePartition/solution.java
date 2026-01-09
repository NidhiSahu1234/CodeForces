import java.util.*;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- > 0) {
            int t = sc.nextInt();
            long x = sc.nextLong();

            long sum = 0;

            long maxBeauty = 0;
            long minBeauty = 0;

            for (int i = 0; i < t; i++) {
                long a = sc.nextLong();

                sum += a;

                maxBeauty += (a + x - 1) / x;
            }

            minBeauty = (sum + x - 1) / x;

            System.out.println(minBeauty + " " + maxBeauty);
        }
    }
}