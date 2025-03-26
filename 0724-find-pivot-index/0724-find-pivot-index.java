class Solution {
    public int pivotIndex(int[] nums) {
       int []pre= new int[nums.length];
       pre[0] = nums[0];
       for(int i = 1; i< pre.length; i++){
        pre[i] = pre[i-1] + nums[i]; 
       }
       int tot = pre[pre.length-1];
       for(int i =0 ; i< pre.length; i++){
            if(i == 0){
                if(tot - pre[i] ==0){
                    return i;
                }
                i++;
            }
        
        if((tot - pre[i]) == pre[i-1]){
            return i;
        }
       } 
       return -1;
    }
}