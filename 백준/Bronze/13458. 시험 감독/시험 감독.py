import sys
import math
input = sys.stdin.readline

N = int(input().strip())
li = list(map(int, input().strip().split()))
B,C = map(int ,input().strip().split())

ctt = 0

for i in range(len(li)):
    if li[i] - B <= 0:
        ctt += 1
    else:
        li[i] -= B
        ctt += 1
        tmp = li[i] / C
        tmp = math.ceil(tmp)
        ctt += tmp

print(ctt)



    