coins = [1,3,4,5]
amount = 200

def helper(coins, amount, dp):

    if amount == 0:
        return 0
    
    if amount < 0:
        return float('inf')
    
    if amount in dp:
        return dp[amount]
    
    min_coins = float('inf')

    for c in coins:
        curr_min_coins = 1 + helper(coins, amount - c, dp)

        if curr_min_coins < min_coins:
            min_coins = curr_min_coins

    dp[amount] = min_coins
    return dp[amount]

def solution(coins, amount):
    dp = {}
    res = helper(coins, amount, dp)
    
    if(res < float('inf')):
        return res
    
    return -1


print(solution(coins, amount))