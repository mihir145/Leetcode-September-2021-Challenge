import java.util.Arrays;
import java.util.Scanner;

public class Chellenge4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        int n = sc.nextInt();
        int edges[][] = new int[n-1][2];
        for(int i=0;i<n-1;i++){
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
        }
        System.out.println(Arrays.toString(s.sumOfDistancesInTree(n,edges)));
    }
}
