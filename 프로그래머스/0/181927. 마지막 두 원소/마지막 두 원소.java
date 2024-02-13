import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);;
        
        int len = num_list.length - 1;
        int pre = len - 1;
        int last = 0;
        
        if(num_list[len] > num_list[pre])
            last = num_list[len] - num_list[pre];
        else
            last = num_list[len] * 2;
        
        answer[num_list.length] = last;
        
        return answer;
    }
}