import sys

def input():
    return sys.stdin.readline()

# 테트로미노의 19가지 형태를 정의 (상대 좌표)
tetromino_shapes = [
    # I 형태
    [(0,0), (0,1), (0,2), (0,3)],
    [(0,0), (1,0), (2,0), (3,0)],
    
    # O 형태
    [(0,0), (0,1), (1,0), (1,1)],
    
    # L 형태 및 회전, 대칭
    [(0,0), (1,0), (2,0), (2,1)],
    [(0,1), (1,1), (2,1), (2,0)],
    [(0,0), (0,1), (0,2), (1,0)],
    [(0,0), (0,1), (0,2), (1,2)],
    [(0,0), (1,0), (1,1), (1,2)],
    [(0,2), (1,0), (1,1), (1,2)],
    [(0,0), (1,0), (2,0), (0,1)],
    [(0,0), (1,0), (2,0), (0,-1)],
    [(0,0), (0,1), (1,1), (2,1)],
    [(0,0), (0,1), (0,2), (-1,2)],
    
    # S 형태 및 회전, 대칭
    [(0,0), (0,1), (1,1), (1,2)],
    [(1,0), (0,1), (1,1), (0,2)],
    [(0,1), (1,0), (1,1), (2,0)],
    [(0,0), (1,0), (1,1), (2,1)],
    
    # T 형태 및 회전, 대칭
    [(0,0), (0,1), (0,2), (1,1)],
    [(0,1), (1,0), (1,1), (2,1)],
    [(1,0), (1,1), (1,2), (0,1)],
    [(0,0), (1,0), (2,0), (1,1)]
]

def main():
    N, M = map(int, input().split())
    graph = [list(map(int, input().split())) for _ in range(N)]
    max_sum = 0

    for i in range(N):
        for j in range(M):
            for shape in tetromino_shapes:
                current_sum = 0
                valid = True
                for dy, dx in shape:
                    y = i + dy
                    x = j + dx
                    if 0 <= y < N and 0 <= x < M:
                        current_sum += graph[y][x]
                    else:
                        valid = False
                        break
                if valid and current_sum > max_sum:
                    max_sum = current_sum
    print(max_sum)

if __name__ == "__main__":
    main()
