def solution(diffs, times, limit):
    import sys
    input = sys.stdin.readline

    n = len(diffs)
    left, right = 1, max(diffs) 

    def total_time(level):
        total = 0
        for i in range(n):
            if diffs[i] <= level:
                total += times[i]
            else:
                mistakes = diffs[i] - level
                prev_time = times[i-1] if i > 0 else 0
                total += (times[i] + prev_time) * mistakes + times[i]
            
            if total > limit:
                break
        return total

    while left < right:
        mid = (left + right) // 2
        if total_time(mid) <= limit:
            right = mid
        else:
            left = mid + 1

    return left
