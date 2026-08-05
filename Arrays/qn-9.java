class Solution {
    public boolean isPalindrome(int k) {
        int n=0;
        int x=k;
        while(x>0)
        {
            int t=x%10;
            n=n*10+t;
            x/=10;
        }
        if(n==k)
        {
            return true;
        }
        return false;
    }
}