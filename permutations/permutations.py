def solution(nums):
    def helper(res, nums, temp, used):
        if(len(nums) == len(temp)):
            res.append(temp[:])
            return
        for i in range(len(nums)):
            if used[i] == True:
                continue
            used[i] = True
            temp.append(nums[i])
            helper(res, nums, temp, used)
            used[i] = False
            temp.pop()

    res = []
    used = [False] * len(nums)
    if len(nums) == 0:
        return res
    helper(res, nums, [], used)
    return res

nums = [1,2,3]
print(solution(nums))