import java.util.*;

public class balance{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0)
        {
            int n = sc.nextInt();

            int k = sc.nextInt();

            int[] arr = new int[n];

            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int counter = 1;
            int largest_length = 1;

            for(int i=1;i<n;i++)
            {
                if(arr[i]-arr[i-1]<=k)
                {
                    counter++;
                }
                else
                {
                    counter = 1;
                }

                largest_length = Math.max(counter,largest_length);
            }

                System.out.println(n-largest_length);
            
        }
    }
}