import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12){
            if(d <= 31){
                if(m == 3 || m == 5){
                    System.out.println("Spring");
                }
                else if (m == 7 || m == 8){
                    System.out.println("Summer");
                }
                else if (m == 10){
                    System.out.println("Fall");
                }
                else{
                    System.out.println("Winter");
                }
            }
            else{
                System.out.println(-1);
            }
        }
        else if(m == 2){
            boolean yoon = true; 
            if(y % 4 == 0){
                yoon = true;
                if(y % 100 == 0){
                    yoon = false;
                    if(y % 400 == 0){
                        yoon = true;
                    }
                }
            }
            else{
                yoon = false;
            }

            if(yoon){
                if(d <= 29){
                    System.out.println("Winter");
                }
                else{
                    System.out.println(-1);
                }
            }
            else{
                if(d <= 28){
                    System.out.println("Winter");
                }
                else{
                    System.out.println(-1);
                }
            }
        }

        else{
            if(d <= 30){
                if(m == 4){
                    System.out.println("Spring");
                }
                else if (m == 6){
                    System.out.println("Summer");
                }
                else if (m == 9 || m == 11){
                    System.out.println("Fall");
                }
                else{
                    System.out.println("Winter");
                }
            }
            else{
                System.out.println(-1);
            }
        }
    }
}