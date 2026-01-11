import java.util.*;

public class solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean flag = false;

            for (int j = 1; j < n - 1; j++) {
                if (arr[j] > arr[j - 1] && arr[j] > arr[j + 1]) {
                    System.out.println("YES");
                    System.out.println((j) + " " + (j + 1) + " " + (j + 2));
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
