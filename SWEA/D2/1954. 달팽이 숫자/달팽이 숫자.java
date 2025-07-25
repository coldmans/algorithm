import java.util.*;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
    static int N;
    static int[][] arr;

    static void goRight(int x, int y, int tmp){
        arr[y][x] = tmp;
        if(tmp == N * N){
            return;
        }
        if(x + 1 < N && arr[y][x + 1] == 0){
            goRight(x + 1, y, tmp+ 1);
        }
        else{
            goDown(x, y + 1, tmp + 1);
        }
    }

    static void goDown(int x, int y, int tmp){
        arr[y][x] = tmp;
        if(tmp == N * N){
            return;
        }
        if(y + 1 < N && arr[y+ 1][x] == 0){
            goDown(x, y + 1, tmp + 1);
        }
        else{
            goLeft(x-1, y, tmp + 1);
        }
    }

    static void goLeft(int x, int y, int tmp){
        arr[y][x] = tmp;
        if(tmp == N * N){
            return;
        }
        if(x - 1 >= 0 && arr[y][x - 1] == 0){
            goLeft(x - 1, y, tmp + 1);
        }
        else{
            goUp(x, y - 1, tmp + 1);
        }
    }

    static void goUp(int x, int y, int tmp){
        arr[y][x] = tmp;
        if(tmp == N * N){
            return;
        }
        if(y - 1 >= 0 && arr[y - 1][x] == 0){
            goUp(x, y - 1, tmp + 1);
        }
        else{
            goRight(x + 1, y, tmp + 1);
        }
    }

    public static void main(String args[]) throws Exception
    {
		/*
		   아래의 메소드 호출은 앞으로 표준 입력(키보드) 대신 input.txt 파일로부터 읽어오겠다는 의미의 코드입니다.
		   여러분이 작성한 코드를 테스트 할 때, 편의를 위해서 input.txt에 입력을 저장한 후,
		   이 코드를 프로그램의 처음 부분에 추가하면 이후 입력을 수행할 때 표준 입력 대신 파일로부터 입력을 받아올 수 있습니다.
		   따라서 테스트를 수행할 때에는 아래 주석을 지우고 이 메소드를 사용하셔도 좋습니다.
		   단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나 주석 처리 하셔야 합니다.
		 */
        //System.setIn(new FileInputStream("src/sample_input (1).txt"));

		/*
		   표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

        for(int test_case = 1; test_case <= T; test_case++)
        {
            N = sc.nextInt();
            arr = new int[N][N];
            goRight(0, 0, 1);



            System.out.println("#"+test_case);
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

        }
    }
}