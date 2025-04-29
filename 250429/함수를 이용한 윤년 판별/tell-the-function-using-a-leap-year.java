import java.util.Scanner;

public class Main {
    public static void yoon(int n){
        if(n % 4 == 0){
            if(n % 100 == 0 && n % 400 != 0){
                System.out.println("false");
            }
            else{
                System.out.println("true");
            }
        }
        else{
            System.out.println("false");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        // Please write your code here.
        yoon(y);

    }
}