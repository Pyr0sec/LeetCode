class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = func(nums , target , true);
        if (ans[0] != -1)
            ans[1] = func(nums , target , false);
        return ans;
    }

    static int func(int[] arr, int target, boolean findstartindex) {
        int lo = 0;
        int hi = arr.length-1;
        int ans = -1;
        while (lo <= hi){
            int mid = lo + (hi - lo)/2;

            if (target < arr[mid]){
                hi = mid - 1;
            } else if (target > arr[mid]) {
                lo = mid + 1;
            } else {
                ans = mid;
                if (findstartindex)
                    hi = mid - 1;
                else lo = mid + 1;
            }
        }
        return ans;
    }
}