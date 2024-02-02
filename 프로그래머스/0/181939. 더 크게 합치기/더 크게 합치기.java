class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String stra = Integer.toString(a);
        String strb = Integer.toString(b);
        
        String resStr1 = stra + strb;
        String resStr2 = strb + stra;
        
        int resInt1 = Integer.valueOf(resStr1);
        int resInt2 = Integer.valueOf(resStr2);
        
        if(resInt1 >= resInt2)
            answer = resInt1;
        else
            answer = resInt2;
        
        return answer;
    }
}