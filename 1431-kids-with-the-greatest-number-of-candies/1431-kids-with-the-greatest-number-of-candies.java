class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> arr = new ArrayList<>();
        int max = 0;
        for(int i = 0 ; i < n ; i++){
            max = candies[i] + extraCandies;
            int temp = 0;
            for(int j : candies){
                if(j > temp)
                    temp = j;
            }
            if(temp > max)
                arr.add(false);
            else
                arr.add(true);
        }
        return arr;
    }
}