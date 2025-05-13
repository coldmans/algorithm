import java.util.*;

public class Main {
    // 월별 일수 (2024년 윤년 기준)
    static int[] monthDays = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    // 요일 문자열 → 인덱스
    static Map<String,Integer> dayMap = new HashMap<>();
    static {
        dayMap.put("Mon", 0);
        dayMap.put("Tue", 1);
        dayMap.put("Wed", 2);
        dayMap.put("Thu", 3);
        dayMap.put("Fri", 4);
        dayMap.put("Sat", 5);
        dayMap.put("Sun", 6);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt(), d1 = sc.nextInt();
        int m2 = sc.nextInt(), d2 = sc.nextInt();
        String A = sc.next();

        // 1) m1/d1, m2/d2 가 2024년의 몇 번째 날(1-based)인지 구하고
        int startDay = daysFromJan1(m1, d1); // 1월1일→1, 1월2일→2, …
        int endDay   = daysFromJan1(m2, d2);

        // 2) 차이를 0-based 로 바꿔서 diffDays 계산
        int diffDays = (endDay - startDay);      // 예: 10/17→291, 11/11→316 → diffDays=25
        int totalLen = diffDays + 1;             // 포함 범위 길이: 26일

        // 3) A요일 인덱스 (Mon=0,…,Sat=5,…)
        int targetIdx = dayMap.get(A);

        // 4) 전체 길이에서 완전 주(7일) 개수와 나머지를 구해서
        int fullWeeks = totalLen / 7;            // 26/7 = 3
        int remDays   = totalLen % 7;            // 26%7 = 5

        // 5) 정답 = (완전 주 개수) + (나머지 구간에 토요일이 끼어 있으면 1)
        //    나머지 구간은 start부터 시작해 0,1,2,3,4 번째 날에 해당
        int answer = fullWeeks + (targetIdx < remDays ? 1 : 0);

        System.out.println(answer);
    }

    // 1월 1일부터 (m월 d일)까지의 누적 일수 (1-based)
    static int daysFromJan1(int m, int d) {
        int s = 0;
        for (int i = 1; i < m; i++) s += monthDays[i-1];
        return s + d;
    }
}
