import sys
input = sys.stdin.readline

def recur(mun, i, mo, ja):
    if len(mun) == L:
        if mo >= 1 and ja >= 2:
            print(''.join(mun))
        
    for j in range(i, C):
        mun.append(alpha[j])
        if alpha[j] in 'aeiou':
            recur(mun, j + 1, mo+1, ja)
        else:
            recur(mun, j+1, mo, ja+1)
        mun.pop()

L,C = map(int, input().strip().split())

alpha = input().strip().split()
alpha.sort()
recur([],0,0,0)

