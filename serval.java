import java.util.*;

public class serval {

    static int gcd(int a ,int b)
    {
        if(b==0)
        {
            return a;
        }

        return gcd(b,a%b);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0)
        {
            int n = sc.nextInt();

            int[] arr = new int[n];

            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }

            int flag = 0;

            for(int i=0;i<n;i++)
            {
                for(int j= i+1;j<n;j++)
                {
                    if(gcd(arr[i],arr[j])<=2)
                    {
                        flag = 1;
                    }
                }
            }
                if(flag==1)
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
