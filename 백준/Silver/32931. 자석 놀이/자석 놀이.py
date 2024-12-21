import sys
from collections import deque
input = sys.stdin.readline

N = int(input().strip())
up = list(map(int, input().strip().split()))
down = list(map(int, input().strip().split()))
updp = [-1e9 for _ in range(N+1)]
downdp = [-1e9 for _ in range(N+1)]
if down[0] >= 0:
    updp[0] = up[0] + down[0]
else:
    updp[0] = up[0]
downdp[0] = up[0] + down[0]     
for i in range(1,N):
    if up[i] >= 0 and down[i] >= 0:
        updp[i] = max(updp[i-1],downdp[i-1]) + up[i] + down[i]
        downdp[i] = max(updp[i-1],downdp[i-1]) + up[i] + down[i]
    elif up[i] >= 0 and down[i] <= 0:
        updp[i] = max(updp[i-1] + up[i], downdp[i-1] + down[i] + up[i])
        downdp[i] = max(updp[i-1],downdp[i-1]) + up[i] + down[i]
    elif up[i] <= 0 and down[i] >= 0:
        downdp[i] = max(downdp[i-1] + down[i],updp[i-1]+up[i]+down[i])
        updp[i] = max(updp[i-1],downdp[i-1]) + down[i] + up[i]
    elif up[i] <= 0 and down[i] <= 0:
        updp[i] = max(updp[i-1] + up[i], downdp[i-1] + down[i] + up[i])
        downdp[i] = max(downdp[i-1] + down[i], updp[i-1]+up[i] + down[i])

print(downdp[N-1])

    