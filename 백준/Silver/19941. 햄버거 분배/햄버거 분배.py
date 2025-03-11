import sys
import math
input = sys.stdin.readline

N,K = map(int, input().strip().split())

li = list(input().strip())
b = 0
ctt = 0
for i in range(len(li)):
    if li[i] == "N":
        continue
    elif li[i] == "P":
        start = max(0, i-K)
        for j in range(start, i):
            if li[j] == "H":
                ctt += 1
                li[j] = "N"
                b = 1
                break
        if b != 1:
            for j in range(1,K+1):
                if i + j >= len(li):
                    break
                if li[i+j] == "H":
                    ctt += 1
                    li[i+j] = "N"
                    break
        b = 0

print(ctt)





        



