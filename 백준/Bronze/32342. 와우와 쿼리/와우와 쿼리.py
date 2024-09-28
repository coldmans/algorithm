import sys
input = sys.stdin.readline

N = int(input().strip())
for _ in range(N):
    ctt = 0
    s = input().strip()
    for i in range(len(s)):
        if s[i] == "W":
            if i+2 < len(s):
                if s[i+1] == "O" and s[i+2] == "W":
                    ctt += 1
    print(ctt)