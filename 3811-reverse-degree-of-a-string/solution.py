class Solution(object):
    def reverseDegree(self, s):
        l=len(s)
        n=0
        for i in range(0,l):
            asc=123-(ord(s[i]))
            re=asc*(i+1)
            n+=re
        return n
