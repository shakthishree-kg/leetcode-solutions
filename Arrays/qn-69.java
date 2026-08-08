class Solution {
    public int mySqrt(int x) {
        long i=0,j=x;
        long value=0;

        while(i<=j)
        {
            long mid=(i+j)/2;
            if(mid*mid<=(long)x)
            {
                value=mid;
                i=mid+1;
            }
            else
            {
                j=mid-1;
            }
        }
        return (int)value;
    }
}