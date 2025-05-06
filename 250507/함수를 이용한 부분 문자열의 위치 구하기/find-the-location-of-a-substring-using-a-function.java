import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();
        // Please write your code here.
        boolean tmp = false;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == pattern.charAt(0) && tmp == false){
                int k = i;
                int j = 0;
                while(k < text.length() || j < pattern.length()){
                    if(text.charAt(k) != pattern.charAt(j)){
                        break;
                    }
                    k += 1;
                    j += 1;
                }
                if(j == pattern.length()){
                    System.out.println(i);
                    tmp = true;
                    break;
                }
            }
        }
        if(tmp == false){
            System.out.println(-1);
        }
    }
}