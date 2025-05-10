import java.util.Scanner;
class yowon{
    char codeName;
    int score;
    yowon(char codeName, int score){
        this.codeName = codeName;
        this.score = score;
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        yowon[] yo= new yowon[5];
        for(int i = 0; i < 5; i++){
            char c = sc.next().charAt(0);
            int s = sc.nextInt();
            yo[i] = new yowon(c,s);
        }
        int tmp = 10000000;
        char ttmp = 'A';
        for(int i = 0; i< 5; i++){
            if(tmp > yo[i].score){
                tmp = yo[i].score;
                ttmp = yo[i].codeName;
            }
        }
        System.out.println(ttmp + " " + tmp);
    }
}