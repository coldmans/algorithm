def prev_permutation(arr):
    # 1. 뒤에서부터 arr[i-1] > arr[i]인 지점을 찾는다.
    i = len(arr) - 1
    while i > 0 and arr[i-1] <= arr[i]:
        i -= 1

    # 2. 만약 i가 0이라면, 이는 가장 첫 순열이므로 이전 순열이 없다.
    if i == 0:
        return False  # 이전 순열 존재 안 함

    # 3. 뒤에서부터 arr[i-1]보다 작은 원소를 찾는다.
    j = len(arr) - 1
    while arr[i-1] <= arr[j]:
        j -= 1

    # 4. 두 원소 교환
    arr[i-1], arr[j] = arr[j], arr[i-1]

    # 5. 뒤(i)부터 끝까지를 내림차순 정렬(혹은 reverse)
    arr[i:] = reversed(arr[i:])

    return True

if __name__ == "__main__":
    import sys

    input = sys.stdin.readline
    N = int(input().strip())
    permutation = list(map(int, input().split()))

    if prev_permutation(permutation):
        print(' '.join(map(str, permutation)))
    else:
        print(-1)
