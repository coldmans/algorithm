import sys
input = sys.stdin.readline

N, M = map(int, input().strip().split())
word_count = {}

for _ in range(N):
    s = input().strip()
    if len(s) < M:
        continue
    if s in word_count:
        word_count[s] += 1
    else:
        word_count[s] = 1

sorted_words = sorted(word_count.items(),  key = lambda x: (-x[1], -len(x[0]), x[0]))
for word, _ in sorted_words:
    print(word)






        



