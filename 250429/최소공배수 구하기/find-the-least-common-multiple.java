import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b){
        int a1 = a;
        int b1 = b;
        while (a != 0){
            int tmp = a;
            a = b % a;
            b = tmp;
        }
        return a1 * b1 / b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        int a = gcd(n,m);
        System.out.println(a);
    }
}