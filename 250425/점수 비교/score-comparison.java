import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in)
        int Amath = scanner.nextInt();
        int Aeng = scanner.nextInt();
        int Bmath = scanner.nextInt();
        int Beng= scanner.nextInt();

        if (Amath > Bmath && Aeng > Beng){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}