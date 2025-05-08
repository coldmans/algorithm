import java.util.Scanner;
public class Main {
    public static void flower(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        flower(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        flower(n);
    }
}