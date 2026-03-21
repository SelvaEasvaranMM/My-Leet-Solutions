class Solution:
    def findLucky(self, arr: List[int]) -> int:
        book={}
        for i in arr:
            book[i]=book.get(i,0)+1
        max=-1
        for key,val in book.items():
            if(key==val and val>max):
                max=val
        return max