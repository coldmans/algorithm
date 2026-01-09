import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;

    static int find(int x, int[] jump) {
        if (x == 0) return 0;
        if (jump[x] == x) return x;
        return jump[x] = find(jump[x], jump);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        List<int[]> list = new ArrayList<>();
        int max = 0;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.add(new int[]{a,b});
            max = Math.max(max, a);
        }

        int [] arr = new int[max+1];
        int [] jump = new int[max+1];

        for(int i = 0; i <= max; i++){
            jump[i] = i;
        }

        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });

        for(int i = 0; i < N; i++){
            int []tmp = list.get(i);
            if(arr[tmp[0]] == 0){
                arr[tmp[0]] = tmp[1];
                jump[tmp[0]] = tmp[0] - 1;
            }
            else{
                int d = find(tmp[0], jump);
                if(d > 0){
                    arr[d] = tmp[1];
                    jump[d] = d - 1;
                }
            }
        }

        int res = 0;
        for(int i = 0; i < arr.length; i++){
            res += arr[i];
        }
        System.out.println(res);



    }
}