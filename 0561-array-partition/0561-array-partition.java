class Solution {
    public int arrayPairSum(int[] nums) {
        int k =10000;
        int countarr[] = new int[2*k +1];
        for(int i =0; i< nums.length; i++){
            countarr[nums[i] +k]++;
        }

        boolean isEven = true;
        int sum = 0;
        for(int i = 0; i< 2*k+1; i++){
            while(countarr[i] > 0){
                sum = sum + (isEven? i-k : 0);
                countarr[i]--;
                isEven = !isEven;
            }
        }
        return sum;
    }
}