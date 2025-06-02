class Solution {
    public int maxProduct(int[] arr) {
        int prefix = 0;
        int suffix = 0;
        int max = Integer.MIN_VALUE;

        for(int i =0; i<arr.length; i++){

            if(prefix == 0){
                prefix =1;
            }

            if(suffix == 0){
                suffix =1;
            }

            prefix *= arr[i];
            suffix *= arr[arr.length-1-i];

            max = Integer.max(max, Integer.max(prefix, suffix));
        }

        return max;
    }
}