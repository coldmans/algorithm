import sys
from collections import deque
input = sys.stdin.readline

N,K = map(int, input().strip().split())
li = list(map(int, input().strip().split()))
tmp = [0] * (100001)
i = 0
j = 1

tmp[li[0]] = 1

maxi = 0

while j < N:
    if tmp[li[j]] < K:
        tmp[li[j]] += 1
        j += 1
        if j == N:
            maxi = max(maxi, j-i)
    else:
        maxi = max(maxi, j-i)
        while 1:
            tmp[li[i]] -= 1
            if li[i] == li[j]:
                i+=1
                break
            i += 1


print(maxi)
