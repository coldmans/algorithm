import sys
input = sys.stdin.readline

N, X = map(int, input().strip().split())
imsi = list(map(int, input().strip().split()))
day = [0] * (N+1)
for i in range(len(imsi)):
    day[i+1] = imsi[i] + day[i]

tmp = 0
ctt = 0
for i in range(N+1):
    if i + X >= N+1:
        break
    if day[i+X]- day[i] > tmp:
        tmp = day[i+X] - day[i]
        ctt = 1
    elif day[i+X] - day[i] == tmp:
        ctt += 1     
if tmp:
    print(tmp)
    print(ctt)
else:
    print("SAD")