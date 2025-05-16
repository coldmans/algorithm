import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]graph = new int[201][201];
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt()+100;
            int y1 = sc.nextInt()+100;
            int x2 = sc.nextInt()+100;
            int y2 = sc.nextInt()+100;

            for(int y = y1; y < y2; y++){
                for(int x = x1; x < x2; x++){
                    if(i % 2 == 1){
                        graph[y][x] = 1;
                    }
                    else{
                        graph[y][x] = 2;
                    }
                }
            }
        }
        int sum = 0;
        for(int y = 0; y < 201; y++){
            for(int x = 0; x < 201; x++){
                if(graph[y][x] == 1){
                    sum++;
                }
            }
        }
        System.out.println(sum);
            
        

    }
}