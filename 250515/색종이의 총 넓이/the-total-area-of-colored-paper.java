import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] rect = new int[201][201];
        for (int k = 0; k < n; k++) {
            int x = sc.nextInt() + 100;
            int y = sc.nextInt() + 100;
            for(int i = x; i < x + 8; i++){
                for(int j = y; j < y + 8; j++){
                    rect[i][j] = 1;
                }
            }
        }
        int sum = 0;
        // Please write your code here.
        for(int i = 0; i < 201; i++){
            for(int j = 0; j < 201; j++){
                if(rect[i][j] == 1){
                    sum ++;
                }
            }
        }
        System.out.println(sum);
    }
}