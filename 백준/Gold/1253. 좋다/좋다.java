import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        int is = 0;
        for(int i = 0; i < N; i++){
            int tmp = Integer.parseInt(st.nextToken());
            list.add(tmp);
            if(tmp == 0){
                is += 1;
            }
        }


        Collections.sort(list);
        int ctt = 0;
        for(int k = 0; k < N; k++){
            int i = 0;
            int j = N-1;
            if(i == k){
                i += 1;
            }
            if(j == k){
                j -= 1;
            }
            while(i < j){
                int ir = list.get(i);
                int jr = list.get(j);
                if(ir + jr == list.get(k)){
                    ctt += 1;
                    break;
                }
                else if(ir + jr < list.get(k)){
                    i += 1;
                    if(i == k){
                        i += 1;
                    }
                }
                else{
                    j -= 1;
                    if(j == k){
                        j -= 1;
                    }
                }
            }

        }

        System.out.println(ctt);

    }
}