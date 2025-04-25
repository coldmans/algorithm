import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int pass = scanner.nextInt();

        if (pass >= 80){
            System.out.println("pass");
        }
        else{
            System.out.println(80-pass + " more score");
        }
    }
}