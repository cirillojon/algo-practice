nums = [1,2,3,4,5,6]

def solution(nums):
    cache = {}
    cache[0] = 0

    for x in nums:
        temp = dict(cache)
        key_arr = list(temp.keys())
        
        for d in key_arr:
            y = temp[d]

            cache[d+x] = max(temp.get(d+x, 0), y)
            
            if d >=x:
                cache[d-x] = max(temp.get(d-x, 0), y+x)

            else:
                cache[x-d] = max(temp.get(x-d, 0), y-d)
    
    return cache.get(0,0)

print(solution(nums))