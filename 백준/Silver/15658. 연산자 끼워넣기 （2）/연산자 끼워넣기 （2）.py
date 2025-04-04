import sys
input = sys.stdin.readline

def recur(su, oper,ptr):
    global tmp
    if ptr == N:
        tmp.append(su)
        return
    
    for j in range(len(oper)):
        if oper[j] == 0:
            continue
        next_oper = oper.copy()
        next_oper[j] -= 1
        if j == 0:
            recur(su + li[ptr], next_oper, ptr + 1)
        elif j == 1:
            recur(su - li[ptr], next_oper, ptr + 1)
        elif j == 2:
            recur(su * li[ptr], next_oper, ptr + 1)
        elif j == 3:
            if su < 0:
                recur(-(-su // li[ptr]), next_oper, ptr + 1)
            else:
                recur(su // li[ptr], next_oper, ptr + 1)
            


N = int(input().strip())
li = list(map(int, input().strip().split()))
op = list(map(int, input().strip().split()))
tmp = []
recur(li[0],op,1)
tmp.sort()
print(tmp[-1])
print(tmp[0])
