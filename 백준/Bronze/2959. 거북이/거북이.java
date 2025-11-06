import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list, Collections.reverseOrder());
        int a = Math.min(list.get(0), list.get(1));
        int b = Math.min(list.get(2), list.get(3));
        System.out.println(a*b);



    }
}
