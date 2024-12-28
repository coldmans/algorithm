def find_sequence(N, L):
    for length in range(L, 101):  # L부터 100까지 길이를 시도
        # 첫 번째 수 계산
        start = (N - (length * (length - 1)) // 2) / length
        if start >= 0 and start.is_integer():  # 시작 숫자가 음수가 아니고 정수일 경우
            start = int(start)
            sequence = [start + i for i in range(length)]
            print(' '.join(map(str, sequence)))
            return
    
    # 가능한 수열을 찾지 못한 경우
    print(-1)

# 입력 받기
N, L = map(int, input().split())
find_sequence(N, L)
