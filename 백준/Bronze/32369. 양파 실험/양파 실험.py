import sys
input = sys.stdin.readline

N, A , B = map(int, input().strip().split())
ching = 1
bi = 1
ctt = 0
while N != ctt:
    ching += A
    bi += B
    if ching < bi:
        tmp = ching
        ching = bi
        bi = tmp
    elif ching == bi:
        bi -= 1
    ctt += 1
print(ching, bi)