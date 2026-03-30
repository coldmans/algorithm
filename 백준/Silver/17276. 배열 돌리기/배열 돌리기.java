import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    static StringTokenizer st;


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());

        for(int t = 0; t < T; t++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            String s = st.nextToken();
            int [][]graph = new int[n][n];
            int [][]copy = new int[n][n];

            for(int i = 0; i < n; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < n; j++){
                    graph[i][j] = Integer.parseInt(st.nextToken());
                    copy[i][j] = graph[i][j];
                }
            }
            if(s.charAt(0) == '-'){
                
                int tmp = Integer.parseInt(s.split("-")[1]);
                int ctt = tmp / 45;

                for(int count = 0; count < ctt; count++){

                    for(int i = 0; i < n; i++){
                        copy[i][i] = graph[i][n/2];
                    }

                    for(int i = 0; i < n; i++){
                        copy[n/2][i] = graph[i][i];
                    }

                    for(int i = 0; i < n; i++){
                        copy[i][n/2] = graph[i][n-i-1];
                    }

                    for(int i = 0; i < n; i++){
                        copy[n-i-1][i] = graph[n/2][i];
                    }

                    for(int i = 0; i < n; i++){
                        for(int j = 0; j < n; j++){
                            graph[i][j] = copy[i][j];
                        }
                    }

                }



            }
            else{
                int tmp = Integer.parseInt(s);
                int ctt = tmp / 45;


                for(int count = 0; count < ctt; count++){

                    for(int i = 0; i < n; i++){
                        copy[i][n-i-1] = graph[i][n/2];
                    }

                    for(int i = 0; i < n; i++){
                        copy[i][n/2] = graph[i][i];
                    }

                    for(int i = 0; i < n; i++){
                        copy[n/2][n-i-1] = graph[i][n-i-1] ;
                    }

                    for(int i = 0; i < n; i++){
                        copy[i][i] = graph[n/2][i];
                    }

                    for(int i = 0; i < n; i++){
                        for(int j = 0; j < n; j++){
                            graph[i][j] = copy[i][j];
                        }
                    }

                }
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(graph[i][j] + " ");
                }
                System.out.println();
            }
        }





    }
}