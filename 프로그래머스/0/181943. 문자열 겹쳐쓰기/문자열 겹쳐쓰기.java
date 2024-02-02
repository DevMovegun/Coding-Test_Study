class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        char[] ch = my_string.toCharArray();
        
        for(int i = 0; i < overwrite_string.length(); i++) {
            ch[s+i] = overwrite_string.charAt(i);
        }
        
        answer = String.valueOf(ch);
        
        return answer;
    }
}