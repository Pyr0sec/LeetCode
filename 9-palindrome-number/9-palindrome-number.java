import java.util.*;

class Solution {
    public boolean isPalindrome(int x) {
//        Scanner input = new Scanner(System.in);
//        x = input.nextInt();
//        x = -121;
        int temp = x;
        int rev = 0;
        while(x>0){
            int rem = x % 10;
            rev = (rev * 10) + rem;
            x = x / 10;
        }
        if(temp == rev){
            return true;
        } else{
            return false;
        }
    } 
}