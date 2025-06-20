class Solution {
    public int findTargetSumWays(int[] arr, int d) {
        int n = arr.length;
        int sum =0;
        for(int i =0; i<n;i++){
            sum+=arr[i];
        }
        if (sum < Math.abs(d) || (sum + d) % 2 != 0) return 0;

        
        int s1 = (sum +d)/2;
        return perfectSum(arr,s1);
    }
    public static int perfectSum(int[] arr, int sum) {
        int n = arr.length;
        int t[][] = new int[n+1][sum+1];
        for(int i = 0 ; i <= n; i++) {
            t[i][0] = 1;
        }
        for(int j = 1; j <= sum; j++) {
            t[0][j] = 0;
        }

        for(int i =1; i< n+1; i++){
            for(int j =0; j< sum+1; j++){
                if(arr[i-1] <= j){
                    t[i][j] =t[i-1][j] + t[i-1][j - arr[i-1]];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
}