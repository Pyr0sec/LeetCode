class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> arr = new ArrayList<>(1);
        for(int i = 0 ; i < matrix.length ; i++){
            int min = matrix[i][0];
            int k = 0;
            for(int j = 0 ; j < matrix[i].length ; j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                    k = j;
                }
            }
            int max = 0;
            for(int j = 0 ; j < matrix.length ; j++){
                if(matrix[j][k] > max){
                    max = matrix[j][k];
                }
            }
            if(min == max){
                arr.add(min);
            }
        }
        return arr;
    }
}