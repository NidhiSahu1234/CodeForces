import java.util.*;

public class round {

    public static boolean check(int n)
    {
        int count_digit = 0;
        int count_zero = 0;

        while(n > 0)
        {
            int digit = n%10;
            count_digit++;

            if(digit==0)
            {
                count_zero++;
            }

            n /= 10;
        }

        return count_zero == count_digit - 1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        ArrayList<Integer> roundNumbers = new ArrayList<>();
        for(int i=0;i<=999999;i++)
        {
            if(check(i))
            {
                roundNumbers.add(i);
            }
        }

        while(t-- > 0)
        {
            int n = sc.nextInt();

            int answer = 0;

            for(int num: roundNumbers)
            {
                if(num <= n)
                {
                    answer ++;
                }
                else
                {
                    break;
                }
            }
            System.out.println(answer);
        }
    }
}