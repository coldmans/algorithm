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
        int d = 1;
        while(d+1 <= m1){
            if(d == 1 || d == 3 || d== 5 || d ==7 || d == 8 || d == 10 || d == 12){
                days += 31;
            }
            else if (d == 2){
                days += 28;
            }
            else{
                days += 30;
            }
            d += 1;
        }

        days += d1;
        

        int days2 = 0;
        int dd = 1;
        while(dd+1 <= m2){
            if(dd == 1 || dd == 3 || dd== 5 || dd ==7 || dd == 8 || dd == 10 || dd == 12){
                days2 += 31;
            }
            else if (dd == 2){
                days2 += 28;
            }
            else{
                days2 += 30;
            }
            dd += 1;
        }
        days2 += d2;

        while(days > days2){
            days2 += 7;
        }
        int tmp = days2 - days;
        
        if(tmp % 7 == 0){
            System.out.println("Mon");
        }
        if(tmp % 7 == 1){
            System.out.println("Tue");
        }
        if(tmp % 7 == 2){
            System.out.println("Wed");
        }
        if(tmp % 7 == 3){
            System.out.println("Thu");
        }
        if(tmp % 7 == 4){
            System.out.println("Fri");
        }
        if(tmp % 7 == 5){
            System.out.println("Sat");
        }
        if(tmp % 7 == 6){
            System.out.println("Sun");
        }
        
    }
}