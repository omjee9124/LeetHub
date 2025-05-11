class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        
        for(int i = 0; i< arr.length-2;i++){
            int count =0;
            for(int j = i; j < i+3 && j<arr.length;j++){
                if(arr[j]%2 !=0){
                    count++;
                }
                if(count==3){
                    return true;
                }
            }
        }
        return false;
    }
}