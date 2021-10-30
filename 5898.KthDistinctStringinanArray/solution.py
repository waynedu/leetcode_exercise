#https://leetcode-cn.com/contest/biweekly-contest-64/problems/kth-distinct-string-in-an-array/
#CN biweekly contest 1st challenge

class Solution:
    def kthDistinct(self, arr: List[str], k: int) -> str:
        result = []
        for i in arr:
            if arr.count(i) == 1:
                if i not in result:
                    result.append(i)
        if (k-1)< len(result):
            return result[k-1]      
        else:
            return ""
    
