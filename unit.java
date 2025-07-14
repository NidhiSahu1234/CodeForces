import java.util.*;

public class unit {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        while(t-->0)
        {
            int n = sc.nextInt();

            int neg1 = 0;
            int pos1 = 0;

            int[] arr = new int[n];

            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();

                if(arr[i]==1)
                {
                    pos1++;
                }
                else
                {
                    neg1++;
                }
            }

            int ops = 0;

            while(pos1<neg1 || neg1%2==1)
            {
                neg1--;
                pos1++;
                ops++;
            }

            System.out.println(ops);
        }
    }
}
