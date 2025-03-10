import sys
import math
input = sys.stdin.readline

N = int(input().strip())
M = int(input().strip())

li = list(map(int, input().strip().split()))
li.sort()
mins = li[0]
for i in range(len(li)-1):
    if math.ceil((li[i+1] - li[i]) / 2) > mins:
        mins = math.ceil((li[i+1] - li[i]) / 2)

if N - li[-1] > mins:
    mins = N - li[-1] 

print(mins)


            






        



