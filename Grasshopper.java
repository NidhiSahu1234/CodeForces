import java.util.*;

public class Grasshopper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long x = sc.nextLong();// initial Position
            long n = sc.nextLong();// number of jumps

            long val;
            if (n % 4 == 0) {
                val = 0;
            } else if (n % 4 == 1) {
                val = -n;
            } else if (n % 4 == 2) {
                val = 1;
            } else {
                val = n + 1;
            }

            if (x % 2 == 0) {
                System.out.println(x + val);
            } else {
                System.out.println(x - val);
            }
        }
    }
}
