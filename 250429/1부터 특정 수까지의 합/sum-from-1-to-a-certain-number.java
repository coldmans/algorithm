import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int tmp = 0;
        for(int i = 1; i <= n; i++){
            tmp += i;
        }
        System.out.println(tmp / 10);

    }
}