import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int [][] N = new int [4][4];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                N[i][j] = scanner.nextInt();
            }
        }
        int [] li = new int [4];
        for(int i = 0; i < 4; i++){
            int tmp = 0;
            for(int j = 0; j < 4; j++){
                tmp += N[i][j];
            }
            li[i] = tmp;
        }

        for(int i = 0; i < 4; i++){
            System.out.println(li[i]);
        }
    }
}