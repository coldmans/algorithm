import sys
input = sys.stdin.readline

N, M = map(int, input().strip().split())
r,c,d = map(int, input().strip().split())

graph = [[int(x) for x in input().strip().split()] for _ in range(N)]
ctt = 0
while 1:
    if graph[r][c] == 0:
        graph[r][c] = 2
        ctt += 1
        
    

    if (r + 1 < N and graph[r+1][c] == 0) or (c+1 < M and graph[r][c+1] == 0) or (r-1 >= 0 and graph[r-1][c] == 0) or (c-1 >= 0 and graph[r][c-1] == 0):
        while 1:
            d -= 1
            if d == -1:
                d = 3

            if d == 2:
                if r+1 < N and graph[r+1][c] == 0:
                    r += 1
                    break      
            elif d == 1:
                if c+1 < M and graph[r][c+1] == 0:
                    c += 1
                    break
            elif d == 0:
                if r-1 >= 0 and graph[r-1][c] == 0:
                    r -= 1
                    break
            elif d == 3:
                if c-1 >= 0 and graph[r][c-1] == 0:
                    c -= 1
                    break
                    
    else:  
        if d == 2:
            if r-1 >= 0 and graph[r-1][c] != 1:
                r -= 1
            else:
                break
        elif d == 1:
            if c-1 >= 0 and graph[r][c-1] != 1:
                c -= 1
            else:
                break
        elif d == 0:
            if r+1 < N and graph[r+1][c] != 1:
                r += 1
            else:
                break
        elif d == 3:
            if c+1 < M and graph[r][c+1] != 1:
                c += 1
            else:
                break

print(ctt)
  






    



    