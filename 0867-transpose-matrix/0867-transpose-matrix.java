class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] arr = new int[matrix[0].length][matrix.length];
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = matrix[j][i];
            }
        }
        return arr;
    }
}