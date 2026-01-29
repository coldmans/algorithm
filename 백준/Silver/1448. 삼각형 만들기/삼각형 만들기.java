import java.io.*;
import java.util.*;

public class Main {


    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++){
            int tmp = Integer.parseInt(br.readLine());
            list.add(tmp);
        }

        Collections.sort(list, Collections.reverseOrder());

        boolean isOk = false;

        for(int i = 0; i < list.size()-2; i++){
            if(list.get(i+1) + list.get(i+2) > list.get(i)){
                System.out.println(list.get(i) + list.get(i+1) + list.get(i+2));
                isOk = true;
                break;
            }
        }

        if(!isOk) {
            System.out.println(-1);
        }


    }
}