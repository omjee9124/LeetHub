class Solution {
    public boolean canJump(int[] arr) {
        int value = 0;
        int max = 0;
        for(int i =0;i< arr.length;i++){
            if(i>max){
                return false;
            }else if(max>=arr.length-1){
                return true;
            }else{
                max= Math.max(max,arr[i]+i);
            }


        }
        return false;
    }
}