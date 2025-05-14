import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        StringBuilder result = new StringBuilder();

        while(n > 0){
            result.insert(0, n % b);
            n /= b;
        }
        
        System.out.println(result.toString());
    }
}