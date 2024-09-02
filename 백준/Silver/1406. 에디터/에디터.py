import sys
input = sys.stdin.readline

# 초기 문자열 입력
left_stack = list(input().strip())
right_stack = []

# 명령어 개수 입력
n = int(input().strip())

# 명령어 처리
for _ in range(n):
    command = input().strip()
    if command[0] == 'L':
        if left_stack:
            right_stack.append(left_stack.pop())
    elif command[0] == 'D':
        if right_stack:
            left_stack.append(right_stack.pop())
    elif command[0] == 'B':
        if left_stack:
            left_stack.pop()
    elif command[0] == 'P':
        left_stack.append(command[2])

# 결과 출력
print(''.join(left_stack + right_stack[::-1]))