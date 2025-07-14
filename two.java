import java.util.*;

public class two {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0)
        {
            int n = sc.nextInt();

            int notwo = 0;

            int[] arr = new int[n];

            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();

                if(arr[i]==2)
                {
                    notwo++;
                }
            }

            int ans = -1;
            int currtwo = 0;

            for(int i=0;i<n;i++)
            {   
                if(arr[i]==2)
                {
                    currtwo++;
                }
                    
                if(currtwo == notwo-currtwo)
                {
                    ans = i+1;
                    break;
                }
                
            }
            System.out.println(ans);
            
        }
    }
}
