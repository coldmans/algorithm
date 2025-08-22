import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);

        HashMap<String, Integer> general = new HashMap<>();
        HashMap<String, Integer> special = new HashMap<>();
        Set<String> service = new HashSet<>();

        for(int i = 0; i < A; i++){
            String []input1 = br.readLine().split(" ");
            general.put(input1[0], Integer.parseInt(input1[1]));
        }

        for(int i = 0; i < B; i++){
            String []input1 = br.readLine().split(" ");
            special.put(input1[0], Integer.parseInt(input1[1]));
        }

        for(int i = 0; i < C; i++){
            service.add(br.readLine());
        }

        int N = Integer.parseInt(br.readLine());

        boolean two = false;
        boolean ser = false;
        boolean spe = false;

        long tmp = 0;
        long tmp2 = 0;
        for(int i = 0; i < N; i++){
            String s = br.readLine();
            if(general.containsKey(s)){
                tmp += general.get(s);
            }
            else if(special.containsKey(s)){
                spe = true;
                tmp2 += special.get(s);
            }
            else{
                if(ser == true) two = true;
                ser = true;
            }
        }

        if(spe){
            if(tmp < 20000) two = true;
        }

        if(ser){
            if(tmp + tmp2 < 50000) two = true;
        }
        if(two) System.out.println("No");
        else System.out.println("Okay");

    }
}


