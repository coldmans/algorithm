import java.util.Scanner;
public class Main {
    public static void zzac(int n[]){
        for(int i = 0; i < n.length; i++){
            if (n[i] % 2 == 0){
                n[i] /= 2;
            } 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        zzar(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}