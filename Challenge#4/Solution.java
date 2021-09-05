import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    List<HashSet<Integer>> tree;
    int  res[],count[];
    int[] sumOfDistancesInTree(int n, int edges[][])
    {
        tree = new ArrayList<>();
        res = new int[n];
        count = new int[n];
        for(int i=0;i<n;i++){
            tree.add(new HashSet<>());
            count[i] = 1;
        }

        for(int it[]: edges)
        {
            tree.get(it[0]).add(it[1]);
            tree.get(it[1]).add(it[0]);
        }

        dfs(0, -1);
        dfs2(0, -1);
        return res;
    }
    void dfs(int root, int pre)
    {
        for(Integer i: tree.get(root))
        {
            if(i == pre)
                continue;

            dfs(i, root);
            count[root] += count[i]; 
            res[root] += res[i] + count[i];
        }
    }
    void dfs2(int root, int pre)
    {
        for(Integer i: tree.get(root))
        {
            if(i == pre)
                continue;

            res[i] = res[root] - count[i] + count.length - count[i]; 
            dfs2(i, root);
        }
    }
}