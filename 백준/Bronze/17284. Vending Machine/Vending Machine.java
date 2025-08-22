import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    static int []dy = {1, 0, -1, 0};
    static int []dx = {0, 1, 0, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = 5000;
        String []input = br.readLine().split(" ");
        for(int i = 0; i < input.length; i++){
            if(input[i].equals("1")){
                money -= 500;
            }
            else if(input[i].equals("2")){
                money -= 800;
            }
            else{
                money -= 1000;
            }
        }
        System.out.println(money);
    }
}


