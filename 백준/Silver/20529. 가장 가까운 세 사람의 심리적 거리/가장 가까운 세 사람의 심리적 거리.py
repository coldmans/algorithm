import sys
input = sys.stdin.readline

test_case = int(input().strip())
for _ in range(test_case):
    ans = 999999
    N = int(input().strip())
    tmp = list(map(str,input().strip().split()))
    if N > 32:
        print(0)
    else:
        for i in range(N):
            for j in range(N):
                for k in range(N):
                    tm = 0
                    if i == j or j == k or i == k:
                        continue
                    for x in range(4):
                        if tmp[i][x] != tmp[j][x]:
                            tm += 1
                        if tmp[j][x] != tmp[k][x]:
                            tm += 1
                        if tmp[i][x] != tmp[k][x]:
                            tm += 1
                    ans =  min(tm, ans)
        print(ans)











