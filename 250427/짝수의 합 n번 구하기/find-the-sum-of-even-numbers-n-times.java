import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i = 0; i < N; i++){
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int tmp = 0;
            for(int j = A; j <= B; j++){
                if (j % 2 == 0){
                    tmp += j;
                }
            }
            System.out.println(tmp);
        }
    }
}