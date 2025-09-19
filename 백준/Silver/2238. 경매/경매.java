import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int U = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        List<String> list1= new ArrayList<>();
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int num = Integer.parseInt(st.nextToken());
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
            list1.add(s);
            list.add(num);
        }

        int mis = Integer.MAX_VALUE;
        int mini = -1;
        for(int i = 0; i <= U; i++){
            if(hashMap.containsKey(i)){
                if(hashMap.get(i) < mis){
                    mis = hashMap.get(i);
                    mini = i;
                }
            }
        }

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == mini){
                System.out.println(list1.get(i)+" "+ mini);
                break;
            }
        }

    }
}