import sys
import math

input = sys.stdin.readline
H, W, N, M = map(int, input().strip().split())

row_count = (H // (N + 1)) + (1 if H % (N + 1) > 0 else 0)
col_count = (W // (M + 1)) + (1 if W % (M + 1) > 0 else 0)

print(row_count * col_count)
