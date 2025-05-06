import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    static void check(int[] x, int[] y){
        ArrayList<Integer> ready = new ArrayList<>();
        for(int i = 0; i < x.length; i++){
            if(x[i] == y[0]){
                ready.add(i);
            }
        }
        if(ready.isEmpty()){
            System.out.println("No");
            return;
        }
        for(int q = 0; q < ready.size(); q++){
            int i = ready.get(q);
            int j = 0;
            while(i < x.length && j < y.length){
                if(x[i] != y[j]){
                    break;
                }
                i += 1;
                j += 1;
            }
            if(j == y.length){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        // Please write your code here.
        check(a,b);
    }
}