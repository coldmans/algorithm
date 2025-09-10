import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        int []arr = new int[a];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < a; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] parent = new int[a];
        int[] position = new int[a];

        Arrays.fill(parent, -1);

        int[] lastIndex = new int[a];
        Arrays.fill(lastIndex, -1);

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < a; i++){
            int b = Collections.binarySearch(list, arr[i]);
            if(b < 0){
                int tmp = (b + 1) * -1;
                if(tmp >= list.size()){
                    list.add(arr[i]);
                }
                else{
                    list.set(tmp, arr[i]);
                }
                position[i] = tmp;

                if(tmp > 0){
                    parent[i] = lastIndex[tmp - 1];
                }
                lastIndex[tmp] = i;
            }

        }

        List<Integer> result = new ArrayList<>();

        int last = lastIndex[list.size() - 1];

        while(last != -1){
            result.add(arr[last]);
            last = parent[last];
        }

        Collections.reverse(result);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < result.size(); i++){
            sb.append(result.get(i) + " ");
        }
        System.out.println(result.size());
        System.out.println(sb);


    }
}
