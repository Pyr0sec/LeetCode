class Solution {
    public int diagonalSum(int[][] mat) {
        int temp = 0;
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = i ; j < mat[i].length ; j++){
                temp = temp + mat[i][j];
                break;
            }
        }
        int k = 0;
        for(int i = mat.length-1 ; i >= 0 ; i--){
            for(int j = k ; j < mat[i].length;){
                temp = temp + mat[i][j];
                break;
            }
            k++;
        }
        
        if(mat.length % 2 != 0)
            temp = temp - mat[mat.length/2][mat.length/2];
        return temp;
    }
}