import java.util.*;
public class chemistry {
         public static void main(String[] args)
         {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while(t-->0)
            {
                long n = sc.nextLong();

                long k = sc.nextLong();

                String s = sc.next();

                int[] frequency = new int[26];

                for(int i=0;i<n;i++)
                {
                    frequency[s.charAt(i) -'a']++;
                }

                long oddfreq = 0;

                for(int i=0;i<26;i++)
                {
                    oddfreq += frequency[i]%2;
                }

                if(oddfreq - k <=1)
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
