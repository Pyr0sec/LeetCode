class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
         for (int r = 0; r < indices.length; r++) {
             for(int j = 0; j < m; j++){
                 arr[j][indices[r][1]]++;
             }
             for(int k = 0; k < n; k++){
                 arr[indices[r][0]][k]++;
             }
        }
        int count = 0;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++)
                if(arr[i][j] % 2 != 0)
                    count++;
        }
        return count;
    }
}