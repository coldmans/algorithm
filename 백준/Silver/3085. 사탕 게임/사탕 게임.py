import sys
input = sys.stdin.readline

N = int(input().strip())
li = [[0 for _ in range(N)] for _ in range(N)]
for i in range(N):
    n = input().strip()
    for j in range(len(n)):
        li[i][j] =n[j]

def check_max_candies(board):
    max_candies = 1
    for i in range(N):
        row_count = 1
        col_count = 1
        for j in range(1, N):
            if board[i][j] == board[i][j-1]:
                row_count += 1
            else:
                max_candies = max(max_candies, row_count)
                row_count = 1
            if board[j][i] == board[j-1][i]:
                col_count += 1
            else:
                max_candies = max(max_candies, col_count)
                col_count = 1
        max_candies = max(max_candies, row_count, col_count)
    return max_candies

max_candies = 0
for i in range(N):
    for j in range(N):
        if j + 1 < N:
            li[i][j], li[i][j+1] = li[i][j+1], li[i][j]
            max_candies = max(max_candies, check_max_candies(li))
            li[i][j], li[i][j+1] = li[i][j+1], li[i][j]
        if i + 1 < N:
            li[i][j], li[i+1][j] = li[i+1][j], li[i][j]
            max_candies = max(max_candies, check_max_candies(li))
            li[i][j], li[i+1][j] = li[i+1][j], li[i][j]

print(max_candies)

    

    
        









