class Solution:
    def findRestaurant(self, list1: list[str], list2: list[str]) -> list[str]:
        d = {}
        for i in range(len(list1)):
            d[list1[i]] = i
        
        ret = []
        c = 2001
        for i in range(len(list2)):
            if list2[i] in d:
                if d[list2[i]] + i == c:
                    ret.append(list2[i])
                elif d[list2[i]] + i < c:
                    ret = [list2[i]]
                    c = d[list2[i]] + i
        
        return ret
