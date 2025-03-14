class Solution {
    public static List spiralOrder(int[][] nums) {
         ArrayList<Integer> ans = new ArrayList<>();
        int start_row = 0;
        int start_col = 0;
        int end_row = nums.length-1;
        int end_col = nums[0].length-1;
        int elements = nums[0].length*nums.length;

        while(elements>0){
            for(int i = start_col ; i<= end_col ; i++){
                ans.add(nums[start_row][i]);
                elements--;
            }
            start_row++;
            if(elements <= 0){
                break;
            }

            for(int i = start_row; i<=end_row ; i++){
                ans.add(nums[i][end_col]);
                elements--;
            }
            end_col--;
            if(elements <= 0){
                break;
            }

            for(int i = end_col; i>=start_col ; i--){
                ans.add(nums[end_row][i]);
                elements--;
            }
            end_row--;
            if(elements <= 0){
                break;
            }

            for(int i = end_row; i >= start_row; i--){
                ans.add(nums[i][start_col]);
                elements--;
            }
            start_col++;
            if(elements <= 0){
                break;
            }
        }
        return ans;

    }
}