class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeroes =0;
        for(int i = 0; i < n;i++){
            if(arr[i] == 0){
                zeroes++;
            }
        }

        int j = n + zeroes - 1;
        int i = n-1;

        while(i>=0){
            if(j < n){
                arr[j] = arr[i];
            }
            

            if(arr[i] == 0){
                j--;
                if(j<n) arr[j] =0;
            }
            i--;
            j--;
        }

    }
}