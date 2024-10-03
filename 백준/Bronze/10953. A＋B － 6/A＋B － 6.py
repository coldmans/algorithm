import sys

def main():
    # 모든 입력을 한 번에 읽어옵니다.
    input = sys.stdin.read().splitlines()
    
    # 첫 번째 줄은 테스트 케이스의 개수 T
    T = int(input[0])
    
    # T개의 테스트 케이스를 처리합니다.
    for i in range(1, T + 1):
        # 콤마(,)를 기준으로 A와 B를 분리하여 정수로 변환
        A, B = map(int, input[i].split(','))
        # A + B를 출력
        print(A + B)

if __name__ == "__main__":
    main()
