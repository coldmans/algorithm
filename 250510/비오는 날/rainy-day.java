import java.util.Scanner;

class info{
    String date;
    String dayOfWeek;
    String weather;

    info (String date, String dayOfWeek, String weather){
        this.date = date;
        this.dayOfWeek = dayOfWeek;
        this.weather = weather;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] date = new String[n];
        info [] infos = new info[n]; 
        for (int i = 0; i < n; i++) {
            date[i] = sc.next();
            String day = sc.next();
            String weather = sc.next();
            // Please write your code here.
            infos[i] = new info(date[i], day, weather);
        }
        java.util.Arrays.sort(date);
        for(int i =0 ; i < n; i++){
            if (infos[i].weather.equals("Rain")){
                System.out.println(infos[i].date + " " + infos[i].dayOfWeek + " " + infos[i].weather);
                break;
            }
        }
    }
}