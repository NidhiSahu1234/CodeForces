import java.util.*;
public class twin {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0)
        {
            int n = sc.nextInt();

            int[] arr = new int[n];

            int[] ans = new int[n];

            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();

                ans[i] = n+1-arr[i];
            }

            for(int i=0;i<n;i++)
            {
                System.out.print(ans[i] + " ");
            }
        }
    }
}
