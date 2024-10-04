from collections import deque
import sys
input = sys.stdin.readline

def process_function(p, n, arr):
    t = deque(arr)
    r = 0  # 뒤집기 상태를 나타내는 변수 (0: 정방향, 1: 역방향)
    
    for i in p:
        if i == 'R':
            r = 1 - r  # 뒤집기 상태를 토글
        elif i == 'D':
            if t:
                if r == 0:
                    t.popleft()
                else:
                    t.pop()
            else:
                return "error"
    
    if r == 1:
        t.reverse()
    
    return '[' + ','.join(map(str, t)) + ']'

T = int(input().strip())
for _ in range(T):
    p = input().strip()
    n = int(input().strip())
    arr = input().strip()[1:-1].split(',')
    
    if n == 0:
        arr = []
    else:
        arr = list(map(int, arr))
    
    result = process_function(p, n, arr)
    print(result)