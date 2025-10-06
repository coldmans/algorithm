import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int []arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        List<Integer> list = new ArrayList<>();
        for(int i = L-1; i < R; i++){
            list.add(arr[i]);
        }
        Collections.sort(list);
        for(int i = L-1; i < R; i++){
            arr[i] = list.get(i-L+1);
        }
        for(int i = 1; i < N; i++){
            if(arr[i] < arr[i-1]){
                System.out.println(0);
                System.exit(0);
            }
        }
        System.out.println(1);

    }
}
