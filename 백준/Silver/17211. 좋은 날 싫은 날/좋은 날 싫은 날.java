import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mood = sc.nextInt();
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        // 전이 행렬
        double[][] transition = {{a, b}, {c, d}};

        // 초기 상태 벡터
        double[] state = new double[2];
        state[mood] = 1.0; // 현재 기분

        // N일 동안 전이 적용
        for (int i = 0; i < n; i++) {
            double[] newState = new double[2];
            newState[0] = state[0] * transition[0][0] + state[1] * transition[1][0];
            newState[1] = state[0] * transition[0][1] + state[1] * transition[1][1];
            state = newState;
        }

        // 결과 출력 (1000을 곱하고 반올림)
        System.out.println(Math.round(state[0] * 1000));
        System.out.println(Math.round(state[1] * 1000));

    }
}




