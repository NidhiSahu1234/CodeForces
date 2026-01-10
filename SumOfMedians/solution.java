import java.util.*;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            List<Long> list = new ArrayList<>();

            for (int i = 0; i < n * k; i++) {
                list.add(sc.nextLong());
            }

            long pointer = n * k;

            long sum = 0;

            while (k-- > 0) {
                pointer -= (n / 2 + 1);
                sum += list.get((int) pointer);

            }
            System.out.println(sum);
        }
    }
}