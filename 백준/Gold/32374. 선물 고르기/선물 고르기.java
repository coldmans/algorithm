import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> A = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        List<Integer> B = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            B.add(Integer.parseInt(st.nextToken()));
        }

        List<Integer> C = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < K; i++) {
            C.add(Integer.parseInt(st.nextToken()));
        }

        Map<Integer, Integer> counter = new HashMap<>();
        for(int box : B) {
            counter.put(box, counter.getOrDefault(box, 0) + 1);
        }

        for(int taken : C) {
            counter.put(taken, counter.get(taken) - 1);
            if(counter.get(taken) == 0) {
                counter.remove(taken);
            }
        }

        int maxBox = Collections.max(counter.keySet());

        int answer = -1;
        for(int gift : A) {
            if(gift <= maxBox) {
                answer = Math.max(answer, gift);
            }
        }

        System.out.println(answer);
    }
}