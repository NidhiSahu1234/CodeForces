import java.util.*;

public class sequence
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
         
        while(t-->0)
        {
            ArrayList<Integer> list = new ArrayList<>();

            int n = sc.nextInt();

            int[] arr = new int[n];

            arr[0] = sc.nextInt();
            list.add(arr[0]);

            for(int i=1;i<n;i++)
            {
                arr[i] = sc.nextInt();

                if(arr[i]>=arr[i-1])
                {
                    list.add(arr[i]);
                }
                else
                {
                    list.add(arr[i]);
                    list.add(arr[i]);
                }
            }

            int m = list.size();

            System.out.println(list.size());

            for(int i=0;i<m;i++)
            {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }
    }
}