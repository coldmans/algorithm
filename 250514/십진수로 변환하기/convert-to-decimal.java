import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] binary = new int[]{1, 1, 1, 0, 1};
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        int num = 0;

        for(int i = 0; i < 5; i++)
            num = num * 2 + Integer.parseInt(String.valueOf(n.charAt(i)));
        
        System.out.print(num);
    }
}
