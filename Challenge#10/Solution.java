package Day10;

import java.util.HashMap;

class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> dp[] = new HashMap[n];

        for(int i=0;i<n;i++){
            dp[i] = new HashMap<>();
        }

        int ans = 0;

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                long diff = (long)nums[i] - nums[j];

                if(diff <= Integer.MIN_VALUE || diff>=Integer.MAX_VALUE)
                    continue;

                int endJ = dp[j].getOrDefault((int)diff,0);
                int endI = dp[i].getOrDefault((int)diff,0);
                ans += endJ;
                dp[i].put((int)diff,endI+endJ+1);
            }
        }

        return ans;
    }
}