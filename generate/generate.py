n = 5

def helper(res, left, right, s):
    if left == 0 and right == 0:
        res.append(s)

    if left > 0:
        helper(res, left - 1, right + 1, s + "(")
    
    if right > 0:
        helper(res, left, right - 1, s + ")")

def solution(n):
    res = []
    s = ""
    helper(res, n, 0, s)
    return res

print(solution(n))
