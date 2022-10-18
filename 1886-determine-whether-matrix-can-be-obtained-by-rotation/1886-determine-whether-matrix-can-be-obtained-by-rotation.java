class Solution {
    static int[][] rotate(int[][] mat){
        int[][] arr = new int[mat.length][mat.length];
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                arr[row][col] = mat[col][row];
            }
        }
        
        for (int i = 0; i < arr.length ; i++){
            int lo = 0;
            int hi = arr[i].length - 1;
            while(lo < hi){
                int temp = arr[i][lo];
                arr[i][lo] = arr[i][hi];
                arr[i][hi] = temp;
                lo++;
                hi--;
            }
        }
        return arr;
    }
    
    public boolean findRotation(int[][] mat, int[][] target) {
        int[][] a = rotate(mat);
        for(int i = 0 ; i < 5 ; i++){
            if(Arrays.deepEquals(a, target))
                return true;
            else
                a = rotate(a);
        }
        return false;
    }
}