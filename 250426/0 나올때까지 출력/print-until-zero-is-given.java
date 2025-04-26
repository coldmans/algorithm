import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        while (true){
            int N = scanner.nextInt();
            if (N == 0){
                break;
            }
            System.out.println(N);
        }
    }
}