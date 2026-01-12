def solution(n):
    answer = 0
    
    for standard in range(1, n + 1):
        sum_val = 0
        
        for i in range(standard, n + 1):
            sum_val += i
            if sum_val == n:
                answer += 1
                break
            if sum_val > n:
                break
    
    return answer