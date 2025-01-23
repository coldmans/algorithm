import sys
input = sys.stdin.readline

S, K = map(int, input().strip().split())

li = [S//K for _ in range(K)]

if S - sum(li) > 0:
    tmp = S-sum(li)
    while tmp > 0:
        for i in range(len(li)):
            if tmp == 0:
                break
            li[i] += 1
            tmp -= 1

tmp = 1

for i in range(len(li)):
    tmp *= li[i]

print(tmp) 


