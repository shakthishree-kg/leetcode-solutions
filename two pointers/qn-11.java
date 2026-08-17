class Solution {
    public int maxArea(int[] height) {
      int n= height.length;
      int i=0;
      int j=n-1;
      int a=0;
      while (i<j)
      {
        if(height[i]>=height[j])
        {
            int x=height[j]*(j-i); 
            
                if(a<x)
                {
                    a=x;
                }
            
            j--;
        }
        else
        {
            int x=height[i]*(j-i); 
            
                if(a<x)
                {
                    a=x;
                }
        
            i++;

        }
      }
      return a;  
    }
}