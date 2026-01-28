import java.io.*;
import java.util.*;

public class Main {


    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        HashMap<String, Integer> hashMap = new HashMap<>();
        List<PriorityQueue<Integer>> lists = new ArrayList<>();
        long result = 0;


        int q = Integer.parseInt(st.nextToken());
        for(int i = 0; i < q; i++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int index;
            if(n == 1){
                String tmp = st.nextToken();
                if(hashMap.containsKey(tmp)){
                    index = hashMap.get(tmp);
                }
                else {
                    index = lists.size();
                    hashMap.put(tmp, index);
                    PriorityQueue Queue = new PriorityQueue(Collections.reverseOrder());
                    lists.add((PriorityQueue<Integer>) Queue);
                }

                int ctt = Integer.parseInt(st.nextToken());
                for(int j = 0; j < ctt; j++){
                    lists.get(index).add(Integer.parseInt(st.nextToken()));
                }
            }
            else{
                String tmp = st.nextToken();
                int count = Integer.parseInt(st.nextToken());
                if(hashMap.containsKey(tmp)){
                    index = hashMap.get(tmp);
                    for(int j = 0; j < count; j++){
                        if(!lists.get(index).isEmpty()){
                            result += lists.get(index).poll();
                        }
                        else{
                            break;
                        }
                    }
                }
            }
        }

        System.out.println(result);




    }
}