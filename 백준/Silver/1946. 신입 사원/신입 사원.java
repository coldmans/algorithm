import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();
        for (int t = 0; t < test; t++){
            int mem = sc.nextInt();
            List<int[]> sin = new ArrayList<>();
            
            for (int i = 0; i < mem; i++){
                int s = sc.nextInt();
                int m = sc.nextInt();
                sin.add(new int[]{s,m});
            }
            
            sin.sort(Comparator.comparingInt((int[] x) -> x[0]).thenComparingInt(x->x[1]));
            int ctt = 1;
            int maxim = sin.get(0)[1];
            
            for(int i = 1; i< mem; i++){
                if(sin.get(i)[1] < maxim){
                    maxim = sin.get(i)[1];
                    ctt++;
                }
            }
            System.out.println(ctt);
        }
        sc.close();
    }
}