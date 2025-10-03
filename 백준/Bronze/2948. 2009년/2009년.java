import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int res = 2;
        boolean is = false;
        for(int i = 1; i <= 12; i++){
            if(is){
                break;
            }
            for(int j = 1; j <= 31; j++){
                if(i == 2 && j > 28){
                    break;
                }
                if(j == 31){
                    if(i == 2 || i == 4 || i == 6 || i == 9 || i == 11){
                        break;
                    }
                }
                res += 1;
                if(i == y && x == j){
                    is = true;
                    break;
                }
            }
        }
        
        if(res % 7 == 0){
            System.out.println("Monday");
        }
        else if(res % 7 == 1){
            System.out.println("Tuesday");
        }
        else if(res % 7 == 2){
            System.out.println("Wednesday");
        }
        else if(res % 7 == 3){
            System.out.println("Thursday");
        }
        else if(res % 7 == 4){
            System.out.println("Friday");
        }
        else if(res % 7 == 5){
            System.out.println("Saturday");
        }
        else{
            System.out.println("Sunday");
        }
    }



}
