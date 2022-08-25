class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] matrix = new int[r][c];
        int row = 0 , col = 0;
        if(m*n == r*c){
            for(int i = 0; i<m; i++){
                for(int j = 0; j<n; j++){
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
//     static int[][] func(int[][] mat, int r, int c) {
//         int[][] nums = new int[r][c];
//         for(int i = 0; i<r; i++){
//             for(int j = 0; j<c; j++){
//                 for(int k = 0; k<mat.length; k++){
//                     for(int l = 0; l<mat[k].length; l++){
//                         nums[i][j] = mat[k][l];
//             }
//         }
//     }
// }
//         return nums;
//     }
}