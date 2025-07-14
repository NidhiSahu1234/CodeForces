import java.util.*;

public class ambitious {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i=0;i<N;i++)
        {
          arr[i] = Math.abs(sc.nextInt());    
        }

        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}
