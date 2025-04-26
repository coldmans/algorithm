import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int t3 = 0;
        int t5 = 0;
        for(int i = 0; i < 10; i++){
            int tmp = scanner.nextInt();
            if (tmp % 3 == 0) t3 += 1;
            if (tmp % 5 == 0) t5 += 1;
        }
        System.out.println(t3 + " " + t5);
    }
}