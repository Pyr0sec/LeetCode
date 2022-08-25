class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] matrix = new int[r][c];
        int row = 0 , col = 0;
        if(m*n == r*c){
            for(int i = 0; i<mat.length; i++){
                for(int j = 0; j<mat[i].length; j++){
                    matrix[row][col++] = mat[i][j];
                    if(col == c){
                        row++;
                        col = 0;
                    }
                }
            }
            return matrix;
        } else {
            return mat;
        }
    }
}