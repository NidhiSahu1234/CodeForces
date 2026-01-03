import java.util.*;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        while (n-- > 0) {
            long a = sc.nextLong();

            long[] arr = new long[(int) a];

            for (int i = 0; i < a; i++) {
                arr[i] = sc.nextLong();
            }

            long total = arr[0];

            for (int i = 1; i < a; i++) {
                total &= arr[i];
            }

            System.out.println(total);
        }
    }
}