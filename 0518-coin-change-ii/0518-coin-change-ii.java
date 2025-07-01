class Solution {
    public int change(int sum, int[] coins) {
         int n = coins.length;
        int t[][] = new int[n+1][sum+1];

        //Initialization

        for(int i = 0 ; i <= sum; i++){
            t[0][i] = 0;

        }
        for(int i = 1; i<=n; i++){
            t[i][0] = 1;
        }

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=sum; j++){
                if(coins[i-1] <=j){
                    t[i][j] = t[i][j-coins[i-1]]+t[i-1][j];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
}