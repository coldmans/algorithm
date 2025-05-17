import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int ga = scanner.nextInt();
        int se = scanner.nextInt();
        ga += 8;
        se *= 3;
        System.out.println(ga);
        System.out.println(se);
        System.out.println(ga*se);
    }
}