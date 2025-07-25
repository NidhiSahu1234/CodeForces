import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            
            for(int i=0;i<n;i++) {
                a[i] = sc.nextInt();
            }
            
            int[] copy = Arrays.copyOf(a,a.length);
            Arrays.sort(copy);
            
            if(Arrays.equals(a,copy)||k>1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}