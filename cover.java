import java.util.*;

public class cover {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0)
        {
            int n = sc.nextInt();

            String s = sc.next();

            int count1 = 0;
            int count2 = 0;

            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='.')
                {
                    count1++;
                }
                else
                {
                    if(count1>=3)
                    {
                        count2 = 2;
                    }
                    else
                    {
                        count2 += count1;
                        count1 = 0;
                    }
                }  
            }
                if(count1>=3)
                   {
                        count2 = 2;
                    }
                    else
                    {
                        count2 += count1;
                        count1 = 0;
                    }

            System.out.println(count2);
        }
    }
    
}
