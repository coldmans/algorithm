import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char []su = new char[N];
        for(int i = 0; i < N; i++){
            su[i] = sc.next().charAt(0);
        }
        int num = 0;
        while(true){
            int k = String.valueOf(num).length();
            boolean find = false;
            for(int i = 0; i <= N - k; i++){
                StringBuilder sb = new StringBuilder();
                for(int j = i; j < i + k; j++){
                    sb.append(su[j]);
                }
                if(num == Integer.parseInt(sb.toString())){
                    find = true;
                    num++;
                    break;
                }
            }
            if(find == false){
                System.out.println(num);
                System.exit(0);
            }

        }

    }
}


