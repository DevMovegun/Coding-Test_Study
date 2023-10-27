import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int bulYear = sc.nextInt();
        int seoYear = bulYear - 543;
        
        System.out.print(seoYear);
    }
}