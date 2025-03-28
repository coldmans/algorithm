import sys
input = sys.stdin.readline

def dfs(tmp, i):
    if tmp and i in tmp:
        res.append(i)
        return

    for j in range(len(li2)):
        if li2[j] == i:
            tmp.append(i)
            dfs(tmp, li[j])
            tmp.pop()



N = int(input().strip())
li = [int(x) for x in range(1,N+1)]
li2 = []
for _ in range(N):
    li2.append(int(input().strip()))

res = []
for i in range(N):
    dfs([li2[i]],li[i])
print(len(res))
res.sort()
for i in res:
    print(i)