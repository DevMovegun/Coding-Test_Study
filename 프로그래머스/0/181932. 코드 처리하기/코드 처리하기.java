class Solution {
    public String solution(String code) {
        String answer = "";
        String ret = "";
        char[] tmp = code.toCharArray();
        int mode = 0;
        
        for(int idx = 0; idx < code.length(); idx++) {
            if(mode == 0) {
                if(tmp[idx] != '1') {
                    if(idx % 2 != 1)
                        ret += "" + tmp[idx];
                }
                else
                    mode = 1;
            }
            else {
                if(tmp[idx] != '1') {
                    if(idx % 2 == 1)
                        ret += "" + tmp[idx];
                }
                else
                    mode = 0;
            }
        }
        
        if(ret == "")
            answer = "EMPTY";
        else
            answer = ret;
        
        return answer;
    }
}