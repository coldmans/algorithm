import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int [][] N = new int [3][3];
        for (int i = 0; i < 3; i ++){
            for (int j = 0; j < 3; j++){
                N[i][j] = scanner.nextInt() * 3;
            }
        }
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.printf(N[i][j] + " ");
            }
            System.out.println();
        }
    }
}