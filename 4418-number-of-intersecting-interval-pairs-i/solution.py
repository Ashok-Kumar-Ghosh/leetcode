class Solution(object):
    def countIntersectingIntervals(self, intervals):
        a=[num for row in intervals for num in row]
        c=0
        n=len(intervals)
        for i in range (0,n):         
            p=intervals[i][0]
            q=intervals[i][1]
            for j in range(i+1,n):
                b=intervals[j]
                s=b[0]
                t=b[1]
                if s<=q and t>=p:
                    c+=1
                else:
                    pass
        return c
                
