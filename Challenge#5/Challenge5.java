import java.util.Scanner;

public class Chellenge5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Solution s = new Solution();
        String str = sc.next();
        int k = sc.nextInt();

        System.out.println(s.orderlyQueue(str,k));
    }
}
