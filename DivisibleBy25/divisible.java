import java.util.*;

public class divisible {

    static int solve(String s, String target) {
        int j = target.length() - 1;
        int ops = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (j < 0) {
                break;
            }

            if (s.charAt(i) == target.charAt(j)) {
                j--;
            } else {
                ops++;
            }
        }

        if (j >= 0) {
            return Integer.MAX_VALUE;
        }

        return ops;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int ans = Integer.MAX_VALUE;

            String[] target = { "00", "25", "50", "75" };

            for (String str : target) {
                ans = Math.min(ans, solve(s, str));
            }

            System.out.println(ans);
        }
    }
}