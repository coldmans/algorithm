import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = i;
        }
        // Please write your code here.
        int [][] arr2 = arr.clone();
        Arrays.sort(arr2, (a,b) -> {
            return a[0] - b[0];
        });

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][1] == arr2[j][1]){
                    System.out.print(j+1 + " ");
                    break;
                }
            }
        }
    }
}