import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        String[] friuts = {"apple", "banana", "grape", "blueberry", "orange"};
        String tmp = scanner.nextLine();
        int ctt = 0;
        for(int i = 0; i < 5; i++){
            if(friuts[i].charAt(2) == tmp.charAt(0) || friuts[i].charAt(3) == tmp.charAt(0)){
                System.out.println(friuts[i]);
                ctt += 1;
            }
        }    
        System.out.println(ctt);   
    }
}