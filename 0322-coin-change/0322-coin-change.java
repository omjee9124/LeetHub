class Solution {
    public int coinChange(int[] coins, int amount) {
        int arr[][] = new int[coins.length][amount+1];
        for(int i = 0 ; i < coins.length;i++){
            for(int j = 0; j<= amount; j++){
                arr[i][j] = Integer.MAX_VALUE -1;
            }
        }
        for(int i = 0; i<=amount; i++){
            if(i % coins[0] == 0){
                arr[0][i] = i/coins[0];
            }
             
        }
        for(int i = 1;i< coins.length; i++){
            for(int j =0; j <= amount; j++){
                if(arr[i][j] == Integer.MAX_VALUE -1){
                    if(coins[i] > j){
                    arr[i][j] = arr[i-1][j];
                        }else{
                            arr[i][j] = Math.min(arr[i-1][j],1+arr[i][j-coins[i]]);
                        }
                }
                
            }
        }
        int res = arr[coins.length-1][amount];
        if(res == Integer.MAX_VALUE-1){
            return -1;
        }else{
            return res;
        }
    }
}