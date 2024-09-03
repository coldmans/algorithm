import sys
input = sys.stdin.readline

N = int(input().strip())
if N == 1:
    print(0)
    sys.exit()

if N > 55:
    tmp = N-56
else:
    tmp = 0

for i in range(tmp, N):
    text = str(i)
    ctt = 0
    for j in text:
        ctt += int(j)
    if ctt + i == N:
        print(i)
        break
else:
    print(0)




            

