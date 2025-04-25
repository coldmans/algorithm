import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int Y = scanner.nextInt();

        if(Y % 4 == 0 ){
            if(Y % 100 == 0 && Y % 400 != 0){
                System.out.println("평년");
            }
            else{
                System.out.println("윤년");
            }
        }
        else{
            System.out.println("평년");
        }
    }
}