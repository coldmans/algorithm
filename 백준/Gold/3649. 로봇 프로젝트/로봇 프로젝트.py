import sys
input = sys.stdin.readline

while True:
    try:
        x = int(input().strip())
        n = int(input().strip())
        ls = []
        for _ in range(n):
            l = int(input().strip())
            ls.append(l)
        ls.sort()

        i = 0
        j = len(ls)-1
        x *= 10000000
        yes = 0
        while i < j:
            if ls[i] + ls[j] == x:
                print("yes", ls[i], ls[j])
                yes = 1
                break
            elif ls[i] + ls[j] > x:
                j -= 1
            elif ls[i] + ls[j] < x:
                i += 1
        if yes == 0:
            print("danger")
    except:
        break



