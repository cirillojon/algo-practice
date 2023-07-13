def solution(nums, target):
    res = []
    map = {}
    
    for i in range(len(nums)):
        if (target-nums[i]) in map:
            res.append(map[target-nums[i]])
            res.append(i)
            return res
        map[nums[i]] = i
    return res

nums = [1,2,3,4,5,6,7,8,9,10]
target = 11
print(solution(nums, target))