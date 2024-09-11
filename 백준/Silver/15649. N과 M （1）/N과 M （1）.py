import sys
input = sys.stdin.readline

def recur(tmp,start):
    if len(tmp) == M:
        print(' '.join(map(str,tmp)))
        return
    
    for i in range(1,N+1):
        if not visited[i]:
            visited[i] = 1
            tmp.append(i)
            recur(tmp,i+1)
            visited[i] = 0
            tmp.pop()


N, M= map(int, input().strip().split())
visited = [0] * (N+1)
recur([],0)