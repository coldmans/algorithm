import sys
input = sys.stdin.readline

p, m = map(int, input().strip().split())

li = []

for i in range(p):
    lev, nic = input().strip().split()
    if i == 0:
        li.append([(int(lev),nic)])
    else:
        for j in range(len(li)):
            if len(li[j]) < m:
                if abs(li[j][0][0] - int(lev)) <= 10:
                    li[j].append((int(lev),nic))
                    break
        else:
            li.append([(int(lev),nic)])

for i in range(len(li)):
    if len(li[i]) == m:
        print("Started!")
    else:
        print("Waiting!")
    li[i].sort(key = lambda x: x[1])
    for j in range(len(li[i])):
        print(li[i][j][0], end = " ")
        print(li[i][j][1])

