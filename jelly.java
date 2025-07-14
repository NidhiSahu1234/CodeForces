import java.util.*;

public class jelly
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0)
        {
            long a = sc.nextInt();

            long b = sc.nextInt();

            int n = sc.nextInt();

            long[] x = new long[n];

            for(int i=0;i<n;i++)
            {
                x[i] = sc.nextInt();
                b +=  Math.min(a-1,x[i]);
            }
            
            System.out.println(b);
        }
    }
}