import sys
input = sys.stdin.readline

n = int(input().strip())
k = int(input().strip())
remote = list(map(str, input().strip().split()))

start = 100
tt = 9999999
for i in range(n,-1,-1):
    tmp = 0
    for j in str(i):
        if j in remote:
            tmp = 1
            break
    if tmp == 0:
        tt =n-i+len(str(i))
        break

for i in range(n,n*2+101):
    tmp = 0
    for j in str(i):
        if j in remote:
            tmp = 1
            break
    if tmp == 0:
        tt = min(i-n+len(str(i)),tt)
        break

tt = min(abs(start-n),tt)
print(tt)







