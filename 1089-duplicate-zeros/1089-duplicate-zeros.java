class Solution {
    public void duplicateZeros(int[] arr) {
        int nums[] = new int[arr.length];
        int k =0;
        for(int i =0; i< arr.length; i++){
            if(k>= arr.length) break;
            if(arr[i] == 0){
                nums[k++] = 0;
                if(k>= arr.length) break;
                nums[k++] = 0;
            }else{
                nums[k++] = arr[i];
            }
        }

        for(int i = 0; i<arr.length; i++){
            arr[i] = nums[i];
        }
    }
}