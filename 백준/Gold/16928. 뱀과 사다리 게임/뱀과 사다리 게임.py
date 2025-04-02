import sys
from collections import deque
input = sys.stdin.readline

N, M = map(int, input().strip().split())
game = [[[] for _ in range(10)] for _ in range(10)]
visited = [[0 for _ in range(10)] for _ in range(10)]
for _ in range(N+M):
    x,y = map(int, input().strip().split())
    x1 = x//10
    x2 = x % 10 -1
    if x2 == -1:
        x1 -= 1
        x2 += 10
    y1 = y // 10
    y2 = y % 10 -1
    if y2 == -1:
        y1 -= 1
        y2 += 10    
    game[x1][x2] = (y1,y2)

q = deque()
q.append((0,0))
visited[0][0] = 0

while q:
    cx, cy = q.popleft()
    for i in range(1,7):
        dx = cx
        dy = i + cy
        if i + cy > 9:
           dx += 1
           dy -= 10
           if dx == 10:
               break
        
        if not game[dx][dy] and (not visited[dx][dy] or (visited[dx][dy] > visited[cx][cy] + 1)):
            visited[dx][dy] = visited[cx][cy] + 1
            q.append((dx,dy))
        elif game[dx][dy] and (game[dx][dy][0] > dx or (game[dx][dy][0] == dx and game[dx][dy][1] >= dy)) and (not visited[game[dx][dy][0]][game[dx][dy][1]] or (visited[game[dx][dy][0]][game[dx][dy][1]] > visited[cx][cy] + 1)):        
            visited[game[dx][dy][0]][game[dx][dy][1]] = visited[cx][cy] + 1
            visited[dx][dy] = visited[cx][cy] + 1
            q.append((game[dx][dy][0],game[dx][dy][1]))
        elif game[dx][dy] and (not visited[game[dx][dy][0]][game[dx][dy][1]] or visited[game[dx][dy][0]][game[dx][dy][1]] > visited[cx][cy] + 1):
            visited[dx][dy] = visited[cx][cy] + 1
            visited[game[dx][dy][0]][game[dx][dy][1]] = visited[cx][cy] + 1
            q.append((game[dx][dy][0], game[dx][dy][1]))
        


print(visited[-1][-1])



        


