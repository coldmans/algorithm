import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                int n = scanner.nextInt();
                if (j <= i){
                    res += n;
                }
            }
        }
        System.out.println(res);
    }
}