import java.util.*;
import java.util.Scanner;
public class win 
{
    public static int suneet(int a1,int a2,int b1,int b2)
    {
        int count = 0;

        if(a1==a2)
        {
            if(a1>b1 && a1>b2)
            {
                count += 4;
            }
            if((a1>b1 && a1<b2)||(a1<b1 && a1>b2))
            {
                count += 1;
            }
        }
        else if(b1==b2)
        {
           if(b1<a1 && b1<a2)
           {
            count += 4;
           }
           if((b1<a1 && b1>a2)||(b1>a1 && b1<a2))
           {
            count += 1;
           }
        }
        else
        {
            if((a1>b1 && a2>b2)||(a1>b2 && a2>b1))
            {
                count += 2;
            }
            if((a1>b1 && a1>b2 && a1>b1 && a2>b2))
            {
                count += 4;
            }
            if((a1>b1 && a2>b1 && a1<b2 && a2<b2)||(a1<b1 && a2<b1 && a1>b2 && a2>b2))
            {
                count += 1;
            }
        }
       
        return count;
    }
 public static void main(String[] args)
 {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    while(t-->0)
    {
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();

        int result = suneet(a1,a2,b1,b2);
        System.out.println(result);
    }
 }   
}
