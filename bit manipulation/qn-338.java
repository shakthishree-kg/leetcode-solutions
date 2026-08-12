class Solution {
    public int[] countBits(int n) {
        int j=n+1;
        int[] ans= new int[j];
        for(int i=1;i<j;i++){
            
            ans[i]=ans[i&(i-1)]+1;
        }
        return ans;
    }
}