import sys

def one(j):
    i = 1
    while 1:
        if i % j == 0:
            print(len(str(i)))
            break 
        i = i * 10 + 1

        

input = sys.stdin.readline

while True:
    try:
        n = int(input().strip())
    except:
        break
    one(n)

