import java.util.*;
public class arr {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);

      int t = sc.nextInt();

      while(t-->0)
      {
        int n = sc.nextInt();

        int[] arr = new int[n];

        int even = 0;
        int odd = 0;

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();

            if(arr[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }

        if(odd%2==0)
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
