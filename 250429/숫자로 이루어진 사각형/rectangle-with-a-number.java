import java.util.Scanner;
public class Main {
    public static void rect(int n){
        int tmp = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(tmp++ + " ");
                if(tmp == 10){
                    tmp = 1;
                }

            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        rect(n);
    }
}