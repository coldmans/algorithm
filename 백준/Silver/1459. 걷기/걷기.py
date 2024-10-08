import sys
input = sys.stdin.readline

X,Y,W,S = map(int, input().strip().split())

diag = min(X,Y)
straight = abs(X-Y)

time1 = diag * S + straight * W

if (X + Y) % 2 == 0:
    time2 = max(X,Y) * S
else:
    time2 = (max(X,Y) -1 ) * S + W

time3 = (X + Y) * W

print(min(time1, time2, time3))