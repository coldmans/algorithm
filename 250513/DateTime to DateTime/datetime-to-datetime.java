import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.
        if(A == 11){
            if(B <= 11){
                if(B < 11){
                    System.out.println(-1);
                    System.exit(0);
                }
                if(C < 11){
                    System.out.println(-1);
                    System.exit(0);
                }
            }
        }
        System.out.println(((A * 24) + B) * 60 + C - (((11*24)+11) * 60 + 11));

    }
}