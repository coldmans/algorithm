import sys
input = sys.stdin.readline

TC = int(input().strip())
INF = float('inf')

for _ in range(TC):
    N, M, W = map(int, input().split())
    edges = []
    # 도로: 양방향 간선 추가
    for _ in range(M):
        a, b, t = map(int, input().split())
        edges.append((a, b, t))
        edges.append((b, a, t))
    # 웜홀: 단방향 간선, 비용은 음수로 처리
    for _ in range(W):
        a, b, t = map(int, input().split())
        edges.append((a, b, -t))
    
    # dummy vertex 0을 추가하여 모든 정점과 0가중치 간선 연결
    for i in range(1, N+1):
        edges.append((0, i, 0))
    
    # 전체 정점의 수는 V = N+1
    V = N + 1
    dist = [INF] * (V)
    dist[0] = 0

    # V-1번 relax 진행 (즉, N번)
    for i in range(V - 1):  # i = 0 ~ N-1
        for a, b, cost in edges:
            if dist[a] != INF and dist[b] > dist[a] + cost:
                dist[b] = dist[a] + cost

    # 추가 relax로 음수 사이클 검출
    negative_cycle = False
    for a, b, cost in edges:
        if dist[a] != INF and dist[b] > dist[a] + cost:
            negative_cycle = True
            break

    print("YES" if negative_cycle else "NO")
