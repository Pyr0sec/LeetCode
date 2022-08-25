class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length, row = 0 , col = 0;
        int[][] matrix = new int[r][c];
        if(m*n != r*c){
            return mat;
        }
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
    }
}