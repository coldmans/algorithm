import java.io.*;
import java.util.*;

public class Main {


    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        List<int []> list = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < N; i++){
            int tmp = Integer.parseInt(st.nextToken());
            if(hashMap.containsKey(tmp)){
                hashMap.put(tmp, hashMap.get(tmp) + 1);
            }
            else{
                hashMap.put(tmp, 1);
                list.add(new int[]{tmp,i});
            }

        }

        Collections.sort(list, new Comparator<int []>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                if(hashMap.get(o2[0]) == hashMap.get(o1[0])){
                    return o1[1] - o2[1];
                };
                return hashMap.get(o2[0]) - hashMap.get(o1[0]);
            }
        });

        for(int i = 0; i < list.size(); i++){
            int []tmp = list.get(i);
            for(int j = 0; j < hashMap.get(tmp[0]); j++){
                System.out.print(tmp[0] + " ");
            }
        }


    }
}