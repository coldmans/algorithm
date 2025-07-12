import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String correct = sc.next();

        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        String realAnswer = " ";
        for(int i = 0; i < N; i++){
            String nickname = sc.next();
            String answer = sc.next();
            map.put(nickname, answer);
            if(correct.equals(nickname)){
                realAnswer = answer;
            }
        }
        int ctt = 0;
        for (String s : map.keySet()) {
            if(s.equals(correct)){
                break;
            }
            if(map.get(s).equals(realAnswer)) ctt ++;
        }
        System.out.println(ctt);
    }
}




