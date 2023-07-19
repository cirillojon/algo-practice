heights = [2, 8, 1, 4, 6, 2, 1, 8]


def solution(heights):
    left = 0
    right = len(heights) - 1
    res = 0

    for i in heights:
        width = right - left
        height = min(heights[left], heights[right])
        res = max(res, width*height)
        if heights[left] > heights[right]:
            right -= 1
        elif heights[right] > heights[left]:
            left += 1
        else:
            right -=1
            left += 1
    return res

print(solution(heights))
    