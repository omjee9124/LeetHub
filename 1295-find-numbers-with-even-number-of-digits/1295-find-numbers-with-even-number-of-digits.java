class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int num: nums){
            if((10<=num && num < 100) || (1000<=num && num<10000) || (num == 100000)) count++;
        }
        return count;
    }
}