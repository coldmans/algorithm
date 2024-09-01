import sys
input = sys.stdin.readline

try:
    for _ in range(100):
        x = input().strip()
        print(x)
except:
    sys.exit()
