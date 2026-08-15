class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int num:nums)
        {
            xor^=num;
        }
        int b=xor&(-xor);
        int nums1=0;
        int nums2=0;
        for(int num:nums)
        {
            if((b& num) !=0)
            {
                nums1^=num;
            }
            else
            {
                nums2^=num;
            }
        }
        int[] n= new int[2];
        n[0]=nums1;
        n[1]=nums2;
        return n;        
    }
}