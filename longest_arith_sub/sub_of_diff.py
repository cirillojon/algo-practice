nums = [1,3,22,11,55,5,44,7,9,99,11]
difference = 2

def solution(arr, difference):
    res = 1
    map = {}

    for i in range(len(arr)):
        temp = arr[i] - difference
        if temp in map:
            map[arr[i]] = map[temp] + 1
        else:
            map[arr[i]] = 1
        res = max(res, map[arr[i]])

    return res
    
print(solution(nums, difference))