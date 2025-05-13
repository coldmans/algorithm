import java.util.Scanner;
import java.util.Arrays;
    class human{
        String name;
        int height;
        int weight;

        public human(String name, int height, int weight){
            this.name = name;
            this.height = height;
            this.weight = weight;
        }
    }
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        human[] h = new human[n];
        // Please write your code here.
        for(int i = 0; i < n; i++){
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            h[i] = new human(name, height, weight);
        }
        Arrays.sort(h, (a, b) -> a.height - b.height);
        for(int i = 0; i < n; i++){
            System.out.println(h[i].name + " " + h[i].height + " " + h[i].weight);
        }
    }
}