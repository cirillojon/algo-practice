nums = [1,2,3]

def solution(nums):
    res = []
    def helper(nums, k, temp, res):
        if k == len(nums):
            res.append(list(temp))
            return
        
        helper(nums, k + 1, list(temp), res)
        temp.append(nums[k])
        helper(nums, k + 1, list(temp), res)
    
    helper(nums, 0, [], res)
    return res

print(solution(nums))