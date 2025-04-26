import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int ctt = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                int tmp = scanner.nextInt();
                if (tmp % 5 == 0) ctt++;
            }
        }

        System.out.println(ctt);
        
    }
}