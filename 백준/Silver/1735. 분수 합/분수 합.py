import sys
input = sys.stdin.readline

def check(z,m):
    while m > 0:
        z, m = m, z % m
    return z


A,B = map(int, input().strip().split())
C,D = map(int, input().strip().split())

za = A*D + B*C
mo = B * D

z = check(za,mo)
print(za //z, mo//z)


        




