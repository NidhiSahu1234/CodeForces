import java.util.*;

public class target {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        int[][] arr1 = {
            {1,1,1,1,1,1,1,1,1,1},
            {1,2,2,2,2,2,2,2,2,1},
            {1,2,3,3,3,3,3,3,2,1},
            {1,2,3,4,4,4,4,3,2,1},
            {1,2,3,4,5,5,4,3,2,1},
            {1,2,3,4,5,5,4,3,2,1},
            {1,2,3,4,4,4,4,3,2,1},
            {1,2,3,3,3,3,3,3,2,1},
            {1,2,2,2,2,2,2,2,2,1},
            {1,1,1,1,1,1,1,1,1,1}
        } ;

        

        while(t-->0)
        {
            char[][] arr = new char[10][10];

            int sum = 0;

            for(int i=0;i<10;i++)
            {
                String line = sc.next();

                for(int j=0;j<10;j++)
                {
                    arr[i][j] = line.charAt(j);

                    if(arr[i][j]=='X')
                    {
                        sum += arr1[i][j];
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
