class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        // for문의 끝을 파악하기 위한 용도
        int len = str1.length() + str2.length();
        char[] chArr = new char[len];
        
        // 현재 위치
        int index1 = 0;
        int index2 = 0;
        
        for(int i = 0; i < len; i++) {
            if(i % 2 == 0) {
                chArr[i] = str1.charAt(index1);
                index1++;
            }
            else {
                chArr[i] = str2.charAt(index2);
                index2++;
            }
        }
        
        answer = String.valueOf(chArr);
        
        return answer;
    }
}