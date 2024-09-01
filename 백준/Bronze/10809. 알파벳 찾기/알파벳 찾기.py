import sys
input = sys.stdin.readline

num = input().strip()
alph = [-1] * (26)

for i in range(len(num)):
    if num[i] == 'a':
        if alph[0] == -1:
            alph[0] = i 
    elif num[i] == 'b':
        if alph[1] == -1:
            alph[1] = i 
    elif num[i] == 'c':
        if alph[2] == -1:
            alph[2] = i 
    elif num[i] == 'd':
        if alph[3] == -1:
            alph[3] = i 
    elif num[i] == 'e':
        if alph[4] == -1:
            alph[4] = i 
    elif num[i] == 'f':
        if alph[5] == -1:
            alph[5] = i 
    elif num[i] == 'g':
        if alph[6] == -1:
            alph[6] = i 
    elif num[i] == 'h':
        if alph[7] == -1:
            alph[7] = i 
    elif num[i] == 'i':
        if alph[8] == -1:
            alph[8] = i 
    elif num[i] == 'j':
        if alph[9] == -1:
            alph[9] = i 
    elif num[i] == 'k':
        if alph[10] == -1:
            alph[10] = i 
    elif num[i] == 'l':
        if alph[11] == -1:
            alph[11] = i 
    elif num[i] == 'm':
        if alph[12] == -1:
            alph[12] = i 
    elif num[i] == 'n':
        if alph[13] == -1:
            alph[13] = i 
    elif num[i] == 'o':
        if alph[14] == -1:
            alph[14] = i 
    elif num[i] == 'p':
        if alph[15] == -1:
            alph[15] = i 
    elif num[i] == 'q':
        if alph[16] == -1:
            alph[16] = i 
    elif num[i] == 'r':
        if alph[17] == -1:
            alph[17] = i 
    elif num[i] == 's':
        if alph[18] == -1:
            alph[18] = i 
    elif num[i] == 't':
        if alph[19] == -1:
            alph[19] = i 
    elif num[i] == 'u':
        if alph[20] == -1:
            alph[20] = i 
    elif num[i] == 'v':
        if alph[21] == -1:
            alph[21] = i 
    elif num[i] == 'w':
        if alph[22] == -1:
            alph[22] = i 
    elif num[i] == 'x':
        if alph[23] == -1:
            alph[23] = i 
    elif num[i] == 'y':
        if alph[24] == -1:
            alph[24] = i 
    elif num[i] == 'z':
        if alph[25] == -1:
            alph[25] = i 

print(' '.join(map(str,alph)))
