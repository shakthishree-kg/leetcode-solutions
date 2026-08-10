class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n=nums.length;
        long total=0;
        for(int i=0;i<n;i++)
        {
            int counter=0;
            while(i<n&&nums[i]==0)
            {
                counter++;
                total+=counter;
                i++;
            }           
        }
       return total;
    }
}