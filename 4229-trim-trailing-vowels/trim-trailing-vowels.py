class Solution:
    def trimTrailingVowels(self, s: str) -> str:
        ans=s
        l=(len(s)*-1)+(-1)
        for i in range(-1,l,-1):
            if s[i]=='a' or s[i]=='e' or s[i]=='i' or s[i]=='o' or s[i]=='u':
                ans=s[0:i]
            else:
                break
        return ans