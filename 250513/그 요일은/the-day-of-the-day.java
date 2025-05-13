import java.util.*;

public class Main {
    static String[] daysOfWeek = { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };
    static int[] monthDays = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 윤년

    static List<String> fullYearDays = new ArrayList<>(); // 1월 1일부터 12월 31일까지 요일 저장

    public static void main(String[] args) {
        // 전체 날짜에 대해 요일 채우기
        buildYearCalendar();

        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String targetDay = sc.next();

        int startIndex = getDayIndex(m1, d1);
        int endIndex = getDayIndex(m2, d2);

        int count = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            if (fullYearDays.get(i).equals(targetDay)) {
                count++;
            }
        }

        System.out.println(count);
    }

    // 요일 배열 만들기
    static void buildYearCalendar() {
        int dayIndex = 0; // 2024-01-01 = Mon = 0

        for (int month = 0; month < 12; month++) {
            for (int day = 0; day < monthDays[month]; day++) {
                fullYearDays.add(daysOfWeek[dayIndex % 7]);
                dayIndex++;
            }
        }
    }

    // (월, 일) => 0-based 인덱스로 며칠째인지
    static int getDayIndex(int month, int day) {
        int index = 0;
        for (int i = 0; i < month - 1; i++) {
            index += monthDays[i];
        }
        index += day - 1; // 0-based
        return index;
    }
}
