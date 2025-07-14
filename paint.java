import java.util.*;
public class paint {
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);

     int t = sc.nextInt();

     while(t-->0)
     {
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        Map<Integer,Integer> freqmap = new TreeMap<>();

        for(int i=0;i<n;i++)
        {
         freqmap.put(arr[i],freqmap.getOrDefault(arr[i],0)+1);
        }

        if(freqmap.size()>=3)
        {
         System.out.println("No");
        }
        else
        {
         int freq1 = freqmap.entrySet().iterator().next().getValue();
         int freq2 = ((TreeMap<Integer,Integer>) freqmap).lastEntry().getValue();

         if(freq1==freq2)
         {
            System.out.println("Yes");
         }
         else if (n%2 == 1 && Math.abs(freq1-freq2)==1) {
            System.out.println("Yes");
         }
         else
         {
            System.out.println("No");
         }
        }
     }
   } 
}
