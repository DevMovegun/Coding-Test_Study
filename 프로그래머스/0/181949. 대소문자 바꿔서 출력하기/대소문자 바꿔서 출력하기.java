import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //char[] ch = str.toCharArray();
        
        String answer = "";
        
        for(int i = 0; i < str.length(); i++){
            if(Character.isLowerCase(str.charAt(i)))
                answer += Character.toUpperCase(str.charAt(i));
            else
                answer += Character.toLowerCase(str.charAt(i));
        }
        
        System.out.print(answer);
    }
}