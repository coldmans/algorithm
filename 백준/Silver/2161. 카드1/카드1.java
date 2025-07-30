import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = 1; i <= N; i++){
            deque.add(i);
        }
        while(!deque.isEmpty()){
            System.out.print(deque.getFirst() + " ");
            deque.removeFirst();
            if(!deque.isEmpty()){
                deque.addLast(deque.removeFirst());
            }
        }
    }
}



