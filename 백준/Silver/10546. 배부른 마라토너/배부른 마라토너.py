import sys
input = sys.stdin.readline

N = int(input().strip())
dire = {}
for _ in range(N*2-1):
    n = input().strip()
    if n in dire:
        del dire[n]
    else:
        dire[n] = 1
for key in dire:
    print(key)

    

    
    











