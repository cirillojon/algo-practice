intervals = [[1,3], [3,4], [1,2], [2,3]]

def solution(intervals):
    intervals.sort(key=lambda x: x[1])
    count = 1
    end = intervals[0][1]

    for i in range(1, len(intervals)):
        if intervals[i][0] >= end:
            count += 1
            end = intervals[i][1]
    
    return len(intervals) - count


print(solution(intervals))