import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int tmp;
        tmp = a;
        a = b;
        b = tmp;
        System.out.println(a + " " + b);
    }
}