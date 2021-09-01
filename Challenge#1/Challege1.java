import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nums[] = new int[n];

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(s.arrayNest(nums));
    }
}
