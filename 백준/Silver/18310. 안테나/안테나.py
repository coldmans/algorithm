import sys
input = sys.stdin.readline

# 입력 처리
N = int(input().strip())
home = list(map(int, input().strip().split()))

# 집들의 위치 정렬
home.sort()

# 중간값 찾기
median = home[(N-1)//2]

# 결과 출력
print(median)