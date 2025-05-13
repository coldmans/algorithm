import java.util.*;

public class Main {
    // 2024년은 윤년이므로 2월이 29일까지
    static int[] daysInMonth = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    static Map<String, Integer> dayMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String targetDay = sc.next();

        // 요일을 숫자로 매핑
        dayMap.put("Mon", 0);
        dayMap.put("Tue", 1);
        dayMap.put("Wed", 2);
        dayMap.put("Thu", 3);
        dayMap.put("Fri", 4);
        dayMap.put("Sat", 5);
        dayMap.put("Sun", 6);

        // 2024년 1월 1일은 월요일 -> 기준이 되는 날짜
        int startDayIndex = 0; // Mon

        // m1/d1로부터 m2/d2까지 일수 계산
        int startDays = getDaysFromJan1(m1, d1);
        int endDays = getDaysFromJan1(m2, d2);

        int count = 0;
        int targetIndex = dayMap.get(targetDay);

        for (int i = startDays; i <= endDays; i++) {
            int dayOfWeek = (startDayIndex + i - 1) % 7;
            if (dayOfWeek == targetIndex) {
                count++;
            }
        }

        System.out.println(count);
    }

    // 1월 1일부터 (m, d)까지의 총 일수 계산
    public static int getDaysFromJan1(int m, int d) {
        int days = 0;
        for (int i = 1; i < m; i++) {
            days += daysInMonth[i];
        }
        days += d;
        return days;
    }
}
