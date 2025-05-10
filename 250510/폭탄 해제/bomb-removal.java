import java.util.Scanner;
public class bomb{
    String code;
    char color;
    int second;
    bomb(String code, char color, int second){
        this.code = code;
        this.color = color;
        this.second = second;
    }
    void showBomb(){
        System.out.println("code : " + code);
        System.out.println("color : " + color);
        System.out.println("second : " + second);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uCode = sc.next();
        char lColor = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.
        bomb b = new bomb(uCode, lColor, time);
        b.showBomb();
        
    }
}