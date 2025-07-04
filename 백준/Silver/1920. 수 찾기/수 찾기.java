import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < N; i++){
            set.add(scanner.nextInt());
        }
        int M = scanner.nextInt();
        for(int i = 0; i < M; i++){
            System.out.println(set.contains(scanner.nextInt()) ? "1" : "0");
        }
    }
}
