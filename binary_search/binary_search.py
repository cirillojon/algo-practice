def search(nums, target):
    left = 0
    right = len(nums) - 1
    while(left <= right):
        mid = (left + right) // 2
        if nums[mid] == target:
            return mid
        if nums[mid] < target:
            left = mid + 1
        if nums[mid] > target:
            right = mid - 1
    return -1

nums = [1,2,3,4,5,6,7,8,9,10]
target = 8
print(search(nums, target))