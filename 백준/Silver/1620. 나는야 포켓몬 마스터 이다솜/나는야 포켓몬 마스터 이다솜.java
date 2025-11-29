import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        String[] nameArr = new String[N + 1];

        for(int i = 1; i <= N; i++){
            String name = br.readLine();
            map.put(name, i);
            nameArr[i] = name;
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < M; i++){
            String question = br.readLine();

            if(Character.isDigit(question.charAt(0))){
                int index = Integer.parseInt(question);
                sb.append(nameArr[index]).append("\n");
            } else {
                sb.append(map.get(question)).append("\n");
            }
        }

        System.out.println(sb);
    }
}