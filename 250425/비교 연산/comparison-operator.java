import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if(A >= B){
            System.out.println(1);
            if (A > B){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
        else{
            System.out.println(0);
            System.out.println(0);
        }

        if(B >= A){
            System.out.println(1);
            if (B > A){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
        else{
            System.out.println(0);
            System.out.println(0);
        }

        if(A==B){
            System.out.println(1);
            System.out.println(0);
        }
        else{
            System.out.println(0);
            System.out.println(1);
        }



    

    }
}