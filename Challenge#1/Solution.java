import java.util.HashSet;
import java.util.Iterator;

class Solution {
    //naive Approach - Gives TLE
    public int arrayNesting(int[] nums) {
        int result = 0;
        int i = 0;
        int n = nums.length;
        while(i<n){
            HashSet hs = new HashSet<>();
            hs.add(nums[i]);        
            int prev = nums[i];
            while(!hs.contains(nums[prev])){
                hs.add(nums[prev]);
                prev = nums[prev];
            }
            result = Math.max(result,hs.size());
            i++;
        }
        return result;
    }
    //Better
    public int arrayNest(int nums[]){
        int result = 0;
        int i = 0;
        int n = nums.length;
        int dup[] = new int[n];
        while(i<n){
            int ans = dup[i];
            if (dup[i] == 0) {
                HashSet<Integer> hs = new HashSet<>();
                hs.add(nums[i]);
                int prev = nums[i];
                while (!hs.contains(nums[prev])) {
                    hs.add(nums[prev]);
                    prev = nums[prev];
                }
                int size = hs.size();
                Iterator<Integer> it = hs.iterator();
                while (it.hasNext()) {
                    dup[it.next()] = size;
                }
            }

            result = Math.max(result,ans);
            i++;
        }
        return result;
    }
}