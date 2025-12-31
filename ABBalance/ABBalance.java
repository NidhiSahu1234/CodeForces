import java.util.*;

public class ABBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        sc.nextLine();

        while (t-- > 0) {
            String s = sc.nextLine();
            int n = s.length();

            if (s.charAt(0) != s.charAt(n - 1)) {
                if (s.charAt(0) == 'a') {
                    s = 'b' + s.substring(1);
                } else {
                    s = 'a' + s.substring(1);
                }
            }
            System.out.println(s);
        }
    }
}