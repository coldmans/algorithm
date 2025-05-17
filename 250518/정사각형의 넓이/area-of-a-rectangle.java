import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = n * n;
        System.out.println(s);
        if(s < 24) System.out.println("tiny");
    }
}