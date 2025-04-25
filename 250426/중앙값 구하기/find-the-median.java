import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if (A < B && B < C) System.out.println(B);
        else if (C < B && B < A) System.out.println(B);
        else if (B < A && A < C) System.out.println(A);
        else if (C < A && A < B) System.out.println(A);
        else if (B < C && C < A) System.out.println(C);
        else if (A < C && C < B) System.out.println(C);
    }
}