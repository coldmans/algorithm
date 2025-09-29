import java.io.*;
import java.util.*;


public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < 5; i++){
            set.add(Integer.parseInt(st.nextToken()));
        }
        int []res = new int[5];
        for(int k = 0; k < 5; k++) {
            for (int i = 1; i <= 5; i++) {
                if (set.contains(i+k)) {
                    res[k] += 1;
                }
            }
        }
        int t = Arrays.stream(res).max().getAsInt();
        System.out.println(5-t);


    }
}

