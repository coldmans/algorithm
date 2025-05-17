import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println(c);
        System.out.printf("%.2f\n",a);
        System.out.printf("%.2f",b);
    }
}