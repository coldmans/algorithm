import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        boolean []gu = new boolean[1001];
        gu[0] = true;
        for(int i = 0; i < L; i++){
            gu[sc.nextInt()] = true;
        }
        int wax = sc.nextInt();
        if(gu[wax]){
            System.out.println(0);
            System.exit(0);
        }
        int ctt1 = 0;
        for(int i = wax - 1; i > 0; i--){
            if(gu[i] == true){
                break;
            }
            ctt1++;
        }
        int ctt2 = 0;
        for(int i = wax + 1; i <= 1000; i++){
            if(gu[i] == true){
                break;
            }
            if(i == 1000){
                ctt2 = 0;
                break;
            }
            ctt2 ++;
        }
        if(ctt1 == 0 && ctt2 == 0){
            System.out.println(0);
        }
        else {
            System.out.println((ctt1 + 1) * (ctt2 + 1) - 1);
        }
    }
}


