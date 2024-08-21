import sys
import math
input = sys.stdin.readline

T = int(input().strip())
if T == 0:
    print(0)
    sys.exit()
tmp = []
for _ in range(T):
    x = int(input().strip())
    tmp.append(x)
tmp.sort()
val = T * 0.15
if val >= math.ceil(val)-0.5:
    val = math.ceil(val)
else:
    val = math.floor(val)
res = 0
ctt = 0
for i in range(val, T-val):
    res += tmp[i]
    ctt += 1
t = res/ctt 
if t >= math.ceil(t)-0.5:
    t = math.ceil(t)
else:
    t = math.floor(t)
    

print(t)
