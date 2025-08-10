import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        boolean isR = true;
        for(int a = 0; a < 2; a++) {
            String A = sc.nextLine();
            boolean isM = false;
            int x = -1;
            boolean isO = false;
            for (int i = 0; i < A.length(); i++) {
                if (A.charAt(i) == 'a' || A.charAt(i) == 'e' || A.charAt(i) == 'i' || A.charAt(i) == 'o' || A.charAt(i) == 'u') {
                    isM = true;
                    x = i;
                } else {
                    if (isM) {
                        isO = true;
                        break;
                    }
                }
            }
            if (isO) {
                for (int i = 0; i <= x; i++) {
                    stringBuilder.append(A.charAt(i));
                }
            }
            else{
                isR = false;
            }
        }
        if(isR){
            System.out.println(stringBuilder);
        }
        else{
            System.out.println("no such exercise");
        }

    }
}



