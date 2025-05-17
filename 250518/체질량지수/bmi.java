import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int m = scanner.nextInt();
        int b = (10000 * m) / (k * k);
        System.out.println(b);
        if(b >= 25) System.out.println("Obesity");
    }
}