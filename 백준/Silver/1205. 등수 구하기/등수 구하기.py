import sys
input = sys.stdin.readline

N, sc, P = map(int, input().strip().split())

if N == 0:
    if P > 0:
        print(1)
    else:
        print(-1)
    sys.exit()

board = [int(x) for x in input().strip().split()]
tmp = N+1
rank = N+1
for i in range(len(board)):
    if board[i] == sc:
        ra = i+1
        rank = min(ra,rank)
    elif board[i] < sc:
        if rank == N+1:
            ra = i+1
            rank = min(ra,rank)
        tmp = i+1
        break

if tmp > P:
    print(-1)
else:
    print(rank)


