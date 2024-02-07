class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int comp = 2 * a * b;
        
        int resAB = Integer.parseInt("" + a + b);
        
        answer = resAB >= comp ? resAB : comp;
        
        return answer;
    }
}