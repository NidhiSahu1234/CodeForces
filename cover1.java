import java.util.*;

public class cover1 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0)
        {
            int n = sc.nextInt();

            String s = sc.next();

            boolean isCover = false;

            int count = 0;

            for(int i=0;i<n;i++)
            {
                if(s.charAt(i) =='.' && i+1<n && s.charAt(i+1) == '.' && i+2<n && s.charAt(i+2)=='.')
                {
                    isCover = true;
                    break;
                }
                if(s.charAt(i)=='.')
                {
                    count++;
                }
            }

            if(isCover)
            {
                System.out.println(2);
            }
            else
            {
                System.out.println(count);
            }
        }
    }
    
}
