import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);

        int x = 0;
        int y = 0;
        int ctt = 0;

        for(int i = 0; i < N; i++){
            if(list.get(i) > x){
                ctt += 1;
                x = list.get(i);
            }
            else if(list.get(i) > y){
                ctt += 1;
                y = list.get(i);
            }
        }
        System.out.println(ctt);





    }

}
