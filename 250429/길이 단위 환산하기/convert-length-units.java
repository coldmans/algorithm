import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        double N = scanner.nextDouble();
        N *= 30.48;
        System.out.printf("%.1f",N);
    }
}