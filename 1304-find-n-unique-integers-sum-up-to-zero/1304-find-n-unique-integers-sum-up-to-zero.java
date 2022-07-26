class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int m = 0;
        if(n % 2 != 0)
            m = (n-1)/2;
        else
            m = n/2;
        
        for(int i = 0; i < m ; i++){
            arr[i] = i+1;
            arr[n-i-1] = i-(2*i)-1;
        }
        return arr;
    }
}