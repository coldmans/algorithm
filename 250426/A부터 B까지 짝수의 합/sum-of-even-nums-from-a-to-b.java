import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int tmp = 0;
        for(int i = A; i <= B; i++){
            if (i % 2 == 0){
                tmp += i;
            }
        }
        System.out.println(tmp);
    }
}