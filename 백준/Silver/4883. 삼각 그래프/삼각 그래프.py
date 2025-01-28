import sys
input = sys.stdin.readline
t = 0
while True:
    t += 1
    N = int(input().strip())
    if N == 0:
        break

    li = [list(map(int, input().strip().split())) for _ in range(N)]
    li[0][0] = 1e9
    li[0][2] += li[0][1]
    for i in range(1,N):
        for j in range(3):
            if j == 0:
                li[i][j] += min(li[i-1][j], li[i-1][j+1])
            elif j == 1:
                li[i][j] += min(li[i-1][j-1], li[i-1][j], li[i-1][j+1], li[i][j-1])
            else:
                li[i][j] += min(li[i-1][j-1], li[i-1][j], li[i][j-1])
    print(t,end="")
    print(".",end=" ")
    print(li[N-1][1])


