matrix = [[1,2,3], [4,5,6], [7,8,9], [10,11,12]]
target = 9

# Treat as 1d array

def solution(matrix, target):
    rows = len(matrix)
    cols = len(matrix[0])

    left = 0
    right = rows * cols - 1

    while(left <= right):
        mid = (left + right) // 2
        curr = matrix[mid // rows][mid % rows]
        if curr == target:
            return True

        elif curr > target:
            right = mid - 1

        elif curr < target:
            left = mid + 1

    return False
    
print(solution(matrix, target))