class Solution {
    public int removeDuplicates(int[] nums) {
        int c = 1;
        for(int i = 1 ; i< nums.length ; i++){
            if(nums[i] != nums[i-1]){
                nums[c] = nums[i];
                c++;
            }
        }
        return c;
    }
}
// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int k = 1;
//         for(int i = nums.length-1 ; i>0 ; i--){
//             if(nums[i] == nums[i-1]){
//                 nums[i-1] = nums[i];
//                 nums[i] = 0;
//             } else { 
//                 k++ ;
//             }
//         }
//         return k;
//     }
// }