class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        char comp = ineq.charAt(0);
        char match = eq.charAt(0);
        
        if(comp == '>') {
            if(match == '=')
                answer = n >= m ? 1 : 0;
            else
                answer = n > m ? 1 : 0;
        }
        else {
            if(match == '=')
                answer = n <= m ? 1 : 0;
            else
                answer = n < m ? 1 : 0;
        }
        
        return answer;
    }
}