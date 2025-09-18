import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        set.add('C');
        set.add('A');
        set.add('M');
        set.add('B');
        set.add('R');
        set.add('I');
        set.add('D');
        set.add('G');
        set.add('E');

        String s = br.readLine();

        for(int i = 0; i < s.length(); i++){
            if(set.contains(s.charAt(i))){
                continue;
            }
            sb.append(s.charAt(i));
        }

        System.out.println(sb);

    }
}