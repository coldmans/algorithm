import sys
input = sys.stdin.readline

def check(a,b,op):
    if op == '>':
        if a > b:
            return True
    if op == '<':
        if a < b:
            return True
    return False

def dfs(ctt, num):
    if ctt == N+1:
        answer.append(num)
        return
    for i in range(10):
        if visited[i]:
            continue
        if ctt == 0 or check(num[-1],str(i),li[ctt-1]):
            visited[i] = 1
            dfs(ctt+1, num+str(i))
            visited[i] = 0

N = int(input().strip())
answer = []
visited = [0] * 10
li = list(input().strip().split())
dfs(0, '')
answer.sort()
print(answer[-1])
print(answer[0])