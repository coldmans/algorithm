import sys
import math
input = sys.stdin.readline

S = input().strip()
n = len(S)
ctt0 = 0
ctt1 = 0
if S[0] == '0':
    ctt0 += 1
else:
    ctt1 += 1
for i in range(1,len(S)):
    if S[i] == '0':
        if S[i-1] != '0':
            ctt0 += 1
    elif S[i] == '1':
        if S[i-1] != '1':
            ctt1 += 1


print(min(ctt0,ctt1))

