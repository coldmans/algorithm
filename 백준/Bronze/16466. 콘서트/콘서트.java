import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Long> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            list.add(Long.parseLong(st.nextToken()));
        }
        Collections.sort(list);
        if(list.get(0) != 1){
            System.out.println(1);
            System.exit(0);
        }
        for(int i = 1; i < N; i++){
            if(list.get(i-1) + 1 != list.get(i)){
                System.out.println(list.get(i-1) + 1);
                System.exit(0);
            }
        }
        System.out.println(list.get(N-1) + 1);
    }
}