import java.util.*;
import java.util.Scanner;
import java.lang.Math;

public class min
{

    public static int isPerfect(int n ,int k)
    {
        for(int i=0;i<n;i++)
        {
            double power = Math.pow(k,i);
            if(power==n)
            {
                return -1;
            }
            else if(power>n)
            {
                return i-1;
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);

      int t = sc.nextInt();

      while(t-->0)
      {
        int n = sc.nextInt();

        int k = sc.nextInt();

        if(k>n || k==1)
        {
            System.out.println(n);
        }
        else
        {
            int cnt = 0;
            while(n>0)
            {
              if(isPerfect(n,k)==-1)
              {
                cnt += 1;
                n = 0;
              }
              else 
              {
                cnt +=1;
                n = (int) (n- Math.pow(k,isPerfect(n,k)));
              }
            }
            System.out.println(cnt);
        }

      }
    }
}