import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        while(A <= B){
            System.out.print(A + " ");
            if(A % 2 == 1){
                A *= 2;
            }
            else{
                A += 3;
            }
        }

    }
}