class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int sum = 0;
        int mul = 1;
        
        for(int a : num_list) {
            sum = sum + a;
            mul = mul * a;
        }
        
        if(mul < sum * sum)
            answer = 1;
        
        return answer;
    }
}