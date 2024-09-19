import sys
input = sys.stdin.readline

N, K = map(int, input().strip().split())

# 각 국가의 메달 정보를 입력받음
wax = [[int(x) for x in input().strip().split()] for _ in range(N)]

# 금, 은, 동메달 수를 기준으로 내림차순 정렬
wax.sort(key=lambda x: (-x[1], -x[2], -x[3]))

# 등수 계산
rank = 1
idx2 = 0
for i in range(N):
    if wax[i][0] == K:
        print(rank)
        break
    if i > 0 and wax[i][1] == wax[i-1][1] and wax[i][2] == wax[i-1][2] and wax[i][3] == wax[i-1][3]:
        idx2 += 1
    else:
        rank += 1 + idx2
        idx2 = 0