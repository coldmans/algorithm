import sys

def main():
    # 입력을 모두 읽어 리스트로 저장
    input = sys.stdin.read().split()
    
    # 첫 번째 값은 데이터 세트의 개수
    n = int(input[0])
    
    # 인덱스 초기화
    index = 1
    
    # 각 데이터 세트 처리
    for _ in range(n):
        X = int(input[index])
        Y = int(input[index + 1])
        index += 2
        
        if X >= Y:
            print("MMM BRAINS")
        else:
            print("NO BRAINS")

if __name__ == "__main__":
    main()
