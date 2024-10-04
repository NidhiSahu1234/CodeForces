import java.util.*;
import java.util.Scanner.*;
import java.lang.Math;
public class Invert
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();

       int digit = 0;

       while(n>0)
       {
        int temp = n%10;

        int inv = 9-temp;

        digit = 10* digit + Math.min(inv,temp);
        
        n=n/10;
    }        

        int inversion = 0;

        while(digit>0)
        {
          inversion = inversion*10+(digit%10);

          digit = digit/10;
        }

        System.out.println(inversion);

       }
    }
