class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int n = keysPressed.length();
        
        char longPressed = keysPressed.charAt(0);
        int longPressedNum = releaseTimes[0];

        for(int i=1;i<n;i++){
            int curr = releaseTimes[i] - releaseTimes[i-1];
            if(curr>longPressedNum){
                longPressedNum = curr;
                longPressed = keysPressed.charAt(i);
            }
            else if(curr==longPressedNum){
                if(longPressed - '0' < keysPressed.charAt(i) - '0'){
                    longPressed = keysPressed.charAt(i);
                }
            }
        }
        return longPressed;
    }
}