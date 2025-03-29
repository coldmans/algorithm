import sys
input = sys.stdin.readline

directions = [(-1,0),(1,0),(0,1),(0,-1)]
maxi = 0
def dfs(i,j,tmp):
    global maxi
    for di,dj in directions:
        xi = di + i
        xj = dj + j
        if 0 <= xi < R and 0 <= xj < C:
            if li[xi][xj] not in tmp:
                tmp.add(li[xi][xj])
                dfs(xi,xj,tmp)
                tmp.remove(li[xi][xj])
    else:
        maxi = max(maxi, len(tmp))
        return


R, C = map(int, input().strip().split())
li = [[] for _ in range(R)]
for i in range(R):
    s = input().strip()
    for j in range(len(s)):
        li[i].append(s[j])

dfs(0,0,set([li[0][0]]))
print(maxi)






