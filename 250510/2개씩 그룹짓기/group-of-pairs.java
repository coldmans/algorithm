import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }
        // Please write your code here.
        Integer[] num = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(num, Collections.reverseOrder());
        int tmp = 0;

        for(int i = 0; i < n; i++){
            if(tmp < num[i] + num[2 * n-i-1]){
                tmp = num[i] + num[2 * n-i-1];
            }
        }
        System.out.println(tmp);
    }
}
