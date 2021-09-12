package Day11;

import java.util.Stack;

class Solution {
    public int calculate(String s) {
        int n = s.length();
        Stack<Integer> st = new Stack<>();

        int sign = 1;
        int ans = 0;
        int currNo = 0;



        for(int i=0;i<n;i++){
            if(Character.isDigit(s.charAt(i))){
                currNo = s.charAt(i) - '0';
                while(i+1<n && Character.isDigit(s.charAt(i+1))){
                    currNo = currNo * 10 + s.charAt(i+1) - '0';
                    i++;
                }
                currNo *= sign;
                ans += currNo;
                currNo = 0;
                sign = 1;
            }
            else if(s.charAt(i) == '+'){
                sign = 1;
            }
            else if(s.charAt(i) == '-'){
                sign = -1;
            }
            else if(s.charAt(i) == '('){
                st.push(ans);
                st.push(sign);
                ans = 0;
                sign = 1;
            }
            else if(s.charAt(i)==')'){
                int prevSign = st.pop();
                ans = prevSign * ans;
                int prevAns = st.pop();
                ans += prevAns;
            }
        }
        return ans;
    }
}