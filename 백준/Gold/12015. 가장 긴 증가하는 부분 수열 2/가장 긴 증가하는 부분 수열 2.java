import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;



public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int []arr = new int[N];
        for(int i = 0 ; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i = 1; i < N; i++){
            int x = Collections.binarySearch(list, arr[i]);
            if(x < 0){
                int tmp = (x + 1) * -1;
                if(tmp >= list.size()) list.add(arr[i]);
                else {
                    list.set(tmp, arr[i]);
                }
            }
        }
        System.out.println(list.size());


    }

}

