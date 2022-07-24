class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] arr= new int[matrix[0].length][matrix.length];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = matrix[col][row];
            }
        }
        return arr;
    }
}