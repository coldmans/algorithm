import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        String[] li = new String[10];
        for (int i = 9; i >= 0; i--){
            li[i] = scanner.next();
        }
        for (int i = 0; i < li.length; i++){
            System.out.print(li[i]);
        }
    }
}