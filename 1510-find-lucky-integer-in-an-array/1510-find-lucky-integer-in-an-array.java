class Solution {
    public int findLucky(int[] arr) {
       Arrays.sort(arr);
        int count =0;
        for(int i=arr.length-1;i>=0;i--){
            count =1;
            while(i>0 && arr[i] == arr[i-1]){
                count++;
                i--;
            }
            if(count == arr[i]){
                return count;
            }

        }
        return -1;
    }
}