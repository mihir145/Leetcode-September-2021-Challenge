package Day2;

import java.util.List;
import java.util.Scanner;

public class Challenge2 {
    public static void preorder(TreeNode root){
        if(root==null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Solution b = new Solution();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<TreeNode> l = b.generateTrees(n);

        for(TreeNode it:l){
            preorder(it);
            System.out.println();
        }
    }
}