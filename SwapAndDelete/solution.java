import java.util.*;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int n = s.length();

            int count0 = 0, count1 = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    count0++;
                } else {
                    count1++;
                }
            }

            int lengtht = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0' && count1 > 0) {
                    count1--;
                    lengtht++;
                } else if (s.charAt(i) == '1' && count0 > 0) {
                    count0--;
                    lengtht++;
                } else {
                    break;
                }
            }

            System.out.println(n - lengtht);
        }
    }
}