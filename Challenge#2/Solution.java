package Day2;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<TreeNode> generateBSTs(int low,int high){
        List<TreeNode> ans = new ArrayList<>();

        if(low > high) ans.add(null);
        else{
            for(int i=low; i<=high; i++){
                List<TreeNode> leftSubtrees = generateBSTs(low,i-1);
                List<TreeNode> rightSubtrees = generateBSTs(i+1,high);

                for(TreeNode leftSubtree : leftSubtrees ){
                    for(TreeNode rightSubtree : rightSubtrees){
                        TreeNode root = new TreeNode(i);
                        root.left = leftSubtree;
                        root.right = rightSubtree;
                        ans.add(root);
                    }
                }
            }
        }

        return ans;
    }
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<>();

        return generateBSTs(1, n);
    }
}