import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        String arr[] = scanner.next().split("-");
        System.out.println(arr[0] + "-"+arr[2] +"-" + arr[1]);
    }
}