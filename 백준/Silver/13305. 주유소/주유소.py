import sys
import heapq
input = sys.stdin.readline

N = int(input().strip())
val = list(map(int, input().strip().split()))
li = list(map(int, input().strip().split()))
tmp = li[0]

res = li[0] * val[0]

for i in range(1,len(val)):
    tmp = min(tmp, li[i])
    res += tmp * val[i]
        
print(res)





