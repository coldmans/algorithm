import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        // Please write your code here.\
        Integer[] ca = Arrays.stream(a).boxed().toArray(Integer[]::new);
        Integer[] cb = Arrays.stream(b).boxed().toArray(Integer[]::new);
        Arrays.sort(ca);
        Arrays.sort(cb);
        boolean isTrue = true;
        for(int i = 0; i< n; i++){
            if(ca[i] != cb[i]){
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