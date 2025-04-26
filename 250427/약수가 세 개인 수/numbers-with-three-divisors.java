import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int ctt = 0;

        for(int i = start; i <= end; i++){
            int tmp = 0;
            for(int j = 1; j<= i; j++){
                if(i % j == 0){
                    tmp += 1;
                }
            }
            if (tmp == 3){
                ctt += 1;
            }
        }

        System.out.println(ctt);
    }
}