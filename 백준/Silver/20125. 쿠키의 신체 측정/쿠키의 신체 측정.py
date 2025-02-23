import sys
input = sys.stdin.readline
N = int(input().strip())
li = [[x for x in input().strip()] for _ in range(N)]
get = 0
heart = 0,0
for i in range(N):
    if get != 0:
        break
    for j in range(N):
        if li[i][j] == "*":
            heart = (i+1,j)
            get = 1
            break

leftP = 0
rightP = 0
body = 0


for j in range(heart[1]):
    if li[heart[0]][j] == "*":
        leftP += 1

for j in range(heart[1]+1, N):
    if li[heart[0]][j] == "*":
        rightP += 1
    else:
        break

leftD = 0,0
rightD = 0,0
lld = 0
rrd = 0

for i in range(heart[0]+1, N):
    if li[i][heart[1]] == "*":
        body += 1
        leftD = i+1, heart[1] - 1
        rightD = i+1, heart[1] + 1
    else:
        break

for i in range(leftD[0],N):
    if li[i][leftD[1]] == "*":
        lld += 1
    else:
        break

for i in range(rightD[0],N):
    if li[i][rightD[1]] == "*":
        rrd += 1
    else:
        break


print(heart[0]+1, heart[1]+1)
print(leftP, rightP, body, lld, rrd)