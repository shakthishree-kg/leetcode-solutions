class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max= candies[0];
        
        for( int c : candies){
            if(c>max)
            {
                max=c;
           }
        }
       List<Boolean> a = new ArrayList<>();
        for(int i =0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies >= max)
            {
                a.add(true);
            }
            else
            {
                a.add(false);
            }
        }
        return a;
    }
}