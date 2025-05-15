import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer, Integer> visit = new HashMap<>();
        int point = 0;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            // Please write your code here.
            if(dir == 'L'){
                for(int j = point; j >= point-x; j--){
                    visit.put(j, visit.getOrDefault(j,0) + 1);
                }
                point -= x;
            }
            else if(dir == 'R'){
                for(int j = point; j <= point+x; j++){
                    visit.put(j, visit.getOrDefault(j,0) + 1);
                }
                point += x;
            }
        }
        
        List<Integer> twice = new ArrayList<>();
        for(Map.Entry<Integer, Integer> e : visit.entrySet()){
            if(e.getValue() >= 2) twice.add(e.getKey());
        }
        Collections.sort(twice);

        int total = 0;
        if(!twice.isEmpty()){
            int start = twice.get(0), end = start;
            for(int i = 1; i < twice.size(); i++){
                int cur = twice.get(i);
                if(cur == end + 1){
                    end = cur;
                } else {
                    total += (end - start);
                    start = end = cur;
                }
            }
            total += (end - start);
        }
        System.out.println(total);
    }
}