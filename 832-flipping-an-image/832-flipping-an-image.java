class Solution {
    static void reverse(int[] imagesub){
        int start = 0;
        int end = imagesub.length-1;
        
        while(start < end){
            swapfun(imagesub , start , end);
            start++;
            end--;
        }
    }
    
    static void swapfun(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0 ; i < image.length ; i++){
            reverse(image[i]);
            for(int j = 0 ; j < image[i].length ; j++){
                if(image[i][j] == 0)
                    image[i][j] = 1;
                else
                    image[i][j] = 0;
            }
        }
        return image;
    }
}