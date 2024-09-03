import sys
input = sys.stdin.readline

N = int(input().strip())
tmp = [0] * (10001)

for _ in range(N):
    x = int(input().strip())
    tmp[x] += 1

for i in range(len(tmp)):
    for _ in range(tmp[i]):
        print(i)



            

