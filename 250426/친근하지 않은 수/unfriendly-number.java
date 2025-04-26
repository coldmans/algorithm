import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int tmp = 0;
        for(int i = 1; i <= N; i++){
            if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0){
                tmp += 1;
            } 
        }
        System.out.println(N - tmp);
    }
}