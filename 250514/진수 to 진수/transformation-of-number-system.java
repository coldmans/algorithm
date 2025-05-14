import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();
        // Please write your code here.
        int decimal = 0;
        for(int i = 0; i < N.length(); i++){
            int digit = N.charAt(i) - '0';
            decimal = decimal * A + digit;
        }

        StringBuilder result = new StringBuilder();
        if(decimal == 0){
            result.append("0");
        } else {
            while (decimal > 0){
                result.insert(0, decimal % B);
                decimal /= B;
            }
        }
        System.out.println(result.toString());
    }
}