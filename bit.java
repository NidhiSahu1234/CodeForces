import java.util.*;
import java.util.Scanner;

class bit
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();

      int X =0;

      for(int i=0;i<n;i++)
      {
        String a = sc.next();

        if(a.contains("++"))
        {
            X +=1;
        }
        else if(a.contains("--"))
        {
            X -= 1;
        }
      }

      System.out.println(X);
    }
}