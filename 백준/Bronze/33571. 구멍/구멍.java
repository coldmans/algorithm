import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ctt = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'A' || s.charAt(i) == 'a' || s.charAt(i) == 'b' || s.charAt(i) == 'D' || s.charAt(i) == 'd' || s.charAt(i) == 'e' || s.charAt(i) == 'g' || s.charAt(i) == 'O' || s.charAt(i) == 'o' || s.charAt(i) == 'P' || s.charAt(i) == 'p' || s.charAt(i) == 'Q'|| s.charAt(i) == 'q' || s.charAt(i) == 'R' || s.charAt(i) == '@'){
                ctt += 1;
            }
            else if(s.charAt(i) == 'B'){
                ctt += 2;
            }
        }
        System.out.println(ctt);
    }
}
