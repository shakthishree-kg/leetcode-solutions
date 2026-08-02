class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i =0;
        int j=n;
        int k=0;
        int[] a=new int [nums.length];
        while(i<n && (j<nums.length))
        {
            a[k++]=nums[i];
            a[k++]=nums[j];
            i++;
            j++;
        }
        return a;
    }
}