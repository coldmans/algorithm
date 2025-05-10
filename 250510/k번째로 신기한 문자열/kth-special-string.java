import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        // Please write your code here.
        int tmp = 0;
        Arrays.sort(words);
        for(int i = 0; i < n; i++){
            if(t.charAt(0) == words[i].charAt(0)){
                if(t.length() > words[i].length()){
                    continue;
                }
                boolean isTrue = true;
                for(int j = 0; j < t.length(); j++){
                    if(t.charAt(j) != words[i].charAt(j)){
                        isTrue = false;
                    }
                }
                if(isTrue){
                    tmp++;
                    if(tmp == k){
                        System.out.println(words[i]);
                        break;
                    }
                }
            }
        }
    }
}