class Solution {
    public void reverseString(char[] s) {
        
        StringBuilder sb = new StringBuilder();
        for(int i=s.length-1; i>=0; i--){
            sb.append(s[i]);
        }
        String rev = sb.toString();
        for(int i=0; i<=s.length-1; i++){
            s[i]=rev.charAt(i);
        }
    
        
    }
}