import sys
input = sys.stdin.readline

# 입력 처리
N = int(input().strip())
A, B = map(int, input().strip().split())

# 치킨을 먹기 위해 필요한 콜라와 맥주의 개수 계산
max_chicken_by_cola = A // 2
max_chicken_by_beer = B

# 임스가 먹을 수 있는 최대 치킨의 개수
max_chicken = min(N, max_chicken_by_cola + max_chicken_by_beer)

# 결과 출력
print(max_chicken)