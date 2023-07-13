def solution(nums):
    def helper(nums, res, cache, index):
        if index == 0:
            return nums[0]
        if index == 1:
            return max(nums[0], nums[1])
        if index in cache:
            return cache[index]
        res = max(nums[index] + helper(nums, res, cache, index - 2), helper(nums, res, cache, index - 1))
        cache[index] = res
        return res

    res = 0
    res = helper(nums, res, {}, len(nums) - 1)
    return res
        
nums = [1,2,3,4,5]
print(solution(nums))