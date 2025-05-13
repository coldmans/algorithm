import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();    // 시작 월
        int d1 = sc.nextInt();    // 시작 일
        int m2 = sc.nextInt();    // 끝 월
        int d2 = sc.nextInt();    // 끝 일
        String target = sc.next(); // "Mon","Tue","Wed","Thu","Fri","Sat","Sun"

        // 문자열 → DayOfWeek 매핑
        Map<String, DayOfWeek> dayMap = new HashMap<>();
        dayMap.put("Mon", DayOfWeek.MONDAY);
        dayMap.put("Tue", DayOfWeek.TUESDAY);
        dayMap.put("Wed", DayOfWeek.WEDNESDAY);
        dayMap.put("Thu", DayOfWeek.THURSDAY);
        dayMap.put("Fri", DayOfWeek.FRIDAY);
        dayMap.put("Sat", DayOfWeek.SATURDAY);
        dayMap.put("Sun", DayOfWeek.SUNDAY);

        DayOfWeek targetDay = dayMap.get(target);

        // 2024년은 윤년이므로 2월 29일까지 자동 처리
        LocalDate start = LocalDate.of(2024, m1, d1);
        LocalDate end   = LocalDate.of(2024, m2, d2);

        int count = 0;
        // 시작일에서 끝일까지 하루씩 증가시키며 요일 비교
        for (LocalDate date = start; !date.isAfter(end); date = date.plusDays(1)) {
            if (date.getDayOfWeek() == targetDay) {
                count++;
            }
        }

        System.out.println(count);
    }
}
