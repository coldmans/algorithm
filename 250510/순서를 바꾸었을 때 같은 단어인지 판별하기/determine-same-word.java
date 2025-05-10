import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        // Please write your code here.
        char [] word1Array = word1.toCharArray();
        char [] word2Array = word2.toCharArray();
        Arrays.sort(word1Array);
        Arrays.sort(word2Array);
        if(word1Array.length != word2Array.length){
            System.out.println("No");
        }
        else{
            boolean isTrue = true;
            for(int i = 0; i < word1Array.length; i++){
                if(word1Array[i] != word2Array[i]){
                    isTrue = false;
                }
            }
            if(isTrue){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }

    }
}