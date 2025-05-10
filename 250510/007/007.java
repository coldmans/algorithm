import java.util.Scanner;

class secret{
    String sCode;
    char mPoint;
    int time;
    secret(String sCode, char mPoint, int time){
        this.sCode = sCode;
        this.mPoint = mPoint;
        this.time = time;
    }
    void showSecret(){
        System.out.println("secret code : " + sCode);
        System.out.println("meeting point : " + mPoint);
        System.out.println("time : " + time);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode;
        char mPoint;
        int time;
        sCode = sc.next();
        mPoint = sc.next().charAt(0);
        time = sc.nextInt();
        // Please write your code here.
        secret no = new secret(sCode, mPoint, time);
        no.showSecret();

        
    }
}