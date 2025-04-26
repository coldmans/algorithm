import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String na = a.substring(0,1) + "a" + a.substring(2,a.length()-2) + "a" + a.substring(a.length()-1);
        System.out.println(na);
    }
}