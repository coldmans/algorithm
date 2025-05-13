import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.
        int days = 0;
        if(m1 == 1 || m1 == 3 || m1 == 5 || m1 == 7 || m1 == 8 || m1 == 10 || m1 == 12){
            days = 31 - d1;
        }
        else{
            days = 30 - d1;
        }
        m1 += 1;
        while(true){
            if(m1 == 1 || m1 == 3 || m1 == 5 || m1 == 7 || m1 == 8 || m1 == 10 || m1 == 12){
                if(m1 == m2){
                    days += d2;
                    break;
                }
                else{
                    days += 31;
                }
            }
            else if(m1 == 2){
                if(m1 == m2){
                    days += d2;
                    break;
                }
                days += 28;
            }
            else{
                if(m1 == m2){
                    days += d2;
                    break;
                }
                days += 30;
            }
            m1 += 1;
        }
        System.out.println(days+1);
    }
}