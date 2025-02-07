import sys
input = sys.stdin.readline
array = []
N = input().strip()
if len(N) < 10:
    length = len(N)
else:
    length = (len(N) -9) // 2 + 9

def back(i):
    if i == len(N):
        print(*array)
        exit()
    if N[i] != '0':
        sing = N[i]
        double = N[i : i+2]
        if int(sing) <= length and sing not in array:
            array.append(sing)
            back(i+1)
            array.pop()
        if int(double) <= length and double not in array:
            array.append(double)
            back(i+2)
            array.pop()
back(0)
print(array)