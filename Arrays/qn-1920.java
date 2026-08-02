class Solution {
    public int[] buildArray(int[] nums) {
        int[] a= new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            a[i]=nums[n];
        }
        return a;
    }
}