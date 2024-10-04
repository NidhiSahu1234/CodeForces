import java.util.*;
import java.util.Scanner;
public class shower 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0)
        {
            int n = sc.nextInt();

            int s = sc.nextInt();

            int m = sc.nextInt();

            int b = 0;

            int flag = 0;

            while(n-->0)
            {
                int l = sc.nextInt();

                int r = sc.nextInt();

                b = l-b;
                if(b>=s)
                {
                    flag = 1;
                }

                b = r;
            }

            if(flag==1)
            {
                System.out.println("YES");
            }
            else if(m-b>=s)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }

        }
    }
    
}
