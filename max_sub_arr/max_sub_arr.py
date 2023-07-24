nums = [-2,1,-3,4,-1,2,1,-5,4]

def solution(nums):
    total = nums[0]
    curr = nums[0]

    for i in range(1, len(nums)):
        total = max(nums[i], total + nums[i])
        curr = max(curr, total)
    return curr

print(solution(nums))