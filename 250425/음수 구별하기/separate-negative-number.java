import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(N);
        if (N < 0){
            System.out.println("minus");
        }
    }
}