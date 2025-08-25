import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String []input = br.readLine().split(" ");
        int []arr = new int[N];
        int []gg = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(input[i]);
        }



        for(int i = 0; i < N; i++){
            int tmp = 0;
            int t = -1;
            for(int j = 0; j < N; j++){
                if(gg[j] > i+1 || gg[j] == 0){
                    tmp += 1;
                }
                if(tmp == arr[i]+1) {
                    t = j;
                    break;
                }
            }
            gg[t] = i+1;
        }


        for (int i : gg) {
            System.out.print(i + " ");
        }


    }
}

