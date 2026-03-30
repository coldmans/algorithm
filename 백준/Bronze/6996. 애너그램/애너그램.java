import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        // BufferedReader로 빠른 입력 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++){
           st = new StringTokenizer(br.readLine());
           String s = st.nextToken();
           String s2 = st.nextToken();

           List<Character> list = new ArrayList<>();
           List<Character> list2 = new ArrayList<>();

           for(int j = 0; j < s.length(); j++){
               list.add(s.charAt(j));
           }
           for(int j = 0; j < s2.length(); j++){
               list2.add(s2.charAt(j));
           }

           Collections.sort(list);
           Collections.sort(list2);



           if(list.equals(list2)){
               System.out.println(s + " & " + s2 + " are anagrams.");
           }
           else{
               System.out.println(s + " & " + s2 + " are NOT anagrams.");
           }

        }


    }
}
