import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                System.out.print(i + " * " + j + " = " + i*j);
                if(j != N){
                    System.out.print(", ");
                }
                else{
                    System.out.println();
                }
            }
        }
    }
}