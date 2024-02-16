class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int len = numLog.length;
        int tmp = 0;
        
        for(int i = 1; i < len; i++) {
            tmp = numLog[i] - numLog[i-1];
            switch(tmp) {
                case 1 :
                    answer += "w";
                    break;
                case -1 :
                    answer += "s";
                    break;
                case 10 :
                    answer += "d";
                    break;
                case -10 :
                    answer += "a";
                    break;
                default :
                    break;
            }
        }
        
        return answer;
    }
}