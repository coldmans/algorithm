import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []wax = new int[N];
        int tmp = 0;
        for(int i = 0; i < N; i++){
            wax[i] = sc.nextInt();
            tmp += wax[i];
        }
        tmp /= N;
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for(int i = tmp+1000; i > 0; i--){
            int t = 0;
            for(int j = 0; j < wax.length; j++){
                if(wax[j] > i){
                    t += wax[j] - i;
                }
                else{
                    t += i - wax[j];
                }
            }
            if(min >= t){
                min = t;
                minIndex = i;
            }
            else{
                break;
            }
        }
        System.out.println(minIndex);

    }
}


