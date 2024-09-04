from collections import deque

def find_min_time(n, k):
    if n >= k:
        return n - k
    
    max_pos = 100000
    visited = [False] * (max_pos + 1)
    queue = deque([(n, 0)])  # (현재 위치, 현재 시간)
    visited[n] = True
    
    while queue:
        current_pos, current_time = queue.popleft()
        
        # 다음 가능한 위치들
        next_positions = [current_pos - 1, current_pos + 1, current_pos * 2]
        
        for next_pos in next_positions:
            if 0 <= next_pos <= max_pos and not visited[next_pos]:
                if next_pos == k:
                    return current_time + 1
                queue.append((next_pos, current_time + 1))
                visited[next_pos] = True

# 입력 받기
n, k = map(int, input().strip().split())
print(find_min_time(n, k))