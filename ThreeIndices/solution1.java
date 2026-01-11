import java.util.*;

public class solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();

        while (t-- > 0) {
            long n = sc.nextLong();

            long[] arr = new long[(int) n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            boolean flag = false;

            for (int j = 1; j < n - 1; j++) {
                int i = -1;
                int k = -1;

                for (int left = 0; left < j; left++) {
                    if (arr[left] < arr[j]) {
                        i = left;
                        break;
                    }
                }

                for (int right = j + 1; right < n; right++) {
                    if (arr[right] < arr[j]) {
                        k = right;
                        break;
                    }
                }

                if (i != -1 && k != -1) {
                    System.out.println("YES");
                    System.out.println((i + 1) + " " + (j + 1) + " " + (k + 1));
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("NO");
            }

        }
    }
}