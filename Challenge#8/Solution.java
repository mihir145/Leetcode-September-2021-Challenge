class Solution {
    public char shift(char ch,int shift){
        return (char)( (ch-'a'+shift) % 26 + 'a');
    }
    public String shiftingLetters(String s, int[] shifts) {
        String ans = "";
        int n = s.length();
        int shift = 0;
        
        for(int i=n-1;i>=0;i--){
            shift = (shift + shifts[i]) % 26;
            ans = shift(s.charAt(i),shift) + ans;
        }
        return ans;
    }
}