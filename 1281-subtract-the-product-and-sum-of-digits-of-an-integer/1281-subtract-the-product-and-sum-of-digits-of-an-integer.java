class Solution {
    public int subtractProductAndSum(int n) {
        int p = 1 , s = 0;
        while (n != 0){
            int rem = n % 10;
            p = p * rem;
            s = s + rem;
            n = n / 10;
        }
        int sub = p - s;
        return sub;
    }
}