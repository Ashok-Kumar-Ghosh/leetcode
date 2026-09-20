class Solution(object):
    def maxNumberOfBalloons(self, text):
        count=0
        un=7
        b=text.count("b")
        a=text.count('a')
        l=text.count('l')
        o=text.count('o')
        n=text.count('n')
        if b<=a and b<=l/2 and b<=o/2 and b<=n:
            count=b
        elif a<=b and a<=l/2 and a<=o/2 and a<=n:
            count=a
        elif n<=a and n<=l/2 and n<=o/2 and n<=b:
            count=n
        elif l/2<=a and l/2<=b and l/2<=o/2 and l/2<=n:
            count=l/2
        elif o/2<=a and o/2<=b and o/2<=l/2 and o/2<=n:
            count=o/2
        return count

