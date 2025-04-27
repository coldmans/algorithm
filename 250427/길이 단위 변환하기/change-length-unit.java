import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        double fe = 9.2;
        double mi = 1.3;

        System.out.printf("%.1fft = %.1fcm\n",fe,fe*30.48);
        System.out.printf("%.1fmi = %.1fcm",mi,mi*160934);
    }
}