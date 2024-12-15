import sys
input = sys.stdin.readline

n = int(input().strip())
li = list(map(int, input().strip().split()))
tt = 0
for i in range(len(li)-1,0,-1):
    if li[i] <= li[i-1]:
        continue
    else:
        mins = 1e9
        for j in range(i,len(li)):
            if mins > li[j] and li[j] > li[i-1]:
                mins = li[j]
                mini = j
        tmp = li[mini]
        li[mini] = li[i-1]
        li[i-1] = tmp
        tt = 1
        x = i
        break
if tt == 0:
    print(-1)
else:
    wax = []
    wax2 = []
    for i in range(x):
        wax.append(li[i])
    for i in range(x,len(li)):
        wax2.append(li[i])
    wax2.sort()
    print(' '.join(map(str,wax)), end = " ")
    print(' '.join(map(str,wax2)))
    
    

