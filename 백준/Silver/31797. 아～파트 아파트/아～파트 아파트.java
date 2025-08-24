import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    static class Nums {
        int id;
        int value;

        public Nums(int id, int value){
            this.id = id;
            this.value = value;
        }

        public int getValue(){
            return value;
        }

        public int getId(){
            return id;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0])-1;
        int M = Integer.parseInt(input[1]);
        N %= M * 2;
        List<Nums> numsList = new ArrayList<>();
        for(int i = 0; i < M; i++){
            String []inputs = br.readLine().split(" ");
            int x = Integer.parseInt(inputs[0]);
            int y = Integer.parseInt(inputs[1]);
            numsList.add(new Nums(i+1, x));
            numsList.add(new Nums(i+1, y));
        }

        numsList.sort(Comparator.comparing(Nums::getValue));
        int t = numsList.get(N).getId();
        System.out.println(t);
    }
}
