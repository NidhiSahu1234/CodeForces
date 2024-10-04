import java.util.*;
import java.util.Scanner;
public class sum
{
    public static int sum1(int n)
    {
        int sum =0;
        while(n>0)
        {
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0)
        {
            int digit = sc.nextInt();

            int result = sum1(digit);

            System.out.println(result);
        }
        
    }
}