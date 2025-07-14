import java.util.*;

public class blank {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0)
        {

            int count = 0;

            int max_length = 0; 

            int n = sc.nextInt();

            int[] arr = new int[n];

            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
        
                if(arr[i]==0)
                {
                    count++;
                }
                else
                {
                    count = 0;
                }
                max_length = Math.max(max_length,count);
            }
            

            System.out.println(max_length);
        }
    }
}
