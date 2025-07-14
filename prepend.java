import java.util.*;

public class prepend {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0)
        {
            int n = sc.nextInt();

            String s = sc.next();

            int ans = n;

            int left = 0;

            int right = n - 1;
 
            while(left<=right)
            {
                if(s.charAt(left) != s.charAt(right))
                {
                    ans -=2;
                }
                else
                {
                    break;
                }
                left++;
                right--;
            }

            System.out.println(ans);
           
        }
    }
}
