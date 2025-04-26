import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int A[][] = new int[3][3];

        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                A[i][j] = scanner.nextInt();
            }
        }
        scanner.nextLine();

        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                A[i][j] *= scanner.nextInt();
            }
        }
        scanner.nextLine();

        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.printf(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}