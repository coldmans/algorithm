import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);
        int i = 0;
        int j = list.size()-1;
        int res = 0;
        while(j >= 0){
            if(list.get(j) >= M){
                list.remove(j);
                j -= 1;
                res += 1;
            }
            else{
                break;
            }
        }

        while(i < j){
            if(list.get(i) + list.get(j) >= M){
                res += 1;
                i += 1;
                j -= 1;
            }
            else{
                i += 1;
            }
        }
        if(res == 0){
            System.out.println(-1);
        }else {
            System.out.println(res);
        }




    }
}