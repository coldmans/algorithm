import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        int num = 0;
        if(n.equals("0")){
            System.out.println(0);
            System.exit(0);
        }
        else if(n.equals("1")){
            System.out.println(1);
            System.exit(0);
        }
        for(int i = 0; i < n.length(); i++)
            num = num * 2 + Integer.parseInt(String.valueOf(n.charAt(i)));
        
        System.out.print(num);
    }
}
