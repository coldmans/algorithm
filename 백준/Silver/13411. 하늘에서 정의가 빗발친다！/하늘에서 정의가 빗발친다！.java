import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        PriorityQueue<double[]> q = new PriorityQueue<>((a,b) ->{
            int timeCompare = Double.compare(a[0],b[0]);
            if(timeCompare != 0){
                return timeCompare;
            }
            return Double.compare(a[1],b[1]);
        });
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            q.add(new double[] {(Math.pow((Math.pow(X,2) + Math.pow(Y,2)), (1.0/2.0))/V), i+1});
        }
        while(!q.isEmpty()){
            double[] wax = q.poll();
            int n = (int)wax[1];
            System.out.println(n);

        }
    }
}
