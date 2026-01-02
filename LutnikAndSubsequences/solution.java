import java.util.*;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- > 0) {
            long a = sc.nextLong();

            long[] arr = new long[(int) a];

            for (int i = 0; i < a; i++) {
                arr[i] = sc.nextLong();
            }

            long countOnes = 0;
            long countZeroes = 0;

            for (int i = 0; i < a; i++) {
                if (arr[i] == 0) {
                    countZeroes++;
                } else if (arr[i] == 1) {
                    countOnes++;
                }
            }

            long ways = (long) Math.pow(2, countZeroes) * countOnes;

            System.out.println(ways);

        }
    }
}