import java.util.*;

public class Main {
    static int[] monthDays = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    static String[] fullYear = {
        // 2024년 1월 1일은 월요일 (Mon)
        "Mon","Tue","Wed","Thu","Fri","Sat","Sun", // 1월 1~7
        "Mon","Tue","Wed","Thu","Fri","Sat","Sun",
        "Mon","Tue","Wed","Thu","Fri","Sat","Sun",
        "Mon","Tue","Wed","Thu","Fri","Sat","Sun",
        "Mon","Tue","Wed","Thu", // 1월 (31일)
        "Fri","Sat","Sun","Mon","Tue","Wed","Thu",
        "Fri","Sat","Sun","Mon","Tue","Wed","Thu",
        "Fri","Sat","Sun","Mon","Tue","Wed","Thu",
        "Fri","Sat","Sun", // 2월 (29일)
        "Mon","Tue","Wed","Thu","Fri","Sat","Sun",
        "Mon","Tue","Wed","Thu","Fri","Sat","Sun",
        "Mon","Tue","Wed","Thu","Fri","Sat","Sun",
        "Mon","Tue","Wed","Thu","Fri","Sat","Sun",
        "Mon","Tue","Wed", // 3월 (31일)
        "Thu","Fri","Sat","Sun","Mon","Tue","Wed",
        "Thu","Fri","Sat","Sun","Mon","Tue","Wed",
        "Thu","Fri","Sat","Sun","Mon","Tue","Wed",
        "Thu","Fri","Sat", // 4월 (30일)
        "Sun","Mon","Tue","Wed","Thu","Fri","Sat",
        "Sun","Mon","Tue","Wed","Thu","Fri","Sat",
        "Sun","Mon","Tue","Wed","Thu","Fri","Sat",
        "Sun","Mon","Tue","Wed","Thu","Fri","Sat",
        "Sun","Mon","Tue", // 5월 (31일)
        "Wed","Thu","Fri","Sat","Sun","Mon","Tue",
        "Wed","Thu","Fri","Sat","Sun","Mon","Tue",
        "Wed","Thu","Fri","Sat","Sun","Mon","Tue",
        "Wed","Thu","Fri","Sat","Sun","Mon", // 6월 (30일)
        "Tue","Wed","Thu","Fri","Sat","Sun","Mon",
        "Tue","Wed","Thu","Fri","Sat","Sun","Mon",
        "Tue","Wed","Thu","Fri","Sat","Sun","Mon",
        "Tue","Wed","Thu","Fri","Sat","Sun","Mon", // 7월 (31일)
        "Tue","Wed","Thu","Fri","Sat","Sun","Mon",
        "Tue","Wed","Thu","Fri","Sat","Sun","Mon",
        "Tue","Wed","Thu","Fri","Sat","Sun","Mon",
        "Tue","Wed","Thu", // 8월 (31일)
        "Fri","Sat","Sun","Mon","Tue","Wed","Thu",
        "Fri","Sat","Sun","Mon","Tue","Wed","Thu",
        "Fri","Sat","Sun","Mon","Tue","Wed","Thu",
        "Fri","Sat","Sun","Mon","Tue","Wed", // 9월 (30일)
        "Thu","Fri","Sat","Sun","Mon","Tue","Wed",
        "Thu","Fri","Sat","Sun","Mon","Tue","Wed",
        "Thu","Fri","Sat","Sun","Mon","Tue","Wed",
        "Thu","Fri","Sat","Sun","Mon","Tue", // 10월 (31일)
        "Wed","Thu","Fri","Sat","Sun","Mon","Tue",
        "Wed","Thu","Fri","Sat","Sun","Mon","Tue",
        "Wed","Thu","Fri","Sat","Sun","Mon","Tue",
        "Wed","Thu","Fri","Sat", // 11월 (30일)
        "Sun","Mon","Tue","Wed","Thu","Fri","Sat",
        "Sun","Mon","Tue","Wed","Thu","Fri","Sat",
        "Sun","Mon","Tue","Wed","Thu","Fri","Sat",
        "Sun","Mon","Tue","Wed","Thu" // 12월 (31일)
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String target = sc.next();

        int start = getIndex(m1, d1);
        int end = getIndex(m2, d2);

        int count = 0;
        for (int i = start; i <= end; i++) {
            if (fullYear[i].equals(target)) {
                count++;
            }
        }

        System.out.println(count);
    }

    static int getIndex(int month, int day) {
        int idx = 0;
        for (int i = 0; i < month - 1; i++) {
            idx += monthDays[i];
        }
        return idx + day - 1;
    }
}
