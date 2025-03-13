import sys
input = sys.stdin.readline

A, P = map(int, input().strip().split())
if A == 1:
    print(0)
    sys.exit()
dp = []
dp.append(A)
while 1:
    B = str(dp[-1])
    tmp = 0
    for i in range(len(B)):
        tmp += int(B[i]) ** P
    if tmp in dp:
        print(dp.index(tmp))
        break
    dp.append(tmp)

