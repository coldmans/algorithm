import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer []line = new Integer[N];
        for(int i = 0; i < N; i++){
            line[i] = sc.nextInt();
        }
        //Arrays.sort(line, Collections.reverseOrder());
        if(N % 2 == 0){
            System.out.println("Alice");

        }

        else if(N % 2 == 1){
            System.out.println("Bob");

        }




    }
}




