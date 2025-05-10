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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (infos[j].date.equals(date[i]) && infos[j].weather.equals("Rain")) {
                    System.out.println(infos[j].date + " " + infos[j].dayOfWeek + " " + infos[j].weather);
                    return;
                }
            }
}

    }
}