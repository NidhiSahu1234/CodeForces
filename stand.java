import java.util.*;
public class stand {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0)
        {
            int n = sc.nextInt();

            int[] arr = new int[n];

            int min = Integer.MIN_VALUE;

            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();

                min = Math.max(arr[i],min);
            }

            ArrayList<Integer> listb = new ArrayList<>();

            ArrayList<Integer> listc = new ArrayList<>();

            for(int i=0;i<n;i++)
            {
                if(arr[i] != min)
                {
                  listb.add(arr[i]);
                }
                else
                {
                    listc.add(arr[i]);
                }

            }

            if(listb.size()==0)
            {
               System.out.println(-1);
            }
            else
            {
                System.out.print(listb.size() + " " + listc.size());

                System.out.println();

                for(int i=0;i<listb.size();i++)
                {
                    System.out.print(listb.get(i) + " ");
                }

                System.out.println();

                for(int i=0;i<listc.size();i++)
                {
                    System.out.print(listc.get(i) + " ");
                }

                System.out.println();
            }


        }
    }
}
