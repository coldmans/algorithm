import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n < 0){
            System.out.println("ice");
        }
        else if (n < 100){
            System.out.println("water");
        }
        else{
            System.out.println("vapor");
        }
    }
}