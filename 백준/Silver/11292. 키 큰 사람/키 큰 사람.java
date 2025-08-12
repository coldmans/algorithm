import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int T = sc.nextInt();
            Queue<String> queue = new ArrayDeque<>();
            if(T == 0){
                break;
            }
            int max = 0;
            for(int i = 0; i < T; i++){
                String wax = sc.next();
                int tall = (int)(sc.nextDouble() * 100);
                if(tall > max) {
                    queue = new ArrayDeque<>();
                    max = tall;
                    queue.add(wax);
                }
                else if(tall == max){
                    queue.add(wax);
                }
            }
            while(!queue.isEmpty()){
                System.out.print(queue.poll()+" ");
            }
            System.out.println();
        }
    }
}
