import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        Integer N = Integer.parseInt(st.nextToken());
        Integer C = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);

        int max = (list.get(list.size()-1) - list.get(0));
        int min = 1;

        while(min < max){
            int mid = ((max + min) / 2) + 1;
            int mi = list.get(0);
            int ctt = 1;
            for(int i = 1; i < N; i++){
                if(list.get(i) - mi >= mid){
                    mi = list.get(i);
                    ctt += 1;
                }
            }
            if(ctt >= C){
                min = mid;
            }
            else{
                max = mid - 1;
            }
        }

        System.out.println(min);


    }
}