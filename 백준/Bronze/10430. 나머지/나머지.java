//첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C
import java.util.Scanner;

public class Main {
    public static void modular(int a, int b, int c) {
        System.out.println((a+b) % c);
        System.out.println(((a%c) + (b%c)) % c );
        System.out.println((a*b) % c);
        System.out.print(((a%c) * (b%c)) % c );
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        
        modular(i, j, k);
    }
}