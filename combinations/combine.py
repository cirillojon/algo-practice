n = 4
k = 2

def solution(n , k):
    res = []
    def helper(res, n, k, temp):
        if k == 0:
            res.append(list(temp))
            return

        if n > k:
            helper(res, n - 1, k, list(temp))
        
        temp.append(n)
        helper(res, n - 1, k - 1, list(temp))

    helper(res, n, k, [])
    return res

print(solution(n,k))