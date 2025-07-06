import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long jocker = 0;
        long[] jockers = new long[M+1];
        for(int i = 1; i <= M; i++){
            int how = sc.nextInt();
            long time = sc.nextLong();
            if(how == 1){
                jocker = (jocker + time) % N;
            }
            else if(how == 2){
                jocker = (jocker + N - time % N ) % N;
            }
            else{
                jocker = jockers[Math.toIntExact(time)];
            }
            jockers[i] = jocker;
        }
        System.out.println((jocker+1));

    }
}




