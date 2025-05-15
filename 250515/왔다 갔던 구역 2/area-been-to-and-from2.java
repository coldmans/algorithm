import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
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
                for(int j = point-1; j >= point-x; j--){
                    visit.put(j, visit.getOrDefault(j,0) + 1);
                }
                point -= x;
            }
            else if(dir == 'R'){
                for(int j = point+1; j <= point+x; j++){
                    visit.put(j, visit.getOrDefault(j,0) + 1);
                }
                point += x;
            }
            
            
        }


        int result = 0;
        for(int v : visit.values()){
            if(v >= 2){
                result++;
            }
        }
        System.out.println(result);
    }
}