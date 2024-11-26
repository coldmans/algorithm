import sys
input = sys.stdin.readline

while 1:
    n = input().strip()
    if n == "end":
        break
    if "a" in n or "e" in n or "o" in n or "i" in n or "u" in n:
        tmp = False
        for i in range(2,len(n)):
            ctt = 0
            if n[i] == "a" or  n[i] == "e" or n[i] == "o" or n[i] == "i" or n[i] == "u":
                ctt += 1
            if n[i-1] == "a" or  n[i-1] == "e" or n[i-1] == "o" or n[i-1] == "i" or n[i-1] == "u":
                ctt += 1
            if n[i-2] == "a" or  n[i-2] == "e" or n[i-2] == "o" or n[i-2] == "i" or n[i-2] == "u":
                ctt += 1
            if ctt == 0 or ctt == 3:
                tmp = True
                break
        for i in range(1,len(n)):
            if n[i] == n[i-1] and n[i] != "e" and n[i] != "o":
                tmp = True
        if tmp:
            print(f"<{n}> is not acceptable.")
        else:
            print(f"<{n}> is acceptable.")
    else:
        print(f"<{n}> is not acceptable.")


