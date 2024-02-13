class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        
        for(char c : control.toCharArray()){
            switch(c) {
                case 'w' :
                    n = n + 1;
                    break;
                case 's' :
                    n = n - 1;
                    break;
                case 'd' :
                    n = n + 10;
                    break;
                case 'a' :
                    n = n - 10;
                    break;
                default :
                    break;
            }
        }
        
        answer = n;
        
        return answer;
    }
}