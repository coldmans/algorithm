import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                if(i % 2 == 1){
                    System.out.print(j);
                }
                else{
                    System.out.print(N-j+1);
                }
            }
            System.out.println();
        }
    }
}