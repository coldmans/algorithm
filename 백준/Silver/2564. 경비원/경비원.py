import sys
input = sys.stdin.readline

N, M = map(int, input().strip().split())
li = []
T = int(input().strip())
for _ in range(T):
    direction,m = map(int, input().strip().split())
    li.append((direction,m))

n,m = map(int,input().strip().split())
res = 0
for d,p in li:
    if n == d:
        res += abs(m-p)
    else:
        if (n == 1 and d == 2) or (n == 2 and d == 1):
            if m + p > N:
                res += 2 * N - (m + p) + M
            else:
                res += m + p + M
        elif (n == 3 and d == 4) or (n == 4 and d == 3):
            if m + p > M:
                res += 2 * M - (m + p) + N
            else:
                res += m + p + N
        elif n == 1 and d == 3:
            res += m + p
        elif n == 1 and d == 4:
            res += (N - m) + p
        elif n == 2 and d == 3:
            res += m + (M - p)
        elif n == 2 and d == 4:
            res += (N - m) + (M - p)
        elif n == 3 and d == 1:
            res += m + p
        elif n == 3 and d == 2:
            res += (M - m) + p
        elif n == 4 and d == 1:
            res += m + (N - p)
        elif n == 4 and d == 2:
            res += (M-m) + (N-p)


print(res)









   


    








    



