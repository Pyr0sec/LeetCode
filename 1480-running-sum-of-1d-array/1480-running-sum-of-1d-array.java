class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningsum = new int[nums.length];
        int temp = 0;
        for(int i = 0 ; i < nums.length ; i++){
            temp = temp + nums[i];
            runningsum[i] = temp;
        }
        return runningsum;
    }
}