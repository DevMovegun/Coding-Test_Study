import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int i, j = 0;
        int len = queries.length;
        
        for(int idx = 0; idx < len; idx++) {
            i = queries[idx][0];
            j = queries[idx][1];
            
            int tmp = 0;
            
            tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        
        answer = Arrays.copyOf(arr, arr.length);
        
        return answer;
    }
}