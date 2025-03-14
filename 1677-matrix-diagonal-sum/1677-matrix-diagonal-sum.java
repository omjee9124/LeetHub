class Solution {
    public int diagonalSum(int[][] mat) {
        int sum =0;
        for(int i = 0 ; i < mat.length; i ++){
            for(int j = 0 ; j< mat.length; j++){
                if(i == j){
                    sum+=mat[i][j];
                }
            }
        }
        int j = mat.length-1;
        for(int i =0; i<mat.length;i++){
            if(i == j){
                j--;
                continue;
            }
            sum += mat[i][j];
            
            if(j<0){
                break;
            }
            j--;
        }
        return sum;
    }
}