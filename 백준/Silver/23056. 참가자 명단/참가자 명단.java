import java.io.*;
import java.util.*;

public class Main {

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<String[]> []arr = new List[N+1];
        for(int i = 0; i <= N; i++){
            arr[i] = new ArrayList<>();
        }
        List<String[]> arr2 = new ArrayList<>();
        List<String[]> arr3 = new ArrayList<>();

        while(true){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            if(a == 0  && s.equals("0")){
                break;
            }
            if(arr[a].size() >= M) continue;
            arr[a].add(new String[]{a+"", s});
            if(a % 2 == 1) {
                arr2.add(new String[]{a + "", s});
            }
            else{
                arr3.add(new String[]{a + "", s});
            }
        }

        Comparator<String[]> customComparator = Comparator
                .comparingInt((String[] o) -> Integer.parseInt(o[0]))
                        .thenComparing(o -> o[1].length())
                                .thenComparing(o ->o[1]);

        arr2.sort(customComparator);
        arr3.sort(customComparator);



        for (String[] strings : arr2) {
            System.out.println(strings[0] + " " + strings[1]);
        }

        for (String[] strings : arr3) {
            System.out.println(strings[0] + " " + strings[1]);
        }

    }
}
