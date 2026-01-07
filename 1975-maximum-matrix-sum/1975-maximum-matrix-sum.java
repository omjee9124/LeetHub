class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum =0;
        int min = Integer.MAX_VALUE;
        int negCount = 0;
        int posCount = 0;
        for(int i =0 ;i<matrix.length;i++){
            for(int j =0; j<matrix[0].length;j++){
                if(matrix[i][j] <0){
                    negCount++;
                }else{
                    posCount++;
                }
                if(matrix[i][j] < 0){
                    matrix[i][j] = -matrix[i][j];
                } 
                sum += matrix[i][j];
                if(min == 0){
                    continue;
                }
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                }
                
            }

        }
        if(negCount%2 ==0 || min == 0){
            return sum;
        }
        return sum-(2*min);
    }
}