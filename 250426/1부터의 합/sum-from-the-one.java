import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int tmp = 0;
        for(int i = 1; i <= 100; i++){
            tmp += i;
            if (tmp >= N){
                System.out.println(i);
                break;
            }
        }
    }
}