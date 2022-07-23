class Solution {
    public int findNumbers(int[] nums) {
        int temp = 0;
        for(int i = 0 ; i < nums.length ; i++){
            int k = nums[i];
            int count = 0;
            while(k > 0){
                k = k / 10;
                count++;
            }
            if(count % 2 == 0)
                temp++;
        }
        return temp;
    }
}