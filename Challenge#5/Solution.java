import java.util.Arrays;

class Solution {
    public String orderlyQueue(String s, int k) {
        if(k==1){
            int n = s.length();
            String ans = s;
            for(int i=0;i<n;i++){
                String curr = s.substring(i) + s.substring(0,i);
                if (curr.compareTo(ans) < 0) ans = curr;
            }
            return ans;
        }
        char ss[]= s.toCharArray();
        Arrays.sort(ss);
        return new String(ss);
    }
}