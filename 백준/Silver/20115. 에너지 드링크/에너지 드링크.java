import java.io.*;
import java.util.*;

public class Main {


    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T  = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < T; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list);
        double t = list.remove(list.size()-1);


        for(int i = 0; i < T-1; i++){
            t += (double) list.get(i)/2;
        }

        System.out.println(t);



    }
}


