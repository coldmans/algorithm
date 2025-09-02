import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static List<Integer> list = new ArrayList<>();
    static String s;

    static void nums(StringBuilder sb, boolean []visited){
        if(sb.length() == s.length()){
            list.add(Integer.parseInt(String.valueOf(sb)));
            return;
        }
        for(int i = 0; i < s.length(); i++){
            if(visited[i] == true) continue;
            sb.append(s.charAt(i));
            visited[i] = true;
            nums(sb, visited);
            visited[i] = false;
            sb.deleteCharAt(sb.length()-1);
        }
    }

    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();
        boolean []visited = new boolean[s.length()];
        StringBuilder sb = new StringBuilder();
        nums(sb, visited);
        Collections.sort(list);
        int y = Integer.parseInt(s);
        for (Integer i : list) {
            if(i > y){
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println(0);




    }
}
