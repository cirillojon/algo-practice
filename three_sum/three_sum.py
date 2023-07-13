def solution(nums, target):
    nums.sort()
    res = set()
    
    for i in range(len(nums)):
        j = i + 1
        k = len(nums) - 1
        while(j < k):
            sum = nums[i] + nums[j] + nums[k]
            if sum == target:
                res.add((nums[i], nums[j], nums[k]))
                j += 1
                k -= 1
            elif sum < target:
                j += 1
            elif sum > target:
                k -= 1
    return list(res)

nums = [1,2,3,4,5,6,7,8,9,10]
target = 13
print(solution(nums, target))