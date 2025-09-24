import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int max = 0;
        for(int i = 0; i < N; i++){
            int t = Integer.parseInt(st.nextToken());
            hashMap.put(t, 1);
            list.add(t);
            max = Math.max(max,t);
        }

        for(int i = 0; i < N; i++){
            for(int j = 1; j <= max; j++){
                if(list.get(i) * j > max){
                    break;
                }

                if(hashMap.containsKey(list.get(i) * j)){

                    hashMap.put(list.get(i), hashMap.getOrDefault(list.get(i) , 0) + 1);
                    hashMap.put(list.get(i) * j, hashMap.get(list.get(i) * j) - 1);
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++){
            sb.append(hashMap.get(list.get(i))-1 + " ");
        }
        System.out.println(sb);


    }
}

