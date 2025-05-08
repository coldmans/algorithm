import java.util.Scanner;

public class Main {
    public static int prin(int n){
        if(n <= 0){
            return 0;
        }
        return n + prin(n-2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(prin(n));

    }
}