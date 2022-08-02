class Solution {
    public int findNumbers(int[] nums) {
        int temp = 0;
        for(int i = 0 ; i < nums.length ; i++){
            int count = countdigit(nums[i]);
            if(count % 2 == 0)
                temp++;
        }
        return temp;
    }
    
    static int countdigit(int target){
        if(target < 0){
            target = target * -1;
        }
        return (int)(Math.log10(target)) + 1;
    }
}