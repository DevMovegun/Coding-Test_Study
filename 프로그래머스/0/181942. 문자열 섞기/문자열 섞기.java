class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        // for문의 끝을 파악하기 위한 용도
        int len = str1.length() + str2.length();
        char[] chArr = new char[len];
        
        // 현재 위치
        int s1 = 0;
        int s2 = 0;
        
        for(int i = 0; i < len; i++) {
            if(i % 2 == 0) {
                chArr[i] = str1.charAt(s1);
                s1++;
            }
            else {
                chArr[i] = str2.charAt(s2);
                s2++;
            }
        }
        
        answer = String.valueOf(chArr);
        
        return answer;
    }
}