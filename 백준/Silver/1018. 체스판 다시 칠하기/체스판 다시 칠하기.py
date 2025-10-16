##1018번 체스판 다시 칠하기 (다시 풀기)
def min_pain_to_chessboard(board, N, M):
    # 체스판 패턴 두 가지 정의
    pattern1 = [
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW"
    ]
    
    pattern2 = [
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB"
    ]
    min_paint = float('inf')
    for i in range(N - 7):
        for j in range(M - 7):
            count1 = 0
            count2 = 0
            for x in range(8):
                for y in range(8):
                    if board[i + x][j + y] != pattern1[x][y]:
                        count1 += 1
                    if board[i + x][j + y] != pattern2[x][y]:
                        count2 += 1
            min_paint = min(min_paint, count1, count2)
    return min_paint

N, M = map(int, input().split())
board = [input().strip() for _ in range(N)]

print(min_pain_to_chessboard(board, N, M))
