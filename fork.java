import java.util.*;

public class fork {

    static int[] dx = {-1,1,-1,1};
    static int[] dy = {-1,-1,1,1};

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();

            long x_king = sc.nextLong();
            long y_king = sc.nextLong();

            long x_queen = sc.nextLong();
            long y_queen = sc.nextLong();

            Set<String> kingHits = new HashSet<>();
            Set<String> queenHits = new HashSet<>();

            for(int j=0;j<4;j++)
            {
                kingHits.add((x_king+dx[j]*a) + "," + (y_king + dy[j]*b));
                kingHits.add((x_king+dx[j]*b) + "," + (y_king + dy[j]*a));

                queenHits.add((x_queen+dx[j]*a)+"," + (y_queen + dy[j]*b));
                queenHits.add((x_queen+dx[j]*b)+ "," + (y_queen + dy[j]*a));
            }

            int ans = 0;

            for(String position: kingHits)
            {
                if(queenHits.contains(position))
                {
                    ans++;
                }
            }
            System.out.println(ans);
        }


    }
}