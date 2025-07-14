import java.util.*;
public class desort {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0)
        {
            int n = sc.nextInt();

            int[] arr = new int[n];

            int operations = Integer.MAX_VALUE;

            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }

            for(int i=0;i<n-1;i++)
            {
                if(arr[i]<=arr[i+1])
                {
                    int diff = arr[i+1]-arr[i];
                    int req_operation = diff/2 + 1;
                    operations = Math.min(operations,req_operation);
                }
                else
                {
                    operations = 0;
                }
            }

            System.out.println(operations);
        }
    }
}
