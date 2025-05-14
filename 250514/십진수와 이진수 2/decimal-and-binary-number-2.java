import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.
        int num = 0;
        for(int i = binary.length()-1; i >= 0; i--){
            if(binary.charAt(i) == '1'){
                num += (int)Math.pow(2,binary.length()-1 -  i);
            }
        }
        num *= 17;

        StringBuilder result = new StringBuilder();
        while(num > 0){
            result.insert(0, num % 2);
            num /= 2;
        }
        System.out.println(result.toString());
    }
}