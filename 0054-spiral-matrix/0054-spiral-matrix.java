class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = -1;
        int dir = 1;

        while(m>0 && n>0){
            for(int k = 0; k<n;k++){
                j+=dir;
                list.add(matrix[i][j]);
            }
            m--;

            for(int k = 0; k<m;k++){
                i+=dir;
                list.add(matrix[i][j]);
            }
            n--;
            dir = dir * -1;

        }
        return list;
    }
}