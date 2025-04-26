import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        while (true){
            int x = scanner.nextInt();
            if (x == 25){
                System.out.println("Good");
                break;
            }
            else if (x < 25){
                System.out.println("Higher");
            }
            else{
                System.out.println("Lower");
            }
        }
    }
}