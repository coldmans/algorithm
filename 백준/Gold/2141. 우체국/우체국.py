# 입력 받기
import sys
input = sys.stdin.readline
n = int(input().strip())
villages = []

for _ in range(n):
    x, a = map(int, input().strip().split())
    villages.append((x, a))

# 마을을 위치(X[i]) 기준으로 정렬
villages.sort()

# 전체 인구의 절반을 찾기 위해 총 인구수 계산
total_population = sum(a for x, a in villages)

# 누적 인구수를 통해 중위수를 찾음
cumulative_population = 0
for x, a in villages:
    cumulative_population += a
    if cumulative_population >= (total_population + 1) // 2:
        print(x)
        break
